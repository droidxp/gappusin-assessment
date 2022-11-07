public class org.anddev.andengine.entity.layer.tiled.tmx.TSXParser extends org.xml.sax.helpers.DefaultHandler implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final android.content.Context mContext;
	 private final Integer mFirstGlobalTileID;
	 private Boolean mInImage;
	 private Boolean mInProperties;
	 private Boolean mInProperty;
	 private Boolean mInTile;
	 private Boolean mInTileset;
	 private Integer mLastTileSetTileID;
	 private org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet mTMXTileSet;
	 private final org.anddev.andengine.opengl.texture.TextureManager mTextureManager;
	 private final org.anddev.andengine.opengl.texture.TextureOptions mTextureOptions;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TSXParser ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
		 this.mContext = p1;
		 this.mTextureManager = p2;
		 this.mTextureOptions = p3;
		 /* iput p4, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mFirstGlobalTileID:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 3 */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v0 = "tileset"; // const-string v0, "tileset"
		 v0 = 		 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInTileset:Z */
		 } // :goto_0
		 return;
	 } // :cond_0
	 final String v0 = "image"; // const-string v0, "image"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInImage:Z */
	 } // :cond_1
	 final String v0 = "tile"; // const-string v0, "tile"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInTile:Z */
	 } // :cond_2
	 final String v0 = "properties"; // const-string v0, "properties"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInProperties:Z */
	 } // :cond_3
	 final String v0 = "property"; // const-string v0, "property"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInProperty:Z */
	 } // :cond_4
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
org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet getTMXTileSet ( ) {
	 /* .locals 1 */
	 v0 = this.mTMXTileSet;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
	 /* .locals 3 */
	 int v1 = 1; // const/4 v1, 0x1
	 final String v0 = "tileset"; // const-string v0, "tileset"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInTileset:Z */
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet; */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mFirstGlobalTileID:I */
		 v2 = this.mTextureOptions;
		 /* invoke-direct {v0, v1, p4, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;-><init>(ILorg/xml/sax/Attributes;Lorg/anddev/andengine/opengl/texture/TextureOptions;)V */
		 this.mTMXTileSet = v0;
	 } // :goto_0
	 return;
} // :cond_0
final String v0 = "image"; // const-string v0, "image"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInImage:Z */
	 v0 = this.mTMXTileSet;
	 v1 = this.mContext;
	 v2 = this.mTextureManager;
	 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ) v0 ).setImageSource ( v1, v2, p4 ); // invoke-virtual {v0, v1, v2, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->setImageSource(Landroid/content/Context;Lorg/anddev/andengine/opengl/texture/TextureManager;Lorg/xml/sax/Attributes;)V
} // :cond_1
final String v0 = "tile"; // const-string v0, "tile"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInTile:Z */
	 final String v0 = "id"; // const-string v0, "id"
	 v0 = 	 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p4,v0 );
	 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mLastTileSetTileID:I */
} // :cond_2
final String v0 = "properties"; // const-string v0, "properties"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInProperties:Z */
} // :cond_3
final String v0 = "property"; // const-string v0, "property"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
	 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mInProperty:Z */
	 v0 = this.mTMXTileSet;
	 /* iget v1, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->mLastTileSetTileID:I */
	 /* new-instance v2, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileProperty; */
	 /* invoke-direct {v2, p4}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileProperty;-><init>(Lorg/xml/sax/Attributes;)V */
	 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet ) v0 ).addTMXTileProperty ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;->addTMXTileProperty(ILorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileProperty;)V
} // :cond_4
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
