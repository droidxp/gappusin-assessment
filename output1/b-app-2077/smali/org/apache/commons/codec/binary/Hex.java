public class org.apache.commons.codec.binary.Hex implements org.apache.commons.codec.BinaryEncoder implements org.apache.commons.codec.BinaryDecoder {
	 /* .source "Hex.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.nio.charset.Charset DEFAULT_CHARSET;
	 public static final java.lang.String DEFAULT_CHARSET_NAME;
	 private static final DIGITS_LOWER;
	 private static final DIGITS_UPPER;
	 /* # instance fields */
	 private final java.nio.charset.Charset charset;
	 /* # direct methods */
	 static org.apache.commons.codec.binary.Hex ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const/16 v1, 0x10 */
		 /* .line 45 */
		 v0 = org.apache.commons.codec.Charsets.UTF_8;
		 /* .line 57 */
		 /* new-array v0, v1, [C */
		 /* fill-array-data v0, :array_0 */
		 /* .line 63 */
		 /* new-array v0, v1, [C */
		 /* fill-array-data v0, :array_1 */
		 return;
		 /* .line 57 */
		 /* nop */
		 /* :array_0 */
		 /* .array-data 2 */
		 /* 0x30s */
		 /* 0x31s */
		 /* 0x32s */
		 /* 0x33s */
		 /* 0x34s */
		 /* 0x35s */
		 /* 0x36s */
		 /* 0x37s */
		 /* 0x38s */
		 /* 0x39s */
		 /* 0x61s */
		 /* 0x62s */
		 /* 0x63s */
		 /* 0x64s */
		 /* 0x65s */
		 /* 0x66s */
	 } // .end array-data
	 /* .line 63 */
	 /* :array_1 */
	 /* .array-data 2 */
	 /* 0x30s */
	 /* 0x31s */
	 /* 0x32s */
	 /* 0x33s */
	 /* 0x34s */
	 /* 0x35s */
	 /* 0x36s */
	 /* 0x37s */
	 /* 0x38s */
	 /* 0x39s */
	 /* 0x41s */
	 /* 0x42s */
	 /* 0x43s */
	 /* 0x44s */
	 /* 0x45s */
	 /* 0x46s */
} // .end array-data
} // .end method
public org.apache.commons.codec.binary.Hex ( ) {
/* .locals 1 */
/* .prologue */
/* .line 188 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 190 */
v0 = org.apache.commons.codec.binary.Hex.DEFAULT_CHARSET;
this.charset = v0;
/* .line 191 */
return;
} // .end method
public org.apache.commons.codec.binary.Hex ( ) {
/* .locals 1 */
/* .param p1, "charsetName" # Ljava/lang/String; */
/* .prologue */
/* .line 215 */
java.nio.charset.Charset .forName ( p1 );
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/binary/Hex;-><init>(Ljava/nio/charset/Charset;)V */
/* .line 216 */
return;
} // .end method
public org.apache.commons.codec.binary.Hex ( ) {
/* .locals 0 */
/* .param p1, "charset" # Ljava/nio/charset/Charset; */
/* .prologue */
/* .line 200 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 201 */
this.charset = p1;
/* .line 202 */
return;
} // .end method
public static decodeHex ( Object[] p0 ) {
/* .locals 7 */
/* .param p0, "data" # [C */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 79 */
/* array-length v3, p0 */
/* .line 81 */
/* .local v3, "len":I */
/* and-int/lit8 v5, v3, 0x1 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 82 */
/* new-instance v5, Lorg/apache/commons/codec/DecoderException; */
final String v6 = "Odd number of characters."; // const-string v6, "Odd number of characters."
/* invoke-direct {v5, v6}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
/* .line 85 */
} // :cond_0
/* shr-int/lit8 v5, v3, 0x1 */
/* new-array v4, v5, [B */
/* .line 88 */
/* .local v4, "out":[B */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "j":I */
} // :goto_0
/* if-ge v2, v3, :cond_1 */
/* .line 89 */
/* aget-char v5, p0, v2 */
v5 = org.apache.commons.codec.binary.Hex .toDigit ( v5,v2 );
/* shl-int/lit8 v0, v5, 0x4 */
/* .line 90 */
/* .local v0, "f":I */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 91 */
/* aget-char v5, p0, v2 */
v5 = org.apache.commons.codec.binary.Hex .toDigit ( v5,v2 );
/* or-int/2addr v0, v5 */
/* .line 92 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 93 */
/* and-int/lit16 v5, v0, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v4, v1 */
/* .line 88 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 96 */
} // .end local v0 # "f":I
} // :cond_1
} // .end method
public static encodeHex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 109 */
int v0 = 1; // const/4 v0, 0x1
org.apache.commons.codec.binary.Hex .encodeHex ( p0,v0 );
} // .end method
public static encodeHex ( Object[] p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .param p1, "toLowerCase" # Z */
/* .prologue */
/* .line 125 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = org.apache.commons.codec.binary.Hex.DIGITS_LOWER;
} // :goto_0
org.apache.commons.codec.binary.Hex .encodeHex ( p0,v0 );
} // :cond_0
v0 = org.apache.commons.codec.binary.Hex.DIGITS_UPPER;
} // .end method
protected static encodeHex ( Object[] p0, Object[] p1 ) {
/* .locals 6 */
/* .param p0, "data" # [B */
/* .param p1, "toDigits" # [C */
/* .prologue */
/* .line 141 */
/* array-length v3, p0 */
/* .line 142 */
/* .local v3, "l":I */
/* shl-int/lit8 v5, v3, 0x1 */
/* new-array v4, v5, [C */
/* .line 144 */
/* .local v4, "out":[C */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "j":I */
/* move v2, v1 */
} // .end local v1 # "j":I
/* .local v2, "j":I */
} // :goto_0
/* if-ge v0, v3, :cond_0 */
/* .line 145 */
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "j":I
/* .restart local v1 # "j":I */
/* aget-byte v5, p0, v0 */
/* and-int/lit16 v5, v5, 0xf0 */
/* ushr-int/lit8 v5, v5, 0x4 */
/* aget-char v5, p1, v5 */
/* aput-char v5, v4, v2 */
/* .line 146 */
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "j":I
/* .restart local v2 # "j":I */
/* aget-byte v5, p0, v0 */
/* and-int/lit8 v5, v5, 0xf */
/* aget-char v5, p1, v5 */
/* aput-char v5, v4, v1 */
/* .line 144 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 148 */
} // :cond_0
} // .end method
public static java.lang.String encodeHexString ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 161 */
/* new-instance v0, Ljava/lang/String; */
org.apache.commons.codec.binary.Hex .encodeHex ( p0 );
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
} // .end method
protected static Integer toDigit ( Object p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "ch" # C */
/* .param p1, "index" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 176 */
/* const/16 v1, 0x10 */
v0 = java.lang.Character .digit ( p0,v1 );
/* .line 177 */
/* .local v0, "digit":I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 178 */
/* new-instance v1, Lorg/apache/commons/codec/DecoderException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Illegal hexadecimal character "; // const-string v3, "Illegal hexadecimal character "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v3 = " at index "; // const-string v3, " at index "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 180 */
} // :cond_0
} // .end method
/* # virtual methods */
public java.lang.Object decode ( java.lang.Object p0 ) {
/* .locals 4 */
/* .param p1, "object" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 251 */
try { // :try_start_0
/* instance-of v2, p1, Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "object":Ljava/lang/Object;
(( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
/* .line 252 */
/* .local v0, "charArray":[C */
} // :goto_0
org.apache.commons.codec.binary.Hex .decodeHex ( v0 );
/* .line 251 */
} // .end local v0 # "charArray":[C
/* .restart local p1 # "object":Ljava/lang/Object; */
} // :cond_0
/* check-cast p1, [C */
} // .end local p1 # "object":Ljava/lang/Object;
/* check-cast p1, [C */
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v0, p1 */
/* .line 253 */
/* :catch_0 */
/* move-exception v1 */
/* .line 254 */
/* .local v1, "e":Ljava/lang/ClassCastException; */
/* new-instance v2, Lorg/apache/commons/codec/DecoderException; */
(( java.lang.ClassCastException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;
/* invoke-direct {v2, v3, v1}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
} // .end method
public decode ( Object[] p0 ) {
/* .locals 2 */
/* .param p1, "array" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 232 */
/* new-instance v0, Ljava/lang/String; */
(( org.apache.commons.codec.binary.Hex ) p0 ).getCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/Hex;->getCharset()Ljava/nio/charset/Charset;
/* invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
(( java.lang.String ) v0 ).toCharArray ( ); // invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
org.apache.commons.codec.binary.Hex .decodeHex ( v0 );
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 4 */
/* .param p1, "object" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 297 */
try { // :try_start_0
/* instance-of v2, p1, Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "object":Ljava/lang/Object;
(( org.apache.commons.codec.binary.Hex ) p0 ).getCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/Hex;->getCharset()Ljava/nio/charset/Charset;
(( java.lang.String ) p1 ).getBytes ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
/* .line 299 */
/* .local v0, "byteArray":[B */
} // :goto_0
org.apache.commons.codec.binary.Hex .encodeHex ( v0 );
/* .line 297 */
} // .end local v0 # "byteArray":[B
/* .restart local p1 # "object":Ljava/lang/Object; */
} // :cond_0
/* check-cast p1, [B */
} // .end local p1 # "object":Ljava/lang/Object;
/* check-cast p1, [B */
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v0, p1 */
/* .line 300 */
/* :catch_0 */
/* move-exception v1 */
/* .line 301 */
/* .local v1, "e":Ljava/lang/ClassCastException; */
/* new-instance v2, Lorg/apache/commons/codec/EncoderException; */
(( java.lang.ClassCastException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;
/* invoke-direct {v2, v3, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
} // .end method
public encode ( Object[] p0 ) {
/* .locals 2 */
/* .param p1, "array" # [B */
/* .prologue */
/* .line 275 */
org.apache.commons.codec.binary.Hex .encodeHexString ( p1 );
(( org.apache.commons.codec.binary.Hex ) p0 ).getCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/Hex;->getCharset()Ljava/nio/charset/Charset;
(( java.lang.String ) v0 ).getBytes ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
} // .end method
public java.nio.charset.Charset getCharset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 312 */
v0 = this.charset;
} // .end method
public java.lang.String getCharsetName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 322 */
v0 = this.charset;
(( java.nio.charset.Charset ) v0 ).name ( ); // invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 332 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "[charsetName="; // const-string v1, "[charsetName="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.charset;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
