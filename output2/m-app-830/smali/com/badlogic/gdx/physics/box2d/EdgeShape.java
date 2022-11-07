public class com.badlogic.gdx.physics.box2d.EdgeShape extends com.badlogic.gdx.physics.box2d.Shape {
	 /* # static fields */
	 static final vertex;
	 /* # direct methods */
	 static com.badlogic.gdx.physics.box2d.EdgeShape ( ) {
		 /* .locals 1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 return;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.EdgeShape ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/Shape;-><init>()V */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->newEdgeShape()J */
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->addr:J */
		 return;
	 } // .end method
	 com.badlogic.gdx.physics.box2d.EdgeShape ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/Shape;-><init>()V */
		 /* iput-wide p1, p0, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->addr:J */
		 return;
	 } // .end method
	 private native void jniGetVertex1 ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetVertex2 ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniSet ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 private native void jniSetVertex0 ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 private native void jniSetVertex3 ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 private native Long newEdgeShape ( ) {
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.physics.box2d.Shape$Type getType ( ) {
		 /* .locals 1 */
		 v0 = com.badlogic.gdx.physics.box2d.Shape$Type.Edge;
	 } // .end method
	 public void getVertex1 ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->addr:J */
		 v2 = com.badlogic.gdx.physics.box2d.EdgeShape.vertex;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->jniGetVertex1(J[F)V */
		 v0 = com.badlogic.gdx.physics.box2d.EdgeShape.vertex;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget v0, v0, v1 */
		 /* iput v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = com.badlogic.gdx.physics.box2d.EdgeShape.vertex;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aget v0, v0, v1 */
		 /* iput v0, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 return;
	 } // .end method
	 public void getVertex2 ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->addr:J */
		 v2 = com.badlogic.gdx.physics.box2d.EdgeShape.vertex;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->jniGetVertex2(J[F)V */
		 v0 = com.badlogic.gdx.physics.box2d.EdgeShape.vertex;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget v0, v0, v1 */
		 /* iput v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = com.badlogic.gdx.physics.box2d.EdgeShape.vertex;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aget v0, v0, v1 */
		 /* iput v0, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 return;
	 } // .end method
	 public void set ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 7 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->addr:J */
		 /* move-object v0, p0 */
		 /* move v3, p1 */
		 /* move v4, p2 */
		 /* move v5, p3 */
		 /* move v6, p4 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->jniSet(JFFFF)V */
		 return;
	 } // .end method
	 public void set ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1 ) {
		 /* .locals 4 */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v3, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 (( com.badlogic.gdx.physics.box2d.EdgeShape ) p0 ).set ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->set(FFFF)V
		 return;
	 } // .end method
	 public void setVertex0 ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1, p2}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->jniSetVertex0(JFF)V */
		 return;
	 } // .end method
	 public void setVertex0 ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 2 */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 (( com.badlogic.gdx.physics.box2d.EdgeShape ) p0 ).setVertex0 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->setVertex0(FF)V
		 return;
	 } // .end method
	 public void setVertex3 ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1, p2}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->jniSetVertex3(JFF)V */
		 return;
	 } // .end method
	 public void setVertex3 ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 2 */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 (( com.badlogic.gdx.physics.box2d.EdgeShape ) p0 ).setVertex3 ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/EdgeShape;->setVertex3(FF)V
		 return;
	 } // .end method
