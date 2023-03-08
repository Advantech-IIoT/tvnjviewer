# Project Setups
* install [Java SDK 8](https://adoptium.net/temurin/releases/)

## Build
On Windows
```
.\gradlew.bat
```

Using TightVNC Java Viewer
~~~~~~~~~~~~~~~~~~~~~~~~~~
TightVNC Java Viewer can work either as a normal application or as
an applet. To run it as an application, just execute the JAR file
(tightvnc-jviewer.jar), e.g. double-click it in the Windows Explorer.
If Java Runtime is installed on your computer correctly, that should
be enough. You will be prompted for the TightVNC Server to connect to.

If you would like to start the viewer from the command line, here are
a few examples:

  java -jar tightvnc-jviewer.jar
  java -jar tightvnc-jviewer.jar hostname
  java -jar tightvnc-jviewer.jar -port=nnn hostname
  java -jar tightvnc-jviewer.jar -port=nnn -host=hostname

... where hostname and nnn should be replaced with the actual hostname
and port number correspondingly. Note that you can use an IP address
as a hostname. Port 5900 will be used if not specified.

Important: the syntax like hostname:display or hostname::port is not
           supported in this version of TightVNC Java Viewer.

For more command line params info run:

  java -jar tightvnc-jviewer.jar -help

Finally, if you would like to use the viewer as an applet, please see
the example HTML page included (viewer-applet-example.html).
