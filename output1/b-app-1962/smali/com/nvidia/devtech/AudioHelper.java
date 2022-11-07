public class com.nvidia.devtech.AudioHelper {
	 /* .source "AudioHelper.java" */
	 /* # static fields */
	 private static final Integer MAX_SOUND_STREAMS;
	 private static java.lang.String ResourceLocation;
	 private static final java.lang.String TAG;
	 private static com.nvidia.devtech.AudioHelper instance;
	 /* # instance fields */
	 private android.media.MediaPlayer MusicPlayer;
	 private android.media.SoundPool Sounds;
	 private android.content.Context context;
	 /* # direct methods */
	 static com.nvidia.devtech.AudioHelper ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 37 */
		 final String v0 = "com.nvidia.devtech.audio:raw/"; // const-string v0, "com.nvidia.devtech.audio:raw/"
		 /* .line 42 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 33 */
		 return;
	 } // .end method
	 private com.nvidia.devtech.AudioHelper ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 44 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 39 */
		 this.context = v0;
		 /* .line 40 */
		 this.Sounds = v0;
		 /* .line 41 */
		 this.MusicPlayer = v0;
		 /* .line 46 */
		 return;
	 } // .end method
	 public static com.nvidia.devtech.AudioHelper getInstance ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 87 */
		 v0 = com.nvidia.devtech.AudioHelper.instance;
		 /* if-nez v0, :cond_0 */
		 /* .line 89 */
		 /* new-instance v0, Lcom/nvidia/devtech/AudioHelper; */
		 /* invoke-direct {v0}, Lcom/nvidia/devtech/AudioHelper;-><init>()V */
		 /* .line 91 */
		 v0 = com.nvidia.devtech.AudioHelper.instance;
		 (( com.nvidia.devtech.AudioHelper ) v0 ).Initialise ( ); // invoke-virtual {v0}, Lcom/nvidia/devtech/AudioHelper;->Initialise()V
		 /* .line 94 */
	 } // :cond_0
	 v0 = com.nvidia.devtech.AudioHelper.instance;
} // .end method
/* # virtual methods */
void Initialise ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 50 */
	 /* new-instance v0, Landroid/media/SoundPool; */
	 /* const/16 v1, 0xa */
	 int v2 = 3; // const/4 v2, 0x3
	 int v3 = 0; // const/4 v3, 0x0
	 /* invoke-direct {v0, v1, v2, v3}, Landroid/media/SoundPool;-><init>(III)V */
	 this.Sounds = v0;
	 /* .line 52 */
	 v0 = this.Sounds;
	 /* if-nez v0, :cond_0 */
	 /* .line 54 */
	 final String v0 = "AudioHelper"; // const-string v0, "AudioHelper"
	 final String v1 = "failed to create soundpool instance"; // const-string v1, "failed to create soundpool instance"
	 android.util.Log .e ( v0,v1 );
	 /* .line 57 */
} // :cond_0
final String v0 = "AudioHelper"; // const-string v0, "AudioHelper"
final String v1 = "created sound pool"; // const-string v1, "created sound pool"
android.util.Log .i ( v0,v1 );
/* .line 58 */
return;
} // .end method
public Integer LoadSound ( java.lang.String p0, Integer p1 ) {
/* .locals 7 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .param p2, "Priority" # I */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 101 */
final String v3 = "AudioHelper"; // const-string v3, "AudioHelper"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "Load sound "; // const-string v5, "Load sound "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v3,v4 );
/* .line 103 */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.nvidia.devtech.AudioHelper.ResourceLocation;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 105 */
/* .local v2, "s":Ljava/lang/String; */
v3 = this.context;
(( android.content.Context ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v1 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v6, v6 ); // invoke-virtual {v3, v2, v6, v6}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 107 */
/* .local v1, "resID":I */
/* if-nez v1, :cond_0 */
/* .line 109 */
final String v3 = "AudioHelper"; // const-string v3, "AudioHelper"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "unidentified resource id for "; // const-string v5, "unidentified resource id for "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v3,v4 );
/* .line 111 */
int v0 = 0; // const/4 v0, 0x0
/* .line 116 */
} // :goto_0
/* .line 114 */
} // :cond_0
v3 = this.Sounds;
v4 = this.context;
v0 = (( android.media.SoundPool ) v3 ).load ( v4, v1, p2 ); // invoke-virtual {v3, v4, v1, p2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
/* .line 116 */
/* .local v0, "SoundID":I */
} // .end method
public Integer LoadSoundAsset ( java.lang.String p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .param p2, "Priority" # I */
/* .prologue */
/* .line 123 */
int v0 = 0; // const/4 v0, 0x0
/* .line 127 */
/* .local v0, "FD":Landroid/content/res/AssetFileDescriptor; */
try { // :try_start_0
v3 = this.context;
(( android.content.Context ) v3 ).getAssets ( ); // invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v3 ).openFd ( p1 ); // invoke-virtual {v3, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 134 */
} // :goto_0
v3 = this.Sounds;
v1 = (( android.media.SoundPool ) v3 ).load ( v0, p2 ); // invoke-virtual {v3, v0, p2}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
/* .line 136 */
/* .local v1, "SoundID":I */
/* .line 129 */
} // .end local v1 # "SoundID":I
/* :catch_0 */
/* move-exception v2 */
/* .line 131 */
/* .local v2, "e":Ljava/io/IOException; */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
} // .end method
public void MusicSetDataSource ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "filename" # Ljava/lang/String; */
/* .prologue */
/* .line 173 */
try { // :try_start_0
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.nvidia.devtech.AudioHelper.ResourceLocation;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 175 */
/* .local v2, "s":Ljava/lang/String; */
v3 = this.context;
(( android.content.Context ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
v1 = (( android.content.res.Resources ) v3 ).getIdentifier ( v2, v4, v5 ); // invoke-virtual {v3, v2, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 177 */
/* .local v1, "resID":I */
/* if-nez v1, :cond_0 */
/* .line 179 */
final String v3 = "AudioHelper"; // const-string v3, "AudioHelper"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "unidentified resource id for "; // const-string v5, "unidentified resource id for "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v3,v4 );
/* .line 203 */
} // .end local v1 # "resID":I
} // .end local v2 # "s":Ljava/lang/String;
} // :goto_0
return;
/* .line 184 */
/* .restart local v1 # "resID":I */
/* .restart local v2 # "s":Ljava/lang/String; */
} // :cond_0
v3 = this.context;
android.media.MediaPlayer .create ( v3,v1 );
this.MusicPlayer = v3;
/* .line 186 */
v3 = this.MusicPlayer;
/* if-nez v3, :cond_1 */
/* .line 188 */
final String v3 = "AudioHelper"; // const-string v3, "AudioHelper"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "failed to create music player"; // const-string v5, "failed to create music player"
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v3,v4 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 195 */
} // .end local v1 # "resID":I
} // .end local v2 # "s":Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
/* .line 197 */
/* .local v0, "e":Ljava/lang/IllegalArgumentException; */
(( java.lang.IllegalArgumentException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
/* .line 193 */
} // .end local v0 # "e":Ljava/lang/IllegalArgumentException;
/* .restart local v1 # "resID":I */
/* .restart local v2 # "s":Ljava/lang/String; */
} // :cond_1
try { // :try_start_1
v3 = this.MusicPlayer;
(( android.media.MediaPlayer ) v3 ).start ( ); // invoke-virtual {v3}, Landroid/media/MediaPlayer;->start()V
/* :try_end_1 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 199 */
} // .end local v1 # "resID":I
} // .end local v2 # "s":Ljava/lang/String;
/* :catch_1 */
/* move-exception v0 */
/* .line 201 */
/* .local v0, "e":Ljava/lang/IllegalStateException; */
(( java.lang.IllegalStateException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V
} // .end method
public void MusicStart ( ) {
/* .locals 1 */
/* .prologue */
/* .line 207 */
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 208 */
return;
} // .end method
public void MusicStop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 225 */
v0 = this.MusicPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.MusicPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 227 */
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 228 */
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
/* .line 230 */
} // :cond_0
return;
} // .end method
public void MusicVolume ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "VolumeL" # F */
/* .param p2, "VolumeR" # F */
/* .prologue */
/* .line 212 */
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).setVolume ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* .line 213 */
return;
} // .end method
public void PauseSound ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .prologue */
/* .line 141 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).pause ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->pause(I)V
/* .line 142 */
return;
} // .end method
public Integer PlaySound ( Integer p0, Float p1, Float p2, Integer p3, Integer p4, Float p5 ) {
/* .locals 7 */
/* .param p1, "SoundID" # I */
/* .param p2, "lv" # F */
/* .param p3, "rv" # F */
/* .param p4, "priority" # I */
/* .param p5, "loop" # I */
/* .param p6, "rate" # F */
/* .prologue */
/* .line 156 */
v0 = this.Sounds;
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move v5, p5 */
/* move v6, p6 */
v0 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
} // .end method
public void ResumeSound ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .prologue */
/* .line 146 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).resume ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->resume(I)V
/* .line 147 */
return;
} // .end method
void SetMaxVolume ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 3; // const/4 v4, 0x3
/* .line 217 */
v2 = this.context;
final String v3 = "audio"; // const-string v3, "audio"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/AudioManager; */
/* .line 218 */
/* .local v0, "mAudioManager":Landroid/media/AudioManager; */
v1 = (( android.media.AudioManager ) v0 ).getStreamMaxVolume ( v4 ); // invoke-virtual {v0, v4}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I
/* .line 220 */
/* .local v1, "maxVolume":I */
int v2 = 0; // const/4 v2, 0x0
(( android.media.AudioManager ) v0 ).setStreamVolume ( v4, v1, v2 ); // invoke-virtual {v0, v4, v1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V
/* .line 221 */
return;
} // .end method
public void SetResouceLocation ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 77 */
/* .line 78 */
return;
} // .end method
public void SetVolume ( Integer p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .param p2, "vl" # F */
/* .param p3, "vr" # F */
/* .prologue */
/* .line 161 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).setVolume ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/media/SoundPool;->setVolume(IFF)V
/* .line 162 */
return;
} // .end method
public void StopSound ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .prologue */
/* .line 151 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).stop ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->stop(I)V
/* .line 152 */
return;
} // .end method
public Boolean UnloadSample ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "SoundID" # I */
/* .prologue */
/* .line 166 */
v0 = this.Sounds;
v0 = (( android.media.SoundPool ) v0 ).unload ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->unload(I)Z
} // .end method
public void finalize ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 62 */
v0 = this.Sounds;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 64 */
v0 = this.Sounds;
(( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
/* .line 65 */
this.Sounds = v1;
/* .line 68 */
} // :cond_0
v0 = this.MusicPlayer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 70 */
v0 = this.MusicPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 71 */
this.MusicPlayer = v1;
/* .line 73 */
} // :cond_1
return;
} // .end method
public void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 82 */
this.context = p1;
/* .line 83 */
return;
} // .end method
