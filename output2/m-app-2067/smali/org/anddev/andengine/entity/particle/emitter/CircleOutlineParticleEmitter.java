public class org.anddev.andengine.entity.particle.emitter.CircleOutlineParticleEmitter extends org.anddev.andengine.entity.particle.emitter.BaseCircleParticleEmitter {
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.emitter.CircleOutlineParticleEmitter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/particle/emitter/BaseCircleParticleEmitter;-><init>(FFF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.particle.emitter.CircleOutlineParticleEmitter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/particle/emitter/BaseCircleParticleEmitter;-><init>(FFFF)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void getPositionOffset ( Float[] p0 ) {
		 /* .locals 5 */
		 v0 = org.anddev.andengine.util.MathUtils.RANDOM;
		 v0 = 		 (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
		 /* const v1, 0x40490fdb # (float)Math.PI */
		 /* mul-float/2addr v0, v1 */
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 /* mul-float/2addr v0, v1 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iget v2, p0, Lorg/anddev/andengine/entity/particle/emitter/CircleOutlineParticleEmitter;->mCenterX:F */
		 v3 = 		 android.util.FloatMath .cos ( v0 );
		 /* iget v4, p0, Lorg/anddev/andengine/entity/particle/emitter/CircleOutlineParticleEmitter;->mRadiusX:F */
		 /* mul-float/2addr v3, v4 */
		 /* add-float/2addr v2, v3 */
		 /* aput v2, p1, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iget v2, p0, Lorg/anddev/andengine/entity/particle/emitter/CircleOutlineParticleEmitter;->mCenterY:F */
		 v0 = 		 android.util.FloatMath .sin ( v0 );
		 /* iget v3, p0, Lorg/anddev/andengine/entity/particle/emitter/CircleOutlineParticleEmitter;->mRadiusY:F */
		 /* mul-float/2addr v0, v3 */
		 /* add-float/2addr v0, v2 */
		 /* aput v0, p1, v1 */
		 return;
	 } // .end method
