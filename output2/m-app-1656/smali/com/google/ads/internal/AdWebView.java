public class com.google.ads.internal.AdWebView extends android.webkit.WebView {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 private java.lang.ref.WeakReference a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference", */
	 /* "<", */
	 /* "Lcom/google/ads/AdActivity;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private com.google.ads.AdSize b;
private Boolean c;
private Boolean d;
/* # direct methods */
public com.google.ads.internal.AdWebView ( ) {
/* .locals 4 */
/* .param p1, "slotState" # Lcom/google/ads/m; */
/* .param p2, "adSize" # Lcom/google/ads/AdSize; */
/* .prologue */
/* const/16 v3, 0xb */
int v2 = 0; // const/4 v2, 0x0
/* .line 62 */
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
/* invoke-direct {p0, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* .line 65 */
this.b = p2;
/* .line 69 */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
/* .line 73 */
/* iput-boolean v2, p0, Lcom/google/ads/internal/AdWebView;->c:Z */
/* .line 77 */
/* iput-boolean v2, p0, Lcom/google/ads/internal/AdWebView;->d:Z */
/* .line 80 */
(( com.google.ads.internal.AdWebView ) p0 ).setBackgroundColor ( v2 ); // invoke-virtual {p0, v2}, Lcom/google/ads/internal/AdWebView;->setBackgroundColor(I)V
/* .line 83 */
com.google.ads.util.AdUtil .a ( p0 );
/* .line 86 */
(( com.google.ads.internal.AdWebView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/AdWebView;->getSettings()Landroid/webkit/WebSettings;
/* .line 87 */
(( android.webkit.WebSettings ) v0 ).setSupportMultipleWindows ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V
/* .line 90 */
int v1 = 1; // const/4 v1, 0x1
(( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 94 */
(( android.webkit.WebSettings ) v0 ).setSavePassword ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
/* .line 97 */
/* new-instance v1, Lcom/google/ads/internal/AdWebView$1; */
/* invoke-direct {v1, p0}, Lcom/google/ads/internal/AdWebView$1;-><init>(Lcom/google/ads/internal/AdWebView;)V */
(( com.google.ads.internal.AdWebView ) p0 ).setDownloadListener ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/ads/internal/AdWebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V
/* .line 117 */
/* if-lt v1, v3, :cond_0 */
/* .line 118 */
com.google.ads.util.g .a ( v0,p1 );
/* .line 122 */
} // :cond_0
/* const/high16 v0, 0x2000000 */
(( com.google.ads.internal.AdWebView ) p0 ).setScrollBarStyle ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/internal/AdWebView;->setScrollBarStyle(I)V
/* .line 128 */
/* const/16 v1, 0xe */
/* if-lt v0, v1, :cond_2 */
/* .line 129 */
/* new-instance v0, Lcom/google/ads/util/h$a; */
/* invoke-direct {v0, p1}, Lcom/google/ads/util/h$a;-><init>(Lcom/google/ads/m;)V */
(( com.google.ads.internal.AdWebView ) p0 ).setWebChromeClient ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/internal/AdWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
/* .line 133 */
} // :cond_1
} // :goto_0
return;
/* .line 130 */
} // :cond_2
/* if-lt v0, v3, :cond_1 */
/* .line 131 */
/* new-instance v0, Lcom/google/ads/util/g$a; */
/* invoke-direct {v0, p1}, Lcom/google/ads/util/g$a;-><init>(Lcom/google/ads/m;)V */
(( com.google.ads.internal.AdWebView ) p0 ).setWebChromeClient ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/internal/AdWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 139 */
(( com.google.ads.internal.AdWebView ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/AdWebView;->d()Lcom/google/ads/AdActivity;
/* .line 140 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 141 */
(( com.google.ads.AdActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/google/ads/AdActivity;->finish()V
/* .line 143 */
} // :cond_0
return;
} // .end method
public void b ( ) {
/* .locals 2 */
/* .prologue */
/* .line 150 */
/* const/16 v1, 0xb */
/* if-lt v0, v1, :cond_0 */
/* .line 151 */
com.google.ads.util.g .a ( p0 );
/* .line 154 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/internal/AdWebView;->d:Z */
/* .line 155 */
return;
} // .end method
public void c ( ) {
/* .locals 2 */
/* .prologue */
/* .line 163 */
/* iget-boolean v0, p0, Lcom/google/ads/internal/AdWebView;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v1, 0xb */
/* if-lt v0, v1, :cond_0 */
/* .line 164 */
com.google.ads.util.g .b ( p0 );
/* .line 167 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/ads/internal/AdWebView;->d:Z */
/* .line 168 */
return;
} // .end method
public com.google.ads.AdActivity d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 176 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/AdActivity; */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void destroy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 247 */
try { // :try_start_0
/* invoke-super {p0}, Landroid/webkit/WebView;->destroy()V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 251 */
} // :goto_0
return;
/* .line 248 */
/* :catch_0 */
/* move-exception v0 */
/* .line 249 */
final String v1 = "An error occurred while destroying an AdWebView:"; // const-string v1, "An error occurred while destroying an AdWebView:"
com.google.ads.util.b .b ( v1,v0 );
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .prologue */
/* .line 183 */
/* iget-boolean v0, p0, Lcom/google/ads/internal/AdWebView;->d:Z */
} // .end method
public void loadDataWithBaseURL ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 2 */
/* .param p1, "baseUrl" # Ljava/lang/String; */
/* .param p2, "data" # Ljava/lang/String; */
/* .param p3, "mimeType" # Ljava/lang/String; */
/* .param p4, "encoding" # Ljava/lang/String; */
/* .param p5, "historyUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 207 */
try { // :try_start_0
/* invoke-super/range {p0 ..p5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 211 */
} // :goto_0
return;
/* .line 208 */
/* :catch_0 */
/* move-exception v0 */
/* .line 209 */
final String v1 = "An error occurred while loading data in AdWebView:"; // const-string v1, "An error occurred while loading data in AdWebView:"
com.google.ads.util.b .b ( v1,v0 );
} // .end method
public void loadUrl ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 220 */
try { // :try_start_0
/* invoke-super {p0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 224 */
} // :goto_0
return;
/* .line 221 */
/* :catch_0 */
/* move-exception v0 */
/* .line 222 */
final String v1 = "An error occurred while loading a URL in AdWebView:"; // const-string v1, "An error occurred while loading a URL in AdWebView:"
com.google.ads.util.b .b ( v1,v0 );
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 10 */
/* .param p1, "widthMeasureSpec" # I */
/* .param p2, "heightMeasureSpec" # I */
/* .prologue */
/* const v0, 0x7fffffff */
/* const/high16 v9, 0x40000000 # 2.0f */
/* const/high16 v8, -0x80000000 */
/* .line 261 */
v1 = (( com.google.ads.internal.AdWebView ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/AdWebView;->isInEditMode()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 262 */
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V */
/* .line 306 */
} // :goto_0
return;
/* .line 268 */
} // :cond_0
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget-boolean v1, p0, Lcom/google/ads/internal/AdWebView;->c:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 269 */
} // :cond_1
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V */
/* .line 274 */
} // :cond_2
v2 = android.view.View$MeasureSpec .getMode ( p1 );
/* .line 275 */
v3 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 278 */
v4 = android.view.View$MeasureSpec .getMode ( p2 );
/* .line 279 */
v1 = android.view.View$MeasureSpec .getSize ( p2 );
/* .line 282 */
(( com.google.ads.internal.AdWebView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/AdWebView;->getContext()Landroid/content/Context;
(( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v5 ).getDisplayMetrics ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 284 */
/* iget v5, v5, Landroid/util/DisplayMetrics;->density:F */
/* .line 287 */
v6 = this.b;
v6 = (( com.google.ads.AdSize ) v6 ).getWidth ( ); // invoke-virtual {v6}, Lcom/google/ads/AdSize;->getWidth()I
/* int-to-float v6, v6 */
/* mul-float/2addr v6, v5 */
/* float-to-int v6, v6 */
/* .line 288 */
v7 = this.b;
v7 = (( com.google.ads.AdSize ) v7 ).getHeight ( ); // invoke-virtual {v7}, Lcom/google/ads/AdSize;->getHeight()I
/* int-to-float v7, v7 */
/* mul-float/2addr v7, v5 */
/* float-to-int v7, v7 */
/* .line 291 */
/* if-eq v2, v8, :cond_3 */
/* if-ne v2, v9, :cond_8 */
} // :cond_3
/* move v2, v3 */
/* .line 295 */
} // :goto_1
/* if-eq v4, v8, :cond_4 */
/* if-ne v4, v9, :cond_5 */
} // :cond_4
/* move v0, v1 */
/* .line 298 */
} // :cond_5
/* int-to-float v4, v6 */
/* const/high16 v8, 0x40c00000 # 6.0f */
/* mul-float/2addr v5, v8 */
/* sub-float/2addr v4, v5 */
/* int-to-float v2, v2 */
/* cmpl-float v2, v4, v2 */
/* if-gtz v2, :cond_6 */
/* if-le v7, v0, :cond_7 */
/* .line 299 */
} // :cond_6
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Not enough space to show ad! Wants: <"; // const-string v2, "Not enough space to show ad! Wants: <"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ">, Has: <"; // const-string v2, ">, Has: <"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ">"; // const-string v2, ">"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
/* .line 301 */
/* const/16 v0, 0x8 */
(( com.google.ads.internal.AdWebView ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/internal/AdWebView;->setVisibility(I)V
/* .line 302 */
(( com.google.ads.internal.AdWebView ) p0 ).setMeasuredDimension ( v3, v1 ); // invoke-virtual {p0, v3, v1}, Lcom/google/ads/internal/AdWebView;->setMeasuredDimension(II)V
/* goto/16 :goto_0 */
/* .line 304 */
} // :cond_7
(( com.google.ads.internal.AdWebView ) p0 ).setMeasuredDimension ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Lcom/google/ads/internal/AdWebView;->setMeasuredDimension(II)V
/* goto/16 :goto_0 */
} // :cond_8
/* move v2, v0 */
} // .end method
public void setAdActivity ( com.google.ads.AdActivity p0 ) {
/* .locals 1 */
/* .param p1, "adActivity" # Lcom/google/ads/AdActivity; */
/* .prologue */
/* .line 192 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
/* .line 193 */
return;
} // .end method
public void setIsExpandedMraid ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "isCurrentlyExpandedMraid" # Z */
/* .prologue */
/* .line 313 */
/* iput-boolean p1, p0, Lcom/google/ads/internal/AdWebView;->c:Z */
/* .line 314 */
return;
} // .end method
public void stopLoading ( ) {
/* .locals 2 */
/* .prologue */
/* .line 233 */
try { // :try_start_0
/* invoke-super {p0}, Landroid/webkit/WebView;->stopLoading()V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 237 */
} // :goto_0
return;
/* .line 234 */
/* :catch_0 */
/* move-exception v0 */
/* .line 235 */
final String v1 = "An error occurred while stopping loading in AdWebView:"; // const-string v1, "An error occurred while stopping loading in AdWebView:"
com.google.ads.util.b .d ( v1,v0 );
} // .end method
