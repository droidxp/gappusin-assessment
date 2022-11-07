class com.ansca.corona.purchasing.GoogleStoreConnection$GoogleStoreEventHandler implements com.ansca.corona.purchasing.GoogleStoreBroadcastListener {
	 /* .source "GoogleStoreConnection.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/purchasing/GoogleStoreConnection; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "GoogleStoreEventHandler" */
} // .end annotation
/* # instance fields */
private com.ansca.corona.purchasing.GoogleStoreConnection fConnection;
final com.ansca.corona.purchasing.GoogleStoreConnection this$0; //synthetic
/* # direct methods */
public com.ansca.corona.purchasing.GoogleStoreConnection$GoogleStoreEventHandler ( ) {
/* .locals 1 */
/* .param p2, "connection" # Lcom/ansca/corona/purchasing/GoogleStoreConnection; */
/* .prologue */
/* .line 254 */
this.this$0 = p1;
/* .line 255 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 258 */
/* if-nez p2, :cond_0 */
/* .line 259 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
/* .line 263 */
} // :cond_0
this.fConnection = p2;
/* .line 266 */
com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver .addListener ( p0 );
/* .line 267 */
return;
} // .end method
/* # virtual methods */
public void dispose ( ) {
/* .locals 0 */
/* .prologue */
/* .line 274 */
com.ansca.corona.purchasing.GoogleStoreBroadcastReceiver .removeListener ( p0 );
/* .line 275 */
return;
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 15 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 285 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* if-nez p2, :cond_1 */
/* .line 343 */
} // :cond_0
} // :goto_0
return;
/* .line 290 */
} // :cond_1
/* invoke-virtual/range {p2 ..p2}, Landroid/content/Intent;->getAction()Ljava/lang/String; */
/* .line 291 */
/* .local v1, "actionName":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
v12 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-lez v12, :cond_0 */
/* .line 296 */
final String v12 = "com.android.vending.billing.PURCHASE_STATE_CHANGED"; // const-string v12, "com.android.vending.billing.PURCHASE_STATE_CHANGED"
v12 = (( java.lang.String ) v1 ).equals ( v12 ); // invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v12 != null) { // if-eqz v12, :cond_3
/* .line 299 */
v12 = this.fConnection;
com.ansca.corona.purchasing.GoogleStoreConnection .access$000 ( v12 );
if ( v12 != null) { // if-eqz v12, :cond_0
/* .line 301 */
try { // :try_start_0
	 final String v12 = "inapp_signed_data"; // const-string v12, "inapp_signed_data"
	 /* move-object/from16 v0, p2 */
	 (( android.content.Intent ) v0 ).getStringExtra ( v12 ); // invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 302 */
	 /* .local v5, "jsonMessage":Ljava/lang/String; */
	 final String v12 = "inapp_signature"; // const-string v12, "inapp_signature"
	 /* move-object/from16 v0, p2 */
	 (( android.content.Intent ) v0 ).getStringExtra ( v12 ); // invoke-virtual {v0, v12}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 303 */
	 /* .local v7, "jsonSignature":Ljava/lang/String; */
	 if ( v5 != null) { // if-eqz v5, :cond_0
		 v12 = 		 (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
		 /* if-lez v12, :cond_0 */
		 /* .line 304 */
		 /* new-instance v6, Lorg/json/JSONObject; */
		 /* invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
		 /* .line 305 */
		 /* .local v6, "jsonObject":Lorg/json/JSONObject; */
		 final String v12 = "orders"; // const-string v12, "orders"
		 (( org.json.JSONObject ) v6 ).optJSONArray ( v12 ); // invoke-virtual {v6, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
		 /* .line 306 */
		 /* .local v4, "jsonArray":Lorg/json/JSONArray; */
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 307 */
			 int v3 = 0; // const/4 v3, 0x0
			 /* .local v3, "index":I */
		 } // :goto_1
		 v12 = 		 (( org.json.JSONArray ) v4 ).length ( ); // invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
		 /* if-ge v3, v12, :cond_0 */
		 /* .line 309 */
		 (( org.json.JSONArray ) v4 ).getJSONObject ( v3 ); // invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
		 com.ansca.corona.purchasing.GoogleStorePurchaseNotification .from ( v12 );
		 /* .line 310 */
		 /* .local v8, "notification":Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification; */
		 if ( v8 != null) { // if-eqz v8, :cond_2
			 /* .line 311 */
			 v12 = this.fConnection;
			 com.ansca.corona.purchasing.GoogleStoreConnection .access$000 ( v12 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 307 */
		 } // :cond_2
		 /* add-int/lit8 v3, v3, 0x1 */
		 /* .line 317 */
	 } // .end local v3 # "index":I
} // .end local v4 # "jsonArray":Lorg/json/JSONArray;
} // .end local v5 # "jsonMessage":Ljava/lang/String;
} // .end local v6 # "jsonObject":Lorg/json/JSONObject;
} // .end local v7 # "jsonSignature":Ljava/lang/String;
} // .end local v8 # "notification":Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;
/* :catch_0 */
/* move-exception v2 */
/* .line 318 */
/* .local v2, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
/* .line 322 */
} // .end local v2 # "ex":Ljava/lang/Exception;
} // :cond_3
final String v12 = "com.android.vending.billing.IN_APP_NOTIFY"; // const-string v12, "com.android.vending.billing.IN_APP_NOTIFY"
v12 = (( java.lang.String ) v1 ).equals ( v12 ); // invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v12 != null) { // if-eqz v12, :cond_4
/* .line 324 */
v12 = this.fConnection;
com.ansca.corona.purchasing.GoogleStoreConnection .access$000 ( v12 );
if ( v12 != null) { // if-eqz v12, :cond_0
/* .line 325 */
/* invoke-static/range {p2 ..p2}, Lcom/ansca/corona/purchasing/GoogleStoreNotification;->from(Landroid/content/Intent;)Lcom/ansca/corona/purchasing/GoogleStoreNotification; */
/* .line 326 */
/* .local v8, "notification":Lcom/ansca/corona/purchasing/GoogleStoreNotification; */
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 327 */
v12 = this.fConnection;
com.ansca.corona.purchasing.GoogleStoreConnection .access$000 ( v12 );
/* goto/16 :goto_0 */
/* .line 331 */
} // .end local v8 # "notification":Lcom/ansca/corona/purchasing/GoogleStoreNotification;
} // :cond_4
final String v12 = "com.android.vending.billing.RESPONSE_CODE"; // const-string v12, "com.android.vending.billing.RESPONSE_CODE"
v12 = (( java.lang.String ) v1 ).equals ( v12 ); // invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v12 != null) { // if-eqz v12, :cond_5
/* .line 333 */
v12 = this.fConnection;
com.ansca.corona.purchasing.GoogleStoreConnection .access$000 ( v12 );
if ( v12 != null) { // if-eqz v12, :cond_0
/* .line 334 */
final String v12 = "request_id"; // const-string v12, "request_id"
/* const-wide/16 v13, -0x1 */
/* move-object/from16 v0, p2 */
(( android.content.Intent ) v0 ).getLongExtra ( v12, v13, v14 ); // invoke-virtual {v0, v12, v13, v14}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
/* move-result-wide v9 */
/* .line 335 */
/* .local v9, "requestId":J */
final String v12 = "response_code"; // const-string v12, "response_code"
v13 = com.ansca.corona.purchasing.GoogleStoreResponseCode.ERROR;
v13 = (( com.ansca.corona.purchasing.GoogleStoreResponseCode ) v13 ).ordinal ( ); // invoke-virtual {v13}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;->ordinal()I
/* move-object/from16 v0, p2 */
v11 = (( android.content.Intent ) v0 ).getIntExtra ( v12, v13 ); // invoke-virtual {v0, v12, v13}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 336 */
/* .local v11, "responseCodeOrdinal":I */
v12 = this.fConnection;
com.ansca.corona.purchasing.GoogleStoreConnection .access$000 ( v12 );
com.ansca.corona.purchasing.GoogleStoreResponseCode .fromOrdinal ( v11 );
/* goto/16 :goto_0 */
/* .line 341 */
} // .end local v9 # "requestId":J
} // .end local v11 # "responseCodeOrdinal":I
} // :cond_5
final String v12 = "Corona"; // const-string v12, "Corona"
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
final String v14 = "Received unkown action name \'"; // const-string v14, "Received unkown action name \'"
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).append ( v1 ); // invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v14 = "\' from the Android Marketplace."; // const-string v14, "\' from the Android Marketplace."
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v12,v13 );
/* goto/16 :goto_0 */
} // .end method
