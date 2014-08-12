SUMMARY = "Multi-platform Super Nintendo emulator"
HOMEPAGE = "http://www.snes9x.com/" 
SECTION = "emulators"

LICENSE = "GPLv2 & LGPLv2.1" 
LIC_FILES_CHKSUM = "file://../docs/snes9x-license.txt;md5=2990ee23aa20730e9a67366f467e0991 \
                    file://../docs/gpl-2.0.txt;md5=751419260aa954499f7abaabaa882bbe \
                    file://../docs/lgpl-2.1.txt;md5=243b725d71bb5df4a1e5920b344b86ad" 

SRC_URI = "http://files.ipherswipsite.com/snes9x/snes9x-${PV}-src.tar.bz2 \
           file://cross_compile.patch;striplevel=2"

SRC_URI[md5sum] = "69ec1743a1da7de7b5d55a43b0e2ed10"
SRC_URI[sha256sum] = "9f7c5d2d0fa3fe753611cf94e8879b73b8bb3c0eab97cdbcb6ab7376efa78dc3"

S = "${WORKDIR}/snes9x-${PV}-src/unix"

inherit autotools

do_install() {
    install -d ${D}${bindir}
    install -m 0755 snes9x ${D}${bindir}
}
