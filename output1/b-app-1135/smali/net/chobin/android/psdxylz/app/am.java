public class net.chobin.android.psdxylz.app.am {
	 /* # instance fields */
	 public net.chobin.android.psdxylz.app.ap a;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.am ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void a ( Object p0 ) {
		 /* .locals 2 */
		 /* monitor-enter p0 */
	 } // :cond_0
	 try { // :try_start_0
		 v0 = this.a;
		 (( net.chobin.android.psdxylz.app.ap ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/ap;->a()Z
		 /* :try_end_0 */
		 v0 = 		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* if-nez v0, :cond_1 */
	 } // :goto_0
	 /* monitor-exit p0 */
	 return;
} // :cond_1
/* const-wide/16 v0, 0x19 */
try { // :try_start_1
	 java.lang.Thread .sleep ( v0,v1 );
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_1
try { // :try_start_2
	 v0 = 	 (( net.chobin.android.psdxylz.app.k ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/k;->a()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
	 public synchronized void a ( Object p0, Integer p1, Boolean p2 ) {
		 /* .locals 2 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = this.a;
			 (( net.chobin.android.psdxylz.app.ap ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/ap;->a()V
			 v0 = this.a;
			 v0 = this.a;
			 /* new-instance v1, Lnet/chobin/android/psdxylz/app/ao; */
			 /* invoke-direct {v1, p0, p2, p3}, Lnet/chobin/android/psdxylz/app/ao;-><init>(Lnet/chobin/android/psdxylz/app/am;IZ)V */
			 (( net.chobin.android.psdxylz.app.a ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/a;->runOnUiThread(Ljava/lang/Runnable;)V
			 (( net.chobin.android.psdxylz.app.am ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lnet/chobin/android/psdxylz/app/am;->a(Lnet/chobin/android/psdxylz/app/k;)V
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public synchronized void a ( Object p0, Boolean p1 ) {
			 /* .locals 2 */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 v0 = this.a;
				 (( net.chobin.android.psdxylz.app.ap ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/ap;->a()V
				 v0 = this.a;
				 v0 = this.a;
				 /* new-instance v1, Lnet/chobin/android/psdxylz/app/an; */
				 /* invoke-direct {v1, p0, p2}, Lnet/chobin/android/psdxylz/app/an;-><init>(Lnet/chobin/android/psdxylz/app/am;Z)V */
				 (( net.chobin.android.psdxylz.app.a ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/a;->runOnUiThread(Ljava/lang/Runnable;)V
				 (( net.chobin.android.psdxylz.app.am ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lnet/chobin/android/psdxylz/app/am;->a(Lnet/chobin/android/psdxylz/app/k;)V
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit p0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
