public class com.badlogic.gdx.physics.box2d.joints.RopeJointDef extends com.badlogic.gdx.physics.box2d.JointDef {
	 /* # instance fields */
	 public final com.badlogic.gdx.math.Vector2 localAnchorA;
	 public final com.badlogic.gdx.math.Vector2 localAnchorB;
	 public Float maxLength;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.RopeJointDef ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/JointDef;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* const/high16 v1, -0x40800000 # -1.0f */
		 /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
		 this.localAnchorA = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
		 this.localAnchorB = v0;
		 /* iput v2, p0, Lcom/badlogic/gdx/physics/box2d/joints/RopeJointDef;->maxLength:F */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.RopeJoint;
		 this.type = v0;
		 return;
	 } // .end method
