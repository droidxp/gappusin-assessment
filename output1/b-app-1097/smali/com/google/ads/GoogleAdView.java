public class com.google.ads.GoogleAdView extends android.widget.ViewSwitcher {
	 /* .source "GoogleAdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/GoogleAdView$1;, */
	 /* Lcom/google/ads/GoogleAdView$AdWebViewClient;, */
	 /* Lcom/google/ads/GoogleAdView$AdWebView; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String AD_FOOTER;
private static final java.lang.String AD_HEADER;
private static final java.lang.String AD_URL;
private static final java.lang.String DEBUG_WATERMARK_FILE;
private static final Boolean ENABLE_REDIRECT_OPTIMIZATION;
private static final java.lang.String LOGTAG;
private static final Integer PROGRESS_BAR_INDEX;
private static final java.lang.String REDIRECT_DOMAINS;
private static final Integer TARGET_HEIGHT;
private static final Integer TARGET_WIDTH;
private static final Integer WEBVIEW_INDEX;
/* # instance fields */
private com.google.ads.AdViewListener mAdViewListener;
private com.google.ads.GoogleAdView$AdWebViewClient mAdWebViewClient;
private android.graphics.drawable.Drawable mDebugDrawable;
private Boolean mDebugMode;
private android.webkit.WebView mWebView;
/* # direct methods */
static com.google.ads.GoogleAdView ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 73 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v0, v0, [Ljava/lang/String; */
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "googleads.g.doubleclick.net"; // const-string v2, "googleads.g.doubleclick.net"
	 /* aput-object v2, v0, v1 */
	 int v1 = 1; // const/4 v1, 0x1
	 final String v2 = "googleadservices.com"; // const-string v2, "googleadservices.com"
	 /* aput-object v2, v0, v1 */
	 return;
} // .end method
public com.google.ads.GoogleAdView ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 88 */
	 /* invoke-direct {p0, p1}, Landroid/widget/ViewSwitcher;-><init>(Landroid/content/Context;)V */
	 /* .line 89 */
	 /* new-instance v0, Landroid/webkit/WebView; */
	 /* invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
	 /* invoke-direct {p0, p1, v0}, Lcom/google/ads/GoogleAdView;->init(Landroid/content/Context;Landroid/webkit/WebView;)V */
	 /* .line 90 */
	 return;
} // .end method
public com.google.ads.GoogleAdView ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 /* .line 93 */
	 /* invoke-direct {p0, p1, p2}, Landroid/widget/ViewSwitcher;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 /* .line 94 */
	 /* new-instance v0, Landroid/webkit/WebView; */
	 /* invoke-direct {v0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
	 /* invoke-direct {p0, p1, v0}, Lcom/google/ads/GoogleAdView;->init(Landroid/content/Context;Landroid/webkit/WebView;)V */
	 /* .line 95 */
	 return;
} // .end method
 com.google.ads.GoogleAdView ( ) {
	 /* .locals 0 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "webView" # Landroid/webkit/WebView; */
	 /* .prologue */
	 /* .line 99 */
	 /* invoke-direct {p0, p1}, Landroid/widget/ViewSwitcher;-><init>(Landroid/content/Context;)V */
	 /* .line 100 */
	 /* invoke-direct {p0, p1, p2}, Lcom/google/ads/GoogleAdView;->init(Landroid/content/Context;Landroid/webkit/WebView;)V */
	 /* .line 101 */
	 return;
} // .end method
static com.google.ads.AdViewListener access$200 ( com.google.ads.GoogleAdView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/google/ads/GoogleAdView; */
	 /* .prologue */
	 /* .line 56 */
	 v0 = this.mAdViewListener;
} // .end method
static java.lang.String access$300 ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 56 */
	 v0 = com.google.ads.GoogleAdView.REDIRECT_DOMAINS;
} // .end method
private java.lang.String generateHtml ( com.google.ads.AdSpec p0 ) {
	 /* .locals 9 */
	 /* .param p1, "adSpec" # Lcom/google/ads/AdSpec; */
	 /* .prologue */
	 /* .line 193 */
	 /* new-instance v2, Lorg/json/JSONObject; */
	 /* invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V */
	 /* .line 195 */
	 /* .local v2, "jsonParams":Lorg/json/JSONObject; */
	 (( com.google.ads.GoogleAdView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/google/ads/GoogleAdView;->getContext()Landroid/content/Context;
	 /* .local v1, "i$":Ljava/util/Iterator; */
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_0
	 /* check-cast v4, Lcom/google/ads/AdSpec$Parameter; */
	 /* .line 196 */
	 /* .local v4, "param":Lcom/google/ads/AdSpec$Parameter; */
	 (( com.google.ads.AdSpec$Parameter ) v4 ).getName ( ); // invoke-virtual {v4}, Lcom/google/ads/AdSpec$Parameter;->getName()Ljava/lang/String;
	 /* .line 197 */
	 /* .local v3, "name":Ljava/lang/String; */
	 (( com.google.ads.AdSpec$Parameter ) v4 ).getValue ( ); // invoke-virtual {v4}, Lcom/google/ads/AdSpec$Parameter;->getValue()Ljava/lang/String;
	 /* .line 199 */
	 /* .local v5, "value":Ljava/lang/String; */
	 try { // :try_start_0
		 (( org.json.JSONObject ) v2 ).put ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
		 /* :try_end_0 */
		 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 200 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 201 */
		 /* .local v0, "e":Lorg/json/JSONException; */
		 final String v6 = "GoogleAdView"; // const-string v6, "GoogleAdView"
		 /* new-instance v7, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v8 = "Error encoding JSON: "; // const-string v8, "Error encoding JSON: "
		 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).append ( v3 ); // invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v8 = "="; // const-string v8, "="
		 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .w ( v6,v7 );
		 /* .line 205 */
	 } // .end local v0 # "e":Lorg/json/JSONException;
} // .end local v3 # "name":Ljava/lang/String;
} // .end local v4 # "param":Lcom/google/ads/AdSpec$Parameter;
} // .end local v5 # "value":Ljava/lang/String;
} // :cond_0
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "<html>\n<body marginwidth=\'0\' marginheight=\'0\'>\n<script type=\'text/javascript\'>\nwindow.google_afma_request = "; // const-string v7, "<html>\n<body marginwidth=\'0\' marginheight=\'0\'>\n<script type=\'text/javascript\'>\nwindow.google_afma_request = "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( org.json.JSONObject ) v2 ).toString ( ); // invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = ";\n</script>\n<script type=\'text/javascript\' src=\'http://pagead2.googlesyndication.com/pagead/show_mobile_ads.js\'></script>\n</body>\n</html>"; // const-string v7, ";\n</script>\n<script type=\'text/javascript\' src=\'http://pagead2.googlesyndication.com/pagead/show_mobile_ads.js\'></script>\n</body>\n</html>"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
private android.graphics.drawable.Drawable getDebugDrawable ( ) {
/* .locals 7 */
/* .prologue */
/* const-class v2, Landroid/graphics/Bitmap; */
/* .line 212 */
v2 = this.mDebugDrawable;
/* if-nez v2, :cond_0 */
/* .line 214 */
try { // :try_start_0
(( com.google.ads.GoogleAdView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/google/ads/GoogleAdView;->getContext()Landroid/content/Context;
(( android.content.Context ) v2 ).getAssets ( ); // invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
final String v3 = "test_ad.png"; // const-string v3, "test_ad.png"
(( android.content.res.AssetManager ) v2 ).open ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
android.graphics.BitmapFactory .decodeStream ( v2 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 220 */
/* .local v0, "debugBitmap":Landroid/graphics/Bitmap; */
try { // :try_start_1
/* const-class v2, Landroid/graphics/Bitmap; */
final String v3 = "setDensity"; // const-string v3, "setDensity"
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/Class; */
int v5 = 0; // const/4 v5, 0x0
v6 = java.lang.Integer.TYPE;
/* aput-object v6, v4, v5 */
(( java.lang.Class ) v2 ).getMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* const/16 v5, 0xa0 */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v3, v4 */
(( java.lang.reflect.Method ) v2 ).invoke ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 223 */
/* const-class v2, Landroid/graphics/drawable/BitmapDrawable; */
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Ljava/lang/Class; */
int v4 = 0; // const/4 v4, 0x0
/* const-class v5, Landroid/content/res/Resources; */
/* aput-object v5, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
/* const-class v5, Landroid/graphics/Bitmap; */
/* aput-object v5, v3, v4 */
(( java.lang.Class ) v2 ).getConstructor ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
(( com.google.ads.GoogleAdView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/google/ads/GoogleAdView;->getContext()Landroid/content/Context;
(( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* aput-object v5, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
/* aput-object v0, v3, v4 */
(( java.lang.reflect.Constructor ) v2 ).newInstance ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/drawable/Drawable; */
this.mDebugDrawable = v2;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 236 */
} // .end local v0 # "debugBitmap":Landroid/graphics/Bitmap;
} // :cond_0
} // :goto_0
v2 = this.mDebugDrawable;
/* .line 226 */
/* .restart local v0 # "debugBitmap":Landroid/graphics/Bitmap; */
/* :catch_0 */
/* move-exception v2 */
/* move-object v1, v2 */
/* .line 228 */
/* .local v1, "e":Ljava/lang/Exception; */
try { // :try_start_2
/* new-instance v2, Landroid/graphics/drawable/BitmapDrawable; */
/* invoke-direct {v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V */
this.mDebugDrawable = v2;
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 230 */
} // .end local v0 # "debugBitmap":Landroid/graphics/Bitmap;
} // .end local v1 # "e":Ljava/lang/Exception;
/* :catch_1 */
/* move-exception v2 */
/* move-object v1, v2 */
/* .line 232 */
/* .local v1, "e":Ljava/io/IOException; */
final String v2 = "GoogleAdView"; // const-string v2, "GoogleAdView"
final String v3 = "Error loading debug watermark"; // const-string v3, "Error loading debug watermark"
android.util.Log .e ( v2,v3,v1 );
} // .end method
private void init ( android.content.Context p0, android.webkit.WebView p1 ) {
/* .locals 11 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "webView" # Landroid/webkit/WebView; */
/* .prologue */
int v10 = 0; // const/4 v10, 0x0
int v9 = 1; // const/4 v9, 0x1
/* const/high16 v8, 0x43a00000 # 320.0f */
/* const/high16 v6, 0x42480000 # 50.0f */
int v7 = 0; // const/4 v7, 0x0
/* .line 106 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v0, v4, Landroid/util/DisplayMetrics;->density:F */
/* .line 107 */
/* .local v0, "density":F */
/* new-instance v1, Landroid/widget/ProgressBar; */
/* const v4, 0x1010079 */
/* invoke-direct {v1, p1, v10, v4}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 108 */
/* .local v1, "progressBar":Landroid/widget/ProgressBar; */
(( android.widget.ProgressBar ) v1 ).setIndeterminate ( v9 ); // invoke-virtual {v1, v9}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V
/* .line 109 */
/* new-instance v2, Landroid/widget/LinearLayout; */
/* invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 110 */
/* .local v2, "progressBarLayout":Landroid/widget/LinearLayout; */
/* const/16 v4, 0x11 */
(( android.widget.LinearLayout ) v2 ).setGravity ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 111 */
(( android.widget.LinearLayout ) v2 ).addView ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* .line 112 */
/* mul-float v4, v8, v0 */
/* float-to-int v4, v4 */
/* mul-float v5, v6, v0 */
/* float-to-int v5, v5 */
(( com.google.ads.GoogleAdView ) p0 ).addView ( v2, v4, v5 ); // invoke-virtual {p0, v2, v4, v5}, Lcom/google/ads/GoogleAdView;->addView(Landroid/view/View;II)V
/* .line 115 */
this.mWebView = p2;
/* .line 116 */
/* new-instance v4, Lcom/google/ads/GoogleAdView$AdWebViewClient; */
/* invoke-direct {v4, p0, v10}, Lcom/google/ads/GoogleAdView$AdWebViewClient;-><init>(Lcom/google/ads/GoogleAdView;Lcom/google/ads/GoogleAdView$1;)V */
this.mAdWebViewClient = v4;
/* .line 117 */
v4 = this.mWebView;
v5 = this.mAdWebViewClient;
(( android.webkit.WebView ) v4 ).setWebViewClient ( v5 ); // invoke-virtual {v4, v5}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 118 */
v4 = this.mWebView;
/* const/high16 v5, 0x42c80000 # 100.0f */
/* mul-float/2addr v5, v0 */
/* float-to-int v5, v5 */
(( android.webkit.WebView ) v4 ).setInitialScale ( v5 ); // invoke-virtual {v4, v5}, Landroid/webkit/WebView;->setInitialScale(I)V
/* .line 119 */
v4 = this.mWebView;
/* mul-float v5, v8, v0 */
/* float-to-int v5, v5 */
/* mul-float/2addr v6, v0 */
/* float-to-int v6, v6 */
(( com.google.ads.GoogleAdView ) p0 ).addView ( v4, v5, v6 ); // invoke-virtual {p0, v4, v5, v6}, Lcom/google/ads/GoogleAdView;->addView(Landroid/view/View;II)V
/* .line 122 */
v4 = this.mWebView;
(( android.webkit.WebView ) v4 ).setVerticalScrollBarEnabled ( v7 ); // invoke-virtual {v4, v7}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
/* .line 123 */
v4 = this.mWebView;
(( android.webkit.WebView ) v4 ).setHorizontalScrollBarEnabled ( v7 ); // invoke-virtual {v4, v7}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
/* .line 126 */
v4 = this.mWebView;
(( android.webkit.WebView ) v4 ).getSettings ( ); // invoke-virtual {v4}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
/* .line 127 */
/* .local v3, "settings":Landroid/webkit/WebSettings; */
(( android.webkit.WebSettings ) v3 ).setJavaScriptEnabled ( v9 ); // invoke-virtual {v3, v9}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 128 */
(( android.webkit.WebSettings ) v3 ).setSupportZoom ( v7 ); // invoke-virtual {v3, v7}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
/* .line 129 */
(( android.webkit.WebSettings ) v3 ).setCacheMode ( v7 ); // invoke-virtual {v3, v7}, Landroid/webkit/WebSettings;->setCacheMode(I)V
/* .line 132 */
/* const v4, 0x10a0001 */
(( com.google.ads.GoogleAdView ) p0 ).setOutAnimation ( p1, v4 ); // invoke-virtual {p0, p1, v4}, Lcom/google/ads/GoogleAdView;->setOutAnimation(Landroid/content/Context;I)V
/* .line 133 */
/* const/high16 v4, 0x10a0000 */
(( com.google.ads.GoogleAdView ) p0 ).setInAnimation ( p1, v4 ); // invoke-virtual {p0, p1, v4}, Lcom/google/ads/GoogleAdView;->setInAnimation(Landroid/content/Context;I)V
/* .line 136 */
/* iput-boolean v7, p0, Lcom/google/ads/GoogleAdView;->mDebugMode:Z */
/* .line 137 */
return;
} // .end method
/* # virtual methods */
public com.google.ads.AdViewListener getAdViewListener ( ) {
/* .locals 1 */
/* .prologue */
/* .line 142 */
v0 = this.mAdViewListener;
} // .end method
public void reset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 171 */
int v0 = 0; // const/4 v0, 0x0
(( com.google.ads.GoogleAdView ) p0 ).setDisplayedChild ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/GoogleAdView;->setDisplayedChild(I)V
/* .line 172 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V
/* .line 173 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).clearView ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->clearView()V
/* .line 174 */
v0 = this.mAdWebViewClient;
com.google.ads.GoogleAdView$AdWebViewClient .access$100 ( v0 );
/* .line 175 */
return;
} // .end method
public void setAdViewListener ( com.google.ads.AdViewListener p0 ) {
/* .locals 0 */
/* .param p1, "adViewListener" # Lcom/google/ads/AdViewListener; */
/* .prologue */
/* .line 146 */
this.mAdViewListener = p1;
/* .line 147 */
return;
} // .end method
public void setDisplayedChild ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "child" # I */
/* .prologue */
/* .line 179 */
/* invoke-super {p0, p1}, Landroid/widget/ViewSwitcher;->setDisplayedChild(I)V */
/* .line 182 */
/* iget-boolean v0, p0, Lcom/google/ads/GoogleAdView;->mDebugMode:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 184 */
/* invoke-direct {p0}, Lcom/google/ads/GoogleAdView;->getDebugDrawable()Landroid/graphics/drawable/Drawable; */
(( com.google.ads.GoogleAdView ) p0 ).setForeground ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/GoogleAdView;->setForeground(Landroid/graphics/drawable/Drawable;)V
/* .line 188 */
} // :goto_0
return;
/* .line 186 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
(( com.google.ads.GoogleAdView ) p0 ).setForeground ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/GoogleAdView;->setForeground(Landroid/graphics/drawable/Drawable;)V
} // .end method
public void showAds ( com.google.ads.AdSpec p0 ) {
/* .locals 4 */
/* .param p1, "adSpec" # Lcom/google/ads/AdSpec; */
/* .prologue */
v1 = /* .line 155 */
/* iput-boolean v1, p0, Lcom/google/ads/GoogleAdView;->mDebugMode:Z */
/* .line 156 */
/* invoke-direct {p0, p1}, Lcom/google/ads/GoogleAdView;->generateHtml(Lcom/google/ads/AdSpec;)Ljava/lang/String; */
/* .line 157 */
/* .local v0, "htmlString":Ljava/lang/String; */
/* iget-boolean v1, p0, Lcom/google/ads/GoogleAdView;->mDebugMode:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 158 */
final String v1 = "GoogleAdView"; // const-string v1, "GoogleAdView"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Fetching ad: "; // const-string v3, "Fetching ad: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 159 */
/* invoke-direct {p0}, Lcom/google/ads/GoogleAdView;->getDebugDrawable()Landroid/graphics/drawable/Drawable; */
/* .line 161 */
} // :cond_0
v1 = this.mWebView;
final String v2 = "text/html"; // const-string v2, "text/html"
final String v3 = "utf-8"; // const-string v3, "utf-8"
(( android.webkit.WebView ) v1 ).loadData ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/* .line 162 */
return;
} // .end method
