class com.nobleempire.GunDisassembly2.NvEventQueueActivity$1 implements android.view.SurfaceHolder$Callback {
	 /* .source "NvEventQueueActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->systemInit()Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.NvEventQueueActivity this$0; //synthetic
private final com.nobleempire.GunDisassembly2.NvEventQueueActivity val$act; //synthetic
/* # direct methods */
 com.nobleempire.GunDisassembly2.NvEventQueueActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$act = p2;
/* .line 534 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nobleempire.GunDisassembly2.NvEventQueueActivity access$0 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity$1 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 534 */
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
/* .line 569 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~surfaceCallback:surfaceChanged: "; // const-string v2, "~~surfaceCallback:surfaceChanged: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ", "; // const-string v2, ", "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 570 */
v0 = this.this$0;
v0 = com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$3 ( v0 );
/* if-nez v0, :cond_0 */
v0 = this.this$0;
v0 = com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$4 ( v0 );
/* if-nez v0, :cond_0 */
/* .line 571 */
v0 = this.this$0;
com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$5 ( v0,p3 );
/* .line 572 */
v0 = this.this$0;
com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$6 ( v0,p4 );
/* .line 573 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~ calling setWindowSize() at 529"; // const-string v1, "~~ calling setWindowSize() at 529"
android.util.Log .v ( v0,v1 );
/* .line 574 */
v0 = this.this$0;
v1 = this.this$0;
v1 = com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$3 ( v1 );
v2 = this.this$0;
v2 = com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$4 ( v2 );
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) v0 ).setWindowSize ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->setWindowSize(II)V
/* .line 575 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~ new resolution saved"; // const-string v1, "~~ new resolution saved"
android.util.Log .v ( v0,v1 );
/* .line 579 */
} // :goto_0
return;
/* .line 577 */
} // :cond_0
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~ resolution ignored"; // const-string v1, "~~ resolution ignored"
android.util.Log .v ( v0,v1 );
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 5 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 537 */
final String v2 = "NvEventQueueActivity.java"; // const-string v2, "NvEventQueueActivity.java"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "~~surfaceCallback:surfaceCreated.ranInit = "; // const-string v4, "~~surfaceCallback:surfaceCreated.ranInit = "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.this$0;
v4 = com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$1 ( v4 );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,v3 );
/* .line 539 */
v2 = this.this$0;
v2 = this.cachedSurfaceHolder;
/* if-nez v2, :cond_1 */
/* move v0, v1 */
/* .line 540 */
/* .local v0, "firstRun":Z */
} // :goto_0
v2 = this.this$0;
this.cachedSurfaceHolder = p1;
/* .line 541 */
v2 = this.this$0;
com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$2 ( v2,v1 );
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~>>>>>>>>>>>>>> ranInit set to true"; // const-string v2, "~~>>>>>>>>>>>>>> ranInit set to true"
android.util.Log .v ( v1,v2 );
/* .line 542 */
v1 = this.this$0;
/* iget-boolean v1, v1, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->supportPauseResume:Z */
/* if-nez v1, :cond_0 */
v1 = this.this$0;
v1 = (( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) v1 ).init ( ); // invoke-virtual {v1}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->init()Z
/* if-nez v1, :cond_0 */
/* .line 543 */
v1 = this.this$0;
v1 = this.handler;
/* new-instance v2, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1$1; */
v3 = this.val$act;
/* invoke-direct {v2, p0, v3}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1$1;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1;Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;)V */
(( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 559 */
} // :cond_0
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~ calling resumeEvent() at 528"; // const-string v2, "~~ calling resumeEvent() at 528"
android.util.Log .v ( v1,v2 );
/* .line 560 */
v1 = this.this$0;
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) v1 ).resumeEvent ( ); // invoke-virtual {v1}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->resumeEvent()V
/* .line 561 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~ calling setWindowSize() at 518"; // const-string v2, "~~ calling setWindowSize() at 518"
android.util.Log .v ( v1,v2 );
/* .line 562 */
v1 = this.this$0;
v2 = this.this$0;
v2 = com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$3 ( v2 );
v3 = this.this$0;
v3 = com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$4 ( v3 );
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) v1 ).setWindowSize ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->setWindowSize(II)V
/* .line 563 */
final String v1 = "NvEventQueueActivity.java"; // const-string v1, "NvEventQueueActivity.java"
final String v2 = "~~ surfaceCreated() finished"; // const-string v2, "~~ surfaceCreated() finished"
android.util.Log .v ( v1,v2 );
/* .line 564 */
return;
/* .line 539 */
} // .end local v0 # "firstRun":Z
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 584 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~surfaceCallback:surfaceDestroyed"; // const-string v1, "~~surfaceCallback:surfaceDestroyed"
android.util.Log .v ( v0,v1 );
/* .line 586 */
v0 = this.this$0;
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) v0 ).destroyEGLSurface ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->destroyEGLSurface()V
/* .line 587 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->surface_was_destroyed:Z */
/* .line 588 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~surface_was_destroyed = true"; // const-string v1, "~~surface_was_destroyed = true"
android.util.Log .i ( v0,v1 );
/* .line 589 */
return;
} // .end method
