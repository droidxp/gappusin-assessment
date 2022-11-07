public class com.umeng.common.util.b {
	 /* .source "AesHelper.java" */
	 /* # static fields */
	 private static a;
	 private static b;
	 /* # direct methods */
	 static com.umeng.common.util.b ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 final String v0 = "uLi4/f4+Pb39.T19"; // const-string v0, "uLi4/f4+Pb39.T19"
		 (( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
		 /* .line 15 */
		 final String v0 = "nmeug.f9/Om+L823"; // const-string v0, "nmeug.f9/Om+L823"
		 (( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
		 return;
	 } // .end method
	 public com.umeng.common.util.b ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Exception; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 26 */
	 final String v0 = "AES/CBC/PKCS5Padding"; // const-string v0, "AES/CBC/PKCS5Padding"
	 javax.crypto.Cipher .getInstance ( v0 );
	 /* .line 27 */
	 /* new-instance v1, Ljavax/crypto/spec/SecretKeySpec; */
	 v2 = com.umeng.common.util.b.a;
	 final String v3 = "AES"; // const-string v3, "AES"
	 /* invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
	 /* .line 28 */
	 /* new-instance v2, Ljavax/crypto/spec/IvParameterSpec; */
	 v3 = com.umeng.common.util.b.b;
	 /* invoke-direct {v2, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
	 /* .line 29 */
	 int v3 = 1; // const/4 v3, 0x1
	 (( javax.crypto.Cipher ) v0 ).init ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
	 /* .line 30 */
	 (( java.lang.String ) p0 ).getBytes ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 (( javax.crypto.Cipher ) v0 ).doFinal ( v1 ); // invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B
	 /* .line 31 */
	 com.umeng.common.util.c .d ( v0 );
} // .end method
public static java.lang.String b ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 43 */
final String v0 = "AES/CBC/PKCS5Padding"; // const-string v0, "AES/CBC/PKCS5Padding"
javax.crypto.Cipher .getInstance ( v0 );
/* .line 44 */
/* new-instance v1, Ljavax/crypto/spec/SecretKeySpec; */
v2 = com.umeng.common.util.b.a;
final String v3 = "AES"; // const-string v3, "AES"
/* invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
/* .line 45 */
/* new-instance v2, Ljavax/crypto/spec/IvParameterSpec; */
v3 = com.umeng.common.util.b.b;
/* invoke-direct {v2, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
/* .line 46 */
int v3 = 2; // const/4 v3, 0x2
(( javax.crypto.Cipher ) v0 ).init ( v3, v1, v2 ); // invoke-virtual {v0, v3, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 47 */
com.umeng.common.util.c .b ( p0 );
(( javax.crypto.Cipher ) v0 ).doFinal ( v1 ); // invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B
/* .line 48 */
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, v0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
} // .end method
