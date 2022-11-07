public class org.anddev.andengine.entity.scene.background.EntityBackground extends org.anddev.andengine.entity.scene.background.ColorBackground {
	 /* # instance fields */
	 protected org.anddev.andengine.entity.IEntity mEntity;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.background.EntityBackground ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;-><init>(FFF)V */
		 this.mEntity = p4;
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.background.EntityBackground ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;-><init>()V */
		 this.mEntity = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
		 /* .locals 1 */
		 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V */
		 v0 = this.mEntity;
		 return;
	 } // .end method
