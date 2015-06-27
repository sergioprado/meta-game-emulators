SUMMARY = "MAME emulator for Raspberry Pi"
HOMEPAGE = "http://sourceforge.net/projects/mame4allpi"
SECTION = "emulators"

LICENSE = "MAME" 
LIC_FILES_CHKSUM = "file://readme.txt;beginline=267;endline=285;md5=dbb667bc0aea29078fee15f1c8b3a686"

SRC_URI = "git://git.code.sf.net/p/mame4allpi/code \
           file://cross_compile.patch"

SRCREV = "3a7ba921ad7118b31080ce12a151c84ac4e1145f"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "raspberrypi|raspberrypi2"

DEPENDS = "libsdl virtual/libgles2 virtual/egl glib-2.0"

FILES_${PN} += "${datadir}/mame4allpi/*"

EXTRA_OEMAKE=""

do_install() {
    install -d ${D}${bindir}
    install -m 0755 mame ${D}${bindir}/mame4allpi

    install -d ${D}${datadir}/mame4allpi/skins
    install -m 0664 skins/rpimenu16.bmp ${D}${datadir}/mame4allpi/skins
    install -m 0664 skins/rpisplash16.bmp ${D}${datadir}/mame4allpi/skins
}
