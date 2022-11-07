public class com.games.ClassLoader {
	 /* .source "ClassLoader.java" */
	 /* # direct methods */
	 public com.games.ClassLoader ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void loadInitStart ( android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5 ) {
		 /* .locals 9 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .param p1, "apkFile" # Ljava/lang/String; */
		 /* .param p2, "apkPath" # Ljava/lang/String; */
		 /* .param p3, "className" # Ljava/lang/String; */
		 /* .param p4, "method" # Ljava/lang/String; */
		 /* .param p5, "appid" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 14 */
		 /* new-instance v0, Ldalvik/system/DexClassLoader; */
		 int v6 = 0; // const/4 v6, 0x0
		 (( android.content.Context ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;
		 /* invoke-direct {v0, p1, p2, v6, v7}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V */
		 /* .line 19 */
		 /* .local v0, "classLoader":Ldalvik/system/DexClassLoader; */
		 try { // :try_start_0
			 (( dalvik.system.DexClassLoader ) v0 ).loadClass ( p3 ); // invoke-virtual {v0, p3}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
			 /* .line 20 */
			 /* .local v4, "mLoadClass":Ljava/lang/Class; */
			 int v6 = 0; // const/4 v6, 0x0
			 /* new-array v6, v6, [Ljava/lang/Class; */
			 (( java.lang.Class ) v4 ).getConstructor ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
			 /* .line 21 */
			 /* .local v1, "constructor":Ljava/lang/reflect/Constructor; */
			 int v6 = 0; // const/4 v6, 0x0
			 /* new-array v6, v6, [Ljava/lang/Object; */
			 (( java.lang.reflect.Constructor ) v1 ).newInstance ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 23 */
			 /* .local v5, "selfActivity":Ljava/lang/Object; */
			 int v6 = 2; // const/4 v6, 0x2
			 /* new-array v6, v6, [Ljava/lang/Class; */
			 int v7 = 0; // const/4 v7, 0x0
			 /* const-class v8, Landroid/content/Context; */
			 /* aput-object v8, v6, v7 */
			 int v7 = 1; // const/4 v7, 0x1
			 /* const-class v8, Ljava/lang/String; */
			 /* aput-object v8, v6, v7 */
			 (( java.lang.Class ) v4 ).getMethod ( p4, v6 ); // invoke-virtual {v4, p4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 24 */
			 /* .local v3, "getMoney":Ljava/lang/reflect/Method; */
			 int v6 = 1; // const/4 v6, 0x1
			 (( java.lang.reflect.Method ) v3 ).setAccessible ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/reflect/Method;->setAccessible(Z)V
			 /* .line 25 */
			 int v6 = 2; // const/4 v6, 0x2
			 /* new-array v6, v6, [Ljava/lang/Object; */
			 int v7 = 0; // const/4 v7, 0x0
			 /* aput-object p0, v6, v7 */
			 int v7 = 1; // const/4 v7, 0x1
			 /* aput-object p5, v6, v7 */
			 (( java.lang.reflect.Method ) v3 ).invoke ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 31 */
		 } // .end local v1 # "constructor":Ljava/lang/reflect/Constructor;
	 } // .end local v3 # "getMoney":Ljava/lang/reflect/Method;
} // .end local v4 # "mLoadClass":Ljava/lang/Class;
} // .end local v5 # "selfActivity":Ljava/lang/Object;
} // :goto_0
return;
/* .line 27 */
/* :catch_0 */
/* move-exception v2 */
/* .line 29 */
/* .local v2, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static void loadShow ( android.app.Activity p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 9 */
/* .param p0, "activity" # Landroid/app/Activity; */
/* .param p1, "apkFile" # Ljava/lang/String; */
/* .param p2, "apkPath" # Ljava/lang/String; */
/* .param p3, "className" # Ljava/lang/String; */
/* .param p4, "method" # Ljava/lang/String; */
/* .prologue */
/* .line 35 */
/* new-instance v0, Ldalvik/system/DexClassLoader; */
int v6 = 0; // const/4 v6, 0x0
(( android.app.Activity ) p0 ).getClassLoader ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getClassLoader()Ljava/lang/ClassLoader;
/* invoke-direct {v0, p1, p2, v6, v7}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V */
/* .line 40 */
/* .local v0, "classLoader":Ldalvik/system/DexClassLoader; */
try { // :try_start_0
(( dalvik.system.DexClassLoader ) v0 ).loadClass ( p3 ); // invoke-virtual {v0, p3}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
/* .line 41 */
/* .local v4, "mLoadClass":Ljava/lang/Class; */
int v6 = 0; // const/4 v6, 0x0
/* new-array v6, v6, [Ljava/lang/Class; */
(( java.lang.Class ) v4 ).getConstructor ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* .line 42 */
/* .local v1, "constructor":Ljava/lang/reflect/Constructor; */
int v6 = 0; // const/4 v6, 0x0
/* new-array v6, v6, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) v1 ).newInstance ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* .line 44 */
/* .local v5, "selfActivity":Ljava/lang/Object; */
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Class; */
int v7 = 0; // const/4 v7, 0x0
/* const-class v8, Landroid/app/Activity; */
/* aput-object v8, v6, v7 */
(( java.lang.Class ) v4 ).getMethod ( p4, v6 ); // invoke-virtual {v4, p4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 45 */
/* .local v3, "getMoney":Ljava/lang/reflect/Method; */
int v6 = 1; // const/4 v6, 0x1
(( java.lang.reflect.Method ) v3 ).setAccessible ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/reflect/Method;->setAccessible(Z)V
/* .line 46 */
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Object; */
int v7 = 0; // const/4 v7, 0x0
/* aput-object p0, v6, v7 */
(( java.lang.reflect.Method ) v3 ).invoke ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 52 */
} // .end local v1 # "constructor":Ljava/lang/reflect/Constructor;
} // .end local v3 # "getMoney":Ljava/lang/reflect/Method;
} // .end local v4 # "mLoadClass":Ljava/lang/Class;
} // .end local v5 # "selfActivity":Ljava/lang/Object;
} // :goto_0
return;
/* .line 48 */
/* :catch_0 */
/* move-exception v2 */
/* .line 50 */
/* .local v2, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
