
    METHOD OVERLOADING / OVERRIDING 

    Method overriding is child class uses own method which is a same as name of parent class's method ( you change ) class A uses methodA multiple 
    times with multiple parameters 

    Method overloading ( happens within the class ) so class uses same name to create multiple methods with different parameters 
    classB inherits methodA from classA but defines its own classA and uses it. 
      ( Amir said same name but different parameters  
      JS has not overloading, last method will be invoked But Java will invoke the one which number of parameters matches 


    Concrete method is method has a body definition, opposite of abstract method 

    Abstaraction defining method without body and whoever wants to use they can define the method body and use it 100% abstraction is Interfaces 

    Polymorphism using same method multiple times from child classes to 

    Inheritence child class uses parent class methods properties using extends 


       Association => One class is related to another class
       IS A => inheritance Car IS A vehicle, Dog IS A(n) Animal
       HAS A => Car HAS A Engine 
       composition 
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




