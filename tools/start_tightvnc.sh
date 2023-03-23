#!/bin/bash
# source environment
source /etc/profile
# export the name of the display of an running xserver
export DISPLAY=:0
# start tightvnc
java -jar /usr/java/vncviewer/tightvnc-jviewer.jar

exit 0

