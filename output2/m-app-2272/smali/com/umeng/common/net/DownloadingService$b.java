class com.umeng.common.net.DownloadingService$b extends java.lang.Thread {
	 /* .source "DownloadingService.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/DownloadingService; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "b" */
} // .end annotation
/* # instance fields */
final com.umeng.common.net.DownloadingService a; //synthetic
private android.content.Context b;
private Boolean c;
private java.io.File d;
private Integer e;
private Long f;
private Long g;
private Integer h;
private Integer i;
private com.umeng.common.net.DownloadingService$a j;
private com.umeng.common.net.a$a k;
/* # direct methods */
public com.umeng.common.net.DownloadingService$b ( ) {
/* .locals 5 */
/* .prologue */
/* const-wide/16 v3, -0x1 */
int v2 = 1; // const/4 v2, 0x1
int v0 = 0; // const/4 v0, 0x0
/* .line 538 */
this.a = p1;
/* .line 537 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
/* .line 527 */
/* iput v0, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
/* .line 528 */
/* iput-wide v3, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* .line 529 */
/* iput-wide v3, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
/* .line 530 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/umeng/common/net/DownloadingService$b;->h:I */
/* .line 540 */
try { // :try_start_0
	 this.b = p2;
	 /* .line 541 */
	 this.k = p3;
	 /* .line 542 */
	 /* iput p5, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
	 /* .line 544 */
	 com.umeng.common.net.DownloadingService .c ( );
	 v0 = 	 (( android.util.SparseArray ) v0 ).indexOfKey ( p4 ); // invoke-virtual {v0, p4}, Landroid/util/SparseArray;->indexOfKey(I)I
	 /* if-ltz v0, :cond_0 */
	 /* .line 545 */
	 com.umeng.common.net.DownloadingService .c ( );
	 (( android.util.SparseArray ) v0 ).get ( p4 ); // invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Lcom/umeng/common/net/d$a; */
	 /* .line 546 */
	 v0 = this.f;
	 /* .line 547 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* array-length v1, v0 */
		 /* if-le v1, v2, :cond_0 */
		 /* .line 548 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget-wide v1, v0, v1 */
		 /* iput-wide v1, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
		 /* .line 549 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* aget-wide v0, v0, v1 */
		 /* iput-wide v0, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
		 /* .line 553 */
	 } // :cond_0
	 this.j = p6;
	 /* .line 554 */
	 /* iput p4, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
	 /* .line 556 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [Z */
	 /* .line 557 */
	 final String v1 = "/apk"; // const-string v1, "/apk"
	 com.umeng.common.net.q .a ( v1,p2,v0 );
	 this.d = v1;
	 /* .line 558 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* aget-boolean v0, v0, v1 */
	 /* iput-boolean v0, p0, Lcom/umeng/common/net/DownloadingService$b;->c:Z */
	 /* .line 559 */
	 /* iget-boolean v0, p0, Lcom/umeng/common/net/DownloadingService$b;->c:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* const-wide/32 v0, 0x6400000 */
		 /* .line 560 */
	 } // :goto_0
	 v2 = this.d;
	 /* const-wide/32 v3, 0xf731400 */
	 com.umeng.common.net.q .a ( v2,v0,v1,v3,v4 );
	 /* .line 561 */
	 v0 = this.k;
	 /* invoke-direct {p0, v0}, Lcom/umeng/common/net/DownloadingService$b;->a(Lcom/umeng/common/net/a$a;)Ljava/lang/String; */
	 /* .line 562 */
	 /* new-instance v1, Ljava/io/File; */
	 v2 = this.d;
	 /* invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 this.d = v1;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 569 */
} // :goto_1
return;
/* .line 559 */
} // :cond_1
/* const-wide/32 v0, 0xa00000 */
/* .line 565 */
/* :catch_0 */
/* move-exception v0 */
/* .line 566 */
com.umeng.common.net.DownloadingService .a ( );
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.umeng.common.Log .c ( v1,v2,v0 );
/* .line 567 */
v1 = this.j;
/* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
} // .end method
static android.content.Context a ( com.umeng.common.net.DownloadingService$b p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 524 */
v0 = this.b;
} // .end method
private java.lang.String a ( com.umeng.common.net.a$a p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 806 */
v0 = this.k;
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 807 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = this.k;
v1 = this.e;
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = ".apk.tmp"; // const-string v1, ".apk.tmp"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 811 */
} // :goto_0
v1 = this.k;
v1 = this.a;
final String v2 = "delta_update"; // const-string v2, "delta_update"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 812 */
final String v1 = ".apk"; // const-string v1, ".apk"
final String v2 = ".patch"; // const-string v2, ".patch"
(( java.lang.String ) v0 ).replace ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 814 */
} // :cond_0
/* .line 809 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = this.k;
v1 = this.c;
com.umeng.common.util.h .a ( v1 );
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = ".apk.tmp"; // const-string v1, ".apk.tmp"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
private java.net.HttpURLConnection a ( java.net.URL p0, java.io.File p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 791 */
(( java.net.URL ) p1 ).openConnection ( ); // invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* .line 792 */
final String v1 = "GET"; // const-string v1, "GET"
(( java.net.HttpURLConnection ) v0 ).setRequestMethod ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 793 */
final String v1 = "Accept-Encoding"; // const-string v1, "Accept-Encoding"
final String v2 = "identity"; // const-string v2, "identity"
(( java.net.HttpURLConnection ) v0 ).setRequestProperty ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 794 */
final String v1 = "Connection"; // const-string v1, "Connection"
final String v2 = "keep-alive"; // const-string v2, "keep-alive"
(( java.net.HttpURLConnection ) v0 ).addRequestProperty ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 795 */
/* const/16 v1, 0x1388 */
(( java.net.HttpURLConnection ) v0 ).setConnectTimeout ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
/* .line 796 */
/* const/16 v1, 0x2710 */
(( java.net.HttpURLConnection ) v0 ).setReadTimeout ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
/* .line 797 */
v1 = (( java.io.File ) p2 ).exists ( ); // invoke-virtual {p2}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_0
(( java.io.File ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/io/File;->length()J
/* move-result-wide v1 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v1, v1, v3 */
/* if-lez v1, :cond_0 */
/* .line 799 */
final String v1 = "Range"; // const-string v1, "Range"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "bytes="; // const-string v3, "bytes="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.io.File ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/io/File;->length()J
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v3 = "-"; // const-string v3, "-"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.net.HttpURLConnection ) v0 ).setRequestProperty ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 801 */
} // :cond_0
} // .end method
private void a ( ) {
/* .locals 5 */
/* .prologue */
/* .line 744 */
com.umeng.common.net.DownloadingService .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "wait for repeating Test network repeat count="; // const-string v2, "wait for repeating Test network repeat count="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v0,v1 );
/* .line 746 */
try { // :try_start_0
v0 = this.k;
/* iget-boolean v0, v0, Lcom/umeng/common/net/a$a;->g:Z */
/* if-nez v0, :cond_1 */
/* .line 747 */
/* const-wide/16 v0, 0x1f40 */
java.lang.Thread .sleep ( v0,v1 );
/* .line 748 */
/* iget-wide v0, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
/* const-wide/16 v2, 0x1 */
/* cmp-long v0, v0, v2 */
/* if-gez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lcom/umeng/common/net/DownloadingService$b;->a(Z)V */
/* .line 772 */
} // :goto_0
return;
/* .line 750 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lcom/umeng/common/net/DownloadingService$b;->a(Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 768 */
/* :catch_0 */
/* move-exception v0 */
/* .line 769 */
/* invoke-direct {p0, v0}, Lcom/umeng/common/net/DownloadingService$b;->a(Ljava/lang/Exception;)V */
/* .line 770 */
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.b;
com.umeng.common.net.DownloadingService .c ( );
com.umeng.common.net.DownloadingService .b ( );
/* iget v4, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* .line 753 */
} // :cond_1
try { // :try_start_1
com.umeng.common.net.DownloadingService .c ( );
/* iget v1, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( android.util.SparseArray ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/common/net/d$a; */
/* .line 754 */
v1 = this.f;
int v2 = 0; // const/4 v2, 0x0
/* iget-wide v3, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* aput-wide v3, v1, v2 */
/* .line 755 */
v1 = this.f;
int v2 = 1; // const/4 v2, 0x1
/* iget-wide v3, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
/* aput-wide v3, v1, v2 */
/* .line 756 */
v0 = this.f;
int v1 = 2; // const/4 v1, 0x2
/* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
/* int-to-long v2, v2 */
/* aput-wide v2, v0, v1 */
/* .line 759 */
/* iget v0, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
/* .line 760 */
final String v1 = "continue"; // const-string v1, "continue"
/* .line 759 */
com.umeng.common.net.m .a ( v0,v1 );
/* .line 761 */
/* new-instance v1, Landroid/content/Intent; */
v2 = this.b;
/* const-class v3, Lcom/umeng/common/net/DownloadingService; */
/* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 762 */
final String v2 = "com.umeng.broadcast.download.msg"; // const-string v2, "com.umeng.broadcast.download.msg"
(( android.content.Intent ) v1 ).putExtra ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 763 */
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v2 = this.a;
com.umeng.common.net.DownloadingService .c ( );
com.umeng.common.net.DownloadingService .b ( );
(( com.umeng.common.net.d ) v0 ).a ( v2, v3, v4, v1 ); // invoke-virtual {v0, v2, v3, v4, v1}, Lcom/umeng/common/net/d;->a(Lcom/umeng/common/net/DownloadingService;Landroid/util/SparseArray;Ljava/util/Map;Landroid/content/Intent;)Z
/* .line 765 */
v0 = this.a;
v1 = this.b;
v2 = this.b;
v2 = com.umeng.common.a.c .c ( v2 );
(( android.content.Context ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
com.umeng.common.net.DownloadingService .a ( v0,v1 );
/* .line 766 */
com.umeng.common.net.DownloadingService .a ( );
final String v1 = "changed play state button on op-notification."; // const-string v1, "changed play state button on op-notification."
com.umeng.common.Log .c ( v0,v1 );
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_0 */
} // .end method
private void a ( java.io.File p0, java.lang.String p1 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
/* .prologue */
int v2 = 5; // const/4 v2, 0x5
int v5 = 0; // const/4 v5, 0x0
/* .line 838 */
v0 = this.k;
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.k;
v0 = this.d;
com.umeng.common.util.h .a ( p1 );
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
/* .line 839 */
v0 = this.k;
v0 = this.a;
final String v1 = "delta_update"; // const-string v1, "delta_update"
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 840 */
v0 = this.a;
com.umeng.common.net.DownloadingService .c ( v0 );
/* iget v1, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( android.app.NotificationManager ) v0 ).cancel ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
/* .line 841 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 842 */
final String v1 = "filename"; // const-string v1, "filename"
(( android.os.Bundle ) v0 ).putString ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 844 */
android.os.Message .obtain ( );
/* .line 845 */
/* iput v2, v1, Landroid/os/Message;->what:I */
/* .line 846 */
int v2 = 3; // const/4 v2, 0x3
/* iput v2, v1, Landroid/os/Message;->arg1:I */
/* .line 847 */
/* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
/* iput v2, v1, Landroid/os/Message;->arg2:I */
/* .line 848 */
(( android.os.Message ) v1 ).setData ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
/* .line 851 */
try { // :try_start_0
com.umeng.common.net.DownloadingService .b ( );
v2 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 852 */
com.umeng.common.net.DownloadingService .b ( );
v2 = this.k;
/* check-cast v0, Landroid/os/Messenger; */
(( android.os.Messenger ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
/* .line 854 */
} // :cond_0
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.b;
com.umeng.common.net.DownloadingService .c ( );
com.umeng.common.net.DownloadingService .b ( );
/* iget v4, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* :try_end_0 */
/* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 876 */
} // :cond_1
} // :goto_0
return;
/* .line 855 */
/* :catch_0 */
/* move-exception v0 */
/* .line 856 */
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.b;
com.umeng.common.net.DownloadingService .c ( );
com.umeng.common.net.DownloadingService .b ( );
/* iget v4, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* .line 860 */
} // :cond_2
com.umeng.common.net.DownloadingService .b ( );
v1 = this.k;
/* check-cast v0, Landroid/os/Messenger; */
/* .line 861 */
int v1 = 0; // const/4 v1, 0x0
android.os.Message .obtain ( v1,v2,v5,v5 );
/* .line 860 */
(( android.os.Messenger ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
/* .line 862 */
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.b;
com.umeng.common.net.DownloadingService .c ( );
com.umeng.common.net.DownloadingService .b ( );
/* iget v4, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* .line 863 */
/* new-instance v0, Landroid/app/Notification; */
/* .line 864 */
/* const v1, 0x1080082 */
/* .line 865 */
v2 = this.b;
v3 = this.b;
v3 = com.umeng.common.a.c .h ( v3 );
(( android.content.Context ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
/* .line 866 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* .line 863 */
/* invoke-direct {v0, v1, v2, v3, v4}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V */
/* .line 869 */
v1 = this.b;
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
/* .line 868 */
android.app.PendingIntent .getActivity ( v1,v5,v2,v5 );
/* .line 870 */
v2 = this.b;
/* .line 871 */
v3 = this.b;
com.umeng.common.b .w ( v3 );
/* .line 872 */
/* new-instance v4, Ljava/lang/StringBuilder; */
v5 = this.k;
v5 = this.b;
java.lang.String .valueOf ( v5 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v5 = this.b;
v6 = this.b;
v6 = com.umeng.common.a.c .h ( v6 );
(( android.content.Context ) v5 ).getString ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 870 */
(( android.app.Notification ) v0 ).setLatestEventInfo ( v2, v3, v4, v1 ); // invoke-virtual {v0, v2, v3, v4, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
/* .line 873 */
/* iget v1, v0, Landroid/app/Notification;->flags:I */
/* or-int/lit8 v1, v1, 0x10 */
/* iput v1, v0, Landroid/app/Notification;->flags:I */
/* .line 874 */
v1 = this.a;
com.umeng.common.net.DownloadingService .c ( v1 );
/* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( android.app.NotificationManager ) v1 ).notify ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
/* goto/16 :goto_0 */
} // .end method
private void a ( java.lang.Exception p0 ) {
/* .locals 8 */
/* .prologue */
/* .line 879 */
com.umeng.common.net.DownloadingService .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "can not install."; // const-string v2, "can not install."
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .b ( v0,v1 );
/* .line 880 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.j;
/* iget v1, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
/* .line 883 */
} // :cond_0
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.k;
/* iget-wide v2, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* iget-wide v4, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
/* iget v6, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
/* int-to-long v6, v6 */
/* invoke-virtual/range {v0 ..v7}, Lcom/umeng/common/net/d;->a(Lcom/umeng/common/net/a$a;JJJ)V */
/* .line 884 */
return;
} // .end method
private void a ( Boolean p0 ) {
/* .locals 14 */
/* .prologue */
int v13 = 3; // const/4 v13, 0x3
int v12 = 2; // const/4 v12, 0x2
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
int v0 = 0; // const/4 v0, 0x0
/* .line 602 */
v1 = this.d;
(( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
/* .line 606 */
try { // :try_start_0
/* new-instance v1, Ljava/io/FileOutputStream; */
v5 = this.d;
int v6 = 1; // const/4 v6, 0x1
/* invoke-direct {v1, v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1f */
/* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_f */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_8 */
/* .line 607 */
try { // :try_start_1
/* iget-boolean v5, p0, Lcom/umeng/common/net/DownloadingService$b;->c:Z */
/* if-nez v5, :cond_1a */
/* .line 609 */
v5 = this.d;
(( java.io.File ) v5 ).getAbsolutePath ( ); // invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
int v6 = 3; // const/4 v6, 0x3
/* .line 608 */
v5 = com.umeng.common.net.q .a ( v5,v6 );
/* .line 610 */
/* if-nez v5, :cond_1a */
/* .line 611 */
(( java.io.FileOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
/* .line 612 */
v5 = this.b;
/* .line 613 */
/* const v6, 0x8003 */
/* .line 612 */
(( android.content.Context ) v5 ).openFileOutput ( v4, v6 ); // invoke-virtual {v5, v4, v6}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_20 */
/* .catch Landroid/os/RemoteException; {:try_start_1 ..:try_end_1} :catch_1b */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_9 */
/* .line 616 */
try { // :try_start_2
v5 = this.b;
(( android.content.Context ) v5 ).getFileStreamPath ( v4 ); // invoke-virtual {v5, v4}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.d = v4;
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_21 */
/* .catch Landroid/os/RemoteException; {:try_start_2 ..:try_end_2} :catch_1c */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_a */
/* move-object v8, v1 */
/* .line 619 */
} // :goto_0
try { // :try_start_3
com.umeng.common.net.DownloadingService .a ( );
final String v4 = "saveAPK: url = %1$15s\t|\tfilename = %2$15s"; // const-string v4, "saveAPK: url = %1$15s\t|\tfilename = %2$15s"
int v5 = 2; // const/4 v5, 0x2
/* new-array v5, v5, [Ljava/lang/Object; */
int v6 = 0; // const/4 v6, 0x0
/* .line 620 */
v7 = this.k;
v7 = this.c;
/* aput-object v7, v5, v6 */
int v6 = 1; // const/4 v6, 0x1
v7 = this.d;
(( java.io.File ) v7 ).getAbsolutePath ( ); // invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* aput-object v7, v5, v6 */
/* .line 619 */
java.lang.String .format ( v4,v5 );
com.umeng.common.Log .c ( v1,v4 );
/* .line 622 */
/* new-instance v1, Ljava/net/URL; */
v4 = this.k;
v4 = this.c;
/* invoke-direct {v1, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 623 */
v4 = this.d;
/* invoke-direct {p0, v1, v4}, Lcom/umeng/common/net/DownloadingService$b;->a(Ljava/net/URL;Ljava/io/File;)Ljava/net/HttpURLConnection; */
/* .line 624 */
(( java.net.HttpURLConnection ) v1 ).connect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V
/* .line 625 */
(( java.net.HttpURLConnection ) v1 ).getInputStream ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_22 */
/* .catch Landroid/os/RemoteException; {:try_start_3 ..:try_end_3} :catch_1d */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_b */
/* .line 627 */
/* if-nez p1, :cond_0 */
/* .line 628 */
/* const-wide/16 v4, 0x0 */
try { // :try_start_4
/* iput-wide v4, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* .line 629 */
v1 = (( java.net.HttpURLConnection ) v1 ).getContentLength ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getContentLength()I
/* int-to-long v1, v1 */
/* iput-wide v1, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
/* .line 630 */
com.umeng.common.net.DownloadingService .a ( );
final String v2 = "getContentLength: %1$15s"; // const-string v2, "getContentLength: %1$15s"
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/Object; */
int v5 = 0; // const/4 v5, 0x0
/* iget-wide v6, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
java.lang.Long .valueOf ( v6,v7 );
/* aput-object v6, v4, v5 */
java.lang.String .format ( v2,v4 );
com.umeng.common.Log .c ( v1,v2 );
/* .line 633 */
} // :cond_0
/* const/16 v1, 0x1000 */
/* new-array v4, v1, [B */
/* .line 635 */
/* const/16 v5, 0x32 */
/* .line 638 */
com.umeng.common.net.DownloadingService .a ( );
/* .line 639 */
/* new-instance v2, Ljava/lang/StringBuilder; */
v6 = this.k;
v6 = this.b;
java.lang.String .valueOf ( v6 );
/* invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = "saveAPK getContentLength "; // const-string v6, "saveAPK getContentLength "
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 640 */
/* iget-wide v6, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
java.lang.String .valueOf ( v6,v7 );
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 639 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 638 */
com.umeng.common.Log .c ( v1,v2 );
/* .line 642 */
v1 = this.b;
com.umeng.common.net.c .a ( v1 );
v2 = this.k;
v2 = this.a;
/* .line 643 */
v6 = this.k;
v6 = this.c;
/* .line 642 */
(( com.umeng.common.net.c ) v1 ).a ( v2, v6 ); // invoke-virtual {v1, v2, v6}, Lcom/umeng/common/net/c;->a(Ljava/lang/String;Ljava/lang/String;)Z
/* move v1, v0 */
/* .line 645 */
} // :goto_1
/* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->h:I */
/* if-gez v2, :cond_1 */
v2 = (( java.io.InputStream ) v9 ).read ( v4 ); // invoke-virtual {v9, v4}, Ljava/io/InputStream;->read([B)I
/* if-gtz v2, :cond_5 */
} // :cond_1
/* move v0, v3 */
/* .line 665 */
} // :cond_2
(( java.io.InputStream ) v9 ).close ( ); // invoke-virtual {v9}, Ljava/io/InputStream;->close()V
/* .line 666 */
(( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
/* .line 668 */
/* iget v1, p0, Lcom/umeng/common/net/DownloadingService$b;->h:I */
/* if-ne v1, v3, :cond_a */
/* .line 670 */
com.umeng.common.net.DownloadingService .c ( );
/* iget v1, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( android.util.SparseArray ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/common/net/d$a; */
/* .line 671 */
v1 = this.f;
int v2 = 0; // const/4 v2, 0x0
/* iget-wide v3, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* aput-wide v3, v1, v2 */
/* .line 672 */
v1 = this.f;
int v2 = 1; // const/4 v2, 0x1
/* iget-wide v3, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
/* aput-wide v3, v1, v2 */
/* .line 673 */
v0 = this.f;
int v1 = 2; // const/4 v1, 0x2
/* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
/* int-to-long v2, v2 */
/* aput-wide v2, v0, v1 */
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_9 */
/* .catch Landroid/os/RemoteException; {:try_start_4 ..:try_end_4} :catch_1e */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_c */
/* .line 729 */
if ( v9 != null) { // if-eqz v9, :cond_3
try { // :try_start_5
(( java.io.InputStream ) v9 ).close ( ); // invoke-virtual {v9}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_0 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 734 */
} // :cond_3
if ( v8 != null) { // if-eqz v8, :cond_4
try { // :try_start_6
(( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_3 */
/* .line 740 */
} // :cond_4
} // :goto_2
return;
/* .line 646 */
} // :cond_5
int v6 = 0; // const/4 v6, 0x0
try { // :try_start_7
(( java.io.FileOutputStream ) v8 ).write ( v4, v6, v2 ); // invoke-virtual {v8, v4, v6, v2}, Ljava/io/FileOutputStream;->write([BII)V
/* .line 647 */
/* iget-wide v6, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* int-to-long v10, v2 */
/* add-long/2addr v6, v10 */
/* iput-wide v6, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* .line 648 */
/* add-int/lit8 v2, v1, 0x1 */
/* rem-int/2addr v1, v5 */
/* if-nez v1, :cond_8 */
/* .line 649 */
v1 = this.b;
v1 = com.umeng.common.b .n ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 654 */
/* iget-wide v6, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* long-to-float v1, v6 */
/* const/high16 v6, 0x42c80000 # 100.0f */
/* mul-float/2addr v1, v6 */
/* iget-wide v6, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
/* long-to-float v6, v6 */
/* div-float/2addr v1, v6 */
/* float-to-int v1, v1 */
/* .line 655 */
/* const/16 v6, 0x64 */
/* if-le v1, v6, :cond_6 */
/* const/16 v1, 0x63 */
/* .line 657 */
} // :cond_6
v6 = this.j;
if ( v6 != null) { // if-eqz v6, :cond_7
v6 = this.j;
/* iget v7, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
/* .line 659 */
} // :cond_7
/* invoke-direct {p0, v1}, Lcom/umeng/common/net/DownloadingService$b;->b(I)V */
/* .line 661 */
v6 = this.b;
com.umeng.common.net.c .a ( v6 );
/* .line 662 */
v7 = this.k;
v7 = this.a;
v10 = this.k;
v10 = this.c;
/* .line 661 */
(( com.umeng.common.net.c ) v6 ).a ( v7, v10, v1 ); // invoke-virtual {v6, v7, v10, v1}, Lcom/umeng/common/net/c;->a(Ljava/lang/String;Ljava/lang/String;I)V
/* :try_end_7 */
/* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_9 */
/* .catch Landroid/os/RemoteException; {:try_start_7 ..:try_end_7} :catch_1e */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_c */
} // :cond_8
/* move v1, v2 */
/* goto/16 :goto_1 */
/* .line 730 */
/* :catch_0 */
/* move-exception v0 */
/* .line 731 */
try { // :try_start_8
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* .line 734 */
if ( v8 != null) { // if-eqz v8, :cond_4
try { // :try_start_9
(( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_1 */
/* .line 735 */
/* :catch_1 */
/* move-exception v0 */
/* .line 736 */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* .line 732 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 734 */
if ( v8 != null) { // if-eqz v8, :cond_9
try { // :try_start_a
(( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
/* :try_end_a */
/* .catch Ljava/io/IOException; {:try_start_a ..:try_end_a} :catch_2 */
/* .line 738 */
} // :cond_9
} // :goto_3
/* throw v0 */
/* .line 735 */
/* :catch_2 */
/* move-exception v1 */
/* .line 736 */
(( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
/* .line 735 */
/* :catch_3 */
/* move-exception v0 */
/* .line 736 */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* .line 675 */
} // :cond_a
try { // :try_start_b
/* iget v1, p0, Lcom/umeng/common/net/DownloadingService$b;->h:I */
/* if-ne v1, v12, :cond_d */
/* .line 677 */
v0 = this.a;
com.umeng.common.net.DownloadingService .a ( v0 );
v1 = this.k;
/* iget-wide v2, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
/* iget-wide v4, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
/* iget v6, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
/* int-to-long v6, v6 */
/* invoke-virtual/range {v0 ..v7}, Lcom/umeng/common/net/d;->a(Lcom/umeng/common/net/a$a;JJJ)V */
/* .line 678 */
v0 = this.a;
com.umeng.common.net.DownloadingService .c ( v0 );
/* iget v1, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
(( android.app.NotificationManager ) v0 ).cancel ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
/* :try_end_b */
/* .catch Ljava/io/IOException; {:try_start_b ..:try_end_b} :catch_9 */
/* .catch Landroid/os/RemoteException; {:try_start_b ..:try_end_b} :catch_1e */
/* .catchall {:try_start_b ..:try_end_b} :catchall_c */
/* .line 729 */
if ( v9 != null) { // if-eqz v9, :cond_b
try { // :try_start_c
(( java.io.InputStream ) v9 ).close ( ); // invoke-virtual {v9}, Ljava/io/InputStream;->close()V
/* :try_end_c */
/* .catch Ljava/io/IOException; {:try_start_c ..:try_end_c} :catch_5 */
/* .catchall {:try_start_c ..:try_end_c} :catchall_1 */
/* .line 734 */
} // :cond_b
if ( v8 != null) { // if-eqz v8, :cond_4
try { // :try_start_d
	 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
	 /* :try_end_d */
	 /* .catch Ljava/io/IOException; {:try_start_d ..:try_end_d} :catch_4 */
	 /* goto/16 :goto_2 */
	 /* .line 735 */
	 /* :catch_4 */
	 /* move-exception v0 */
	 /* .line 736 */
	 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
	 /* goto/16 :goto_2 */
	 /* .line 730 */
	 /* :catch_5 */
	 /* move-exception v0 */
	 /* .line 731 */
	 try { // :try_start_e
		 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
		 /* :try_end_e */
		 /* .catchall {:try_start_e ..:try_end_e} :catchall_1 */
		 /* .line 734 */
		 if ( v8 != null) { // if-eqz v8, :cond_4
			 try { // :try_start_f
				 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
				 /* :try_end_f */
				 /* .catch Ljava/io/IOException; {:try_start_f ..:try_end_f} :catch_6 */
				 /* goto/16 :goto_2 */
				 /* .line 735 */
				 /* :catch_6 */
				 /* move-exception v0 */
				 /* .line 736 */
				 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
				 /* goto/16 :goto_2 */
				 /* .line 732 */
				 /* :catchall_1 */
				 /* move-exception v0 */
				 /* .line 734 */
				 if ( v8 != null) { // if-eqz v8, :cond_c
					 try { // :try_start_10
						 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
						 /* :try_end_10 */
						 /* .catch Ljava/io/IOException; {:try_start_10 ..:try_end_10} :catch_7 */
						 /* .line 738 */
					 } // :cond_c
				 } // :goto_4
				 /* throw v0 */
				 /* .line 735 */
				 /* :catch_7 */
				 /* move-exception v1 */
				 /* .line 736 */
				 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
				 /* .line 682 */
			 } // :cond_d
			 /* if-nez v0, :cond_10 */
			 /* .line 683 */
			 try { // :try_start_11
				 com.umeng.common.net.DownloadingService .a ( );
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "Download Fail repeat count="; // const-string v2, "Download Fail repeat count="
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 /* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.umeng.common.Log .b ( v0,v1 );
				 /* .line 684 */
				 com.umeng.common.net.DownloadingService .b ( );
				 v1 = this.k;
				 /* check-cast v0, Landroid/os/Messenger; */
				 /* .line 685 */
				 int v1 = 0; // const/4 v1, 0x0
				 int v2 = 5; // const/4 v2, 0x5
				 int v3 = 0; // const/4 v3, 0x0
				 int v4 = 0; // const/4 v4, 0x0
				 android.os.Message .obtain ( v1,v2,v3,v4 );
				 /* .line 684 */
				 (( android.os.Messenger ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
				 /* .line 686 */
				 v0 = this.a;
				 com.umeng.common.net.DownloadingService .a ( v0 );
				 v1 = this.b;
				 com.umeng.common.net.DownloadingService .c ( );
				 com.umeng.common.net.DownloadingService .b ( );
				 /* iget v4, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
				 (( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
				 /* .line 687 */
				 v0 = this.j;
				 if ( v0 != null) { // if-eqz v0, :cond_e
					 v0 = this.j;
					 /* iget v1, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
					 int v2 = 0; // const/4 v2, 0x0
					 /* :try_end_11 */
					 /* .catch Ljava/io/IOException; {:try_start_11 ..:try_end_11} :catch_9 */
					 /* .catch Landroid/os/RemoteException; {:try_start_11 ..:try_end_11} :catch_1e */
					 /* .catchall {:try_start_11 ..:try_end_11} :catchall_c */
					 /* .line 729 */
				 } // :cond_e
			 } // :goto_5
			 if ( v9 != null) { // if-eqz v9, :cond_f
				 try { // :try_start_12
					 (( java.io.InputStream ) v9 ).close ( ); // invoke-virtual {v9}, Ljava/io/InputStream;->close()V
					 /* :try_end_12 */
					 /* .catch Ljava/io/IOException; {:try_start_12 ..:try_end_12} :catch_18 */
					 /* .catchall {:try_start_12 ..:try_end_12} :catchall_7 */
					 /* .line 734 */
				 } // :cond_f
				 if ( v8 != null) { // if-eqz v8, :cond_4
					 try { // :try_start_13
						 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
						 /* :try_end_13 */
						 /* .catch Ljava/io/IOException; {:try_start_13 ..:try_end_13} :catch_8 */
						 /* goto/16 :goto_2 */
						 /* .line 735 */
						 /* :catch_8 */
						 /* move-exception v0 */
						 /* .line 736 */
						 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
						 /* goto/16 :goto_2 */
						 /* .line 690 */
					 } // :cond_10
					 try { // :try_start_14
						 /* invoke-direct {p0}, Lcom/umeng/common/net/DownloadingService$b;->b()V */
						 /* .line 692 */
						 /* new-instance v0, Ljava/io/File; */
						 v1 = this.d;
						 (( java.io.File ) v1 ).getParent ( ); // invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;
						 v2 = this.d;
						 (( java.io.File ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
						 final String v3 = ".tmp"; // const-string v3, ".tmp"
						 final String v4 = ""; // const-string v4, ""
						 (( java.lang.String ) v2 ).replace ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
						 /* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
						 /* .line 693 */
						 v1 = this.d;
						 (( java.io.File ) v1 ).renameTo ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
						 /* .line 694 */
						 (( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
						 /* .line 695 */
						 /* invoke-direct {p0, v0, v1}, Lcom/umeng/common/net/DownloadingService$b;->a(Ljava/io/File;Ljava/lang/String;)V */
						 /* .line 697 */
						 v0 = this.j;
						 if ( v0 != null) { // if-eqz v0, :cond_e
							 v0 = this.j;
							 /* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
							 /* :try_end_14 */
							 /* .catch Ljava/io/IOException; {:try_start_14 ..:try_end_14} :catch_9 */
							 /* .catch Landroid/os/RemoteException; {:try_start_14 ..:try_end_14} :catch_1e */
							 /* .catchall {:try_start_14 ..:try_end_14} :catchall_c */
							 /* .line 699 */
							 /* :catch_9 */
							 /* move-exception v0 */
							 /* move-object v1, v0 */
							 /* move-object v2, v8 */
							 /* move-object v3, v9 */
							 /* .line 700 */
						 } // :goto_6
						 try { // :try_start_15
							 com.umeng.common.net.DownloadingService .a ( );
							 (( java.io.IOException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
							 com.umeng.common.Log .c ( v0,v4,v1 );
							 /* .line 701 */
							 /* iget v0, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
							 /* add-int/lit8 v0, v0, 0x1 */
							 /* iput v0, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
							 /* if-le v0, v13, :cond_14 */
							 v0 = this.k;
							 /* iget-boolean v0, v0, Lcom/umeng/common/net/a$a;->g:Z */
							 /* :try_end_15 */
							 /* .catchall {:try_start_15 ..:try_end_15} :catchall_2 */
							 /* if-nez v0, :cond_14 */
							 /* .line 703 */
							 try { // :try_start_16
								 com.umeng.common.net.DownloadingService .a ( );
								 final String v4 = "Download Fail out of max repeat count"; // const-string v4, "Download Fail out of max repeat count"
								 com.umeng.common.Log .b ( v0,v4 );
								 /* .line 704 */
								 com.umeng.common.net.DownloadingService .b ( );
								 v4 = this.k;
								 /* check-cast v0, Landroid/os/Messenger; */
								 /* .line 705 */
								 int v4 = 0; // const/4 v4, 0x0
								 int v5 = 5; // const/4 v5, 0x5
								 int v6 = 0; // const/4 v6, 0x0
								 int v7 = 0; // const/4 v7, 0x0
								 android.os.Message .obtain ( v4,v5,v6,v7 );
								 /* .line 704 */
								 (( android.os.Messenger ) v0 ).send ( v4 ); // invoke-virtual {v0, v4}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
								 /* :try_end_16 */
								 /* .catch Landroid/os/RemoteException; {:try_start_16 ..:try_end_16} :catch_b */
								 /* .catchall {:try_start_16 ..:try_end_16} :catchall_3 */
								 /* .line 709 */
								 try { // :try_start_17
									 v0 = this.a;
									 com.umeng.common.net.DownloadingService .a ( v0 );
									 v4 = this.b;
									 com.umeng.common.net.DownloadingService .c ( );
									 com.umeng.common.net.DownloadingService .b ( );
									 /* iget v7, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
									 (( com.umeng.common.net.d ) v0 ).a ( v4, v5, v6, v7 ); // invoke-virtual {v0, v4, v5, v6, v7}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
									 /* .line 710 */
									 /* invoke-direct {p0, v1}, Lcom/umeng/common/net/DownloadingService$b;->a(Ljava/lang/Exception;)V */
									 /* .line 711 */
									 v0 = this.a;
									 com.umeng.common.net.DownloadingService .d ( v0 );
									 /* new-instance v1, Lcom/umeng/common/net/k; */
									 /* invoke-direct {v1, p0}, Lcom/umeng/common/net/k;-><init>(Lcom/umeng/common/net/DownloadingService$b;)V */
									 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
									 /* :try_end_17 */
									 /* .catchall {:try_start_17 ..:try_end_17} :catchall_2 */
									 /* .line 729 */
								 } // :goto_7
								 if ( v3 != null) { // if-eqz v3, :cond_11
									 try { // :try_start_18
										 (( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
										 /* :try_end_18 */
										 /* .catch Ljava/io/IOException; {:try_start_18 ..:try_end_18} :catch_c */
										 /* .catchall {:try_start_18 ..:try_end_18} :catchall_4 */
										 /* .line 734 */
									 } // :cond_11
									 if ( v2 != null) { // if-eqz v2, :cond_4
										 try { // :try_start_19
											 (( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
											 /* :try_end_19 */
											 /* .catch Ljava/io/IOException; {:try_start_19 ..:try_end_19} :catch_a */
											 /* goto/16 :goto_2 */
											 /* .line 735 */
											 /* :catch_a */
											 /* move-exception v0 */
											 /* .line 736 */
											 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
											 /* goto/16 :goto_2 */
											 /* .line 706 */
											 /* :catch_b */
											 /* move-exception v0 */
											 /* .line 707 */
											 try { // :try_start_1a
												 (( android.os.RemoteException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
												 /* :try_end_1a */
												 /* .catchall {:try_start_1a ..:try_end_1a} :catchall_3 */
												 /* .line 709 */
												 try { // :try_start_1b
													 v0 = this.a;
													 com.umeng.common.net.DownloadingService .a ( v0 );
													 v4 = this.b;
													 com.umeng.common.net.DownloadingService .c ( );
													 com.umeng.common.net.DownloadingService .b ( );
													 /* iget v7, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
													 (( com.umeng.common.net.d ) v0 ).a ( v4, v5, v6, v7 ); // invoke-virtual {v0, v4, v5, v6, v7}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
													 /* .line 710 */
													 /* invoke-direct {p0, v1}, Lcom/umeng/common/net/DownloadingService$b;->a(Ljava/lang/Exception;)V */
													 /* .line 711 */
													 v0 = this.a;
													 com.umeng.common.net.DownloadingService .d ( v0 );
													 /* new-instance v1, Lcom/umeng/common/net/k; */
													 /* invoke-direct {v1, p0}, Lcom/umeng/common/net/k;-><init>(Lcom/umeng/common/net/DownloadingService$b;)V */
													 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
													 /* :try_end_1b */
													 /* .catchall {:try_start_1b ..:try_end_1b} :catchall_2 */
													 /* .line 727 */
													 /* :catchall_2 */
													 /* move-exception v0 */
													 /* move-object v8, v2 */
													 /* move-object v9, v3 */
													 /* .line 729 */
												 } // :goto_8
												 if ( v9 != null) { // if-eqz v9, :cond_12
													 try { // :try_start_1c
														 (( java.io.InputStream ) v9 ).close ( ); // invoke-virtual {v9}, Ljava/io/InputStream;->close()V
														 /* :try_end_1c */
														 /* .catch Ljava/io/IOException; {:try_start_1c ..:try_end_1c} :catch_14 */
														 /* .catchall {:try_start_1c ..:try_end_1c} :catchall_6 */
														 /* .line 734 */
													 } // :cond_12
													 if ( v8 != null) { // if-eqz v8, :cond_13
														 try { // :try_start_1d
															 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
															 /* :try_end_1d */
															 /* .catch Ljava/io/IOException; {:try_start_1d ..:try_end_1d} :catch_17 */
															 /* .line 739 */
														 } // :cond_13
													 } // :goto_9
													 /* throw v0 */
													 /* .line 708 */
													 /* :catchall_3 */
													 /* move-exception v0 */
													 /* .line 709 */
													 try { // :try_start_1e
														 v4 = this.a;
														 com.umeng.common.net.DownloadingService .a ( v4 );
														 v5 = this.b;
														 com.umeng.common.net.DownloadingService .c ( );
														 com.umeng.common.net.DownloadingService .b ( );
														 /* iget v8, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
														 (( com.umeng.common.net.d ) v4 ).a ( v5, v6, v7, v8 ); // invoke-virtual {v4, v5, v6, v7, v8}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
														 /* .line 710 */
														 /* invoke-direct {p0, v1}, Lcom/umeng/common/net/DownloadingService$b;->a(Ljava/lang/Exception;)V */
														 /* .line 711 */
														 v1 = this.a;
														 com.umeng.common.net.DownloadingService .d ( v1 );
														 /* new-instance v4, Lcom/umeng/common/net/k; */
														 /* invoke-direct {v4, p0}, Lcom/umeng/common/net/k;-><init>(Lcom/umeng/common/net/DownloadingService$b;)V */
														 (( android.os.Handler ) v1 ).post ( v4 ); // invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
														 /* .line 719 */
														 /* throw v0 */
														 /* .line 722 */
													 } // :cond_14
													 /* invoke-direct {p0}, Lcom/umeng/common/net/DownloadingService$b;->a()V */
													 /* :try_end_1e */
													 /* .catchall {:try_start_1e ..:try_end_1e} :catchall_2 */
													 /* .line 730 */
													 /* :catch_c */
													 /* move-exception v0 */
													 /* .line 731 */
													 try { // :try_start_1f
														 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
														 /* :try_end_1f */
														 /* .catchall {:try_start_1f ..:try_end_1f} :catchall_4 */
														 /* .line 734 */
														 if ( v2 != null) { // if-eqz v2, :cond_4
															 try { // :try_start_20
																 (( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
																 /* :try_end_20 */
																 /* .catch Ljava/io/IOException; {:try_start_20 ..:try_end_20} :catch_d */
																 /* goto/16 :goto_2 */
																 /* .line 735 */
																 /* :catch_d */
																 /* move-exception v0 */
																 /* .line 736 */
																 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
																 /* goto/16 :goto_2 */
																 /* .line 732 */
																 /* :catchall_4 */
																 /* move-exception v0 */
																 /* .line 734 */
																 if ( v2 != null) { // if-eqz v2, :cond_15
																	 try { // :try_start_21
																		 (( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
																		 /* :try_end_21 */
																		 /* .catch Ljava/io/IOException; {:try_start_21 ..:try_end_21} :catch_e */
																		 /* .line 738 */
																	 } // :cond_15
																 } // :goto_a
																 /* throw v0 */
																 /* .line 735 */
																 /* :catch_e */
																 /* move-exception v1 */
																 /* .line 736 */
																 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
																 /* .line 724 */
																 /* :catch_f */
																 /* move-exception v0 */
																 /* move-object v8, v2 */
																 /* move-object v9, v2 */
																 /* .line 725 */
															 } // :goto_b
															 try { // :try_start_22
																 v1 = this.a;
																 com.umeng.common.net.DownloadingService .a ( v1 );
																 v2 = this.b;
																 com.umeng.common.net.DownloadingService .c ( );
																 com.umeng.common.net.DownloadingService .b ( );
																 /* iget v5, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
																 (( com.umeng.common.net.d ) v1 ).a ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
																 /* .line 726 */
																 (( android.os.RemoteException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
																 /* :try_end_22 */
																 /* .catchall {:try_start_22 ..:try_end_22} :catchall_c */
																 /* .line 729 */
																 if ( v9 != null) { // if-eqz v9, :cond_16
																	 try { // :try_start_23
																		 (( java.io.InputStream ) v9 ).close ( ); // invoke-virtual {v9}, Ljava/io/InputStream;->close()V
																		 /* :try_end_23 */
																		 /* .catch Ljava/io/IOException; {:try_start_23 ..:try_end_23} :catch_11 */
																		 /* .catchall {:try_start_23 ..:try_end_23} :catchall_5 */
																		 /* .line 734 */
																	 } // :cond_16
																	 if ( v8 != null) { // if-eqz v8, :cond_4
																		 try { // :try_start_24
																			 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
																			 /* :try_end_24 */
																			 /* .catch Ljava/io/IOException; {:try_start_24 ..:try_end_24} :catch_10 */
																			 /* goto/16 :goto_2 */
																			 /* .line 735 */
																			 /* :catch_10 */
																			 /* move-exception v0 */
																			 /* .line 736 */
																			 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
																			 /* goto/16 :goto_2 */
																			 /* .line 730 */
																			 /* :catch_11 */
																			 /* move-exception v0 */
																			 /* .line 731 */
																			 try { // :try_start_25
																				 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
																				 /* :try_end_25 */
																				 /* .catchall {:try_start_25 ..:try_end_25} :catchall_5 */
																				 /* .line 734 */
																				 if ( v8 != null) { // if-eqz v8, :cond_4
																					 try { // :try_start_26
																						 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
																						 /* :try_end_26 */
																						 /* .catch Ljava/io/IOException; {:try_start_26 ..:try_end_26} :catch_12 */
																						 /* goto/16 :goto_2 */
																						 /* .line 735 */
																						 /* :catch_12 */
																						 /* move-exception v0 */
																						 /* .line 736 */
																						 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
																						 /* goto/16 :goto_2 */
																						 /* .line 732 */
																						 /* :catchall_5 */
																						 /* move-exception v0 */
																						 /* .line 734 */
																						 if ( v8 != null) { // if-eqz v8, :cond_17
																							 try { // :try_start_27
																								 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
																								 /* :try_end_27 */
																								 /* .catch Ljava/io/IOException; {:try_start_27 ..:try_end_27} :catch_13 */
																								 /* .line 738 */
																							 } // :cond_17
																						 } // :goto_c
																						 /* throw v0 */
																						 /* .line 735 */
																						 /* :catch_13 */
																						 /* move-exception v1 */
																						 /* .line 736 */
																						 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
																						 /* .line 730 */
																						 /* :catch_14 */
																						 /* move-exception v1 */
																						 /* .line 731 */
																						 try { // :try_start_28
																							 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
																							 /* :try_end_28 */
																							 /* .catchall {:try_start_28 ..:try_end_28} :catchall_6 */
																							 /* .line 734 */
																							 if ( v8 != null) { // if-eqz v8, :cond_13
																								 try { // :try_start_29
																									 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
																									 /* :try_end_29 */
																									 /* .catch Ljava/io/IOException; {:try_start_29 ..:try_end_29} :catch_15 */
																									 /* goto/16 :goto_9 */
																									 /* .line 735 */
																									 /* :catch_15 */
																									 /* move-exception v1 */
																									 /* .line 736 */
																									 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
																									 /* goto/16 :goto_9 */
																									 /* .line 732 */
																									 /* :catchall_6 */
																									 /* move-exception v0 */
																									 /* .line 734 */
																									 if ( v8 != null) { // if-eqz v8, :cond_18
																										 try { // :try_start_2a
																											 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
																											 /* :try_end_2a */
																											 /* .catch Ljava/io/IOException; {:try_start_2a ..:try_end_2a} :catch_16 */
																											 /* .line 738 */
																										 } // :cond_18
																									 } // :goto_d
																									 /* throw v0 */
																									 /* .line 735 */
																									 /* :catch_16 */
																									 /* move-exception v1 */
																									 /* .line 736 */
																									 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
																									 /* .line 735 */
																									 /* :catch_17 */
																									 /* move-exception v1 */
																									 /* .line 736 */
																									 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
																									 /* goto/16 :goto_9 */
																									 /* .line 730 */
																									 /* :catch_18 */
																									 /* move-exception v0 */
																									 /* .line 731 */
																									 try { // :try_start_2b
																										 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
																										 /* :try_end_2b */
																										 /* .catchall {:try_start_2b ..:try_end_2b} :catchall_7 */
																										 /* .line 734 */
																										 if ( v8 != null) { // if-eqz v8, :cond_4
																											 try { // :try_start_2c
																												 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
																												 /* :try_end_2c */
																												 /* .catch Ljava/io/IOException; {:try_start_2c ..:try_end_2c} :catch_19 */
																												 /* goto/16 :goto_2 */
																												 /* .line 735 */
																												 /* :catch_19 */
																												 /* move-exception v0 */
																												 /* .line 736 */
																												 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
																												 /* goto/16 :goto_2 */
																												 /* .line 732 */
																												 /* :catchall_7 */
																												 /* move-exception v0 */
																												 /* .line 734 */
																												 if ( v8 != null) { // if-eqz v8, :cond_19
																													 try { // :try_start_2d
																														 (( java.io.FileOutputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
																														 /* :try_end_2d */
																														 /* .catch Ljava/io/IOException; {:try_start_2d ..:try_end_2d} :catch_1a */
																														 /* .line 738 */
																													 } // :cond_19
																												 } // :goto_e
																												 /* throw v0 */
																												 /* .line 735 */
																												 /* :catch_1a */
																												 /* move-exception v1 */
																												 /* .line 736 */
																												 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
																												 /* .line 727 */
																												 /* :catchall_8 */
																												 /* move-exception v0 */
																												 /* move-object v8, v2 */
																												 /* move-object v9, v2 */
																												 /* goto/16 :goto_8 */
																												 /* :catchall_9 */
																												 /* move-exception v0 */
																												 /* move-object v8, v1 */
																												 /* move-object v9, v2 */
																												 /* goto/16 :goto_8 */
																												 /* :catchall_a */
																												 /* move-exception v0 */
																												 /* move-object v8, v1 */
																												 /* move-object v9, v2 */
																												 /* goto/16 :goto_8 */
																												 /* :catchall_b */
																												 /* move-exception v0 */
																												 /* move-object v9, v2 */
																												 /* goto/16 :goto_8 */
																												 /* :catchall_c */
																												 /* move-exception v0 */
																												 /* goto/16 :goto_8 */
																												 /* .line 724 */
																												 /* :catch_1b */
																												 /* move-exception v0 */
																												 /* move-object v8, v1 */
																												 /* move-object v9, v2 */
																												 /* goto/16 :goto_b */
																												 /* :catch_1c */
																												 /* move-exception v0 */
																												 /* move-object v8, v1 */
																												 /* move-object v9, v2 */
																												 /* goto/16 :goto_b */
																												 /* :catch_1d */
																												 /* move-exception v0 */
																												 /* move-object v9, v2 */
																												 /* goto/16 :goto_b */
																												 /* :catch_1e */
																												 /* move-exception v0 */
																												 /* goto/16 :goto_b */
																												 /* .line 699 */
																												 /* :catch_1f */
																												 /* move-exception v0 */
																												 /* move-object v1, v0 */
																												 /* move-object v3, v2 */
																												 /* goto/16 :goto_6 */
																												 /* :catch_20 */
																												 /* move-exception v0 */
																												 /* move-object v3, v2 */
																												 /* move-object v2, v1 */
																												 /* move-object v1, v0 */
																												 /* goto/16 :goto_6 */
																												 /* :catch_21 */
																												 /* move-exception v0 */
																												 /* move-object v3, v2 */
																												 /* move-object v2, v1 */
																												 /* move-object v1, v0 */
																												 /* goto/16 :goto_6 */
																												 /* :catch_22 */
																												 /* move-exception v0 */
																												 /* move-object v1, v0 */
																												 /* move-object v3, v2 */
																												 /* move-object v2, v8 */
																												 /* goto/16 :goto_6 */
																											 } // :cond_1a
																											 /* move-object v8, v1 */
																											 /* goto/16 :goto_0 */
																										 } // .end method
																										 static com.umeng.common.net.DownloadingService b ( com.umeng.common.net.DownloadingService$b p0 ) { //synthethic
																											 /* .locals 1 */
																											 /* .prologue */
																											 /* .line 523 */
																											 v0 = this.a;
																										 } // .end method
																										 private void b ( ) {
																											 /* .locals 5 */
																											 /* .prologue */
																											 int v4 = 1; // const/4 v4, 0x1
																											 /* .line 819 */
																											 v0 = this.k;
																											 v0 = this.f;
																											 if ( v0 != null) { // if-eqz v0, :cond_0
																												 /* .line 820 */
																												 /* new-instance v0, Ljava/util/HashMap; */
																												 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
																												 /* .line 821 */
																												 final String v1 = "dsize"; // const-string v1, "dsize"
																												 /* iget-wide v2, p0, Lcom/umeng/common/net/DownloadingService$b;->g:J */
																												 java.lang.String .valueOf ( v2,v3 );
																												 /* .line 823 */
																												 com.umeng.common.util.h .a ( );
																												 /* .line 825 */
																												 final String v2 = " "; // const-string v2, " "
																												 (( java.lang.String ) v1 ).split ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
																												 /* aget-object v1, v1, v4 */
																												 /* .line 826 */
																												 final String v2 = "dtime"; // const-string v2, "dtime"
																												 /* .line 828 */
																												 final String v1 = "ptimes"; // const-string v1, "ptimes"
																												 /* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
																												 java.lang.String .valueOf ( v2 );
																												 /* .line 830 */
																												 v1 = this.a;
																												 com.umeng.common.net.DownloadingService .a ( v1 );
																												 /* .line 831 */
																												 v2 = this.k;
																												 v2 = this.f;
																												 /* .line 830 */
																												 (( com.umeng.common.net.d ) v1 ).a ( v0, v4, v2 ); // invoke-virtual {v1, v0, v4, v2}, Lcom/umeng/common/net/d;->a(Ljava/util/Map;Z[Ljava/lang/String;)V
																												 /* .line 833 */
																											 } // :cond_0
																											 return;
																										 } // .end method
																										 private void b ( Integer p0 ) {
																											 /* .locals 6 */
																											 /* .annotation system Ldalvik/annotation/Throws; */
																											 /* value = { */
																											 /* Landroid/os/RemoteException; */
																											 /* } */
																										 } // .end annotation
																										 /* .prologue */
																										 int v5 = 0; // const/4 v5, 0x0
																										 int v4 = 0; // const/4 v4, 0x0
																										 /* .line 777 */
																										 try { // :try_start_0
																											 com.umeng.common.net.DownloadingService .b ( );
																											 v1 = this.k;
																											 if ( v0 != null) { // if-eqz v0, :cond_0
																												 /* .line 778 */
																												 com.umeng.common.net.DownloadingService .b ( );
																												 v1 = this.k;
																												 /* check-cast v0, Landroid/os/Messenger; */
																												 /* .line 779 */
																												 int v1 = 0; // const/4 v1, 0x0
																												 int v2 = 3; // const/4 v2, 0x3
																												 int v3 = 0; // const/4 v3, 0x0
																												 android.os.Message .obtain ( v1,v2,p1,v3 );
																												 /* .line 778 */
																												 (( android.os.Messenger ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
																												 /* :try_end_0 */
																												 /* .catch Landroid/os/DeadObjectException; {:try_start_0 ..:try_end_0} :catch_0 */
																												 /* .line 788 */
																											 } // :cond_0
																										 } // :goto_0
																										 return;
																										 /* .line 781 */
																										 /* :catch_0 */
																										 /* move-exception v0 */
																										 /* .line 782 */
																										 com.umeng.common.net.DownloadingService .a ( );
																										 /* .line 784 */
																										 final String v1 = "Service Client for downloading %1$15s is dead.Removing messenger from the service"; // const-string v1, "Service Client for downloading %1$15s is dead.Removing messenger from the service"
																										 int v2 = 1; // const/4 v2, 0x1
																										 /* new-array v2, v2, [Ljava/lang/Object; */
																										 /* .line 785 */
																										 v3 = this.k;
																										 v3 = this.b;
																										 /* aput-object v3, v2, v4 */
																										 /* .line 783 */
																										 java.lang.String .format ( v1,v2 );
																										 /* .line 782 */
																										 com.umeng.common.Log .b ( v0,v1 );
																										 /* .line 786 */
																										 com.umeng.common.net.DownloadingService .b ( );
																										 v1 = this.k;
																									 } // .end method
																									 /* # virtual methods */
																									 public void a ( Integer p0 ) {
																										 /* .locals 0 */
																										 /* .prologue */
																										 /* .line 596 */
																										 /* iput p1, p0, Lcom/umeng/common/net/DownloadingService$b;->h:I */
																										 /* .line 597 */
																										 return;
																									 } // .end method
																									 public void run ( ) {
																										 /* .locals 5 */
																										 /* .prologue */
																										 int v0 = 0; // const/4 v0, 0x0
																										 /* .line 572 */
																										 /* iput v0, p0, Lcom/umeng/common/net/DownloadingService$b;->e:I */
																										 /* .line 576 */
																										 try { // :try_start_0
																											 v1 = this.j;
																											 if ( v1 != null) { // if-eqz v1, :cond_0
																												 v1 = this.j;
																												 /* iget v2, p0, Lcom/umeng/common/net/DownloadingService$b;->i:I */
																												 /* .line 577 */
																											 } // :cond_0
																											 /* iget-wide v1, p0, Lcom/umeng/common/net/DownloadingService$b;->f:J */
																											 /* const-wide/16 v3, 0x0 */
																											 /* cmp-long v1, v1, v3 */
																											 /* if-lez v1, :cond_1 */
																											 int v0 = 1; // const/4 v0, 0x1
																										 } // :cond_1
																										 /* invoke-direct {p0, v0}, Lcom/umeng/common/net/DownloadingService$b;->a(Z)V */
																										 /* .line 580 */
																										 v0 = 																										 com.umeng.common.net.DownloadingService .b ( );
																										 /* if-gtz v0, :cond_2 */
																										 /* .line 581 */
																										 v0 = this.a;
																										 (( com.umeng.common.net.DownloadingService ) v0 ).stopSelf ( ); // invoke-virtual {v0}, Lcom/umeng/common/net/DownloadingService;->stopSelf()V
																										 /* :try_end_0 */
																										 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
																										 /* .line 588 */
																									 } // :cond_2
																								 } // :goto_0
																								 return;
																								 /* .line 583 */
																								 /* :catch_0 */
																								 /* move-exception v0 */
																								 /* .line 584 */
																								 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
																							 } // .end method
