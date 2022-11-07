class com.mobfox.adapter.MobFoxAdapter$1 implements com.mobfox.sdk.BannerListener {
	 /* .source "MobFoxAdapter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/adapter/MobFoxAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/mobfox/adapter/MobFoxServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/mobfox/adapter/MobFoxExtras;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.adapter.MobFoxAdapter this$0; //synthetic
/* # direct methods */
 com.mobfox.adapter.MobFoxAdapter$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 98 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void adClicked ( ) {
/* .locals 2 */
/* .prologue */
/* .line 132 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$2 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 133 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$2 ( v0 );
	 v1 = this.this$0;
	 /* .line 135 */
} // :cond_0
return;
} // .end method
public void bannerLoadFailed ( com.mobfox.sdk.RequestException p0 ) {
/* .locals 3 */
/* .param p1, "arg0" # Lcom/mobfox/sdk/RequestException; */
/* .prologue */
/* .line 124 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$2 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 125 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$2 ( v0 );
	 v1 = this.this$0;
	 /* .line 126 */
	 v2 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
	 /* .line 125 */
	 /* .line 128 */
} // :cond_0
return;
} // .end method
public void bannerLoadSucceeded ( ) {
/* .locals 2 */
/* .prologue */
/* .line 117 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$2 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 118 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$2 ( v0 );
	 v1 = this.this$0;
	 /* .line 120 */
} // :cond_0
return;
} // .end method
public void noAdFound ( ) {
/* .locals 3 */
/* .prologue */
/* .line 109 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$2 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 110 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$2 ( v0 );
	 v1 = this.this$0;
	 /* .line 111 */
	 v2 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
	 /* .line 110 */
	 /* .line 113 */
} // :cond_0
return;
} // .end method
