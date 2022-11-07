public class com.balloonisland.hfxw.OpeningActivity extends android.app.Activity {
	 /* .source "OpeningActivity.java" */
	 /* # instance fields */
	 private Long splashDelay;
	 /* # direct methods */
	 public com.balloonisland.hfxw.OpeningActivity ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 14 */
		 /* const-wide/16 v0, 0x3e8 */
		 /* iput-wide v0, p0, Lcom/balloonisland/hfxw/OpeningActivity;->splashDelay:J */
		 /* .line 13 */
		 return;
	 } // .end method
	 private void CopyAssets ( ) {
		 /* .locals 14 */
		 /* .prologue */
		 /* .line 39 */
		 (( com.balloonisland.hfxw.OpeningActivity ) p0 ).getAssets ( ); // invoke-virtual {p0}, Lcom/balloonisland/hfxw/OpeningActivity;->getAssets()Landroid/content/res/AssetManager;
		 /* .line 40 */
		 /* .local v0, "assetManager":Landroid/content/res/AssetManager; */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 41 */
		 /* .local v3, "files":[Ljava/lang/String; */
		 (( com.balloonisland.hfxw.OpeningActivity ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Lcom/balloonisland/hfxw/OpeningActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v8 = this.packageName;
		 /* .line 43 */
		 /* .local v8, "packageName":Ljava/lang/String; */
		 try { // :try_start_0
			 final String v9 = ""; // const-string v9, ""
			 (( android.content.res.AssetManager ) v0 ).list ( v9 ); // invoke-virtual {v0, v9}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 47 */
		 } // :goto_0
		 /* array-length v10, v3 */
		 int v9 = 0; // const/4 v9, 0x0
	 } // :goto_1
	 /* if-lt v9, v10, :cond_0 */
	 /* .line 75 */
	 return;
	 /* .line 44 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 45 */
	 /* .local v1, "e":Ljava/io/IOException; */
	 final String v9 = "tag"; // const-string v9, "tag"
	 (( java.io.IOException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
	 android.util.Log .e ( v9,v10 );
	 /* .line 47 */
} // .end local v1 # "e":Ljava/io/IOException;
} // :cond_0
/* aget-object v2, v3, v9 */
/* .line 48 */
/* .local v2, "filename":Ljava/lang/String; */
final String v11 = ".mp3"; // const-string v11, ".mp3"
v11 = (( java.lang.String ) v2 ).contains ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v11 != null) { // if-eqz v11, :cond_1
/* .line 49 */
/* new-instance v11, Ljava/lang/StringBuilder; */
final String v12 = "/data/data/"; // const-string v12, "/data/data/"
/* invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v11 ).append ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v12 = "/"; // const-string v12, "/"
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).append ( v2 ); // invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 50 */
/* .local v7, "outputfilename":Ljava/lang/String; */
/* new-instance v11, Ljava/io/File; */
/* invoke-direct {v11, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v11 = (( java.io.File ) v11 ).exists ( ); // invoke-virtual {v11}, Ljava/io/File;->exists()Z
if ( v11 != null) { // if-eqz v11, :cond_2
	 /* .line 53 */
	 final String v11 = "CopyAsset"; // const-string v11, "CopyAsset"
	 /* new-instance v12, Ljava/lang/StringBuilder; */
	 final String v13 = "No need to copy file - "; // const-string v13, "No need to copy file - "
	 /* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v12 ).append ( v7 ); // invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .e ( v11,v12 );
	 /* .line 47 */
} // .end local v7 # "outputfilename":Ljava/lang/String;
} // :cond_1
} // :goto_2
/* add-int/lit8 v9, v9, 0x1 */
/* .line 57 */
/* .restart local v7 # "outputfilename":Ljava/lang/String; */
} // :cond_2
final String v11 = "CopyAsset"; // const-string v11, "CopyAsset"
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Copying file - "; // const-string v13, "Copying file - "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v12 ).append ( v7 ); // invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v11,v12 );
/* .line 58 */
int v4 = 0; // const/4 v4, 0x0
/* .line 59 */
/* .local v4, "in":Ljava/io/InputStream; */
int v5 = 0; // const/4 v5, 0x0
/* .line 61 */
/* .local v5, "out":Ljava/io/OutputStream; */
try { // :try_start_1
(( android.content.res.AssetManager ) v0 ).open ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 62 */
/* new-instance v6, Ljava/io/FileOutputStream; */
/* invoke-direct {v6, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 63 */
} // .end local v5 # "out":Ljava/io/OutputStream;
/* .local v6, "out":Ljava/io/OutputStream; */
try { // :try_start_2
/* invoke-direct {p0, v4, v6}, Lcom/balloonisland/hfxw/OpeningActivity;->copyFile(Ljava/io/InputStream;Ljava/io/OutputStream;)V */
/* .line 64 */
(( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
/* .line 65 */
int v4 = 0; // const/4 v4, 0x0
/* .line 66 */
(( java.io.OutputStream ) v6 ).flush ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V
/* .line 67 */
(( java.io.OutputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* .line 68 */
int v5 = 0; // const/4 v5, 0x0
} // .end local v6 # "out":Ljava/io/OutputStream;
/* .restart local v5 # "out":Ljava/io/OutputStream; */
/* .line 69 */
/* :catch_1 */
/* move-exception v1 */
/* .line 70 */
/* .local v1, "e":Ljava/lang/Exception; */
} // :goto_3
final String v11 = "tag"; // const-string v11, "tag"
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
android.util.Log .e ( v11,v12 );
/* .line 69 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // .end local v5 # "out":Ljava/io/OutputStream;
/* .restart local v6 # "out":Ljava/io/OutputStream; */
/* :catch_2 */
/* move-exception v1 */
/* move-object v5, v6 */
} // .end local v6 # "out":Ljava/io/OutputStream;
/* .restart local v5 # "out":Ljava/io/OutputStream; */
} // .end method
static void access$0 ( com.balloonisland.hfxw.OpeningActivity p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 38 */
/* invoke-direct {p0}, Lcom/balloonisland/hfxw/OpeningActivity;->CopyAssets()V */
return;
} // .end method
private void copyFile ( java.io.InputStream p0, java.io.OutputStream p1 ) {
/* .locals 3 */
/* .param p1, "in" # Ljava/io/InputStream; */
/* .param p2, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 77 */
/* const/16 v2, 0x400 */
/* new-array v0, v2, [B */
/* .line 79 */
/* .local v0, "buffer":[B */
} // :goto_0
v1 = (( java.io.InputStream ) p1 ).read ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I
/* .local v1, "read":I */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_0 */
/* .line 82 */
return;
/* .line 80 */
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
(( java.io.OutputStream ) p2 ).write ( v0, v2, v1 ); // invoke-virtual {p2, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V
} // .end method
/* # virtual methods */
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 4 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 18 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 19 */
/* const v2, 0x7f030001 */
(( com.balloonisland.hfxw.OpeningActivity ) p0 ).setContentView ( v2 ); // invoke-virtual {p0, v2}, Lcom/balloonisland/hfxw/OpeningActivity;->setContentView(I)V
/* .line 20 */
/* new-instance v0, Lcom/balloonisland/hfxw/OpeningActivity$1; */
/* invoke-direct {v0, p0}, Lcom/balloonisland/hfxw/OpeningActivity$1;-><init>(Lcom/balloonisland/hfxw/OpeningActivity;)V */
/* .line 32 */
/* .local v0, "task":Ljava/util/TimerTask; */
/* new-instance v1, Ljava/util/Timer; */
/* invoke-direct {v1}, Ljava/util/Timer;-><init>()V */
/* .line 33 */
/* .local v1, "timer":Ljava/util/Timer; */
/* iget-wide v2, p0, Lcom/balloonisland/hfxw/OpeningActivity;->splashDelay:J */
(( java.util.Timer ) v1 ).schedule ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 35 */
return;
} // .end method
