Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda simple de hospedaje

    Given que me enuentro en el login de Airbnb
    When busco "Cancun Mexico"
    Then muestra el texto "Over 1,000 places"

  @test2
  Scenario: Buscar hoteles en Vichayito con criterios específicos
    Given que estoy en la aplicación y cierro cualquier ventana emergente
    When escribo "Hoteles en Vichayito" en el formulario "Where to?"
    And selecciono "SKIP" en el formulario "When's your trip?"
    And hago clic en el botón de search
    Then debería ver el mensaje "Over 1,000 places"
