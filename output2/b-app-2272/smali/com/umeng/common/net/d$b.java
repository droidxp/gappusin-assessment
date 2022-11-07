class com.umeng.common.net.d$b extends android.os.AsyncTask {
	 /* .source "DownloadTool.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/d; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "b" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Void;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
public Integer a;
public java.lang.String b;
final com.umeng.common.net.d c; //synthetic
private com.umeng.common.net.a$a d;
private android.content.Context e;
private android.app.NotificationManager f;
private android.util.SparseArray g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray", */
/* "<", */
/* "Lcom/umeng/common/net/d$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.Map h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Lcom/umeng/common/net/a$a;", */
/* "Landroid/os/Messenger;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.umeng.common.net.d$b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "I", */
/* "Lcom/umeng/common/net/a$a;", */
/* "Ljava/lang/String;", */
/* "Landroid/util/SparseArray", */
/* "<", */
/* "Lcom/umeng/common/net/d$a;", */
/* ">;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Lcom/umeng/common/net/a$a;", */
/* "Landroid/os/Messenger;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 451 */
this.c = p1;
/* .line 452 */
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
/* .line 453 */
(( android.content.Context ) p2 ).getApplicationContext ( ); // invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.e = v0;
/* .line 454 */
v0 = this.e;
final String v1 = "notification"; // const-string v1, "notification"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/NotificationManager; */
this.f = v0;
/* .line 455 */
/* iput p3, p0, Lcom/umeng/common/net/d$b;->a:I */
/* .line 456 */
this.d = p4;
/* .line 457 */
this.b = p5;
/* .line 458 */
this.g = p6;
/* .line 459 */
this.h = p7;
/* .line 460 */
return;
} // .end method
/* # virtual methods */
protected java.lang.Integer a ( java.lang.String...p0 ) {
/* .locals 6 */
/* .prologue */
int v5 = 2; // const/4 v5, 0x2
int v4 = 0; // const/4 v4, 0x0
int v3 = 1; // const/4 v3, 0x1
/* .line 470 */
/* .line 471 */
/* aget-object v0, p1, v4 */
/* aget-object v1, p1, v3 */
/* aget-object v2, p1, v5 */
v0 = com.umeng.common.util.DeltaUpdate .a ( v0,v1,v2 );
/* add-int/lit8 v0, v0, 0x1 */
/* .line 472 */
/* new-instance v1, Ljava/io/File; */
/* aget-object v2, p1, v5 */
/* invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 473 */
(( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
/* .line 474 */
/* if-ne v0, v3, :cond_1 */
/* .line 475 */
/* new-instance v1, Ljava/io/File; */
/* aget-object v2, p1, v3 */
/* invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
com.umeng.common.util.h .a ( v1 );
/* .line 476 */
v2 = this.d;
v2 = this.e;
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* .line 477 */
com.umeng.common.net.d .a ( );
final String v1 = "file patch error"; // const-string v1, "file patch error"
com.umeng.common.Log .a ( v0,v1 );
/* .line 479 */
java.lang.Integer .valueOf ( v4 );
/* .line 485 */
} // :goto_0
/* .line 481 */
} // :cond_0
com.umeng.common.net.d .a ( );
final String v2 = "file patch success"; // const-string v2, "file patch success"
com.umeng.common.Log .a ( v1,v2 );
/* .line 485 */
} // :goto_1
java.lang.Integer .valueOf ( v0 );
/* .line 483 */
} // :cond_1
com.umeng.common.net.d .a ( );
final String v2 = "file patch error"; // const-string v2, "file patch error"
com.umeng.common.Log .a ( v1,v2 );
} // .end method
protected void a ( java.lang.Integer p0 ) {
/* .locals 9 */
/* .prologue */
int v8 = 5; // const/4 v8, 0x5
int v7 = 1; // const/4 v7, 0x1
/* .line 491 */
v0 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
/* if-ne v0, v7, :cond_2 */
/* .line 492 */
/* new-instance v0, Landroid/app/Notification; */
/* .line 493 */
/* const v1, 0x1080082 */
/* .line 494 */
v2 = this.e;
/* .line 495 */
v3 = this.e;
v3 = com.umeng.common.a.c .k ( v3 );
/* .line 494 */
(( android.content.Context ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
/* .line 496 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* .line 492 */
/* invoke-direct {v0, v1, v2, v3, v4}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V */
/* .line 497 */
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 498 */
/* const/high16 v2, 0x10000000 */
(( android.content.Intent ) v1 ).addFlags ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 499 */
/* new-instance v2, Ljava/io/File; */
v3 = this.b;
/* invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
android.net.Uri .fromFile ( v2 );
/* .line 500 */
final String v3 = "application/vnd.android.package-archive"; // const-string v3, "application/vnd.android.package-archive"
/* .line 499 */
(( android.content.Intent ) v1 ).setDataAndType ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
/* .line 502 */
v2 = this.e;
int v3 = 0; // const/4 v3, 0x0
/* const/high16 v4, 0x8000000 */
/* .line 501 */
android.app.PendingIntent .getActivity ( v2,v3,v1,v4 );
/* .line 504 */
v3 = this.e;
/* .line 505 */
v4 = this.e;
com.umeng.common.b .w ( v4 );
v5 = this.e;
/* .line 507 */
v6 = this.e;
v6 = com.umeng.common.a.c .k ( v6 );
/* .line 506 */
(( android.content.Context ) v5 ).getString ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;
/* .line 504 */
(( android.app.Notification ) v0 ).setLatestEventInfo ( v3, v4, v5, v2 ); // invoke-virtual {v0, v3, v4, v5, v2}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
/* .line 509 */
/* const/16 v2, 0x10 */
/* iput v2, v0, Landroid/app/Notification;->flags:I */
/* .line 510 */
v2 = this.f;
/* iget v3, p0, Lcom/umeng/common/net/d$b;->a:I */
/* add-int/lit8 v3, v3, 0x1 */
(( android.app.NotificationManager ) v2 ).notify ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
/* .line 511 */
v0 = this.c;
v2 = this.e;
v0 = (( com.umeng.common.net.d ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;)Z
/* .line 512 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 513 */
v0 = this.f;
/* iget v2, p0, Lcom/umeng/common/net/d$b;->a:I */
/* add-int/lit8 v2, v2, 0x1 */
(( android.app.NotificationManager ) v0 ).cancel ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
/* .line 514 */
v0 = this.e;
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 516 */
} // :cond_0
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 517 */
final String v1 = "filename"; // const-string v1, "filename"
/* .line 518 */
v2 = this.b;
/* .line 517 */
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 520 */
android.os.Message .obtain ( );
/* .line 521 */
/* iput v8, v1, Landroid/os/Message;->what:I */
/* .line 522 */
/* iput v7, v1, Landroid/os/Message;->arg1:I */
/* .line 523 */
/* iget v2, p0, Lcom/umeng/common/net/d$b;->a:I */
/* iput v2, v1, Landroid/os/Message;->arg2:I */
/* .line 524 */
(( android.os.Message ) v1 ).setData ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
/* .line 527 */
try { // :try_start_0
v0 = this.h;
v2 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 528 */
v0 = this.h;
v2 = this.d;
/* check-cast v0, Landroid/os/Messenger; */
(( android.os.Messenger ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
/* .line 530 */
} // :cond_1
v0 = this.c;
v1 = this.e;
v2 = this.g;
v3 = this.h;
/* iget v4, p0, Lcom/umeng/common/net/d$b;->a:I */
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* :try_end_0 */
/* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 556 */
} // :goto_0
return;
/* .line 531 */
/* :catch_0 */
/* move-exception v0 */
/* .line 532 */
v0 = this.c;
v1 = this.e;
v2 = this.g;
v3 = this.h;
/* iget v4, p0, Lcom/umeng/common/net/d$b;->a:I */
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* .line 536 */
} // :cond_2
v0 = this.f;
/* iget v1, p0, Lcom/umeng/common/net/d$b;->a:I */
/* add-int/lit8 v1, v1, 0x1 */
(( android.app.NotificationManager ) v0 ).cancel ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
/* .line 537 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 538 */
final String v1 = "filename"; // const-string v1, "filename"
/* .line 539 */
v2 = this.b;
/* .line 538 */
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 541 */
android.os.Message .obtain ( );
/* .line 542 */
/* iput v8, v1, Landroid/os/Message;->what:I */
/* .line 543 */
int v2 = 3; // const/4 v2, 0x3
/* iput v2, v1, Landroid/os/Message;->arg1:I */
/* .line 544 */
/* iget v2, p0, Lcom/umeng/common/net/d$b;->a:I */
/* iput v2, v1, Landroid/os/Message;->arg2:I */
/* .line 545 */
(( android.os.Message ) v1 ).setData ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
/* .line 548 */
try { // :try_start_1
v0 = this.h;
v2 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 549 */
v0 = this.h;
v2 = this.d;
/* check-cast v0, Landroid/os/Messenger; */
(( android.os.Messenger ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
/* .line 551 */
} // :cond_3
v0 = this.c;
v1 = this.e;
v2 = this.g;
v3 = this.h;
/* iget v4, p0, Lcom/umeng/common/net/d$b;->a:I */
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* :try_end_1 */
/* .catch Landroid/os/RemoteException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 552 */
/* :catch_1 */
/* move-exception v0 */
/* .line 553 */
v0 = this.c;
v1 = this.e;
v2 = this.g;
v3 = this.h;
/* iget v4, p0, Lcom/umeng/common/net/d$b;->a:I */
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
} // .end method
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/String; */
(( com.umeng.common.net.d$b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/net/d$b;->a([Ljava/lang/String;)Ljava/lang/Integer;
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, Ljava/lang/Integer; */
(( com.umeng.common.net.d$b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/net/d$b;->a(Ljava/lang/Integer;)V
return;
} // .end method
protected void onPreExecute ( ) {
/* .locals 0 */
/* .prologue */
/* .line 465 */
/* invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V */
/* .line 466 */
return;
} // .end method
