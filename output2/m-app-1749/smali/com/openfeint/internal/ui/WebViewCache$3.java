class com.openfeint.internal.ui.WebViewCache$3 extends android.os.Handler {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache;-><init>(Landroid/content/Context;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebViewCache this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 402 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void dispatchMessage ( android.os.Message p0 ) {
/* .locals 5 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 409 */
/* iget v0, p1, Landroid/os/Message;->what:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 426 */
} // :goto_0
return;
/* .line 411 */
/* :pswitch_0 */
final String v0 = "WebViewCache"; // const-string v0, "WebViewCache"
final String v1 = "kServerManifestReady"; // const-string v1, "kServerManifestReady"
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 412 */
v1 = this.this$0;
v0 = this.obj;
/* check-cast v0, Lcom/openfeint/internal/ui/WebViewCache$ManifestData; */
this.serverManifest = v0;
/* .line 413 */
v0 = this.this$0;
com.openfeint.internal.ui.WebViewCache .access$300 ( v0 );
/* .line 416 */
/* :pswitch_1 */
v3 = this.this$0;
v0 = this.obj;
/* check-cast v0, Ljava/lang/String; */
/* iget v4, p1, Landroid/os/Message;->arg1:I */
/* if-lez v4, :cond_0 */
} // :goto_1
com.openfeint.internal.ui.WebViewCache .access$400 ( v3,v0,v1 );
} // :cond_0
/* move v1, v2 */
/* .line 419 */
/* :pswitch_2 */
v3 = this.this$0;
v0 = this.obj;
/* check-cast v0, Ljava/util/Set; */
/* iget v4, p1, Landroid/os/Message;->arg1:I */
/* if-lez v4, :cond_1 */
} // :goto_2
com.openfeint.internal.ui.WebViewCache .access$500 ( v3,v0,v1 );
} // :cond_1
/* move v1, v2 */
/* .line 422 */
/* :pswitch_3 */
v1 = this.this$0;
v0 = this.obj;
/* check-cast v0, Ljava/util/Map; */
this.clientManifest = v0;
/* .line 423 */
v0 = this.this$0;
com.openfeint.internal.ui.WebViewCache .access$300 ( v0 );
/* .line 409 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
