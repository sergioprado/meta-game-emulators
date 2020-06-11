SUMMARY = "A multi-platform Atari 2600 VCS emulator"
HOMEPAGE = "https://stella-emu.github.io/"
SECTION = "emulators"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = " \
    file://License.txt;md5=878e3965c7b52d85827c75f5a2f3b314 \
    file://Copyright.txt;md5=51ec425b40cfb8f9c2d8455c0ac3a4f9 \
    "

SRC_URI = " \
    git://github.com/stella-emu/${BPN}.git;branch=release/6.2 \
    file://0001-Use-pkg-config-instead-of-sdl2-config.patch \
    "

S = "${WORKDIR}/git"

SRCREV = "468f6657ae457c0a2a60b3bebf84d7e5d5383b7e"

DEPENDS = "virtual/libsdl2 zlib libpng"

FILES_${PN} += "${datadir}/icons"

inherit pkgconfig autotools-brokensep
