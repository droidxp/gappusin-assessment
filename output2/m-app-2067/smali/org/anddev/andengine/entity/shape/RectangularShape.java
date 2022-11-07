public abstract class org.anddev.andengine.entity.shape.RectangularShape extends org.anddev.andengine.entity.shape.Shape {
	 /* # instance fields */
	 protected Float mBaseHeight;
	 protected Float mBaseWidth;
	 protected Float mHeight;
	 protected final org.anddev.andengine.opengl.vertex.VertexBuffer mVertexBuffer;
	 protected Float mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.entity.shape.RectangularShape ( ) {
		 /* .locals 2 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/shape/Shape;-><init>(FF)V */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseWidth:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseHeight:F */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
		 this.mVertexBuffer = p5;
		 /* mul-float v0, p3, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mRotationCenterX:F */
		 /* mul-float v0, p4, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mRotationCenterY:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mRotationCenterX:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mScaleCenterX:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mRotationCenterY:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mScaleCenterY:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean collidesWith ( org.anddev.andengine.entity.shape.IShape p0 ) {
		 /* .locals 1 */
		 /* instance-of v0, p1, Lorg/anddev/andengine/entity/shape/RectangularShape; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* check-cast p1, Lorg/anddev/andengine/entity/shape/RectangularShape; */
			 v0 = 			 org.anddev.andengine.collision.RectangularShapeCollisionChecker .checkCollision ( p0,p1 );
		 } // :goto_0
	 } // :cond_0
	 /* instance-of v0, p1, Lorg/anddev/andengine/entity/primitive/Line; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* check-cast p1, Lorg/anddev/andengine/entity/primitive/Line; */
		 v0 = 		 org.anddev.andengine.collision.RectangularShapeCollisionChecker .checkCollision ( p0,p1 );
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean contains ( Float p0, Float p1 ) {
	 /* .locals 1 */
	 v0 = 	 org.anddev.andengine.collision.RectangularShapeCollisionChecker .checkContains ( p0,p1,p2 );
} // .end method
protected void drawVertices ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
	 /* .locals 3 */
	 int v0 = 5; // const/4 v0, 0x5
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 4; // const/4 v2, 0x4
	 return;
} // .end method
public Float getBaseHeight ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseHeight:F */
} // .end method
public Float getBaseWidth ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseWidth:F */
} // .end method
public Float getHeight ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
} // .end method
public getSceneCenterCoordinates ( ) {
	 /* .locals 3 */
	 /* const/high16 v2, 0x3f000000 # 0.5f */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
	 /* mul-float/2addr v0, v2 */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
	 /* mul-float/2addr v1, v2 */
	 (( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).convertLocalToSceneCoordinates ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/entity/shape/RectangularShape;->convertLocalToSceneCoordinates(FF)[F
} // .end method
public org.anddev.andengine.opengl.vertex.VertexBuffer getVertexBuffer ( ) {
	 /* .locals 1 */
	 v0 = this.mVertexBuffer;
} // .end method
public Float getWidth ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
} // .end method
protected Boolean isCulled ( org.anddev.andengine.engine.camera.Camera p0 ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mX:F */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mY:F */
	 v2 = 	 (( org.anddev.andengine.engine.camera.Camera ) p1 ).getMaxX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxX()F
	 /* cmpl-float v2, v0, v2 */
	 /* if-gtz v2, :cond_0 */
	 v2 = 	 (( org.anddev.andengine.engine.camera.Camera ) p1 ).getMaxY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxY()F
	 /* cmpl-float v2, v1, v2 */
	 /* if-gtz v2, :cond_0 */
	 v2 = 	 (( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->getWidth()F
	 /* add-float/2addr v0, v2 */
	 v2 = 	 (( org.anddev.andengine.engine.camera.Camera ) p1 ).getMinX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getMinX()F
	 /* cmpg-float v0, v0, v2 */
	 /* if-ltz v0, :cond_0 */
	 v0 = 	 (( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->getHeight()F
	 /* add-float/2addr v0, v1 */
	 v1 = 	 (( org.anddev.andengine.engine.camera.Camera ) p1 ).getMinY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getMinY()F
	 /* cmpg-float v0, v0, v1 */
	 /* if-ltz v0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void reset ( ) {
/* .locals 3 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* invoke-super {p0}, Lorg/anddev/andengine/entity/shape/Shape;->reset()V */
(( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).setBaseSize ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->setBaseSize()V
v0 = (( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).getBaseWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->getBaseWidth()F
v1 = (( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).getBaseHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->getBaseHeight()F
/* mul-float/2addr v0, v2 */
/* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mRotationCenterX:F */
/* mul-float v0, v1, v2 */
/* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mRotationCenterY:F */
/* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mRotationCenterX:F */
/* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mScaleCenterX:F */
/* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mRotationCenterY:F */
/* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mScaleCenterY:F */
return;
} // .end method
public void setBaseSize ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
/* iget v1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseWidth:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
/* iget v1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseHeight:F */
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseWidth:F */
/* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
/* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseHeight:F */
/* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
(( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).updateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->updateVertexBuffer()V
} // :cond_1
return;
} // .end method
public void setHeight ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
(( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).updateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->updateVertexBuffer()V
return;
} // .end method
public void setSize ( Float p0, Float p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
/* iput p2, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
(( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).updateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->updateVertexBuffer()V
return;
} // .end method
public void setWidth ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
(( org.anddev.andengine.entity.shape.RectangularShape ) p0 ).updateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->updateVertexBuffer()V
return;
} // .end method
