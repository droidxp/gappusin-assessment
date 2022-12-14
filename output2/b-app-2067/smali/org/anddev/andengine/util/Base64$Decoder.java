class org.anddev.andengine.util.Base64$Decoder extends org.anddev.andengine.util.Base64$Coder {
	 /* # static fields */
	 private static final DECODE;
	 private static final DECODE_WEBSAFE;
	 private static final Integer EQUALS;
	 private static final Integer SKIP;
	 /* # instance fields */
	 private final alphabet;
	 private Integer state;
	 private Integer value;
	 /* # direct methods */
	 static org.anddev.andengine.util.Base64$Decoder ( ) {
		 /* .locals 8 */
		 int v7 = 4; // const/4 v7, 0x4
		 int v6 = 3; // const/4 v6, 0x3
		 int v5 = 2; // const/4 v5, 0x2
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = -1; // const/4 v3, -0x1
		 /* const/16 v0, 0x100 */
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput v3, v0, v1 */
		 /* aput v3, v0, v4 */
		 /* aput v3, v0, v5 */
		 /* aput v3, v0, v6 */
		 /* aput v3, v0, v7 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* aput v3, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 /* aput v3, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x10 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x11 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x12 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x13 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x14 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x15 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x16 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x17 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x18 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x19 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x20 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x21 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x22 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x23 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x24 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x25 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x26 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x27 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x28 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x29 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2b */
		 /* const/16 v2, 0x3e */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x2c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2f */
		 /* const/16 v2, 0x3f */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x30 */
		 /* const/16 v2, 0x34 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x31 */
		 /* const/16 v2, 0x35 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x32 */
		 /* const/16 v2, 0x36 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x33 */
		 /* const/16 v2, 0x37 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x34 */
		 /* const/16 v2, 0x38 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x35 */
		 /* const/16 v2, 0x39 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x36 */
		 /* const/16 v2, 0x3a */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x37 */
		 /* const/16 v2, 0x3b */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x38 */
		 /* const/16 v2, 0x3c */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x39 */
		 /* const/16 v2, 0x3d */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x3a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x3b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x3c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x3d */
		 int v2 = -2; // const/4 v2, -0x2
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x3e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x3f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x40 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x42 */
		 /* aput v4, v0, v1 */
		 /* const/16 v1, 0x43 */
		 /* aput v5, v0, v1 */
		 /* const/16 v1, 0x44 */
		 /* aput v6, v0, v1 */
		 /* const/16 v1, 0x45 */
		 /* aput v7, v0, v1 */
		 /* const/16 v1, 0x46 */
		 int v2 = 5; // const/4 v2, 0x5
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x47 */
		 int v2 = 6; // const/4 v2, 0x6
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x48 */
		 int v2 = 7; // const/4 v2, 0x7
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x49 */
		 /* const/16 v2, 0x8 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4a */
		 /* const/16 v2, 0x9 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4b */
		 /* const/16 v2, 0xa */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4c */
		 /* const/16 v2, 0xb */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4d */
		 /* const/16 v2, 0xc */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4e */
		 /* const/16 v2, 0xd */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4f */
		 /* const/16 v2, 0xe */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x50 */
		 /* const/16 v2, 0xf */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x51 */
		 /* const/16 v2, 0x10 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x52 */
		 /* const/16 v2, 0x11 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x53 */
		 /* const/16 v2, 0x12 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x54 */
		 /* const/16 v2, 0x13 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x55 */
		 /* const/16 v2, 0x14 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x56 */
		 /* const/16 v2, 0x15 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x57 */
		 /* const/16 v2, 0x16 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x58 */
		 /* const/16 v2, 0x17 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x59 */
		 /* const/16 v2, 0x18 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x5a */
		 /* const/16 v2, 0x19 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x5b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x5c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x5d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x5e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x5f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x60 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x61 */
		 /* const/16 v2, 0x1a */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x62 */
		 /* const/16 v2, 0x1b */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x63 */
		 /* const/16 v2, 0x1c */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x64 */
		 /* const/16 v2, 0x1d */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x65 */
		 /* const/16 v2, 0x1e */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x66 */
		 /* const/16 v2, 0x1f */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x67 */
		 /* const/16 v2, 0x20 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x68 */
		 /* const/16 v2, 0x21 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x69 */
		 /* const/16 v2, 0x22 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6a */
		 /* const/16 v2, 0x23 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6b */
		 /* const/16 v2, 0x24 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6c */
		 /* const/16 v2, 0x25 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6d */
		 /* const/16 v2, 0x26 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6e */
		 /* const/16 v2, 0x27 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6f */
		 /* const/16 v2, 0x28 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x70 */
		 /* const/16 v2, 0x29 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x71 */
		 /* const/16 v2, 0x2a */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x72 */
		 /* const/16 v2, 0x2b */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x73 */
		 /* const/16 v2, 0x2c */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x74 */
		 /* const/16 v2, 0x2d */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x75 */
		 /* const/16 v2, 0x2e */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x76 */
		 /* const/16 v2, 0x2f */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x77 */
		 /* const/16 v2, 0x30 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x78 */
		 /* const/16 v2, 0x31 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x79 */
		 /* const/16 v2, 0x32 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x7a */
		 /* const/16 v2, 0x33 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x7b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x7c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x7d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x7e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x7f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x80 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x81 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x82 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x83 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x84 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x85 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x86 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x87 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x88 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x89 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x90 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x91 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x92 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x93 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x94 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x95 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x96 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x97 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x98 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x99 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xaa */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xab */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xac */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xad */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xae */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xaf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xba */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbe */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xca */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xcb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xcc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xcd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xce */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xcf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xda */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xdb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xdc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xdd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xde */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xdf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xea */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xeb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xec */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xed */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xee */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xef */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfa */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfe */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xff */
		 /* aput v3, v0, v1 */
		 /* const/16 v0, 0x100 */
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput v3, v0, v1 */
		 /* aput v3, v0, v4 */
		 /* aput v3, v0, v5 */
		 /* aput v3, v0, v6 */
		 /* aput v3, v0, v7 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* aput v3, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 /* aput v3, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x10 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x11 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x12 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x13 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x14 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x15 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x16 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x17 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x18 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x19 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x1f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x20 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x21 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x22 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x23 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x24 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x25 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x26 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x27 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x28 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x29 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2d */
		 /* const/16 v2, 0x3e */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x2e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x2f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x30 */
		 /* const/16 v2, 0x34 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x31 */
		 /* const/16 v2, 0x35 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x32 */
		 /* const/16 v2, 0x36 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x33 */
		 /* const/16 v2, 0x37 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x34 */
		 /* const/16 v2, 0x38 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x35 */
		 /* const/16 v2, 0x39 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x36 */
		 /* const/16 v2, 0x3a */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x37 */
		 /* const/16 v2, 0x3b */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x38 */
		 /* const/16 v2, 0x3c */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x39 */
		 /* const/16 v2, 0x3d */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x3a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x3b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x3c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x3d */
		 int v2 = -2; // const/4 v2, -0x2
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x3e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x3f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x40 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x42 */
		 /* aput v4, v0, v1 */
		 /* const/16 v1, 0x43 */
		 /* aput v5, v0, v1 */
		 /* const/16 v1, 0x44 */
		 /* aput v6, v0, v1 */
		 /* const/16 v1, 0x45 */
		 /* aput v7, v0, v1 */
		 /* const/16 v1, 0x46 */
		 int v2 = 5; // const/4 v2, 0x5
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x47 */
		 int v2 = 6; // const/4 v2, 0x6
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x48 */
		 int v2 = 7; // const/4 v2, 0x7
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x49 */
		 /* const/16 v2, 0x8 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4a */
		 /* const/16 v2, 0x9 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4b */
		 /* const/16 v2, 0xa */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4c */
		 /* const/16 v2, 0xb */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4d */
		 /* const/16 v2, 0xc */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4e */
		 /* const/16 v2, 0xd */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x4f */
		 /* const/16 v2, 0xe */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x50 */
		 /* const/16 v2, 0xf */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x51 */
		 /* const/16 v2, 0x10 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x52 */
		 /* const/16 v2, 0x11 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x53 */
		 /* const/16 v2, 0x12 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x54 */
		 /* const/16 v2, 0x13 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x55 */
		 /* const/16 v2, 0x14 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x56 */
		 /* const/16 v2, 0x15 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x57 */
		 /* const/16 v2, 0x16 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x58 */
		 /* const/16 v2, 0x17 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x59 */
		 /* const/16 v2, 0x18 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x5a */
		 /* const/16 v2, 0x19 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x5b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x5c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x5d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x5e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x5f */
		 /* const/16 v2, 0x3f */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x60 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x61 */
		 /* const/16 v2, 0x1a */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x62 */
		 /* const/16 v2, 0x1b */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x63 */
		 /* const/16 v2, 0x1c */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x64 */
		 /* const/16 v2, 0x1d */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x65 */
		 /* const/16 v2, 0x1e */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x66 */
		 /* const/16 v2, 0x1f */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x67 */
		 /* const/16 v2, 0x20 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x68 */
		 /* const/16 v2, 0x21 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x69 */
		 /* const/16 v2, 0x22 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6a */
		 /* const/16 v2, 0x23 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6b */
		 /* const/16 v2, 0x24 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6c */
		 /* const/16 v2, 0x25 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6d */
		 /* const/16 v2, 0x26 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6e */
		 /* const/16 v2, 0x27 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x6f */
		 /* const/16 v2, 0x28 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x70 */
		 /* const/16 v2, 0x29 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x71 */
		 /* const/16 v2, 0x2a */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x72 */
		 /* const/16 v2, 0x2b */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x73 */
		 /* const/16 v2, 0x2c */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x74 */
		 /* const/16 v2, 0x2d */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x75 */
		 /* const/16 v2, 0x2e */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x76 */
		 /* const/16 v2, 0x2f */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x77 */
		 /* const/16 v2, 0x30 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x78 */
		 /* const/16 v2, 0x31 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x79 */
		 /* const/16 v2, 0x32 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x7a */
		 /* const/16 v2, 0x33 */
		 /* aput v2, v0, v1 */
		 /* const/16 v1, 0x7b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x7c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x7d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x7e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x7f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x80 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x81 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x82 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x83 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x84 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x85 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x86 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x87 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x88 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x89 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x8f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x90 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x91 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x92 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x93 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x94 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x95 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x96 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x97 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x98 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x99 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9a */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9b */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9c */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9d */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9e */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0x9f */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xa9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xaa */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xab */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xac */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xad */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xae */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xaf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xb9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xba */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbe */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xbf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xc9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xca */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xcb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xcc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xcd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xce */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xcf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xd9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xda */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xdb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xdc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xdd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xde */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xdf */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xe9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xea */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xeb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xec */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xed */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xee */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xef */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf0 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf1 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf2 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf3 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf4 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf5 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf6 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf7 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf8 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xf9 */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfa */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfb */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfc */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfd */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xfe */
		 /* aput v3, v0, v1 */
		 /* const/16 v1, 0xff */
		 /* aput v3, v0, v1 */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.Base64$Decoder ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/Base64$Coder;-><init>()V */
		 this.output = p2;
		 /* and-int/lit8 v0, p1, 0x8 */
		 /* if-nez v0, :cond_0 */
		 v0 = org.anddev.andengine.util.Base64$Decoder.DECODE;
	 } // :goto_0
	 this.alphabet = v0;
	 /* iput v1, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
	 /* iput v1, p0, Lorg/anddev/andengine/util/Base64$Decoder;->value:I */
	 return;
} // :cond_0
v0 = org.anddev.andengine.util.Base64$Decoder.DECODE_WEBSAFE;
} // .end method
/* # virtual methods */
public Integer maxOutputSize ( Integer p0 ) {
/* .locals 1 */
/* mul-int/lit8 v0, p1, 0x3 */
/* div-int/lit8 v0, v0, 0x4 */
/* add-int/lit8 v0, v0, 0xa */
} // .end method
public Boolean process ( Object[] p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 9 */
/* iget v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v1 = 6; // const/4 v1, 0x6
/* if-ne v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* add-int v0, p3, p2 */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
/* iget v2, p0, Lorg/anddev/andengine/util/Base64$Decoder;->value:I */
int v3 = 0; // const/4 v3, 0x0
v4 = this.output;
v5 = this.alphabet;
/* move v6, v1 */
/* move v1, v3 */
/* move v3, p2 */
} // :goto_1
/* if-lt v3, v0, :cond_2 */
} // :cond_1
/* move v0, v1 */
/* move v1, v2 */
/* if-nez p4, :cond_e */
/* iput v6, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
/* iput v1, p0, Lorg/anddev/andengine/util/Base64$Decoder;->value:I */
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->op:I */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
/* if-nez v6, :cond_4 */
} // :goto_2
/* add-int/lit8 v7, v3, 0x4 */
/* if-gt v7, v0, :cond_3 */
/* aget-byte v2, p1, v3 */
/* and-int/lit16 v2, v2, 0xff */
/* aget v2, v5, v2 */
/* shl-int/lit8 v2, v2, 0x12 */
/* add-int/lit8 v7, v3, 0x1 */
/* aget-byte v7, p1, v7 */
/* and-int/lit16 v7, v7, 0xff */
/* aget v7, v5, v7 */
/* shl-int/lit8 v7, v7, 0xc */
/* or-int/2addr v2, v7 */
/* add-int/lit8 v7, v3, 0x2 */
/* aget-byte v7, p1, v7 */
/* and-int/lit16 v7, v7, 0xff */
/* aget v7, v5, v7 */
/* shl-int/lit8 v7, v7, 0x6 */
/* or-int/2addr v2, v7 */
/* add-int/lit8 v7, v3, 0x3 */
/* aget-byte v7, p1, v7 */
/* and-int/lit16 v7, v7, 0xff */
/* aget v7, v5, v7 */
/* or-int/2addr v2, v7 */
/* if-gez v2, :cond_6 */
} // :cond_3
/* if-ge v3, v0, :cond_1 */
} // :cond_4
/* add-int/lit8 v7, v3, 0x1 */
/* aget-byte v3, p1, v3 */
/* and-int/lit16 v3, v3, 0xff */
/* aget v3, v5, v3 */
/* packed-switch v6, :pswitch_data_0 */
} // :cond_5
/* move v3, v7 */
} // :cond_6
/* add-int/lit8 v7, v1, 0x2 */
/* int-to-byte v8, v2 */
/* aput-byte v8, v4, v7 */
/* add-int/lit8 v7, v1, 0x1 */
/* shr-int/lit8 v8, v2, 0x8 */
/* int-to-byte v8, v8 */
/* aput-byte v8, v4, v7 */
/* shr-int/lit8 v7, v2, 0x10 */
/* int-to-byte v7, v7 */
/* aput-byte v7, v4, v1 */
/* add-int/lit8 v1, v1, 0x3 */
/* add-int/lit8 v3, v3, 0x4 */
/* :pswitch_0 */
/* if-ltz v3, :cond_7 */
/* add-int/lit8 v2, v6, 0x1 */
/* move v6, v2 */
/* move v2, v3 */
/* move v3, v7 */
} // :cond_7
int v8 = -1; // const/4 v8, -0x1
/* if-eq v3, v8, :cond_5 */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v0 = 0; // const/4 v0, 0x0
/* :pswitch_1 */
/* if-ltz v3, :cond_8 */
/* shl-int/lit8 v2, v2, 0x6 */
/* or-int/2addr v2, v3 */
/* add-int/lit8 v3, v6, 0x1 */
/* move v6, v3 */
/* move v3, v7 */
} // :cond_8
int v8 = -1; // const/4 v8, -0x1
/* if-eq v3, v8, :cond_5 */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
/* :pswitch_2 */
/* if-ltz v3, :cond_9 */
/* shl-int/lit8 v2, v2, 0x6 */
/* or-int/2addr v2, v3 */
/* add-int/lit8 v3, v6, 0x1 */
/* move v6, v3 */
/* move v3, v7 */
/* goto/16 :goto_1 */
} // :cond_9
int v8 = -2; // const/4 v8, -0x2
/* if-ne v3, v8, :cond_a */
/* add-int/lit8 v3, v1, 0x1 */
/* shr-int/lit8 v6, v2, 0x4 */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v1 */
int v1 = 4; // const/4 v1, 0x4
/* move v6, v1 */
/* move v1, v3 */
/* move v3, v7 */
/* goto/16 :goto_1 */
} // :cond_a
int v8 = -1; // const/4 v8, -0x1
/* if-eq v3, v8, :cond_5 */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
/* :pswitch_3 */
/* if-ltz v3, :cond_b */
/* shl-int/lit8 v2, v2, 0x6 */
/* or-int/2addr v2, v3 */
/* add-int/lit8 v3, v1, 0x2 */
/* int-to-byte v6, v2 */
/* aput-byte v6, v4, v3 */
/* add-int/lit8 v3, v1, 0x1 */
/* shr-int/lit8 v6, v2, 0x8 */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v3 */
/* shr-int/lit8 v3, v2, 0x10 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v4, v1 */
/* add-int/lit8 v1, v1, 0x3 */
int v3 = 0; // const/4 v3, 0x0
/* move v6, v3 */
/* move v3, v7 */
/* goto/16 :goto_1 */
} // :cond_b
int v8 = -2; // const/4 v8, -0x2
/* if-ne v3, v8, :cond_c */
/* add-int/lit8 v3, v1, 0x1 */
/* shr-int/lit8 v6, v2, 0x2 */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v3 */
/* shr-int/lit8 v3, v2, 0xa */
/* int-to-byte v3, v3 */
/* aput-byte v3, v4, v1 */
/* add-int/lit8 v1, v1, 0x2 */
int v3 = 5; // const/4 v3, 0x5
/* move v6, v3 */
/* move v3, v7 */
/* goto/16 :goto_1 */
} // :cond_c
int v8 = -1; // const/4 v8, -0x1
/* if-eq v3, v8, :cond_5 */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
/* :pswitch_4 */
int v8 = -2; // const/4 v8, -0x2
/* if-ne v3, v8, :cond_d */
/* add-int/lit8 v3, v6, 0x1 */
/* move v6, v3 */
/* move v3, v7 */
/* goto/16 :goto_1 */
} // :cond_d
int v8 = -1; // const/4 v8, -0x1
/* if-eq v3, v8, :cond_5 */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
/* :pswitch_5 */
int v8 = -1; // const/4 v8, -0x1
/* if-eq v3, v8, :cond_5 */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
} // :cond_e
/* packed-switch v6, :pswitch_data_1 */
} // :goto_3
/* :pswitch_6 */
/* iput v6, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->op:I */
int v0 = 1; // const/4 v0, 0x1
/* goto/16 :goto_0 */
/* :pswitch_7 */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
/* :pswitch_8 */
/* add-int/lit8 v2, v0, 0x1 */
/* shr-int/lit8 v1, v1, 0x4 */
/* int-to-byte v1, v1 */
/* aput-byte v1, v4, v0 */
/* move v0, v2 */
/* :pswitch_9 */
/* add-int/lit8 v2, v0, 0x1 */
/* shr-int/lit8 v3, v1, 0xa */
/* int-to-byte v3, v3 */
/* aput-byte v3, v4, v0 */
/* add-int/lit8 v0, v2, 0x1 */
/* shr-int/lit8 v1, v1, 0x2 */
/* int-to-byte v1, v1 */
/* aput-byte v1, v4, v2 */
/* :pswitch_a */
int v0 = 6; // const/4 v0, 0x6
/* iput v0, p0, Lorg/anddev/andengine/util/Base64$Decoder;->state:I */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0x0 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_8 */
/* :pswitch_9 */
/* :pswitch_a */
} // .end packed-switch
} // .end method
