# microservices

request:
========
{
    "order":{
    "id": 104,
    "name":"mobile phone",
    "qty":1,
    "price":8000
    },
    "payment":{
        
    }
}


response:
========

{
    "order": {
        "id": 104,
        "name": "mobile phone",
        "qty": 1,
        "price": 8000.0
    },
    "amount": 8000.0,
    "transactionId": "c95eb865-c6da-4f53-878d-62d6fb748434",
    "message": "payment failure"
}


Service-Registry:
==================
1) create one eureka service registry with adding Eureka server as a dependency.

	registering group of services will use eureka server dependency.
	registering the application (microservices) will use Eureka Discover Client.

2)add @EnableEurekaServer 	
	
3) To mark eureka as a server configure application.properties with below.
	#define eureka is not a client
	eureka.client.register-with-eureka=false
	eureka.client.fetch-registry=false
	server.port=8761
    
    
    
  after service registry add @EnableEurekaClient to the services along with ependencies
  
  pom.xml
  --------
  
  <spring-cloud.version>Hoxton.SR3</spring-cloud.version>


    <dependency>
		<groupId>org.springframework.cloud</groupId>
		<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
     </dependency>
		
		


    <dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>



