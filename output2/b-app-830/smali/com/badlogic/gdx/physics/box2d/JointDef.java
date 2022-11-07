public class com.badlogic.gdx.physics.box2d.JointDef {
	 /* # instance fields */
	 public com.badlogic.gdx.physics.box2d.Body bodyA;
	 public com.badlogic.gdx.physics.box2d.Body bodyB;
	 public Boolean collideConnected;
	 public com.badlogic.gdx.physics.box2d.JointDef$JointType type;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.JointDef ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.Unknown;
		 this.type = v0;
		 this.bodyA = v1;
		 this.bodyB = v1;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/badlogic/gdx/physics/box2d/JointDef;->collideConnected:Z */
		 return;
	 } // .end method
