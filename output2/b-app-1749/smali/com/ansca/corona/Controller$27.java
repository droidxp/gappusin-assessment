class com.ansca.corona.Controller$27 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->superRewardsInit(Ljava/lang/String;Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$27 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1494 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1496 */
/* monitor-enter p0 */
/* .line 1497 */
try { // :try_start_0
	 v0 = this.this$0;
	 v1 = this.this$0;
	 com.ansca.corona.Controller .access$300 ( v1 );
	 (( com.ansca.corona.CoronaActivity ) v1 ).getApplicationContext ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getApplicationContext()Landroid/content/Context;
	 v2 = this.this$0;
	 com.ansca.corona.Controller .access$900 ( v2 );
	 com.adknowledge.superrewards.tracking.SRAppInstallTracker .getInstance ( v1,v2 );
	 com.ansca.corona.Controller .access$802 ( v0,v1 );
	 /* .line 1498 */
	 v0 = this.this$0;
	 com.ansca.corona.Controller .access$800 ( v0 );
	 (( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) v0 ).track ( ); // invoke-virtual {v0}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->track()V
	 /* .line 1499 */
	 /* monitor-exit p0 */
	 /* .line 1500 */
	 return;
	 /* .line 1499 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
