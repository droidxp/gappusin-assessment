class com.mobfox.sdk.MobFoxView$3 extends android.widget.ViewFlipper {
	 /* .source "MobFoxView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/sdk/MobFoxView;->initialize(Landroid/content/Context;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.sdk.MobFoxView this$0; //synthetic
/* # direct methods */
 com.mobfox.sdk.MobFoxView$3 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Landroid/content/Context; */
/* .prologue */
/* .line 243 */
this.this$0 = p1;
/* invoke-direct {p0, p2}, Landroid/widget/ViewFlipper;-><init>(Landroid/content/Context;)V */
return;
} // .end method
/* # virtual methods */
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .prologue */
/* .line 250 */
try { // :try_start_0
	 /* invoke-super {p0}, Landroid/widget/ViewFlipper;->onDetachedFromWindow()V */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 254 */
} // :goto_0
return;
/* .line 251 */
/* :catch_0 */
/* move-exception v0 */
/* .line 252 */
/* .local v0, "e":Ljava/lang/IllegalArgumentException; */
(( com.mobfox.sdk.MobFoxView$3 ) p0 ).stopFlipping ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView$3;->stopFlipping()V
} // .end method
