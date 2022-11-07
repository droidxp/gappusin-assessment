class com.mobfox.video.sdk.MobFoxAdManager$2 implements java.lang.Thread$UncaughtExceptionHandler {
	 /* .source "MobFoxAdManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxAdManager;->requestAd()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxAdManager this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxAdManager$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 171 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void uncaughtException ( java.lang.Thread p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .param p1, "thread" # Ljava/lang/Thread; */
/* .param p2, "ex" # Ljava/lang/Throwable; */
/* .prologue */
/* .line 176 */
v0 = this.this$0;
/* new-instance v1, Lcom/mobfox/video/sdk/RichMediaAdData; */
/* invoke-direct {v1}, Lcom/mobfox/video/sdk/RichMediaAdData;-><init>()V */
com.mobfox.video.sdk.MobFoxAdManager .access$1 ( v0,v1 );
/* .line 177 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxAdManager .access$2 ( v0 );
int v1 = -1; // const/4 v1, -0x1
(( com.mobfox.video.sdk.RichMediaAdData ) v0 ).setType ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
/* .line 178 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 6; // const/4 v1, 0x6
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 179 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 /* .line 180 */
	 final String v1 = "Handling Uncaught exception in ad request thread"; // const-string v1, "Handling Uncaught exception in ad request thread"
	 /* .line 179 */
	 android.util.Log .e ( v0,v1,p2 );
	 /* .line 183 */
} // :cond_0
v0 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
com.mobfox.video.sdk.MobFoxAdManager .access$5 ( v0,v1 );
/* .line 184 */
return;
} // .end method
