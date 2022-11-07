class com.wiyun.engine.nodes.TextBox$1 implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 private final android.content.Context val$context; //synthetic
	 private final Integer val$pointer; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.nodes.TextBox$1 ( ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lcom/wiyun/engine/nodes/TextBox$1;->val$pointer:I */
		 this.val$context = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* iget v0, p0, Lcom/wiyun/engine/nodes/TextBox$1;->val$pointer:I */
		 com.wiyun.engine.nodes.TextBox .from ( v0 );
		 /* if-nez v1, :cond_0 */
	 } // :goto_0
	 return;
} // :cond_0
/* new-instance v2, Landroid/widget/EditText; */
v0 = this.val$context;
/* invoke-direct {v2, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
int v0 = 1; // const/4 v0, 0x1
(( android.widget.EditText ) v2 ).setSingleLine ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/EditText;->setSingleLine(Z)V
v0 = this.val$context;
/* const v3, 0x1030044 */
(( android.widget.EditText ) v2 ).setTextAppearance ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/widget/EditText;->setTextAppearance(Landroid/content/Context;I)V
/* const/high16 v0, -0x1000000 */
(( android.widget.EditText ) v2 ).setTextColor ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/EditText;->setTextColor(I)V
(( com.wiyun.engine.nodes.TextBox ) v1 ).getText ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/TextBox;->getText()Ljava/lang/String;
(( android.widget.EditText ) v2 ).setText ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
(( android.widget.EditText ) v2 ).selectAll ( ); // invoke-virtual {v2}, Landroid/widget/EditText;->selectAll()V
v0 = (( com.wiyun.engine.nodes.TextBox ) v1 ).isPassword ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/TextBox;->isPassword()Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 android.text.method.PasswordTransformationMethod .getInstance ( );
	 (( android.widget.EditText ) v2 ).setTransformationMethod ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V
} // :cond_1
/* new-instance v0, Lcom/wiyun/engine/nodes/TextBox$1$1; */
/* invoke-direct {v0, p0, v1, v2}, Lcom/wiyun/engine/nodes/TextBox$1$1;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Lcom/wiyun/engine/nodes/TextBox;Landroid/widget/EditText;)V */
(( android.widget.EditText ) v2 ).addTextChangedListener ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V
/* new-instance v3, Landroid/app/AlertDialog$Builder; */
v0 = this.val$context;
/* invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v3 ).setView ( v2 ); // invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
(( com.wiyun.engine.nodes.TextBox ) v1 ).getPositiveButton ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/TextBox;->getPositiveButton()Ljava/lang/String;
/* if-nez v0, :cond_2 */
final String v0 = "OK"; // const-string v0, "OK"
} // :cond_2
/* new-instance v4, Lcom/wiyun/engine/nodes/TextBox$1$2; */
/* invoke-direct {v4, p0, v1, v2}, Lcom/wiyun/engine/nodes/TextBox$1$2;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Lcom/wiyun/engine/nodes/TextBox;Landroid/widget/EditText;)V */
(( android.app.AlertDialog$Builder ) v3 ).setPositiveButton ( v0, v4 ); // invoke-virtual {v3, v0, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( com.wiyun.engine.nodes.TextBox ) v1 ).getNegativeButton ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/TextBox;->getNegativeButton()Ljava/lang/String;
/* if-nez v0, :cond_3 */
final String v0 = "Cancel"; // const-string v0, "Cancel"
} // :cond_3
/* new-instance v4, Lcom/wiyun/engine/nodes/TextBox$1$3; */
/* invoke-direct {v4, p0, v1}, Lcom/wiyun/engine/nodes/TextBox$1$3;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Lcom/wiyun/engine/nodes/TextBox;)V */
(( android.app.AlertDialog$Builder ) v3 ).setNegativeButton ( v0, v4 ); // invoke-virtual {v3, v0, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* new-instance v0, Lcom/wiyun/engine/nodes/TextBox$1$4; */
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/nodes/TextBox$1$4;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Lcom/wiyun/engine/nodes/TextBox;)V */
(( android.app.AlertDialog$Builder ) v3 ).setOnCancelListener ( v0 ); // invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
(( com.wiyun.engine.nodes.TextBox ) v1 ).getTitle ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/TextBox;->getTitle()Ljava/lang/String;
v4 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v4, :cond_4 */
(( android.app.AlertDialog$Builder ) v3 ).setTitle ( v0 ); // invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
} // :cond_4
(( com.wiyun.engine.nodes.TextBox ) v1 ).getMessage ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/TextBox;->getMessage()Ljava/lang/String;
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_5 */
(( android.app.AlertDialog$Builder ) v3 ).setMessage ( v0 ); // invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
} // :cond_5
(( android.app.AlertDialog$Builder ) v3 ).create ( ); // invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* new-instance v1, Lcom/wiyun/engine/nodes/TextBox$1$5; */
/* invoke-direct {v1, p0, v0}, Lcom/wiyun/engine/nodes/TextBox$1$5;-><init>(Lcom/wiyun/engine/nodes/TextBox$1;Landroid/app/Dialog;)V */
(( android.widget.EditText ) v2 ).setOnFocusChangeListener ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
(( android.app.Dialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->show()V
/* goto/16 :goto_0 */
} // .end method
