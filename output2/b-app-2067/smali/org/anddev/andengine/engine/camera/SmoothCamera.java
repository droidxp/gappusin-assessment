public class org.anddev.andengine.engine.camera.SmoothCamera extends org.anddev.andengine.engine.camera.ZoomCamera {
	 /* # instance fields */
	 private Float mMaxVelocityX;
	 private Float mMaxVelocityY;
	 private Float mMaxZoomFactorChange;
	 private Float mTargetCenterX;
	 private Float mTargetCenterY;
	 private Float mTargetZoomFactor;
	 /* # direct methods */
	 public org.anddev.andengine.engine.camera.SmoothCamera ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/engine/camera/ZoomCamera;-><init>(FFFF)V */
		 /* iput p5, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityX:F */
		 /* iput p6, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityY:F */
		 /* iput p7, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxZoomFactorChange:F */
		 v0 = 		 (( org.anddev.andengine.engine.camera.SmoothCamera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->getCenterX()F
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetCenterX:F */
		 v0 = 		 (( org.anddev.andengine.engine.camera.SmoothCamera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->getCenterY()F
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetCenterY:F */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
		 return;
	 } // .end method
	 private Float limitToMaxVelocityX ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* cmpl-float v0, p1, v0 */
		 /* if-lez v0, :cond_0 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityX:F */
		 /* mul-float/2addr v0, p2 */
		 v0 = 		 java.lang.Math .min ( p1,v0 );
	 } // :goto_0
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityX:F */
/* neg-float v0, v0 */
/* mul-float/2addr v0, p2 */
v0 = java.lang.Math .max ( p1,v0 );
} // .end method
private Float limitToMaxVelocityY ( Float p0, Float p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p1, v0 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityY:F */
/* mul-float/2addr v0, p2 */
v0 = java.lang.Math .min ( p1,v0 );
} // :goto_0
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityY:F */
/* neg-float v0, v0 */
/* mul-float/2addr v0, p2 */
v0 = java.lang.Math .max ( p1,v0 );
} // .end method
private Float limitToMaxZoomFactorChange ( Float p0, Float p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p1, v0 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxZoomFactorChange:F */
/* mul-float/2addr v0, p2 */
v0 = java.lang.Math .min ( p1,v0 );
} // :goto_0
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxZoomFactorChange:F */
/* neg-float v0, v0 */
/* mul-float/2addr v0, p2 */
v0 = java.lang.Math .max ( p1,v0 );
} // .end method
/* # virtual methods */
protected void onSmoothZoomFinished ( ) {
/* .locals 0 */
return;
} // .end method
protected void onSmoothZoomStarted ( ) {
/* .locals 0 */
return;
} // .end method
public void onUpdate ( Float p0 ) {
/* .locals 5 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->onUpdate(F)V */
v0 = (( org.anddev.andengine.engine.camera.SmoothCamera ) p0 ).getCenterX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->getCenterX()F
v1 = (( org.anddev.andengine.engine.camera.SmoothCamera ) p0 ).getCenterY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->getCenterY()F
/* iget v2, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetCenterX:F */
/* iget v3, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetCenterY:F */
/* cmpl-float v4, v0, v2 */
/* if-nez v4, :cond_0 */
/* cmpl-float v4, v1, v3 */
if ( v4 != null) { // if-eqz v4, :cond_1
} // :cond_0
/* sub-float/2addr v2, v0 */
v2 = /* invoke-direct {p0, v2, p1}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->limitToMaxVelocityX(FF)F */
/* sub-float/2addr v3, v1 */
v3 = /* invoke-direct {p0, v3, p1}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->limitToMaxVelocityY(FF)F */
/* add-float/2addr v0, v2 */
/* add-float/2addr v1, v3 */
/* invoke-super {p0, v0, v1}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->setCenter(FF)V */
} // :cond_1
v0 = (( org.anddev.andengine.engine.camera.SmoothCamera ) p0 ).getZoomFactor ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->getZoomFactor()F
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
/* cmpl-float v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_2
/* sub-float/2addr v1, v0 */
v1 = /* invoke-direct {p0, v1, p1}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->limitToMaxZoomFactorChange(FF)F */
/* add-float/2addr v0, v1 */
/* invoke-super {p0, v0}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->setZoomFactor(F)V */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mZoomFactor:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_2 */
(( org.anddev.andengine.engine.camera.SmoothCamera ) p0 ).onSmoothZoomFinished ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->onSmoothZoomFinished()V
} // :cond_2
return;
} // .end method
public void setCenter ( Float p0, Float p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetCenterX:F */
/* iput p2, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetCenterY:F */
return;
} // .end method
public void setCenterDirect ( Float p0, Float p1 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->setCenter(FF)V */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetCenterX:F */
/* iput p2, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetCenterY:F */
return;
} // .end method
public void setMaxVelocity ( Float p0, Float p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityX:F */
/* iput p2, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityY:F */
return;
} // .end method
public void setMaxVelocityX ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityX:F */
return;
} // .end method
public void setMaxVelocityY ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxVelocityY:F */
return;
} // .end method
public void setMaxZoomFactorChange ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mMaxZoomFactorChange:F */
return;
} // .end method
public void setZoomFactor ( Float p0 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
/* cmpl-float v0, v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mZoomFactor:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_1 */
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
(( org.anddev.andengine.engine.camera.SmoothCamera ) p0 ).onSmoothZoomStarted ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->onSmoothZoomStarted()V
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
} // .end method
public void setZoomFactorDirect ( Float p0 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mZoomFactor:F */
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->setZoomFactor(F)V */
(( org.anddev.andengine.engine.camera.SmoothCamera ) p0 ).onSmoothZoomFinished ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/SmoothCamera;->onSmoothZoomFinished()V
} // :goto_0
return;
} // :cond_0
/* iput p1, p0, Lorg/anddev/andengine/engine/camera/SmoothCamera;->mTargetZoomFactor:F */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/engine/camera/ZoomCamera;->setZoomFactor(F)V */
} // .end method
