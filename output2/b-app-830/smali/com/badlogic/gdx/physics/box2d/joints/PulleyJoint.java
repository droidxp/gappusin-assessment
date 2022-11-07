public class com.badlogic.gdx.physics.box2d.joints.PulleyJoint extends com.badlogic.gdx.physics.box2d.Joint {
	 /* # instance fields */
	 private final com.badlogic.gdx.math.Vector2 groundAnchorA;
	 private final com.badlogic.gdx.math.Vector2 groundAnchorB;
	 private final tmp;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.PulleyJoint ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/badlogic/gdx/physics/box2d/Joint;-><init>(Lcom/badlogic/gdx/physics/box2d/World;J)V */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 this.tmp = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.groundAnchorA = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.groundAnchorB = v0;
		 return;
	 } // .end method
	 private native void jniGetGroundAnchorA ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetGroundAnchorB ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native Float jniGetLength1 ( Long p0 ) {
	 } // .end method
	 private native Float jniGetLength2 ( Long p0 ) {
	 } // .end method
	 private native Float jniGetRatio ( Long p0 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Vector2 getGroundAnchorA ( ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->jniGetGroundAnchorA(J[F)V */
		 v0 = this.groundAnchorA;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 v2 = this.tmp;
		 int v3 = 1; // const/4 v3, 0x1
		 /* aget v2, v2, v3 */
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.groundAnchorA;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getGroundAnchorB ( ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->jniGetGroundAnchorB(J[F)V */
		 v0 = this.groundAnchorB;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 v2 = this.tmp;
		 int v3 = 1; // const/4 v3, 0x1
		 /* aget v2, v2, v3 */
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.groundAnchorB;
	 } // .end method
	 public Float getLength1 ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->jniGetLength1(J)F */
	 } // .end method
	 public Float getLength2 ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->jniGetLength2(J)F */
	 } // .end method
	 public Float getRatio ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJoint;->jniGetRatio(J)F */
	 } // .end method
