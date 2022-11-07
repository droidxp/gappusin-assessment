class com.mobfox.video.sdk.MobFoxRichMediaActivity$InterstitialAutocloseTask$1 implements java.lang.Runnable {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxRichMediaActivity$InterstitialAutocloseTask this$1; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxRichMediaActivity$InterstitialAutocloseTask$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* .line 1156 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1175 */
v0 = this.this$1;
com.mobfox.video.sdk.MobFoxRichMediaActivity$InterstitialAutocloseTask .access$0 ( v0 );
int v1 = -1; // const/4 v1, -0x1
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).setResult ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setResult(I)V
/* .line 1176 */
v0 = this.this$1;
com.mobfox.video.sdk.MobFoxRichMediaActivity$InterstitialAutocloseTask .access$0 ( v0 );
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->finish()V
/* .line 1177 */
return;
} // .end method
