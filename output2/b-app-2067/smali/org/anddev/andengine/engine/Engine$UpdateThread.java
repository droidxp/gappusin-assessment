class org.anddev.andengine.engine.Engine$UpdateThread extends java.lang.Thread {
	 /* # instance fields */
	 final org.anddev.andengine.engine.Engine this$0; //synthetic
	 /* # direct methods */
	 public org.anddev.andengine.engine.Engine$UpdateThread ( ) {
		 /* .locals 1 */
		 this.this$0 = p1;
		 final String v0 = "UpdateThread"; // const-string v0, "UpdateThread"
		 /* invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 v0 = this.this$0;
		 org.anddev.andengine.engine.Engine .access$0 ( v0 );
		 v0 = 		 (( org.anddev.andengine.engine.options.EngineOptions ) v0 ).getUpdateThreadPriority ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/options/EngineOptions;->getUpdateThreadPriority()I
		 android.os.Process .setThreadPriority ( v0 );
	 } // :goto_0
	 try { // :try_start_0
		 v0 = this.this$0;
		 (( org.anddev.andengine.engine.Engine ) v0 ).onTickUpdate ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->onTickUpdate()V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v1 = "UpdateThread interrupted.Don\'t worry - this Exception is most likely expected!"; // const-string v1, "UpdateThread interrupted.Don\'t worry - this Exception is most likely expected!"
		 org.anddev.andengine.util.Debug .d ( v1,v0 );
		 (( org.anddev.andengine.engine.Engine$UpdateThread ) p0 ).interrupt ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/Engine$UpdateThread;->interrupt()V
		 return;
	 } // .end method
