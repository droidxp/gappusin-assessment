public class org.anddev.andengine.engine.FixedStepEngine extends org.anddev.andengine.engine.Engine {
	 /* # instance fields */
	 private Long mSecondsElapsedAccumulator;
	 private final Long mStepLength;
	 /* # direct methods */
	 public org.anddev.andengine.engine.FixedStepEngine ( ) {
		 /* .locals 4 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/engine/Engine;-><init>(Lorg/anddev/andengine/engine/options/EngineOptions;)V */
		 /* const-wide/32 v0, 0x3b9aca00 */
		 /* int-to-long v2, p2 */
		 /* div-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/engine/FixedStepEngine;->mStepLength:J */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onUpdate ( Long p0 ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lorg/anddev/andengine/engine/FixedStepEngine;->mSecondsElapsedAccumulator:J */
		 /* add-long/2addr v0, p1 */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/engine/FixedStepEngine;->mSecondsElapsedAccumulator:J */
		 /* iget-wide v0, p0, Lorg/anddev/andengine/engine/FixedStepEngine;->mStepLength:J */
	 } // :goto_0
	 /* iget-wide v2, p0, Lorg/anddev/andengine/engine/FixedStepEngine;->mSecondsElapsedAccumulator:J */
	 /* cmp-long v2, v2, v0 */
	 /* if-gez v2, :cond_0 */
	 return;
} // :cond_0
/* invoke-super {p0, v0, v1}, Lorg/anddev/andengine/engine/Engine;->onUpdate(J)V */
/* iget-wide v2, p0, Lorg/anddev/andengine/engine/FixedStepEngine;->mSecondsElapsedAccumulator:J */
/* sub-long/2addr v2, v0 */
/* iput-wide v2, p0, Lorg/anddev/andengine/engine/FixedStepEngine;->mSecondsElapsedAccumulator:J */
} // .end method
