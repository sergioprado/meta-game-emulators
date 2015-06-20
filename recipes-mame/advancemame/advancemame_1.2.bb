DESCRIPTION = "AdvanceMame Arcade emulator"
LICENSE = "GPLv2"
RDEPENDS_${PN} = "libsdl alsa-lib ncurses-terminfo zlib expat"
DEPENDS = "libsdl"
INC_PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/advancemame/advancemame-${PV}.tar.gz \
           file://remove-obsolete-configure-ac-settings.patch \		
           file://advance-mak-fix-missing-destdir.patch \
           file://fix-man-doc-dirs-location-hardcoded.patch \
           file://convert-to-pkgconfig.patch \
	  "

inherit autotools pkgconfig

SRC_URI[md5sum] = "ef0cfd38e7c8859bc03ada60f51295c6"
SRC_URI[sha256sum] = "eaf46e54f0cb5fa1d99f55604a4a3f8a065c1cf5e70ac4abc67391b0450ce439"

LIC_FILES_CHKSUM = "file://COPYING;md5=169852a41700b05bd1fa2ca7422c81f1"

CFLAGS =+ " -I${STAGING_INCDIR}/SDL/ -I${STAGING_INCDIR}/freetype2/ "
LDFLAGS =+ " -lSDL "


EXTRA_OECONF = " \
                 --docdir=${docdir}/advance/ \
               "

FILES_${PN} += "${datadir}/advance/* \
                     "

