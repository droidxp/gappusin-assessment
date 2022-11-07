class com.mobfox.video.sdk.MobFoxRichMediaActivity$VideoTimeoutTask$1 implements java.lang.Runnable {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxRichMediaActivity$VideoTimeoutTask this$1; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxRichMediaActivity$VideoTimeoutTask$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* .line 1132 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1136 */
v0 = this.this$1;
com.mobfox.video.sdk.MobFoxRichMediaActivity$VideoTimeoutTask .access$0 ( v0 );
(( android.app.Activity ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finish()V
/* .line 1137 */
return;
} // .end method
