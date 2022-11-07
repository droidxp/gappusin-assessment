public class com.google.ads.s implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.google.ads.s ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected java.lang.Runnable a ( java.lang.String p0, android.webkit.WebView p1 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 39 */
		 /* new-instance v0, Lcom/google/ads/aa; */
		 (( android.webkit.WebView ) p2 ).getContext ( ); // invoke-virtual {p2}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v1 ).getApplicationContext ( ); // invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 /* invoke-direct {v0, p1, v1}, Lcom/google/ads/aa;-><init>(Ljava/lang/String;Landroid/content/Context;)V */
	 } // .end method
	 public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
		 /* .locals 2 */
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
	 /* .line 27 */
	 final String v0 = "u"; // const-string v0, "u"
	 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 /* .line 28 */
	 /* if-nez v0, :cond_0 */
	 /* .line 29 */
	 final String v0 = "Could not get URL from click gmsg."; // const-string v0, "Could not get URL from click gmsg."
	 com.google.ads.util.b .e ( v0 );
	 /* .line 36 */
} // :goto_0
return;
/* .line 34 */
} // :cond_0
/* new-instance v1, Ljava/lang/Thread; */
(( com.google.ads.s ) p0 ).a ( v0, p3 ); // invoke-virtual {p0, v0, p3}, Lcom/google/ads/s;->a(Ljava/lang/String;Landroid/webkit/WebView;)Ljava/lang/Runnable;
/* invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 35 */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
} // .end method
