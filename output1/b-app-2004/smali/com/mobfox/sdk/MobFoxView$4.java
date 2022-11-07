class com.mobfox.sdk.MobFoxView$4 extends android.webkit.WebView {
	 /* .source "MobFoxView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/sdk/MobFoxView;->createWebView(Landroid/content/Context;)Landroid/webkit/WebView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.sdk.MobFoxView this$0; //synthetic
/* # direct methods */
 com.mobfox.sdk.MobFoxView$4 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Landroid/content/Context; */
/* .prologue */
/* .line 285 */
this.this$0 = p1;
/* invoke-direct {p0, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
return;
} // .end method
/* # virtual methods */
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 289 */
v0 = (( com.mobfox.sdk.MobFoxView$4 ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView$4;->getWidth()I
/* if-lez v0, :cond_0 */
v0 = (( com.mobfox.sdk.MobFoxView$4 ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView$4;->getHeight()I
/* if-lez v0, :cond_0 */
/* .line 290 */
/* invoke-super {p0, p1}, Landroid/webkit/WebView;->draw(Landroid/graphics/Canvas;)V */
/* .line 292 */
} // :cond_0
return;
} // .end method
