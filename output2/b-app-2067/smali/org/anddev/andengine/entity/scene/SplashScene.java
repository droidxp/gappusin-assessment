public class org.anddev.andengine.entity.scene.SplashScene extends org.anddev.andengine.entity.scene.Scene {
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.SplashScene ( ) {
		 /* .locals 6 */
		 /* const/high16 v4, 0x3f800000 # 1.0f */
		 /* const/high16 v3, -0x40800000 # -1.0f */
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v5, v4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/scene/SplashScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;FFF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.SplashScene ( ) {
		 /* .locals 7 */
		 /* const/high16 v6, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/scene/Scene;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/entity/sprite/Sprite; */
		 v1 = 		 (( org.anddev.andengine.engine.camera.Camera ) p1 ).getMinX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getMinX()F
		 v2 = 		 (( org.anddev.andengine.engine.camera.Camera ) p1 ).getMinY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getMinY()F
		 v3 = 		 (( org.anddev.andengine.engine.camera.Camera ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getWidth()F
		 v4 = 		 (( org.anddev.andengine.engine.camera.Camera ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getHeight()F
		 /* move-object v5, p2 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/sprite/Sprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 /* cmpl-float v1, p4, v6 */
		 /* if-nez v1, :cond_0 */
		 /* cmpl-float v1, p5, v6 */
		 if ( v1 != null) { // if-eqz v1, :cond_1
		 } // :cond_0
		 (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).setScale ( p4 ); // invoke-virtual {v0, p4}, Lorg/anddev/andengine/entity/sprite/Sprite;->setScale(F)V
		 /* new-instance v1, Lorg/anddev/andengine/entity/modifier/ScaleModifier; */
		 v2 = org.anddev.andengine.util.modifier.ease.IEaseFunction.DEFAULT;
		 /* invoke-direct {v1, p3, p4, p5, v2}, Lorg/anddev/andengine/entity/modifier/ScaleModifier;-><init>(FFFLorg/anddev/andengine/util/modifier/ease/IEaseFunction;)V */
		 (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).registerEntityModifier ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/sprite/Sprite;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
	 } // :cond_1
	 (( org.anddev.andengine.entity.scene.SplashScene ) p0 ).attachChild ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/SplashScene;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V
	 return;
} // .end method
