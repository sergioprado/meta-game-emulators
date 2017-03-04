FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_rpi = " \
            file://0001-rpi-framebuffer-fixes-from-pssc-https-github.com-ras.patch \
            file://0002-added-dispmanx-support-to-sdl-enabled-by-changing-en.patch \
            file://0003-added-missing-n.patch \
            file://0004-only-initialise-once-SetVideoMode-can-be-called-mult.patch \
            file://0005-should-be-0-not-NULL.patch \
              "

CFLAGS_append_rpi = " -I=/usr/include/interface/vcos/pthreads/ -I=/usr/include/interface/vmcs_host/linux/ "

DEPENDS_rpi = "userland"

EXTRA_OECONF += "--enable-video-fbcon"
