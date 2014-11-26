SUMMARY = "An image with audio, video and input test tools"

LICENSE = "MIT" 

CORE_IMAGE_EXTRA_INSTALL += " \
    libsdl-tests \
    alsa-utils \
    evtest \
    tslib-calibrate \
    tslib-tests \
    strace \
    "

inherit core-image 
