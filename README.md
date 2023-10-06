# DevOps-ExaminationProject

I detta utbildnings projekt skapar jag en CI/CD pipeline där tester körs enligt "fail-fast".
Inuti PDF Folder hittar man kriterier "TaskDescription" samt teststrategi inlämningen "DevOps examination". 



## Instruktionsbok för Utvecklare

För att göra det enklare att releasa programmet, här är en lista på värdefulla kommandon och exempel på kod.

### Gradle-kommandon

- `./gradlew checkstyleMain`: Kör checkstyle för huvudkod.
- `./gradlew checkstyleIntegrationTest`: Kör checkstyle för integrationstester.
- `./gradlew build`: Bygger hela projektet.
- `./gradlew test`: Kör enhetstester.
- `./gradlew integrationTest`: Kör integrationstester.

### Git-kommandon

- `git log`: Visar en lista över alla tidigare commits.
- `git log -S`: Söker i commit-historiken med en specifik sträng.
- `git show <git-sha>`: Visar detaljer om en specifik commit, ersätt `<git-sha>` med commitens SHA-1 hash.
- `git commit -m "Meddelande"`: Committar ändringar med ett specifikt meddelande.
- `git push`: Skickar dina commits till ett fjärrlager.
- `git pull`: Hämtar den senaste versionen från ett fjärrlager.
- `git merge <branch>`: Sammanfogar en annan gren med den aktuella grenen, ersätt `<branch>` med grenens namn.
- `git rebase`: Används för att flytta eller kombinera en sekvens av commits till en ny baskommit.


