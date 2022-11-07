public class org.anddev.andengine.entity.scene.CameraScene extends org.anddev.andengine.entity.scene.Scene {
	 /* # instance fields */
	 protected org.anddev.andengine.engine.camera.Camera mCamera;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.CameraScene ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/entity/scene/CameraScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.CameraScene ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/scene/Scene;-><init>()V */
		 this.mCamera = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void centerShapeInCamera ( org.anddev.andengine.entity.shape.Shape p0 ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x3f000000 # 0.5f */
		 v0 = this.mCamera;
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/camera/Camera;->getWidth()F
		 v2 = 		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/shape/Shape;->getWidth()F
		 /* sub-float/2addr v1, v2 */
		 /* mul-float/2addr v1, v3 */
		 v0 = 		 (( org.anddev.andengine.engine.camera.Camera ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/camera/Camera;->getHeight()F
		 v2 = 		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/shape/Shape;->getHeight()F
		 /* sub-float/2addr v0, v2 */
		 /* mul-float/2addr v0, v3 */
		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).setPosition ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lorg/anddev/andengine/entity/shape/Shape;->setPosition(FF)V
		 return;
	 } // .end method
	 public void centerShapeInCameraHorizontally ( org.anddev.andengine.entity.shape.Shape p0 ) {
		 /* .locals 2 */
		 v0 = this.mCamera;
		 v0 = 		 (( org.anddev.andengine.engine.camera.Camera ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/camera/Camera;->getWidth()F
		 v1 = 		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/shape/Shape;->getWidth()F
		 /* sub-float/2addr v0, v1 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* mul-float/2addr v0, v1 */
		 v1 = 		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/shape/Shape;->getY()F
		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).setPosition ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/entity/shape/Shape;->setPosition(FF)V
		 return;
	 } // .end method
	 public void centerShapeInCameraVertically ( org.anddev.andengine.entity.shape.Shape p0 ) {
		 /* .locals 3 */
		 v0 = 		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/shape/Shape;->getX()F
		 v1 = this.mCamera;
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) v1 ).getHeight ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/engine/camera/Camera;->getHeight()F
		 v2 = 		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/shape/Shape;->getHeight()F
		 /* sub-float/2addr v1, v2 */
		 /* const/high16 v2, 0x3f000000 # 0.5f */
		 /* mul-float/2addr v1, v2 */
		 (( org.anddev.andengine.entity.shape.Shape ) p1 ).setPosition ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/entity/shape/Shape;->setPosition(FF)V
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.camera.Camera getCamera ( ) {
		 /* .locals 1 */
		 v0 = this.mCamera;
	 } // .end method
	 protected Boolean onChildSceneTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 2 */
		 v0 = this.mChildScene;
		 /* instance-of v0, v0, Lorg/anddev/andengine/entity/scene/CameraScene; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mCamera;
			 (( org.anddev.andengine.engine.camera.Camera ) v0 ).convertCameraSceneToSceneTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->convertCameraSceneToSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)V
			 v0 = 			 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/scene/Scene;->onChildSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z */
			 v1 = this.mCamera;
			 (( org.anddev.andengine.engine.camera.Camera ) v1 ).convertSceneToCameraSceneTouchEvent ( p1 ); // invoke-virtual {v1, p1}, Lorg/anddev/andengine/engine/camera/Camera;->convertSceneToCameraSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)V
		 } // :goto_0
	 } // :cond_0
	 v0 = 	 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/scene/Scene;->onChildSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z */
} // .end method
protected void onManagedDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
	 /* .locals 2 */
	 /* const/16 v1, 0x1701 */
	 v0 = this.mCamera;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mCamera;
		 (( org.anddev.andengine.engine.camera.Camera ) v0 ).onApplyCameraSceneMatrix ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->onApplyCameraSceneMatrix(Ljavax/microedition/khronos/opengles/GL10;)V
		 /* const/16 v0, 0x1700 */
		 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/Scene;->onManagedDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V */
	 } // :cond_0
	 return;
} // .end method
public Boolean onSceneTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
	 /* .locals 2 */
	 int v1 = 0; // const/4 v1, 0x0
	 v0 = this.mCamera;
	 /* if-nez v0, :cond_0 */
	 /* move v0, v1 */
} // :goto_0
} // :cond_0
v0 = this.mCamera;
(( org.anddev.andengine.engine.camera.Camera ) v0 ).convertSceneToCameraSceneTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->convertSceneToCameraSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)V
v0 = /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/scene/Scene;->onSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
v0 = this.mCamera;
(( org.anddev.andengine.engine.camera.Camera ) v0 ).convertCameraSceneToSceneTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->convertCameraSceneToSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)V
/* move v0, v1 */
} // .end method
public void setCamera ( org.anddev.andengine.engine.camera.Camera p0 ) {
/* .locals 0 */
this.mCamera = p1;
return;
} // .end method
