What is a Marker interface ? 

it is an empty interface 
why do we use it ? it is metadata for the class 


Ojbect cloning ? 

creating object using contructor of the class that uses existing same type of object: 


```
public class Student {
  private int id;
  private String name;
  Student() { //default Constructor
  }

  //Parameterised Constructor
  Student(int idNo, String sName) {
    id = idNo;
    name = sName;
  }
  
  
  //copy constructor
  Student(Student student) {
    id = student.id;
    name = student.name;
  }
}
```


Why java is not 100% OOP ? <br/><br/>
because it uses primitive data type 
<br/><br/>
<br/><br/>
<br/><br/>
<br/><br/>

can we use this and super together in java
<br/><br/>

super() calls the constructor of the parent class 
this() calls the constructor of the same class 


### Java pass by value or pass by variable

``` 
public class Example2 {
    public static void main(String[] args) {
        int val = 12;  
        System.out.println(val);    // 12 
        changer(val); 
        System.out.println(val);   // 12 
        // because, val is not changes, it is pass by value, if changer takes the reference then it would change val 
    }


    public static void changer(int a) {
        a = 13;
    }
}
```

