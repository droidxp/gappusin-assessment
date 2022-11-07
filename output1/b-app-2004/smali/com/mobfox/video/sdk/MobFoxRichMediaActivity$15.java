class com.mobfox.video.sdk.MobFoxRichMediaActivity$15 implements android.view.View$OnClickListener {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxRichMediaActivity$15 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 1027 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 1031 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1032 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "###########TRACKING SKIP INTERSTITIAL"; // const-string v1, "###########TRACKING SKIP INTERSTITIAL"
	 android.util.Log .v ( v0,v1 );
	 /* .line 1049 */
} // :cond_0
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$13 ( v0,v1 );
/* .line 1050 */
v0 = this.this$0;
int v1 = -1; // const/4 v1, -0x1
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).setResult ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->setResult(I)V
/* .line 1051 */
v0 = this.this$0;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->finish()V
/* .line 1052 */
return;
} // .end method
