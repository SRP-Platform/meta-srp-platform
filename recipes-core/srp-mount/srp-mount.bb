DESCRIPTION = "SRP Initscripts"
LICENSE = "CLOSED" 
 
SRC_URI += "\
    file://srp-mount.sh \
"
 
INITSCRIPT_NAME = "srp-mount.sh" 
INITSCRIPT_PARAMS = "start 4 S ." 
 
inherit update-rc.d 
 
S = "${UNPACKDIR}" 
 
do_install () { 
    install -d ${D}${sysconfdir}/init.d/ 
    install -c -m 755 ${UNPACKDIR}/${INITSCRIPT_NAME} ${D}${sysconfdir}/init.d/${INITSCRIPT_NAME} 
} 

DEPENDS = "bash"

RDEPENDS:${PN} = "bash"
