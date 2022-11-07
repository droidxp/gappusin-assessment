public class org.anddev.andengine.entity.layer.tiled.tmx.TMXTile {
	 /* # instance fields */
	 Integer mGlobalTileID;
	 org.anddev.andengine.opengl.texture.region.TextureRegion mTextureRegion;
	 private final Integer mTileColumn;
	 private final Integer mTileHeight;
	 private final Integer mTileRow;
	 private final Integer mTileWidth;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXTile ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mGlobalTileID:I */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileRow:I */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileColumn:I */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileWidth:I */
		 /* iput p5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileHeight:I */
		 this.mTextureRegion = p6;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getGlobalTileID ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mGlobalTileID:I */
	 } // .end method
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties getTMXTileProperties ( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mGlobalTileID:I */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) p1 ).getTMXTileProperties ( v0 ); // invoke-virtual {p1, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXTileProperties(I)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.TextureRegion getTextureRegion ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegion;
	 } // .end method
	 public Integer getTileColumn ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileColumn:I */
	 } // .end method
	 public Integer getTileHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileHeight:I */
	 } // .end method
	 public Integer getTileRow ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileRow:I */
	 } // .end method
	 public Integer getTileWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileWidth:I */
	 } // .end method
	 public Integer getTileX ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileColumn:I */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileWidth:I */
		 /* mul-int/2addr v0, v1 */
	 } // .end method
	 public Integer getTileY ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileRow:I */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mTileHeight:I */
		 /* mul-int/2addr v0, v1 */
	 } // .end method
	 public void setGlobalTileID ( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap p0, Integer p1 ) {
		 /* .locals 1 */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;->mGlobalTileID:I */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) p1 ).getTextureRegionFromGlobalTileID ( p2 ); // invoke-virtual {p1, p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTextureRegionFromGlobalTileID(I)Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
		 this.mTextureRegion = v0;
		 return;
	 } // .end method
	 public void setTextureRegion ( org.anddev.andengine.opengl.texture.region.TextureRegion p0 ) {
		 /* .locals 0 */
		 this.mTextureRegion = p1;
		 return;
	 } // .end method
