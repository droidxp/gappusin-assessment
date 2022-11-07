class com.mobfox.sdk.MobFoxWebViewClient extends android.webkit.WebViewClient {
	 /* .source "MobFoxWebViewClient.java" */
	 /* # instance fields */
	 private final com.mobfox.sdk.MobFoxView adServerViewCore;
	 private android.content.Context context;
	 /* # direct methods */
	 public com.mobfox.sdk.MobFoxWebViewClient ( ) {
		 /* .locals 0 */
		 /* .param p1, "adServerViewCore" # Lcom/mobfox/sdk/MobFoxView; */
		 /* .param p2, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
		 /* .line 15 */
		 this.adServerViewCore = p1;
		 /* .line 16 */
		 this.context = p2;
		 /* .line 17 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p1, "view" # Landroid/webkit/WebView; */
		 /* .param p2, "url" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 41 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
