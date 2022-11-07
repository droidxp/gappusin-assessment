public class org.anddev.andengine.engine.options.EngineOptions {
	 /* # instance fields */
	 private final org.anddev.andengine.engine.camera.Camera mCamera;
	 private final Boolean mFullscreen;
	 private Boolean mNeedsMusic;
	 private Boolean mNeedsSound;
	 private final org.anddev.andengine.engine.options.RenderOptions mRenderOptions;
	 private final org.anddev.andengine.engine.options.resolutionpolicy.IResolutionPolicy mResolutionPolicy;
	 private final org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation mScreenOrientation;
	 private final org.anddev.andengine.engine.options.TouchOptions mTouchOptions;
	 private Integer mUpdateThreadPriority;
	 private org.anddev.andengine.engine.options.WakeLockOptions mWakeLockOptions;
	 /* # direct methods */
	 public org.anddev.andengine.engine.options.EngineOptions ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/engine/options/TouchOptions; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/engine/options/TouchOptions;-><init>()V */
		 this.mTouchOptions = v0;
		 /* new-instance v0, Lorg/anddev/andengine/engine/options/RenderOptions; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/engine/options/RenderOptions;-><init>()V */
		 this.mRenderOptions = v0;
		 v0 = org.anddev.andengine.engine.options.WakeLockOptions.SCREEN_BRIGHT;
		 this.mWakeLockOptions = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mUpdateThreadPriority:I */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mFullscreen:Z */
		 this.mScreenOrientation = p2;
		 this.mResolutionPolicy = p3;
		 this.mCamera = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.engine.camera.Camera getCamera ( ) {
		 /* .locals 1 */
		 v0 = this.mCamera;
	 } // .end method
	 public org.anddev.andengine.engine.options.RenderOptions getRenderOptions ( ) {
		 /* .locals 1 */
		 v0 = this.mRenderOptions;
	 } // .end method
	 public org.anddev.andengine.engine.options.resolutionpolicy.IResolutionPolicy getResolutionPolicy ( ) {
		 /* .locals 1 */
		 v0 = this.mResolutionPolicy;
	 } // .end method
	 public org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation getScreenOrientation ( ) {
		 /* .locals 1 */
		 v0 = this.mScreenOrientation;
	 } // .end method
	 public org.anddev.andengine.engine.options.TouchOptions getTouchOptions ( ) {
		 /* .locals 1 */
		 v0 = this.mTouchOptions;
	 } // .end method
	 public Integer getUpdateThreadPriority ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mUpdateThreadPriority:I */
	 } // .end method
	 public org.anddev.andengine.engine.options.WakeLockOptions getWakeLockOptions ( ) {
		 /* .locals 1 */
		 v0 = this.mWakeLockOptions;
	 } // .end method
	 public Boolean isFullscreen ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mFullscreen:Z */
	 } // .end method
	 public Boolean needsMusic ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mNeedsMusic:Z */
	 } // .end method
	 public Boolean needsSound ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mNeedsSound:Z */
	 } // .end method
	 public org.anddev.andengine.engine.options.EngineOptions setNeedsMusic ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mNeedsMusic:Z */
	 } // .end method
	 public org.anddev.andengine.engine.options.EngineOptions setNeedsSound ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mNeedsSound:Z */
	 } // .end method
	 public void setUpdateThreadPriority ( Integer p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/engine/options/EngineOptions;->mUpdateThreadPriority:I */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.options.EngineOptions setWakeLockOptions ( org.anddev.andengine.engine.options.WakeLockOptions p0 ) {
		 /* .locals 0 */
		 this.mWakeLockOptions = p1;
	 } // .end method
