public class com.badlogic.gdx.physics.box2d.joints.FrictionJoint extends com.badlogic.gdx.physics.box2d.Joint {
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.FrictionJoint ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/badlogic/gdx/physics/box2d/Joint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
		 return;
	 } // .end method
	 private native Float jniGetMaxForce ( Long p0 ) {
	 } // .end method
	 private native Float jniGetMaxTorque ( Long p0 ) {
	 } // .end method
	 private native void jniSetMaxForce ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetMaxTorque ( Long p0, Float p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public Float getMaxForce ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;->jniGetMaxForce(J)F */
	 } // .end method
	 public Float getMaxTorque ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;->jniGetMaxTorque(J)F */
	 } // .end method
	 public void setMaxForce ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;->jniSetMaxForce(JF)V */
		 return;
	 } // .end method
	 public void setMaxTorque ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/FrictionJoint;->jniSetMaxTorque(JF)V */
		 return;
	 } // .end method
