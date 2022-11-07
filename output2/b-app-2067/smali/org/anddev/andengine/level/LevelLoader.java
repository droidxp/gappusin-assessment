public class org.anddev.andengine.level.LevelLoader implements org.anddev.andengine.level.util.constants.LevelConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private java.lang.String mAssetBasePath;
	 private org.anddev.andengine.level.LevelLoader$IEntityLoader mDefaultEntityLoader;
	 private final java.util.HashMap mEntityLoaders;
	 /* # direct methods */
	 public org.anddev.andengine.level.LevelLoader ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/level/LevelLoader;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.level.LevelLoader ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.mEntityLoaders = v0;
		 (( org.anddev.andengine.level.LevelLoader ) p0 ).setAssetBasePath ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/level/LevelLoader;->setAssetBasePath(Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.level.LevelLoader$IEntityLoader getDefaultEntityLoader ( ) {
		 /* .locals 1 */
		 v0 = this.mDefaultEntityLoader;
	 } // .end method
	 public void loadLevelFromAsset ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 v2 = this.mAssetBasePath;
		 java.lang.String .valueOf ( v2 );
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( android.content.res.AssetManager ) v0 ).open ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
		 (( org.anddev.andengine.level.LevelLoader ) p0 ).loadLevelFromStream ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/level/LevelLoader;->loadLevelFromStream(Ljava/io/InputStream;)V
		 return;
	 } // .end method
	 public void loadLevelFromResource ( android.content.Context p0, Integer p1 ) {
		 /* .locals 1 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).openRawResource ( p2 ); // invoke-virtual {v0, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
		 (( org.anddev.andengine.level.LevelLoader ) p0 ).loadLevelFromStream ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/level/LevelLoader;->loadLevelFromStream(Ljava/io/InputStream;)V
		 return;
	 } // .end method
	 public void loadLevelFromStream ( java.io.InputStream p0 ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 javax.xml.parsers.SAXParserFactory .newInstance ( );
			 (( javax.xml.parsers.SAXParserFactory ) v0 ).newSAXParser ( ); // invoke-virtual {v0}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
			 (( javax.xml.parsers.SAXParser ) v0 ).getXMLReader ( ); // invoke-virtual {v0}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
			 (( org.anddev.andengine.level.LevelLoader ) p0 ).onBeforeLoadLevel ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/level/LevelLoader;->onBeforeLoadLevel()V
			 /* new-instance v1, Lorg/anddev/andengine/level/LevelParser; */
			 v2 = this.mDefaultEntityLoader;
			 v3 = this.mEntityLoaders;
			 /* invoke-direct {v1, v2, v3}, Lorg/anddev/andengine/level/LevelParser;-><init>(Lorg/anddev/andengine/level/LevelLoader$IEntityLoader;Ljava/util/HashMap;)V */
			 /* new-instance v1, Lorg/xml/sax/InputSource; */
			 /* new-instance v2, Ljava/io/BufferedInputStream; */
			 /* invoke-direct {v2, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
			 /* invoke-direct {v1, v2}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
			 (( org.anddev.andengine.level.LevelLoader ) p0 ).onAfterLoadLevel ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/level/LevelLoader;->onAfterLoadLevel()V
			 /* :try_end_0 */
			 /* .catch Lorg/xml/sax/SAXException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 org.anddev.andengine.util.StreamUtils .close ( p1 );
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 try { // :try_start_1
			 org.anddev.andengine.util.Debug .e ( v0 );
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 org.anddev.andengine.util.StreamUtils .close ( p1 );
			 /* :catch_1 */
			 /* move-exception v0 */
			 try { // :try_start_2
				 org.anddev.andengine.util.Debug .e ( v0 );
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
				 org.anddev.andengine.util.StreamUtils .close ( p1 );
				 /* :catchall_0 */
				 /* move-exception v0 */
				 org.anddev.andengine.util.StreamUtils .close ( p1 );
				 /* throw v0 */
			 } // .end method
			 protected void onAfterLoadLevel ( ) {
				 /* .locals 0 */
				 return;
			 } // .end method
			 protected void onBeforeLoadLevel ( ) {
				 /* .locals 0 */
				 return;
			 } // .end method
			 public void registerEntityLoader ( java.lang.String p0, org.anddev.andengine.level.LevelLoader$IEntityLoader p1 ) {
				 /* .locals 1 */
				 v0 = this.mEntityLoaders;
				 (( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
				 return;
			 } // .end method
			 public void registerEntityLoader ( java.lang.String[] p0, org.anddev.andengine.level.LevelLoader$IEntityLoader p1 ) {
				 /* .locals 3 */
				 v0 = this.mEntityLoaders;
				 /* array-length v1, p1 */
				 int v2 = 1; // const/4 v2, 0x1
				 /* sub-int/2addr v1, v2 */
			 } // :goto_0
			 /* if-gez v1, :cond_0 */
			 return;
		 } // :cond_0
		 /* aget-object v2, p1, v1 */
		 (( java.util.HashMap ) v0 ).put ( v2, p2 ); // invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* add-int/lit8 v1, v1, -0x1 */
	 } // .end method
	 public void setAssetBasePath ( java.lang.String p0 ) {
		 /* .locals 2 */
		 final String v0 = "/"; // const-string v0, "/"
		 v0 = 		 (( java.lang.String ) p1 ).endsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_0 */
		 v0 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
	 this.mAssetBasePath = p1;
	 return;
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "pAssetBasePath must end with \'/\' or be lenght zero."; // const-string v1, "pAssetBasePath must end with \'/\' or be lenght zero."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void setDefaultEntityLoader ( org.anddev.andengine.level.LevelLoader$IEntityLoader p0 ) {
/* .locals 0 */
this.mDefaultEntityLoader = p1;
return;
} // .end method
