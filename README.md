# Device Registry Application

## Requirements
- Java 8
- PostgreSQL

## Setup

1. Clone the repository:

`git clone <repository-url>`

2. Создайте контейнер с БД:

`docker run --name deviceregistry-db -e POSTGRES_DB=deviceregistry -e POSTGRES_USER=user -e POSTGRES_PASSWORD=user -p 5432:5432 -d postgres:13`

3. Run the application:

`./mvnw spring-boot:run`


4. Access the API documentation:

`http://localhost:8080/swagger-ui.html`

### API Endpoints
- GET /api/devices/search?name={name}: Search devices by name
- GET /api/devices/filter: Filter devices by type, color, and price
- GET /api/devices/sort/name: Sort devices by name
- GET /api/devices/sort/price: Sort devices by price
- POST /api/devices: Add new device type
- POST /api/devices/model: Add new device model