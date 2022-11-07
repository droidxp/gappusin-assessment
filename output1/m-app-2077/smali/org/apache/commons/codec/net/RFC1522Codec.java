abstract class org.apache.commons.codec.net.RFC1522Codec {
	 /* .source "RFC1522Codec.java" */
	 /* # static fields */
	 protected static final java.lang.String POSTFIX;
	 protected static final java.lang.String PREFIX;
	 protected static final Object SEP;
	 /* # direct methods */
	 org.apache.commons.codec.net.RFC1522Codec ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected java.lang.String decodeText ( java.lang.String p0 ) {
		 /* .locals 9 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/apache/commons/codec/DecoderException;, */
		 /* Ljava/io/UnsupportedEncodingException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* const/16 v7, 0x3f */
	 /* .line 126 */
	 /* if-nez p1, :cond_0 */
	 /* .line 127 */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 155 */
} // :goto_0
/* .line 129 */
} // :cond_0
final String v6 = "=?"; // const-string v6, "=?"
v6 = (( java.lang.String ) p1 ).startsWith ( v6 ); // invoke-virtual {p1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
final String v6 = "?="; // const-string v6, "?="
v6 = (( java.lang.String ) p1 ).endsWith ( v6 ); // invoke-virtual {p1, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
/* .line 130 */
} // :cond_1
/* new-instance v6, Lorg/apache/commons/codec/DecoderException; */
final String v7 = "RFC 1522 violation: malformed encoded content"; // const-string v7, "RFC 1522 violation: malformed encoded content"
/* invoke-direct {v6, v7}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 132 */
} // :cond_2
v6 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/lit8 v4, v6, -0x2 */
/* .line 133 */
/* .local v4, "terminator":I */
int v3 = 2; // const/4 v3, 0x2
/* .line 134 */
/* .local v3, "from":I */
v5 = (( java.lang.String ) p1 ).indexOf ( v7, v3 ); // invoke-virtual {p1, v7, v3}, Ljava/lang/String;->indexOf(II)I
/* .line 135 */
/* .local v5, "to":I */
/* if-ne v5, v4, :cond_3 */
/* .line 136 */
/* new-instance v6, Lorg/apache/commons/codec/DecoderException; */
final String v7 = "RFC 1522 violation: charset token not found"; // const-string v7, "RFC 1522 violation: charset token not found"
/* invoke-direct {v6, v7}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 138 */
} // :cond_3
(( java.lang.String ) p1 ).substring ( v3, v5 ); // invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 139 */
/* .local v0, "charset":Ljava/lang/String; */
final String v6 = ""; // const-string v6, ""
v6 = (( java.lang.String ) v0 ).equals ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 140 */
/* new-instance v6, Lorg/apache/commons/codec/DecoderException; */
final String v7 = "RFC 1522 violation: charset not specified"; // const-string v7, "RFC 1522 violation: charset not specified"
/* invoke-direct {v6, v7}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 142 */
} // :cond_4
/* add-int/lit8 v3, v5, 0x1 */
/* .line 143 */
v5 = (( java.lang.String ) p1 ).indexOf ( v7, v3 ); // invoke-virtual {p1, v7, v3}, Ljava/lang/String;->indexOf(II)I
/* .line 144 */
/* if-ne v5, v4, :cond_5 */
/* .line 145 */
/* new-instance v6, Lorg/apache/commons/codec/DecoderException; */
final String v7 = "RFC 1522 violation: encoding token not found"; // const-string v7, "RFC 1522 violation: encoding token not found"
/* invoke-direct {v6, v7}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 147 */
} // :cond_5
(( java.lang.String ) p1 ).substring ( v3, v5 ); // invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 148 */
/* .local v2, "encoding":Ljava/lang/String; */
(( org.apache.commons.codec.net.RFC1522Codec ) p0 ).getEncoding ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/net/RFC1522Codec;->getEncoding()Ljava/lang/String;
v6 = (( java.lang.String ) v6 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v6, :cond_6 */
/* .line 149 */
/* new-instance v6, Lorg/apache/commons/codec/DecoderException; */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "This codec cannot decode "; // const-string v8, "This codec cannot decode "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v2 ); // invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = " encoded content"; // const-string v8, " encoded content"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v6, v7}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 151 */
} // :cond_6
/* add-int/lit8 v3, v5, 0x1 */
/* .line 152 */
v5 = (( java.lang.String ) p1 ).indexOf ( v7, v3 ); // invoke-virtual {p1, v7, v3}, Ljava/lang/String;->indexOf(II)I
/* .line 153 */
(( java.lang.String ) p1 ).substring ( v3, v5 ); // invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
org.apache.commons.codec.binary.StringUtils .getBytesUsAscii ( v6 );
/* .line 154 */
/* .local v1, "data":[B */
(( org.apache.commons.codec.net.RFC1522Codec ) p0 ).doDecoding ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/commons/codec/net/RFC1522Codec;->doDecoding([B)[B
/* .line 155 */
/* new-instance v6, Ljava/lang/String; */
/* invoke-direct {v6, v1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* goto/16 :goto_0 */
} // .end method
protected abstract doDecoding ( Object[] p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
} // .end method
protected abstract doEncoding ( Object[] p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
} // .end method
protected java.lang.String encodeText ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/String; */
/* .param p2, "charsetName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException;, */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 104 */
/* if-nez p1, :cond_0 */
/* .line 105 */
int v0 = 0; // const/4 v0, 0x0
/* .line 107 */
} // :goto_0
} // :cond_0
java.nio.charset.Charset .forName ( p2 );
(( org.apache.commons.codec.net.RFC1522Codec ) p0 ).encodeText ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/net/RFC1522Codec;->encodeText(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
} // .end method
protected java.lang.String encodeText ( java.lang.String p0, java.nio.charset.Charset p1 ) {
/* .locals 4 */
/* .param p1, "text" # Ljava/lang/String; */
/* .param p2, "charset" # Ljava/nio/charset/Charset; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v3, 0x3f */
/* .line 69 */
/* if-nez p1, :cond_0 */
/* .line 70 */
int v2 = 0; // const/4 v2, 0x0
/* .line 81 */
} // :goto_0
/* .line 72 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 73 */
/* .local v0, "buffer":Ljava/lang/StringBuilder; */
final String v2 = "=?"; // const-string v2, "=?"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 74 */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 75 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 76 */
(( org.apache.commons.codec.net.RFC1522Codec ) p0 ).getEncoding ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/net/RFC1522Codec;->getEncoding()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 77 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 78 */
(( java.lang.String ) p1 ).getBytes ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
(( org.apache.commons.codec.net.RFC1522Codec ) p0 ).doEncoding ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/commons/codec/net/RFC1522Codec;->doEncoding([B)[B
/* .line 79 */
/* .local v1, "rawData":[B */
org.apache.commons.codec.binary.StringUtils .newStringUsAscii ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 80 */
final String v2 = "?="; // const-string v2, "?="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 81 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
protected abstract java.lang.String getEncoding ( ) {
} // .end method
