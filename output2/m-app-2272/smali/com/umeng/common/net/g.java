class com.umeng.common.net.g implements com.umeng.common.net.DownloadingService$a {
	 /* .source "DownloadingService.java" */
	 /* # interfaces */
	 /* # instance fields */
	 final com.umeng.common.net.DownloadingService a; //synthetic
	 /* # direct methods */
	 com.umeng.common.net.g ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 1 */
		 this.a = p1;
		 /* .line 354 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0 ) {
		 /* .locals 8 */
		 /* .prologue */
		 int v7 = 1; // const/4 v7, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 359 */
		 com.umeng.common.net.DownloadingService .c ( );
		 v0 = 		 (( android.util.SparseArray ) v0 ).indexOfKey ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I
		 /* if-ltz v0, :cond_1 */
		 /* .line 360 */
		 com.umeng.common.net.DownloadingService .c ( );
		 (( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Lcom/umeng/common/net/d$a; */
		 /* .line 361 */
		 v2 = this.f;
		 /* .line 363 */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* aget-wide v3, v2, v7 */
			 /* const-wide/16 v5, 0x0 */
			 /* cmp-long v3, v3, v5 */
			 /* if-lez v3, :cond_0 */
			 /* .line 364 */
			 /* aget-wide v3, v2, v1 */
			 /* long-to-float v1, v3 */
			 /* aget-wide v2, v2, v7 */
			 /* long-to-float v2, v2 */
			 /* div-float/2addr v1, v2 */
			 /* .line 365 */
			 /* const/high16 v2, 0x42c80000 # 100.0f */
			 /* mul-float/2addr v1, v2 */
			 /* float-to-int v1, v1 */
			 /* .line 367 */
			 /* const/16 v2, 0x64 */
			 /* if-le v1, v2, :cond_0 */
			 /* const/16 v1, 0x63 */
			 /* .line 370 */
		 } // :cond_0
		 v2 = this.a;
		 com.umeng.common.net.DownloadingService .a ( v2 );
		 v3 = this.a;
		 v4 = this.e;
		 (( com.umeng.common.net.d ) v2 ).a ( v3, v4, p1, v1 ); // invoke-virtual {v2, v3, v4, p1, v1}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Lcom/umeng/common/net/a$a;II)Landroid/app/Notification;
		 /* .line 371 */
		 this.b = v1;
		 /* .line 373 */
		 v0 = this.a;
		 com.umeng.common.net.DownloadingService .c ( v0 );
		 (( android.app.NotificationManager ) v0 ).notify ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
		 /* .line 375 */
	 } // :cond_1
	 return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
	 /* .locals 7 */
	 /* .prologue */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 379 */
	 com.umeng.common.net.DownloadingService .c ( );
	 v0 = 	 (( android.util.SparseArray ) v0 ).indexOfKey ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I
	 /* if-ltz v0, :cond_0 */
	 /* .line 380 */
	 com.umeng.common.net.DownloadingService .c ( );
	 (( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Lcom/umeng/common/net/d$a; */
	 /* .line 381 */
	 v1 = this.e;
	 /* .line 382 */
	 v0 = this.b;
	 /* .line 383 */
	 v2 = this.contentView;
	 /* .line 384 */
	 v3 = this.a;
	 com.umeng.common.net.DownloadingService .b ( v3 );
	 v3 = 	 com.umeng.common.a.a .b ( v3 );
	 /* const/16 v4, 0x64 */
	 /* .line 383 */
	 (( android.widget.RemoteViews ) v2 ).setProgressBar ( v3, v4, p2, v6 ); // invoke-virtual {v2, v3, v4, p2, v6}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V
	 /* .line 386 */
	 v2 = this.contentView;
	 /* .line 387 */
	 v3 = this.a;
	 com.umeng.common.net.DownloadingService .b ( v3 );
	 v3 = 	 com.umeng.common.a.a .a ( v3 );
	 /* .line 388 */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( p2 );
	 java.lang.String .valueOf ( v5 );
	 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v5 = "%"; // const-string v5, "%"
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 386 */
	 (( android.widget.RemoteViews ) v2 ).setTextViewText ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
	 /* .line 390 */
	 v2 = this.a;
	 com.umeng.common.net.DownloadingService .c ( v2 );
	 (( android.app.NotificationManager ) v2 ).notify ( p1, v0 ); // invoke-virtual {v2, p1, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
	 /* .line 391 */
	 com.umeng.common.net.DownloadingService .a ( );
	 /* .line 392 */
	 final String v2 = "%3$10s Notification: mNotificationId = %1$15s\t|\tprogress = %2$15s"; // const-string v2, "%3$10s Notification: mNotificationId = %1$15s\t|\tprogress = %2$15s"
	 int v3 = 3; // const/4 v3, 0x3
	 /* new-array v3, v3, [Ljava/lang/Object; */
	 /* .line 393 */
	 java.lang.Integer .valueOf ( p1 );
	 /* aput-object v4, v3, v6 */
	 int v4 = 1; // const/4 v4, 0x1
	 java.lang.Integer .valueOf ( p2 );
	 /* aput-object v5, v3, v4 */
	 int v4 = 2; // const/4 v4, 0x2
	 v1 = this.b;
	 /* aput-object v1, v3, v4 */
	 /* .line 391 */
	 java.lang.String .format ( v2,v3 );
	 com.umeng.common.Log .c ( v0,v1 );
	 /* .line 395 */
} // :cond_0
return;
} // .end method
public void a ( Integer p0, java.lang.Exception p1 ) {
/* .locals 6 */
/* .prologue */
/* .line 458 */
com.umeng.common.net.DownloadingService .c ( );
v0 = (( android.util.SparseArray ) v0 ).indexOfKey ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I
/* if-ltz v0, :cond_0 */
/* .line 459 */
com.umeng.common.net.DownloadingService .c ( );
(( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/common/net/d$a; */
/* .line 460 */
v1 = this.e;
/* .line 461 */
v0 = this.b;
/* .line 462 */
v2 = this.contentView;
/* .line 463 */
v3 = this.a;
com.umeng.common.net.DownloadingService .b ( v3 );
v3 = com.umeng.common.a.a .c ( v3 );
/* new-instance v4, Ljava/lang/StringBuilder; */
v1 = this.b;
java.lang.String .valueOf ( v1 );
/* invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 464 */
v1 = this.a;
com.umeng.common.net.DownloadingService .b ( v1 );
v5 = this.a;
com.umeng.common.net.DownloadingService .b ( v5 );
v5 = com.umeng.common.a.c .h ( v5 );
(( android.content.Context ) v1 ).getString ( v5 ); // invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 462 */
(( android.widget.RemoteViews ) v2 ).setTextViewText ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 465 */
v1 = this.a;
com.umeng.common.net.DownloadingService .c ( v1 );
(( android.app.NotificationManager ) v1 ).notify ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
/* .line 466 */
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.a;
com.umeng.common.net.DownloadingService .b ( v1 );
com.umeng.common.net.DownloadingService .c ( );
com.umeng.common.net.DownloadingService .b ( );
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, p1 ); // invoke-virtual {v0, v1, v2, v3, p1}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* .line 468 */
} // :cond_0
return;
} // .end method
public void a ( Integer p0, java.lang.String p1 ) {
/* .locals 8 */
/* .prologue */
/* const/16 v7, 0x64 */
int v6 = 5; // const/4 v6, 0x5
int v5 = 1; // const/4 v5, 0x1
/* .line 399 */
com.umeng.common.net.DownloadingService .c ( );
v0 = (( android.util.SparseArray ) v0 ).indexOfKey ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I
/* if-ltz v0, :cond_0 */
/* .line 400 */
com.umeng.common.net.DownloadingService .c ( );
(( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/common/net/d$a; */
/* .line 401 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 402 */
v1 = this.e;
/* .line 403 */
v0 = this.b;
/* .line 404 */
v0 = this.contentView;
/* .line 405 */
v2 = this.a;
com.umeng.common.net.DownloadingService .b ( v2 );
v2 = com.umeng.common.a.a .a ( v2 );
/* .line 406 */
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "%"; // const-string v4, "%"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 404 */
(( android.widget.RemoteViews ) v0 ).setTextViewText ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 408 */
v0 = this.a;
com.umeng.common.net.DownloadingService .b ( v0 );
com.umeng.common.net.c .a ( v0 );
v2 = this.a;
/* .line 409 */
v3 = this.c;
/* .line 408 */
(( com.umeng.common.net.c ) v0 ).a ( v2, v3, v7 ); // invoke-virtual {v0, v2, v3, v7}, Lcom/umeng/common/net/c;->a(Ljava/lang/String;Ljava/lang/String;I)V
/* .line 411 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 412 */
final String v2 = "filename"; // const-string v2, "filename"
(( android.os.Bundle ) v0 ).putString ( v2, p2 ); // invoke-virtual {v0, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 416 */
v2 = this.a;
final String v3 = "delta_update"; // const-string v3, "delta_update"
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* .line 417 */
	 android.os.Message .obtain ( );
	 /* .line 418 */
	 int v3 = 6; // const/4 v3, 0x6
	 /* iput v3, v2, Landroid/os/Message;->what:I */
	 /* .line 419 */
	 /* iput v5, v2, Landroid/os/Message;->arg1:I */
	 /* .line 420 */
	 this.obj = v1;
	 /* .line 421 */
	 /* iput p1, v2, Landroid/os/Message;->arg2:I */
	 /* .line 422 */
	 (( android.os.Message ) v2 ).setData ( v0 ); // invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
	 /* .line 423 */
	 v0 = this.a;
	 com.umeng.common.net.DownloadingService .d ( v0 );
	 (( android.os.Handler ) v0 ).sendMessage ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
	 /* .line 454 */
} // :cond_0
} // :goto_0
return;
/* .line 426 */
} // :cond_1
android.os.Message .obtain ( );
/* .line 427 */
/* iput v6, v2, Landroid/os/Message;->what:I */
/* .line 428 */
/* iput v5, v2, Landroid/os/Message;->arg1:I */
/* .line 429 */
this.obj = v1;
/* .line 430 */
/* iput p1, v2, Landroid/os/Message;->arg2:I */
/* .line 431 */
(( android.os.Message ) v2 ).setData ( v0 ); // invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
/* .line 432 */
v3 = this.a;
com.umeng.common.net.DownloadingService .d ( v3 );
(( android.os.Handler ) v3 ).sendMessage ( v2 ); // invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 437 */
android.os.Message .obtain ( );
/* .line 438 */
/* iput v6, v2, Landroid/os/Message;->what:I */
/* .line 439 */
/* iput v5, v2, Landroid/os/Message;->arg1:I */
/* .line 440 */
/* iput p1, v2, Landroid/os/Message;->arg2:I */
/* .line 441 */
(( android.os.Message ) v2 ).setData ( v0 ); // invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
/* .line 444 */
try { // :try_start_0
com.umeng.common.net.DownloadingService .b ( );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 445 */
com.umeng.common.net.DownloadingService .b ( );
/* check-cast v0, Landroid/os/Messenger; */
(( android.os.Messenger ) v0 ).send ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
/* .line 447 */
} // :cond_2
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.a;
com.umeng.common.net.DownloadingService .b ( v1 );
com.umeng.common.net.DownloadingService .c ( );
com.umeng.common.net.DownloadingService .b ( );
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, p1 ); // invoke-virtual {v0, v1, v2, v3, p1}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* :try_end_0 */
/* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 448 */
/* :catch_0 */
/* move-exception v0 */
/* .line 449 */
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.a;
com.umeng.common.net.DownloadingService .b ( v1 );
com.umeng.common.net.DownloadingService .c ( );
com.umeng.common.net.DownloadingService .b ( );
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, p1 ); // invoke-virtual {v0, v1, v2, v3, p1}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
} // .end method
