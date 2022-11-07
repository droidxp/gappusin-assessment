public class com.badlogic.gdx.physics.box2d.joints.PrismaticJoint extends com.badlogic.gdx.physics.box2d.Joint {
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.PrismaticJoint ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/badlogic/gdx/physics/box2d/Joint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
		 return;
	 } // .end method
	 private native void jniEnableLimit ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native void jniEnableMotor ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native Float jniGetJointSpeed ( Long p0 ) {
	 } // .end method
	 private native Float jniGetJointTranslation ( Long p0 ) {
	 } // .end method
	 private native Float jniGetLowerLimit ( Long p0 ) {
	 } // .end method
	 private native Float jniGetMotorForce ( Long p0, Float p1 ) {
	 } // .end method
	 private native Float jniGetMotorSpeed ( Long p0 ) {
	 } // .end method
	 private native Float jniGetUpperLimit ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsLimitEnabled ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsMotorEnabled ( Long p0 ) {
	 } // .end method
	 private native void jniSetLimits ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 private native void jniSetMaxMotorForce ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetMotorSpeed ( Long p0, Float p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public void enableLimit ( Boolean p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniEnableLimit(JZ)V */
		 return;
	 } // .end method
	 public void enableMotor ( Boolean p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniEnableMotor(JZ)V */
		 return;
	 } // .end method
	 public Float getJointSpeed ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniGetJointSpeed(J)F */
	 } // .end method
	 public Float getJointTranslation ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniGetJointTranslation(J)F */
	 } // .end method
	 public Float getLowerLimit ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniGetLowerLimit(J)F */
	 } // .end method
	 public Float getMotorForce ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniGetMotorForce(JF)F */
	 } // .end method
	 public Float getMotorSpeed ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniGetMotorSpeed(J)F */
	 } // .end method
	 public Float getUpperLimit ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniGetUpperLimit(J)F */
	 } // .end method
	 public Boolean isLimitEnabled ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniIsLimitEnabled(J)Z */
	 } // .end method
	 public Boolean isMotorEnabled ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniIsMotorEnabled(J)Z */
	 } // .end method
	 public void setLimits ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1, p2}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniSetLimits(JFF)V */
		 return;
	 } // .end method
	 public void setMaxMotorForce ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniSetMaxMotorForce(JF)V */
		 return;
	 } // .end method
	 public void setMotorSpeed ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJoint;->jniSetMotorSpeed(JF)V */
		 return;
	 } // .end method
