SUMMARY = "AdvanceMame Arcade emulator"
HOMEPAGE = "https://www.advancemame.it/"
SECTION = "emulators"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "\
           git://github.com/amadvance/${BPN}.git \
           "

SRCREV = "0a22846ccddfbd7a8220614661b546dfbca2b65a"

S = "${WORKDIR}/git"

DEPENDS = "virtual/libsdl2 alsa-lib ncurses freetype zlib expat"

EXTRA_OECONF = "\
                --prefix=${D}${prefix} \
                --exec-prefix=${D}${exec_prefix} \
                --bindir=${D}${bindir} \
                --datadir=${D}${datadir} \
                --sysconfdir=${D}${sysconfdir} \
                "

FILES_${PN} += "${datadir}/advance/*"
FILES_${PN}-doc += "${prefix}/doc/* ${prefix}/man/*"

# disable treating -Wformat-security as error
SECURITY_STRINGFORMAT = ""

inherit autotools-brokensep pkgconfig

do_configure_prepend() {
    # Upstream doesn't ship this and autoreconf won't install it as automake isn't used.
    cp -f $(automake --print-libdir)/install-sh ${S}/
}
