public class inal implements com.google.ads.mediation.MediationBannerAdapter implements com.google.ads.mediation.MediationInterstitialAdapter {
	 /* .source "MobFoxAdapter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Lcom/google/ads/mediation/MediationBannerAdapter", */
	 /* "<", */
	 /* "Lcom/mobfox/adapter/MobFoxExtras;", */
	 /* "Lcom/mobfox/adapter/MobFoxServerParameters;", */
	 /* ">;", */
	 /* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
	 /* "<", */
	 /* "Lcom/mobfox/adapter/MobFoxExtras;", */
	 /* "Lcom/mobfox/adapter/MobFoxServerParameters;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
private com.google.ads.mediation.MediationBannerListener bannerListener;
private com.google.ads.mediation.MediationInterstitialListener interstitialListener;
private com.mobfox.video.sdk.MobFoxAdManager mMobfoxManager;
private com.mobfox.sdk.MobFoxView mobfoxView;
/* # direct methods */
public inal ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 29 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
static com.google.ads.mediation.MediationBannerListener access$2 ( com.mobfox.adapter.MobFoxAdapter p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 37 */
	 v0 = this.bannerListener;
} // .end method
static com.google.ads.mediation.MediationInterstitialListener access$3 ( com.mobfox.adapter.MobFoxAdapter p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 38 */
	 v0 = this.interstitialListener;
} // .end method
private Float dip2pixel ( Integer p0, android.content.Context p1 ) {
	 /* .locals 5 */
	 /* .param p1, "dip" # I */
	 /* .param p2, "context" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 234 */
	 (( android.content.Context ) p2 ).getResources ( ); // invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 /* .line 235 */
	 /* .local v1, "r":Landroid/content/res/Resources; */
	 int v2 = 1; // const/4 v2, 0x1
	 /* int-to-float v3, p1 */
	 /* .line 236 */
	 (( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* .line 235 */
	 v0 = 	 android.util.TypedValue .applyDimension ( v2,v3,v4 );
	 /* .line 238 */
	 /* .local v0, "px":F */
} // .end method
/* # virtual methods */
public void destroy ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 213 */
	 this.bannerListener = v0;
	 /* .line 214 */
	 this.interstitialListener = v0;
	 /* .line 215 */
	 return;
} // .end method
public java.lang.Class getAdditionalParametersType ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()", */
	 /* "Ljava/lang/Class", */
	 /* "<", */
	 /* "Lcom/mobfox/adapter/MobFoxExtras;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 54 */
/* const-class v0, Lcom/mobfox/adapter/MobFoxExtras; */
} // .end method
public android.view.View getBannerView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 221 */
v0 = this.mobfoxView;
} // .end method
public java.lang.Class getServerParametersType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<", */
/* "Lcom/mobfox/adapter/MobFoxServerParameters;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 59 */
/* const-class v0, Lcom/mobfox/adapter/MobFoxServerParameters; */
} // .end method
public void requestBannerAd ( com.google.ads.mediation.MediationBannerListener p0, android.app.Activity p1, com.google.ads.mediation.MediationServerParameters p2, com.google.ads.AdSize p3, com.google.ads.mediation.MediationAdRequest p4, com.google.ads.mediation.NetworkExtras p5 ) { //bridge//synthethic
/* .locals 7 */
/* .prologue */
/* .line 1 */
/* move-object v3, p3 */
/* check-cast v3, Lcom/mobfox/adapter/MobFoxServerParameters; */
/* move-object v6, p6 */
/* check-cast v6, Lcom/mobfox/adapter/MobFoxExtras; */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* invoke-virtual/range {v0 ..v6}, Lcom/mobfox/adapter/MobFoxAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/mobfox/adapter/MobFoxServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/mobfox/adapter/MobFoxExtras;)V */
return;
} // .end method
public void requestBannerAd ( com.google.ads.mediation.MediationBannerListener p0, android.app.Activity p1, com.mobfox.adapter.MobFoxServerParameters p2, com.google.ads.AdSize p3, com.google.ads.mediation.MediationAdRequest p4, com.mobfox.adapter.MobFoxExtras p5 ) {
/* .locals 9 */
/* .param p1, "listener" # Lcom/google/ads/mediation/MediationBannerListener; */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .param p3, "serverParameters" # Lcom/mobfox/adapter/MobFoxServerParameters; */
/* .param p4, "adSize" # Lcom/google/ads/AdSize; */
/* .param p5, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p6, "extras" # Lcom/mobfox/adapter/MobFoxExtras; */
/* .prologue */
/* .line 70 */
this.bannerListener = p1;
/* .line 77 */
/* new-instance v6, Lcom/google/ads/AdSize; */
/* const/16 v0, 0x140 */
/* const/16 v1, 0x32 */
/* invoke-direct {v6, v0, v1}, Lcom/google/ads/AdSize;-><init>(II)V */
/* .line 78 */
/* .local v6, "MOBFOX_BANNER_SIZE":Lcom/google/ads/AdSize; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Lcom/google/ads/AdSize; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object v6, v0, v1 */
(( com.google.ads.AdSize ) p4 ).findBestSize ( v0 ); // invoke-virtual {p4, v0}, Lcom/google/ads/AdSize;->findBestSize([Lcom/google/ads/AdSize;)Lcom/google/ads/AdSize;
/* .line 80 */
/* .local v7, "best":Lcom/google/ads/AdSize; */
/* if-eq v7, v6, :cond_0 */
/* .line 81 */
v0 = this.bannerListener;
/* .line 82 */
v1 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
/* .line 81 */
/* .line 142 */
} // :goto_0
return;
/* .line 86 */
} // :cond_0
if ( p6 != null) { // if-eqz p6, :cond_1
/* .line 87 */
/* new-instance v0, Lcom/mobfox/sdk/MobFoxView; */
v2 = this.pubIdNumber;
/* .line 88 */
v3 = com.mobfox.sdk.Mode.LIVE;
v4 = (( com.mobfox.adapter.MobFoxExtras ) p6 ).getLocation ( ); // invoke-virtual {p6}, Lcom/mobfox/adapter/MobFoxExtras;->getLocation()Z
v5 = (( com.mobfox.adapter.MobFoxExtras ) p6 ).getAnimation ( ); // invoke-virtual {p6}, Lcom/mobfox/adapter/MobFoxExtras;->getAnimation()Z
/* move-object v1, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/mobfox/sdk/MobFoxView;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/mobfox/sdk/Mode;ZZ)V */
/* .line 87 */
this.mobfoxView = v0;
/* .line 94 */
} // :goto_1
/* const/16 v0, 0x32 */
v0 = /* invoke-direct {p0, v0, p2}, Lcom/mobfox/adapter/MobFoxAdapter;->dip2pixel(ILandroid/content/Context;)F */
/* float-to-int v8, v0 */
/* .line 96 */
/* .local v8, "height":I */
v0 = this.mobfoxView;
/* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
/* .line 97 */
int v2 = -1; // const/4 v2, -0x1
/* invoke-direct {v1, v2, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 96 */
(( com.mobfox.sdk.MobFoxView ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/sdk/MobFoxView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 98 */
v0 = this.mobfoxView;
/* new-instance v1, Lcom/mobfox/adapter/MobFoxAdapter$1; */
/* invoke-direct {v1, p0}, Lcom/mobfox/adapter/MobFoxAdapter$1;-><init>(Lcom/mobfox/adapter/MobFoxAdapter;)V */
(( com.mobfox.sdk.MobFoxView ) v0 ).setBannerListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/sdk/MobFoxView;->setBannerListener(Lcom/mobfox/sdk/BannerListener;)V
/* .line 137 */
v0 = this.mobfoxView;
(( com.mobfox.sdk.MobFoxView ) v0 ).loadNextAd ( ); // invoke-virtual {v0}, Lcom/mobfox/sdk/MobFoxView;->loadNextAd()V
/* .line 141 */
v0 = this.mobfoxView;
(( com.mobfox.sdk.MobFoxView ) v0 ).pause ( ); // invoke-virtual {v0}, Lcom/mobfox/sdk/MobFoxView;->pause()V
/* .line 90 */
} // .end local v8 # "height":I
} // :cond_1
/* new-instance v0, Lcom/mobfox/sdk/MobFoxView; */
v2 = this.pubIdNumber;
/* .line 91 */
v3 = com.mobfox.sdk.Mode.LIVE;
int v4 = 1; // const/4 v4, 0x1
int v5 = 1; // const/4 v5, 0x1
/* move-object v1, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/mobfox/sdk/MobFoxView;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/mobfox/sdk/Mode;ZZ)V */
/* .line 90 */
this.mobfoxView = v0;
} // .end method
public void requestInterstitialAd ( com.google.ads.mediation.MediationInterstitialListener p0, android.app.Activity p1, com.google.ads.mediation.MediationServerParameters p2, com.google.ads.mediation.MediationAdRequest p3, com.google.ads.mediation.NetworkExtras p4 ) { //bridge//synthethic
/* .locals 6 */
/* .prologue */
/* .line 1 */
/* move-object v3, p3 */
/* check-cast v3, Lcom/mobfox/adapter/MobFoxServerParameters; */
/* move-object v5, p5 */
/* check-cast v5, Lcom/mobfox/adapter/MobFoxExtras; */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/mobfox/adapter/MobFoxAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/mobfox/adapter/MobFoxServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/mobfox/adapter/MobFoxExtras;)V */
return;
} // .end method
public void requestInterstitialAd ( com.google.ads.mediation.MediationInterstitialListener p0, android.app.Activity p1, com.mobfox.adapter.MobFoxServerParameters p2, com.google.ads.mediation.MediationAdRequest p3, com.mobfox.adapter.MobFoxExtras p4 ) {
/* .locals 4 */
/* .param p1, "listener" # Lcom/google/ads/mediation/MediationInterstitialListener; */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .param p3, "serverParameters" # Lcom/mobfox/adapter/MobFoxServerParameters; */
/* .param p4, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p5, "extras" # Lcom/mobfox/adapter/MobFoxExtras; */
/* .prologue */
/* .line 148 */
this.interstitialListener = p1;
/* .line 153 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxAdManager; */
/* .line 154 */
v1 = this.pubIdNumber;
v2 = (( com.mobfox.adapter.MobFoxExtras ) p5 ).getLocation ( ); // invoke-virtual {p5}, Lcom/mobfox/adapter/MobFoxExtras;->getLocation()Z
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v0, p2, v1, v2, v3}, Lcom/mobfox/video/sdk/MobFoxAdManager;-><init>(Landroid/content/Context;Ljava/lang/String;ZZ)V */
/* .line 153 */
this.mMobfoxManager = v0;
/* .line 156 */
v0 = this.mMobfoxManager;
/* new-instance v1, Lcom/mobfox/adapter/MobFoxAdapter$2; */
/* invoke-direct {v1, p0}, Lcom/mobfox/adapter/MobFoxAdapter$2;-><init>(Lcom/mobfox/adapter/MobFoxAdapter;)V */
(( com.mobfox.video.sdk.MobFoxAdManager ) v0 ).setListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxAdManager;->setListener(Lcom/mobfox/video/sdk/MobFoxAdListener;)V
/* .line 196 */
v0 = this.mMobfoxManager;
(( com.mobfox.video.sdk.MobFoxAdManager ) v0 ).requestAd ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->requestAd()V
/* .line 197 */
return;
} // .end method
public void showInterstitial ( ) {
/* .locals 1 */
/* .prologue */
/* .line 204 */
v0 = this.mMobfoxManager;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 205 */
v0 = this.mMobfoxManager;
(( com.mobfox.video.sdk.MobFoxAdManager ) v0 ).showAd ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxAdManager;->showAd()V
/* .line 207 */
} // :cond_0
return;
} // .end method
