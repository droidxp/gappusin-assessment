class com.mobfox.sdk.ReloadTask extends java.util.TimerTask {
	 /* .source "ReloadTask.java" */
	 /* # instance fields */
	 private final com.mobfox.sdk.MobFoxView mobFoxWebView;
	 /* # direct methods */
	 public com.mobfox.sdk.ReloadTask ( ) {
		 /* .locals 0 */
		 /* .param p1, "mobFoxWebView" # Lcom/mobfox/sdk/MobFoxView; */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
		 /* .line 10 */
		 this.mobFoxWebView = p1;
		 /* .line 11 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 15 */
		 v0 = this.mobFoxWebView;
		 (( com.mobfox.sdk.MobFoxView ) v0 ).loadNextAd ( ); // invoke-virtual {v0}, Lcom/mobfox/sdk/MobFoxView;->loadNextAd()V
		 /* .line 16 */
		 return;
	 } // .end method
