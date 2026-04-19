package de.hska.iwi.ads.search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {
    @Override
    public int search(E[] a, E key, int left, int right) {
        // Handle key out of bounds
        if (key.compareTo(a[left]) < 0) {
            return left - 1;
        }
        if (key.compareTo(a[right]) > 0) {
            return right + 1;
        }

        return recursiveSearch(a, key, left, right);
    }

    private int recursiveSearch(E[] a, E key, int left, int right) {
        // Return nearest greater neighbor if not in array
        if (left >= right) {
            if (key.compareTo(a[left]) > 0) {
                return left + 1;
            }
            return left;
        }

        // Check if found
        int middle = (int) Math.floor((double) (left + right) / 2);
        if (a[middle].equals(key)) {
            while (middle >= 1 && a[middle].compareTo(a[middle - 1]) == 0) {
                middle--;
            }
            return middle;
        }

        // Continue Search
        if (a[middle].compareTo(key) < 0) {
            return recursiveSearch(a, key, middle + 1, right);
        }
        // Last remaining option is: a[middle].compareTo(key) > 0
        return recursiveSearch(a, key, left, middle - 1);
    }
}
