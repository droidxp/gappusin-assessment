class com.ansca.corona.AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation implements java.lang.Runnable {
	 /* .source "AdManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "ChangeInneractiveVisibilityOperation" */
} // .end annotation
/* # instance fields */
private com.inneractive.api.ads.InneractiveAdView fAdView;
private Integer fVisibilityState;
final com.ansca.corona.AdManager$CoronaInneractiveAdListener this$1; //synthetic
/* # direct methods */
public com.ansca.corona.AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation ( ) {
/* .locals 0 */
/* .param p2, "adView" # Lcom/inneractive/api/ads/InneractiveAdView; */
/* .param p3, "visibilityState" # I */
/* .prologue */
/* .line 460 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 461 */
this.fAdView = p2;
/* .line 462 */
/* iput p3, p0, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation;->fVisibilityState:I */
/* .line 463 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 465 */
v0 = this.fAdView;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 466 */
	 v0 = this.fAdView;
	 /* iget v1, p0, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener$ChangeInneractiveVisibilityOperation;->fVisibilityState:I */
	 (( com.inneractive.api.ads.InneractiveAdView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setVisibility(I)V
	 /* .line 468 */
} // :cond_0
return;
} // .end method
