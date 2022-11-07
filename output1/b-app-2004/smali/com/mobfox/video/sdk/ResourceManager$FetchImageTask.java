class com.mobfox.video.sdk.ResourceManager$FetchImageTask extends android.os.AsyncTask {
	 /* .source "ResourceManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/ResourceManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "FetchImageTask" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/Void;", */
/* "Ljava/lang/Void;", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
android.content.Context mContext;
Integer mResourceId;
java.lang.String mUrl;
final com.mobfox.video.sdk.ResourceManager this$0; //synthetic
/* # direct methods */
public com.mobfox.video.sdk.ResourceManager$FetchImageTask ( ) {
/* .locals 0 */
/* .param p2, "ctx" # Landroid/content/Context; */
/* .param p3, "url" # Ljava/lang/String; */
/* .param p4, "resId" # I */
/* .prologue */
/* .line 442 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
/* .line 443 */
this.mContext = p2;
/* .line 444 */
this.mUrl = p3;
/* .line 445 */
/* iput p4, p0, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask;->mResourceId:I */
/* .line 446 */
return;
} // .end method
private android.graphics.drawable.Drawable fetchImage ( java.lang.String p0 ) {
/* .locals 12 */
/* .param p1, "urlString" # Ljava/lang/String; */
/* .prologue */
/* .line 471 */
try { // :try_start_0
/* new-instance v7, Ljava/net/URL; */
/* invoke-direct {v7, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 472 */
/* .local v7, "url":Ljava/net/URL; */
(( java.net.URL ) v7 ).getContent ( ); // invoke-virtual {v7}, Ljava/net/URL;->getContent()Ljava/lang/Object;
/* check-cast v5, Ljava/io/InputStream; */
/* .line 473 */
/* .local v5, "is":Ljava/io/InputStream; */
android.graphics.BitmapFactory .decodeStream ( v5 );
/* .line 474 */
/* .local v0, "b":Landroid/graphics/Bitmap; */
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 475 */
	 v9 = this.mContext;
	 (( android.content.Context ) v9 ).getResources ( ); // invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 /* .line 476 */
	 (( android.content.res.Resources ) v9 ).getDisplayMetrics ( ); // invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* .line 477 */
	 /* .local v6, "m":Landroid/util/DisplayMetrics; */
	 v8 = 	 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
	 /* .line 478 */
	 /* .local v8, "w":I */
	 v2 = 	 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
	 /* .line 480 */
	 /* .local v2, "h":I */
	 int v9 = 1; // const/4 v9, 0x1
	 /* int-to-float v10, v8 */
	 /* .line 479 */
	 v9 = 	 android.util.TypedValue .applyDimension ( v9,v10,v6 );
	 /* float-to-int v4, v9 */
	 /* .line 482 */
	 /* .local v4, "imageWidth":I */
	 int v9 = 1; // const/4 v9, 0x1
	 /* int-to-float v10, v2 */
	 /* .line 481 */
	 v9 = 	 android.util.TypedValue .applyDimension ( v9,v10,v6 );
	 /* float-to-int v3, v9 */
	 /* .line 483 */
	 /* .local v3, "imageHeight":I */
	 /* if-ne v4, v8, :cond_0 */
	 /* if-eq v3, v2, :cond_1 */
	 /* .line 485 */
} // :cond_0
int v9 = 0; // const/4 v9, 0x0
/* .line 484 */
android.graphics.Bitmap .createScaledBitmap ( v0,v4,v3,v9 );
/* .line 487 */
} // :cond_1
/* new-instance v9, Landroid/graphics/drawable/BitmapDrawable; */
v10 = this.mContext;
(( android.content.Context ) v10 ).getResources ( ); // invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* invoke-direct {v9, v10, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 492 */
} // .end local v0 # "b":Landroid/graphics/Bitmap;
} // .end local v2 # "h":I
} // .end local v3 # "imageHeight":I
} // .end local v4 # "imageWidth":I
} // .end local v5 # "is":Ljava/io/InputStream;
} // .end local v6 # "m":Landroid/util/DisplayMetrics;
} // .end local v7 # "url":Ljava/net/URL;
} // .end local v8 # "w":I
} // :goto_0
/* .line 489 */
/* :catch_0 */
/* move-exception v1 */
/* .line 490 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
/* new-instance v10, Ljava/lang/StringBuilder; */
final String v11 = "Cannot fetch image:"; // const-string v11, "Cannot fetch image:"
/* invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v10 ).append ( p1 ); // invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v9,v10,v1 );
/* .line 492 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_2
int v9 = 0; // const/4 v9, 0x0
} // .end method
/* # virtual methods */
protected java.lang.Boolean doInBackground ( java.lang.Void...p0 ) {
/* .locals 3 */
/* .param p1, "params" # [Ljava/lang/Void; */
/* .prologue */
/* .line 458 */
int v0 = 0; // const/4 v0, 0x0
/* .line 459 */
/* .local v0, "d":Landroid/graphics/drawable/Drawable; */
v1 = this.mUrl;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.mUrl;
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_0 */
/* .line 460 */
v1 = this.mUrl;
/* invoke-direct {p0, v1}, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask;->fetchImage(Ljava/lang/String;)Landroid/graphics/drawable/Drawable; */
/* .line 462 */
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 463 */
v1 = this.this$0;
com.mobfox.video.sdk.ResourceManager .access$1 ( v1 );
/* iget v2, p0, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask;->mResourceId:I */
java.lang.Integer .valueOf ( v2 );
(( java.util.HashMap ) v1 ).put ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 464 */
int v1 = 1; // const/4 v1, 0x1
java.lang.Boolean .valueOf ( v1 );
/* .line 466 */
} // :goto_0
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
java.lang.Boolean .valueOf ( v1 );
} // .end method
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/Void; */
(( com.mobfox.video.sdk.ResourceManager$FetchImageTask ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
} // .end method
protected void onPostExecute ( java.lang.Boolean p0 ) {
/* .locals 5 */
/* .param p1, "result" # Ljava/lang/Boolean; */
/* .prologue */
/* .line 450 */
/* invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V */
/* .line 451 */
v1 = this.this$0;
com.mobfox.video.sdk.ResourceManager .access$0 ( v1 );
/* const/16 v2, 0x64 */
/* .line 452 */
/* iget v3, p0, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask;->mResourceId:I */
int v4 = 0; // const/4 v4, 0x0
/* .line 451 */
(( android.os.Handler ) v1 ).obtainMessage ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;
/* .line 453 */
/* .local v0, "msg":Landroid/os/Message; */
v1 = this.this$0;
com.mobfox.video.sdk.ResourceManager .access$0 ( v1 );
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 454 */
return;
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, Ljava/lang/Boolean; */
(( com.mobfox.video.sdk.ResourceManager$FetchImageTask ) p0 ).onPostExecute ( p1 ); // invoke-virtual {p0, p1}, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask;->onPostExecute(Ljava/lang/Boolean;)V
return;
} // .end method
