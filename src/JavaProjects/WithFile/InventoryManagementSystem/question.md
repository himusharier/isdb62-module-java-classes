### **Question:**

Design and implement an **Inventory Management System** in Java using the following requirements and principles:

---

### **1. Object-Oriented Programming Principles**

- **Classes and Objects:**
    - Implement the following core classes:
        - `Product`: Represents general product attributes such as `productID`, `name`, `price`, `quantity`, and `category`.
        - `Supplier`: Manages supplier details, including `supplierID`, `name`, `contactInfo`, and a list of products supplied.
        - `Order`: Tracks customer orders with attributes like `orderID`, `orderedProducts` (list of products), and `totalPrice`.

- **Inheritance:**
    - Create subclasses for `Product`:
        - `PerishableProduct`: Adds attributes such as `expiryDate` to manage time-sensitive goods.
        - `NonPerishableProduct`: Focuses on products with no expiry date but may include attributes for bulk handling.

- **Polymorphism:**
    - Use method overriding to calculate prices differently:
        - `PerishableProduct`: Apply discounts based on proximity to the `expiryDate`.
        - `NonPerishableProduct`: Include bulk pricing discounts for large quantities.

---

### **2. Exception Handling**

- Create custom exceptions for error handling:
    - **`OutOfStockException`:** Triggered when an order quantity exceeds the available stock for a product.
    - **`InvalidOrderException`:** Raised for invalid orders, such as missing product information or incorrect quantities.

- Ensure meaningful error messages are displayed and that the program continues to run without crashing.

---

### **3. File I/O Operations**

- Implement file handling for inventory data management:
    - **Stock Tracking:** Read and write stock levels to a file (`inventory.txt`). Update this file whenever stock changes occur.
    - **Export Reports:** Generate a report (`inventory_report.txt`) that lists the current inventory, including details such as product type, quantity, and pricing.

---

### **4. Implementation Guidelines**

1. **System Structure:**
    - Use a modular and organized approach to define the classes.
    - Define constructors for initializing objects and appropriate methods for managing inventory (e.g., adding products, placing orders, exporting inventory).

2. **Behavior Implementation:**
    - **Adding Products:** Allow adding products from suppliers into the system. Ensure product attributes (e.g., name, price, expiry date) are validated.
    - **Placing Orders:** Implement functionality to process customer orders, check stock availability, and update the inventory.
    - **File Operations:** Ensure smooth reading and writing of inventory data to and from files.

3. **Test Scenarios:**
    - Adding a perishable product and a non-perishable product to inventory.
    - Placing an order and handling exceptions like out-of-stock errors.
    - Generating and exporting a detailed inventory report.

4. **Documentation and Comments:**
    - Provide comments within the code to explain the purpose of classes, methods, and key operations.
    - Write a brief explanation of the design and implementation process.
