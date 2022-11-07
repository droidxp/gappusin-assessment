public class com.badlogic.gdx.physics.box2d.joints.MouseJoint extends com.badlogic.gdx.physics.box2d.Joint {
	 /* # instance fields */
	 private final com.badlogic.gdx.math.Vector2 target;
	 final tmp;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.MouseJoint ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/badlogic/gdx/physics/box2d/Joint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 this.tmp = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.target = v0;
		 return;
	 } // .end method
	 private native Float jniGetDampingRatio ( Long p0 ) {
	 } // .end method
	 private native Float jniGetFrequency ( Long p0 ) {
	 } // .end method
	 private native Float jniGetMaxForce ( Long p0 ) {
	 } // .end method
	 private native void jniGetTarget ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniSetDampingRatio ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetFrequency ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetMaxForce ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetTarget ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 /* # virtual methods */
	 public Float getDampingRatio ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->jniGetDampingRatio(J)F */
	 } // .end method
	 public Float getFrequency ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->jniGetFrequency(J)F */
	 } // .end method
	 public Float getMaxForce ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->jniGetMaxForce(J)F */
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getTarget ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->jniGetTarget(J[F)V */
		 v0 = this.target;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.target;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.target;
	 } // .end method
	 public void setDampingRatio ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->jniSetDampingRatio(JF)V */
		 return;
	 } // .end method
	 public void setFrequency ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->jniSetFrequency(JF)V */
		 return;
	 } // .end method
	 public void setMaxForce ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->jniSetMaxForce(JF)V */
		 return;
	 } // .end method
	 public void setTarget ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->addr:J */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/joints/MouseJoint;->jniSetTarget(JFF)V */
		 return;
	 } // .end method
