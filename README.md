# LocationServiceIAC_opdracht_1
Project van de Location Service door Jochem Kuus.

In de huidige vorm heb ik de laatste stand niet kunnen testen, Tomcat vond opeens dat de listener niet meer gebouwd kon worden. 
Dit heeft merendeel van mijn zondag gespeeld, meerdere vorige oplossingen die vroeger werkten werken nu niet meer. Hierdoor heb ik te veel tijd verspild en ben ik te laat aan het maken van een echt test plan en rapport begonnen. De server werkt ook nu nog niet, tot mijn spijt.

De laatste update van de service, waarin de input aan de Java kant nogmaals op pattern gecontroleerd wordt is dus niet met 100% zekerheid meegenomen in de verwachtte resultaten van de testen.

Tests kunnen gevonden worden onder 'src/testService'.
In 'src/GenerationFiles' kunnen de oorsponkelijke XSD en WSDL bestanden gevonden worden.
'src/LocationService' zijn uit de WSDL gegenereerde bestanden te vinden.
'src/wsProducer' bevat de implement class die het request omzet naar het response.

In de 'target' folder is het .war bestand van de server te vinden.
