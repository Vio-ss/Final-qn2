# E-commerce Website Testing

This project focuses on testing features of an e-commerce website, such as Amazon or Flipkart, using Behavioral Driven Testing (BDT).

# Project Structure

![feat](https://github.com/Vio-ss/Final-qn2/assets/77194486/f95258ed-4cc4-4624-9ebb-b443a7a3f920)

## Features

The following features are performed by a user:

1. **User Registration and Sign Up**: Users can register and sign up on the website.
2. **User Login**: Users can try to log in to their account using their credentials.
3. **Add Product to Cart**: Users can add a product to their cart.
4. **Checkout**: Users can click on "Checkout Now" to proceed with their purchase.
5. **Payment**: Users can pay for their items securely.
6. **Logout**: Users can log out from the website.

## Behavioral Driven Testing (BDT)

Behavioral Driven Testing (BDT) is applied to test the above. 

### Scenario: Check Homepage

- **Given** user is on the home page
- **When** user clicks on "Sign In"
- **Then** user enters login details and continues
- **And** user navigates to the cart page
- **And** user navigates to the products page
- **Then** user searches for "Macbook Pro"
- **And** user adds an available item to the cart
- **Then** user goes to the cart page
- **And** user clicks on "Checkout"
- **Then** user clicks on "Account"

## Getting Started

To get started with the project, follow these instructions:

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/Vio-ss/Final-qn2
    ```

2. Navigate to the project directory:

### Usage

1. Execute the behavioral-driven tests for the chosen feature.

