public class org.anddev.andengine.engine.camera.ZoomCamera extends org.anddev.andengine.engine.camera.BoundCamera {
	 /* # instance fields */
	 protected Float mZoomFactor;
	 /* # direct methods */
	 public org.anddev.andengine.engine.camera.ZoomCamera ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/engine/camera/BoundCamera;-><init>(FFFF)V */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void applySceneToCameraSceneOffset ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 7 */
		 int v6 = 1; // const/4 v6, 0x1
		 int v5 = 0; // const/4 v5, 0x0
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* cmpl-float v1, v0, v1 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = 			 (( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->getCenterX()F
			 v2 = 			 (( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->getCenterY()F
			 v3 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
			 v4 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
			 /* aput v4, v3, v5 */
			 v3 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
			 v4 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
			 /* aput v4, v3, v6 */
			 v3 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
			 org.anddev.andengine.util.MathUtils .scaleAroundCenter ( v3,v0,v0,v1,v2 );
			 v0 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
			 /* aget v0, v0, v5 */
			 v1 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
			 /* aget v1, v1, v6 */
			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).set ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->set(FF)V
		 } // :cond_0
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/engine/camera/BoundCamera;->applySceneToCameraSceneOffset(Lorg/anddev/andengine/input/touch/TouchEvent;)V */
		 return;
	 } // .end method
	 public Float getHeight ( ) {
		 /* .locals 2 */
		 v0 = 		 /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getHeight()F */
		 /* iget v1, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Float getMaxX ( ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* cmpl-float v0, v0, v1 */
		 /* if-nez v0, :cond_0 */
		 v0 = 		 /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMaxX()F */
	 } // :goto_0
} // :cond_0
v0 = (( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->getCenterX()F
v1 = /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMaxX()F */
/* sub-float/2addr v1, v0 */
/* iget v2, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* div-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public Float getMaxY ( ) {
/* .locals 3 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
v0 = /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMaxY()F */
} // :goto_0
} // :cond_0
v0 = (( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->getCenterY()F
v1 = /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMaxY()F */
/* sub-float/2addr v1, v0 */
/* iget v2, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* div-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public Float getMinX ( ) {
/* .locals 3 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
v0 = /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMinX()F */
} // :goto_0
} // :cond_0
v0 = (( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->getCenterX()F
v1 = /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMinX()F */
/* sub-float v1, v0, v1 */
/* iget v2, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* div-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
} // .end method
public Float getMinY ( ) {
/* .locals 3 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
v0 = /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMinY()F */
} // :goto_0
} // :cond_0
v0 = (( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->getCenterY()F
v1 = /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getMinY()F */
/* sub-float v1, v0, v1 */
/* iget v2, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* div-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
} // .end method
public Float getWidth ( ) {
/* .locals 2 */
v0 = /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/BoundCamera;->getWidth()F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* div-float/2addr v0, v1 */
} // .end method
public Float getZoomFactor ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
} // .end method
public void setZoomFactor ( Float p0 ) {
/* .locals 1 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mBoundsEnabled:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).ensureInBounds ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->ensureInBounds()V
} // :cond_0
return;
} // .end method
protected void unapplySceneToCameraSceneOffset ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 7 */
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
/* invoke-super {p0, p1}, Lorg/anddev/andengine/engine/camera/BoundCamera;->unapplySceneToCameraSceneOffset(Lorg/anddev/andengine/input/touch/TouchEvent;)V */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/ZoomCamera;->mZoomFactor:F */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v1, v0, v1 */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = (( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->getCenterX()F
v2 = (( org.anddev.andengine.engine.camera.ZoomCamera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->getCenterY()F
v3 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
v4 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
/* aput v4, v3, v5 */
v3 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
v4 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* aput v4, v3, v6 */
v3 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
org.anddev.andengine.util.MathUtils .revertScaleAroundCenter ( v3,v0,v0,v1,v2 );
v0 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
/* aget v0, v0, v5 */
v1 = org.anddev.andengine.engine.camera.ZoomCamera.VERTICES_TOUCH_TMP;
/* aget v1, v1, v6 */
(( org.anddev.andengine.input.touch.TouchEvent ) p1 ).set ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->set(FF)V
} // :cond_0
return;
} // .end method
