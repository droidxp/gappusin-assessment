class com.Ina.Notegre.SmipleNotePad$6 implements android.content.DialogInterface$OnClickListener {
	 /* .source "SmipleNotePad.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/Ina/Notegre/SmipleNotePad;->deleteText(ILjava/lang/String;I)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.SmipleNotePad this$0; //synthetic
private final Integer val$id; //synthetic
private final Integer val$nType; //synthetic
/* # direct methods */
 com.Ina.Notegre.SmipleNotePad$6 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* iput p2, p0, Lcom/Ina/Notegre/SmipleNotePad$6;->val$nType:I */
/* iput p3, p0, Lcom/Ina/Notegre/SmipleNotePad$6;->val$id:I */
/* .line 363 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.Ina.Notegre.SmipleNotePad access$0 ( com.Ina.Notegre.SmipleNotePad$6 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 363 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "arg0" # Landroid/content/DialogInterface; */
/* .param p2, "arg1" # I */
/* .prologue */
/* const v4, 0x7f07000d */
int v3 = -1; // const/4 v3, -0x1
/* .line 368 */
/* iget v0, p0, Lcom/Ina/Notegre/SmipleNotePad$6;->val$nType:I */
/* if-ne v3, v0, :cond_1 */
/* .line 370 */
v0 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$10 ( v0 );
/* iget v1, p0, Lcom/Ina/Notegre/SmipleNotePad$6;->val$id:I */
(( com.Ina.Notegre.SqlData ) v0 ).delete ( v1 ); // invoke-virtual {v0, v1}, Lcom/Ina/Notegre/SqlData;->delete(I)V
/* .line 371 */
v1 = this.this$0;
v2 = com.Ina.Notegre.SmipleNotePad .access$2 ( );
v0 = com.Ina.Notegre.SmipleNotePad .access$2 ( );
/* if-ne v0, v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
(( com.Ina.Notegre.SmipleNotePad ) v1 ).GetTextList ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 404 */
} // :goto_1
return;
/* .line 371 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 375 */
} // :cond_1
com.Ina.Notegre.SmipleNotePad .access$12 ( v3 );
/* .line 377 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.this$0;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 378 */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v4 ); // invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
/* .line 379 */
/* const v1, 0x7f070010 */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;
/* .line 380 */
/* const v1, 0x7f070011 */
/* new-instance v2, Lcom/Ina/Notegre/SmipleNotePad$6$1; */
/* iget v3, p0, Lcom/Ina/Notegre/SmipleNotePad$6;->val$id:I */
/* invoke-direct {v2, p0, v3}, Lcom/Ina/Notegre/SmipleNotePad$6$1;-><init>(Lcom/Ina/Notegre/SmipleNotePad$6;I)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 391 */
/* new-instance v1, Lcom/Ina/Notegre/SmipleNotePad$6$2; */
/* iget v2, p0, Lcom/Ina/Notegre/SmipleNotePad$6;->val$id:I */
/* invoke-direct {v1, p0, v2}, Lcom/Ina/Notegre/SmipleNotePad$6$2;-><init>(Lcom/Ina/Notegre/SmipleNotePad$6;I)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 402 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
} // .end method
