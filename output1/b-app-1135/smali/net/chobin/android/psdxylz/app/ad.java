class net.chobin.android.psdxylz.app.ad implements android.content.DialogInterface$OnCancelListener {
	 /* # interfaces */
	 /* # instance fields */
	 final net.chobin.android.psdxylz.app.w a; //synthetic
	 /* # direct methods */
	 net.chobin.android.psdxylz.app.ad ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCancel ( android.content.DialogInterface p0 ) {
		 /* .locals 2 */
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( net.chobin.android.psdxylz.app.w ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/w;->a(I)V
		 v0 = this.a;
		 (( net.chobin.android.psdxylz.app.w ) v0 ).b ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/w;->b()V
		 return;
	 } // .end method
