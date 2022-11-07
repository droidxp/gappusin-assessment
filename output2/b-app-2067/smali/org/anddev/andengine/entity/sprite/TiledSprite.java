public class org.anddev.andengine.entity.sprite.TiledSprite extends org.anddev.andengine.entity.sprite.BaseSprite {
	 /* # direct methods */
	 public org.anddev.andengine.entity.sprite.TiledSprite ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/entity/sprite/BaseSprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.sprite.TiledSprite ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p6}, Lorg/anddev/andengine/entity/sprite/BaseSprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.sprite.TiledSprite ( ) {
		 /* .locals 6 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p3 ).getTileWidth ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileWidth()I
		 /* int-to-float v3, v0 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p3 ).getTileHeight ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileHeight()I
		 /* int-to-float v4, v0 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v5, p3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/sprite/BaseSprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.sprite.TiledSprite ( ) {
		 /* .locals 7 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p3 ).getTileWidth ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileWidth()I
		 /* int-to-float v3, v0 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) p3 ).getTileHeight ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTileHeight()I
		 /* int-to-float v4, v0 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v5, p3 */
		 /* move-object v6, p4 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/entity/sprite/BaseSprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getCurrentTileIndex ( ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.sprite.TiledSprite ) p0 ).getTextureRegion ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/TiledSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).getCurrentTileIndex ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getCurrentTileIndex()I
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.BaseTextureRegion getTextureRegion ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.sprite.TiledSprite ) p0 ).getTextureRegion ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/TiledSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.TiledTextureRegion getTextureRegion ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion; */
		 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion; */
	 } // .end method
	 public void nextTile ( ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.sprite.TiledSprite ) p0 ).getTextureRegion ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/TiledSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).nextTile ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->nextTile()V
		 return;
	 } // .end method
	 public void setCurrentTileIndex ( Integer p0 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.sprite.TiledSprite ) p0 ).getTextureRegion ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/TiledSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).setCurrentTileIndex ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->setCurrentTileIndex(I)V
		 return;
	 } // .end method
	 public void setCurrentTileIndex ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.sprite.TiledSprite ) p0 ).getTextureRegion ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/TiledSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).setCurrentTileIndex ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->setCurrentTileIndex(II)V
		 return;
	 } // .end method
