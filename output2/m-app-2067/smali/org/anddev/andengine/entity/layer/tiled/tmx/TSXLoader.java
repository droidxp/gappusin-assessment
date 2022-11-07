public class org.anddev.andengine.entity.layer.tiled.tmx.TSXLoader {
	 /* # instance fields */
	 private final android.content.Context mContext;
	 private final org.anddev.andengine.opengl.texture.TextureManager mTextureManager;
	 private final org.anddev.andengine.opengl.texture.TextureOptions mTextureOptions;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TSXLoader ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mContext = p1;
		 this.mTextureManager = p2;
		 this.mTextureOptions = p3;
		 return;
	 } // .end method
	 private org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet load ( Integer p0, java.io.InputStream p1 ) {
		 /* .locals 5 */
		 try { // :try_start_0
			 javax.xml.parsers.SAXParserFactory .newInstance ( );
			 (( javax.xml.parsers.SAXParserFactory ) v0 ).newSAXParser ( ); // invoke-virtual {v0}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
			 (( javax.xml.parsers.SAXParser ) v0 ).getXMLReader ( ); // invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
			 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser; */
			 v2 = this.mContext;
			 v3 = this.mTextureManager;
			 v4 = this.mTextureOptions;
			 /* invoke-direct {v1, v2, v3, v4, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;-><init>(Landroid/content/Context;Lorg/anddev/andengine/opengl/texture/TextureManager;Lorg/anddev/andengine/opengl/texture/TextureOptions;I)V */
			 /* new-instance v2, Lorg/xml/sax/InputSource; */
			 /* new-instance v3, Ljava/io/BufferedInputStream; */
			 /* invoke-direct {v3, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
			 /* invoke-direct {v2, v3}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
			 (( org.anddev.andengine.entity.layer.tiled.tmx.TSXParser ) v1 ).getTMXTileSet ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXParser;->getTMXTileSet()Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet;
			 /* :try_end_0 */
			 /* .catch Lorg/xml/sax/SAXException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TSXLoadException; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TSXLoadException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* :catch_2 */
		 /* move-exception v0 */
		 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TSXLoadException; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TSXLoadException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXTileSet loadFromAsset ( android.content.Context p0, Integer p1, java.lang.String p2 ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 (( android.content.res.AssetManager ) v0 ).open ( p3 ); // invoke-virtual {v0, p3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
			 /* invoke-direct {p0, p2, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TSXLoader;->load(ILjava/io/InputStream;)Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXTileSet; */
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* new-instance v1, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TSXLoadException; */
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 final String v3 = "Could not load TMXTileSet from asset: "; // const-string v3, "Could not load TMXTileSet from asset: "
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v2 ).append ( p3 ); // invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v1, v2, v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/util/exception/TSXLoadException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
			 /* throw v1 */
		 } // .end method
