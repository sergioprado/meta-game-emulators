SUMMARY = "Command-line-driven multi-system emulator using OpenGL and SDL"
HOMEPAGE = "http://mednafen.sourceforge.net/"
SECTION = "emulators"

LICENSE = "GPLv2" 
LIC_FILES_CHKSUM = "file://COPYING;md5=6e233eda45c807aa29aeaa6d94bc48a2"

SRC_URI = "${SOURCEFORGE_MIRROR}/mednafen/mednafen-${PV}.tar.bz2 \
           file://fix_configure_errors.patch \
           file://fix_sdl_flags_error.patch \
           file://fix_cast_compiler_error.patch \
          "

SRC_URI[md5sum] = "ad8d2bea9dd3ae85c8c380c2cd031632"
SRC_URI[sha256sum] = "10c5e6ba0d822cf2e5aaa236ca86e6ec489a56043530ba3fdc20f70929e738e8"

S = "${WORKDIR}/mednafen"

# large file support was generating a cross-compiling issue where sizeof(off_t) was 
# returning 64 instead of 32, so we are disabling it for now
EXTRA_OECONF += "--disable-largefile"

inherit autotools-brokensep gettext

DEPENDS = "libsdl jack libsndfile1"
