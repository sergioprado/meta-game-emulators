require recipes-core/images/core-image-minimal.bb

SUMMARY = "Minimal image with all emulators enabled"

LICENSE = "MIT"

CORE_IMAGE_EXTRA_INSTALL += " \
    stella \
    advancemame \
    mednafen \
    snes9x \
    snes9x-sdl \
    "
