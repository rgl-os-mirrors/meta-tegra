require cuda-shared-binaries.inc

MAINSUM = "3ff5d9c20e8cf1b8fd36841271846f2d2de23aaca9bf2e9213d5dac8e6488693"
MAINSUM:x86-64 = "33091bbc1a2f89e51ca52be693d8d815f70e53ae2cff3a607f58089b2d5eeea1"
DEVSUM = "8125eeb5502d569a19f8bf8c54fd455c2a4a722f3c571e02bfe8c6bdd3d6e800"
DEVSUM:x86-64 = "61c47de6c83944f1b2484087b909afd25c9b06d8ab3c30b1c210a111b6eef059"

EXCLUDE_PACKAGES_FROM_SHLIBS = ""
PRIVATE_LIBS:${PN}-stubs = "libcublas.so.12 libcublasLt.so.12"

BBCLASSEXTEND = "native nativesdk"
