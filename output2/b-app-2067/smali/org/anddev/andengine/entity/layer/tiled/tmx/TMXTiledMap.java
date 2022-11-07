public class org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final android.util.SparseArray mGlobalTileIDToTMXTilePropertiesCache;
	 private final android.util.SparseArray mGlobalTileIDToTextureRegionCache;
	 private final java.lang.String mOrientation;
	 private final org.anddev.andengine.opengl.vertex.RectangleVertexBuffer mSharedVertexBuffer;
	 private final java.util.ArrayList mTMXLayers;
	 private final java.util.ArrayList mTMXObjectGroups;
	 private final java.util.ArrayList mTMXTileSets;
	 private final org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties mTMXTiledMapProperties;
	 private final Integer mTileColumns;
	 private final Integer mTileHeight;
	 private final Integer mTileWidth;
	 private final Integer mTilesRows;
	 /* # direct methods */
	 org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTMXTileSets = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTMXLayers = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTMXObjectGroups = v0;
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mGlobalTileIDToTextureRegionCache = v0;
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mGlobalTileIDToTMXTilePropertiesCache = v0;
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;-><init>()V */
		 this.mTMXTiledMapProperties = v0;
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "orientation"; // const-string v1, "orientation"
		 this.mOrientation = v0;
		 v0 = this.mOrientation;
		 final String v1 = "orthogonal"; // const-string v1, "orthogonal"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "orientation: \'"; // const-string v2, "orientation: \'"
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v2 = this.mOrientation;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "\' is not supported."; // const-string v2, "\' is not supported."
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 final String v0 = "width"; // const-string v0, "width"
	 v0 = 	 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
	 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileColumns:I */
	 final String v0 = "height"; // const-string v0, "height"
	 v0 = 	 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
	 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTilesRows:I */
	 final String v0 = "tilewidth"; // const-string v0, "tilewidth"
	 v0 = 	 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
	 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileWidth:I */
	 final String v0 = "tileheight"; // const-string v0, "tileheight"
	 v0 = 	 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
	 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileHeight:I */
	 /* new-instance v0, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer; */
	 /* const v1, 0x88e4 */
	 int v2 = 1; // const/4 v2, 0x1
	 /* invoke-direct {v0, v1, v2}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;-><init>(IZ)V */
	 this.mSharedVertexBuffer = v0;
	 v0 = this.mSharedVertexBuffer;
	 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileWidth:I */
	 /* int-to-float v1, v1 */
	 /* iget v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileHeight:I */
	 /* int-to-float v2, v2 */
	 (( org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ) v0 ).update ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;->update(FF)V
	 return;
} // .end method
/* # virtual methods */
void addTMXLayer ( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer p0 ) {
	 /* .locals 1 */
	 v0 = this.mTMXLayers;
	 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 return;
} // .end method
void addTMXObjectGroup ( org.anddev.andengine.entity.layer.tiled.tmx.TMXObjectGroup p0 ) {
	 /* .locals 1 */
	 v0 = this.mTMXObjectGroups;
	 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 return;
} // .end method
void addTMXTileSet ( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet p0 ) {
	 /* .locals 1 */
	 v0 = this.mTMXTileSets;
	 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 return;
} // .end method
public void addTMXTiledMapProperty ( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMapProperty p0 ) {
	 /* .locals 1 */
	 v0 = this.mTMXTiledMapProperties;
	 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;->add(Ljava/lang/Object;)Z
	 return;
} // .end method
protected void finalize ( ) {
	 /* .locals 1 */
	 v0 = this.mSharedVertexBuffer;
	 v0 = 	 (( org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ) v0 ).isManaged ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;->isManaged()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mSharedVertexBuffer;
		 (( org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ) v0 ).unloadFromActiveBufferObjectManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;->unloadFromActiveBufferObjectManager()V
	 } // :cond_0
	 return;
} // .end method
public final Integer getHeight ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTilesRows:I */
} // .end method
public final java.lang.String getOrientation ( ) {
	 /* .locals 1 */
	 v0 = this.mOrientation;
} // .end method
public org.anddev.andengine.opengl.vertex.RectangleVertexBuffer getSharedVertexBuffer ( ) {
	 /* .locals 1 */
	 v0 = this.mSharedVertexBuffer;
} // .end method
public java.util.ArrayList getTMXLayers ( ) {
	 /* .locals 1 */
	 v0 = this.mTMXLayers;
} // .end method
public java.util.ArrayList getTMXObjectGroups ( ) {
	 /* .locals 1 */
	 v0 = this.mTMXObjectGroups;
} // .end method
public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties getTMXTileProperties ( Integer p0 ) {
	 /* .locals 3 */
	 v0 = this.mGlobalTileIDToTMXTilePropertiesCache;
	 (( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :goto_0
} // :cond_0
v0 = this.mTMXTileSets;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
} // :goto_1
/* if-gez v1, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "No TMXTileProperties found for pGlobalTileID="; // const-string v2, "No TMXTileProperties found for pGlobalTileID="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet; */
v2 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ) p0 ).getFirstGlobalTileID ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->getFirstGlobalTileID()I
/* if-lt p1, v2, :cond_2 */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ) p0 ).getTMXTilePropertiesFromGlobalTileID ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->getTMXTilePropertiesFromGlobalTileID(I)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;
} // :cond_2
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties getTMXTilePropertiesByGlobalTileID ( Integer p0 ) {
/* .locals 1 */
v0 = this.mGlobalTileIDToTMXTilePropertiesCache;
(( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
} // .end method
public java.util.ArrayList getTMXTileSets ( ) {
/* .locals 1 */
v0 = this.mTMXTileSets;
} // .end method
public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties getTMXTiledMapProperties ( ) {
/* .locals 1 */
v0 = this.mTMXTiledMapProperties;
} // .end method
public org.anddev.andengine.opengl.texture.region.TextureRegion getTextureRegionFromGlobalTileID ( Integer p0 ) {
/* .locals 4 */
v1 = this.mGlobalTileIDToTextureRegionCache;
(( android.util.SparseArray ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion; */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
} // :cond_0
v0 = this.mTMXTileSets;
v2 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
} // :goto_1
/* if-gez v2, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "No TextureRegion found for pGlobalTileID="; // const-string v2, "No TextureRegion found for pGlobalTileID="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet; */
v3 = (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ) p0 ).getFirstGlobalTileID ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->getFirstGlobalTileID()I
/* if-lt p1, v3, :cond_2 */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ) p0 ).getTextureRegionFromGlobalTileID ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->getTextureRegionFromGlobalTileID(I)Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
(( android.util.SparseArray ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
} // :cond_2
/* add-int/lit8 v2, v2, -0x1 */
} // .end method
public final Integer getTileColumns ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileColumns:I */
} // .end method
public final Integer getTileHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileHeight:I */
} // .end method
public final Integer getTileRows ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTilesRows:I */
} // .end method
public final Integer getTileWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileWidth:I */
} // .end method
public final Integer getWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->mTileColumns:I */
} // .end method
