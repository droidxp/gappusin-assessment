public abstract class org.anddev.andengine.entity.particle.modifier.BaseSingleValueSpanModifier implements org.anddev.andengine.entity.particle.modifier.IParticleModifier {
	 /* # interfaces */
	 /* # instance fields */
	 private final Float mDuration;
	 private final Float mFromTime;
	 private final Float mFromValue;
	 private final Float mSpanValue;
	 private final Float mToTime;
	 private final Float mToValue;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.modifier.BaseSingleValueSpanModifier ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mToValue:F */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mFromTime:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mToTime:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mToValue:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mSpanValue:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mToTime:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mFromTime:F */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mDuration:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final Float calculateValue ( Float p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mSpanValue:F */
		 /* mul-float/2addr v1, p1 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mFromValue:F */
		 (( org.anddev.andengine.entity.particle.modifier.BaseSingleValueSpanModifier ) p0 ).onSetInitialValue ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->onSetInitialValue(Lorg/anddev/andengine/entity/particle/Particle;F)V
		 return;
	 } // .end method
	 protected abstract void onSetInitialValue ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
	 } // .end method
	 protected abstract void onSetValue ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
	 } // .end method
	 protected void onSetValueInternal ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.entity.particle.modifier.BaseSingleValueSpanModifier ) p0 ).calculateValue ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->calculateValue(F)F
		 (( org.anddev.andengine.entity.particle.modifier.BaseSingleValueSpanModifier ) p0 ).onSetValue ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->onSetValue(Lorg/anddev/andengine/entity/particle/Particle;F)V
		 return;
	 } // .end method
	 public void onUpdateParticle ( org.anddev.andengine.entity.particle.Particle p0 ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).getLifeTime ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/particle/Particle;->getLifeTime()F
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mFromTime:F */
		 /* cmpl-float v1, v0, v1 */
		 /* if-lez v1, :cond_0 */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mToTime:F */
		 /* cmpg-float v1, v0, v1 */
		 /* if-gez v1, :cond_0 */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mFromTime:F */
		 /* sub-float/2addr v0, v1 */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->mDuration:F */
		 /* div-float/2addr v0, v1 */
		 (( org.anddev.andengine.entity.particle.modifier.BaseSingleValueSpanModifier ) p0 ).onSetValueInternal ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;->onSetValueInternal(Lorg/anddev/andengine/entity/particle/Particle;F)V
	 } // :cond_0
	 return;
} // .end method
