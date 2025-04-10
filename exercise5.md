# Konfigurationsübung 05 - Branching

## Warum werden Logging-Bibliotheken verwendet?
Logging-Bibliotheken wie Log4j werden verwendet, um:
- Ereignisse während der Laufzeit zu protokollieren.
- Debugging zu erleichtern und Fehler in Anwendungen zu identifizieren.
- Wichtige Informationen für die Analyse von Systemverhalten und Leistung bereitzustellen.
- Log-Daten flexibel und effizient zu speichern und zu verwalten.

## Loglevel in Log4j
Log4j bietet folgende Loglevel:
- **FATAL**: Kritische Fehler, die zum sofortigen Programmabbruch führen.
- **ERROR**: Fehler, die eine Funktionalität beeinträchtigen, aber keinen Abbruch verursachen.
- **WARN**: Warnmeldungen über potenziell problematische Situationen.
- **INFO**: Allgemeine Informationen über den normalen Betrieb.
- **DEBUG**: Detaillierte Debugging-Informationen.
- **TRACE**: Noch detailliertere Informationen als DEBUG, hilfreich für die tiefergehende Analyse.
- **ALL**: Aktiviert alle Loglevel.
- **OFF**: Deaktiviert die Protokollierung.

Diese Loglevel erlauben eine granulare Steuerung darüber, welche Informationen protokolliert werden sollen.

## Konfigurationsmöglichkeiten in Log4j
Log4j bietet eine Vielzahl von Konfigurationsmöglichkeiten, wie:
- **Appender**: Definiert, wohin Logs geschrieben werden sollen (z. B. Datei, Konsole, Datenbank).
- **Layouts**: Formatierung der Log-Nachrichten (z. B. einfache Textformate, JSON).
- **Loggers**: Ermöglicht die Zuweisung spezifischer Loglevel für unterschiedliche Komponenten.
- **Filter**: Ermöglicht das Filtern von Log-Meldungen basierend auf bestimmten Kriterien.

Die Konfiguration kann über **XML**, **JSON**, **YAML** oder eine **Properties-Datei** erfolgen.


