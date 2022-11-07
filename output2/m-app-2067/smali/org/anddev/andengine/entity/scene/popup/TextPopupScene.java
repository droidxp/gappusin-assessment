public class org.anddev.andengine.entity.scene.popup.TextPopupScene extends org.anddev.andengine.entity.scene.popup.PopupScene {
	 /* # instance fields */
	 private final org.anddev.andengine.entity.text.Text mText;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.popup.TextPopupScene ( ) {
		 /* .locals 8 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move v5, p5 */
		 /* move-object v7, v6 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/entity/scene/popup/TextPopupScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/entity/scene/Scene;Lorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;FLorg/anddev/andengine/entity/modifier/IEntityModifier;Ljava/lang/Runnable;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.popup.TextPopupScene ( ) {
		 /* .locals 8 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move v5, p5 */
		 /* move-object v7, p6 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/entity/scene/popup/TextPopupScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/entity/scene/Scene;Lorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;FLorg/anddev/andengine/entity/modifier/IEntityModifier;Ljava/lang/Runnable;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.popup.TextPopupScene ( ) {
		 /* .locals 8 */
		 int v7 = 0; // const/4 v7, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move v5, p5 */
		 /* move-object v6, p6 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/entity/scene/popup/TextPopupScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/entity/scene/Scene;Lorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;FLorg/anddev/andengine/entity/modifier/IEntityModifier;Ljava/lang/Runnable;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.popup.TextPopupScene ( ) {
		 /* .locals 6 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1, p2, p5, p7}, Lorg/anddev/andengine/entity/scene/popup/PopupScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/entity/scene/Scene;FLjava/lang/Runnable;)V */
		 /* new-instance v0, Lorg/anddev/andengine/entity/text/Text; */
		 v5 = org.anddev.andengine.util.HorizontalAlign.CENTER;
		 /* move v2, v1 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/text/Text;-><init>(FFLorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;Lorg/anddev/andengine/util/HorizontalAlign;)V */
		 this.mText = v0;
		 v0 = this.mText;
		 (( org.anddev.andengine.entity.scene.popup.TextPopupScene ) p0 ).centerShapeInCamera ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/popup/TextPopupScene;->centerShapeInCamera(Lorg/anddev/andengine/entity/shape/Shape;)V
		 if ( p6 != null) { // if-eqz p6, :cond_0
			 v0 = this.mText;
			 (( org.anddev.andengine.entity.text.Text ) v0 ).registerEntityModifier ( p6 ); // invoke-virtual {v0, p6}, Lorg/anddev/andengine/entity/text/Text;->registerEntityModifier(Lorg/anddev/andengine/entity/modifier/IEntityModifier;)V
		 } // :cond_0
		 v0 = this.mText;
		 (( org.anddev.andengine.entity.scene.popup.TextPopupScene ) p0 ).attachChild ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/scene/popup/TextPopupScene;->attachChild(Lorg/anddev/andengine/entity/IEntity;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.entity.text.Text getText ( ) {
		 /* .locals 1 */
		 v0 = this.mText;
	 } // .end method
