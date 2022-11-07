public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 8 */
		 int v7 = 0; // const/4 v7, 0x0
		 try { // :try_start_0
			 v0 = 			 android.text.TextUtils .isEmpty ( p2 );
			 /* if-nez v0, :cond_1 */
			 android.text.TextUtils .isEmpty ( p3 );
			 /* :try_end_0 */
			 v0 = 			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* if-nez v0, :cond_1 */
			 try { // :try_start_1
				 final String v0 = "SendMessageMgr"; // const-string v0, "SendMessageMgr"
				 final String v1 = "into sendSMS"; // const-string v1, "into sendSMS"
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 android.telephony.SmsManager .getDefault ( );
				 /* new-instance v1, Landroid/content/Intent; */
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 final String v3 = "SENT_SMS_ACTION"; // const-string v3, "SENT_SMS_ACTION"
				 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
				 int v2 = 0; // const/4 v2, 0x0
				 int v3 = 0; // const/4 v3, 0x0
				 android.app.PendingIntent .getBroadcast ( p1,v2,v1,v3 );
				 /* new-instance v1, Landroid/content/Intent; */
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 final String v3 = "DELIVERED_SMS_ACTION"; // const-string v3, "DELIVERED_SMS_ACTION"
				 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
				 int v2 = 0; // const/4 v2, 0x0
				 int v3 = 0; // const/4 v3, 0x0
				 android.app.PendingIntent .getBroadcast ( p1,v2,v1,v3 );
				 v1 = 				 (( java.lang.String ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/lang/String;->length()I
				 /* const/16 v2, 0x46 */
				 /* if-le v1, v2, :cond_2 */
				 (( android.telephony.SmsManager ) v0 ).divideMessage ( p3 ); // invoke-virtual {v0, p3}, Landroid/telephony/SmsManager;->divideMessage(Ljava/lang/String;)Ljava/util/ArrayList;
				 (( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
			 v1 = 			 } // :goto_0
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* check-cast v3, Ljava/lang/String; */
				 int v2 = 0; // const/4 v2, 0x0
				 /* move-object v1, p2 */
				 /* invoke-virtual/range {v0 ..v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V */
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 try { // :try_start_2
					 final String v1 = "\u77ed\u4fe1\u53d1\u9001\u5931\u8d25"; // const-string v1, "\u77ed\u4fe1\u53d1\u9001\u5931\u8d25"
					 int v2 = 0; // const/4 v2, 0x0
					 android.widget.Toast .makeText ( p1,v1,v2 );
					 (( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
					 (( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
					 com.kkkwan.billing.h.f .a ( v1 );
					 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
				 } // :cond_0
			 } // :goto_1
			 /* new-instance v0, Landroid/content/ContentValues; */
			 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
			 final String v1 = "date"; // const-string v1, "date"
			 java.lang.System .currentTimeMillis ( );
			 /* move-result-wide v2 */
			 java.lang.Long .valueOf ( v2,v3 );
			 (( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
			 final String v1 = "read"; // const-string v1, "read"
			 int v2 = 0; // const/4 v2, 0x0
			 java.lang.Integer .valueOf ( v2 );
			 (( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
			 final String v1 = "type"; // const-string v1, "type"
			 int v2 = 2; // const/4 v2, 0x2
			 java.lang.Integer .valueOf ( v2 );
			 (( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
			 final String v1 = "address"; // const-string v1, "address"
			 (( android.content.ContentValues ) v0 ).put ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
			 final String v1 = "body"; // const-string v1, "body"
			 (( android.content.ContentValues ) v0 ).put ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
			 (( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
			 final String v2 = "content://sms"; // const-string v2, "content://sms"
			 android.net.Uri .parse ( v2 );
			 (( android.content.ContentResolver ) v1 ).insert ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
			 /* :try_end_2 */
			 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
		 } // :cond_1
	 } // :goto_2
	 return;
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* move-object v1, p2 */
/* move-object v3, p3 */
try { // :try_start_3
	 /* invoke-virtual/range {v0 ..v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V */
	 /* :try_end_3 */
	 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 final String v1 = "\u77ed\u4fe1\u53d1\u9001\u5931\u8d25"; // const-string v1, "\u77ed\u4fe1\u53d1\u9001\u5931\u8d25"
	 android.widget.Toast .makeText ( p1,v1,v7 );
	 (( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
	 (( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
	 com.kkkwan.billing.h.f .a ( v1 );
	 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
