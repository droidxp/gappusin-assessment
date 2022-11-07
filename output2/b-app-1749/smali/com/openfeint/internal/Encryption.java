public class com.openfeint.internal.Encryption {
	 /* .source "Encryption.java" */
	 /* # static fields */
	 private static final java.lang.String INSTANCE;
	 private static final Integer SALT_ITERATIONS;
	 private static final Integer SALT_LENGTH;
	 private static final java.lang.String TAG;
	 private static javax.crypto.SecretKey secretKey;
	 /* # direct methods */
	 public com.openfeint.internal.Encryption ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.io.InputStream decrypt ( java.io.File p0 ) {
		 /* .locals 1 */
		 /* .param p0, "file" # Ljava/io/File; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/FileNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 104 */
	 /* new-instance v0, Ljava/io/FileInputStream; */
	 /* invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
	 com.openfeint.internal.Encryption .decryptionWrap ( v0 );
} // .end method
public static decrypt ( Object[] p0 ) {
	 /* .locals 2 */
	 /* .param p0, "input" # [B */
	 /* .prologue */
	 /* .line 113 */
	 try { // :try_start_0
		 /* new-instance v1, Ljava/io/ByteArrayInputStream; */
		 /* invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
		 com.openfeint.internal.Encryption .decryptionWrap ( v1 );
		 com.openfeint.internal.Util .toByteArray ( v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 115 */
	 } // :goto_0
	 /* .line 114 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 115 */
	 /* .local v0, "e":Ljava/lang/Exception; */
	 int v1 = 0; // const/4 v1, 0x0
} // .end method
public static decryptFile ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "path" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/FileNotFoundException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 108 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
com.openfeint.internal.Encryption .decrypt ( v0 );
com.openfeint.internal.Util .toByteArray ( v0 );
} // .end method
public static javax.crypto.CipherInputStream decryptionWrap ( java.io.InputStream p0 ) {
/* .locals 6 */
/* .param p0, "is" # Ljava/io/InputStream; */
/* .prologue */
/* const/16 v5, 0xa */
/* .line 53 */
/* const/16 v4, 0xa */
try { // :try_start_0
	 /* new-array v3, v4, [B */
	 /* .line 54 */
	 /* .local v3, "salt":[B */
	 v4 = 	 (( java.io.InputStream ) p0 ).read ( v3 ); // invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I
	 /* if-eq v4, v5, :cond_0 */
	 /* new-instance v4, Ljava/lang/Exception; */
	 final String v5 = "Couldn\'t read entire salt"; // const-string v5, "Couldn\'t read entire salt"
	 /* invoke-direct {v4, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
	 /* throw v4 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 61 */
} // .end local v3 # "salt":[B
/* :catch_0 */
/* move-exception v1 */
/* .line 62 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v4 = "Encryption"; // const-string v4, "Encryption"
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* .line 64 */
int v4 = 0; // const/4 v4, 0x0
} // .end local v1 # "e":Ljava/lang/Exception;
} // :goto_0
/* .line 56 */
/* .restart local v3 # "salt":[B */
} // :cond_0
try { // :try_start_1
/* new-instance v2, Ljavax/crypto/spec/PBEParameterSpec; */
/* const/16 v4, 0xa */
/* invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V */
/* .line 57 */
/* .local v2, "pbeParamSpec":Ljavax/crypto/spec/PBEParameterSpec; */
final String v4 = "PBEWithSHA256And256BitAES-CBC-BC"; // const-string v4, "PBEWithSHA256And256BitAES-CBC-BC"
javax.crypto.Cipher .getInstance ( v4 );
/* .line 58 */
/* .local v0, "c":Ljavax/crypto/Cipher; */
int v4 = 2; // const/4 v4, 0x2
v5 = com.openfeint.internal.Encryption.secretKey;
(( javax.crypto.Cipher ) v0 ).init ( v4, v5, v2 ); // invoke-virtual {v0, v4, v5, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 60 */
/* new-instance v4, Ljavax/crypto/CipherInputStream; */
/* invoke-direct {v4, p0, v0}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
public static java.io.OutputStream encrypt ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "path" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 132 */
/* new-instance v0, Ljava/io/FileOutputStream; */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
com.openfeint.internal.Encryption .encryptionWrap ( v0 );
} // .end method
public static Boolean encrypt ( Object[] p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p0, "in" # [B */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 121 */
try { // :try_start_0
com.openfeint.internal.Encryption .encrypt ( p1 );
/* .line 122 */
/* .local v0, "os":Ljava/io/OutputStream; */
(( java.io.OutputStream ) v0 ).write ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
/* .line 123 */
(( java.io.OutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 124 */
int v1 = 1; // const/4 v1, 0x1
/* .line 128 */
} // .end local v0 # "os":Ljava/io/OutputStream;
} // :goto_0
/* .line 125 */
/* :catch_0 */
/* move-exception v1 */
/* .line 128 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public static encrypt ( Object[] p0 ) {
/* .locals 4 */
/* .param p0, "input" # [B */
/* .prologue */
/* .line 137 */
try { // :try_start_0
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 138 */
/* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
com.openfeint.internal.Encryption .encryptionWrap ( v0 );
/* .line 139 */
/* .local v2, "enc":Ljavax/crypto/CipherOutputStream; */
(( javax.crypto.CipherOutputStream ) v2 ).write ( p0 ); // invoke-virtual {v2, p0}, Ljavax/crypto/CipherOutputStream;->write([B)V
/* .line 140 */
(( javax.crypto.CipherOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljavax/crypto/CipherOutputStream;->close()V
/* .line 141 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 143 */
} // .end local v0 # "baos":Ljava/io/ByteArrayOutputStream;
} // .end local v2 # "enc":Ljavax/crypto/CipherOutputStream;
} // :goto_0
/* .line 142 */
/* :catch_0 */
/* move-exception v1 */
/* .line 143 */
/* .local v1, "e":Ljava/lang/Exception; */
int v3 = 0; // const/4 v3, 0x0
} // .end method
public static javax.crypto.CipherOutputStream encryptionWrap ( java.io.OutputStream p0 ) {
/* .locals 6 */
/* .param p0, "os" # Ljava/io/OutputStream; */
/* .prologue */
/* .line 36 */
/* const/16 v4, 0xa */
try { // :try_start_0
/* new-array v3, v4, [B */
/* .line 37 */
/* .local v3, "salt":[B */
/* new-instance v4, Ljava/security/SecureRandom; */
/* invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V */
(( java.security.SecureRandom ) v4 ).nextBytes ( v3 ); // invoke-virtual {v4, v3}, Ljava/security/SecureRandom;->nextBytes([B)V
/* .line 38 */
(( java.io.OutputStream ) p0 ).write ( v3 ); // invoke-virtual {p0, v3}, Ljava/io/OutputStream;->write([B)V
/* .line 40 */
/* new-instance v2, Ljavax/crypto/spec/PBEParameterSpec; */
/* const/16 v4, 0xa */
/* invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/PBEParameterSpec;-><init>([BI)V */
/* .line 41 */
/* .local v2, "pbeParamSpec":Ljavax/crypto/spec/PBEParameterSpec; */
final String v4 = "PBEWithSHA256And256BitAES-CBC-BC"; // const-string v4, "PBEWithSHA256And256BitAES-CBC-BC"
javax.crypto.Cipher .getInstance ( v4 );
/* .line 42 */
/* .local v0, "c":Ljavax/crypto/Cipher; */
int v4 = 1; // const/4 v4, 0x1
v5 = com.openfeint.internal.Encryption.secretKey;
(( javax.crypto.Cipher ) v0 ).init ( v4, v5, v2 ); // invoke-virtual {v0, v4, v5, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/* .line 44 */
/* new-instance v4, Ljavax/crypto/CipherOutputStream; */
/* invoke-direct {v4, p0, v0}, Ljavax/crypto/CipherOutputStream;-><init>(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 48 */
} // .end local v0 # "c":Ljavax/crypto/Cipher;
} // .end local v2 # "pbeParamSpec":Ljavax/crypto/spec/PBEParameterSpec;
} // .end local v3 # "salt":[B
} // :goto_0
/* .line 45 */
/* :catch_0 */
/* move-exception v1 */
/* .line 46 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v4 = "Encryption"; // const-string v4, "Encryption"
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v4,v5 );
/* .line 48 */
int v4 = 0; // const/4 v4, 0x0
} // .end method
public static Boolean init ( java.lang.String p0 ) {
/* .locals 10 */
/* .param p0, "password" # Ljava/lang/String; */
/* .prologue */
/* .line 73 */
try { // :try_start_0
/* new-instance v7, Ljavax/crypto/spec/PBEKeySpec; */
(( java.lang.String ) p0 ).toCharArray ( ); // invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
/* invoke-direct {v7, v9}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C)V */
/* .line 74 */
/* .local v7, "pbeKeySpec":Ljavax/crypto/spec/PBEKeySpec; */
final String v9 = "PBEWithSHA256And256BitAES-CBC-BC"; // const-string v9, "PBEWithSHA256And256BitAES-CBC-BC"
javax.crypto.SecretKeyFactory .getInstance ( v9 );
/* .line 75 */
/* .local v6, "keyFac":Ljavax/crypto/SecretKeyFactory; */
(( javax.crypto.SecretKeyFactory ) v6 ).generateSecret ( v7 ); // invoke-virtual {v6, v7}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/* .line 78 */
final String v9 = "PBEWithSHA256And256BitAES-CBC-BC"; // const-string v9, "PBEWithSHA256And256BitAES-CBC-BC"
(( java.lang.String ) v9 ).getBytes ( ); // invoke-virtual {v9}, Ljava/lang/String;->getBytes()[B
/* .line 80 */
/* .local v8, "testString":[B */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 81 */
/* .local v0, "baos":Ljava/io/ByteArrayOutputStream; */
com.openfeint.internal.Encryption .encryptionWrap ( v0 );
/* .line 82 */
/* .local v2, "cos":Ljavax/crypto/CipherOutputStream; */
(( javax.crypto.CipherOutputStream ) v2 ).write ( v8 ); // invoke-virtual {v2, v8}, Ljavax/crypto/CipherOutputStream;->write([B)V
/* .line 83 */
(( javax.crypto.CipherOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljavax/crypto/CipherOutputStream;->close()V
/* .line 84 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 85 */
/* .local v5, "encryptedContents":[B */
/* array-length v9, v5 */
/* if-nez v9, :cond_0 */
/* new-instance v9, Ljava/lang/Exception; */
/* invoke-direct {v9}, Ljava/lang/Exception;-><init>()V */
/* throw v9 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 91 */
} // .end local v0 # "baos":Ljava/io/ByteArrayOutputStream;
} // .end local v2 # "cos":Ljavax/crypto/CipherOutputStream;
} // .end local v5 # "encryptedContents":[B
} // .end local v6 # "keyFac":Ljavax/crypto/SecretKeyFactory;
} // .end local v7 # "pbeKeySpec":Ljavax/crypto/spec/PBEKeySpec;
} // .end local v8 # "testString":[B
/* :catch_0 */
/* move-exception v4 */
/* .line 92 */
/* .local v4, "e":Ljava/lang/Exception; */
int v9 = 0; // const/4 v9, 0x0
/* .line 93 */
int v9 = 0; // const/4 v9, 0x0
/* .line 96 */
} // .end local v4 # "e":Ljava/lang/Exception;
} // :goto_0
/* .line 87 */
/* .restart local v0 # "baos":Ljava/io/ByteArrayOutputStream; */
/* .restart local v2 # "cos":Ljavax/crypto/CipherOutputStream; */
/* .restart local v5 # "encryptedContents":[B */
/* .restart local v6 # "keyFac":Ljavax/crypto/SecretKeyFactory; */
/* .restart local v7 # "pbeKeySpec":Ljavax/crypto/spec/PBEKeySpec; */
/* .restart local v8 # "testString":[B */
} // :cond_0
try { // :try_start_1
/* new-instance v9, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v9, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
com.openfeint.internal.Encryption .decryptionWrap ( v9 );
/* .line 88 */
/* .local v1, "cis":Ljavax/crypto/CipherInputStream; */
com.openfeint.internal.Util .toByteArray ( v1 );
/* .line 89 */
/* .local v3, "decryptedContents":[B */
v9 = java.util.Arrays .equals ( v3,v8 );
/* if-nez v9, :cond_1 */
/* new-instance v9, Ljava/lang/Exception; */
/* invoke-direct {v9}, Ljava/lang/Exception;-><init>()V */
/* throw v9 */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 96 */
} // :cond_1
int v9 = 1; // const/4 v9, 0x1
} // .end method
public static Boolean initialized ( ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
v0 = com.openfeint.internal.Encryption.secretKey;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
