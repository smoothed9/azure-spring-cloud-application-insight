# Gateway Service
This service will act as the entry point. It'll invoke message-service, data-service and service-d.

The service uses Spring Cloud Loadbalancer with Eureka Client to connect to other services and Spring Cloud Sleuth for Distributed Tracing.

The output will be the consolidated responses from message-service and data-service. The call to service-d was added just to show an extra line in the Application Insights Dashboard 

## Testing
The service exposes a GET endpoint at the root. It can be tested by invoking http://localhost:8080 in the local
