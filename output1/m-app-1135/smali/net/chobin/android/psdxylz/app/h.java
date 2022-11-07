class net.chobin.android.psdxylz.app.h implements android.content.DialogInterface$OnCancelListener {
	 /* # interfaces */
	 /* # instance fields */
	 final net.chobin.android.psdxylz.app.g a; //synthetic
	 /* # direct methods */
	 net.chobin.android.psdxylz.app.h ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCancel ( android.content.DialogInterface p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 net.chobin.android.psdxylz.app.g .a ( v0 );
		 (( net.chobin.android.psdxylz.app.a ) v0 ).finish ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->finish()V
		 return;
	 } // .end method
