public abstract class org.anddev.andengine.entity.util.AverageFPSCounter extends org.anddev.andengine.entity.util.FPSCounter implements org.anddev.andengine.util.constants.TimeConstants {
	 /* # interfaces */
	 /* # static fields */
	 private static final Float AVERAGE_DURATION_DEFAULT;
	 /* # instance fields */
	 protected final Float mAverageDuration;
	 /* # direct methods */
	 public org.anddev.andengine.entity.util.AverageFPSCounter ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x40a00000 # 5.0f */
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/entity/util/AverageFPSCounter;-><init>(F)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.util.AverageFPSCounter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/util/FPSCounter;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->mAverageDuration:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected abstract void onHandleAverageDurationElapsed ( Float p0 ) {
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/util/FPSCounter;->onUpdate(F)V */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->mSecondsElapsed:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->mAverageDuration:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-lez v0, :cond_0 */
		 v0 = 		 (( org.anddev.andengine.entity.util.AverageFPSCounter ) p0 ).getFPS ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->getFPS()F
		 (( org.anddev.andengine.entity.util.AverageFPSCounter ) p0 ).onHandleAverageDurationElapsed ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->onHandleAverageDurationElapsed(F)V
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->mSecondsElapsed:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->mAverageDuration:F */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->mSecondsElapsed:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->mFrames:I */
	 } // :cond_0
	 return;
} // .end method
