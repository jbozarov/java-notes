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
