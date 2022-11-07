class com.ansca.corona.Controller$25 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->openFeintUnlockAchievement(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$achievementId; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$25 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1440 */
this.this$0 = p1;
this.val$achievementId = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1442 */
/* monitor-enter p0 */
/* .line 1443 */
try { // :try_start_0
	 /* new-instance v0, Lcom/openfeint/api/resource/Achievement; */
	 v1 = this.val$achievementId;
	 /* invoke-direct {v0, v1}, Lcom/openfeint/api/resource/Achievement;-><init>(Ljava/lang/String;)V */
	 /* .line 1444 */
	 /* .local v0, "achievement":Lcom/openfeint/api/resource/Achievement; */
	 /* new-instance v1, Lcom/ansca/corona/Controller$25$1; */
	 /* invoke-direct {v1, p0}, Lcom/ansca/corona/Controller$25$1;-><init>(Lcom/ansca/corona/Controller$25;)V */
	 (( com.openfeint.api.resource.Achievement ) v0 ).unlock ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/api/resource/Achievement;->unlock(Lcom/openfeint/api/resource/Achievement$UnlockCB;)V
	 /* .line 1454 */
	 /* monitor-exit p0 */
	 /* .line 1455 */
	 return;
	 /* .line 1454 */
} // .end local v0 # "achievement":Lcom/openfeint/api/resource/Achievement;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
