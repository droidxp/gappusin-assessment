class com.mobfox.video.sdk.MobFoxRichMediaActivity$CanSkipTask extends java.util.TimerTask {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "CanSkipTask" */
} // .end annotation
/* # instance fields */
private final com.mobfox.video.sdk.MobFoxRichMediaActivity mActivity;
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
public com.mobfox.video.sdk.MobFoxRichMediaActivity$CanSkipTask ( ) {
/* .locals 0 */
/* .param p2, "activity" # Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
/* .prologue */
/* .line 1199 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
/* .line 1200 */
this.mActivity = p2;
/* .line 1201 */
return;
} // .end method
static com.mobfox.video.sdk.MobFoxRichMediaActivity access$0 ( com.mobfox.video.sdk.MobFoxRichMediaActivity$CanSkipTask p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1197 */
v0 = this.mActivity;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1205 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1206 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "###########TRACKING CAN CLOSE INTERSTITIAL"; // const-string v1, "###########TRACKING CAN CLOSE INTERSTITIAL"
	 android.util.Log .v ( v0,v1 );
	 /* .line 1208 */
} // :cond_0
v0 = this.mActivity;
int v1 = 1; // const/4 v1, 0x1
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$14 ( v0,v1 );
/* .line 1209 */
v0 = this.mActivity;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$0 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 1210 */
	 v0 = this.mActivity;
	 /* new-instance v1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$CanSkipTask$1; */
	 /* invoke-direct {v1, p0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$CanSkipTask$1;-><init>(Lcom/mobfox/video/sdk/MobFoxRichMediaActivity$CanSkipTask;)V */
	 (( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
	 /* .line 1218 */
} // :cond_1
return;
} // .end method
