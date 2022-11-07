public abstract class net.chobin.android.a.i extends android.os.Binder implements net.chobin.android.a.h {
	 /* # interfaces */
	 /* # direct methods */
	 public static net.chobin.android.a.h a ( android.os.IBinder p0 ) {
		 /* .locals 2 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
final String v0 = "com.android.vending.licensing.ILicensingService"; // const-string v0, "com.android.vending.licensing.ILicensingService"
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* instance-of v1, v0, Lnet/chobin/android/a/h; */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* check-cast v0, Lnet/chobin/android/a/h; */
	 } // :cond_1
	 /* new-instance v0, Lnet/chobin/android/a/j; */
	 /* invoke-direct {v0, p0}, Lnet/chobin/android/a/j;-><init>(Landroid/os/IBinder;)V */
} // .end method
/* # virtual methods */
public Boolean onTransact ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
	 /* .locals 5 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* sparse-switch p1, :sswitch_data_0 */
	 v0 = 	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z */
} // :goto_0
/* :sswitch_0 */
final String v1 = "com.android.vending.licensing.ILicensingService"; // const-string v1, "com.android.vending.licensing.ILicensingService"
(( android.os.Parcel ) p3 ).writeString ( v1 ); // invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* :sswitch_1 */
final String v1 = "com.android.vending.licensing.ILicensingService"; // const-string v1, "com.android.vending.licensing.ILicensingService"
(( android.os.Parcel ) p2 ).enforceInterface ( v1 ); // invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
(( android.os.Parcel ) p2 ).readLong ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J
/* move-result-wide v1 */
(( android.os.Parcel ) p2 ).readString ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
(( android.os.Parcel ) p2 ).readStrongBinder ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
net.chobin.android.a.f .a ( v4 );
(( net.chobin.android.a.i ) p0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {p0, v1, v2, v3, v4}, Lnet/chobin/android/a/i;->a(JLjava/lang/String;Lnet/chobin/android/a/e;)V
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x1 -> :sswitch_1 */
/* 0x5f4e5446 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
