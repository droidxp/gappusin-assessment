public class org.anddev.andengine.entity.particle.emitter.RectangleParticleEmitter extends org.anddev.andengine.entity.particle.emitter.BaseRectangleParticleEmitter {
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.emitter.RectangleParticleEmitter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;-><init>(FFFF)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void getPositionOffset ( Float[] p0 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleParticleEmitter;->mCenterX:F */
		 /* iget v2, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleParticleEmitter;->mWidthHalf:F */
		 /* sub-float/2addr v1, v2 */
		 v2 = org.anddev.andengine.util.MathUtils.RANDOM;
		 v2 = 		 (( java.util.Random ) v2 ).nextFloat ( ); // invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F
		 /* iget v3, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleParticleEmitter;->mWidth:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 /* aput v1, p1, v0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleParticleEmitter;->mCenterY:F */
		 /* iget v2, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleParticleEmitter;->mHeightHalf:F */
		 /* sub-float/2addr v1, v2 */
		 v2 = org.anddev.andengine.util.MathUtils.RANDOM;
		 v2 = 		 (( java.util.Random ) v2 ).nextFloat ( ); // invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F
		 /* iget v3, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleParticleEmitter;->mHeight:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 /* aput v1, p1, v0 */
		 return;
	 } // .end method
