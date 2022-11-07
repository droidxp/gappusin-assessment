public class org.apache.commons.codec.binary.Hex implements org.apache.commons.codec.BinaryEncoder implements org.apache.commons.codec.BinaryDecoder {
	 /* .source "Hex.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String DEFAULT_CHARSET_NAME;
	 private static final DIGITS_LOWER;
	 private static final DIGITS_UPPER;
	 /* # instance fields */
	 private final java.lang.String charsetName;
	 /* # direct methods */
	 static org.apache.commons.codec.binary.Hex ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const/16 v1, 0x10 */
		 /* .line 46 */
		 /* new-array v0, v1, [C */
		 /* fill-array-data v0, :array_0 */
		 /* .line 51 */
		 /* new-array v0, v1, [C */
		 /* fill-array-data v0, :array_1 */
		 return;
		 /* .line 46 */
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
	 /* .line 51 */
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
/* .line 175 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 177 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
this.charsetName = v0;
/* .line 178 */
return;
} // .end method
public org.apache.commons.codec.binary.Hex ( ) {
/* .locals 0 */
/* .param p1, "csName" # Ljava/lang/String; */
/* .prologue */
/* .line 187 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 188 */
this.charsetName = p1;
/* .line 189 */
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
/* .line 66 */
/* array-length v3, p0 */
/* .line 68 */
/* .local v3, "len":I */
/* and-int/lit8 v5, v3, 0x1 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 69 */
/* new-instance v5, Lorg/apache/commons/codec/DecoderException; */
final String v6 = "Odd number of characters."; // const-string v6, "Odd number of characters."
/* invoke-direct {v5, v6}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
/* .line 72 */
} // :cond_0
/* shr-int/lit8 v5, v3, 0x1 */
/* new-array v4, v5, [B */
/* .line 75 */
/* .local v4, "out":[B */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "j":I */
} // :goto_0
/* if-ge v2, v3, :cond_1 */
/* .line 76 */
/* aget-char v5, p0, v2 */
v5 = org.apache.commons.codec.binary.Hex .toDigit ( v5,v2 );
/* shl-int/lit8 v0, v5, 0x4 */
/* .line 77 */
/* .local v0, "f":I */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 78 */
/* aget-char v5, p0, v2 */
v5 = org.apache.commons.codec.binary.Hex .toDigit ( v5,v2 );
/* or-int/2addr v0, v5 */
/* .line 79 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 80 */
/* and-int/lit16 v5, v0, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v4, v1 */
/* .line 75 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 83 */
} // .end local v0 # "f":I
} // :cond_1
} // .end method
public static encodeHex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 96 */
int v0 = 1; // const/4 v0, 0x1
org.apache.commons.codec.binary.Hex .encodeHex ( p0,v0 );
} // .end method
public static encodeHex ( Object[] p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .param p1, "toLowerCase" # Z */
/* .prologue */
/* .line 112 */
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
/* .line 128 */
/* array-length v3, p0 */
/* .line 129 */
/* .local v3, "l":I */
/* shl-int/lit8 v5, v3, 0x1 */
/* new-array v4, v5, [C */
/* .line 131 */
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
/* .line 132 */
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "j":I
/* .restart local v1 # "j":I */
/* aget-byte v5, p0, v0 */
/* and-int/lit16 v5, v5, 0xf0 */
/* ushr-int/lit8 v5, v5, 0x4 */
/* aget-char v5, p1, v5 */
/* aput-char v5, v4, v2 */
/* .line 133 */
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "j":I
/* .restart local v2 # "j":I */
/* aget-byte v5, p0, v0 */
/* and-int/lit8 v5, v5, 0xf */
/* aget-char v5, p1, v5 */
/* aput-char v5, v4, v1 */
/* .line 131 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 135 */
} // :cond_0
} // .end method
public static java.lang.String encodeHexString ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 148 */
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
/* .line 163 */
/* const/16 v1, 0x10 */
v0 = java.lang.Character .digit ( p0,v1 );
/* .line 164 */
/* .local v0, "digit":I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 165 */
/* new-instance v1, Lorg/apache/commons/codec/DecoderException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Illegal hexadecimal charcter "; // const-string v3, "Illegal hexadecimal charcter "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v3 = " at index "; // const-string v3, " at index "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 167 */
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
/* .line 226 */
try { // :try_start_0
/* instance-of v2, p1, Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "object":Ljava/lang/Object;
(( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
/* .line 227 */
/* .local v0, "charArray":[C */
} // :goto_0
org.apache.commons.codec.binary.Hex .decodeHex ( v0 );
/* .line 226 */
} // .end local v0 # "charArray":[C
/* .restart local p1 # "object":Ljava/lang/Object; */
} // :cond_0
/* check-cast p1, [C */
} // .end local p1 # "object":Ljava/lang/Object;
/* check-cast p1, [C */
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v0, p1 */
/* .line 228 */
/* :catch_0 */
/* move-exception v1 */
/* .line 229 */
/* .local v1, "e":Ljava/lang/ClassCastException; */
/* new-instance v2, Lorg/apache/commons/codec/DecoderException; */
(( java.lang.ClassCastException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;
/* invoke-direct {v2, v3, v1}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
} // .end method
public decode ( Object[] p0 ) {
/* .locals 3 */
/* .param p1, "array" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 205 */
try { // :try_start_0
/* new-instance v1, Ljava/lang/String; */
(( org.apache.commons.codec.binary.Hex ) p0 ).getCharsetName ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/Hex;->getCharsetName()Ljava/lang/String;
/* invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
(( java.lang.String ) v1 ).toCharArray ( ); // invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C
org.apache.commons.codec.binary.Hex .decodeHex ( v1 );
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 206 */
/* :catch_0 */
/* move-exception v0 */
/* .line 207 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v1, Lorg/apache/commons/codec/DecoderException; */
(( java.io.UnsupportedEncodingException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
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
/* .line 272 */
try { // :try_start_0
/* instance-of v2, p1, Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "object":Ljava/lang/Object;
(( org.apache.commons.codec.binary.Hex ) p0 ).getCharsetName ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/Hex;->getCharsetName()Ljava/lang/String;
(( java.lang.String ) p1 ).getBytes ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* .line 273 */
/* .local v0, "byteArray":[B */
} // :goto_0
org.apache.commons.codec.binary.Hex .encodeHex ( v0 );
/* .line 272 */
} // .end local v0 # "byteArray":[B
/* .restart local p1 # "object":Ljava/lang/Object; */
} // :cond_0
/* check-cast p1, [B */
} // .end local p1 # "object":Ljava/lang/Object;
/* check-cast p1, [B */
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_1 */
/* move-object v0, p1 */
/* .line 274 */
/* :catch_0 */
/* move-exception v1 */
/* .line 275 */
/* .local v1, "e":Ljava/lang/ClassCastException; */
/* new-instance v2, Lorg/apache/commons/codec/EncoderException; */
(( java.lang.ClassCastException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;
/* invoke-direct {v2, v3, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
/* .line 276 */
} // .end local v1 # "e":Ljava/lang/ClassCastException;
/* :catch_1 */
/* move-exception v1 */
/* .line 277 */
/* .local v1, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v2, Lorg/apache/commons/codec/EncoderException; */
(( java.io.UnsupportedEncodingException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
/* invoke-direct {v2, v3, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v2 */
} // .end method
public encode ( Object[] p0 ) {
/* .locals 2 */
/* .param p1, "array" # [B */
/* .prologue */
/* .line 251 */
org.apache.commons.codec.binary.Hex .encodeHexString ( p1 );
(( org.apache.commons.codec.binary.Hex ) p0 ).getCharsetName ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/Hex;->getCharsetName()Ljava/lang/String;
org.apache.commons.codec.binary.StringUtils .getBytesUnchecked ( v0,v1 );
} // .end method
public java.lang.String getCharsetName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 288 */
v0 = this.charsetName;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 297 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "[charsetName="; // const-string v1, "[charsetName="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.charsetName;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
