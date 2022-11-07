public class com.badlogic.gdx.physics.box2d.BodyDef {
	 /* # instance fields */
	 public Boolean active;
	 public Boolean allowSleep;
	 public Float angle;
	 public Float angularDamping;
	 public Float angularVelocity;
	 public Boolean awake;
	 public Boolean bullet;
	 public Boolean fixedRotation;
	 public Float gravityScale;
	 public Float linearDamping;
	 public final com.badlogic.gdx.math.Vector2 linearVelocity;
	 public final com.badlogic.gdx.math.Vector2 position;
	 public com.badlogic.gdx.physics.box2d.BodyDef$BodyType type;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.BodyDef ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 v0 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.StaticBody;
		 this.type = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.position = v0;
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->angle:F */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.linearVelocity = v0;
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->angularVelocity:F */
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->linearDamping:F */
		 /* iput v1, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->angularDamping:F */
		 /* iput-boolean v2, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->allowSleep:Z */
		 /* iput-boolean v2, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->awake:Z */
		 /* iput-boolean v3, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->fixedRotation:Z */
		 /* iput-boolean v3, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->bullet:Z */
		 /* iput-boolean v2, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->active:Z */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/badlogic/gdx/physics/box2d/BodyDef;->gravityScale:F */
		 return;
	 } // .end method
