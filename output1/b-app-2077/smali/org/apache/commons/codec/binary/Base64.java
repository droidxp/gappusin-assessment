public class org.apache.commons.codec.binary.Base64 extends org.apache.commons.codec.binary.BaseNCodec {
	 /* .source "Base64.java" */
	 /* # static fields */
	 private static final Integer BITS_PER_ENCODED_BYTE;
	 private static final Integer BYTES_PER_ENCODED_BLOCK;
	 private static final Integer BYTES_PER_UNENCODED_BLOCK;
	 static final CHUNK_SEPARATOR;
	 private static final DECODE_TABLE;
	 private static final Integer MASK_6BITS;
	 private static final STANDARD_ENCODE_TABLE;
	 private static final URL_SAFE_ENCODE_TABLE;
	 /* # instance fields */
	 private final Integer decodeSize;
	 private final decodeTable;
	 private final Integer encodeSize;
	 private final encodeTable;
	 private final lineSeparator;
	 /* # direct methods */
	 static org.apache.commons.codec.binary.Base64 ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const/16 v1, 0x40 */
		 /* .line 71 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [B */
		 /* fill-array-data v0, :array_0 */
		 /* .line 80 */
		 /* new-array v0, v1, [B */
		 /* fill-array-data v0, :array_1 */
		 /* .line 93 */
		 /* new-array v0, v1, [B */
		 /* fill-array-data v0, :array_2 */
		 /* .line 112 */
		 /* const/16 v0, 0x7b */
		 /* new-array v0, v0, [B */
		 /* fill-array-data v0, :array_3 */
		 return;
		 /* .line 71 */
		 /* :array_0 */
		 /* .array-data 1 */
		 /* 0xdt */
		 /* 0xat */
	 } // .end array-data
	 /* .line 80 */
	 /* nop */
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
	 /* 0x2bt */
	 /* 0x2ft */
} // .end array-data
/* .line 93 */
/* :array_2 */
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
/* .line 112 */
/* :array_3 */
/* .array-data 1 */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* 0x3et */
/* -0x1t */
/* 0x3et */
/* -0x1t */
/* 0x3ft */
/* 0x34t */
/* 0x35t */
/* 0x36t */
/* 0x37t */
/* 0x38t */
/* 0x39t */
/* 0x3at */
/* 0x3bt */
/* 0x3ct */
/* 0x3dt */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* 0x0t */
/* 0x1t */
/* 0x2t */
/* 0x3t */
/* 0x4t */
/* 0x5t */
/* 0x6t */
/* 0x7t */
/* 0x8t */
/* 0x9t */
/* 0xat */
/* 0xbt */
/* 0xct */
/* 0xdt */
/* 0xet */
/* 0xft */
/* 0x10t */
/* 0x11t */
/* 0x12t */
/* 0x13t */
/* 0x14t */
/* 0x15t */
/* 0x16t */
/* 0x17t */
/* 0x18t */
/* 0x19t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* -0x1t */
/* 0x3ft */
/* -0x1t */
/* 0x1at */
/* 0x1bt */
/* 0x1ct */
/* 0x1dt */
/* 0x1et */
/* 0x1ft */
/* 0x20t */
/* 0x21t */
/* 0x22t */
/* 0x23t */
/* 0x24t */
/* 0x25t */
/* 0x26t */
/* 0x27t */
/* 0x28t */
/* 0x29t */
/* 0x2at */
/* 0x2bt */
/* 0x2ct */
/* 0x2dt */
/* 0x2et */
/* 0x2ft */
/* 0x30t */
/* 0x31t */
/* 0x32t */
/* 0x33t */
} // .end array-data
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 170 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/binary/Base64;-><init>(I)V */
/* .line 171 */
return;
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 1 */
/* .param p1, "lineLength" # I */
/* .prologue */
/* .line 212 */
v0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
/* invoke-direct {p0, p1, v0}, Lorg/apache/commons/codec/binary/Base64;-><init>(I[B)V */
/* .line 213 */
return;
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 1 */
/* .param p1, "lineLength" # I */
/* .param p2, "lineSeparator" # [B */
/* .prologue */
/* .line 239 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/codec/binary/Base64;-><init>(I[BZ)V */
/* .line 240 */
return;
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 6 */
/* .param p1, "lineLength" # I */
/* .param p2, "lineSeparator" # [B */
/* .param p3, "urlSafe" # Z */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
int v4 = 4; // const/4 v4, 0x4
int v2 = 0; // const/4 v2, 0x0
/* .line 270 */
int v3 = 3; // const/4 v3, 0x3
/* if-nez p2, :cond_0 */
/* move v1, v2 */
} // :goto_0
/* invoke-direct {p0, v3, v4, p1, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;-><init>(IIII)V */
/* .line 140 */
v1 = org.apache.commons.codec.binary.Base64.DECODE_TABLE;
this.decodeTable = v1;
/* .line 275 */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 276 */
v1 = (( org.apache.commons.codec.binary.Base64 ) p0 ).containsAlphabetOrPad ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/binary/Base64;->containsAlphabetOrPad([B)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 277 */
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( p2 );
/* .line 278 */
/* .local v0, "sep":Ljava/lang/String; */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "lineSeparator must not contain base64 characters: ["; // const-string v3, "lineSeparator must not contain base64 characters: ["
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "]"; // const-string v3, "]"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 270 */
} // .end local v0 # "sep":Ljava/lang/String;
} // :cond_0
/* array-length v1, p2 */
/* .line 280 */
} // :cond_1
/* if-lez p1, :cond_2 */
/* .line 281 */
/* array-length v1, p2 */
/* add-int/lit8 v1, v1, 0x4 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* .line 282 */
/* array-length v1, p2 */
/* new-array v1, v1, [B */
this.lineSeparator = v1;
/* .line 283 */
v1 = this.lineSeparator;
/* array-length v3, p2 */
java.lang.System .arraycopy ( p2,v2,v1,v2,v3 );
/* .line 292 */
} // :goto_1
/* iget v1, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->decodeSize:I */
/* .line 293 */
if ( p3 != null) { // if-eqz p3, :cond_4
v1 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE;
} // :goto_2
this.encodeTable = v1;
/* .line 294 */
return;
/* .line 285 */
} // :cond_2
/* iput v4, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* .line 286 */
this.lineSeparator = v5;
/* .line 289 */
} // :cond_3
/* iput v4, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* .line 290 */
this.lineSeparator = v5;
/* .line 293 */
} // :cond_4
v1 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE;
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 2 */
/* .param p1, "urlSafe" # Z */
/* .prologue */
/* .line 189 */
/* const/16 v0, 0x4c */
v1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
/* invoke-direct {p0, v0, v1, p1}, Lorg/apache/commons/codec/binary/Base64;-><init>(I[BZ)V */
/* .line 190 */
return;
} // .end method
public static decodeBase64 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "base64String" # Ljava/lang/String; */
/* .prologue */
/* .line 686 */
/* new-instance v0, Lorg/apache/commons/codec/binary/Base64; */
/* invoke-direct {v0}, Lorg/apache/commons/codec/binary/Base64;-><init>()V */
(( org.apache.commons.codec.binary.Base64 ) v0 ).decode ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/commons/codec/binary/Base64;->decode(Ljava/lang/String;)[B
} // .end method
public static decodeBase64 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "base64Data" # [B */
/* .prologue */
/* .line 697 */
/* new-instance v0, Lorg/apache/commons/codec/binary/Base64; */
/* invoke-direct {v0}, Lorg/apache/commons/codec/binary/Base64;-><init>()V */
(( org.apache.commons.codec.binary.Base64 ) v0 ).decode ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/commons/codec/binary/Base64;->decode([B)[B
} // .end method
public static java.math.BigInteger decodeInteger ( Object[] p0 ) {
/* .locals 3 */
/* .param p0, "pArray" # [B */
/* .prologue */
/* .line 712 */
/* new-instance v0, Ljava/math/BigInteger; */
int v1 = 1; // const/4 v1, 0x1
org.apache.commons.codec.binary.Base64 .decodeBase64 ( p0 );
/* invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(I[B)V */
} // .end method
public static encodeBase64 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 551 */
int v0 = 0; // const/4 v0, 0x0
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0 );
} // .end method
public static encodeBase64 ( Object[] p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .param p1, "isChunked" # Z */
/* .prologue */
/* .line 618 */
int v0 = 0; // const/4 v0, 0x0
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,p1,v0 );
} // .end method
public static encodeBase64 ( Object[] p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .param p1, "isChunked" # Z */
/* .param p2, "urlSafe" # Z */
/* .prologue */
/* .line 637 */
/* const v0, 0x7fffffff */
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,p1,p2,v0 );
} // .end method
public static encodeBase64 ( Object[] p0, Boolean p1, Boolean p2, Integer p3 ) {
/* .locals 6 */
/* .param p0, "binaryData" # [B */
/* .param p1, "isChunked" # Z */
/* .param p2, "urlSafe" # Z */
/* .param p3, "maxResultSize" # I */
/* .prologue */
/* .line 659 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v3, p0 */
/* if-nez v3, :cond_1 */
/* .line 674 */
} // .end local p0 # "binaryData":[B
} // :cond_0
} // :goto_0
/* .line 665 */
/* .restart local p0 # "binaryData":[B */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* new-instance v0, Lorg/apache/commons/codec/binary/Base64; */
/* invoke-direct {v0, p2}, Lorg/apache/commons/codec/binary/Base64;-><init>(Z)V */
/* .line 666 */
/* .local v0, "b64":Lorg/apache/commons/codec/binary/Base64; */
} // :goto_1
(( org.apache.commons.codec.binary.Base64 ) v0 ).getEncodedLength ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/commons/codec/binary/Base64;->getEncodedLength([B)J
/* move-result-wide v1 */
/* .line 667 */
/* .local v1, "len":J */
/* int-to-long v3, p3 */
/* cmp-long v3, v1, v3 */
/* if-lez v3, :cond_3 */
/* .line 668 */
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Input array too big, the output array would be bigger ("; // const-string v5, "Input array too big, the output array would be bigger ("
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1, v2 ); // invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v5 = ") than the specified maximum size of "; // const-string v5, ") than the specified maximum size of "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p3 ); // invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v3 */
/* .line 665 */
} // .end local v0 # "b64":Lorg/apache/commons/codec/binary/Base64;
} // .end local v1 # "len":J
} // :cond_2
/* new-instance v0, Lorg/apache/commons/codec/binary/Base64; */
int v3 = 0; // const/4 v3, 0x0
v4 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
/* invoke-direct {v0, v3, v4, p2}, Lorg/apache/commons/codec/binary/Base64;-><init>(I[BZ)V */
/* .line 674 */
/* .restart local v0 # "b64":Lorg/apache/commons/codec/binary/Base64; */
/* .restart local v1 # "len":J */
} // :cond_3
(( org.apache.commons.codec.binary.Base64 ) v0 ).encode ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/commons/codec/binary/Base64;->encode([B)[B
} // .end method
public static encodeBase64Chunked ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 603 */
int v0 = 1; // const/4 v0, 0x1
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0 );
} // .end method
public static java.lang.String encodeBase64String ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 566 */
int v0 = 0; // const/4 v0, 0x0
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0 );
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( v0 );
} // .end method
public static encodeBase64URLSafe ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 579 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0,v1 );
} // .end method
public static java.lang.String encodeBase64URLSafeString ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 592 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0,v1 );
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( v0 );
} // .end method
public static encodeInteger ( java.math.BigInteger p0 ) {
/* .locals 2 */
/* .param p0, "bigInt" # Ljava/math/BigInteger; */
/* .prologue */
/* .line 726 */
/* if-nez p0, :cond_0 */
/* .line 727 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "encodeInteger called with null parameter"; // const-string v1, "encodeInteger called with null parameter"
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 729 */
} // :cond_0
org.apache.commons.codec.binary.Base64 .toIntegerBytes ( p0 );
int v1 = 0; // const/4 v1, 0x0
org.apache.commons.codec.binary.Base64 .encodeBase64 ( v0,v1 );
} // .end method
public static Boolean isArrayByteBase64 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "arrayOctet" # [B */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 495 */
v0 = org.apache.commons.codec.binary.Base64 .isBase64 ( p0 );
} // .end method
public static Boolean isBase64 ( Object p0 ) {
/* .locals 2 */
/* .param p0, "octet" # B */
/* .prologue */
/* .line 507 */
/* const/16 v0, 0x3d */
/* if-eq p0, v0, :cond_0 */
/* if-ltz p0, :cond_1 */
v0 = org.apache.commons.codec.binary.Base64.DECODE_TABLE;
/* array-length v0, v0 */
/* if-ge p0, v0, :cond_1 */
v0 = org.apache.commons.codec.binary.Base64.DECODE_TABLE;
/* aget-byte v0, v0, p0 */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean isBase64 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "base64" # Ljava/lang/String; */
/* .prologue */
/* .line 521 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p0 );
v0 = org.apache.commons.codec.binary.Base64 .isBase64 ( v0 );
} // .end method
public static Boolean isBase64 ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "arrayOctet" # [B */
/* .prologue */
/* .line 535 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v1, p0 */
/* if-ge v0, v1, :cond_1 */
/* .line 536 */
/* aget-byte v1, p0, v0 */
v1 = org.apache.commons.codec.binary.Base64 .isBase64 ( v1 );
/* if-nez v1, :cond_0 */
/* aget-byte v1, p0, v0 */
v1 = org.apache.commons.codec.binary.Base64 .isWhiteSpace ( v1 );
/* if-nez v1, :cond_0 */
/* .line 537 */
int v1 = 0; // const/4 v1, 0x0
/* .line 540 */
} // :goto_1
/* .line 535 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 540 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // .end method
static toIntegerBytes ( java.math.BigInteger p0 ) {
/* .locals 8 */
/* .param p0, "bigInt" # Ljava/math/BigInteger; */
/* .prologue */
/* .line 740 */
v1 = (( java.math.BigInteger ) p0 ).bitLength ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I
/* .line 742 */
/* .local v1, "bitlen":I */
/* add-int/lit8 v6, v1, 0x7 */
/* shr-int/lit8 v6, v6, 0x3 */
/* shl-int/lit8 v1, v6, 0x3 */
/* .line 743 */
(( java.math.BigInteger ) p0 ).toByteArray ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B
/* .line 745 */
/* .local v0, "bigBytes":[B */
v6 = (( java.math.BigInteger ) p0 ).bitLength ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I
/* rem-int/lit8 v6, v6, 0x8 */
if ( v6 != null) { // if-eqz v6, :cond_0
v6 = (( java.math.BigInteger ) p0 ).bitLength ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I
/* div-int/lit8 v6, v6, 0x8 */
/* add-int/lit8 v6, v6, 0x1 */
/* div-int/lit8 v7, v1, 0x8 */
/* if-ne v6, v7, :cond_0 */
/* .line 760 */
} // .end local v0 # "bigBytes":[B
} // :goto_0
/* .line 749 */
/* .restart local v0 # "bigBytes":[B */
} // :cond_0
int v5 = 0; // const/4 v5, 0x0
/* .line 750 */
/* .local v5, "startSrc":I */
/* array-length v2, v0 */
/* .line 753 */
/* .local v2, "len":I */
v6 = (( java.math.BigInteger ) p0 ).bitLength ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I
/* rem-int/lit8 v6, v6, 0x8 */
/* if-nez v6, :cond_1 */
/* .line 754 */
int v5 = 1; // const/4 v5, 0x1
/* .line 755 */
/* add-int/lit8 v2, v2, -0x1 */
/* .line 757 */
} // :cond_1
/* div-int/lit8 v6, v1, 0x8 */
/* sub-int v4, v6, v2 */
/* .line 758 */
/* .local v4, "startDst":I */
/* div-int/lit8 v6, v1, 0x8 */
/* new-array v3, v6, [B */
/* .line 759 */
/* .local v3, "resizedBytes":[B */
java.lang.System .arraycopy ( v0,v5,v3,v4,v2 );
/* move-object v0, v3 */
/* .line 760 */
} // .end method
/* # virtual methods */
void decode ( Object[] p0, Integer p1, Integer p2, org.apache.commons.codec.binary.BaseNCodec$Context p3 ) {
/* .locals 8 */
/* .param p1, "in" # [B */
/* .param p2, "inPos" # I */
/* .param p3, "inAvail" # I */
/* .param p4, "context" # Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
/* .line 426 */
/* iget-boolean v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->eof:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 481 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
return;
/* .line 429 */
} // :cond_1
/* if-gez p3, :cond_2 */
/* .line 430 */
/* iput-boolean v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->eof:Z */
/* .line 432 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
/* move v3, p2 */
} // .end local p2 # "inPos":I
/* .local v3, "inPos":I */
} // :goto_1
/* if-ge v2, p3, :cond_5 */
/* .line 433 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->decodeSize:I */
(( org.apache.commons.codec.binary.Base64 ) p0 ).ensureBufferSize ( v5, p4 ); // invoke-virtual {p0, v5, p4}, Lorg/apache/commons/codec/binary/Base64;->ensureBufferSize(ILorg/apache/commons/codec/binary/BaseNCodec$Context;)[B
/* .line 434 */
/* .local v1, "buffer":[B */
/* add-int/lit8 p2, v3, 0x1 */
} // .end local v3 # "inPos":I
/* .restart local p2 # "inPos":I */
/* aget-byte v0, p1, v3 */
/* .line 435 */
/* .local v0, "b":B */
/* const/16 v5, 0x3d */
/* if-ne v0, v5, :cond_3 */
/* .line 437 */
/* iput-boolean v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->eof:Z */
/* .line 458 */
} // .end local v0 # "b":B
} // .end local v1 # "buffer":[B
} // :goto_2
/* iget-boolean v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->eof:Z */
if ( v5 != null) { // if-eqz v5, :cond_0
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 459 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->decodeSize:I */
(( org.apache.commons.codec.binary.Base64 ) p0 ).ensureBufferSize ( v5, p4 ); // invoke-virtual {p0, v5, p4}, Lorg/apache/commons/codec/binary/Base64;->ensureBufferSize(ILorg/apache/commons/codec/binary/BaseNCodec$Context;)[B
/* .line 463 */
/* .restart local v1 # "buffer":[B */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* packed-switch v5, :pswitch_data_0 */
/* .line 478 */
/* new-instance v5, Ljava/lang/IllegalStateException; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Impossible modulus "; // const-string v7, "Impossible modulus "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
/* .line 440 */
/* .restart local v0 # "b":B */
} // :cond_3
/* if-ltz v0, :cond_4 */
v5 = org.apache.commons.codec.binary.Base64.DECODE_TABLE;
/* array-length v5, v5 */
/* if-ge v0, v5, :cond_4 */
/* .line 441 */
v5 = org.apache.commons.codec.binary.Base64.DECODE_TABLE;
/* aget-byte v4, v5, v0 */
/* .line 442 */
/* .local v4, "result":I */
/* if-ltz v4, :cond_4 */
/* .line 443 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* add-int/lit8 v5, v5, 0x1 */
/* rem-int/lit8 v5, v5, 0x4 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* .line 444 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shl-int/lit8 v5, v5, 0x6 */
/* add-int/2addr v5, v4 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* .line 445 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* if-nez v5, :cond_4 */
/* .line 446 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v6, v6, 0x10 */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v1, v5 */
/* .line 447 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v6, v6, 0x8 */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v1, v5 */
/* .line 448 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v1, v5 */
/* .line 432 */
} // .end local v4 # "result":I
} // :cond_4
/* add-int/lit8 v2, v2, 0x1 */
/* move v3, p2 */
} // .end local p2 # "inPos":I
/* .restart local v3 # "inPos":I */
/* goto/16 :goto_1 */
/* .line 469 */
} // .end local v0 # "b":B
} // .end local v3 # "inPos":I
/* .restart local p2 # "inPos":I */
/* :pswitch_1 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v5, v5, 0x4 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* .line 470 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v1, v5 */
/* goto/16 :goto_0 */
/* .line 473 */
/* :pswitch_2 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v5, v5, 0x2 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* .line 474 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v6, v6, 0x8 */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v1, v5 */
/* .line 475 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v1, v5 */
/* goto/16 :goto_0 */
} // .end local v1 # "buffer":[B
} // .end local p2 # "inPos":I
/* .restart local v3 # "inPos":I */
} // :cond_5
/* move p2, v3 */
} // .end local v3 # "inPos":I
/* .restart local p2 # "inPos":I */
/* goto/16 :goto_2 */
/* .line 463 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
void encode ( Object[] p0, Integer p1, Integer p2, org.apache.commons.codec.binary.BaseNCodec$Context p3 ) {
/* .locals 10 */
/* .param p1, "in" # [B */
/* .param p2, "inPos" # I */
/* .param p3, "inAvail" # I */
/* .param p4, "context" # Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* .prologue */
/* const/16 v9, 0x3d */
int v8 = 0; // const/4 v8, 0x0
/* .line 329 */
/* iget-boolean v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->eof:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 397 */
} // :cond_0
} // :goto_0
return;
/* .line 334 */
} // :cond_1
/* if-gez p3, :cond_4 */
/* .line 335 */
int v5 = 1; // const/4 v5, 0x1
/* iput-boolean v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->eof:Z */
/* .line 336 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* if-nez v5, :cond_2 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 339 */
} // :cond_2
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
(( org.apache.commons.codec.binary.Base64 ) p0 ).ensureBufferSize ( v5, p4 ); // invoke-virtual {p0, v5, p4}, Lorg/apache/commons/codec/binary/Base64;->ensureBufferSize(ILorg/apache/commons/codec/binary/BaseNCodec$Context;)[B
/* .line 340 */
/* .local v1, "buffer":[B */
/* iget v4, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* .line 341 */
/* .local v4, "savedPos":I */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* packed-switch v5, :pswitch_data_0 */
/* .line 366 */
/* new-instance v5, Ljava/lang/IllegalStateException; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Impossible modulus "; // const-string v7, "Impossible modulus "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
/* .line 346 */
/* :pswitch_0 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v7, v7, 0x2 */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 348 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shl-int/lit8 v7, v7, 0x4 */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 350 */
v5 = this.encodeTable;
v6 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE;
/* if-ne v5, v6, :cond_3 */
/* .line 351 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* aput-byte v9, v1, v5 */
/* .line 352 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* aput-byte v9, v1, v5 */
/* .line 368 */
} // :cond_3
} // :goto_1
/* :pswitch_1 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->currentLinePos:I */
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* sub-int/2addr v6, v4 */
/* add-int/2addr v5, v6 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->currentLinePos:I */
/* .line 370 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
/* if-lez v5, :cond_0 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->currentLinePos:I */
/* if-lez v5, :cond_0 */
/* .line 371 */
v5 = this.lineSeparator;
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v7 = this.lineSeparator;
/* array-length v7, v7 */
java.lang.System .arraycopy ( v5,v8,v1,v6,v7 );
/* .line 372 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.lineSeparator;
/* array-length v6, v6 */
/* add-int/2addr v5, v6 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* goto/16 :goto_0 */
/* .line 357 */
/* :pswitch_2 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v7, v7, 0xa */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 358 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v7, v7, 0x4 */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 359 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shl-int/lit8 v7, v7, 0x2 */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 361 */
v5 = this.encodeTable;
v6 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE;
/* if-ne v5, v6, :cond_3 */
/* .line 362 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* aput-byte v9, v1, v5 */
/* .line 375 */
} // .end local v1 # "buffer":[B
} // .end local v4 # "savedPos":I
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
/* move v3, p2 */
} // .end local p2 # "inPos":I
/* .local v3, "inPos":I */
} // :goto_2
/* if-ge v2, p3, :cond_7 */
/* .line 376 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
(( org.apache.commons.codec.binary.Base64 ) p0 ).ensureBufferSize ( v5, p4 ); // invoke-virtual {p0, v5, p4}, Lorg/apache/commons/codec/binary/Base64;->ensureBufferSize(ILorg/apache/commons/codec/binary/BaseNCodec$Context;)[B
/* .line 377 */
/* .restart local v1 # "buffer":[B */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* add-int/lit8 v5, v5, 0x1 */
/* rem-int/lit8 v5, v5, 0x3 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* .line 378 */
/* add-int/lit8 p2, v3, 0x1 */
} // .end local v3 # "inPos":I
/* .restart local p2 # "inPos":I */
/* aget-byte v0, p1, v3 */
/* .line 379 */
/* .local v0, "b":I */
/* if-gez v0, :cond_5 */
/* .line 380 */
/* add-int/lit16 v0, v0, 0x100 */
/* .line 382 */
} // :cond_5
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shl-int/lit8 v5, v5, 0x8 */
/* add-int/2addr v5, v0 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* .line 383 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
/* if-nez v5, :cond_6 */
/* .line 384 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v7, v7, 0x12 */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 385 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v7, v7, 0xc */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 386 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* shr-int/lit8 v7, v7, 0x6 */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 387 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.encodeTable;
/* iget v7, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
/* and-int/lit8 v7, v7, 0x3f */
/* aget-byte v6, v6, v7 */
/* aput-byte v6, v1, v5 */
/* .line 388 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->currentLinePos:I */
/* add-int/lit8 v5, v5, 0x4 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->currentLinePos:I */
/* .line 389 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
/* if-lez v5, :cond_6 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->currentLinePos:I */
/* if-gt v5, v6, :cond_6 */
/* .line 390 */
v5 = this.lineSeparator;
/* iget v6, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v7 = this.lineSeparator;
/* array-length v7, v7 */
java.lang.System .arraycopy ( v5,v8,v1,v6,v7 );
/* .line 391 */
/* iget v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
v6 = this.lineSeparator;
/* array-length v6, v6 */
/* add-int/2addr v5, v6 */
/* iput v5, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* .line 392 */
/* iput v8, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->currentLinePos:I */
/* .line 375 */
} // :cond_6
/* add-int/lit8 v2, v2, 0x1 */
/* move v3, p2 */
} // .end local p2 # "inPos":I
/* .restart local v3 # "inPos":I */
/* goto/16 :goto_2 */
} // .end local v0 # "b":I
} // .end local v1 # "buffer":[B
} // :cond_7
/* move p2, v3 */
} // .end local v3 # "inPos":I
/* .restart local p2 # "inPos":I */
/* goto/16 :goto_0 */
/* .line 341 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
protected Boolean isInAlphabet ( Object p0 ) {
/* .locals 2 */
/* .param p1, "octet" # B */
/* .prologue */
/* .line 772 */
/* if-ltz p1, :cond_0 */
v0 = this.decodeTable;
/* array-length v0, v0 */
/* if-ge p1, v0, :cond_0 */
v0 = this.decodeTable;
/* aget-byte v0, v0, p1 */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isUrlSafe ( ) {
/* .locals 2 */
/* .prologue */
/* .line 303 */
v0 = this.encodeTable;
v1 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE;
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
