class com.mobfox.video.sdk.NavIcon$1 implements java.lang.Runnable {
	 /* .source "NavIcon.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/NavIcon;->setImageDrawable(Landroid/widget/ImageView;Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.NavIcon this$0; //synthetic
private final java.lang.String val$url; //synthetic
private final android.widget.ImageView val$v; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.NavIcon$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$url = p2;
this.val$v = p3;
/* .line 73 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 77 */
v1 = this.this$0;
v2 = this.val$url;
com.mobfox.video.sdk.NavIcon .access$0 ( v1,v2 );
/* .line 78 */
/* .local v0, "image":Landroid/graphics/drawable/Drawable; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 79 */
	 v1 = this.this$0;
	 com.mobfox.video.sdk.NavIcon .access$1 ( v1 );
	 /* new-instance v2, Lcom/mobfox/video/sdk/NavIcon$1$1; */
	 v3 = this.val$v;
	 /* invoke-direct {v2, p0, v3, v0}, Lcom/mobfox/video/sdk/NavIcon$1$1;-><init>(Lcom/mobfox/video/sdk/NavIcon$1;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V */
	 (( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 /* .line 89 */
} // :cond_0
return;
} // .end method
