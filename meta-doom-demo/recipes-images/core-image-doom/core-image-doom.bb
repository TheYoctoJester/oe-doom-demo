SUMMARY = "Doom On Wayland"

IMAGE_FEATURES += "splash ssh-server-dropbear hwcodecs ptest-pkgs"

LICENSE = "MIT"

inherit core-image features_check

REQUIRED_DISTRO_FEATURES = "wayland"

DOOM_GAME ?= "chexquest-galactic-conflict"

CORE_IMAGE_BASE_INSTALL += "\
    kernel-modules \
    zdoom-autolaunch \
    weston \
    weston-init \
    ${DOOM_GAME} \
    "
