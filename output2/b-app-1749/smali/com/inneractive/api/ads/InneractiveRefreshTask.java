class com.inneractive.api.ads.InneractiveRefreshTask extends java.util.TimerTask {
	 /* .source "InneractiveRefreshTask.java" */
	 /* # instance fields */
	 private com.inneractive.api.ads.InneractiveAdView iaView;
	 /* # direct methods */
	 public com.inneractive.api.ads.InneractiveRefreshTask ( ) {
		 /* .locals 0 */
		 /* .param p1, "iaView" # Lcom/inneractive/api/ads/InneractiveAdView; */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
		 /* .line 12 */
		 this.iaView = p1;
		 /* .line 13 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 17 */
		 v0 = this.iaView;
		 (( com.inneractive.api.ads.InneractiveAdView ) v0 ).createAdRequest ( ); // invoke-virtual {v0}, Lcom/inneractive/api/ads/InneractiveAdView;->createAdRequest()V
		 /* .line 18 */
		 v0 = this.iaView;
		 (( com.inneractive.api.ads.InneractiveAdView ) v0 ).requestAd ( ); // invoke-virtual {v0}, Lcom/inneractive/api/ads/InneractiveAdView;->requestAd()V
		 /* .line 19 */
		 return;
	 } // .end method
