SUMMARY = "SRP Platform image"

IMAGE_INSTALL = "packagegroup-core-boot packagegroup-core-ssh-openssh \
                 kernel-modules \
                 libstdc++ \
                 srp-qemu \
                 srp-user \
                 srp-recover \
"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "800000"
DISTRO = "poky" 
