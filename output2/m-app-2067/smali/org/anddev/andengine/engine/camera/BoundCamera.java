public class org.anddev.andengine.engine.camera.BoundCamera extends org.anddev.andengine.engine.camera.Camera {
	 /* # instance fields */
	 private Float mBoundsCenterX;
	 private Float mBoundsCenterY;
	 protected Boolean mBoundsEnabled;
	 private Float mBoundsHeight;
	 private Float mBoundsMaxX;
	 private Float mBoundsMaxY;
	 private Float mBoundsMinX;
	 private Float mBoundsMinY;
	 private Float mBoundsWidth;
	 /* # direct methods */
	 public org.anddev.andengine.engine.camera.BoundCamera ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/engine/camera/Camera;-><init>(FFFF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.camera.BoundCamera ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/engine/camera/Camera;-><init>(FFFF)V */
		 (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).setBounds ( p5, p6, p7, p8 ); // invoke-virtual {p0, p5, p6, p7, p8}, Lorg/anddev/andengine/engine/camera/BoundCamera;->setBounds(FFFF)V
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsEnabled:Z */
		 return;
	 } // .end method
	 private Float determineBoundedX ( ) {
		 /* .locals 8 */
		 int v7 = 1; // const/4 v7, 0x1
		 int v6 = 0; // const/4 v6, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsWidth:F */
		 v1 = 		 (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getWidth()F
		 /* cmpg-float v0, v0, v1 */
		 /* if-gez v0, :cond_1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsCenterX:F */
	 } // :cond_0
} // :goto_0
} // :cond_1
v0 = (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getCenterX()F
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMinX:F */
v2 = (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).getMinX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMinX()F
/* sub-float/2addr v1, v2 */
/* cmpl-float v2, v1, v5 */
/* if-lez v2, :cond_2 */
/* move v2, v7 */
} // :goto_1
v3 = (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).getMaxX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMaxX()F
/* iget v4, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMaxX:F */
/* sub-float/2addr v3, v4 */
/* cmpl-float v4, v3, v5 */
/* if-lez v4, :cond_3 */
/* move v4, v7 */
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_5
if ( v4 != null) { // if-eqz v4, :cond_4
/* sub-float/2addr v0, v3 */
/* add-float/2addr v0, v1 */
} // :cond_2
/* move v2, v6 */
} // :cond_3
/* move v4, v6 */
} // :cond_4
/* add-float/2addr v0, v1 */
} // :cond_5
if ( v4 != null) { // if-eqz v4, :cond_0
/* sub-float/2addr v0, v3 */
} // .end method
private Float determineBoundedY ( ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsHeight:F */
v1 = (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getHeight()F
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsCenterY:F */
} // :cond_0
} // :goto_0
} // :cond_1
v0 = (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getCenterY()F
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMinY:F */
v2 = (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).getMinY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMinY()F
/* sub-float/2addr v1, v2 */
/* cmpl-float v2, v1, v5 */
/* if-lez v2, :cond_2 */
/* move v2, v7 */
} // :goto_1
v3 = (( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).getMaxY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMaxY()F
/* iget v4, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMaxY:F */
/* sub-float/2addr v3, v4 */
/* cmpl-float v4, v3, v5 */
/* if-lez v4, :cond_3 */
/* move v4, v7 */
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_5
if ( v4 != null) { // if-eqz v4, :cond_4
/* sub-float/2addr v0, v3 */
/* add-float/2addr v0, v1 */
} // :cond_2
/* move v2, v6 */
} // :cond_3
/* move v4, v6 */
} // :cond_4
/* add-float/2addr v0, v1 */
} // :cond_5
if ( v4 != null) { // if-eqz v4, :cond_0
/* sub-float/2addr v0, v3 */
} // .end method
/* # virtual methods */
protected void ensureInBounds ( ) {
/* .locals 2 */
v0 = /* invoke-direct {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->determineBoundedX()F */
v1 = /* invoke-direct {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->determineBoundedY()F */
/* invoke-super {p0, v0, v1}, Lorg/anddev/andengine/engine/camera/Camera;->setCenter(FF)V */
return;
} // .end method
public Float getBoundsHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsHeight:F */
} // .end method
public Float getBoundsWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsWidth:F */
} // .end method
public Boolean isBoundsEnabled ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsEnabled:Z */
} // .end method
public void setBounds ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 3 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMinX:F */
/* iput p2, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMaxX:F */
/* iput p3, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMinY:F */
/* iput p4, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMaxY:F */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMaxX:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMinX:F */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsWidth:F */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMaxY:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMinY:F */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsHeight:F */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMinX:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsWidth:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsCenterX:F */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsMinY:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsHeight:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsCenterY:F */
return;
} // .end method
public void setBoundsEnabled ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsEnabled:Z */
return;
} // .end method
public void setCenter ( Float p0, Float p1 ) {
/* .locals 1 */
/* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/engine/camera/Camera;->setCenter(FF)V */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/camera/BoundCamera;->mBoundsEnabled:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.anddev.andengine.engine.camera.BoundCamera ) p0 ).ensureInBounds ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->ensureInBounds()V
} // :cond_0
return;
} // .end method
