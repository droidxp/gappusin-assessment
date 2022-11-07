public class net.chobin.android.a.a implements net.chobin.android.a.s {
	 /* # interfaces */
	 /* # static fields */
	 private static javax.crypto.Cipher a;
	 private static javax.crypto.SecretKey a;
	 private static final a;
	 private static javax.crypto.Cipher b;
	 /* # direct methods */
	 static net.chobin.android.a.a ( ) {
		 /* .locals 4 */
		 /* const/16 v3, 0x4a */
		 /* const/16 v2, 0x10 */
		 /* new-array v0, v2, [B */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-byte v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput-byte v3, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* const/16 v2, 0x47 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* const/16 v2, -0x50 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 4; // const/4 v1, 0x4
		 /* const/16 v2, 0x20 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* const/16 v2, 0x65 */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 /* const/16 v2, -0x2f */
		 /* aput-byte v2, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 /* const/16 v2, 0x48 */
		 /* aput-byte v2, v0, v1 */
		 /* const/16 v1, 0x8 */
		 /* const/16 v2, 0x75 */
		 /* aput-byte v2, v0, v1 */
		 /* const/16 v1, 0x9 */
		 /* const/16 v2, -0xe */
		 /* aput-byte v2, v0, v1 */
		 /* const/16 v1, 0xb */
		 /* const/16 v2, -0x1d */
		 /* aput-byte v2, v0, v1 */
		 /* const/16 v1, 0xc */
		 /* const/16 v2, 0x46 */
		 /* aput-byte v2, v0, v1 */
		 /* const/16 v1, 0xd */
		 /* const/16 v2, 0x41 */
		 /* aput-byte v2, v0, v1 */
		 /* const/16 v1, 0xe */
		 /* const/16 v2, -0xc */
		 /* aput-byte v2, v0, v1 */
		 /* const/16 v1, 0xf */
		 /* aput-byte v3, v0, v1 */
		 return;
	 } // .end method
	 public net.chobin.android.a.a ( ) {
		 /* .locals 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 try { // :try_start_0
			 v0 = net.chobin.android.a.a.a;
			 /* if-nez v0, :cond_0 */
			 final String v0 = "PBEWITHSHAAND256BITAES-CBC-BC"; // const-string v0, "PBEWITHSHAAND256BITAES-CBC-BC"
			 javax.crypto.SecretKeyFactory .getInstance ( v0 );
			 /* new-instance v1, Ljavax/crypto/spec/PBEKeySpec; */
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 java.lang.String .valueOf ( p2 );
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v2 ).append ( p3 ); // invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( java.lang.String ) v2 ).toCharArray ( ); // invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C
			 /* const/16 v3, 0x400 */
			 /* const/16 v4, 0x100 */
			 /* invoke-direct {v1, v2, p1, v3, v4}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V */
			 (( javax.crypto.SecretKeyFactory ) v0 ).generateSecret ( v1 ); // invoke-virtual {v0, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
			 /* new-instance v1, Ljavax/crypto/spec/SecretKeySpec; */
			 final String v2 = "AES"; // const-string v2, "AES"
			 /* invoke-direct {v1, v0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
			 final String v0 = "AES/CBC/PKCS5Padding"; // const-string v0, "AES/CBC/PKCS5Padding"
			 javax.crypto.Cipher .getInstance ( v0 );
			 v0 = net.chobin.android.a.a.a;
			 int v1 = 1; // const/4 v1, 0x1
			 v2 = net.chobin.android.a.a.a;
			 /* new-instance v3, Ljavax/crypto/spec/IvParameterSpec; */
			 v4 = net.chobin.android.a.a.a;
			 /* invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
			 (( javax.crypto.Cipher ) v0 ).init ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
			 final String v0 = "AES/CBC/PKCS5Padding"; // const-string v0, "AES/CBC/PKCS5Padding"
			 javax.crypto.Cipher .getInstance ( v0 );
			 v0 = net.chobin.android.a.a.b;
			 int v1 = 2; // const/4 v1, 0x2
			 v2 = net.chobin.android.a.a.a;
			 /* new-instance v3, Ljavax/crypto/spec/IvParameterSpec; */
			 v4 = net.chobin.android.a.a.a;
			 /* invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V */
			 (( javax.crypto.Cipher ) v0 ).init ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
			 /* :try_end_0 */
			 /* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :cond_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v1, Ljava/lang/RuntimeException; */
		 final String v2 = "Invalid environment"; // const-string v2, "Invalid environment"
		 /* invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* if-nez p1, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
try { // :try_start_0
	 v0 = net.chobin.android.a.a.a;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "com.android.vending.licensing.AESObfuscator-1|"; // const-string v2, "com.android.vending.licensing.AESObfuscator-1|"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v2 = "UTF-8"; // const-string v2, "UTF-8"
	 (( java.lang.String ) v1 ).getBytes ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 (( javax.crypto.Cipher ) v0 ).doFinal ( v1 ); // invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B
	 net.chobin.android.a.b .a ( v0 );
	 /* :try_end_0 */
	 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* new-instance v1, Ljava/lang/RuntimeException; */
	 final String v2 = "Invalid environment"; // const-string v2, "Invalid environment"
	 /* invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
	 /* throw v1 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* new-instance v1, Ljava/lang/RuntimeException; */
	 final String v2 = "Invalid environment"; // const-string v2, "Invalid environment"
	 /* invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
	 /* throw v1 */
} // .end method
public java.lang.String b ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* if-nez p1, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
try { // :try_start_0
/* new-instance v0, Ljava/lang/String; */
v1 = net.chobin.android.a.a.b;
net.chobin.android.a.b .a ( p1 );
(( javax.crypto.Cipher ) v1 ).doFinal ( v2 ); // invoke-virtual {v1, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "com.android.vending.licensing.AESObfuscator-1|"; // const-string v2, "com.android.vending.licensing.AESObfuscator-1|"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = (( java.lang.String ) v0 ).indexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* new-instance v0, Lnet/chobin/android/a/y; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Header not found (invalid data or key):"; // const-string v2, "Header not found (invalid data or key):"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Lnet/chobin/android/a/y;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* :try_end_0 */
	 /* .catch Lnet/chobin/android/a/c; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljavax/crypto/BadPaddingException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_3 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* new-instance v1, Lnet/chobin/android/a/y; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 (( net.chobin.android.a.c ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lnet/chobin/android/a/c;->getMessage()Ljava/lang/String;
	 java.lang.String .valueOf ( v0 );
	 /* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v0 = ":"; // const-string v0, ":"
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v1, v0}, Lnet/chobin/android/a/y;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
} // :cond_1
try { // :try_start_1
	 final String v1 = "com.android.vending.licensing.AESObfuscator-1|"; // const-string v1, "com.android.vending.licensing.AESObfuscator-1|"
	 v1 = 	 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
	 v2 = 	 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
	 /* add-int/2addr v1, v2 */
	 v2 = 	 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
	 (( java.lang.String ) v0 ).substring ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
	 /* :try_end_1 */
	 /* .catch Lnet/chobin/android/a/c; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 ..:try_end_1} :catch_1 */
	 /* .catch Ljavax/crypto/BadPaddingException; {:try_start_1 ..:try_end_1} :catch_2 */
	 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 ..:try_end_1} :catch_3 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* new-instance v1, Lnet/chobin/android/a/y; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 (( javax.crypto.IllegalBlockSizeException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;
	 java.lang.String .valueOf ( v0 );
	 /* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v0 = ":"; // const-string v0, ":"
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v1, v0}, Lnet/chobin/android/a/y;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
	 /* :catch_2 */
	 /* move-exception v0 */
	 /* new-instance v1, Lnet/chobin/android/a/y; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 (( javax.crypto.BadPaddingException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;
	 java.lang.String .valueOf ( v0 );
	 /* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v0 = ":"; // const-string v0, ":"
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v1, v0}, Lnet/chobin/android/a/y;-><init>(Ljava/lang/String;)V */
	 /* throw v1 */
	 /* :catch_3 */
	 /* move-exception v0 */
	 /* new-instance v1, Ljava/lang/RuntimeException; */
	 final String v2 = "Invalid environment"; // const-string v2, "Invalid environment"
	 /* invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
	 /* throw v1 */
} // .end method
