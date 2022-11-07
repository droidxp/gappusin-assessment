public class com.mxj.tolas.DsgMse {
	 /* .source "DsgMse.java" */
	 /* # static fields */
	 private static final java.lang.String DES;
	 private static java.lang.String PASSWORD_CRYPT_KEY;
	 /* # direct methods */
	 static com.mxj.tolas.DsgMse ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 22 */
		 final String v0 = "mxj49459"; // const-string v0, "mxj49459"
		 return;
	 } // .end method
	 public com.mxj.tolas.DsgMse ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String byte2hex ( Object[] p0 ) {
		 /* .locals 5 */
		 /* .param p0, "b" # [B */
		 /* .prologue */
		 /* .line 187 */
		 final String v0 = ""; // const-string v0, ""
		 /* .line 189 */
		 /* .local v0, "hs":Ljava/lang/String; */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 191 */
		 /* .local v2, "stmp":Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .local v1, "n":I */
	 } // :goto_0
	 /* array-length v3, p0 */
	 /* if-lt v1, v3, :cond_0 */
	 /* .line 205 */
	 (( java.lang.String ) v0 ).toUpperCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
	 /* .line 193 */
} // :cond_0
/* aget-byte v3, p0, v1 */
/* and-int/lit16 v3, v3, 0xff */
java.lang.Integer .toHexString ( v3 );
/* .line 195 */
v3 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_1 */
/* .line 197 */
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "0"; // const-string v4, "0"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 191 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 201 */
} // :cond_1
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static final java.lang.String decrypt ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "data" # Ljava/lang/String; */
/* .prologue */
/* .line 138 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/String; */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
com.mxj.tolas.DsgMse .hex2byte ( v1 );
/* .line 140 */
v2 = com.mxj.tolas.DsgMse.PASSWORD_CRYPT_KEY;
(( java.lang.String ) v2 ).getBytes ( ); // invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
/* .line 138 */
com.mxj.tolas.DsgMse .decrypt ( v1,v2 );
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 146 */
} // :goto_0
/* .line 142 */
/* :catch_0 */
/* move-exception v0 */
/* .line 146 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static decrypt ( Object[] p0, Object[] p1 ) {
/* .locals 6 */
/* .param p0, "src" # [B */
/* .param p1, "key" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 92 */
/* new-instance v4, Ljava/security/SecureRandom; */
/* invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V */
/* .line 96 */
/* .local v4, "sr":Ljava/security/SecureRandom; */
/* new-instance v1, Ljavax/crypto/spec/DESKeySpec; */
/* invoke-direct {v1, p1}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V */
/* .line 102 */
/* .local v1, "dks":Ljavax/crypto/spec/DESKeySpec; */
final String v5 = "DES"; // const-string v5, "DES"
javax.crypto.SecretKeyFactory .getInstance ( v5 );
/* .line 104 */
/* .local v2, "keyFactory":Ljavax/crypto/SecretKeyFactory; */
(( javax.crypto.SecretKeyFactory ) v2 ).generateSecret ( v1 ); // invoke-virtual {v2, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/* .line 108 */
/* .local v3, "securekey":Ljavax/crypto/SecretKey; */
final String v5 = "DES"; // const-string v5, "DES"
javax.crypto.Cipher .getInstance ( v5 );
/* .line 112 */
/* .local v0, "cipher":Ljavax/crypto/Cipher; */
int v5 = 2; // const/4 v5, 0x2
(( javax.crypto.Cipher ) v0 ).init ( v5, v3, v4 ); // invoke-virtual {v0, v5, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/SecureRandom;)V
/* .line 118 */
(( javax.crypto.Cipher ) v0 ).doFinal ( p0 ); // invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
} // .end method
public static final java.lang.String encrypt ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "password" # Ljava/lang/String; */
/* .prologue */
/* .line 166 */
try { // :try_start_0
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
v1 = com.mxj.tolas.DsgMse.PASSWORD_CRYPT_KEY;
(( java.lang.String ) v1 ).getBytes ( ); // invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
com.mxj.tolas.DsgMse .encrypt ( v0,v1 );
com.mxj.tolas.DsgMse .byte2hex ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 171 */
} // :goto_0
/* .line 167 */
/* :catch_0 */
/* move-exception v0 */
/* .line 171 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static encrypt ( Object[] p0, Object[] p1 ) {
/* .locals 6 */
/* .param p0, "src" # [B */
/* .param p1, "key" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 42 */
/* new-instance v4, Ljava/security/SecureRandom; */
/* invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V */
/* .line 46 */
/* .local v4, "sr":Ljava/security/SecureRandom; */
/* new-instance v1, Ljavax/crypto/spec/DESKeySpec; */
/* invoke-direct {v1, p1}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V */
/* .line 52 */
/* .local v1, "dks":Ljavax/crypto/spec/DESKeySpec; */
final String v5 = "DES"; // const-string v5, "DES"
javax.crypto.SecretKeyFactory .getInstance ( v5 );
/* .line 54 */
/* .local v2, "keyFactory":Ljavax/crypto/SecretKeyFactory; */
(( javax.crypto.SecretKeyFactory ) v2 ).generateSecret ( v1 ); // invoke-virtual {v2, v1}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/* .line 58 */
/* .local v3, "securekey":Ljavax/crypto/SecretKey; */
final String v5 = "DES"; // const-string v5, "DES"
javax.crypto.Cipher .getInstance ( v5 );
/* .line 62 */
/* .local v0, "cipher":Ljavax/crypto/Cipher; */
int v5 = 1; // const/4 v5, 0x1
(( javax.crypto.Cipher ) v0 ).init ( v5, v3, v4 ); // invoke-virtual {v0, v5, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/SecureRandom;)V
/* .line 68 */
(( javax.crypto.Cipher ) v0 ).doFinal ( p0 ); // invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
} // .end method
public static hex2byte ( Object[] p0 ) {
/* .locals 5 */
/* .param p0, "b" # [B */
/* .prologue */
/* .line 213 */
/* array-length v3, p0 */
/* rem-int/lit8 v3, v3, 0x2 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 215 */
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
final String v4 = "\u957f\u5ea6\u4e0d\u662f\u5076\u6570"; // const-string v4, "\u957f\u5ea6\u4e0d\u662f\u5076\u6570"
/* invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v3 */
/* .line 217 */
} // :cond_0
/* array-length v3, p0 */
/* div-int/lit8 v3, v3, 0x2 */
/* new-array v0, v3, [B */
/* .line 219 */
/* .local v0, "b2":[B */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "n":I */
} // :goto_0
/* array-length v3, p0 */
/* if-lt v2, v3, :cond_1 */
/* .line 227 */
/* .line 221 */
} // :cond_1
/* new-instance v1, Ljava/lang/String; */
int v3 = 2; // const/4 v3, 0x2
/* invoke-direct {v1, p0, v2, v3}, Ljava/lang/String;-><init>([BII)V */
/* .line 223 */
/* .local v1, "item":Ljava/lang/String; */
/* div-int/lit8 v3, v2, 0x2 */
/* const/16 v4, 0x10 */
v4 = java.lang.Integer .parseInt ( v1,v4 );
/* int-to-byte v4, v4 */
/* aput-byte v4, v0, v3 */
/* .line 219 */
/* add-int/lit8 v2, v2, 0x2 */
} // .end method
public static void main ( java.lang.String[] p0 ) {
/* .locals 6 */
/* .param p0, "args" # [Ljava/lang/String; */
/* .prologue */
/* .line 245 */
/* new-instance v0, Ljava/lang/String; */
final String v3 = "4"; // const-string v3, "4"
com.mxj.tolas.DsgMse .encrypt ( v3 );
/* invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* .line 246 */
/* .local v0, "enString":Ljava/lang/String; */
v3 = java.lang.System.out;
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "int\u52a0\u5bc6\u540e\u5b57\u7b26\u4e32\u4e3a\uff1a"; // const-string v5, "int\u52a0\u5bc6\u540e\u5b57\u7b26\u4e32\u4e3a\uff1a"
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v3 ).println ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 248 */
/* move-object v1, v0 */
/* .line 249 */
/* .local v1, "s":Ljava/lang/String; */
com.mxj.tolas.DsgMse .decrypt ( v1 );
v2 = java.lang.Integer .parseInt ( v3 );
/* .line 250 */
/* .local v2, "ss":I */
v3 = java.lang.System.out;
(( java.io.PrintStream ) v3 ).println ( v2 ); // invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(I)V
/* .line 254 */
return;
} // .end method
