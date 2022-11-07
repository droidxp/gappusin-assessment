class com.mobfox.video.sdk.MobFoxRichMediaActivity$16 implements com.mobfox.video.sdk.MobFoxInterstitialController$OnResetAutocloseListener {
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
 com.mobfox.video.sdk.MobFoxRichMediaActivity$16 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 1055 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onResetAutoclose ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1059 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1060 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "###########RESET AUTOCLOSE INTERSTITIAL"; // const-string v1, "###########RESET AUTOCLOSE INTERSTITIAL"
	 android.util.Log .v ( v0,v1 );
	 /* .line 1062 */
} // :cond_0
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->mInterstitialAutocloseReset:Z */
/* .line 1063 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$16 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 1064 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$16 ( v0 );
	 (( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
	 /* .line 1065 */
	 v0 = this.this$0;
	 int v1 = 0; // const/4 v1, 0x0
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$17 ( v0,v1 );
	 /* .line 1067 */
} // :cond_1
return;
} // .end method
