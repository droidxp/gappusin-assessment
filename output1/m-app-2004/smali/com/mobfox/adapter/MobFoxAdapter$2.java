class com.mobfox.adapter.MobFoxAdapter$2 implements com.mobfox.video.sdk.MobFoxAdListener {
	 /* .source "MobFoxAdapter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/adapter/MobFoxAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/mobfox/adapter/MobFoxServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/mobfox/adapter/MobFoxExtras;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.adapter.MobFoxAdapter this$0; //synthetic
/* # direct methods */
 com.mobfox.adapter.MobFoxAdapter$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 156 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void adClosed ( com.mobfox.video.sdk.RichMediaAdData p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Lcom/mobfox/video/sdk/RichMediaAdData; */
/* .param p2, "arg1" # Z */
/* .prologue */
/* .line 190 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 191 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
	 v1 = this.this$0;
	 /* .line 193 */
} // :cond_0
return;
} // .end method
public void adLoadFailed ( com.mobfox.video.sdk.RequestException p0 ) {
/* .locals 3 */
/* .param p1, "arg0" # Lcom/mobfox/video/sdk/RequestException; */
/* .prologue */
/* .line 182 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 183 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
	 /* .line 184 */
	 v1 = this.this$0;
	 v2 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
	 /* .line 183 */
	 /* .line 186 */
} // :cond_0
return;
} // .end method
public void adLoadSucceeded ( com.mobfox.video.sdk.RichMediaAdData p0 ) {
/* .locals 2 */
/* .param p1, "arg0" # Lcom/mobfox/video/sdk/RichMediaAdData; */
/* .prologue */
/* .line 175 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 176 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
	 v1 = this.this$0;
	 /* .line 178 */
} // :cond_0
return;
} // .end method
public void adShown ( com.mobfox.video.sdk.RichMediaAdData p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Lcom/mobfox/video/sdk/RichMediaAdData; */
/* .param p2, "arg1" # Z */
/* .prologue */
/* .line 168 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 169 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
	 v1 = this.this$0;
	 /* .line 171 */
} // :cond_0
return;
} // .end method
public void noAdFound ( ) {
/* .locals 3 */
/* .prologue */
/* .line 160 */
v0 = this.this$0;
com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 161 */
	 v0 = this.this$0;
	 com.mobfox.adapter.MobFoxAdapter .access$3 ( v0 );
	 /* .line 162 */
	 v1 = this.this$0;
	 v2 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
	 /* .line 161 */
	 /* .line 164 */
} // :cond_0
return;
} // .end method
