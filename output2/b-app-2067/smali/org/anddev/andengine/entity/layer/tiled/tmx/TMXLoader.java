public class org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader {
	 /* # instance fields */
	 private final android.content.Context mContext;
	 private final org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader$ITMXTilePropertiesListener mTMXTilePropertyListener;
	 private final org.anddev.andengine.opengl.texture.TextureManager mTextureManager;
	 private final org.anddev.andengine.opengl.texture.TextureOptions mTextureOptions;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.DEFAULT;
		 /* invoke-direct {p0, p1, p2, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader;-><init>(Landroid/content/Context;Lorg/anddev/andengine/opengl/texture/TextureManager;Lorg/anddev/andengine/opengl/texture/TextureOptions;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.DEFAULT;
		 /* invoke-direct {p0, p1, p2, v0, p3}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader;-><init>(Landroid/content/Context;Lorg/anddev/andengine/opengl/texture/TextureManager;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader$ITMXTilePropertiesListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader;-><init>(Landroid/content/Context;Lorg/anddev/andengine/opengl/texture/TextureManager;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader$ITMXTilePropertiesListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mContext = p1;
		 this.mTextureManager = p2;
		 this.mTextureOptions = p3;
		 this.mTMXTilePropertyListener = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap load ( java.io.InputStream p0 ) {
		 /* .locals 6 */
		 try { // :try_start_0
			 javax.xml.parsers.SAXParserFactory .newInstance ( );
			 (( javax.xml.parsers.SAXParserFactory ) v0 ).newSAXParser ( ); // invoke-virtual {v0}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
			 (( javax.xml.parsers.SAXParser ) v0 ).getXMLReader ( ); // invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
			 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser; */
			 v2 = this.mContext;
			 v3 = this.mTextureManager;
			 v4 = this.mTextureOptions;
			 v5 = this.mTMXTilePropertyListener;
			 /* invoke-direct {v1, v2, v3, v4, v5}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;-><init>(Landroid/content/Context;Lorg/anddev/andengine/opengl/texture/TextureManager;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader$ITMXTilePropertiesListener;)V */
			 /* new-instance v2, Lorg/xml/sax/InputSource; */
			 /* new-instance v3, Ljava/io/BufferedInputStream; */
			 /* invoke-direct {v3, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
			 /* invoke-direct {v2, v3}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
			 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXParser ) v1 ).getTMXTiledMap ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXParser;->getTMXTiledMap()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;
			 /* :try_end_0 */
			 /* .catch Lorg/xml/sax/SAXException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* :catch_2 */
		 /* move-exception v0 */
		 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXTiledMap loadFromAsset ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 (( android.content.res.AssetManager ) v0 ).open ( p2 ); // invoke-virtual {v0, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXLoader ) p0 ).load ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXLoader;->load(Ljava/io/InputStream;)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTiledMap;
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException; */
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 final String v3 = "Could not load TMXTiledMap from asset: "; // const-string v3, "Could not load TMXTiledMap from asset: "
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v1, v2, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TMXLoadException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
			 /* throw v1 */
		 } // .end method
