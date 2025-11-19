# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    Customer --> Order: places
    Order --> OrderItem: includes

    Customer : +String name
    Customer : +String address
    Order : +Int orderNumber
    Order : +String dataPlaced
    Order : +String deliveryDate
    OrderItem : +String name
    OrderItem : +String description

    class Customer{
        +placeOrder()
    }
    class Order{
        +checkStock()
        +takePayment()
    }


[mer]: https://mermaid.js.org/
