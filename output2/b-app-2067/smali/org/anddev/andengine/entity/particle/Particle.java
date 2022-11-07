public class org.anddev.andengine.entity.particle.Particle extends org.anddev.andengine.entity.sprite.Sprite {
	 /* # instance fields */
	 Boolean mDead;
	 private Float mDeathTime;
	 private Float mLifeTime;
	 private final org.anddev.andengine.engine.handler.physics.PhysicsHandler mPhysicsHandler;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.Particle ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/sprite/Sprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 /* const/high16 v0, -0x40800000 # -1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDeathTime:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDead:Z */
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler; */
		 /* invoke-direct {v0, p0}, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;-><init>(Lorg/anddev/andengine/entity/IEntity;)V */
		 this.mPhysicsHandler = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mLifeTime:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.particle.Particle ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/sprite/Sprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)V */
		 /* const/high16 v0, -0x40800000 # -1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDeathTime:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDead:Z */
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler; */
		 /* invoke-direct {v0, p0}, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;-><init>(Lorg/anddev/andengine/entity/IEntity;)V */
		 this.mPhysicsHandler = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mLifeTime:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getDeathTime ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDeathTime:F */
	 } // .end method
	 public Float getLifeTime ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mLifeTime:F */
	 } // .end method
	 public org.anddev.andengine.engine.handler.physics.PhysicsHandler getPhysicsHandler ( ) {
		 /* .locals 1 */
		 v0 = this.mPhysicsHandler;
	 } // .end method
	 public Boolean isDead ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDead:Z */
	 } // .end method
	 protected void onManagedUpdate ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDead:Z */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mLifeTime:F */
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mLifeTime:F */
		 v0 = this.mPhysicsHandler;
		 (( org.anddev.andengine.engine.handler.physics.PhysicsHandler ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->onUpdate(F)V
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/sprite/Sprite;->onManagedUpdate(F)V */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDeathTime:F */
		 /* const/high16 v1, -0x40800000 # -1.0f */
		 /* cmpl-float v1, v0, v1 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/Particle;->mLifeTime:F */
			 /* cmpl-float v0, v1, v0 */
			 /* if-lez v0, :cond_0 */
			 int v0 = 1; // const/4 v0, 0x1
			 (( org.anddev.andengine.entity.particle.Particle ) p0 ).setDead ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/particle/Particle;->setDead(Z)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void reset ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/entity/sprite/Sprite;->reset()V */
		 v0 = this.mPhysicsHandler;
		 (( org.anddev.andengine.engine.handler.physics.PhysicsHandler ) v0 ).reset ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->reset()V
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDead:Z */
		 /* const/high16 v0, -0x40800000 # -1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDeathTime:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/Particle;->mLifeTime:F */
		 return;
	 } // .end method
	 public void setDead ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDead:Z */
		 return;
	 } // .end method
	 public void setDeathTime ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/Particle;->mDeathTime:F */
		 return;
	 } // .end method
