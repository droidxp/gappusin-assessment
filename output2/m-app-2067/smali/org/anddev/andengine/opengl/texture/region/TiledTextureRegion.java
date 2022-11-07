public class org.anddev.andengine.opengl.texture.region.TiledTextureRegion extends org.anddev.andengine.opengl.texture.region.BaseTextureRegion {
	 /* # instance fields */
	 private Integer mCurrentTileColumn;
	 private Integer mCurrentTileRow;
	 private final Integer mTileColumns;
	 private final Integer mTileCount;
	 private final Integer mTileRows;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.region.TiledTextureRegion ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIII)V */
		 /* iput p6, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileColumns:I */
		 /* iput p7, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileRows:I */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileColumns:I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileRows:I */
		 /* mul-int/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileCount:I */
		 /* iput v2, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileColumn:I */
		 /* iput v2, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileRow:I */
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).initTextureBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->initTextureBuffer()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->clone()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.TiledTextureRegion clone ( ) {
		 /* .locals 8 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion; */
		 v1 = this.mTexture;
		 v2 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTexturePositionX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionX()I
		 v3 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTexturePositionY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionY()I
		 v4 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getWidth()I
		 v5 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getHeight()I
		 /* iget v6, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileColumns:I */
		 /* iget v7, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileRows:I */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIIIII)V */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileColumn:I */
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileRow:I */
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).setCurrentTileIndex ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->setCurrentTileIndex(II)V
	 } // .end method
	 public Integer getCurrentTileColumn ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileColumn:I */
	 } // .end method
	 public Integer getCurrentTileIndex ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileRow:I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileColumns:I */
		 /* mul-int/2addr v0, v1 */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileColumn:I */
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 public Integer getCurrentTileRow ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileRow:I */
	 } // .end method
	 public Float getTextureCoordinateX1 ( ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTexturePositionOfCurrentTileX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionOfCurrentTileX()I
		 /* int-to-float v0, v0 */
		 v1 = 		 v1 = this.mTexture;
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Float getTextureCoordinateX2 ( ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTexturePositionOfCurrentTileX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionOfCurrentTileX()I
		 v1 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTileWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileWidth()I
		 /* add-int/2addr v0, v1 */
		 /* int-to-float v0, v0 */
		 v1 = 		 v1 = this.mTexture;
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Float getTextureCoordinateY1 ( ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTexturePositionOfCurrentTileY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionOfCurrentTileY()I
		 /* int-to-float v0, v0 */
		 v1 = 		 v1 = this.mTexture;
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Float getTextureCoordinateY2 ( ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTexturePositionOfCurrentTileY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionOfCurrentTileY()I
		 v1 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTileHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileHeight()I
		 /* add-int/2addr v0, v1 */
		 /* int-to-float v0, v0 */
		 v1 = 		 v1 = this.mTexture;
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public Integer getTextureCropHeight ( ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTileHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileHeight()I
	 } // .end method
	 public Integer getTextureCropLeft ( ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTexturePositionOfCurrentTileX ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionOfCurrentTileX()I
	 } // .end method
	 public Integer getTextureCropTop ( ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTexturePositionOfCurrentTileY ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionOfCurrentTileY()I
	 } // .end method
	 public Integer getTextureCropWidth ( ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTileWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileWidth()I
	 } // .end method
	 public Integer getTexturePositionOfCurrentTileX ( ) {
		 /* .locals 3 */
		 v0 = 		 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTexturePositionX()I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileColumn:I */
		 v2 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTileWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileWidth()I
		 /* mul-int/2addr v1, v2 */
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 public Integer getTexturePositionOfCurrentTileY ( ) {
		 /* .locals 3 */
		 v0 = 		 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTexturePositionY()I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileRow:I */
		 v2 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTileHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileHeight()I
		 /* mul-int/2addr v1, v2 */
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 public Integer getTileCount ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileCount:I */
	 } // .end method
	 public Integer getTileHeight ( ) {
		 /* .locals 2 */
		 v0 = 		 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getHeight()I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileRows:I */
		 /* div-int/2addr v0, v1 */
	 } // .end method
	 public Integer getTileWidth ( ) {
		 /* .locals 2 */
		 v0 = 		 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getWidth()I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileColumns:I */
		 /* div-int/2addr v0, v1 */
	 } // .end method
	 protected void initTextureBuffer ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileRows:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileColumns:I */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->initTextureBuffer()V */
			 } // :cond_0
			 return;
		 } // .end method
		 public void nextTile ( ) {
			 /* .locals 2 */
			 v0 = 			 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getCurrentTileIndex ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getCurrentTileIndex()I
			 /* add-int/lit8 v0, v0, 0x1 */
			 v1 = 			 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).getTileCount ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileCount()I
			 /* rem-int/2addr v0, v1 */
			 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).setCurrentTileIndex ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->setCurrentTileIndex(I)V
			 return;
		 } // .end method
		 public void setCurrentTileIndex ( Integer p0 ) {
			 /* .locals 2 */
			 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileCount:I */
			 /* if-ge p1, v0, :cond_0 */
			 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mTileColumns:I */
			 /* rem-int v1, p1, v0 */
			 /* div-int v0, p1, v0 */
			 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p0 ).setCurrentTileIndex ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->setCurrentTileIndex(II)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setCurrentTileIndex ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileColumn:I */
		 /* if-ne p1, v0, :cond_0 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileRow:I */
		 /* if-eq p2, v0, :cond_1 */
	 } // :cond_0
	 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileColumn:I */
	 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->mCurrentTileRow:I */
	 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->updateTextureRegionBuffer()V */
} // :cond_1
return;
} // .end method
