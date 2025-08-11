# Circuit Breaker Demo (Spring Boot + Resilience4j)

## What
A small Spring Boot microservice that calls an external API (http://localhost:8081/delivery/status)
and uses Resilience4j Circuit Breaker to return a fallback response when the external API fails.

## How to run
1. Import the project into your IDE as a Maven project, or run via command line:
   mvn spring-boot:run
2. The service runs on port 8080. Call:
   GET http://localhost:8080/check-delivery
3. Ensure the external service is running at http://localhost:8081/delivery/status to get a live response.
   If that service is down, you'll receive the fallback message.
