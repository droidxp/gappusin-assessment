public class de.nurogames.android.ticb.base.CBMngr {
	 /* .source "CBMngr.java" */
	 /* # instance fields */
	 android.app.Activity m_act;
	 com.chartboost.sdk.ChartBoost m_cb;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.CBMngr ( ) {
		 /* .locals 2 */
		 /* .param p1, "act" # Landroid/app/Activity; */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 25 */
		 this.m_act = p1;
		 /* .line 27 */
		 v0 = this.m_act;
		 com.chartboost.sdk.ChartBoost .getSharedChartBoost ( v0 );
		 this.m_cb = v0;
		 /* .line 28 */
		 v0 = this.m_cb;
		 /* const/16 v1, 0xfa */
		 (( com.chartboost.sdk.ChartBoost ) v0 ).setConnectionTimeout ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/ChartBoost;->setConnectionTimeout(I)V
		 /* .line 29 */
		 v0 = this.m_cb;
		 v1 = de.nurogames.android.ticb.base.core.AppResources.CHART_BOOST_ID;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).setAppId ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/ChartBoost;->setAppId(Ljava/lang/String;)V
		 /* .line 30 */
		 v0 = this.m_cb;
		 v1 = de.nurogames.android.ticb.base.core.AppResources.CHART_BOOST_SIGNATURE;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).setAppSignature ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/ChartBoost;->setAppSignature(Ljava/lang/String;)V
		 /* .line 32 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void cacheAndshowInterstitial ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 77 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).cacheInterstitial ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->cacheInterstitial()V
		 /* .line 78 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).showInterstitial ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->showInterstitial()V
		 /* .line 79 */
		 return;
	 } // .end method
	 public void cacheAndshowMoreApps ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 94 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).cacheMoreApps ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->cacheMoreApps()V
		 /* .line 95 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).showMoreApps ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->showMoreApps()V
		 /* .line 96 */
		 return;
	 } // .end method
	 public void cacheInterstitial ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 74 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).cacheInterstitial ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->cacheInterstitial()V
		 /* .line 75 */
		 return;
	 } // .end method
	 public void cacheMoreApps ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 91 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).cacheMoreApps ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->cacheMoreApps()V
		 /* .line 92 */
		 return;
	 } // .end method
	 public com.chartboost.sdk.ChartBoostDelegate getDelegate ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 56 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).getDelegate ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
	 } // .end method
	 public Boolean hasCachedInterstitial ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 81 */
		 v0 = this.m_cb;
		 v0 = 		 (( com.chartboost.sdk.ChartBoost ) v0 ).hasCachedMoreApps ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->hasCachedMoreApps()Z
	 } // .end method
	 public Boolean hasCachedMoreApps ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 98 */
		 v0 = this.m_cb;
		 v0 = 		 (( com.chartboost.sdk.ChartBoost ) v0 ).hasCachedInterstitial ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->hasCachedInterstitial()Z
	 } // .end method
	 public void notifyInstall ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 64 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).install ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->install()V
		 /* .line 65 */
		 return;
	 } // .end method
	 public void onResume ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 105 */
		 v0 = this.m_act;
		 com.chartboost.sdk.ChartBoost .getSharedChartBoost ( v0 );
		 /* .line 106 */
		 return;
	 } // .end method
	 public void setDelegate ( com.chartboost.sdk.ChartBoostDelegate p0 ) {
		 /* .locals 1 */
		 /* .param p1, "cbd" # Lcom/chartboost/sdk/ChartBoostDelegate; */
		 /* .prologue */
		 /* .line 38 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).setDelegate ( p1 ); // invoke-virtual {v0, p1}, Lcom/chartboost/sdk/ChartBoost;->setDelegate(Lcom/chartboost/sdk/ChartBoostDelegate;)V
		 /* .line 54 */
		 return;
	 } // .end method
	 public void showInterstitial ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 71 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).showInterstitial ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->showInterstitial()V
		 /* .line 72 */
		 return;
	 } // .end method
	 public void showMoreApps ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 88 */
		 v0 = this.m_cb;
		 (( com.chartboost.sdk.ChartBoost ) v0 ).showMoreApps ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->showMoreApps()V
		 /* .line 89 */
		 return;
	 } // .end method
