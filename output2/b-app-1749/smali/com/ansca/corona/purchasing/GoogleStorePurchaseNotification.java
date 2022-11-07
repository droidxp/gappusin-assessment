public class com.ansca.corona.purchasing.GoogleStorePurchaseNotification extends com.ansca.corona.purchasing.GoogleStoreNotification {
	 /* .source "GoogleStorePurchaseNotification.java" */
	 /* # instance fields */
	 private java.lang.String fDeveloperPayload;
	 private java.lang.String fPackageName;
	 private java.lang.String fProductStringId;
	 private java.lang.String fPurchaseOrderStringId;
	 private com.ansca.corona.purchasing.GoogleStorePurchaseState fPurchaseState;
	 private java.util.Date fPurchaseTime;
	 /* # direct methods */
	 protected com.ansca.corona.purchasing.GoogleStorePurchaseNotification ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/purchasing/GoogleStoreNotification;-><init>()V */
		 /* .line 32 */
		 v0 = com.ansca.corona.purchasing.GoogleStorePurchaseState.REFUNDED;
		 this.fPurchaseState = v0;
		 /* .line 33 */
		 final String v0 = ""; // const-string v0, ""
		 this.fProductStringId = v0;
		 /* .line 34 */
		 final String v0 = ""; // const-string v0, ""
		 this.fPackageName = v0;
		 /* .line 35 */
		 /* new-instance v0, Ljava/util/Date; */
		 /* const-wide/16 v1, 0x0 */
		 /* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
		 this.fPurchaseTime = v0;
		 /* .line 36 */
		 final String v0 = ""; // const-string v0, ""
		 this.fPurchaseOrderStringId = v0;
		 /* .line 37 */
		 final String v0 = ""; // const-string v0, ""
		 this.fDeveloperPayload = v0;
		 /* .line 38 */
		 return;
	 } // .end method
	 public static com.ansca.corona.purchasing.GoogleStorePurchaseNotification from ( org.json.JSONObject p0 ) {
		 /* .locals 5 */
		 /* .param p0, "jsonObject" # Lorg/json/JSONObject; */
		 /* .prologue */
		 /* .line 99 */
		 /* if-nez p0, :cond_0 */
		 /* .line 100 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 118 */
	 } // :goto_0
	 /* .line 104 */
} // :cond_0
/* new-instance v1, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification; */
/* invoke-direct {v1}, Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification;-><init>()V */
/* .line 106 */
/* .local v1, "result":Lcom/ansca/corona/purchasing/GoogleStorePurchaseNotification; */
try { // :try_start_0
	 final String v2 = "purchaseState"; // const-string v2, "purchaseState"
	 v2 = 	 (( org.json.JSONObject ) p0 ).getInt ( v2 ); // invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
	 com.ansca.corona.purchasing.GoogleStorePurchaseState .fromOrdinal ( v2 );
	 this.fPurchaseState = v2;
	 /* .line 107 */
	 final String v2 = "productId"; // const-string v2, "productId"
	 (( org.json.JSONObject ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.fProductStringId = v2;
	 /* .line 108 */
	 final String v2 = "packageName"; // const-string v2, "packageName"
	 (( org.json.JSONObject ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.fPackageName = v2;
	 /* .line 109 */
	 /* new-instance v2, Ljava/util/Date; */
	 final String v3 = "purchaseTime"; // const-string v3, "purchaseTime"
	 (( org.json.JSONObject ) p0 ).getLong ( v3 ); // invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
	 /* move-result-wide v3 */
	 /* invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V */
	 this.fPurchaseTime = v2;
	 /* .line 110 */
	 final String v2 = "orderId"; // const-string v2, "orderId"
	 final String v3 = ""; // const-string v3, ""
	 (( org.json.JSONObject ) p0 ).optString ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
	 this.fPurchaseOrderStringId = v2;
	 /* .line 111 */
	 final String v2 = "notificationId"; // const-string v2, "notificationId"
	 final String v3 = ""; // const-string v3, ""
	 (( org.json.JSONObject ) p0 ).optString ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
	 this.fNotificationStringId = v2;
	 /* .line 112 */
	 final String v2 = "developerPayload"; // const-string v2, "developerPayload"
	 final String v3 = ""; // const-string v3, ""
	 (( org.json.JSONObject ) p0 ).optString ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
	 this.fDeveloperPayload = v2;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 114 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 115 */
	 /* .local v0, "ex":Ljava/lang/Exception; */
	 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 /* .line 116 */
	 int v1 = 0; // const/4 v1, 0x0
} // .end method
/* # virtual methods */
public java.lang.String getDeveloperPayload ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 87 */
	 v0 = this.fDeveloperPayload;
} // .end method
public java.lang.String getPackageName ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 61 */
	 v0 = this.fPackageName;
} // .end method
public java.lang.String getProductStringId ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 53 */
	 v0 = this.fProductStringId;
} // .end method
public java.lang.String getPurchaseOrderStringId ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 78 */
	 v0 = this.fPurchaseOrderStringId;
} // .end method
public com.ansca.corona.purchasing.GoogleStorePurchaseState getPurchaseState ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 45 */
	 v0 = this.fPurchaseState;
} // .end method
public java.util.Date getPurchaseTime ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 70 */
	 /* new-instance v0, Ljava/util/Date; */
	 v1 = this.fPurchaseTime;
	 (( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
	 /* move-result-wide v1 */
	 /* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
} // .end method
