class com.nvidia.devtech.NvGLESActivity$1 implements java.lang.Runnable {
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
 com.nvidia.devtech.NvGLESActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$act = p2;
/* .line 254 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nvidia.devtech.NvGLESActivity access$0 ( com.nvidia.devtech.NvGLESActivity$1 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 254 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 258 */
v1 = this.this$0;
int v2 = 1; // const/4 v2, 0x1
com.nvidia.devtech.NvGLESActivity .access$0 ( v1,v2 );
/* .line 259 */
v1 = this.this$0;
v1 = (( com.nvidia.devtech.NvGLESActivity ) v1 ).init ( ); // invoke-virtual {v1}, Lcom/nvidia/devtech/NvGLESActivity;->init()Z
/* if-nez v1, :cond_0 */
/* .line 261 */
v1 = this.this$0;
(( com.nvidia.devtech.NvGLESActivity ) v1 ).getLastErrorMsg ( ); // invoke-virtual {v1}, Lcom/nvidia/devtech/NvGLESActivity;->getLastErrorMsg()Ljava/lang/String;
/* .line 262 */
/* .local v0, "msg":Ljava/lang/String; */
v1 = this.this$0;
v1 = this.handler;
/* new-instance v2, Lcom/nvidia/devtech/NvGLESActivity$1$1; */
v3 = this.val$act;
/* invoke-direct {v2, p0, v3, v0}, Lcom/nvidia/devtech/NvGLESActivity$1$1;-><init>(Lcom/nvidia/devtech/NvGLESActivity$1;Lcom/nvidia/devtech/NvActivity;Ljava/lang/String;)V */
(( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 310 */
} // .end local v0 # "msg":Ljava/lang/String;
} // :goto_0
return;
/* .line 284 */
} // :cond_0
v1 = this.this$0;
/* new-instance v2, Lcom/nvidia/devtech/NvGLESActivity$1$2; */
/* invoke-direct {v2, p0}, Lcom/nvidia/devtech/NvGLESActivity$1$2;-><init>(Lcom/nvidia/devtech/NvGLESActivity$1;)V */
com.nvidia.devtech.NvGLESActivity .access$5 ( v1,v2 );
/* .line 308 */
v1 = this.this$0;
v1 = this.handler;
v2 = this.this$0;
com.nvidia.devtech.NvGLESActivity .access$6 ( v2 );
(( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
