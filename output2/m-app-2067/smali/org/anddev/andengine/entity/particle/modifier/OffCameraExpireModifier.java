public class org.anddev.andengine.entity.particle.modifier.OffCameraExpireModifier implements org.anddev.andengine.entity.particle.modifier.IParticleModifier {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.engine.camera.Camera mCamera;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.modifier.OffCameraExpireModifier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mCamera = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.engine.camera.Camera getCamera ( ) {
		 /* .locals 1 */
		 v0 = this.mCamera;
	 } // .end method
	 public void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onUpdateParticle ( org.anddev.andengine.entity.particle.Particle p0 ) {
		 /* .locals 1 */
		 v0 = this.mCamera;
		 v0 = 		 (( org.anddev.andengine.engine.camera.Camera ) v0 ).isRectangularShapeVisible ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->isRectangularShapeVisible(Lorg/anddev/andengine/entity/shape/RectangularShape;)Z
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).setDead ( v0 ); // invoke-virtual {p1, v0}, Lorg/anddev/andengine/entity/particle/Particle;->setDead(Z)V
	 } // :cond_0
	 return;
} // .end method
