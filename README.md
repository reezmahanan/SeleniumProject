# IT 2408 – Selenium Testing Practical

This project is for Practical Handout 1 of Software Testing & Quality Controlling at ITUM. I used Java, Selenium WebDriver, TestNG, and Maven to automate 10 test cases on [The Internet](https://the-internet.herokuapp.com/).

## What the tests cover

- **TC01** checks the home page title.
- **TC02–TC06** check valid login, invalid credentials, empty fields, and logout.
- **TC07–TC10** check checkboxes, dropdown selection, number input, and adding and deleting buttons.

Each test case has its own TestNG `@Test` method. TestNG assertions compare the actual result with the expected result. The browser closes after each test.

## How to run

Open a terminal in the project folder and run:

    mvn test

Check the TestNG results and record Pass or Fail for each test case in the practical handout.