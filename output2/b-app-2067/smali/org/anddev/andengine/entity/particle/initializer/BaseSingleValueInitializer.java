public abstract class org.anddev.andengine.entity.particle.initializer.BaseSingleValueInitializer implements org.anddev.andengine.entity.particle.initializer.IParticleInitializer {
	 /* # interfaces */
	 /* # instance fields */
	 protected Float mMaxValue;
	 protected Float mMinValue;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.initializer.BaseSingleValueInitializer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->mMinValue:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->mMaxValue:F */
		 return;
	 } // .end method
	 private final Float getRandomValue ( ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->mMinValue:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->mMaxValue:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->mMaxValue:F */
	 } // :goto_0
} // :cond_0
v0 = org.anddev.andengine.util.MathUtils.RANDOM;
v0 = (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->mMaxValue:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->mMinValue:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->mMinValue:F */
/* add-float/2addr v0, v1 */
} // .end method
/* # virtual methods */
public final void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0 ) {
/* .locals 1 */
v0 = /* invoke-direct {p0}, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->getRandomValue()F */
(( org.anddev.andengine.entity.particle.initializer.BaseSingleValueInitializer ) p0 ).onInitializeParticle ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;->onInitializeParticle(Lorg/anddev/andengine/entity/particle/Particle;F)V
return;
} // .end method
protected abstract void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
} // .end method
