What is a Marker interface ? 

it is an empty interface 


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
