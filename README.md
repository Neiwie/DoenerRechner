# DönerRechner

Ein kleines, Fun Project, mit dem du schnell einen Eurobetrag in Döner umrechnen kannst.

Der Rechner verwendet einen durchschnittlichen Dönerpreis von 8,50 € und zeigt dir das Ergebnis direkt in "Döner" an.

## Funktionsweise

Du gibst einen Betrag in Euro ein und der Rechner teilt diesen durch den Durchschnittspreis eines Döner:

```text
Döner = Betrag in Euro / 8,50
```

Beispiel:

- 17 € -> 2,00 Döner
- 25 € -> 2,94 Döner
- 42,50 € -> 5,00 Döner

## Eigenschaften

- Einfaches Swing-GUI
- Schnelle Berechnung per Klick
- Lustige, praktische Frage: "Wie viele Döner ist mein Geld wert?"
- Perfekt für kleine Spaßprojekte oder als Einstieg in Java-GUI-Programmierung

## So startest du das Projekt

1. Stelle sicher, dass Java installiert ist.
2. Öffne das Projektverzeichnis.
3. Kompiliere das Programm:

```bash
javac src/DoenerRechner.java
```

4. Starte die Anwendung:

```bash
java -cp src DoenerRechner
```

## Beispielbildschirm

Das Programm öffnet ein kleines Fenster mit:

- einem Eingabefeld für den Euro-Betrag
- einem Button zum Umrechnen
- einem Ergebnisfeld mit dem Wert in Döner

## Hinweis

Der Preis von 8,50 € ist bewusst als grober Durchschnitt gewählt, damit das Projekt simpel bleibt. In der echten Welt kann der Preis je nach Ort, Größe und Zutaten variieren.

Dieses Projekt ist ein einfaches Freizeitprojekt und kann frei genutzt werden.
