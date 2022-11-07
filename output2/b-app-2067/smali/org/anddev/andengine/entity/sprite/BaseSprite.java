public abstract class org.anddev.andengine.entity.sprite.BaseSprite extends org.anddev.andengine.entity.primitive.BaseRectangle {
	 /* # instance fields */
	 protected final org.anddev.andengine.opengl.texture.region.BaseTextureRegion mTextureRegion;
	 /* # direct methods */
	 public org.anddev.andengine.entity.sprite.BaseSprite ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;-><init>(FFFF)V */
		 this.mTextureRegion = p5;
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->initBlendFunction()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.sprite.BaseSprite ( ) {
		 /* .locals 6 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move-object v5, p6 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;-><init>(FFFFLorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)V */
		 this.mTextureRegion = p5;
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->initBlendFunction()V */
		 return;
	 } // .end method
	 private void initBlendFunction ( ) {
		 /* .locals 2 */
		 v0 = this.mTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTexture ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTexture()Lorg/anddev/andengine/opengl/texture/ITexture;
		 /* iget-boolean v0, v0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mPreMultipyAlpha:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
			 /* const/16 v1, 0x303 */
			 (( org.anddev.andengine.entity.sprite.BaseSprite ) p0 ).setBlendFunction ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->setBlendFunction(II)V
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void doDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).onApply ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->onApply(Ljavax/microedition/khronos/opengles/GL10;)V
		 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->doDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V */
		 return;
	 } // .end method
	 protected void finalize ( ) {
		 /* .locals 2 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->finalize()V */
		 v0 = this.mTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureBuffer ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureBuffer()Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).isManaged ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->isManaged()Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).unloadFromActiveBufferObjectManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->unloadFromActiveBufferObjectManager()V
		 } // :cond_0
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.BaseTextureRegion getTextureRegion ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegion;
	 } // .end method
	 protected void onInitDraw ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->onInitDraw(Ljavax/microedition/khronos/opengles/GL10;)V */
		 org.anddev.andengine.opengl.util.GLHelper .enableTextures ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .enableTexCoordArray ( p1 );
		 return;
	 } // .end method
	 public void reset ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->reset()V */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->initBlendFunction()V */
		 return;
	 } // .end method
	 public void setFlippedHorizontal ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).setFlippedHorizontal ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->setFlippedHorizontal(Z)V
		 return;
	 } // .end method
	 public void setFlippedVertical ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).setFlippedVertical ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->setFlippedVertical(Z)V
		 return;
	 } // .end method
