class com.facebook.android.Facebook$TokenRefreshServiceConnection implements android.content.ServiceConnection {
	 /* .source "Facebook.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/facebook/android/Facebook; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "TokenRefreshServiceConnection" */
} // .end annotation
/* # instance fields */
final android.content.Context applicationsContext;
final android.os.Messenger messageReceiver;
android.os.Messenger messageSender;
final com.facebook.android.Facebook$ServiceListener serviceListener;
final com.facebook.android.Facebook this$0; //synthetic
/* # direct methods */
public com.facebook.android.Facebook$TokenRefreshServiceConnection ( ) {
/* .locals 2 */
/* .param p2, "applicationsContext" # Landroid/content/Context; */
/* .param p3, "serviceListener" # Lcom/facebook/android/Facebook$ServiceListener; */
/* .prologue */
/* .line 569 */
this.this$0 = p1;
/* .line 568 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 528 */
/* new-instance v0, Landroid/os/Messenger; */
/* new-instance v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection$1; */
/* invoke-direct {v1, p0}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection$1;-><init>(Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;)V */
/* invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V */
this.messageReceiver = v0;
/* .line 566 */
int v0 = 0; // const/4 v0, 0x0
this.messageSender = v0;
/* .line 570 */
this.applicationsContext = p2;
/* .line 571 */
this.serviceListener = p3;
/* .line 572 */
return;
} // .end method
static com.facebook.android.Facebook access$0 ( com.facebook.android.Facebook$TokenRefreshServiceConnection p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 526 */
v0 = this.this$0;
} // .end method
private void refreshToken ( ) {
/* .locals 6 */
/* .prologue */
/* .line 589 */
/* new-instance v2, Landroid/os/Bundle; */
/* invoke-direct {v2}, Landroid/os/Bundle;-><init>()V */
/* .line 590 */
/* .local v2, "requestData":Landroid/os/Bundle; */
final String v3 = "access_token"; // const-string v3, "access_token"
v4 = this.this$0;
com.facebook.android.Facebook .access$0 ( v4 );
(( android.os.Bundle ) v2 ).putString ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 592 */
android.os.Message .obtain ( );
/* .line 593 */
/* .local v1, "request":Landroid/os/Message; */
(( android.os.Message ) v1 ).setData ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
/* .line 594 */
v3 = this.messageReceiver;
this.replyTo = v3;
/* .line 597 */
try { // :try_start_0
	 v3 = this.messageSender;
	 (( android.os.Messenger ) v3 ).send ( v1 ); // invoke-virtual {v3, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
	 /* :try_end_0 */
	 /* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 601 */
} // :goto_0
return;
/* .line 598 */
/* :catch_0 */
/* move-exception v0 */
/* .line 599 */
/* .local v0, "e":Landroid/os/RemoteException; */
v3 = this.serviceListener;
/* new-instance v4, Ljava/lang/Error; */
final String v5 = "Service connection error"; // const-string v5, "Service connection error"
/* invoke-direct {v4, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V */
} // .end method
/* # virtual methods */
public void onServiceConnected ( android.content.ComponentName p0, android.os.IBinder p1 ) {
/* .locals 1 */
/* .param p1, "className" # Landroid/content/ComponentName; */
/* .param p2, "service" # Landroid/os/IBinder; */
/* .prologue */
/* .line 576 */
/* new-instance v0, Landroid/os/Messenger; */
/* invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V */
this.messageSender = v0;
/* .line 577 */
/* invoke-direct {p0}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->refreshToken()V */
/* .line 578 */
return;
} // .end method
public void onServiceDisconnected ( android.content.ComponentName p0 ) {
/* .locals 3 */
/* .param p1, "arg" # Landroid/content/ComponentName; */
/* .prologue */
/* .line 582 */
v0 = this.serviceListener;
/* new-instance v1, Ljava/lang/Error; */
final String v2 = "Service disconnected"; // const-string v2, "Service disconnected"
/* invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V */
/* .line 585 */
v0 = this.applicationsContext;
(( android.content.Context ) v0 ).unbindService ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
/* .line 586 */
return;
} // .end method
