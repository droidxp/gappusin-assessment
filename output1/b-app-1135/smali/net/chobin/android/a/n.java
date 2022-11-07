class net.chobin.android.a.n implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 private final Integer a; //synthetic
	 private final java.lang.String a; //synthetic
	 final net.chobin.android.a.l a; //synthetic
	 private final java.lang.String b; //synthetic
	 /* # direct methods */
	 net.chobin.android.a.n ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* iput p2, p0, Lnet/chobin/android/a/n;->a:I */
		 this.a = p3;
		 this.b = p4;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 final String v0 = "LicenseChecker: Received response."; // const-string v0, "LicenseChecker: Received response."
		 net.chobin.android.a.q .a ( v0 );
		 v0 = this.a;
		 net.chobin.android.a.l .a ( v0 );
		 net.chobin.android.a.k .a ( v0 );
		 v1 = this.a;
		 v0 = 		 net.chobin.android.a.l .a ( v1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
			 net.chobin.android.a.l .a ( v0 );
			 v0 = this.a;
			 net.chobin.android.a.l .a ( v0 );
			 v1 = this.a;
			 net.chobin.android.a.l .a ( v1 );
			 net.chobin.android.a.k .a ( v1 );
			 /* iget v2, p0, Lnet/chobin/android/a/n;->a:I */
			 v3 = this.a;
			 v4 = this.b;
			 (( net.chobin.android.a.p ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lnet/chobin/android/a/p;->a(Ljava/security/PublicKey;ILjava/lang/String;Ljava/lang/String;)V
			 v0 = this.a;
			 net.chobin.android.a.l .a ( v0 );
			 v1 = this.a;
			 net.chobin.android.a.l .a ( v1 );
			 net.chobin.android.a.k .b ( v0,v1 );
		 } // :cond_0
		 return;
	 } // .end method
