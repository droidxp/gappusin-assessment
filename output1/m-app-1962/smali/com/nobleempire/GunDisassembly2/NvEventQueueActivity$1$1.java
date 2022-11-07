class com.nobleempire.GunDisassembly2.NvEventQueueActivity$1$1 implements java.lang.Runnable {
	 /* .source "NvEventQueueActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1;->surfaceCreated(Landroid/view/SurfaceHolder;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.NvEventQueueActivity$1 this$1; //synthetic
private final com.nobleempire.GunDisassembly2.NvEventQueueActivity val$act; //synthetic
/* # direct methods */
 com.nobleempire.GunDisassembly2.NvEventQueueActivity$1$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
this.val$act = p2;
/* .line 543 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nobleempire.GunDisassembly2.NvEventQueueActivity$1 access$0 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity$1$1 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 543 */
v0 = this.this$1;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 545 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.val$act;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 546 */
final String v1 = "Application initialization failed.The application will exit."; // const-string v1, "Application initialization failed.The application will exit."
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 547 */
final String v1 = "Ok"; // const-string v1, "Ok"
/* new-instance v2, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1$1$1; */
/* invoke-direct {v2, p0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1$1$1;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$1$1;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 553 */
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 554 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 555 */
return;
} // .end method
