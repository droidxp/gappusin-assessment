class org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl$1 extends org.anddev.andengine.entity.sprite.Sprite {
	 /* # instance fields */
	 final org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl this$0; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0, p2, p3, p4}, Lorg/anddev/andengine/entity/sprite/Sprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean onAreaTouched ( org.anddev.andengine.input.touch.TouchEvent p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 v0 = this.this$0;
		 v0 = 		 (( org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl ) v0 ).onHandleControlBaseTouched ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onHandleControlBaseTouched(Lorg/anddev/andengine/input/touch/TouchEvent;FF)Z
	 } // .end method
