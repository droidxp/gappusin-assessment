class com.wiyun.engine.utils.ImagePickerActivity$4 extends android.view.OrientationEventListener {
	 /* .source "ImagePickerActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/utils/ImagePickerActivity;->onResume()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.utils.ImagePickerActivity this$0; //synthetic
/* # direct methods */
 com.wiyun.engine.utils.ImagePickerActivity$4 ( ) {
/* .locals 0 */
/* .param p2, "$anonymous0" # Landroid/content/Context; */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 245 */
/* invoke-direct {p0, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V */
return;
} // .end method
/* # virtual methods */
public void onOrientationChanged ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "orientation" # I */
/* .prologue */
/* .line 251 */
int v0 = -1; // const/4 v0, -0x1
/* if-eq p1, v0, :cond_0 */
/* .line 252 */
v0 = this.this$0;
com.wiyun.engine.utils.ImagePickerActivity .access$8 ( v0,p1 );
/* .line 254 */
} // :cond_0
return;
} // .end method
