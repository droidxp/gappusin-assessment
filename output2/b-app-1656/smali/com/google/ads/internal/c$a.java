class com.google.ads.internal.c$a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/internal/c; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "a" */
} // .end annotation
/* # instance fields */
private final com.google.ads.internal.d a;
private final android.webkit.WebView b;
private final com.google.ads.internal.f c;
private final com.google.ads.AdRequest$ErrorCode d;
private final Boolean e;
/* # direct methods */
public com.google.ads.internal.c$a ( ) {
/* .locals 0 */
/* .prologue */
/* .line 100 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 101 */
this.a = p1;
/* .line 102 */
this.b = p2;
/* .line 103 */
this.c = p3;
/* .line 104 */
this.d = p4;
/* .line 105 */
/* iput-boolean p5, p0, Lcom/google/ads/internal/c$a;->e:Z */
/* .line 106 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 111 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 112 */
	 v0 = this.b;
	 (( android.webkit.WebView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V
	 /* .line 113 */
	 v0 = this.b;
	 (( android.webkit.WebView ) v0 ).destroy ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V
	 /* .line 117 */
} // :cond_0
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 118 */
	 v0 = this.c;
	 (( com.google.ads.internal.f ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/f;->a()V
	 /* .line 122 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/google/ads/internal/c$a;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 123 */
	 v0 = this.a;
	 (( com.google.ads.internal.d ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->j()Lcom/google/ads/internal/AdWebView;
	 /* .line 124 */
	 (( com.google.ads.internal.AdWebView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->stopLoading()V
	 /* .line 125 */
	 /* const/16 v1, 0x8 */
	 (( com.google.ads.internal.AdWebView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/AdWebView;->setVisibility(I)V
	 /* .line 129 */
} // :cond_2
v0 = this.a;
v1 = this.d;
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Lcom/google/ads/AdRequest$ErrorCode;)V
/* .line 130 */
return;
} // .end method
