class com.mobfox.video.sdk.MobFoxRichMediaActivity$VideoTimeoutTask extends java.util.TimerTask {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "VideoTimeoutTask" */
} // .end annotation
/* # instance fields */
private final android.app.Activity mActivity;
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
public com.mobfox.video.sdk.MobFoxRichMediaActivity$VideoTimeoutTask ( ) {
/* .locals 0 */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .prologue */
/* .line 1123 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
/* .line 1124 */
this.mActivity = p2;
/* .line 1125 */
return;
} // .end method
static android.app.Activity access$0 ( com.mobfox.video.sdk.MobFoxRichMediaActivity$VideoTimeoutTask p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1121 */
v0 = this.mActivity;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1129 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1130 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "###########TRACKING VIDEO TIMEOUT"; // const-string v1, "###########TRACKING VIDEO TIMEOUT"
	 android.util.Log .v ( v0,v1 );
	 /* .line 1132 */
} // :cond_0
v0 = this.mActivity;
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask$1; */
/* invoke-direct {v1, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask$1;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$VideoTimeoutTask;)V */
(( android.app.Activity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1139 */
return;
} // .end method
