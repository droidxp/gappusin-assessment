public class org.anddev.andengine.entity.scene.background.ParallaxBackground$ParallaxEntity {
	 /* # instance fields */
	 final Float mParallaxFactor;
	 final org.anddev.andengine.entity.shape.Shape mShape;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.background.ParallaxBackground$ParallaxEntity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground$ParallaxEntity;->mParallaxFactor:F */
		 this.mShape = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDraw ( javax.microedition.khronos.opengles.GL10 p0, Float p1, org.anddev.andengine.engine.camera.Camera p2 ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 v0 = 		 (( org.anddev.andengine.engine.camera.Camera ) p3 ).getWidth ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/engine/camera/Camera;->getWidth()F
		 v1 = this.mShape;
		 v1 = 		 (( org.anddev.andengine.entity.shape.Shape ) v1 ).getWidthScaled ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/shape/Shape;->getWidthScaled()F
		 /* iget v2, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground$ParallaxEntity;->mParallaxFactor:F */
		 /* mul-float/2addr v2, p2 */
		 /* rem-float/2addr v2, v1 */
	 } // :goto_0
	 /* cmpl-float v3, v2, v4 */
	 /* if-gtz v3, :cond_1 */
} // :cond_0
v3 = this.mShape;
(( org.anddev.andengine.entity.shape.Shape ) v3 ).onDraw ( p1, p3 ); // invoke-virtual {v3, p1, p3}, Lorg/anddev/andengine/entity/shape/Shape;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
/* add-float/2addr v2, v1 */
/* cmpg-float v3, v2, v0 */
/* if-ltz v3, :cond_0 */
return;
} // :cond_1
/* sub-float/2addr v2, v1 */
} // .end method
