class com.ansca.corona.AudioRecorder$3 implements java.lang.Runnable {
	 /* .source "AudioRecorder.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/AudioRecorder;->postStatus(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.AudioRecorder this$0; //synthetic
final Integer val$status; //synthetic
/* # direct methods */
 com.ansca.corona.AudioRecorder$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 243 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/AudioRecorder$3;->val$status:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 245 */
/* iget v0, p0, Lcom/ansca/corona/AudioRecorder$3;->val$status:I */
v1 = this.this$0;
v1 = com.ansca.corona.AudioRecorder .access$200 ( v1 );
com.ansca.corona.JavaToNativeShim .recordCallback ( v0,v1 );
/* .line 246 */
return;
} // .end method
