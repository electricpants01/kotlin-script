## This PR is for learning how to add dependecy injection in a kotlin project

## What is Dependency Injection?
Dependency Injection is a design pattern that allows us to remove the hard-coded dependencies and make our application loosely coupled, extendable and maintainable. Using dependency injection, we move the creation and binding of the dependent objects outside of the class that depends on them.

## Types of Dependency Injection
There are two types of dependency injection:
- Constructor Injection
- Setter Injection

## Constructor Injection
In constructor injection, the dependencies are provided through the class constructor
```kotlin
class Client @Inject contructor(private val service: Service) {
    fun doSomething(): String {
        return service.getInfo()
    }
}
```

## Setter Injection
In setter injection, the client exposes a setter method that the injector uses to inject the dependency.
```kotlin
class Client {
    @Inject
    lateinit var service: Service
    
    fun doSomething(): String {
        return service.getInfo()
    }
}
```