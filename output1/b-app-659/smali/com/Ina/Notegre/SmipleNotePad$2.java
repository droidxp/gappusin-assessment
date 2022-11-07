class com.Ina.Notegre.SmipleNotePad$2 implements android.widget.AdapterView$OnItemLongClickListener {
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
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Landroid/widget/AdapterView$OnItemLongClickListener;" */
/* } */
} // .end annotation
/* # instance fields */
private Integer nId;
private java.lang.String sContent;
private java.lang.String sTitle;
final com.Ina.Notegre.SmipleNotePad this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.SmipleNotePad$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 221 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static Integer access$0 ( com.Ina.Notegre.SmipleNotePad$2 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 225 */
/* iget v0, p0, Lcom/Ina/Notegre/SmipleNotePad$2;->nId:I */
} // .end method
static java.lang.String access$1 ( com.Ina.Notegre.SmipleNotePad$2 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 223 */
v0 = this.sTitle;
} // .end method
static java.lang.String access$2 ( com.Ina.Notegre.SmipleNotePad$2 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 224 */
v0 = this.sContent;
} // .end method
static com.Ina.Notegre.SmipleNotePad access$3 ( com.Ina.Notegre.SmipleNotePad$2 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 221 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public Boolean onItemLongClick ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
/* .locals 5 */
/* .param p2, "arg1" # Landroid/view/View; */
/* .param p3, "arg2" # I */
/* .param p4, "arg3" # J */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView", */
/* "<*>;", */
/* "Landroid/view/View;", */
/* "IJ)Z" */
/* } */
} // .end annotation
/* .prologue */
/* .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;" */
/* const v4, 0x7f070008 */
int v1 = 1; // const/4 v1, 0x1
/* .line 231 */
v2 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$1 ( v2 );
v0 = (( com.Ina.Notegre.TextAdapter ) v2 ).getType ( p3 ); // invoke-virtual {v2, p3}, Lcom/Ina/Notegre/TextAdapter;->getType(I)I
/* .line 232 */
/* .local v0, "nType":I */
int v2 = 5; // const/4 v2, 0x5
/* if-ne v2, v0, :cond_1 */
/* .line 233 */
int v1 = 0; // const/4 v1, 0x0
/* .line 306 */
} // :cond_0
} // :goto_0
/* .line 234 */
} // :cond_1
v2 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$1 ( v2 );
v2 = (( com.Ina.Notegre.TextAdapter ) v2 ).getId ( p3 ); // invoke-virtual {v2, p3}, Lcom/Ina/Notegre/TextAdapter;->getId(I)I
/* iput v2, p0, Lcom/Ina/Notegre/SmipleNotePad$2;->nId:I */
/* .line 236 */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v2, v0, :cond_2 */
/* .line 239 */
v2 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$1 ( v2 );
(( com.Ina.Notegre.TextAdapter ) v2 ).getTitle ( p3 ); // invoke-virtual {v2, p3}, Lcom/Ina/Notegre/TextAdapter;->getTitle(I)Ljava/lang/String;
this.sTitle = v2;
/* .line 240 */
v2 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$1 ( v2 );
(( com.Ina.Notegre.TextAdapter ) v2 ).getContent ( p3 ); // invoke-virtual {v2, p3}, Lcom/Ina/Notegre/TextAdapter;->getContent(I)Ljava/lang/String;
this.sContent = v2;
/* .line 242 */
/* new-instance v2, Landroid/app/AlertDialog$Builder; */
v3 = this.this$0;
/* invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 243 */
(( android.app.AlertDialog$Builder ) v2 ).setTitle ( v4 ); // invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
/* .line 244 */
/* const/high16 v3, 0x7f080000 */
/* new-instance v4, Lcom/Ina/Notegre/SmipleNotePad$2$1; */
/* invoke-direct {v4, p0}, Lcom/Ina/Notegre/SmipleNotePad$2$1;-><init>(Lcom/Ina/Notegre/SmipleNotePad$2;)V */
(( android.app.AlertDialog$Builder ) v2 ).setItems ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setItems(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 275 */
(( android.app.AlertDialog$Builder ) v2 ).show ( ); // invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 277 */
} // :cond_2
/* if-ne v1, v0, :cond_0 */
/* .line 279 */
v2 = this.this$0;
com.Ina.Notegre.SmipleNotePad .access$1 ( v2 );
(( com.Ina.Notegre.TextAdapter ) v2 ).getFolderName ( p3 ); // invoke-virtual {v2, p3}, Lcom/Ina/Notegre/TextAdapter;->getFolderName(I)Ljava/lang/String;
this.sTitle = v2;
/* .line 281 */
/* new-instance v2, Landroid/app/AlertDialog$Builder; */
v3 = this.this$0;
/* invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 282 */
(( android.app.AlertDialog$Builder ) v2 ).setTitle ( v4 ); // invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
/* .line 283 */
/* const v3, 0x7f080001 */
/* new-instance v4, Lcom/Ina/Notegre/SmipleNotePad$2$2; */
/* invoke-direct {v4, p0}, Lcom/Ina/Notegre/SmipleNotePad$2$2;-><init>(Lcom/Ina/Notegre/SmipleNotePad$2;)V */
(( android.app.AlertDialog$Builder ) v2 ).setItems ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setItems(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 303 */
(( android.app.AlertDialog$Builder ) v2 ).show ( ); // invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
} // .end method
