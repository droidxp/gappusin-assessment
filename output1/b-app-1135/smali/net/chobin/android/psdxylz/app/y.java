class net.chobin.android.psdxylz.app.y implements android.content.DialogInterface$OnShowListener {
	 /* # interfaces */
	 /* # instance fields */
	 final net.chobin.android.psdxylz.app.w a; //synthetic
	 /* # direct methods */
	 net.chobin.android.psdxylz.app.y ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onShow ( android.content.DialogInterface p0 ) {
		 /* .locals 3 */
		 v0 = this.a;
		 net.chobin.android.psdxylz.app.w .a ( v0 );
		 v0 = this.a;
		 final String v1 = "input_method"; // const-string v1, "input_method"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
		 v1 = this.a;
		 v1 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.view.inputmethod.InputMethodManager ) v0 ).showSoftInput ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
		 return;
	 } // .end method
