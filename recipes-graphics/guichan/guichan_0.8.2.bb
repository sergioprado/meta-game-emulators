SUMMARY = "Guichan is a C++ GUI library designed for games."
HOMEPAGE = "http://guichan.sourceforge.net"
SECTION = "libs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=42944e670bc8ebf3eed9929739cc39db"

SRC_URI = "git://gitorious.org/guichan/mainline.git;protocol=https \
           file://configure_sdl.patch \
           file://fixes-crash-no-focushandler-set.patch"

SRCREV = "fc9e3a0f76fbab229af457f0f113159425c27fcf"

S = "${WORKDIR}/git"

DEPENDS = "libsdl libsdl-gfx"

EXTRA_OECONF += "--enable-force-sdl"

inherit autotools pkgconfig
