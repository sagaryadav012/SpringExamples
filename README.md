# SpringExamples

The Spring framework comprises several modules such as IOC, AOP, DAO, Context, ORM, WEB MVC etc.

In Spring framework, IOC container is responsible to inject the dependency. 
We provide metadata to the IOC container either by XML file or annotation.

Dependency Injection : 
Dependency Injection (DI) is a design pattern that removes the dependency from the programming code,
so that it can be easy to manage and test the application. 
Dependency Injection makes our programming code loosely coupled.

Advantage of Dependency Injection : 
makes the code loosely coupled so easy to maintain
makes the code easy to test : Suppose If we have to test some only not databse thing, we can make mock
database object to ignore for testing. But we can make mock object only when it's loosely coupled.

Spring framework provides two ways to inject dependency :
 By Constructor
 By Setter method

Spring IOC Containers :
The Spring container is at the core of the Spring Framework. 
The container will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction.
The container gets its instructions on what objects to instantiate, configure, and assemble by reading the configuration metadata provided.
The configuration metadata can be represented either by XML, Java annotations, or Java code

Bean : 
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
These beans are created with the configuration metadata that you supply to the container

Bean Properties : 
class :: This attribute is mandatory and specifies the bean class to be used to create the bean.
name :: This attribute specifies the bean identifier uniquely. In XMLbased configuration metadata, you use the id and/or name attributes to specify the bean identifier(s).

Autowiring :
Autowiring feature of spring framework enables you to inject the object dependency implicitly. 
It internally uses setter or constructor injection.
Autowiring can't be used to inject primitive and string values. It works with reference only.


Advantage of Autowiring : 
It requires the less code because we don't need to write the code to inject the dependency explicitly.

DisAdvantage of Autowiring : 
It can't be used for primitive and string values.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Annotations :

1. @Configuration 
   This annotation is used on classes which define beans. @Configuration is an analog for XML configuration file – it is configuration using Java class. 
   Java class annotated with @Configuration is a configuration by itself and will have methods to instantiate and configure the dependencies.

2. @ComponentScan 
   This annotation is used with @Configuration annotation to allow Spring to know the packages to scan for annotated components. 

3. @Bean
   This annotation is used at the method level. @Bean annotation works with @Configuration to create Spring beans.
   The method annotated with this annotation works as bean ID and it creates and returns the actual bean.

4. @Component
   This annotation is used on classes to indicate a Spring component. The @Component annotation marks the Java class as a bean or say component so that the 
   component-scanning mechanism of Spring can add into the application context.

5. @Controller
   The @Controller annotation is used to indicate the class is a Spring controller. 
   This annotation can be used to identify controllers for Spring MVC or Spring WebFlux.

6. @Service
   This annotation is used on a class. The @Service marks a Java class that performs some service, such as execute business logic, perform calculations 
   and call external APIs. This annotation is a specialized form of the @Component annotation intended to be used in the service layer.

7. @RequestMapping
   This annotation is used both at class and method level. The @RequestMapping annotation is used to map web requests onto specific handler classes and handler methods. 
   When @RequestMapping is used on class level it creates a base URI for which the controller will be used.
   When this annotation is used on methods it will give you the URI on which the handler methods will be executed.

8. @RequestParam
   This annotation is used to annotate request handler method arguments. Sometimes you get the parameters in the request URL, mostly in GET requests. 
   In that case, along with the @RequestMapping annotation you can use the @RequestParam annotation to retrieve the URL parameter and map it to the method argument. 
   The @RequestParam annotation is used to bind request parameters to a method parameter in your controller.

9. @Qualifier 
   This annotation is used along with @Autowired annotation. When you need more control of the dependency injection process, @Qualifier can be used. 
   @Qualifier can be specified on individual constructor arguments or method parameters.
   This annotation is used to avoid confusion which occurs when you create more than one bean of the same type and want to wire only one of them with a property.

10. Autowired 
    This annotation is applied on fields, setter methods, and constructors. 
    The @Autowired annotation injects object dependency implicitly.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Maven Introduction

Maven is bascially a build tool, it provides 3rd party libraries. For examples If we want to connect our
jave application with Database we need mysql connector.

In normal projects, we need to download them and add them to library files but
in maven project just we need to add dependency code in POM(project object model) file.

And When we add dependency for the first it downloads from the remote repository otherwise it takes from local repository. 
Basically it searches first in local, if it not found then goes to remote.
That's why we make sure our device is connected to internet when we do maven project.

Archtype is basically template of project, like webapp(Web application), quick start(java application).
Group Id is package name.
Artifact Id is project name.
Package name is combination of GroupId and ArtiFactID.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Spring Examples ::

1. SpringDependencyInjectionXMLConfig :

   -> I have taken here two classes Lenovo, Toshiba these are Hard Disk Companies. I just want to build a latop based on specific storage requirement.

   -> Consider app class is Laptop. Now I need A HardDisk Object to build laptop. So I have two Hardisk Objects Lenovo, Toshiba.
      If I do tight coupling here it is some bit difficult to change object code. So used spring Dependency Injection for loose coupling.

   -> ApplicationContext object gives getBean("HardDrive") method, Here HardDrive is bean id for which class we want to call to creat bean in IOC Container, that we configured in Spring.xml file.
      So In future If we want to change HardDrive we can change easily class name in xml file instead of changing code.

2. SpringDependencyInjectionAnnotationConfig :

   -> In this we need to add extra lines in configuration xml file for annotation configuration.
   -> xmlns:context = "http://www.springframework.org/schema/context"
   -> http://www.springframework.org/schema/context
   -> http://www.springframework.org/schema/context/spring-context-4.0.xsd"


3. DIByConstructorEx1 :
   Classes -- Employee, App.

   -> We can inject the dependency by constructor. The <constructor-arg> subelement of <bean> is used for constructor injection.

   -> I have created parameterized constructors in Employee class.
   1. <constructor-arg value="501"></constructor-arg>
      If we don't metion type then by default value will be taken as String type, calls Employee(String name) and assigns this value(501) to name.

   2. <constructor-arg value="501" type="int"></constructor-arg>
      Here I mentioned type is int, so it calls Employee constructor which has integer paratmeter and assign value to id.

   3. <constructor-arg value="501" type="int"></constructor-arg>
      <constructor-arg value="sagar yadav"></constructor-arg>
      Here I have mentioned two value, one is int type another string default. now it calls Employee Constructor which has both parameters.

   4. If we don't mention any constructor arg values it calls default constructor.


4. DIByConstructorEx2 :
   Classes : Employee, Address, App.

   -> If there is HAS-A relationship between the classes, we create the instance of dependent object (contained object) first
      then pass it as an argument of the main class constructor. 
   -> Here, our scenario is Employee HAS-A Address. 
   -> The Address class object will be termed as the dependent object.

   <constructor-arg>
        <ref bean="address"/>
   </constructor-arg>
   The ref attribute is used to define the reference of another object, such way we are passing the dependent object as an constructor argument.


5. DIByConstructorEx3 : 
   Classes : Question, App.

   We can inject collection values by constructor in spring framework. 
   There can be used three elements inside the constructor-arg element.
   In this example, we are taking the example of Forum where One question can have multiple answers.
   In this example, we are using list that can have duplicate elements.

   The list element of constructor-arg is used here to define the list.

6. DIBySetterEx1 : 
   We can inject the dependency by setter method also. 
   The <property> subelement of <bean> is used for setter injection. 

7. DIBySetterEx2 :
   Like Constructor Injection, we can inject the dependency of another bean using setters. 
   In such case, we use property element. Here, our scenario is Employee HAS-A Address. 
   The Address class object will be termed as the dependent object.

8. DIBySetterEx3 :
   We can inject collection values by setter method in spring framework. 
   There can be used three elements inside the property element.

9. AutoWiredDemo :
   In this example we can see I have not mentioned address object as a ref in student bean, Student class is calling
   Address Object by using Autowired annotation. If we remove Autowired, it shows null.

10. JavaBasedConfigExample : 

    Execution flow :  -> When we run app class it search for Phone object -> It goes Appconfig class, Their we specified which package(basePackages) it should scan for components.
                      -> It searches in that package for Phone object. Here two classes implements Phone, i.e. Samsung and Phone.
                      -> It will get confused which class have to call, gives run time error. If we mentione @Primary annotation on Class
                         it calls that class.
                      -> Consider we metioned @Primary on OnePlus class, Now execution continues from here. It searches for Processor and Camera
                         objects. Already we have compnonents(Hasselblad, Sony, Snapdragon, MediaTek) in spring container which implements those Interfaces.
                      -> Hasselblad, Sony implements Camere, Now Again It will confuse which one to call for camera Object. We can do either way one is
                         We should specify Qulifier name or Should mention @Primary annotation on class which it should call for camera Object.
                      -> Similar process applies to processor object.

--------------------------------------------------------------------------------------------------------------------------------------------

Dependencies : 
<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-context</artifactId>
	    <version>5.2.10.RELEASE</version>
</dependency>


