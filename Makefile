all: install

CURRENT_PATH=$(CURDIR)
BIN_PATH=$(CURDIR)/bin
RES_PATH=$(CURDIR)/res
TOOLS_PATH=$(CURDIR)/tools
TIGHTVNC_JAR=$(BIN_PATH)/tightvnc-jviewer_v2.8.3.jar
JDK_TAR=$(BIN_PATH)/OpenJDK8U-jre_aarch64_linux_hotspot_8u392b08.tar.gz
DESTINATION_PATH=$(CURRENT_PATH)
VERSION=2.8.3

install:
	@echo "install tightvnc"
	mkdir -p $(DESTINATION_PATH)/usr/java/vncviewer
	cp $(TIGHTVNC_JAR) $(DESTINATION_PATH)/usr/java/vncviewer/tightvnc-jviewer.jar
	cp ${TOOLS_PATH}/start_*.sh $(DESTINATION_PATH)/usr/bin/
	cp ${TOOLS_PATH}/vnc-env.sh $(DESTINATION_PATH)/etc/profile.d/
	cp ${RES_PATH}/tightvnc_icon.png $(DESTINATION_PATH)/usr/share/icons/hicolor/24x24/apps/
	tar zxf $(JDK_TAR) -C $(DESTINATION_PATH)/usr/java/
	mkdir -p $(DESTINATION_PATH)/usr/share/common-licenses/vncviewer
	mkdir -p $(DESTINATION_PATH)/usr/share/common-licenses/java
	cp ${CURRENT_PATH}/LICENSE.txt $(DESTINATION_PATH)/usr/share/common-licenses/vncviewer
	cp ${CURRENT_PATH}/STATEMENT.txt $(DESTINATION_PATH)/usr/share/common-licenses/vncviewer
	cp $(DESTINATION_PATH)/usr/java/jdk8u392-b08-jre/LICENSE $(DESTINATION_PATH)/usr/share/common-licenses/java
	cp $(DESTINATION_PATH)/usr/java/jdk8u392-b08-jre/NOTICE $(DESTINATION_PATH)/usr/share/common-licenses/java

create-sbom: clean-sbom
	cd bin && sbom-tool generate -b . -bc . -pn tightvnc-jviewer -pv $(VERSION) -ps Advantech -nsb "https://github.com/Advantech-IIoT"
	cp bin/_manifest/spdx_2.2/manifest.spdx.json $(DESTINATION_PATH)/../../scripts/out/sbom/tightvnc-jviewer.manifest.spdx.json

clean-sbom:
	rm -rf bin/_manifest
