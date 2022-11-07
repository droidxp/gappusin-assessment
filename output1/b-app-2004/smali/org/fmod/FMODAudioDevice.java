public class org.fmod.FMODAudioDevice implements java.lang.Runnable {
	 /* .source "FMODAudioDevice.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static Integer FMOD_INFO_DSPBUFFERLENGTH;
	 private static Integer FMOD_INFO_DSPNUMBUFFERS;
	 private static Integer FMOD_INFO_MIXERRUNNING;
	 private static Integer FMOD_INFO_SAMPLERATE;
	 private static Integer NUMCHANNELS;
	 /* # instance fields */
	 private Boolean mInitialised;
	 private Boolean mRunning;
	 private java.lang.Thread mThread;
	 private android.media.AudioTrack mTrack;
	 /* # direct methods */
	 static org.fmod.FMODAudioDevice ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 2; // const/4 v1, 0x2
		 /* .line 14 */
		 /* .line 149 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 150 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 151 */
		 /* .line 152 */
		 int v0 = 3; // const/4 v0, 0x3
		 return;
	 } // .end method
	 public org.fmod.FMODAudioDevice ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 16 */
		 this.mThread = v1;
		 /* .line 17 */
		 this.mTrack = v1;
		 /* .line 18 */
		 /* iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->mRunning:Z */
		 /* .line 19 */
		 /* iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->mInitialised:Z */
		 return;
	 } // .end method
	 private native Integer fmodGetInfo ( Integer p0 ) {
	 } // .end method
	 private native Integer fmodProcess ( java.nio.ByteBuffer p0 ) {
	 } // .end method
	 private void shutDown ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 139 */
		 v0 = this.mTrack;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 141 */
			 v0 = this.mTrack;
			 (( android.media.AudioTrack ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V
			 /* .line 142 */
			 v0 = this.mTrack;
			 (( android.media.AudioTrack ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
			 /* .line 143 */
			 int v0 = 0; // const/4 v0, 0x0
			 this.mTrack = v0;
			 /* .line 146 */
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->mInitialised:Z */
		 /* .line 147 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isMixing ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 /* iget-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->mInitialised:Z */
	 } // .end method
	 public void run ( ) {
		 /* .locals 13 */
		 /* .prologue */
		 int v4 = 2; // const/4 v4, 0x2
		 int v10 = 0; // const/4 v10, 0x0
		 int v12 = 0; // const/4 v12, 0x0
		 int v1 = 3; // const/4 v1, 0x3
		 int v6 = 1; // const/4 v6, 0x1
		 /* .line 60 */
		 /* move v7, v1 */
		 /* move-object v0, v10 */
		 /* move-object v3, v10 */
		 /* .line 64 */
	 } // :goto_0
	 /* iget-boolean v2, p0, Lorg/fmod/FMODAudioDevice;->mRunning:Z */
	 if ( v2 != null) { // if-eqz v2, :cond_6
		 /* .line 66 */
		 /* iget-boolean v2, p0, Lorg/fmod/FMODAudioDevice;->mInitialised:Z */
		 /* if-nez v2, :cond_4 */
		 /* .line 68 */
		 v2 = 		 /* invoke-direct {p0, v2}, Lorg/fmod/FMODAudioDevice;->fmodGetInfo(I)I */
		 /* .line 69 */
		 /* if-lez v2, :cond_3 */
		 /* .line 71 */
		 v5 = 		 android.media.AudioTrack .getMinBufferSize ( v2,v1,v4 );
		 /* .line 72 */
		 v0 = 		 /* invoke-direct {p0, v0}, Lorg/fmod/FMODAudioDevice;->fmodGetInfo(I)I */
		 /* .line 73 */
		 v3 = 		 /* invoke-direct {p0, v3}, Lorg/fmod/FMODAudioDevice;->fmodGetInfo(I)I */
		 /* .line 75 */
		 final String v8 = "fmod"; // const-string v8, "fmod"
		 /* new-instance v9, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v11 = "FMOD: AudioDevice::run : Min buffer size: "; // const-string v11, "FMOD: AudioDevice::run : Min buffer size: "
		 (( java.lang.StringBuilder ) v9 ).append ( v11 ); // invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v9 ).append ( v5 ); // invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v11 = " bytes"; // const-string v11, " bytes"
		 (( java.lang.StringBuilder ) v9 ).append ( v11 ); // invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .i ( v8,v9 );
		 /* .line 77 */
		 /* mul-int v8, v0, v3 */
		 /* mul-int/lit8 v8, v8, 0x2 */
		 /* mul-int/2addr v8, v9 */
		 /* if-le v8, v5, :cond_0 */
		 /* .line 79 */
		 /* mul-int/2addr v3, v0 */
		 /* mul-int/lit8 v3, v3, 0x2 */
		 /* mul-int/2addr v5, v3 */
		 /* .line 82 */
	 } // :cond_0
	 final String v3 = "fmod"; // const-string v3, "fmod"
	 /* new-instance v8, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v9 = "FMOD: AudioDevice::run : Actual buffer size: "; // const-string v9, "FMOD: AudioDevice::run : Actual buffer size: "
	 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v8 ).append ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v9 = " bytes"; // const-string v9, " bytes"
	 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .i ( v3,v8 );
	 /* .line 84 */
	 /* mul-int/lit8 v0, v0, 0x2 */
	 /* mul-int/2addr v0, v3 */
	 java.nio.ByteBuffer .allocateDirect ( v0 );
	 /* .line 85 */
	 v0 = 	 (( java.nio.ByteBuffer ) v9 ).capacity ( ); // invoke-virtual {v9}, Ljava/nio/ByteBuffer;->capacity()I
	 /* new-array v8, v0, [B */
	 /* .line 87 */
	 /* new-instance v0, Landroid/media/AudioTrack; */
	 /* move v3, v1 */
	 /* invoke-direct/range {v0 ..v6}, Landroid/media/AudioTrack;-><init>(IIIIII)V */
	 this.mTrack = v0;
	 /* .line 88 */
	 v0 = this.mTrack;
	 v0 = 	 (( android.media.AudioTrack ) v0 ).getState ( ); // invoke-virtual {v0}, Landroid/media/AudioTrack;->getState()I
	 /* if-ne v0, v6, :cond_1 */
	 /* .line 90 */
	 v0 = this.mTrack;
	 (( android.media.AudioTrack ) v0 ).play ( ); // invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V
	 /* .line 91 */
	 /* iput-boolean v6, p0, Lorg/fmod/FMODAudioDevice;->mInitialised:Z */
	 /* move v0, v7 */
} // :goto_1
/* move v7, v0 */
/* move-object v2, v9 */
/* move-object v0, v8 */
} // :goto_2
/* move-object v3, v2 */
/* .line 114 */
/* goto/16 :goto_0 */
/* .line 95 */
} // :cond_1
v0 = this.mTrack;
(( android.media.AudioTrack ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
/* .line 96 */
this.mTrack = v10;
/* .line 98 */
/* add-int/lit8 v0, v7, -0x1 */
/* if-nez v0, :cond_2 */
/* .line 100 */
final String v2 = "fmod"; // const-string v2, "fmod"
final String v3 = "FMOD: AudioDevice::run : Couldn\'t initialize AudioTrack, giving up"; // const-string v3, "FMOD: AudioDevice::run : Couldn\'t initialize AudioTrack, giving up"
android.util.Log .e ( v2,v3 );
/* .line 101 */
/* iput-boolean v12, p0, Lorg/fmod/FMODAudioDevice;->mRunning:Z */
/* .line 105 */
} // :cond_2
final String v2 = "fmod"; // const-string v2, "fmod"
final String v3 = "FMOD: AudioDevice::run : Couldn\'t initialize AudioTrack, retrying..."; // const-string v3, "FMOD: AudioDevice::run : Couldn\'t initialize AudioTrack, retrying..."
android.util.Log .w ( v2,v3 );
/* .line 106 */
/* const-wide/16 v2, 0x3e8 */
try { // :try_start_0
java.lang.Thread .sleep ( v2,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
/* .line 112 */
} // :cond_3
/* const-wide/16 v8, 0x64 */
try { // :try_start_1
java.lang.Thread .sleep ( v8,v9 );
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_1 */
/* move-object v2, v3 */
/* :catch_1 */
/* move-exception v2 */
/* move-object v2, v3 */
/* .line 117 */
} // :cond_4
v2 = /* invoke-direct {p0, v2}, Lorg/fmod/FMODAudioDevice;->fmodGetInfo(I)I */
/* .line 118 */
/* if-ne v2, v6, :cond_5 */
/* .line 120 */
/* invoke-direct {p0, v3}, Lorg/fmod/FMODAudioDevice;->fmodProcess(Ljava/nio/ByteBuffer;)I */
/* .line 122 */
(( java.nio.ByteBuffer ) v3 ).get ( v0 ); // invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
/* .line 123 */
(( java.nio.ByteBuffer ) v3 ).position ( v12 ); // invoke-virtual {v3, v12}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
/* .line 125 */
v2 = this.mTrack;
v5 = (( java.nio.ByteBuffer ) v3 ).capacity ( ); // invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I
(( android.media.AudioTrack ) v2 ).write ( v0, v12, v5 ); // invoke-virtual {v2, v0, v12, v5}, Landroid/media/AudioTrack;->write([BII)I
/* goto/16 :goto_0 */
/* .line 129 */
} // :cond_5
/* invoke-direct {p0}, Lorg/fmod/FMODAudioDevice;->shutDown()V */
/* goto/16 :goto_0 */
/* .line 134 */
} // :cond_6
/* invoke-direct {p0}, Lorg/fmod/FMODAudioDevice;->shutDown()V */
/* .line 135 */
return;
} // .end method
public void start ( ) {
/* .locals 2 */
/* .prologue */
/* .line 28 */
v0 = this.mThread;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 30 */
(( org.fmod.FMODAudioDevice ) p0 ).stop ( ); // invoke-virtual {p0}, Lorg/fmod/FMODAudioDevice;->stop()V
/* .line 33 */
} // :cond_0
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.mThread = v0;
/* .line 34 */
v0 = this.mThread;
/* const/16 v1, 0xa */
(( java.lang.Thread ) v0 ).setPriority ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V
/* .line 36 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->mRunning:Z */
/* .line 37 */
v0 = this.mThread;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 38 */
return;
} // .end method
public void stop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
} // :goto_0
v0 = this.mThread;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 44 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/fmod/FMODAudioDevice;->mRunning:Z */
/* .line 48 */
try { // :try_start_0
v0 = this.mThread;
(( java.lang.Thread ) v0 ).join ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->join()V
/* .line 49 */
int v0 = 0; // const/4 v0, 0x0
this.mThread = v0;
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 51 */
/* :catch_0 */
/* move-exception v0 */
/* .line 56 */
} // :cond_0
return;
} // .end method
