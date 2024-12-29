Feature: Creacion de clientes en el portal de Siigo

  Scenario Outline: Crear un tercero tipo Cliente
    Given que el usuario de Siigo desea iniciar sesion con <usuario> <password>
    And navega a la seccion de creacion de clientes
    When realiza el proceso para crear un cliente
    Then visualiza el mensaje de creacion exitosa del cliente

    Examples:
      | usuario                       | password     |
      | "admin@siigoautomationqa.com" | "(#T0Nu@QrO" |