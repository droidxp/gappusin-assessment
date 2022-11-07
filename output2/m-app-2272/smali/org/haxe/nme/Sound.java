public class org.haxe.nme.Sound {
	 /* .source "Sound.java" */
	 /* # static fields */
	 private static org.haxe.nme.Sound instance;
	 private static android.content.Context mContext;
	 private static java.util.HashMap mSoundDuration;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Ljava/lang/Long;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static android.media.SoundPool mSoundPool;
private static java.util.HashMap mSoundProgress;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Long;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static Long mTimeStamp;
private static org.haxe.nme.ManagedMediaPlayer mediaPlayer;
private static java.lang.String mediaPlayerPath;
private static Boolean mediaPlayerWasPlaying;
/* # direct methods */
static org.haxe.nme.Sound ( ) {
/* .locals 2 */
/* .prologue */
/* .line 123 */
/* const-wide/16 v0, 0x0 */
/* sput-wide v0, Lorg/haxe/nme/Sound;->mTimeStamp:J */
return;
} // .end method
public org.haxe.nme.Sound ( ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 128 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 129 */
v0 = org.haxe.nme.Sound.instance;
/* if-nez v0, :cond_0 */
/* .line 130 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 131 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 132 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sput-wide v0, Lorg/haxe/nme/Sound;->mTimeStamp:J */
/* .line 133 */
/* new-instance v0, Landroid/media/SoundPool; */
/* const/16 v1, 0x8 */
int v2 = 3; // const/4 v2, 0x3
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v0, v1, v2, v3}, Landroid/media/SoundPool;-><init>(III)V */
/* .line 136 */
} // :cond_0
/* .line 137 */
/* .line 138 */
return;
} // .end method
public static void checkSoundCompletion ( ) {
/* .locals 10 */
/* .prologue */
/* .line 240 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v6 */
/* sget-wide v8, Lorg/haxe/nme/Sound;->mTimeStamp:J */
/* sub-long v0, v6, v8 */
/* .line 241 */
/* .local v0, "delta":J */
v6 = org.haxe.nme.Sound.mSoundProgress;
(( java.util.HashMap ) v6 ).entrySet ( ); // invoke-virtual {v6}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .local v3, "i$":Ljava/util/Iterator; */
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_0
/* check-cast v2, Ljava/util/Map$Entry; */
/* .line 242 */
/* .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Long;>;" */
/* check-cast v6, Ljava/lang/Long; */
(( java.lang.Long ) v6 ).longValue ( ); // invoke-virtual {v6}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
/* .line 243 */
/* .local v4, "val":J */
/* add-long v6, v4, v0 */
java.lang.Long .valueOf ( v6,v7 );
/* .line 246 */
} // .end local v2 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Long;>;"
} // .end local v4 # "val":J
} // :cond_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v6 */
/* sput-wide v6, Lorg/haxe/nme/Sound;->mTimeStamp:J */
/* .line 247 */
return;
} // .end method
private static android.media.MediaPlayer createMediaPlayer ( java.lang.String p0 ) {
/* .locals 10 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 282 */
int v3 = 0; // const/4 v3, 0x0
/* .line 283 */
/* .local v3, "mp":Landroid/media/MediaPlayer; */
v5 = org.haxe.nme.Sound .getMusicHandle ( p0 );
/* .line 284 */
/* .local v5, "resId":I */
/* if-gez v5, :cond_1 */
/* .line 285 */
int v8 = 0; // const/4 v8, 0x0
v8 = (( java.lang.String ) p0 ).charAt ( v8 ); // invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C
/* sget-char v9, Ljava/io/File;->separatorChar:C */
/* if-ne v8, v9, :cond_0 */
/* .line 287 */
try { // :try_start_0
/* new-instance v2, Ljava/io/FileInputStream; */
/* new-instance v8, Ljava/io/File; */
/* invoke-direct {v8, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v2, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 288 */
/* .local v2, "fis":Ljava/io/FileInputStream; */
(( java.io.FileInputStream ) v2 ).getFD ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;
/* .line 289 */
/* .local v1, "fd":Ljava/io/FileDescriptor; */
/* new-instance v4, Landroid/media/MediaPlayer; */
/* invoke-direct {v4}, Landroid/media/MediaPlayer;-><init>()V */
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 290 */
} // .end local v3 # "mp":Landroid/media/MediaPlayer;
/* .local v4, "mp":Landroid/media/MediaPlayer; */
try { // :try_start_1
(( android.media.MediaPlayer ) v4 ).setDataSource ( v1 ); // invoke-virtual {v4, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V
/* .line 291 */
(( android.media.MediaPlayer ) v4 ).prepare ( ); // invoke-virtual {v4}, Landroid/media/MediaPlayer;->prepare()V
/* :try_end_1 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_1 ..:try_end_1} :catch_3 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
/* move-object v3, v4 */
} // .end local v1 # "fd":Ljava/io/FileDescriptor;
} // .end local v2 # "fis":Ljava/io/FileInputStream;
} // .end local v4 # "mp":Landroid/media/MediaPlayer;
/* .restart local v3 # "mp":Landroid/media/MediaPlayer; */
} // :goto_0
/* move-object v7, v3 */
/* .line 307 */
} // :goto_1
/* .line 292 */
/* :catch_0 */
/* move-exception v0 */
/* .line 293 */
/* .local v0, "e":Ljava/io/FileNotFoundException; */
} // :goto_2
v8 = java.lang.System.out;
(( java.io.FileNotFoundException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
(( java.io.PrintStream ) v8 ).println ( v9 ); // invoke-virtual {v8, v9}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 295 */
} // .end local v0 # "e":Ljava/io/FileNotFoundException;
/* :catch_1 */
/* move-exception v0 */
/* .line 296 */
/* .local v0, "e":Ljava/io/IOException; */
} // :goto_3
v8 = java.lang.System.out;
(( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
(( java.io.PrintStream ) v8 ).println ( v9 ); // invoke-virtual {v8, v9}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 300 */
} // .end local v0 # "e":Ljava/io/IOException;
} // :cond_0
android.net.Uri .parse ( p0 );
/* .line 301 */
/* .local v6, "uri":Landroid/net/Uri; */
v7 = org.haxe.nme.Sound.mContext;
android.media.MediaPlayer .create ( v7,v6 );
/* .line 302 */
/* .line 304 */
} // .end local v6 # "uri":Landroid/net/Uri;
} // :cond_1
v7 = org.haxe.nme.Sound.mContext;
android.media.MediaPlayer .create ( v7,v5 );
/* .line 295 */
} // .end local v3 # "mp":Landroid/media/MediaPlayer;
/* .restart local v1 # "fd":Ljava/io/FileDescriptor; */
/* .restart local v2 # "fis":Ljava/io/FileInputStream; */
/* .restart local v4 # "mp":Landroid/media/MediaPlayer; */
/* :catch_2 */
/* move-exception v0 */
/* move-object v3, v4 */
} // .end local v4 # "mp":Landroid/media/MediaPlayer;
/* .restart local v3 # "mp":Landroid/media/MediaPlayer; */
/* .line 292 */
} // .end local v3 # "mp":Landroid/media/MediaPlayer;
/* .restart local v4 # "mp":Landroid/media/MediaPlayer; */
/* :catch_3 */
/* move-exception v0 */
/* move-object v3, v4 */
} // .end local v4 # "mp":Landroid/media/MediaPlayer;
/* .restart local v3 # "mp":Landroid/media/MediaPlayer; */
} // .end method
public static Boolean getComplete ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .prologue */
/* .line 389 */
v0 = org.haxe.nme.Sound.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.haxe.nme.Sound.mediaPlayerPath;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 390 */
v0 = org.haxe.nme.Sound.mediaPlayer;
/* iget-boolean v0, v0, Lorg/haxe/nme/ManagedMediaPlayer;->isComplete:Z */
/* .line 393 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Integer getDuration ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .prologue */
/* .line 347 */
int v0 = -1; // const/4 v0, -0x1
/* .line 348 */
/* .local v0, "duration":I */
v2 = org.haxe.nme.Sound.mediaPlayer;
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = org.haxe.nme.Sound.mediaPlayerPath;
v2 = (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 349 */
v2 = org.haxe.nme.Sound.mediaPlayer;
v0 = (( org.haxe.nme.ManagedMediaPlayer ) v2 ).getDuration ( ); // invoke-virtual {v2}, Lorg/haxe/nme/ManagedMediaPlayer;->getDuration()I
/* .line 358 */
} // :cond_0
} // :goto_0
/* .line 351 */
} // :cond_1
org.haxe.nme.Sound .createMediaPlayer ( p0 );
/* .line 352 */
/* .local v1, "mp":Landroid/media/MediaPlayer; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 353 */
v0 = (( android.media.MediaPlayer ) v1 ).getDuration ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I
/* .line 354 */
(( android.media.MediaPlayer ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V
} // .end method
public static Double getLeft ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .prologue */
/* .line 371 */
v0 = org.haxe.nme.Sound.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.haxe.nme.Sound.mediaPlayerPath;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 372 */
v0 = org.haxe.nme.Sound.mediaPlayer;
/* iget v0, v0, Lorg/haxe/nme/ManagedMediaPlayer;->leftVol:F */
/* float-to-double v0, v0 */
/* .line 375 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
/* const-wide/high16 v0, 0x3fe0000000000000L # 0.5 */
} // .end method
private static Integer getMusicHandle ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .prologue */
/* .line 275 */
v0 = org.haxe.nme.GameActivity .getResourceID ( p0 );
/* .line 276 */
/* .local v0, "id":I */
final String v1 = "Sound"; // const-string v1, "Sound"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Get music handle ------"; // const-string v3, "Get music handle ------"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = " = "; // const-string v3, " = "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 277 */
} // .end method
public static Integer getPosition ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .prologue */
/* .line 363 */
v0 = org.haxe.nme.Sound.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.haxe.nme.Sound.mediaPlayerPath;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 364 */
v0 = org.haxe.nme.Sound.mediaPlayer;
v0 = (( org.haxe.nme.ManagedMediaPlayer ) v0 ).getCurrentPosition ( ); // invoke-virtual {v0}, Lorg/haxe/nme/ManagedMediaPlayer;->getCurrentPosition()I
/* .line 366 */
} // :goto_0
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
} // .end method
public static Double getRight ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .prologue */
/* .line 380 */
v0 = org.haxe.nme.Sound.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.haxe.nme.Sound.mediaPlayerPath;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 381 */
v0 = org.haxe.nme.Sound.mediaPlayer;
/* iget v0, v0, Lorg/haxe/nme/ManagedMediaPlayer;->rightVol:F */
/* float-to-double v0, v0 */
/* .line 384 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
/* const-wide/high16 v0, 0x3fe0000000000000L # 0.5 */
} // .end method
public static Boolean getSoundComplete ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 8 */
/* .param p0, "inSoundID" # I */
/* .param p1, "inStreamID" # I */
/* .param p2, "inLoop" # I */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 250 */
v0 = org.haxe.nme.Sound.mSoundProgress;
java.lang.Integer .valueOf ( p1 );
v0 = (( java.util.HashMap ) v0 ).containsKey ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.haxe.nme.Sound.mSoundDuration;
java.lang.Integer .valueOf ( p0 );
v0 = (( java.util.HashMap ) v0 ).containsKey ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
} // :cond_0
/* move v0, v1 */
/* .line 254 */
} // :goto_0
} // :cond_1
v0 = org.haxe.nme.Sound.mSoundProgress;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v2 */
v0 = org.haxe.nme.Sound.mSoundDuration;
java.lang.Integer .valueOf ( p0 );
(( java.util.HashMap ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
/* int-to-long v6, p2 */
/* mul-long/2addr v4, v6 */
/* cmp-long v0, v2, v4 */
/* if-ltz v0, :cond_2 */
/* move v0, v1 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Integer getSoundHandle ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p0, "inFilename" # Ljava/lang/String; */
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
/* .line 170 */
v1 = org.haxe.nme.GameActivity .getResourceID ( p0 );
/* .line 171 */
/* .local v1, "id":I */
final String v3 = "Sound"; // const-string v3, "Sound"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Get sound handle ------"; // const-string v5, "Get sound handle ------"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = " = "; // const-string v5, " = "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 175 */
/* if-lez v1, :cond_0 */
/* .line 176 */
v3 = org.haxe.nme.Sound.mSoundPool;
v4 = org.haxe.nme.Sound.mContext;
v2 = (( android.media.SoundPool ) v3 ).load ( v4, v1, v6 ); // invoke-virtual {v3, v4, v1, v6}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
/* .line 177 */
/* .local v2, "index":I */
final String v3 = "Sound"; // const-string v3, "Sound"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Loaded index: "; // const-string v5, "Loaded index: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 184 */
} // :goto_0
v0 = org.haxe.nme.Sound .getDuration ( p0 );
/* .line 185 */
/* .local v0, "duration":I */
v3 = org.haxe.nme.Sound.mSoundDuration;
java.lang.Integer .valueOf ( v2 );
/* int-to-long v5, v0 */
java.lang.Long .valueOf ( v5,v6 );
(( java.util.HashMap ) v3 ).put ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 187 */
/* .line 179 */
} // .end local v0 # "duration":I
} // .end local v2 # "index":I
} // :cond_0
final String v3 = "Sound"; // const-string v3, "Sound"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Resource not found: "; // const-string v5, "Resource not found: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* neg-int v5, v1 */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 180 */
v3 = org.haxe.nme.Sound.mSoundPool;
v2 = (( android.media.SoundPool ) v3 ).load ( p0, v6 ); // invoke-virtual {v3, p0, v6}, Landroid/media/SoundPool;->load(Ljava/lang/String;I)I
/* .line 181 */
/* .restart local v2 # "index":I */
final String v3 = "Sound"; // const-string v3, "Sound"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Loaded index from path: "; // const-string v5, "Loaded index from path: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
} // .end method
public static java.lang.String getSoundPathByByteArray ( Object[] p0 ) {
/* .locals 7 */
/* .param p0, "data" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 197 */
final String v4 = "md5"; // const-string v4, "md5"
java.security.MessageDigest .getInstance ( v4 );
/* .line 198 */
/* .local v3, "messageDigest":Ljava/security/MessageDigest; */
(( java.security.MessageDigest ) v3 ).update ( p0 ); // invoke-virtual {v3, p0}, Ljava/security/MessageDigest;->update([B)V
/* .line 199 */
/* new-instance v4, Ljava/math/BigInteger; */
int v5 = 1; // const/4 v5, 0x1
(( java.security.MessageDigest ) v3 ).digest ( ); // invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B
/* invoke-direct {v4, v5, v6}, Ljava/math/BigInteger;-><init>(I[B)V */
/* const/16 v5, 0x10 */
(( java.math.BigInteger ) v4 ).toString ( v5 ); // invoke-virtual {v4, v5}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;
/* .line 200 */
/* .local v2, "md5":Ljava/lang/String; */
/* new-instance v0, Ljava/io/File; */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
v5 = org.haxe.nme.Sound.mContext;
(( android.content.Context ) v5 ).getCacheDir ( ); // invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v5 = "/"; // const-string v5, "/"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = ".wav"; // const-string v5, ".wav"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 203 */
/* .local v0, "file":Ljava/io/File; */
v4 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v4, :cond_0 */
/* .line 204 */
final String v4 = "Sound"; // const-string v4, "Sound"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Created temp sound file :"; // const-string v6, "Created temp sound file :"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v5 );
/* .line 205 */
/* new-instance v1, Ljava/io/FileOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 206 */
/* .local v1, "fileOutputStream":Ljava/io/FileOutputStream; */
(( java.io.FileOutputStream ) v1 ).write ( p0 ); // invoke-virtual {v1, p0}, Ljava/io/FileOutputStream;->write([B)V
/* .line 207 */
(( java.io.FileOutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V
/* .line 208 */
(( java.io.FileOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
/* .line 213 */
} // .end local v1 # "fileOutputStream":Ljava/io/FileOutputStream;
} // :goto_0
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 210 */
} // :cond_0
final String v4 = "Sound"; // const-string v4, "Sound"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Opened temp sound file :"; // const-string v6, "Opened temp sound file :"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v5 );
} // .end method
public static Integer getSoundPosition ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .param p0, "inSoundID" # I */
/* .param p1, "inStreamID" # I */
/* .param p2, "inLoop" # I */
/* .prologue */
/* .line 258 */
v4 = org.haxe.nme.Sound.mSoundProgress;
java.lang.Integer .valueOf ( p1 );
v4 = (( java.util.HashMap ) v4 ).containsKey ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
v4 = org.haxe.nme.Sound.mSoundDuration;
java.lang.Integer .valueOf ( p0 );
v4 = (( java.util.HashMap ) v4 ).containsKey ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v4, :cond_1 */
/* .line 259 */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 264 */
} // :goto_0
/* .line 262 */
} // :cond_1
v4 = org.haxe.nme.Sound.mSoundProgress;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/Long; */
(( java.lang.Long ) v4 ).longValue ( ); // invoke-virtual {v4}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* .line 263 */
/* .local v0, "progress":J */
v4 = org.haxe.nme.Sound.mSoundDuration;
java.lang.Integer .valueOf ( p0 );
(( java.util.HashMap ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/Long; */
(( java.lang.Long ) v4 ).longValue ( ); // invoke-virtual {v4}, Ljava/lang/Long;->longValue()J
/* move-result-wide v2 */
/* .line 264 */
/* .local v2, "total":J */
/* int-to-long v4, p2 */
/* mul-long/2addr v4, v2 */
/* cmp-long v4, v0, v4 */
/* if-lez v4, :cond_2 */
} // .end local v2 # "total":J
} // :goto_1
/* long-to-int v4, v2 */
/* .restart local v2 # "total":J */
} // :cond_2
/* rem-long v2, v0, v2 */
} // .end method
private static Integer playMediaPlayer ( android.media.MediaPlayer p0, java.lang.String p1, Double p2, Double p3, Integer p4, Double p5 ) {
/* .locals 3 */
/* .param p0, "mp" # Landroid/media/MediaPlayer; */
/* .param p1, "inPath" # Ljava/lang/String; */
/* .param p2, "inVolLeft" # D */
/* .param p4, "inVolRight" # D */
/* .param p6, "inLoop" # I */
/* .param p7, "inStartTime" # D */
/* .prologue */
/* .line 328 */
/* new-instance v0, Lorg/haxe/nme/ManagedMediaPlayer; */
/* double-to-float v1, p2 */
/* double-to-float v2, p4 */
/* invoke-direct {v0, p0, v1, v2, p6}, Lorg/haxe/nme/ManagedMediaPlayer;-><init>(Landroid/media/MediaPlayer;FFI)V */
/* .line 329 */
/* .line 330 */
/* double-to-int v0, p7 */
(( android.media.MediaPlayer ) p0 ).seekTo ( v0 ); // invoke-virtual {p0, v0}, Landroid/media/MediaPlayer;->seekTo(I)V
/* .line 331 */
v0 = org.haxe.nme.Sound.mediaPlayer;
(( org.haxe.nme.ManagedMediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Lorg/haxe/nme/ManagedMediaPlayer;->start()V
/* .line 333 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Integer playMusic ( java.lang.String p0, Double p1, Double p2, Integer p3, Double p4 ) {
/* .locals 9 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .param p1, "inVolLeft" # D */
/* .param p3, "inVolRight" # D */
/* .param p5, "inLoop" # I */
/* .param p6, "inStartTime" # D */
/* .prologue */
/* .line 312 */
final String v1 = "Sound"; // const-string v1, "Sound"
final String v2 = "playMusic"; // const-string v2, "playMusic"
android.util.Log .i ( v1,v2 );
/* .line 314 */
v1 = org.haxe.nme.Sound.mediaPlayer;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 315 */
v1 = org.haxe.nme.Sound.mediaPlayer;
(( org.haxe.nme.ManagedMediaPlayer ) v1 ).stop ( ); // invoke-virtual {v1}, Lorg/haxe/nme/ManagedMediaPlayer;->stop()V
/* .line 318 */
} // :cond_0
org.haxe.nme.Sound .createMediaPlayer ( p0 );
/* .line 319 */
/* .local v0, "mp":Landroid/media/MediaPlayer; */
/* if-nez v0, :cond_1 */
/* .line 320 */
int v1 = -1; // const/4 v1, -0x1
/* .line 323 */
} // :goto_0
} // :cond_1
/* move-object v1, p0 */
/* move-wide v2, p1 */
/* move-wide v4, p3 */
/* move v6, p5 */
/* move-wide v7, p6 */
v1 = /* invoke-static/range {v0 ..v8}, Lorg/haxe/nme/Sound;->playMediaPlayer(Landroid/media/MediaPlayer;Ljava/lang/String;DDID)I */
} // .end method
public static Integer playSound ( Integer p0, Double p1, Double p2, Integer p3 ) {
/* .locals 8 */
/* .param p0, "inResourceID" # I */
/* .param p1, "inVolLeft" # D */
/* .param p3, "inVolRight" # D */
/* .param p5, "inLoop" # I */
/* .prologue */
/* .line 218 */
final String v0 = "Sound"; // const-string v0, "Sound"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "PlaySound -----"; // const-string v2, "PlaySound -----"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 220 */
/* add-int/lit8 p5, p5, -0x1 */
/* .line 221 */
/* if-gez p5, :cond_0 */
/* .line 222 */
int p5 = 0; // const/4 p5, 0x0
/* .line 225 */
} // :cond_0
v0 = org.haxe.nme.Sound.mSoundPool;
/* double-to-float v2, p1 */
/* double-to-float v3, p3 */
int v4 = 1; // const/4 v4, 0x1
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move v1, p0 */
/* move v5, p5 */
v7 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 226 */
/* .local v7, "streamId":I */
v0 = org.haxe.nme.Sound.mSoundProgress;
java.lang.Integer .valueOf ( v7 );
/* const-wide/16 v2, 0x0 */
java.lang.Long .valueOf ( v2,v3 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 227 */
} // .end method
public static void setMusicTransform ( java.lang.String p0, Double p1, Double p2 ) {
/* .locals 3 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .param p1, "inVolLeft" # D */
/* .param p3, "inVolRight" # D */
/* .prologue */
/* .line 398 */
v0 = org.haxe.nme.Sound.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.haxe.nme.Sound.mediaPlayerPath;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 399 */
v0 = org.haxe.nme.Sound.mediaPlayer;
/* double-to-float v1, p1 */
/* double-to-float v2, p3 */
(( org.haxe.nme.ManagedMediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/haxe/nme/ManagedMediaPlayer;->setVolume(FF)V
/* .line 401 */
} // :cond_0
return;
} // .end method
public static void stopMusic ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "inPath" # Ljava/lang/String; */
/* .prologue */
/* .line 338 */
final String v0 = "Sound"; // const-string v0, "Sound"
final String v1 = "stopMusic"; // const-string v1, "stopMusic"
android.util.Log .v ( v0,v1 );
/* .line 340 */
v0 = org.haxe.nme.Sound.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.haxe.nme.Sound.mediaPlayerPath;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 341 */
v0 = org.haxe.nme.Sound.mediaPlayer;
(( org.haxe.nme.ManagedMediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Lorg/haxe/nme/ManagedMediaPlayer;->stop()V
/* .line 343 */
} // :cond_0
return;
} // .end method
public static void stopSound ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "inStreamID" # I */
/* .prologue */
/* .line 232 */
v0 = org.haxe.nme.Sound.mSoundPool;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 233 */
v0 = org.haxe.nme.Sound.mSoundPool;
(( android.media.SoundPool ) v0 ).stop ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/SoundPool;->stop(I)V
/* .line 234 */
v0 = org.haxe.nme.Sound.mSoundProgress;
java.lang.Integer .valueOf ( p0 );
(( java.util.HashMap ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 236 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void doPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 142 */
v0 = org.haxe.nme.Sound.mSoundPool;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 143 */
v0 = org.haxe.nme.Sound.mSoundPool;
(( android.media.SoundPool ) v0 ).autoPause ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->autoPause()V
/* .line 146 */
} // :cond_0
v0 = org.haxe.nme.Sound.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 147 */
v0 = org.haxe.nme.Sound.mediaPlayer;
v0 = (( org.haxe.nme.ManagedMediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Lorg/haxe/nme/ManagedMediaPlayer;->isPlaying()Z
org.haxe.nme.Sound.mediaPlayerWasPlaying = (v0!= 0);
/* .line 148 */
v0 = org.haxe.nme.Sound.mediaPlayer;
(( org.haxe.nme.ManagedMediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Lorg/haxe/nme/ManagedMediaPlayer;->pause()V
/* .line 150 */
} // :cond_1
return;
} // .end method
public void doResume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 154 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sput-wide v0, Lorg/haxe/nme/Sound;->mTimeStamp:J */
/* .line 155 */
v0 = org.haxe.nme.Sound.mSoundPool;
(( android.media.SoundPool ) v0 ).autoResume ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->autoResume()V
/* .line 157 */
v0 = org.haxe.nme.Sound.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* sget-boolean v0, Lorg/haxe/nme/Sound;->mediaPlayerWasPlaying:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 158 */
v0 = org.haxe.nme.Sound.mediaPlayer;
(( org.haxe.nme.ManagedMediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Lorg/haxe/nme/ManagedMediaPlayer;->start()V
/* .line 160 */
} // :cond_0
return;
} // .end method
