public class com.ansca.corona.purchasing.GoogleStoreNotification {
	 /* .source "GoogleStoreNotification.java" */
	 /* # instance fields */
	 protected java.lang.String fNotificationStringId;
	 /* # direct methods */
	 protected com.ansca.corona.purchasing.GoogleStoreNotification ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 17 */
		 final String v0 = ""; // const-string v0, ""
		 this.fNotificationStringId = v0;
		 /* .line 18 */
		 return;
	 } // .end method
	 public static com.ansca.corona.purchasing.GoogleStoreNotification forId ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p0, "notificationStringId" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 35 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 v1 = 			 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
			 /* if-gtz v1, :cond_1 */
			 /* .line 36 */
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 42 */
	 } // :goto_0
	 /* .line 40 */
} // :cond_1
/* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreNotification; */
/* invoke-direct {v0}, Lcom/ansca/corona/purchasing/GoogleStoreNotification;-><init>()V */
/* .line 41 */
/* .local v0, "notification":Lcom/ansca/corona/purchasing/GoogleStoreNotification; */
this.fNotificationStringId = p0;
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreNotification from ( android.content.Intent p0 ) {
/* .locals 3 */
/* .param p0, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 53 */
/* if-nez p0, :cond_0 */
/* .line 54 */
int v1 = 0; // const/4 v1, 0x0
/* .line 67 */
} // :goto_0
/* .line 59 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 61 */
/* .local v1, "notification":Lcom/ansca/corona/purchasing/GoogleStoreNotification; */
try { // :try_start_0
final String v2 = "notification_id"; // const-string v2, "notification_id"
(( android.content.Intent ) p0 ).getStringExtra ( v2 ); // invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
com.ansca.corona.purchasing.GoogleStoreNotification .forId ( v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 63 */
/* :catch_0 */
/* move-exception v0 */
/* .line 64 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 65 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
/* # virtual methods */
public java.lang.String getNotificationStringId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 25 */
v0 = this.fNotificationStringId;
} // .end method
