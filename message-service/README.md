# Message Service
This service invokes 2 other services - service-d and service-e, combines their responses and returns it.  

Spring Cloud Loadbalancer is used to invoke the 2 services and Netflix Eureka Client is used to register this service with a Service Registry and to retrieve the URLs of service-d and service-e
