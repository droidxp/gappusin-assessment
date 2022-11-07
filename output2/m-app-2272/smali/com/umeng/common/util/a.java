public class com.umeng.common.util.a {
	 /* .source "AESStringUtils.java" */
	 /* # direct methods */
	 public com.umeng.common.util.a ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static java.lang.IllegalStateException a ( java.lang.String p0, java.io.UnsupportedEncodingException p1 ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 162 */
		 /* new-instance v0, Ljava/lang/IllegalStateException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( p0 );
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v2 = ": "; // const-string v2, ": "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 } // .end method
	 public static java.lang.String a ( Object[] p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 207 */
		 final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
		 com.umeng.common.util.a .a ( p0,v0 );
	 } // .end method
	 public static java.lang.String a ( Object[] p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 185 */
		 /* if-nez p0, :cond_0 */
		 /* .line 186 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 189 */
	 } // :goto_0
} // :cond_0
try { // :try_start_0
	 /* new-instance v0, Ljava/lang/String; */
	 /* invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
	 /* :try_end_0 */
	 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 190 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 191 */
	 com.umeng.common.util.a .a ( p1,v0 );
	 /* throw v0 */
} // .end method
public static a ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 48 */
	 final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
	 com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static a ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 151 */
	 /* if-nez p0, :cond_0 */
	 /* .line 152 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 155 */
} // :goto_0
} // :cond_0
try { // :try_start_0
(( java.lang.String ) p0 ).getBytes ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 156 */
/* :catch_0 */
/* move-exception v0 */
/* .line 157 */
com.umeng.common.util.a .a ( p1,v0 );
/* throw v0 */
} // .end method
public static java.lang.String b ( Object[] p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 222 */
final String v0 = "US-ASCII"; // const-string v0, "US-ASCII"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static b ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 64 */
final String v0 = "US-ASCII"; // const-string v0, "US-ASCII"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static java.lang.String c ( Object[] p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 237 */
final String v0 = "UTF-16"; // const-string v0, "UTF-16"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static c ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 80 */
final String v0 = "UTF-16"; // const-string v0, "UTF-16"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static java.lang.String d ( Object[] p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 252 */
final String v0 = "UTF-16BE"; // const-string v0, "UTF-16BE"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static d ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 96 */
final String v0 = "UTF-16BE"; // const-string v0, "UTF-16BE"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static java.lang.String e ( Object[] p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 267 */
final String v0 = "UTF-16LE"; // const-string v0, "UTF-16LE"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static e ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 112 */
final String v0 = "UTF-16LE"; // const-string v0, "UTF-16LE"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static java.lang.String f ( Object[] p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 282 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
public static f ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 128 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
com.umeng.common.util.a .a ( p0,v0 );
} // .end method
