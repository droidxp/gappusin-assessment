public class org.apache.commons.codec.binary.BinaryCodec implements org.apache.commons.codec.BinaryDecoder implements org.apache.commons.codec.BinaryEncoder {
	 /* .source "BinaryCodec.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final BITS;
	 private static final Integer BIT_0;
	 private static final Integer BIT_1;
	 private static final Integer BIT_2;
	 private static final Integer BIT_3;
	 private static final Integer BIT_4;
	 private static final Integer BIT_5;
	 private static final Integer BIT_6;
	 private static final Integer BIT_7;
	 private static final EMPTY_BYTE_ARRAY;
	 private static final EMPTY_CHAR_ARRAY;
	 /* # direct methods */
	 static org.apache.commons.codec.binary.BinaryCodec ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 42 */
		 /* new-array v0, v1, [C */
		 /* .line 45 */
		 /* new-array v0, v1, [B */
		 /* .line 71 */
		 /* const/16 v0, 0x8 */
		 /* new-array v0, v0, [I */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x1 */
		 /* 0x2 */
		 /* 0x4 */
		 /* 0x8 */
		 /* 0x10 */
		 /* 0x20 */
		 /* 0x40 */
		 /* 0x80 */
	 } // .end array-data
} // .end method
public org.apache.commons.codec.binary.BinaryCodec ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 36 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static fromAscii ( Object[] p0 ) {
	 /* .locals 6 */
	 /* .param p0, "ascii" # [B */
	 /* .prologue */
	 /* .line 199 */
	 v4 = 	 org.apache.commons.codec.binary.BinaryCodec .isEmpty ( p0 );
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 /* .line 200 */
		 v3 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY;
		 /* .line 215 */
	 } // :cond_0
	 /* .line 203 */
} // :cond_1
/* array-length v4, p0 */
/* shr-int/lit8 v4, v4, 0x3 */
/* new-array v3, v4, [B */
/* .line 208 */
/* .local v3, "l_raw":[B */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "ii":I */
/* array-length v4, p0 */
/* add-int/lit8 v2, v4, -0x1 */
/* .local v2, "jj":I */
} // :goto_0
/* array-length v4, v3 */
/* if-ge v1, v4, :cond_0 */
/* .line 209 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "bits":I */
} // :goto_1
v4 = org.apache.commons.codec.binary.BinaryCodec.BITS;
/* array-length v4, v4 */
/* if-ge v0, v4, :cond_3 */
/* .line 210 */
/* sub-int v4, v2, v0 */
/* aget-byte v4, p0, v4 */
/* const/16 v5, 0x31 */
/* if-ne v4, v5, :cond_2 */
/* .line 211 */
/* aget-byte v4, v3, v1 */
v5 = org.apache.commons.codec.binary.BinaryCodec.BITS;
/* aget v5, v5, v0 */
/* or-int/2addr v4, v5 */
/* int-to-byte v4, v4 */
/* aput-byte v4, v3, v1 */
/* .line 209 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
/* .line 208 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
/* add-int/lit8 v2, v2, -0x8 */
} // .end method
public static fromAscii ( Object[] p0 ) {
/* .locals 6 */
/* .param p0, "ascii" # [C */
/* .prologue */
/* .line 172 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v4, p0 */
/* if-nez v4, :cond_2 */
/* .line 173 */
} // :cond_0
v3 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY;
/* .line 188 */
} // :cond_1
/* .line 176 */
} // :cond_2
/* array-length v4, p0 */
/* shr-int/lit8 v4, v4, 0x3 */
/* new-array v3, v4, [B */
/* .line 181 */
/* .local v3, "l_raw":[B */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "ii":I */
/* array-length v4, p0 */
/* add-int/lit8 v2, v4, -0x1 */
/* .local v2, "jj":I */
} // :goto_0
/* array-length v4, v3 */
/* if-ge v1, v4, :cond_1 */
/* .line 182 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "bits":I */
} // :goto_1
v4 = org.apache.commons.codec.binary.BinaryCodec.BITS;
/* array-length v4, v4 */
/* if-ge v0, v4, :cond_4 */
/* .line 183 */
/* sub-int v4, v2, v0 */
/* aget-char v4, p0, v4 */
/* const/16 v5, 0x31 */
/* if-ne v4, v5, :cond_3 */
/* .line 184 */
/* aget-byte v4, v3, v1 */
v5 = org.apache.commons.codec.binary.BinaryCodec.BITS;
/* aget v5, v5, v0 */
/* or-int/2addr v4, v5 */
/* int-to-byte v4, v4 */
/* aput-byte v4, v3, v1 */
/* .line 182 */
} // :cond_3
/* add-int/lit8 v0, v0, 0x1 */
/* .line 181 */
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
/* add-int/lit8 v2, v2, -0x8 */
} // .end method
private static Boolean isEmpty ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "array" # [B */
/* .prologue */
/* .line 226 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v0, p0 */
/* if-nez v0, :cond_1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static toAsciiBytes ( Object[] p0 ) {
/* .locals 6 */
/* .param p0, "raw" # [B */
/* .prologue */
/* .line 239 */
v4 = org.apache.commons.codec.binary.BinaryCodec .isEmpty ( p0 );
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 240 */
v3 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY;
/* .line 257 */
} // :cond_0
/* .line 243 */
} // :cond_1
/* array-length v4, p0 */
/* shl-int/lit8 v4, v4, 0x3 */
/* new-array v3, v4, [B */
/* .line 248 */
/* .local v3, "l_ascii":[B */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "ii":I */
/* array-length v4, v3 */
/* add-int/lit8 v2, v4, -0x1 */
/* .local v2, "jj":I */
} // :goto_0
/* array-length v4, p0 */
/* if-ge v1, v4, :cond_0 */
/* .line 249 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "bits":I */
} // :goto_1
v4 = org.apache.commons.codec.binary.BinaryCodec.BITS;
/* array-length v4, v4 */
/* if-ge v0, v4, :cond_3 */
/* .line 250 */
/* aget-byte v4, p0, v1 */
v5 = org.apache.commons.codec.binary.BinaryCodec.BITS;
/* aget v5, v5, v0 */
/* and-int/2addr v4, v5 */
/* if-nez v4, :cond_2 */
/* .line 251 */
/* sub-int v4, v2, v0 */
/* const/16 v5, 0x30 */
/* aput-byte v5, v3, v4 */
/* .line 249 */
} // :goto_2
/* add-int/lit8 v0, v0, 0x1 */
/* .line 253 */
} // :cond_2
/* sub-int v4, v2, v0 */
/* const/16 v5, 0x31 */
/* aput-byte v5, v3, v4 */
/* .line 248 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
/* add-int/lit8 v2, v2, -0x8 */
} // .end method
public static toAsciiChars ( Object[] p0 ) {
/* .locals 6 */
/* .param p0, "raw" # [B */
/* .prologue */
/* .line 269 */
v4 = org.apache.commons.codec.binary.BinaryCodec .isEmpty ( p0 );
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 270 */
v3 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_CHAR_ARRAY;
/* .line 287 */
} // :cond_0
/* .line 273 */
} // :cond_1
/* array-length v4, p0 */
/* shl-int/lit8 v4, v4, 0x3 */
/* new-array v3, v4, [C */
/* .line 278 */
/* .local v3, "l_ascii":[C */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "ii":I */
/* array-length v4, v3 */
/* add-int/lit8 v2, v4, -0x1 */
/* .local v2, "jj":I */
} // :goto_0
/* array-length v4, p0 */
/* if-ge v1, v4, :cond_0 */
/* .line 279 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "bits":I */
} // :goto_1
v4 = org.apache.commons.codec.binary.BinaryCodec.BITS;
/* array-length v4, v4 */
/* if-ge v0, v4, :cond_3 */
/* .line 280 */
/* aget-byte v4, p0, v1 */
v5 = org.apache.commons.codec.binary.BinaryCodec.BITS;
/* aget v5, v5, v0 */
/* and-int/2addr v4, v5 */
/* if-nez v4, :cond_2 */
/* .line 281 */
/* sub-int v4, v2, v0 */
/* const/16 v5, 0x30 */
/* aput-char v5, v3, v4 */
/* .line 279 */
} // :goto_2
/* add-int/lit8 v0, v0, 0x1 */
/* .line 283 */
} // :cond_2
/* sub-int v4, v2, v0 */
/* const/16 v5, 0x31 */
/* aput-char v5, v3, v4 */
/* .line 278 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
/* add-int/lit8 v2, v2, -0x8 */
} // .end method
public static java.lang.String toAsciiString ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "raw" # [B */
/* .prologue */
/* .line 299 */
/* new-instance v0, Ljava/lang/String; */
org.apache.commons.codec.binary.BinaryCodec .toAsciiChars ( p0 );
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
} // .end method
/* # virtual methods */
public java.lang.Object decode ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "ascii" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 116 */
/* if-nez p1, :cond_0 */
/* .line 117 */
v0 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY;
/* .line 126 */
} // .end local p1 # "ascii":Ljava/lang/Object;
} // :goto_0
/* .line 119 */
/* .restart local p1 # "ascii":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, [B */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 120 */
/* check-cast p1, [B */
} // .end local p1 # "ascii":Ljava/lang/Object;
/* check-cast p1, [B */
org.apache.commons.codec.binary.BinaryCodec .fromAscii ( p1 );
/* .line 122 */
/* .restart local p1 # "ascii":Ljava/lang/Object; */
} // :cond_1
/* instance-of v0, p1, [C */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 123 */
/* check-cast p1, [C */
} // .end local p1 # "ascii":Ljava/lang/Object;
/* check-cast p1, [C */
org.apache.commons.codec.binary.BinaryCodec .fromAscii ( p1 );
/* .line 125 */
/* .restart local p1 # "ascii":Ljava/lang/Object; */
} // :cond_2
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 126 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "ascii":Ljava/lang/Object;
(( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
org.apache.commons.codec.binary.BinaryCodec .fromAscii ( v0 );
/* .line 128 */
/* .restart local p1 # "ascii":Ljava/lang/Object; */
} // :cond_3
/* new-instance v0, Lorg/apache/commons/codec/DecoderException; */
final String v1 = "argument not a byte array"; // const-string v1, "argument not a byte array"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public decode ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "ascii" # [B */
/* .prologue */
/* .line 141 */
org.apache.commons.codec.binary.BinaryCodec .fromAscii ( p1 );
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "raw" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 98 */
/* instance-of v0, p1, [B */
/* if-nez v0, :cond_0 */
/* .line 99 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "argument not a byte array"; // const-string v1, "argument not a byte array"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 101 */
} // :cond_0
/* check-cast p1, [B */
} // .end local p1 # "raw":Ljava/lang/Object;
/* check-cast p1, [B */
org.apache.commons.codec.binary.BinaryCodec .toAsciiChars ( p1 );
} // .end method
public encode ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "raw" # [B */
/* .prologue */
/* .line 83 */
org.apache.commons.codec.binary.BinaryCodec .toAsciiBytes ( p1 );
} // .end method
public toByteArray ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "ascii" # Ljava/lang/String; */
/* .prologue */
/* .line 153 */
/* if-nez p1, :cond_0 */
/* .line 154 */
v0 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY;
/* .line 156 */
} // :goto_0
} // :cond_0
(( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
org.apache.commons.codec.binary.BinaryCodec .fromAscii ( v0 );
} // .end method
