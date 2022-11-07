class com.jumptap.adtag.activity.JTVideoActivity$4 implements java.lang.Runnable {
	 /* .source "JTVideoActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/activity/JTVideoActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.activity.JTVideoActivity this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.activity.JTVideoActivity$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 225 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 228 */
v2 = this.this$0;
(( com.jumptap.adtag.activity.JTVideoActivity ) v2 ).getWindowManager ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/activity/JTVideoActivity;->getWindowManager()Landroid/view/WindowManager;
/* .line 229 */
/* .local v0, "display":Landroid/view/Display; */
v1 = (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
/* .line 231 */
/* .local v1, "width":I */
v2 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$100 ( v2 );
/* div-int/lit8 v3, v1, 0x2 */
/* iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I */
/* .line 232 */
v2 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$200 ( v2 );
v3 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$100 ( v3 );
(( android.widget.Button ) v2 ).setLayoutParams ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 233 */
v2 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$200 ( v2 );
(( android.widget.Button ) v2 ).requestLayout ( ); // invoke-virtual {v2}, Landroid/widget/Button;->requestLayout()V
/* .line 235 */
v2 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$300 ( v2 );
/* div-int/lit8 v3, v1, 0x2 */
/* iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I */
/* .line 236 */
v2 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$400 ( v2 );
v3 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$300 ( v3 );
(( android.widget.Button ) v2 ).setLayoutParams ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 237 */
v2 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$400 ( v2 );
(( android.widget.Button ) v2 ).requestLayout ( ); // invoke-virtual {v2}, Landroid/widget/Button;->requestLayout()V
/* .line 238 */
return;
} // .end method
