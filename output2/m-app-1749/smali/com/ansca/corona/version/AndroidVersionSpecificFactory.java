public class com.ansca.corona.version.AndroidVersionSpecificFactory {
	 /* .source "AndroidVersionSpecificFactory.java" */
	 /* # direct methods */
	 public com.ansca.corona.version.AndroidVersionSpecificFactory ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 6 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.ansca.corona.version.IAndroidVersionSpecific create ( ) {
		 /* .locals 9 */
		 /* .prologue */
		 /* .line 41 */
		 com.ansca.corona.version.AndroidVersionSpecificFactory .getAndroidVersion ( );
		 /* .line 42 */
		 /* .local v6, "version":Ljava/lang/String; */
		 /* new-instance v7, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v8 = "com.ansca.corona.version.android"; // const-string v8, "com.ansca.corona.version.android"
		 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).append ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v8 = ".AndroidVersionSpecific"; // const-string v8, ".AndroidVersionSpecific"
		 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 43 */
		 /* .local v2, "className":Ljava/lang/String; */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 45 */
		 /* .local v5, "result":Lcom/ansca/corona/version/IAndroidVersionSpecific; */
		 try { // :try_start_0
			 java.lang.Class .forName ( v2 );
			 /* .line 47 */
			 /* .local v1, "c":Ljava/lang/Class; */
			 (( java.lang.Class ) v1 ).newInstance ( ); // invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
			 /* .line 49 */
			 /* .local v3, "created":Ljava/lang/Object; */
			 /* move-object v0, v3 */
			 /* check-cast v0, Lcom/ansca/corona/version/IAndroidVersionSpecific; */
			 /* move-object v5, v0 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_3 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_4 */
			 /* .line 66 */
		 } // .end local v1 # "c":Ljava/lang/Class;
	 } // .end local v3 # "created":Ljava/lang/Object;
} // :goto_0
/* .line 50 */
/* :catch_0 */
/* move-exception v4 */
/* .line 52 */
/* .local v4, "e":Ljava/lang/ClassNotFoundException; */
(( java.lang.ClassNotFoundException ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/ClassNotFoundException;->printStackTrace()V
/* .line 53 */
} // .end local v4 # "e":Ljava/lang/ClassNotFoundException;
/* :catch_1 */
/* move-exception v4 */
/* .line 55 */
/* .local v4, "e":Ljava/lang/SecurityException; */
(( java.lang.SecurityException ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/SecurityException;->printStackTrace()V
/* .line 56 */
} // .end local v4 # "e":Ljava/lang/SecurityException;
/* :catch_2 */
/* move-exception v4 */
/* .line 58 */
/* .local v4, "e":Ljava/lang/IllegalArgumentException; */
(( java.lang.IllegalArgumentException ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
/* .line 59 */
} // .end local v4 # "e":Ljava/lang/IllegalArgumentException;
/* :catch_3 */
/* move-exception v4 */
/* .line 61 */
/* .local v4, "e":Ljava/lang/InstantiationException; */
(( java.lang.InstantiationException ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/InstantiationException;->printStackTrace()V
/* .line 62 */
} // .end local v4 # "e":Ljava/lang/InstantiationException;
/* :catch_4 */
/* move-exception v4 */
/* .line 64 */
/* .local v4, "e":Ljava/lang/IllegalAccessException; */
(( java.lang.IllegalAccessException ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/IllegalAccessException;->printStackTrace()V
} // .end method
private static java.lang.String getAndroidVersion ( ) {
/* .locals 7 */
/* .prologue */
/* .line 9 */
final String v2 = "com.ansca.corona.version.AndroidVersion"; // const-string v2, "com.ansca.corona.version.AndroidVersion"
/* .line 10 */
/* .local v2, "className":Ljava/lang/String; */
final String v5 = ""; // const-string v5, ""
/* .line 12 */
/* .local v5, "version":Ljava/lang/String; */
try { // :try_start_0
java.lang.Class .forName ( v2 );
/* .line 13 */
/* .local v1, "c":Ljava/lang/Class; */
final String v6 = "apiVersion"; // const-string v6, "apiVersion"
(( java.lang.Class ) v1 ).getField ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 14 */
/* .local v4, "f":Ljava/lang/reflect/Field; */
int v6 = 0; // const/4 v6, 0x0
(( java.lang.reflect.Field ) v4 ).get ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* move-object v0, v6 */
/* check-cast v0, Ljava/lang/String; */
/* move-object v5, v0 */
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_4 */
/* .line 31 */
} // .end local v1 # "c":Ljava/lang/Class;
} // .end local v4 # "f":Ljava/lang/reflect/Field;
} // :goto_0
/* .line 15 */
/* :catch_0 */
/* move-exception v3 */
/* .line 17 */
/* .local v3, "e":Ljava/lang/ClassNotFoundException; */
(( java.lang.ClassNotFoundException ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/ClassNotFoundException;->printStackTrace()V
/* .line 18 */
} // .end local v3 # "e":Ljava/lang/ClassNotFoundException;
/* :catch_1 */
/* move-exception v3 */
/* .line 20 */
/* .local v3, "e":Ljava/lang/SecurityException; */
(( java.lang.SecurityException ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/SecurityException;->printStackTrace()V
/* .line 21 */
} // .end local v3 # "e":Ljava/lang/SecurityException;
/* :catch_2 */
/* move-exception v3 */
/* .line 23 */
/* .local v3, "e":Ljava/lang/NoSuchFieldException; */
(( java.lang.NoSuchFieldException ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/NoSuchFieldException;->printStackTrace()V
/* .line 24 */
} // .end local v3 # "e":Ljava/lang/NoSuchFieldException;
/* :catch_3 */
/* move-exception v3 */
/* .line 26 */
/* .local v3, "e":Ljava/lang/IllegalArgumentException; */
(( java.lang.IllegalArgumentException ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
/* .line 27 */
} // .end local v3 # "e":Ljava/lang/IllegalArgumentException;
/* :catch_4 */
/* move-exception v3 */
/* .line 29 */
/* .local v3, "e":Ljava/lang/IllegalAccessException; */
(( java.lang.IllegalAccessException ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/IllegalAccessException;->printStackTrace()V
} // .end method
