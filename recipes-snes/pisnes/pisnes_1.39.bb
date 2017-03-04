SUMMARY = "Multi-platform Super Nintendo emulator for the Raspberry Pi (based on SNES9X 1.39)."
HOMEPAGE = "http://sourceforge.net/projects/pisnes/"
SECTION = "emulators"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://copyright.h;md5=3a4f359300f60eb6bc02db9db398af0a"

SRC_URI = "git://git.code.sf.net/p/pisnes/code \
           file://cross_compile.patch"

SRCREV = "0830b52a923a84478a48356d9083ec8be69648fe"

S = "${WORKDIR}/git"

DEPENDS = "glib-2.0 libsdl zlib virtual/egl"

EXTRA_OEMAKE=""

do_install() {
    install -d ${D}${bindir}
    install -m 0755 snes9x ${D}${bindir}/pisnes
    install -m 0755 snes9x.gui ${D}${bindir}/pisnes.gui
}

COMPATIBLE_MACHINE = "rpi"
