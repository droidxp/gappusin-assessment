public class com.wei.wapst.a {
	 /* # instance fields */
	 private android.content.Context a;
	 private java.io.File b;
	 private java.io.File c;
	 /* # direct methods */
	 public com.wei.wapst.a ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 /* invoke-direct {p0}, Lcom/wei/wapst/a;->c()V */
		 return;
	 } // .end method
	 public static void a ( android.app.Activity p0 ) {
		 /* .locals 5 */
		 try { // :try_start_0
			 /* new-instance v0, Lcom/wei/wapst/a; */
			 /* invoke-direct {v0, p0}, Lcom/wei/wapst/a;-><init>(Landroid/content/Context;)V */
			 /* new-instance v1, Ldalvik/system/DexClassLoader; */
			 (( com.wei.wapst.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/wei/wapst/a;->b()Ljava/io/File;
			 (( java.io.File ) v2 ).getPath ( ); // invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;
			 (( com.wei.wapst.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/wei/wapst/a;->a()Ljava/io/File;
			 (( java.io.File ) v0 ).getPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
			 int v3 = 0; // const/4 v3, 0x0
			 (( android.app.Activity ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getClassLoader()Ljava/lang/ClassLoader;
			 /* invoke-direct {v1, v2, v0, v3, v4}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V */
			 final String v0 = "com.wei.waps.ShowAd"; // const-string v0, "com.wei.waps.ShowAd"
			 (( dalvik.system.DexClassLoader ) v1 ).loadClass ( v0 ); // invoke-virtual {v1, v0}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
			 final String v1 = "showAd"; // const-string v1, "showAd"
			 int v2 = 2; // const/4 v2, 0x2
			 /* new-array v2, v2, [Ljava/lang/Class; */
			 int v3 = 0; // const/4 v3, 0x0
			 /* const-class v4, Ljava/lang/String; */
			 /* aput-object v4, v2, v3 */
			 int v3 = 1; // const/4 v3, 0x1
			 /* const-class v4, Landroid/app/Activity; */
			 /* aput-object v4, v2, v3 */
			 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 (( android.app.Activity ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
			 (( android.app.Activity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
			 /* const/16 v3, 0x80 */
			 (( android.content.pm.PackageManager ) v1 ).getApplicationInfo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
			 v1 = this.metaData;
			 final String v2 = "MWP_KEY"; // const-string v2, "MWP_KEY"
			 (( android.os.Bundle ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 2; // const/4 v3, 0x2
			 /* new-array v3, v3, [Ljava/lang/Object; */
			 int v4 = 0; // const/4 v4, 0x0
			 /* aput-object v1, v3, v4 */
			 int v1 = 1; // const/4 v1, 0x1
			 /* aput-object p0, v3, v1 */
			 (( java.lang.reflect.Method ) v0 ).invoke ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 private void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 5 */
		 int v1 = 0; // const/4 v1, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* if-nez p2, :cond_1 */
		 } // :cond_0
		 /* new-instance v0, Ljava/lang/NullPointerException; */
		 /* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
		 /* throw v0 */
	 } // :cond_1
	 try { // :try_start_0
		 v0 = this.a;
		 (( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 (( android.content.res.AssetManager ) v0 ).open ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
		 try { // :try_start_1
			 v0 = this.a;
			 int v3 = 0; // const/4 v3, 0x0
			 (( android.content.Context ) v0 ).openFileOutput ( p2, v3 ); // invoke-virtual {v0, p2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
			 /* const/16 v0, 0x800 */
			 /* new-array v0, v0, [B */
		 } // :goto_0
		 v3 = 		 (( java.io.InputStream ) v2 ).read ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I
		 int v4 = -1; // const/4 v4, -0x1
		 /* if-ne v3, v4, :cond_4 */
		 (( java.io.OutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 if ( v1 != null) { // if-eqz v1, :cond_2
			 (( java.io.OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
		 } // :cond_2
		 if ( v2 != null) { // if-eqz v2, :cond_3
			 (( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
		 } // :cond_3
		 return;
	 } // :cond_4
	 int v4 = 0; // const/4 v4, 0x0
	 try { // :try_start_2
		 (( java.io.OutputStream ) v1 ).write ( v0, v4, v3 ); // invoke-virtual {v1, v0, v4, v3}, Ljava/io/OutputStream;->write([BII)V
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
	 } // :goto_1
	 if ( v1 != null) { // if-eqz v1, :cond_5
		 (( java.io.OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
	 } // :cond_5
	 if ( v2 != null) { // if-eqz v2, :cond_6
		 (( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
	 } // :cond_6
	 /* throw v0 */
	 /* :catchall_1 */
	 /* move-exception v0 */
	 /* move-object v2, v1 */
} // .end method
private void c ( ) {
	 /* .locals 3 */
	 v0 = this.a;
	 (( android.content.Context ) v0 ).getFilesDir ( ); // invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
	 this.b = v0;
	 /* new-instance v0, Ljava/io/File; */
	 v1 = this.b;
	 final String v2 = "data.apk"; // const-string v2, "data.apk"
	 /* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 this.c = v0;
	 v0 = this.c;
	 v0 = 	 (( java.io.File ) v0 ).isFile ( ); // invoke-virtual {v0}, Ljava/io/File;->isFile()Z
	 /* if-nez v0, :cond_0 */
	 final String v0 = "data.dat"; // const-string v0, "data.dat"
	 final String v1 = "data.apk"; // const-string v1, "data.apk"
	 /* invoke-direct {p0, v0, v1}, Lcom/wei/wapst/a;->a(Ljava/lang/String;Ljava/lang/String;)V */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public java.io.File a ( ) {
/* .locals 1 */
v0 = this.b;
} // .end method
public java.io.File b ( ) {
/* .locals 1 */
v0 = this.c;
} // .end method
