public class net.chobin.android.psdxylz.q extends net.chobin.android.psdxylz.app.k {
	 /* # instance fields */
	 public net.chobin.android.psdxylz.app.aw a;
	 private net.chobin.android.psdxylz.r a;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.q ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1}, Lnet/chobin/android/psdxylz/app/k;-><init>(Landroid/content/Context;)V */
		 /* new-instance v0, Lnet/chobin/android/psdxylz/r; */
		 /* invoke-direct {v0}, Lnet/chobin/android/psdxylz/r;-><init>()V */
		 this.a = v0;
		 v0 = this.a;
		 /* check-cast v0, Lnet/chobin/android/psdxylz/app/a; */
		 v1 = this.a;
		 this.a = v1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Lnet/chobin/android/psdxylz/app/aw; */
		 v1 = this.a;
		 /* invoke-direct {v0, v1, p0, v2}, Lnet/chobin/android/psdxylz/app/aw;-><init>(Lnet/chobin/android/psdxylz/app/f;Lnet/chobin/android/psdxylz/app/k;I)V */
		 this.a = v0;
		 v0 = this.a;
		 /* const/16 v1, 0xff */
		 (( net.chobin.android.psdxylz.app.aw ) v0 ).e ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/aw;->e(I)V
		 return;
	 } // .end method
	 public void b ( ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 v0 = this.a;
			 (( net.chobin.android.psdxylz.r ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lnet/chobin/android/psdxylz/r;->a(Lnet/chobin/android/psdxylz/q;)Z
			 /* :try_end_0 */
			 /* .catch Lnet/chobin/android/psdxylz/app/ah; {:try_start_0 ..:try_end_0} :catch_0 */
			 v0 = 			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 int v0 = 0; // const/4 v0, 0x0
			 } // :goto_0
			 v1 = this.a;
			 (( net.chobin.android.psdxylz.app.aw ) v1 ).d ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/aw;->d()V
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( net.chobin.android.psdxylz.q ) p0 ).d ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/q;->d()V
			 } // :cond_0
		 } // :goto_1
		 return;
	 } // :cond_1
	 int v0 = 1; // const/4 v0, 0x1
	 /* :catch_0 */
	 /* move-exception v0 */
	 try { // :try_start_1
		 (( net.chobin.android.psdxylz.app.ah ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/ah;->printStackTrace()V
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 v0 = this.a;
		 (( net.chobin.android.psdxylz.app.aw ) v0 ).d ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/aw;->d()V
		 (( net.chobin.android.psdxylz.q ) p0 ).d ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/q;->d()V
		 /* :catchall_0 */
		 /* move-exception v0 */
		 v1 = this.a;
		 (( net.chobin.android.psdxylz.app.aw ) v1 ).d ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/aw;->d()V
		 /* throw v0 */
	 } // .end method
