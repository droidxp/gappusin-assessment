public class org.anddev.andengine.entity.scene.background.ParallaxBackground extends org.anddev.andengine.entity.scene.background.ColorBackground {
	 /* # instance fields */
	 private final java.util.ArrayList mParallaxEntities;
	 private Integer mParallaxEntityCount;
	 protected Float mParallaxValue;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.background.ParallaxBackground ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;-><init>(FFF)V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mParallaxEntities = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void attachParallaxEntity ( org.anddev.andengine.entity.scene.background.ParallaxBackground$ParallaxEntity p0 ) {
		 /* .locals 1 */
		 v0 = this.mParallaxEntities;
		 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxEntityCount:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxEntityCount:I */
		 return;
	 } // .end method
	 public Boolean detachParallaxEntity ( org.anddev.andengine.entity.scene.background.ParallaxBackground$ParallaxEntity p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxEntityCount:I */
		 int v1 = 1; // const/4 v1, 0x1
		 /* sub-int/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxEntityCount:I */
		 v0 = this.mParallaxEntities;
		 v0 = 		 (( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_0 */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxEntityCount:I */
		 /* add-int/lit8 v1, v1, 0x1 */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxEntityCount:I */
	 } // :cond_0
} // .end method
public void onDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
	 /* .locals 4 */
	 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/entity/scene/background/ColorBackground;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxValue:F */
	 v2 = this.mParallaxEntities;
	 int v0 = 0; // const/4 v0, 0x0
	 /* move v3, v0 */
} // :goto_0
/* iget v0, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxEntityCount:I */
/* if-lt v3, v0, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground$ParallaxEntity; */
(( org.anddev.andengine.entity.scene.background.ParallaxBackground$ParallaxEntity ) v0 ).onDraw ( p1, v1, p2 ); // invoke-virtual {v0, p1, v1, p2}, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground$ParallaxEntity;->onDraw(Ljavax/microedition/khronos/opengles/GL10;FLorg/anddev/andengine/engine/camera/Camera;)V
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // .end method
public void setParallaxValue ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/scene/background/ParallaxBackground;->mParallaxValue:F */
return;
} // .end method
