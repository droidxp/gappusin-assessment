class com.mobfox.video.sdk.MobFoxRichMediaActivity$3 implements android.view.View$OnClickListener {
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
 com.mobfox.video.sdk.MobFoxRichMediaActivity$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 774 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .prologue */
/* .line 778 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 779 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "MobFoxRichMediaActivity mOverlayClickListener"; // const-string v1, "MobFoxRichMediaActivity mOverlayClickListener"
	 android.util.Log .d ( v0,v1 );
	 /* .line 781 */
} // :cond_0
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$3 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 782 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$3 ( v0 );
	 (( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).toggle ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->toggle()V
	 /* .line 784 */
} // :cond_1
return;
} // .end method
