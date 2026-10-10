# Monthly Cost Calculator — Research Milestone

An interactive web application created for Carolina Cribs.

## App Functionality

Users enter an apartment name, base monthly rent, parking fee, and estimated utilities fee. The application adds those costs and displays the estimated total monthly cost. It also checks that the apartment name is provided and that costs are not negative.

## Technologies Used

- Java
- Spring Boot
- Thymeleaf
- Maven
- HTML
- CSS

## Why I Chose These Technologies

Spring Boot makes it easier to create a Java web application because it provides the web server and project structure. Thymeleaf allows Java to send calculated results to an HTML webpage. Maven is the package manager and build tool, it downloads dependencies and runs the project. These technologies could support Carolina Cribs features such as apartment searches, cost calculations, favorites, and reviews. For the full project, a PostgreSQL database could be added to store apartment, user, fee, favorite, and review information.

## How to Run the App

1. Open the project in VS Code.
2. Open a terminal in the project folder.
3. Run:
.\mvnw.cmd spring-boot:run