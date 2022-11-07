class com.mobfox.video.sdk.NavIcon$1$1 implements java.lang.Runnable {
	 /* .source "NavIcon.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/NavIcon$1;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.NavIcon$1 this$1; //synthetic
private final android.graphics.drawable.Drawable val$image; //synthetic
private final android.widget.ImageView val$v; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.NavIcon$1$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
this.val$v = p2;
this.val$image = p3;
/* .line 79 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 83 */
v0 = this.val$v;
v1 = this.val$image;
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 84 */
v0 = this.val$v;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 85 */
v0 = this.val$v;
(( android.widget.ImageView ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->requestLayout()V
/* .line 86 */
return;
} // .end method
