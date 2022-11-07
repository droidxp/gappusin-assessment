public class org.anddev.andengine.entity.layer.tiled.tmx.TMXParser extends org.xml.sax.helpers.DefaultHandler implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final android.content.Context mContext;
	 private java.lang.String mDataCompression;
	 private java.lang.String mDataEncoding;
	 private Boolean mInData;
	 private Boolean mInImage;
	 private Boolean mInLayer;
	 private Boolean mInMap;
	 private Boolean mInObject;
	 private Boolean mInObjectGroup;
	 private Boolean mInProperties;
	 private Boolean mInProperty;
	 private Boolean mInTile;
	 private Boolean mInTileset;
	 private Integer mLastTileSetTileID;
	 private final java.lang.StringBuilder mStringBuilder;
	 private final org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader$ITMXTilePropertiesListener mTMXTilePropertyListener;
	 private org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap mTMXTiledMap;
	 private final org.anddev.andengine.opengl.texture.TextureManager mTextureManager;
	 private final org.anddev.andengine.opengl.texture.TextureOptions mTextureOptions;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXParser ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 this.mStringBuilder = v0;
		 this.mContext = p1;
		 this.mTextureManager = p2;
		 this.mTextureOptions = p3;
		 this.mTMXTilePropertyListener = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void characters ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 v0 = this.mStringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
		 return;
	 } // .end method
	 public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 int v5 = 0; // const/4 v5, 0x0
		 final String v0 = "map"; // const-string v0, "map"
		 v0 = 		 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInMap:Z */
		 } // :goto_0
		 v0 = this.mStringBuilder;
		 (( java.lang.StringBuilder ) v0 ).setLength ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->setLength(I)V
		 return;
	 } // :cond_0
	 final String v0 = "tileset"; // const-string v0, "tileset"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInTileset:Z */
	 } // :cond_1
	 final String v0 = "image"; // const-string v0, "image"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInImage:Z */
	 } // :cond_2
	 final String v0 = "tile"; // const-string v0, "tile"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInTile:Z */
	 } // :cond_3
	 final String v0 = "properties"; // const-string v0, "properties"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInProperties:Z */
	 } // :cond_4
	 final String v0 = "property"; // const-string v0, "property"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_5
		 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInProperty:Z */
	 } // :cond_5
	 final String v0 = "layer"; // const-string v0, "layer"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_6
		 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInLayer:Z */
	 } // :cond_6
	 final String v0 = "data"; // const-string v0, "data"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_9
		 v0 = this.mDataCompression;
		 if ( v0 != null) { // if-eqz v0, :cond_8
			 v0 = this.mDataEncoding;
			 if ( v0 != null) { // if-eqz v0, :cond_8
				 /* move v0, v2 */
			 } // :goto_1
			 if ( v0 != null) { // if-eqz v0, :cond_7
				 v0 = this.mTMXTiledMap;
				 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getTMXLayers ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXLayers()Ljava/util/ArrayList;
				 try { // :try_start_0
					 v1 = 					 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
					 /* sub-int/2addr v1, v2 */
					 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
					 /* check-cast v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer; */
					 v1 = this.mStringBuilder;
					 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 (( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
					 v2 = this.mDataEncoding;
					 v3 = this.mDataCompression;
					 v4 = this.mTMXTilePropertyListener;
					 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).initializeTMXTilesFromDataString ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->initializeTMXTilesFromDataString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader$ITMXTilePropertiesListener;)V
					 /* :try_end_0 */
					 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
				 } // :goto_2
				 this.mDataCompression = v6;
				 this.mDataEncoding = v6;
			 } // :cond_7
			 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInData:Z */
			 /* goto/16 :goto_0 */
		 } // :cond_8
		 /* move v0, v5 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 org.anddev.andengine.util.Debug .e ( v0 );
	 } // :cond_9
	 final String v0 = "objectgroup"; // const-string v0, "objectgroup"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_a
		 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInObjectGroup:Z */
		 /* goto/16 :goto_0 */
	 } // :cond_a
	 final String v0 = "object"; // const-string v0, "object"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_b
		 /* iput-boolean v5, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInObject:Z */
		 /* goto/16 :goto_0 */
	 } // :cond_b
	 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXParseException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Unexpected end tag: \'"; // const-string v2, "Unexpected end tag: \'"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\'."; // const-string v2, "\'."
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXParseException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap getTMXTiledMap ( ) {
	 /* .locals 1 */
	 v0 = this.mTMXTiledMap;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
	 /* .locals 6 */
	 int v2 = 1; // const/4 v2, 0x1
	 final String v0 = "map"; // const-string v0, "map"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInMap:Z */
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap; */
		 /* invoke-direct {v0, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;-><init>(Lorg/xml/sax/Attributes;)V */
		 this.mTMXTiledMap = v0;
	 } // :cond_0
} // :goto_0
return;
} // :cond_1
final String v0 = "tileset"; // const-string v0, "tileset"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInTileset:Z */
final String v0 = ""; // const-string v0, ""
final String v1 = "source"; // const-string v1, "source"
/* if-nez v0, :cond_2 */
/* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet; */
v1 = this.mTextureOptions;
/* invoke-direct {v0, p4, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;-><init>(Lorg/xml/sax/Attributes;Lorg/anddev/andengine/opengl/texture/TextureOptions;)V */
} // :goto_1
v1 = this.mTMXTiledMap;
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v1 ).addTMXTileSet ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->addTMXTileSet(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;)V
} // :cond_2
try { // :try_start_0
final String v1 = "firstgid"; // const-string v1, "firstgid"
int v2 = 1; // const/4 v2, 0x1
v1 = org.anddev.andengine.util.SAXUtils .getIntAttribute ( p4,v1,v2 );
/* new-instance v2, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXLoader; */
v3 = this.mContext;
v4 = this.mTextureManager;
v5 = this.mTextureOptions;
/* invoke-direct {v2, v3, v4, v5}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXLoader;-><init>(Landroid/content/Context;Lorg/anddev/andengine/opengl/texture/TextureManager;Lorg/anddev/andengine/opengl/texture/TextureOptions;)V */
v3 = this.mContext;
(( org.anddev.andengine.entity.layer.tiled.tmx.TSXLoader ) v2 ).loadFromAsset ( v3, v1, v0 ); // invoke-virtual {v2, v3, v1, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXLoader;->loadFromAsset(Landroid/content/Context;ILjava/lang/String;)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;
/* :try_end_0 */
/* .catch Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TSXLoadException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* new-instance v2, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXParseException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Failed to load TMXTileSet from source: "; // const-string v4, "Failed to load TMXTileSet from source: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v0, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXParseException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V */
/* throw v2 */
} // :cond_3
final String v0 = "image"; // const-string v0, "image"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInImage:Z */
v0 = this.mTMXTiledMap;
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getTMXTileSets ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXTileSets()Ljava/util/ArrayList;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v1, v2 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet; */
v1 = this.mContext;
v2 = this.mTextureManager;
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ) v0 ).setImageSource ( v1, v2, p4 ); // invoke-virtual {v0, v1, v2, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->setImageSource(Landroid/content/Context;Lorg/anddev/andengine/opengl/texture/TextureManager;Lorg/xml/sax/Attributes;)V
} // :cond_4
final String v0 = "tile"; // const-string v0, "tile"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInTile:Z */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInTileset:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = "id"; // const-string v0, "id"
v0 = org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p4,v0 );
/* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mLastTileSetTileID:I */
/* goto/16 :goto_0 */
} // :cond_5
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInData:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mTMXTiledMap;
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getTMXLayers ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXLayers()Ljava/util/ArrayList;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v1, v2 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer; */
v1 = this.mTMXTilePropertyListener;
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) v0 ).initializeTMXTileFromXML ( p4, v1 ); // invoke-virtual {v0, p4, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->initializeTMXTileFromXML(Lorg/xml/sax/Attributes;Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader$ITMXTilePropertiesListener;)V
/* goto/16 :goto_0 */
} // :cond_6
final String v0 = "properties"; // const-string v0, "properties"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_7
/* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInProperties:Z */
/* goto/16 :goto_0 */
} // :cond_7
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInProperties:Z */
if ( v0 != null) { // if-eqz v0, :cond_c
final String v0 = "property"; // const-string v0, "property"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_c
	 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInProperty:Z */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInTile:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_8
		 v0 = this.mTMXTiledMap;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getTMXTileSets ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXTileSets()Ljava/util/ArrayList;
		 v1 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v1, v2 */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet; */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mLastTileSetTileID:I */
		 /* new-instance v2, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileProperty; */
		 /* invoke-direct {v2, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileProperty;-><init>(Lorg/xml/sax/Attributes;)V */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ) v0 ).addTMXTileProperty ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->addTMXTileProperty(ILorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileProperty;)V
		 /* goto/16 :goto_0 */
	 } // :cond_8
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInLayer:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_9
		 v0 = this.mTMXTiledMap;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getTMXLayers ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXLayers()Ljava/util/ArrayList;
		 v1 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v1, v2 */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer; */
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayerProperty; */
		 /* invoke-direct {v0, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayerProperty;-><init>(Lorg/xml/sax/Attributes;)V */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLayer ) p0 ).addTMXLayerProperty ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;->addTMXLayerProperty(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayerProperty;)V
		 /* goto/16 :goto_0 */
	 } // :cond_9
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInObject:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_a
		 v0 = this.mTMXTiledMap;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getTMXObjectGroups ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXObjectGroups()Ljava/util/ArrayList;
		 v1 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v1, v2 */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup; */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXObjectGroup ) p0 ).getTMXObjects ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;->getTMXObjects()Ljava/util/ArrayList;
		 v1 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v1, v2 */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject; */
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectProperty; */
		 /* invoke-direct {v0, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectProperty;-><init>(Lorg/xml/sax/Attributes;)V */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXObject ) p0 ).addTMXObjectProperty ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->addTMXObjectProperty(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectProperty;)V
		 /* goto/16 :goto_0 */
	 } // :cond_a
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInObjectGroup:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_b
		 v0 = this.mTMXTiledMap;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getTMXObjectGroups ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXObjectGroups()Ljava/util/ArrayList;
		 v1 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v1, v2 */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup; */
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroupProperty; */
		 /* invoke-direct {v0, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroupProperty;-><init>(Lorg/xml/sax/Attributes;)V */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXObjectGroup ) p0 ).addTMXObjectGroupProperty ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;->addTMXObjectGroupProperty(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroupProperty;)V
		 /* goto/16 :goto_0 */
	 } // :cond_b
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInMap:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mTMXTiledMap;
		 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMapProperty; */
		 /* invoke-direct {v1, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMapProperty;-><init>(Lorg/xml/sax/Attributes;)V */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).addTMXTiledMapProperty ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->addTMXTiledMapProperty(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMapProperty;)V
		 /* goto/16 :goto_0 */
	 } // :cond_c
	 final String v0 = "layer"; // const-string v0, "layer"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_d
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInLayer:Z */
		 v0 = this.mTMXTiledMap;
		 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer; */
		 v2 = this.mTMXTiledMap;
		 /* invoke-direct {v1, v2, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;-><init>(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;Lorg/xml/sax/Attributes;)V */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).addTMXLayer ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->addTMXLayer(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLayer;)V
		 /* goto/16 :goto_0 */
	 } // :cond_d
	 final String v0 = "data"; // const-string v0, "data"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_e
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInData:Z */
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "encoding"; // const-string v1, "encoding"
		 this.mDataEncoding = v0;
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "compression"; // const-string v1, "compression"
		 this.mDataCompression = v0;
		 /* goto/16 :goto_0 */
	 } // :cond_e
	 final String v0 = "objectgroup"; // const-string v0, "objectgroup"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_f
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInObjectGroup:Z */
		 v0 = this.mTMXTiledMap;
		 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup; */
		 /* invoke-direct {v1, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;-><init>(Lorg/xml/sax/Attributes;)V */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).addTMXObjectGroup ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->addTMXObjectGroup(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;)V
		 /* goto/16 :goto_0 */
	 } // :cond_f
	 final String v0 = "object"; // const-string v0, "object"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_10
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->mInObject:Z */
		 v0 = this.mTMXTiledMap;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap ) v0 ).getTMXObjectGroups ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;->getTMXObjectGroups()Ljava/util/ArrayList;
		 v1 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v1, v2 */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup; */
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject; */
		 /* invoke-direct {v0, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;-><init>(Lorg/xml/sax/Attributes;)V */
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXObjectGroup ) p0 ).addTMXObject ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;->addTMXObject(Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;)V
		 /* goto/16 :goto_0 */
	 } // :cond_10
	 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXParseException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Unexpected start tag: \'"; // const-string v2, "Unexpected start tag: \'"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\'."; // const-string v2, "\'."
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXParseException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
