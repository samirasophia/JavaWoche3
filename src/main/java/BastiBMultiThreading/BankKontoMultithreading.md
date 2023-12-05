# Multi-Threading Aufgabe

## Aufgabenbeschreibung

Du sollst eine Java-Anwendung entwickeln, die eine einfache Bankkontosimulation mit Multi-Threading implementiert. 
Das Bankkonto wird von mehreren Threads gleichzeitig bearbeitet, die Einzahlungen und Abhebungen durchführen.

### Anforderungen

1. Erstelle eine Klasse namens `BankAccount`, die ein Bankkonto repräsentiert. 
Die Klasse sollte eine Methode zum Einzahlen (`deposit`) und eine Methode zum Abheben (`withdraw`) haben. 
Diese Methoden sollten sicherstellen, dass Transaktionen atomar durchgeführt werden, um Thread-Sicherheit zu gewährleisten.

2. Implementiere eine Klasse namens `Transaction`, die die `Runnable`-Schnittstelle implementiert. 
Diese Klasse führt entweder eine Einzahlung oder eine Abhebung auf dem Bankkonto durch, abhängig von den übergebenen Parametern.

3. In der `BankSimulation`-Klasse sollst du ein Bankkonto erstellen und drei Threads starten, die verschiedene Transaktionen durchführen. 
Verwende dabei die Klassen `BankAccount` und `Transaction`. 
Stelle sicher, dass der finale Kontostand am Ende korrekt ist.

### Hinweise

- Verwende ein `ReentrantLock`, um die kritischen Abschnitte in den Methoden der `BankAccount`-Klasse zu schützen.
- Füge eine kurze Erklärung zur Thread-Sicherheit und zur Funktionsweise deiner Lösung hinzu damit du es in Zukunft noch weisst.

