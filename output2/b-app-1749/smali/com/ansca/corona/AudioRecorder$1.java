class com.ansca.corona.AudioRecorder$1 implements android.media.MediaRecorder$OnErrorListener {
	 /* .source "AudioRecorder.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/AudioRecorder;->startRecording(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.AudioRecorder this$0; //synthetic
/* # direct methods */
 com.ansca.corona.AudioRecorder$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 65 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onError ( android.media.MediaRecorder p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "arg0" # Landroid/media/MediaRecorder; */
/* .param p2, "arg1" # I */
/* .param p3, "arg2" # I */
/* .prologue */
/* .line 68 */
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "MediaRecorder error "; // const-string v2, "MediaRecorder error "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " "; // const-string v2, " "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 69 */
v0 = this.this$0;
(( com.ansca.corona.AudioRecorder ) v0 ).stopRecording ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AudioRecorder;->stopRecording()V
/* .line 70 */
return;
} // .end method
