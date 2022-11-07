class net.chobin.android.a.j implements net.chobin.android.a.h {
	 /* # interfaces */
	 /* # instance fields */
	 private android.os.IBinder a;
	 /* # direct methods */
	 net.chobin.android.a.j ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Long p0, java.lang.String p1, Object p2 ) {
		 /* .locals 5 */
		 int v0 = 0; // const/4 v0, 0x0
		 android.os.Parcel .obtain ( );
		 try { // :try_start_0
			 final String v2 = "com.android.vending.licensing.ILicensingService"; // const-string v2, "com.android.vending.licensing.ILicensingService"
			 (( android.os.Parcel ) v1 ).writeInterfaceToken ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
			 (( android.os.Parcel ) v1 ).writeLong ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
			 (( android.os.Parcel ) v1 ).writeString ( p3 ); // invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
			 if ( p4 != null) { // if-eqz p4, :cond_0
			 } // :cond_0
			 (( android.os.Parcel ) v1 ).writeStrongBinder ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
			 v0 = this.a;
			 int v2 = 1; // const/4 v2, 0x1
			 int v3 = 0; // const/4 v3, 0x0
			 int v4 = 1; // const/4 v4, 0x1
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 (( android.os.Parcel ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 (( android.os.Parcel ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
			 /* throw v0 */
		 } // .end method
		 public android.os.IBinder asBinder ( ) {
			 /* .locals 1 */
			 v0 = this.a;
		 } // .end method
