public class org.nwhy.Whackczkm.CMIDIPlayer {
	 /* .source "CMIDIPlayer.java" */
	 /* # instance fields */
	 android.content.Context context;
	 private android.media.SoundPool soundPool;
	 private java.util.HashMap soundPoolMap;
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
/* # direct methods */
public org.nwhy.Whackczkm.CMIDIPlayer ( ) {
/* .locals 0 */
/* .param p1, "cont" # Landroid/content/Context; */
/* .prologue */
/* .line 17 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 18 */
this.context = p1;
/* .line 19 */
(( org.nwhy.Whackczkm.CMIDIPlayer ) p0 ).initSounds ( ); // invoke-virtual {p0}, Lorg/nwhy/Whackczkm/CMIDIPlayer;->initSounds()V
/* .line 20 */
return;
} // .end method
/* # virtual methods */
public void initSounds ( ) {
/* .locals 3 */
/* .prologue */
/* const/16 v2, 0x64 */
/* .line 30 */
/* new-instance v0, Landroid/media/SoundPool; */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {v0, v2, v1, v2}, Landroid/media/SoundPool;-><init>(III)V */
this.soundPool = v0;
/* .line 33 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.soundPoolMap = v0;
/* .line 34 */
return;
} // .end method
public void loadSfx ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "raw" # I */
/* .param p2, "ID" # I */
/* .prologue */
/* .line 44 */
v0 = this.soundPoolMap;
java.lang.Integer .valueOf ( p2 );
v2 = this.soundPool;
v3 = this.context;
v2 = (( android.media.SoundPool ) v2 ).load ( v3, p1, p2 ); // invoke-virtual {v2, v3, p1, p2}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
java.lang.Integer .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 45 */
return;
} // .end method
public void play ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "sound" # I */
/* .prologue */
/* .line 54 */
int v0 = 0; // const/4 v0, 0x0
(( org.nwhy.Whackczkm.CMIDIPlayer ) p0 ).play ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/nwhy/Whackczkm/CMIDIPlayer;->play(II)V
/* .line 55 */
return;
} // .end method
public void play ( Integer p0, Integer p1 ) {
/* .locals 8 */
/* .param p1, "sound" # I */
/* .param p2, "uLoop" # I */
/* .prologue */
/* .line 64 */
v0 = this.context;
final String v1 = "audio"; // const-string v1, "audio"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v7, Landroid/media/AudioManager; */
/* .line 65 */
/* .local v7, "mgr":Landroid/media/AudioManager; */
int v0 = 3; // const/4 v0, 0x3
v0 = (( android.media.AudioManager ) v7 ).getStreamVolume ( v0 ); // invoke-virtual {v7, v0}, Landroid/media/AudioManager;->getStreamVolume(I)I
/* div-int/lit8 v0, v0, 0x5 */
/* int-to-float v2, v0 */
/* .line 66 */
/* .local v2, "streamVolume":F */
v0 = this.soundPool;
v1 = this.soundPoolMap;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
} // .end local p0 # "this":Lorg/nwhy/Whackczkm/CMIDIPlayer;
/* check-cast p0, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
int v4 = 1; // const/4 v4, 0x1
/* .line 67 */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move v3, v2 */
/* move v5, p2 */
/* .line 66 */
/* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 68 */
return;
} // .end method
