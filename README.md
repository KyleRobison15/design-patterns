# design-patterns

This is a learning project I developed to better understand software engineering design patterns.
To learn these patterns, I completed parts 1, 2 and 3 of the "Ultimate Design Patterns" course by codewithmosh.com
which is based on the popular book, "Design Patterns - Elements of Reusable Object-Oriented Software" written by
the group known as the "Gang of Four". I also read this book as I followed along with the online course material.

My goal with this project is to gain a solid foundation for these design patterns, so I can build on that foundation
and master them in the future by applying them both at work, and for personal projects.

## Project Structure
This project is organized into four main parts:
1. **Demos** - These are the very basic examples of each pattern that I coded by following along with the course.
Think of it as the "learning material", that one practices before taking their test. This module also contains an "abuse"
package for some of the design patterns to demonstrate how one can apply these patterns incorrectly, serving as a
reference of "what not to do".


2. **Exercises** - These are essentially the tests for each design pattern. It contains the code with the naive approach
to solving the pattern that the particular design pattern addresses. I use this code as the starting point and then
create MY OWN solution in the Solutions module which refactors the naive approach to improve the code by utilizing the design pattern I learned.


3. **Solutions** - This is the code I wrote on my own to put my knowledge of each Design Pattern to the test. After writing my own solution,
I sort of graded my own test by referencing the correct solution from the course material and making any corrections if necessary.
The final result is a nicely laid out, working solution to the Exercise that can be used as a reference in the future.


4. **UML** - Images of the UML diagrams for each pattern that I created using draw.io. 
I created these diagrams for two purposes: To practice creating UML diagrams for each pattern and to use as a future reference when I'm on the job.

In the Demos and Solutions modules, each pattern contains a Demo class with a static method called show(). This makes
it easy to import the Demo class for the corresponding pattern in the Main method, and call the show() method so you can see the code in action. 