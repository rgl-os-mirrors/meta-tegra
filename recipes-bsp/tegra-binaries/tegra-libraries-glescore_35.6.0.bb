L4T_DEB_COPYRIGHT_MD5 = "d3617777039321a257aef01439341b02"
DEPENDS = "tegra-libraries-core tegra-libraries-eglcore"

L4T_DEB_TRANSLATED_BPN = "nvidia-l4t-3d-core"

require tegra-debian-libraries-common.inc

MAINSUM = "e4448e39255b6bac877217f404330e83a6797771c817b5e11a6d48921024b152"

TEGRA_LIBRARIES_TO_INSTALL = "\
    tegra-egl/libGLESv1_CM_nvidia.so.1 \
    tegra-egl/libGLESv2_nvidia.so.2 \
"