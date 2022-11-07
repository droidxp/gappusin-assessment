class org.anddev.andengine.engine.Engine$State {
	 /* # instance fields */
	 Boolean mDrawing;
	 /* # direct methods */
	 private org.anddev.andengine.engine.Engine$State ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/engine/Engine$State;->mDrawing:Z */
		 return;
	 } // .end method
	 org.anddev.andengine.engine.Engine$State ( ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/engine/Engine$State;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void notifyCanDraw ( ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 int v0 = 1; // const/4 v0, 0x1
		 try { // :try_start_0
			 /* iput-boolean v0, p0, Lorg/anddev/andengine/engine/Engine$State;->mDrawing:Z */
			 (( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public synchronized void notifyCanUpdate ( ) {
			 /* .locals 1 */
			 /* monitor-enter p0 */
			 int v0 = 0; // const/4 v0, 0x0
			 try { // :try_start_0
				 /* iput-boolean v0, p0, Lorg/anddev/andengine/engine/Engine$State;->mDrawing:Z */
				 (( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit p0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 public synchronized void waitUntilCanDraw ( ) {
				 /* .locals 1 */
				 /* monitor-enter p0 */
			 } // :goto_0
			 try { // :try_start_0
				 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine$State;->mDrawing:Z */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* monitor-exit p0 */
					 return;
				 } // :cond_0
				 try { // :try_start_1
					 (( java.lang.Object ) p0 ).wait ( ); // invoke-virtual {p0}, Ljava/lang/Object;->wait()V
					 /* :try_end_1 */
					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
					 /* :catchall_0 */
					 /* move-exception v0 */
					 /* monitor-exit p0 */
					 /* throw v0 */
				 } // .end method
				 public synchronized void waitUntilCanUpdate ( ) {
					 /* .locals 1 */
					 /* monitor-enter p0 */
				 } // :goto_0
				 try { // :try_start_0
					 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine$State;->mDrawing:Z */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* if-nez v0, :cond_0 */
					 /* monitor-exit p0 */
					 return;
				 } // :cond_0
				 try { // :try_start_1
					 (( java.lang.Object ) p0 ).wait ( ); // invoke-virtual {p0}, Ljava/lang/Object;->wait()V
					 /* :try_end_1 */
					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
					 /* :catchall_0 */
					 /* move-exception v0 */
					 /* monitor-exit p0 */
					 /* throw v0 */
				 } // .end method
