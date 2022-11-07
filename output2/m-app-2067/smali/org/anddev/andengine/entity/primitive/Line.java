public class org.anddev.andengine.entity.primitive.Line extends org.anddev.andengine.entity.shape.Shape {
	 /* # static fields */
	 private static final Float LINEWIDTH_DEFAULT;
	 /* # instance fields */
	 private final org.anddev.andengine.opengl.vertex.LineVertexBuffer mLineVertexBuffer;
	 private Float mLineWidth;
	 protected Float mX2;
	 protected Float mY2;
	 /* # direct methods */
	 public org.anddev.andengine.entity.primitive.Line ( ) {
		 /* .locals 6 */
		 /* const/high16 v5, 0x3f800000 # 1.0f */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/primitive/Line;-><init>(FFFFF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.primitive.Line ( ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x3f000000 # 0.5f */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/shape/Shape;-><init>(FF)V */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
		 /* iput p5, p0, Lorg/anddev/andengine/entity/primitive/Line;->mLineWidth:F */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/vertex/LineVertexBuffer; */
		 /* const v1, 0x88e4 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v0, v1, v2}, Lorg/anddev/andengine/opengl/vertex/LineVertexBuffer;-><init>(IZ)V */
		 this.mLineVertexBuffer = v0;
		 (( org.anddev.andengine.entity.primitive.Line ) p0 ).updateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->updateVertexBuffer()V
		 v0 = 		 (( org.anddev.andengine.entity.primitive.Line ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->getWidth()F
		 v1 = 		 (( org.anddev.andengine.entity.primitive.Line ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->getHeight()F
		 /* mul-float/2addr v0, v3 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mRotationCenterX:F */
		 /* mul-float v0, v1, v3 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mRotationCenterY:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mRotationCenterX:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mScaleCenterX:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mRotationCenterY:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mScaleCenterY:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean collidesWith ( org.anddev.andengine.entity.shape.IShape p0 ) {
		 /* .locals 8 */
		 /* instance-of v0, p1, Lorg/anddev/andengine/entity/primitive/Line; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* check-cast p1, Lorg/anddev/andengine/entity/primitive/Line; */
			 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX:F */
			 /* iget v1, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY:F */
			 /* iget v2, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
			 /* iget v3, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
			 /* iget v4, p1, Lorg/anddev/andengine/entity/primitive/Line;->mX:F */
			 /* iget v5, p1, Lorg/anddev/andengine/entity/primitive/Line;->mY:F */
			 /* iget v6, p1, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
			 /* iget v7, p1, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
			 v0 = 			 /* invoke-static/range {v0 ..v7}, Lorg/anddev/andengine/collision/LineCollisionChecker;->checkLineCollision(FFFFFFFF)Z */
		 } // :goto_0
	 } // :cond_0
	 /* instance-of v0, p1, Lorg/anddev/andengine/entity/shape/RectangularShape; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* check-cast p1, Lorg/anddev/andengine/entity/shape/RectangularShape; */
		 v0 = 		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .checkCollision ( p1,p0 );
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean contains ( Float p0, Float p1 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public convertLocalToSceneCoordinates ( Float p0, Float p1 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public convertSceneToLocalCoordinates ( Float p0, Float p1 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void drawVertices ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
	 /* .locals 3 */
	 int v0 = 1; // const/4 v0, 0x1
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 2; // const/4 v2, 0x2
	 return;
} // .end method
public Float getBaseHeight ( ) {
	 /* .locals 2 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY:F */
	 /* sub-float/2addr v0, v1 */
} // .end method
public Float getBaseWidth ( ) {
	 /* .locals 2 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX:F */
	 /* sub-float/2addr v0, v1 */
} // .end method
public Float getHeight ( ) {
	 /* .locals 2 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY:F */
	 /* sub-float/2addr v0, v1 */
} // .end method
public Float getLineWidth ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mLineWidth:F */
} // .end method
public getSceneCenterCoordinates ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.anddev.andengine.opengl.vertex.LineVertexBuffer getVertexBuffer ( ) {
	 /* .locals 1 */
	 v0 = this.mLineVertexBuffer;
} // .end method
public org.anddev.andengine.opengl.vertex.VertexBuffer getVertexBuffer ( ) { //bridge//synthethic
	 /* .locals 1 */
	 (( org.anddev.andengine.entity.primitive.Line ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/LineVertexBuffer;
} // .end method
public Float getWidth ( ) {
	 /* .locals 2 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX:F */
	 /* sub-float/2addr v0, v1 */
} // .end method
public Float getX ( ) {
	 /* .locals 1 */
	 v0 = 	 /* invoke-super {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getX()F */
} // .end method
public Float getX1 ( ) {
	 /* .locals 1 */
	 v0 = 	 /* invoke-super {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getX()F */
} // .end method
public Float getX2 ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
} // .end method
public Float getY ( ) {
	 /* .locals 1 */
	 v0 = 	 /* invoke-super {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getY()F */
} // .end method
public Float getY1 ( ) {
	 /* .locals 1 */
	 v0 = 	 /* invoke-super {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getY()F */
} // .end method
public Float getY2 ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
} // .end method
protected Boolean isCulled ( org.anddev.andengine.engine.camera.Camera p0 ) {
	 /* .locals 1 */
	 v0 = 	 (( org.anddev.andengine.engine.camera.Camera ) p1 ).isLineVisible ( p0 ); // invoke-virtual {p1, p0}, Lorg/anddev/andengine/engine/camera/Camera;->isLineVisible(Lorg/anddev/andengine/entity/primitive/Line;)Z
} // .end method
protected void onInitDraw ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 1 */
	 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/shape/Shape;->onInitDraw(Ljavax/microedition/khronos/opengles/GL10;)V */
	 org.anddev.andengine.opengl.util.GLHelper .disableTextures ( p1 );
	 org.anddev.andengine.opengl.util.GLHelper .disableTexCoordArray ( p1 );
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mLineWidth:F */
	 org.anddev.andengine.opengl.util.GLHelper .lineWidth ( p1,v0 );
	 return;
} // .end method
protected void onUpdateVertexBuffer ( ) {
	 /* .locals 5 */
	 int v4 = 0; // const/4 v4, 0x0
	 v0 = this.mLineVertexBuffer;
	 /* iget v1, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
	 /* iget v2, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX:F */
	 /* sub-float/2addr v1, v2 */
	 /* iget v2, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
	 /* iget v3, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY:F */
	 /* sub-float/2addr v2, v3 */
	 (( org.anddev.andengine.opengl.vertex.LineVertexBuffer ) v0 ).update ( v4, v4, v1, v2 ); // invoke-virtual {v0, v4, v4, v1, v2}, Lorg/anddev/andengine/opengl/vertex/LineVertexBuffer;->update(FFFF)V
	 return;
} // .end method
public void setLineWidth ( Float p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/entity/primitive/Line;->mLineWidth:F */
	 return;
} // .end method
public void setPosition ( Float p0, Float p1 ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX:F */
	 /* sub-float/2addr v0, p1 */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY:F */
	 /* sub-float/2addr v1, p2 */
	 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/entity/shape/Shape;->setPosition(FF)V */
	 /* iget v2, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
	 /* add-float/2addr v0, v2 */
	 /* iput v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
	 /* add-float/2addr v0, v1 */
	 /* iput v0, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
	 return;
} // .end method
public void setPosition ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 0 */
	 /* iput p3, p0, Lorg/anddev/andengine/entity/primitive/Line;->mX2:F */
	 /* iput p4, p0, Lorg/anddev/andengine/entity/primitive/Line;->mY2:F */
	 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/entity/shape/Shape;->setPosition(FF)V */
	 (( org.anddev.andengine.entity.primitive.Line ) p0 ).updateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->updateVertexBuffer()V
	 return;
} // .end method
