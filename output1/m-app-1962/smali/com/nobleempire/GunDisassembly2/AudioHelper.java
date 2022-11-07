public class com.nobleempire.GunDisassembly2.AudioHelper {
	 /* .source "AudioHelper.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer MAX_SOUND_STREAMS;
private static java.lang.String ResourceLocation;
private static final java.lang.String TAG;
private static com.nobleempire.GunDisassembly2.AudioHelper instance;
private static java.lang.String music_filename;
/* # instance fields */
private android.media.MediaPlayer MusicPlayer;
private android.media.SoundPool Sounds;
private android.content.Context context;
private java.util.Map play_settings;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Object;", */
/* "Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.nobleempire.GunDisassembly2.AudioHelper ( ) {
/* .locals 1 */
/* .prologue */
/* .line 35 */
final String v0 = "com.nvidia.devtech.audio:raw/"; // const-string v0, "com.nvidia.devtech.audio:raw/"
/* .line 36 */
final String v0 = ""; // const-string v0, ""
/* .line 40 */
int v0 = 0; // const/4 v0, 0x0
/* .line 17 */
return;
} // .end method
private com.nobleempire.GunDisassembly2.AudioHelper ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 41 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 37 */
this.context = v0;
/* .line 38 */
this.Sounds = v0;
/* .line 39 */
this.MusicPlayer = v0;
/* .line 42 */
return;
} // .end method
static java.util.Map access$0 ( com.nobleempire.GunDisassembly2.AudioHelper p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 31 */
v0 = this.play_settings;
} // .end method
static android.media.SoundPool access$1 ( com.nobleempire.GunDisassembly2.AudioHelper p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 38 */
v0 = this.Sounds;
} // .end method
public static com.nobleempire.GunDisassembly2.AudioHelper getInstance ( ) {
/* .locals 1 */
/* .prologue */
/* .line 93 */
v0 = com.nobleempire.GunDisassembly2.AudioHelper.instance;
/* if-nez v0, :cond_0 */
/* .line 94 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/AudioHelper; */
/* invoke-direct {v0}, Lcom/nobleempire/GunDisassembly2/AudioHelper;-><init>()V */
/* .line 95 */
v0 = com.nobleempire.GunDisassembly2.AudioHelper.instance;
(( com.nobleempire.GunDisassembly2.AudioHelper ) v0 ).Initialise ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/AudioHelper;->Initialise()V
/* .line 97 */
} // :cond_0
v0 = com.nobleempire.GunDisassembly2.AudioHelper.instance;
} // .end method
/* # virtual methods */
void Initialise ( ) {
/* .locals 4 */
/* .prologue */
/* .line 51 */
/* new-instance v0, Landroid/media/SoundPool; */
/* const/16 v1, 0xa */
int v2 = 3; // const/4 v2, 0x3
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v0, v1, v2, v3}, Landroid/media/SoundPool;-><init>(III)V */
this.Sounds = v0;
/* .line 52 */
v0 = this.Sounds;
/* if-nez v0, :cond_0 */
/* .line 53 */
final String v0 = "==>AudioHelper.java"; // const-string v0, "==>AudioHelper.java"
final String v1 = "~~failed to create soundpool instance"; // const-string v1, "~~failed to create soundpool instance"
android.util.Log .e ( v0,v1 );
/* .line 80 */
} // :goto_0
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.play_settings = v0;
/* .line 81 */
return;
/* .line 55 */
} // :cond_0
v0 = this.Sounds;
/* .line 56 */
/* new-instance v1, Lcom/nobleempire/GunDisassembly2/AudioHelper$1; */
/* invoke-direct {v1, p0}, Lcom/nobleempire/GunDisassembly2/AudioHelper$1;-><init>(Lcom/nobleempire/GunDisassembly2/AudioHelper;)V */
/* .line 55 */
(( android.media.SoundPool ) v0 ).setOnLoadCompleteListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/SoundPool;->setOnLoadCompleteListener(Landroid/media/SoundPool$OnLoadCompleteListener;)V
} // .end method
public Integer LoadSound ( java.lang.String p0, Integer p1 ) {
/* .locals 7 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .param p2, "Priority" # I */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 101 */
final String v3 = "==>AudioHelper.java"; // const-string v3, "==>AudioHelper.java"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "~~Load sound "; // const-string v5, "~~Load sound "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v3,v4 );
/* .line 102 */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.nobleempire.GunDisassembly2.AudioHelper.ResourceLocation;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 103 */
/* .local v2, "s":Ljava/lang/String; */
v3 = this.context;
(( android.content.Context ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v1 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v6, v6 ); // invoke-virtual {v3, v2, v6, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 104 */
/* .local v1, "resID":I */
/* if-nez v1, :cond_0 */
/* .line 105 */
final String v3 = "==>AudioHelper.java"; // const-string v3, "==>AudioHelper.java"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "~~unidentified resource id for "; // const-string v5, "~~unidentified resource id for "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v3,v4 );
/* .line 106 */
int v0 = 0; // const/4 v0, 0x0
/* .line 109 */
} // :goto_0
/* .line 108 */
} // :cond_0
v3 = this.Sounds;
v4 = this.context;
v0 = (( android.media.SoundPool ) v3 ).load ( v4, v1, p2 ); // invoke-virtual {v3, v4, v1, p2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
/* .line 109 */
/* .local v0, "SoundID":I */
} // .end method
public Integer LoadSoundAsset ( java.lang.String p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .param p2, "Priority" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 112 */
v3 = this.context;
/* if-nez v3, :cond_0 */
/* .line 113 */
final String v3 = "==>AudioHelper.java"; // const-string v3, "==>AudioHelper.java"
final String v4 = "~~ZERO CONTEXT!!!!!!!!!!!!!!!!!!!!!!!!!!!"; // const-string v4, "~~ZERO CONTEXT!!!!!!!!!!!!!!!!!!!!!!!!!!!"
android.util.Log .v ( v3,v4 );
/* .line 128 */
} // :goto_0
/* .line 116 */
} // :cond_0
v3 = this.context;
(( android.content.Context ) v3 ).getAssets ( ); // invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
/* if-nez v3, :cond_1 */
/* .line 117 */
final String v3 = "==>AudioHelper.java"; // const-string v3, "==>AudioHelper.java"
final String v4 = "~~ZERO ASSETS!!!!!!!!!!!!!!!!!!!!!!!!!!!"; // const-string v4, "~~ZERO ASSETS!!!!!!!!!!!!!!!!!!!!!!!!!!!"
android.util.Log .v ( v3,v4 );
/* .line 120 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 121 */
/* .local v1, "SoundID":I */
int v0 = 0; // const/4 v0, 0x0
/* .line 123 */
/* .local v0, "FD":Landroid/content/res/AssetFileDescriptor; */
try { // :try_start_0
v3 = this.context;
(( android.content.Context ) v3 ).getAssets ( ); // invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v3 ).openFd ( p1 ); // invoke-virtual {v3, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 127 */
} // :goto_1
v3 = this.Sounds;
v1 = (( android.media.SoundPool ) v3 ).load ( v0, p2 ); // invoke-virtual {v3, v0, p2}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
/* .line 128 */
/* .line 124 */
/* :catch_0 */
/* move-exception v2 */
/* .line 125 */
/* .local v2, "e":Ljava/io/IOException; */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
} // .end method
public void MusicPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 195 */
v0 = this.MusicPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.MusicPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 196 */
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* .line 199 */
} // :cond_0
return;
} // .end method
public void MusicSetDataSource ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .prologue */
/* .line 156 */
/* .line 158 */
try { // :try_start_0
v2 = this.context;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
final String v3 = "raw"; // const-string v3, "raw"
v4 = this.context;
(( android.content.Context ) v4 ).getPackageName ( ); // invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v1 = (( android.content.res.Resources ) v2 ).getIdentifier ( p1, v3, v4 ); // invoke-virtual {v2, p1, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 159 */
/* .local v1, "resID":I */
/* if-nez v1, :cond_0 */
final String v2 = "==>AudioHelper.java"; // const-string v2, "==>AudioHelper.java"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "~~unidentified resource id for "; // const-string v4, "~~unidentified resource id for "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " in package "; // const-string v4, " in package "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.context;
(( android.content.Context ) v4 ).getPackageName ( ); // invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v2,v3 );
/* .line 169 */
} // .end local v1 # "resID":I
} // :goto_0
return;
/* .line 160 */
/* .restart local v1 # "resID":I */
} // :cond_0
v2 = this.context;
android.media.MediaPlayer .create ( v2,v1 );
this.MusicPlayer = v2;
/* .line 161 */
v2 = this.MusicPlayer;
/* if-nez v2, :cond_1 */
final String v2 = "==>AudioHelper.java"; // const-string v2, "==>AudioHelper.java"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "~~failed to create music player"; // const-string v4, "~~failed to create music player"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v2,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 164 */
} // .end local v1 # "resID":I
/* :catch_0 */
/* move-exception v0 */
/* .line 165 */
/* .local v0, "e":Ljava/lang/IllegalArgumentException; */
(( java.lang.IllegalArgumentException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
/* .line 162 */
} // .end local v0 # "e":Ljava/lang/IllegalArgumentException;
/* .restart local v1 # "resID":I */
} // :cond_1
try { // :try_start_1
v2 = this.MusicPlayer;
(( android.media.MediaPlayer ) v2 ).start ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->start()V
/* .line 163 */
v2 = this.MusicPlayer;
int v3 = 1; // const/4 v3, 0x1
(( android.media.MediaPlayer ) v2 ).setLooping ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setLooping(Z)V
/* :try_end_1 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 166 */
} // .end local v1 # "resID":I
/* :catch_1 */
/* move-exception v0 */
/* .line 167 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
(( java.lang.IllegalStateException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V
} // .end method
public void MusicStart ( ) {
/* .locals 1 */
/* .prologue */
/* .line 172 */
v0 = this.MusicPlayer;
/* if-nez v0, :cond_0 */
/* .line 175 */
} // :goto_0
return;
/* .line 173 */
} // :cond_0
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
} // .end method
public void MusicStop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 187 */
v0 = this.MusicPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.MusicPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 188 */
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 189 */
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
/* .line 192 */
} // :cond_0
return;
} // .end method
public void MusicVolume ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "VolumeL" # F */
/* .param p2, "VolumeR" # F */
/* .prologue */
/* .line 177 */
v0 = this.MusicPlayer;
/* if-nez v0, :cond_0 */
/* .line 179 */
} // :goto_0
return;
/* .line 178 */
} // :cond_0
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).setVolume ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V
} // .end method
public void PauseSound ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .prologue */
/* .line 131 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).pause ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->pause(I)V
/* .line 132 */
return;
} // .end method
public Integer PlaySound ( Integer p0, Float p1, Float p2, Integer p3, Integer p4, Float p5, Boolean p6 ) {
/* .locals 10 */
/* .param p1, "SoundID" # I */
/* .param p2, "lv" # F */
/* .param p3, "rv" # F */
/* .param p4, "priority" # I */
/* .param p5, "loop" # I */
/* .param p6, "rate" # F */
/* .param p7, "first_time" # Z */
/* .prologue */
/* .line 140 */
if ( p7 != null) { // if-eqz p7, :cond_0
/* .line 141 */
v8 = this.play_settings;
/* new-instance v9, Ljava/lang/Integer; */
/* invoke-direct {v9, p1}, Ljava/lang/Integer;-><init>(I)V */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t; */
/* move-object v1, p0 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move v5, p5 */
/* move/from16 v6, p6 */
/* invoke-direct/range {v0 ..v6}, Lcom/nobleempire/GunDisassembly2/AudioHelper$play_settings_t;-><init>(Lcom/nobleempire/GunDisassembly2/AudioHelper;FFIIF)V */
/* .line 143 */
} // :cond_0
v0 = this.Sounds;
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move v5, p5 */
/* move/from16 v6, p6 */
v7 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 144 */
/* .local v7, "nres":I */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).setVolume ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/media/SoundPool;->setVolume(IFF)V
/* .line 145 */
} // .end method
public void ResumeSound ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .prologue */
/* .line 134 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).resume ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->resume(I)V
/* .line 135 */
return;
} // .end method
void SetMaxVolume ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 3; // const/4 v4, 0x3
/* .line 181 */
v2 = this.context;
final String v3 = "audio"; // const-string v3, "audio"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/AudioManager; */
/* .line 182 */
/* .local v0, "mAudioManager":Landroid/media/AudioManager; */
v1 = (( android.media.AudioManager ) v0 ).getStreamMaxVolume ( v4 ); // invoke-virtual {v0, v4}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I
/* .line 183 */
/* .local v1, "maxVolume":I */
int v2 = 0; // const/4 v2, 0x0
(( android.media.AudioManager ) v0 ).setStreamVolume ( v4, v1, v2 ); // invoke-virtual {v0, v4, v1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V
/* .line 184 */
return;
} // .end method
public void SetResouceLocation ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 87 */
/* .line 88 */
return;
} // .end method
public void SetVolume ( Integer p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .param p2, "vl" # F */
/* .param p3, "vr" # F */
/* .prologue */
/* .line 148 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).setVolume ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/media/SoundPool;->setVolume(IFF)V
/* .line 149 */
return;
} // .end method
public void StopSound ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .prologue */
/* .line 137 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).stop ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->stop(I)V
/* .line 138 */
return;
} // .end method
public Boolean UnloadSample ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .prologue */
/* .line 152 */
v0 = this.Sounds;
v0 = (( android.media.SoundPool ) v0 ).unload ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->unload(I)Z
} // .end method
public void finalize ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 83 */
v0 = this.Sounds;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
this.Sounds = v1;
/* .line 84 */
} // :cond_0
v0 = this.MusicPlayer;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
this.MusicPlayer = v1;
/* .line 85 */
} // :cond_1
return;
} // .end method
public void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 90 */
this.context = p1;
/* .line 91 */
return;
} // .end method
