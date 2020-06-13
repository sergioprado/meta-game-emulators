SUMMARY = "Portable Super Nintendo Entertainment System (TM) emulator (SDL version)"
HOMEPAGE = "https://github.com/domaemon/snes9x-sdl"
SECTION = "emulators"

LICENSE = "GPLv2 & LGPLv2.1 & Snes9x"
LIC_FILES_CHKSUM = "\
                    file://../docs/snes9x-license.txt;md5=2990ee23aa20730e9a67366f467e0991 \
                    file://../docs/gpl-2.0.txt;md5=751419260aa954499f7abaabaa882bbe \
                    file://../docs/lgpl-2.1.txt;md5=243b725d71bb5df4a1e5920b344b86ad \
                    "

SRC_URI = "\
           git://github.com/domaemon/snes9x-sdl.git \
           file://0001-Fix-cross-compilation-issues.patch;patchdir=${WORKDIR}/git \
           "

SRCREV = "59d68a2c2ed8cb7266c689e704a1d843961ac6bc"

S = "${WORKDIR}/git/sdl"

DEPENDS = "virtual/libsdl libpng"

inherit autotools-brokensep pkgconfig

do_install() {
    install -d ${D}${bindir}
    install -m 0755 snes9x-sdl ${D}${bindir}
}
