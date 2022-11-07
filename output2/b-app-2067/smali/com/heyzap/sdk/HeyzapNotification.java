class com.heyzap.sdk.HeyzapNotification {
	 /* # static fields */
	 private static final Integer NOTIFICATION_ID;
	 /* # direct methods */
	 com.heyzap.sdk.HeyzapNotification ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void send ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 9 */
		 int v8 = 0; // const/4 v8, 0x0
		 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Get more from "; // const-string v2, "Get more from "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v2 = "Install Heyzap to share with your friends!"; // const-string v2, "Install Heyzap to share with your friends!"
		 (( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 /* iget v3, v3, Landroid/content/pm/ApplicationInfo;->icon:I */
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v5 = "\n"; // const-string v5, "\n"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v5 */
		 /* new-instance v7, Landroid/app/Notification; */
		 /* invoke-direct {v7, v3, v4, v5, v6}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V */
		 /* iget v3, v7, Landroid/app/Notification;->flags:I */
		 /* or-int/lit8 v3, v3, 0x10 */
		 /* iput v3, v7, Landroid/app/Notification;->flags:I */
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "market://details?id=com.heyzap.android&referrer="; // const-string v4, "market://details?id=com.heyzap.android&referrer="
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v4 = "notification=true"; // const-string v4, "notification=true"
		 com.heyzap.sdk.HeyzapAnalytics .getAnalyticsReferrer ( p0,v4 );
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* new-instance v4, Landroid/content/Intent; */
		 final String v5 = "android.intent.action.VIEW"; // const-string v5, "android.intent.action.VIEW"
		 android.net.Uri .parse ( v3 );
		 /* invoke-direct {v4, v5, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
		 android.app.PendingIntent .getActivity ( p0,v8,v4,v8 );
		 (( android.app.Notification ) v7 ).setLatestEventInfo ( v0, v1, v2, v3 ); // invoke-virtual {v7, v0, v1, v2, v3}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
		 final String v0 = "notification"; // const-string v0, "notification"
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/app/NotificationManager; */
		 /* const v1, 0x5f76b89 */
		 (( android.app.NotificationManager ) v0 ).notify ( v1, v7 ); // invoke-virtual {v0, v1, v7}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
		 final String v0 = "notification-sent"; // const-string v0, "notification-sent"
		 com.heyzap.sdk.HeyzapAnalytics .trackEvent ( p0,v0 );
		 return;
	 } // .end method
