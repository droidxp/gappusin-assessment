public class inal implements com.google.ads.mediation.MediationInterstitialAdapter implements com.google.ads.mediation.MediationBannerAdapter {
	 /* .source "JumpTapAdapter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/mediation/jumptap/JumpTapAdapter$BannerListener;, */
	 /* Lcom/google/ads/mediation/jumptap/JumpTapAdapter$CleanJtAdWidgetSettings;, */
	 /* Lcom/google/ads/mediation/jumptap/JumpTapAdapter$InterstitialListener; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
/* "<", */
/* "Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;", */
/* "Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters;", */
/* ">;", */
/* "Lcom/google/ads/mediation/MediationBannerAdapter", */
/* "<", */
/* "Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;", */
/* "Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static $SWITCH_TABLE$com$google$ads$AdRequest$Gender; //synthetic
/* # instance fields */
private com.jumptap.adtag.JtAdView adView;
private com.google.ads.mediation.MediationBannerListener bannerListener;
private com.jumptap.adtag.JtAdInterstitial interstitial;
private com.google.ads.mediation.MediationInterstitialListener interstitialListener;
/* # direct methods */
static $SWITCH_TABLE$com$google$ads$AdRequest$Gender ( ) { //synthethic
/* .locals 3 */
/* .prologue */
/* .line 25 */
v0 = com.google.ads.mediation.jumptap.JumpTapAdapter.$SWITCH_TABLE$com$google$ads$AdRequest$Gender;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
} // :cond_0
com.google.ads.AdRequest$Gender .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
v1 = com.google.ads.AdRequest$Gender.FEMALE;
v1 = (( com.google.ads.AdRequest$Gender ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/google/ads/AdRequest$Gender;->ordinal()I
int v2 = 3; // const/4 v2, 0x3
/* aput v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_2 */
} // :goto_1
try { // :try_start_1
v1 = com.google.ads.AdRequest$Gender.MALE;
v1 = (( com.google.ads.AdRequest$Gender ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/google/ads/AdRequest$Gender;->ordinal()I
int v2 = 2; // const/4 v2, 0x2
/* aput v2, v0, v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
} // :goto_2
try { // :try_start_2
v1 = com.google.ads.AdRequest$Gender.UNKNOWN;
v1 = (( com.google.ads.AdRequest$Gender ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/google/ads/AdRequest$Gender;->ordinal()I
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v0, v1 */
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_0 */
} // :goto_3
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
/* :catch_2 */
/* move-exception v1 */
} // .end method
public inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 25 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.google.ads.mediation.MediationBannerListener access$2 ( com.google.ads.mediation.jumptap.JumpTapAdapter p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 49 */
v0 = this.bannerListener;
} // .end method
static com.google.ads.mediation.MediationInterstitialListener access$3 ( com.google.ads.mediation.jumptap.JumpTapAdapter p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 50 */
v0 = this.interstitialListener;
} // .end method
private com.jumptap.adtag.JtAdWidgetSettings buildSettings ( com.google.ads.mediation.jumptap.JumpTapAdapterServerParameters p0, com.google.ads.mediation.MediationAdRequest p1, com.google.ads.mediation.jumptap.JumpTapAdapterExtras p2 ) {
/* .locals 3 */
/* .param p1, "serverParameters" # Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters; */
/* .param p2, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p3, "extras" # Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras; */
/* .prologue */
/* .line 61 */
/* if-nez p3, :cond_0 */
/* .line 62 */
/* new-instance p3, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras; */
} // .end local p3 # "extras":Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;
/* invoke-direct {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;-><init>()V */
/* .line 65 */
/* .restart local p3 # "extras":Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras; */
} // :cond_0
/* new-instance v0, Lcom/google/ads/mediation/jumptap/JumpTapAdapter$CleanJtAdWidgetSettings; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Lcom/google/ads/mediation/jumptap/JumpTapAdapter$CleanJtAdWidgetSettings;-><init>(Lcom/google/ads/mediation/jumptap/JumpTapAdapter$CleanJtAdWidgetSettings;)V */
/* .line 67 */
/* .local v0, "settings":Lcom/jumptap/adtag/JtAdWidgetSettings; */
int v1 = 0; // const/4 v1, 0x0
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setRefreshPeriod ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setRefreshPeriod(I)V
/* .line 69 */
v1 = this.publisherId;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setPublisherId ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setPublisherId(Ljava/lang/String;)V
/* .line 70 */
v1 = this.spotId;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setSpotId ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setSpotId(Ljava/lang/String;)V
/* .line 71 */
v1 = this.siteId;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setSiteId ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setSiteId(Ljava/lang/String;)V
/* .line 73 */
final String v1 = "GWhirl Adapter"; // const-string v1, "GWhirl Adapter"
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setApplicationId ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setApplicationId(Ljava/lang/String;)V
/* .line 74 */
final String v1 = "1.2.3"; // const-string v1, "1.2.3"
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setApplicationVersion ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setApplicationVersion(Ljava/lang/String;)V
/* .line 77 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getAdultContent ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getAdultContent()Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras$AdultContent;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 78 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getAdultContent ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getAdultContent()Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras$AdultContent;
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras$AdultContent ) v1 ).getDescription ( ); // invoke-virtual {v1}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras$AdultContent;->getDescription()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setAdultContentType ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setAdultContentType(Ljava/lang/String;)V
/* .line 82 */
} // :cond_1
(( com.google.ads.mediation.MediationAdRequest ) p2 ).getAgeInYears ( ); // invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getAgeInYears()Ljava/lang/Integer;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 83 */
(( com.google.ads.mediation.MediationAdRequest ) p2 ).getAgeInYears ( ); // invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getAgeInYears()Ljava/lang/Integer;
(( java.lang.Integer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setAge ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setAge(Ljava/lang/String;)V
/* .line 87 */
} // :cond_2
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getApplicationId ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getApplicationId()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 88 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getApplicationId ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getApplicationId()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setApplicationId ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setApplicationId(Ljava/lang/String;)V
/* .line 92 */
} // :cond_3
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getApplicationVersion ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getApplicationVersion()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 93 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getApplicationVersion ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getApplicationVersion()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setApplicationVersion ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setApplicationVersion(Ljava/lang/String;)V
/* .line 97 */
} // :cond_4
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getCountry ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getCountry()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 98 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getCountry ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getCountry()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setCountry ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setCountry(Ljava/lang/String;)V
/* .line 102 */
} // :cond_5
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getDismissButtonLabel ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getDismissButtonLabel()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 103 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getDismissButtonLabel ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getDismissButtonLabel()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setDismissButtonLabel ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setDismissButtonLabel(Ljava/lang/String;)V
/* .line 107 */
} // :cond_6
(( com.google.ads.mediation.MediationAdRequest ) p2 ).getGender ( ); // invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getGender()Lcom/google/ads/AdRequest$Gender;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 108 */
com.google.ads.mediation.jumptap.JumpTapAdapter .$SWITCH_TABLE$com$google$ads$AdRequest$Gender ( );
(( com.google.ads.mediation.MediationAdRequest ) p2 ).getGender ( ); // invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getGender()Lcom/google/ads/AdRequest$Gender;
v2 = (( com.google.ads.AdRequest$Gender ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lcom/google/ads/AdRequest$Gender;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_0 */
/* .line 120 */
} // :cond_7
} // :goto_0
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getIncome ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getIncome()Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras$Income;
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 121 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getIncome ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getIncome()Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras$Income;
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras$Income ) v1 ).getDescription ( ); // invoke-virtual {v1}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras$Income;->getDescription()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setHHI ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setHHI(Ljava/lang/String;)V
/* .line 125 */
} // :cond_8
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getLanguage ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getLanguage()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 126 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getLanguage ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getLanguage()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setLanguage ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setLanguage(Ljava/lang/String;)V
/* .line 130 */
} // :cond_9
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getPostalCode ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getPostalCode()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 131 */
(( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getPostalCode ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getPostalCode()Ljava/lang/String;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setPostalCode ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setPostalCode(Ljava/lang/String;)V
/* .line 135 */
} // :cond_a
v1 = (( com.google.ads.mediation.jumptap.JumpTapAdapterExtras ) p3 ).getShouldSendLocation ( ); // invoke-virtual {p3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;->getShouldSendLocation()Z
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setShouldSendLocation ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setShouldSendLocation(Z)V
/* .line 137 */
/* .line 110 */
/* :pswitch_0 */
final String v1 = "m"; // const-string v1, "m"
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setGender ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setGender(Ljava/lang/String;)V
/* .line 114 */
/* :pswitch_1 */
final String v1 = "f"; // const-string v1, "f"
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).setGender ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setGender(Ljava/lang/String;)V
/* .line 108 */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public void destroy ( ) {
/* .locals 0 */
/* .prologue */
/* .line 205 */
return;
} // .end method
public java.lang.Class getAdditionalParametersType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<", */
/* "Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 152 */
/* const-class v0, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras; */
} // .end method
public android.view.View getBannerView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 209 */
v0 = this.adView;
} // .end method
public java.lang.Class getServerParametersType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<", */
/* "Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 157 */
/* const-class v0, Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters; */
} // .end method
public void requestBannerAd ( com.google.ads.mediation.MediationBannerListener p0, android.app.Activity p1, com.google.ads.mediation.MediationServerParameters p2, com.google.ads.AdSize p3, com.google.ads.mediation.MediationAdRequest p4, com.google.ads.mediation.NetworkExtras p5 ) { //bridge//synthethic
/* .locals 7 */
/* .prologue */
/* .line 1 */
/* move-object v3, p3 */
/* check-cast v3, Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters; */
/* move-object v6, p6 */
/* check-cast v6, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras; */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* invoke-virtual/range {v0 ..v6}, Lcom/google/ads/mediation/jumptap/JumpTapAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;)V */
return;
} // .end method
public void requestBannerAd ( com.google.ads.mediation.MediationBannerListener p0, android.app.Activity p1, com.google.ads.mediation.jumptap.JumpTapAdapterServerParameters p2, com.google.ads.AdSize p3, com.google.ads.mediation.MediationAdRequest p4, com.google.ads.mediation.jumptap.JumpTapAdapterExtras p5 ) {
/* .locals 4 */
/* .param p1, "listener" # Lcom/google/ads/mediation/MediationBannerListener; */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .param p3, "serverParameters" # Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters; */
/* .param p4, "adSize" # Lcom/google/ads/AdSize; */
/* .param p5, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p6, "extras" # Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras; */
/* .prologue */
/* .line 167 */
this.bannerListener = p1;
/* .line 170 */
try { // :try_start_0
/* new-instance v1, Lcom/jumptap/adtag/JtAdView; */
/* invoke-direct {p0, p3, p5, p6}, Lcom/google/ads/mediation/jumptap/JumpTapAdapter;->buildSettings(Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;)Lcom/jumptap/adtag/JtAdWidgetSettings; */
/* invoke-direct {v1, p2, v2}, Lcom/jumptap/adtag/JtAdView;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/JtAdWidgetSettings;)V */
this.adView = v1;
/* .line 171 */
v1 = this.adView;
/* new-instance v2, Lcom/google/ads/mediation/jumptap/JumpTapAdapter$BannerListener; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, p0, v3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapter$BannerListener;-><init>(Lcom/google/ads/mediation/jumptap/JumpTapAdapter;Lcom/google/ads/mediation/jumptap/JumpTapAdapter$BannerListener;)V */
(( com.jumptap.adtag.JtAdView ) v1 ).setAdViewListener ( v2 ); // invoke-virtual {v1, v2}, Lcom/jumptap/adtag/JtAdView;->setAdViewListener(Lcom/jumptap/adtag/JtAdViewListener;)V
/* .line 172 */
v1 = this.adView;
(( com.jumptap.adtag.JtAdView ) v1 ).refreshAd ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdView;->refreshAd()V
/* :try_end_0 */
/* .catch Lcom/jumptap/adtag/utils/JtException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 177 */
} // :goto_0
return;
/* .line 173 */
/* :catch_0 */
/* move-exception v0 */
/* .line 174 */
/* .local v0, "e":Lcom/jumptap/adtag/utils/JtException; */
v1 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
} // .end method
public void requestInterstitialAd ( com.google.ads.mediation.MediationInterstitialListener p0, android.app.Activity p1, com.google.ads.mediation.MediationServerParameters p2, com.google.ads.mediation.MediationAdRequest p3, com.google.ads.mediation.NetworkExtras p4 ) { //bridge//synthethic
/* .locals 6 */
/* .prologue */
/* .line 1 */
/* move-object v3, p3 */
/* check-cast v3, Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters; */
/* move-object v5, p5 */
/* check-cast v5, Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras; */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/google/ads/mediation/jumptap/JumpTapAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;)V */
return;
} // .end method
public void requestInterstitialAd ( com.google.ads.mediation.MediationInterstitialListener p0, android.app.Activity p1, com.google.ads.mediation.jumptap.JumpTapAdapterServerParameters p2, com.google.ads.mediation.MediationAdRequest p3, com.google.ads.mediation.jumptap.JumpTapAdapterExtras p4 ) {
/* .locals 4 */
/* .param p1, "listener" # Lcom/google/ads/mediation/MediationInterstitialListener; */
/* .param p2, "activity" # Landroid/app/Activity; */
/* .param p3, "serverParameters" # Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters; */
/* .param p4, "mediationAdRequest" # Lcom/google/ads/mediation/MediationAdRequest; */
/* .param p5, "extras" # Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras; */
/* .prologue */
/* .line 185 */
this.interstitialListener = p1;
/* .line 188 */
try { // :try_start_0
/* new-instance v1, Lcom/jumptap/adtag/JtAdInterstitial; */
/* .line 189 */
/* invoke-direct {p0, p3, p4, p5}, Lcom/google/ads/mediation/jumptap/JumpTapAdapter;->buildSettings(Lcom/google/ads/mediation/jumptap/JumpTapAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/jumptap/JumpTapAdapterExtras;)Lcom/jumptap/adtag/JtAdWidgetSettings; */
/* invoke-direct {v1, p2, v2}, Lcom/jumptap/adtag/JtAdInterstitial;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/JtAdWidgetSettings;)V */
/* .line 188 */
this.interstitial = v1;
/* .line 190 */
v1 = this.interstitial;
/* new-instance v2, Lcom/google/ads/mediation/jumptap/JumpTapAdapter$InterstitialListener; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, p0, v3}, Lcom/google/ads/mediation/jumptap/JumpTapAdapter$InterstitialListener;-><init>(Lcom/google/ads/mediation/jumptap/JumpTapAdapter;Lcom/google/ads/mediation/jumptap/JumpTapAdapter$InterstitialListener;)V */
(( com.jumptap.adtag.JtAdInterstitial ) v1 ).setAdViewListener ( v2 ); // invoke-virtual {v1, v2}, Lcom/jumptap/adtag/JtAdInterstitial;->setAdViewListener(Lcom/jumptap/adtag/JtAdViewListener;)V
/* .line 191 */
v1 = this.interstitial;
(( com.jumptap.adtag.JtAdInterstitial ) v1 ).refreshAd ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdInterstitial;->refreshAd()V
/* :try_end_0 */
/* .catch Lcom/jumptap/adtag/utils/JtException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 196 */
} // :goto_0
return;
/* .line 192 */
/* :catch_0 */
/* move-exception v0 */
/* .line 193 */
/* .local v0, "e":Lcom/jumptap/adtag/utils/JtException; */
v1 = this.interstitialListener;
v2 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
} // .end method
public void showInterstitial ( ) {
/* .locals 1 */
/* .prologue */
/* .line 200 */
v0 = this.interstitial;
(( com.jumptap.adtag.JtAdInterstitial ) v0 ).showAsPopup ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/JtAdInterstitial;->showAsPopup()V
/* .line 201 */
return;
} // .end method
