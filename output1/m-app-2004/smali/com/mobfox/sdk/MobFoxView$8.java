class com.mobfox.sdk.MobFoxView$8 implements java.lang.Runnable {
	 /* .source "MobFoxView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/sdk/MobFoxView;->notifyNoAd()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.sdk.MobFoxView this$0; //synthetic
/* # direct methods */
 com.mobfox.sdk.MobFoxView$8 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 686 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 690 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 691 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "No Ad"; // const-string v1, "No Ad"
	 android.util.Log .d ( v0,v1 );
	 /* .line 694 */
} // :cond_0
v0 = this.this$0;
com.mobfox.sdk.MobFoxView .access$500 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 695 */
	 v0 = this.this$0;
	 com.mobfox.sdk.MobFoxView .access$500 ( v0 );
	 /* .line 697 */
} // :cond_1
return;
} // .end method
