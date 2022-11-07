public class com.nobleempire.GunDisassembly2.BillingReceiver extends android.content.BroadcastReceiver {
	 /* .source "BillingReceiver.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # direct methods */
	 public com.nobleempire.GunDisassembly2.BillingReceiver ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 private void checkResponseCode ( android.content.Context p0, Long p1, Integer p2 ) {
		 /* .locals 2 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "requestId" # J */
		 /* .param p4, "responseCodeIndex" # I */
		 /* .prologue */
		 /* .line 78 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "com.android.vending.billing.RESPONSE_CODE"; // const-string v1, "com.android.vending.billing.RESPONSE_CODE"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 /* .line 79 */
		 /* .local v0, "intent":Landroid/content/Intent; */
		 /* const-class v1, Lcom/nobleempire/GunDisassembly2/BillingService; */
		 (( android.content.Intent ) v0 ).setClass ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
		 /* .line 80 */
		 final String v1 = "request_id"; // const-string v1, "request_id"
		 (( android.content.Intent ) v0 ).putExtra ( v1, p2, p3 ); // invoke-virtual {v0, v1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
		 /* .line 81 */
		 final String v1 = "response_code"; // const-string v1, "response_code"
		 (( android.content.Intent ) v0 ).putExtra ( v1, p4 ); // invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
		 /* .line 82 */
		 (( android.content.Context ) p1 ).startService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
		 /* .line 83 */
		 return;
	 } // .end method
	 private void notify ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "notifyId" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 66 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "com.nobleempire.dungeons.GET_PURCHASE_INFORMATION"; // const-string v1, "com.nobleempire.dungeons.GET_PURCHASE_INFORMATION"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 /* .line 67 */
		 /* .local v0, "intent":Landroid/content/Intent; */
		 /* const-class v1, Lcom/nobleempire/GunDisassembly2/BillingService; */
		 (( android.content.Intent ) v0 ).setClass ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
		 /* .line 68 */
		 final String v1 = "notification_id"; // const-string v1, "notification_id"
		 (( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 /* .line 69 */
		 (( android.content.Context ) p1 ).startService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
		 /* .line 70 */
		 return;
	 } // .end method
	 private void purchaseStateChanged ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "signedData" # Ljava/lang/String; */
		 /* .param p3, "signature" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 52 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "com.android.vending.billing.PURCHASE_STATE_CHANGED"; // const-string v1, "com.android.vending.billing.PURCHASE_STATE_CHANGED"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 /* .line 53 */
		 /* .local v0, "intent":Landroid/content/Intent; */
		 /* const-class v1, Lcom/nobleempire/GunDisassembly2/BillingService; */
		 (( android.content.Intent ) v0 ).setClass ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
		 /* .line 54 */
		 final String v1 = "inapp_signed_data"; // const-string v1, "inapp_signed_data"
		 (( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 /* .line 55 */
		 final String v1 = "inapp_signature"; // const-string v1, "inapp_signature"
		 (( android.content.Intent ) v0 ).putExtra ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 /* .line 56 */
		 (( android.content.Context ) p1 ).startService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
		 /* .line 57 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 10 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "intent" # Landroid/content/Intent; */
		 /* .prologue */
		 /* .line 24 */
		 (( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 /* .line 26 */
		 /* .local v0, "action":Ljava/lang/String; */
		 final String v7 = "com.android.vending.billing.PURCHASE_STATE_CHANGED"; // const-string v7, "com.android.vending.billing.PURCHASE_STATE_CHANGED"
		 v7 = 		 (( java.lang.String ) v7 ).equals ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v7 != null) { // if-eqz v7, :cond_1
			 /* .line 27 */
			 final String v7 = "inapp_signed_data"; // const-string v7, "inapp_signed_data"
			 (( android.content.Intent ) p2 ).getStringExtra ( v7 ); // invoke-virtual {p2, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 /* .line 28 */
			 /* .local v6, "signedData":Ljava/lang/String; */
			 final String v7 = "inapp_signature"; // const-string v7, "inapp_signature"
			 (( android.content.Intent ) p2 ).getStringExtra ( v7 ); // invoke-virtual {p2, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
			 /* .line 29 */
			 /* .local v5, "signature":Ljava/lang/String; */
			 /* invoke-direct {p0, p1, v6, v5}, Lcom/nobleempire/GunDisassembly2/BillingReceiver;->purchaseStateChanged(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V */
			 /* .line 43 */
		 } // .end local v5 # "signature":Ljava/lang/String;
	 } // .end local v6 # "signedData":Ljava/lang/String;
} // :cond_0
} // :goto_0
return;
/* .line 30 */
} // :cond_1
final String v7 = "com.android.vending.billing.IN_APP_NOTIFY"; // const-string v7, "com.android.vending.billing.IN_APP_NOTIFY"
v7 = (( java.lang.String ) v7 ).equals ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 31 */
final String v7 = "notification_id"; // const-string v7, "notification_id"
(( android.content.Intent ) p2 ).getStringExtra ( v7 ); // invoke-virtual {p2, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 35 */
/* .local v1, "notifyId":Ljava/lang/String; */
/* invoke-direct {p0, p1, v1}, Lcom/nobleempire/GunDisassembly2/BillingReceiver;->notify(Landroid/content/Context;Ljava/lang/String;)V */
/* .line 36 */
} // .end local v1 # "notifyId":Ljava/lang/String;
} // :cond_2
final String v7 = "com.android.vending.billing.RESPONSE_CODE"; // const-string v7, "com.android.vending.billing.RESPONSE_CODE"
v7 = (( java.lang.String ) v7 ).equals ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 37 */
final String v7 = "request_id"; // const-string v7, "request_id"
/* const-wide/16 v8, -0x1 */
(( android.content.Intent ) p2 ).getLongExtra ( v7, v8, v9 ); // invoke-virtual {p2, v7, v8, v9}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
/* move-result-wide v2 */
/* .line 38 */
/* .local v2, "requestId":J */
final String v7 = "response_code"; // const-string v7, "response_code"
v8 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_ERROR;
v8 = (( com.nobleempire.GunDisassembly2.Consts$ResponseCode ) v8 ).ordinal ( ); // invoke-virtual {v8}, Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode;->ordinal()I
v4 = (( android.content.Intent ) p2 ).getIntExtra ( v7, v8 ); // invoke-virtual {p2, v7, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 39 */
/* .local v4, "responseCodeIndex":I */
/* invoke-direct {p0, p1, v2, v3, v4}, Lcom/nobleempire/GunDisassembly2/BillingReceiver;->checkResponseCode(Landroid/content/Context;JI)V */
} // .end method
