public class com.ansca.corona.MediaManager {
	 /* .source "MediaManager.java" */
	 /* # static fields */
	 private static final Integer SOUNDPOOL_STREAMS;
	 /* # instance fields */
	 private com.ansca.corona.CoronaActivity myActivity;
	 private com.ansca.corona.AudioRecorder myAudioRecorder;
	 private java.util.HashMap myIdToSoundPoolIdMap;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.util.HashMap myMediaPlayers;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Landroid/media/MediaPlayer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.media.SoundPool mySoundPool;
private Integer myVideoId;
private Float myVolume;
/* # direct methods */
public com.ansca.corona.MediaManager ( ) {
/* .locals 0 */
/* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 33 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 34 */
this.myActivity = p1;
/* .line 35 */
return;
} // .end method
static java.util.HashMap access$000 ( com.ansca.corona.MediaManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/MediaManager; */
/* .prologue */
/* .line 21 */
v0 = this.myMediaPlayers;
} // .end method
static com.ansca.corona.CoronaActivity access$100 ( com.ansca.corona.MediaManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/MediaManager; */
/* .prologue */
/* .line 21 */
v0 = this.myActivity;
} // .end method
static Integer access$200 ( com.ansca.corona.MediaManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/MediaManager; */
/* .prologue */
/* .line 21 */
/* iget v0, p0, Lcom/ansca/corona/MediaManager;->myVideoId:I */
} // .end method
/* # virtual methods */
public com.ansca.corona.AudioRecorder getAudioRecorder ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 298 */
v0 = this.myAudioRecorder;
/* if-nez v0, :cond_0 */
/* .line 299 */
/* new-instance v0, Lcom/ansca/corona/AudioRecorder; */
v1 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v1 ).getHandler ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* invoke-direct {v0, v1}, Lcom/ansca/corona/AudioRecorder;-><init>(Landroid/os/Handler;)V */
this.myAudioRecorder = v0;
/* .line 300 */
} // :cond_0
v0 = this.myAudioRecorder;
(( com.ansca.corona.AudioRecorder ) v0 ).setId ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/AudioRecorder;->setId(I)V
/* .line 301 */
v0 = this.myAudioRecorder;
} // .end method
public Float getVolume ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 293 */
/* iget v0, p0, Lcom/ansca/corona/MediaManager;->myVolume:F */
} // .end method
public void init ( ) {
/* .locals 4 */
/* .prologue */
/* .line 39 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.myIdToSoundPoolIdMap = v0;
/* .line 40 */
/* new-instance v0, Landroid/media/SoundPool; */
int v1 = 4; // const/4 v1, 0x4
int v2 = 3; // const/4 v2, 0x3
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v0, v1, v2, v3}, Landroid/media/SoundPool;-><init>(III)V */
this.mySoundPool = v0;
/* .line 42 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.myMediaPlayers = v0;
/* .line 43 */
return;
} // .end method
public void loadEventSound ( Integer p0, java.lang.String p1 ) {
/* .locals 7 */
/* .param p1, "id" # I */
/* .param p2, "inSoundName" # Ljava/lang/String; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* .line 122 */
final String v4 = "/"; // const-string v4, "/"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 124 */
v4 = this.mySoundPool;
v4 = (( android.media.SoundPool ) v4 ).load ( p2, v5 ); // invoke-virtual {v4, p2, v5}, Landroid/media/SoundPool;->load(Ljava/lang/String;I)I
java.lang.Integer .valueOf ( v4 );
/* .line 125 */
/* .local v3, "soundId":Ljava/lang/Integer; */
v4 = this.myIdToSoundPoolIdMap;
/* new-instance v5, Ljava/lang/Integer; */
/* invoke-direct {v5, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v4 ).put ( v5, v3 ); // invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 139 */
} // .end local v3 # "soundId":Ljava/lang/Integer;
} // :goto_0
return;
/* .line 128 */
} // :cond_0
v4 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v4 ).getAssets ( ); // invoke-virtual {v4}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 131 */
/* .local v2, "mgr":Landroid/content/res/AssetManager; */
try { // :try_start_0
(( android.content.res.AssetManager ) v2 ).openFd ( p2 ); // invoke-virtual {v2, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
/* .line 133 */
/* .local v1, "fd":Landroid/content/res/AssetFileDescriptor; */
v4 = this.mySoundPool;
int v5 = 1; // const/4 v5, 0x1
v4 = (( android.media.SoundPool ) v4 ).load ( v1, v5 ); // invoke-virtual {v4, v1, v5}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
java.lang.Integer .valueOf ( v4 );
/* .line 134 */
/* .restart local v3 # "soundId":Ljava/lang/Integer; */
v4 = this.myIdToSoundPoolIdMap;
/* new-instance v5, Ljava/lang/Integer; */
/* invoke-direct {v5, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v4 ).put ( v5, v3 ); // invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 135 */
} // .end local v1 # "fd":Landroid/content/res/AssetFileDescriptor;
} // .end local v3 # "soundId":Ljava/lang/Integer;
/* :catch_0 */
/* move-exception v0 */
/* .line 136 */
/* .local v0, "e":Ljava/io/IOException; */
v4 = java.lang.System.out;
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "loadSound requested nonexistent: "; // const-string v6, "loadSound requested nonexistent: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v4 ).println ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // .end method
public void loadSound ( Integer p0, java.lang.String p1 ) {
/* .locals 8 */
/* .param p1, "id" # I */
/* .param p2, "soundName" # Ljava/lang/String; */
/* .prologue */
/* .line 59 */
int v2 = 0; // const/4 v2, 0x0
/* .line 61 */
/* .local v2, "mp":Landroid/media/MediaPlayer; */
try { // :try_start_0
final String v5 = "/"; // const-string v5, "/"
v5 = (( java.lang.String ) p2 ).startsWith ( v5 ); // invoke-virtual {p2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v5, :cond_0 */
final String v5 = "http:"; // const-string v5, "http:"
v5 = (( java.lang.String ) p2 ).startsWith ( v5 ); // invoke-virtual {p2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 63 */
} // :cond_0
v5 = android.webkit.URLUtil .isNetworkUrl ( p2 );
/* if-nez v5, :cond_3 */
/* .line 64 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 65 */
/* .local v0, "file":Ljava/io/File; */
v5 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v5, :cond_1 */
/* .line 66 */
v5 = java.lang.System.err;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Could not load sound "; // const-string v7, "Could not load sound "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 118 */
} // .end local v0 # "file":Ljava/io/File;
} // :goto_0
return;
/* .line 70 */
/* .restart local v0 # "file":Ljava/io/File; */
} // :cond_1
/* new-instance v1, Ljava/io/FileInputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 71 */
/* .local v1, "fis":Ljava/io/FileInputStream; */
/* new-instance v3, Landroid/media/MediaPlayer; */
/* invoke-direct {v3}, Landroid/media/MediaPlayer;-><init>()V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 72 */
} // .end local v2 # "mp":Landroid/media/MediaPlayer;
/* .local v3, "mp":Landroid/media/MediaPlayer; */
try { // :try_start_1
(( java.io.FileInputStream ) v1 ).getFD ( ); // invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;
(( android.media.MediaPlayer ) v3 ).setDataSource ( v5 ); // invoke-virtual {v3, v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V
/* .line 73 */
int v5 = 3; // const/4 v5, 0x3
(( android.media.MediaPlayer ) v3 ).setAudioStreamType ( v5 ); // invoke-virtual {v3, v5}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
/* .line 74 */
(( android.media.MediaPlayer ) v3 ).prepare ( ); // invoke-virtual {v3}, Landroid/media/MediaPlayer;->prepare()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* move-object v2, v3 */
/* .line 81 */
} // .end local v0 # "file":Ljava/io/File;
} // .end local v1 # "fis":Ljava/io/FileInputStream;
} // .end local v3 # "mp":Landroid/media/MediaPlayer;
/* .restart local v2 # "mp":Landroid/media/MediaPlayer; */
} // :cond_2
} // :goto_1
/* if-nez v2, :cond_4 */
/* .line 82 */
try { // :try_start_2
v5 = java.lang.System.err;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Could not load sound "; // const-string v7, "Could not load sound "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v5 ).println ( v6 ); // invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 115 */
/* :catch_0 */
/* move-exception v5 */
/* .line 76 */
} // :cond_3
android.net.Uri .parse ( p2 );
/* .line 77 */
/* .local v4, "uri":Landroid/net/Uri; */
com.ansca.corona.Controller .getActivity ( );
android.media.MediaPlayer .create ( v5,v4 );
/* .line 86 */
} // .end local v4 # "uri":Landroid/net/Uri;
} // :cond_4
/* new-instance v5, Lcom/ansca/corona/MediaManager$1; */
/* invoke-direct {v5, p0, p1}, Lcom/ansca/corona/MediaManager$1;-><init>(Lcom/ansca/corona/MediaManager;I)V */
(( android.media.MediaPlayer ) v2 ).setOnErrorListener ( v5 ); // invoke-virtual {v2, v5}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
/* .line 101 */
/* new-instance v5, Lcom/ansca/corona/MediaManager$2; */
/* invoke-direct {v5, p0, p1}, Lcom/ansca/corona/MediaManager$2;-><init>(Lcom/ansca/corona/MediaManager;I)V */
(( android.media.MediaPlayer ) v2 ).setOnCompletionListener ( v5 ); // invoke-virtual {v2, v5}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
/* .line 114 */
v5 = this.myMediaPlayers;
/* new-instance v6, Ljava/lang/Integer; */
/* invoke-direct {v6, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v5 ).put ( v6, v2 ); // invoke-virtual {v5, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 115 */
} // .end local v2 # "mp":Landroid/media/MediaPlayer;
/* .restart local v0 # "file":Ljava/io/File; */
/* .restart local v1 # "fis":Ljava/io/FileInputStream; */
/* .restart local v3 # "mp":Landroid/media/MediaPlayer; */
/* :catch_1 */
/* move-exception v5 */
/* move-object v2, v3 */
} // .end local v3 # "mp":Landroid/media/MediaPlayer;
/* .restart local v2 # "mp":Landroid/media/MediaPlayer; */
} // .end method
public void pauseAll ( ) {
/* .locals 3 */
/* .prologue */
/* .line 214 */
v2 = this.myMediaPlayers;
(( java.util.HashMap ) v2 ).keySet ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
/* .local v0, "i$":Ljava/util/Iterator; */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Ljava/lang/Integer; */
/* .line 215 */
/* .local v1, "key":Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( com.ansca.corona.MediaManager ) p0 ).pauseMedia ( v2 ); // invoke-virtual {p0, v2}, Lcom/ansca/corona/MediaManager;->pauseMedia(I)V
/* .line 218 */
} // .end local v1 # "key":Ljava/lang/Integer;
} // :cond_0
v2 = this.myIdToSoundPoolIdMap;
(( java.util.HashMap ) v2 ).keySet ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Ljava/lang/Integer; */
/* .line 219 */
/* .restart local v1 # "key":Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( com.ansca.corona.MediaManager ) p0 ).pauseMedia ( v2 ); // invoke-virtual {p0, v2}, Lcom/ansca/corona/MediaManager;->pauseMedia(I)V
/* .line 222 */
} // .end local v1 # "key":Ljava/lang/Integer;
} // :cond_1
return;
} // .end method
public void pauseMedia ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 178 */
v2 = this.myMediaPlayers;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/MediaPlayer; */
/* .line 179 */
/* .local v0, "mp":Landroid/media/MediaPlayer; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 181 */
try { // :try_start_0
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 192 */
} // :cond_0
} // :goto_0
return;
/* .line 187 */
} // :cond_1
v2 = this.myIdToSoundPoolIdMap;
/* new-instance v3, Ljava/lang/Integer; */
/* invoke-direct {v3, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
/* .line 188 */
/* .local v1, "soundId":Ljava/lang/Integer; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 189 */
v2 = this.mySoundPool;
v3 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v2 ).pause ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/SoundPool;->pause(I)V
/* .line 182 */
} // .end local v1 # "soundId":Ljava/lang/Integer;
/* :catch_0 */
/* move-exception v2 */
} // .end method
public void playMedia ( Integer p0, Boolean p1 ) {
/* .locals 13 */
/* .param p1, "id" # I */
/* .param p2, "loop" # Z */
/* .prologue */
int v3 = 3; // const/4 v3, 0x3
/* .line 143 */
v0 = this.myMediaPlayers;
/* new-instance v1, Ljava/lang/Integer; */
/* invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v8, Landroid/media/MediaPlayer; */
/* .line 144 */
/* .local v8, "mp":Landroid/media/MediaPlayer; */
if ( v8 != null) { // if-eqz v8, :cond_1
/* .line 145 */
(( android.media.MediaPlayer ) v8 ).setLooping ( p2 ); // invoke-virtual {v8, p2}, Landroid/media/MediaPlayer;->setLooping(Z)V
/* .line 147 */
(( android.media.MediaPlayer ) v8 ).start ( ); // invoke-virtual {v8}, Landroid/media/MediaPlayer;->start()V
/* .line 161 */
} // :cond_0
} // :goto_0
return;
/* .line 149 */
} // :cond_1
v0 = this.myIdToSoundPoolIdMap;
/* new-instance v1, Ljava/lang/Integer; */
/* invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v10, Ljava/lang/Integer; */
/* .line 150 */
/* .local v10, "soundId":Ljava/lang/Integer; */
if ( v10 != null) { // if-eqz v10, :cond_0
/* .line 151 */
v0 = this.myActivity;
final String v1 = "audio"; // const-string v1, "audio"
(( com.ansca.corona.CoronaActivity ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v7, Landroid/media/AudioManager; */
/* .line 152 */
/* .local v7, "mgr":Landroid/media/AudioManager; */
v0 = (( android.media.AudioManager ) v7 ).getStreamVolume ( v3 ); // invoke-virtual {v7, v3}, Landroid/media/AudioManager;->getStreamVolume(I)I
/* int-to-float v11, v0 */
/* .line 153 */
/* .local v11, "streamVolume":F */
v0 = (( android.media.AudioManager ) v7 ).getStreamMaxVolume ( v3 ); // invoke-virtual {v7, v3}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I
/* int-to-float v12, v0 */
/* .line 154 */
/* .local v12, "streamVolumeMax":F */
/* div-float v2, v11, v12 */
/* .line 156 */
/* .local v2, "volume":F */
v0 = this.mySoundPool;
v1 = (( java.lang.Integer ) v10 ).intValue ( ); // invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move v3, v2 */
v9 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 157 */
/* .local v9, "result":I */
/* if-nez v9, :cond_0 */
/* .line 158 */
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "playSound failed "; // const-string v3, "playSound failed "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v10 ); // invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // .end method
public void playVideo ( Integer p0, java.lang.String p1, Boolean p2 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "path" # Ljava/lang/String; */
/* .param p3, "mediaControlsEnabled" # Z */
/* .prologue */
/* .line 238 */
(( com.ansca.corona.MediaManager ) p0 ).pauseAll ( ); // invoke-virtual {p0}, Lcom/ansca/corona/MediaManager;->pauseAll()V
/* .line 240 */
/* iput p1, p0, Lcom/ansca/corona/MediaManager;->myVideoId:I */
/* .line 241 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/MediaManager$3; */
/* invoke-direct {v1, p0, p2, p3}, Lcom/ansca/corona/MediaManager$3;-><init>(Lcom/ansca/corona/MediaManager;Ljava/lang/String;Z)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 271 */
return;
} // .end method
public void release ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 47 */
v0 = this.mySoundPool;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 48 */
v0 = this.mySoundPool;
(( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
/* .line 49 */
this.mySoundPool = v1;
/* .line 50 */
this.myMediaPlayers = v1;
/* .line 51 */
this.myIdToSoundPoolIdMap = v1;
/* .line 53 */
} // :cond_0
return;
} // .end method
public void resumeAll ( ) {
/* .locals 3 */
/* .prologue */
/* .line 226 */
v2 = this.myMediaPlayers;
(( java.util.HashMap ) v2 ).keySet ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
/* .local v0, "i$":Ljava/util/Iterator; */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Ljava/lang/Integer; */
/* .line 227 */
/* .local v1, "key":Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( com.ansca.corona.MediaManager ) p0 ).resumeMedia ( v2 ); // invoke-virtual {p0, v2}, Lcom/ansca/corona/MediaManager;->resumeMedia(I)V
/* .line 230 */
} // .end local v1 # "key":Ljava/lang/Integer;
} // :cond_0
v2 = this.myIdToSoundPoolIdMap;
(( java.util.HashMap ) v2 ).keySet ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v1, Ljava/lang/Integer; */
/* .line 231 */
/* .restart local v1 # "key":Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( com.ansca.corona.MediaManager ) p0 ).resumeMedia ( v2 ); // invoke-virtual {p0, v2}, Lcom/ansca/corona/MediaManager;->resumeMedia(I)V
/* .line 234 */
} // .end local v1 # "key":Ljava/lang/Integer;
} // :cond_1
return;
} // .end method
public void resumeMedia ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 196 */
v2 = this.myMediaPlayers;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/MediaPlayer; */
/* .line 197 */
/* .local v0, "mp":Landroid/media/MediaPlayer; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 199 */
try { // :try_start_0
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 210 */
} // :cond_0
} // :goto_0
return;
/* .line 205 */
} // :cond_1
v2 = this.myIdToSoundPoolIdMap;
/* new-instance v3, Ljava/lang/Integer; */
/* invoke-direct {v3, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
/* .line 206 */
/* .local v1, "soundId":Ljava/lang/Integer; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 207 */
v2 = this.mySoundPool;
v3 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v2 ).resume ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/SoundPool;->resume(I)V
/* .line 200 */
} // .end local v1 # "soundId":Ljava/lang/Integer;
/* :catch_0 */
/* move-exception v2 */
} // .end method
public void setVolume ( Integer p0, Float p1 ) {
/* .locals 3 */
/* .param p1, "id" # I */
/* .param p2, "volume" # F */
/* .prologue */
/* .line 275 */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v1, p2, v1 */
/* if-gez v1, :cond_0 */
/* .line 276 */
int p2 = 0; // const/4 p2, 0x0
/* .line 277 */
} // :cond_0
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v1, p2, v1 */
/* if-lez v1, :cond_1 */
/* .line 278 */
/* const/high16 p2, 0x3f800000 # 1.0f */
/* .line 280 */
} // :cond_1
v1 = this.myMediaPlayers;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/MediaPlayer; */
/* .line 282 */
/* .local v0, "mp":Landroid/media/MediaPlayer; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 283 */
(( android.media.MediaPlayer ) v0 ).setVolume ( p2, p2 ); // invoke-virtual {v0, p2, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* .line 285 */
} // :cond_2
/* iput p2, p0, Lcom/ansca/corona/MediaManager;->myVolume:F */
/* .line 286 */
return;
} // .end method
public void stopMedia ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 165 */
v2 = this.myMediaPlayers;
/* new-instance v3, Ljava/lang/Integer; */
/* invoke-direct {v3, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/MediaPlayer; */
/* .line 166 */
/* .local v0, "mp":Landroid/media/MediaPlayer; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 167 */
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 174 */
} // :cond_0
} // :goto_0
return;
/* .line 169 */
} // :cond_1
v2 = this.myIdToSoundPoolIdMap;
/* new-instance v3, Ljava/lang/Integer; */
/* invoke-direct {v3, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
/* .line 170 */
/* .local v1, "soundId":Ljava/lang/Integer; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 171 */
v2 = this.mySoundPool;
v3 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v2 ).stop ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/SoundPool;->stop(I)V
} // .end method
