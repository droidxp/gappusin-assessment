public abstract class org.anddev.andengine.entity.particle.initializer.BaseTripleValueInitializer extends org.anddev.andengine.entity.particle.initializer.BaseDoubleValueInitializer {
	 /* # instance fields */
	 protected Float mMaxValueC;
	 protected Float mMinValueC;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.initializer.BaseTripleValueInitializer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;-><init>(FFFF)V */
		 /* iput p5, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->mMinValueC:F */
		 /* iput p6, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->mMaxValueC:F */
		 return;
	 } // .end method
	 private final Float getRandomValueC ( ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->mMinValueC:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->mMaxValueC:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->mMaxValueC:F */
	 } // :goto_0
} // :cond_0
v0 = org.anddev.andengine.util.MathUtils.RANDOM;
v0 = (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->mMaxValueC:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->mMinValueC:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->mMinValueC:F */
/* add-float/2addr v0, v1 */
} // .end method
/* # virtual methods */
protected final void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2 ) {
/* .locals 1 */
v0 = /* invoke-direct {p0}, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->getRandomValueC()F */
(( org.anddev.andengine.entity.particle.initializer.BaseTripleValueInitializer ) p0 ).onInitializeParticle ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/entity/particle/initializer/BaseTripleValueInitializer;->onInitializeParticle(Lorg/anddev/andengine/entity/particle/Particle;FFF)V
return;
} // .end method
protected abstract void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2, Float p3 ) {
} // .end method
