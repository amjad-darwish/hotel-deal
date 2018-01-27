#The main functionality of the project is consuming hotel deals with a repository,Expedia in our case, and present them to a customer.

The main challenge part of the project was isolating our project from a repository which provides hotel deals to our project.

Main components:
1. Connector: it is a component that provides a useful way to connect our system with any third party system, now it provides HTTP connection,
			  it is an extendable component since we can add a new connection methodologies (SOAP service, EJB, ... etc)

2. Logger Manager: It is a component that provides the system with log functionality. With this component we can send the log messages to
				   different systems like Hadoop, Kafka, File System, ... etc. Now, logs are sent to File system using log4j, but you can
				   integrate the system with any third party system with no change in this system.

3. Pagination Handler: It is a component used to extract pagination info from user request and provide them to a repository without pass these
				 	   info as methods' parameters(stack). To achieve this we use Pagination Extractor and Injector components. The extractor and
				 	   injector depends on the user request type and backend connection type.
				 	   
The project is developed using these technologies: Java8, Servlet3, Spring(Context, Web, MVC, AOP, Task), RESTful service, Tomcat8, Jquery, HTML5,
												   Maven, Git

The project is built and delpoyed using (Travis CI and Heroku)        			  