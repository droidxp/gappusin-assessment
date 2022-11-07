class com.jumptap.adtag.JtAdInterstitial$DismissTimer extends java.util.TimerTask {
	 /* .source "JtAdInterstitial.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/jumptap/adtag/JtAdInterstitial; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "DismissTimer" */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.JtAdInterstitial this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.JtAdInterstitial$DismissTimer ( ) {
/* .locals 0 */
/* .prologue */
/* .line 216 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 219 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "starting dismissal timer task"; // const-string v1, "starting dismissal timer task"
android.util.Log .i ( v0,v1 );
/* .line 220 */
v0 = this.this$0;
/* new-instance v1, Lcom/jumptap/adtag/JtAdInterstitial$DismissTimer$1; */
/* invoke-direct {v1, p0}, Lcom/jumptap/adtag/JtAdInterstitial$DismissTimer$1;-><init>(Lcom/jumptap/adtag/JtAdInterstitial$DismissTimer;)V */
(( com.jumptap.adtag.JtAdInterstitial ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdInterstitial;->post(Ljava/lang/Runnable;)Z
/* .line 225 */
return;
} // .end method
