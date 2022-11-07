class com.natenai.jniutil.NateAdsManager$2 implements java.lang.Runnable {
	 /* .source "NateAdsManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/natenai/jniutil/NateAdsManager;->showInterstitialAd()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.natenai.jniutil.NateAdsManager this$0; //synthetic
/* # direct methods */
 com.natenai.jniutil.NateAdsManager$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 238 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 241 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDebugAd:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 242 */
	 final String v0 = "NateAdsManager"; // const-string v0, "NateAdsManager"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Wait for "; // const-string v2, "Wait for "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* sget-wide v2, Lcom/natenai/jniutil/NateAdsManager;->natenaiDelayMillisecsBeforeShowingInterstitialAd:J */
	 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 final String v2 = "msecs before showing Interstitial Ad"; // const-string v2, "msecs before showing Interstitial Ad"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 /* .line 245 */
} // :cond_0
try { // :try_start_0
	 /* sget-wide v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDelayMillisecsBeforeShowingInterstitialAd:J */
	 java.lang.Thread .sleep ( v0,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 250 */
} // :goto_0
final String v0 = "NextInterstitialTime"; // const-string v0, "NextInterstitialTime"
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* sget-wide v3, Lcom/natenai/jniutil/NateAdsManager;->natenaiRequestInterstitialPeriodMillis:J */
/* add-long/2addr v1, v3 */
com.natenai.jniutil.NateGameJNIUtilLib .pref_set_long ( v0,v1,v2 );
/* .line 252 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateAdsManager;->natenaiDebugAd:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 253 */
	 final String v0 = "NateAdsManager"; // const-string v0, "NateAdsManager"
	 final String v1 = "Show Interstitial Ad"; // const-string v1, "Show Interstitial Ad"
	 android.util.Log .d ( v0,v1 );
	 /* .line 256 */
} // :cond_1
v0 = this.this$0;
com.natenai.jniutil.NateAdsManager .access$1 ( v0 );
(( com.google.ads.InterstitialAd ) v0 ).show ( ); // invoke-virtual {v0}, Lcom/google/ads/InterstitialAd;->show()V
/* .line 257 */
return;
/* .line 246 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
