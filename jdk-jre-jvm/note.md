![Screen Shot 2022-06-18 at 5 01 38 PM](https://user-images.githubusercontent.com/53405754/174456969-ce16398d-0cfc-427e-acd7-3588f6592e78.png)

<br></br>
<br></br>
<br></br>

1. You wrote your **abc.java** code ( classes ) 
2. You click Run and it invokes the Java Compiler. Compiler checks the syntax error, if not error it converts the .java files into intermediate code( **abc.class** file) known as **bytecode**. This intermediate code is platform independent (you can take this bytecode from a machine running windows and use it in any other machine running Linux or MacOS etc). Also this bytecode is an intermediate code, hence it is only understandable by the JVM and not the user or even the hardware /OS layer.
3. Class loader loads the **bytecode** into a JVM
4. Now JIT ( part of JVM ) runs the bytecode ( .class files ) 

