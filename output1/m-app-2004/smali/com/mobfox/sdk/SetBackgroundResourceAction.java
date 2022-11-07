class com.mobfox.sdk.SetBackgroundResourceAction implements java.lang.Runnable {
	 /* .source "SetBackgroundResourceAction.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private Integer backgroundResource;
	 private android.webkit.WebView view;
	 /* # direct methods */
	 public com.mobfox.sdk.SetBackgroundResourceAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "view" # Landroid/webkit/WebView; */
		 /* .param p2, "backgroundResource" # I */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 10 */
		 this.view = p1;
		 /* .line 11 */
		 /* iput p2, p0, Lcom/mobfox/sdk/SetBackgroundResourceAction;->backgroundResource:I */
		 /* .line 12 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 17 */
		 try { // :try_start_0
			 v0 = this.view;
			 /* iget v1, p0, Lcom/mobfox/sdk/SetBackgroundResourceAction;->backgroundResource:I */
			 (( android.webkit.WebView ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundResource(I)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 20 */
		 } // :goto_0
		 return;
		 /* .line 18 */
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
