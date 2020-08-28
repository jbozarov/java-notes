
    METHOD OVERLOADING / OVERRIDING 

    Method overriding is child class uses own method which is a same as name of parent class's method ( you change ) class A uses methodA multiple 
    times with multiple parameters 

    Method overloading ( happens within the class ) so class uses same name to create multiple methods with different parameters 
    classB inherits methodA from classA but defines its own classA and uses it. 
      ( Amir said same name but different parameters  
      JS has not overloading, last method will be invoked But Java will invoke the one which number of parameters matches 


    Concrete method is method has a body definition, opposite of abstract method 
    
    Encapsulation => declaring variable private and using getters and setters 

    Abstaraction => defining method without body and whoever wants to use they can define the method body and use it 100% abstraction is Interfaces 

    Polymorphism => using same method multiple times from child classes, method overloading and method overriding 

    Inheritence => child class uses parent class methods properties using extends 


       Association => One class is related to another class
       IS A => inheritance Car IS A vehicle, Dog IS A(n) Animal
       HAS A => Car HAS A Engine 
       composition ( instead of creating variable we define the other class instance and pass them as parameter of constructor class good example: https://github.com/JBozarov/Java_Composition.java
       aggregation 
       School is a Building, School has a library 


       subclass is a class which is inheriting from parent class 
       super class parent class which is being inherited class 


       Access modifiers 
       private ( available in class only use getter and setters ) 
       public ( available in entire project ) 
       protected / also called package-access ( available in class, subclass same package subclass, but not at other package classes and other package subclasses 
       default ( available in class, other classes / subclasses in same package, other package classes but not other package subclasses ) 
                                               
                                               
       Non access modifiers 
       static no instance
       final const in js
       abstract thread safety
       synchronized(multithreading) 


       SUPER 
       super() refers to default constructor of Parent. If you code a constructor with data in Parent then you 
       call super with the data in constructor of Child class.

       That's where you want to use protected. When you want only inherited classes to be able to access 
       your class. It's a neat little way to hide stuff from unrelated classes

                                               
                                               
                                              
                                              
OOP Design Patterns 
Creational patterns are design patterns that deal with object creation mechanisms and are used in situations when basic form of object creation 
could result in design problems or increase complexity of a code base.
                                               
Structural design patterns are design patterns that ease the design by identifying a simple way to realise relationships between entities or defines a 
manner for creating relationships between objects.       
                                               
Behavioral pattern explains how objects interact. It describes how different objects and classes send messages to each other to make things happen 
and how the steps of a task are divided among different objects. Where Creational patterns mostly describe a moment of time (the instant of creation), 
and Structural patterns describe a more or less static structure, Behavioral patterns describe a process or a flow                                               



Let's say classA is dependent on classB. we can create instance of Class B inside a ClassA
ClassB objB = new ClassB(); 
Everything seems to be working fine, but the problem is each instance of ClassA is using objB only.
What if classB changes in the future? then we need to change ClassA too. That's why it is called tight coupling.
So how can we fix that? Using dependency injection.
So dependency injection is instead of using new instance of ClassB which is objB, we put ClassB as a parameter of ClassA
constructor:
public ClassA (String name, ..., ClassB objB ) {
this.name = name; 
..., 
this.objectOfClassB = objB
}
so that we we loosely coupled.
Now we don't have to change ClassA if we change ClassB, because every time we ClassA takes different instance of ClassB
Instead of instantiating class inside another class using new keyword, class takes it as constructor parameter, so every time we can pass different version of ClassB=> this is called dependency injection.

   Naming convensions: 
     Interface => don't start with I ( wrong ) 
     Interface name has to be same as class name: ArrayList, List, Toy 
     
     Implementation: if you have one implementation put Impl ( stands for implementation ) 
     But if you have more than one, put something that shows the difference
        
                                               
                                               
                                               
                                               
                                               
                                               
                                               
