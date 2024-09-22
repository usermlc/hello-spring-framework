# Spring Framework Project - Cart Service

## Project Overview

This project is a simple **Spring Framework** based application that demonstrates the functionality of a cart service where products can be added and removed from a shopping cart. It uses **Spring Boot** for easy setup and testing and includes basic product and cart management features.

## Project Structure

- **config**: Configuration classes related to Spring and the application.
- **dao**: Data access objects that handle in-memory data operations.
- **exception**: Custom exceptions, including `ProductNotFoundException` for handling product-related issues.
- **model**: Contains the core models, such as `Cart` and `Product`.
- **service**: Service layer that implements business logic for cart operations.
- **test**: Unit and integration tests for the service and repository classes.

## Features

- **Add Products to Cart**: Add a product to the cart with a specified quantity.
- **Remove Products from Cart**: Remove a product from the cart.
- **Get Cart Summary**: Calculate the total price for the products in the cart.
- **Product Repository**: In-memory product storage using a simple HashMap.
- **Error Handling**: Custom exceptions for handling cases like missing products.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Maven**
- **JUnit 5**
- **Lombok**

## Installation

To get started with the project, follow these steps:

1. **Clone the repository:**

    ```bash
    git clone git@github.com:usermlc/hello-spring-framework.git
    cd cart-service
    ```

2. **Build the project using Maven:**

    ```bash
    mvn clean install
    ```

3. **Run the tests:**

    ```bash
    mvn test
    ```

4. **Run the application:**

    You can run the application by executing:

    ```bash
    mvn spring-boot:run
    ```

## How to Use

- To test the `CartService` functionalities, unit tests are already provided in the `test` package.
- You can modify or extend the product data by adding or removing products in the `ProductRepository.java` class.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
