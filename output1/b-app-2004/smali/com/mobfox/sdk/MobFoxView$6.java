class com.mobfox.sdk.MobFoxView$6 implements java.lang.Thread$UncaughtExceptionHandler {
	 /* .source "MobFoxView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/sdk/MobFoxView;->loadContent()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.sdk.MobFoxView this$0; //synthetic
/* # direct methods */
 com.mobfox.sdk.MobFoxView$6 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 435 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void uncaughtException ( java.lang.Thread p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .param p1, "thread" # Ljava/lang/Thread; */
/* .param p2, "ex" # Ljava/lang/Throwable; */
/* .prologue */
/* .line 439 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 6; // const/4 v1, 0x6
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 440 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "Uncaught exception in request thread"; // const-string v1, "Uncaught exception in request thread"
	 android.util.Log .e ( v0,v1,p2 );
	 /* .line 442 */
} // :cond_0
v0 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
com.mobfox.sdk.MobFoxView .access$402 ( v0,v1 );
/* .line 443 */
return;
} // .end method
