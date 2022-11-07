class com.google.ads.internal.c$c implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/internal/c; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "c" */
} // .end annotation
/* # instance fields */
final com.google.ads.internal.c a; //synthetic
private final java.lang.String b;
private final java.lang.String c;
private final android.webkit.WebView d;
/* # direct methods */
public com.google.ads.internal.c$c ( ) {
/* .locals 0 */
/* .prologue */
/* .line 141 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 142 */
this.d = p2;
/* .line 143 */
this.b = p3;
/* .line 144 */
this.c = p4;
/* .line 145 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
/* .line 149 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 150 */
	 v0 = this.d;
	 v1 = this.b;
	 v2 = this.c;
	 final String v3 = "text/html"; // const-string v3, "text/html"
	 final String v4 = "utf-8"; // const-string v4, "utf-8"
	 int v5 = 0; // const/4 v5, 0x0
	 /* invoke-virtual/range {v0 ..v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 154 */
} // :goto_0
return;
/* .line 152 */
} // :cond_0
v0 = this.d;
v1 = this.b;
(( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
} // .end method
