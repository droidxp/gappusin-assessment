public class com.zong.android.engine.sms.a {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/zong/android/engine/sms/a$c;, */
	 /* Lcom/zong/android/engine/sms/a$b;, */
	 /* Lcom/zong/android/engine/sms/a$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String a;
/* # instance fields */
private android.telephony.SmsManager b;
private android.app.PendingIntent c;
private android.app.PendingIntent d;
private com.zong.android.engine.sms.a$b e;
private com.zong.android.engine.sms.a$c f;
/* # direct methods */
static com.zong.android.engine.sms.a ( ) {
	 /* .locals 1 */
	 /* const-class v0, Lcom/zong/android/engine/sms/a; */
	 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 return;
} // .end method
public com.zong.android.engine.sms.a ( ) {
	 /* .locals 2 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 android.telephony.SmsManager .getDefault ( );
	 this.b = v0;
	 this.e = v1;
	 this.f = v1;
	 return;
} // .end method
public static com.zong.android.engine.sms.a a ( ) {
	 /* .locals 1 */
	 com.zong.android.engine.sms.a$a .a ( );
} // .end method
static java.lang.String b ( ) { //synthethic
	 /* .locals 1 */
	 v0 = com.zong.android.engine.sms.a.a;
} // .end method
/* # virtual methods */
public final void a ( android.content.Context p0 ) {
	 /* .locals 4 */
	 int v3 = 0; // const/4 v3, 0x0
	 final String v0 = "SMS_SENT"; // const-string v0, "SMS_SENT"
	 final String v1 = "SMS_DELIVERED"; // const-string v1, "SMS_DELIVERED"
	 /* new-instance v2, Landroid/content/Intent; */
	 /* invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
	 android.app.PendingIntent .getBroadcast ( p1,v3,v2,v3 );
	 this.c = v2;
	 /* new-instance v2, Lcom/zong/android/engine/sms/a$b; */
	 /* invoke-direct {v2}, Lcom/zong/android/engine/sms/a$b;-><init>()V */
	 this.e = v2;
	 /* new-instance v2, Landroid/content/Intent; */
	 /* invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
	 android.app.PendingIntent .getBroadcast ( p1,v3,v2,v3 );
	 this.d = v2;
	 /* new-instance v2, Lcom/zong/android/engine/sms/a$c; */
	 /* invoke-direct {v2}, Lcom/zong/android/engine/sms/a$c;-><init>()V */
	 this.f = v2;
	 v2 = com.zong.android.engine.sms.a.a;
	 final String v3 = "Registering SMS Broadcat receiver"; // const-string v3, "Registering SMS Broadcat receiver"
	 zongfuscated.q .a ( v2,v3 );
	 v2 = this.e;
	 /* new-instance v3, Landroid/content/IntentFilter; */
	 /* invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
	 (( android.content.Context ) p1 ).registerReceiver ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
	 v0 = this.f;
	 /* new-instance v2, Landroid/content/IntentFilter; */
	 /* invoke-direct {v2, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
	 (( android.content.Context ) p1 ).registerReceiver ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
	 return;
} // .end method
public final void a ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 6 */
	 v0 = com.zong.android.engine.sms.a.a;
	 final String v1 = "SMS Sending ......................................"; // const-string v1, "SMS Sending ......................................"
	 zongfuscated.q .a ( v0,v1 );
	 v0 = this.b;
	 int v2 = 0; // const/4 v2, 0x0
	 v4 = this.c;
	 v5 = this.d;
	 /* move-object v1, p1 */
	 /* move-object v3, p2 */
	 /* invoke-virtual/range {v0 ..v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V */
	 v0 = com.zong.android.engine.sms.a.a;
	 final String v1 = "......................................SMS Sent"; // const-string v1, "......................................SMS Sent"
	 zongfuscated.q .a ( v0,v1 );
	 return;
} // .end method
public final void b ( android.content.Context p0 ) {
	 /* .locals 3 */
	 int v2 = 0; // const/4 v2, 0x0
	 v0 = com.zong.android.engine.sms.a.a;
	 final String v1 = "Releasing SMS Broadcat receiver"; // const-string v1, "Releasing SMS Broadcat receiver"
	 zongfuscated.q .a ( v0,v1 );
	 v0 = this.e;
	 (( android.content.Context ) p1 ).unregisterReceiver ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
	 v0 = this.f;
	 (( android.content.Context ) p1 ).unregisterReceiver ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
	 this.e = v2;
	 this.f = v2;
	 return;
} // .end method
