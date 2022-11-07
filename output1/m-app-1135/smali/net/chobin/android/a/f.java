public abstract class net.chobin.android.a.f extends android.os.Binder implements net.chobin.android.a.e {
	 /* # interfaces */
	 /* # direct methods */
	 public net.chobin.android.a.f ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroid/os/Binder;-><init>()V */
		 final String v0 = "com.android.vending.licensing.ILicenseResultListener"; // const-string v0, "com.android.vending.licensing.ILicenseResultListener"
		 (( net.chobin.android.a.f ) p0 ).attachInterface ( p0, v0 ); // invoke-virtual {p0, p0, v0}, Lnet/chobin/android/a/f;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
		 return;
	 } // .end method
	 public static net.chobin.android.a.e a ( android.os.IBinder p0 ) {
		 /* .locals 2 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
final String v0 = "com.android.vending.licensing.ILicenseResultListener"; // const-string v0, "com.android.vending.licensing.ILicenseResultListener"
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* instance-of v1, v0, Lnet/chobin/android/a/e; */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* check-cast v0, Lnet/chobin/android/a/e; */
	 } // :cond_1
	 /* new-instance v0, Lnet/chobin/android/a/g; */
	 /* invoke-direct {v0, p0}, Lnet/chobin/android/a/g;-><init>(Landroid/os/IBinder;)V */
} // .end method
/* # virtual methods */
public android.os.IBinder asBinder ( ) {
	 /* .locals 0 */
} // .end method
public Boolean onTransact ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
	 /* .locals 4 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* sparse-switch p1, :sswitch_data_0 */
	 v0 = 	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z */
} // :goto_0
/* :sswitch_0 */
final String v1 = "com.android.vending.licensing.ILicenseResultListener"; // const-string v1, "com.android.vending.licensing.ILicenseResultListener"
(( android.os.Parcel ) p3 ).writeString ( v1 ); // invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* :sswitch_1 */
final String v1 = "com.android.vending.licensing.ILicenseResultListener"; // const-string v1, "com.android.vending.licensing.ILicenseResultListener"
(( android.os.Parcel ) p2 ).enforceInterface ( v1 ); // invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
v1 = (( android.os.Parcel ) p2 ).readInt ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
(( android.os.Parcel ) p2 ).readString ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
(( android.os.Parcel ) p2 ).readString ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
(( net.chobin.android.a.f ) p0 ).a ( v1, v2, v3 ); // invoke-virtual {p0, v1, v2, v3}, Lnet/chobin/android/a/f;->a(ILjava/lang/String;Ljava/lang/String;)V
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x1 -> :sswitch_1 */
/* 0x5f4e5446 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
