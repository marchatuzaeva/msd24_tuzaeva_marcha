# Git commands
## git config
Der Befehl **git config** wird genutzt, um Benutzereinstellungen und Repository-Optionen zu konfigurieren. Dazu gehören das Festlegen von **Benutzername**, **E-Mail-Adresse** und weiteren Präferenzen wie dem **Standardeditor**. Parameter wie `--global` ermöglichen systemweite Änderungen, während `--local` nur das aktuelle Repository betrifft.

## git init
Mit dem Befehl **git init** wird ein neues, leeres Git-Repository erstellt. Dabei entsteht ein **.git-Ordner**, der alle Versionskontrollinformationen enthält. Dieser Schritt dient als Grundlage, um mit der Versionskontrolle in einem Projekt zu beginnen.

## git commit
Der Befehl **git commit** speichert Änderungen aus dem Staging-Bereich dauerhaft in einem neuen Commit. Ein Commit wird mit einer Nachricht versehen, die beschreibt, welche Änderungen vorgenommen wurden. Parameter wie `-m "Nachricht"` werden genutzt, um die Commit-Nachricht direkt mitzugeben.

## git status
**git status** zeigt den aktuellen Zustand des Arbeitsverzeichnisses und des Staging-Bereichs an. Es wird ersichtlich, welche Dateien geändert wurden, welche im Staging-Bereich liegen und welche noch nicht committet sind.

## git add
Mit **git add** können Änderungen von Dateien zum Staging-Bereich hinzugefügt werden. Dieser Schritt ist notwendig, um auszuwählen, welche Änderungen Teil des nächsten Commits sein sollen. Mit `.` können alle Änderungen im aktuellen Verzeichnis auf einmal hinzugefügt werden.

## git log
Der Befehl **git log** gibt die Historie der Commits im Repository aus. Dabei werden Details wie Commit-Hash, Autor, Datum und Commit-Nachricht angezeigt. Optionen wie `--oneline` sorgen für eine komprimierte Darstellung.

## git diff
**git diff** wird verwendet, um Unterschiede zwischen verschiedenen Versionen von Dateien anzuzeigen. Ohne Parameter werden die Änderungen zwischen dem Arbeitsverzeichnis und dem Staging-Bereich dargestellt. Mit `--cached` können Änderungen im Staging-Bereich verglichen werden.

## git pull
Der Befehl **git pull** dient dazu, Änderungen aus einem Remote-Repository zu holen und diese mit dem lokalen Repository zu verbinden. Dies kombiniert die Vorgänge von **git fetch** und **git merge**, um den lokalen Stand zu aktualisieren.

## git push
Mit **git push** können Änderungen aus dem lokalen Repository in ein Remote-Repository übertragen werden. Optionen wie `--force` erlauben es, einen Push zu erzwingen, wobei Vorsicht geboten ist, um Konflikte zu vermeiden.

| Command      | Purpose |
| ----------- | ----------- |
| git init    | Initialize repository       |
| git commit   | Save changes permanently       |

## Example for a commit
![Git Commit Example](D:\MSD\2_Semester\Konfigurationsmanagement\msd24_tuzaeva_marcha\resources\images\ex2_1.jpg)
