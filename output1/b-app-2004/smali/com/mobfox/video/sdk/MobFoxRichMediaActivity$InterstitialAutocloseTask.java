class com.mobfox.video.sdk.MobFoxRichMediaActivity$InterstitialAutocloseTask extends java.util.TimerTask {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "InterstitialAutocloseTask" */
} // .end annotation
/* # instance fields */
private final android.app.Activity mActivity;
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
public com.mobfox.video.sdk.MobFoxRichMediaActivity$InterstitialAutocloseTask ( ) {
/* .locals 0 */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .prologue */
/* .line 1146 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
/* .line 1147 */
this.mActivity = p2;
/* .line 1148 */
return;
} // .end method
static com.mobfox.video.sdk.MobFoxRichMediaActivity access$0 ( com.mobfox.video.sdk.MobFoxRichMediaActivity$InterstitialAutocloseTask p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1142 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1152 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1153 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "###########TRACKING INTERSTITIAL AUTOCLOSE"; // const-string v1, "###########TRACKING INTERSTITIAL AUTOCLOSE"
	 android.util.Log .v ( v0,v1 );
	 /* .line 1155 */
} // :cond_0
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$13 ( v0,v1 );
/* .line 1156 */
v0 = this.mActivity;
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask$1; */
/* invoke-direct {v1, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask$1;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$InterstitialAutocloseTask;)V */
(( android.app.Activity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1180 */
return;
} // .end method
