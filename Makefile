all: install

CURRENT_PATH=$(CURDIR)
BIN_PATH=$(CURDIR)/bin
RES_PATH=$(CURDIR)/res
TOOLS_PATH=$(CURDIR)/tools
TIGHTVNC_JAR=$(BIN_PATH)/tightvnc-jviewer_v2.8.3.jar
JDK_TAR=$(BIN_PATH)/OpenJDK8U-jre_aarch64_linux_hotspot_8u382b05.tar.gz
DESTINATION_PATH=$(CURRENT_PATH)

install:
	@echo "install tightvnc"
	mkdir -p $(DESTINATION_PATH)/usr/java/vncviewer
	cp $(TIGHTVNC_JAR) $(DESTINATION_PATH)/usr/java/vncviewer/tightvnc-jviewer.jar
	cp ${TOOLS_PATH}/start_*.sh $(DESTINATION_PATH)/usr/bin/
	cp ${TOOLS_PATH}/vnc-env.sh $(DESTINATION_PATH)/etc/profile.d/
	cp ${RES_PATH}/tightvnc_icon.png $(DESTINATION_PATH)/usr/share/icons/hicolor/24x24/apps/
	tar zxf $(JDK_TAR) -C $(DESTINATION_PATH)/usr/java/

