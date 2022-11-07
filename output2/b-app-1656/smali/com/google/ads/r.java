public class com.google.ads.r implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 private static final com.google.ads.internal.a a;
	 /* # direct methods */
	 static com.google.ads.r ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 v0 = com.google.ads.internal.a.a;
		 /* check-cast v0, Lcom/google/ads/internal/a; */
		 return;
	 } // .end method
	 public com.google.ads.r ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lcom/google/ads/internal/d;", */
		 /* "Ljava/util/HashMap", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;", */
		 /* "Landroid/webkit/WebView;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 34 */
	 final String v0 = "js"; // const-string v0, "js"
	 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 /* .line 35 */
	 /* if-nez v0, :cond_0 */
	 /* .line 36 */
	 final String v0 = "Could not get the JS to evaluate."; // const-string v0, "Could not get the JS to evaluate."
	 com.google.ads.util.b .b ( v0 );
	 /* .line 65 */
} // :goto_0
return;
/* .line 42 */
} // :cond_0
/* instance-of v1, p3, Lcom/google/ads/internal/AdWebView; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 43 */
/* check-cast p3, Lcom/google/ads/internal/AdWebView; */
/* .line 50 */
(( com.google.ads.internal.AdWebView ) p3 ).d ( ); // invoke-virtual {p3}, Lcom/google/ads/internal/AdWebView;->d()Lcom/google/ads/AdActivity;
/* .line 51 */
/* if-nez v1, :cond_2 */
/* .line 52 */
final String v0 = "Could not get the AdActivity from the AdWebView."; // const-string v0, "Could not get the AdActivity from the AdWebView."
com.google.ads.util.b .b ( v0 );
/* .line 45 */
} // :cond_1
final String v0 = "Trying to evaluate JS in a WebView that isn\'t an AdWebView"; // const-string v0, "Trying to evaluate JS in a WebView that isn\'t an AdWebView"
com.google.ads.util.b .b ( v0 );
/* .line 57 */
} // :cond_2
(( com.google.ads.AdActivity ) v1 ).getOpeningAdWebView ( ); // invoke-virtual {v1}, Lcom/google/ads/AdActivity;->getOpeningAdWebView()Lcom/google/ads/internal/AdWebView;
/* .line 58 */
/* if-nez v1, :cond_3 */
/* .line 59 */
final String v0 = "Could not get the opening WebView."; // const-string v0, "Could not get the opening WebView."
com.google.ads.util.b .b ( v0 );
/* .line 64 */
} // :cond_3
v2 = com.google.ads.r.a;
(( com.google.ads.internal.a ) v2 ).a ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;)V
} // .end method
