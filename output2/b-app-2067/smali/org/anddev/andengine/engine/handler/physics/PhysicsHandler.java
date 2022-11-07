public class org.anddev.andengine.engine.handler.physics.PhysicsHandler extends org.anddev.andengine.engine.handler.BaseEntityUpdateHandler {
	 /* # instance fields */
	 protected Float mAccelerationX;
	 protected Float mAccelerationY;
	 protected Float mAngularVelocity;
	 private Boolean mEnabled;
	 protected Float mVelocityX;
	 protected Float mVelocityY;
	 /* # direct methods */
	 public org.anddev.andengine.engine.handler.physics.PhysicsHandler ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/engine/handler/BaseEntityUpdateHandler;-><init>(Lorg/anddev/andengine/entity/IEntity;)V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mEnabled:Z */
		 /* iput v1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
		 /* iput v1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
		 /* iput v1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
		 /* iput v1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
		 /* iput v1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAngularVelocity:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void accelerate ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
		 /* add-float/2addr v0, p2 */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
		 return;
	 } // .end method
	 public Float getAccelerationX ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
	 } // .end method
	 public Float getAccelerationY ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
	 } // .end method
	 public Float getAngularVelocity ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAngularVelocity:F */
	 } // .end method
	 public Float getVelocityX ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
	 } // .end method
	 public Float getVelocityY ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
	 } // .end method
	 public Boolean isEnabled ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mEnabled:Z */
	 } // .end method
	 protected void onUpdate ( Float p0, org.anddev.andengine.entity.IEntity p1 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mEnabled:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
			 /* iget v1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
			 /* cmpl-float v2, v0, v3 */
			 /* if-nez v2, :cond_0 */
			 /* cmpl-float v2, v1, v3 */
			 if ( v2 != null) { // if-eqz v2, :cond_1
			 } // :cond_0
			 /* iget v2, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
			 /* mul-float/2addr v0, p1 */
			 /* add-float/2addr v0, v2 */
			 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
			 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
			 /* mul-float/2addr v1, p1 */
			 /* add-float/2addr v0, v1 */
			 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
		 } // :cond_1
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAngularVelocity:F */
		 /* cmpl-float v1, v0, v3 */
			 v1 = 		 if ( v1 != null) { // if-eqz v1, :cond_2
			 /* mul-float/2addr v0, p1 */
			 /* add-float/2addr v0, v1 */
		 } // :cond_2
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
		 /* iget v1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
		 /* cmpl-float v2, v0, v3 */
		 /* if-nez v2, :cond_3 */
		 /* cmpl-float v2, v1, v3 */
		 if ( v2 != null) { // if-eqz v2, :cond_4
		 v2 = 		 } // :cond_3
		 /* mul-float/2addr v0, p1 */
		 v2 = 		 /* add-float/2addr v0, v2 */
		 /* mul-float/2addr v1, p1 */
		 /* add-float/2addr v1, v2 */
	 } // :cond_4
	 return;
} // .end method
public void reset ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
	 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
	 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
	 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
	 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAngularVelocity:F */
	 return;
} // .end method
public void setAcceleration ( Float p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
	 return;
} // .end method
public void setAcceleration ( Float p0, Float p1 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
	 /* iput p2, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
	 return;
} // .end method
public void setAccelerationX ( Float p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationX:F */
	 return;
} // .end method
public void setAccelerationY ( Float p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAccelerationY:F */
	 return;
} // .end method
public void setAngularVelocity ( Float p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mAngularVelocity:F */
	 return;
} // .end method
public void setEnabled ( Boolean p0 ) {
	 /* .locals 0 */
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mEnabled:Z */
	 return;
} // .end method
public void setVelocity ( Float p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
	 return;
} // .end method
public void setVelocity ( Float p0, Float p1 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
	 /* iput p2, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
	 return;
} // .end method
public void setVelocityX ( Float p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityX:F */
	 return;
} // .end method
public void setVelocityY ( Float p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/physics/PhysicsHandler;->mVelocityY:F */
	 return;
} // .end method
