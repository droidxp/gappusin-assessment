public class net.chobin.android.psdxylz.app.w {
	 /* # instance fields */
	 public Integer a;
	 private android.app.AlertDialog$Builder a;
	 private android.app.AlertDialog a;
	 public android.widget.EditText a;
	 public java.lang.String a;
	 private net.chobin.android.psdxylz.app.k a;
	 private Boolean a;
	 public Integer b;
	 public java.lang.String b;
	 private Integer c;
	 public java.lang.String c;
	 public java.lang.String d;
	 public java.lang.String e;
	 private java.lang.String f;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.w ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/w;->a:Z */
		 this.a = p1;
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/w;->a:Z */
		 return;
	 } // .end method
	 static android.app.AlertDialog a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 static net.chobin.android.psdxylz.app.k a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 static void a ( Object p0, android.app.AlertDialog p1 ) { //synthethic
		 /* .locals 0 */
		 this.a = p1;
		 return;
	 } // .end method
	 static void a ( Object p0, java.lang.String p1 ) { //synthethic
		 /* .locals 0 */
		 this.f = p1;
		 return;
	 } // .end method
	 private void c ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Landroid/app/AlertDialog$Builder; */
		 v1 = this.a;
		 v1 = this.a;
		 /* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 this.a = v0;
		 v0 = this.a;
		 v1 = this.a;
		 (( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 v1 = this.b;
		 (( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/w;->a:I */
		 (( android.app.AlertDialog$Builder ) v0 ).setIcon ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 /* new-instance v1, Lnet/chobin/android/psdxylz/app/x; */
		 /* invoke-direct {v1, p0}, Lnet/chobin/android/psdxylz/app/x;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
		 (( android.app.AlertDialog$Builder ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 v1 = this.d;
		 /* new-instance v2, Lnet/chobin/android/psdxylz/app/z; */
		 /* invoke-direct {v2, p0}, Lnet/chobin/android/psdxylz/app/z;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
		 (( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 (( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
		 this.a = v0;
		 return;
	 } // .end method
	 private void d ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Landroid/app/AlertDialog$Builder; */
		 v1 = this.a;
		 v1 = this.a;
		 /* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 this.a = v0;
		 v0 = this.a;
		 v1 = this.a;
		 (( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 v1 = this.b;
		 (( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/w;->a:I */
		 (( android.app.AlertDialog$Builder ) v0 ).setIcon ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 /* new-instance v1, Lnet/chobin/android/psdxylz/app/aa; */
		 /* invoke-direct {v1, p0}, Lnet/chobin/android/psdxylz/app/aa;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
		 (( android.app.AlertDialog$Builder ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 v1 = this.d;
		 /* new-instance v2, Lnet/chobin/android/psdxylz/app/ab; */
		 /* invoke-direct {v2, p0}, Lnet/chobin/android/psdxylz/app/ab;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
		 (( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 v1 = this.e;
		 /* new-instance v2, Lnet/chobin/android/psdxylz/app/ac; */
		 /* invoke-direct {v2, p0}, Lnet/chobin/android/psdxylz/app/ac;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
		 (( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 v0 = this.a;
		 (( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
		 this.a = v0;
		 return;
	 } // .end method
	 private void e ( ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-instance v1, Landroid/app/AlertDialog$Builder; */
		 v2 = this.a;
		 v2 = this.a;
		 /* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 this.a = v1;
		 v1 = this.a;
		 (( android.app.AlertDialog$Builder ) v1 ).setCancelable ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
		 v1 = this.a;
		 /* new-instance v2, Lnet/chobin/android/psdxylz/app/ad; */
		 /* invoke-direct {v2, p0}, Lnet/chobin/android/psdxylz/app/ad;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
		 (( android.app.AlertDialog$Builder ) v1 ).setOnCancelListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
		 v1 = this.a;
		 v2 = this.d;
		 /* new-instance v3, Lnet/chobin/android/psdxylz/app/ae; */
		 /* invoke-direct {v3, p0}, Lnet/chobin/android/psdxylz/app/ae;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
		 (( android.app.AlertDialog$Builder ) v1 ).setPositiveButton ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 v1 = this.a;
		 v2 = this.e;
		 /* new-instance v3, Lnet/chobin/android/psdxylz/app/af; */
		 /* invoke-direct {v3, p0}, Lnet/chobin/android/psdxylz/app/af;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
		 (( android.app.AlertDialog$Builder ) v1 ).setNegativeButton ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 v1 = this.a;
		 (( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
		 this.a = v1;
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/w;->b:I */
		 /* packed-switch v1, :pswitch_data_0 */
	 } // :goto_0
	 /* :pswitch_0 */
	 /* new-instance v1, Landroid/widget/EditText; */
	 v2 = this.a;
	 v2 = this.a;
	 /* invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
	 this.a = v1;
	 v1 = this.a;
	 v2 = this.c;
	 (( android.widget.EditText ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
	 v1 = this.a;
	 (( android.widget.EditText ) v1 ).setInputType ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/EditText;->setInputType(I)V
	 v0 = this.a;
	 int v1 = 6; // const/4 v1, 0x6
	 (( android.widget.EditText ) v0 ).setImeOptions ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/EditText;->setImeOptions(I)V
	 v0 = this.a;
	 /* new-instance v1, Lnet/chobin/android/psdxylz/app/ag; */
	 /* invoke-direct {v1, p0}, Lnet/chobin/android/psdxylz/app/ag;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
	 (( android.widget.EditText ) v0 ).setOnEditorActionListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
	 v0 = this.a;
	 v1 = this.a;
	 (( android.app.AlertDialog ) v0 ).setView ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V
	 v0 = this.a;
	 /* new-instance v1, Lnet/chobin/android/psdxylz/app/y; */
	 /* invoke-direct {v1, p0}, Lnet/chobin/android/psdxylz/app/y;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
	 (( android.app.AlertDialog ) v0 ).setOnShowListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V
	 return;
	 /* :pswitch_1 */
	 /* const/16 v0, 0x21 */
	 /* :pswitch_2 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/w;->c:I */
} // .end method
public android.app.Dialog a ( Integer p0 ) {
/* .locals 1 */
/* packed-switch p1, :pswitch_data_0 */
} // :goto_0
v0 = this.a;
/* :pswitch_0 */
/* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/w;->c()V */
/* :pswitch_1 */
/* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/w;->d()V */
/* :pswitch_2 */
/* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/w;->e()V */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public java.lang.String a ( ) {
/* .locals 1 */
v0 = this.f;
} // .end method
public net.chobin.android.psdxylz.app.k a ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public void a ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/w;->a:Z */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lnet/chobin/android/psdxylz/app/w;->c:I */
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v1 = this.c;
(( android.widget.EditText ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/w;->a:Z */
} // .end method
public void b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/w;->a:Z */
return;
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 0 */
this.f = p1;
return;
} // .end method
