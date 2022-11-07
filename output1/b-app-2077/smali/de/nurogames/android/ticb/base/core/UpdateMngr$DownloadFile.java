class de.nurogames.android.ticb.base.core.UpdateMngr$DownloadFile extends android.os.AsyncTask {
	 /* .source "UpdateMngr.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/core/UpdateMngr; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "DownloadFile" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.core.UpdateMngr this$0; //synthetic
/* # direct methods */
private de.nurogames.android.ticb.base.core.UpdateMngr$DownloadFile ( ) {
/* .locals 0 */
/* .prologue */
/* .line 143 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
return;
} // .end method
 de.nurogames.android.ticb.base.core.UpdateMngr$DownloadFile ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 143 */
/* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile;-><init>(Lde/nurogames/android/ticb/base/core/UpdateMngr;)V */
return;
} // .end method
/* # virtual methods */
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/String; */
(( de.nurogames.android.ticb.base.core.UpdateMngr$DownloadFile ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
} // .end method
protected java.lang.String doInBackground ( java.lang.String...p0 ) {
/* .locals 20 */
/* .param p1, "url" # [Ljava/lang/String; */
/* .prologue */
/* .line 152 */
try { // :try_start_0
/* new-instance v5, Ljava/net/URL; */
int v14 = 0; // const/4 v14, 0x0
/* aget-object v14, p1, v14 */
/* invoke-direct {v5, v14}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 153 */
/* .local v5, "dl_url":Ljava/net/URL; */
(( java.net.URL ) v5 ).openConnection ( ); // invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 155 */
/* .local v2, "conexion":Ljava/net/URLConnection; */
final String v13 = "telebee:tBeElEeBbEeE1B9E5E%"; // const-string v13, "telebee:tBeElEeBbEeE1B9E5E%"
/* .line 156 */
/* .local v13, "uandp":Ljava/lang/String; */
de.nurogames.android.ticb.base.core.UpdateMngr .base64Encode ( v13 );
/* .line 158 */
/* .local v6, "encoding":Ljava/lang/String; */
final String v14 = "Authorization"; // const-string v14, "Authorization"
/* new-instance v15, Ljava/lang/StringBuilder; */
final String v16 = "Basic "; // const-string v16, "Basic "
/* invoke-direct/range {v15 ..v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v15 ).append ( v6 ); // invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.net.URLConnection ) v2 ).setRequestProperty ( v14, v15 ); // invoke-virtual {v2, v14, v15}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 159 */
/* const/16 v14, 0xc8 */
(( java.net.URLConnection ) v2 ).setConnectTimeout ( v14 ); // invoke-virtual {v2, v14}, Ljava/net/URLConnection;->setConnectTimeout(I)V
/* .line 161 */
(( java.net.URLConnection ) v2 ).connect ( ); // invoke-virtual {v2}, Ljava/net/URLConnection;->connect()V
/* .line 164 */
v9 = (( java.net.URLConnection ) v2 ).getContentLength ( ); // invoke-virtual {v2}, Ljava/net/URLConnection;->getContentLength()I
/* .line 167 */
/* .local v9, "lenghtOfFile":I */
/* new-instance v7, Ljava/io/BufferedInputStream; */
(( java.net.URLConnection ) v2 ).getInputStream ( ); // invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
/* invoke-direct {v7, v14}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 168 */
/* .local v7, "input":Ljava/io/InputStream; */
/* new-instance v10, Ljava/io/FileOutputStream; */
/* new-instance v14, Ljava/lang/StringBuilder; */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v15 ).getPath ( ); // invoke-virtual {v15}, Ljava/io/File;->getPath()Ljava/lang/String;
java.lang.String .valueOf ( v15 );
/* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v15 = "/tinybee_update.apk"; // const-string v15, "/tinybee_update.apk"
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v10, v14}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V */
/* .line 170 */
/* .local v10, "output":Ljava/io/OutputStream; */
/* const/16 v14, 0x1000 */
/* new-array v4, v14, [B */
/* .line 172 */
/* .local v4, "data":[B */
/* const-wide/16 v11, 0x0 */
/* .line 174 */
/* .local v11, "total":J */
} // :goto_0
v3 = (( java.io.InputStream ) v7 ).read ( v4 ); // invoke-virtual {v7, v4}, Ljava/io/InputStream;->read([B)I
/* .local v3, "count":I */
int v14 = -1; // const/4 v14, -0x1
/* if-ne v3, v14, :cond_0 */
/* .line 182 */
(( java.io.OutputStream ) v10 ).flush ( ); // invoke-virtual {v10}, Ljava/io/OutputStream;->flush()V
/* .line 183 */
(( java.io.OutputStream ) v10 ).close ( ); // invoke-virtual {v10}, Ljava/io/OutputStream;->close()V
/* .line 184 */
(( java.io.InputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->close()V
/* .line 186 */
java.lang.Integer .valueOf ( v9 );
/* move-object/from16 v0, p0 */
(( de.nurogames.android.ticb.base.core.UpdateMngr$DownloadFile ) v0 ).onPostExecute ( v14 ); // invoke-virtual {v0, v14}, Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile;->onPostExecute(Ljava/lang/Integer;)V
/* .line 192 */
} // .end local v2 # "conexion":Ljava/net/URLConnection;
} // .end local v3 # "count":I
} // .end local v4 # "data":[B
} // .end local v5 # "dl_url":Ljava/net/URL;
} // .end local v6 # "encoding":Ljava/lang/String;
} // .end local v7 # "input":Ljava/io/InputStream;
} // .end local v9 # "lenghtOfFile":I
} // .end local v10 # "output":Ljava/io/OutputStream;
} // .end local v11 # "total":J
} // .end local v13 # "uandp":Ljava/lang/String;
} // :goto_1
int v14 = 0; // const/4 v14, 0x0
/* .line 175 */
/* .restart local v2 # "conexion":Ljava/net/URLConnection; */
/* .restart local v3 # "count":I */
/* .restart local v4 # "data":[B */
/* .restart local v5 # "dl_url":Ljava/net/URL; */
/* .restart local v6 # "encoding":Ljava/lang/String; */
/* .restart local v7 # "input":Ljava/io/InputStream; */
/* .restart local v9 # "lenghtOfFile":I */
/* .restart local v10 # "output":Ljava/io/OutputStream; */
/* .restart local v11 # "total":J */
/* .restart local v13 # "uandp":Ljava/lang/String; */
} // :cond_0
/* int-to-long v14, v3 */
/* add-long/2addr v11, v14 */
/* .line 178 */
int v14 = 1; // const/4 v14, 0x1
/* new-array v14, v14, [Ljava/lang/Integer; */
int v15 = 0; // const/4 v15, 0x0
/* const-wide/16 v16, 0x64 */
/* mul-long v16, v16, v11 */
/* int-to-long v0, v9 */
/* move-wide/from16 v18, v0 */
/* div-long v16, v16, v18 */
/* move-wide/from16 v0, v16 */
/* long-to-int v0, v0 */
/* move/from16 v16, v0 */
/* invoke-static/range {v16 ..v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer; */
/* aput-object v16, v14, v15 */
/* move-object/from16 v0, p0 */
(( de.nurogames.android.ticb.base.core.UpdateMngr$DownloadFile ) v0 ).publishProgress ( v14 ); // invoke-virtual {v0, v14}, Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile;->publishProgress([Ljava/lang/Object;)V
/* .line 179 */
int v14 = 0; // const/4 v14, 0x0
(( java.io.OutputStream ) v10 ).write ( v4, v14, v3 ); // invoke-virtual {v10, v4, v14, v3}, Ljava/io/OutputStream;->write([BII)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 189 */
} // .end local v2 # "conexion":Ljava/net/URLConnection;
} // .end local v3 # "count":I
} // .end local v4 # "data":[B
} // .end local v5 # "dl_url":Ljava/net/URL;
} // .end local v6 # "encoding":Ljava/lang/String;
} // .end local v7 # "input":Ljava/io/InputStream;
} // .end local v9 # "lenghtOfFile":I
} // .end local v10 # "output":Ljava/io/OutputStream;
} // .end local v11 # "total":J
} // .end local v13 # "uandp":Ljava/lang/String;
/* :catch_0 */
/* move-exception v8 */
/* .local v8, "ioe":Ljava/io/IOException; */
/* move-object/from16 v0, p0 */
v14 = this.this$0;
v14 = this.mProgressDialog;
(( android.app.ProgressDialog ) v14 ).dismiss ( ); // invoke-virtual {v14}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 190 */
} // .end local v8 # "ioe":Ljava/io/IOException;
/* :catch_1 */
/* move-exception v14 */
} // .end method
protected void onPostExecute ( java.lang.Integer p0 ) {
/* .locals 4 */
/* .param p1, "bytes_loaded" # Ljava/lang/Integer; */
/* .prologue */
/* .line 206 */
v2 = this.this$0;
v2 = this.mProgressDialog;
(( android.app.ProgressDialog ) v2 ).dismiss ( ); // invoke-virtual {v2}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 208 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
android.os.Environment .getExternalStorageDirectory ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "/tinybee_update.apk"; // const-string v3, "/tinybee_update.apk"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 209 */
/* .local v0, "fileName":Ljava/lang/String; */
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 210 */
/* .local v1, "intent":Landroid/content/Intent; */
/* new-instance v2, Ljava/io/File; */
/* invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
android.net.Uri .fromFile ( v2 );
final String v3 = "application/vnd.android.package-archive"; // const-string v3, "application/vnd.android.package-archive"
(( android.content.Intent ) v1 ).setDataAndType ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
/* .line 211 */
v2 = this.this$0;
de.nurogames.android.ticb.base.core.UpdateMngr .access$0 ( v2 );
(( android.app.Activity ) v2 ).startActivity ( v1 ); // invoke-virtual {v2, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 213 */
return;
} // .end method
protected void onProgressUpdate ( java.lang.Integer...p0 ) {
/* .locals 2 */
/* .param p1, "progress" # [Ljava/lang/Integer; */
/* .prologue */
/* .line 199 */
v0 = this.this$0;
v0 = this.mProgressDialog;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v1, p1, v1 */
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( android.app.ProgressDialog ) v0 ).setProgress ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgress(I)V
/* .line 200 */
return;
} // .end method
protected void onProgressUpdate ( java.lang.Object...p0 ) { //bridge//synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/Integer; */
(( de.nurogames.android.ticb.base.core.UpdateMngr$DownloadFile ) p0 ).onProgressUpdate ( p1 ); // invoke-virtual {p0, p1}, Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile;->onProgressUpdate([Ljava/lang/Integer;)V
return;
} // .end method
