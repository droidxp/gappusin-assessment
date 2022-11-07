public class com.badlogic.gdx.physics.box2d.joints.GearJointDef extends com.badlogic.gdx.physics.box2d.JointDef {
	 /* # instance fields */
	 public com.badlogic.gdx.physics.box2d.Joint joint1;
	 public com.badlogic.gdx.physics.box2d.Joint joint2;
	 public Float ratio;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.joints.GearJointDef ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/JointDef;-><init>()V */
		 this.joint1 = v0;
		 this.joint2 = v0;
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/joints/GearJointDef;->ratio:F */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.GearJoint;
		 this.type = v0;
		 return;
	 } // .end method
