class net.chobin.android.psdxylz.app.ag implements android.widget.TextView$OnEditorActionListener {
	 /* # interfaces */
	 /* # instance fields */
	 final net.chobin.android.psdxylz.app.w a; //synthetic
	 /* # direct methods */
	 net.chobin.android.psdxylz.app.ag ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean onEditorAction ( android.widget.TextView p0, Integer p1, android.view.KeyEvent p2 ) {
		 /* .locals 3 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* packed-switch p2, :pswitch_data_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
	 /* :pswitch_0 */
	 v0 = this.a;
	 (( net.chobin.android.psdxylz.app.w ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/w;->a(I)V
	 v0 = this.a;
	 v2 = this.a;
	 v2 = this.a;
	 (( android.widget.EditText ) v2 ).getText ( ); // invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
	 net.chobin.android.psdxylz.app.w .a ( v0,v2 );
	 v0 = this.a;
	 net.chobin.android.psdxylz.app.w .a ( v0 );
	 v0 = this.a;
	 /* check-cast v0, Lnet/chobin/android/psdxylz/app/a; */
	 int v2 = 2; // const/4 v2, 0x2
	 (( net.chobin.android.psdxylz.app.a ) v0 ).removeDialog ( v2 ); // invoke-virtual {v0, v2}, Lnet/chobin/android/psdxylz/app/a;->removeDialog(I)V
	 v0 = this.a;
	 net.chobin.android.psdxylz.app.w .a ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.a;
		 net.chobin.android.psdxylz.app.w .a ( v0 );
		 (( android.app.AlertDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V
		 v0 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 net.chobin.android.psdxylz.app.w .a ( v0,v2 );
	 } // :cond_0
	 v0 = this.a;
	 (( net.chobin.android.psdxylz.app.w ) v0 ).b ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/w;->b()V
	 /* move v0, v1 */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x6 */
	 /* :pswitch_0 */
} // .end packed-switch
} // .end method
