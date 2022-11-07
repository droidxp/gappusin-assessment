public abstract class org.anddev.andengine.entity.particle.modifier.BaseDoubleValueSpanModifier extends org.anddev.andengine.entity.particle.modifier.BaseSingleValueSpanModifier {
	 /* # instance fields */
	 private final Float mFromValueB;
	 private final Float mSpanValueB;
	 private final Float mToValueB;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.modifier.BaseDoubleValueSpanModifier ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1, p2, p5, p6}, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;-><init>(FFFF)V */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->mToValueB:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->mToValueB:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->mSpanValueB:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final Float calculateValueB ( Float p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->mSpanValueB:F */
		 /* mul-float/2addr v1, p1 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public void onSetInitialValue ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->mFromValueB:F */
		 (( org.anddev.andengine.entity.particle.modifier.BaseDoubleValueSpanModifier ) p0 ).onSetInitialValues ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->onSetInitialValues(Lorg/anddev/andengine/entity/particle/Particle;FF)V
		 return;
	 } // .end method
	 protected abstract void onSetInitialValues ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2 ) {
	 } // .end method
	 protected void onSetValue ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 protected void onSetValueInternal ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
		 /* .locals 2 */
		 v0 = 		 /* invoke-super {p0, p2}, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->calculateValue(F)F */
		 v1 = 		 (( org.anddev.andengine.entity.particle.modifier.BaseDoubleValueSpanModifier ) p0 ).calculateValueB ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->calculateValueB(F)F
		 (( org.anddev.andengine.entity.particle.modifier.BaseDoubleValueSpanModifier ) p0 ).onSetValues ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lorg/anddev/andengine/entity/particle/modifier/BaseDoubleValueSpanModifier;->onSetValues(Lorg/anddev/andengine/entity/particle/Particle;FF)V
		 return;
	 } // .end method
	 protected abstract void onSetValues ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2 ) {
	 } // .end method
