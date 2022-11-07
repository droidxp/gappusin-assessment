class com.umeng.common.net.f extends android.os.Handler {
	 /* .source "DownloadingService.java" */
	 /* # instance fields */
	 final com.umeng.common.net.DownloadingService a; //synthetic
	 /* # direct methods */
	 com.umeng.common.net.f ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 1 */
		 this.a = p1;
		 /* .line 267 */
		 /* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void handleMessage ( android.os.Message p0 ) {
		 /* .locals 13 */
		 /* .prologue */
		 /* const/high16 v7, 0x8000000 */
		 int v12 = 2; // const/4 v12, 0x2
		 int v11 = 1; // const/4 v11, 0x1
		 int v10 = 0; // const/4 v10, 0x0
		 /* .line 273 */
		 /* iget v0, p1, Landroid/os/Message;->what:I */
		 /* packed-switch v0, :pswitch_data_0 */
		 /* .line 351 */
	 } // :goto_0
	 return;
	 /* .line 275 */
	 /* :pswitch_0 */
	 v0 = this.obj;
	 /* check-cast v0, Lcom/umeng/common/net/a$a; */
	 /* .line 276 */
	 /* iget v2, p1, Landroid/os/Message;->arg2:I */
	 /* .line 278 */
	 try { // :try_start_0
		 (( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
		 final String v3 = "filename"; // const-string v3, "filename"
		 (( android.os.Bundle ) v1 ).getString ( v3 ); // invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 280 */
		 com.umeng.common.net.DownloadingService .a ( );
		 final String v4 = "Cancel old notification...."; // const-string v4, "Cancel old notification...."
		 com.umeng.common.Log .c ( v1,v4 );
		 /* .line 282 */
		 /* new-instance v4, Landroid/app/Notification; */
		 /* .line 283 */
		 /* const v1, 0x1080082 */
		 /* .line 284 */
		 v5 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v5 );
		 v6 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v6 );
		 v6 = 		 com.umeng.common.a.c .j ( v6 );
		 (( android.content.Context ) v5 ).getString ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;
		 /* .line 285 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v6 */
		 /* .line 282 */
		 /* invoke-direct {v4, v1, v5, v6, v7}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V */
		 /* .line 286 */
		 /* new-instance v5, Landroid/content/Intent; */
		 final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
		 /* invoke-direct {v5, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 /* .line 287 */
		 /* const/high16 v1, 0x10000000 */
		 (( android.content.Intent ) v5 ).addFlags ( v1 ); // invoke-virtual {v5, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
		 /* .line 288 */
		 /* new-instance v1, Ljava/io/File; */
		 /* invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 android.net.Uri .fromFile ( v1 );
		 /* .line 289 */
		 final String v6 = "application/vnd.android.package-archive"; // const-string v6, "application/vnd.android.package-archive"
		 /* .line 288 */
		 (( android.content.Intent ) v5 ).setDataAndType ( v1, v6 ); // invoke-virtual {v5, v1, v6}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
		 /* .line 290 */
		 v1 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v1 );
		 int v6 = 0; // const/4 v6, 0x0
		 /* .line 291 */
		 /* const/high16 v7, 0x8000000 */
		 /* .line 290 */
		 android.app.PendingIntent .getActivity ( v1,v6,v5,v7 );
		 /* .line 293 */
		 v6 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v6 );
		 v7 = this.b;
		 /* .line 294 */
		 v8 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v8 );
		 v9 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v9 );
		 v9 = 		 com.umeng.common.a.c .j ( v9 );
		 (( android.content.Context ) v8 ).getString ( v9 ); // invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;
		 /* .line 293 */
		 (( android.app.Notification ) v4 ).setLatestEventInfo ( v6, v7, v8, v1 ); // invoke-virtual {v4, v6, v7, v8, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
		 /* .line 296 */
		 /* const/16 v1, 0x10 */
		 /* iput v1, v4, Landroid/app/Notification;->flags:I */
		 /* .line 298 */
		 v6 = this.a;
		 v1 = this.a;
		 final String v7 = "notification"; // const-string v7, "notification"
		 (( com.umeng.common.net.DownloadingService ) v1 ).getSystemService ( v7 ); // invoke-virtual {v1, v7}, Lcom/umeng/common/net/DownloadingService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v1, Landroid/app/NotificationManager; */
		 com.umeng.common.net.DownloadingService .a ( v6,v1 );
		 /* .line 300 */
		 v1 = this.a;
		 com.umeng.common.net.DownloadingService .c ( v1 );
		 /* add-int/lit8 v6, v2, 0x1 */
		 (( android.app.NotificationManager ) v1 ).notify ( v6, v4 ); // invoke-virtual {v1, v6, v4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
		 /* .line 302 */
		 com.umeng.common.net.DownloadingService .a ( );
		 final String v4 = "Show new notification...."; // const-string v4, "Show new notification...."
		 com.umeng.common.Log .c ( v1,v4 );
		 /* .line 304 */
		 v1 = this.a;
		 com.umeng.common.net.DownloadingService .a ( v1 );
		 v4 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v4 );
		 v1 = 		 (( com.umeng.common.net.d ) v1 ).a ( v4 ); // invoke-virtual {v1, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;)Z
		 /* .line 305 */
		 com.umeng.common.net.DownloadingService .a ( );
		 final String v6 = "isAppOnForeground = %1$B"; // const-string v6, "isAppOnForeground = %1$B"
		 int v7 = 1; // const/4 v7, 0x1
		 /* new-array v7, v7, [Ljava/lang/Object; */
		 int v8 = 0; // const/4 v8, 0x0
		 java.lang.Boolean .valueOf ( v1 );
		 /* aput-object v9, v7, v8 */
		 java.lang.String .format ( v6,v7 );
		 com.umeng.common.Log .c ( v4,v6 );
		 /* .line 311 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 312 */
			 v1 = this.a;
			 com.umeng.common.net.DownloadingService .c ( v1 );
			 /* add-int/lit8 v4, v2, 0x1 */
			 (( android.app.NotificationManager ) v1 ).cancel ( v4 ); // invoke-virtual {v1, v4}, Landroid/app/NotificationManager;->cancel(I)V
			 /* .line 313 */
			 v1 = this.a;
			 com.umeng.common.net.DownloadingService .b ( v1 );
			 (( android.content.Context ) v1 ).startActivity ( v5 ); // invoke-virtual {v1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
			 /* .line 316 */
		 } // :cond_0
		 com.umeng.common.net.DownloadingService .a ( );
		 final String v4 = "%1$10s downloaded.Saved to: %2$s"; // const-string v4, "%1$10s downloaded.Saved to: %2$s"
		 int v5 = 2; // const/4 v5, 0x2
		 /* new-array v5, v5, [Ljava/lang/Object; */
		 int v6 = 0; // const/4 v6, 0x0
		 /* .line 317 */
		 v0 = this.b;
		 /* aput-object v0, v5, v6 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* aput-object v3, v5, v0 */
		 /* .line 316 */
		 java.lang.String .format ( v4,v5 );
		 com.umeng.common.Log .a ( v1,v0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* goto/16 :goto_0 */
		 /* .line 319 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 320 */
		 com.umeng.common.net.DownloadingService .a ( );
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 final String v4 = "can not install."; // const-string v4, "can not install."
		 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.umeng.common.Log .b ( v1,v0 );
		 /* .line 322 */
		 v0 = this.a;
		 com.umeng.common.net.DownloadingService .c ( v0 );
		 /* add-int/lit8 v1, v2, 0x1 */
		 (( android.app.NotificationManager ) v0 ).cancel ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
		 /* goto/16 :goto_0 */
		 /* .line 327 */
		 /* :pswitch_1 */
		 v4 = this.obj;
		 /* check-cast v4, Lcom/umeng/common/net/a$a; */
		 /* .line 328 */
		 /* iget v3, p1, Landroid/os/Message;->arg2:I */
		 /* .line 329 */
		 (( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
		 final String v1 = "filename"; // const-string v1, "filename"
		 (( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 330 */
		 v0 = this.a;
		 com.umeng.common.net.DownloadingService .c ( v0 );
		 (( android.app.NotificationManager ) v0 ).cancel ( v3 ); // invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->cancel(I)V
		 /* .line 331 */
		 /* new-instance v0, Landroid/app/Notification; */
		 /* .line 332 */
		 /* const v1, 0x1080081 */
		 /* .line 333 */
		 v2 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v2 );
		 v5 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v5 );
		 v5 = 		 com.umeng.common.a.c .l ( v5 );
		 (( android.content.Context ) v2 ).getString ( v5 ); // invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
		 /* .line 334 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v5 */
		 /* .line 331 */
		 /* invoke-direct {v0, v1, v2, v5, v6}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V */
		 /* .line 335 */
		 v1 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v1 );
		 /* new-instance v2, Landroid/content/Intent; */
		 /* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
		 android.app.PendingIntent .getActivity ( v1,v10,v2,v7 );
		 /* .line 337 */
		 v2 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v2 );
		 /* .line 338 */
		 v5 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v5 );
		 com.umeng.common.b .w ( v5 );
		 /* .line 339 */
		 v6 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v6 );
		 v7 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v7 );
		 v7 = 		 com.umeng.common.a.c .l ( v7 );
		 (( android.content.Context ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;
		 /* .line 337 */
		 (( android.app.Notification ) v0 ).setLatestEventInfo ( v2, v5, v6, v1 ); // invoke-virtual {v0, v2, v5, v6, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
		 /* .line 341 */
		 v1 = this.a;
		 com.umeng.common.net.DownloadingService .c ( v1 );
		 /* add-int/lit8 v2, v3, 0x1 */
		 (( android.app.NotificationManager ) v1 ).notify ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
		 /* .line 342 */
		 final String v0 = ".patch"; // const-string v0, ".patch"
		 final String v1 = ".apk"; // const-string v1, ".apk"
		 (( java.lang.String ) v8 ).replace ( v0, v1 ); // invoke-virtual {v8, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
		 /* .line 343 */
		 v0 = this.a;
		 com.umeng.common.util.DeltaUpdate .a ( v0 );
		 /* .line 344 */
		 /* new-instance v0, Lcom/umeng/common/net/d$b; */
		 v1 = this.a;
		 com.umeng.common.net.DownloadingService .a ( v1 );
		 (( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 v2 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v2 );
		 /* .line 345 */
		 com.umeng.common.net.DownloadingService .c ( );
		 /* .line 346 */
		 com.umeng.common.net.DownloadingService .b ( );
		 /* .line 344 */
		 /* invoke-direct/range {v0 ..v7}, Lcom/umeng/common/net/d$b;-><init>(Lcom/umeng/common/net/d;Landroid/content/Context;ILcom/umeng/common/net/a$a;Ljava/lang/String;Landroid/util/SparseArray;Ljava/util/Map;)V */
		 /* .line 347 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* new-array v1, v1, [Ljava/lang/String; */
		 /* aput-object v9, v1, v10 */
		 /* aput-object v5, v1, v11 */
		 /* aput-object v8, v1, v12 */
		 (( com.umeng.common.net.d$b ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/common/net/d$b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
		 /* goto/16 :goto_0 */
		 /* .line 273 */
		 /* :pswitch_data_0 */
		 /* .packed-switch 0x5 */
		 /* :pswitch_0 */
		 /* :pswitch_1 */
	 } // .end packed-switch
} // .end method
