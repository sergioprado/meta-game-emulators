SUMMARY = "A base image to compile emulators"

LICENSE = "MIT"

CORE_IMAGE_EXTRA_INSTALL += " \
    alsa-utils \
    tslib-calibrate \
    "

inherit core-image
