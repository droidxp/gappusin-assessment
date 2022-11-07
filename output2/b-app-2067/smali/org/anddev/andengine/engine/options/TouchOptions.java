public class org.anddev.andengine.engine.options.TouchOptions {
	 /* # instance fields */
	 private Boolean mRunOnUpdateThread;
	 /* # direct methods */
	 public org.anddev.andengine.engine.options.TouchOptions ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.engine.options.TouchOptions disableRunOnUpdateThread ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( org.anddev.andengine.engine.options.TouchOptions ) p0 ).setRunOnUpdateThread ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/options/TouchOptions;->setRunOnUpdateThread(Z)Lorg/anddev/andengine/engine/options/TouchOptions;
	 } // .end method
	 public org.anddev.andengine.engine.options.TouchOptions enableRunOnUpdateThread ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( org.anddev.andengine.engine.options.TouchOptions ) p0 ).setRunOnUpdateThread ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/options/TouchOptions;->setRunOnUpdateThread(Z)Lorg/anddev/andengine/engine/options/TouchOptions;
	 } // .end method
	 public Boolean isRunOnUpdateThread ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/options/TouchOptions;->mRunOnUpdateThread:Z */
	 } // .end method
	 public org.anddev.andengine.engine.options.TouchOptions setRunOnUpdateThread ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/engine/options/TouchOptions;->mRunOnUpdateThread:Z */
	 } // .end method
