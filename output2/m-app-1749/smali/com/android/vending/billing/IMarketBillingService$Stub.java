public abstract class com.android.vending.billing.IMarketBillingService$Stub extends android.os.Binder implements com.android.vending.billing.IMarketBillingService {
	 /* .source "IMarketBillingService.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/android/vending/billing/IMarketBillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "Stub" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy; */
/* } */
} // .end annotation
/* # static fields */
private static final java.lang.String DESCRIPTOR;
static final Integer TRANSACTION_sendBillingRequest;
/* # direct methods */
public com.android.vending.billing.IMarketBillingService$Stub ( ) {
/* .locals 1 */
/* .prologue */
/* .line 14 */
/* invoke-direct {p0}, Landroid/os/Binder;-><init>()V */
/* .line 15 */
final String v0 = "com.android.vending.billing.IMarketBillingService"; // const-string v0, "com.android.vending.billing.IMarketBillingService"
(( com.android.vending.billing.IMarketBillingService$Stub ) p0 ).attachInterface ( p0, v0 ); // invoke-virtual {p0, p0, v0}, Lcom/android/vending/billing/IMarketBillingService$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V
/* .line 16 */
return;
} // .end method
public static com.android.vending.billing.IMarketBillingService asInterface ( android.os.IBinder p0 ) {
/* .locals 2 */
/* .param p0, "obj" # Landroid/os/IBinder; */
/* .prologue */
/* .line 23 */
/* if-nez p0, :cond_0 */
/* .line 24 */
int v0 = 0; // const/4 v0, 0x0
/* .line 30 */
} // :goto_0
/* .line 26 */
} // :cond_0
final String v1 = "com.android.vending.billing.IMarketBillingService"; // const-string v1, "com.android.vending.billing.IMarketBillingService"
/* .line 27 */
/* .local v0, "iin":Landroid/os/IInterface; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* instance-of v1, v0, Lcom/android/vending/billing/IMarketBillingService; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 28 */
/* check-cast v0, Lcom/android/vending/billing/IMarketBillingService; */
/* .line 30 */
} // :cond_1
/* new-instance v0, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy; */
} // .end local v0 # "iin":Landroid/os/IInterface;
/* invoke-direct {v0, p0}, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V */
} // .end method
/* # virtual methods */
public android.os.IBinder asBinder ( ) {
/* .locals 0 */
/* .prologue */
/* .line 34 */
} // .end method
public Boolean onTransact ( Integer p0, android.os.Parcel p1, android.os.Parcel p2, Integer p3 ) {
/* .locals 4 */
/* .param p1, "code" # I */
/* .param p2, "data" # Landroid/os/Parcel; */
/* .param p3, "reply" # Landroid/os/Parcel; */
/* .param p4, "flags" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 38 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 67 */
v2 = /* invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z */
} // :goto_0
/* .line 42 */
/* :sswitch_0 */
final String v3 = "com.android.vending.billing.IMarketBillingService"; // const-string v3, "com.android.vending.billing.IMarketBillingService"
(( android.os.Parcel ) p3 ).writeString ( v3 ); // invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* .line 47 */
/* :sswitch_1 */
final String v3 = "com.android.vending.billing.IMarketBillingService"; // const-string v3, "com.android.vending.billing.IMarketBillingService"
(( android.os.Parcel ) p2 ).enforceInterface ( v3 ); // invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
/* .line 49 */
v3 = (( android.os.Parcel ) p2 ).readInt ( ); // invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 50 */
v3 = android.os.Bundle.CREATOR;
/* check-cast v0, Landroid/os/Bundle; */
/* .line 55 */
/* .local v0, "_arg0":Landroid/os/Bundle; */
} // :goto_1
(( com.android.vending.billing.IMarketBillingService$Stub ) p0 ).sendBillingRequest ( v0 ); // invoke-virtual {p0, v0}, Lcom/android/vending/billing/IMarketBillingService$Stub;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
/* .line 56 */
/* .local v1, "_result":Landroid/os/Bundle; */
(( android.os.Parcel ) p3 ).writeNoException ( ); // invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
/* .line 57 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 58 */
(( android.os.Parcel ) p3 ).writeInt ( v2 ); // invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 59 */
(( android.os.Bundle ) v1 ).writeToParcel ( p3, v2 ); // invoke-virtual {v1, p3, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
/* .line 53 */
} // .end local v0 # "_arg0":Landroid/os/Bundle;
} // .end local v1 # "_result":Landroid/os/Bundle;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .restart local v0 # "_arg0":Landroid/os/Bundle; */
/* .line 62 */
/* .restart local v1 # "_result":Landroid/os/Bundle; */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
(( android.os.Parcel ) p3 ).writeInt ( v3 ); // invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V
/* .line 38 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x1 -> :sswitch_1 */
/* 0x5f4e5446 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
