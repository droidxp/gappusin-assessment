public class com.badlogic.gdx.physics.box2d.joints.WeldJointDef extends com.badlogic.gdx.physics.box2d.JointDef {
	 /* # instance fields */
	 public final com.badlogic.gdx.math.Vector2 localAnchorA;
	 public final com.badlogic.gdx.math.Vector2 localAnchorB;
	 public Float referenceAngle;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.WeldJointDef ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/JointDef;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localAnchorA = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localAnchorB = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WeldJointDef;->referenceAngle:F */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WeldJoint;
		 this.type = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void initialize ( com.badlogic.gdx.physics.box2d.Body p0, com.badlogic.gdx.physics.box2d.Body p1, com.badlogic.gdx.math.Vector2 p2 ) {
		 /* .locals 2 */
		 this.bodyA = p1;
		 this.bodyB = p2;
		 v0 = this.localAnchorA;
		 (( com.badlogic.gdx.physics.box2d.Body ) p1 ).getLocalPoint ( p3 ); // invoke-virtual {p1, p3}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localAnchorB;
		 (( com.badlogic.gdx.physics.box2d.Body ) p2 ).getLocalPoint ( p3 ); // invoke-virtual {p2, p3}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = 		 (( com.badlogic.gdx.physics.box2d.Body ) p2 ).getAngle ( ); // invoke-virtual {p2}, Lcom/badlogic/gdx/physics/box2d/Body;->getAngle()F
		 v1 = 		 (( com.badlogic.gdx.physics.box2d.Body ) p1 ).getAngle ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Body;->getAngle()F
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WeldJointDef;->referenceAngle:F */
		 return;
	 } // .end method
