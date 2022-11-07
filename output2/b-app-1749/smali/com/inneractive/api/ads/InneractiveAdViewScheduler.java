public class com.inneractive.api.ads.InneractiveAdViewScheduler {
	 /* .source "InneractiveAdViewScheduler.java" */
	 /* # static fields */
	 private static com.inneractive.api.ads.InneractiveAdViewScheduler instance;
	 /* # instance fields */
	 private java.util.Timer timer;
	 /* # direct methods */
	 private com.inneractive.api.ads.InneractiveAdViewScheduler ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 13 */
		 /* new-instance v0, Ljava/util/Timer; */
		 /* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
		 this.timer = v0;
		 /* .line 14 */
		 return;
	 } // .end method
	 static com.inneractive.api.ads.InneractiveAdViewScheduler getInstance ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 17 */
		 v0 = com.inneractive.api.ads.InneractiveAdViewScheduler.instance;
		 /* if-nez v0, :cond_1 */
		 /* .line 18 */
		 /* const-class v1, Lcom/inneractive/api/ads/InneractiveAdViewScheduler; */
		 /* monitor-enter v1 */
		 /* .line 19 */
		 try { // :try_start_0
			 v0 = com.inneractive.api.ads.InneractiveAdViewScheduler.instance;
			 /* if-nez v0, :cond_0 */
			 /* .line 20 */
			 /* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdViewScheduler; */
			 /* invoke-direct {v0}, Lcom/inneractive/api/ads/InneractiveAdViewScheduler;-><init>()V */
			 /* .line 18 */
		 } // :cond_0
		 /* monitor-exit v1 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 25 */
	 } // :cond_1
	 v0 = com.inneractive.api.ads.InneractiveAdViewScheduler.instance;
	 /* .line 18 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 try { // :try_start_1
		 /* monitor-exit v1 */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* throw v0 */
	 } // .end method
	 /* # virtual methods */
	 synchronized void scheduleTask ( java.util.TimerTask p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .param p1, "task" # Ljava/util/TimerTask; */
		 /* .param p2, "timeInterval" # I */
		 /* .prologue */
		 /* .line 36 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = this.timer;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 37 */
				 v0 = this.timer;
				 (( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
				 /* .line 38 */
				 int v0 = 0; // const/4 v0, 0x0
				 this.timer = v0;
				 /* .line 42 */
			 } // :cond_0
			 /* if-lez p2, :cond_1 */
			 /* .line 43 */
			 /* new-instance v0, Ljava/util/Timer; */
			 /* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
			 this.timer = v0;
			 /* .line 44 */
			 v0 = this.timer;
			 /* mul-int/lit16 v1, p2, 0x3e8 */
			 /* int-to-long v1, v1 */
			 (( java.util.Timer ) v0 ).schedule ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 46 */
		 } // :cond_1
		 /* monitor-exit p0 */
		 return;
		 /* .line 36 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
