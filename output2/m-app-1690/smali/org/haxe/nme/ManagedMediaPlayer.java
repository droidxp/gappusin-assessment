class org.haxe.nme.ManagedMediaPlayer {
	 /* .source "Sound.java" */
	 /* # instance fields */
	 public Boolean isComplete;
	 public Float leftVol;
	 public Integer loopsLeft;
	 public android.media.MediaPlayer mp;
	 public Float rightVol;
	 public Boolean wasPlaying;
	 /* # direct methods */
	 public org.haxe.nme.ManagedMediaPlayer ( ) {
		 /* .locals 3 */
		 /* .param p1, "mp" # Landroid/media/MediaPlayer; */
		 /* .param p2, "leftVol" # F */
		 /* .param p3, "rightVol" # F */
		 /* .param p4, "loop" # I */
		 /* .prologue */
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 31 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 27 */
		 /* iput-boolean v2, p0, Lorg/haxe/nme/ManagedMediaPlayer;->isComplete:Z */
		 /* .line 28 */
		 /* iput v1, p0, Lorg/haxe/nme/ManagedMediaPlayer;->loopsLeft:I */
		 /* .line 29 */
		 /* iput-boolean v1, p0, Lorg/haxe/nme/ManagedMediaPlayer;->wasPlaying:Z */
		 /* .line 32 */
		 this.mp = p1;
		 /* .line 33 */
		 (( org.haxe.nme.ManagedMediaPlayer ) p0 ).setVolume ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lorg/haxe/nme/ManagedMediaPlayer;->setVolume(FF)V
		 /* .line 34 */
		 /* iput-boolean v1, p0, Lorg/haxe/nme/ManagedMediaPlayer;->isComplete:Z */
		 /* .line 35 */
		 /* move-object v0, p0 */
		 /* .line 37 */
		 /* .local v0, "mmp":Lorg/haxe/nme/ManagedMediaPlayer; */
		 /* if-gez p4, :cond_1 */
		 /* .line 38 */
		 (( android.media.MediaPlayer ) p1 ).setLooping ( v2 ); // invoke-virtual {p1, v2}, Landroid/media/MediaPlayer;->setLooping(Z)V
		 /* .line 52 */
	 } // :cond_0
} // :goto_0
return;
/* .line 39 */
} // :cond_1
/* if-ltz p4, :cond_0 */
/* .line 40 */
/* iput p4, p0, Lorg/haxe/nme/ManagedMediaPlayer;->loopsLeft:I */
/* .line 41 */
/* new-instance v1, Lorg/haxe/nme/ManagedMediaPlayer$1; */
/* invoke-direct {v1, p0, v0}, Lorg/haxe/nme/ManagedMediaPlayer$1;-><init>(Lorg/haxe/nme/ManagedMediaPlayer;Lorg/haxe/nme/ManagedMediaPlayer;)V */
(( android.media.MediaPlayer ) p1 ).setOnCompletionListener ( v1 ); // invoke-virtual {p1, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
} // .end method
/* # virtual methods */
public Integer getCurrentPosition ( ) {
/* .locals 1 */
/* .prologue */
/* .line 73 */
v0 = this.mp;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 74 */
v0 = this.mp;
v0 = (( android.media.MediaPlayer ) v0 ).getCurrentPosition ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I
/* .line 75 */
} // :goto_0
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer getDuration ( ) {
/* .locals 1 */
/* .prologue */
/* .line 67 */
v0 = this.mp;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 68 */
v0 = this.mp;
v0 = (( android.media.MediaPlayer ) v0 ).getDuration ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I
/* .line 69 */
} // :goto_0
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
} // .end method
public Boolean isPlaying ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
v0 = this.mp;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 80 */
v0 = this.mp;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
/* .line 81 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void pause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 85 */
v0 = this.mp;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 86 */
v0 = this.mp;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* .line 87 */
} // :cond_0
return;
} // .end method
public void release ( ) {
/* .locals 1 */
/* .prologue */
/* .line 106 */
v0 = this.mp;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 107 */
v0 = this.mp;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 108 */
int v0 = 0; // const/4 v0, 0x0
this.mp = v0;
/* .line 110 */
} // :cond_0
return;
} // .end method
public void setComplete ( ) {
/* .locals 1 */
/* .prologue */
/* .line 101 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/haxe/nme/ManagedMediaPlayer;->isComplete:Z */
/* .line 102 */
(( org.haxe.nme.ManagedMediaPlayer ) p0 ).stop ( ); // invoke-virtual {p0}, Lorg/haxe/nme/ManagedMediaPlayer;->stop()V
/* .line 103 */
return;
} // .end method
public org.haxe.nme.ManagedMediaPlayer setMediaPlayer ( android.media.MediaPlayer p0 ) {
/* .locals 0 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 55 */
this.mp = p1;
/* .line 56 */
} // .end method
public void setVolume ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "leftVol" # F */
/* .param p2, "rightVol" # F */
/* .prologue */
/* .line 60 */
v0 = this.mp;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 61 */
v0 = this.mp;
(( android.media.MediaPlayer ) v0 ).setVolume ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* .line 62 */
} // :cond_0
/* iput p1, p0, Lorg/haxe/nme/ManagedMediaPlayer;->leftVol:F */
/* .line 63 */
/* iput p2, p0, Lorg/haxe/nme/ManagedMediaPlayer;->rightVol:F */
/* .line 64 */
return;
} // .end method
public void start ( ) {
/* .locals 1 */
/* .prologue */
/* .line 90 */
v0 = this.mp;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 91 */
v0 = this.mp;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 92 */
} // :cond_0
return;
} // .end method
public void stop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 95 */
v0 = this.mp;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 96 */
v0 = this.mp;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 97 */
} // :cond_0
(( org.haxe.nme.ManagedMediaPlayer ) p0 ).release ( ); // invoke-virtual {p0}, Lorg/haxe/nme/ManagedMediaPlayer;->release()V
/* .line 98 */
return;
} // .end method
