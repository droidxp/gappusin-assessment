public class org.anddev.andengine.entity.particle.emitter.RectangleOutlineParticleEmitter extends org.anddev.andengine.entity.particle.emitter.BaseRectangleParticleEmitter {
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.emitter.RectangleOutlineParticleEmitter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;-><init>(FFFF)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void getPositionOffset ( Float[] p0 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleOutlineParticleEmitter;->mCenterX:F */
		 v2 = 		 org.anddev.andengine.util.MathUtils .randomSign ( );
		 /* int-to-float v2, v2 */
		 /* iget v3, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleOutlineParticleEmitter;->mWidthHalf:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 /* aput v1, p1, v0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleOutlineParticleEmitter;->mCenterY:F */
		 v2 = 		 org.anddev.andengine.util.MathUtils .randomSign ( );
		 /* int-to-float v2, v2 */
		 /* iget v3, p0, Lorg/anddev/andengine/entity/particle/emitter/RectangleOutlineParticleEmitter;->mHeightHalf:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 /* aput v1, p1, v0 */
		 return;
	 } // .end method
