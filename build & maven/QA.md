### What is a artifact in Maven ? 

* An artifact is a file, usually a JAR, that gets deployed to a Maven repository.
* Each artifact has a group ID (usually a reversed domain name, like com.example.foo), an artifact ID (just a name), and a version string. The three together uniquely identify the artifact.
* A project's dependencies are specified as artifacts.


### To put it all together:

* Your Maven project probably depends on several Artifacts by way of its <dependency> elements.
* Maven interacts with a repository manager to resolve those Artifacts into files by instructing the repository manager to send it some 
  repository manager artifacts that correspond to the internal Artifacts.
* Finally, after resolution, Maven builds your project and produces a Maven artifact. You may choose to "turn this into" a repository manager 
  artifact by, in turn, using whatever tool you like, sending it to the repository manager with enough coordinating information that other people 
  can find it when they ask the repository manager for it.

  
### Build Lifecycle Basics
  
Docs: https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#Build_Lifecycle_Basics
  
* Maven is based around the central concept of a build lifecycle. What this means is that the process for building and distributing a particular artifact (project) is clearly defined.

* For the person building a project, this means that it is only necessary to learn a small set of commands to build any Maven project, and the POM will ensure they get the results they desired.

* There are three built-in build lifecycles: **default**, **clean** and **site**. The **default** lifecycle handles your project deployment, the **clean** lifecycle handles project cleaning, while the **site** lifecycle handles the creation of your project's site documentation.

  
  #### Artifact is a jar,package is the namespace of your  classes
  #### test -> unit tests 
  #### verify -> runs the integration test 
  #### 
  
  The Maven build lifecycle now includes the "integration-test" phase for running integration tests, which are run separately from the unit tests run during the "test" phase. It runs after "package", so if you run "mvn verify", "mvn install", or "mvn deploy", integration tests will be run along the way.
  
  
 ### There are three major built-in Build Life Cycles:

* **default**
* **clean**
* ** site**
Each Build Lifecycle is Made Up of Phases

For example the default lifecycle comprises of the following Build Phases:

◾validate - validate the project is correct and all necessary information is available
  
◾compile - compile the source code of the project
  
◾test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
  
◾package - take the compiled code and package it in its distributable format, such as a JAR.
  
◾integration-test - process and deploy the package if necessary into an environment where integration tests can be run
  
◾verify - run any checks to verify the package is valid and meets quality criteria
  
◾install - install the package into the local repository, for use as a dependency in other projects locally
  
◾deploy - done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.
  
