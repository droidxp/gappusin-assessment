public class org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlasTextureRegionFactory {
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlasTextureRegionFactory ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion createFromSource ( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas p0, org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p1, Boolean p2 ) {
		 /* .locals 6 */
		 int v2 = 0; // const/4 v2, 0x0
		 v5 = 		 v4 = 		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion; */
		 /* move-object v1, p0 */
		 /* move v3, v2 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIII)V */
		 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlasTextureRegionFactory$1; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlasTextureRegionFactory$1;-><init>(Lorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas ) p0 ).addTextureAtlasSource ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas;->addTextureAtlasSource(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;Lorg/anddev/andengine/util/Callback;)V
		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v0 ).setTextureRegionBufferManaged ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->setTextureRegionBufferManaged(Z)V
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TiledTextureRegion createTiledFromSource ( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas p0, org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p1, Integer p2, Integer p3, Boolean p4 ) {
		 /* .locals 8 */
		 int v2 = 0; // const/4 v2, 0x0
		 v5 = 		 v4 = 		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion; */
		 /* move-object v1, p0 */
		 /* move v3, v2 */
		 /* move v6, p2 */
		 /* move v7, p3 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIIIII)V */
		 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlasTextureRegionFactory$2; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlasTextureRegionFactory$2;-><init>(Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;)V */
		 (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas ) p0 ).addTextureAtlasSource ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas;->addTextureAtlasSource(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;Lorg/anddev/andengine/util/Callback;)V
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).setTextureRegionBufferManaged ( p4 ); // invoke-virtual {v0, p4}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->setTextureRegionBufferManaged(Z)V
	 } // .end method
