class com.wiyun.engine.nodes.TextBox$1 implements java.lang.Runnable {
	 /* .source "TextBox.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/TextBox;->showInputDialog(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final android.content.Context val$context; //synthetic
private final Integer val$pointer; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.TextBox$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* iput p1, p0, Lcom/wiyun/engine/nodes/TextBox$1;->val$pointer:I */
this.val$context = p2;
/* .line 190 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 9 */
/* .prologue */
/* .line 193 */
/* iget v7, p0, Lcom/wiyun/engine/nodes/TextBox$1;->val$pointer:I */
com.wiyun.engine.nodes.TextBox .from ( v7 );
/* .line 194 */
/* .local v0, "box":Lcom/wiyun/engine/nodes/TextBox; */
/* if-nez v0, :cond_0 */
/* .line 279 */
} // :goto_0
return;
/* .line 198 */
} // :cond_0
/* new-instance v4, Landroid/widget/EditText; */
v7 = this.val$context;
/* invoke-direct {v4, v7}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
/* .line 199 */
/* .local v4, "et":Landroid/widget/EditText; */
int v7 = 1; // const/4 v7, 0x1
(( android.widget.EditText ) v4 ).setSingleLine ( v7 ); // invoke-virtual {v4, v7}, Landroid/widget/EditText;->setSingleLine(Z)V
/* .line 200 */
v7 = this.val$context;
/* const v8, 0x1030044 */
(( android.widget.EditText ) v4 ).setTextAppearance ( v7, v8 ); // invoke-virtual {v4, v7, v8}, Landroid/widget/EditText;->setTextAppearance(Landroid/content/Context;I)V
/* .line 201 */
/* const/high16 v7, -0x1000000 */
(( android.widget.EditText ) v4 ).setTextColor ( v7 ); // invoke-virtual {v4, v7}, Landroid/widget/EditText;->setTextColor(I)V
/* .line 202 */
(( com.wiyun.engine.nodes.TextBox ) v0 ).getText ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/TextBox;->getText()Ljava/lang/String;
(( android.widget.EditText ) v4 ).setText ( v7 ); // invoke-virtual {v4, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
/* .line 203 */
(( android.widget.EditText ) v4 ).selectAll ( ); // invoke-virtual {v4}, Landroid/widget/EditText;->selectAll()V
/* .line 204 */
v7 = (( com.wiyun.engine.nodes.TextBox ) v0 ).isPassword ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/TextBox;->isPassword()Z
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 205 */
android.text.method.PasswordTransformationMethod .getInstance ( );
(( android.widget.EditText ) v4 ).setTransformationMethod ( v7 ); // invoke-virtual {v4, v7}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V
/* .line 206 */
} // :cond_1
/* new-instance v7, Lcom/wiyun/engine/nodes/TextBox$1$1; */
/* invoke-direct {v7, p0, v0, v4}, Lcom/wiyun/engine/nodes/TextBox$1$1;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Lcom/wiyun/engine/nodes/TextBox;Landroid/widget/EditText;)V */
(( android.widget.EditText ) v4 ).addTextChangedListener ( v7 ); // invoke-virtual {v4, v7}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V
/* .line 223 */
/* new-instance v2, Landroid/app/AlertDialog$Builder; */
v7 = this.val$context;
/* invoke-direct {v2, v7}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 226 */
/* .local v2, "builder":Landroid/app/AlertDialog$Builder; */
(( android.app.AlertDialog$Builder ) v2 ).setView ( v4 ); // invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
/* .line 229 */
(( com.wiyun.engine.nodes.TextBox ) v0 ).getPositiveButton ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/TextBox;->getPositiveButton()Ljava/lang/String;
/* .line 230 */
/* .local v1, "btn":Ljava/lang/String; */
/* if-nez v1, :cond_2 */
/* .line 231 */
final String v1 = "OK"; // const-string v1, "OK"
/* .line 232 */
} // :cond_2
/* new-instance v7, Lcom/wiyun/engine/nodes/TextBox$1$2; */
/* invoke-direct {v7, p0, v0, v4}, Lcom/wiyun/engine/nodes/TextBox$1$2;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Lcom/wiyun/engine/nodes/TextBox;Landroid/widget/EditText;)V */
(( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v1, v7 ); // invoke-virtual {v2, v1, v7}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 240 */
(( com.wiyun.engine.nodes.TextBox ) v0 ).getNegativeButton ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/TextBox;->getNegativeButton()Ljava/lang/String;
/* .line 241 */
/* if-nez v1, :cond_3 */
/* .line 242 */
final String v1 = "Cancel"; // const-string v1, "Cancel"
/* .line 243 */
} // :cond_3
/* new-instance v7, Lcom/wiyun/engine/nodes/TextBox$1$3; */
/* invoke-direct {v7, p0, v0}, Lcom/wiyun/engine/nodes/TextBox$1$3;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Lcom/wiyun/engine/nodes/TextBox;)V */
(( android.app.AlertDialog$Builder ) v2 ).setNegativeButton ( v1, v7 ); // invoke-virtual {v2, v1, v7}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 251 */
/* new-instance v7, Lcom/wiyun/engine/nodes/TextBox$1$4; */
/* invoke-direct {v7, p0, v0}, Lcom/wiyun/engine/nodes/TextBox$1$4;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Lcom/wiyun/engine/nodes/TextBox;)V */
(( android.app.AlertDialog$Builder ) v2 ).setOnCancelListener ( v7 ); // invoke-virtual {v2, v7}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
/* .line 259 */
(( com.wiyun.engine.nodes.TextBox ) v0 ).getTitle ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/TextBox;->getTitle()Ljava/lang/String;
/* .line 260 */
/* .local v6, "title":Ljava/lang/String; */
v7 = android.text.TextUtils .isEmpty ( v6 );
/* if-nez v7, :cond_4 */
/* .line 261 */
(( android.app.AlertDialog$Builder ) v2 ).setTitle ( v6 ); // invoke-virtual {v2, v6}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 264 */
} // :cond_4
(( com.wiyun.engine.nodes.TextBox ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/TextBox;->getMessage()Ljava/lang/String;
/* .line 265 */
/* .local v5, "msg":Ljava/lang/String; */
v7 = android.text.TextUtils .isEmpty ( v5 );
/* if-nez v7, :cond_5 */
/* .line 266 */
(( android.app.AlertDialog$Builder ) v2 ).setMessage ( v5 ); // invoke-virtual {v2, v5}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 270 */
} // :cond_5
(( android.app.AlertDialog$Builder ) v2 ).create ( ); // invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 271 */
/* .local v3, "d":Landroid/app/Dialog; */
/* new-instance v7, Lcom/wiyun/engine/nodes/TextBox$1$5; */
/* invoke-direct {v7, p0, v3}, Lcom/wiyun/engine/nodes/TextBox$1$5;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Landroid/app/Dialog;)V */
(( android.widget.EditText ) v4 ).setOnFocusChangeListener ( v7 ); // invoke-virtual {v4, v7}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
/* .line 278 */
(( android.app.Dialog ) v3 ).show ( ); // invoke-virtual {v3}, Landroid/app/Dialog;->show()V
/* goto/16 :goto_0 */
} // .end method
