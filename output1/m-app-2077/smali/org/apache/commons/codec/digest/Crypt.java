public class org.apache.commons.codec.digest.Crypt {
	 /* .source "Crypt.java" */
	 /* # direct methods */
	 public org.apache.commons.codec.digest.Crypt ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String crypt ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "key" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 92 */
		 int v0 = 0; // const/4 v0, 0x0
		 org.apache.commons.codec.digest.Crypt .crypt ( p0,v0 );
	 } // .end method
	 public static java.lang.String crypt ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "key" # Ljava/lang/String; */
		 /* .param p1, "salt" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 149 */
		 v0 = org.apache.commons.codec.Charsets.UTF_8;
		 (( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
		 org.apache.commons.codec.digest.Crypt .crypt ( v0,p1 );
	 } // .end method
	 public static java.lang.String crypt ( Object[] p0 ) {
		 /* .locals 1 */
		 /* .param p0, "keyBytes" # [B */
		 /* .prologue */
		 /* .line 46 */
		 int v0 = 0; // const/4 v0, 0x0
		 org.apache.commons.codec.digest.Crypt .crypt ( p0,v0 );
	 } // .end method
	 public static java.lang.String crypt ( Object[] p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "keyBytes" # [B */
		 /* .param p1, "salt" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 66 */
		 /* if-nez p1, :cond_0 */
		 /* .line 67 */
		 org.apache.commons.codec.digest.Sha2Crypt .sha512Crypt ( p0 );
		 /* .line 75 */
	 } // :goto_0
	 /* .line 68 */
} // :cond_0
final String v0 = "$6$"; // const-string v0, "$6$"
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 69 */
	 org.apache.commons.codec.digest.Sha2Crypt .sha512Crypt ( p0,p1 );
	 /* .line 70 */
} // :cond_1
final String v0 = "$5$"; // const-string v0, "$5$"
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 71 */
	 org.apache.commons.codec.digest.Sha2Crypt .sha256Crypt ( p0,p1 );
	 /* .line 72 */
} // :cond_2
final String v0 = "$1$"; // const-string v0, "$1$"
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 73 */
	 org.apache.commons.codec.digest.Md5Crypt .md5Crypt ( p0,p1 );
	 /* .line 75 */
} // :cond_3
org.apache.commons.codec.digest.UnixCrypt .crypt ( p0,p1 );
} // .end method
