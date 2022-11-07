public class org.anddev.andengine.engine.handler.runnable.RunnableHandler implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # instance fields */
	 private final java.util.ArrayList mRunnables;
	 /* # direct methods */
	 public org.anddev.andengine.engine.handler.runnable.RunnableHandler ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mRunnables = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void onUpdate ( Float p0 ) {
		 /* .locals 3 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v1 = this.mRunnables;
			 v0 = 			 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
			 int v2 = 1; // const/4 v2, 0x1
			 /* sub-int/2addr v0, v2 */
			 /* move v2, v0 */
		 } // :goto_0
		 /* if-gez v2, :cond_0 */
		 (( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 return;
	 } // :cond_0
	 try { // :try_start_1
		 (( java.util.ArrayList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Ljava/lang/Runnable; */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* add-int/lit8 v0, v2, -0x1 */
		 /* move v2, v0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
	 public synchronized void postRunnable ( java.lang.Runnable p0 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = this.mRunnables;
			 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public void reset ( ) {
			 /* .locals 1 */
			 v0 = this.mRunnables;
			 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
			 return;
		 } // .end method
