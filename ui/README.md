# ![Praegus_logo](https://avatars.githubusercontent.com/u/53261849?s=25&v=4) End-to-end testen met Cypress

## Wat heb je nodig

- [Praegus Travels](https://bestanden.maatos.nl/2020/10/a32a9be0-praegustravels.zip)
- [Cypress](https://download.cypress.io/desktop)

## Opdrachten

### Start Praegus Travels

1. Download de Praegus Travels zip en pak deze uit.
2. Start de applicatie met het bestand `startTravels.command` (Mac) of `startTravels.bat` (Windows)
3. Ga in je browser naar http://localhost:8123/ en controleer of je applicatie draait.

### Cypress

1. Download Cypress en pak de zip uit
2. Start Cypress
3. Kies een folder voor je project
4. Maak de keuze voor e2e testing en kies voor continue. Cypress maakt wat nu automatisch wat bestanden aan in je project folder.
5. Kies daarna voor Google Chrome als browser
6. Maak een nieuwe spec en run het voorbeeld met https://example.cypress.io/

### Praegus Travels

1. Ga in je project folder naar de spec file die zojuist aangemaakt is.
2. Vervang de test door de onderstaande:

```
describe('Praegus Travels', () => {
  it('search the campings', () => {
    cy.visit('http://localhost:8123/');
    cy.get('span.searchbutton').click();
    cy.contains('Foxworth').should('be.visible');
    cy.contains('Vicksburg').should('be.visible');
    cy.contains('Wikieup').should('be.visible');
  });
});
```

3. Ga weer terug naar Cypress en kijk hoe de nieuwe test gedraaid wordt.

#### Scenario's

Speel eerst de CSS Selector game om te leren hoe je elementen kunt vinden op een pagina: https://flukeout.github.io doe een aantal levels en zorg dat je begrijpt hoe je HTML elementen kunt selecteren.

Probeer de onderstaande scenario's te automatiseren. Hou daarbij de cleancode principes aan. Gebruik de Cypress docs om te kijken welke acties je kunt gebruiken: https://docs.cypress.io

1. Open http://localhost:8123/ en controleer of het Praegus logo zichtbaar is.
2. Controleer of de landen Belgie, Frankrijk, Spanje aanwezig zijn in de dropdown.
3. Kies voor campings zonder zwembad en zonder animatie in Spanje
4. Klik op zoeken
5. Controleer of het eerste zoekresultaat Madrid is.
