# jfree-starter
A minimal Maven-driven Java project for Java 11 or later.  This project is intended to be used as a starting point for small demo applications, and an easy way to get started for developers not yet familiar with Maven.

You should have Apache Maven (version 3.9.9 recommended) installed on your system.

To build the project, type the following command from the root directory of the project:

    $ mvn clean verify

To run the program:

    $ java --module-path target/starter-1.0.jar:target/dependency -m JFreeStarter
