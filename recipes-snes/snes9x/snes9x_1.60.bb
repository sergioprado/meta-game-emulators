SUMMARY = "Portable Super Nintendo Entertainment System (TM) emulator"
HOMEPAGE = "http://www.snes9x.com/"
SECTION = "emulators"

LICENSE = "GPLv2 & GPLv3 & LGPLv2.1 & Snes9x"
LIC_FILES_CHKSUM = " \
    file://../LICENSE;md5=67f2d33d40332031b2f10beb78eac382 \
    file://../jma/license.txt;md5=86ecd516a6a0002a9d0db93c8bac0f07 \
    file://../filter/snes_ntsc-license.txt;md5=fbc093901857fcd118f065f900982c24 \
    file://../filter/xbrz-license.txt;md5=9eef91148a9b14ec7f9df333daebc746 \
    "

SRC_URI = " \
    git://github.com/snes9xgit/${BPN}.git \
    file://0001-Fix-cross-compilation-issues.patch;patchdir=${WORKDIR}/git \
    "

S = "${WORKDIR}/git/unix"

SRCREV = "913b75d07c6e8d54e966e2c4a79d7c55428007df"

DEPENDS = "zlib virtual/libx11 libxv libpng libxinerama"

inherit autotools-brokensep pkgconfig

do_install() {
    install -d ${D}${bindir}
    install -m 0755 snes9x ${D}${bindir}
}
