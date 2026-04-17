# Todo List – Spring Boot API

A simple backend Todo List application built with Spring Boot. This project was created to practice REST API design, CRUD operations, and backend fundamentals using Java and the Spring ecosystem.


## 🚀What this project does

This is a basic Todo management API that allows users to:

- Create new todo items
- View all todos
- View a single todo by ID
- Update existing todos
- Delete todos

Think of it as a lightweight task tracker backend with no frontend attached (yet).


## 🧠 Why I built this

This project was built to strengthen:

- Spring Boot application structure
- RESTful API design principles
- Controller → Service → Repository layering
- Database integration with JPA/Hibernate
- Clean backend architecture fundamentals

It’s intentionally minimal and focused on core backend mechanics.

## 🛠Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL (or your configured DB)
- Maven


## 📁 Project Structure
```
src/main/java
├── controller → API endpoints
├── service → business logic layer
├── repository → database access layer
├── model → entity definitions
└── TodoApplication.java
```

 

## 🔌 API Endpoints

| Method | Endpoint        | Description           |
|--------|----------------|-----------------------|
| GET    | /todos         | Get all todos         |
| GET    | /todos/{id}    | Get todo by ID        |
| POST   | /todos         | Create new todo       |
| PUT    | /todos/{id}    | Update existing todo   |
| DELETE | /todos/{id}    | Delete todo           |


## ▶️How to run locally

### Prerequisites

- Java 11+
- Maven
- MySQL (or your configured database)

### Steps

```sh
git clone https://github.com/sncisneros/todolist-spring.git
cd todolist-spring

# Update application.properties with your DB credentials

mvn clean install
mvn spring-boot:run
```

### App will run at:
```
http://localhost:8080
```


## Testing the API

You can use:

- Postman
- Insomnia
- cURL

Example:
```sh
curl -X GET http://localhost:8080/todos
```

## 📌Notes

This is a learning project focused on backend fundamentals. Some areas for improvement:

- Add authentication (Spring Security + JWT)
- Improve validation and error handling
- Add unit and integration tests
- Connect a frontend client
- Dockerize the application



## 🧩Future Improvements

- User-specific todos
- Due dates and priority levels
- Pagination and filtering
- Cloud deployment (AWS, Render, etc.)
