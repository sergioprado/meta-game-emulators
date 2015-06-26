DESCRIPTION = "SDL graphics drawing primitives and other support functions."
SECTION = "libs"

LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d1de21f0b70830e299905eac3419084"

DEPENDS = "virtual/libsdl"

DEPENDS_append_rpi = " virtual/libgles2 virtual/egl"

SRC_URI = "http://www.ferzkopp.net/Software/SDL_gfx-2.0/SDL_gfx-${PV}.tar.gz \
           file://pkg.m4"

SRC_URI[md5sum] = "ea24ed4b82ff1304809c363494fa8e16"
SRC_URI[sha256sum] = "556eedc06b6cf29eb495b6d27f2dcc51bf909ad82389ba2fa7bdc4dec89059c0"

S = "${WORKDIR}/SDL_gfx-${PV}"

inherit autotools

EXTRA_OECONF += "SDL_CONFIG=${STAGING_BINDIR_CROSS}/sdl-config --disable-mmx"

do_configure_prepend() {
        cp ${WORKDIR}/pkg.m4 ${S}/m4/
}
