public class org.apache.commons.codec.net.QCodec extends org.apache.commons.codec.net.RFC1522Codec implements org.apache.commons.codec.StringEncoder implements org.apache.commons.codec.StringDecoder {
	 /* .source "QCodec.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final Object BLANK;
	 private static final java.util.BitSet PRINTABLE_CHARS;
	 private static final Object UNDERSCORE;
	 /* # instance fields */
	 private final java.nio.charset.Charset charset;
	 private Boolean encodeBlanks;
	 /* # direct methods */
	 static org.apache.commons.codec.net.QCodec ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 61 */
		 /* new-instance v1, Ljava/util/BitSet; */
		 /* const/16 v2, 0x100 */
		 /* invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V */
		 /* .line 65 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x20 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 66 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x21 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 67 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x22 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 68 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x23 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 69 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x24 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 70 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x25 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 71 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x26 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 72 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x27 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 73 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x28 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 74 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x29 */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 75 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x2a */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 76 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x2b */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 77 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x2c */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 78 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x2d */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 79 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x2e */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 80 */
		 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
		 /* const/16 v2, 0x2f */
		 (( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
		 /* .line 81 */
		 /* const/16 v0, 0x30 */
		 /* .local v0, "i":I */
	 } // :goto_0
	 /* const/16 v1, 0x39 */
	 /* if-gt v0, v1, :cond_0 */
	 /* .line 82 */
	 v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
	 (( java.util.BitSet ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
	 /* .line 81 */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* .line 84 */
} // :cond_0
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x3a */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 85 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x3b */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 86 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x3c */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 87 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x3e */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 88 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x40 */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 89 */
/* const/16 v0, 0x41 */
} // :goto_1
/* const/16 v1, 0x5a */
/* if-gt v0, v1, :cond_1 */
/* .line 90 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
(( java.util.BitSet ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
/* .line 89 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 92 */
} // :cond_1
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x5b */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 93 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x5c */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 94 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x5d */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 95 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x5e */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 96 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x60 */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 97 */
/* const/16 v0, 0x61 */
} // :goto_2
/* const/16 v1, 0x7a */
/* if-gt v0, v1, :cond_2 */
/* .line 98 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
(( java.util.BitSet ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V
/* .line 97 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 100 */
} // :cond_2
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x7b */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 101 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x7c */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 102 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x7d */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 103 */
v1 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
/* const/16 v2, 0x7e */
(( java.util.BitSet ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V
/* .line 104 */
return;
} // .end method
public org.apache.commons.codec.net.QCodec ( ) {
/* .locals 1 */
/* .prologue */
/* .line 116 */
v0 = org.apache.commons.codec.Charsets.UTF_8;
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/net/QCodec;-><init>(Ljava/nio/charset/Charset;)V */
/* .line 117 */
return;
} // .end method
public org.apache.commons.codec.net.QCodec ( ) {
/* .locals 1 */
/* .param p1, "charsetName" # Ljava/lang/String; */
/* .prologue */
/* .line 144 */
java.nio.charset.Charset .forName ( p1 );
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/net/QCodec;-><init>(Ljava/nio/charset/Charset;)V */
/* .line 145 */
return;
} // .end method
public org.apache.commons.codec.net.QCodec ( ) {
/* .locals 1 */
/* .param p1, "charset" # Ljava/nio/charset/Charset; */
/* .prologue */
/* .line 129 */
/* invoke-direct {p0}, Lorg/apache/commons/codec/net/RFC1522Codec;-><init>()V */
/* .line 110 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/apache/commons/codec/net/QCodec;->encodeBlanks:Z */
/* .line 130 */
this.charset = p1;
/* .line 131 */
return;
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
/* .line 310 */
/* if-nez p1, :cond_0 */
/* .line 311 */
int v0 = 0; // const/4 v0, 0x0
/* .line 313 */
} // .end local p1 # "obj":Ljava/lang/Object;
} // :goto_0
/* .line 312 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 313 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.net.QCodec ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/QCodec;->decode(Ljava/lang/String;)Ljava/lang/String;
/* .line 315 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_1
/* new-instance v0, Lorg/apache/commons/codec/DecoderException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Objects of type "; // const-string v2, "Objects of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " cannot be decoded using Q codec"; // const-string v2, " cannot be decoded using Q codec"
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
/* .line 265 */
/* if-nez p1, :cond_0 */
/* .line 266 */
int v1 = 0; // const/4 v1, 0x0
/* .line 269 */
} // :goto_0
} // :cond_0
try { // :try_start_0
(( org.apache.commons.codec.net.QCodec ) p0 ).decodeText ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/QCodec;->decodeText(Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 270 */
/* :catch_0 */
/* move-exception v0 */
/* .line 271 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v1, Lorg/apache/commons/codec/DecoderException; */
(( java.io.UnsupportedEncodingException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
protected doDecoding ( Object[] p0 ) {
/* .locals 9 */
/* .param p1, "bytes" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v8, 0x5f */
/* .line 170 */
/* if-nez p1, :cond_0 */
/* .line 171 */
int v7 = 0; // const/4 v7, 0x0
/* .line 192 */
} // :goto_0
/* .line 173 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 174 */
/* .local v2, "hasUnderscores":Z */
/* move-object v0, p1 */
/* .local v0, "arr$":[B */
/* array-length v5, v0 */
/* .local v5, "len$":I */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i$":I */
} // :goto_1
/* if-ge v4, v5, :cond_1 */
/* aget-byte v1, v0, v4 */
/* .line 175 */
/* .local v1, "b":B */
/* if-ne v1, v8, :cond_2 */
/* .line 176 */
int v2 = 1; // const/4 v2, 0x1
/* .line 180 */
} // .end local v1 # "b":B
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 181 */
/* array-length v7, p1 */
/* new-array v6, v7, [B */
/* .line 182 */
/* .local v6, "tmp":[B */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_2
/* array-length v7, p1 */
/* if-ge v3, v7, :cond_4 */
/* .line 183 */
/* aget-byte v1, p1, v3 */
/* .line 184 */
/* .restart local v1 # "b":B */
/* if-eq v1, v8, :cond_3 */
/* .line 185 */
/* aput-byte v1, v6, v3 */
/* .line 182 */
} // :goto_3
/* add-int/lit8 v3, v3, 0x1 */
/* .line 174 */
} // .end local v3 # "i":I
} // .end local v6 # "tmp":[B
} // :cond_2
/* add-int/lit8 v4, v4, 0x1 */
/* .line 187 */
/* .restart local v3 # "i":I */
/* .restart local v6 # "tmp":[B */
} // :cond_3
/* const/16 v7, 0x20 */
/* aput-byte v7, v6, v3 */
/* .line 190 */
} // .end local v1 # "b":B
} // :cond_4
org.apache.commons.codec.net.QuotedPrintableCodec .decodeQuotedPrintable ( v6 );
/* .line 192 */
} // .end local v3 # "i":I
} // .end local v6 # "tmp":[B
} // :cond_5
org.apache.commons.codec.net.QuotedPrintableCodec .decodeQuotedPrintable ( p1 );
} // .end method
protected doEncoding ( Object[] p0 ) {
/* .locals 4 */
/* .param p1, "bytes" # [B */
/* .prologue */
/* .line 154 */
/* if-nez p1, :cond_1 */
/* .line 155 */
int v0 = 0; // const/4 v0, 0x0
/* .line 165 */
} // :cond_0
/* .line 157 */
} // :cond_1
v2 = org.apache.commons.codec.net.QCodec.PRINTABLE_CHARS;
org.apache.commons.codec.net.QuotedPrintableCodec .encodeQuotedPrintable ( v2,p1 );
/* .line 158 */
/* .local v0, "data":[B */
/* iget-boolean v2, p0, Lorg/apache/commons/codec/net/QCodec;->encodeBlanks:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 159 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* array-length v2, v0 */
/* if-ge v1, v2, :cond_0 */
/* .line 160 */
/* aget-byte v2, v0, v1 */
/* const/16 v3, 0x20 */
/* if-ne v2, v3, :cond_2 */
/* .line 161 */
/* const/16 v2, 0x5f */
/* aput-byte v2, v0, v1 */
/* .line 159 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
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
/* .line 286 */
/* if-nez p1, :cond_0 */
/* .line 287 */
int v0 = 0; // const/4 v0, 0x0
/* .line 289 */
} // .end local p1 # "obj":Ljava/lang/Object;
} // :goto_0
/* .line 288 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 289 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.net.QCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/QCodec;->encode(Ljava/lang/String;)Ljava/lang/String;
/* .line 291 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_1
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Objects of type "; // const-string v2, "Objects of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " cannot be encoded using Q codec"; // const-string v2, " cannot be encoded using Q codec"
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
/* .line 247 */
/* if-nez p1, :cond_0 */
/* .line 248 */
int v0 = 0; // const/4 v0, 0x0
/* .line 250 */
} // :goto_0
} // :cond_0
(( org.apache.commons.codec.net.QCodec ) p0 ).getCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/net/QCodec;->getCharset()Ljava/nio/charset/Charset;
(( org.apache.commons.codec.net.QCodec ) p0 ).encode ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/net/QCodec;->encode(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "str" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 226 */
/* if-nez p1, :cond_0 */
/* .line 227 */
int v1 = 0; // const/4 v1, 0x0
/* .line 230 */
} // :goto_0
} // :cond_0
try { // :try_start_0
(( org.apache.commons.codec.net.QCodec ) p0 ).encodeText ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/commons/codec/net/QCodec;->encodeText(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 231 */
/* :catch_0 */
/* move-exception v0 */
/* .line 232 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v1, Lorg/apache/commons/codec/EncoderException; */
(( java.io.UnsupportedEncodingException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public java.lang.String encode ( java.lang.String p0, java.nio.charset.Charset p1 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/nio/charset/Charset; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 208 */
/* if-nez p1, :cond_0 */
/* .line 209 */
int v0 = 0; // const/4 v0, 0x0
/* .line 211 */
} // :goto_0
} // :cond_0
(( org.apache.commons.codec.net.QCodec ) p0 ).encodeText ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/commons/codec/net/QCodec;->encodeText(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
} // .end method
public java.nio.charset.Charset getCharset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 328 */
v0 = this.charset;
} // .end method
public java.lang.String getDefaultCharset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 337 */
v0 = this.charset;
(( java.nio.charset.Charset ) v0 ).name ( ); // invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
} // .end method
protected java.lang.String getEncoding ( ) {
/* .locals 1 */
/* .prologue */
/* .line 149 */
final String v0 = "Q"; // const-string v0, "Q"
} // .end method
public Boolean isEncodeBlanks ( ) {
/* .locals 1 */
/* .prologue */
/* .line 346 */
/* iget-boolean v0, p0, Lorg/apache/commons/codec/net/QCodec;->encodeBlanks:Z */
} // .end method
public void setEncodeBlanks ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "b" # Z */
/* .prologue */
/* .line 356 */
/* iput-boolean p1, p0, Lorg/apache/commons/codec/net/QCodec;->encodeBlanks:Z */
/* .line 357 */
return;
} // .end method
