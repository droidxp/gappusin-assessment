public class com.badlogic.gdx.physics.box2d.joints.MouseJointDef extends com.badlogic.gdx.physics.box2d.JointDef {
	 /* # instance fields */
	 public Float dampingRatio;
	 public Float frequencyHz;
	 public Float maxForce;
	 public final com.badlogic.gdx.math.Vector2 target;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.MouseJointDef ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/JointDef;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.target = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJointDef;->maxForce:F */
		 /* const/high16 v0, 0x40a00000 # 5.0f */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJointDef;->frequencyHz:F */
		 /* const v0, 0x3f333333 # 0.7f */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/MouseJointDef;->dampingRatio:F */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.MouseJoint;
		 this.type = v0;
		 return;
	 } // .end method
