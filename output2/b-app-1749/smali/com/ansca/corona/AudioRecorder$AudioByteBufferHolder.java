public class com.ansca.corona.AudioRecorder$AudioByteBufferHolder {
	 /* .source "AudioRecorder.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/AudioRecorder; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "AudioByteBufferHolder" */
} // .end annotation
/* # instance fields */
java.nio.ByteBuffer myBuffer;
Integer myValidBytes;
/* # direct methods */
 com.ansca.corona.AudioRecorder$AudioByteBufferHolder ( ) {
/* .locals 1 */
/* .param p1, "capacity" # I */
/* .prologue */
/* .line 118 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 115 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;->myValidBytes:I */
/* .line 119 */
java.nio.ByteBuffer .allocateDirect ( p1 );
this.myBuffer = v0;
/* .line 120 */
return;
} // .end method
