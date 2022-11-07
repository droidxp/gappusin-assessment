public class com.jumptap.adtag.activity.JTVideo {
	 /* .source "JTVideo.java" */
	 /* # static fields */
	 private static final java.lang.String ADID_STR;
	 private static final java.lang.String CLICK_THROUGH_STR;
	 private static final java.lang.String IMPRESSION_STR;
	 private static final java.lang.String MEDIA_FILE_STR;
	 private static final java.lang.String URL_STR;
	 private static final Long WEEK_IN_MILLIS;
	 private static java.lang.String adId;
	 private static java.lang.String adRequestId;
	 private static java.lang.String clickThroughUrl;
	 private static java.io.File downloadingMediaFile;
	 private static Boolean isDownLoading;
	 private static Integer totalKbRead;
	 private static java.util.List trackingUrlArr;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static java.lang.String videoUrl;
/* # direct methods */
static com.jumptap.adtag.activity.JTVideo ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 47 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 48 */
final String v0 = ""; // const-string v0, ""
/* .line 49 */
final String v0 = ""; // const-string v0, ""
/* .line 50 */
final String v0 = ""; // const-string v0, ""
/* .line 51 */
com.jumptap.adtag.activity.JTVideo.isDownLoading = (v1!= 0);
/* .line 55 */
return;
} // .end method
public com.jumptap.adtag.activity.JTVideo ( ) {
/* .locals 0 */
/* .prologue */
/* .line 37 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static Boolean access$000 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 37 */
/* sget-boolean v0, Lcom/jumptap/adtag/activity/JTVideo;->isDownLoading:Z */
} // .end method
static Boolean access$002 ( Boolean p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Z */
/* .prologue */
/* .line 37 */
com.jumptap.adtag.activity.JTVideo.isDownLoading = (p0!= 0);
} // .end method
static java.lang.String access$100 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 37 */
v0 = com.jumptap.adtag.activity.JTVideo.videoUrl;
} // .end method
static java.lang.String access$102 ( java.lang.String p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Ljava/lang/String; */
/* .prologue */
/* .line 37 */
} // .end method
static java.lang.String access$200 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 37 */
v0 = com.jumptap.adtag.activity.JTVideo.adId;
} // .end method
static java.lang.String access$202 ( java.lang.String p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Ljava/lang/String; */
/* .prologue */
/* .line 37 */
} // .end method
static java.util.List access$300 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 37 */
v0 = com.jumptap.adtag.activity.JTVideo.trackingUrlArr;
} // .end method
static java.lang.String access$402 ( java.lang.String p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Ljava/lang/String; */
/* .prologue */
/* .line 37 */
} // .end method
private static Boolean checkIfExpired ( com.jumptap.adtag.media.VideoCacheItem p0 ) {
/* .locals 9 */
/* .param p0, "item" # Lcom/jumptap/adtag/media/VideoCacheItem; */
/* .prologue */
/* .line 182 */
(( com.jumptap.adtag.media.VideoCacheItem ) p0 ).getDate ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/VideoCacheItem;->getDate()Ljava/lang/String;
/* .line 183 */
/* .local v2, "dateAsStr":Ljava/lang/String; */
java.lang.Long .parseLong ( v2 );
/* move-result-wide v0 */
/* .line 184 */
/* .local v0, "dateAsLong":J */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v5 */
/* .line 186 */
/* .local v5, "nowAsLong":J */
/* sub-long v3, v5, v0 */
/* .line 187 */
/* .local v3, "deltaAsLong":J */
/* const-wide/32 v7, 0x240c8400 */
/* cmp-long v7, v3, v7 */
/* if-lez v7, :cond_0 */
int v7 = 1; // const/4 v7, 0x1
} // :goto_0
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
} // .end method
protected static void clearTrackingUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 330 */
v0 = com.jumptap.adtag.activity.JTVideo.trackingUrlArr;
/* .line 331 */
return;
} // .end method
private static void deleteVideo ( com.jumptap.adtag.media.VideoCacheItem p0, com.jumptap.adtag.db.DBManager p1, android.content.Context p2 ) {
/* .locals 4 */
/* .param p0, "item" # Lcom/jumptap/adtag/media/VideoCacheItem; */
/* .param p1, "dbManager" # Lcom/jumptap/adtag/db/DBManager; */
/* .param p2, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 199 */
final String v1 = "JtAd"; // const-string v1, "JtAd"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "deleting from db item = "; // const-string v3, "deleting from db item = "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.jumptap.adtag.media.VideoCacheItem ) p0 ).toString ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/VideoCacheItem;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 201 */
v1 = (( com.jumptap.adtag.media.VideoCacheItem ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/VideoCacheItem;->getId()I
(( com.jumptap.adtag.db.DBManager ) p1 ).deleteVideoCacheItemById ( v1 ); // invoke-virtual {p1, v1}, Lcom/jumptap/adtag/db/DBManager;->deleteVideoCacheItemById(I)V
/* .line 204 */
/* new-instance v0, Ljava/io/File; */
(( android.content.Context ) p2 ).getCacheDir ( ); // invoke-virtual {p2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( com.jumptap.adtag.media.VideoCacheItem ) p0 ).getAdID ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/VideoCacheItem;->getAdID()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ".dat"; // const-string v3, ".dat"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 205 */
/* .local v0, "videoFile":Ljava/io/File; */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 206 */
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
/* .line 208 */
} // :cond_0
return;
} // .end method
private static void getAdContent ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 7 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "asVideoUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 291 */
int v2 = 0; // const/4 v2, 0x0
/* .line 294 */
/* .local v2, "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher; */
try { // :try_start_0
/* new-instance v3, Lcom/jumptap/adtag/utils/JtAdFetcher; */
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {v3, p0, v4}, Lcom/jumptap/adtag/utils/JtAdFetcher;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;)V */
/* :try_end_0 */
/* .catch Lcom/jumptap/adtag/utils/JtException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 295 */
} // .end local v2 # "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher;
/* .local v3, "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher; */
try { // :try_start_1
(( com.jumptap.adtag.utils.JtAdFetcher ) v3 ).setUrl ( p1 ); // invoke-virtual {v3, p1}, Lcom/jumptap/adtag/utils/JtAdFetcher;->setUrl(Ljava/lang/String;)V
/* .line 296 */
(( com.jumptap.adtag.utils.JtAdFetcher ) v3 ).getAdContent ( ); // invoke-virtual {v3}, Lcom/jumptap/adtag/utils/JtAdFetcher;->getAdContent()Ljava/lang/String;
/* .line 297 */
/* .local v0, "adContent":Ljava/lang/String; */
(( com.jumptap.adtag.utils.JtAdFetcher ) v3 ).getAdRequestId ( ); // invoke-virtual {v3}, Lcom/jumptap/adtag/utils/JtAdFetcher;->getAdRequestId()Ljava/lang/String;
/* .line 300 */
com.jumptap.adtag.activity.JTVideo .parseAdContent ( v0 );
/* :try_end_1 */
/* .catch Lcom/jumptap/adtag/utils/JtException; {:try_start_1 ..:try_end_1} :catch_1 */
/* move-object v2, v3 */
/* .line 304 */
} // .end local v0 # "adContent":Ljava/lang/String;
} // .end local v3 # "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher;
/* .restart local v2 # "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher; */
} // :goto_0
return;
/* .line 301 */
/* :catch_0 */
/* move-exception v1 */
/* .line 302 */
/* .local v1, "e":Lcom/jumptap/adtag/utils/JtException; */
} // :goto_1
final String v4 = "JtAd"; // const-string v4, "JtAd"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "FAil to get ad content url is ="; // const-string v6, "FAil to get ad content url is ="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v4,v5,v1 );
/* .line 301 */
} // .end local v1 # "e":Lcom/jumptap/adtag/utils/JtException;
} // .end local v2 # "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher;
/* .restart local v3 # "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher; */
/* :catch_1 */
/* move-exception v1 */
/* move-object v2, v3 */
} // .end local v3 # "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher;
/* .restart local v2 # "fetcher":Lcom/jumptap/adtag/utils/JtAdFetcher; */
} // .end method
protected static java.lang.String getAdRequestId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 322 */
v0 = com.jumptap.adtag.activity.JTVideo.adRequestId;
} // .end method
protected static java.lang.String getClickThroughUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 334 */
v0 = com.jumptap.adtag.activity.JTVideo.clickThroughUrl;
} // .end method
private static com.jumptap.adtag.media.VideoCacheItem getLastItem ( com.jumptap.adtag.db.DBManager p0 ) {
/* .locals 3 */
/* .param p0, "dbManager" # Lcom/jumptap/adtag/db/DBManager; */
/* .prologue */
/* .line 152 */
(( com.jumptap.adtag.db.DBManager ) p0 ).selectAllVideoCacheItems ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/db/DBManager;->selectAllVideoCacheItems()Ljava/util/List;
/* .line 153 */
/* .local v0, "items":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/media/VideoCacheItem;>;" */
int v2 = 0; // const/4 v2, 0x0
/* check-cast v1, Lcom/jumptap/adtag/media/VideoCacheItem; */
/* .line 154 */
/* .local v1, "videoCacheItem":Lcom/jumptap/adtag/media/VideoCacheItem; */
} // .end method
protected static java.util.List getTrackingUrl ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 326 */
v0 = com.jumptap.adtag.activity.JTVideo.trackingUrlArr;
} // .end method
private static void initParams ( ) {
/* .locals 1 */
/* .prologue */
/* .line 423 */
com.jumptap.adtag.activity.JTVideo .clearTrackingUrl ( );
/* .line 424 */
final String v0 = ""; // const-string v0, ""
/* .line 425 */
final String v0 = ""; // const-string v0, ""
/* .line 426 */
final String v0 = ""; // const-string v0, ""
/* .line 427 */
return;
} // .end method
public static Boolean isReady ( ) {
/* .locals 2 */
/* .prologue */
/* .line 317 */
com.jumptap.adtag.media.JTMediaPlayer .getInstance ( );
/* .line 318 */
/* .local v0, "mediaPlayer":Lcom/jumptap/adtag/media/JTMediaPlayer; */
v1 = (( com.jumptap.adtag.media.JTMediaPlayer ) v0 ).isReady ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/media/JTMediaPlayer;->isReady()Z
} // .end method
private static Boolean isVideoInCache ( com.jumptap.adtag.db.DBManager p0 ) {
/* .locals 2 */
/* .param p0, "dbManager" # Lcom/jumptap/adtag/db/DBManager; */
/* .prologue */
/* .line 308 */
(( com.jumptap.adtag.db.DBManager ) p0 ).selectAllVideoCacheItems ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/db/DBManager;->selectAllVideoCacheItems()Ljava/util/List;
/* .line 309 */
v1 = /* .local v0, "items":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/media/VideoCacheItem;>;" */
/* if-lez v1, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
private static void maintainDB ( com.jumptap.adtag.db.DBManager p0, android.content.Context p1 ) {
/* .locals 7 */
/* .param p0, "dbManager" # Lcom/jumptap/adtag/db/DBManager; */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 163 */
final String v4 = "JtAd"; // const-string v4, "JtAd"
final String v5 = "maintainDB"; // const-string v5, "maintainDB"
android.util.Log .i ( v4,v5 );
/* .line 164 */
(( com.jumptap.adtag.db.DBManager ) p0 ).selectAllVideoCacheItems ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/db/DBManager;->selectAllVideoCacheItems()Ljava/util/List;
/* .line 165 */
/* .local v3, "items":Ljava/util/List;, "Ljava/util/List<Lcom/jumptap/adtag/media/VideoCacheItem;>;" */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
v4 = } // :goto_0
/* if-ge v0, v4, :cond_1 */
/* .line 166 */
/* check-cast v2, Lcom/jumptap/adtag/media/VideoCacheItem; */
/* .line 167 */
/* .local v2, "item":Lcom/jumptap/adtag/media/VideoCacheItem; */
final String v4 = "JtAd"; // const-string v4, "JtAd"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "found in db: item = "; // const-string v6, "found in db: item = "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.jumptap.adtag.media.VideoCacheItem ) v2 ).toString ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/media/VideoCacheItem;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v4,v5 );
/* .line 169 */
v1 = com.jumptap.adtag.activity.JTVideo .checkIfExpired ( v2 );
/* .line 170 */
/* .local v1, "isExpired":Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 171 */
com.jumptap.adtag.activity.JTVideo .deleteVideo ( v2,p0,p1 );
/* .line 165 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 174 */
} // .end local v1 # "isExpired":Z
} // .end local v2 # "item":Lcom/jumptap/adtag/media/VideoCacheItem;
} // :cond_1
return;
} // .end method
private static void parseAdContent ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p0, "adContent" # Ljava/lang/String; */
/* .prologue */
/* .line 343 */
if ( p0 != null) { // if-eqz p0, :cond_0
final String v5 = ""; // const-string v5, ""
v5 = (( java.lang.String ) p0 ).equals ( v5 ); // invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 344 */
} // :cond_0
final String v5 = "JtAd"; // const-string v5, "JtAd"
final String v6 = "Cannot parse content since adContent is empty"; // const-string v6, "Cannot parse content since adContent is empty"
android.util.Log .e ( v5,v6 );
/* .line 419 */
} // :goto_0
return;
/* .line 347 */
} // :cond_1
javax.xml.parsers.SAXParserFactory .newInstance ( );
/* .line 349 */
/* .local v3, "spf":Ljavax/xml/parsers/SAXParserFactory; */
try { // :try_start_0
com.jumptap.adtag.activity.JTVideo .initParams ( );
/* .line 350 */
(( javax.xml.parsers.SAXParserFactory ) v3 ).newSAXParser ( ); // invoke-virtual {v3}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
/* .line 351 */
/* .local v2, "saxParser":Ljavax/xml/parsers/SAXParser; */
(( javax.xml.parsers.SAXParser ) v2 ).getXMLReader ( ); // invoke-virtual {v2}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
/* .line 353 */
/* .local v1, "mainReader":Lorg/xml/sax/XMLReader; */
/* new-instance v5, Lcom/jumptap/adtag/activity/JTVideo$2; */
/* invoke-direct {v5}, Lcom/jumptap/adtag/activity/JTVideo$2;-><init>()V */
/* .line 413 */
/* new-instance v4, Ljava/io/StringReader; */
/* invoke-direct {v4, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V */
/* .line 414 */
/* .local v4, "stringReader":Ljava/io/StringReader; */
/* new-instance v5, Lorg/xml/sax/InputSource; */
/* invoke-direct {v5, v4}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 415 */
} // .end local v1 # "mainReader":Lorg/xml/sax/XMLReader;
} // .end local v2 # "saxParser":Ljavax/xml/parsers/SAXParser;
} // .end local v4 # "stringReader":Ljava/io/StringReader;
/* :catch_0 */
/* move-exception v0 */
/* .line 416 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v5 = "JtAd"; // const-string v5, "JtAd"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "The following execption was thrown while SAX parsing : "; // const-string v7, "The following execption was thrown while SAX parsing : "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v5,v6 );
/* .line 417 */
final String v5 = "JtAd"; // const-string v5, "JtAd"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "SAX fail to parse content:"; // const-string v7, "SAX fail to parse content:"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p0 ); // invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v5,v6 );
} // .end method
public static Boolean prepare ( com.jumptap.adtag.JtAdWidgetSettings p0, android.content.Context p1 ) {
/* .locals 1 */
/* .param p0, "widgetSettings" # Lcom/jumptap/adtag/JtAdWidgetSettings; */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 63 */
int v0 = 0; // const/4 v0, 0x0
v0 = com.jumptap.adtag.activity.JTVideo .prepare ( p0,p1,v0 );
} // .end method
protected static Boolean prepare ( com.jumptap.adtag.JtAdWidgetSettings p0, android.content.Context p1, Boolean p2 ) {
/* .locals 17 */
/* .param p0, "widgetSettings" # Lcom/jumptap/adtag/JtAdWidgetSettings; */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "shouldForceDownload" # Z */
/* .prologue */
/* .line 76 */
/* invoke-static/range {p1 ..p1}, Lcom/jumptap/adtag/db/DBManager;->getInstance(Landroid/content/Context;)Lcom/jumptap/adtag/db/DBManager; */
/* .line 77 */
/* .local v4, "dbManager":Lcom/jumptap/adtag/db/DBManager; */
/* new-instance v2, Lcom/jumptap/adtag/utils/JtAdUrlBuilder; */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* invoke-direct {v2, v0, v1}, Lcom/jumptap/adtag/utils/JtAdUrlBuilder;-><init>(Lcom/jumptap/adtag/JtAdWidgetSettings;Landroid/content/Context;)V */
/* .line 80 */
/* .local v2, "adUrlBuilder":Lcom/jumptap/adtag/utils/JtAdUrlBuilder; */
v8 = com.jumptap.adtag.activity.JTVideo .isVideoInCache ( v4 );
/* .line 81 */
/* .local v8, "isVideoInCache":Z */
final String v13 = "JtAd"; // const-string v13, "JtAd"
/* new-instance v14, Ljava/lang/StringBuilder; */
/* invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V */
final String v15 = "in prepare shouldForceDownload= "; // const-string v15, "in prepare shouldForceDownload= "
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move/from16 v0, p2 */
(( java.lang.StringBuilder ) v14 ).append ( v0 ); // invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v15 = " isVideoInCache="; // const-string v15, " isVideoInCache="
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).append ( v8 ); // invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v13,v14 );
/* .line 83 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 85 */
(( com.jumptap.adtag.db.DBManager ) v4 ).deleteAllVideoCacheItems ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/db/DBManager;->deleteAllVideoCacheItems()V
/* .line 88 */
} // :cond_0
int v11 = 0; // const/4 v11, 0x0
/* .line 90 */
/* .local v11, "retVal":Z */
if ( v8 != null) { // if-eqz v8, :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 91 */
} // :cond_1
final String v13 = "JtAd"; // const-string v13, "JtAd"
final String v14 = "video not found in cache .downloading new video"; // const-string v14, "video not found in cache .downloading new video"
android.util.Log .d ( v13,v14 );
/* .line 93 */
/* new-instance v13, Landroid/webkit/WebView; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v13, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
final String v14 = "type=video&specific=false"; // const-string v14, "type=video&specific=false"
(( com.jumptap.adtag.utils.JtAdUrlBuilder ) v2 ).getAdUrl ( v13, v14 ); // invoke-virtual {v2, v13, v14}, Lcom/jumptap/adtag/utils/JtAdUrlBuilder;->getAdUrl(Landroid/webkit/WebView;Ljava/lang/String;)Ljava/lang/String;
/* .line 96 */
/* .local v3, "asVideoUrl":Ljava/lang/String; */
/* move-object/from16 v0, p1 */
com.jumptap.adtag.activity.JTVideo .getAdContent ( v0,v3 );
/* .line 97 */
/* move-object/from16 v0, p1 */
com.jumptap.adtag.activity.JTVideo .runSaveVideoThread ( v4,v0 );
/* .line 141 */
} // :goto_0
/* move-object/from16 v0, p1 */
com.jumptap.adtag.activity.JTVideo .maintainDB ( v4,v0 );
/* .line 143 */
/* .line 102 */
} // .end local v3 # "asVideoUrl":Ljava/lang/String;
} // :cond_2
com.jumptap.adtag.activity.JTVideo .getLastItem ( v4 );
/* .line 103 */
/* .local v9, "item":Lcom/jumptap/adtag/media/VideoCacheItem; */
(( com.jumptap.adtag.media.VideoCacheItem ) v9 ).getAdID ( ); // invoke-virtual {v9}, Lcom/jumptap/adtag/media/VideoCacheItem;->getAdID()Ljava/lang/String;
/* .line 104 */
/* .local v12, "savedAdID":Ljava/lang/String; */
final String v13 = "JtAd"; // const-string v13, "JtAd"
/* new-instance v14, Ljava/lang/StringBuilder; */
/* invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V */
final String v15 = "video found in cache adid = "; // const-string v15, "video found in cache adid = "
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).append ( v12 ); // invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v13,v14 );
/* .line 107 */
/* new-instance v13, Landroid/webkit/WebView; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v13, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* new-instance v14, Ljava/lang/StringBuilder; */
/* invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V */
final String v15 = "type=video&specific=true&adid="; // const-string v15, "type=video&specific=true&adid="
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).append ( v12 ); // invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.jumptap.adtag.utils.JtAdUrlBuilder ) v2 ).getAdUrl ( v13, v14 ); // invoke-virtual {v2, v13, v14}, Lcom/jumptap/adtag/utils/JtAdUrlBuilder;->getAdUrl(Landroid/webkit/WebView;Ljava/lang/String;)Ljava/lang/String;
/* .line 108 */
/* .restart local v3 # "asVideoUrl":Ljava/lang/String; */
/* move-object/from16 v0, p1 */
com.jumptap.adtag.activity.JTVideo .getAdContent ( v0,v3 );
/* .line 109 */
final String v13 = "JtAd"; // const-string v13, "JtAd"
/* new-instance v14, Ljava/lang/StringBuilder; */
/* invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V */
final String v15 = "TL return adid = "; // const-string v15, "TL return adid = "
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v15 = com.jumptap.adtag.activity.JTVideo.adId;
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v13,v14 );
/* .line 112 */
v13 = com.jumptap.adtag.activity.JTVideo.adId;
v13 = (( java.lang.String ) v12 ).equals ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v13 != null) { // if-eqz v13, :cond_3
/* .line 113 */
final String v13 = "JtAd"; // const-string v13, "JtAd"
final String v14 = "prepering video from cache"; // const-string v14, "prepering video from cache"
android.util.Log .d ( v13,v14 );
/* .line 115 */
/* new-instance v13, Ljava/io/File; */
/* invoke-virtual/range {p1 ..p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File; */
/* new-instance v15, Ljava/lang/StringBuilder; */
/* invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V */
v16 = com.jumptap.adtag.activity.JTVideo.adId;
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = ".dat"; // const-string v16, ".dat"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v13, v14, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 116 */
com.jumptap.adtag.media.JTMediaPlayer .getInstance ( );
/* .line 119 */
/* .local v10, "mediaPlayer":Lcom/jumptap/adtag/media/JTMediaPlayer; */
try { // :try_start_0
/* new-instance v7, Ljava/io/FileInputStream; */
v13 = com.jumptap.adtag.activity.JTVideo.downloadingMediaFile;
/* invoke-direct {v7, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 120 */
/* .local v7, "in":Ljava/io/FileInputStream; */
(( java.io.FileInputStream ) v7 ).getFD ( ); // invoke-virtual {v7}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;
/* .line 121 */
/* .local v6, "fd":Ljava/io/FileDescriptor; */
(( com.jumptap.adtag.media.JTMediaPlayer ) v10 ).prepareVideo ( v6 ); // invoke-virtual {v10, v6}, Lcom/jumptap/adtag/media/JTMediaPlayer;->prepareVideo(Ljava/io/FileDescriptor;)V
/* .line 122 */
(( java.io.FileInputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 123 */
int v11 = 1; // const/4 v11, 0x1
/* goto/16 :goto_0 */
/* .line 124 */
} // .end local v6 # "fd":Ljava/io/FileDescriptor;
} // .end local v7 # "in":Ljava/io/FileInputStream;
/* :catch_0 */
/* move-exception v5 */
/* .line 125 */
/* .local v5, "e":Ljava/io/FileNotFoundException; */
final String v13 = "JtAd"; // const-string v13, "JtAd"
final String v14 = "Fail to play video"; // const-string v14, "Fail to play video"
android.util.Log .e ( v13,v14,v5 );
/* goto/16 :goto_0 */
/* .line 126 */
} // .end local v5 # "e":Ljava/io/FileNotFoundException;
/* :catch_1 */
/* move-exception v5 */
/* .line 127 */
/* .local v5, "e":Ljava/io/IOException; */
final String v13 = "JtAd"; // const-string v13, "JtAd"
final String v14 = "Fail to play video"; // const-string v14, "Fail to play video"
android.util.Log .e ( v13,v14,v5 );
/* goto/16 :goto_0 */
/* .line 132 */
} // .end local v5 # "e":Ljava/io/IOException;
} // .end local v10 # "mediaPlayer":Lcom/jumptap/adtag/media/JTMediaPlayer;
} // :cond_3
final String v13 = "JtAd"; // const-string v13, "JtAd"
final String v14 = "video in cache is not valid downloading new file"; // const-string v14, "video in cache is not valid downloading new file"
android.util.Log .d ( v13,v14 );
/* .line 134 */
/* move-object/from16 v0, p1 */
com.jumptap.adtag.activity.JTVideo .deleteVideo ( v9,v4,v0 );
/* .line 136 */
int v13 = 1; // const/4 v13, 0x1
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
com.jumptap.adtag.activity.JTVideo .prepare ( v0,v1,v13 );
/* goto/16 :goto_0 */
} // .end method
private static void runSaveVideoThread ( com.jumptap.adtag.db.DBManager p0, android.content.Context p1 ) {
/* .locals 3 */
/* .param p0, "dbManager" # Lcom/jumptap/adtag/db/DBManager; */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 216 */
v1 = com.jumptap.adtag.activity.JTVideo.videoUrl;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = com.jumptap.adtag.activity.JTVideo.videoUrl;
final String v2 = ""; // const-string v2, ""
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 217 */
/* new-instance v0, Lcom/jumptap/adtag/activity/JTVideo$1; */
/* invoke-direct {v0, p1, p0}, Lcom/jumptap/adtag/activity/JTVideo$1;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/db/DBManager;)V */
/* .line 240 */
/* .local v0, "r":Ljava/lang/Runnable; */
/* new-instance v1, Ljava/lang/Thread; */
/* invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* .line 245 */
} // .end local v0 # "r":Ljava/lang/Runnable;
} // :goto_0
return;
/* .line 243 */
} // :cond_0
final String v1 = "JtAd"; // const-string v1, "JtAd"
final String v2 = "cannot save video since url is empty"; // const-string v2, "cannot save video since url is empty"
android.util.Log .e ( v1,v2 );
} // .end method
public static void saveVideoToFile ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 10 */
/* .param p0, "mediaUrl" # Ljava/lang/String; */
/* .param p1, "context" # Landroid/content/Context; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 254 */
/* new-instance v6, Ljava/net/URL; */
/* invoke-direct {v6, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
(( java.net.URL ) v6 ).openConnection ( ); // invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 255 */
/* .local v1, "cn":Ljava/net/URLConnection; */
(( java.net.URLConnection ) v1 ).connect ( ); // invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V
/* .line 256 */
(( java.net.URLConnection ) v1 ).getInputStream ( ); // invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
/* .line 257 */
/* .local v4, "stream":Ljava/io/InputStream; */
/* if-nez v4, :cond_0 */
/* .line 258 */
final String v6 = "JtAd"; // const-string v6, "JtAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Unable to create InputStream for mediaUrl:"; // const-string v8, "Unable to create InputStream for mediaUrl:"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( p0 ); // invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v6,v7 );
/* .line 283 */
} // :goto_0
return;
/* .line 262 */
} // :cond_0
/* new-instance v6, Ljava/io/File; */
(( android.content.Context ) p1 ).getCacheDir ( ); // invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
v9 = com.jumptap.adtag.activity.JTVideo.adId;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v9 = ".dat"; // const-string v9, ".dat"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 264 */
v6 = com.jumptap.adtag.activity.JTVideo.downloadingMediaFile;
v6 = (( java.io.File ) v6 ).exists ( ); // invoke-virtual {v6}, Ljava/io/File;->exists()Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 265 */
v6 = com.jumptap.adtag.activity.JTVideo.downloadingMediaFile;
(( java.io.File ) v6 ).delete ( ); // invoke-virtual {v6}, Ljava/io/File;->delete()Z
/* .line 269 */
} // :cond_1
/* new-instance v3, Ljava/io/FileOutputStream; */
v6 = com.jumptap.adtag.activity.JTVideo.downloadingMediaFile;
/* invoke-direct {v3, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 270 */
/* .local v3, "out":Ljava/io/FileOutputStream; */
/* const/16 v6, 0x4000 */
/* new-array v0, v6, [B */
/* .line 271 */
/* .local v0, "buf":[B */
int v5 = 0; // const/4 v5, 0x0
/* .line 273 */
/* .local v5, "totalBytesRead":I */
} // :goto_1
v2 = (( java.io.InputStream ) v4 ).read ( v0 ); // invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I
/* .line 274 */
/* .local v2, "numread":I */
/* if-gtz v2, :cond_2 */
/* .line 281 */
(( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
/* .line 282 */
final String v6 = "JtAd"; // const-string v6, "JtAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Done saving file "; // const-string v8, "Done saving file "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v8 = com.jumptap.adtag.activity.JTVideo.adId;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = ".dat, total"; // const-string v8, ".dat, total"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v8 = " Kb read"; // const-string v8, " Kb read"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v6,v7 );
/* .line 276 */
} // :cond_2
int v6 = 0; // const/4 v6, 0x0
(( java.io.FileOutputStream ) v3 ).write ( v0, v6, v2 ); // invoke-virtual {v3, v0, v6, v2}, Ljava/io/FileOutputStream;->write([BII)V
/* .line 277 */
/* add-int/2addr v5, v2 */
/* .line 278 */
/* div-int/lit16 v6, v5, 0x3e8 */
} // .end method
