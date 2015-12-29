require core-image-emulators-base.bb

SUMMARY = "An image with all videogame emulators enabled"

LICENSE = "MIT" 

CORE_IMAGE_EXTRA_INSTALL += " \
    snes9x \
    snes9x-sdl \
    advancemame \
    stella \
    uae4all2 \
    mednafen \
    "
