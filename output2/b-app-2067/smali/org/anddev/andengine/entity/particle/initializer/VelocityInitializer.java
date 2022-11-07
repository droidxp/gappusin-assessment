public class org.anddev.andengine.entity.particle.initializer.VelocityInitializer extends org.anddev.andengine.entity.particle.initializer.BaseDoubleValueInitializer {
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.initializer.VelocityInitializer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p1, p1, p1}, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;-><init>(FFFF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.particle.initializer.VelocityInitializer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p1, p2, p2}, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;-><init>(FFFF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.particle.initializer.VelocityInitializer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/particle/initializer/BaseDoubleValueInitializer;-><init>(FFFF)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getMaxVelocityX ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMaxValue:F */
	 } // .end method
	 public Float getMaxVelocityY ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMaxValueB:F */
	 } // .end method
	 public Float getMinVelocityX ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMinValue:F */
	 } // .end method
	 public Float getMinVelocityY ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMinValueB:F */
	 } // .end method
	 public void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).getPhysicsHandler ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/particle/Particle;->getPhysicsHandler()Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;
		 (( org.anddev.andengine.engine.handler.physics.PhysicsHandler ) v0 ).setVelocity ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->setVelocity(FF)V
		 return;
	 } // .end method
	 public void setVelocity ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMinValue:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMaxValue:F */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMinValueB:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMaxValueB:F */
		 return;
	 } // .end method
	 public void setVelocityX ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMinValue:F */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMaxValue:F */
		 return;
	 } // .end method
	 public void setVelocityX ( Float p0, Float p1 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMinValue:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMaxValue:F */
		 return;
	 } // .end method
	 public void setVelocityY ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMinValueB:F */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMaxValueB:F */
		 return;
	 } // .end method
	 public void setVelocityY ( Float p0, Float p1 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMinValueB:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/initializer/VelocityInitializer;->mMaxValueB:F */
		 return;
	 } // .end method
