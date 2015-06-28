DESCRIPTION = "AdvanceMame Arcade emulator"
LICENSE = "GPLv2"
RDEPENDS_${PN} = "libsdl alsa-lib ncurses-terminfo zlib expat"
DEPENDS = "libsdl"
INC_PR = "r1"

SRC_URI = "${SOURCEFORGE_MIRROR}/advancemame/advancemenu-${PV}.tar.gz \
           file://remove-obsolete-configure-ac-settings.patch \		
           file://advance-mak-fix-missing-destdir.patch \
           file://fix-man-doc-dirs-location-hardcoded.patch \
           file://convert-to-pkgconfig.patch \
	  "

inherit autotools pkgconfig

SRC_URI[md5sum] = "554bf0fd05648db57080d71d59b104ec"
SRC_URI[sha256sum] = "b591f85c9785997f113643f3b3e202ea849888f12553cd622ded83499301f5f5"

LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

CFLAGS =+ " -I${STAGING_INCDIR}/SDL/ -I${STAGING_INCDIR}/freetype2/ "
LDFLAGS =+ " -lSDL "


#Remove advv and cfg makefile because they are built by advancemame and will conflict with that package.
do_configure_prepend() {
    rm ${S}/advance/v.mak
    rm ${S}/advance/cfg.mak
}

EXTRA_OECONF = " \
                 --docdir=${docdir}/advance/ \
               "

FILES_${PN} += "${datadir}/advance \
                     "

