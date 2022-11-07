public class com.acv.bc.bc.Gg {
	 /* # static fields */
	 public static final java.lang.String a;
	 public static final java.util.Random b;
	 private static final java.lang.String c;
	 private static final java.lang.String d;
	 /* # direct methods */
	 static com.acv.bc.bc.Gg ( ) {
		 /* .locals 3 */
		 /* const-class v0, Lcom/acv/bc/bc/Gg; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 /* new-instance v0, Ljava/util/Random; */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v1 */
		 /* invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V */
		 /* new-instance v0, Ljava/lang/String; */
		 int v1 = 6; // const/4 v1, 0x6
		 /* new-array v1, v1, [C */
		 /* fill-array-data v1, :array_0 */
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
		 /* new-instance v0, Ljava/lang/String; */
		 /* const/16 v1, 0x1a */
		 /* new-array v1, v1, [C */
		 /* fill-array-data v1, :array_1 */
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 2 */
		 /* 0x44s */
		 /* 0x45s */
		 /* 0x53s */
		 /* 0x65s */
		 /* 0x64s */
		 /* 0x65s */
	 } // .end array-data
	 /* :array_1 */
	 /* .array-data 2 */
	 /* 0x44s */
	 /* 0x45s */
	 /* 0x53s */
	 /* 0x65s */
	 /* 0x64s */
	 /* 0x65s */
	 /* 0x2fs */
	 /* 0x45s */
	 /* 0x43s */
	 /* 0x42s */
	 /* 0x2fs */
	 /* 0x49s */
	 /* 0x53s */
	 /* 0x4fs */
	 /* 0x31s */
	 /* 0x30s */
	 /* 0x31s */
	 /* 0x32s */
	 /* 0x36s */
	 /* 0x50s */
	 /* 0x61s */
	 /* 0x64s */
	 /* 0x64s */
	 /* 0x69s */
	 /* 0x6es */
	 /* 0x67s */
} // .end array-data
} // .end method
public com.acv.bc.bc.Gg ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static java.lang.String a ( java.lang.Object p0 ) {
/* .locals 1 */
/* if-nez p0, :cond_0 */
final String v0 = ""; // const-string v0, ""
} // :goto_0
} // :cond_0
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 0 */
/* if-nez p0, :cond_0 */
} // :goto_0
} // :cond_0
/* move-object p1, p0 */
} // .end method
public static java.lang.String a ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 4 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v0, p1 */
/* if-gtz v0, :cond_1 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p0 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/String; */
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [C */
/* fill-array-data v2, :array_0 */
/* invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p0 );
/* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* new-instance v2, Ljava/lang/String; */
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [C */
/* fill-array-data v3, :array_1 */
/* invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* array-length v2, p1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* add-int/lit8 v3, v2, -0x1 */
/* if-lt v0, v3, :cond_2 */
/* add-int/lit8 v0, v2, -0x1 */
/* aget-object v0, p1, v0 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v0 = "}"; // const-string v0, "}"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
/* aget-object v3, p1, v0 */
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v0, 0x1 */
/* nop */
/* :array_0 */
/* .array-data 2 */
/* 0x3as */
/* 0x7bs */
/* 0x7ds */
} // .end array-data
/* nop */
/* :array_1 */
/* .array-data 2 */
/* 0x3as */
/* 0x7bs */
} // .end array-data
} // .end method
public static java.security.Key a ( Object[] p0 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v0, p0 */
/* if-gtz v0, :cond_1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_1
/* new-instance v0, Ljavax/crypto/spec/DESedeKeySpec; */
/* invoke-direct {v0, p0}, Ljavax/crypto/spec/DESedeKeySpec;-><init>([B)V */
v1 = com.acv.bc.bc.Gg.c;
javax.crypto.SecretKeyFactory .getInstance ( v1 );
(( javax.crypto.SecretKeyFactory ) v1 ).generateSecret ( v0 ); // invoke-virtual {v1, v0}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
} // .end method
public static a ( Object[] p0, Object[] p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v1, p0 */
/* if-lez v1, :cond_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v1, p1 */
/* if-gtz v1, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
com.acv.bc.bc.Gg .a ( p1 );
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = com.acv.bc.bc.Gg.d;
javax.crypto.Cipher .getInstance ( v0 );
int v2 = 1; // const/4 v2, 0x1
(( javax.crypto.Cipher ) v0 ).init ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
(( javax.crypto.Cipher ) v0 ).doFinal ( p0 ); // invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
} // .end method
public static b ( Object[] p0, Object[] p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_0
/* array-length v1, p0 */
/* if-lez v1, :cond_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v1, p1 */
/* if-gtz v1, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
com.acv.bc.bc.Gg .a ( p1 );
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = com.acv.bc.bc.Gg.d;
javax.crypto.Cipher .getInstance ( v0 );
int v2 = 2; // const/4 v2, 0x2
(( javax.crypto.Cipher ) v0 ).init ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
(( javax.crypto.Cipher ) v0 ).doFinal ( p0 ); // invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B
} // .end method
