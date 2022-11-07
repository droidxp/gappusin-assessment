class com.nvidia.devtech.NvEventQueueActivity$1 implements android.view.SurfaceHolder$Callback {
	 /* .source "NvEventQueueActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nvidia/devtech/NvEventQueueActivity;->systemInit()Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nvidia.devtech.NvEventQueueActivity this$0; //synthetic
private final com.nvidia.devtech.NvEventQueueActivity val$act; //synthetic
/* # direct methods */
 com.nvidia.devtech.NvEventQueueActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$act = p2;
/* .line 554 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nvidia.devtech.NvEventQueueActivity access$0 ( com.nvidia.devtech.NvEventQueueActivity$1 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 554 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .prologue */
/* .line 610 */
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Surface changed: "; // const-string v2, "Surface changed: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 611 */
v0 = this.this$0;
com.nvidia.devtech.NvEventQueueActivity .access$5 ( v0,p3 );
/* .line 612 */
v0 = this.this$0;
com.nvidia.devtech.NvEventQueueActivity .access$6 ( v0,p4 );
/* .line 613 */
v0 = this.this$0;
v1 = this.this$0;
v1 = com.nvidia.devtech.NvEventQueueActivity .access$3 ( v1 );
v2 = this.this$0;
v2 = com.nvidia.devtech.NvEventQueueActivity .access$4 ( v2 );
(( com.nvidia.devtech.NvEventQueueActivity ) v0 ).setWindowSize ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/nvidia/devtech/NvEventQueueActivity;->setWindowSize(II)V
/* .line 614 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 4 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 559 */
v2 = java.lang.System.out;
final String v3 = "systemInit.surfaceCreated"; // const-string v3, "systemInit.surfaceCreated"
(( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 561 */
v2 = this.this$0;
v2 = this.cachedSurfaceHolder;
/* if-nez v2, :cond_2 */
/* move v0, v1 */
/* .line 562 */
/* .local v0, "firstRun":Z */
} // :goto_0
v2 = this.this$0;
this.cachedSurfaceHolder = p1;
/* .line 564 */
v2 = this.this$0;
v2 = com.nvidia.devtech.NvEventQueueActivity .access$0 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.this$0;
v2 = com.nvidia.devtech.NvEventQueueActivity .access$1 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 566 */
	 v2 = java.lang.System.out;
	 final String v3 = "Setting fixed window size"; // const-string v3, "Setting fixed window size"
	 (( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 567 */
	 v2 = this.this$0;
	 v2 = 	 com.nvidia.devtech.NvEventQueueActivity .access$0 ( v2 );
	 v3 = this.this$0;
	 v3 = 	 com.nvidia.devtech.NvEventQueueActivity .access$1 ( v3 );
	 /* .line 570 */
} // :cond_0
v2 = this.this$0;
com.nvidia.devtech.NvEventQueueActivity .access$2 ( v2,v1 );
/* .line 571 */
v1 = this.this$0;
/* iget-boolean v1, v1, Lcom/nvidia/devtech/NvEventQueueActivity;->supportPauseResume:Z */
/* if-nez v1, :cond_1 */
v1 = this.this$0;
v1 = (( com.nvidia.devtech.NvEventQueueActivity ) v1 ).init ( ); // invoke-virtual {v1}, Lcom/nvidia/devtech/NvEventQueueActivity;->init()Z
/* if-nez v1, :cond_1 */
/* .line 573 */
v1 = this.this$0;
v1 = this.handler;
/* new-instance v2, Lcom/nvidia/devtech/NvEventQueueActivity$1$1; */
v3 = this.val$act;
/* invoke-direct {v2, p0, v3}, Lcom/nvidia/devtech/NvEventQueueActivity$1$1;-><init>(Lcom/nvidia/devtech/NvEventQueueActivity$1;Lcom/nvidia/devtech/NvEventQueueActivity;)V */
(( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 595 */
} // :cond_1
v1 = java.lang.System.out;
final String v2 = "entering resumeEvent"; // const-string v2, "entering resumeEvent"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 596 */
v1 = this.this$0;
(( com.nvidia.devtech.NvEventQueueActivity ) v1 ).resumeEvent ( ); // invoke-virtual {v1}, Lcom/nvidia/devtech/NvEventQueueActivity;->resumeEvent()V
/* .line 597 */
v1 = java.lang.System.out;
final String v2 = "returned from resumeEvent"; // const-string v2, "returned from resumeEvent"
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 598 */
v1 = this.this$0;
v2 = this.this$0;
v2 = com.nvidia.devtech.NvEventQueueActivity .access$3 ( v2 );
v3 = this.this$0;
v3 = com.nvidia.devtech.NvEventQueueActivity .access$4 ( v3 );
(( com.nvidia.devtech.NvEventQueueActivity ) v1 ).setWindowSize ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/nvidia/devtech/NvEventQueueActivity;->setWindowSize(II)V
/* .line 599 */
return;
/* .line 561 */
} // .end local v0 # "firstRun":Z
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 624 */
v0 = java.lang.System.out;
final String v1 = "systemInit.surfaceDestroyed"; // const-string v1, "systemInit.surfaceDestroyed"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 626 */
v0 = this.this$0;
(( com.nvidia.devtech.NvEventQueueActivity ) v0 ).destroyEGLSurface ( ); // invoke-virtual {v0}, Lcom/nvidia/devtech/NvEventQueueActivity;->destroyEGLSurface()V
/* .line 627 */
return;
} // .end method
