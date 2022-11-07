public class com.openfeint.internal.Util5 {
	 /* .source "Util5.java" */
	 /* # direct methods */
	 public com.openfeint.internal.Util5 ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String getAccountNameEclair ( android.content.Context p0 ) {
		 /* .locals 11 */
		 /* .param p0, "ctx" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 15 */
		 try { // :try_start_0
			 final String v7 = "android.accounts.AccountManager"; // const-string v7, "android.accounts.AccountManager"
			 java.lang.Class .forName ( v7 );
			 /* .line 16 */
			 /* .local v4, "cAccountManager":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
			 final String v7 = "get"; // const-string v7, "get"
			 int v8 = 1; // const/4 v8, 0x1
			 /* new-array v8, v8, [Ljava/lang/Class; */
			 int v9 = 0; // const/4 v9, 0x0
			 /* const-class v10, Landroid/content/Context; */
			 /* aput-object v10, v8, v9 */
			 (( java.lang.Class ) v4 ).getMethod ( v7, v8 ); // invoke-virtual {v4, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 17 */
			 /* .local v5, "get":Ljava/lang/reflect/Method; */
			 int v7 = 1; // const/4 v7, 0x1
			 /* new-array v7, v7, [Ljava/lang/Object; */
			 int v8 = 0; // const/4 v8, 0x0
			 /* aput-object p0, v7, v8 */
			 (( java.lang.reflect.Method ) v5 ).invoke ( v4, v7 ); // invoke-virtual {v5, v4, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 18 */
			 /* .local v1, "accountManager":Ljava/lang/Object; */
			 final String v7 = "getAccountsByType"; // const-string v7, "getAccountsByType"
			 int v8 = 1; // const/4 v8, 0x1
			 /* new-array v8, v8, [Ljava/lang/Class; */
			 int v9 = 0; // const/4 v9, 0x0
			 /* const-class v10, Ljava/lang/String; */
			 /* aput-object v10, v8, v9 */
			 (( java.lang.Class ) v4 ).getMethod ( v7, v8 ); // invoke-virtual {v4, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 19 */
			 /* .local v6, "getAccountsByType":Ljava/lang/reflect/Method; */
			 int v7 = 1; // const/4 v7, 0x1
			 /* new-array v7, v7, [Ljava/lang/Object; */
			 int v8 = 0; // const/4 v8, 0x0
			 final String v9 = "com.google"; // const-string v9, "com.google"
			 /* aput-object v9, v7, v8 */
			 (( java.lang.reflect.Method ) v6 ).invoke ( v1, v7 ); // invoke-virtual {v6, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v7, [Ljava/lang/Object; */
			 /* move-object v0, v7 */
			 /* check-cast v0, [Ljava/lang/Object; */
			 /* move-object v2, v0 */
			 /* .line 20 */
			 /* .local v2, "accounts":[Ljava/lang/Object; */
			 final String v7 = "android.accounts.Account"; // const-string v7, "android.accounts.Account"
			 java.lang.Class .forName ( v7 );
			 /* .line 21 */
			 /* .local v3, "cAccount":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
			 final String v7 = "name"; // const-string v7, "name"
			 (( java.lang.Class ) v3 ).getField ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 int v8 = 0; // const/4 v8, 0x0
			 /* aget-object v8, v2, v8 */
			 (( java.lang.reflect.Field ) v7 ).get ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v7, Ljava/lang/String; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 24 */
		 } // .end local v1 # "accountManager":Ljava/lang/Object;
	 } // .end local v2 # "accounts":[Ljava/lang/Object;
} // .end local v3 # "cAccount":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
} // .end local v4 # "cAccountManager":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
} // .end local v5 # "get":Ljava/lang/reflect/Method;
} // .end local v6 # "getAccountsByType":Ljava/lang/reflect/Method;
} // :goto_0
/* .line 22 */
/* :catch_0 */
/* move-exception v7 */
/* .line 24 */
int v7 = 0; // const/4 v7, 0x0
} // .end method
