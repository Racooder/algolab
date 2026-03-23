# Algorithmen & Datenstrukturen – Übung

Dieses Repository stellt die **Basis zur Bearbeitung der Übungsaufgaben** im Modul *Algorithmen und Datenstrukturen* bereit.

## Install Git
https://github.com/git-guides/install-git

## Repository

GitHub: [https://github.com/K1ngGrim/algolab.git](https://github.com/K1ngGrim/algolab.git)

## Struktur

* `labor_loesung/` – Hauptprojekt (hier erfolgt die Implementierung)
* `labor/` – Vorgegebenes Modul (**darf nicht verändert werden**)

## Setup

1. Repository klonen:

   ```bash
   git clone https://github.com/K1ngGrim/algolab.git
   ```

2. Projekt in einer IDE öffnen
   Empfohlen: **IntelliJ IDEA**

3. **Wichtig:**
   Öffne den Ordner `labor_loesung` als Projekt (nicht das gesamte Repository).

4. Eventuell JUnit zum Classpath hinzufügen
   Deine IDEA will das du JUnit zum Classpath hinzufügst. Mach das einfach, das ist schon korrekt so!!!!

## Tests ausführen

Um zu überprüfen, ob alles korrekt eingerichtet ist:

* Führe die JUnit-Tests in folgender Klasse aus:

  ```
  de.hska.iwi.ads.solution.interfaces.CircleTest
  ```

**Erwartetes Verhalten:**

* Die Tests schlagen aktuell fehl
* Es wird `Not yet implemented` ausgegeben

Das ist korrekt und gewollt. Die Tests dienen als Ausgangspunkt für die Implementierung im Rahmen der Übung.

## Hinweis

* Änderungen dürfen **ausschließlich im `labor_loesung`-Projekt** vorgenommen werden.
* Der `labor`-Ordner ist Teil der vorgegebenen Infrastruktur und **darf nicht verändert werden**.
