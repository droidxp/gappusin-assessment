public class com.nobleempire.GunDisassembly2.util.Base64 {
	 /* .source "Base64.java" */
	 /* # static fields */
	 static final Boolean $assertionsDisabled; //synthetic
	 private static final ALPHABET;
	 private static final DECODABET;
	 public static final Boolean DECODE;
	 public static final Boolean ENCODE;
	 private static final Object EQUALS_SIGN;
	 private static final Object EQUALS_SIGN_ENC;
	 private static final Object NEW_LINE;
	 private static final WEBSAFE_ALPHABET;
	 private static final WEBSAFE_DECODABET;
	 private static final Object WHITE_SPACE_ENC;
	 /* # direct methods */
	 static com.nobleempire.GunDisassembly2.util.Base64 ( ) {
		 /* .locals 8 */
		 /* .prologue */
		 int v7 = 3; // const/4 v7, 0x3
		 int v6 = 2; // const/4 v6, 0x2
		 int v1 = 1; // const/4 v1, 0x1
		 int v5 = -5; // const/4 v5, -0x5
		 /* const/16 v4, -0x9 */
		 /* .line 42 */
		 /* const-class v0, Lcom/nobleempire/GunDisassembly2/util/Base64; */
		 v0 = 		 (( java.lang.Class ) v0 ).desiredAssertionStatus ( ); // invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
		 /* if-nez v0, :cond_0 */
		 /* move v0, v1 */
	 } // :goto_0
	 com.nobleempire.GunDisassembly2.util.Base64.$assertionsDisabled = (v0!= 0);
	 /* .line 59 */
	 /* const/16 v0, 0x40 */
	 /* new-array v0, v0, [B */
	 /* fill-array-data v0, :array_0 */
	 /* .line 58 */
	 /* .line 77 */
	 /* const/16 v0, 0x40 */
	 /* new-array v0, v0, [B */
	 /* fill-array-data v0, :array_1 */
	 /* .line 76 */
	 /* .line 95 */
	 /* const/16 v0, 0x80 */
	 /* new-array v0, v0, [B */
	 int v2 = 0; // const/4 v2, 0x0
	 /* aput-byte v4, v0, v2 */
	 /* aput-byte v4, v0, v1 */
	 /* aput-byte v4, v0, v6 */
	 /* aput-byte v4, v0, v7 */
	 int v2 = 4; // const/4 v2, 0x4
	 /* aput-byte v4, v0, v2 */
	 int v2 = 5; // const/4 v2, 0x5
	 /* aput-byte v4, v0, v2 */
	 int v2 = 6; // const/4 v2, 0x6
	 /* aput-byte v4, v0, v2 */
	 int v2 = 7; // const/4 v2, 0x7
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x8 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x9 */
	 /* .line 96 */
	 /* aput-byte v5, v0, v2 */
	 /* const/16 v2, 0xa */
	 /* aput-byte v5, v0, v2 */
	 /* const/16 v2, 0xb */
	 /* .line 97 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0xc */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0xd */
	 /* .line 98 */
	 /* aput-byte v5, v0, v2 */
	 /* const/16 v2, 0xe */
	 /* .line 99 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0xf */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x10 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x11 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x12 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x13 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x14 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x15 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x16 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x17 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x18 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x19 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1a */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1b */
	 /* .line 100 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1c */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1d */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1e */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1f */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x20 */
	 /* .line 101 */
	 /* aput-byte v5, v0, v2 */
	 /* const/16 v2, 0x21 */
	 /* .line 102 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x22 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x23 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x24 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x25 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x26 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x27 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x28 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x29 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2a */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2b */
	 /* .line 103 */
	 /* const/16 v3, 0x3e */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x2c */
	 /* .line 104 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2d */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2e */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2f */
	 /* .line 105 */
	 /* const/16 v3, 0x3f */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x30 */
	 /* .line 106 */
	 /* const/16 v3, 0x34 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x31 */
	 /* const/16 v3, 0x35 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x32 */
	 /* const/16 v3, 0x36 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x33 */
	 /* const/16 v3, 0x37 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x34 */
	 /* const/16 v3, 0x38 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x35 */
	 /* const/16 v3, 0x39 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x36 */
	 /* const/16 v3, 0x3a */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x37 */
	 /* const/16 v3, 0x3b */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x38 */
	 /* const/16 v3, 0x3c */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x39 */
	 /* const/16 v3, 0x3d */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x3a */
	 /* .line 107 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x3b */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x3c */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x3d */
	 /* .line 108 */
	 int v3 = -1; // const/4 v3, -0x1
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x3e */
	 /* .line 109 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x3f */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x40 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x42 */
	 /* .line 110 */
	 /* aput-byte v1, v0, v2 */
	 /* const/16 v2, 0x43 */
	 /* aput-byte v6, v0, v2 */
	 /* const/16 v2, 0x44 */
	 /* aput-byte v7, v0, v2 */
	 /* const/16 v2, 0x45 */
	 int v3 = 4; // const/4 v3, 0x4
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x46 */
	 int v3 = 5; // const/4 v3, 0x5
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x47 */
	 int v3 = 6; // const/4 v3, 0x6
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x48 */
	 int v3 = 7; // const/4 v3, 0x7
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x49 */
	 /* const/16 v3, 0x8 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x4a */
	 /* const/16 v3, 0x9 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x4b */
	 /* const/16 v3, 0xa */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x4c */
	 /* const/16 v3, 0xb */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x4d */
	 /* const/16 v3, 0xc */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x4e */
	 /* const/16 v3, 0xd */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x4f */
	 /* .line 111 */
	 /* const/16 v3, 0xe */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x50 */
	 /* const/16 v3, 0xf */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x51 */
	 /* const/16 v3, 0x10 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x52 */
	 /* const/16 v3, 0x11 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x53 */
	 /* const/16 v3, 0x12 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x54 */
	 /* const/16 v3, 0x13 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x55 */
	 /* const/16 v3, 0x14 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x56 */
	 /* const/16 v3, 0x15 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x57 */
	 /* const/16 v3, 0x16 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x58 */
	 /* const/16 v3, 0x17 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x59 */
	 /* const/16 v3, 0x18 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x5a */
	 /* const/16 v3, 0x19 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x5b */
	 /* .line 112 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x5c */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x5d */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x5e */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x5f */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x60 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x61 */
	 /* .line 113 */
	 /* const/16 v3, 0x1a */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x62 */
	 /* const/16 v3, 0x1b */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x63 */
	 /* const/16 v3, 0x1c */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x64 */
	 /* const/16 v3, 0x1d */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x65 */
	 /* const/16 v3, 0x1e */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x66 */
	 /* const/16 v3, 0x1f */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x67 */
	 /* const/16 v3, 0x20 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x68 */
	 /* const/16 v3, 0x21 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x69 */
	 /* const/16 v3, 0x22 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x6a */
	 /* const/16 v3, 0x23 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x6b */
	 /* const/16 v3, 0x24 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x6c */
	 /* const/16 v3, 0x25 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x6d */
	 /* const/16 v3, 0x26 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x6e */
	 /* .line 114 */
	 /* const/16 v3, 0x27 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x6f */
	 /* const/16 v3, 0x28 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x70 */
	 /* const/16 v3, 0x29 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x71 */
	 /* const/16 v3, 0x2a */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x72 */
	 /* const/16 v3, 0x2b */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x73 */
	 /* const/16 v3, 0x2c */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x74 */
	 /* const/16 v3, 0x2d */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x75 */
	 /* const/16 v3, 0x2e */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x76 */
	 /* const/16 v3, 0x2f */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x77 */
	 /* const/16 v3, 0x30 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x78 */
	 /* const/16 v3, 0x31 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x79 */
	 /* const/16 v3, 0x32 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x7a */
	 /* const/16 v3, 0x33 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x7b */
	 /* .line 115 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x7c */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x7d */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x7e */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x7f */
	 /* aput-byte v4, v0, v2 */
	 /* .line 95 */
	 /* .line 130 */
	 /* const/16 v0, 0x80 */
	 /* new-array v0, v0, [B */
	 int v2 = 0; // const/4 v2, 0x0
	 /* aput-byte v4, v0, v2 */
	 /* aput-byte v4, v0, v1 */
	 /* aput-byte v4, v0, v6 */
	 /* aput-byte v4, v0, v7 */
	 int v2 = 4; // const/4 v2, 0x4
	 /* aput-byte v4, v0, v2 */
	 int v2 = 5; // const/4 v2, 0x5
	 /* aput-byte v4, v0, v2 */
	 int v2 = 6; // const/4 v2, 0x6
	 /* aput-byte v4, v0, v2 */
	 int v2 = 7; // const/4 v2, 0x7
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x8 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x9 */
	 /* .line 131 */
	 /* aput-byte v5, v0, v2 */
	 /* const/16 v2, 0xa */
	 /* aput-byte v5, v0, v2 */
	 /* const/16 v2, 0xb */
	 /* .line 132 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0xc */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0xd */
	 /* .line 133 */
	 /* aput-byte v5, v0, v2 */
	 /* const/16 v2, 0xe */
	 /* .line 134 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0xf */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x10 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x11 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x12 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x13 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x14 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x15 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x16 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x17 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x18 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x19 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1a */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1b */
	 /* .line 135 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1c */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1d */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1e */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x1f */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x20 */
	 /* .line 136 */
	 /* aput-byte v5, v0, v2 */
	 /* const/16 v2, 0x21 */
	 /* .line 137 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x22 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x23 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x24 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x25 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x26 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x27 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x28 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x29 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2a */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2b */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2c */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2d */
	 /* .line 138 */
	 /* const/16 v3, 0x3e */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x2e */
	 /* .line 139 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x2f */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x30 */
	 /* .line 140 */
	 /* const/16 v3, 0x34 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x31 */
	 /* const/16 v3, 0x35 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x32 */
	 /* const/16 v3, 0x36 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x33 */
	 /* const/16 v3, 0x37 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x34 */
	 /* const/16 v3, 0x38 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x35 */
	 /* const/16 v3, 0x39 */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x36 */
	 /* const/16 v3, 0x3a */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x37 */
	 /* const/16 v3, 0x3b */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x38 */
	 /* const/16 v3, 0x3c */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x39 */
	 /* const/16 v3, 0x3d */
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x3a */
	 /* .line 141 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x3b */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x3c */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x3d */
	 /* .line 142 */
	 int v3 = -1; // const/4 v3, -0x1
	 /* aput-byte v3, v0, v2 */
	 /* const/16 v2, 0x3e */
	 /* .line 143 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x3f */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x40 */
	 /* aput-byte v4, v0, v2 */
	 /* const/16 v2, 0x42 */
	 /* .line 144 */
	 /* aput-byte v1, v0, v2 */
	 /* const/16 v1, 0x43 */
	 /* aput-byte v6, v0, v1 */
	 /* const/16 v1, 0x44 */
	 /* aput-byte v7, v0, v1 */
	 /* const/16 v1, 0x45 */
	 int v2 = 4; // const/4 v2, 0x4
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x46 */
	 int v2 = 5; // const/4 v2, 0x5
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x47 */
	 int v2 = 6; // const/4 v2, 0x6
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x48 */
	 int v2 = 7; // const/4 v2, 0x7
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x49 */
	 /* const/16 v2, 0x8 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x4a */
	 /* const/16 v2, 0x9 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x4b */
	 /* const/16 v2, 0xa */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x4c */
	 /* const/16 v2, 0xb */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x4d */
	 /* const/16 v2, 0xc */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x4e */
	 /* const/16 v2, 0xd */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x4f */
	 /* .line 145 */
	 /* const/16 v2, 0xe */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x50 */
	 /* const/16 v2, 0xf */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x51 */
	 /* const/16 v2, 0x10 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x52 */
	 /* const/16 v2, 0x11 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x53 */
	 /* const/16 v2, 0x12 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x54 */
	 /* const/16 v2, 0x13 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x55 */
	 /* const/16 v2, 0x14 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x56 */
	 /* const/16 v2, 0x15 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x57 */
	 /* const/16 v2, 0x16 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x58 */
	 /* const/16 v2, 0x17 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x59 */
	 /* const/16 v2, 0x18 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x5a */
	 /* const/16 v2, 0x19 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x5b */
	 /* .line 146 */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x5c */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x5d */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x5e */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x5f */
	 /* .line 147 */
	 /* const/16 v2, 0x3f */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x60 */
	 /* .line 148 */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x61 */
	 /* .line 149 */
	 /* const/16 v2, 0x1a */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x62 */
	 /* const/16 v2, 0x1b */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x63 */
	 /* const/16 v2, 0x1c */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x64 */
	 /* const/16 v2, 0x1d */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x65 */
	 /* const/16 v2, 0x1e */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x66 */
	 /* const/16 v2, 0x1f */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x67 */
	 /* const/16 v2, 0x20 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x68 */
	 /* const/16 v2, 0x21 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x69 */
	 /* const/16 v2, 0x22 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x6a */
	 /* const/16 v2, 0x23 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x6b */
	 /* const/16 v2, 0x24 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x6c */
	 /* const/16 v2, 0x25 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x6d */
	 /* const/16 v2, 0x26 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x6e */
	 /* .line 150 */
	 /* const/16 v2, 0x27 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x6f */
	 /* const/16 v2, 0x28 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x70 */
	 /* const/16 v2, 0x29 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x71 */
	 /* const/16 v2, 0x2a */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x72 */
	 /* const/16 v2, 0x2b */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x73 */
	 /* const/16 v2, 0x2c */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x74 */
	 /* const/16 v2, 0x2d */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x75 */
	 /* const/16 v2, 0x2e */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x76 */
	 /* const/16 v2, 0x2f */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x77 */
	 /* const/16 v2, 0x30 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x78 */
	 /* const/16 v2, 0x31 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x79 */
	 /* const/16 v2, 0x32 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x7a */
	 /* const/16 v2, 0x33 */
	 /* aput-byte v2, v0, v1 */
	 /* const/16 v1, 0x7b */
	 /* .line 151 */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x7c */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x7d */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x7e */
	 /* aput-byte v4, v0, v1 */
	 /* const/16 v1, 0x7f */
	 /* aput-byte v4, v0, v1 */
	 /* .line 129 */
	 return;
	 /* .line 42 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
/* .line 59 */
/* nop */
/* :array_0 */
/* .array-data 1 */
/* 0x41t */
/* 0x42t */
/* 0x43t */
/* 0x44t */
/* 0x45t */
/* 0x46t */
/* 0x47t */
/* 0x48t */
/* 0x49t */
/* 0x4at */
/* 0x4bt */
/* 0x4ct */
/* 0x4dt */
/* 0x4et */
/* 0x4ft */
/* 0x50t */
/* 0x51t */
/* 0x52t */
/* 0x53t */
/* 0x54t */
/* 0x55t */
/* 0x56t */
/* 0x57t */
/* 0x58t */
/* 0x59t */
/* 0x5at */
/* 0x61t */
/* 0x62t */
/* 0x63t */
/* 0x64t */
/* 0x65t */
/* 0x66t */
/* 0x67t */
/* 0x68t */
/* 0x69t */
/* 0x6at */
/* 0x6bt */
/* 0x6ct */
/* 0x6dt */
/* 0x6et */
/* 0x6ft */
/* 0x70t */
/* 0x71t */
/* 0x72t */
/* 0x73t */
/* 0x74t */
/* 0x75t */
/* 0x76t */
/* 0x77t */
/* 0x78t */
/* 0x79t */
/* 0x7at */
/* 0x30t */
/* 0x31t */
/* 0x32t */
/* 0x33t */
/* 0x34t */
/* 0x35t */
/* 0x36t */
/* 0x37t */
/* 0x38t */
/* 0x39t */
/* 0x2bt */
/* 0x2ft */
} // .end array-data
/* .line 77 */
/* :array_1 */
/* .array-data 1 */
/* 0x41t */
/* 0x42t */
/* 0x43t */
/* 0x44t */
/* 0x45t */
/* 0x46t */
/* 0x47t */
/* 0x48t */
/* 0x49t */
/* 0x4at */
/* 0x4bt */
/* 0x4ct */
/* 0x4dt */
/* 0x4et */
/* 0x4ft */
/* 0x50t */
/* 0x51t */
/* 0x52t */
/* 0x53t */
/* 0x54t */
/* 0x55t */
/* 0x56t */
/* 0x57t */
/* 0x58t */
/* 0x59t */
/* 0x5at */
/* 0x61t */
/* 0x62t */
/* 0x63t */
/* 0x64t */
/* 0x65t */
/* 0x66t */
/* 0x67t */
/* 0x68t */
/* 0x69t */
/* 0x6at */
/* 0x6bt */
/* 0x6ct */
/* 0x6dt */
/* 0x6et */
/* 0x6ft */
/* 0x70t */
/* 0x71t */
/* 0x72t */
/* 0x73t */
/* 0x74t */
/* 0x75t */
/* 0x76t */
/* 0x77t */
/* 0x78t */
/* 0x79t */
/* 0x7at */
/* 0x30t */
/* 0x31t */
/* 0x32t */
/* 0x33t */
/* 0x34t */
/* 0x35t */
/* 0x36t */
/* 0x37t */
/* 0x38t */
/* 0x39t */
/* 0x2dt */
/* 0x5ft */
} // .end array-data
} // .end method
private com.nobleempire.GunDisassembly2.util.Base64 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 170 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 171 */
return;
} // .end method
public static decode ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "s" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 420 */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
/* .line 421 */
/* .local v0, "bytes":[B */
int v1 = 0; // const/4 v1, 0x0
/* array-length v2, v0 */
com.nobleempire.GunDisassembly2.util.Base64 .decode ( v0,v1,v2 );
} // .end method
public static decode ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "source" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 446 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
com.nobleempire.GunDisassembly2.util.Base64 .decode ( p0,v0,v1 );
} // .end method
public static decode ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "source" # [B */
/* .param p1, "off" # I */
/* .param p2, "len" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 475 */
v0 = com.nobleempire.GunDisassembly2.util.Base64.DECODABET;
com.nobleempire.GunDisassembly2.util.Base64 .decode ( p0,p1,p2,v0 );
} // .end method
public static decode ( Object[] p0, Integer p1, Integer p2, Object[] p3 ) {
/* .locals 16 */
/* .param p0, "source" # [B */
/* .param p1, "off" # I */
/* .param p2, "len" # I */
/* .param p3, "decodabet" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 505 */
/* mul-int/lit8 v13, p2, 0x3 */
/* div-int/lit8 v7, v13, 0x4 */
/* .line 506 */
/* .local v7, "len34":I */
/* add-int/lit8 v13, v7, 0x2 */
/* new-array v9, v13, [B */
/* .line 507 */
/* .local v9, "outBuff":[B */
int v10 = 0; // const/4 v10, 0x0
/* .line 509 */
/* .local v10, "outBuffPosn":I */
int v13 = 4; // const/4 v13, 0x4
/* new-array v1, v13, [B */
/* .line 510 */
/* .local v1, "b4":[B */
int v2 = 0; // const/4 v2, 0x0
/* .line 511 */
/* .local v2, "b4Posn":I */
int v5 = 0; // const/4 v5, 0x0
/* .line 512 */
/* .local v5, "i":I */
int v11 = 0; // const/4 v11, 0x0
/* .line 513 */
/* .local v11, "sbiCrop":B */
int v12 = 0; // const/4 v12, 0x0
/* .line 514 */
/* .local v12, "sbiDecode":B */
int v5 = 0; // const/4 v5, 0x0
/* move v3, v2 */
} // .end local v2 # "b4Posn":I
/* .local v3, "b4Posn":I */
} // :goto_0
/* move/from16 v0, p2 */
/* if-lt v5, v0, :cond_1 */
/* .line 558 */
} // :cond_0
if ( v3 != null) { // if-eqz v3, :cond_b
/* .line 559 */
int v13 = 1; // const/4 v13, 0x1
/* if-ne v3, v13, :cond_a */
/* .line 560 */
/* new-instance v13, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* new-instance v14, Ljava/lang/StringBuilder; */
final String v15 = "single trailing character at offset "; // const-string v15, "single trailing character at offset "
/* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 561 */
/* add-int/lit8 v15, p2, -0x1 */
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 560 */
/* invoke-direct {v13, v14}, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v13 */
/* .line 515 */
} // :cond_1
/* add-int v13, v5, p1 */
/* aget-byte v13, p0, v13 */
/* and-int/lit8 v13, v13, 0x7f */
/* int-to-byte v11, v13 */
/* .line 516 */
/* aget-byte v12, p3, v11 */
/* .line 518 */
int v13 = -5; // const/4 v13, -0x5
/* if-lt v12, v13, :cond_9 */
/* .line 519 */
int v13 = -1; // const/4 v13, -0x1
/* if-lt v12, v13, :cond_c */
/* .line 522 */
/* const/16 v13, 0x3d */
/* if-ne v11, v13, :cond_7 */
/* .line 523 */
/* sub-int v4, p2, v5 */
/* .line 524 */
/* .local v4, "bytesLeft":I */
/* add-int/lit8 v13, p2, -0x1 */
/* add-int v13, v13, p1 */
/* aget-byte v13, p0, v13 */
/* and-int/lit8 v13, v13, 0x7f */
/* int-to-byte v6, v13 */
/* .line 525 */
/* .local v6, "lastByte":B */
if ( v3 != null) { // if-eqz v3, :cond_2
int v13 = 1; // const/4 v13, 0x1
/* if-ne v3, v13, :cond_3 */
/* .line 526 */
} // :cond_2
/* new-instance v13, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* .line 527 */
/* new-instance v14, Ljava/lang/StringBuilder; */
final String v15 = "invalid padding byte \'=\' at byte offset "; // const-string v15, "invalid padding byte \'=\' at byte offset "
/* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v14 ).append ( v5 ); // invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 526 */
/* invoke-direct {v13, v14}, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v13 */
/* .line 528 */
} // :cond_3
int v13 = 3; // const/4 v13, 0x3
/* if-ne v3, v13, :cond_4 */
int v13 = 2; // const/4 v13, 0x2
/* if-gt v4, v13, :cond_5 */
/* .line 529 */
} // :cond_4
int v13 = 4; // const/4 v13, 0x4
/* if-ne v3, v13, :cond_6 */
int v13 = 1; // const/4 v13, 0x1
/* if-le v4, v13, :cond_6 */
/* .line 530 */
} // :cond_5
/* new-instance v13, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* .line 531 */
/* new-instance v14, Ljava/lang/StringBuilder; */
final String v15 = "padding byte \'=\' falsely signals end of encoded value at offset "; // const-string v15, "padding byte \'=\' falsely signals end of encoded value at offset "
/* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 532 */
(( java.lang.StringBuilder ) v14 ).append ( v5 ); // invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 531 */
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 530 */
/* invoke-direct {v13, v14}, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v13 */
/* .line 533 */
} // :cond_6
/* const/16 v13, 0x3d */
/* if-eq v6, v13, :cond_0 */
/* const/16 v13, 0xa */
/* if-eq v6, v13, :cond_0 */
/* .line 534 */
/* new-instance v13, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* .line 535 */
final String v14 = "encoded value has invalid trailing byte"; // const-string v14, "encoded value has invalid trailing byte"
/* .line 534 */
/* invoke-direct {v13, v14}, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v13 */
/* .line 540 */
} // .end local v4 # "bytesLeft":I
} // .end local v6 # "lastByte":B
} // :cond_7
/* add-int/lit8 v2, v3, 0x1 */
} // .end local v3 # "b4Posn":I
/* .restart local v2 # "b4Posn":I */
/* aput-byte v11, v1, v3 */
/* .line 541 */
int v13 = 4; // const/4 v13, 0x4
/* if-ne v2, v13, :cond_8 */
/* .line 542 */
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p3 */
v13 = com.nobleempire.GunDisassembly2.util.Base64 .decode4to3 ( v1,v13,v9,v10,v0 );
/* add-int/2addr v10, v13 */
/* .line 543 */
int v2 = 0; // const/4 v2, 0x0
/* .line 514 */
} // :cond_8
} // :goto_1
/* add-int/lit8 v5, v5, 0x1 */
/* move v3, v2 */
} // .end local v2 # "b4Posn":I
/* .restart local v3 # "b4Posn":I */
/* goto/16 :goto_0 */
/* .line 547 */
} // :cond_9
/* new-instance v13, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* new-instance v14, Ljava/lang/StringBuilder; */
final String v15 = "Bad Base64 input character at "; // const-string v15, "Bad Base64 input character at "
/* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v14 ).append ( v5 ); // invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 548 */
final String v15 = ": "; // const-string v15, ": "
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int v15, v5, p1 */
/* aget-byte v15, p0, v15 */
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v15 = "(decimal)"; // const-string v15, "(decimal)"
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 547 */
/* invoke-direct {v13, v14}, Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v13 */
/* .line 563 */
} // :cond_a
/* add-int/lit8 v2, v3, 0x1 */
} // .end local v3 # "b4Posn":I
/* .restart local v2 # "b4Posn":I */
/* const/16 v13, 0x3d */
/* aput-byte v13, v1, v3 */
/* .line 564 */
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p3 */
v13 = com.nobleempire.GunDisassembly2.util.Base64 .decode4to3 ( v1,v13,v9,v10,v0 );
/* add-int/2addr v10, v13 */
/* .line 567 */
} // :goto_2
/* new-array v8, v10, [B */
/* .line 568 */
/* .local v8, "out":[B */
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
java.lang.System .arraycopy ( v9,v13,v8,v14,v10 );
/* .line 569 */
} // .end local v2 # "b4Posn":I
} // .end local v8 # "out":[B
/* .restart local v3 # "b4Posn":I */
} // :cond_b
/* move v2, v3 */
} // .end local v3 # "b4Posn":I
/* .restart local v2 # "b4Posn":I */
} // .end local v2 # "b4Posn":I
/* .restart local v3 # "b4Posn":I */
} // :cond_c
/* move v2, v3 */
} // .end local v3 # "b4Posn":I
/* .restart local v2 # "b4Posn":I */
} // .end method
private static Integer decode4to3 ( Object[] p0, Integer p1, Object[] p2, Integer p3, Object[] p4 ) {
/* .locals 3 */
/* .param p0, "source" # [B */
/* .param p1, "srcOffset" # I */
/* .param p2, "destination" # [B */
/* .param p3, "destOffset" # I */
/* .param p4, "decodabet" # [B */
/* .prologue */
/* const/16 v2, 0x3d */
/* .line 379 */
/* add-int/lit8 v1, p1, 0x2 */
/* aget-byte v1, p0, v1 */
/* if-ne v1, v2, :cond_0 */
/* .line 381 */
/* aget-byte v1, p0, p1 */
/* aget-byte v1, p4, v1 */
/* shl-int/lit8 v1, v1, 0x18 */
/* ushr-int/lit8 v1, v1, 0x6 */
/* .line 382 */
/* add-int/lit8 v2, p1, 0x1 */
/* aget-byte v2, p0, v2 */
/* aget-byte v2, p4, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0xc */
/* .line 381 */
/* or-int v0, v1, v2 */
/* .line 384 */
/* .local v0, "outBuff":I */
/* ushr-int/lit8 v1, v0, 0x10 */
/* int-to-byte v1, v1 */
/* aput-byte v1, p2, p3 */
/* .line 385 */
int v1 = 1; // const/4 v1, 0x1
/* .line 407 */
} // :goto_0
/* .line 386 */
} // .end local v0 # "outBuff":I
} // :cond_0
/* add-int/lit8 v1, p1, 0x3 */
/* aget-byte v1, p0, v1 */
/* if-ne v1, v2, :cond_1 */
/* .line 389 */
/* aget-byte v1, p0, p1 */
/* aget-byte v1, p4, v1 */
/* shl-int/lit8 v1, v1, 0x18 */
/* ushr-int/lit8 v1, v1, 0x6 */
/* .line 390 */
/* add-int/lit8 v2, p1, 0x1 */
/* aget-byte v2, p0, v2 */
/* aget-byte v2, p4, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0xc */
/* .line 389 */
/* or-int/2addr v1, v2 */
/* .line 391 */
/* add-int/lit8 v2, p1, 0x2 */
/* aget-byte v2, p0, v2 */
/* aget-byte v2, p4, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0x12 */
/* .line 389 */
/* or-int v0, v1, v2 */
/* .line 393 */
/* .restart local v0 # "outBuff":I */
/* ushr-int/lit8 v1, v0, 0x10 */
/* int-to-byte v1, v1 */
/* aput-byte v1, p2, p3 */
/* .line 394 */
/* add-int/lit8 v1, p3, 0x1 */
/* ushr-int/lit8 v2, v0, 0x8 */
/* int-to-byte v2, v2 */
/* aput-byte v2, p2, v1 */
/* .line 395 */
int v1 = 2; // const/4 v1, 0x2
/* .line 399 */
} // .end local v0 # "outBuff":I
} // :cond_1
/* aget-byte v1, p0, p1 */
/* aget-byte v1, p4, v1 */
/* shl-int/lit8 v1, v1, 0x18 */
/* ushr-int/lit8 v1, v1, 0x6 */
/* .line 400 */
/* add-int/lit8 v2, p1, 0x1 */
/* aget-byte v2, p0, v2 */
/* aget-byte v2, p4, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0xc */
/* .line 399 */
/* or-int/2addr v1, v2 */
/* .line 401 */
/* add-int/lit8 v2, p1, 0x2 */
/* aget-byte v2, p0, v2 */
/* aget-byte v2, p4, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0x12 */
/* .line 399 */
/* or-int/2addr v1, v2 */
/* .line 402 */
/* add-int/lit8 v2, p1, 0x3 */
/* aget-byte v2, p0, v2 */
/* aget-byte v2, p4, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0x18 */
/* .line 399 */
/* or-int v0, v1, v2 */
/* .line 404 */
/* .restart local v0 # "outBuff":I */
/* shr-int/lit8 v1, v0, 0x10 */
/* int-to-byte v1, v1 */
/* aput-byte v1, p2, p3 */
/* .line 405 */
/* add-int/lit8 v1, p3, 0x1 */
/* shr-int/lit8 v2, v0, 0x8 */
/* int-to-byte v2, v2 */
/* aput-byte v2, p2, v1 */
/* .line 406 */
/* add-int/lit8 v1, p3, 0x2 */
/* int-to-byte v2, v0 */
/* aput-byte v2, p2, v1 */
/* .line 407 */
int v1 = 3; // const/4 v1, 0x3
} // .end method
public static decodeWebSafe ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "s" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 432 */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
/* .line 433 */
/* .local v0, "bytes":[B */
int v1 = 0; // const/4 v1, 0x0
/* array-length v2, v0 */
com.nobleempire.GunDisassembly2.util.Base64 .decodeWebSafe ( v0,v1,v2 );
} // .end method
public static decodeWebSafe ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "source" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 459 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
com.nobleempire.GunDisassembly2.util.Base64 .decodeWebSafe ( p0,v0,v1 );
} // .end method
public static decodeWebSafe ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "source" # [B */
/* .param p1, "off" # I */
/* .param p2, "len" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/nobleempire/GunDisassembly2/util/Base64DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 490 */
v0 = com.nobleempire.GunDisassembly2.util.Base64.WEBSAFE_DECODABET;
com.nobleempire.GunDisassembly2.util.Base64 .decode ( p0,p1,p2,v0 );
} // .end method
public static java.lang.String encode ( Object[] p0 ) {
/* .locals 4 */
/* .param p0, "source" # [B */
/* .prologue */
/* .line 248 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
v2 = com.nobleempire.GunDisassembly2.util.Base64.ALPHABET;
int v3 = 1; // const/4 v3, 0x1
com.nobleempire.GunDisassembly2.util.Base64 .encode ( p0,v0,v1,v2,v3 );
} // .end method
public static java.lang.String encode ( Object[] p0, Integer p1, Integer p2, Object[] p3, Boolean p4 ) {
/* .locals 4 */
/* .param p0, "source" # [B */
/* .param p1, "off" # I */
/* .param p2, "len" # I */
/* .param p3, "alphabet" # [B */
/* .param p4, "doPadding" # Z */
/* .prologue */
/* .line 275 */
/* const v2, 0x7fffffff */
com.nobleempire.GunDisassembly2.util.Base64 .encode ( p0,p1,p2,p3,v2 );
/* .line 276 */
/* .local v0, "outBuff":[B */
/* array-length v1, v0 */
/* .line 280 */
/* .local v1, "outLen":I */
} // :goto_0
/* if-nez p4, :cond_0 */
/* if-gtz v1, :cond_1 */
/* .line 287 */
} // :cond_0
/* new-instance v2, Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v0, v3, v1}, Ljava/lang/String;-><init>([BII)V */
/* .line 281 */
} // :cond_1
/* add-int/lit8 v2, v1, -0x1 */
/* aget-byte v2, v0, v2 */
/* const/16 v3, 0x3d */
/* if-ne v2, v3, :cond_0 */
/* .line 284 */
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public static encode ( Object[] p0, Integer p1, Integer p2, Object[] p3, Integer p4 ) {
/* .locals 13 */
/* .param p0, "source" # [B */
/* .param p1, "off" # I */
/* .param p2, "len" # I */
/* .param p3, "alphabet" # [B */
/* .param p4, "maxLineLength" # I */
/* .prologue */
/* .line 302 */
/* add-int/lit8 v1, p2, 0x2 */
/* div-int/lit8 v11, v1, 0x3 */
/* .line 303 */
/* .local v11, "lenDiv3":I */
/* mul-int/lit8 v10, v11, 0x4 */
/* .line 305 */
/* .local v10, "len43":I */
/* div-int v1, v10, p4 */
/* .line 304 */
/* add-int/2addr v1, v10 */
/* new-array v4, v1, [B */
/* .line 307 */
/* .local v4, "outBuff":[B */
int v7 = 0; // const/4 v7, 0x0
/* .line 308 */
/* .local v7, "d":I */
int v5 = 0; // const/4 v5, 0x0
/* .line 309 */
/* .local v5, "e":I */
/* add-int/lit8 v9, p2, -0x2 */
/* .line 310 */
/* .local v9, "len2":I */
int v12 = 0; // const/4 v12, 0x0
/* .line 311 */
/* .local v12, "lineLength":I */
} // :goto_0
/* if-lt v7, v9, :cond_2 */
/* .line 333 */
/* if-ge v7, p2, :cond_1 */
/* .line 334 */
/* add-int v2, v7, p1 */
/* sub-int v3, p2, v7 */
/* move-object v1, p0 */
/* move-object/from16 v6, p3 */
/* invoke-static/range {v1 ..v6}, Lcom/nobleempire/GunDisassembly2/util/Base64;->encode3to4([BII[BI[B)[B */
/* .line 336 */
/* add-int/lit8 v12, v12, 0x4 */
/* .line 337 */
/* move/from16 v0, p4 */
/* if-ne v12, v0, :cond_0 */
/* .line 339 */
/* add-int/lit8 v1, v5, 0x4 */
/* const/16 v2, 0xa */
/* aput-byte v2, v4, v1 */
/* .line 340 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 342 */
} // :cond_0
/* add-int/lit8 v5, v5, 0x4 */
/* .line 345 */
} // :cond_1
/* sget-boolean v1, Lcom/nobleempire/GunDisassembly2/util/Base64;->$assertionsDisabled:Z */
/* if-nez v1, :cond_4 */
/* array-length v1, v4 */
/* if-eq v5, v1, :cond_4 */
/* new-instance v1, Ljava/lang/AssertionError; */
/* invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V */
/* throw v1 */
/* .line 317 */
} // :cond_2
/* add-int v1, v7, p1 */
/* aget-byte v1, p0, v1 */
/* shl-int/lit8 v1, v1, 0x18 */
/* ushr-int/lit8 v1, v1, 0x8 */
/* .line 318 */
/* add-int/lit8 v2, v7, 0x1 */
/* add-int/2addr v2, p1 */
/* aget-byte v2, p0, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0x10 */
/* .line 317 */
/* or-int/2addr v1, v2 */
/* .line 319 */
/* add-int/lit8 v2, v7, 0x2 */
/* add-int/2addr v2, p1 */
/* aget-byte v2, p0, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0x18 */
/* .line 317 */
/* or-int v8, v1, v2 */
/* .line 320 */
/* .local v8, "inBuff":I */
/* ushr-int/lit8 v1, v8, 0x12 */
/* aget-byte v1, p3, v1 */
/* aput-byte v1, v4, v5 */
/* .line 321 */
/* add-int/lit8 v1, v5, 0x1 */
/* ushr-int/lit8 v2, v8, 0xc */
/* and-int/lit8 v2, v2, 0x3f */
/* aget-byte v2, p3, v2 */
/* aput-byte v2, v4, v1 */
/* .line 322 */
/* add-int/lit8 v1, v5, 0x2 */
/* ushr-int/lit8 v2, v8, 0x6 */
/* and-int/lit8 v2, v2, 0x3f */
/* aget-byte v2, p3, v2 */
/* aput-byte v2, v4, v1 */
/* .line 323 */
/* add-int/lit8 v1, v5, 0x3 */
/* and-int/lit8 v2, v8, 0x3f */
/* aget-byte v2, p3, v2 */
/* aput-byte v2, v4, v1 */
/* .line 325 */
/* add-int/lit8 v12, v12, 0x4 */
/* .line 326 */
/* move/from16 v0, p4 */
/* if-ne v12, v0, :cond_3 */
/* .line 327 */
/* add-int/lit8 v1, v5, 0x4 */
/* const/16 v2, 0xa */
/* aput-byte v2, v4, v1 */
/* .line 328 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 329 */
int v12 = 0; // const/4 v12, 0x0
/* .line 311 */
} // :cond_3
/* add-int/lit8 v7, v7, 0x3 */
/* add-int/lit8 v5, v5, 0x4 */
/* .line 346 */
} // .end local v8 # "inBuff":I
} // :cond_4
} // .end method
private static encode3to4 ( Object[] p0, Integer p1, Integer p2, Object[] p3, Integer p4, Object[] p5 ) {
/* .locals 5 */
/* .param p0, "source" # [B */
/* .param p1, "srcOffset" # I */
/* .param p2, "numSigBytes" # I */
/* .param p3, "destination" # [B */
/* .param p4, "destOffset" # I */
/* .param p5, "alphabet" # [B */
/* .prologue */
/* const/16 v4, 0x3d */
int v1 = 0; // const/4 v1, 0x0
/* .line 211 */
/* if-lez p2, :cond_1 */
/* aget-byte v2, p0, p1 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0x8 */
/* move v3, v2 */
/* .line 212 */
} // :goto_0
int v2 = 1; // const/4 v2, 0x1
/* if-le p2, v2, :cond_2 */
/* add-int/lit8 v2, p1, 0x1 */
/* aget-byte v2, p0, v2 */
/* shl-int/lit8 v2, v2, 0x18 */
/* ushr-int/lit8 v2, v2, 0x10 */
/* .line 211 */
} // :goto_1
/* or-int/2addr v2, v3 */
/* .line 213 */
int v3 = 2; // const/4 v3, 0x2
/* if-le p2, v3, :cond_0 */
/* add-int/lit8 v1, p1, 0x2 */
/* aget-byte v1, p0, v1 */
/* shl-int/lit8 v1, v1, 0x18 */
/* ushr-int/lit8 v1, v1, 0x18 */
/* .line 211 */
} // :cond_0
/* or-int v0, v2, v1 */
/* .line 215 */
/* .local v0, "inBuff":I */
/* packed-switch p2, :pswitch_data_0 */
/* .line 235 */
} // :goto_2
} // .end local v0 # "inBuff":I
} // :cond_1
/* move v3, v1 */
/* .line 211 */
} // :cond_2
/* move v2, v1 */
/* .line 212 */
/* .line 217 */
/* .restart local v0 # "inBuff":I */
/* :pswitch_0 */
/* ushr-int/lit8 v1, v0, 0x12 */
/* aget-byte v1, p5, v1 */
/* aput-byte v1, p3, p4 */
/* .line 218 */
/* add-int/lit8 v1, p4, 0x1 */
/* ushr-int/lit8 v2, v0, 0xc */
/* and-int/lit8 v2, v2, 0x3f */
/* aget-byte v2, p5, v2 */
/* aput-byte v2, p3, v1 */
/* .line 219 */
/* add-int/lit8 v1, p4, 0x2 */
/* ushr-int/lit8 v2, v0, 0x6 */
/* and-int/lit8 v2, v2, 0x3f */
/* aget-byte v2, p5, v2 */
/* aput-byte v2, p3, v1 */
/* .line 220 */
/* add-int/lit8 v1, p4, 0x3 */
/* and-int/lit8 v2, v0, 0x3f */
/* aget-byte v2, p5, v2 */
/* aput-byte v2, p3, v1 */
/* .line 223 */
/* :pswitch_1 */
/* ushr-int/lit8 v1, v0, 0x12 */
/* aget-byte v1, p5, v1 */
/* aput-byte v1, p3, p4 */
/* .line 224 */
/* add-int/lit8 v1, p4, 0x1 */
/* ushr-int/lit8 v2, v0, 0xc */
/* and-int/lit8 v2, v2, 0x3f */
/* aget-byte v2, p5, v2 */
/* aput-byte v2, p3, v1 */
/* .line 225 */
/* add-int/lit8 v1, p4, 0x2 */
/* ushr-int/lit8 v2, v0, 0x6 */
/* and-int/lit8 v2, v2, 0x3f */
/* aget-byte v2, p5, v2 */
/* aput-byte v2, p3, v1 */
/* .line 226 */
/* add-int/lit8 v1, p4, 0x3 */
/* aput-byte v4, p3, v1 */
/* .line 229 */
/* :pswitch_2 */
/* ushr-int/lit8 v1, v0, 0x12 */
/* aget-byte v1, p5, v1 */
/* aput-byte v1, p3, p4 */
/* .line 230 */
/* add-int/lit8 v1, p4, 0x1 */
/* ushr-int/lit8 v2, v0, 0xc */
/* and-int/lit8 v2, v2, 0x3f */
/* aget-byte v2, p5, v2 */
/* aput-byte v2, p3, v1 */
/* .line 231 */
/* add-int/lit8 v1, p4, 0x2 */
/* aput-byte v4, p3, v1 */
/* .line 232 */
/* add-int/lit8 v1, p4, 0x3 */
/* aput-byte v4, p3, v1 */
/* .line 215 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static java.lang.String encodeWebSafe ( Object[] p0, Boolean p1 ) {
/* .locals 3 */
/* .param p0, "source" # [B */
/* .param p1, "doPadding" # Z */
/* .prologue */
/* .line 259 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
v2 = com.nobleempire.GunDisassembly2.util.Base64.WEBSAFE_ALPHABET;
com.nobleempire.GunDisassembly2.util.Base64 .encode ( p0,v0,v1,v2,p1 );
} // .end method
