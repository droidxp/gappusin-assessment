public abstract class org.anddev.andengine.entity.particle.initializer.BaseDoubleValueInitializer extends org.anddev.andengine.entity.particle.initializer.BaseSingleValueInitializer {
	 /* # instance fields */
	 protected Float mMaxValueB;
	 protected Float mMinValueB;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.initializer.BaseDoubleValueInitializer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;-><init>(FF)V */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->mMinValueB:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->mMaxValueB:F */
		 return;
	 } // .end method
	 private final Float getRandomValueB ( ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->mMinValueB:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->mMaxValueB:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->mMaxValueB:F */
	 } // :goto_0
} // :cond_0
v0 = org.anddev.andengine.util.MathUtils.RANDOM;
v0 = (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->mMaxValueB:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->mMinValueB:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->mMinValueB:F */
/* add-float/2addr v0, v1 */
} // .end method
/* # virtual methods */
protected final void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
/* .locals 1 */
v0 = /* invoke-direct {p0}, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->getRandomValueB()F */
(( org.anddev.andengine.entity.particle.initializer.BaseDoubleValueInitializer ) p0 ).onInitializeParticle ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;->onInitializeParticle(Lorg/anddev/andengine/entity/particle/Particle;FF)V
return;
} // .end method
protected abstract void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2 ) {
} // .end method
