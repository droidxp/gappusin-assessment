public class com.badlogic.gdx.physics.box2d.joints.DistanceJointDef extends com.badlogic.gdx.physics.box2d.JointDef {
	 /* # instance fields */
	 public Float dampingRatio;
	 public Float frequencyHz;
	 public Float length;
	 public final com.badlogic.gdx.math.Vector2 localAnchorA;
	 public final com.badlogic.gdx.math.Vector2 localAnchorB;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.DistanceJointDef ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/JointDef;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localAnchorA = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localAnchorB = v0;
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJointDef;->length:F */
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJointDef;->frequencyHz:F */
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJointDef;->dampingRatio:F */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.DistanceJoint;
		 this.type = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void initialize ( com.badlogic.gdx.physics.box2d.Body p0, com.badlogic.gdx.physics.box2d.Body p1, com.badlogic.gdx.math.Vector2 p2, com.badlogic.gdx.math.Vector2 p3 ) {
		 /* .locals 2 */
		 this.bodyA = p1;
		 this.bodyB = p2;
		 v0 = this.localAnchorA;
		 (( com.badlogic.gdx.physics.box2d.Body ) p1 ).getLocalPoint ( p3 ); // invoke-virtual {p1, p3}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localAnchorB;
		 (( com.badlogic.gdx.physics.box2d.Body ) p2 ).getLocalPoint ( p4 ); // invoke-virtual {p2, p4}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = 		 (( com.badlogic.gdx.math.Vector2 ) p3 ).dst ( p4 ); // invoke-virtual {p3, p4}, Lcom/badlogic/gdx/math/Vector2;->dst(Lcom/badlogic/gdx/math/Vector2;)F
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/DistanceJointDef;->length:F */
		 return;
	 } // .end method
