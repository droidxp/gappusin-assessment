public class com.zong.android.engine.sms.ZongSmsReceiver extends android.content.BroadcastReceiver {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # instance fields */
	 private java.lang.ref.WeakReference b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference", */
	 /* "<", */
	 /* "Landroid/os/Handler;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.zong.android.engine.sms.ZongSmsReceiver ( ) {
/* .locals 1 */
/* const-class v0, Lcom/zong/android/engine/sms/ZongSmsReceiver; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
return;
} // .end method
public com.zong.android.engine.sms.ZongSmsReceiver ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
public com.zong.android.engine.sms.ZongSmsReceiver ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 10 */
int v3 = 0; // const/4 v3, 0x0
v0 = com.zong.android.engine.sms.ZongSmsReceiver.a;
final String v1 = "ZongSmsReceiver.onReceive"; // const-string v1, "ZongSmsReceiver.onReceive"
zongfuscated.q .a ( v0,v1 );
(( android.content.Intent ) p2 ).getExtras ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
if ( v0 != null) { // if-eqz v0, :cond_0
	 final String v1 = "pdus"; // const-string v1, "pdus"
	 (( android.os.Bundle ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, [Ljava/lang/Object; */
	 /* array-length v1, v0 */
	 /* new-array v4, v1, [Landroid/telephony/SmsMessage; */
	 /* move v2, v3 */
} // :goto_0
/* array-length v1, v4 */
/* if-lt v2, v1, :cond_1 */
} // :cond_0
return;
} // :cond_1
/* aget-object v1, v0, v2 */
/* check-cast v1, [B */
android.telephony.SmsMessage .createFromPdu ( v1 );
/* aput-object v1, v4, v2 */
/* aget-object v1, v4, v2 */
(( android.telephony.SmsMessage ) v1 ).getOriginatingAddress ( ); // invoke-virtual {v1}, Landroid/telephony/SmsMessage;->getOriginatingAddress()Ljava/lang/String;
/* aget-object v1, v4, v2 */
(( android.telephony.SmsMessage ) v1 ).getMessageBody ( ); // invoke-virtual {v1}, Landroid/telephony/SmsMessage;->getMessageBody()Ljava/lang/String;
(( java.lang.String ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;
v1 = com.zong.android.engine.sms.ZongSmsReceiver.a;
final String v7 = "Premium SMS arrived"; // const-string v7, "Premium SMS arrived"
int v8 = 2; // const/4 v8, 0x2
/* new-array v8, v8, [Ljava/lang/String; */
/* aput-object v5, v8, v3 */
int v9 = 1; // const/4 v9, 0x1
/* aput-object v6, v8, v9 */
zongfuscated.q .a ( v1,v7,v8 );
v1 = this.b;
(( java.lang.ref.WeakReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v1, Landroid/os/Handler; */
if ( v1 != null) { // if-eqz v1, :cond_2
(( android.os.Handler ) v1 ).obtainMessage ( v3 ); // invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
/* new-instance v8, Landroid/os/Bundle; */
/* invoke-direct {v8}, Landroid/os/Bundle;-><init>()V */
final String v9 = "body"; // const-string v9, "body"
(( android.os.Bundle ) v8 ).putString ( v9, v6 ); // invoke-virtual {v8, v9, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
final String v6 = "originatingAddr"; // const-string v6, "originatingAddr"
(( android.os.Bundle ) v8 ).putString ( v6, v5 ); // invoke-virtual {v8, v6, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
(( android.os.Message ) v7 ).setData ( v8 ); // invoke-virtual {v7, v8}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
(( android.os.Handler ) v1 ).sendMessage ( v7 ); // invoke-virtual {v1, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
} // :goto_1
/* add-int/lit8 v1, v2, 0x1 */
/* move v2, v1 */
} // :cond_2
v1 = com.zong.android.engine.sms.ZongSmsReceiver.a;
final String v5 = "PINCODE send failed on a dead SMS Handler in payment flow"; // const-string v5, "PINCODE send failed on a dead SMS Handler in payment flow"
zongfuscated.q .a ( v1,v5 );
} // .end method
