class com.Ina.Notegre.SmipleNotePad$6$1 implements android.content.DialogInterface$OnClickListener {
	 /* .source "SmipleNotePad.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/Ina/Notegre/SmipleNotePad$6;->onClick(Landroid/content/DialogInterface;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.SmipleNotePad$6 this$1; //synthetic
private final Integer val$id; //synthetic
/* # direct methods */
 com.Ina.Notegre.SmipleNotePad$6$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* iput p2, p0, Lcom/Ina/Notegre/SmipleNotePad$6$1;->val$id:I */
/* .line 380 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 386 */
v0 = this.this$1;
com.Ina.Notegre.SmipleNotePad$6 .access$0 ( v0 );
com.Ina.Notegre.SmipleNotePad .access$10 ( v0 );
/* iget v1, p0, Lcom/Ina/Notegre/SmipleNotePad$6$1;->val$id:I */
(( com.Ina.Notegre.SqlData ) v0 ).moveIndex ( v1 ); // invoke-virtual {v0, v1}, Lcom/Ina/Notegre/SqlData;->moveIndex(I)V
/* .line 387 */
v0 = this.this$1;
com.Ina.Notegre.SmipleNotePad$6 .access$0 ( v0 );
com.Ina.Notegre.SmipleNotePad .access$10 ( v0 );
/* iget v1, p0, Lcom/Ina/Notegre/SmipleNotePad$6$1;->val$id:I */
(( com.Ina.Notegre.SqlData ) v0 ).deleteFolder ( v1 ); // invoke-virtual {v0, v1}, Lcom/Ina/Notegre/SqlData;->deleteFolder(I)V
/* .line 388 */
v0 = this.this$1;
com.Ina.Notegre.SmipleNotePad$6 .access$0 ( v0 );
v2 = com.Ina.Notegre.SmipleNotePad .access$2 ( );
v0 = com.Ina.Notegre.SmipleNotePad .access$2 ( );
int v3 = -1; // const/4 v3, -0x1
/* if-ne v0, v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
(( com.Ina.Notegre.SmipleNotePad ) v1 ).GetTextList ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 389 */
return;
/* .line 388 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
