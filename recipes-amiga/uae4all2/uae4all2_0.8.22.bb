SUMMARY = "A fast and optimized Amiga Emulator"
HOMEPAGE = "https://github.com/lubomyr/uae4all2"
SECTION = "emulators"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://copying;md5=0636e73ff0215e8d672dc4c32c317bb3"

SRC_URI = "git://github.com/lubomyr/uae4all2 \
           file://Makefile"

SRCREV = "0f919a32b6d41a04cbc766c0e6076cda9fa7a63b"

S = "${WORKDIR}/git"

DEPENDS = "libsdl libsdl-image libsdl-ttf libsdl-gfx guichan zlib libpng"

EXTRA_OEMAKE = ""

TARGET_CC_ARCH += "${LDFLAGS}"

do_configure_prepend() {
    cp ${WORKDIR}/Makefile ${S}/
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 uae4all ${D}${bindir}/
}

