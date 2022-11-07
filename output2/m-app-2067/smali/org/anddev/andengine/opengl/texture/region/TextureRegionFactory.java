public class org.anddev.andengine.opengl.texture.region.TextureRegionFactory {
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.region.TextureRegionFactory ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion createFromSource ( org.anddev.andengine.opengl.texture.atlas.ITextureAtlas p0, org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p1, Integer p2, Integer p3, Boolean p4 ) {
		 /* .locals 6 */
		 v5 = 		 v4 = 		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion; */
		 /* move-object v1, p0 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIII)V */
		 v1 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v0 ).getTexturePositionX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getTexturePositionX()I
		 v2 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v0 ).getTexturePositionY ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getTexturePositionY()I
		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v0 ).setTextureRegionBufferManaged ( p4 ); // invoke-virtual {v0, p4}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->setTextureRegionBufferManaged(Z)V
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TiledTextureRegion createTiledFromSource ( org.anddev.andengine.opengl.texture.atlas.ITextureAtlas p0, org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p1, Integer p2, Integer p3, Integer p4, Integer p5, Boolean p6 ) {
		 /* .locals 8 */
		 v5 = 		 v4 = 		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion; */
		 /* move-object v1, p0 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v6, p4 */
		 /* move v7, p5 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIIIII)V */
		 v1 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).getTexturePositionX ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionX()I
		 v2 = 		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).getTexturePositionY ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->getTexturePositionY()I
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).setTextureRegionBufferManaged ( p6 ); // invoke-virtual {v0, p6}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->setTextureRegionBufferManaged(Z)V
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion extractFromTexture ( org.anddev.andengine.opengl.texture.ITexture p0, Integer p1, Integer p2, Integer p3, Integer p4, Boolean p5 ) {
		 /* .locals 6 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion; */
		 /* move-object v1, p0 */
		 /* move v2, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIII)V */
		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v0 ).setTextureRegionBufferManaged ( p5 ); // invoke-virtual {v0, p5}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->setTextureRegionBufferManaged(Z)V
	 } // .end method
