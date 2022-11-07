public class org.apache.commons.codec.binary.StringUtils {
	 /* .source "StringUtils.java" */
	 /* # direct methods */
	 public org.apache.commons.codec.binary.StringUtils ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static getBytes ( java.lang.String p0, java.nio.charset.Charset p1 ) {
		 /* .locals 1 */
		 /* .param p0, "string" # Ljava/lang/String; */
		 /* .param p1, "charset" # Ljava/nio/charset/Charset; */
		 /* .prologue */
		 /* .line 50 */
		 /* if-nez p0, :cond_0 */
		 /* .line 51 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 53 */
	 } // :goto_0
} // :cond_0
(( java.lang.String ) p0 ).getBytes ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
} // .end method
public static getBytesIso8859_1 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "string" # Ljava/lang/String; */
/* .prologue */
/* .line 71 */
v0 = org.apache.commons.codec.Charsets.ISO_8859_1;
org.apache.commons.codec.binary.StringUtils .getBytes ( p0,v0 );
} // .end method
public static getBytesUnchecked ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p0, "string" # Ljava/lang/String; */
/* .param p1, "charsetName" # Ljava/lang/String; */
/* .prologue */
/* .line 95 */
/* if-nez p0, :cond_0 */
/* .line 96 */
int v1 = 0; // const/4 v1, 0x0
/* .line 99 */
} // :goto_0
} // :cond_0
try { // :try_start_0
(( java.lang.String ) p0 ).getBytes ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 100 */
/* :catch_0 */
/* move-exception v0 */
/* .line 101 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
org.apache.commons.codec.binary.StringUtils .newIllegalStateException ( p1,v0 );
/* throw v1 */
} // .end method
public static getBytesUsAscii ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "string" # Ljava/lang/String; */
/* .prologue */
/* .line 120 */
v0 = org.apache.commons.codec.Charsets.US_ASCII;
org.apache.commons.codec.binary.StringUtils .getBytes ( p0,v0 );
} // .end method
public static getBytesUtf16 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "string" # Ljava/lang/String; */
/* .prologue */
/* .line 138 */
v0 = org.apache.commons.codec.Charsets.UTF_16;
org.apache.commons.codec.binary.StringUtils .getBytes ( p0,v0 );
} // .end method
public static getBytesUtf16Be ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "string" # Ljava/lang/String; */
/* .prologue */
/* .line 156 */
v0 = org.apache.commons.codec.Charsets.UTF_16BE;
org.apache.commons.codec.binary.StringUtils .getBytes ( p0,v0 );
} // .end method
public static getBytesUtf16Le ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "string" # Ljava/lang/String; */
/* .prologue */
/* .line 174 */
v0 = org.apache.commons.codec.Charsets.UTF_16LE;
org.apache.commons.codec.binary.StringUtils .getBytes ( p0,v0 );
} // .end method
public static getBytesUtf8 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "string" # Ljava/lang/String; */
/* .prologue */
/* .line 192 */
v0 = org.apache.commons.codec.Charsets.UTF_8;
org.apache.commons.codec.binary.StringUtils .getBytes ( p0,v0 );
} // .end method
private static java.lang.IllegalStateException newIllegalStateException ( java.lang.String p0, java.io.UnsupportedEncodingException p1 ) {
/* .locals 3 */
/* .param p0, "charsetName" # Ljava/lang/String; */
/* .param p1, "e" # Ljava/io/UnsupportedEncodingException; */
/* .prologue */
/* .line 197 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ": "; // const-string v2, ": "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
} // .end method
public static java.lang.String newString ( Object[] p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p0, "bytes" # [B */
/* .param p1, "charsetName" # Ljava/lang/String; */
/* .prologue */
/* .line 237 */
/* if-nez p0, :cond_0 */
/* .line 238 */
int v1 = 0; // const/4 v1, 0x0
/* .line 241 */
} // :goto_0
} // :cond_0
try { // :try_start_0
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, p0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 242 */
/* :catch_0 */
/* move-exception v0 */
/* .line 243 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
org.apache.commons.codec.binary.StringUtils .newIllegalStateException ( p1,v0 );
/* throw v1 */
} // .end method
private static java.lang.String newString ( Object[] p0, java.nio.charset.Charset p1 ) {
/* .locals 1 */
/* .param p0, "bytes" # [B */
/* .param p1, "charset" # Ljava/nio/charset/Charset; */
/* .prologue */
/* .line 214 */
/* if-nez p0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
} // .end method
public static java.lang.String newStringIso8859_1 ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 260 */
/* new-instance v0, Ljava/lang/String; */
v1 = org.apache.commons.codec.Charsets.ISO_8859_1;
/* invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
} // .end method
public static java.lang.String newStringUsAscii ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 276 */
/* new-instance v0, Ljava/lang/String; */
v1 = org.apache.commons.codec.Charsets.US_ASCII;
/* invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
} // .end method
public static java.lang.String newStringUtf16 ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 292 */
/* new-instance v0, Ljava/lang/String; */
v1 = org.apache.commons.codec.Charsets.UTF_16;
/* invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
} // .end method
public static java.lang.String newStringUtf16Be ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 308 */
/* new-instance v0, Ljava/lang/String; */
v1 = org.apache.commons.codec.Charsets.UTF_16BE;
/* invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
} // .end method
public static java.lang.String newStringUtf16Le ( Object[] p0 ) {
/* .locals 2 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 324 */
/* new-instance v0, Ljava/lang/String; */
v1 = org.apache.commons.codec.Charsets.UTF_16LE;
/* invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
} // .end method
public static java.lang.String newStringUtf8 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 340 */
v0 = org.apache.commons.codec.Charsets.UTF_8;
org.apache.commons.codec.binary.StringUtils .newString ( p0,v0 );
} // .end method
