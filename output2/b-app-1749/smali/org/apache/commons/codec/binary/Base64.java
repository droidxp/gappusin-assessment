public class org.apache.commons.codec.binary.Base64 implements org.apache.commons.codec.BinaryEncoder implements org.apache.commons.codec.BinaryDecoder {
	 /* .source "Base64.java" */
	 /* # interfaces */
	 /* # static fields */
	 static final CHUNK_SEPARATOR;
	 static final Integer CHUNK_SIZE;
	 private static final DECODE_TABLE;
	 private static final Integer DEFAULT_BUFFER_RESIZE_FACTOR;
	 private static final Integer DEFAULT_BUFFER_SIZE;
	 private static final Integer MASK_6BITS;
	 private static final Integer MASK_8BITS;
	 private static final Object PAD;
	 private static final STANDARD_ENCODE_TABLE;
	 private static final URL_SAFE_ENCODE_TABLE;
	 /* # instance fields */
	 private buffer;
	 private Integer currentLinePos;
	 private final Integer decodeSize;
	 private final Integer encodeSize;
	 private final encodeTable;
	 private Boolean eof;
	 private final Integer lineLength;
	 private final lineSeparator;
	 private Integer modulus;
	 private Integer pos;
	 private Integer readPos;
	 private Integer x;
	 /* # direct methods */
	 static org.apache.commons.codec.binary.Base64 ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const/16 v1, 0x40 */
		 /* .line 79 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [B */
		 /* fill-array-data v0, :array_0 */
		 /* .line 88 */
		 /* new-array v0, v1, [B */
		 /* fill-array-data v0, :array_1 */
		 /* .line 101 */
		 /* new-array v0, v1, [B */
		 /* fill-array-data v0, :array_2 */
		 /* .line 125 */
		 /* const/16 v0, 0x7b */
		 /* new-array v0, v0, [B */
		 /* fill-array-data v0, :array_3 */
		 return;
		 /* .line 79 */
		 /* :array_0 */
		 /* .array-data 1 */
		 /* 0xdt */
		 /* 0xat */
	 } // .end array-data
	 /* .line 88 */
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
/* .line 101 */
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
/* .line 125 */
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
/* .line 225 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/binary/Base64;-><init>(Z)V */
/* .line 226 */
return;
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 1 */
/* .param p1, "lineLength" # I */
/* .prologue */
/* .line 266 */
v0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
/* invoke-direct {p0, p1, v0}, Lorg/apache/commons/codec/binary/Base64;-><init>(I[B)V */
/* .line 267 */
return;
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 1 */
/* .param p1, "lineLength" # I */
/* .param p2, "lineSeparator" # [B */
/* .prologue */
/* .line 292 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/codec/binary/Base64;-><init>(I[BZ)V */
/* .line 293 */
return;
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 4 */
/* .param p1, "lineLength" # I */
/* .param p2, "lineSeparator" # [B */
/* .param p3, "urlSafe" # Z */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 320 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 321 */
/* if-nez p2, :cond_0 */
/* .line 322 */
int p1 = 0; // const/4 p1, 0x0
/* .line 323 */
p2 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
/* .line 325 */
} // :cond_0
/* if-lez p1, :cond_1 */
/* div-int/lit8 v1, p1, 0x4 */
/* mul-int/lit8 v1, v1, 0x4 */
} // :goto_0
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
/* .line 326 */
/* array-length v1, p2 */
/* new-array v1, v1, [B */
this.lineSeparator = v1;
/* .line 327 */
v1 = this.lineSeparator;
/* array-length v3, p2 */
java.lang.System .arraycopy ( p2,v2,v1,v2,v3 );
/* .line 328 */
/* if-lez p1, :cond_2 */
/* .line 329 */
/* array-length v1, p2 */
/* add-int/lit8 v1, v1, 0x4 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* .line 333 */
} // :goto_1
/* iget v1, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->decodeSize:I */
/* .line 334 */
v1 = org.apache.commons.codec.binary.Base64 .containsBase64Byte ( p2 );
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 335 */
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( p2 );
/* .line 336 */
/* .local v0, "sep":Ljava/lang/String; */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "lineSeperator must not contain base64 characters: ["; // const-string v3, "lineSeperator must not contain base64 characters: ["
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "]"; // const-string v3, "]"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // .end local v0 # "sep":Ljava/lang/String;
} // :cond_1
/* move v1, v2 */
/* .line 325 */
/* .line 331 */
} // :cond_2
int v1 = 4; // const/4 v1, 0x4
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* .line 338 */
} // :cond_3
if ( p3 != null) { // if-eqz p3, :cond_4
v1 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE;
} // :goto_2
this.encodeTable = v1;
/* .line 339 */
return;
/* .line 338 */
} // :cond_4
v1 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE;
} // .end method
public org.apache.commons.codec.binary.Base64 ( ) {
/* .locals 2 */
/* .param p1, "urlSafe" # Z */
/* .prologue */
/* .line 244 */
/* const/16 v0, 0x4c */
v1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
/* invoke-direct {p0, v0, v1, p1}, Lorg/apache/commons/codec/binary/Base64;-><init>(I[BZ)V */
/* .line 245 */
return;
} // .end method
private static Boolean containsBase64Byte ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "arrayOctet" # [B */
/* .prologue */
/* .line 626 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v1, p0 */
/* if-ge v0, v1, :cond_1 */
/* .line 627 */
/* aget-byte v1, p0, v0 */
v1 = org.apache.commons.codec.binary.Base64 .isBase64 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 628 */
int v1 = 1; // const/4 v1, 0x1
/* .line 631 */
} // :goto_1
/* .line 626 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 631 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
public static decodeBase64 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "base64String" # Ljava/lang/String; */
/* .prologue */
/* .line 830 */
/* new-instance v0, Lorg/apache/commons/codec/binary/Base64; */
/* invoke-direct {v0}, Lorg/apache/commons/codec/binary/Base64;-><init>()V */
(( org.apache.commons.codec.binary.Base64 ) v0 ).decode ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/commons/codec/binary/Base64;->decode(Ljava/lang/String;)[B
} // .end method
public static decodeBase64 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "base64Data" # [B */
/* .prologue */
/* .line 841 */
/* new-instance v0, Lorg/apache/commons/codec/binary/Base64; */
/* invoke-direct {v0}, Lorg/apache/commons/codec/binary/Base64;-><init>()V */
(( org.apache.commons.codec.binary.Base64 ) v0 ).decode ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/commons/codec/binary/Base64;->decode([B)[B
} // .end method
public static java.math.BigInteger decodeInteger ( Object[] p0 ) {
/* .locals 3 */
/* .param p0, "pArray" # [B */
/* .prologue */
/* .line 992 */
/* new-instance v0, Ljava/math/BigInteger; */
int v1 = 1; // const/4 v1, 0x1
org.apache.commons.codec.binary.Base64 .decodeBase64 ( p0 );
/* invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(I[B)V */
} // .end method
static discardWhitespace ( Object[] p0 ) {
/* .locals 7 */
/* .param p0, "data" # [B */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 853 */
/* array-length v5, p0 */
/* new-array v2, v5, [B */
/* .line 854 */
/* .local v2, "groomedData":[B */
int v0 = 0; // const/4 v0, 0x0
/* .line 855 */
/* .local v0, "bytesCopied":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
/* array-length v5, p0 */
/* if-ge v3, v5, :cond_0 */
/* .line 856 */
/* aget-byte v5, p0, v3 */
/* sparse-switch v5, :sswitch_data_0 */
/* .line 863 */
/* add-int/lit8 v1, v0, 0x1 */
} // .end local v0 # "bytesCopied":I
/* .local v1, "bytesCopied":I */
/* aget-byte v5, p0, v3 */
/* aput-byte v5, v2, v0 */
/* move v0, v1 */
/* .line 855 */
} // .end local v1 # "bytesCopied":I
/* .restart local v0 # "bytesCopied":I */
/* :sswitch_0 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 866 */
} // :cond_0
/* new-array v4, v0, [B */
/* .line 867 */
/* .local v4, "packedData":[B */
java.lang.System .arraycopy ( v2,v6,v4,v6,v0 );
/* .line 868 */
/* .line 856 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x9 -> :sswitch_0 */
/* 0xa -> :sswitch_0 */
/* 0xd -> :sswitch_0 */
/* 0x20 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static encodeBase64 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 642 */
int v0 = 0; // const/4 v0, 0x0
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0 );
} // .end method
public static encodeBase64 ( Object[] p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .param p1, "isChunked" # Z */
/* .prologue */
/* .line 767 */
int v0 = 0; // const/4 v0, 0x0
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,p1,v0 );
} // .end method
public static encodeBase64 ( Object[] p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .param p1, "isChunked" # Z */
/* .param p2, "urlSafe" # Z */
/* .prologue */
/* .line 785 */
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
/* .line 805 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v3, p0 */
/* if-nez v3, :cond_1 */
/* .line 818 */
} // .end local p0 # "binaryData":[B
} // :cond_0
} // :goto_0
/* .line 809 */
/* .restart local p0 # "binaryData":[B */
} // :cond_1
/* const/16 v3, 0x4c */
v4 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
org.apache.commons.codec.binary.Base64 .getEncodeLength ( p0,v3,v4 );
/* move-result-wide v1 */
/* .line 810 */
/* .local v1, "len":J */
/* int-to-long v3, p3 */
/* cmp-long v3, v1, v3 */
/* if-lez v3, :cond_2 */
/* .line 811 */
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Input array too big, the output array would be bigger ("; // const-string v5, "Input array too big, the output array would be bigger ("
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1, v2 ); // invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v5 = ") than the specified maxium size of "; // const-string v5, ") than the specified maxium size of "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p3 ); // invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v3 */
/* .line 817 */
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
/* new-instance v0, Lorg/apache/commons/codec/binary/Base64; */
/* invoke-direct {v0, p2}, Lorg/apache/commons/codec/binary/Base64;-><init>(Z)V */
/* .line 818 */
/* .local v0, "b64":Lorg/apache/commons/codec/binary/Base64; */
} // :goto_1
(( org.apache.commons.codec.binary.Base64 ) v0 ).encode ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/commons/codec/binary/Base64;->encode([B)[B
/* .line 817 */
} // .end local v0 # "b64":Lorg/apache/commons/codec/binary/Base64;
} // :cond_3
/* new-instance v0, Lorg/apache/commons/codec/binary/Base64; */
int v3 = 0; // const/4 v3, 0x0
v4 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
/* invoke-direct {v0, v3, v4, p2}, Lorg/apache/commons/codec/binary/Base64;-><init>(I[BZ)V */
} // .end method
public static encodeBase64Chunked ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 691 */
int v0 = 1; // const/4 v0, 0x1
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0 );
} // .end method
public static java.lang.String encodeBase64String ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 654 */
int v0 = 1; // const/4 v0, 0x1
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0 );
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( v0 );
} // .end method
public static encodeBase64URLSafe ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 667 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0,v1 );
} // .end method
public static java.lang.String encodeBase64URLSafeString ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "binaryData" # [B */
/* .prologue */
/* .line 680 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p0,v0,v1 );
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( v0 );
} // .end method
public static encodeInteger ( java.math.BigInteger p0 ) {
/* .locals 2 */
/* .param p0, "bigInt" # Ljava/math/BigInteger; */
/* .prologue */
/* .line 1006 */
/* if-nez p0, :cond_0 */
/* .line 1007 */
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "encodeInteger called with null parameter"; // const-string v1, "encodeInteger called with null parameter"
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 1009 */
} // :cond_0
org.apache.commons.codec.binary.Base64 .toIntegerBytes ( p0 );
int v1 = 0; // const/4 v1, 0x0
org.apache.commons.codec.binary.Base64 .encodeBase64 ( v0,v1 );
} // .end method
private static Long getEncodeLength ( Object[] p0, Integer p1, Object[] p2 ) {
/* .locals 11 */
/* .param p0, "pArray" # [B */
/* .param p1, "chunkSize" # I */
/* .param p2, "chunkSeparator" # [B */
/* .prologue */
/* const-wide/16 v9, 0x4 */
/* const-wide/16 v7, 0x0 */
/* .line 965 */
/* div-int/lit8 v5, p1, 0x4 */
/* mul-int/lit8 p1, v5, 0x4 */
/* .line 967 */
/* array-length v5, p0 */
/* mul-int/lit8 v5, v5, 0x4 */
/* div-int/lit8 v5, v5, 0x3 */
/* int-to-long v0, v5 */
/* .line 968 */
/* .local v0, "len":J */
/* rem-long v3, v0, v9 */
/* .line 969 */
/* .local v3, "mod":J */
/* cmp-long v5, v3, v7 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 970 */
/* sub-long v5, v9, v3 */
/* add-long/2addr v0, v5 */
/* .line 972 */
} // :cond_0
/* if-lez p1, :cond_1 */
/* .line 973 */
/* int-to-long v5, p1 */
/* rem-long v5, v0, v5 */
/* cmp-long v5, v5, v7 */
/* if-nez v5, :cond_2 */
int v2 = 1; // const/4 v2, 0x1
/* .line 974 */
/* .local v2, "lenChunksPerfectly":Z */
} // :goto_0
/* int-to-long v5, p1 */
/* div-long v5, v0, v5 */
/* array-length v7, p2 */
/* int-to-long v7, v7 */
/* mul-long/2addr v5, v7 */
/* add-long/2addr v0, v5 */
/* .line 975 */
/* if-nez v2, :cond_1 */
/* .line 976 */
/* array-length v5, p2 */
/* int-to-long v5, v5 */
/* add-long/2addr v0, v5 */
/* .line 979 */
} // .end local v2 # "lenChunksPerfectly":Z
} // :cond_1
/* return-wide v0 */
/* .line 973 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // .end method
public static Boolean isArrayByteBase64 ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "arrayOctet" # [B */
/* .prologue */
/* .line 610 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v1, p0 */
/* if-ge v0, v1, :cond_1 */
/* .line 611 */
/* aget-byte v1, p0, v0 */
v1 = org.apache.commons.codec.binary.Base64 .isBase64 ( v1 );
/* if-nez v1, :cond_0 */
/* aget-byte v1, p0, v0 */
v1 = org.apache.commons.codec.binary.Base64 .isWhiteSpace ( v1 );
/* if-nez v1, :cond_0 */
/* .line 612 */
int v1 = 0; // const/4 v1, 0x0
/* .line 615 */
} // :goto_1
/* .line 610 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 615 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // .end method
public static Boolean isBase64 ( Object p0 ) {
/* .locals 2 */
/* .param p0, "octet" # B */
/* .prologue */
/* .line 597 */
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
private static Boolean isWhiteSpace ( Object p0 ) {
/* .locals 1 */
/* .param p0, "byteToCheck" # B */
/* .prologue */
/* .line 879 */
/* sparse-switch p0, :sswitch_data_0 */
/* .line 886 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 884 */
/* :sswitch_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 879 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x9 -> :sswitch_0 */
/* 0xa -> :sswitch_0 */
/* 0xd -> :sswitch_0 */
/* 0x20 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
private void reset ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 1047 */
int v0 = 0; // const/4 v0, 0x0
this.buffer = v0;
/* .line 1048 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* .line 1049 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->readPos:I */
/* .line 1050 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->currentLinePos:I */
/* .line 1051 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* .line 1052 */
/* iput-boolean v1, p0, Lorg/apache/commons/codec/binary/Base64;->eof:Z */
/* .line 1053 */
return;
} // .end method
private void resizeBuffer ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 371 */
v1 = this.buffer;
/* if-nez v1, :cond_0 */
/* .line 372 */
/* const/16 v1, 0x2000 */
/* new-array v1, v1, [B */
this.buffer = v1;
/* .line 373 */
/* iput v3, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* .line 374 */
/* iput v3, p0, Lorg/apache/commons/codec/binary/Base64;->readPos:I */
/* .line 380 */
} // :goto_0
return;
/* .line 376 */
} // :cond_0
v1 = this.buffer;
/* array-length v1, v1 */
/* mul-int/lit8 v1, v1, 0x2 */
/* new-array v0, v1, [B */
/* .line 377 */
/* .local v0, "b":[B */
v1 = this.buffer;
v2 = this.buffer;
/* array-length v2, v2 */
java.lang.System .arraycopy ( v1,v3,v0,v3,v2 );
/* .line 378 */
this.buffer = v0;
} // .end method
static toIntegerBytes ( java.math.BigInteger p0 ) {
/* .locals 8 */
/* .param p0, "bigInt" # Ljava/math/BigInteger; */
/* .prologue */
/* .line 1020 */
v1 = (( java.math.BigInteger ) p0 ).bitLength ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I
/* .line 1022 */
/* .local v1, "bitlen":I */
/* add-int/lit8 v6, v1, 0x7 */
/* shr-int/lit8 v6, v6, 0x3 */
/* shl-int/lit8 v1, v6, 0x3 */
/* .line 1023 */
(( java.math.BigInteger ) p0 ).toByteArray ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B
/* .line 1025 */
/* .local v0, "bigBytes":[B */
v6 = (( java.math.BigInteger ) p0 ).bitLength ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I
/* rem-int/lit8 v6, v6, 0x8 */
if ( v6 != null) { // if-eqz v6, :cond_0
v6 = (( java.math.BigInteger ) p0 ).bitLength ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I
/* div-int/lit8 v6, v6, 0x8 */
/* add-int/lit8 v6, v6, 0x1 */
/* div-int/lit8 v7, v1, 0x8 */
/* if-ne v6, v7, :cond_0 */
/* .line 1040 */
} // .end local v0 # "bigBytes":[B
} // :goto_0
/* .line 1029 */
/* .restart local v0 # "bigBytes":[B */
} // :cond_0
int v5 = 0; // const/4 v5, 0x0
/* .line 1030 */
/* .local v5, "startSrc":I */
/* array-length v2, v0 */
/* .line 1033 */
/* .local v2, "len":I */
v6 = (( java.math.BigInteger ) p0 ).bitLength ( ); // invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I
/* rem-int/lit8 v6, v6, 0x8 */
/* if-nez v6, :cond_1 */
/* .line 1034 */
int v5 = 1; // const/4 v5, 0x1
/* .line 1035 */
/* add-int/lit8 v2, v2, -0x1 */
/* .line 1037 */
} // :cond_1
/* div-int/lit8 v6, v1, 0x8 */
/* sub-int v4, v6, v2 */
/* .line 1038 */
/* .local v4, "startDst":I */
/* div-int/lit8 v6, v1, 0x8 */
/* new-array v3, v6, [B */
/* .line 1039 */
/* .local v3, "resizedBytes":[B */
java.lang.System .arraycopy ( v0,v5,v3,v4,v2 );
/* move-object v0, v3 */
/* .line 1040 */
} // .end method
/* # virtual methods */
Integer avail ( ) {
/* .locals 2 */
/* .prologue */
/* .line 366 */
v0 = this.buffer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* iget v1, p0, Lorg/apache/commons/codec/binary/Base64;->readPos:I */
/* sub-int/2addr v0, v1 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object decode ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "pObject" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 705 */
/* instance-of v0, p1, [B */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 706 */
/* check-cast p1, [B */
} // .end local p1 # "pObject":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.apache.commons.codec.binary.Base64 ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/Base64;->decode([B)[B
/* .line 708 */
} // :goto_0
/* .line 707 */
/* .restart local p1 # "pObject":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 708 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "pObject":Ljava/lang/Object;
(( org.apache.commons.codec.binary.Base64 ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/Base64;->decode(Ljava/lang/String;)[B
/* .line 710 */
/* .restart local p1 # "pObject":Ljava/lang/Object; */
} // :cond_1
/* new-instance v0, Lorg/apache/commons/codec/DecoderException; */
final String v1 = "Parameter supplied to Base64 decode is not a byte[] or a String"; // const-string v1, "Parameter supplied to Base64 decode is not a byte[] or a String"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
void decode ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 8 */
/* .param p1, "in" # [B */
/* .param p2, "inPos" # I */
/* .param p3, "inAvail" # I */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
/* .line 539 */
/* iget-boolean v4, p0, Lorg/apache/commons/codec/binary/Base64;->eof:Z */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 586 */
} // :cond_0
} // :goto_0
return;
/* .line 542 */
} // :cond_1
/* if-gez p3, :cond_2 */
/* .line 543 */
/* iput-boolean v7, p0, Lorg/apache/commons/codec/binary/Base64;->eof:Z */
/* .line 545 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
/* move v2, p2 */
} // .end local p2 # "inPos":I
/* .local v2, "inPos":I */
} // :goto_1
/* if-ge v1, p3, :cond_7 */
/* .line 546 */
v4 = this.buffer;
if ( v4 != null) { // if-eqz v4, :cond_3
v4 = this.buffer;
/* array-length v4, v4 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* sub-int/2addr v4, v5 */
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->decodeSize:I */
/* if-ge v4, v5, :cond_4 */
/* .line 547 */
} // :cond_3
/* invoke-direct {p0}, Lorg/apache/commons/codec/binary/Base64;->resizeBuffer()V */
/* .line 549 */
} // :cond_4
/* add-int/lit8 p2, v2, 0x1 */
} // .end local v2 # "inPos":I
/* .restart local p2 # "inPos":I */
/* aget-byte v0, p1, v2 */
/* .line 550 */
/* .local v0, "b":B */
/* const/16 v4, 0x3d */
/* if-ne v0, v4, :cond_5 */
/* .line 552 */
/* iput-boolean v7, p0, Lorg/apache/commons/codec/binary/Base64;->eof:Z */
/* .line 573 */
} // .end local v0 # "b":B
} // :goto_2
/* iget-boolean v4, p0, Lorg/apache/commons/codec/binary/Base64;->eof:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 574 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shl-int/lit8 v4, v4, 0x6 */
/* iput v4, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* .line 575 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* packed-switch v4, :pswitch_data_0 */
/* .line 577 */
/* :pswitch_0 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shl-int/lit8 v4, v4, 0x6 */
/* iput v4, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* .line 578 */
v4 = this.buffer;
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x10 */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v5 */
/* .line 555 */
/* .restart local v0 # "b":B */
} // :cond_5
/* if-ltz v0, :cond_6 */
v4 = org.apache.commons.codec.binary.Base64.DECODE_TABLE;
/* array-length v4, v4 */
/* if-ge v0, v4, :cond_6 */
/* .line 556 */
v4 = org.apache.commons.codec.binary.Base64.DECODE_TABLE;
/* aget-byte v3, v4, v0 */
/* .line 557 */
/* .local v3, "result":I */
/* if-ltz v3, :cond_6 */
/* .line 558 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* add-int/lit8 v4, v4, 0x1 */
/* iput v4, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* rem-int/lit8 v4, v4, 0x4 */
/* iput v4, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* .line 559 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shl-int/lit8 v4, v4, 0x6 */
/* add-int/2addr v4, v3 */
/* iput v4, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* .line 560 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* if-nez v4, :cond_6 */
/* .line 561 */
v4 = this.buffer;
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x10 */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v5 */
/* .line 562 */
v4 = this.buffer;
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x8 */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v5 */
/* .line 563 */
v4 = this.buffer;
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v5 */
/* .line 545 */
} // .end local v3 # "result":I
} // :cond_6
/* add-int/lit8 v1, v1, 0x1 */
/* move v2, p2 */
} // .end local p2 # "inPos":I
/* .restart local v2 # "inPos":I */
/* goto/16 :goto_1 */
/* .line 581 */
} // .end local v0 # "b":B
} // .end local v2 # "inPos":I
/* .restart local p2 # "inPos":I */
/* :pswitch_1 */
v4 = this.buffer;
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x10 */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v5 */
/* .line 582 */
v4 = this.buffer;
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x8 */
/* and-int/lit16 v6, v6, 0xff */
/* int-to-byte v6, v6 */
/* aput-byte v6, v4, v5 */
/* goto/16 :goto_0 */
} // .end local p2 # "inPos":I
/* .restart local v2 # "inPos":I */
} // :cond_7
/* move p2, v2 */
} // .end local v2 # "inPos":I
/* .restart local p2 # "inPos":I */
/* goto/16 :goto_2 */
/* .line 575 */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public decode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "pArray" # Ljava/lang/String; */
/* .prologue */
/* .line 723 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p1 );
(( org.apache.commons.codec.binary.Base64 ) p0 ).decode ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/commons/codec/binary/Base64;->decode([B)[B
} // .end method
public decode ( Object[] p0 ) {
/* .locals 6 */
/* .param p1, "pArray" # [B */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 734 */
/* invoke-direct {p0}, Lorg/apache/commons/codec/binary/Base64;->reset()V */
/* .line 735 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v4, p1 */
/* if-nez v4, :cond_1 */
} // :cond_0
/* move-object v3, p1 */
/* .line 752 */
} // :goto_0
/* .line 738 */
} // :cond_1
/* array-length v4, p1 */
/* mul-int/lit8 v4, v4, 0x3 */
/* div-int/lit8 v4, v4, 0x4 */
/* int-to-long v1, v4 */
/* .line 739 */
/* .local v1, "len":J */
/* long-to-int v4, v1 */
/* new-array v0, v4, [B */
/* .line 740 */
/* .local v0, "buf":[B */
/* array-length v4, v0 */
(( org.apache.commons.codec.binary.Base64 ) p0 ).setInitialBuffer ( v0, v5, v4 ); // invoke-virtual {p0, v0, v5, v4}, Lorg/apache/commons/codec/binary/Base64;->setInitialBuffer([BII)V
/* .line 741 */
/* array-length v4, p1 */
(( org.apache.commons.codec.binary.Base64 ) p0 ).decode ( p1, v5, v4 ); // invoke-virtual {p0, p1, v5, v4}, Lorg/apache/commons/codec/binary/Base64;->decode([BII)V
/* .line 742 */
int v4 = -1; // const/4 v4, -0x1
(( org.apache.commons.codec.binary.Base64 ) p0 ).decode ( p1, v5, v4 ); // invoke-virtual {p0, p1, v5, v4}, Lorg/apache/commons/codec/binary/Base64;->decode([BII)V
/* .line 750 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* new-array v3, v4, [B */
/* .line 751 */
/* .local v3, "result":[B */
/* array-length v4, v3 */
(( org.apache.commons.codec.binary.Base64 ) p0 ).readResults ( v3, v5, v4 ); // invoke-virtual {p0, v3, v5, v4}, Lorg/apache/commons/codec/binary/Base64;->readResults([BII)I
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "pObject" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 903 */
/* instance-of v0, p1, [B */
/* if-nez v0, :cond_0 */
/* .line 904 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "Parameter supplied to Base64 encode is not a byte[]"; // const-string v1, "Parameter supplied to Base64 encode is not a byte[]"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 906 */
} // :cond_0
/* check-cast p1, [B */
} // .end local p1 # "pObject":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.apache.commons.codec.binary.Base64 ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/Base64;->encode([B)[B
} // .end method
void encode ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 9 */
/* .param p1, "in" # [B */
/* .param p2, "inPos" # I */
/* .param p3, "inAvail" # I */
/* .prologue */
/* const/16 v8, 0x3d */
int v7 = 0; // const/4 v7, 0x0
/* .line 453 */
/* iget-boolean v3, p0, Lorg/apache/commons/codec/binary/Base64;->eof:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 513 */
} // :cond_0
} // :goto_0
return;
/* .line 458 */
} // :cond_1
/* if-gez p3, :cond_5 */
/* .line 459 */
int v3 = 1; // const/4 v3, 0x1
/* iput-boolean v3, p0, Lorg/apache/commons/codec/binary/Base64;->eof:Z */
/* .line 460 */
v3 = this.buffer;
if ( v3 != null) { // if-eqz v3, :cond_2
v3 = this.buffer;
/* array-length v3, v3 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* sub-int/2addr v3, v4 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* if-ge v3, v4, :cond_3 */
/* .line 461 */
} // :cond_2
/* invoke-direct {p0}, Lorg/apache/commons/codec/binary/Base64;->resizeBuffer()V */
/* .line 463 */
} // :cond_3
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* packed-switch v3, :pswitch_data_0 */
/* .line 484 */
} // :cond_4
} // :goto_1
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
/* if-lez v3, :cond_0 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* if-lez v3, :cond_0 */
/* .line 485 */
v3 = this.lineSeparator;
v4 = this.buffer;
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v6 = this.lineSeparator;
/* array-length v6, v6 */
java.lang.System .arraycopy ( v3,v7,v4,v5,v6 );
/* .line 486 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v4 = this.lineSeparator;
/* array-length v4, v4 */
/* add-int/2addr v3, v4 */
/* iput v3, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* .line 465 */
/* :pswitch_0 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x2 */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 466 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shl-int/lit8 v6, v6, 0x4 */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 468 */
v3 = this.encodeTable;
v4 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE;
/* if-ne v3, v4, :cond_4 */
/* .line 469 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* aput-byte v8, v3, v4 */
/* .line 470 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* aput-byte v8, v3, v4 */
/* .line 475 */
/* :pswitch_1 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0xa */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 476 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x4 */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 477 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shl-int/lit8 v6, v6, 0x2 */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 479 */
v3 = this.encodeTable;
v4 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE;
/* if-ne v3, v4, :cond_4 */
/* .line 480 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* aput-byte v8, v3, v4 */
/* goto/16 :goto_1 */
/* .line 489 */
} // :cond_5
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
/* move v2, p2 */
} // .end local p2 # "inPos":I
/* .local v2, "inPos":I */
} // :goto_2
/* if-ge v1, p3, :cond_a */
/* .line 490 */
v3 = this.buffer;
if ( v3 != null) { // if-eqz v3, :cond_6
v3 = this.buffer;
/* array-length v3, v3 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* sub-int/2addr v3, v4 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->encodeSize:I */
/* if-ge v3, v4, :cond_7 */
/* .line 491 */
} // :cond_6
/* invoke-direct {p0}, Lorg/apache/commons/codec/binary/Base64;->resizeBuffer()V */
/* .line 493 */
} // :cond_7
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* add-int/lit8 v3, v3, 0x1 */
/* iput v3, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* rem-int/lit8 v3, v3, 0x3 */
/* iput v3, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* .line 494 */
/* add-int/lit8 p2, v2, 0x1 */
} // .end local v2 # "inPos":I
/* .restart local p2 # "inPos":I */
/* aget-byte v0, p1, v2 */
/* .line 495 */
/* .local v0, "b":I */
/* if-gez v0, :cond_8 */
/* .line 496 */
/* add-int/lit16 v0, v0, 0x100 */
/* .line 498 */
} // :cond_8
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shl-int/lit8 v3, v3, 0x8 */
/* add-int/2addr v3, v0 */
/* iput v3, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* .line 499 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->modulus:I */
/* if-nez v3, :cond_9 */
/* .line 500 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x12 */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 501 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0xc */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 502 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* shr-int/lit8 v6, v6, 0x6 */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 503 */
v3 = this.buffer;
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v5 = this.encodeTable;
/* iget v6, p0, Lorg/apache/commons/codec/binary/Base64;->x:I */
/* and-int/lit8 v6, v6, 0x3f */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v3, v4 */
/* .line 504 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->currentLinePos:I */
/* add-int/lit8 v3, v3, 0x4 */
/* iput v3, p0, Lorg/apache/commons/codec/binary/Base64;->currentLinePos:I */
/* .line 505 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
/* if-lez v3, :cond_9 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->currentLinePos:I */
/* if-gt v3, v4, :cond_9 */
/* .line 506 */
v3 = this.lineSeparator;
v4 = this.buffer;
/* iget v5, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v6 = this.lineSeparator;
/* array-length v6, v6 */
java.lang.System .arraycopy ( v3,v7,v4,v5,v6 );
/* .line 507 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
v4 = this.lineSeparator;
/* array-length v4, v4 */
/* add-int/2addr v3, v4 */
/* iput v3, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* .line 508 */
/* iput v7, p0, Lorg/apache/commons/codec/binary/Base64;->currentLinePos:I */
/* .line 489 */
} // :cond_9
/* add-int/lit8 v1, v1, 0x1 */
/* move v2, p2 */
} // .end local p2 # "inPos":I
/* .restart local v2 # "inPos":I */
/* goto/16 :goto_2 */
} // .end local v0 # "b":I
} // :cond_a
/* move p2, v2 */
} // .end local v2 # "inPos":I
/* .restart local p2 # "inPos":I */
/* goto/16 :goto_0 */
/* .line 463 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public encode ( Object[] p0 ) {
/* .locals 7 */
/* .param p1, "pArray" # [B */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 929 */
/* invoke-direct {p0}, Lorg/apache/commons/codec/binary/Base64;->reset()V */
/* .line 930 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v4, p1 */
/* if-nez v4, :cond_2 */
} // :cond_0
/* move-object v0, p1 */
/* .line 949 */
} // :cond_1
} // :goto_0
/* .line 933 */
} // :cond_2
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->lineLength:I */
v5 = this.lineSeparator;
org.apache.commons.codec.binary.Base64 .getEncodeLength ( p1,v4,v5 );
/* move-result-wide v1 */
/* .line 934 */
/* .local v1, "len":J */
/* long-to-int v4, v1 */
/* new-array v0, v4, [B */
/* .line 935 */
/* .local v0, "buf":[B */
/* array-length v4, v0 */
(( org.apache.commons.codec.binary.Base64 ) p0 ).setInitialBuffer ( v0, v6, v4 ); // invoke-virtual {p0, v0, v6, v4}, Lorg/apache/commons/codec/binary/Base64;->setInitialBuffer([BII)V
/* .line 936 */
/* array-length v4, p1 */
(( org.apache.commons.codec.binary.Base64 ) p0 ).encode ( p1, v6, v4 ); // invoke-virtual {p0, p1, v6, v4}, Lorg/apache/commons/codec/binary/Base64;->encode([BII)V
/* .line 937 */
int v4 = -1; // const/4 v4, -0x1
(( org.apache.commons.codec.binary.Base64 ) p0 ).encode ( p1, v6, v4 ); // invoke-virtual {p0, p1, v6, v4}, Lorg/apache/commons/codec/binary/Base64;->encode([BII)V
/* .line 939 */
v4 = this.buffer;
/* if-eq v4, v0, :cond_3 */
/* .line 940 */
/* array-length v4, v0 */
(( org.apache.commons.codec.binary.Base64 ) p0 ).readResults ( v0, v6, v4 ); // invoke-virtual {p0, v0, v6, v4}, Lorg/apache/commons/codec/binary/Base64;->readResults([BII)I
/* .line 944 */
} // :cond_3
v4 = (( org.apache.commons.codec.binary.Base64 ) p0 ).isUrlSafe ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/Base64;->isUrlSafe()Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* array-length v5, v0 */
/* if-ge v4, v5, :cond_1 */
/* .line 945 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* new-array v3, v4, [B */
/* .line 946 */
/* .local v3, "smallerBuf":[B */
/* iget v4, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
java.lang.System .arraycopy ( v0,v6,v3,v6,v4 );
/* .line 947 */
/* move-object v0, v3 */
} // .end method
public java.lang.String encodeToString ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "pArray" # [B */
/* .prologue */
/* .line 918 */
(( org.apache.commons.codec.binary.Base64 ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/Base64;->encode([B)[B
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( v0 );
} // .end method
Boolean hasData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 357 */
v0 = this.buffer;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isUrlSafe ( ) {
/* .locals 2 */
/* .prologue */
/* .line 348 */
v0 = this.encodeTable;
v1 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE;
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
Integer readResults ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 4 */
/* .param p1, "b" # [B */
/* .param p2, "bPos" # I */
/* .param p3, "bAvail" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 395 */
v1 = this.buffer;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 396 */
v1 = (( org.apache.commons.codec.binary.Base64 ) p0 ).avail ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/Base64;->avail()I
v0 = java.lang.Math .min ( v1,p3 );
/* .line 397 */
/* .local v0, "len":I */
v1 = this.buffer;
/* if-eq v1, p1, :cond_1 */
/* .line 398 */
v1 = this.buffer;
/* iget v2, p0, Lorg/apache/commons/codec/binary/Base64;->readPos:I */
java.lang.System .arraycopy ( v1,v2,p1,p2,v0 );
/* .line 399 */
/* iget v1, p0, Lorg/apache/commons/codec/binary/Base64;->readPos:I */
/* add-int/2addr v1, v0 */
/* iput v1, p0, Lorg/apache/commons/codec/binary/Base64;->readPos:I */
/* .line 400 */
/* iget v1, p0, Lorg/apache/commons/codec/binary/Base64;->readPos:I */
/* iget v2, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* if-lt v1, v2, :cond_0 */
/* .line 401 */
this.buffer = v3;
/* .line 410 */
} // .end local v0 # "len":I
} // :cond_0
} // :goto_0
/* .line 406 */
/* .restart local v0 # "len":I */
} // :cond_1
this.buffer = v3;
/* .line 410 */
} // .end local v0 # "len":I
} // :cond_2
/* iget-boolean v1, p0, Lorg/apache/commons/codec/binary/Base64;->eof:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
int v1 = -1; // const/4 v1, -0x1
} // :goto_1
/* move v0, v1 */
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
} // .end method
void setInitialBuffer ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "out" # [B */
/* .param p2, "outPos" # I */
/* .param p3, "outAvail" # I */
/* .prologue */
/* .line 427 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v0, p1 */
/* if-ne v0, p3, :cond_0 */
/* .line 428 */
this.buffer = p1;
/* .line 429 */
/* iput p2, p0, Lorg/apache/commons/codec/binary/Base64;->pos:I */
/* .line 430 */
/* iput p2, p0, Lorg/apache/commons/codec/binary/Base64;->readPos:I */
/* .line 432 */
} // :cond_0
return;
} // .end method
