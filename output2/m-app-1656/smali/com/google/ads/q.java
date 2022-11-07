public class com.google.ads.q implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.google.ads.q ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
		 /* .locals 1 */
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
	 /* .line 28 */
	 /* instance-of v0, p3, Lcom/google/ads/internal/AdWebView; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 29 */
		 /* check-cast p3, Lcom/google/ads/internal/AdWebView; */
		 /* .line 30 */
		 (( com.google.ads.internal.AdWebView ) p3 ).a ( ); // invoke-virtual {p3}, Lcom/google/ads/internal/AdWebView;->a()V
		 /* .line 34 */
	 } // :goto_0
	 return;
	 /* .line 32 */
} // :cond_0
final String v0 = "Trying to close WebView that isn\'t an AdWebView"; // const-string v0, "Trying to close WebView that isn\'t an AdWebView"
com.google.ads.util.b .b ( v0 );
} // .end method
