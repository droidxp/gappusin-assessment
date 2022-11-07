public class com.ansca.corona.Crypto {
	 /* .source "Crypto.java" */
	 /* # static fields */
	 public static final java.lang.String ALGORITHM_HMAC_MD4;
	 public static final java.lang.String ALGORITHM_HMAC_MD5;
	 public static final java.lang.String ALGORITHM_HMAC_SHA1A;
	 public static final java.lang.String ALGORITHM_HMAC_SHA224A;
	 public static final java.lang.String ALGORITHM_HMAC_SHA256A;
	 public static final java.lang.String ALGORITHM_HMAC_SHA384;
	 public static final java.lang.String ALGORITHM_HMAC_SHA512;
	 public static final java.lang.String ALGORITHM_MD4;
	 public static final java.lang.String ALGORITHM_MD5;
	 public static final java.lang.String ALGORITHM_SHA1A;
	 public static final java.lang.String ALGORITHM_SHA224A;
	 public static final java.lang.String ALGORITHM_SHA256A;
	 public static final java.lang.String ALGORITHM_SHA384;
	 public static final java.lang.String ALGORITHM_SHA512;
	 /* # direct methods */
	 public com.ansca.corona.Crypto ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static CalculateDigest ( java.lang.String p0, Object[] p1 ) {
		 /* .locals 3 */
		 /* .param p0, "algorithm" # Ljava/lang/String; */
		 /* .param p1, "data" # [B */
		 /* .prologue */
		 /* .line 42 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 44 */
		 /* .local v2, "result":[B */
		 try { // :try_start_0
			 java.security.MessageDigest .getInstance ( p0 );
			 /* .line 46 */
			 /* .local v0, "digest":Ljava/security/MessageDigest; */
			 (( java.security.MessageDigest ) v0 ).digest ( p1 ); // invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B
			 /* :try_end_0 */
			 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 51 */
		 } // .end local v0 # "digest":Ljava/security/MessageDigest;
	 } // :goto_0
	 /* .line 47 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 49 */
	 /* .local v1, "e":Ljava/security/NoSuchAlgorithmException; */
	 (( java.security.NoSuchAlgorithmException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
} // .end method
public static CalculateHMAC ( java.lang.String p0, java.lang.String p1, Object[] p2 ) {
	 /* .locals 6 */
	 /* .param p0, "algorithm" # Ljava/lang/String; */
	 /* .param p1, "key" # Ljava/lang/String; */
	 /* .param p2, "data" # [B */
	 /* .prologue */
	 /* .line 55 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 57 */
	 /* .local v2, "result":[B */
	 try { // :try_start_0
		 javax.crypto.Mac .getInstance ( p0 );
		 /* .line 59 */
		 /* .local v1, "hmac":Ljavax/crypto/Mac; */
		 /* new-instance v3, Ljavax/crypto/spec/SecretKeySpec; */
		 final String v4 = "UTF-8"; // const-string v4, "UTF-8"
		 (( java.lang.String ) p1 ).getBytes ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
		 final String v5 = "RAW"; // const-string v5, "RAW"
		 /* invoke-direct {v3, v4, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
		 (( javax.crypto.Mac ) v1 ).init ( v3 ); // invoke-virtual {v1, v3}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
		 /* .line 61 */
		 (( javax.crypto.Mac ) v1 ).doFinal ( p2 ); // invoke-virtual {v1, p2}, Ljavax/crypto/Mac;->doFinal([B)[B
		 /* :try_end_0 */
		 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/security/InvalidKeyException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .line 72 */
	 } // .end local v1 # "hmac":Ljavax/crypto/Mac;
} // :goto_0
/* .line 62 */
/* :catch_0 */
/* move-exception v0 */
/* .line 64 */
/* .local v0, "e":Ljava/security/NoSuchAlgorithmException; */
(( java.security.NoSuchAlgorithmException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
/* .line 65 */
} // .end local v0 # "e":Ljava/security/NoSuchAlgorithmException;
/* :catch_1 */
/* move-exception v0 */
/* .line 67 */
/* .local v0, "e":Ljava/security/InvalidKeyException; */
(( java.security.InvalidKeyException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/security/InvalidKeyException;->printStackTrace()V
/* .line 68 */
} // .end local v0 # "e":Ljava/security/InvalidKeyException;
/* :catch_2 */
/* move-exception v0 */
/* .line 70 */
/* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
(( java.io.UnsupportedEncodingException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
} // .end method
public static Integer GetDigestLength ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "algorithm" # Ljava/lang/String; */
/* .prologue */
/* .line 29 */
int v2 = 0; // const/4 v2, 0x0
/* .line 31 */
/* .local v2, "length":I */
try { // :try_start_0
java.security.MessageDigest .getInstance ( p0 );
/* .line 33 */
/* .local v0, "digest":Ljava/security/MessageDigest; */
(( java.security.MessageDigest ) v0 ).getDigestLength ( ); // invoke-virtual {v0}, Ljava/security/MessageDigest;->getDigestLength()I
/* :try_end_0 */
v2 = /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 38 */
} // .end local v0 # "digest":Ljava/security/MessageDigest;
} // :goto_0
/* .line 34 */
/* :catch_0 */
/* move-exception v1 */
/* .line 36 */
/* .local v1, "e":Ljava/security/NoSuchAlgorithmException; */
(( java.security.NoSuchAlgorithmException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
} // .end method
