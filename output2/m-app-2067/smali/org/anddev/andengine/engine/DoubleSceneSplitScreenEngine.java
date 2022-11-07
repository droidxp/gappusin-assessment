public class org.anddev.andengine.engine.DoubleSceneSplitScreenEngine extends org.anddev.andengine.engine.Engine {
	 /* # instance fields */
	 private final org.anddev.andengine.engine.camera.Camera mSecondCamera;
	 private org.anddev.andengine.entity.scene.Scene mSecondScene;
	 /* # direct methods */
	 public org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/engine/Engine;-><init>(Lorg/anddev/andengine/engine/options/EngineOptions;)V */
		 this.mSecondCamera = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void convertSurfaceToSceneTouchEvent ( org.anddev.andengine.engine.camera.Camera p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceWidth:I */
		 /* shr-int/lit8 v0, v0, 0x1 */
		 (( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getFirstCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getFirstCamera()Lorg/anddev/andengine/engine/camera/Camera;
		 /* if-ne p1, v1, :cond_0 */
		 /* iget v1, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceHeight:I */
		 (( org.anddev.andengine.engine.camera.Camera ) p1 ).convertSurfaceToSceneTouchEvent ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Lorg/anddev/andengine/engine/camera/Camera;->convertSurfaceToSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;II)V
	 } // :goto_0
	 return;
} // :cond_0
/* neg-int v1, v0 */
/* int-to-float v1, v1 */
int v2 = 0; // const/4 v2, 0x0
(( org.anddev.andengine.input.touch.TouchEvent ) p2 ).offset ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Lorg/anddev/andengine/input/touch/TouchEvent;->offset(FF)V
/* iget v1, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceHeight:I */
(( org.anddev.andengine.engine.camera.Camera ) p1 ).convertSurfaceToSceneTouchEvent ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Lorg/anddev/andengine/engine/camera/Camera;->convertSurfaceToSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;II)V
} // .end method
public org.anddev.andengine.engine.camera.Camera getCamera ( ) {
/* .locals 1 */
v0 = this.mCamera;
} // .end method
protected org.anddev.andengine.engine.camera.Camera getCameraFromSurfaceTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
/* iget v1, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceWidth:I */
/* shr-int/lit8 v1, v1, 0x1 */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getFirstCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getFirstCamera()Lorg/anddev/andengine/engine/camera/Camera;
} // :goto_0
} // :cond_0
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getSecondCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getSecondCamera()Lorg/anddev/andengine/engine/camera/Camera;
} // .end method
public org.anddev.andengine.engine.camera.Camera getFirstCamera ( ) {
/* .locals 1 */
v0 = this.mCamera;
} // .end method
public org.anddev.andengine.entity.scene.Scene getFirstScene ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lorg/anddev/andengine/engine/Engine;->getScene()Lorg/anddev/andengine/entity/scene/Scene; */
} // .end method
public org.anddev.andengine.entity.scene.Scene getScene ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lorg/anddev/andengine/engine/Engine;->getScene()Lorg/anddev/andengine/entity/scene/Scene; */
} // .end method
protected org.anddev.andengine.entity.scene.Scene getSceneFromSurfaceTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
/* iget v1, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceWidth:I */
/* shr-int/lit8 v1, v1, 0x1 */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getFirstScene ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getFirstScene()Lorg/anddev/andengine/entity/scene/Scene;
} // :goto_0
} // :cond_0
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getSecondScene ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getSecondScene()Lorg/anddev/andengine/entity/scene/Scene;
} // .end method
public org.anddev.andengine.engine.camera.Camera getSecondCamera ( ) {
/* .locals 1 */
v0 = this.mSecondCamera;
} // .end method
public org.anddev.andengine.entity.scene.Scene getSecondScene ( ) {
/* .locals 1 */
v0 = this.mSecondScene;
} // .end method
protected void onDrawScene ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getFirstCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getFirstCamera()Lorg/anddev/andengine/engine/camera/Camera;
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getSecondCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getSecondCamera()Lorg/anddev/andengine/engine/camera/Camera;
/* iget v2, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceWidth:I */
/* shr-int/lit8 v2, v2, 0x1 */
/* iget v3, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceHeight:I */
org.anddev.andengine.opengl.util.GLHelper .enableScissorTest ( p1 );
v4 = this.mScene;
(( org.anddev.andengine.entity.scene.Scene ) v4 ).onDraw ( p1, v0 ); // invoke-virtual {v4, p1, v0}, Lorg/anddev/andengine/entity/scene/Scene;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
(( org.anddev.andengine.engine.camera.Camera ) v0 ).onDrawHUD ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->onDrawHUD(Ljavax/microedition/khronos/opengles/GL10;)V
v0 = this.mSecondScene;
(( org.anddev.andengine.entity.scene.Scene ) v0 ).onDraw ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lorg/anddev/andengine/entity/scene/Scene;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
(( org.anddev.andengine.engine.camera.Camera ) v1 ).onDrawHUD ( p1 ); // invoke-virtual {v1, p1}, Lorg/anddev/andengine/engine/camera/Camera;->onDrawHUD(Ljavax/microedition/khronos/opengles/GL10;)V
org.anddev.andengine.opengl.util.GLHelper .disableScissorTest ( p1 );
return;
} // .end method
protected void onUpdateCameraSurface ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* iget v0, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceWidth:I */
/* shr-int/lit8 v0, v0, 0x1 */
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getFirstCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getFirstCamera()Lorg/anddev/andengine/engine/camera/Camera;
/* iget v2, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceHeight:I */
(( org.anddev.andengine.engine.camera.Camera ) v1 ).setSurfaceSize ( v3, v3, v0, v2 ); // invoke-virtual {v1, v3, v3, v0, v2}, Lorg/anddev/andengine/engine/camera/Camera;->setSurfaceSize(IIII)V
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getSecondCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getSecondCamera()Lorg/anddev/andengine/engine/camera/Camera;
/* iget v2, p0, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->mSurfaceHeight:I */
(( org.anddev.andengine.engine.camera.Camera ) v1 ).setSurfaceSize ( v0, v3, v0, v2 ); // invoke-virtual {v1, v0, v3, v0, v2}, Lorg/anddev/andengine/engine/camera/Camera;->setSurfaceSize(IIII)V
return;
} // .end method
protected void onUpdateScene ( Float p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/engine/Engine;->onUpdateScene(F)V */
v0 = this.mSecondScene;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mSecondScene;
(( org.anddev.andengine.entity.scene.Scene ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/scene/Scene;->onUpdate(F)V
} // :cond_0
return;
} // .end method
public void setFirstScene ( org.anddev.andengine.entity.scene.Scene p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/engine/Engine;->setScene(Lorg/anddev/andengine/entity/scene/Scene;)V */
return;
} // .end method
public void setScene ( org.anddev.andengine.entity.scene.Scene p0 ) {
/* .locals 0 */
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).setFirstScene ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->setFirstScene(Lorg/anddev/andengine/entity/scene/Scene;)V
return;
} // .end method
public void setSecondScene ( org.anddev.andengine.entity.scene.Scene p0 ) {
/* .locals 0 */
this.mSecondScene = p1;
return;
} // .end method
protected void updateUpdateHandlers ( Float p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/engine/Engine;->updateUpdateHandlers(F)V */
(( org.anddev.andengine.engine.DoubleSceneSplitScreenEngine ) p0 ).getSecondCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/DoubleSceneSplitScreenEngine;->getSecondCamera()Lorg/anddev/andengine/engine/camera/Camera;
(( org.anddev.andengine.engine.camera.Camera ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->onUpdate(F)V
return;
} // .end method
