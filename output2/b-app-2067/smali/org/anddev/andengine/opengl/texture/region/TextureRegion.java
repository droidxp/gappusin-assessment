public class org.anddev.andengine.opengl.texture.region.TextureRegion extends org.anddev.andengine.opengl.texture.region.BaseTextureRegion {
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.region.TextureRegion ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIII)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.TextureRegion clone ( ) {
		 /* .locals 6 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion; */
		 v1 = this.mTexture;
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mTexturePositionX:I */
		 /* iget v3, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mTexturePositionY:I */
		 /* iget v4, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mWidth:I */
		 /* iget v5, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mHeight:I */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIII)V */
	 } // .end method
	 public Float getTextureCoordinateX1 ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mTexturePositionX:I */
		 /* int-to-float v0, v0 */
		 v1 = 		 v1 = this.mTexture;
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Float getTextureCoordinateX2 ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mTexturePositionX:I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mWidth:I */
		 /* add-int/2addr v0, v1 */
		 /* int-to-float v0, v0 */
		 v1 = 		 v1 = this.mTexture;
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Float getTextureCoordinateY1 ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mTexturePositionY:I */
		 /* int-to-float v0, v0 */
		 v1 = 		 v1 = this.mTexture;
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Float getTextureCoordinateY2 ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mTexturePositionY:I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->mHeight:I */
		 /* add-int/2addr v0, v1 */
		 /* int-to-float v0, v0 */
		 v1 = 		 v1 = this.mTexture;
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Integer getTextureCropHeight ( ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getHeight()I
	 } // .end method
	 public Integer getTextureCropLeft ( ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) p0 ).getTexturePositionX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getTexturePositionX()I
	 } // .end method
	 public Integer getTextureCropTop ( ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) p0 ).getTexturePositionY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getTexturePositionY()I
	 } // .end method
	 public Integer getTextureCropWidth ( ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getWidth()I
	 } // .end method
