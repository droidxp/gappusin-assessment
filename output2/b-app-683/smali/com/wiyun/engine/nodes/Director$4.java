class com.wiyun.engine.nodes.Director$4 implements java.lang.Runnable {
	 /* .source "Director.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/Director;->showAlertDialog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final android.app.Activity val$act; //synthetic
private final Integer val$okSelectorPointer; //synthetic
private final java.lang.String val$positiveButton; //synthetic
private final java.lang.String val$text; //synthetic
private final java.lang.String val$title; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.Director$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.val$act = p1;
this.val$title = p2;
this.val$text = p3;
this.val$positiveButton = p4;
/* iput p5, p0, Lcom/wiyun/engine/nodes/Director$4;->val$okSelectorPointer:I */
/* .line 502 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 504 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.val$act;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 505 */
/* .local v0, "builder":Landroid/app/AlertDialog$Builder; */
v1 = this.val$title;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 506 */
	 v1 = this.val$title;
	 (( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
	 /* .line 507 */
} // :cond_0
v1 = this.val$text;
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 508 */
	 v1 = this.val$text;
	 (( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
	 /* .line 509 */
} // :cond_1
v1 = this.val$positiveButton;
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 510 */
	 v1 = this.val$positiveButton;
	 /* new-instance v2, Lcom/wiyun/engine/nodes/Director$4$1; */
	 /* iget v3, p0, Lcom/wiyun/engine/nodes/Director$4;->val$okSelectorPointer:I */
	 /* invoke-direct {v2, p0, v3}, Lcom/wiyun/engine/nodes/Director$4$1;-><init>(Lcom/wiyun/engine/nodes/Director$4;I)V */
	 (( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
	 /* .line 521 */
} // :cond_2
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 522 */
return;
} // .end method
