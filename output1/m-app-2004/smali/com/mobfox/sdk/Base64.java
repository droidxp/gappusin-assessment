public class com.mobfox.sdk.Base64 {
	 /* .source "Base64.java" */
	 /* # static fields */
	 private static map1;
	 private static map2;
	 /* # direct methods */
	 static com.mobfox.sdk.Base64 ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* const/16 v6, 0x40 */
		 /* .line 9 */
		 /* new-array v3, v6, [C */
		 /* .line 11 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 12 */
		 /* .local v1, "i":I */
		 /* const/16 v0, 0x41 */
		 /* .local v0, "c":C */
		 /* move v2, v1 */
	 } // .end local v1 # "i":I
	 /* .local v2, "i":I */
} // :goto_0
/* const/16 v3, 0x5a */
/* if-gt v0, v3, :cond_0 */
/* .line 13 */
v3 = com.mobfox.sdk.Base64.map1;
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "i":I
/* .restart local v1 # "i":I */
/* aput-char v0, v3, v2 */
/* .line 12 */
/* add-int/lit8 v3, v0, 0x1 */
/* int-to-char v0, v3 */
/* move v2, v1 */
} // .end local v1 # "i":I
/* .restart local v2 # "i":I */
/* .line 14 */
} // :cond_0
/* const/16 v0, 0x61 */
} // :goto_1
/* const/16 v3, 0x7a */
/* if-gt v0, v3, :cond_1 */
/* .line 15 */
v3 = com.mobfox.sdk.Base64.map1;
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "i":I
/* .restart local v1 # "i":I */
/* aput-char v0, v3, v2 */
/* .line 14 */
/* add-int/lit8 v3, v0, 0x1 */
/* int-to-char v0, v3 */
/* move v2, v1 */
} // .end local v1 # "i":I
/* .restart local v2 # "i":I */
/* .line 16 */
} // :cond_1
/* const/16 v0, 0x30 */
} // :goto_2
/* const/16 v3, 0x39 */
/* if-gt v0, v3, :cond_2 */
/* .line 17 */
v3 = com.mobfox.sdk.Base64.map1;
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "i":I
/* .restart local v1 # "i":I */
/* aput-char v0, v3, v2 */
/* .line 16 */
/* add-int/lit8 v3, v0, 0x1 */
/* int-to-char v0, v3 */
/* move v2, v1 */
} // .end local v1 # "i":I
/* .restart local v2 # "i":I */
/* .line 18 */
} // :cond_2
v3 = com.mobfox.sdk.Base64.map1;
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "i":I
/* .restart local v1 # "i":I */
/* const/16 v4, 0x2b */
/* aput-char v4, v3, v2 */
/* .line 19 */
v3 = com.mobfox.sdk.Base64.map1;
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "i":I
/* .restart local v2 # "i":I */
/* const/16 v4, 0x2f */
/* aput-char v4, v3, v1 */
/* .line 23 */
/* const/16 v3, 0x80 */
/* new-array v3, v3, [B */
/* .line 25 */
int v1 = 0; // const/4 v1, 0x0
} // .end local v2 # "i":I
/* .restart local v1 # "i":I */
} // :goto_3
v3 = com.mobfox.sdk.Base64.map2;
/* array-length v3, v3 */
/* if-ge v1, v3, :cond_3 */
/* .line 26 */
v3 = com.mobfox.sdk.Base64.map2;
int v4 = -1; // const/4 v4, -0x1
/* aput-byte v4, v3, v1 */
/* .line 25 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 27 */
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
} // :goto_4
/* if-ge v1, v6, :cond_4 */
/* .line 28 */
v3 = com.mobfox.sdk.Base64.map2;
v4 = com.mobfox.sdk.Base64.map1;
/* aget-char v4, v4, v1 */
/* int-to-byte v5, v1 */
/* aput-byte v5, v3, v4 */
/* .line 27 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 29 */
} // :cond_4
return;
} // .end method
private com.mobfox.sdk.Base64 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 160 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 161 */
return;
} // .end method
public static decode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 111 */
(( java.lang.String ) p0 ).toCharArray ( ); // invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
com.mobfox.sdk.Base64 .decode ( v0 );
} // .end method
public static decode ( Object[] p0 ) {
/* .locals 23 */
/* .param p0, "in" # [C */
/* .prologue */
/* .line 125 */
/* move-object/from16 v0, p0 */
/* array-length v10, v0 */
/* .line 126 */
/* .local v10, "iLen":I */
/* rem-int/lit8 v20, v10, 0x4 */
if ( v20 != null) { // if-eqz v20, :cond_0
/* .line 127 */
/* new-instance v20, Ljava/lang/IllegalArgumentException; */
final String v21 = "Length of Base64 encoded input string is not a multiple of 4."; // const-string v21, "Length of Base64 encoded input string is not a multiple of 4."
/* invoke-direct/range {v20 ..v21}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v20 */
/* .line 128 */
} // :cond_0
} // :goto_0
/* if-lez v10, :cond_1 */
/* add-int/lit8 v20, v10, -0x1 */
/* aget-char v20, p0, v20 */
/* const/16 v21, 0x3d */
/* move/from16 v0, v20 */
/* move/from16 v1, v21 */
/* if-ne v0, v1, :cond_1 */
/* .line 129 */
/* add-int/lit8 v10, v10, -0x1 */
/* .line 130 */
} // :cond_1
/* mul-int/lit8 v20, v10, 0x3 */
/* div-int/lit8 v16, v20, 0x4 */
/* .line 131 */
/* .local v16, "oLen":I */
/* move/from16 v0, v16 */
/* new-array v0, v0, [B */
/* move-object/from16 v19, v0 */
/* .line 132 */
/* .local v19, "out":[B */
int v11 = 0; // const/4 v11, 0x0
/* .line 133 */
/* .local v11, "ip":I */
/* const/16 v17, 0x0 */
/* .local v17, "op":I */
/* move/from16 v18, v17 */
} // .end local v17 # "op":I
/* .local v18, "op":I */
/* move v12, v11 */
/* .line 134 */
} // .end local v11 # "ip":I
/* .local v12, "ip":I */
} // :goto_1
/* if-ge v12, v10, :cond_8 */
/* .line 135 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "ip":I
/* .restart local v11 # "ip":I */
/* aget-char v6, p0, v12 */
/* .line 136 */
/* .local v6, "i0":I */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "ip":I
/* .restart local v12 # "ip":I */
/* aget-char v7, p0, v11 */
/* .line 137 */
/* .local v7, "i1":I */
/* if-ge v12, v10, :cond_3 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "ip":I
/* .restart local v11 # "ip":I */
/* aget-char v8, p0, v12 */
/* move v12, v11 */
/* .line 138 */
} // .end local v11 # "ip":I
/* .local v8, "i2":I */
/* .restart local v12 # "ip":I */
} // :goto_2
/* if-ge v12, v10, :cond_4 */
/* add-int/lit8 v11, v12, 0x1 */
} // .end local v12 # "ip":I
/* .restart local v11 # "ip":I */
/* aget-char v9, p0, v12 */
/* .line 139 */
/* .local v9, "i3":I */
} // :goto_3
/* const/16 v20, 0x7f */
/* move/from16 v0, v20 */
/* if-gt v6, v0, :cond_2 */
/* const/16 v20, 0x7f */
/* move/from16 v0, v20 */
/* if-gt v7, v0, :cond_2 */
/* const/16 v20, 0x7f */
/* move/from16 v0, v20 */
/* if-gt v8, v0, :cond_2 */
/* const/16 v20, 0x7f */
/* move/from16 v0, v20 */
/* if-le v9, v0, :cond_5 */
/* .line 140 */
} // :cond_2
/* new-instance v20, Ljava/lang/IllegalArgumentException; */
final String v21 = "Illegal character in Base64 encoded data."; // const-string v21, "Illegal character in Base64 encoded data."
/* invoke-direct/range {v20 ..v21}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v20 */
/* .line 137 */
} // .end local v8 # "i2":I
} // .end local v9 # "i3":I
} // .end local v11 # "ip":I
/* .restart local v12 # "ip":I */
} // :cond_3
/* const/16 v8, 0x41 */
/* .line 138 */
/* .restart local v8 # "i2":I */
} // :cond_4
/* const/16 v9, 0x41 */
/* move v11, v12 */
} // .end local v12 # "ip":I
/* .restart local v11 # "ip":I */
/* .line 141 */
/* .restart local v9 # "i3":I */
} // :cond_5
v20 = com.mobfox.sdk.Base64.map2;
/* aget-byte v2, v20, v6 */
/* .line 142 */
/* .local v2, "b0":I */
v20 = com.mobfox.sdk.Base64.map2;
/* aget-byte v3, v20, v7 */
/* .line 143 */
/* .local v3, "b1":I */
v20 = com.mobfox.sdk.Base64.map2;
/* aget-byte v4, v20, v8 */
/* .line 144 */
/* .local v4, "b2":I */
v20 = com.mobfox.sdk.Base64.map2;
/* aget-byte v5, v20, v9 */
/* .line 145 */
/* .local v5, "b3":I */
/* if-ltz v2, :cond_6 */
/* if-ltz v3, :cond_6 */
/* if-ltz v4, :cond_6 */
/* if-gez v5, :cond_7 */
/* .line 146 */
} // :cond_6
/* new-instance v20, Ljava/lang/IllegalArgumentException; */
/* new-instance v21, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v21 ..v21}, Ljava/lang/StringBuilder;-><init>()V */
final String v22 = "Illegal character in Base64 encoded data."; // const-string v22, "Illegal character in Base64 encoded data."
/* invoke-virtual/range {v21 ..v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v21 */
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v21 ..v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-direct/range {v20 ..v21}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v20 */
/* .line 147 */
} // :cond_7
/* shl-int/lit8 v20, v2, 0x2 */
/* ushr-int/lit8 v21, v3, 0x4 */
/* or-int v13, v20, v21 */
/* .line 148 */
/* .local v13, "o0":I */
/* and-int/lit8 v20, v3, 0xf */
/* shl-int/lit8 v20, v20, 0x4 */
/* ushr-int/lit8 v21, v4, 0x2 */
/* or-int v14, v20, v21 */
/* .line 149 */
/* .local v14, "o1":I */
/* and-int/lit8 v20, v4, 0x3 */
/* shl-int/lit8 v20, v20, 0x6 */
/* or-int v15, v20, v5 */
/* .line 150 */
/* .local v15, "o2":I */
/* add-int/lit8 v17, v18, 0x1 */
} // .end local v18 # "op":I
/* .restart local v17 # "op":I */
/* int-to-byte v0, v13 */
/* move/from16 v20, v0 */
/* aput-byte v20, v19, v18 */
/* .line 151 */
/* move/from16 v0, v17 */
/* move/from16 v1, v16 */
/* if-ge v0, v1, :cond_a */
/* .line 152 */
/* add-int/lit8 v18, v17, 0x1 */
} // .end local v17 # "op":I
/* .restart local v18 # "op":I */
/* int-to-byte v0, v14 */
/* move/from16 v20, v0 */
/* aput-byte v20, v19, v17 */
/* .line 153 */
} // :goto_4
/* move/from16 v0, v18 */
/* move/from16 v1, v16 */
/* if-ge v0, v1, :cond_9 */
/* .line 154 */
/* add-int/lit8 v17, v18, 0x1 */
} // .end local v18 # "op":I
/* .restart local v17 # "op":I */
/* int-to-byte v0, v15 */
/* move/from16 v20, v0 */
/* aput-byte v20, v19, v18 */
} // :goto_5
/* move/from16 v18, v17 */
} // .end local v17 # "op":I
/* .restart local v18 # "op":I */
/* move v12, v11 */
/* .line 155 */
} // .end local v11 # "ip":I
/* .restart local v12 # "ip":I */
/* goto/16 :goto_1 */
/* .line 156 */
} // .end local v2 # "b0":I
} // .end local v3 # "b1":I
} // .end local v4 # "b2":I
} // .end local v5 # "b3":I
} // .end local v6 # "i0":I
} // .end local v7 # "i1":I
} // .end local v8 # "i2":I
} // .end local v9 # "i3":I
} // .end local v13 # "o0":I
} // .end local v14 # "o1":I
} // .end local v15 # "o2":I
} // :cond_8
} // .end local v12 # "ip":I
/* .restart local v2 # "b0":I */
/* .restart local v3 # "b1":I */
/* .restart local v4 # "b2":I */
/* .restart local v5 # "b3":I */
/* .restart local v6 # "i0":I */
/* .restart local v7 # "i1":I */
/* .restart local v8 # "i2":I */
/* .restart local v9 # "i3":I */
/* .restart local v11 # "ip":I */
/* .restart local v13 # "o0":I */
/* .restart local v14 # "o1":I */
/* .restart local v15 # "o2":I */
} // :cond_9
/* move/from16 v17, v18 */
} // .end local v18 # "op":I
/* .restart local v17 # "op":I */
} // :cond_a
/* move/from16 v18, v17 */
} // .end local v17 # "op":I
/* .restart local v18 # "op":I */
} // .end method
public static java.lang.String decodeString ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 98 */
/* new-instance v0, Ljava/lang/String; */
com.mobfox.sdk.Base64 .decode ( p0 );
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
} // .end method
public static encode ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "in" # [B */
/* .prologue */
/* .line 51 */
/* array-length v0, p0 */
com.mobfox.sdk.Base64 .encode ( p0,v0 );
} // .end method
public static encode ( Object[] p0, Integer p1 ) {
/* .locals 17 */
/* .param p0, "in" # [B */
/* .param p1, "iLen" # I */
/* .prologue */
/* .line 65 */
/* mul-int/lit8 v15, p1, 0x4 */
/* add-int/lit8 v15, v15, 0x2 */
/* div-int/lit8 v10, v15, 0x3 */
/* .line 66 */
/* .local v10, "oDataLen":I */
/* add-int/lit8 v15, p1, 0x2 */
/* div-int/lit8 v15, v15, 0x3 */
/* mul-int/lit8 v11, v15, 0x4 */
/* .line 67 */
/* .local v11, "oLen":I */
/* new-array v14, v11, [C */
/* .line 68 */
/* .local v14, "out":[C */
int v4 = 0; // const/4 v4, 0x0
/* .line 69 */
/* .local v4, "ip":I */
int v12 = 0; // const/4 v12, 0x0
/* .local v12, "op":I */
/* move v13, v12 */
} // .end local v12 # "op":I
/* .local v13, "op":I */
/* move v5, v4 */
/* .line 70 */
} // .end local v4 # "ip":I
/* .local v5, "ip":I */
} // :goto_0
/* move/from16 v0, p1 */
/* if-ge v5, v0, :cond_4 */
/* .line 71 */
/* add-int/lit8 v4, v5, 0x1 */
} // .end local v5 # "ip":I
/* .restart local v4 # "ip":I */
/* aget-byte v15, p0, v5 */
/* and-int/lit16 v1, v15, 0xff */
/* .line 72 */
/* .local v1, "i0":I */
/* move/from16 v0, p1 */
/* if-ge v4, v0, :cond_0 */
/* add-int/lit8 v5, v4, 0x1 */
} // .end local v4 # "ip":I
/* .restart local v5 # "ip":I */
/* aget-byte v15, p0, v4 */
/* and-int/lit16 v2, v15, 0xff */
/* .line 73 */
/* .local v2, "i1":I */
} // :goto_1
/* move/from16 v0, p1 */
/* if-ge v5, v0, :cond_1 */
/* add-int/lit8 v4, v5, 0x1 */
} // .end local v5 # "ip":I
/* .restart local v4 # "ip":I */
/* aget-byte v15, p0, v5 */
/* and-int/lit16 v3, v15, 0xff */
/* .line 74 */
/* .local v3, "i2":I */
} // :goto_2
/* ushr-int/lit8 v6, v1, 0x2 */
/* .line 75 */
/* .local v6, "o0":I */
/* and-int/lit8 v15, v1, 0x3 */
/* shl-int/lit8 v15, v15, 0x4 */
/* ushr-int/lit8 v16, v2, 0x4 */
/* or-int v7, v15, v16 */
/* .line 76 */
/* .local v7, "o1":I */
/* and-int/lit8 v15, v2, 0xf */
/* shl-int/lit8 v15, v15, 0x2 */
/* ushr-int/lit8 v16, v3, 0x6 */
/* or-int v8, v15, v16 */
/* .line 77 */
/* .local v8, "o2":I */
/* and-int/lit8 v9, v3, 0x3f */
/* .line 78 */
/* .local v9, "o3":I */
/* add-int/lit8 v12, v13, 0x1 */
} // .end local v13 # "op":I
/* .restart local v12 # "op":I */
v15 = com.mobfox.sdk.Base64.map1;
/* aget-char v15, v15, v6 */
/* aput-char v15, v14, v13 */
/* .line 79 */
/* add-int/lit8 v13, v12, 0x1 */
} // .end local v12 # "op":I
/* .restart local v13 # "op":I */
v15 = com.mobfox.sdk.Base64.map1;
/* aget-char v15, v15, v7 */
/* aput-char v15, v14, v12 */
/* .line 80 */
/* if-ge v13, v10, :cond_2 */
v15 = com.mobfox.sdk.Base64.map1;
/* aget-char v15, v15, v8 */
} // :goto_3
/* aput-char v15, v14, v13 */
/* .line 81 */
/* add-int/lit8 v12, v13, 0x1 */
/* .line 82 */
} // .end local v13 # "op":I
/* .restart local v12 # "op":I */
/* if-ge v12, v10, :cond_3 */
v15 = com.mobfox.sdk.Base64.map1;
/* aget-char v15, v15, v9 */
} // :goto_4
/* aput-char v15, v14, v12 */
/* .line 83 */
/* add-int/lit8 v12, v12, 0x1 */
/* move v13, v12 */
} // .end local v12 # "op":I
/* .restart local v13 # "op":I */
/* move v5, v4 */
/* .line 84 */
} // .end local v4 # "ip":I
/* .restart local v5 # "ip":I */
/* .line 72 */
} // .end local v2 # "i1":I
} // .end local v3 # "i2":I
} // .end local v5 # "ip":I
} // .end local v6 # "o0":I
} // .end local v7 # "o1":I
} // .end local v8 # "o2":I
} // .end local v9 # "o3":I
/* .restart local v4 # "ip":I */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* move v5, v4 */
} // .end local v4 # "ip":I
/* .restart local v5 # "ip":I */
/* .line 73 */
/* .restart local v2 # "i1":I */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* move v4, v5 */
} // .end local v5 # "ip":I
/* .restart local v4 # "ip":I */
/* .line 80 */
/* .restart local v3 # "i2":I */
/* .restart local v6 # "o0":I */
/* .restart local v7 # "o1":I */
/* .restart local v8 # "o2":I */
/* .restart local v9 # "o3":I */
} // :cond_2
/* const/16 v15, 0x3d */
/* .line 82 */
} // .end local v13 # "op":I
/* .restart local v12 # "op":I */
} // :cond_3
/* const/16 v15, 0x3d */
/* .line 85 */
} // .end local v1 # "i0":I
} // .end local v2 # "i1":I
} // .end local v3 # "i2":I
} // .end local v4 # "ip":I
} // .end local v6 # "o0":I
} // .end local v7 # "o1":I
} // .end local v8 # "o2":I
} // .end local v9 # "o3":I
} // .end local v12 # "op":I
/* .restart local v5 # "ip":I */
/* .restart local v13 # "op":I */
} // :cond_4
} // .end method
public static java.lang.String encodeString ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 39 */
/* new-instance v0, Ljava/lang/String; */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
com.mobfox.sdk.Base64 .encode ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
} // .end method
