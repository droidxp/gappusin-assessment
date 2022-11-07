public class com.badlogic.gdx.physics.box2d.CircleShape extends com.badlogic.gdx.physics.box2d.Shape {
	 /* # instance fields */
	 private final com.badlogic.gdx.math.Vector2 position;
	 private final tmp;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.CircleShape ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/Shape;-><init>()V */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 this.tmp = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.position = v0;
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/CircleShape;->newCircleShape()J */
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/CircleShape;->addr:J */
		 return;
	 } // .end method
	 protected com.badlogic.gdx.physics.box2d.CircleShape ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/Shape;-><init>()V */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 this.tmp = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.position = v0;
		 /* iput-wide p1, p0, Lcom/badlogic/gdx/physics/box2d/CircleShape;->addr:J */
		 return;
	 } // .end method
	 private native void jniGetPosition ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniSetPosition ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 private native Long newCircleShape ( ) {
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Vector2 getPosition ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/CircleShape;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/CircleShape;->jniGetPosition(J[F)V */
		 v0 = this.position;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.position;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.position;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Shape$Type getType ( ) {
		 /* .locals 1 */
		 v0 = com.badlogic.gdx.physics.box2d.Shape$Type.Circle;
	 } // .end method
	 public void setPosition ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/CircleShape;->addr:J */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/CircleShape;->jniSetPosition(JFF)V */
		 return;
	 } // .end method
