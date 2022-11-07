public abstract class org.anddev.andengine.entity.particle.emitter.BaseRectangleParticleEmitter extends org.anddev.andengine.entity.particle.emitter.BaseParticleEmitter {
	 /* # instance fields */
	 protected Float mHeight;
	 protected Float mHeightHalf;
	 protected Float mWidth;
	 protected Float mWidthHalf;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.emitter.BaseRectangleParticleEmitter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p3}, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;-><init>(FFFF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.particle.emitter.BaseRectangleParticleEmitter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/particle/emitter/BaseParticleEmitter;-><init>(FF)V */
		 (( org.anddev.andengine.entity.particle.emitter.BaseRectangleParticleEmitter ) p0 ).setWidth ( p3 ); // invoke-virtual {p0, p3}, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;->setWidth(F)V
		 (( org.anddev.andengine.entity.particle.emitter.BaseRectangleParticleEmitter ) p0 ).setHeight ( p4 ); // invoke-virtual {p0, p4}, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;->setHeight(F)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;->mHeight:F */
	 } // .end method
	 public Float getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;->mWidth:F */
	 } // .end method
	 public void setHeight ( Float p0 ) {
		 /* .locals 1 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;->mHeight:F */
		 /* const/high16 v0, 0x3f000000 # 0.5f */
		 /* mul-float/2addr v0, p1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;->mHeightHalf:F */
		 return;
	 } // .end method
	 public void setWidth ( Float p0 ) {
		 /* .locals 1 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;->mWidth:F */
		 /* const/high16 v0, 0x3f000000 # 0.5f */
		 /* mul-float/2addr v0, p1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/emitter/BaseRectangleParticleEmitter;->mWidthHalf:F */
		 return;
	 } // .end method
