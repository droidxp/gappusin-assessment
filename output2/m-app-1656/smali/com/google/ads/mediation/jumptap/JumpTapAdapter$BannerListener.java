class com.google.ads.mediation.jumptap.JumpTapAdapter$BannerListener implements com.jumptap.adtag.JtAdViewListener {
	 /* .source "JumpTapAdapter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/mediation/jumptap/JumpTapAdapter; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "BannerListener" */
} // .end annotation
/* # instance fields */
final com.google.ads.mediation.jumptap.JumpTapAdapter this$0; //synthetic
/* # direct methods */
private com.google.ads.mediation.jumptap.JumpTapAdapter$BannerListener ( ) {
/* .locals 0 */
/* .prologue */
/* .line 222 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.google.ads.mediation.jumptap.JumpTapAdapter$BannerListener ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 222 */
/* invoke-direct {p0, p1}, Lcom/google/ads/mediation/jumptap/JumpTapAdapter$BannerListener;-><init>(Lcom/google/ads/mediation/jumptap/JumpTapAdapter;)V */
return;
} // .end method
/* # virtual methods */
public void onAdError ( com.jumptap.adtag.JtAdView p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .param p3, "arg2" # I */
/* .prologue */
/* .line 225 */
v0 = this.this$0;
com.google.ads.mediation.jumptap.JumpTapAdapter .access$2 ( v0 );
v1 = this.this$0;
v2 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
/* .line 226 */
return;
} // .end method
public void onBannerClicked ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 263 */
v0 = this.this$0;
com.google.ads.mediation.jumptap.JumpTapAdapter .access$2 ( v0 );
v1 = this.this$0;
/* .line 264 */
return;
} // .end method
public void onBeginAdInteraction ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 251 */
return;
} // .end method
public void onContract ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 272 */
return;
} // .end method
public void onEndAdInteraction ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 255 */
return;
} // .end method
public void onExpand ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 276 */
v0 = this.this$0;
com.google.ads.mediation.jumptap.JumpTapAdapter .access$2 ( v0 );
v1 = this.this$0;
/* .line 277 */
return;
} // .end method
public void onFocusChange ( com.jumptap.adtag.JtAdView p0, Integer p1, Boolean p2 ) {
/* .locals 0 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .param p3, "arg2" # Z */
/* .prologue */
/* .line 231 */
return;
} // .end method
public void onHide ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 259 */
return;
} // .end method
public void onInterstitialDismissed ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 237 */
return;
} // .end method
public void onLaunchActivity ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 281 */
v0 = this.this$0;
com.google.ads.mediation.jumptap.JumpTapAdapter .access$2 ( v0 );
v1 = this.this$0;
/* .line 282 */
return;
} // .end method
public void onNewAd ( com.jumptap.adtag.JtAdView p0, Integer p1, java.lang.String p2 ) {
/* .locals 2 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .param p3, "arg2" # Ljava/lang/String; */
/* .prologue */
/* .line 241 */
v0 = this.this$0;
com.google.ads.mediation.jumptap.JumpTapAdapter .access$2 ( v0 );
v1 = this.this$0;
/* .line 242 */
return;
} // .end method
public void onNoAdFound ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 246 */
v0 = this.this$0;
com.google.ads.mediation.jumptap.JumpTapAdapter .access$2 ( v0 );
v1 = this.this$0;
v2 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
/* .line 247 */
return;
} // .end method
public void onReturnFromActivity ( com.jumptap.adtag.JtAdView p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "arg0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 286 */
return;
} // .end method
