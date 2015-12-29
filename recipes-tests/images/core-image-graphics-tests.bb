require core-image-emulators-base.bb

SUMMARY = "An image with audio, video and input test tools"

LICENSE = "MIT" 

CORE_IMAGE_EXTRA_INSTALL += " \
    libsdl-tests \
    evtest \
    tslib-tests \
    strace \
    "
