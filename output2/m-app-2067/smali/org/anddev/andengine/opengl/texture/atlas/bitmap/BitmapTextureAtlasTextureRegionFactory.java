public class org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory {
	 /* # static fields */
	 private static java.lang.String sAssetBasePath;
	 private static Boolean sCreateTextureRegionBuffersManaged;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion createFromAsset ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.content.Context p1, java.lang.String p2, Integer p3, Integer p4 ) {
		 /* .locals 3 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 v2 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v2 );
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, p1, v1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( p0,v0,p3,p4 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion createFromAsset ( org.anddev.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas p0, android.content.Context p1, java.lang.String p2 ) {
		 /* .locals 3 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 v2 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v2 );
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, p1, v1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( p0,v0 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion createFromResource ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.content.Context p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource; */
		 /* invoke-direct {v0, p1, p2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;-><init>(Landroid/content/Context;I)V */
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( p0,v0,p3,p4 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion createFromResource ( org.anddev.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas p0, android.content.Context p1, Integer p2 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource; */
		 /* invoke-direct {v0, p1, p2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;-><init>(Landroid/content/Context;I)V */
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( p0,v0 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion createFromSource ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlasTextureRegionFactory;->sCreateTextureRegionBuffersManaged:Z */
		 org.anddev.andengine.opengl.texture.region.TextureRegionFactory .createFromSource ( p0,p1,p2,p3,v0 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TextureRegion createFromSource ( org.anddev.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas p0, org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource p1 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlasTextureRegionFactory;->sCreateTextureRegionBuffersManaged:Z */
		 org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlasTextureRegionFactory .createFromSource ( p0,p1,v0 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TiledTextureRegion createTiledFromAsset ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.content.Context p1, java.lang.String p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
		 /* .locals 6 */
		 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource; */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 v2 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v2 );
		 /* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v1, p1, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
		 /* move-object v0, p0 */
		 /* move v2, p3 */
		 /* move v3, p4 */
		 /* move v4, p5 */
		 /* move v5, p6 */
		 /* invoke-static/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlasTextureRegionFactory;->createTiledFromSource(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;IIII)Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion; */
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TiledTextureRegion createTiledFromAsset ( org.anddev.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas p0, android.content.Context p1, java.lang.String p2, Integer p3, Integer p4 ) {
		 /* .locals 3 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 v2 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v2 );
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, p1, v1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createTiledFromSource ( p0,v0,p3,p4 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TiledTextureRegion createTiledFromResource ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.content.Context p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
		 /* .locals 6 */
		 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource; */
		 /* invoke-direct {v1, p1, p2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;-><init>(Landroid/content/Context;I)V */
		 /* move-object v0, p0 */
		 /* move v2, p3 */
		 /* move v3, p4 */
		 /* move v4, p5 */
		 /* move v5, p6 */
		 /* invoke-static/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlasTextureRegionFactory;->createTiledFromSource(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;IIII)Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion; */
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TiledTextureRegion createTiledFromResource ( org.anddev.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas p0, android.content.Context p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource; */
		 /* invoke-direct {v0, p1, p2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;-><init>(Landroid/content/Context;I)V */
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createTiledFromSource ( p0,v0,p3,p4 );
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TiledTextureRegion createTiledFromSource ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
		 /* .locals 7 */
		 /* sget-boolean v6, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlasTextureRegionFactory;->sCreateTextureRegionBuffersManaged:Z */
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* invoke-static/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/region/TextureRegionFactory;->createTiledFromSource(Lorg/anddev/andengine/opengl/texture/atlas/ITextureAtlas;Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;IIIIZ)Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion; */
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.region.TiledTextureRegion createTiledFromSource ( org.anddev.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas p0, org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlasTextureRegionFactory;->sCreateTextureRegionBuffersManaged:Z */
		 org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlasTextureRegionFactory .createTiledFromSource ( p0,p1,p2,p3,v0 );
	 } // .end method
	 public static void reset ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .setAssetBasePath ( v0 );
		 int v0 = 0; // const/4 v0, 0x0
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory.sCreateTextureRegionBuffersManaged = (v0!= 0);
		 return;
	 } // .end method
	 public static void setAssetBasePath ( java.lang.String p0 ) {
		 /* .locals 2 */
		 final String v0 = "/"; // const-string v0, "/"
		 v0 = 		 (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_0 */
		 v0 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
	 return;
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "pAssetBasePath must end with \'/\' or be lenght zero."; // const-string v1, "pAssetBasePath must end with \'/\' or be lenght zero."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static void setCreateTextureRegionBuffersManaged ( Boolean p0 ) {
/* .locals 0 */
org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory.sCreateTextureRegionBuffersManaged = (p0!= 0);
return;
} // .end method
