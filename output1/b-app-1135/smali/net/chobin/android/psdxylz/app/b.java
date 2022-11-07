class net.chobin.android.psdxylz.app.b extends android.content.BroadcastReceiver {
	 /* # instance fields */
	 final net.chobin.android.psdxylz.app.a a; //synthetic
	 /* # direct methods */
	 private net.chobin.android.psdxylz.app.b ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 net.chobin.android.psdxylz.app.b ( ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lnet/chobin/android/psdxylz/app/b;-><init>(Lnet/chobin/android/psdxylz/app/a;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 2 */
		 final String v0 = "unlock receiver onReceive"; // const-string v0, "unlock receiver onReceive"
		 net.chobin.android.psdxylz.app.r .a ( v0 );
		 v0 = this.a;
		 net.chobin.android.psdxylz.app.a .a ( v0 );
		 v0 = this.a;
		 v1 = this.a;
		 net.chobin.android.psdxylz.app.a .a ( v1 );
		 (( net.chobin.android.psdxylz.app.a ) v0 ).unregisterReceiver ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/a;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
		 int v0 = 0; // const/4 v0, 0x0
		 net.chobin.android.psdxylz.app.a.a = (v0!= 0);
		 return;
	 } // .end method
