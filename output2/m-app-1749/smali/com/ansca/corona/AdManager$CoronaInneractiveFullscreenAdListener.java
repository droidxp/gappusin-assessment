class com.ansca.corona.AdManager$CoronaInneractiveFullscreenAdListener extends com.ansca.corona.AdManager$CoronaInneractiveAdListener {
	 /* .source "AdManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/AdManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "CoronaInneractiveFullscreenAdListener" */
} // .end annotation
/* # instance fields */
final com.ansca.corona.AdManager this$0; //synthetic
/* # direct methods */
private com.ansca.corona.AdManager$CoronaInneractiveFullscreenAdListener ( ) {
/* .locals 1 */
/* .prologue */
/* .line 473 */
this.this$0 = p1;
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;-><init>(Lcom/ansca/corona/AdManager;Lcom/ansca/corona/AdManager$1;)V */
return;
} // .end method
 com.ansca.corona.AdManager$CoronaInneractiveFullscreenAdListener ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/ansca/corona/AdManager; */
/* .param p2, "x1" # Lcom/ansca/corona/AdManager$1; */
/* .prologue */
/* .line 473 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/AdManager$CoronaInneractiveFullscreenAdListener;-><init>(Lcom/ansca/corona/AdManager;)V */
return;
} // .end method
/* # virtual methods */
public void inneractiveOnClickAd ( com.inneractive.api.ads.InneractiveAdView p0 ) {
/* .locals 1 */
/* .param p1, "adView" # Lcom/inneractive/api/ads/InneractiveAdView; */
/* .prologue */
/* .line 492 */
/* invoke-super {p0, p1}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;->inneractiveOnClickAd(Lcom/inneractive/api/ads/InneractiveAdView;)V */
/* .line 493 */
v0 = this.this$0;
(( com.ansca.corona.AdManager ) v0 ).hideInneractiveAd ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AdManager;->hideInneractiveAd()V
/* .line 494 */
return;
} // .end method
public void inneractiveOnFailedToReceiveAd ( com.inneractive.api.ads.InneractiveAdView p0 ) {
/* .locals 1 */
/* .param p1, "adView" # Lcom/inneractive/api/ads/InneractiveAdView; */
/* .prologue */
/* .line 481 */
/* invoke-super {p0, p1}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;->inneractiveOnFailedToReceiveAd(Lcom/inneractive/api/ads/InneractiveAdView;)V */
/* .line 482 */
v0 = this.this$0;
(( com.ansca.corona.AdManager ) v0 ).hideInneractiveAd ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AdManager;->hideInneractiveAd()V
/* .line 483 */
return;
} // .end method
