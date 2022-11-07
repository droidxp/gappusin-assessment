public class inal {
	 /* # static fields */
	 private static java.lang.String a;
	 private static java.lang.String b;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 final String v0 = "jBxLQUrHTE5ijiIl"; // const-string v0, "jBxLQUrHTE5ijiIl"
		 final String v0 = "lTiji5ETHrUQLxBj"; // const-string v0, "lTiji5ETHrUQLxBj"
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 6 */
		 try { // :try_start_0
			 final String v0 = "AES/CBC/NoPadding"; // const-string v0, "AES/CBC/NoPadding"
			 javax.crypto.Cipher .getInstance ( v0 );
			 v2 = 			 (( javax.crypto.Cipher ) v1 ).getBlockSize ( ); // invoke-virtual {v1}, Ljavax/crypto/Cipher;->getBlockSize()I
			 (( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
			 /* array-length v0, v3 */
			 /* rem-int v4, v0, v2 */
			 if ( v4 != null) { // if-eqz v4, :cond_0
				 /* rem-int v4, v0, v2 */
				 /* sub-int/2addr v2, v4 */
				 /* add-int/2addr v0, v2 */
			 } // :cond_0
			 /* new-array v0, v0, [B */
			 int v2 = 0; // const/4 v2, 0x0
			 int v4 = 0; // const/4 v4, 0x0
			 /* array-length v5, v3 */
			 java.lang.System .arraycopy ( v3,v2,v0,v4,v5 );
			 /* new-instance v2, Ljavax/crypto/spec/SecretKeySpec; */
			 v3 = com.kkkwan.billing.h.a.c.a;
			 (( java.lang.String ) v3 ).getBytes ( ); // invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
			 final String v4 = "AES"; // const-string v4, "AES"
			 /* invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
			 /* new-instance v3, Ljavax/crypto/spec/IvParameterSpec; */
			 v4 = com.kkkwan.billing.h.a.c.b;
			 (( java.lang.String ) v4 ).getBytes ( ); // invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
			 /* invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
			 int v4 = 1; // const/4 v4, 0x1
			 (( javax.crypto.Cipher ) v1 ).init ( v4, v2, v3 ); // invoke-virtual {v1, v4, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
			 (( javax.crypto.Cipher ) v1 ).doFinal ( v0 ); // invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B
			 /* new-instance v1, Lcom/kkkwan/billing/h/a/a; */
			 /* invoke-direct {v1}, Lcom/kkkwan/billing/h/a/a;-><init>()V */
			 (( com.kkkwan.billing.h.a.a ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/kkkwan/billing/h/a/a;->a([B)Ljava/lang/String;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
