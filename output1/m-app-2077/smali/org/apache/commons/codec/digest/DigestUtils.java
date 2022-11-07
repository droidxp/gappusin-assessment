public class org.apache.commons.codec.digest.DigestUtils {
	 /* .source "DigestUtils.java" */
	 /* # static fields */
	 private static final Integer STREAM_BUFFER_LENGTH;
	 /* # direct methods */
	 public org.apache.commons.codec.digest.DigestUtils ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static digest ( java.security.MessageDigest p0, java.io.InputStream p1 ) {
		 /* .locals 1 */
		 /* .param p0, "digest" # Ljava/security/MessageDigest; */
		 /* .param p1, "data" # Ljava/io/InputStream; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 50 */
	 org.apache.commons.codec.digest.DigestUtils .updateDigest ( p0,p1 );
	 (( java.security.MessageDigest ) v0 ).digest ( ); // invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
} // .end method
public static java.security.MessageDigest getDigest ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .param p0, "algorithm" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 68 */
	 try { // :try_start_0
		 java.security.MessageDigest .getInstance ( p0 );
		 /* :try_end_0 */
		 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 69 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 70 */
		 /* .local v0, "e":Ljava/security/NoSuchAlgorithmException; */
		 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
		 /* invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 public static java.security.MessageDigest getMd2Digest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 85 */
		 final String v0 = "MD2"; // const-string v0, "MD2"
		 org.apache.commons.codec.digest.DigestUtils .getDigest ( v0 );
	 } // .end method
	 public static java.security.MessageDigest getMd5Digest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 98 */
		 final String v0 = "MD5"; // const-string v0, "MD5"
		 org.apache.commons.codec.digest.DigestUtils .getDigest ( v0 );
	 } // .end method
	 public static java.security.MessageDigest getSha1Digest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 112 */
		 final String v0 = "SHA-1"; // const-string v0, "SHA-1"
		 org.apache.commons.codec.digest.DigestUtils .getDigest ( v0 );
	 } // .end method
	 public static java.security.MessageDigest getSha256Digest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 128 */
		 final String v0 = "SHA-256"; // const-string v0, "SHA-256"
		 org.apache.commons.codec.digest.DigestUtils .getDigest ( v0 );
	 } // .end method
	 public static java.security.MessageDigest getSha384Digest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 144 */
		 final String v0 = "SHA-384"; // const-string v0, "SHA-384"
		 org.apache.commons.codec.digest.DigestUtils .getDigest ( v0 );
	 } // .end method
	 public static java.security.MessageDigest getSha512Digest ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 160 */
		 final String v0 = "SHA-512"; // const-string v0, "SHA-512"
		 org.apache.commons.codec.digest.DigestUtils .getDigest ( v0 );
	 } // .end method
	 public static java.security.MessageDigest getShaDigest ( ) {
		 /* .locals 1 */
		 /* .annotation runtime Ljava/lang/Deprecated; */
	 } // .end annotation
	 /* .prologue */
	 /* .line 173 */
	 org.apache.commons.codec.digest.DigestUtils .getSha1Digest ( );
} // .end method
public static md2 ( java.io.InputStream p0 ) {
	 /* .locals 1 */
	 /* .param p0, "data" # Ljava/io/InputStream; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 199 */
org.apache.commons.codec.digest.DigestUtils .getMd2Digest ( );
org.apache.commons.codec.digest.DigestUtils .digest ( v0,p0 );
} // .end method
public static md2 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 211 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p0 );
org.apache.commons.codec.digest.DigestUtils .md2 ( v0 );
} // .end method
public static md2 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 185 */
org.apache.commons.codec.digest.DigestUtils .getMd2Digest ( );
(( java.security.MessageDigest ) v0 ).digest ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
} // .end method
public static java.lang.String md2Hex ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 237 */
org.apache.commons.codec.digest.DigestUtils .md2 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String md2Hex ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 249 */
org.apache.commons.codec.digest.DigestUtils .md2 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String md2Hex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 223 */
org.apache.commons.codec.digest.DigestUtils .md2 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static md5 ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 274 */
org.apache.commons.codec.digest.DigestUtils .getMd5Digest ( );
org.apache.commons.codec.digest.DigestUtils .digest ( v0,p0 );
} // .end method
public static md5 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 285 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p0 );
org.apache.commons.codec.digest.DigestUtils .md5 ( v0 );
} // .end method
public static md5 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 260 */
org.apache.commons.codec.digest.DigestUtils .getMd5Digest ( );
(( java.security.MessageDigest ) v0 ).digest ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
} // .end method
public static java.lang.String md5Hex ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 310 */
org.apache.commons.codec.digest.DigestUtils .md5 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String md5Hex ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 321 */
org.apache.commons.codec.digest.DigestUtils .md5 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String md5Hex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 296 */
org.apache.commons.codec.digest.DigestUtils .md5 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static sha ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 350 */
org.apache.commons.codec.digest.DigestUtils .sha1 ( p0 );
} // .end method
public static sha ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 363 */
org.apache.commons.codec.digest.DigestUtils .sha1 ( p0 );
} // .end method
public static sha ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 334 */
org.apache.commons.codec.digest.DigestUtils .sha1 ( p0 );
} // .end method
public static sha1 ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 389 */
org.apache.commons.codec.digest.DigestUtils .getSha1Digest ( );
org.apache.commons.codec.digest.DigestUtils .digest ( v0,p0 );
} // .end method
public static sha1 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 400 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p0 );
org.apache.commons.codec.digest.DigestUtils .sha1 ( v0 );
} // .end method
public static sha1 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 375 */
org.apache.commons.codec.digest.DigestUtils .getSha1Digest ( );
(( java.security.MessageDigest ) v0 ).digest ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
} // .end method
public static java.lang.String sha1Hex ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 426 */
org.apache.commons.codec.digest.DigestUtils .sha1 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String sha1Hex ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 438 */
org.apache.commons.codec.digest.DigestUtils .sha1 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String sha1Hex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 412 */
org.apache.commons.codec.digest.DigestUtils .sha1 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static sha256 ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 470 */
org.apache.commons.codec.digest.DigestUtils .getSha256Digest ( );
org.apache.commons.codec.digest.DigestUtils .digest ( v0,p0 );
} // .end method
public static sha256 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 485 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p0 );
org.apache.commons.codec.digest.DigestUtils .sha256 ( v0 );
} // .end method
public static sha256 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 453 */
org.apache.commons.codec.digest.DigestUtils .getSha256Digest ( );
(( java.security.MessageDigest ) v0 ).digest ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
} // .end method
public static java.lang.String sha256Hex ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 517 */
org.apache.commons.codec.digest.DigestUtils .sha256 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String sha256Hex ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 532 */
org.apache.commons.codec.digest.DigestUtils .sha256 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String sha256Hex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 500 */
org.apache.commons.codec.digest.DigestUtils .sha256 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static sha384 ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 564 */
org.apache.commons.codec.digest.DigestUtils .getSha384Digest ( );
org.apache.commons.codec.digest.DigestUtils .digest ( v0,p0 );
} // .end method
public static sha384 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 579 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p0 );
org.apache.commons.codec.digest.DigestUtils .sha384 ( v0 );
} // .end method
public static sha384 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 547 */
org.apache.commons.codec.digest.DigestUtils .getSha384Digest ( );
(( java.security.MessageDigest ) v0 ).digest ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
} // .end method
public static java.lang.String sha384Hex ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 611 */
org.apache.commons.codec.digest.DigestUtils .sha384 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String sha384Hex ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 626 */
org.apache.commons.codec.digest.DigestUtils .sha384 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String sha384Hex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 594 */
org.apache.commons.codec.digest.DigestUtils .sha384 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static sha512 ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 658 */
org.apache.commons.codec.digest.DigestUtils .getSha512Digest ( );
org.apache.commons.codec.digest.DigestUtils .digest ( v0,p0 );
} // .end method
public static sha512 ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 673 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p0 );
org.apache.commons.codec.digest.DigestUtils .sha512 ( v0 );
} // .end method
public static sha512 ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 641 */
org.apache.commons.codec.digest.DigestUtils .getSha512Digest ( );
(( java.security.MessageDigest ) v0 ).digest ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B
} // .end method
public static java.lang.String sha512Hex ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 705 */
org.apache.commons.codec.digest.DigestUtils .sha512 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String sha512Hex ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 720 */
org.apache.commons.codec.digest.DigestUtils .sha512 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String sha512Hex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 688 */
org.apache.commons.codec.digest.DigestUtils .sha512 ( p0 );
org.apache.commons.codec.binary.Hex .encodeHexString ( v0 );
} // .end method
public static java.lang.String shaHex ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 749 */
org.apache.commons.codec.digest.DigestUtils .sha1Hex ( p0 );
} // .end method
public static java.lang.String shaHex ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "data" # Ljava/lang/String; */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 762 */
org.apache.commons.codec.digest.DigestUtils .sha1Hex ( p0 );
} // .end method
public static java.lang.String shaHex ( Object[] p0 ) {
/* .locals 1 */
/* .param p0, "data" # [B */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 733 */
org.apache.commons.codec.digest.DigestUtils .sha1Hex ( p0 );
} // .end method
public static java.security.MessageDigest updateDigest ( java.security.MessageDigest p0, java.io.InputStream p1 ) {
/* .locals 5 */
/* .param p0, "digest" # Ljava/security/MessageDigest; */
/* .param p1, "data" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x400 */
int v3 = 0; // const/4 v3, 0x0
/* .line 793 */
/* new-array v0, v4, [B */
/* .line 794 */
/* .local v0, "buffer":[B */
v1 = (( java.io.InputStream ) p1 ).read ( v0, v3, v4 ); // invoke-virtual {p1, v0, v3, v4}, Ljava/io/InputStream;->read([BII)I
/* .line 796 */
/* .local v1, "read":I */
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* if-le v1, v2, :cond_0 */
/* .line 797 */
(( java.security.MessageDigest ) p0 ).update ( v0, v3, v1 ); // invoke-virtual {p0, v0, v3, v1}, Ljava/security/MessageDigest;->update([BII)V
/* .line 798 */
v1 = (( java.io.InputStream ) p1 ).read ( v0, v3, v4 ); // invoke-virtual {p1, v0, v3, v4}, Ljava/io/InputStream;->read([BII)I
/* .line 801 */
} // :cond_0
} // .end method
public static java.security.MessageDigest updateDigest ( java.security.MessageDigest p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "messageDigest" # Ljava/security/MessageDigest; */
/* .param p1, "valueToDigest" # Ljava/lang/String; */
/* .prologue */
/* .line 815 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p1 );
(( java.security.MessageDigest ) p0 ).update ( v0 ); // invoke-virtual {p0, v0}, Ljava/security/MessageDigest;->update([B)V
/* .line 816 */
} // .end method
public static java.security.MessageDigest updateDigest ( java.security.MessageDigest p0, Object[] p1 ) {
/* .locals 0 */
/* .param p0, "messageDigest" # Ljava/security/MessageDigest; */
/* .param p1, "valueToDigest" # [B */
/* .prologue */
/* .line 776 */
(( java.security.MessageDigest ) p0 ).update ( p1 ); // invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update([B)V
/* .line 777 */
} // .end method
