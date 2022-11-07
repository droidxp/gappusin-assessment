class com.ansca.corona.Controller$26 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->openFeintSetHighScore(Ljava/lang/String;JLjava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$displayText; //synthetic
final java.lang.String val$leaderboardId; //synthetic
final Long val$score; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$26 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1460 */
this.this$0 = p1;
this.val$displayText = p2;
/* iput-wide p3, p0, Lcom/ansca/corona/Controller$26;->val$score:J */
this.val$leaderboardId = p5;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 1462 */
/* monitor-enter p0 */
/* .line 1464 */
try { // :try_start_0
	 v2 = this.val$displayText;
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 v2 = this.val$displayText;
		 v2 = 		 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
		 /* if-gtz v2, :cond_1 */
		 /* .line 1466 */
	 } // :cond_0
	 /* new-instance v1, Lcom/openfeint/api/resource/Score; */
	 /* iget-wide v2, p0, Lcom/ansca/corona/Controller$26;->val$score:J */
	 /* invoke-direct {v1, v2, v3}, Lcom/openfeint/api/resource/Score;-><init>(J)V */
	 /* .line 1473 */
	 /* .local v1, "ofScore":Lcom/openfeint/api/resource/Score; */
} // :goto_0
/* new-instance v0, Lcom/openfeint/api/resource/Leaderboard; */
v2 = this.val$leaderboardId;
/* invoke-direct {v0, v2}, Lcom/openfeint/api/resource/Leaderboard;-><init>(Ljava/lang/String;)V */
/* .line 1474 */
/* .local v0, "leaderboard":Lcom/openfeint/api/resource/Leaderboard; */
/* new-instance v2, Lcom/ansca/corona/Controller$26$1; */
/* invoke-direct {v2, p0}, Lcom/ansca/corona/Controller$26$1;-><init>(Lcom/ansca/corona/Controller$26;)V */
(( com.openfeint.api.resource.Score ) v1 ).submitTo ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/openfeint/api/resource/Score;->submitTo(Lcom/openfeint/api/resource/Leaderboard;Lcom/openfeint/api/resource/Score$SubmitToCB;)V
/* .line 1484 */
/* monitor-exit p0 */
/* .line 1485 */
return;
/* .line 1470 */
} // .end local v0 # "leaderboard":Lcom/openfeint/api/resource/Leaderboard;
} // .end local v1 # "ofScore":Lcom/openfeint/api/resource/Score;
} // :cond_1
/* new-instance v1, Lcom/openfeint/api/resource/Score; */
/* iget-wide v2, p0, Lcom/ansca/corona/Controller$26;->val$score:J */
v4 = this.val$displayText;
/* invoke-direct {v1, v2, v3, v4}, Lcom/openfeint/api/resource/Score;-><init>(JLjava/lang/String;)V */
/* .restart local v1 # "ofScore":Lcom/openfeint/api/resource/Score; */
/* .line 1484 */
} // .end local v1 # "ofScore":Lcom/openfeint/api/resource/Score;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v2 */
} // .end method
