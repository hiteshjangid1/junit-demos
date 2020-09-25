# Maven Integration with JUNit

1. Maven uses `surefire` plugin for integration with JUnit & TestNG
2. SureFIRE can collect the results in TXT and XML format (Verbose)
3. The Maven command to RUN test-case from command-line
    `mvn test`

    > maven MUST BE installed as independent tools
    
    > System PATH must include path to maven executable (c:\apache-maven-3.5.0\bin)

    > Current working directory must be the project root folder (mvn search for pom.xml file)

4. Inside eclipse, just RIGHT CLICK on project-name choose "Run As" > "Maven Test"


## Demo Steps


1.  Goto "window" menu of eclipse and then "preferences"
2.  search for "JRE" > Installed JRE > Click "Add" button
3.  Choose option "Standard VM" > Click "Next" > Click "Directory"  button and
    locate your JDK path (It should be inside C:\Program files\java\jdkXXXXXX)
4.  Press OK 
5.  Use CheckBox to mark NEWLY added JDK as Default

6.  Using eclipse create a new MAVEN project, choose option `Skip Archetype selection`

7.  open `pom.xml` file for newly created project and add following DEPENDENCY element
    ```xml
    <dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13</version>
        <scope>test</scope>
    </dependency>
    </dependencies>
    ```

8.  Add Java Compiler properties in `pom.xml` file

    ```
    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
    ```

