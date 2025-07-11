
Feature: Open Web example

  Scenario: Navegar en Serenity Demo y ver clientes
    Given que ingreso a la pagina web de Serenity
    When hago clic en el enlace "Northwind"
    And hago clic en la opción "Clientes"
    Then debería ver la lista de clientes en pantalla