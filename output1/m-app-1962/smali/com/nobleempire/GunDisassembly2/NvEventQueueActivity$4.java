class com.nobleempire.GunDisassembly2.NvEventQueueActivity$4 implements java.lang.Runnable {
	 /* .source "NvEventQueueActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->test_alert_dialog2(ILjava/lang/String;Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.NvEventQueueActivity this$0; //synthetic
private final com.nobleempire.GunDisassembly2.NvEventQueueActivity val$act; //synthetic
private final Integer val$f_dlg_id; //synthetic
private final java.lang.String val$f_message; //synthetic
private final java.lang.String val$f_title; //synthetic
/* # direct methods */
 com.nobleempire.GunDisassembly2.NvEventQueueActivity$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$act = p2;
this.val$f_title = p3;
this.val$f_message = p4;
/* iput p5, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4;->val$f_dlg_id:I */
/* .line 866 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nobleempire.GunDisassembly2.NvEventQueueActivity access$0 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity$4 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 866 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 868 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.val$act;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 869 */
v1 = this.val$f_title;
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 870 */
v1 = this.val$f_message;
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 871 */
final String v1 = "Ok"; // const-string v1, "Ok"
/* .line 872 */
/* new-instance v2, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4$1; */
/* iget v3, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4;->val$f_dlg_id:I */
/* invoke-direct {v2, p0, v3}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4$1;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4;I)V */
/* .line 871 */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 879 */
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 880 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 881 */
return;
} // .end method
