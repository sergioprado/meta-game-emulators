SUMMARY = "Simple DirectMedia Layer Test Applications"
DESCRIPTION = "Simple DirectMedia Layer is a cross-platform multimedia \
library designed to provide low level access to audio, keyboard, mouse, \
joystick, 3D hardware via OpenGL, and 2D video framebuffer."
HOMEPAGE = "http://www.libsdl.org"
BUGTRACKER = "http://bugzilla.libsdl.org/"

SECTION = "tests"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=77604414711055c1393ef261e94e5855"

DEPENDS = "libsdl"

SRC_URI = "http://www.libsdl.org/release/SDL-${PV}.tar.gz \
           file://configure_fix.patch;striplevel=2"

S = "${WORKDIR}/SDL-${PV}/test"

SRC_URI[md5sum] = "9d96df8417572a2afb781a7c4c811a85"
SRC_URI[sha256sum] = "d6d316a793e5e348155f0dd93b979798933fb98aa1edebcc108829d6474aad00"

TARGET_CC_ARCH += "${LDFLAGS}"

inherit autotools

do_install() {

    SDL_TESTS_APPS="checkkeys graywin loopwave testalpha testbitmap testblitspeed \
    testcdrom testcursor testdyngl testerror testfile testgamma testgl testhread \
    testiconv testjoystick testkeys testloadso testlock testoverlay testoverlay2 \
    testpalette testplatform testsem testsprite testtimer testver testvidinfo \
    testwin testwm threadwin torturethread"

    SDL_TESTS_APPS_FILES="icon.bmp moose.dat picture.xbm sail.bmp sample.bmp \
    sample.wav utf8.txt"

    install -d ${D}${libexecdir}
    for f in $SDL_TESTS_APPS; do
        install -m 0755 $f ${D}${libexecdir}
    done
    for f in $SDL_TESTS_APPS_FILES; do
        install -m 0644 ${S}/$f ${D}${libexecdir}
    done
}
