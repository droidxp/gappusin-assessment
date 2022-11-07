class com.google.ads.GoogleAdView$AdWebView extends android.webkit.WebView {
	 /* .source "GoogleAdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/GoogleAdView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "AdWebView" */
} // .end annotation
/* # direct methods */
public com.google.ads.GoogleAdView$AdWebView ( ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 243 */
/* invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* .line 244 */
return;
} // .end method
/* # virtual methods */
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 2 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 248 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
/* .line 250 */
int v0 = 1; // const/4 v0, 0x1
/* .line 255 */
} // :goto_0
/* .line 252 */
} // :cond_0
v0 = (( com.google.ads.GoogleAdView$AdWebView ) p0 ).isFocused ( ); // invoke-virtual {p0}, Lcom/google/ads/GoogleAdView$AdWebView;->isFocused()Z
/* if-nez v0, :cond_1 */
/* .line 253 */
(( com.google.ads.GoogleAdView$AdWebView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Lcom/google/ads/GoogleAdView$AdWebView;->requestFocus()Z
/* .line 255 */
} // :cond_1
v0 = /* invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
