public class org.apache.commons.codec.net.QuotedPrintableCodec implements org.apache.commons.codec.BinaryEncoder implements org.apache.commons.codec.BinaryDecoder implements org.apache.commons.codec.StringEncoder implements org.apache.commons.codec.StringDecoder {
	 /* .source "QuotedPrintableCodec.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final Object ESCAPE_CHAR;
	 private static final java.util.BitSet PRINTABLE_CHARS;
	 private static final Object SPACE;
	 private static final Object TAB;
	 /* # instance fields */
	 private final java.nio.charset.Charset charset;
	 /* # direct methods */
	 static org.apache.commons.codec.net.QuotedPrintableCodec ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 70 */
		 /* new-instance v1, Ljava/util/BitSet; */
		 /* const/16 v2, 0x100 */
		 /* invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V */
		 /* .line 80 */
		 /* const/16 v0, 0x21 */
		 /* .local v0, "i":I */
	 } // :goto_0
	 /* const/16 v1, 0x3c */
	 /* if-gt v0, v1, :cond_0 */
	 /* .line 81 */
	 v1 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS;
	 (( java.util.BitSet ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
	 /* .line 80 */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* .line 83 */
} // :cond_0
/* const/16 v0, 0x3e */
} // :goto_1
/* const/16 v1, 0x7e */
/* if-gt v0, v1, :cond_1 */
/* .line 84 */
v1 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS;
(( java.util.BitSet ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
/* .line 83 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 86 */
} // :cond_1
v1 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x9 */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 87 */
v1 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x20 */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 88 */
return;
} // .end method
public org.apache.commons.codec.net.QuotedPrintableCodec ( ) {
/* .locals 1 */
/* .prologue */
/* .line 94 */
v0 = org.apache.commons.codec.Charsets.UTF_8;
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;-><init>(Ljava/nio/charset/Charset;)V */
/* .line 95 */
return;
} // .end method
public org.apache.commons.codec.net.QuotedPrintableCodec ( ) {
/* .locals 1 */
/* .param p1, "charsetName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/nio/charset/IllegalCharsetNameException;, */
/* Ljava/lang/IllegalArgumentException;, */
/* Ljava/nio/charset/UnsupportedCharsetException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 125 */
java.nio.charset.Charset .forName ( p1 );
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;-><init>(Ljava/nio/charset/Charset;)V */
/* .line 126 */
return;
} // .end method
public org.apache.commons.codec.net.QuotedPrintableCodec ( ) {
/* .locals 0 */
/* .param p1, "charset" # Ljava/nio/charset/Charset; */
/* .prologue */
/* .line 104 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 105 */
this.charset = p1;
/* .line 106 */
return;
} // .end method
public static final decodeQuotedPrintable ( Object[] p0 ) {
/* .locals 8 */
/* .param p0, "bytes" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 192 */
/* if-nez p0, :cond_0 */
/* .line 193 */
int v6 = 0; // const/4 v6, 0x0
/* .line 210 */
} // :goto_0
/* .line 195 */
} // :cond_0
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 196 */
/* .local v1, "buffer":Ljava/io/ByteArrayOutputStream; */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_1
/* array-length v6, p0 */
/* if-ge v3, v6, :cond_2 */
/* .line 197 */
/* aget-byte v0, p0, v3 */
/* .line 198 */
/* .local v0, "b":I */
/* const/16 v6, 0x3d */
/* if-ne v0, v6, :cond_1 */
/* .line 200 */
/* add-int/lit8 v3, v3, 0x1 */
try { // :try_start_0
/* aget-byte v6, p0, v3 */
v5 = org.apache.commons.codec.net.Utils .digit16 ( v6 );
/* .line 201 */
/* .local v5, "u":I */
/* add-int/lit8 v3, v3, 0x1 */
/* aget-byte v6, p0, v3 */
v4 = org.apache.commons.codec.net.Utils .digit16 ( v6 );
/* .line 202 */
/* .local v4, "l":I */
/* shl-int/lit8 v6, v5, 0x4 */
/* add-int/2addr v6, v4 */
/* int-to-char v6, v6 */
(( java.io.ByteArrayOutputStream ) v1 ).write ( v6 ); // invoke-virtual {v1, v6}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* :try_end_0 */
/* .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 196 */
} // .end local v4 # "l":I
} // .end local v5 # "u":I
} // :goto_2
/* add-int/lit8 v3, v3, 0x1 */
/* .line 203 */
/* :catch_0 */
/* move-exception v2 */
/* .line 204 */
/* .local v2, "e":Ljava/lang/ArrayIndexOutOfBoundsException; */
/* new-instance v6, Lorg/apache/commons/codec/DecoderException; */
final String v7 = "Invalid quoted-printable encoding"; // const-string v7, "Invalid quoted-printable encoding"
/* invoke-direct {v6, v7, v2}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v6 */
/* .line 207 */
} // .end local v2 # "e":Ljava/lang/ArrayIndexOutOfBoundsException;
} // :cond_1
(( java.io.ByteArrayOutputStream ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 210 */
} // .end local v0 # "b":I
} // :cond_2
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
} // .end method
private static final void encodeQuotedPrintable ( Integer p0, java.io.ByteArrayOutputStream p1 ) {
/* .locals 4 */
/* .param p0, "b" # I */
/* .param p1, "buffer" # Ljava/io/ByteArrayOutputStream; */
/* .prologue */
/* const/16 v3, 0x10 */
/* .line 137 */
/* const/16 v2, 0x3d */
(( java.io.ByteArrayOutputStream ) p1 ).write ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 138 */
/* shr-int/lit8 v2, p0, 0x4 */
/* and-int/lit8 v2, v2, 0xf */
v2 = java.lang.Character .forDigit ( v2,v3 );
v0 = java.lang.Character .toUpperCase ( v2 );
/* .line 139 */
/* .local v0, "hex1":C */
/* and-int/lit8 v2, p0, 0xf */
v2 = java.lang.Character .forDigit ( v2,v3 );
v1 = java.lang.Character .toUpperCase ( v2 );
/* .line 140 */
/* .local v1, "hex2":C */
(( java.io.ByteArrayOutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 141 */
(( java.io.ByteArrayOutputStream ) p1 ).write ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 142 */
return;
} // .end method
public static final encodeQuotedPrintable ( java.util.BitSet p0, Object[] p1 ) {
/* .locals 7 */
/* .param p0, "printable" # Ljava/util/BitSet; */
/* .param p1, "bytes" # [B */
/* .prologue */
/* .line 157 */
/* if-nez p1, :cond_0 */
/* .line 158 */
int v6 = 0; // const/4 v6, 0x0
/* .line 175 */
} // :goto_0
/* .line 160 */
} // :cond_0
/* if-nez p0, :cond_1 */
/* .line 161 */
p0 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS;
/* .line 163 */
} // :cond_1
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 164 */
/* .local v2, "buffer":Ljava/io/ByteArrayOutputStream; */
/* move-object v0, p1 */
/* .local v0, "arr$":[B */
/* array-length v5, v0 */
/* .local v5, "len$":I */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i$":I */
} // :goto_1
/* if-ge v4, v5, :cond_4 */
/* aget-byte v3, v0, v4 */
/* .line 165 */
/* .local v3, "c":B */
/* move v1, v3 */
/* .line 166 */
/* .local v1, "b":I */
/* if-gez v1, :cond_2 */
/* .line 167 */
/* add-int/lit16 v1, v1, 0x100 */
/* .line 169 */
} // :cond_2
v6 = (( java.util.BitSet ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Ljava/util/BitSet;->get(I)Z
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 170 */
(( java.io.ByteArrayOutputStream ) v2 ).write ( v1 ); // invoke-virtual {v2, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* .line 164 */
} // :goto_2
/* add-int/lit8 v4, v4, 0x1 */
/* .line 172 */
} // :cond_3
org.apache.commons.codec.net.QuotedPrintableCodec .encodeQuotedPrintable ( v1,v2 );
/* .line 175 */
} // .end local v1 # "b":I
} // .end local v3 # "c":B
} // :cond_4
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
/* .line 360 */
/* if-nez p1, :cond_0 */
/* .line 361 */
int v0 = 0; // const/4 v0, 0x0
/* .line 365 */
} // .end local p1 # "obj":Ljava/lang/Object;
} // :goto_0
/* .line 362 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, [B */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 363 */
/* check-cast p1, [B */
} // .end local p1 # "obj":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->decode([B)[B
/* .line 364 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_1
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 365 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->decode(Ljava/lang/String;)Ljava/lang/String;
/* .line 367 */
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
final String v2 = " cannot be quoted-printable decoded"; // const-string v2, " cannot be quoted-printable decoded"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String decode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 319 */
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).getCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->getCharset()Ljava/nio/charset/Charset;
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).decode ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->decode(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
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
/* .line 300 */
/* if-nez p1, :cond_0 */
/* .line 301 */
int v0 = 0; // const/4 v0, 0x0
/* .line 303 */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
org.apache.commons.codec.binary.StringUtils .getBytesUsAscii ( p1 );
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).decode ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->decode([B)[B
/* invoke-direct {v0, v1, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
} // .end method
public java.lang.String decode ( java.lang.String p0, java.nio.charset.Charset p1 ) {
/* .locals 2 */
/* .param p1, "str" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/nio/charset/Charset; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 279 */
/* if-nez p1, :cond_0 */
/* .line 280 */
int v0 = 0; // const/4 v0, 0x0
/* .line 282 */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
org.apache.commons.codec.binary.StringUtils .getBytesUsAscii ( p1 );
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).decode ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->decode([B)[B
/* invoke-direct {v0, v1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
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
/* .line 243 */
org.apache.commons.codec.net.QuotedPrintableCodec .decodeQuotedPrintable ( p1 );
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
/* .line 334 */
/* if-nez p1, :cond_0 */
/* .line 335 */
int v0 = 0; // const/4 v0, 0x0
/* .line 339 */
} // .end local p1 # "obj":Ljava/lang/Object;
} // :goto_0
/* .line 336 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, [B */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 337 */
/* check-cast p1, [B */
} // .end local p1 # "obj":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->encode([B)[B
/* .line 338 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_1
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 339 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->encode(Ljava/lang/String;)Ljava/lang/String;
/* .line 341 */
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
final String v2 = " cannot be quoted-printable encoded"; // const-string v2, " cannot be quoted-printable encoded"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 262 */
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).getCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->getCharset()Ljava/nio/charset/Charset;
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).encode ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->encode(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
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
/* .line 427 */
/* if-nez p1, :cond_0 */
/* .line 428 */
int v0 = 0; // const/4 v0, 0x0
/* .line 430 */
} // :goto_0
} // :cond_0
(( java.lang.String ) p1 ).getBytes ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).encode ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->encode([B)[B
org.apache.commons.codec.binary.StringUtils .newStringUsAscii ( v0 );
} // .end method
public java.lang.String encode ( java.lang.String p0, java.nio.charset.Charset p1 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/nio/charset/Charset; */
/* .prologue */
/* .line 406 */
/* if-nez p1, :cond_0 */
/* .line 407 */
int v0 = 0; // const/4 v0, 0x0
/* .line 409 */
} // :goto_0
} // :cond_0
(( java.lang.String ) p1 ).getBytes ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
(( org.apache.commons.codec.net.QuotedPrintableCodec ) p0 ).encode ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/commons/codec/net/QuotedPrintableCodec;->encode([B)[B
org.apache.commons.codec.binary.StringUtils .newStringUsAscii ( v0 );
} // .end method
public encode ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "bytes" # [B */
/* .prologue */
/* .line 225 */
v0 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS;
org.apache.commons.codec.net.QuotedPrintableCodec .encodeQuotedPrintable ( v0,p1 );
} // .end method
public java.nio.charset.Charset getCharset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 380 */
v0 = this.charset;
} // .end method
public java.lang.String getDefaultCharset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 389 */
v0 = this.charset;
(( java.nio.charset.Charset ) v0 ).name ( ); // invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
} // .end method
