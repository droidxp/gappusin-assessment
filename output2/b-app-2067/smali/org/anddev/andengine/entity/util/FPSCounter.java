public class org.anddev.andengine.entity.util.FPSCounter implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # instance fields */
	 protected Integer mFrames;
	 protected Float mSecondsElapsed;
	 /* # direct methods */
	 public org.anddev.andengine.entity.util.FPSCounter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getFPS ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/FPSCounter;->mFrames:I */
		 /* int-to-float v0, v0 */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/util/FPSCounter;->mSecondsElapsed:F */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/FPSCounter;->mFrames:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSCounter;->mFrames:I */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/FPSCounter;->mSecondsElapsed:F */
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSCounter;->mSecondsElapsed:F */
		 return;
	 } // .end method
	 public void reset ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSCounter;->mFrames:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSCounter;->mSecondsElapsed:F */
		 return;
	 } // .end method
