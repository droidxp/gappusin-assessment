public class com.badlogic.gdx.physics.box2d.FixtureDef {
	 /* # instance fields */
	 public Float density;
	 public final com.badlogic.gdx.physics.box2d.Filter filter;
	 public Float friction;
	 public Boolean isSensor;
	 public Float restitution;
	 public com.badlogic.gdx.physics.box2d.Shape shape;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.FixtureDef ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const v0, 0x3e4ccccd # 0.2f */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->friction:F */
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->restitution:F */
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->density:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->isSensor:Z */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Filter; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/physics/box2d/Filter;-><init>()V */
		 this.filter = v0;
		 return;
	 } // .end method
