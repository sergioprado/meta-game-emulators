SUMMARY = "Multi-platform Super Nintendo emulator (snes9x rewrite for Raspberry Pi Based on palerider's snes9x-rpi version)"
HOMEPAGE = "https://github.com/RetroPie/snes9x-rpi"
SECTION = "emulators"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://copyright.h;md5=3a4f359300f60eb6bc02db9db398af0a"

SRC_URI = "git://github.com/RetroPie/snes9x-rpi \
           file://cross_compile.patch"

SRCREV = "bdb545fd840b98b9cd2a15c0ab227cb9557a0b67"

S = "${WORKDIR}/git"

DEPENDS = "boost libsdl libsdl-ttf zlib"

EXTRA_OEMAKE=""

do_install() {
    install -d ${D}${bindir}
    install -m 0755 snes9x ${D}${bindir}/snes9x-rpi
}
