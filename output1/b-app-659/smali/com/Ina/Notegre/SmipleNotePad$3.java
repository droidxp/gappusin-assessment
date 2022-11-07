class com.Ina.Notegre.SmipleNotePad$3 implements android.content.DialogInterface$OnClickListener {
	 /* .source "SmipleNotePad.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/Notegre/SmipleNotePad; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.SmipleNotePad this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.SmipleNotePad$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 444 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "arg0" # Landroid/content/DialogInterface; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 449 */
v1 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$8 ( v1 );
(( android.widget.EditText ) v1 ).getText ( ); // invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
/* .line 450 */
/* .local v0, "sName":Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 452 */
	 v1 = this.this$0;
	 v2 = this.this$0;
	 /* const v3, 0x7f070013 */
	 (( com.Ina.Notegre.SmipleNotePad ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
	 com.Ina.Notegre.SmipleNotePad .access$9 ( v1,v2 );
	 /* .line 458 */
} // :goto_0
return;
/* .line 456 */
} // :cond_0
v1 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$10 ( v1 );
v2 = com.Ina.Notegre.SmipleNotePad .access$11 ( );
(( com.Ina.Notegre.SqlData ) v1 ).rename ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/Ina/Notegre/SqlData;->rename(ILjava/lang/String;)V
/* .line 457 */
v1 = this.this$0;
v2 = com.Ina.Notegre.SmipleNotePad .access$2 ( );
int v3 = 1; // const/4 v3, 0x1
(( com.Ina.Notegre.SmipleNotePad ) v1 ).GetTextList ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
} // .end method
