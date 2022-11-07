class com.nobleempire.GunDisassembly2.NvEventQueueActivity$2 implements java.lang.Runnable {
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
private final java.lang.String val$f_text; //synthetic
private final java.lang.String val$f_title; //synthetic
/* # direct methods */
 com.nobleempire.GunDisassembly2.NvEventQueueActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$act = p2;
this.val$f_text = p3;
this.val$f_title = p4;
this.val$f_message = p5;
this.val$f_ok_btn = p6;
this.val$f_cancel_btn = p7;
/* iput p8, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2;->val$f_dlg_id:I */
/* .line 805 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.nobleempire.GunDisassembly2.NvEventQueueActivity access$0 ( com.nobleempire.GunDisassembly2.NvEventQueueActivity$2 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 805 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 807 */
/* new-instance v1, Landroid/widget/EditText; */
v2 = this.val$act;
/* invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
/* .line 808 */
/* .local v1, "input":Landroid/widget/EditText; */
v2 = this.val$f_text;
v3 = android.widget.TextView$BufferType.EDITABLE;
(( android.widget.EditText ) v1 ).setText ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
/* .line 809 */
v2 = this.val$f_text;
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
v3 = this.val$f_text;
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
(( android.widget.EditText ) v1 ).setSelection ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/widget/EditText;->setSelection(II)V
/* .line 810 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v2 = this.val$act;
/* invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 811 */
/* .local v0, "dlg":Landroid/app/AlertDialog$Builder; */
v2 = this.val$f_title;
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 812 */
v2 = this.val$f_message;
final String v3 = "-"; // const-string v3, "-"
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_0 */
/* .line 813 */
v2 = this.val$f_message;
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 821 */
} // :cond_0
v2 = this.val$f_ok_btn;
/* .line 822 */
/* new-instance v3, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2$1; */
/* iget v4, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2;->val$f_dlg_id:I */
/* invoke-direct {v3, p0, v4, v1}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2$1;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2;ILandroid/widget/EditText;)V */
/* .line 821 */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 825 */
v2 = this.val$f_cancel_btn;
final String v3 = ""; // const-string v3, ""
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_1 */
/* .line 826 */
v2 = this.val$f_cancel_btn;
/* .line 827 */
/* new-instance v3, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2$2; */
/* iget v4, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2;->val$f_dlg_id:I */
/* invoke-direct {v3, p0, v4, v1}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2$2;-><init>(Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$2;ILandroid/widget/EditText;)V */
/* .line 826 */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 831 */
} // :cond_1
(( android.app.AlertDialog$Builder ) v0 ).setView ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
/* .line 832 */
int v2 = 0; // const/4 v2, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 833 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 834 */
return;
} // .end method
