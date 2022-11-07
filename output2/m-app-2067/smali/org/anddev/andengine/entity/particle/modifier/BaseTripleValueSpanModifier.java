public abstract class org.anddev.andengine.entity.particle.modifier.BaseTripleValueSpanModifier extends org.anddev.andengine.entity.particle.modifier.BaseDoubleValueSpanModifier {
	 /* # instance fields */
	 private final Float mFromValueC;
	 private final Float mSpanValueC;
	 private final Float mToValueC;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.modifier.BaseTripleValueSpanModifier ( ) {
		 /* .locals 7 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p7 */
		 /* move v6, p8 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;-><init>(FFFFFF)V */
		 /* iput p5, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 /* iput p6, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->mToValueC:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->mToValueC:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->mSpanValueC:F */
		 return;
	 } // .end method
	 private final Float calculateValueC ( Float p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->mSpanValueC:F */
		 /* mul-float/2addr v1, p1 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 /* # virtual methods */
	 public void onSetInitialValues ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->mFromValueC:F */
		 (( org.anddev.andengine.entity.particle.modifier.BaseTripleValueSpanModifier ) p0 ).onSetInitialValues ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->onSetInitialValues(Lorg/anddev/andengine/entity/particle/Particle;FFF)V
		 return;
	 } // .end method
	 protected abstract void onSetInitialValues ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 protected void onSetValueInternal ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
		 /* .locals 3 */
		 v0 = 		 /* invoke-super {p0, p2}, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->calculateValue(F)F */
		 v1 = 		 /* invoke-super {p0, p2}, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->calculateValueB(F)F */
		 v2 = 		 /* invoke-direct {p0, p2}, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->calculateValueC(F)F */
		 (( org.anddev.andengine.entity.particle.modifier.BaseTripleValueSpanModifier ) p0 ).onSetValues ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;->onSetValues(Lorg/anddev/andengine/entity/particle/Particle;FFF)V
		 return;
	 } // .end method
	 protected void onSetValues ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 protected abstract void onSetValues ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
