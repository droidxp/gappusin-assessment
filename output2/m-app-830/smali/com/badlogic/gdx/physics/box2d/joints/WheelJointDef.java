public class com.badlogic.gdx.physics.box2d.joints.WheelJointDef extends com.badlogic.gdx.physics.box2d.JointDef {
	 /* # instance fields */
	 public Float dampingRatio;
	 public Boolean enableMotor;
	 public Float frequencyHz;
	 public final com.badlogic.gdx.math.Vector2 localAnchorA;
	 public final com.badlogic.gdx.math.Vector2 localAnchorB;
	 public final com.badlogic.gdx.math.Vector2 localAxisA;
	 public Float maxMotorTorque;
	 public Float motorSpeed;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.WheelJointDef ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/JointDef;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localAnchorA = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localAnchorB = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
		 this.localAxisA = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->enableMotor:Z */
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->maxMotorTorque:F */
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->motorSpeed:F */
		 /* const/high16 v0, 0x40000000 # 2.0f */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->frequencyHz:F */
		 /* const v0, 0x3f333333 # 0.7f */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/WheelJointDef;->dampingRatio:F */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.WheelJoint;
		 this.type = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 void initialize ( com.badlogic.gdx.physics.box2d.Body p0, com.badlogic.gdx.physics.box2d.Body p1, com.badlogic.gdx.math.Vector2 p2, com.badlogic.gdx.math.Vector2 p3 ) {
		 /* .locals 2 */
		 this.bodyA = p1;
		 this.bodyB = p2;
		 v0 = this.localAnchorA;
		 (( com.badlogic.gdx.physics.box2d.Body ) p1 ).getLocalPoint ( p3 ); // invoke-virtual {p1, p3}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localAnchorB;
		 (( com.badlogic.gdx.physics.box2d.Body ) p2 ).getLocalPoint ( p3 ); // invoke-virtual {p2, p3}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localAxisA;
		 (( com.badlogic.gdx.physics.box2d.Body ) p1 ).getLocalVector ( p4 ); // invoke-virtual {p1, p4}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalVector(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 return;
	 } // .end method
