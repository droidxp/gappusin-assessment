class com.ansca.corona.Controller$SuperRewardsRequestUpdateTask$1 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask;->onPostExecute(Lcom/adknowledge/superrewards/model/SRUserPoints;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller$SuperRewardsRequestUpdateTask this$1; //synthetic
final Integer val$newPoints; //synthetic
final Integer val$totalPoints; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$SuperRewardsRequestUpdateTask$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1537 */
this.this$1 = p1;
/* iput p2, p0, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask$1;->val$newPoints:I */
/* iput p3, p0, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask$1;->val$totalPoints:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1539 */
/* monitor-enter p0 */
/* .line 1540 */
try { // :try_start_0
	 com.ansca.corona.Controller .getEventManager ( );
	 /* iget v1, p0, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask$1;->val$newPoints:I */
	 /* iget v2, p0, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask$1;->val$totalPoints:I */
	 (( com.ansca.corona.events.EventManager ) v0 ).creditsRequestEvent ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/ansca/corona/events/EventManager;->creditsRequestEvent(II)V
	 /* .line 1541 */
	 /* monitor-exit p0 */
	 /* .line 1542 */
	 return;
	 /* .line 1541 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
