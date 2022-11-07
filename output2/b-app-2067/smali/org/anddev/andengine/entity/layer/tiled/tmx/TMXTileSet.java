public class org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas mBitmapTextureAtlas;
	 private final Integer mFirstGlobalTileID;
	 private java.lang.String mImageSource;
	 private final Integer mMargin;
	 private final java.lang.String mName;
	 private final Integer mSpacing;
	 private final android.util.SparseArray mTMXTileProperties;
	 private final org.anddev.andengine.opengl.texture.TextureOptions mTextureOptions;
	 private final Integer mTileHeight;
	 private final Integer mTileWidth;
	 private Integer mTilesHorizontal;
	 private Integer mTilesVertical;
	 /* # direct methods */
	 org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mTMXTileProperties = v0;
		 /* iput p1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mFirstGlobalTileID:I */
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "name"; // const-string v1, "name"
		 this.mName = v0;
		 final String v0 = "tilewidth"; // const-string v0, "tilewidth"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p2,v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileWidth:I */
		 final String v0 = "tileheight"; // const-string v0, "tileheight"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p2,v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileHeight:I */
		 final String v0 = "spacing"; // const-string v0, "spacing"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttribute ( p2,v0,v2 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mSpacing:I */
		 final String v0 = "margin"; // const-string v0, "margin"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttribute ( p2,v0,v2 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mMargin:I */
		 this.mTextureOptions = p3;
		 return;
	 } // .end method
	 org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ( ) {
		 /* .locals 2 */
		 final String v0 = "firstgid"; // const-string v0, "firstgid"
		 int v1 = 1; // const/4 v1, 0x1
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttribute ( p1,v0,v1 );
		 /* invoke-direct {p0, v0, p1, p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;-><init>(ILorg/xml/sax/Attributes;Lorg/anddev/andengine/opengl/texture/TextureOptions;)V */
		 return;
	 } // .end method
	 private static Integer determineCount ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* mul-int/lit8 v1, p2, 0x2 */
		 /* sub-int v1, p0, v1 */
	 } // :goto_0
	 /* if-gtz v1, :cond_0 */
} // :cond_0
/* sub-int/2addr v1, p1 */
/* sub-int/2addr v1, p3 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
/* # virtual methods */
public void addTMXTileProperty ( Integer p0, org.anddev.andengine.entity.layer.tiled.tmx.TMXTileProperty p1 ) {
/* .locals 2 */
v0 = this.mTMXTileProperties;
(( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ) v0 ).add ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;->add(Ljava/lang/Object;)Z
} // :goto_0
return;
} // :cond_0
/* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
/* invoke-direct {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;-><init>()V */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ) v0 ).add ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;->add(Ljava/lang/Object;)Z
v1 = this.mTMXTileProperties;
(( android.util.SparseArray ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
} // .end method
public org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas getBitmapTextureAtlas ( ) {
/* .locals 1 */
v0 = this.mBitmapTextureAtlas;
} // .end method
public final Integer getFirstGlobalTileID ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mFirstGlobalTileID:I */
} // .end method
public java.lang.String getImageSource ( ) {
/* .locals 1 */
v0 = this.mImageSource;
} // .end method
public final java.lang.String getName ( ) {
/* .locals 1 */
v0 = this.mName;
} // .end method
public android.util.SparseArray getTMXTileProperties ( ) {
/* .locals 1 */
v0 = this.mTMXTileProperties;
} // .end method
public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties getTMXTilePropertiesFromGlobalTileID ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mFirstGlobalTileID:I */
/* sub-int v0, p1, v0 */
v1 = this.mTMXTileProperties;
(( android.util.SparseArray ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
} // .end method
public org.anddev.andengine.opengl.texture.region.TextureRegion getTextureRegionFromGlobalTileID ( Integer p0 ) {
/* .locals 6 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mFirstGlobalTileID:I */
/* sub-int v0, p1, v0 */
/* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTilesHorizontal:I */
/* rem-int v1, v0, v1 */
/* iget v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTilesHorizontal:I */
/* div-int/2addr v0, v2 */
/* iget v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mMargin:I */
/* iget v3, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mSpacing:I */
/* iget v4, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileWidth:I */
/* add-int/2addr v3, v4 */
/* mul-int/2addr v1, v3 */
/* add-int/2addr v2, v1 */
/* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mMargin:I */
/* iget v3, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mSpacing:I */
/* iget v4, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileHeight:I */
/* add-int/2addr v3, v4 */
/* mul-int/2addr v0, v3 */
/* add-int v3, v1, v0 */
/* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion; */
v1 = this.mBitmapTextureAtlas;
/* iget v4, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileWidth:I */
/* iget v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileHeight:I */
/* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;-><init>(Lorg/anddev/andengine/opengl/texture/ITexture;IIII)V */
} // .end method
public final Integer getTileHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileHeight:I */
} // .end method
public final Integer getTileWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileWidth:I */
} // .end method
public void setImageSource ( android.content.Context p0, org.anddev.andengine.opengl.texture.TextureManager p1, org.xml.sax.Attributes p2 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
final String v0 = ""; // const-string v0, ""
final String v1 = "source"; // const-string v1, "source"
this.mImageSource = v0;
/* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource; */
v1 = this.mImageSource;
/* invoke-direct {v0, p1, v1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
v1 = (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.AssetBitmapTextureAtlasSource ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource;->getWidth()I
/* iget v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileWidth:I */
/* iget v3, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mMargin:I */
/* iget v4, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mSpacing:I */
v1 = org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet .determineCount ( v1,v2,v3,v4 );
/* iput v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTilesHorizontal:I */
v1 = (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.AssetBitmapTextureAtlasSource ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource;->getHeight()I
/* iget v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTileHeight:I */
/* iget v3, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mMargin:I */
/* iget v4, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mSpacing:I */
v1 = org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet .determineCount ( v1,v2,v3,v4 );
/* iput v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->mTilesVertical:I */
v1 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.RGBA_8888;
v2 = this.mTextureOptions;
org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasFactory .createForTextureAtlasSourceSize ( v1,v0,v2 );
this.mBitmapTextureAtlas = v1;
final String v1 = "trans"; // const-string v1, "trans"
int v2 = 0; // const/4 v2, 0x0
org.anddev.andengine.util.SAXUtils .getAttribute ( p3,v1,v2 );
/* if-nez v1, :cond_0 */
v1 = this.mBitmapTextureAtlas;
org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( v1,v0,v5,v5 );
} // :goto_0
v0 = this.mBitmapTextureAtlas;
(( org.anddev.andengine.opengl.texture.TextureManager ) p2 ).loadTexture ( v0 ); // invoke-virtual {p2, v0}, Lorg/anddev/andengine/opengl/texture/TextureManager;->loadTexture(Lorg/anddev/andengine/opengl/texture/ITexture;)Z
return;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
try { // :try_start_0
v2 = (( java.lang.String ) v1 ).charAt ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x23 */
/* if-ne v2, v3, :cond_1 */
/* move-object v2, v1 */
} // :goto_1
v2 = android.graphics.Color .parseColor ( v2 );
v3 = this.mBitmapTextureAtlas;
/* new-instance v4, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorKeyBitmapTextureAtlasSourceDecorator; */
org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.RectangleBitmapTextureAtlasSourceDecoratorShape .getDefaultInstance ( );
/* invoke-direct {v4, v0, v5, v2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorKeyBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;I)V */
int v0 = 0; // const/4 v0, 0x0
int v2 = 0; // const/4 v2, 0x0
org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( v3,v4,v0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v2, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXParseException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Illegal value: \'"; // const-string v4, "Illegal value: \'"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "\' for attribute \'trans\' supplied!"; // const-string v3, "\' for attribute \'trans\' supplied!"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v1, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXParseException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw v2 */
} // :cond_1
try { // :try_start_1
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "#"; // const-string v3, "#"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
