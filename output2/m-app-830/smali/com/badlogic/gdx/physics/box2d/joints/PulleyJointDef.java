public class com.badlogic.gdx.physics.box2d.joints.PulleyJointDef extends com.badlogic.gdx.physics.box2d.JointDef {
	 /* # static fields */
	 private static final Float minPulleyLength;
	 /* # instance fields */
	 public final com.badlogic.gdx.math.Vector2 groundAnchorA;
	 public final com.badlogic.gdx.math.Vector2 groundAnchorB;
	 public Float lengthA;
	 public Float lengthB;
	 public final com.badlogic.gdx.math.Vector2 localAnchorA;
	 public final com.badlogic.gdx.math.Vector2 localAnchorB;
	 public Float ratio;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.PulleyJointDef ( ) {
		 /* .locals 4 */
		 /* const/high16 v3, -0x40800000 # -1.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/JointDef;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0, v3, v1}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
		 this.groundAnchorA = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0, v1, v1}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
		 this.groundAnchorB = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0, v3, v2}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
		 this.localAnchorA = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
		 this.localAnchorB = v0;
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->lengthA:F */
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->lengthB:F */
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->ratio:F */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PulleyJoint;
		 this.type = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->collideConnected:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void initialize ( com.badlogic.gdx.physics.box2d.Body p0, com.badlogic.gdx.physics.box2d.Body p1, com.badlogic.gdx.math.Vector2 p2, com.badlogic.gdx.math.Vector2 p3, com.badlogic.gdx.math.Vector2 p4, com.badlogic.gdx.math.Vector2 p5, Float p6 ) {
		 /* .locals 2 */
		 this.bodyA = p1;
		 this.bodyB = p2;
		 v0 = this.groundAnchorA;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( p3 ); // invoke-virtual {v0, p3}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.groundAnchorB;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( p4 ); // invoke-virtual {v0, p4}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localAnchorA;
		 (( com.badlogic.gdx.physics.box2d.Body ) p1 ).getLocalPoint ( p5 ); // invoke-virtual {p1, p5}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localAnchorB;
		 (( com.badlogic.gdx.physics.box2d.Body ) p2 ).getLocalPoint ( p6 ); // invoke-virtual {p2, p6}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = 		 (( com.badlogic.gdx.math.Vector2 ) p5 ).dst ( p3 ); // invoke-virtual {p5, p3}, Lcom/badlogic/gdx/math/Vector2;->dst(Lcom/badlogic/gdx/math/Vector2;)F
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->lengthA:F */
		 v0 = 		 (( com.badlogic.gdx.math.Vector2 ) p6 ).dst ( p4 ); // invoke-virtual {p6, p4}, Lcom/badlogic/gdx/math/Vector2;->dst(Lcom/badlogic/gdx/math/Vector2;)F
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->lengthB:F */
		 /* iput p7, p0, Lcom/badlogic/gdx/physics/box2d/joints/PulleyJointDef;->ratio:F */
		 return;
	 } // .end method
