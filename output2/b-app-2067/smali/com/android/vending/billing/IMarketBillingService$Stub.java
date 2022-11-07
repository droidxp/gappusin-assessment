public abstract class com.android.vending.billing.IMarketBillingService$Stub extends android.os.Binder implements com.android.vending.billing.IMarketBillingService {
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String DESCRIPTOR;
	 static final Integer TRANSACTION_sendBillingRequest;
	 /* # direct methods */
	 public com.android.vending.billing.IMarketBillingService$Stub ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroid/os/Binder;-><init>()V */
		 final String v0 = "com.android.vending.billing.IMarketBillingService"; // const-string v0, "com.android.vending.billing.IMarketBillingService"
		 (( com.android.vending.billing.IMarketBillingService$Stub ) p0 ).attachInterface ( p0, v0 ); // invoke-virtual {p0, p0, v0}, Lcom/android/vending/billing/IMarketBillingService$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
		 return;
	 } // .end method
	 public static com.android.vending.billing.IMarketBillingService asInterface ( android.os.IBinder p0 ) {
		 /* .locals 3 */
		 /* if-nez p0, :cond_0 */
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
} // :cond_0
final String v1 = "com.android.vending.billing.IMarketBillingService"; // const-string v1, "com.android.vending.billing.IMarketBillingService"
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* instance-of v2, v1, Lcom/android/vending/billing/IMarketBillingService; */
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* move-object v0, v1 */
		 /* check-cast v0, Lcom/android/vending/billing/IMarketBillingService; */
		 /* move-object p0, v0 */
		 /* move-object v1, p0 */
	 } // :cond_1
	 /* new-instance v1, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy; */
	 /* invoke-direct {v1, p0}, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V */
} // .end method
/* # virtual methods */
public android.os.IBinder asBinder ( ) {
	 /* .locals 0 */
} // .end method
public Boolean onTransact ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
	 /* .locals 2 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* sparse-switch p1, :sswitch_data_0 */
	 v0 = 	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z */
} // :goto_0
/* :sswitch_0 */
final String v0 = "com.android.vending.billing.IMarketBillingService"; // const-string v0, "com.android.vending.billing.IMarketBillingService"
(( android.os.Parcel ) p3 ).writeString ( v0 ); // invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* move v0, v1 */
/* :sswitch_1 */
final String v0 = "com.android.vending.billing.IMarketBillingService"; // const-string v0, "com.android.vending.billing.IMarketBillingService"
(( android.os.Parcel ) p2 ).enforceInterface ( v0 ); // invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
v0 = (( android.os.Parcel ) p2 ).readInt ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = android.os.Bundle.CREATOR;
	 /* check-cast v0, Landroid/os/Bundle; */
} // :goto_1
(( com.android.vending.billing.IMarketBillingService$Stub ) p0 ).sendBillingRequest ( v0 ); // invoke-virtual {p0, v0}, Lcom/android/vending/billing/IMarketBillingService$Stub;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
(( android.os.Parcel ) p3 ).writeNoException ( ); // invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
if ( v0 != null) { // if-eqz v0, :cond_1
	 (( android.os.Parcel ) p3 ).writeInt ( v1 ); // invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V
	 (( android.os.Bundle ) v0 ).writeToParcel ( p3, v1 ); // invoke-virtual {v0, p3, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
} // :goto_2
/* move v0, v1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
(( android.os.Parcel ) p3 ).writeInt ( v0 ); // invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x1 -> :sswitch_1 */
/* 0x5f4e5446 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
