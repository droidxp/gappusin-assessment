class de.hellowins.UtilsCrypt {
	 /* .source "UtilsCrypt.java" */
	 /* # direct methods */
	 de.hellowins.UtilsCrypt ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String decrypt ( Object[] p0, java.lang.String p1 ) {
		 /* .locals 5 */
		 /* .param p0, "cipherText" # [B */
		 /* .param p1, "encryptionKey" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Exception; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 27 */
	 final String v2 = "AES"; // const-string v2, "AES"
	 javax.crypto.Cipher .getInstance ( v2 );
	 /* .line 28 */
	 /* .local v0, "cipher":Ljavax/crypto/Cipher; */
	 /* new-instance v1, Ljavax/crypto/spec/SecretKeySpec; */
	 final String v2 = "UTF-8"; // const-string v2, "UTF-8"
	 (( java.lang.String ) p1 ).getBytes ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 final String v3 = "AES"; // const-string v3, "AES"
	 /* invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
	 /* .line 29 */
	 /* .local v1, "key":Ljavax/crypto/spec/SecretKeySpec; */
	 int v2 = 2; // const/4 v2, 0x2
	 (( javax.crypto.Cipher ) v0 ).init ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
	 /* .line 30 */
	 /* new-instance v2, Ljava/lang/String; */
	 (( javax.crypto.Cipher ) v0 ).doFinal ( p0 ); // invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
	 final String v4 = "UTF-8"; // const-string v4, "UTF-8"
	 /* invoke-direct {v2, v3, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
} // .end method
public static encrypt ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 4 */
	 /* .param p0, "plainText" # Ljava/lang/String; */
	 /* .param p1, "encryptionKey" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 17 */
final String v2 = "AES"; // const-string v2, "AES"
javax.crypto.Cipher .getInstance ( v2 );
/* .line 18 */
/* .local v0, "cipher":Ljavax/crypto/Cipher; */
/* new-instance v1, Ljavax/crypto/spec/SecretKeySpec; */
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
(( java.lang.String ) p1 ).getBytes ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
final String v3 = "AES"; // const-string v3, "AES"
/* invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
/* .line 19 */
/* .local v1, "key":Ljavax/crypto/spec/SecretKeySpec; */
int v2 = 1; // const/4 v2, 0x1
(( javax.crypto.Cipher ) v0 ).init ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
/* .line 20 */
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
(( java.lang.String ) p0 ).getBytes ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
(( javax.crypto.Cipher ) v0 ).doFinal ( v2 ); // invoke-virtual {v0, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B
} // .end method
