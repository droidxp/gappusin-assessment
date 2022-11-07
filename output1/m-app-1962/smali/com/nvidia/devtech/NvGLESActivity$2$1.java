class com.nvidia.devtech.NvGLESActivity$2$1 implements java.lang.Runnable {
	 /* .source "NvGLESActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nvidia/devtech/NvGLESActivity$2;->surfaceCreated(Landroid/view/SurfaceHolder;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nvidia.devtech.NvGLESActivity$2 this$1; //synthetic
private final com.nvidia.devtech.NvActivity val$act; //synthetic
/* # direct methods */
 com.nvidia.devtech.NvGLESActivity$2$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
this.val$act = p2;
/* .line 349 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nvidia.devtech.NvGLESActivity$2 access$0 ( com.nvidia.devtech.NvGLESActivity$2$1 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 349 */
v0 = this.this$1;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 353 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.val$act;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 354 */
final String v1 = "EGL Initialization failed, the application will exit."; // const-string v1, "EGL Initialization failed, the application will exit."
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 355 */
final String v1 = "Ok"; // const-string v1, "Ok"
/* .line 356 */
/* new-instance v2, Lcom/nvidia/devtech/NvGLESActivity$2$1$1; */
/* invoke-direct {v2, p0}, Lcom/nvidia/devtech/NvGLESActivity$2$1$1;-><init>(Lcom/nvidia/devtech/NvGLESActivity$2$1;)V */
/* .line 355 */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 363 */
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 364 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 365 */
return;
} // .end method
