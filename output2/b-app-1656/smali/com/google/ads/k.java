class com.google.ads.k implements com.google.ads.mediation.MediationInterstitialListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private final com.google.ads.h a;
	 /* # direct methods */
	 com.google.ads.k ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 21 */
		 this.a = p1;
		 /* .line 22 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDismissScreen ( com.google.ads.mediation.MediationInterstitialAdapter p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
		 /* "<**>;)V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 69 */
	 /* .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;" */
	 v1 = this.a;
	 /* monitor-enter v1 */
	 /* .line 70 */
	 try { // :try_start_0
		 v0 = this.a;
		 (( com.google.ads.h ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->i()Lcom/google/ads/e;
		 v2 = this.a;
		 (( com.google.ads.e ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/e;->b(Lcom/google/ads/h;)V
		 /* .line 71 */
		 /* monitor-exit v1 */
		 /* .line 72 */
		 return;
		 /* .line 71 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit v1 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v0 */
	 } // .end method
	 public void onFailedToReceiveAd ( com.google.ads.mediation.MediationInterstitialAdapter p0, com.google.ads.AdRequest$ErrorCode p1 ) {
		 /* .locals 3 */
		 /* .param p2, "error" # Lcom/google/ads/AdRequest$ErrorCode; */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
		 /* "<**>;", */
		 /* "Lcom/google/ads/AdRequest$ErrorCode;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 43 */
	 /* .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;" */
	 v1 = this.a;
	 /* monitor-enter v1 */
	 /* .line 44 */
	 try { // :try_start_0
		 v0 = this.a;
		 (( com.google.ads.h ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->h()Lcom/google/ads/mediation/MediationAdapter;
		 com.google.ads.util.a .a ( p1,v0 );
		 /* .line 45 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Mediation adapter "; // const-string v2, "Mediation adapter "
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " failed to receive ad with error code: "; // const-string v2, " failed to receive ad with error code: "
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.google.ads.util.b .a ( v0 );
		 /* .line 47 */
		 v0 = this.a;
		 v0 = 		 (( com.google.ads.h ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->c()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 48 */
			 final String v0 = "Got an onFailedToReceiveAd() callback after loadAdTask is done from an interstitial adapter.Ignoring callback."; // const-string v0, "Got an onFailedToReceiveAd() callback after loadAdTask is done from an interstitial adapter.Ignoring callback."
			 com.google.ads.util.b .b ( v0 );
			 /* .line 55 */
		 } // :goto_0
		 /* monitor-exit v1 */
		 /* .line 56 */
		 return;
		 /* .line 53 */
	 } // :cond_0
	 v0 = this.a;
	 int v2 = 0; // const/4 v2, 0x0
	 (( com.google.ads.h ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/h;->a(Z)V
	 /* .line 55 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public void onLeaveApplication ( com.google.ads.mediation.MediationInterstitialAdapter p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
	 /* "<**>;)V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 76 */
/* .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;" */
v1 = this.a;
/* monitor-enter v1 */
/* .line 77 */
try { // :try_start_0
	 v0 = this.a;
	 (( com.google.ads.h ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->i()Lcom/google/ads/e;
	 v2 = this.a;
	 (( com.google.ads.e ) v0 ).c ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/e;->c(Lcom/google/ads/h;)V
	 /* .line 78 */
	 /* monitor-exit v1 */
	 /* .line 79 */
	 return;
	 /* .line 78 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public void onPresentScreen ( com.google.ads.mediation.MediationInterstitialAdapter p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
	 /* "<**>;)V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 61 */
/* .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;" */
v1 = this.a;
/* monitor-enter v1 */
/* .line 62 */
try { // :try_start_0
	 v0 = this.a;
	 (( com.google.ads.h ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->i()Lcom/google/ads/e;
	 v2 = this.a;
	 (( com.google.ads.e ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/e;->a(Lcom/google/ads/h;)V
	 /* .line 63 */
	 /* monitor-exit v1 */
	 /* .line 64 */
	 return;
	 /* .line 63 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public void onReceivedAd ( com.google.ads.mediation.MediationInterstitialAdapter p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Lcom/google/ads/mediation/MediationInterstitialAdapter", */
	 /* "<**>;)V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 27 */
/* .local p1, "adapter":Lcom/google/ads/mediation/MediationInterstitialAdapter;, "Lcom/google/ads/mediation/MediationInterstitialAdapter<**>;" */
v1 = this.a;
/* monitor-enter v1 */
/* .line 28 */
try { // :try_start_0
	 v0 = this.a;
	 (( com.google.ads.h ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->h()Lcom/google/ads/mediation/MediationAdapter;
	 com.google.ads.util.a .a ( p1,v0 );
	 /* .line 29 */
	 v0 = this.a;
	 v0 = 	 (( com.google.ads.h ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->c()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 30 */
		 final String v0 = "Got an onReceivedAd() callback after loadAdTask is done from an interstitial adapter.Ignoring callback."; // const-string v0, "Got an onReceivedAd() callback after loadAdTask is done from an interstitial adapter.Ignoring callback."
		 com.google.ads.util.b .b ( v0 );
		 /* .line 37 */
	 } // :goto_0
	 /* monitor-exit v1 */
	 /* .line 38 */
	 return;
	 /* .line 35 */
} // :cond_0
v0 = this.a;
int v2 = 1; // const/4 v2, 0x1
(( com.google.ads.h ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/h;->a(Z)V
/* .line 37 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
