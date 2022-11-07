class org.anddev.andengine.entity.scene.popup.PopupScene$1 implements org.anddev.andengine.engine.handler.timer.ITimerCallback {
	 /* # interfaces */
	 /* # instance fields */
	 final org.anddev.andengine.entity.scene.popup.PopupScene this$0; //synthetic
	 private final org.anddev.andengine.entity.scene.Scene val$pParentScene; //synthetic
	 private final java.lang.Runnable val$pRunnable; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.entity.scene.popup.PopupScene$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 this.val$pParentScene = p2;
		 this.val$pRunnable = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onTimePassed ( org.anddev.andengine.engine.handler.timer.TimerHandler p0 ) {
		 /* .locals 1 */
		 v0 = this.this$0;
		 (( org.anddev.andengine.entity.scene.popup.PopupScene ) v0 ).unregisterUpdateHandler ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/scene/popup/PopupScene;->unregisterUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)Z
		 v0 = this.val$pParentScene;
		 (( org.anddev.andengine.entity.scene.Scene ) v0 ).clearChildScene ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/scene/Scene;->clearChildScene()V
		 v0 = this.val$pRunnable;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.val$pRunnable;
		 } // :cond_0
		 return;
	 } // .end method
