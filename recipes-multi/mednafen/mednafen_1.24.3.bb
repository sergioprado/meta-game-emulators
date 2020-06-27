SUMMARY = "Mednafen is a portable, command line driven multi-system emulator"
HOMEPAGE = "https://mednafen.github.io/"
SECTION = "emulators"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "\
           https://mednafen.github.io/releases/files/${BPN}-${PV}.tar.xz \
	   file://0001-Fix-error-when-building-with-intl-support.patch \
           "

SRC_URI[md5sum] = "a7e1ab14c970541369ac57e857c544fd"
SRC_URI[sha256sum] = "3dea853f784364557fa59e9ba11a17eb2674fc0fb93205f33bdbdaba1da3f70f"

S = "${WORKDIR}/mednafen"

DEPENDS = "zlib alsa-lib pkgconfig jack libsndfile1 virtual/libsdl2"

inherit autotools-brokensep pkgconfig gettext
