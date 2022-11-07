public class com.heyzap.sdk.HeyzapLib {
	 /* # static fields */
	 private static final java.lang.String HEYZAP_INTENT_CLASS;
	 public static final java.lang.String HEYZAP_PACKAGE;
	 private static Integer NO_NOTIFICATION_FLAG;
	 private static Integer flags;
	 private static java.lang.String packageName;
	 /* # direct methods */
	 static com.heyzap.sdk.HeyzapLib ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* const/high16 v0, 0x800000 */
		 return;
	 } // .end method
	 public com.heyzap.sdk.HeyzapLib ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static void broadcastEnableSDK ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "com.heyzap.android.enableSDK"; // const-string v1, "com.heyzap.android.enableSDK"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 final String v1 = "packageName"; // const-string v1, "packageName"
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 (( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 (( android.content.Context ) p0 ).sendBroadcast ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
		 return;
	 } // .end method
	 public static void checkin ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* move-object v0, p0 */
		 /* check-cast v0, Landroid/app/Activity; */
		 /* move-object v1, v0 */
		 /* new-instance v2, Lcom/heyzap/sdk/HeyzapLib$2; */
		 /* invoke-direct {v2, p0}, Lcom/heyzap/sdk/HeyzapLib$2;-><init>(Landroid/content/Context;)V */
		 (( android.app.Activity ) v1 ).runOnUiThread ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
	 public static void checkin ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* move-object v0, p0 */
		 /* check-cast v0, Landroid/app/Activity; */
		 /* move-object v1, v0 */
		 /* new-instance v2, Lcom/heyzap/sdk/HeyzapLib$3; */
		 /* invoke-direct {v2, p0, p1}, Lcom/heyzap/sdk/HeyzapLib$3;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
		 (( android.app.Activity ) v1 ).runOnUiThread ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
	 public static Boolean isSupported ( android.content.Context p0 ) {
		 /* .locals 1 */
		 v0 = 		 com.heyzap.sdk.Utils .marketInstalled ( p0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 com.heyzap.sdk.Utils .androidVersionSupported ( );
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 int v0 = 1; // const/4 v0, 0x1
			 } // :goto_0
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 static void launchCheckinForm ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 final String v0 = "com.heyzap.android"; // const-string v0, "com.heyzap.android"
		 /* new-instance v1, Landroid/content/Intent; */
		 final String v2 = "android.intent.action.MAIN"; // const-string v2, "android.intent.action.MAIN"
		 /* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 final String v2 = "message"; // const-string v2, "message"
		 (( android.content.Intent ) v1 ).putExtra ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 (( android.content.Intent ) v1 ).setAction ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
		 final String v2 = "android.intent.category.LAUNCHER"; // const-string v2, "android.intent.category.LAUNCHER"
		 (( android.content.Intent ) v1 ).addCategory ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
		 final String v2 = "packageName"; // const-string v2, "packageName"
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 (( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 /* const/high16 v2, 0x18000000 */
		 (( android.content.Intent ) v1 ).addFlags ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
		 /* new-instance v2, Landroid/content/ComponentName; */
		 final String v3 = "com.heyzap.android.CheckinForm"; // const-string v3, "com.heyzap.android.CheckinForm"
		 /* invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 (( android.content.Intent ) v1 ).setComponent ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
		 (( android.content.Context ) p0 ).startActivity ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
		 return;
	 } // .end method
	 public static void load ( android.content.Context p0 ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.heyzap.sdk.HeyzapLib .load ( p0,v0 );
		 return;
	 } // .end method
	 public static void load ( android.content.Context p0, Boolean p1 ) {
		 /* .locals 4 */
		 com.heyzap.sdk.HeyzapLib .sendNotification ( p0 );
		 com.heyzap.sdk.Utils .getAppLabel ( p0 );
		 /* if-nez v2, :cond_1 */
	 } // :cond_0
} // :goto_0
return;
} // :cond_1
final String v1 = "com.heyzap.android"; // const-string v1, "com.heyzap.android"
v1 = com.heyzap.sdk.HeyzapLib .packageIsInstalled ( v1,p0 );
/* if-nez v1, :cond_0 */
v1 = com.heyzap.sdk.Utils .androidVersionSupported ( );
if ( v1 != null) { // if-eqz v1, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* move-object v0, p0 */
	 /* check-cast v0, Landroid/app/Activity; */
	 /* move-object v1, v0 */
	 /* new-instance v3, Lcom/heyzap/sdk/HeyzapLib$1; */
	 /* invoke-direct {v3, p0, v2}, Lcom/heyzap/sdk/HeyzapLib$1;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
	 (( android.app.Activity ) v1 ).runOnUiThread ( v3 ); // invoke-virtual {v1, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
static Boolean packageIsInstalled ( java.lang.String p0, android.content.Context p1 ) {
	 /* .locals 4 */
	 int v0 = 0; // const/4 v0, 0x0
	 try { // :try_start_0
		 (( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 (( android.content.pm.PackageManager ) v1 ).getLaunchIntentForPackage ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* const/high16 v3, 0x10000 */
			 (( android.content.pm.PackageManager ) v1 ).queryIntentActivities ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
			 /* :try_end_0 */
			 v1 = 			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* if-lez v1, :cond_0 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
	 } // :goto_0
	 /* :catch_0 */
	 /* move-exception v1 */
} // .end method
static void rawCheckin ( android.content.Context p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 final String v0 = "HeyzapSDK"; // const-string v0, "HeyzapSDK"
	 final String v1 = "checkin-called"; // const-string v1, "checkin-called"
	 android.util.Log .v ( v0,v1 );
	 final String v0 = "com.heyzap.android"; // const-string v0, "com.heyzap.android"
	 v0 = 	 com.heyzap.sdk.HeyzapLib .packageIsInstalled ( v0,p0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 com.heyzap.sdk.HeyzapLib .launchCheckinForm ( p0,p1 );
	 } // :goto_0
	 return;
} // :cond_0
try { // :try_start_0
	 final String v0 = "checkin-button-clicked"; // const-string v0, "checkin-button-clicked"
	 com.heyzap.sdk.HeyzapAnalytics .trackEvent ( p0,v0 );
	 /* new-instance v0, Lcom/heyzap/sdk/PreMarketDialog; */
	 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
	 v2 = com.heyzap.sdk.HeyzapLib.packageName;
	 /* invoke-direct {v0, v1, v2}, Lcom/heyzap/sdk/PreMarketDialog;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
	 (( com.heyzap.sdk.PreMarketDialog ) v0 ).show ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/PreMarketDialog;->show()V
	 /* :try_end_0 */
	 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
} // .end method
static void sendNotification ( android.content.Context p0 ) {
	 /* .locals 6 */
	 /* and-int/2addr v0, v1 */
	 /* if-lez v0, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
com.heyzap.sdk.Utils .getAppLabel ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = "com.heyzap.android"; // const-string v1, "com.heyzap.android"
v1 = com.heyzap.sdk.HeyzapLib .packageIsInstalled ( v1,p0 );
/* if-nez v1, :cond_0 */
v1 = com.heyzap.sdk.Utils .marketInstalled ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = com.heyzap.sdk.Utils .androidVersionSupported ( );
if ( v1 != null) { // if-eqz v1, :cond_0
	 try { // :try_start_0
		 /* new-instance v1, Ljava/util/Date; */
		 final String v2 = "HeyzapFirstRun"; // const-string v2, "HeyzapFirstRun"
		 int v3 = 0; // const/4 v3, 0x0
		 (( android.content.Context ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v3 = "notificationLastShown"; // const-string v3, "notificationLastShown"
		 /* const-wide/16 v4, 0x0 */
		 /* move-result-wide v2 */
		 /* invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V */
		 /* new-instance v2, Ljava/util/Date; */
		 /* invoke-direct {v2}, Ljava/util/Date;-><init>()V */
		 final String v3 = "HeyzapFirstRun"; // const-string v3, "HeyzapFirstRun"
		 int v4 = 0; // const/4 v4, 0x0
		 (( android.content.Context ) p0 ).getSharedPreferences ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v4 = "numberNotificationsShown"; // const-string v4, "numberNotificationsShown"
		 v3 = 		 int v5 = 0; // const/4 v5, 0x0
		 /* packed-switch v3, :pswitch_data_0 */
		 /* :pswitch_0 */
		 com.heyzap.sdk.HeyzapNotification .send ( p0,v0 );
	 } // :cond_2
} // :goto_1
final String v0 = "HeyzapFirstRun"; // const-string v0, "HeyzapFirstRun"
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v1 = "numberNotificationsShown"; // const-string v1, "numberNotificationsShown"
/* add-int/lit8 v3, v3, 0x1 */
final String v1 = "notificationLastShown"; // const-string v1, "notificationLastShown"
(( java.util.Date ) v2 ).getTime ( ); // invoke-virtual {v2}, Ljava/util/Date;->getTime()J
/* move-result-wide v2 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "HeyzapSDK"; // const-string v1, "HeyzapSDK"
final String v2 = "Exception while sending notification"; // const-string v2, "Exception while sending notification"
android.util.Log .d ( v1,v2 );
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* :pswitch_1 */
try { // :try_start_1
	 v1 = 	 com.heyzap.sdk.Utils .daysBetween ( v1,v2 );
	 int v4 = 5; // const/4 v4, 0x5
	 /* if-lt v1, v4, :cond_2 */
	 com.heyzap.sdk.HeyzapNotification .send ( p0,v0 );
	 /* :pswitch_2 */
	 v1 = 	 com.heyzap.sdk.Utils .daysBetween ( v1,v2 );
	 /* const/16 v4, 0xe */
	 /* if-lt v1, v4, :cond_2 */
	 com.heyzap.sdk.HeyzapNotification .send ( p0,v0 );
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
} // .end packed-switch
} // .end method
public static void setFlags ( Integer p0 ) {
/* .locals 1 */
/* or-int/2addr v0, p0 */
return;
} // .end method
