public class org.anddev.andengine.entity.particle.initializer.RotationInitializer extends org.anddev.andengine.entity.particle.initializer.BaseSingleValueInitializer {
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.initializer.RotationInitializer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p1}, Lorg/anddev/andengine/entity/particle/initializer/RotationInitializer;-><init>(FF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.particle.initializer.RotationInitializer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/particle/initializer/BaseSingleValueInitializer;-><init>(FF)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getMaxRotation ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/RotationInitializer;->mMaxValue:F */
	 } // .end method
	 public Float getMinRotation ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/RotationInitializer;->mMinValue:F */
	 } // .end method
	 public void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).setRotation ( p2 ); // invoke-virtual {p1, p2}, Lorg/anddev/andengine/entity/particle/Particle;->setRotation(F)V
		 return;
	 } // .end method
	 public void setRotation ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/RotationInitializer;->mMinValue:F */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/RotationInitializer;->mMaxValue:F */
		 return;
	 } // .end method
	 public void setRotation ( Float p0, Float p1 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/RotationInitializer;->mMinValue:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/initializer/RotationInitializer;->mMaxValue:F */
		 return;
	 } // .end method
