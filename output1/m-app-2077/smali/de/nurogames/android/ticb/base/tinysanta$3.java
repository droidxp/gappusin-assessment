class de.nurogames.android.ticb.base.tinysanta$3 extends java.util.TimerTask {
	 /* .source "tinysanta.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/tinysanta;->startMarketPingTimer()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.tinysanta this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.tinysanta$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 1080 */
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1082 */
v0 = java.lang.System.out;
final String v1 = "scanning market"; // const-string v1, "scanning market"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1083 */
v0 = this.this$0;
de.nurogames.android.ticb.base.tinysanta .access$4 ( v0 );
/* .line 1084 */
return;
} // .end method
