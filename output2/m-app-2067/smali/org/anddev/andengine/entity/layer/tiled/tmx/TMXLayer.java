public class org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer extends org.anddev.andengine.entity.shape.RectangularShape implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final mCullingVertices;
	 private final Integer mGlobalTileIDsExpected;
	 private final java.lang.String mName;
	 private final org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties mTMXLayerProperties;
	 private final org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap mTMXTiledMap;
	 private final Lorg.anddev.andengine.entity.layer.tiled.tmx.TMXTile mTMXTiles;
	 private final Integer mTileColumns;
	 private final Integer mTileRows;
	 private Integer mTilesAdded;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ( ) {
		 /* .locals 8 */
		 /* const/high16 v7, 0x3f000000 # 0.5f */
		 int v6 = 1; // const/4 v6, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 /* move-object v0, p0 */
		 /* move v2, v1 */
		 /* move v3, v1 */
		 /* move v4, v1 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/shape/RectangularShape;-><init>(FFFFLorg/anddev/andengine/opengl/vertex/VertexBuffer;)V */
		 /* const/16 v0, 0x8 */
		 /* new-array v0, v0, [F */
		 this.mCullingVertices = v0;
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;-><init>()V */
		 this.mTMXLayerProperties = v0;
		 this.mTMXTiledMap = p1;
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "name"; // const-string v1, "name"
		 this.mName = v0;
		 final String v0 = "width"; // const-string v0, "width"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p2,v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileColumns:I */
		 final String v0 = "height"; // const-string v0, "height"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p2,v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileRows:I */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileRows:I */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileColumns:I */
		 /* filled-new-array {v0, v1}, [I */
		 /* const-class v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile; */
		 java.lang.reflect.Array .newInstance ( v1,v0 );
		 /* check-cast v0, [[Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile; */
		 this.mTMXTiles = v0;
		 v0 = 		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) p1 ).getTileWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTileWidth()I
		 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileColumns:I */
		 /* mul-int/2addr v0, v1 */
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseWidth:F */
		 v1 = 		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) p1 ).getTileHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTileHeight()I
		 /* iget v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileRows:I */
		 /* mul-int/2addr v1, v2 */
		 /* int-to-float v1, v1 */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
		 /* iput v1, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseHeight:F */
		 /* mul-float/2addr v0, v7 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mRotationCenterX:F */
		 /* mul-float v0, v1, v7 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mRotationCenterY:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mRotationCenterX:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mScaleCenterX:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mRotationCenterY:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mScaleCenterY:F */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileColumns:I */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileRows:I */
		 /* mul-int/2addr v0, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mGlobalTileIDsExpected:I */
		 final String v0 = "visible"; // const-string v0, "visible"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttribute ( p2,v0,v6 );
		 /* if-ne v0, v6, :cond_0 */
		 /* move v0, v6 */
	 } // :goto_0
	 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) p0 ).setVisible ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->setVisible(Z)V
	 final String v0 = "opacity"; // const-string v0, "opacity"
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 v0 = 	 org.anddev.andengine.util.SAXUtils .getFloatAttribute ( p2,v0,v1 );
	 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) p0 ).setAlpha ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->setAlpha(F)V
	 return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void addTileByGlobalTileID ( Integer p0, org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader$ITMXTilePropertiesListener p1 ) {
/* .locals 9 */
v7 = this.mTMXTiledMap;
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileColumns:I */
/* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTilesAdded:I */
/* rem-int v2, v1, v0 */
/* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTilesAdded:I */
/* div-int v3, v1, v0 */
v8 = this.mTMXTiles;
/* if-nez p1, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* move-object v6, v0 */
} // :goto_0
/* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile; */
v1 = this.mTMXTiledMap;
v4 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v1 ).getTileWidth ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTileWidth()I
v1 = this.mTMXTiledMap;
v5 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v1 ).getTileHeight ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTileHeight()I
/* move v1, p1 */
/* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTile;-><init>(IIIIILorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
/* aget-object v1, v8, v3 */
/* aput-object v0, v1, v2 */
if ( p1 != null) { // if-eqz p1, :cond_0
if ( p2 != null) { // if-eqz p2, :cond_0
	 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v7 ).getTMXTileProperties ( p1 ); // invoke-virtual {v7, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXTileProperties(I)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;
	 if ( v1 != null) { // if-eqz v1, :cond_0
	 } // :cond_0
	 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTilesAdded:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTilesAdded:I */
	 return;
} // :cond_1
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v7 ).getTextureRegionFromGlobalTileID ( p1 ); // invoke-virtual {v7, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTextureRegionFromGlobalTileID(I)Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
/* move-object v6, v0 */
} // .end method
private Integer readGlobalTileID ( java.io.DataInputStream p0 ) {
/* .locals 4 */
v0 = (( java.io.DataInputStream ) p1 ).read ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I
v1 = (( java.io.DataInputStream ) p1 ).read ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I
v2 = (( java.io.DataInputStream ) p1 ).read ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I
v3 = (( java.io.DataInputStream ) p1 ).read ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I
/* if-ltz v0, :cond_0 */
/* if-ltz v1, :cond_0 */
/* if-ltz v2, :cond_0 */
/* if-gez v3, :cond_1 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Couldn\'t read global Tile ID."; // const-string v1, "Couldn\'t read global Tile ID."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* shl-int/lit8 v1, v1, 0x8 */
/* or-int/2addr v0, v1 */
/* shl-int/lit8 v1, v2, 0x10 */
/* or-int/2addr v0, v1 */
/* shl-int/lit8 v1, v3, 0x18 */
/* or-int/2addr v0, v1 */
} // .end method
/* # virtual methods */
public void addTMXLayerProperty ( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayerProperty p0 ) {
/* .locals 1 */
v0 = this.mTMXLayerProperties;
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;->add(Ljava/lang/Object;)Z
return;
} // .end method
protected void drawVertices ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 20 */
/* move-object/from16 v0, p0 */
v0 = this.mTMXTiles;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileColumns:I */
/* move v5, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileRows:I */
/* move v6, v0 */
/* move-object/from16 v0, p0 */
v0 = this.mTMXTiledMap;
/* move-object v7, v0 */
v7 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v7 ).getTileWidth ( ); // invoke-virtual {v7}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTileWidth()I
/* move-object/from16 v0, p0 */
v0 = this.mTMXTiledMap;
/* move-object v8, v0 */
v8 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v8 ).getTileHeight ( ); // invoke-virtual {v8}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTileHeight()I
/* int-to-float v9, v7 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mScaleX:F */
/* move v10, v0 */
/* mul-float/2addr v9, v10 */
/* int-to-float v10, v8 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mScaleY:F */
/* move v11, v0 */
/* mul-float/2addr v10, v11 */
/* move-object/from16 v0, p0 */
v0 = this.mCullingVertices;
/* move-object v11, v0 */
/* move-object/from16 v0, p0 */
/* move-object v1, v11 */
org.anddev.andengine.collision.RectangularShapeCollisionChecker .fillVertices ( v0,v1 );
int v12 = 0; // const/4 v12, 0x0
/* aget v12, v11, v12 */
int v13 = 1; // const/4 v13, 0x1
/* aget v11, v11, v13 */
v13 = /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/engine/camera/Camera;->getMinX()F */
v14 = /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/engine/camera/Camera;->getMinY()F */
v15 = /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/engine/camera/Camera;->getWidth()F */
v16 = /* invoke-virtual/range {p2 ..p2}, Lorg/anddev/andengine/engine/camera/Camera;->getHeight()F */
/* sub-float v12, v13, v12 */
/* div-float/2addr v12, v9 */
int v13 = 0; // const/4 v13, 0x0
/* const/16 v17, 0x1 */
/* sub-int v17, v5, v17 */
/* move v0, v12 */
/* float-to-double v0, v0 */
/* move-wide/from16 v18, v0 */
/* invoke-static/range {v18 ..v19}, Ljava/lang/Math;->floor(D)D */
/* move-result-wide v18 */
/* move-wide/from16 v0, v18 */
/* double-to-int v0, v0 */
/* move/from16 v18, v0 */
/* move v0, v13 */
/* move/from16 v1, v17 */
/* move/from16 v2, v18 */
v13 = org.anddev.andengine.util.MathUtils .bringToBounds ( v0,v1,v2 );
/* const/16 v17, 0x0 */
/* const/16 v18, 0x1 */
/* sub-int v5, v5, v18 */
/* div-float v9, v15, v9 */
/* add-float/2addr v9, v12 */
/* move v0, v9 */
/* float-to-double v0, v0 */
/* move-wide/from16 v18, v0 */
/* invoke-static/range {v18 ..v19}, Ljava/lang/Math;->ceil(D)D */
/* move-result-wide v18 */
/* move-wide/from16 v0, v18 */
/* double-to-int v0, v0 */
/* move v9, v0 */
/* move/from16 v0, v17 */
/* move v1, v5 */
/* move v2, v9 */
v5 = org.anddev.andengine.util.MathUtils .bringToBounds ( v0,v1,v2 );
/* sub-float v9, v14, v11 */
/* div-float/2addr v9, v10 */
int v11 = 0; // const/4 v11, 0x0
int v12 = 1; // const/4 v12, 0x1
/* sub-int v12, v6, v12 */
/* float-to-double v14, v9 */
java.lang.Math .floor ( v14,v15 );
/* move-result-wide v14 */
/* double-to-int v14, v14 */
v11 = org.anddev.andengine.util.MathUtils .bringToBounds ( v11,v12,v14 );
int v12 = 0; // const/4 v12, 0x0
int v14 = 1; // const/4 v14, 0x1
/* sub-int/2addr v6, v14 */
/* div-float v10, v16, v10 */
/* add-float/2addr v9, v10 */
/* float-to-double v9, v9 */
java.lang.Math .floor ( v9,v10 );
/* move-result-wide v9 */
/* double-to-int v9, v9 */
v6 = org.anddev.andengine.util.MathUtils .bringToBounds ( v12,v6,v9 );
/* sub-int v9, v5, v13 */
/* add-int/lit8 v9, v9, 0x1 */
/* mul-int/2addr v9, v7 */
/* mul-int v10, v13, v7 */
/* int-to-float v10, v10 */
/* mul-int v12, v11, v8 */
/* int-to-float v12, v12 */
int v14 = 0; // const/4 v14, 0x0
/* move-object/from16 v0, p1 */
/* move v1, v10 */
/* move v2, v12 */
/* move v3, v14 */
/* move v10, v11 */
} // :goto_0
/* if-le v10, v6, :cond_0 */
/* invoke-interface/range {p1 ..p1}, Ljavax/microedition/khronos/opengles/GL10;->glLoadIdentity()V */
return;
} // :cond_0
/* aget-object v11, v4, v10 */
/* move v12, v13 */
} // :goto_1
/* if-le v12, v5, :cond_1 */
/* neg-int v11, v9 */
/* int-to-float v11, v11 */
/* int-to-float v12, v8 */
int v14 = 0; // const/4 v14, 0x0
/* move-object/from16 v0, p1 */
/* move v1, v11 */
/* move v2, v12 */
/* move v3, v14 */
/* add-int/lit8 v10, v10, 0x1 */
} // :cond_1
/* aget-object v14, v11, v12 */
v14 = this.mTextureRegion;
if ( v14 != null) { // if-eqz v14, :cond_2
/* move-object v0, v14 */
/* move-object/from16 v1, p1 */
(( org.anddev.andengine.opengl.texture.region.TextureRegion ) v0 ).onApply ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->onApply(Ljavax/microedition/khronos/opengles/GL10;)V
int v14 = 5; // const/4 v14, 0x5
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x4 */
/* move-object/from16 v0, p1 */
/* move v1, v14 */
/* move v2, v15 */
/* move/from16 v3, v16 */
} // :cond_2
/* int-to-float v14, v7 */
int v15 = 0; // const/4 v15, 0x0
/* const/16 v16, 0x0 */
/* move-object/from16 v0, p1 */
/* move v1, v14 */
/* move v2, v15 */
/* move/from16 v3, v16 */
/* add-int/lit8 v12, v12, 0x1 */
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
v0 = this.mName;
} // .end method
public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties getTMXLayerProperties ( ) {
/* .locals 1 */
v0 = this.mTMXLayerProperties;
} // .end method
public org.anddev.andengine.entity.layer.tiled.tmx.TMXTile getTMXTile ( Integer p0, Integer p1 ) {
/* .locals 1 */
v0 = this.mTMXTiles;
/* aget-object v0, v0, p2 */
/* aget-object v0, v0, p1 */
} // .end method
public org.anddev.andengine.entity.layer.tiled.tmx.TMXTile getTMXTileAt ( Float p0, Float p1 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
int v4 = 1; // const/4 v4, 0x1
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) p0 ).convertSceneToLocalCoordinates ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->convertSceneToLocalCoordinates(FF)[F
v1 = this.mTMXTiledMap;
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v0, v2 */
v3 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v1 ).getTileWidth ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTileWidth()I
/* int-to-float v3, v3 */
/* div-float/2addr v2, v3 */
/* float-to-int v2, v2 */
/* if-ltz v2, :cond_0 */
/* iget v3, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileColumns:I */
/* sub-int/2addr v3, v4 */
/* if-le v2, v3, :cond_1 */
} // :cond_0
/* move-object v0, v5 */
} // :goto_0
} // :cond_1
/* aget v0, v0, v4 */
v1 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v1 ).getTileWidth ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTileWidth()I
/* int-to-float v1, v1 */
/* div-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* if-ltz v0, :cond_2 */
/* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileRows:I */
/* sub-int/2addr v1, v4 */
/* if-le v0, v1, :cond_3 */
} // :cond_2
/* move-object v0, v5 */
} // :cond_3
v1 = this.mTMXTiles;
/* aget-object v0, v1, v0 */
/* aget-object v0, v0, v2 */
} // .end method
public Lorg.anddev.andengine.entity.layer.tiled.tmx.TMXTile getTMXTiles ( ) {
/* .locals 1 */
v0 = this.mTMXTiles;
} // .end method
public Integer getTileColumns ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileColumns:I */
} // .end method
public Integer getTileRows ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTileRows:I */
} // .end method
void initializeTMXTileFromXML ( org.xml.sax.Attributes p0, org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader$ITMXTilePropertiesListener p1 ) {
/* .locals 1 */
final String v0 = "gid"; // const-string v0, "gid"
v0 = org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
/* invoke-direct {p0, v0, p2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->addTileByGlobalTileID(ILorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader$ITMXTilePropertiesListener;)V */
return;
} // .end method
void initializeTMXTilesFromDataString ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader$ITMXTilePropertiesListener p3 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* new-instance v1, Ljava/io/ByteArrayInputStream; */
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
(( java.lang.String ) p1 ).getBytes ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
if ( p2 != null) { // if-eqz p2, :cond_0
final String v2 = "base64"; // const-string v2, "base64"
v2 = (( java.lang.String ) p2 ).equals ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* new-instance v2, Lorg/anddev/andengine/util/Base64InputStream; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v1, v3}, Lorg/anddev/andengine/util/Base64InputStream;-><init>(Ljava/io/InputStream;I)V */
/* move-object v1, v2 */
} // :cond_0
if ( p3 != null) { // if-eqz p3, :cond_1
final String v2 = "gzip"; // const-string v2, "gzip"
v2 = (( java.lang.String ) p3 ).equals ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* new-instance v2, Ljava/util/zip/GZIPInputStream; */
/* invoke-direct {v2, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V */
/* move-object v1, v2 */
} // :cond_1
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
try { // :try_start_1
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mTilesAdded:I */
/* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->mGlobalTileIDsExpected:I */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* if-lt v0, v1, :cond_3 */
org.anddev.andengine.util.StreamUtils .close ( v2 );
return;
} // :cond_2
try { // :try_start_2
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Supplied compression \'"; // const-string v3, "Supplied compression \'"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p3 ); // invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "\' is not supported yet."; // const-string v3, "\' is not supported yet."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* :catchall_0 */
/* move-exception v1 */
/* move-object v4, v1 */
/* move-object v1, v0 */
/* move-object v0, v4 */
} // :goto_1
org.anddev.andengine.util.StreamUtils .close ( v1 );
/* throw v0 */
} // :cond_3
try { // :try_start_3
v0 = /* invoke-direct {p0, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->readGlobalTileID(Ljava/io/DataInputStream;)I */
/* invoke-direct {p0, v0, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->addTileByGlobalTileID(ILorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader$ITMXTilePropertiesListener;)V */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end method
protected void onApplyVertices ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_VERTEXBUFFEROBJECTS:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Ljavax/microedition/khronos/opengles/GL11; */
v0 = this.mTMXTiledMap;
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getSharedVertexBuffer ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getSharedVertexBuffer()Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;
(( org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ) v0 ).selectOnHardware ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;->selectOnHardware(Ljavax/microedition/khronos/opengles/GL11;)V
org.anddev.andengine.opengl.util.GLHelper .vertexZeroPointer ( p1 );
} // :goto_0
return;
} // :cond_0
v0 = this.mTMXTiledMap;
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getSharedVertexBuffer ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getSharedVertexBuffer()Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;
(( org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ) v0 ).getFloatBuffer ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;->getFloatBuffer()Lorg/anddev/andengine/opengl/util/FastFloatBuffer;
org.anddev.andengine.opengl.util.GLHelper .vertexPointer ( p1,v0 );
} // .end method
protected void onInitDraw ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/shape/RectangularShape;->onInitDraw(Ljavax/microedition/khronos/opengles/GL10;)V */
org.anddev.andengine.opengl.util.GLHelper .enableTextures ( p1 );
org.anddev.andengine.opengl.util.GLHelper .enableTexCoordArray ( p1 );
return;
} // .end method
protected void onManagedUpdate ( Float p0 ) {
/* .locals 0 */
return;
} // .end method
protected void onUpdateVertexBuffer ( ) {
/* .locals 0 */
return;
} // .end method
public void setRotation ( Float p0 ) {
/* .locals 0 */
return;
} // .end method
