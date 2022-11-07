class com.ansca.corona.Controller$29 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->superRewardsRequestUpdate()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$29 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1549 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 1551 */
/* monitor-enter p0 */
/* .line 1552 */
try { // :try_start_0
	 /* new-instance v1, Lcom/adknowledge/superrewards/model/SRUserPoints; */
	 v2 = this.this$0;
	 com.ansca.corona.Controller .access$300 ( v2 );
	 /* invoke-direct {v1, v2}, Lcom/adknowledge/superrewards/model/SRUserPoints;-><init>(Landroid/content/Context;)V */
	 /* .line 1553 */
	 /* .local v1, "user":Lcom/adknowledge/superrewards/model/SRUserPoints; */
	 /* new-instance v0, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask; */
	 v2 = this.this$0;
	 v3 = this.this$0;
	 com.ansca.corona.Controller .access$900 ( v3 );
	 v4 = this.this$0;
	 com.ansca.corona.Controller .access$1000 ( v4 );
	 /* invoke-direct {v0, v2, v3, v4}, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask;-><init>(Lcom/ansca/corona/Controller;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 1555 */
	 /* .local v0, "task":Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask; */
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-array v2, v2, [Lcom/adknowledge/superrewards/model/SRUserPoints; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* aput-object v1, v2, v3 */
	 (( com.ansca.corona.Controller$SuperRewardsRequestUpdateTask ) v0 ).execute ( v2 ); // invoke-virtual {v0, v2}, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
	 /* .line 1556 */
	 /* monitor-exit p0 */
	 /* .line 1557 */
	 return;
	 /* .line 1556 */
} // .end local v0 # "task":Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask;
} // .end local v1 # "user":Lcom/adknowledge/superrewards/model/SRUserPoints;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v2 */
} // .end method
