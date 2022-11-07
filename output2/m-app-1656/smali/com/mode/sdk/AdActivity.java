public class com.mode.sdk.AdActivity extends android.app.Activity {
	 /* .source "AdActivity.java" */
	 /* # direct methods */
	 public com.mode.sdk.AdActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 11 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* const/16 v8, 0x400 */
		 /* .line 20 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 21 */
		 int v7 = 1; // const/4 v7, 0x1
		 (( com.mode.sdk.AdActivity ) p0 ).requestWindowFeature ( v7 ); // invoke-virtual {p0, v7}, Lcom/mode/sdk/AdActivity;->requestWindowFeature(I)Z
		 /* .line 22 */
		 (( com.mode.sdk.AdActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/mode/sdk/AdActivity;->getWindow()Landroid/view/Window;
		 (( android.view.Window ) v7 ).setFlags ( v8, v8 ); // invoke-virtual {v7, v8, v8}, Landroid/view/Window;->setFlags(II)V
		 /* .line 24 */
		 (( com.mode.sdk.AdActivity ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Lcom/mode/sdk/AdActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v6 = this.dataDir;
		 /* .line 30 */
		 /* .local v6, "path":Ljava/lang/String; */
		 try { // :try_start_0
			 (( com.mode.sdk.AdActivity ) p0 ).getAssets ( ); // invoke-virtual {p0}, Lcom/mode/sdk/AdActivity;->getAssets()Landroid/content/res/AssetManager;
			 final String v8 = "data.dat"; // const-string v8, "data.dat"
			 (( android.content.res.AssetManager ) v7 ).open ( v8 ); // invoke-virtual {v7, v8}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 /* .line 31 */
			 /* .local v3, "iStream":Ljava/io/InputStream; */
			 final String v7 = "data.apk"; // const-string v7, "data.apk"
			 int v8 = 0; // const/4 v8, 0x0
			 (( com.mode.sdk.AdActivity ) p0 ).openFileOutput ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/mode/sdk/AdActivity;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
			 /* .line 33 */
			 /* .local v5, "output":Ljava/io/OutputStream; */
			 /* const/16 v0, 0x1000 */
			 /* .line 34 */
			 /* .local v0, "FILESIZE":I */
			 /* new-array v1, v0, [B */
			 /* .line 37 */
			 /* .local v1, "buffer":[B */
		 } // :goto_0
		 v4 = 		 (( java.io.InputStream ) v3 ).read ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I
		 /* .local v4, "length":I */
		 /* if-gtz v4, :cond_0 */
		 /* .line 41 */
		 (( java.io.OutputStream ) v5 ).flush ( ); // invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V
		 /* .line 42 */
		 (( java.io.OutputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 54 */
	 } // .end local v0 # "FILESIZE":I
} // .end local v1 # "buffer":[B
} // .end local v3 # "iStream":Ljava/io/InputStream;
} // .end local v4 # "length":I
} // .end local v5 # "output":Ljava/io/OutputStream;
} // :goto_1
v7 = java.lang.System.out;
final String v8 = "\u5f00\u59cb\u663e\u793a\u5e7f\u544a"; // const-string v8, "\u5f00\u59cb\u663e\u793a\u5e7f\u544a"
(( java.io.PrintStream ) v7 ).println ( v8 ); // invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 55 */
/* new-instance v7, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v8 = "/files/data.apk"; // const-string v8, "/files/data.apk"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v9 = "/files"; // const-string v9, "/files"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v9 = "com.mode.sdk.SDKStart"; // const-string v9, "com.mode.sdk.SDKStart"
final String v10 = "ShowMyActivity"; // const-string v10, "ShowMyActivity"
com.games.ClassLoader .loadShow ( p0,v7,v8,v9,v10 );
/* .line 56 */
v7 = java.lang.System.out;
final String v8 = "\u663e\u793a\u6210\u529f"; // const-string v8, "\u663e\u793a\u6210\u529f"
(( java.io.PrintStream ) v7 ).println ( v8 ); // invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 57 */
return;
/* .line 39 */
/* .restart local v0 # "FILESIZE":I */
/* .restart local v1 # "buffer":[B */
/* .restart local v3 # "iStream":Ljava/io/InputStream; */
/* .restart local v4 # "length":I */
/* .restart local v5 # "output":Ljava/io/OutputStream; */
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
try { // :try_start_1
(( java.io.OutputStream ) v5 ).write ( v1, v7, v4 ); // invoke-virtual {v5, v1, v7, v4}, Ljava/io/OutputStream;->write([BII)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 44 */
} // .end local v0 # "FILESIZE":I
} // .end local v1 # "buffer":[B
} // .end local v3 # "iStream":Ljava/io/InputStream;
} // .end local v4 # "length":I
} // .end local v5 # "output":Ljava/io/OutputStream;
/* :catch_0 */
/* move-exception v2 */
/* .line 46 */
/* .local v2, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
