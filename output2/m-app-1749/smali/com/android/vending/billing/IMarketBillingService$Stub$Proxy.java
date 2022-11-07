class com.android.vending.billing.IMarketBillingService$Stub$Proxy implements com.android.vending.billing.IMarketBillingService {
	 /* .source "IMarketBillingService.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/android/vending/billing/IMarketBillingService$Stub; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Proxy" */
} // .end annotation
/* # instance fields */
private android.os.IBinder mRemote;
/* # direct methods */
 com.android.vending.billing.IMarketBillingService$Stub$Proxy ( ) {
/* .locals 0 */
/* .param p1, "remote" # Landroid/os/IBinder; */
/* .prologue */
/* .line 73 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 74 */
this.mRemote = p1;
/* .line 75 */
return;
} // .end method
/* # virtual methods */
public android.os.IBinder asBinder ( ) {
/* .locals 1 */
/* .prologue */
/* .line 78 */
v0 = this.mRemote;
} // .end method
public java.lang.String getInterfaceDescriptor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 82 */
final String v0 = "com.android.vending.billing.IMarketBillingService"; // const-string v0, "com.android.vending.billing.IMarketBillingService"
} // .end method
public android.os.Bundle sendBillingRequest ( android.os.Bundle p0 ) {
/* .locals 6 */
/* .param p1, "bundle" # Landroid/os/Bundle; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 87 */
android.os.Parcel .obtain ( );
/* .line 88 */
/* .local v0, "_data":Landroid/os/Parcel; */
android.os.Parcel .obtain ( );
/* .line 91 */
/* .local v1, "_reply":Landroid/os/Parcel; */
try { // :try_start_0
final String v3 = "com.android.vending.billing.IMarketBillingService"; // const-string v3, "com.android.vending.billing.IMarketBillingService"
(( android.os.Parcel ) v0 ).writeInterfaceToken ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
/* .line 92 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 93 */
	 int v3 = 1; // const/4 v3, 0x1
	 (( android.os.Parcel ) v0 ).writeInt ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V
	 /* .line 94 */
	 int v3 = 0; // const/4 v3, 0x0
	 (( android.os.Bundle ) p1 ).writeToParcel ( v0, v3 ); // invoke-virtual {p1, v0, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
	 /* .line 99 */
} // :goto_0
v3 = this.mRemote;
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 100 */
(( android.os.Parcel ) v1 ).readException ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
/* .line 101 */
v3 = (( android.os.Parcel ) v1 ).readInt ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I
if ( v3 != null) { // if-eqz v3, :cond_1
	 /* .line 102 */
	 v3 = android.os.Bundle.CREATOR;
	 /* check-cast v2, Landroid/os/Bundle; */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 109 */
	 /* .local v2, "_result":Landroid/os/Bundle; */
} // :goto_1
(( android.os.Parcel ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
/* .line 110 */
(( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
/* .line 112 */
/* .line 97 */
} // .end local v2 # "_result":Landroid/os/Bundle;
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
try { // :try_start_1
(( android.os.Parcel ) v0 ).writeInt ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInt(I)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 109 */
/* :catchall_0 */
/* move-exception v3 */
(( android.os.Parcel ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
/* .line 110 */
(( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
/* throw v3 */
/* .line 105 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .restart local v2 # "_result":Landroid/os/Bundle; */
} // .end method
