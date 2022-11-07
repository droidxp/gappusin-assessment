public class com.badlogic.gdx.physics.box2d.joints.RevoluteJoint extends com.badlogic.gdx.physics.box2d.Joint {
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.RevoluteJoint ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/badlogic/gdx/physics/box2d/Joint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
		 return;
	 } // .end method
	 private native void jniEnableLimit ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native void jniEnableMotor ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native Float jniGetJointAngle ( Long p0 ) {
	 } // .end method
	 private native Float jniGetJointSpeed ( Long p0 ) {
	 } // .end method
	 private native Float jniGetLowerLimit ( Long p0 ) {
	 } // .end method
	 private native Float jniGetMotorSpeed ( Long p0 ) {
	 } // .end method
	 private native Float jniGetMotorTorque ( Long p0, Float p1 ) {
	 } // .end method
	 private native Float jniGetUpperLimit ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsLimitEnabled ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsMotorEnabled ( Long p0 ) {
	 } // .end method
	 private native void jniSetLimits ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 private native void jniSetMaxMotorTorque ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetMotorSpeed ( Long p0, Float p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public void enableLimit ( Boolean p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniEnableLimit(JZ)V */
		 return;
	 } // .end method
	 public void enableMotor ( Boolean p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniEnableMotor(JZ)V */
		 return;
	 } // .end method
	 public Float getJointAngle ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniGetJointAngle(J)F */
	 } // .end method
	 public Float getJointSpeed ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniGetJointSpeed(J)F */
	 } // .end method
	 public Float getLowerLimit ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniGetLowerLimit(J)F */
	 } // .end method
	 public Float getMotorSpeed ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniGetMotorSpeed(J)F */
	 } // .end method
	 public Float getMotorTorque ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniGetMotorTorque(JF)F */
	 } // .end method
	 public Float getUpperLimit ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniGetUpperLimit(J)F */
	 } // .end method
	 public Boolean isLimitEnabled ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniIsLimitEnabled(J)Z */
	 } // .end method
	 public Boolean isMotorEnabled ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniIsMotorEnabled(J)Z */
	 } // .end method
	 public void setLimits ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1, p2}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniSetLimits(JFF)V */
		 return;
	 } // .end method
	 public void setMaxMotorTorque ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniSetMaxMotorTorque(JF)V */
		 return;
	 } // .end method
	 public void setMotorSpeed ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/RevoluteJoint;->jniSetMotorSpeed(JF)V */
		 return;
	 } // .end method
