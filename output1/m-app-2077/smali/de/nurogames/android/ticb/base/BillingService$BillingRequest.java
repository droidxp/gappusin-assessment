abstract class de.nurogames.android.ticb.base.BillingService$BillingRequest {
	 /* .source "BillingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/BillingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x400 */
/* name = "BillingRequest" */
} // .end annotation
/* # instance fields */
protected Long mRequestId;
private final Integer mStartId;
final de.nurogames.android.ticb.base.BillingService this$0; //synthetic
/* # direct methods */
public de.nurogames.android.ticb.base.BillingService$BillingRequest ( ) {
/* .locals 0 */
/* .param p2, "startId" # I */
/* .prologue */
/* .line 83 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 84 */
/* iput p2, p0, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->mStartId:I */
/* .line 85 */
return;
} // .end method
/* # virtual methods */
public Integer getStartId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 88 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->mStartId:I */
} // .end method
protected void logResponseCode ( java.lang.String p0, android.os.Bundle p1 ) {
/* .locals 2 */
/* .param p1, "method" # Ljava/lang/String; */
/* .param p2, "response" # Landroid/os/Bundle; */
/* .prologue */
/* .line 170 */
final String v1 = "RESPONSE_CODE"; // const-string v1, "RESPONSE_CODE"
v1 = (( android.os.Bundle ) p2 ).getInt ( v1 ); // invoke-virtual {p2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* .line 169 */
de.nurogames.android.ticb.base.Consts$ResponseCode .valueOf ( v1 );
/* .line 174 */
/* .local v0, "responseCode":Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
return;
} // .end method
protected android.os.Bundle makeRequestBundle ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "method" # Ljava/lang/String; */
/* .prologue */
/* .line 161 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 162 */
/* .local v0, "request":Landroid/os/Bundle; */
final String v1 = "BILLING_REQUEST"; // const-string v1, "BILLING_REQUEST"
(( android.os.Bundle ) v0 ).putString ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 163 */
final String v1 = "API_VERSION"; // const-string v1, "API_VERSION"
int v2 = 2; // const/4 v2, 0x2
(( android.os.Bundle ) v0 ).putInt ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 164 */
final String v1 = "PACKAGE_NAME"; // const-string v1, "PACKAGE_NAME"
v2 = this.this$0;
(( de.nurogames.android.ticb.base.BillingService ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/BillingService;->getPackageName()Ljava/lang/String;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 165 */
} // .end method
protected void onRemoteException ( android.os.RemoteException p0 ) {
/* .locals 2 */
/* .param p1, "e" # Landroid/os/RemoteException; */
/* .prologue */
/* .line 142 */
final String v0 = "BillingService"; // const-string v0, "BillingService"
final String v1 = "remote billing service crashed"; // const-string v1, "remote billing service crashed"
android.util.Log .w ( v0,v1 );
/* .line 143 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.BillingService .access$4 ( v0 );
/* .line 144 */
return;
} // .end method
protected void responseCodeReceived ( de.nurogames.android.ticb.base.Consts$ResponseCode p0 ) {
/* .locals 0 */
/* .param p1, "responseCode" # Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
/* .prologue */
/* .line 158 */
return;
} // .end method
protected abstract Long run ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
} // .end method
public Boolean runIfConnected ( ) {
/* .locals 5 */
/* .prologue */
/* .line 118 */
de.nurogames.android.ticb.base.BillingService .access$2 ( );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 120 */
try { // :try_start_0
	 (( de.nurogames.android.ticb.base.BillingService$BillingRequest ) p0 ).run ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->run()J
	 /* move-result-wide v1 */
	 /* iput-wide v1, p0, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->mRequestId:J */
	 /* .line 124 */
	 /* iget-wide v1, p0, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->mRequestId:J */
	 /* const-wide/16 v3, 0x0 */
	 /* cmp-long v1, v1, v3 */
	 /* if-ltz v1, :cond_0 */
	 /* .line 125 */
	 de.nurogames.android.ticb.base.BillingService .access$3 ( );
	 /* iget-wide v2, p0, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->mRequestId:J */
	 java.lang.Long .valueOf ( v2,v3 );
	 (( java.util.HashMap ) v1 ).put ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* :try_end_0 */
	 /* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 127 */
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 132 */
} // :goto_0
/* .line 128 */
/* :catch_0 */
/* move-exception v0 */
/* .line 129 */
/* .local v0, "e":Landroid/os/RemoteException; */
(( de.nurogames.android.ticb.base.BillingService$BillingRequest ) p0 ).onRemoteException ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->onRemoteException(Landroid/os/RemoteException;)V
/* .line 132 */
} // .end local v0 # "e":Landroid/os/RemoteException;
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
public Boolean runRequest ( ) {
/* .locals 2 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 97 */
v1 = (( de.nurogames.android.ticb.base.BillingService$BillingRequest ) p0 ).runIfConnected ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/BillingService$BillingRequest;->runIfConnected()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 106 */
} // :goto_0
/* .line 101 */
} // :cond_0
v1 = this.this$0;
v1 = de.nurogames.android.ticb.base.BillingService .access$0 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 103 */
de.nurogames.android.ticb.base.BillingService .access$1 ( );
(( java.util.LinkedList ) v1 ).add ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 106 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
