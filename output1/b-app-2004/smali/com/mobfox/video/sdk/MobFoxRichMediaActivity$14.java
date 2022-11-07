class com.mobfox.video.sdk.MobFoxRichMediaActivity$14 implements android.view.View$OnClickListener {
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
 com.mobfox.video.sdk.MobFoxRichMediaActivity$14 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 1013 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .prologue */
/* .line 1017 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1018 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "MobFoxRichMediaActivity mInterstitialClickListener"; // const-string v1, "MobFoxRichMediaActivity mInterstitialClickListener"
	 android.util.Log .d ( v0,v1 );
	 /* .line 1020 */
} // :cond_0
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$15 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 1021 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$15 ( v0 );
	 (( com.mobfox.video.sdk.MobFoxInterstitialController ) v0 ).toggle ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->toggle()V
	 /* .line 1022 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$15 ( v0 );
	 (( com.mobfox.video.sdk.MobFoxInterstitialController ) v0 ).resetAutoclose ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->resetAutoclose()V
	 /* .line 1024 */
} // :cond_1
return;
} // .end method
