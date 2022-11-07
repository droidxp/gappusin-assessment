public class com.badlogic.gdx.physics.box2d.joints.PrismaticJointDef extends com.badlogic.gdx.physics.box2d.JointDef {
	 /* # instance fields */
	 public Boolean enableLimit;
	 public Boolean enableMotor;
	 public final com.badlogic.gdx.math.Vector2 localAnchorA;
	 public final com.badlogic.gdx.math.Vector2 localAnchorB;
	 public final com.badlogic.gdx.math.Vector2 localAxisA;
	 public Float lowerTranslation;
	 public Float maxMotorForce;
	 public Float motorSpeed;
	 public Float referenceAngle;
	 public Float upperTranslation;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.PrismaticJointDef ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
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
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->referenceAngle:F */
		 /* iput-boolean v3, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->enableLimit:Z */
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->lowerTranslation:F */
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->upperTranslation:F */
		 /* iput-boolean v3, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->enableMotor:Z */
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->maxMotorForce:F */
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->motorSpeed:F */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.PrismaticJoint;
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
		 (( com.badlogic.gdx.physics.box2d.Body ) p2 ).getLocalPoint ( p3 ); // invoke-virtual {p2, p3}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalPoint(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localAxisA;
		 (( com.badlogic.gdx.physics.box2d.Body ) p1 ).getLocalVector ( p4 ); // invoke-virtual {p1, p4}, Lcom/badlogic/gdx/physics/box2d/Body;->getLocalVector(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 v0 = 		 (( com.badlogic.gdx.physics.box2d.Body ) p2 ).getAngle ( ); // invoke-virtual {p2}, Lcom/badlogic/gdx/physics/box2d/Body;->getAngle()F
		 v1 = 		 (( com.badlogic.gdx.physics.box2d.Body ) p1 ).getAngle ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/Body;->getAngle()F
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/PrismaticJointDef;->referenceAngle:F */
		 return;
	 } // .end method
