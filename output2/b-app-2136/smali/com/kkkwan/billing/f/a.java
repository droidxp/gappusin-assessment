public class com.kkkwan.billing.f.a {
	 /* # static fields */
	 private static com.kkkwan.billing.f.a a;
	 private static android.content.IntentFilter e;
	 private static com.kkkwan.billing.a.a f;
	 /* # instance fields */
	 private com.kkkwan.billing.d.c b;
	 private com.kkkwan.billing.d.a c;
	 private com.kkkwan.billing.d.b d;
	 /* # direct methods */
	 public com.kkkwan.billing.f.a ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.kkkwan.billing.f.a a ( ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 v0 = com.kkkwan.billing.f.a.a;
			 /* if-nez v0, :cond_1 */
			 /* const-class v1, Lcom/kkkwan/billing/f/a; */
			 /* monitor-enter v1 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 try { // :try_start_1
				 v0 = com.kkkwan.billing.f.a.a;
				 /* if-nez v0, :cond_0 */
				 /* new-instance v0, Lcom/kkkwan/billing/f/a; */
				 /* invoke-direct {v0}, Lcom/kkkwan/billing/f/a;-><init>()V */
			 } // :cond_0
			 /* monitor-exit v1 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 } // :cond_1
	 } // :goto_0
	 v0 = com.kkkwan.billing.f.a.a;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 try { // :try_start_2
		 /* monitor-exit v1 */
		 /* throw v0 */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 private static void b ( android.content.Context p0 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 v0 = com.kkkwan.billing.f.a.e;
			 /* if-nez v0, :cond_0 */
			 final String v0 = "smsReceiver \u6ce8\u518c\u77ed\u4fe1\u5e7f\u64ad"; // const-string v0, "smsReceiver \u6ce8\u518c\u77ed\u4fe1\u5e7f\u64ad"
			 com.kkkwan.billing.h.f .a ( v0 );
			 /* new-instance v0, Lcom/kkkwan/billing/a/a; */
			 /* invoke-direct {v0}, Lcom/kkkwan/billing/a/a;-><init>()V */
			 /* new-instance v0, Landroid/content/IntentFilter; */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "DELIVERED_SMS_ACTION"; // const-string v2, "DELIVERED_SMS_ACTION"
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
			 v0 = com.kkkwan.billing.f.a.f;
			 v1 = com.kkkwan.billing.f.a.e;
			 (( android.content.Context ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
			 /* new-instance v0, Landroid/content/IntentFilter; */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "SENT_SMS_ACTION"; // const-string v2, "SENT_SMS_ACTION"
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
			 v0 = com.kkkwan.billing.f.a.f;
			 v1 = com.kkkwan.billing.f.a.e;
			 (( android.content.Context ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
		 } // :goto_0
		 return;
	 } // :cond_0
	 final String v0 = "smsReceiver \u77ed\u4fe1\u5e7f\u64ad\u5df2\u7ecf\u6ce8\u518c\u8fc7"; // const-string v0, "smsReceiver \u77ed\u4fe1\u5e7f\u64ad\u5df2\u7ecf\u6ce8\u518c\u8fc7"
	 com.kkkwan.billing.h.f .a ( v0 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v0 = "smsReceiver \u77ed\u4fe1\u5e7f\u64ad\u5df2\u7ecf\u6ce8\u518c\u8fc7"; // const-string v0, "smsReceiver \u77ed\u4fe1\u5e7f\u64ad\u5df2\u7ecf\u6ce8\u518c\u8fc7"
	 com.kkkwan.billing.h.f .a ( v0 );
} // .end method
/* # virtual methods */
public void a ( android.app.Activity p0, java.lang.String p1, java.lang.String p2, Object p3 ) {
	 /* .locals 6 */
	 /* const-wide/high16 v2, 0x4059000000000000L # 100.0 */
	 try { // :try_start_0
		 final String v0 = "BillingConnect"; // const-string v0, "BillingConnect"
		 final String v1 = "\u5feb\u901f\u652f\u4ed8\u63a5\u53e3"; // const-string v1, "\u5feb\u901f\u652f\u4ed8\u63a5\u53e3"
		 com.kkkwan.billing.h.f .a ( v0,v1 );
		 final String v0 = "prop_id"; // const-string v0, "prop_id"
		 final String v1 = "prop_id"; // const-string v1, "prop_id"
		 com.kkkwan.billing.e.b.a .a ( p1,v0,p2,v1 );
		 com.kkkwan.billing.f.a .b ( p1 );
		 this.d = p4;
		 java.lang.Double .valueOf ( p3 );
		 (( java.lang.Double ) v0 ).doubleValue ( ); // invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D
		 /* move-result-wide v0 */
		 /* mul-double/2addr v0, v2 */
		 /* rem-double/2addr v0, v2 */
		 final String v2 = "BillingConnect"; // const-string v2, "BillingConnect"
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 final String v4 = "money2="; // const-string v4, "money2="
		 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v3 ).append ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v2,v3 );
		 /* const-wide/16 v2, 0x0 */
		 /* cmpl-double v0, v0, v2 */
		 /* if-gtz v0, :cond_0 */
		 java.lang.Double .valueOf ( p3 );
		 (( java.lang.Double ) v0 ).doubleValue ( ); // invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D
		 /* move-result-wide v0 */
		 /* const-wide/high16 v2, 0x402e000000000000L # 15.0 */
		 /* cmpl-double v0, v0, v2 */
		 /* if-lez v0, :cond_1 */
	 } // :cond_0
	 final String v0 = "BillingConnect"; // const-string v0, "BillingConnect"
	 final String v1 = "\u521d\u6b65\u5224\u65ad\u4e0d\u53ef\u4ee5\u7528\u77ed\u4fe1\u6263\u8d39\uff0c\u76f4\u63a5\u8fdb\u5165\u9875\u9762\u652f\u4ed8"; // const-string v1, "\u521d\u6b65\u5224\u65ad\u4e0d\u53ef\u4ee5\u7528\u77ed\u4fe1\u6263\u8d39\uff0c\u76f4\u63a5\u8fdb\u5165\u9875\u9762\u652f\u4ed8"
	 com.kkkwan.billing.h.f .a ( v0,v1 );
	 final String v4 = "quick_pay"; // const-string v4, "quick_pay"
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move-object v3, p3 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/kkkwan/billing/f/a;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kkkwan/billing/d/c;)V */
} // :goto_0
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/kkkwan/billing/f/b; */
/* invoke-direct {v1, p0, p2, p1}, Lcom/kkkwan/billing/f/b;-><init>(Lcom/kkkwan/billing/f/a;Ljava/lang/String;Landroid/app/Activity;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // :goto_1
return;
} // :cond_1
/* new-instance v0, Lcom/kkkwan/billing/g/e; */
final String v1 = "quick_pay"; // const-string v1, "quick_pay"
/* invoke-direct {v0, p1, p2, p3, v1}, Lcom/kkkwan/billing/g/e;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Integer; */
(( com.kkkwan.billing.g.e ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/g/e;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public final void a ( android.app.Activity p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, Object p4 ) {
/* .locals 8 */
try { // :try_start_0
this.b = p5;
/* new-instance v0, Lcom/kkkwan/billing/h/g; */
/* invoke-direct {v0}, Lcom/kkkwan/billing/h/g;-><init>()V */
/* new-instance v1, Lcom/kkkwan/billing/h/h; */
/* invoke-direct {v1}, Lcom/kkkwan/billing/h/h;-><init>()V */
final String v2 = "1"; // const-string v2, "1"
final String v3 = "0"; // const-string v3, "0"
(( com.kkkwan.billing.h.h ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lcom/kkkwan/billing/h/h;->a(Landroid/content/Context;)Ljava/lang/String;
(( com.kkkwan.billing.h.g ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lcom/kkkwan/billing/h/g;->c(Landroid/content/Context;)Ljava/lang/String;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
java.lang.String .valueOf ( v4,v5 );
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "|"; // const-string v6, "|"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "|"; // const-string v6, "|"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.a.c .a ( v5 );
final String v6 = "UTF-8"; // const-string v6, "UTF-8"
java.net.URLEncoder .encode ( v5,v6 );
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "http://121.11.69.16:6080/?ct=pay&ac=index&prop_id="; // const-string v7, "http://121.11.69.16:6080/?ct=pay&ac=index&prop_id="
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "&money="; // const-string v7, "&money="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p3 ); // invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "&is_message_pay="; // const-string v7, "&is_message_pay="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "&is_quota="; // const-string v6, "&is_quota="
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "&from_id="; // const-string v3, "&from_id="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "&uname="; // const-string v2, "&uname="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "&time="; // const-string v1, "&time="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "&key="; // const-string v1, "&key="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "BillingConnect"; // const-string v1, "BillingConnect"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "\u5b9a\u989d\u652f\u4ed8url="; // const-string v3, "\u5b9a\u989d\u652f\u4ed8url="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v2 );
/* new-instance v1, Landroid/content/Intent; */
/* const-class v2, Lcom/kkkwan/billing/activity/WebPayActivity; */
/* invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
final String v2 = "url"; // const-string v2, "url"
(( android.content.Intent ) v1 ).putExtra ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v0 = "call_back_type"; // const-string v0, "call_back_type"
(( android.content.Intent ) v1 ).putExtra ( v0, p4 ); // invoke-virtual {v1, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
(( android.app.Activity ) p1 ).startActivity ( v1 ); // invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void a ( android.app.Activity p0, Boolean p1 ) {
/* .locals 2 */
try { // :try_start_0
final String v0 = "BillingConnect"; // const-string v0, "BillingConnect"
final String v1 = "\u521d\u59cb\u5316"; // const-string v1, "\u521d\u59cb\u5316"
com.kkkwan.billing.h.f .a ( v0,v1 );
com.kkkwan.billing.h.f .a ( p2 );
/* new-instance v0, Lcom/kkkwan/billing/g/b; */
/* invoke-direct {v0, p1}, Lcom/kkkwan/billing/g/b;-><init>(Landroid/app/Activity;)V */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Integer; */
(( com.kkkwan.billing.g.b ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/g/b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 1 */
try { // :try_start_0
final String v0 = "\u91ca\u653esdk\u4e2d\u4f7f\u7528\u7684\u8d44\u6e90, dismiss()"; // const-string v0, "\u91ca\u653esdk\u4e2d\u4f7f\u7528\u7684\u8d44\u6e90, dismiss()"
com.kkkwan.billing.h.f .a ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
try { // :try_start_1
v0 = com.kkkwan.billing.f.a.f;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = com.kkkwan.billing.f.a.f;
	 (( android.content.Context ) p1 ).unregisterReceiver ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
	 int v0 = 0; // const/4 v0, 0x0
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
try { // :try_start_2
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public final void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
try { // :try_start_0
	 v0 = this.b;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public final void b ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
try { // :try_start_0
	 v0 = this.c;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public final void c ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
try { // :try_start_0
	 v0 = this.d;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
