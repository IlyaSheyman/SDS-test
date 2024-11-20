
# SDS Test
Student management service with flexible functionality 



## 👋 Features
1.	**Student Management API:**	Full CRUD operations for managing student data


2.	**Data Validation:**
- Input validation using @Valid and Jakarta Validation API.
- Uniqueness check for combinations of lastName, firstName, and middleName to prevent duplicate entries.

3.	**Swagger UI:** Automatically generated API documentation. Provides detailed descriptions of endpoints, data models, and example requests.


4. **Spring Security:** Endpoint protection with flexible configuration options.


5.	**Database Integration:**
- Uses MongoDB for persistent data storage.
- Optimized query methods for efficient data retrieval and validation.


## 🧑🏻‍💻 Demo

Use [Postman requests collection](sds-test.postman_collection.json) to test functionality

### The most important: Getting Access Token

Retrieve an access token to authenticate API requests.

	•	Endpoint: /oauth2/token
	•	Method: POST
	•	Authorization: Basic Auth (Username: root; Password: root)
	•	Content-Type: application/x-www-form-urlencoded
    •   Body: grant_type=client_credentials

Response:
```
{
  "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
  "token_type": "Bearer",
  "expires_in": 3600,
  "scope": "read write"
}
```

## 🚀 Setup

1. Clone the project

```bash
  git clone https://github.com/IlyaSheyman/SDS-test.git
```

2. Go to the project directory

```bash
  cd SDS-test
```

3. Run database

```bash
  docker-compose up
```

4. Build project

```bash
  mvn clean package
```

5. Run the packaged .jar file.

```bash
  java -jar target/Student-service-0.0.1-SNAPSHOT.jar
```

6. After successful launch, you will be able to access your application at:
- http://localhost:8080


## 🔧 Technologies Used:
1. _Java 17_
2. _Spring Boot 3_
3. _MongoDb_
4. _Maven_
5. _JWT for authentication_
6. _Swagger/OpenAPI for API documentation_
7. _Lombok for reducing boilerplate code_
8. _Docker for containerization_

## 📄 Configuration
1. [Swagger](https://editor.swagger.io/): http://localhost:8080/api-docs

