SUMMARY = "An image with all videogame emulators enabled"

LICENSE = "MIT" 

CORE_IMAGE_EXTRA_INSTALL += " \
    stella \
    snes9x \
    snes9x-sdl \
    "

inherit core-image 
