class com.Ina.Notegre.SmipleNotePad$10 implements android.content.DialogInterface$OnClickListener {
	 /* .source "SmipleNotePad.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/Ina/Notegre/SmipleNotePad;->popupMove(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.SmipleNotePad this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.SmipleNotePad$10 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 571 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 577 */
v1 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$13 ( v1 );
/* check-cast v1, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* .line 578 */
/* .local v0, "nId":I */
v1 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$10 ( v1 );
v2 = com.Ina.Notegre.SmipleNotePad .access$11 ( );
(( com.Ina.Notegre.SqlData ) v1 ).updateIndex ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/Ina/Notegre/SqlData;->updateIndex(II)V
/* .line 580 */
v2 = this.this$0;
v3 = com.Ina.Notegre.SmipleNotePad .access$2 ( );
v1 = com.Ina.Notegre.SmipleNotePad .access$2 ( );
int v4 = -1; // const/4 v4, -0x1
/* if-ne v1, v4, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
(( com.Ina.Notegre.SmipleNotePad ) v2 ).GetTextList ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 581 */
return;
/* .line 580 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
