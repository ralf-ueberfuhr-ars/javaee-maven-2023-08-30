# Java EE mit Maven

Zum Bauen verwende folgenden Befehl:

```bash
mvn clean package
```

Du findest die gebaute Anwendung dann unter `ear/target/ear2-1.0-SNAPSHOT.ear`.
Deploye diese auf einem Java EE 8 Application Server Deiner Wahl (z.B. WAS 9).
Test-Servlets sind dann erreichbar unter
 - `http://<server:port>/war1/count` (WAR 1)
 - `http://<server:port>/war2/count` (WAR 2)

Bei Aufruf von WAR1:
```text
Counter: 0
Counter2: 0
```
Bei erneutem Aufruf von WAR1:
```text
Counter: 1
Counter2: 1
```
Bei Aufruf von WAR2:
```text
Counter: 0
Counter2: 2
```
Bei erneutem Aufruf von WAR2:
```text
Counter: 1
Counter2: 3
```
Bei Aufruf von WAR1:
```text
Counter: 2
Counter2: 4
```
