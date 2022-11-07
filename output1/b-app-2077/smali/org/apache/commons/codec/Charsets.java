public class org.apache.commons.codec.Charsets {
	 /* .source "Charsets.java" */
	 /* # static fields */
	 public static final java.nio.charset.Charset ISO_8859_1;
	 public static final java.nio.charset.Charset US_ASCII;
	 public static final java.nio.charset.Charset UTF_16;
	 public static final java.nio.charset.Charset UTF_16BE;
	 public static final java.nio.charset.Charset UTF_16LE;
	 public static final java.nio.charset.Charset UTF_8;
	 /* # direct methods */
	 static org.apache.commons.codec.Charsets ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 97 */
		 final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
		 java.nio.charset.Charset .forName ( v0 );
		 /* .line 106 */
		 final String v0 = "US-ASCII"; // const-string v0, "US-ASCII"
		 java.nio.charset.Charset .forName ( v0 );
		 /* .line 116 */
		 final String v0 = "UTF-16"; // const-string v0, "UTF-16"
		 java.nio.charset.Charset .forName ( v0 );
		 /* .line 125 */
		 final String v0 = "UTF-16BE"; // const-string v0, "UTF-16BE"
		 java.nio.charset.Charset .forName ( v0 );
		 /* .line 134 */
		 final String v0 = "UTF-16LE"; // const-string v0, "UTF-16LE"
		 java.nio.charset.Charset .forName ( v0 );
		 /* .line 143 */
		 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
		 java.nio.charset.Charset .forName ( v0 );
		 return;
	 } // .end method
	 public org.apache.commons.codec.Charsets ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 59 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.nio.charset.Charset toCharset ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "charset" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 87 */
		 /* if-nez p0, :cond_0 */
		 java.nio.charset.Charset .defaultCharset ( );
	 } // :goto_0
} // :cond_0
java.nio.charset.Charset .forName ( p0 );
} // .end method
public static java.nio.charset.Charset toCharset ( java.nio.charset.Charset p0 ) {
/* .locals 0 */
/* .param p0, "charset" # Ljava/nio/charset/Charset; */
/* .prologue */
/* .line 74 */
/* if-nez p0, :cond_0 */
java.nio.charset.Charset .defaultCharset ( );
} // .end local p0 # "charset":Ljava/nio/charset/Charset;
} // :cond_0
} // .end method
