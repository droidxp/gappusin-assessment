public class com.badlogic.gdx.physics.box2d.WorldManifold {
	 /* # instance fields */
	 protected final com.badlogic.gdx.math.Vector2 normal;
	 protected Integer numContactPoints;
	 protected final com.badlogic.gdx.math.Vector2 points;
	 /* # direct methods */
	 protected com.badlogic.gdx.physics.box2d.WorldManifold ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.normal = v0;
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [Lcom/badlogic/gdx/math/Vector2; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 /* aput-object v2, v0, v1 */
		 this.points = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Vector2 getNormal ( ) {
		 /* .locals 1 */
		 v0 = this.normal;
	 } // .end method
	 public Integer getNumberOfContactPoints ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/badlogic/gdx/physics/box2d/WorldManifold;->numContactPoints:I */
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getPoints ( ) {
		 /* .locals 1 */
		 v0 = this.points;
	 } // .end method
