package de.hska.iwi.ads.search;

public class BinarySearchTest extends SearchTest {

  @Override
  public <E extends Comparable<E>> Search<E> createSearch() {
    return new BinarySearch<>();
  }

}
