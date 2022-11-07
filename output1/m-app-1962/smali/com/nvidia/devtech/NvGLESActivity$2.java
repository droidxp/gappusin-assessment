class com.nvidia.devtech.NvGLESActivity$2 implements android.view.SurfaceHolder$Callback {
	 /* .source "NvGLESActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nvidia/devtech/NvGLESActivity;->systemInit()Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nvidia.devtech.NvGLESActivity this$0; //synthetic
private final com.nvidia.devtech.NvActivity val$act; //synthetic
/* # direct methods */
 com.nvidia.devtech.NvGLESActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$act = p2;
/* .line 318 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nvidia.devtech.NvGLESActivity access$0 ( com.nvidia.devtech.NvGLESActivity$2 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 318 */
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
/* .line 375 */
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
/* .line 376 */
v0 = this.this$0;
com.nvidia.devtech.NvGLESActivity .access$10 ( v0,p3 );
/* .line 377 */
v0 = this.this$0;
com.nvidia.devtech.NvGLESActivity .access$11 ( v0,p4 );
/* .line 378 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 5 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 323 */
int v0 = 1; // const/4 v0, 0x1
/* .line 324 */
/* .local v0, "eglInitialized":Z */
v2 = this.this$0;
v2 = this.eglContext;
/* if-nez v2, :cond_3 */
int v1 = 1; // const/4 v1, 0x1
/* .line 325 */
/* .local v1, "firstRun":Z */
} // :goto_0
v2 = this.this$0;
v2 = this.eglContext;
/* if-nez v2, :cond_0 */
/* .line 327 */
v2 = this.this$0;
v0 = (( com.nvidia.devtech.NvGLESActivity ) v2 ).initEGL ( ); // invoke-virtual {v2}, Lcom/nvidia/devtech/NvGLESActivity;->initEGL()Z
/* .line 329 */
v2 = this.this$0;
v2 = com.nvidia.devtech.NvGLESActivity .access$7 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.this$0;
v2 = com.nvidia.devtech.NvGLESActivity .access$8 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 331 */
	 v2 = java.lang.System.out;
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 final String v4 = "Setting fixed window size of "; // const-string v4, "Setting fixed window size of "
	 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v4 = this.this$0;
	 v4 = 	 com.nvidia.devtech.NvGLESActivity .access$7 ( v4 );
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v4 = " x "; // const-string v4, " x "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v4 = this.this$0;
	 v4 = 	 com.nvidia.devtech.NvGLESActivity .access$8 ( v4 );
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 332 */
	 v2 = this.this$0;
	 v2 = 	 com.nvidia.devtech.NvGLESActivity .access$7 ( v2 );
	 v3 = this.this$0;
	 v3 = 	 com.nvidia.devtech.NvGLESActivity .access$8 ( v3 );
	 /* .line 336 */
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 338 */
	 v2 = this.this$0;
	 (( com.nvidia.devtech.NvGLESActivity ) v2 ).createEGLSurface ( p1 ); // invoke-virtual {v2, p1}, Lcom/nvidia/devtech/NvGLESActivity;->createEGLSurface(Landroid/view/SurfaceHolder;)Z
	 /* .line 340 */
	 v2 = this.this$0;
	 (( com.nvidia.devtech.NvGLESActivity ) v2 ).nvAcquireTimeExtension ( ); // invoke-virtual {v2}, Lcom/nvidia/devtech/NvGLESActivity;->nvAcquireTimeExtension()V
	 /* .line 343 */
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 345 */
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 /* .line 346 */
		 v2 = this.this$0;
		 v2 = this.handler;
		 v3 = this.this$0;
		 com.nvidia.devtech.NvGLESActivity .access$9 ( v3 );
		 (( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 /* .line 369 */
	 } // :cond_2
} // :goto_1
return;
/* .line 324 */
} // .end local v1 # "firstRun":Z
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
/* .line 349 */
/* .restart local v1 # "firstRun":Z */
} // :cond_4
v2 = this.this$0;
v2 = this.handler;
/* new-instance v3, Lcom/nvidia/devtech/NvGLESActivity$2$1; */
v4 = this.val$act;
/* invoke-direct {v3, p0, v4}, Lcom/nvidia/devtech/NvGLESActivity$2$1;-><init>(Lcom/nvidia/devtech/NvGLESActivity$2;Lcom/nvidia/devtech/NvActivity;)V */
(( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 383 */
v0 = this.this$0;
(( com.nvidia.devtech.NvGLESActivity ) v0 ).destroyEGLSurface ( ); // invoke-virtual {v0}, Lcom/nvidia/devtech/NvGLESActivity;->destroyEGLSurface()V
/* .line 384 */
return;
} // .end method
