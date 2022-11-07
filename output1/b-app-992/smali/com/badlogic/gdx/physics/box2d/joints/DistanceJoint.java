public class com.badlogic.gdx.physics.box2d.joints.DistanceJoint extends com.badlogic.gdx.physics.box2d.Joint {
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.DistanceJoint ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/badlogic/gdx/physics/box2d/Joint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
		 return;
	 } // .end method
	 private native Float jniGetDampingRatio ( Long p0 ) {
	 } // .end method
	 private native Float jniGetFrequency ( Long p0 ) {
	 } // .end method
	 private native Float jniGetLength ( Long p0 ) {
	 } // .end method
	 private native void jniSetDampingRatio ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetFrequency ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetLength ( Long p0, Float p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public Float getDampingRatio ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->jniGetDampingRatio(J)F */
	 } // .end method
	 public Float getFrequency ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->jniGetFrequency(J)F */
	 } // .end method
	 public Float getLength ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->jniGetLength(J)F */
	 } // .end method
	 public void setDampingRatio ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->jniSetDampingRatio(JF)V */
		 return;
	 } // .end method
	 public void setFrequency ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->jniSetFrequency(JF)V */
		 return;
	 } // .end method
	 public void setLength ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJoint;->jniSetLength(JF)V */
		 return;
	 } // .end method
