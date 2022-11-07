class com.nobleempire.GunDisassembly2.NvEventQueueActivity$3 implements java.lang.Runnable {
	 /* .source "NvEventQueueActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->test_alert_dialog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.NvEventQueueActivity this$0; //synthetic
private final com.nobleempire.GunDisassembly2.NvEventQueueActivity val$act; //synthetic
private final java.lang.String val$f_cancel_btn; //synthetic
private final Integer val$f_dlg_id; //synthetic
private final java.lang.String val$f_message; //synthetic
private final java.lang.String val$f_ok_btn; //synthetic
private final java.lang.String val$f_title; //synthetic
/* # direct methods */
 com.nobleempire.GunDisassembly2.NvEventQueueActivity$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$act = p2;
this.val$f_title = p3;
this.val$f_message = p4;
this.val$f_ok_btn = p5;
this.val$f_cancel_btn = p6;
/* iput p7, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3;->val$f_dlg_id:I */
/* .line 837 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nobleempire.GunDisassembly2.NvEventQueueActivity access$0 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity$3 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 837 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 839 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.val$act;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 840 */
/* .local v0, "dlg":Landroid/app/AlertDialog$Builder; */
v1 = this.val$f_title;
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 841 */
v1 = this.val$f_message;
final String v2 = "-"; // const-string v2, "-"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 842 */
v1 = this.val$f_message;
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 844 */
} // :cond_0
v1 = this.val$f_ok_btn;
/* .line 845 */
/* new-instance v2, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3$1; */
/* iget v3, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3;->val$f_dlg_id:I */
/* invoke-direct {v2, p0, v3}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3$1;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3;I)V */
/* .line 844 */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 848 */
v1 = this.val$f_cancel_btn;
final String v2 = ""; // const-string v2, ""
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* .line 849 */
v1 = this.val$f_cancel_btn;
/* .line 850 */
/* new-instance v2, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3$2; */
/* iget v3, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3;->val$f_dlg_id:I */
/* invoke-direct {v2, p0, v3}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3$2;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$3;I)V */
/* .line 849 */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 854 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 855 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 856 */
return;
} // .end method
