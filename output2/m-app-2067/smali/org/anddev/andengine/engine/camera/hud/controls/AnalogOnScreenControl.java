public class org.anddev.andengine.engine.camera.hud.controls.AnalogOnScreenControl extends org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl implements org.anddev.andengine.input.touch.detector.ClickDetector$IClickDetectorListener implements org.anddev.andengine.util.constants.TimeConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.input.touch.detector.ClickDetector mClickDetector;
	 /* # direct methods */
	 public org.anddev.andengine.engine.camera.hud.controls.AnalogOnScreenControl ( ) {
		 /* .locals 11 */
		 /* move-object v3, p0 */
		 /* move v4, p1 */
		 /* move v5, p2 */
		 /* move-object v6, p3 */
		 /* move-object v7, p4 */
		 /* move-object/from16 v8, p5 */
		 /* move/from16 v9, p6 */
		 /* move-object/from16 v10, p9 */
		 /* invoke-direct/range {v3 ..v10}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;-><init>(FFLorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;FLorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$IOnScreenControlListener;)V */
		 /* new-instance v3, Lorg/anddev/andengine/input/touch/detector/ClickDetector; */
		 /* invoke-direct {v3, p0}, Lorg/anddev/andengine/input/touch/detector/ClickDetector;-><init>(Lorg/anddev/andengine/input/touch/detector/ClickDetector$IClickDetectorListener;)V */
		 this.mClickDetector = v3;
		 v3 = this.mClickDetector;
		 /* move-object v0, v3 */
		 /* move-wide/from16 v1, p7 */
		 (( org.anddev.andengine.input.touch.detector.ClickDetector ) v0 ).setTriggerClickMaximumMilliseconds ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->setTriggerClickMaximumMilliseconds(J)V
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.camera.hud.controls.AnalogOnScreenControl ( ) {
		 /* .locals 2 */
		 /* invoke-direct/range {p0 ..p7}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;-><init>(FFLorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;FLorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$IOnScreenControlListener;)V */
		 /* new-instance v0, Lorg/anddev/andengine/input/touch/detector/ClickDetector; */
		 /* invoke-direct {v0, p0}, Lorg/anddev/andengine/input/touch/detector/ClickDetector;-><init>(Lorg/anddev/andengine/input/touch/detector/ClickDetector$IClickDetectorListener;)V */
		 this.mClickDetector = v0;
		 v0 = this.mClickDetector;
		 int v1 = 0; // const/4 v1, 0x0
		 (( org.anddev.andengine.input.touch.detector.ClickDetector ) v0 ).setEnabled ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->setEnabled(Z)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.engine.camera.hud.controls.AnalogOnScreenControl$IAnalogOnScreenControlListener getOnScreenControlListener ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->getOnScreenControlListener()Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$IOnScreenControlListener; */
		 /* check-cast p0, Lorg/anddev/andengine/engine/camera/hud/controls/AnalogOnScreenControl$IAnalogOnScreenControlListener; */
	 } // .end method
	 public org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl$IOnScreenControlListener getOnScreenControlListener ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.engine.camera.hud.controls.AnalogOnScreenControl ) p0 ).getOnScreenControlListener ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/hud/controls/AnalogOnScreenControl;->getOnScreenControlListener()Lorg/anddev/andengine/engine/camera/hud/controls/AnalogOnScreenControl$IAnalogOnScreenControlListener;
	 } // .end method
	 public void onClick ( org.anddev.andengine.input.touch.detector.ClickDetector p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.engine.camera.hud.controls.AnalogOnScreenControl ) p0 ).getOnScreenControlListener ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/hud/controls/AnalogOnScreenControl;->getOnScreenControlListener()Lorg/anddev/andengine/engine/camera/hud/controls/AnalogOnScreenControl$IAnalogOnScreenControlListener;
		 return;
	 } // .end method
	 protected Boolean onHandleControlBaseTouched ( org.anddev.andengine.input.touch.TouchEvent p0, Float p1, Float p2 ) {
		 /* .locals 2 */
		 v0 = this.mClickDetector;
		 int v1 = 0; // const/4 v1, 0x0
		 (( org.anddev.andengine.input.touch.detector.ClickDetector ) v0 ).onSceneTouchEvent ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->onSceneTouchEvent(Lorg/anddev/andengine/entity/scene/Scene;Lorg/anddev/andengine/input/touch/TouchEvent;)Z
		 v0 = 		 /* invoke-super {p0, p1, p2, p3}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onHandleControlBaseTouched(Lorg/anddev/andengine/input/touch/TouchEvent;FF)Z */
	 } // .end method
	 protected void onUpdateControlKnob ( Float p0, Float p1 ) {
		 /* .locals 3 */
		 /* const/high16 v2, 0x3f000000 # 0.5f */
		 /* mul-float v0, p1, p1 */
		 /* mul-float v1, p2, p2 */
		 /* add-float/2addr v0, v1 */
		 /* const/high16 v1, 0x3e800000 # 0.25f */
		 /* cmpg-float v0, v0, v1 */
		 /* if-gtz v0, :cond_0 */
		 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
	 } // :goto_0
	 return;
} // :cond_0
v0 = org.anddev.andengine.util.MathUtils .atan2 ( p2,p1 );
v1 = android.util.FloatMath .cos ( v0 );
/* mul-float/2addr v1, v2 */
v0 = android.util.FloatMath .sin ( v0 );
/* mul-float/2addr v0, v2 */
/* invoke-super {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // .end method
public void setOnControlClickEnabled ( Boolean p0 ) {
/* .locals 1 */
v0 = this.mClickDetector;
(( org.anddev.andengine.input.touch.detector.ClickDetector ) v0 ).setEnabled ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->setEnabled(Z)V
return;
} // .end method
public void setOnControlClickMaximumMilliseconds ( Long p0 ) {
/* .locals 1 */
v0 = this.mClickDetector;
(( org.anddev.andengine.input.touch.detector.ClickDetector ) v0 ).setTriggerClickMaximumMilliseconds ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->setTriggerClickMaximumMilliseconds(J)V
return;
} // .end method
