public abstract class org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl extends org.anddev.andengine.engine.camera.hud.HUD implements org.anddev.andengine.entity.scene.Scene$IOnSceneTouchListener {
	 /* # interfaces */
	 /* # static fields */
	 private static final Integer INVALID_POINTER_ID;
	 /* # instance fields */
	 private Integer mActivePointerID;
	 private final org.anddev.andengine.entity.sprite.Sprite mControlBase;
	 private final org.anddev.andengine.entity.sprite.Sprite mControlKnob;
	 private Float mControlValueX;
	 private Float mControlValueY;
	 private final org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl$IOnScreenControlListener mOnScreenControlListener;
	 /* # direct methods */
	 public org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ( ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/engine/camera/hud/HUD;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mActivePointerID:I */
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).setCamera ( p3 ); // invoke-virtual {p0, p3}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->setCamera(Lorg/anddev/andengine/engine/camera/Camera;)V
		 this.mOnScreenControlListener = p7;
		 /* new-instance v0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$1; */
		 /* invoke-direct {v0, p0, p1, p2, p4}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$1;-><init>(Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 this.mControlBase = v0;
		 /* new-instance v0, Lorg/anddev/andengine/entity/sprite/Sprite; */
		 /* invoke-direct {v0, v1, v1, p5}, Lorg/anddev/andengine/entity/sprite/Sprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 this.mControlKnob = v0;
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).onHandleControlKnobReleased ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onHandleControlKnobReleased()V
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).setOnSceneTouchListener ( p0 ); // invoke-virtual {p0, p0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->setOnSceneTouchListener(Lorg/anddev/andengine/entity/scene/Scene$IOnSceneTouchListener;)V
		 v0 = this.mControlBase;
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).registerTouchArea ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->registerTouchArea(Lorg/anddev/andengine/entity/scene/Scene$ITouchArea;)V
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
		 /* new-instance v1, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$2; */
		 /* invoke-direct {v1, p0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$2;-><init>(Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;)V */
		 /* invoke-direct {v0, p6, v2, v1}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
		 v0 = this.mControlBase;
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).attachChild ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V
		 v0 = this.mControlKnob;
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).attachChild ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).setTouchAreaBindingEnabled ( v2 ); // invoke-virtual {p0, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->setTouchAreaBindingEnabled(Z)V
		 return;
	 } // .end method
	 static org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl$IOnScreenControlListener access$0 ( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.mOnScreenControlListener;
	 } // .end method
	 static Float access$1 ( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mControlValueX:F */
	 } // .end method
	 static Float access$2 ( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mControlValueY:F */
	 } // .end method
	 private void updateControlKnob ( Float p0, Float p1 ) {
		 /* .locals 5 */
		 /* const/high16 v4, 0x3f000000 # 0.5f */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = this.mControlBase;
		 v1 = 		 (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/sprite/Sprite;->getWidth()F
		 v1 = 		 org.anddev.andengine.util.MathUtils .bringToBounds ( v3,v1,p1 );
		 v2 = 		 (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/sprite/Sprite;->getWidth()F
		 /* div-float/2addr v1, v2 */
		 /* sub-float/2addr v1, v4 */
		 v2 = 		 (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/sprite/Sprite;->getHeight()F
		 v2 = 		 org.anddev.andengine.util.MathUtils .bringToBounds ( v3,v2,p2 );
		 v0 = 		 (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/sprite/Sprite;->getHeight()F
		 /* div-float v0, v2, v0 */
		 /* sub-float/2addr v0, v4 */
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).onUpdateControlKnob ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.entity.sprite.Sprite getControlBase ( ) {
		 /* .locals 1 */
		 v0 = this.mControlBase;
	 } // .end method
	 public org.anddev.andengine.entity.sprite.Sprite getControlKnob ( ) {
		 /* .locals 1 */
		 v0 = this.mControlKnob;
	 } // .end method
	 public org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl$IOnScreenControlListener getOnScreenControlListener ( ) {
		 /* .locals 1 */
		 v0 = this.mOnScreenControlListener;
	 } // .end method
	 protected void onHandleControlBaseLeft ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).onUpdateControlKnob ( v0, v0 ); // invoke-virtual {p0, v0, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V
		 return;
	 } // .end method
	 protected Boolean onHandleControlBaseTouched ( org.anddev.andengine.input.touch.TouchEvent p0, Float p1, Float p2 ) {
		 /* .locals 4 */
		 int v3 = -1; // const/4 v3, -0x1
		 int v2 = 1; // const/4 v2, 0x1
		 v0 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getPointerID ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
		 v1 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getAction()I
		 /* packed-switch v1, :pswitch_data_0 */
		 /* :pswitch_0 */
		 /* iget v1, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mActivePointerID:I */
		 /* if-ne v1, v0, :cond_0 */
		 /* invoke-direct {p0, p2, p3}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->updateControlKnob(FF)V */
		 /* move v0, v2 */
	 } // :goto_0
	 /* :pswitch_1 */
	 /* iget v1, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mActivePointerID:I */
	 /* if-ne v1, v3, :cond_0 */
	 /* iput v0, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mActivePointerID:I */
	 /* invoke-direct {p0, p2, p3}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->updateControlKnob(FF)V */
	 /* move v0, v2 */
	 /* :pswitch_2 */
	 /* iget v1, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mActivePointerID:I */
	 /* if-ne v1, v0, :cond_0 */
	 /* iput v3, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mActivePointerID:I */
	 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).onHandleControlKnobReleased ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onHandleControlKnobReleased()V
	 /* move v0, v2 */
} // :cond_0
/* move v0, v2 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
protected void onHandleControlKnobReleased ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).onUpdateControlKnob ( v0, v0 ); // invoke-virtual {p0, v0, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V
return;
} // .end method
public Boolean onSceneTouchEvent ( org.anddev.andengine.entity.scene.Scene p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getPointerID ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getPointerID()I
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mActivePointerID:I */
/* if-ne v0, v1, :cond_0 */
(( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).onHandleControlBaseLeft ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onHandleControlBaseLeft()V
v0 = (( org.anddev.andengine.input.touch.TouchEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/input/touch/TouchEvent;->getAction()I
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
int v0 = 0; // const/4 v0, 0x0
/* :pswitch_1 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mActivePointerID:I */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
protected void onUpdateControlKnob ( Float p0, Float p1 ) {
/* .locals 6 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* const/high16 v5, 0x3f000000 # 0.5f */
v0 = this.mControlBase;
v1 = this.mControlKnob;
/* mul-float v2, v3, p1 */
/* iput v2, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mControlValueX:F */
/* mul-float v2, v3, p2 */
/* iput v2, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mControlValueY:F */
(( org.anddev.andengine.entity.sprite.Sprite ) v0 ).getSceneCenterCoordinates ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/sprite/Sprite;->getSceneCenterCoordinates()[F
int v3 = 0; // const/4 v3, 0x0
/* aget v3, v2, v3 */
v4 = (( org.anddev.andengine.entity.sprite.Sprite ) v1 ).getWidth ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/sprite/Sprite;->getWidth()F
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
v4 = (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).getWidthScaled ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/sprite/Sprite;->getWidthScaled()F
/* mul-float/2addr v4, p1 */
/* add-float/2addr v3, v4 */
int v4 = 1; // const/4 v4, 0x1
/* aget v2, v2, v4 */
v4 = (( org.anddev.andengine.entity.sprite.Sprite ) v1 ).getHeight ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/sprite/Sprite;->getHeight()F
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v2, v4 */
v0 = (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).getHeightScaled ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/sprite/Sprite;->getHeightScaled()F
/* mul-float/2addr v0, p2 */
/* add-float/2addr v0, v2 */
(( org.anddev.andengine.entity.sprite.Sprite ) v1 ).setPosition ( v3, v0 ); // invoke-virtual {v1, v3, v0}, Lorg/anddev/andengine/entity/sprite/Sprite;->setPosition(FF)V
return;
} // .end method
public void refreshControlKnobPosition ( ) {
/* .locals 3 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* iget v0, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mControlValueX:F */
/* mul-float/2addr v0, v2 */
/* iget v1, p0, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->mControlValueY:F */
/* mul-float/2addr v1, v2 */
(( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) p0 ).onUpdateControlKnob ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V
return;
} // .end method
