class net.chobin.android.a.l extends net.chobin.android.a.f {
	 /* # instance fields */
	 private java.lang.Runnable a;
	 final net.chobin.android.a.k a; //synthetic
	 private final net.chobin.android.a.p a;
	 /* # direct methods */
	 public net.chobin.android.a.l ( ) {
		 /* .locals 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Lnet/chobin/android/a/f;-><init>()V */
		 this.a = p2;
		 /* new-instance v0, Lnet/chobin/android/a/m; */
		 /* invoke-direct {v0, p0}, Lnet/chobin/android/a/m;-><init>(Lnet/chobin/android/a/l;)V */
		 this.a = v0;
		 /* invoke-direct {p0}, Lnet/chobin/android/a/l;->a()V */
		 return;
	 } // .end method
	 static net.chobin.android.a.k a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 static net.chobin.android.a.p a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 private void a ( ) {
		 /* .locals 4 */
		 final String v0 = "LicenseChecker: Start monitoring timeout."; // const-string v0, "LicenseChecker: Start monitoring timeout."
		 net.chobin.android.a.q .a ( v0 );
		 v0 = this.a;
		 net.chobin.android.a.k .a ( v0 );
		 v1 = this.a;
		 /* const-wide/16 v2, 0x2710 */
		 (( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
		 return;
	 } // .end method
	 static void a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lnet/chobin/android/a/l;->b()V */
		 return;
	 } // .end method
	 private void b ( ) {
		 /* .locals 2 */
		 final String v0 = "LicenseChecker: Clearing timeout."; // const-string v0, "LicenseChecker: Clearing timeout."
		 net.chobin.android.a.q .a ( v0 );
		 v0 = this.a;
		 net.chobin.android.a.k .a ( v0 );
		 v1 = this.a;
		 (( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 v0 = this.a;
		 net.chobin.android.a.k .a ( v0 );
		 /* new-instance v1, Lnet/chobin/android/a/n; */
		 /* invoke-direct {v1, p0, p1, p2, p3}, Lnet/chobin/android/a/n;-><init>(Lnet/chobin/android/a/l;ILjava/lang/String;Ljava/lang/String;)V */
		 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
