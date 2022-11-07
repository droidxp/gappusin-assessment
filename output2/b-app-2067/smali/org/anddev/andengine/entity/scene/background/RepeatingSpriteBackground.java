public class org.anddev.andengine.entity.scene.background.RepeatingSpriteBackground extends org.anddev.andengine.entity.scene.background.SpriteBackground {
	 /* # instance fields */
	 private org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas mBitmapTextureAtlas;
	 private final Float mScale;
	 /* # direct methods */
	 public org.anddev.andengine.entity.scene.background.RepeatingSpriteBackground ( ) {
		 /* .locals 6 */
		 /* const/high16 v5, 0x3f800000 # 1.0f */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/scene/background/RepeatingSpriteBackground;-><init>(FFLorg/anddev/andengine/opengl/texture/TextureManager;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;F)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.background.RepeatingSpriteBackground ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/entity/scene/background/SpriteBackground;-><init>(Lorg/anddev/andengine/entity/sprite/BaseSprite;)V */
		 /* iput p5, p0, Lorg/anddev/andengine/entity/scene/background/RepeatingSpriteBackground;->mScale:F */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/scene/background/RepeatingSpriteBackground;->loadSprite(FFLorg/anddev/andengine/opengl/texture/TextureManager;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;)Lorg/anddev/andengine/entity/sprite/Sprite; */
		 this.mEntity = v0;
		 return;
	 } // .end method
	 private org.anddev.andengine.entity.sprite.Sprite loadSprite ( Float p0, Float p1, org.anddev.andengine.opengl.texture.TextureManager p2, org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource p3 ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 v3 = 		 v2 = 		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas; */
		 v4 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.RGBA_8888;
		 v5 = org.anddev.andengine.opengl.texture.TextureOptions.REPEATING_NEAREST_PREMULTIPLYALPHA;
		 /* invoke-direct {v0, v2, v3, v4, v5}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;-><init>(IILorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;)V */
		 this.mBitmapTextureAtlas = v0;
		 v0 = this.mBitmapTextureAtlas;
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( v0,p4,v6,v6 );
		 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/background/RepeatingSpriteBackground;->mScale:F */
		 /* div-float v0, p1, v0 */
		 v2 = 		 java.lang.Math .round ( v0 );
		 /* iget v0, p0, Lorg/anddev/andengine/entity/scene/background/RepeatingSpriteBackground;->mScale:F */
		 /* div-float v0, p2, v0 */
		 v4 = 		 java.lang.Math .round ( v0 );
		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v5 ).setWidth ( v2 ); // invoke-virtual {v5, v2}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->setWidth(I)V
		 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v5 ).setHeight ( v4 ); // invoke-virtual {v5, v4}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->setHeight(I)V
		 v0 = this.mBitmapTextureAtlas;
		 (( org.anddev.andengine.opengl.texture.TextureManager ) p3 ).loadTexture ( v0 ); // invoke-virtual {p3, v0}, Lorg/anddev/andengine/opengl/texture/TextureManager;->loadTexture(Lorg/anddev/andengine/opengl/texture/ITexture;)Z
		 /* new-instance v0, Lorg/anddev/andengine/entity/sprite/Sprite; */
		 /* int-to-float v3, v2 */
		 /* int-to-float v4, v4 */
		 /* move v2, v1 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/sprite/Sprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).setScaleCenter ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Lorg/anddev/andengine/entity/sprite/Sprite;->setScaleCenter(FF)V
		 /* iget v1, p0, Lorg/anddev/andengine/entity/scene/background/RepeatingSpriteBackground;->mScale:F */
		 (( org.anddev.andengine.entity.sprite.Sprite ) v0 ).setScale ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/sprite/Sprite;->setScale(F)V
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas getBitmapTextureAtlas ( ) {
		 /* .locals 1 */
		 v0 = this.mBitmapTextureAtlas;
	 } // .end method
