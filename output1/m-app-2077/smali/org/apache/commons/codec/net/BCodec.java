public class org.apache.commons.codec.net.BCodec extends org.apache.commons.codec.net.RFC1522Codec implements org.apache.commons.codec.StringEncoder implements org.apache.commons.codec.StringDecoder {
	 /* .source "BCodec.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private final java.nio.charset.Charset charset;
	 /* # direct methods */
	 public org.apache.commons.codec.net.BCodec ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 56 */
		 v0 = org.apache.commons.codec.Charsets.UTF_8;
		 /* invoke-direct {p0, v0}, Lorg/apache/commons/codec/net/BCodec;-><init>(Ljava/nio/charset/Charset;)V */
		 /* .line 57 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.net.BCodec ( ) {
		 /* .locals 1 */
		 /* .param p1, "charsetName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 83 */
		 java.nio.charset.Charset .forName ( p1 );
		 /* invoke-direct {p0, v0}, Lorg/apache/commons/codec/net/BCodec;-><init>(Ljava/nio/charset/Charset;)V */
		 /* .line 84 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.net.BCodec ( ) {
		 /* .locals 0 */
		 /* .param p1, "charset" # Ljava/nio/charset/Charset; */
		 /* .prologue */
		 /* .line 68 */
		 /* invoke-direct {p0}, Lorg/apache/commons/codec/net/RFC1522Codec;-><init>()V */
		 /* .line 69 */
		 this.charset = p1;
		 /* .line 70 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object decode ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .param p1, "value" # Ljava/lang/Object; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/apache/commons/codec/DecoderException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 222 */
	 /* if-nez p1, :cond_0 */
	 /* .line 223 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 225 */
} // .end local p1 # "value":Ljava/lang/Object;
} // :goto_0
/* .line 224 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 225 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "value":Ljava/lang/Object;
(( org.apache.commons.codec.net.BCodec ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/BCodec;->decode(Ljava/lang/String;)Ljava/lang/String;
/* .line 227 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_1
/* new-instance v0, Lorg/apache/commons/codec/DecoderException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Objects of type "; // const-string v2, "Objects of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " cannot be decoded using BCodec"; // const-string v2, " cannot be decoded using BCodec"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String decode ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "value" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 177 */
/* if-nez p1, :cond_0 */
/* .line 178 */
int v1 = 0; // const/4 v1, 0x0
/* .line 181 */
} // :goto_0
} // :cond_0
try { // :try_start_0
(( org.apache.commons.codec.net.BCodec ) p0 ).decodeText ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/BCodec;->decodeText(Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 182 */
/* :catch_0 */
/* move-exception v0 */
/* .line 183 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v1, Lorg/apache/commons/codec/DecoderException; */
(( java.io.UnsupportedEncodingException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
protected doDecoding ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "bytes" # [B */
/* .prologue */
/* .line 101 */
/* if-nez p1, :cond_0 */
/* .line 102 */
int v0 = 0; // const/4 v0, 0x0
/* .line 104 */
} // :goto_0
} // :cond_0
org.apache.commons.codec.binary.Base64 .decodeBase64 ( p1 );
} // .end method
protected doEncoding ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "bytes" # [B */
/* .prologue */
/* .line 93 */
/* if-nez p1, :cond_0 */
/* .line 94 */
int v0 = 0; // const/4 v0, 0x0
/* .line 96 */
} // :goto_0
} // :cond_0
org.apache.commons.codec.binary.Base64 .encodeBase64 ( p1 );
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "value" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 198 */
/* if-nez p1, :cond_0 */
/* .line 199 */
int v0 = 0; // const/4 v0, 0x0
/* .line 201 */
} // .end local p1 # "value":Ljava/lang/Object;
} // :goto_0
/* .line 200 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 201 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "value":Ljava/lang/Object;
(( org.apache.commons.codec.net.BCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/net/BCodec;->encode(Ljava/lang/String;)Ljava/lang/String;
/* .line 203 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_1
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Objects of type "; // const-string v2, "Objects of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " cannot be encoded using BCodec"; // const-string v2, " cannot be encoded using BCodec"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "value" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 159 */
/* if-nez p1, :cond_0 */
/* .line 160 */
int v0 = 0; // const/4 v0, 0x0
/* .line 162 */
} // :goto_0
} // :cond_0
(( org.apache.commons.codec.net.BCodec ) p0 ).getCharset ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/net/BCodec;->getCharset()Ljava/nio/charset/Charset;
(( org.apache.commons.codec.net.BCodec ) p0 ).encode ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/net/BCodec;->encode(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "value" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 138 */
/* if-nez p1, :cond_0 */
/* .line 139 */
int v1 = 0; // const/4 v1, 0x0
/* .line 142 */
} // :goto_0
} // :cond_0
try { // :try_start_0
(( org.apache.commons.codec.net.BCodec ) p0 ).encodeText ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/commons/codec/net/BCodec;->encodeText(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 143 */
/* :catch_0 */
/* move-exception v0 */
/* .line 144 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v1, Lorg/apache/commons/codec/EncoderException; */
(( java.io.UnsupportedEncodingException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public java.lang.String encode ( java.lang.String p0, java.nio.charset.Charset p1 ) {
/* .locals 1 */
/* .param p1, "value" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/nio/charset/Charset; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 120 */
/* if-nez p1, :cond_0 */
/* .line 121 */
int v0 = 0; // const/4 v0, 0x0
/* .line 123 */
} // :goto_0
} // :cond_0
(( org.apache.commons.codec.net.BCodec ) p0 ).encodeText ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/commons/codec/net/BCodec;->encodeText(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
} // .end method
public java.nio.charset.Charset getCharset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 240 */
v0 = this.charset;
} // .end method
public java.lang.String getDefaultCharset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 249 */
v0 = this.charset;
(( java.nio.charset.Charset ) v0 ).name ( ); // invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
} // .end method
protected java.lang.String getEncoding ( ) {
/* .locals 1 */
/* .prologue */
/* .line 88 */
final String v0 = "B"; // const-string v0, "B"
} // .end method
