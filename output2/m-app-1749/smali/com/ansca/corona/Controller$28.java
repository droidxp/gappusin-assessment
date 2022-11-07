class com.ansca.corona.Controller$28 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->superRewardsShowOffers()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$28 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1507 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1509 */
/* monitor-enter p0 */
/* .line 1510 */
try { // :try_start_0
	 /* new-instance v0, Lcom/adknowledge/superrewards/SuperRewardsImpl; */
	 com.ansca.corona.ResourceServices .getRClass ( );
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/SuperRewardsImpl;-><init>(Ljava/lang/Class;)V */
	 /* .line 1511 */
	 /* .local v0, "rewards":Lcom/adknowledge/superrewards/SuperRewards; */
	 v1 = this.this$0;
	 com.ansca.corona.Controller .access$300 ( v1 );
	 v2 = this.this$0;
	 com.ansca.corona.Controller .access$900 ( v2 );
	 v3 = this.this$0;
	 com.ansca.corona.Controller .access$1000 ( v3 );
	 /* .line 1512 */
	 /* monitor-exit p0 */
	 /* .line 1513 */
	 return;
	 /* .line 1512 */
} // .end local v0 # "rewards":Lcom/adknowledge/superrewards/SuperRewards;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
