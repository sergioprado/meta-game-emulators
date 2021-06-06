SUMMARY = "AdvanceMame Arcade emulator"
HOMEPAGE = "https://www.advancemame.it/"
SECTION = "emulators"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "\
           git://github.com/amadvance/${BPN}.git \
           "

SRCREV = "384e646234d17b01f89a0e3b38cfdea770d1a1d2"

PV = "3.9+git${SRCPV}"

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

# we need to override do_install because the install target fails if DESTDIR is passed
do_install() {
    oe_runmake install
}
