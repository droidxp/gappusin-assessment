public class org.apache.commons.codec.binary.StringUtils {
	 /* .source "StringUtils.java" */
	 /* # direct methods */
	 public org.apache.commons.codec.binary.StringUtils ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static getBytesIso8859_1 ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "string" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 49 */
		 final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
		 org.apache.commons.codec.binary.StringUtils .getBytesUnchecked ( p0,v0 );
	 } // .end method
	 public static getBytesUnchecked ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .param p0, "string" # Ljava/lang/String; */
		 /* .param p1, "charsetName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 152 */
		 /* if-nez p0, :cond_0 */
		 /* .line 153 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 156 */
	 } // :goto_0
} // :cond_0
try { // :try_start_0
	 (( java.lang.String ) p0 ).getBytes ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 /* :try_end_0 */
	 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 157 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 158 */
	 /* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
	 org.apache.commons.codec.binary.StringUtils .newIllegalStateException ( p1,v0 );
	 /* throw v1 */
} // .end method
public static getBytesUsAscii ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "string" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 65 */
	 final String v0 = "US-ASCII"; // const-string v0, "US-ASCII"
	 org.apache.commons.codec.binary.StringUtils .getBytesUnchecked ( p0,v0 );
} // .end method
public static getBytesUtf16 ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "string" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 81 */
	 final String v0 = "UTF-16"; // const-string v0, "UTF-16"
	 org.apache.commons.codec.binary.StringUtils .getBytesUnchecked ( p0,v0 );
} // .end method
public static getBytesUtf16Be ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "string" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 97 */
	 final String v0 = "UTF-16BE"; // const-string v0, "UTF-16BE"
	 org.apache.commons.codec.binary.StringUtils .getBytesUnchecked ( p0,v0 );
} // .end method
public static getBytesUtf16Le ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "string" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 113 */
	 final String v0 = "UTF-16LE"; // const-string v0, "UTF-16LE"
	 org.apache.commons.codec.binary.StringUtils .getBytesUnchecked ( p0,v0 );
} // .end method
public static getBytesUtf8 ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "string" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 129 */
	 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
	 org.apache.commons.codec.binary.StringUtils .getBytesUnchecked ( p0,v0 );
} // .end method
private static java.lang.IllegalStateException newIllegalStateException ( java.lang.String p0, java.io.UnsupportedEncodingException p1 ) {
	 /* .locals 3 */
	 /* .param p0, "charsetName" # Ljava/lang/String; */
	 /* .param p1, "e" # Ljava/io/UnsupportedEncodingException; */
	 /* .prologue */
	 /* .line 163 */
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
	 /* .line 185 */
	 /* if-nez p0, :cond_0 */
	 /* .line 186 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 189 */
} // :goto_0
} // :cond_0
try { // :try_start_0
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, p0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 190 */
/* :catch_0 */
/* move-exception v0 */
/* .line 191 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
org.apache.commons.codec.binary.StringUtils .newIllegalStateException ( p1,v0 );
/* throw v1 */
} // .end method
public static java.lang.String newStringIso8859_1 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 206 */
final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
org.apache.commons.codec.binary.StringUtils .newString ( p0,v0 );
} // .end method
public static java.lang.String newStringUsAscii ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 220 */
final String v0 = "US-ASCII"; // const-string v0, "US-ASCII"
org.apache.commons.codec.binary.StringUtils .newString ( p0,v0 );
} // .end method
public static java.lang.String newStringUtf16 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 234 */
final String v0 = "UTF-16"; // const-string v0, "UTF-16"
org.apache.commons.codec.binary.StringUtils .newString ( p0,v0 );
} // .end method
public static java.lang.String newStringUtf16Be ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 248 */
final String v0 = "UTF-16BE"; // const-string v0, "UTF-16BE"
org.apache.commons.codec.binary.StringUtils .newString ( p0,v0 );
} // .end method
public static java.lang.String newStringUtf16Le ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 262 */
final String v0 = "UTF-16LE"; // const-string v0, "UTF-16LE"
org.apache.commons.codec.binary.StringUtils .newString ( p0,v0 );
} // .end method
public static java.lang.String newStringUtf8 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "bytes" # [B */
/* .prologue */
/* .line 276 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
org.apache.commons.codec.binary.StringUtils .newString ( p0,v0 );
} // .end method
