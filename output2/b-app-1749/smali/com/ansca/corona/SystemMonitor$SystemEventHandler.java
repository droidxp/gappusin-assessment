class com.ansca.corona.SystemMonitor$SystemEventHandler extends android.content.BroadcastReceiver {
	 /* .source "SystemMonitor.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/SystemMonitor; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "SystemEventHandler" */
} // .end annotation
/* # instance fields */
private com.ansca.corona.SystemMonitor fMonitor;
final com.ansca.corona.SystemMonitor this$0; //synthetic
/* # direct methods */
public com.ansca.corona.SystemMonitor$SystemEventHandler ( ) {
/* .locals 2 */
/* .param p2, "monitor" # Lcom/ansca/corona/SystemMonitor; */
/* .prologue */
/* .line 150 */
this.this$0 = p1;
/* .line 151 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
/* .line 154 */
/* if-nez p2, :cond_0 */
/* .line 155 */
/* new-instance v1, Ljava/lang/NullPointerException; */
/* invoke-direct {v1}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v1 */
/* .line 159 */
} // :cond_0
this.fMonitor = p2;
/* .line 162 */
/* new-instance v0, Landroid/content/IntentFilter; */
/* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
/* .line 163 */
/* .local v0, "intentFilter":Landroid/content/IntentFilter; */
final String v1 = "android.intent.action.SCREEN_OFF"; // const-string v1, "android.intent.action.SCREEN_OFF"
(( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 164 */
final String v1 = "android.intent.action.SCREEN_ON"; // const-string v1, "android.intent.action.SCREEN_ON"
(( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 165 */
final String v1 = "android.intent.action.USER_PRESENT"; // const-string v1, "android.intent.action.USER_PRESENT"
(( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 166 */
v1 = this.fMonitor;
(( com.ansca.corona.SystemMonitor ) v1 ).getActivity ( ); // invoke-virtual {v1}, Lcom/ansca/corona/SystemMonitor;->getActivity()Lcom/ansca/corona/CoronaActivity;
(( com.ansca.corona.CoronaActivity ) v1 ).registerReceiver ( p0, v0 ); // invoke-virtual {v1, p0, v0}, Lcom/ansca/corona/CoronaActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 167 */
return;
} // .end method
/* # virtual methods */
public void dispose ( ) {
/* .locals 1 */
/* .prologue */
/* .line 174 */
v0 = this.fMonitor;
(( com.ansca.corona.SystemMonitor ) v0 ).getActivity ( ); // invoke-virtual {v0}, Lcom/ansca/corona/SystemMonitor;->getActivity()Lcom/ansca/corona/CoronaActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).unregisterReceiver ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/CoronaActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 175 */
return;
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 185 */
/* if-nez p2, :cond_1 */
/* .line 207 */
} // :cond_0
} // :goto_0
return;
/* .line 190 */
} // :cond_1
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
/* .line 191 */
/* .local v0, "actionName":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_0 */
/* .line 196 */
final String v1 = "android.intent.action.SCREEN_OFF"; // const-string v1, "android.intent.action.SCREEN_OFF"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 197 */
v1 = this.fMonitor;
com.ansca.corona.SystemMonitor .access$002 ( v1,v2 );
/* .line 198 */
v1 = this.fMonitor;
(( com.ansca.corona.SystemMonitor ) v1 ).getActivity ( ); // invoke-virtual {v1}, Lcom/ansca/corona/SystemMonitor;->getActivity()Lcom/ansca/corona/CoronaActivity;
(( com.ansca.corona.CoronaActivity ) v1 ).onScreenLockStateChanged ( v3 ); // invoke-virtual {v1, v3}, Lcom/ansca/corona/CoronaActivity;->onScreenLockStateChanged(Z)V
/* .line 200 */
} // :cond_2
final String v1 = "android.intent.action.SCREEN_ON"; // const-string v1, "android.intent.action.SCREEN_ON"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 201 */
v1 = this.fMonitor;
com.ansca.corona.SystemMonitor .access$002 ( v1,v3 );
/* .line 202 */
v1 = this.fMonitor;
(( com.ansca.corona.SystemMonitor ) v1 ).getActivity ( ); // invoke-virtual {v1}, Lcom/ansca/corona/SystemMonitor;->getActivity()Lcom/ansca/corona/CoronaActivity;
v2 = this.fMonitor;
v2 = (( com.ansca.corona.SystemMonitor ) v2 ).isScreenLocked ( ); // invoke-virtual {v2}, Lcom/ansca/corona/SystemMonitor;->isScreenLocked()Z
(( com.ansca.corona.CoronaActivity ) v1 ).onScreenLockStateChanged ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->onScreenLockStateChanged(Z)V
/* .line 204 */
} // :cond_3
final String v1 = "android.intent.action.USER_PRESENT"; // const-string v1, "android.intent.action.USER_PRESENT"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 205 */
v1 = this.fMonitor;
(( com.ansca.corona.SystemMonitor ) v1 ).getActivity ( ); // invoke-virtual {v1}, Lcom/ansca/corona/SystemMonitor;->getActivity()Lcom/ansca/corona/CoronaActivity;
(( com.ansca.corona.CoronaActivity ) v1 ).onScreenLockStateChanged ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->onScreenLockStateChanged(Z)V
} // .end method
