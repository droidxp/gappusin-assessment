public class org.anddev.andengine.engine.camera.Camera implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # static fields */
	 protected static final VERTICES_TOUCH_TMP;
	 /* # instance fields */
	 protected Float mCameraSceneRotation;
	 private org.anddev.andengine.entity.IEntity mChaseEntity;
	 private Float mFarZ;
	 private org.anddev.andengine.engine.camera.hud.HUD mHUD;
	 private Float mMaxX;
	 private Float mMaxY;
	 private Float mMinX;
	 private Float mMinY;
	 private Float mNearZ;
	 protected Float mRotation;
	 protected Integer mSurfaceHeight;
	 protected Integer mSurfaceWidth;
	 protected Integer mSurfaceX;
	 protected Integer mSurfaceY;
	 /* # direct methods */
	 static org.anddev.andengine.engine.camera.Camera ( ) {
		 /* .locals 1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.camera.Camera ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/high16 v0, -0x40800000 # -1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mNearZ:F */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mFarZ:F */
		 /* iput v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
		 /* iput v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mCameraSceneRotation:F */
		 /* iput p1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
		 /* add-float v0, p1, p3 */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
		 /* iput p2, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
		 /* add-float v0, p2, p4 */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
		 return;
	 } // .end method
	 private void applyCameraSceneRotation ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 8 */
		 int v7 = 1; // const/4 v7, 0x1
		 int v6 = 0; // const/4 v6, 0x0
		 /* const/high16 v5, 0x3f000000 # 0.5f */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mCameraSceneRotation:F */
		 /* neg-float v0, v0 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float v1, v0, v1 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
			 /* aput v2, v1, v6 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
			 /* aput v2, v1, v7 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* iget v2, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
			 /* iget v3, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
			 /* sub-float/2addr v2, v3 */
			 /* mul-float/2addr v2, v5 */
			 /* iget v3, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
			 /* iget v4, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
			 /* sub-float/2addr v3, v4 */
			 /* mul-float/2addr v3, v5 */
			 org.anddev.andengine.util.MathUtils .rotateAroundCenter ( v1,v0,v2,v3 );
			 v0 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* aget v0, v0, v6 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* aget v1, v1, v7 */
			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).set ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->set(FF)V
		 } // :cond_0
		 return;
	 } // .end method
	 private void applyRotation ( javax.microedition.khronos.opengles.GL10 p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* neg-float v0, p2 */
		 /* neg-float v1, p3 */
		 return;
	 } // .end method
	 private void applySceneRotation ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 6 */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
		 /* neg-float v0, v0 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float v1, v0, v1 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
			 /* aput v2, v1, v4 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
			 /* aput v2, v1, v5 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterX()F
			 v3 = 			 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterY()F
			 org.anddev.andengine.util.MathUtils .rotateAroundCenter ( v1,v0,v2,v3 );
			 v0 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* aget v0, v0, v4 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* aget v1, v1, v5 */
			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).set ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->set(FF)V
		 } // :cond_0
		 return;
	 } // .end method
	 private void convertAxisAlignedSurfaceToSceneTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0, Float p1, Float p2 ) {
		 /* .locals 4 */
		 v0 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMinX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMinX()F
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMaxX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxX()F
		 v2 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMinY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMinY()F
		 v3 = 		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMaxY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxY()F
		 /* sub-float/2addr v1, v0 */
		 /* mul-float/2addr v1, p2 */
		 /* add-float/2addr v0, v1 */
		 /* sub-float v1, v3, v2 */
		 /* mul-float/2addr v1, p3 */
		 /* add-float/2addr v1, v2 */
		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).set ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->set(FF)V
		 return;
	 } // .end method
	 private void unapplyCameraSceneRotation ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 8 */
		 int v7 = 1; // const/4 v7, 0x1
		 int v6 = 0; // const/4 v6, 0x0
		 /* const/high16 v5, 0x3f000000 # 0.5f */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mCameraSceneRotation:F */
		 /* neg-float v0, v0 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float v1, v0, v1 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
			 /* aput v2, v1, v6 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
			 /* aput v2, v1, v7 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* iget v2, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
			 /* iget v3, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
			 /* sub-float/2addr v2, v3 */
			 /* mul-float/2addr v2, v5 */
			 /* iget v3, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
			 /* iget v4, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
			 /* sub-float/2addr v3, v4 */
			 /* mul-float/2addr v3, v5 */
			 org.anddev.andengine.util.MathUtils .revertRotateAroundCenter ( v1,v0,v2,v3 );
			 v0 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* aget v0, v0, v6 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* aget v1, v1, v7 */
			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).set ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->set(FF)V
		 } // :cond_0
		 return;
	 } // .end method
	 private void unapplySceneRotation ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 6 */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float v1, v0, v1 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
			 /* aput v2, v1, v4 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
			 /* aput v2, v1, v5 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 v2 = 			 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterX()F
			 v3 = 			 (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterY()F
			 org.anddev.andengine.util.MathUtils .revertRotateAroundCenter ( v1,v0,v2,v3 );
			 v0 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* aget v0, v0, v4 */
			 v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
			 /* aget v1, v1, v5 */
			 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).set ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->set(FF)V
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void applySceneToCameraSceneOffset ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
		 /* neg-float v0, v0 */
		 /* iget v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
		 /* neg-float v1, v1 */
		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).offset ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->offset(FF)V
		 return;
	 } // .end method
	 public void convertCameraSceneToSceneTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->unapplyCameraSceneRotation(Lorg/anddev/andengine/input/touch/TouchEvent;)V */
		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).unapplySceneToCameraSceneOffset ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->unapplySceneToCameraSceneOffset(Lorg/anddev/andengine/input/touch/TouchEvent;)V
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->applySceneRotation(Lorg/anddev/andengine/input/touch/TouchEvent;)V */
		 return;
	 } // .end method
	 public void convertSceneToCameraSceneTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->unapplySceneRotation(Lorg/anddev/andengine/input/touch/TouchEvent;)V */
		 (( org.anddev.andengine.engine.camera.Camera ) p0 ).applySceneToCameraSceneOffset ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->applySceneToCameraSceneOffset(Lorg/anddev/andengine/input/touch/TouchEvent;)V
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->applyCameraSceneRotation(Lorg/anddev/andengine/input/touch/TouchEvent;)V */
		 return;
	 } // .end method
	 public void convertSurfaceToSceneTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0, Integer p1, Integer p2 ) {
		 /* .locals 7 */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v3, 0x3f800000 # 1.0f */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float v1, v0, v1 */
		 /* if-nez v1, :cond_0 */
		 v0 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
		 /* int-to-float v1, p2 */
		 /* div-float/2addr v0, v1 */
		 v1 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
		 /* int-to-float v2, p3 */
		 /* div-float/2addr v1, v2 */
		 /* move v6, v1 */
		 /* move v1, v0 */
		 /* move v0, v6 */
	 } // :goto_0
	 /* invoke-direct {p0, p1, v1, v0}, Lorg/anddev/andengine/engine/camera/Camera;->convertAxisAlignedSurfaceToSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;FF)V */
	 return;
} // :cond_0
/* const/high16 v1, 0x43340000 # 180.0f */
/* cmpl-float v1, v0, v1 */
/* if-nez v1, :cond_1 */
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
/* int-to-float v1, p2 */
/* div-float/2addr v0, v1 */
/* sub-float v0, v3, v0 */
v1 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* int-to-float v2, p3 */
/* div-float/2addr v1, v2 */
/* sub-float v1, v3, v1 */
/* move v6, v1 */
/* move v1, v0 */
/* move v0, v6 */
} // :cond_1
v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
v2 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
/* aput v2, v1, v4 */
v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
v2 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
/* aput v2, v1, v5 */
v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
/* div-int/lit8 v2, p2, 0x2 */
/* int-to-float v2, v2 */
/* div-int/lit8 v3, p3, 0x2 */
/* int-to-float v3, v3 */
org.anddev.andengine.util.MathUtils .rotateAroundCenter ( v1,v0,v2,v3 );
v0 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
/* aget v0, v0, v4 */
/* int-to-float v1, p2 */
/* div-float/2addr v0, v1 */
v1 = org.anddev.andengine.engine.camera.Camera.VERTICES_TOUCH_TMP;
/* aget v1, v1, v5 */
/* int-to-float v2, p3 */
/* div-float/2addr v1, v2 */
/* move v6, v1 */
/* move v1, v0 */
/* move v0, v6 */
} // .end method
public Float getCameraSceneRotation ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mCameraSceneRotation:F */
} // .end method
public Float getCenterX ( ) {
/* .locals 3 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
/* sub-float/2addr v1, v0 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public Float getCenterY ( ) {
/* .locals 3 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
/* sub-float/2addr v1, v0 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public Float getFarZClippingPlane ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mFarZ:F */
} // .end method
public org.anddev.andengine.engine.camera.hud.HUD getHUD ( ) {
/* .locals 1 */
v0 = this.mHUD;
} // .end method
public Float getHeight ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
/* sub-float/2addr v0, v1 */
} // .end method
public Float getHeightRaw ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
/* sub-float/2addr v0, v1 */
} // .end method
public Float getMaxX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
} // .end method
public Float getMaxY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
} // .end method
public Float getMinX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
} // .end method
public Float getMinY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
} // .end method
public Float getNearZClippingPlane ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mNearZ:F */
} // .end method
public Float getRotation ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
} // .end method
public Integer getSurfaceHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mSurfaceHeight:I */
} // .end method
public Integer getSurfaceWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mSurfaceWidth:I */
} // .end method
public Integer getSurfaceX ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mSurfaceX:I */
} // .end method
public Integer getSurfaceY ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mSurfaceY:I */
} // .end method
public Float getWidth ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
/* sub-float/2addr v0, v1 */
} // .end method
public Float getWidthRaw ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
/* sub-float/2addr v0, v1 */
} // .end method
public Boolean hasHUD ( ) {
/* .locals 1 */
v0 = this.mHUD;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isLineVisible ( org.anddev.andengine.entity.primitive.Line p0 ) {
/* .locals 1 */
v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker .isVisible ( p0,p1 );
} // .end method
public Boolean isRectangularShapeVisible ( org.anddev.andengine.entity.shape.RectangularShape p0 ) {
/* .locals 1 */
v0 = org.anddev.andengine.collision.RectangularShapeCollisionChecker .isVisible ( p0,p1 );
} // .end method
public Boolean isRotated ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void offsetCenter ( Float p0, Float p1 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterX()F
/* add-float/2addr v0, p1 */
v1 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterY()F
/* add-float/2addr v1, p2 */
(( org.anddev.andengine.engine.camera.Camera ) p0 ).setCenter ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/engine/camera/Camera;->setCenter(FF)V
return;
} // .end method
public void onApplyCameraSceneMatrix ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 8 */
/* const/high16 v7, 0x3f000000 # 0.5f */
int v1 = 0; // const/4 v1, 0x0
org.anddev.andengine.opengl.util.GLHelper .setProjectionIdentityMatrix ( p1 );
v2 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getWidthRaw ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getWidthRaw()F
v3 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getHeightRaw ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getHeightRaw()F
/* iget v5, p0, Lorg/anddev/andengine/engine/camera/Camera;->mNearZ:F */
/* iget v6, p0, Lorg/anddev/andengine/engine/camera/Camera;->mFarZ:F */
/* move-object v0, p1 */
/* move v4, v1 */
/* invoke-interface/range {v0 ..v6}, Ljavax/microedition/khronos/opengles/GL10;->glOrthof(FFFFFF)V */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mCameraSceneRotation:F */
/* cmpl-float v1, v0, v1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* mul-float v1, v2, v7 */
/* mul-float v2, v3, v7 */
/* invoke-direct {p0, p1, v1, v2, v0}, Lorg/anddev/andengine/engine/camera/Camera;->applyRotation(Ljavax/microedition/khronos/opengles/GL10;FFF)V */
} // :cond_0
return;
} // .end method
public void onApplySceneBackgroundMatrix ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 8 */
/* const/high16 v7, 0x3f000000 # 0.5f */
int v1 = 0; // const/4 v1, 0x0
org.anddev.andengine.opengl.util.GLHelper .setProjectionIdentityMatrix ( p1 );
v2 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getWidthRaw ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getWidthRaw()F
v3 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getHeightRaw ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getHeightRaw()F
/* iget v5, p0, Lorg/anddev/andengine/engine/camera/Camera;->mNearZ:F */
/* iget v6, p0, Lorg/anddev/andengine/engine/camera/Camera;->mFarZ:F */
/* move-object v0, p1 */
/* move v4, v1 */
/* invoke-interface/range {v0 ..v6}, Ljavax/microedition/khronos/opengles/GL10;->glOrthof(FFFFFF)V */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
/* cmpl-float v1, v0, v1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* mul-float v1, v2, v7 */
/* mul-float v2, v3, v7 */
/* invoke-direct {p0, p1, v1, v2, v0}, Lorg/anddev/andengine/engine/camera/Camera;->applyRotation(Ljavax/microedition/khronos/opengles/GL10;FFF)V */
} // :cond_0
return;
} // .end method
public void onApplySceneMatrix ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 7 */
org.anddev.andengine.opengl.util.GLHelper .setProjectionIdentityMatrix ( p1 );
v1 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMinX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMinX()F
v2 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMaxX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxX()F
v3 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMaxY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMaxY()F
v4 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getMinY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getMinY()F
/* iget v5, p0, Lorg/anddev/andengine/engine/camera/Camera;->mNearZ:F */
/* iget v6, p0, Lorg/anddev/andengine/engine/camera/Camera;->mFarZ:F */
/* move-object v0, p1 */
/* invoke-interface/range {v0 ..v6}, Ljavax/microedition/khronos/opengles/GL10;->glOrthof(FFFFFF)V */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, v0, v1 */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterX()F
v2 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterY()F
/* invoke-direct {p0, p1, v1, v2, v0}, Lorg/anddev/andengine/engine/camera/Camera;->applyRotation(Ljavax/microedition/khronos/opengles/GL10;FFF)V */
} // :cond_0
return;
} // .end method
public void onDrawHUD ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
v0 = this.mHUD;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mHUD;
(( org.anddev.andengine.engine.camera.hud.HUD ) v0 ).onDraw ( p1, p0 ); // invoke-virtual {v0, p1, p0}, Lorg/anddev/andengine/engine/camera/hud/HUD;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
} // :cond_0
return;
} // .end method
public void onUpdate ( Float p0 ) {
/* .locals 1 */
v0 = this.mHUD;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mHUD;
(( org.anddev.andengine.engine.camera.hud.HUD ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/hud/HUD;->onUpdate(F)V
} // :cond_0
(( org.anddev.andengine.engine.camera.Camera ) p0 ).updateChaseEntity ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->updateChaseEntity()V
return;
} // .end method
public void reset ( ) {
/* .locals 0 */
return;
} // .end method
public void setCameraSceneRotation ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mCameraSceneRotation:F */
return;
} // .end method
public void setCenter ( Float p0, Float p1 ) {
/* .locals 3 */
v0 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterX()F
/* sub-float v0, p1, v0 */
v1 = (( org.anddev.andengine.engine.camera.Camera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/Camera;->getCenterY()F
/* sub-float v1, p2, v1 */
/* iget v2, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
/* add-float/2addr v2, v0 */
/* iput v2, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
/* iget v2, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxX:F */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMaxY:F */
return;
} // .end method
public void setChaseEntity ( org.anddev.andengine.entity.IEntity p0 ) {
/* .locals 0 */
this.mChaseEntity = p1;
return;
} // .end method
public void setFarZClippingPlane ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mFarZ:F */
return;
} // .end method
public void setHUD ( org.anddev.andengine.engine.camera.hud.HUD p0 ) {
/* .locals 0 */
this.mHUD = p1;
(( org.anddev.andengine.engine.camera.hud.HUD ) p1 ).setCamera ( p0 ); // invoke-virtual {p1, p0}, Lorg/anddev/andengine/engine/camera/hud/HUD;->setCamera(Lorg/anddev/andengine/engine/camera/Camera;)V
return;
} // .end method
public void setNearZClippingPlane ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mNearZ:F */
return;
} // .end method
public void setRotation ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mRotation:F */
return;
} // .end method
public void setSurfaceSize ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mSurfaceX:I */
/* iput p2, p0, Lorg/anddev/andengine/engine/camera/Camera;->mSurfaceY:I */
/* iput p3, p0, Lorg/anddev/andengine/engine/camera/Camera;->mSurfaceWidth:I */
/* iput p4, p0, Lorg/anddev/andengine/engine/camera/Camera;->mSurfaceHeight:I */
return;
} // .end method
public void setZClippingPlanes ( Float p0, Float p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mNearZ:F */
/* iput p2, p0, Lorg/anddev/andengine/engine/camera/Camera;->mFarZ:F */
return;
} // .end method
protected void unapplySceneToCameraSceneOffset ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinX:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/Camera;->mMinY:F */
(( org.anddev.andengine.input.touch.TouchEvent ) p1 ).offset ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent;->offset(FF)V
return;
} // .end method
public void updateChaseEntity ( ) {
/* .locals 3 */
v0 = this.mChaseEntity;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mChaseEntity;
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v0, v1 */
int v2 = 1; // const/4 v2, 0x1
/* aget v0, v0, v2 */
(( org.anddev.andengine.engine.camera.Camera ) p0 ).setCenter ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/Camera;->setCenter(FF)V
} // :cond_0
return;
} // .end method
