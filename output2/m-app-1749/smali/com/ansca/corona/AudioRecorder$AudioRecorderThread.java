class com.ansca.corona.AudioRecorder$AudioRecorderThread extends java.lang.Thread {
	 /* .source "AudioRecorder.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/AudioRecorder; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "AudioRecorderThread" */
} // .end annotation
/* # static fields */
static final Integer MAX_BUFFERS;
/* # instance fields */
private android.media.AudioRecord myAudioRecordInstance;
private Integer myBufferSize;
private java.util.LinkedList myBuffers;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Float myFrameSeconds;
private java.util.LinkedList myFreeBuffers;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
final com.ansca.corona.AudioRecorder this$0; //synthetic
/* # direct methods */
 com.ansca.corona.AudioRecorder$AudioRecorderThread ( ) {
/* .locals 1 */
/* .prologue */
/* .line 137 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
/* .line 129 */
/* const v0, 0x3dcccccd # 0.1f */
/* iput v0, p0, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->myFrameSeconds:F */
/* .line 133 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.myBuffers = v0;
/* .line 134 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.myFreeBuffers = v0;
/* .line 138 */
return;
} // .end method
/* # virtual methods */
com.ansca.corona.AudioRecorder$AudioByteBufferHolder getNextBuffer ( ) {
/* .locals 4 */
/* .prologue */
/* .line 215 */
int v1 = 0; // const/4 v1, 0x0
/* .line 216 */
/* .local v1, "result":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
v3 = this.myBuffers;
/* monitor-enter v3 */
/* .line 217 */
try { // :try_start_0
v2 = this.myBuffers;
v2 = (( java.util.LinkedList ) v2 ).isEmpty ( ); // invoke-virtual {v2}, Ljava/util/LinkedList;->isEmpty()Z
/* if-nez v2, :cond_0 */
/* .line 219 */
v2 = this.myBuffers;
(( java.util.LinkedList ) v2 ).remove ( ); // invoke-virtual {v2}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;
/* move-object v0, v2 */
/* check-cast v0, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
/* move-object v1, v0 */
/* .line 220 */
/* monitor-exit v3 */
/* move-object v2, v1 */
/* .line 223 */
} // :goto_0
/* .line 222 */
} // :cond_0
/* monitor-exit v3 */
/* .line 223 */
int v2 = 0; // const/4 v2, 0x0
/* .line 222 */
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit v3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v2 */
} // .end method
void releaseBuffer ( com.ansca.corona.AudioRecorder$AudioByteBufferHolder p0 ) {
/* .locals 2 */
/* .param p1, "buffer" # Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
/* .prologue */
/* .line 227 */
v1 = this.myFreeBuffers;
/* monitor-enter v1 */
/* .line 228 */
try { // :try_start_0
v0 = this.myFreeBuffers;
(( java.util.LinkedList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 230 */
v0 = this.this$0;
v0 = com.ansca.corona.AudioRecorder .access$000 ( v0 );
/* if-nez v0, :cond_0 */
/* .line 231 */
v0 = this.myFreeBuffers;
(( java.util.LinkedList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
/* .line 232 */
} // :cond_0
/* monitor-exit v1 */
/* .line 233 */
return;
/* .line 232 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void run ( ) {
/* .locals 13 */
/* .prologue */
/* .line 152 */
/* const/16 v1, -0x13 */
try { // :try_start_0
android.os.Process .setThreadPriority ( v1 );
/* .line 155 */
/* const/16 v1, 0x1f40 */
v2 = com.ansca.corona.Controller .getAndroidVersionSpecific ( );
int v3 = 2; // const/4 v3, 0x2
v10 = android.media.AudioRecord .getMinBufferSize ( v1,v2,v3 );
/* .line 158 */
/* .local v10, "minBufferSize":I */
/* const/high16 v1, 0x467a0000 # 16000.0f */
/* iget v2, p0, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->myFrameSeconds:F */
/* mul-float/2addr v1, v2 */
/* float-to-int v7, v1 */
/* .line 160 */
/* .local v7, "bufferSize":I */
/* if-ge v7, v10, :cond_0 */
/* .line 161 */
/* move v7, v10 */
/* .line 162 */
} // :cond_0
/* iput v7, p0, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->myBufferSize:I */
/* .line 164 */
/* new-instance v1, Landroid/media/AudioRecord; */
int v2 = 1; // const/4 v2, 0x1
/* const/16 v3, 0x1f40 */
v4 = com.ansca.corona.Controller .getAndroidVersionSpecific ( );
int v5 = 2; // const/4 v5, 0x2
/* iget v6, p0, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->myBufferSize:I */
/* invoke-direct/range {v1 ..v6}, Landroid/media/AudioRecord;-><init>(IIIII)V */
this.myAudioRecordInstance = v1;
/* .line 169 */
v1 = this.myFreeBuffers;
/* new-instance v2, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
/* iget v3, p0, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->myBufferSize:I */
/* invoke-direct {v2, v3}, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;-><init>(I)V */
(( java.util.LinkedList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 171 */
v1 = this.myAudioRecordInstance;
(( android.media.AudioRecord ) v1 ).startRecording ( ); // invoke-virtual {v1}, Landroid/media/AudioRecord;->startRecording()V
/* .line 173 */
} // :goto_0
v1 = this.this$0;
v1 = com.ansca.corona.AudioRecorder .access$000 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 175 */
int v11 = 0; // const/4 v11, 0x0
/* .line 177 */
/* .local v11, "readBuffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 178 */
try { // :try_start_1
v1 = this.myFreeBuffers;
v1 = (( java.util.LinkedList ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->isEmpty()Z
/* if-nez v1, :cond_3 */
/* .line 179 */
v1 = this.myFreeBuffers;
(( java.util.LinkedList ) v1 ).remove ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;
/* move-object v0, v1 */
/* check-cast v0, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
/* move-object v11, v0 */
/* .line 182 */
} // :cond_1
} // :goto_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 184 */
if ( v11 != null) { // if-eqz v11, :cond_2
/* .line 185 */
try { // :try_start_2
v1 = this.myAudioRecordInstance;
v2 = this.myBuffer;
/* iget v3, p0, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->myBufferSize:I */
v8 = (( android.media.AudioRecord ) v1 ).read ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I
/* .line 187 */
/* .local v8, "bytesRead":I */
/* monitor-enter p0 */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 188 */
/* if-lez v8, :cond_4 */
/* .line 189 */
try { // :try_start_3
/* iput v8, v11, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;->myValidBytes:I */
/* .line 191 */
v1 = this.myBuffers;
(( java.util.LinkedList ) v1 ).add ( v11 ); // invoke-virtual {v1, v11}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 192 */
v1 = this.this$0;
com.ansca.corona.AudioRecorder .access$100 ( v1,v8 );
/* .line 198 */
} // :goto_2
/* monitor-exit p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* .line 200 */
} // .end local v8 # "bytesRead":I
} // :cond_2
/* const-wide/16 v1, 0xf */
try { // :try_start_4
com.ansca.corona.AudioRecorder$AudioRecorderThread .sleep ( v1,v2 );
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .line 207 */
} // .end local v7 # "bufferSize":I
} // .end local v10 # "minBufferSize":I
} // .end local v11 # "readBuffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;
/* :catch_0 */
/* move-exception v9 */
/* .line 209 */
/* .local v9, "e":Ljava/lang/Exception; */
v1 = this.this$0;
int v2 = -1; // const/4 v2, -0x1
com.ansca.corona.AudioRecorder .access$100 ( v1,v2 );
/* .line 211 */
} // .end local v9 # "e":Ljava/lang/Exception;
} // :goto_3
return;
/* .line 180 */
/* .restart local v7 # "bufferSize":I */
/* .restart local v10 # "minBufferSize":I */
/* .restart local v11 # "readBuffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
} // :cond_3
try { // :try_start_5
v1 = this.myBuffers;
v1 = (( java.util.LinkedList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->size()I
int v2 = 5; // const/4 v2, 0x5
/* if-ge v1, v2, :cond_1 */
/* .line 181 */
/* new-instance v12, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
/* iget v1, p0, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->myBufferSize:I */
/* invoke-direct {v12, v1}, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;-><init>(I)V */
} // .end local v11 # "readBuffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;
/* .local v12, "readBuffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
/* move-object v11, v12 */
} // .end local v12 # "readBuffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;
/* .restart local v11 # "readBuffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
/* .line 182 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
try { // :try_start_6
/* throw v1 */
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_0 */
/* .line 196 */
/* .restart local v8 # "bytesRead":I */
} // :cond_4
try { // :try_start_7
v1 = this.myFreeBuffers;
(( java.util.LinkedList ) v1 ).add ( v11 ); // invoke-virtual {v1, v11}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 198 */
/* :catchall_1 */
/* move-exception v1 */
/* monitor-exit p0 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
try { // :try_start_8
/* throw v1 */
/* .line 203 */
} // .end local v8 # "bytesRead":I
} // .end local v11 # "readBuffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;
} // :cond_5
v1 = this.myAudioRecordInstance;
(( android.media.AudioRecord ) v1 ).stop ( ); // invoke-virtual {v1}, Landroid/media/AudioRecord;->stop()V
/* .line 205 */
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
com.ansca.corona.AudioRecorder .access$100 ( v1,v2 );
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_0 */
} // .end method
void startRecording ( ) {
/* .locals 0 */
/* .prologue */
/* .line 141 */
(( com.ansca.corona.AudioRecorder$AudioRecorderThread ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/ansca/corona/AudioRecorder$AudioRecorderThread;->start()V
/* .line 142 */
return;
} // .end method
void stopRecording ( ) {
/* .locals 2 */
/* .prologue */
/* .line 145 */
v0 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
com.ansca.corona.AudioRecorder .access$002 ( v0,v1 );
/* .line 146 */
return;
} // .end method
