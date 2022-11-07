class com.Ina.Notegre.SmipleNotePad$4 implements android.content.DialogInterface$OnClickListener {
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
 com.Ina.Notegre.SmipleNotePad$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 461 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "arg0" # Landroid/content/DialogInterface; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 466 */
v1 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$8 ( v1 );
(( android.widget.EditText ) v1 ).getText ( ); // invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
/* .line 467 */
/* .local v0, "sTitle":Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 469 */
	 v1 = this.this$0;
	 v2 = this.this$0;
	 /* const v3, 0x7f070013 */
	 (( com.Ina.Notegre.SmipleNotePad ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
	 com.Ina.Notegre.SmipleNotePad .access$9 ( v1,v2 );
	 /* .line 483 */
} // :goto_0
return;
/* .line 473 */
} // :cond_0
v1 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$10 ( v1 );
v1 = (( com.Ina.Notegre.SqlData ) v1 ).haveFolder ( v0 ); // invoke-virtual {v1, v0}, Lcom/Ina/Notegre/SqlData;->haveFolder(Ljava/lang/String;)Z
/* if-nez v1, :cond_1 */
/* .line 475 */
v1 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$10 ( v1 );
v2 = com.Ina.Notegre.SmipleNotePad .access$11 ( );
v3 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$8 ( v3 );
(( android.widget.EditText ) v3 ).getText ( ); // invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
(( com.Ina.Notegre.SqlData ) v1 ).reFolderName ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/Ina/Notegre/SqlData;->reFolderName(ILjava/lang/String;)V
/* .line 477 */
v1 = this.this$0;
v2 = com.Ina.Notegre.SmipleNotePad .access$2 ( );
int v3 = 1; // const/4 v3, 0x1
(( com.Ina.Notegre.SmipleNotePad ) v1 ).GetTextList ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/Ina/Notegre/SmipleNotePad;->GetTextList(IZ)I
/* .line 481 */
} // :cond_1
v1 = this.this$0;
v2 = this.this$0;
/* const v3, 0x7f070014 */
(( com.Ina.Notegre.SmipleNotePad ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Lcom/Ina/Notegre/SmipleNotePad;->getString(I)Ljava/lang/String;
com.Ina.Notegre.SmipleNotePad .access$9 ( v1,v2 );
} // .end method
