# tightvnc

## Document
[Document](https://www.tightvnc.com/docs.php)  
[Java Viewer Help (TXT)](https://www.tightvnc.com/doc/java/README.txt)  

## Source
* The tightvnc jar in bin is build result

ref: [Download TightVNC Java Viewer Source](https://www.tightvnc.com/download/2.8.3/tvnjviewer-2.8.3-src-gnugpl.zip)


* The JRE tar.gz in bin is downloaded from [AdoptOpenJDK](https://adoptium.net/)

ref: [Download JRE](https://adoptium.net/temurin/releases/)

## Project Setups
* install [Java SDK 8](https://adoptium.net/temurin/releases/)

### Build
On Windows
```
.\gradlew.bat
```

# JDK Comparison
* AdoptOpenJDK - https://adoptopenjdk.net
* Amazon – Corretto - https://aws.amazon.com/corretto
* RedHat - https://developers.redhat.com/products/openjdk/overview

|  Criteria   | Oracle JDK  |  Red Hat OpenJDK   | Amazon Coretto  | AdoptOpenJDK  |
|  ----  | ----  |  ----  | ----  | ----  |
| Free / Commercial basis  | Need to purchase licenses. |  JDK is free  |  JDK is free |  JDK is free |
| Long-term support (LTS) options  | + Java 8 till December 2030 (Extended support) | + LTS of Red Hat OpenJDK 8 till Nov 2026*  | + Java 8 support till July 2026 | + Java 8 support till Nov 2026 |
|  Platform aarch64|  O|  X|  O|  O|
|  aarch64 Package Type|  JRE/JDK|  -|  JDK|  JRE/JDK|

ps. JRE (Java Runtime Environment) is smaller than JDK (Java Development Kit).
The JRE is a set of components to create and run a Java application.  
The JDK includes tools for developing and testing programs written in the Java programming language and running on the Java platform. 
