public class com.ansca.corona.AudioRecorder {
	 /* .source "AudioRecorder.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;, */
	 /* Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer ENCODING;
private static final Integer SAMPLE_RATE;
private static final Integer STATUS_ERROR;
private static final Integer STATUS_OK;
/* # instance fields */
com.ansca.corona.AudioRecorder$AudioByteBufferHolder myCurrentBuffer;
private android.os.Handler myHandler;
private Integer myId;
Boolean myIsNotifying;
private Boolean myIsRunning;
private android.media.MediaRecorder myMediaRecordInstance;
private com.ansca.corona.AudioRecorder$AudioRecorderThread myRecorderThread;
/* # direct methods */
 com.ansca.corona.AudioRecorder ( ) {
	 /* .locals 1 */
	 /* .param p1, "h" # Landroid/os/Handler; */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 28 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 16 */
	 /* iput-boolean v0, p0, Lcom/ansca/corona/AudioRecorder;->myIsRunning:Z */
	 /* .line 236 */
	 /* iput-boolean v0, p0, Lcom/ansca/corona/AudioRecorder;->myIsNotifying:Z */
	 /* .line 29 */
	 this.myHandler = p1;
	 /* .line 30 */
	 return;
} // .end method
static Boolean access$000 ( com.ansca.corona.AudioRecorder p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/AudioRecorder; */
	 /* .prologue */
	 /* .line 15 */
	 /* iget-boolean v0, p0, Lcom/ansca/corona/AudioRecorder;->myIsRunning:Z */
} // .end method
static Boolean access$002 ( com.ansca.corona.AudioRecorder p0, Boolean p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/ansca/corona/AudioRecorder; */
	 /* .param p1, "x1" # Z */
	 /* .prologue */
	 /* .line 15 */
	 /* iput-boolean p1, p0, Lcom/ansca/corona/AudioRecorder;->myIsRunning:Z */
} // .end method
static void access$100 ( com.ansca.corona.AudioRecorder p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/ansca/corona/AudioRecorder; */
	 /* .param p1, "x1" # I */
	 /* .prologue */
	 /* .line 15 */
	 /* invoke-direct {p0, p1}, Lcom/ansca/corona/AudioRecorder;->postStatus(I)V */
	 return;
} // .end method
static Integer access$200 ( com.ansca.corona.AudioRecorder p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/AudioRecorder; */
	 /* .prologue */
	 /* .line 15 */
	 /* iget v0, p0, Lcom/ansca/corona/AudioRecorder;->myId:I */
} // .end method
private synchronized void postStatus ( Integer p0 ) {
	 /* .locals 2 */
	 /* .param p1, "status" # I */
	 /* .prologue */
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 240 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 /* iget-boolean v0, p0, Lcom/ansca/corona/AudioRecorder;->myIsNotifying:Z */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* if-ne v0, v1, :cond_0 */
		 /* .line 248 */
	 } // :goto_0
	 /* monitor-exit p0 */
	 return;
	 /* .line 242 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
	 /* iput-boolean v0, p0, Lcom/ansca/corona/AudioRecorder;->myIsNotifying:Z */
	 /* .line 243 */
	 v0 = this.myHandler;
	 /* new-instance v1, Lcom/ansca/corona/AudioRecorder$3; */
	 /* invoke-direct {v1, p0, p1}, Lcom/ansca/corona/AudioRecorder$3;-><init>(Lcom/ansca/corona/AudioRecorder;I)V */
	 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* .line 240 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
/* # virtual methods */
com.ansca.corona.AudioRecorder$AudioByteBufferHolder getCurrentBuffer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 263 */
	 v0 = this.myCurrentBuffer;
} // .end method
com.ansca.corona.AudioRecorder$AudioByteBufferHolder getNextBuffer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 254 */
	 v0 = this.myRecorderThread;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 255 */
		 v0 = this.myRecorderThread;
		 (( com.ansca.corona.AudioRecorder$AudioRecorderThread ) v0 ).getNextBuffer ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->getNextBuffer()Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;
		 this.myCurrentBuffer = v0;
		 /* .line 258 */
	 } // :goto_0
	 v0 = this.myCurrentBuffer;
	 /* .line 257 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
this.myCurrentBuffer = v0;
} // .end method
synchronized void releaseCurrentBuffer ( ) {
/* .locals 2 */
/* .prologue */
/* .line 268 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.myCurrentBuffer;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 269 */
		 v0 = this.myRecorderThread;
		 v1 = this.myCurrentBuffer;
		 (( com.ansca.corona.AudioRecorder$AudioRecorderThread ) v0 ).releaseBuffer ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->releaseBuffer(Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;)V
		 /* .line 270 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.myCurrentBuffer = v0;
		 /* .line 272 */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/ansca/corona/AudioRecorder;->myIsNotifying:Z */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 273 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 268 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public void setId ( Integer p0 ) {
	 /* .locals 0 */
	 /* .param p1, "id" # I */
	 /* .prologue */
	 /* .line 33 */
	 /* iput p1, p0, Lcom/ansca/corona/AudioRecorder;->myId:I */
	 /* .line 34 */
	 return;
} // .end method
public void startRecording ( java.lang.String p0 ) {
	 /* .locals 7 */
	 /* .param p1, "path" # Ljava/lang/String; */
	 /* .prologue */
	 int v6 = 1; // const/4 v6, 0x1
	 /* .line 37 */
	 /* iget-boolean v5, p0, Lcom/ansca/corona/AudioRecorder;->myIsRunning:Z */
	 if ( v5 != null) { // if-eqz v5, :cond_0
		 /* .line 95 */
	 } // :goto_0
	 return;
	 /* .line 40 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_3
	 final String v5 = ""; // const-string v5, ""
	 v5 = 	 (( java.lang.String ) p1 ).equals ( v5 ); // invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v5, :cond_3 */
	 /* .line 42 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 43 */
	 /* .local v3, "outputFormat":I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 45 */
	 /* .local v0, "audioEncoder":I */
	 final String v5 = ".3gp"; // const-string v5, ".3gp"
	 v5 = 	 (( java.lang.String ) p1 ).endsWith ( v5 ); // invoke-virtual {p1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
	 if ( v5 != null) { // if-eqz v5, :cond_1
		 /* .line 47 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* .line 48 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 52 */
	 } // :cond_1
	 try { // :try_start_0
		 /* new-instance v2, Ljava/io/File; */
		 /* invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 /* .line 53 */
		 /* .local v2, "file":Ljava/io/File; */
		 (( java.io.File ) v2 ).getParentFile ( ); // invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;
		 /* .line 54 */
		 /* .local v4, "parentDir":Ljava/io/File; */
		 v5 = 		 (( java.io.File ) v4 ).exists ( ); // invoke-virtual {v4}, Ljava/io/File;->exists()Z
		 /* if-nez v5, :cond_2 */
		 /* .line 56 */
		 (( java.io.File ) v4 ).mkdirs ( ); // invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z
		 /* .line 59 */
	 } // :cond_2
	 /* new-instance v5, Landroid/media/MediaRecorder; */
	 /* invoke-direct {v5}, Landroid/media/MediaRecorder;-><init>()V */
	 this.myMediaRecordInstance = v5;
	 /* .line 60 */
	 v5 = this.myMediaRecordInstance;
	 int v6 = 1; // const/4 v6, 0x1
	 (( android.media.MediaRecorder ) v5 ).setAudioSource ( v6 ); // invoke-virtual {v5, v6}, Landroid/media/MediaRecorder;->setAudioSource(I)V
	 /* .line 61 */
	 v5 = this.myMediaRecordInstance;
	 (( android.media.MediaRecorder ) v5 ).setOutputFormat ( v3 ); // invoke-virtual {v5, v3}, Landroid/media/MediaRecorder;->setOutputFormat(I)V
	 /* .line 62 */
	 v5 = this.myMediaRecordInstance;
	 (( android.media.MediaRecorder ) v5 ).setAudioEncoder ( v0 ); // invoke-virtual {v5, v0}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V
	 /* .line 63 */
	 v5 = this.myMediaRecordInstance;
	 (( android.media.MediaRecorder ) v5 ).setOutputFile ( p1 ); // invoke-virtual {v5, p1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V
	 /* .line 65 */
	 v5 = this.myMediaRecordInstance;
	 /* new-instance v6, Lcom/ansca/corona/AudioRecorder$1; */
	 /* invoke-direct {v6, p0}, Lcom/ansca/corona/AudioRecorder$1;-><init>(Lcom/ansca/corona/AudioRecorder;)V */
	 (( android.media.MediaRecorder ) v5 ).setOnErrorListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/media/MediaRecorder;->setOnErrorListener(Landroid/media/MediaRecorder$OnErrorListener;)V
	 /* .line 73 */
	 v5 = this.myMediaRecordInstance;
	 /* new-instance v6, Lcom/ansca/corona/AudioRecorder$2; */
	 /* invoke-direct {v6, p0}, Lcom/ansca/corona/AudioRecorder$2;-><init>(Lcom/ansca/corona/AudioRecorder;)V */
	 (( android.media.MediaRecorder ) v5 ).setOnInfoListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/media/MediaRecorder;->setOnInfoListener(Landroid/media/MediaRecorder$OnInfoListener;)V
	 /* .line 80 */
	 v5 = this.myMediaRecordInstance;
	 (( android.media.MediaRecorder ) v5 ).prepare ( ); // invoke-virtual {v5}, Landroid/media/MediaRecorder;->prepare()V
	 /* .line 81 */
	 v5 = this.myMediaRecordInstance;
	 (( android.media.MediaRecorder ) v5 ).start ( ); // invoke-virtual {v5}, Landroid/media/MediaRecorder;->start()V
	 /* .line 82 */
	 int v5 = 1; // const/4 v5, 0x1
	 /* iput-boolean v5, p0, Lcom/ansca/corona/AudioRecorder;->myIsRunning:Z */
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 84 */
} // .end local v2 # "file":Ljava/io/File;
} // .end local v4 # "parentDir":Ljava/io/File;
/* :catch_0 */
/* move-exception v1 */
/* .line 86 */
/* .local v1, "e":Ljava/io/IOException; */
int v5 = -1; // const/4 v5, -0x1
/* invoke-direct {p0, v5}, Lcom/ansca/corona/AudioRecorder;->postStatus(I)V */
/* .line 91 */
} // .end local v0 # "audioEncoder":I
} // .end local v1 # "e":Ljava/io/IOException;
} // .end local v3 # "outputFormat":I
} // :cond_3
/* new-instance v5, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread; */
/* invoke-direct {v5, p0}, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;-><init>(Lcom/ansca/corona/AudioRecorder;)V */
this.myRecorderThread = v5;
/* .line 92 */
v5 = this.myRecorderThread;
(( com.ansca.corona.AudioRecorder$AudioRecorderThread ) v5 ).startRecording ( ); // invoke-virtual {v5}, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->startRecording()V
/* .line 93 */
/* iput-boolean v6, p0, Lcom/ansca/corona/AudioRecorder;->myIsRunning:Z */
} // .end method
public void stopRecording ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 98 */
/* iget-boolean v0, p0, Lcom/ansca/corona/AudioRecorder;->myIsRunning:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 99 */
v0 = this.myMediaRecordInstance;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 100 */
v0 = this.myMediaRecordInstance;
(( android.media.MediaRecorder ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V
/* .line 101 */
v0 = this.myMediaRecordInstance;
(( android.media.MediaRecorder ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V
/* .line 102 */
this.myMediaRecordInstance = v1;
/* .line 104 */
} // :cond_0
v0 = this.myRecorderThread;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 105 */
v0 = this.myRecorderThread;
(( com.ansca.corona.AudioRecorder$AudioRecorderThread ) v0 ).stopRecording ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->stopRecording()V
/* .line 106 */
this.myRecorderThread = v1;
/* .line 109 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/AudioRecorder;->myIsRunning:Z */
/* .line 110 */
return;
} // .end method
