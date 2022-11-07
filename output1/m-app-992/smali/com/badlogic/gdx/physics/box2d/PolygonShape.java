public class com.badlogic.gdx.physics.box2d.PolygonShape extends com.badlogic.gdx.physics.box2d.Shape {
	 /* # static fields */
	 private static verts;
	 /* # direct methods */
	 static com.badlogic.gdx.physics.box2d.PolygonShape ( ) {
		 /* .locals 1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 return;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.PolygonShape ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/Shape;-><init>()V */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->newPolygonShape()J */
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->addr:J */
		 return;
	 } // .end method
	 protected com.badlogic.gdx.physics.box2d.PolygonShape ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/badlogic/gdx/physics/box2d/Shape;-><init>()V */
		 /* iput-wide p1, p0, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->addr:J */
		 return;
	 } // .end method
	 private native void jniGetVertex ( Long p0, Integer p1, Float[] p2 ) {
	 } // .end method
	 private native Integer jniGetVertexCount ( Long p0 ) {
	 } // .end method
	 private native void jniSet ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniSetAsBox ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 private native void jniSetAsBox ( Long p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
	 } // .end method
	 private native Long newPolygonShape ( ) {
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.physics.box2d.Shape$Type getType ( ) {
		 /* .locals 1 */
		 v0 = com.badlogic.gdx.physics.box2d.Shape$Type.Polygon;
	 } // .end method
	 public void getVertex ( Integer p0, com.badlogic.gdx.math.Vector2 p1 ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->addr:J */
		 v2 = com.badlogic.gdx.physics.box2d.PolygonShape.verts;
		 /* invoke-direct {p0, v0, v1, p1, v2}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->jniGetVertex(JI[F)V */
		 v0 = com.badlogic.gdx.physics.box2d.PolygonShape.verts;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget v0, v0, v1 */
		 /* iput v0, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = com.badlogic.gdx.physics.box2d.PolygonShape.verts;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aget v0, v0, v1 */
		 /* iput v0, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 return;
	 } // .end method
	 public Integer getVertexCount ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->jniGetVertexCount(J)I */
	 } // .end method
	 public void set ( com.badlogic.gdx.math.Vector2[] p0 ) {
		 /* .locals 5 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* array-length v0, p1 */
		 /* mul-int/lit8 v0, v0, 0x2 */
		 /* new-array v0, v0, [F */
		 /* move v2, v1 */
	 } // :goto_0
	 /* array-length v3, p1 */
	 /* mul-int/lit8 v3, v3, 0x2 */
	 /* if-ge v2, v3, :cond_0 */
	 /* aget-object v3, p1, v1 */
	 /* iget v3, v3, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* aput v3, v0, v2 */
	 /* add-int/lit8 v3, v2, 0x1 */
	 /* aget-object v4, p1, v1 */
	 /* iget v4, v4, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* aput v4, v0, v3 */
	 /* add-int/lit8 v2, v2, 0x2 */
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->addr:J */
/* invoke-direct {p0, v1, v2, v0}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->jniSet(J[F)V */
return;
} // .end method
public void setAsBox ( Float p0, Float p1 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->addr:J */
/* invoke-direct {p0, v0, v1, p1, p2}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->jniSetAsBox(JFF)V */
return;
} // .end method
public void setAsBox ( Float p0, Float p1, com.badlogic.gdx.math.Vector2 p2, Float p3 ) {
/* .locals 8 */
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->addr:J */
/* iget v5, p3, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v6, p3, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object v0, p0 */
/* move v3, p1 */
/* move v4, p2 */
/* move v7, p4 */
/* invoke-direct/range {v0 ..v7}, Lcom/badlogic/gdx/physics/box2d/PolygonShape;->jniSetAsBox(JFFFFF)V */
return;
} // .end method
