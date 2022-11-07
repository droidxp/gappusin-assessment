public class org.anddev.andengine.entity.scene.popup.PopupScene extends org.anddev.andengine.entity.scene.CameraScene {
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.popup.PopupScene ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/entity/scene/popup/PopupScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/entity/scene/Scene;FLjava/lang/Runnable;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.popup.PopupScene ( ) {
		 /* .locals 2 */
		 int v1 = 1; // const/4 v1, 0x1
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/scene/CameraScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;)V */
		 (( org.anddev.andengine.entity.scene.popup.PopupScene ) p0 ).setBackgroundEnabled ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/popup/PopupScene;->setBackgroundEnabled(Z)V
		 (( org.anddev.andengine.entity.scene.Scene ) p2 ).setChildScene ( p0, v0, v1, v1 ); // invoke-virtual {p2, p0, v0, v1, v1}, Lorg/anddev/andengine/entity/scene/Scene;->setChildScene(Lorg/anddev/andengine/entity/scene/Scene;ZZZ)V
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
		 /* new-instance v1, Lorg/anddev/andengine/entity/scene/popup/PopupScene$1; */
		 /* invoke-direct {v1, p0, p2, p4}, Lorg/anddev/andengine/entity/scene/popup/PopupScene$1;-><init>(Lorg/anddev/andengine/entity/scene/popup/PopupScene;Lorg/anddev/andengine/entity/scene/Scene;Ljava/lang/Runnable;)V */
		 /* invoke-direct {v0, p3, v1}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
		 (( org.anddev.andengine.entity.scene.popup.PopupScene ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/popup/PopupScene;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
		 return;
	 } // .end method
