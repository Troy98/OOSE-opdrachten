# Oefening Primetester

## Deel 1 opzet

* Creëer een Java project met Maven. Als je dat via IntelliJ doet is de naam van het project gelijk aan de artifactId en kiest IntelliJ voor groupId ```org.example```, dat kun je aanpassen onder "Advanced Settings".
  * Kies een `groupId` die zinnig is en aan de conventies voldoet
  * Kies een `artifactId` die zinnig is.
* Zorg ervoor dat je JUnit Jupiter versie `5.8.2` als dependency in je pom hebt staan
* Plaats de drie bestanden die in dit project zitten op de juiste plek in je nieuwe project.

## Deel 2 Project werkend maken

Het project bevat nu een klein programmaatje waarmee je kunt testen of getallen
een priemgetal zijn. Er ontbreekt nog een belangrijk onderdeel, namelijk de methode die test of een getal priem is. Deze gaan we niet zelf schrijven.

* Importeer m.b.v. Maven de dependency `org.apache.commons.commons-math3`, versie `3.6.1`.
* Deze dependency bevat een klasse `Primes` met een methode `isPrime()`. Deze zie je terug op regel 23 van `PrimeTester`. Zorg dat hij het doet.
* Met een beetje geluk heb je nu een werkende applicatie. Run hem via de commandline met Maven.

## Deel 3 Multithreaded maken

We gaan er nu voor zorgen dat je vanuit de `PrimeTestingApp` meerdere threads opstart met een `PrimeTester`. Deze zullen gelijktijdig naar priemgetallen gaan zoeken. Vier threads is genoeg.

* Verhoog de stopconditie tot 2000. Deze kun je vinden op regel 8 van `PrimeTestingApp`.
* Zorg ervoor dat je `PrimeTesters` als Threads kunt opstarten. (Pas hierbij de methode `startTesting` van `PrimeTester` niet aan. Maar laat hem zoals hij is en roep hem aan vanuit een nieuwe `run()` methode).
* Maak in `PrimeTestingApp` vier instanties van `PrimeTesters` en start deze op in afzonderlijke threads.
* Maak je applicatie ThreadSafe.

## Deel 4 Omgaan met het getal 37

We gaan de code nu zo aanpassen dat de Thread die het getal 37 ontdekt als priemgetal zal sterven.

* Maak een checked exception met de naam `OuchIFoundThirtySevenAndHenceMustDieException`. Zet hem ook in de juiste package.
* Zorg ervoor dat zo snel een 'PrimeTester' erachter komt dat hij 37 aan het testen is, hij de Exceptie gooit.
* Gooi deze exceptie al in de methode `startTesting` en vang hem op in de `run()` methode. Wanneer hij de exceptie vangt moet hij de volgende regel naar `console.log` printen:

`13 found Thirty Seven and must die.`

Dus eerst de id van de thread en dan het bericht dat hij zal sterven.

## Deel 5 Unittesten

Je hebt nu drie klassen en nul unittests.

* Zorg ervoor dat je voor alle publieke methodes, waarvoor het mogelijk is, een zinnige unittest hebt.
* Zorg voor clean code in je test code:
  * a) gebruik goede naamgeving van je testfuncties
  * b) hanteer zoveel mogelijk standaard naamgeving van variabelen in de unit test code (zoals `sut`, `actual`, `expected`)
  * c) maak AAA pattern zichtbaar, en refactor evt. duplicatie uit je unit test code via bv. een `@beforeEach`.
