SUMMARY = "Portable Super Nintendo Entertainment System (TM) emulator (snes9x rewrite for Raspberry Pi Based on palerider's snes9x-rpi version)"
HOMEPAGE = "https://github.com/RetroPie/snes9x-rpi"
SECTION = "emulators"

LICENSE = "GPLv2 & Snes9x"
LIC_FILES_CHKSUM = "file://copyright.h;md5=3a4f359300f60eb6bc02db9db398af0a"

SRC_URI = "\
           git://github.com/RetroPie/snes9x-rpi \
           file://0001-Fix-cross-compilation-issues.patch \
           file://0002-Fix-cerr-is-not-a-member-of-std-error.patch \
           "

SRCREV = "95579fb9cadbccfd2de7f73ed737d704c11fc871"

S = "${WORKDIR}/git"

PV = "v0.2+git${SRCPV}"

DEPENDS = "zlib boost virtual/libsdl libsdl-ttf"

do_install() {
    install -d ${D}${sbindir}
    install -m 0755 snes9x ${D}${sbindir}/snes9x-rpi
}
