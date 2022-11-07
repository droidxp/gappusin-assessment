class com.android.vending.billing.IMarketBillingService$Stub$Proxy implements com.android.vending.billing.IMarketBillingService {
	 /* # interfaces */
	 /* # instance fields */
	 private android.os.IBinder mRemote;
	 /* # direct methods */
	 com.android.vending.billing.IMarketBillingService$Stub$Proxy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mRemote = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.os.IBinder asBinder ( ) {
		 /* .locals 1 */
		 v0 = this.mRemote;
	 } // .end method
	 public java.lang.String getInterfaceDescriptor ( ) {
		 /* .locals 1 */
		 final String v0 = "com.android.vending.billing.IMarketBillingService"; // const-string v0, "com.android.vending.billing.IMarketBillingService"
	 } // .end method
	 public android.os.Bundle sendBillingRequest ( android.os.Bundle p0 ) {
		 /* .locals 5 */
		 android.os.Parcel .obtain ( );
		 android.os.Parcel .obtain ( );
		 try { // :try_start_0
			 final String v2 = "com.android.vending.billing.IMarketBillingService"; // const-string v2, "com.android.vending.billing.IMarketBillingService"
			 (( android.os.Parcel ) v0 ).writeInterfaceToken ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 int v2 = 1; // const/4 v2, 0x1
				 (( android.os.Parcel ) v0 ).writeInt ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V
				 int v2 = 0; // const/4 v2, 0x0
				 (( android.os.Bundle ) p1 ).writeToParcel ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
			 } // :goto_0
			 v2 = this.mRemote;
			 int v3 = 1; // const/4 v3, 0x1
			 int v4 = 0; // const/4 v4, 0x0
			 (( android.os.Parcel ) v1 ).readException ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
			 v2 = 			 (( android.os.Parcel ) v1 ).readInt ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I
			 if ( v2 != null) { // if-eqz v2, :cond_1
				 v2 = android.os.Bundle.CREATOR;
				 /* check-cast p0, Landroid/os/Bundle; */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* move-object v2, p0 */
			 } // :goto_1
			 (( android.os.Parcel ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
			 (( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
		 } // :cond_0
		 int v2 = 0; // const/4 v2, 0x0
		 try { // :try_start_1
			 (( android.os.Parcel ) v0 ).writeInt ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeInt(I)V
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v2 */
			 (( android.os.Parcel ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
			 (( android.os.Parcel ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
			 /* throw v2 */
		 } // :cond_1
		 int v2 = 0; // const/4 v2, 0x0
	 } // .end method
