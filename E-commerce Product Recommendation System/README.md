# E-commerce Product Recommendation System

This Java project implements a product recommendation system for an e-commerce platform using graph traversal algorithms (BFS and DFS).

## Description

This system simulates product relationships in an e-commerce platform using a graph structure. Each product is a node in the graph, and edges represent relationships between products (e.g., accessories or complementary items).

Users can input a product ID and choose between BFS or DFS traversal methods to explore related products and receive recommendations.

## Features

*   **Graph Representation:** Uses an adjacency list to represent product relationships.
    
*   **Traversal Algorithms:** Implements Breadth-First Search (BFS) and Depth-First Search (DFS) to traverse the product graph.
    
*   **Product Recommendations:** Provides up to 3 product recommendations based on the chosen traversal method.
    
*   **User Interface:** Simulates a simple user interface to interact with the system.
    
*   **Invalid Product Handling:** Handles invalid product IDs gracefully.
    

## How to Run

1.  **Compile:** Compile the `Graph.java` file using a Java compiler.
    
2.  **Run:** Execute the compiled code.
    
3.  **Interact:** Follow the on-screen prompts to enter a product ID and choose a traversal method.
    

## Example Usage
Setting up product relationships in the e-commerce platform...

List of Products and their Corresponding IDs:
1 - Laptop
2 - Laptop Bag
3 - Mouse
...

Product Graph (Product ID Connections):
Node 1 is connected to [2, 3]
Node 2 is connected to [1, 4, 5]
...

Welcome to the E-commerce Product Recommendation System!
You can explore related products using either BFS or DFS.

Enter a product ID to start traversing the product network: 2

Choose the traversal method:

BFS (Explore products level by level)
DFS (Explore products deeply, one path at a time) 2
--- DFS Traversal Starting from Product 2 ---
--- End of DFS Traversal ---

--- Top 3 Product Recommendations ---
2 1 3
--- End of Recommendations ---

Thank you for using the E-commerce Product Recommendation System!

## Project Structure

*   `Graph.java`: Contains the implementation of the graph data structure and traversal algorithms.
    
*   `README.md`: This file.
    

## Contributing

Feel free to contribute to this project by:

*   Improving the code efficiency or readability
    
*   Adding more features (e.g., different traversal algorithms, more sophisticated recommendations)
    
*   Enhancing the user interface
    

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

Youssef Al Mukdad

