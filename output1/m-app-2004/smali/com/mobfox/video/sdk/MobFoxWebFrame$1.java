class com.mobfox.video.sdk.MobFoxWebFrame$1 implements android.view.View$OnClickListener {
	 /* .source "MobFoxWebFrame.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxWebFrame;-><init>(Landroid/app/Activity;ZZZLcom/mobfox/video/sdk/ResourceManager;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxWebFrame this$0; //synthetic
private final android.app.Activity val$localContext; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxWebFrame$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$localContext = p2;
/* .line 75 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 1 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 80 */
v0 = this.val$localContext;
(( android.app.Activity ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finish()V
/* .line 81 */
return;
} // .end method
