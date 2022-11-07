public class com.badlogic.gdx.physics.box2d.joints.GearJoint extends com.badlogic.gdx.physics.box2d.Joint {
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.GearJoint ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/badlogic/gdx/physics/box2d/Joint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
		 return;
	 } // .end method
	 private native Float jniGetRatio ( Long p0 ) {
	 } // .end method
	 private native void jniSetRatio ( Long p0, Float p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public Float getRatio ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/GearJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/GearJoint;->jniGetRatio(J)F */
	 } // .end method
	 public void setRatio ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/GearJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/GearJoint;->jniSetRatio(JF)V */
		 return;
	 } // .end method
