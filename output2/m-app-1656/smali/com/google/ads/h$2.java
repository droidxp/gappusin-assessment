class com.google.ads.h$2 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/ads/h;->f()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.google.ads.mediation.MediationInterstitialAdapter a; //synthetic
final com.google.ads.h b; //synthetic
/* # direct methods */
 com.google.ads.h$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 208 */
this.b = p1;
this.a = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 212 */
try { // :try_start_0
	 v0 = this.a;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 222 */
} // :goto_0
return;
/* .line 213 */
/* :catch_0 */
/* move-exception v0 */
/* .line 217 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Error while telling adapter ("; // const-string v2, "Error while telling adapter ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( com.google.ads.h ) v2 ).g ( ); // invoke-virtual {v2}, Lcom/google/ads/h;->g()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ") ad to show interstitial: "; // const-string v2, ") ad to show interstitial: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v1,v0 );
} // .end method
