public abstract class org.anddev.andengine.opengl.texture.region.BaseTextureRegion {
	 /* # instance fields */
	 protected Integer mHeight;
	 protected final org.anddev.andengine.opengl.texture.ITexture mTexture;
	 protected Integer mTexturePositionX;
	 protected Integer mTexturePositionY;
	 protected final org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer mTextureRegionBuffer;
	 protected final org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop mTextureRegionCrop;
	 protected Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.region.BaseTextureRegion ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mTexture = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mTexturePositionX:I */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mTexturePositionY:I */
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mWidth:I */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mHeight:I */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer; */
		 /* const v1, 0x88e4 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v0, p0, v1, v2}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;-><init>(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;IZ)V */
		 this.mTextureRegionBuffer = v0;
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop; */
		 /* invoke-direct {v0, p0}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;-><init>(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V */
		 this.mTextureRegionCrop = v0;
		 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p0 ).initTextureBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->initTextureBuffer()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mHeight:I */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.ITexture getTexture ( ) {
		 /* .locals 1 */
		 v0 = this.mTexture;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer getTextureBuffer ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegionBuffer;
	 } // .end method
	 public abstract Float getTextureCoordinateX1 ( ) {
	 } // .end method
	 public abstract Float getTextureCoordinateX2 ( ) {
	 } // .end method
	 public abstract Float getTextureCoordinateY1 ( ) {
	 } // .end method
	 public abstract Float getTextureCoordinateY2 ( ) {
	 } // .end method
	 public abstract Integer getTextureCropHeight ( ) {
	 } // .end method
	 public abstract Integer getTextureCropLeft ( ) {
	 } // .end method
	 public abstract Integer getTextureCropTop ( ) {
	 } // .end method
	 public abstract Integer getTextureCropWidth ( ) {
	 } // .end method
	 public Integer getTexturePositionX ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mTexturePositionX:I */
	 } // .end method
	 public Integer getTexturePositionY ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mTexturePositionY:I */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop getTexureRegionCrop ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegionCrop;
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mWidth:I */
	 } // .end method
	 protected void initTextureBuffer ( ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p0 ).updateTextureRegionBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->updateTextureRegionBuffer()V
		 return;
	 } // .end method
	 public Boolean isFlippedHorizontal ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegionBuffer;
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).isFlippedHorizontal ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->isFlippedHorizontal()Z
	 } // .end method
	 public Boolean isFlippedVertical ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegionBuffer;
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).isFlippedVertical ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->isFlippedVertical()Z
	 } // .end method
	 public Boolean isTextureRegionBufferManaged ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegionBuffer;
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).isManaged ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->isManaged()Z
	 } // .end method
	 public void onApply ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 v0 = this.mTexture;
		 /* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_VERTEXBUFFEROBJECTS:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* check-cast p1, Ljavax/microedition/khronos/opengles/GL11; */
			 v0 = this.mTextureRegionBuffer;
			 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).selectOnHardware ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->selectOnHardware(Ljavax/microedition/khronos/opengles/GL11;)V
			 org.anddev.andengine.opengl.util.GLHelper .texCoordZeroPointer ( p1 );
		 } // :goto_0
		 return;
	 } // :cond_0
	 v0 = this.mTextureRegionBuffer;
	 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).getFloatBuffer ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->getFloatBuffer()Lorg/anddev/andengine/opengl/util/FastFloatBuffer;
	 org.anddev.andengine.opengl.util.GLHelper .texCoordPointer ( p1,v0 );
} // .end method
public void onApplyCrop ( javax.microedition.khronos.opengles.GL11 p0 ) {
	 /* .locals 1 */
	 v0 = this.mTexture;
	 v0 = this.mTextureRegionCrop;
	 (( org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ) v0 ).apply ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->apply(Ljavax/microedition/khronos/opengles/GL11;)V
	 return;
} // .end method
public void setFlippedHorizontal ( Boolean p0 ) {
	 /* .locals 1 */
	 v0 = this.mTextureRegionBuffer;
	 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).setFlippedHorizontal ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->setFlippedHorizontal(Z)V
	 v0 = this.mTextureRegionCrop;
	 (( org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ) v0 ).setFlippedHorizontal ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->setFlippedHorizontal(Z)V
	 return;
} // .end method
public void setFlippedVertical ( Boolean p0 ) {
	 /* .locals 1 */
	 v0 = this.mTextureRegionBuffer;
	 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).setFlippedVertical ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->setFlippedVertical(Z)V
	 v0 = this.mTextureRegionCrop;
	 (( org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ) v0 ).setFlippedVertical ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->setFlippedVertical(Z)V
	 return;
} // .end method
public void setHeight ( Integer p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mHeight:I */
	 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p0 ).updateTextureRegionBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->updateTextureRegionBuffer()V
	 return;
} // .end method
public void setTexturePosition ( Integer p0, Integer p1 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mTexturePositionX:I */
	 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mTexturePositionY:I */
	 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p0 ).updateTextureRegionBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->updateTextureRegionBuffer()V
	 return;
} // .end method
public void setTextureRegionBufferManaged ( Boolean p0 ) {
	 /* .locals 1 */
	 v0 = this.mTextureRegionBuffer;
	 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).setManaged ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->setManaged(Z)V
	 return;
} // .end method
public void setWidth ( Integer p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->mWidth:I */
	 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p0 ).updateTextureRegionBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->updateTextureRegionBuffer()V
	 return;
} // .end method
protected void updateTextureRegionBuffer ( ) {
	 /* .locals 1 */
	 v0 = this.mTextureRegionBuffer;
	 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) v0 ).update ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->update()V
	 v0 = this.mTextureRegionCrop;
	 (( org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ) v0 ).update ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->update()V
	 return;
} // .end method
