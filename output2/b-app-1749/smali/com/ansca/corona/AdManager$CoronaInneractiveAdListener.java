class com.ansca.corona.AdManager$CoronaInneractiveAdListener implements com.inneractive.api.ads.InneractiveAdEventsListener {
	 /* .source "AdManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/AdManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "CoronaInneractiveAdListener" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation; */
/* } */
} // .end annotation
/* # instance fields */
final com.ansca.corona.AdManager this$0; //synthetic
/* # direct methods */
private com.ansca.corona.AdManager$CoronaInneractiveAdListener ( ) {
/* .locals 0 */
/* .prologue */
/* .line 394 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 457 */
return;
} // .end method
 com.ansca.corona.AdManager$CoronaInneractiveAdListener ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/ansca/corona/AdManager; */
/* .param p2, "x1" # Lcom/ansca/corona/AdManager$1; */
/* .prologue */
/* .line 394 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;-><init>(Lcom/ansca/corona/AdManager;)V */
return;
} // .end method
private void raiseAdRequestEvent ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "isError" # Z */
/* .prologue */
/* .line 450 */
com.ansca.corona.Controller .getEventManager ( );
/* .line 451 */
/* .local v0, "eventManager":Lcom/ansca/corona/events/EventManager; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 452 */
(( com.ansca.corona.events.EventManager ) v0 ).adRequestEvent ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/events/EventManager;->adRequestEvent(Z)V
/* .line 454 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void inneractiveOnClickAd ( com.inneractive.api.ads.InneractiveAdView p0 ) {
/* .locals 0 */
/* .param p1, "adView" # Lcom/inneractive/api/ads/InneractiveAdView; */
/* .prologue */
/* .line 442 */
return;
} // .end method
public void inneractiveOnFailedToReceiveAd ( com.inneractive.api.ads.InneractiveAdView p0 ) {
/* .locals 3 */
/* .param p1, "adView" # Lcom/inneractive/api/ads/InneractiveAdView; */
/* .prologue */
/* .line 427 */
if ( p1 != null) { // if-eqz p1, :cond_0
(( com.inneractive.api.ads.InneractiveAdView ) p1 ).getHandler ( ); // invoke-virtual {p1}, Lcom/inneractive/api/ads/InneractiveAdView;->getHandler()Landroid/os/Handler;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 428 */
	 (( com.inneractive.api.ads.InneractiveAdView ) p1 ).getHandler ( ); // invoke-virtual {p1}, Lcom/inneractive/api/ads/InneractiveAdView;->getHandler()Landroid/os/Handler;
	 /* new-instance v1, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation; */
	 /* const/16 v2, 0x8 */
	 /* invoke-direct {v1, p0, p1, v2}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation;-><init>(Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;Lcom/inneractive/api/ads/InneractiveAdView;I)V */
	 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 /* .line 432 */
} // :cond_0
final String v0 = "Corona"; // const-string v0, "Corona"
final String v1 = "Inneractive ad request failed"; // const-string v1, "Inneractive ad request failed"
android.util.Log .v ( v0,v1 );
/* .line 433 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;->raiseAdRequestEvent(Z)V */
/* .line 434 */
return;
} // .end method
public void inneractiveOnReceiveAd ( com.inneractive.api.ads.InneractiveAdView p0 ) {
/* .locals 3 */
/* .param p1, "adView" # Lcom/inneractive/api/ads/InneractiveAdView; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 402 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 (( com.inneractive.api.ads.InneractiveAdView ) p1 ).getHandler ( ); // invoke-virtual {p1}, Lcom/inneractive/api/ads/InneractiveAdView;->getHandler()Landroid/os/Handler;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 403 */
		 (( com.inneractive.api.ads.InneractiveAdView ) p1 ).getHandler ( ); // invoke-virtual {p1}, Lcom/inneractive/api/ads/InneractiveAdView;->getHandler()Landroid/os/Handler;
		 /* new-instance v1, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation; */
		 /* invoke-direct {v1, p0, p1, v2}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation;-><init>(Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;Lcom/inneractive/api/ads/InneractiveAdView;I)V */
		 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 /* .line 407 */
	 } // :cond_0
	 /* invoke-direct {p0, v2}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;->raiseAdRequestEvent(Z)V */
	 /* .line 408 */
	 return;
} // .end method
public void inneractiveOnReceiveDefaultAd ( com.inneractive.api.ads.InneractiveAdView p0 ) {
	 /* .locals 0 */
	 /* .param p1, "adView" # Lcom/inneractive/api/ads/InneractiveAdView; */
	 /* .prologue */
	 /* .line 417 */
	 (( com.ansca.corona.AdManager$CoronaInneractiveAdListener ) p0 ).inneractiveOnReceiveAd ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;->inneractiveOnReceiveAd(Lcom/inneractive/api/ads/InneractiveAdView;)V
	 /* .line 418 */
	 return;
} // .end method
