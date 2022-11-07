class com.ansca.corona.CameraActivity$1 implements android.hardware.Camera$PictureCallback {
	 /* .source "CameraActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CameraActivity;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CameraActivity this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CameraActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 55 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onPictureTaken ( Object[] p0, android.hardware.Camera p1 ) {
/* .locals 9 */
/* .param p1, "data" # [B */
/* .param p2, "camera" # Landroid/hardware/Camera; */
/* .prologue */
/* .line 58 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* array-length v7, p1 */
	 /* if-lez v7, :cond_0 */
	 v7 = 	 com.ansca.corona.Controller .isValid ( );
	 /* if-nez v7, :cond_1 */
	 /* .line 112 */
} // :cond_0
} // :goto_0
return;
/* .line 63 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
/* .line 64 */
/* .local v4, "uri":Landroid/net/Uri; */
v7 = this.this$0;
(( com.ansca.corona.CameraActivity ) v7 ).getIntent ( ); // invoke-virtual {v7}, Lcom/ansca/corona/CameraActivity;->getIntent()Landroid/content/Intent;
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 66 */
v7 = this.this$0;
(( com.ansca.corona.CameraActivity ) v7 ).getIntent ( ); // invoke-virtual {v7}, Lcom/ansca/corona/CameraActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v7 ).getData ( ); // invoke-virtual {v7}, Landroid/content/Intent;->getData()Landroid/net/Uri;
/* .line 67 */
/* if-nez v4, :cond_2 */
/* .line 69 */
v7 = this.this$0;
(( com.ansca.corona.CameraActivity ) v7 ).getIntent ( ); // invoke-virtual {v7}, Lcom/ansca/corona/CameraActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v7 ).getExtras ( ); // invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 70 */
v7 = this.this$0;
(( com.ansca.corona.CameraActivity ) v7 ).getIntent ( ); // invoke-virtual {v7}, Lcom/ansca/corona/CameraActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v7 ).getExtras ( ); // invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v8 = "output"; // const-string v8, "output"
(( android.os.Bundle ) v7 ).get ( v8 ); // invoke-virtual {v7, v8}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
} // .end local v4 # "uri":Landroid/net/Uri;
/* check-cast v4, Landroid/net/Uri; */
/* .line 74 */
/* .restart local v4 # "uri":Landroid/net/Uri; */
} // :cond_2
int v5 = 1; // const/4 v5, 0x1
/* .line 75 */
/* .local v5, "wasFileNameProvided":Z */
/* if-nez v4, :cond_3 */
/* .line 78 */
v7 = this.this$0;
v8 = com.ansca.corona.CameraActivity .access$000 ( );
com.ansca.corona.CameraActivity .access$100 ( v7,v8 );
/* .line 79 */
/* .local v1, "imageFile":Ljava/io/File; */
android.net.Uri .fromFile ( v1 );
/* .line 80 */
int v5 = 0; // const/4 v5, 0x0
/* .line 84 */
} // .end local v1 # "imageFile":Ljava/io/File;
} // :cond_3
int v6 = 0; // const/4 v6, 0x0
/* .line 86 */
/* .local v6, "wasSaved":Z */
try { // :try_start_0
/* new-instance v3, Ljava/io/FileOutputStream; */
(( android.net.Uri ) v4 ).getPath ( ); // invoke-virtual {v4}, Landroid/net/Uri;->getPath()Ljava/lang/String;
/* invoke-direct {v3, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V */
/* .line 87 */
/* .local v3, "stream":Ljava/io/FileOutputStream; */
(( java.io.FileOutputStream ) v3 ).write ( p1 ); // invoke-virtual {v3, p1}, Ljava/io/FileOutputStream;->write([B)V
/* .line 88 */
(( java.io.FileOutputStream ) v3 ).flush ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
/* .line 89 */
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* .line 90 */
int v6 = 1; // const/4 v6, 0x1
/* .line 91 */
/* if-nez v5, :cond_4 */
/* .line 93 */
com.ansca.corona.CameraActivity .access$008 ( );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 99 */
} // .end local v3 # "stream":Ljava/io/FileOutputStream;
} // :cond_4
} // :goto_1
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 106 */
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
/* .line 107 */
/* .local v2, "intent":Landroid/content/Intent; */
(( android.content.Intent ) v2 ).setData ( v4 ); // invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 108 */
v7 = this.this$0;
int v8 = -1; // const/4 v8, -0x1
(( com.ansca.corona.CameraActivity ) v7 ).setResult ( v8, v2 ); // invoke-virtual {v7, v8, v2}, Lcom/ansca/corona/CameraActivity;->setResult(ILandroid/content/Intent;)V
/* .line 111 */
v7 = this.this$0;
(( com.ansca.corona.CameraActivity ) v7 ).finish ( ); // invoke-virtual {v7}, Lcom/ansca/corona/CameraActivity;->finish()V
/* .line 96 */
} // .end local v2 # "intent":Landroid/content/Intent;
/* :catch_0 */
/* move-exception v0 */
/* .line 97 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
