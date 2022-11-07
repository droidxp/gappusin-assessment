public class org.anddev.andengine.entity.util.FPSLogger extends org.anddev.andengine.entity.util.AverageFPSCounter {
	 /* # instance fields */
	 protected Float mLongestFrame;
	 protected Float mShortestFrame;
	 /* # direct methods */
	 public org.anddev.andengine.entity.util.FPSLogger ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/util/AverageFPSCounter;-><init>()V */
		 /* const v0, 0x7f7fffff # Float.MAX_VALUE */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mShortestFrame:F */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mLongestFrame:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.util.FPSLogger ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/util/AverageFPSCounter;-><init>(F)V */
		 /* const v0, 0x7f7fffff # Float.MAX_VALUE */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mShortestFrame:F */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mLongestFrame:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onHandleAverageDurationElapsed ( Float p0 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.util.FPSLogger ) p0 ).onLogFPS ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/util/FPSLogger;->onLogFPS()V
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mLongestFrame:F */
		 /* const v0, 0x7f7fffff # Float.MAX_VALUE */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mShortestFrame:F */
		 return;
	 } // .end method
	 protected void onLogFPS ( ) {
		 /* .locals 6 */
		 /* const/high16 v5, 0x447a0000 # 1000.0f */
		 final String v0 = "FPS: %.2f (MIN: %.0f ms | MAX: %.0f ms)"; // const-string v0, "FPS: %.2f (MIN: %.0f ms | MAX: %.0f ms)"
		 int v1 = 3; // const/4 v1, 0x3
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* iget v3, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mFrames:I */
		 /* int-to-float v3, v3 */
		 /* iget v4, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mSecondsElapsed:F */
		 /* div-float/2addr v3, v4 */
		 java.lang.Float .valueOf ( v3 );
		 /* aput-object v3, v1, v2 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* iget v3, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mShortestFrame:F */
		 /* mul-float/2addr v3, v5 */
		 java.lang.Float .valueOf ( v3 );
		 /* aput-object v3, v1, v2 */
		 int v2 = 2; // const/4 v2, 0x2
		 /* iget v3, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mLongestFrame:F */
		 /* mul-float/2addr v3, v5 */
		 java.lang.Float .valueOf ( v3 );
		 /* aput-object v3, v1, v2 */
		 java.lang.String .format ( v0,v1 );
		 org.anddev.andengine.util.Debug .d ( v0 );
		 return;
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 1 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->onUpdate(F)V */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mShortestFrame:F */
		 v0 = 		 java.lang.Math .min ( v0,p1 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mShortestFrame:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mLongestFrame:F */
		 v0 = 		 java.lang.Math .max ( v0,p1 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mLongestFrame:F */
		 return;
	 } // .end method
	 public void reset ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/entity/util/AverageFPSCounter;->reset()V */
		 /* const v0, 0x7f7fffff # Float.MAX_VALUE */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mShortestFrame:F */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lorg/anddev/andengine/entity/util/FPSLogger;->mLongestFrame:F */
		 return;
	 } // .end method
