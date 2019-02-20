# Overview

Java program for The Game of Life.  Run it from the command line:

    java -jar KataGameOfLife-0.0.1-SNAPSHOT-jar-with-dependencies.jar 5 6
    
# Command line arguments

    no_of_rows(Required)
    no_of_cols(Required)

# Opening in Eclipse

To generate the necessary files needed to open the project in Eclipse, navigate to the project root and run the following Maven command:

    mvn eclipse:eclipse

# How to build

To build the project, navigate to the project root and run the following Maven command:

    mvn clean package assembly:single
    
This will generate a runnable JAR file that contains all dependencies.