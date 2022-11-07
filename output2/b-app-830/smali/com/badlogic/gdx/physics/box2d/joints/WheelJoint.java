public class com.badlogic.gdx.physics.box2d.joints.WheelJoint extends com.badlogic.gdx.physics.box2d.Joint {
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.WheelJoint ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/badlogic/gdx/physics/box2d/Joint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
		 return;
	 } // .end method
	 private Boolean isMotorEnabled ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniIsMotorEnabled(J)Z */
	 } // .end method
	 private native void jniEnableMotor ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native Float jniGetJointSpeed ( Long p0 ) {
	 } // .end method
	 private native Float jniGetJointTranslation ( Long p0 ) {
	 } // .end method
	 private native Float jniGetMaxMotorTorque ( Long p0 ) {
	 } // .end method
	 private native Float jniGetMotorSpeed ( Long p0 ) {
	 } // .end method
	 private native Float jniGetMotorTorque ( Long p0, Float p1 ) {
	 } // .end method
	 private native Float jniGetSpringDampingRatio ( Long p0 ) {
	 } // .end method
	 private native Float jniGetSpringFrequencyHz ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsMotorEnabled ( Long p0 ) {
	 } // .end method
	 private native void jniSetMaxMotorTorque ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetMotorSpeed ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetSpringDampingRatio ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetSpringFrequencyHz ( Long p0, Float p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public void enableMotor ( Boolean p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniEnableMotor(JZ)V */
		 return;
	 } // .end method
	 public Float getJointSpeed ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniGetJointSpeed(J)F */
	 } // .end method
	 public Float getJointTranslation ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniGetJointTranslation(J)F */
	 } // .end method
	 public Float getMaxMotorTorque ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniGetMaxMotorTorque(J)F */
	 } // .end method
	 public Float getMotorSpeed ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniGetMotorSpeed(J)F */
	 } // .end method
	 public Float getMotorTorque ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniGetMotorTorque(JF)F */
	 } // .end method
	 public Float getSpringDampingRatio ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniGetSpringDampingRatio(J)F */
	 } // .end method
	 public Float getSpringFrequencyHz ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniGetSpringFrequencyHz(J)F */
	 } // .end method
	 public void setMaxMotorTorque ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniSetMaxMotorTorque(JF)V */
		 return;
	 } // .end method
	 public void setMotorSpeed ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniSetMotorSpeed(JF)V */
		 return;
	 } // .end method
	 public void setSpringDampingRatio ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniSetSpringDampingRatio(JF)V */
		 return;
	 } // .end method
	 public void setSpringFrequencyHz ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/WheelJoint;->jniSetSpringFrequencyHz(JF)V */
		 return;
	 } // .end method
