public class com.google.ads.mediation.admob.AdMobAdapter implements com.google.ads.mediation.MediationBannerAdapter implements com.google.ads.mediation.MediationInterstitialAdapter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/mediation/admob/AdMobAdapter$1;, */
	 /* Lcom/google/ads/mediation/admob/AdMobAdapter$b;, */
	 /* Lcom/google/ads/mediation/admob/AdMobAdapter$a; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Lcom/google/ads/mediation/MediationBannerAdapter", */
/* "<", */
/* "Lcom/google/ads/mediation/admob/AdMobAdapterExtras;", */
/* "Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters;", */
/* ">;", */
/* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
/* "<", */
/* "Lcom/google/ads/mediation/admob/AdMobAdapterExtras;", */
/* "Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
private com.google.ads.mediation.MediationBannerListener a;
private com.google.ads.mediation.MediationInterstitialListener b;
private com.google.ads.AdView c;
private com.google.ads.InterstitialAd d;
/* # direct methods */
public com.google.ads.mediation.admob.AdMobAdapter ( ) {
/* .locals 0 */
/* .prologue */
/* .line 25 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 298 */
return;
} // .end method
private com.google.ads.AdRequest a ( android.app.Activity p0, com.google.ads.mediation.admob.AdMobAdapterServerParameters p1, com.google.ads.mediation.MediationAdRequest p2, com.google.ads.mediation.admob.AdMobAdapterExtras p3 ) {
/* .locals 3 */
/* .prologue */
/* .line 88 */
/* new-instance v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* invoke-direct {v0, p4}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;-><init>(Lcom/google/ads/mediation/admob/AdMobAdapterExtras;)V */
/* .line 90 */
final String v1 = "_norefresh"; // const-string v1, "_norefresh"
final String v2 = "t"; // const-string v2, "t"
(( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).addExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->addExtra(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/ads/mediation/admob/AdMobAdapterExtras;
/* .line 92 */
v1 = this.allowHouseAds;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 93 */
	 final String v1 = "mad_hac"; // const-string v1, "mad_hac"
	 v2 = this.allowHouseAds;
	 (( com.google.ads.mediation.admob.AdMobAdapterExtras ) v0 ).addExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->addExtra(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/ads/mediation/admob/AdMobAdapterExtras;
	 /* .line 97 */
} // :cond_0
/* new-instance v1, Lcom/google/ads/AdRequest; */
/* invoke-direct {v1}, Lcom/google/ads/AdRequest;-><init>()V */
(( com.google.ads.mediation.MediationAdRequest ) p3 ).getBirthday ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/MediationAdRequest;->getBirthday()Ljava/util/Date;
(( com.google.ads.AdRequest ) v1 ).setBirthday ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/AdRequest;->setBirthday(Ljava/util/Date;)Lcom/google/ads/AdRequest;
(( com.google.ads.mediation.MediationAdRequest ) p3 ).getGender ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/MediationAdRequest;->getGender()Lcom/google/ads/AdRequest$Gender;
(( com.google.ads.AdRequest ) v1 ).setGender ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/AdRequest;->setGender(Lcom/google/ads/AdRequest$Gender;)Lcom/google/ads/AdRequest;
(( com.google.ads.mediation.MediationAdRequest ) p3 ).getKeywords ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/MediationAdRequest;->getKeywords()Ljava/util/Set;
(( com.google.ads.AdRequest ) v1 ).setKeywords ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/AdRequest;->setKeywords(Ljava/util/Set;)Lcom/google/ads/AdRequest;
(( com.google.ads.mediation.MediationAdRequest ) p3 ).getLocation ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/MediationAdRequest;->getLocation()Landroid/location/Location;
(( com.google.ads.AdRequest ) v1 ).setLocation ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/AdRequest;->setLocation(Landroid/location/Location;)Lcom/google/ads/AdRequest;
(( com.google.ads.AdRequest ) v1 ).setNetworkExtras ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/AdRequest;->setNetworkExtras(Lcom/google/ads/mediation/NetworkExtras;)Lcom/google/ads/AdRequest;
/* .line 104 */
v1 = (( com.google.ads.mediation.MediationAdRequest ) p3 ).isTesting ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/MediationAdRequest;->isTesting()Z
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 110 */
	 com.google.ads.util.AdUtil .a ( p1 );
	 (( com.google.ads.AdRequest ) v0 ).addTestDevice ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/AdRequest;->addTestDevice(Ljava/lang/String;)Lcom/google/ads/AdRequest;
	 /* .line 113 */
} // :cond_1
} // .end method
static com.google.ads.mediation.MediationBannerListener a ( com.google.ads.mediation.admob.AdMobAdapter p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 25 */
v0 = this.a;
} // .end method
private void a ( ) {
/* .locals 2 */
/* .prologue */
/* .line 60 */
v0 = /* invoke-direct {p0}, Lcom/google/ads/mediation/admob/AdMobAdapter;->b()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 61 */
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 final String v1 = "Adapter has already been destroyed"; // const-string v1, "Adapter has already been destroyed"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 63 */
} // :cond_0
return;
} // .end method
static com.google.ads.mediation.MediationInterstitialListener b ( com.google.ads.mediation.admob.AdMobAdapter p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 25 */
v0 = this.b;
} // .end method
private Boolean b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
v0 = this.c;
/* if-nez v0, :cond_0 */
v0 = this.d;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
protected com.google.ads.AdView a ( android.app.Activity p0, com.google.ads.AdSize p1, java.lang.String p2 ) {
/* .locals 1 */
/* .prologue */
/* .line 123 */
/* new-instance v0, Lcom/google/ads/AdView; */
/* invoke-direct {v0, p1, p2, p3}, Lcom/google/ads/AdView;-><init>(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V */
} // .end method
protected com.google.ads.InterstitialAd a ( android.app.Activity p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 127 */
/* new-instance v0, Lcom/google/ads/InterstitialAd; */
/* invoke-direct {v0, p1, p2}, Lcom/google/ads/InterstitialAd;-><init>(Landroid/app/Activity;Ljava/lang/String;)V */
} // .end method
public void destroy ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 216 */
/* invoke-direct {p0}, Lcom/google/ads/mediation/admob/AdMobAdapter;->a()V */
/* .line 219 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 220 */
v0 = this.c;
(( com.google.ads.AdView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Lcom/google/ads/AdView;->stopLoading()V
/* .line 221 */
v0 = this.c;
(( com.google.ads.AdView ) v0 ).destroy ( ); // invoke-virtual {v0}, Lcom/google/ads/AdView;->destroy()V
/* .line 222 */
this.c = v1;
/* .line 225 */
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 226 */
v0 = this.d;
(( com.google.ads.InterstitialAd ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Lcom/google/ads/InterstitialAd;->stopLoading()V
/* .line 227 */
this.d = v1;
/* .line 229 */
} // :cond_1
return;
} // .end method
public java.lang.Class getAdditionalParametersType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<", */
/* "Lcom/google/ads/mediation/admob/AdMobAdapterExtras;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 141 */
/* const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
} // .end method
public android.view.View getBannerView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 208 */
v0 = this.c;
} // .end method
public java.lang.Class getServerParametersType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<", */
/* "Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 149 */
/* const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters; */
} // .end method
public void requestBannerAd ( com.google.ads.mediation.MediationBannerListener p0, android.app.Activity p1, com.google.ads.mediation.MediationServerParameters p2, com.google.ads.AdSize p3, com.google.ads.mediation.MediationAdRequest p4, com.google.ads.mediation.NetworkExtras p5 ) { //bridge//synthethic
/* .locals 7 */
/* .param p1, "x0" # Lcom/google/ads/mediation/MediationBannerListener; */
/* .param p2, "x1" # Landroid/app/Activity; */
/* .param p3, "x2" # Lcom/google/ads/mediation/MediationServerParameters; */
/* .param p4, "x3" # Lcom/google/ads/AdSize; */
/* .param p5, "x4" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p6, "x5" # Lcom/google/ads/mediation/NetworkExtras; */
/* .prologue */
/* .line 25 */
/* move-object v3, p3 */
/* check-cast v3, Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters; */
/* move-object v6, p6 */
/* check-cast v6, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* invoke-virtual/range {v0 ..v6}, Lcom/google/ads/mediation/admob/AdMobAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/admob/AdMobAdapterExtras;)V */
return;
} // .end method
public void requestBannerAd ( com.google.ads.mediation.MediationBannerListener p0, android.app.Activity p1, com.google.ads.mediation.admob.AdMobAdapterServerParameters p2, com.google.ads.AdSize p3, com.google.ads.mediation.MediationAdRequest p4, com.google.ads.mediation.admob.AdMobAdapterExtras p5 ) {
/* .locals 3 */
/* .param p1, "listener" # Lcom/google/ads/mediation/MediationBannerListener; */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .param p3, "serverParameters" # Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters; */
/* .param p4, "adSize" # Lcom/google/ads/AdSize; */
/* .param p5, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p6, "extras" # Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* .prologue */
/* .line 163 */
this.a = p1;
/* .line 172 */
v0 = (( com.google.ads.AdSize ) p4 ).isAutoHeight ( ); // invoke-virtual {p4}, Lcom/google/ads/AdSize;->isAutoHeight()Z
/* if-nez v0, :cond_0 */
v0 = (( com.google.ads.AdSize ) p4 ).isFullWidth ( ); // invoke-virtual {p4}, Lcom/google/ads/AdSize;->isFullWidth()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 198 */
} // :cond_0
v0 = this.adUnitId;
(( com.google.ads.mediation.admob.AdMobAdapter ) p0 ).a ( p2, p4, v0 ); // invoke-virtual {p0, p2, p4, v0}, Lcom/google/ads/mediation/admob/AdMobAdapter;->a(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)Lcom/google/ads/AdView;
this.c = v0;
/* .line 199 */
v0 = this.c;
/* new-instance v1, Lcom/google/ads/mediation/admob/AdMobAdapter$a; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, p0, v2}, Lcom/google/ads/mediation/admob/AdMobAdapter$a;-><init>(Lcom/google/ads/mediation/admob/AdMobAdapter;Lcom/google/ads/mediation/admob/AdMobAdapter$1;)V */
(( com.google.ads.AdView ) v0 ).setAdListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/AdView;->setAdListener(Lcom/google/ads/AdListener;)V
/* .line 200 */
v0 = this.c;
/* invoke-direct {p0, p2, p3, p5, p6}, Lcom/google/ads/mediation/admob/AdMobAdapter;->a(Landroid/app/Activity;Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/admob/AdMobAdapterExtras;)Lcom/google/ads/AdRequest; */
(( com.google.ads.AdView ) v0 ).loadAd ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/AdView;->loadAd(Lcom/google/ads/AdRequest;)V
/* .line 201 */
} // :goto_0
return;
/* .line 180 */
} // :cond_1
if ( p6 != null) { // if-eqz p6, :cond_2
v0 = (( com.google.ads.mediation.admob.AdMobAdapterExtras ) p6 ).getUseExactAdSize ( ); // invoke-virtual {p6}, Lcom/google/ads/mediation/admob/AdMobAdapterExtras;->getUseExactAdSize()Z
/* if-nez v0, :cond_0 */
/* .line 183 */
} // :cond_2
int v0 = 5; // const/4 v0, 0x5
/* new-array v0, v0, [Lcom/google/ads/AdSize; */
int v1 = 0; // const/4 v1, 0x0
v2 = com.google.ads.AdSize.BANNER;
/* aput-object v2, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
v2 = com.google.ads.AdSize.IAB_BANNER;
/* aput-object v2, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
v2 = com.google.ads.AdSize.IAB_LEADERBOARD;
/* aput-object v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
v2 = com.google.ads.AdSize.IAB_MRECT;
/* aput-object v2, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
v2 = com.google.ads.AdSize.IAB_WIDE_SKYSCRAPER;
/* aput-object v2, v0, v1 */
(( com.google.ads.AdSize ) p4 ).findBestSize ( v0 ); // invoke-virtual {p4, v0}, Lcom/google/ads/AdSize;->findBestSize([Lcom/google/ads/AdSize;)Lcom/google/ads/AdSize;
/* .line 191 */
/* if-nez p4, :cond_0 */
/* .line 192 */
v0 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
} // .end method
public void requestInterstitialAd ( com.google.ads.mediation.MediationInterstitialListener p0, android.app.Activity p1, com.google.ads.mediation.MediationServerParameters p2, com.google.ads.mediation.MediationAdRequest p3, com.google.ads.mediation.NetworkExtras p4 ) { //bridge//synthethic
/* .locals 6 */
/* .param p1, "x0" # Lcom/google/ads/mediation/MediationInterstitialListener; */
/* .param p2, "x1" # Landroid/app/Activity; */
/* .param p3, "x2" # Lcom/google/ads/mediation/MediationServerParameters; */
/* .param p4, "x3" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p5, "x4" # Lcom/google/ads/mediation/NetworkExtras; */
/* .prologue */
/* .line 25 */
/* move-object v3, p3 */
/* check-cast v3, Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters; */
/* move-object v5, p5 */
/* check-cast v5, Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/google/ads/mediation/admob/AdMobAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/admob/AdMobAdapterExtras;)V */
return;
} // .end method
public void requestInterstitialAd ( com.google.ads.mediation.MediationInterstitialListener p0, android.app.Activity p1, com.google.ads.mediation.admob.AdMobAdapterServerParameters p2, com.google.ads.mediation.MediationAdRequest p3, com.google.ads.mediation.admob.AdMobAdapterExtras p4 ) {
/* .locals 3 */
/* .param p1, "listener" # Lcom/google/ads/mediation/MediationInterstitialListener; */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .param p3, "serverParameters" # Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters; */
/* .param p4, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p5, "extras" # Lcom/google/ads/mediation/admob/AdMobAdapterExtras; */
/* .prologue */
/* .line 242 */
this.b = p1;
/* .line 244 */
v0 = this.adUnitId;
(( com.google.ads.mediation.admob.AdMobAdapter ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/google/ads/mediation/admob/AdMobAdapter;->a(Landroid/app/Activity;Ljava/lang/String;)Lcom/google/ads/InterstitialAd;
this.d = v0;
/* .line 245 */
v0 = this.d;
/* new-instance v1, Lcom/google/ads/mediation/admob/AdMobAdapter$b; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, p0, v2}, Lcom/google/ads/mediation/admob/AdMobAdapter$b;-><init>(Lcom/google/ads/mediation/admob/AdMobAdapter;Lcom/google/ads/mediation/admob/AdMobAdapter$1;)V */
(( com.google.ads.InterstitialAd ) v0 ).setAdListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/InterstitialAd;->setAdListener(Lcom/google/ads/AdListener;)V
/* .line 246 */
v0 = this.d;
/* invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/ads/mediation/admob/AdMobAdapter;->a(Landroid/app/Activity;Lcom/google/ads/mediation/admob/AdMobAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/admob/AdMobAdapterExtras;)Lcom/google/ads/AdRequest; */
(( com.google.ads.InterstitialAd ) v0 ).loadAd ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/InterstitialAd;->loadAd(Lcom/google/ads/AdRequest;)V
/* .line 247 */
return;
} // .end method
public void showInterstitial ( ) {
/* .locals 1 */
/* .prologue */
/* .line 251 */
v0 = this.d;
(( com.google.ads.InterstitialAd ) v0 ).show ( ); // invoke-virtual {v0}, Lcom/google/ads/InterstitialAd;->show()V
/* .line 252 */
return;
} // .end method
