public class com.games.a {
	 /* # direct methods */
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
