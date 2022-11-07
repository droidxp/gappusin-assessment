public class com.mobfox.video.sdk.MobFoxWebChromeClient extends android.webkit.WebChromeClient {
	 /* .source "MobFoxWebChromeClient.java" */
	 /* # instance fields */
	 private com.mobfox.video.sdk.MobFoxRichMediaActivity mActivity;
	 /* # direct methods */
	 public com.mobfox.video.sdk.MobFoxWebChromeClient ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/app/Activity; */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V */
		 /* .line 14 */
		 /* instance-of v0, p1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 15 */
			 /* check-cast p1, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
		 } // .end local p1 # "context":Landroid/app/Activity;
		 this.mActivity = p1;
		 /* .line 17 */
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public void onHideCustomView ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 33 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 int v1 = 3; // const/4 v1, 0x3
	 v0 = 	 android.util.Log .isLoggable ( v0,v1 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 34 */
		 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
		 final String v1 = "MobFoxWebChromeClient onHideCustomView"; // const-string v1, "MobFoxWebChromeClient onHideCustomView"
		 android.util.Log .d ( v0,v1 );
		 /* .line 36 */
	 } // :cond_0
	 v0 = this.mActivity;
	 /* if-nez v0, :cond_1 */
	 /* .line 37 */
	 /* invoke-super {p0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V */
	 /* .line 41 */
} // :goto_0
return;
/* .line 39 */
} // :cond_1
v0 = this.mActivity;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).onHideCustomView ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->onHideCustomView()V
} // .end method
public void onShowCustomView ( android.view.View p0, android.webkit.WebChromeClient$CustomViewCallback p1 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/view/View; */
/* .param p2, "callback" # Landroid/webkit/WebChromeClient$CustomViewCallback; */
/* .prologue */
/* .line 21 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 22 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "MobFoxWebChromeClient onShowCustomView"; // const-string v1, "MobFoxWebChromeClient onShowCustomView"
android.util.Log .d ( v0,v1 );
/* .line 24 */
} // :cond_0
v0 = this.mActivity;
/* if-nez v0, :cond_1 */
/* .line 25 */
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V */
/* .line 29 */
} // :goto_0
return;
/* .line 27 */
} // :cond_1
v0 = this.mActivity;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).onShowCustomView ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
} // .end method
