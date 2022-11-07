public class org.apache.commons.codec.net.URLCodec implements org.apache.commons.codec.BinaryEncoder implements org.apache.commons.codec.BinaryDecoder implements org.apache.commons.codec.StringEncoder implements org.apache.commons.codec.StringDecoder {
	 /* .source "URLCodec.java" */
	 /* # interfaces */
	 /* # static fields */
	 protected static final Object ESCAPE_CHAR;
	 static final Integer RADIX;
	 protected static final java.util.BitSet WWW_FORM_URL;
	 /* # instance fields */
	 protected java.lang.String charset;
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
} // .end field
/* # direct methods */
static org.apache.commons.codec.net.URLCodec ( ) {
/* .locals 3 */
/* .prologue */
/* .line 70 */
/* new-instance v1, Ljava/util/BitSet; */
/* const/16 v2, 0x100 */
/* invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V */
/* .line 75 */
/* const/16 v0, 0x61 */
/* .local v0, "i":I */
} // :goto_0
/* const/16 v1, 0x7a */
/* if-gt v0, v1, :cond_0 */
/* .line 76 */
v1 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
(( java.util.BitSet ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
/* .line 75 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 78 */
} // :cond_0
/* const/16 v0, 0x41 */
} // :goto_1
/* const/16 v1, 0x5a */
/* if-gt v0, v1, :cond_1 */
/* .line 79 */
v1 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
(( java.util.BitSet ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
/* .line 78 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 82 */
} // :cond_1
/* const/16 v0, 0x30 */
} // :goto_2
/* const/16 v1, 0x39 */
/* if-gt v0, v1, :cond_2 */
/* .line 83 */
v1 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
(( java.util.BitSet ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
/* .line 82 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 86 */
} // :cond_2
v1 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
/* const/16 v2, 0x2d */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 87 */
v1 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
/* const/16 v2, 0x5f */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 88 */
v1 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
/* const/16 v2, 0x2e */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 89 */
v1 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
/* const/16 v2, 0x2a */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 91 */
v1 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
/* const/16 v2, 0x20 */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 92 */
return;
} // .end method
public org.apache.commons.codec.net.URLCodec ( ) {
/* .locals 1 */
/* .prologue */
/* .line 99 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/net/URLCodec;-><init>(Ljava/lang/String;)V */
/* .line 100 */
return;
} // .end method
public org.apache.commons.codec.net.URLCodec ( ) {
/* .locals 0 */
/* .param p1, "charset" # Ljava/lang/String; */
/* .prologue */
/* .line 108 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 109 */
this.charset = p1;
/* .line 110 */
return;
} // .end method
public static final decodeUrl ( Object[] p0 ) {
/* .locals 8 */
/* .param p0, "bytes" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 162 */
/* if-nez p0, :cond_0 */
/* .line 163 */
int v6 = 0; // const/4 v6, 0x0
/* .line 182 */
} // :goto_0
/* .line 165 */
} // :cond_0
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 166 */
/* .local v1, "buffer":Ljava/io/ByteArrayOutputStream; */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_1
/* array-length v6, p0 */
/* if-ge v3, v6, :cond_3 */
/* .line 167 */
/* aget-byte v0, p0, v3 */
/* .line 168 */
/* .local v0, "b":I */
/* const/16 v6, 0x2b */
/* if-ne v0, v6, :cond_1 */
/* .line 169 */
/* const/16 v6, 0x20 */
(( java.io.ByteArrayOutputStream ) v1 ).write ( v6 ); // invoke-virtual {v1, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 166 */
} // :goto_2
/* add-int/lit8 v3, v3, 0x1 */
/* .line 170 */
} // :cond_1
/* const/16 v6, 0x25 */
/* if-ne v0, v6, :cond_2 */
/* .line 172 */
/* add-int/lit8 v3, v3, 0x1 */
try { // :try_start_0
/* aget-byte v6, p0, v3 */
v5 = org.apache.commons.codec.net.Utils .digit16 ( v6 );
/* .line 173 */
/* .local v5, "u":I */
/* add-int/lit8 v3, v3, 0x1 */
/* aget-byte v6, p0, v3 */
v4 = org.apache.commons.codec.net.Utils .digit16 ( v6 );
/* .line 174 */
/* .local v4, "l":I */
/* shl-int/lit8 v6, v5, 0x4 */
/* add-int/2addr v6, v4 */
/* int-to-char v6, v6 */
(( java.io.ByteArrayOutputStream ) v1 ).write ( v6 ); // invoke-virtual {v1, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* :try_end_0 */
/* .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 175 */
} // .end local v4 # "l":I
} // .end local v5 # "u":I
/* :catch_0 */
/* move-exception v2 */
/* .line 176 */
/* .local v2, "e":Ljava/lang/ArrayIndexOutOfBoundsException; */
/* new-instance v6, Lorg/apache/commons/codec/DecoderException; */
final String v7 = "Invalid URL encoding: "; // const-string v7, "Invalid URL encoding: "
/* invoke-direct {v6, v7, v2}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v6 */
/* .line 179 */
} // .end local v2 # "e":Ljava/lang/ArrayIndexOutOfBoundsException;
} // :cond_2
(( java.io.ByteArrayOutputStream ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 182 */
} // .end local v0 # "b":I
} // :cond_3
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
} // .end method
public static final encodeUrl ( java.util.BitSet p0, Object[] p1 ) {
/* .locals 10 */
/* .param p0, "urlsafe" # Ljava/util/BitSet; */
/* .param p1, "bytes" # [B */
/* .prologue */
/* const/16 v9, 0x10 */
/* .line 122 */
/* if-nez p1, :cond_0 */
/* .line 123 */
int v8 = 0; // const/4 v8, 0x0
/* .line 148 */
} // :goto_0
/* .line 125 */
} // :cond_0
/* if-nez p0, :cond_1 */
/* .line 126 */
p0 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
/* .line 129 */
} // :cond_1
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 130 */
/* .local v2, "buffer":Ljava/io/ByteArrayOutputStream; */
/* move-object v0, p1 */
/* .local v0, "arr$":[B */
/* array-length v7, v0 */
/* .local v7, "len$":I */
int v6 = 0; // const/4 v6, 0x0
/* .local v6, "i$":I */
} // :goto_1
/* if-ge v6, v7, :cond_5 */
/* aget-byte v3, v0, v6 */
/* .line 131 */
/* .local v3, "c":B */
/* move v1, v3 */
/* .line 132 */
/* .local v1, "b":I */
/* if-gez v1, :cond_2 */
/* .line 133 */
/* add-int/lit16 v1, v1, 0x100 */
/* .line 135 */
} // :cond_2
v8 = (( java.util.BitSet ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Ljava/util/BitSet;->get(I)Z
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 136 */
/* const/16 v8, 0x20 */
/* if-ne v1, v8, :cond_3 */
/* .line 137 */
/* const/16 v1, 0x2b */
/* .line 139 */
} // :cond_3
(( java.io.ByteArrayOutputStream ) v2 ).write ( v1 ); // invoke-virtual {v2, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 130 */
} // :goto_2
/* add-int/lit8 v6, v6, 0x1 */
/* .line 141 */
} // :cond_4
/* const/16 v8, 0x25 */
(( java.io.ByteArrayOutputStream ) v2 ).write ( v8 ); // invoke-virtual {v2, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 142 */
/* shr-int/lit8 v8, v1, 0x4 */
/* and-int/lit8 v8, v8, 0xf */
v8 = java.lang.Character .forDigit ( v8,v9 );
v4 = java.lang.Character .toUpperCase ( v8 );
/* .line 143 */
/* .local v4, "hex1":C */
/* and-int/lit8 v8, v1, 0xf */
v8 = java.lang.Character .forDigit ( v8,v9 );
v5 = java.lang.Character .toUpperCase ( v8 );
/* .line 144 */
/* .local v5, "hex2":C */
(( java.io.ByteArrayOutputStream ) v2 ).write ( v4 ); // invoke-virtual {v2, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 145 */
(( java.io.ByteArrayOutputStream ) v2 ).write ( v5 ); // invoke-virtual {v2, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 148 */
} // .end local v1 # "b":I
} // .end local v3 # "c":B
} // .end local v4 # "hex1":C
} // .end local v5 # "hex2":C
} // :cond_5
(( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
} // .end method
/* # virtual methods */
public java.lang.Object decode ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "obj" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 335 */
/* if-nez p1, :cond_0 */
/* .line 336 */
int v0 = 0; // const/4 v0, 0x0
/* .line 340 */
} // .end local p1 # "obj":Ljava/lang/Object;
} // :goto_0
/* .line 337 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, [B */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 338 */
/* check-cast p1, [B */
} // .end local p1 # "obj":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.apache.commons.codec.net.URLCodec ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/URLCodec;->decode([B)[B
/* .line 339 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_1
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 340 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.net.URLCodec ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/URLCodec;->decode(Ljava/lang/String;)Ljava/lang/String;
/* .line 342 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_2
/* new-instance v0, Lorg/apache/commons/codec/DecoderException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Objects of type "; // const-string v2, "Objects of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " cannot be URL decoded"; // const-string v2, " cannot be URL decoded"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String decode ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "str" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 289 */
/* if-nez p1, :cond_0 */
/* .line 290 */
int v1 = 0; // const/4 v1, 0x0
/* .line 293 */
} // :goto_0
} // :cond_0
try { // :try_start_0
(( org.apache.commons.codec.net.URLCodec ) p0 ).getDefaultCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/net/URLCodec;->getDefaultCharset()Ljava/lang/String;
(( org.apache.commons.codec.net.URLCodec ) p0 ).decode ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/apache/commons/codec/net/URLCodec;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 294 */
/* :catch_0 */
/* move-exception v0 */
/* .line 295 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v1, Lorg/apache/commons/codec/DecoderException; */
(( java.io.UnsupportedEncodingException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public java.lang.String decode ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "str" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException;, */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 270 */
/* if-nez p1, :cond_0 */
/* .line 271 */
int v0 = 0; // const/4 v0, 0x0
/* .line 273 */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
org.apache.commons.codec.binary.StringUtils .getBytesUsAscii ( p1 );
(( org.apache.commons.codec.net.URLCodec ) p0 ).decode ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/commons/codec/net/URLCodec;->decode([B)[B
/* invoke-direct {v0, v1, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
} // .end method
public decode ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "bytes" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 210 */
org.apache.commons.codec.net.URLCodec .decodeUrl ( p1 );
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "obj" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 310 */
/* if-nez p1, :cond_0 */
/* .line 311 */
int v0 = 0; // const/4 v0, 0x0
/* .line 315 */
} // .end local p1 # "obj":Ljava/lang/Object;
} // :goto_0
/* .line 312 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, [B */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 313 */
/* check-cast p1, [B */
} // .end local p1 # "obj":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.apache.commons.codec.net.URLCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/URLCodec;->encode([B)[B
/* .line 314 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_1
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 315 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.net.URLCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/URLCodec;->encode(Ljava/lang/String;)Ljava/lang/String;
/* .line 317 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_2
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Objects of type "; // const-string v2, "Objects of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " cannot be URL encoded"; // const-string v2, " cannot be URL encoded"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "str" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 244 */
/* if-nez p1, :cond_0 */
/* .line 245 */
int v1 = 0; // const/4 v1, 0x0
/* .line 248 */
} // :goto_0
} // :cond_0
try { // :try_start_0
(( org.apache.commons.codec.net.URLCodec ) p0 ).getDefaultCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/net/URLCodec;->getDefaultCharset()Ljava/lang/String;
(( org.apache.commons.codec.net.URLCodec ) p0 ).encode ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/apache/commons/codec/net/URLCodec;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 249 */
/* :catch_0 */
/* move-exception v0 */
/* .line 250 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v1, Lorg/apache/commons/codec/EncoderException; */
(( java.io.UnsupportedEncodingException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public java.lang.String encode ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 225 */
/* if-nez p1, :cond_0 */
/* .line 226 */
int v0 = 0; // const/4 v0, 0x0
/* .line 228 */
} // :goto_0
} // :cond_0
(( java.lang.String ) p1 ).getBytes ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
(( org.apache.commons.codec.net.URLCodec ) p0 ).encode ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/commons/codec/net/URLCodec;->encode([B)[B
org.apache.commons.codec.binary.StringUtils .newStringUsAscii ( v0 );
} // .end method
public encode ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "bytes" # [B */
/* .prologue */
/* .line 194 */
v0 = org.apache.commons.codec.net.URLCodec.WWW_FORM_URL;
org.apache.commons.codec.net.URLCodec .encodeUrl ( v0,p1 );
} // .end method
public java.lang.String getDefaultCharset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 353 */
v0 = this.charset;
} // .end method
public java.lang.String getEncoding ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 365 */
v0 = this.charset;
} // .end method
