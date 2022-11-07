public class com.natenai.virtualhorseracing3d.VirtualHorseRacing3D extends com.natenai.jniutil.NateBaseActivity {
	 /* .source "VirtualHorseRacing3D.java" */
	 /* # direct methods */
	 public com.natenai.virtualhorseracing3d.VirtualHorseRacing3D ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/natenai/jniutil/NateBaseActivity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 4 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 18 */
		 final String v0 = "Virtual Horse Racing 3D"; // const-string v0, "Virtual Horse Racing 3D"
		 /* .line 19 */
		 final String v0 = "1385f87dba13440b"; // const-string v0, "1385f87dba13440b"
		 /* .line 20 */
		 com.natenai.jniutil.NateAdsManager.natenaiAdMobMediation_UseSmartBanner = (v3!= 0);
		 /* .line 21 */
		 final String v0 = "139a01ce920c4819"; // const-string v0, "139a01ce920c4819"
		 /* .line 22 */
		 /* const-wide/16 v0, 0x3e8 */
		 /* sput-wide v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDelayMillisecsBeforeShowingInterstitialAd:J */
		 /* .line 23 */
		 /* const-wide/32 v0, 0x2932e00 */
		 /* sput-wide v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiRequestInterstitialPeriodMillis:J */
		 /* .line 27 */
		 com.natenai.jniutil.NateAdsManager.natenaiAdMobMediation_UseSmartBanner = (v2!= 0);
		 /* .line 42 */
		 /* const/high16 v0, 0x7f030000 */
		 /* .line 43 */
		 /* const v0, 0x7f050001 */
		 /* .line 44 */
		 /* const/high16 v0, 0x7f050000 */
		 /* .line 46 */
		 com.natenai.jniutil.NateGameJNIUtilLib.DrawFillScreen = (v3!= 0);
		 /* .line 47 */
		 com.natenai.jniutil.NateGameJNIUtilLib.DrawFromTop2Bottom = (v2!= 0);
		 /* .line 49 */
		 /* invoke-super {p0, p1}, Lcom/natenai/jniutil/NateBaseActivity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 53 */
		 com.natenai.jniutil.NateAdsManager .getInstance ( );
		 (( com.natenai.jniutil.NateAdsManager ) v0 ).initializeAds ( ); // invoke-virtual {v0}, Lcom/natenai/jniutil/NateAdsManager;->initializeAds()V
		 /* .line 55 */
		 com.natenai.jniutil.NateGameJNIUtilLib .set_ad_view_visibility ( v2 );
		 /* .line 56 */
		 return;
	 } // .end method
