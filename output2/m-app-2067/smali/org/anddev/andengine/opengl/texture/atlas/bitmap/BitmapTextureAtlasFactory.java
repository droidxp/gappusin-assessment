public class org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasFactory {
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasFactory ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas createForTextureAtlasSourceSize ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat p0, org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource p1 ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.DEFAULT;
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasFactory .createForTextureAtlasSourceSize ( p0,p1,v0 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas createForTextureAtlasSourceSize ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat p0, org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource p1, org.anddev.andengine.opengl.texture.TextureOptions p2 ) {
		 v1 = 		 v0 = 		 /* .locals 3 */
		 /* new-instance v2, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas; */
		 v0 = 		 org.anddev.andengine.util.MathUtils .nextPowerOfTwo ( v0 );
		 v1 = 		 org.anddev.andengine.util.MathUtils .nextPowerOfTwo ( v1 );
		 /* invoke-direct {v2, v0, v1, p0, p2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;-><init>(IILorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;)V */
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas createForTextureAtlasSourceSize ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat p0, org.anddev.andengine.opengl.texture.region.TextureRegion p1 ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.DEFAULT;
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasFactory .createForTextureRegionSize ( p0,p1,v0 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas createForTextureRegionSize ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat p0, org.anddev.andengine.opengl.texture.region.TextureRegion p1, org.anddev.andengine.opengl.texture.TextureOptions p2 ) {
		 /* .locals 3 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getWidth()I
		 v1 = 		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getHeight()I
		 /* new-instance v2, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas; */
		 v0 = 		 org.anddev.andengine.util.MathUtils .nextPowerOfTwo ( v0 );
		 v1 = 		 org.anddev.andengine.util.MathUtils .nextPowerOfTwo ( v1 );
		 /* invoke-direct {v2, v0, v1, p0, p2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;-><init>(IILorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;)V */
	 } // .end method
