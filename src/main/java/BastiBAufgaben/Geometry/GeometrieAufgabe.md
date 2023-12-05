# Geometrie-Aufgabe

## Ziel
Das Ziel dieser Aufgabe ist es, Klassen für verschiedene geometrische Formen zu erstellen und Methoden zur Berechnung von Flächen und Umfängen zu implementieren. 
Zusätzlich sollen JUnit-Tests geschrieben werden, um die korrekte Funktionalität sicherzustellen.

## Klassen

### 1. Circle-Klasse
- Konstruktor: Akzeptiert den Radius als Parameter.
- Methoden:
  - `getRadius()`: Gibt den Radius des Kreises zurück.
  - `calculateArea()`: Berechnet die Fläche des Kreises.
  - `calculateCircumference()`: Berechnet den Umfang des Kreises.

### 2. Rectangle-Klasse
- Konstruktor: Akzeptiert Länge und Breite als Parameter.
- Methoden:
  - `getLength()`: Gibt die Länge des Rechtecks zurück.
  - `getWidth()`: Gibt die Breite des Rechtecks zurück.
  - `calculateArea()`: Berechnet die Fläche des Rechtecks.
  - `calculatePerimeter()`: Berechnet den Umfang des Rechtecks.

### 3. ShapeCalculator-Klasse
- Methoden:
  - `calculateTotalArea(List<Circle> circles, List<Rectangle> rectangles)`: Berechnet die Gesamtfläche aller Kreise und Rechtecke.
  - `calculateTotalPerimeter(List<Circle> circles, List<Rectangle> rectangles)`: Berechnet den Gesamtumfang aller Kreise und Rechtecke.

## JUnit-Tests

### 1. Circle-Test
- Testet die korrekte Initialisierung des Radius.
- Testet die korrekte Berechnung der Fläche.
- Testet die korrekte Berechnung des Umfangs.

### 2. Rectangle-Test
- Testet die korrekte Initialisierung von Länge und Breite.
- Testet die korrekte Berechnung der Fläche.
- Testet die korrekte Berechnung des Umfangs.

### 3. ShapeCalculator-Test
- Testet die korrekte Berechnung der Gesamtfläche.
- Testet die korrekte Berechnung des Gesamtumfangs.

Stelle sicher, dass die Implementierungen und Tests korrekt sind, um eine zuverlässige geometrische Berechnung zu gewährleisten.
