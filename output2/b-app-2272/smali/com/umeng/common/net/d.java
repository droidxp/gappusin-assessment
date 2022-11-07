class com.umeng.common.net.d {
	 /* .source "DownloadTool.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/common/net/d$a;, */
	 /* Lcom/umeng/common/net/d$b; */
	 /* } */
} // .end annotation
/* # static fields */
static final Integer a;
static final Integer b;
private static final java.lang.String c;
/* # direct methods */
static com.umeng.common.net.d ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 51 */
	 /* const-class v0, Lcom/umeng/common/net/d; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 /* .line 54 */
	 return;
} // .end method
 com.umeng.common.net.d ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 50 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
static java.lang.String a ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 51 */
	 v0 = com.umeng.common.net.d.c;
} // .end method
/* # virtual methods */
Integer a ( com.umeng.common.net.a$a p0 ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 82 */
	 v0 = this.b;
	 v0 = 	 (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
	 /* shr-int/lit8 v0, v0, 0x2 */
	 /* .line 83 */
	 v1 = this.c;
	 v1 = 	 (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
	 /* shr-int/lit8 v1, v1, 0x3 */
	 /* .line 82 */
	 /* add-int/2addr v0, v1 */
	 /* int-to-long v0, v0 */
	 /* .line 83 */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v2 */
	 /* .line 82 */
	 /* add-long/2addr v0, v2 */
	 /* long-to-int v0, v0 */
	 /* .line 84 */
	 v0 = 	 java.lang.Math .abs ( v0 );
} // .end method
android.app.Notification a ( android.content.Context p0, com.umeng.common.net.a$a p1, Integer p2, Integer p3 ) {
	 /* .locals 9 */
	 /* .prologue */
	 /* const/16 v8, 0x8 */
	 int v7 = 0; // const/4 v7, 0x0
	 /* .line 90 */
	 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
	 /* .line 91 */
	 /* new-instance v1, Landroid/app/Notification; */
	 /* .line 92 */
	 /* const v2, 0x1080081 */
	 /* .line 94 */
	 v3 = 	 com.umeng.common.a.c .i ( v0 );
	 /* .line 93 */
	 (( android.content.Context ) v0 ).getString ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
	 /* .line 94 */
	 /* const-wide/16 v4, 0x1 */
	 /* .line 91 */
	 /* invoke-direct {v1, v2, v3, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V */
	 /* .line 96 */
	 /* new-instance v2, Landroid/widget/RemoteViews; */
	 (( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 /* .line 98 */
	 v4 = 	 com.umeng.common.a.b .a ( v0 );
	 /* .line 96 */
	 /* invoke-direct {v2, v3, v4}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V */
	 /* .line 100 */
	 v3 = 	 com.umeng.common.a.a .b ( v0 );
	 /* const/16 v4, 0x64 */
	 /* .line 99 */
	 (( android.widget.RemoteViews ) v2 ).setProgressBar ( v3, v4, p4, v7 ); // invoke-virtual {v2, v3, v4, p4, v7}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V
	 /* .line 102 */
	 v3 = 	 com.umeng.common.a.a .a ( v0 );
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( p4 );
	 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v5 = "%"; // const-string v5, "%"
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 101 */
	 (( android.widget.RemoteViews ) v2 ).setTextViewText ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
	 /* .line 106 */
	 v3 = 	 com.umeng.common.a.a .c ( v0 );
	 /* .line 107 */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 /* .line 110 */
	 v6 = 	 com.umeng.common.a.c .g ( v0 );
	 /* .line 108 */
	 (( android.content.res.Resources ) v5 ).getString ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
	 java.lang.String .valueOf ( v5 );
	 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* .line 111 */
	 v5 = this.b;
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 107 */
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 104 */
	 (( android.widget.RemoteViews ) v2 ).setTextViewText ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
	 /* .line 113 */
	 this.contentView = v2;
	 /* .line 114 */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v3 */
	 /* iput-wide v3, v1, Landroid/app/Notification;->when:J */
	 /* .line 116 */
	 /* new-instance v3, Landroid/content/Intent; */
	 /* invoke-direct {v3}, Landroid/content/Intent;-><init>()V */
	 /* const/high16 v4, 0x8000000 */
	 /* .line 115 */
	 android.app.PendingIntent .getActivity ( v0,v7,v3,v4 );
	 this.contentIntent = v3;
	 /* .line 118 */
	 /* iget-boolean v3, p2, Lcom/umeng/common/net/a$a;->g:Z */
	 if ( v3 != null) { // if-eqz v3, :cond_0
		 /* .line 119 */
		 int v3 = 2; // const/4 v3, 0x2
		 /* iput v3, v1, Landroid/app/Notification;->flags:I */
		 /* .line 122 */
		 final String v3 = "continue"; // const-string v3, "continue"
		 /* .line 121 */
		 com.umeng.common.net.m .a ( p3,v3 );
		 /* .line 120 */
		 com.umeng.common.net.m .b ( v0,v3 );
		 /* .line 124 */
		 v4 = 		 com.umeng.common.a.a .d ( v0 );
		 /* .line 123 */
		 (( android.widget.RemoteViews ) v2 ).setOnClickPendingIntent ( v4, v3 ); // invoke-virtual {v2, v4, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
		 /* .line 127 */
		 v3 = 		 com.umeng.common.a.a .d ( v0 );
		 /* .line 126 */
		 (( android.widget.RemoteViews ) v2 ).setViewVisibility ( v3, v7 ); // invoke-virtual {v2, v3, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
		 /* .line 129 */
		 (( com.umeng.common.net.d ) p0 ).b ( p1, v1, p3 ); // invoke-virtual {p0, p1, v1, p3}, Lcom/umeng/common/net/d;->b(Landroid/content/Context;Landroid/app/Notification;I)V
		 /* .line 133 */
		 final String v3 = "cancel"; // const-string v3, "cancel"
		 /* .line 132 */
		 com.umeng.common.net.m .a ( p3,v3 );
		 /* .line 131 */
		 com.umeng.common.net.m .b ( v0,v3 );
		 /* .line 135 */
		 v4 = 		 com.umeng.common.a.a .f ( v0 );
		 /* .line 134 */
		 (( android.widget.RemoteViews ) v2 ).setViewVisibility ( v4, v7 ); // invoke-virtual {v2, v4, v7}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
		 /* .line 138 */
		 v0 = 		 com.umeng.common.a.a .f ( v0 );
		 /* .line 137 */
		 (( android.widget.RemoteViews ) v2 ).setOnClickPendingIntent ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
		 /* .line 150 */
	 } // :goto_0
	 /* .line 141 */
} // :cond_0
/* const/16 v3, 0x10 */
/* iput v3, v1, Landroid/app/Notification;->flags:I */
/* .line 143 */
v3 = com.umeng.common.a.a .d ( v0 );
/* .line 142 */
(( android.widget.RemoteViews ) v2 ).setViewVisibility ( v3, v8 ); // invoke-virtual {v2, v3, v8}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
/* .line 146 */
v0 = com.umeng.common.a.a .f ( v0 );
/* .line 145 */
(( android.widget.RemoteViews ) v2 ).setViewVisibility ( v0, v8 ); // invoke-virtual {v2, v0, v8}, Landroid/widget/RemoteViews;->setViewVisibility(II)V
} // .end method
void a ( android.content.Context p0, android.app.Notification p1, Integer p2 ) {
/* .locals 6 */
/* .prologue */
/* .line 215 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 217 */
final String v0 = "notification"; // const-string v0, "notification"
(( android.content.Context ) v1 ).getSystemService ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 216 */
/* check-cast v0, Landroid/app/NotificationManager; */
/* .line 218 */
v2 = com.umeng.common.a.a .d ( v1 );
/* .line 219 */
v3 = this.contentView;
/* .line 221 */
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 223 */
(( android.content.Context ) v1 ).getApplicationContext ( ); // invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 222 */
v5 = com.umeng.common.a.c .e ( v5 );
/* .line 221 */
(( android.content.res.Resources ) v4 ).getString ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 219 */
(( android.widget.RemoteViews ) v3 ).setTextViewText ( v2, v4 ); // invoke-virtual {v3, v2, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 224 */
v3 = this.contentView;
final String v4 = "setBackgroundResource"; // const-string v4, "setBackgroundResource"
/* .line 225 */
com.umeng.common.c .a ( v1 );
final String v5 = "umeng_common_gradient_green"; // const-string v5, "umeng_common_gradient_green"
v1 = (( com.umeng.common.c ) v1 ).d ( v5 ); // invoke-virtual {v1, v5}, Lcom/umeng/common/c;->d(Ljava/lang/String;)I
/* .line 224 */
(( android.widget.RemoteViews ) v3 ).setInt ( v2, v4, v1 ); // invoke-virtual {v3, v2, v4, v1}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
/* .line 226 */
(( android.app.NotificationManager ) v0 ).notify ( p3, p2 ); // invoke-virtual {v0, p3, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
/* .line 227 */
return;
} // .end method
void a ( android.content.Context p0, android.util.SparseArray p1, java.util.Map p2, Integer p3 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Landroid/util/SparseArray", */
/* "<", */
/* "Lcom/umeng/common/net/d$a;", */
/* ">;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Lcom/umeng/common/net/a$a;", */
/* "Landroid/os/Messenger;", */
/* ">;I)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 248 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 250 */
final String v1 = "notification"; // const-string v1, "notification"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 249 */
/* check-cast v0, Landroid/app/NotificationManager; */
/* .line 251 */
(( android.util.SparseArray ) p2 ).get ( p4 ); // invoke-virtual {p2, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v1, Lcom/umeng/common/net/d$a; */
/* .line 252 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 253 */
v2 = com.umeng.common.net.d.c;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "download service clear cache "; // const-string v4, "download service clear cache "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.e;
v4 = this.b;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v2,v3 );
/* .line 254 */
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 255 */
	 v2 = this.a;
	 int v3 = 2; // const/4 v3, 0x2
	 (( com.umeng.common.net.DownloadingService$b ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/umeng/common/net/DownloadingService$b;->a(I)V
	 /* .line 256 */
} // :cond_0
/* iget v2, v1, Lcom/umeng/common/net/d$a;->c:I */
(( android.app.NotificationManager ) v0 ).cancel ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
/* .line 257 */
v0 = v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 258 */
	 v0 = this.e;
	 /* .line 259 */
} // :cond_1
(( com.umeng.common.net.d$a ) v1 ).b ( p2 ); // invoke-virtual {v1, p2}, Lcom/umeng/common/net/d$a;->b(Landroid/util/SparseArray;)V
/* .line 262 */
} // :cond_2
return;
} // .end method
void a ( com.umeng.common.net.a$a p0, Long p1, Long p2, Long p3 ) {
/* .locals 4 */
/* .prologue */
/* .line 266 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 267 */
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
/* .line 268 */
final String v0 = "dsize"; // const-string v0, "dsize"
java.lang.String .valueOf ( p2,p3 );
/* .line 270 */
com.umeng.common.util.h .a ( );
/* .line 272 */
final String v2 = " "; // const-string v2, " "
(( java.lang.String ) v0 ).split ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v0, v0, v2 */
/* .line 273 */
final String v2 = "dtime"; // const-string v2, "dtime"
/* .line 275 */
int v0 = 0; // const/4 v0, 0x0
/* .line 276 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, p4, v2 */
/* if-lez v2, :cond_0 */
/* .line 277 */
/* long-to-float v0, p2 */
/* long-to-float v2, p4 */
/* div-float/2addr v0, v2 */
/* .line 279 */
} // :cond_0
/* const/high16 v2, 0x42c80000 # 100.0f */
/* mul-float/2addr v0, v2 */
/* float-to-int v0, v0 */
/* .line 280 */
final String v2 = "dpcent"; // const-string v2, "dpcent"
java.lang.String .valueOf ( v0 );
/* .line 282 */
final String v0 = "ptimes"; // const-string v0, "ptimes"
java.lang.String .valueOf ( p6,p7 );
/* .line 284 */
int v0 = 0; // const/4 v0, 0x0
v2 = this.f;
(( com.umeng.common.net.d ) p0 ).a ( v1, v0, v2 ); // invoke-virtual {p0, v1, v0, v2}, Lcom/umeng/common/net/d;->a(Ljava/util/Map;Z[Ljava/lang/String;)V
/* .line 286 */
} // :cond_1
return;
} // .end method
final void a ( java.util.Map p0, Boolean p1, java.lang.String[] p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;Z[", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 295 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/umeng/common/net/e; */
/* invoke-direct {v1, p0, p3, p2, p1}, Lcom/umeng/common/net/e;-><init>(Lcom/umeng/common/net/d;[Ljava/lang/String;ZLjava/util/Map;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 359 */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 360 */
return;
} // .end method
Boolean a ( android.content.Context p0 ) {
/* .locals 6 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 160 */
/* .line 161 */
final String v0 = "activity"; // const-string v0, "activity"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 160 */
/* check-cast v0, Landroid/app/ActivityManager; */
/* .line 163 */
(( android.app.ActivityManager ) v0 ).getRunningAppProcesses ( ); // invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;
/* .line 164 */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
/* .line 174 */
} // :goto_0
/* .line 167 */
} // :cond_0
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 168 */
v0 = } // :cond_1
/* if-nez v0, :cond_2 */
/* move v0, v1 */
/* .line 174 */
/* .line 168 */
} // :cond_2
/* check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo; */
/* .line 169 */
/* iget v4, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I */
/* const/16 v5, 0x64 */
/* if-ne v4, v5, :cond_1 */
/* .line 170 */
v0 = this.processName;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 171 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
Boolean a ( com.umeng.common.net.DownloadingService p0, android.util.SparseArray p1, java.util.Map p2, android.content.Intent p3 ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/umeng/common/net/DownloadingService;", */
/* "Landroid/util/SparseArray", */
/* "<", */
/* "Lcom/umeng/common/net/d$a;", */
/* ">;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Lcom/umeng/common/net/a$a;", */
/* "Landroid/os/Messenger;", */
/* ">;", */
/* "Landroid/content/Intent;", */
/* ")Z" */
/* } */
} // .end annotation
/* .prologue */
/* .line 366 */
try { // :try_start_0
/* invoke-virtual/range {p1 ..p1}, Lcom/umeng/common/net/DownloadingService;->getApplicationContext()Landroid/content/Context; */
/* .line 367 */
/* invoke-virtual/range {p4 ..p4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle; */
/* .line 368 */
final String v4 = "com.umeng.broadcast.download.msg"; // const-string v4, "com.umeng.broadcast.download.msg"
/* .line 367 */
(( android.os.Bundle ) v3 ).getString ( v4 ); // invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 369 */
final String v4 = ":"; // const-string v4, ":"
(( java.lang.String ) v3 ).split ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 371 */
int v4 = 0; // const/4 v4, 0x0
/* aget-object v4, v3, v4 */
v7 = java.lang.Integer .parseInt ( v4 );
/* .line 372 */
int v4 = 1; // const/4 v4, 0x1
/* aget-object v3, v3, v4 */
(( java.lang.String ) v3 ).trim ( ); // invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 373 */
if ( v7 != null) { // if-eqz v7, :cond_4
v3 = android.text.TextUtils .isEmpty ( v4 );
/* if-nez v3, :cond_4 */
/* .line 374 */
/* move-object/from16 v0, p2 */
v3 = (( android.util.SparseArray ) v0 ).indexOfKey ( v7 ); // invoke-virtual {v0, v7}, Landroid/util/SparseArray;->indexOfKey(I)I
/* if-ltz v3, :cond_4 */
/* .line 375 */
/* move-object/from16 v0, p2 */
(( android.util.SparseArray ) v0 ).get ( v7 ); // invoke-virtual {v0, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* move-object v0, v3 */
/* check-cast v0, Lcom/umeng/common/net/d$a; */
/* move-object/from16 v16, v0 */
/* .line 376 */
/* move-object/from16 v0, v16 */
v3 = this.a;
/* .line 378 */
final String v6 = "continue"; // const-string v6, "continue"
v6 = (( java.lang.String ) v6 ).equals ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 379 */
/* if-nez v3, :cond_1 */
/* .line 380 */
v3 = com.umeng.common.net.d.c;
final String v4 = "Receive action do play click."; // const-string v4, "Receive action do play click."
com.umeng.common.Log .c ( v3,v4 );
/* .line 386 */
final String v3 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v3, "android.permission.ACCESS_NETWORK_STATE"
/* .line 385 */
v3 = com.umeng.common.b .a ( v5,v3 );
/* .line 386 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 387 */
v3 = com.umeng.common.b .n ( v5 );
/* if-nez v3, :cond_0 */
/* .line 390 */
(( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 394 */
(( android.content.Context ) v5 ).getApplicationContext ( ); // invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 393 */
v4 = com.umeng.common.a.c .a ( v4 );
/* .line 391 */
(( android.content.res.Resources ) v3 ).getString ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 395 */
int v4 = 1; // const/4 v4, 0x1
/* .line 388 */
android.widget.Toast .makeText ( v5,v3,v4 );
/* .line 395 */
(( android.widget.Toast ) v3 ).show ( ); // invoke-virtual {v3}, Landroid/widget/Toast;->show()V
/* .line 396 */
int v3 = 0; // const/4 v3, 0x0
/* .line 436 */
} // :goto_0
/* .line 399 */
} // :cond_0
/* new-instance v3, Lcom/umeng/common/net/DownloadingService$b; */
/* invoke-virtual/range {p1 ..p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class; */
/* .line 400 */
/* move-object/from16 v0, v16 */
v6 = this.e;
/* move-object/from16 v0, v16 */
/* iget v8, v0, Lcom/umeng/common/net/d$a;->d:I */
/* .line 401 */
/* move-object/from16 v0, p1 */
v9 = this.n;
/* move-object/from16 v4, p1 */
/* .line 399 */
/* invoke-direct/range {v3 ..v9}, Lcom/umeng/common/net/DownloadingService$b;-><init>(Lcom/umeng/common/net/DownloadingService;Landroid/content/Context;Lcom/umeng/common/net/a$a;IILcom/umeng/common/net/DownloadingService$a;)V */
/* .line 402 */
/* move-object/from16 v0, v16 */
this.a = v3;
/* .line 403 */
(( com.umeng.common.net.DownloadingService$b ) v3 ).start ( ); // invoke-virtual {v3}, Lcom/umeng/common/net/DownloadingService$b;->start()V
/* .line 405 */
/* move-object/from16 v0, v16 */
v3 = this.b;
/* move-object/from16 v0, p0 */
(( com.umeng.common.net.d ) v0 ).b ( v5, v3, v7 ); // invoke-virtual {v0, v5, v3, v7}, Lcom/umeng/common/net/d;->b(Landroid/content/Context;Landroid/app/Notification;I)V
/* .line 406 */
int v3 = 1; // const/4 v3, 0x1
/* .line 408 */
} // :cond_1
v4 = com.umeng.common.net.d.c;
final String v6 = "Receive action do play click."; // const-string v6, "Receive action do play click."
com.umeng.common.Log .c ( v4,v6 );
/* .line 409 */
int v4 = 1; // const/4 v4, 0x1
(( com.umeng.common.net.DownloadingService$b ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lcom/umeng/common/net/DownloadingService$b;->a(I)V
/* .line 410 */
int v3 = 0; // const/4 v3, 0x0
/* move-object/from16 v0, v16 */
this.a = v3;
/* .line 411 */
/* move-object/from16 v0, v16 */
v3 = this.b;
/* move-object/from16 v0, p0 */
(( com.umeng.common.net.d ) v0 ).a ( v5, v3, v7 ); // invoke-virtual {v0, v5, v3, v7}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/app/Notification;I)V
/* .line 412 */
int v3 = 1; // const/4 v3, 0x1
/* .line 414 */
} // :cond_2
final String v6 = "cancel"; // const-string v6, "cancel"
v4 = (( java.lang.String ) v6 ).equals ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 415 */
v4 = com.umeng.common.net.d.c;
final String v6 = "Receive action do stop click."; // const-string v6, "Receive action do stop click."
com.umeng.common.Log .c ( v4,v6 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 417 */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 418 */
int v4 = 2; // const/4 v4, 0x2
try { // :try_start_1
(( com.umeng.common.net.DownloadingService$b ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lcom/umeng/common/net/DownloadingService$b;->a(I)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 427 */
} // :goto_1
try { // :try_start_2
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p3 */
(( com.umeng.common.net.d ) v0 ).a ( v5, v1, v2, v7 ); // invoke-virtual {v0, v5, v1, v2, v7}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 429 */
} // :goto_2
int v3 = 1; // const/4 v3, 0x1
/* .line 420 */
} // :cond_3
try { // :try_start_3
/* move-object/from16 v0, v16 */
v3 = this.f;
int v4 = 0; // const/4 v4, 0x0
/* aget-wide v10, v3, v4 */
/* .line 421 */
/* move-object/from16 v0, v16 */
v3 = this.f;
int v4 = 1; // const/4 v4, 0x1
/* aget-wide v12, v3, v4 */
/* .line 422 */
/* move-object/from16 v0, v16 */
v3 = this.f;
int v4 = 2; // const/4 v4, 0x2
/* aget-wide v14, v3, v4 */
/* .line 423 */
/* move-object/from16 v0, v16 */
v9 = this.e;
/* move-object/from16 v8, p0 */
/* invoke-virtual/range {v8 ..v15}, Lcom/umeng/common/net/d;->a(Lcom/umeng/common/net/a$a;JJJ)V */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 425 */
/* :catch_0 */
/* move-exception v3 */
/* .line 427 */
try { // :try_start_4
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p3 */
(( com.umeng.common.net.d ) v0 ).a ( v5, v1, v2, v7 ); // invoke-virtual {v0, v5, v1, v2, v7}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
/* .line 433 */
/* :catch_1 */
/* move-exception v3 */
/* .line 434 */
(( java.lang.Exception ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
/* .line 436 */
} // :cond_4
int v3 = 0; // const/4 v3, 0x0
/* goto/16 :goto_0 */
/* .line 426 */
/* :catchall_0 */
/* move-exception v3 */
/* .line 427 */
try { // :try_start_5
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p3 */
(( com.umeng.common.net.d ) v0 ).a ( v5, v1, v2, v7 ); // invoke-virtual {v0, v5, v1, v2, v7}, Lcom/umeng/common/net/d;->a(Landroid/content/Context;Landroid/util/SparseArray;Ljava/util/Map;I)V
/* .line 428 */
/* throw v3 */
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_1 */
} // .end method
Boolean a ( com.umeng.common.net.a$a p0, Boolean p1, java.util.Map p2, android.os.Messenger p3 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/umeng/common/net/a$a;", */
/* "Z", */
/* "Ljava/util/Map", */
/* "<", */
/* "Lcom/umeng/common/net/a$a;", */
/* "Landroid/os/Messenger;", */
/* ">;", */
/* "Landroid/os/Messenger;", */
/* ")Z" */
/* } */
} // .end annotation
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 186 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 187 */
/* new-instance v0, Ljava/util/Random; */
/* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
/* const/16 v3, 0x3e8 */
v3 = (( java.util.Random ) v0 ).nextInt ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I
/* .line 188 */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 189 */
v0 = } // :goto_0
/* if-nez v0, :cond_1 */
/* .line 197 */
} // :cond_0
} // :goto_1
/* if-nez p3, :cond_3 */
/* move v0, v1 */
/* .line 211 */
} // :goto_2
/* .line 189 */
} // :cond_1
/* check-cast v0, Lcom/umeng/common/net/a$a; */
/* .line 190 */
v5 = com.umeng.common.net.d.c;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "_"; // const-string v7, "_"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v7 = " downling "; // const-string v7, " downling "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.b;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = " "; // const-string v7, " "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 191 */
v0 = this.c;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 190 */
com.umeng.common.Log .c ( v5,v0 );
/* .line 194 */
} // :cond_2
v0 = com.umeng.common.net.d.c;
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "_"; // const-string v5, "_"
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = "downling null"; // const-string v4, "downling null"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v0,v3 );
/* .line 199 */
} // :cond_3
v0 = } // :cond_4
/* if-nez v0, :cond_5 */
/* move v0, v1 */
/* .line 211 */
/* .line 199 */
} // :cond_5
/* check-cast v0, Lcom/umeng/common/net/a$a; */
/* .line 201 */
v4 = this.e;
if ( v4 != null) { // if-eqz v4, :cond_6
v4 = this.e;
v5 = this.e;
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 202 */
/* move v0, v2 */
/* .line 203 */
/* .line 206 */
} // :cond_6
v4 = this.c;
v5 = this.c;
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 207 */
/* move v0, v2 */
/* .line 208 */
/* goto/16 :goto_2 */
} // .end method
void b ( android.content.Context p0, android.app.Notification p1, Integer p2 ) {
/* .locals 6 */
/* .prologue */
/* .line 230 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 232 */
final String v0 = "notification"; // const-string v0, "notification"
(( android.content.Context ) v1 ).getSystemService ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 231 */
/* check-cast v0, Landroid/app/NotificationManager; */
/* .line 233 */
v2 = com.umeng.common.a.a .d ( v1 );
/* .line 234 */
v3 = this.contentView;
/* .line 236 */
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 238 */
(( android.content.Context ) v1 ).getApplicationContext ( ); // invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 237 */
v5 = com.umeng.common.a.c .d ( v5 );
/* .line 236 */
(( android.content.res.Resources ) v4 ).getString ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 234 */
(( android.widget.RemoteViews ) v3 ).setTextViewText ( v2, v4 ); // invoke-virtual {v3, v2, v4}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 240 */
v3 = this.contentView;
/* .line 241 */
final String v4 = "setBackgroundResource"; // const-string v4, "setBackgroundResource"
com.umeng.common.c .a ( v1 );
/* .line 242 */
final String v5 = "umeng_common_gradient_orange"; // const-string v5, "umeng_common_gradient_orange"
v1 = (( com.umeng.common.c ) v1 ).d ( v5 ); // invoke-virtual {v1, v5}, Lcom/umeng/common/c;->d(Ljava/lang/String;)I
/* .line 241 */
(( android.widget.RemoteViews ) v3 ).setInt ( v2, v4, v1 ); // invoke-virtual {v3, v2, v4, v1}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V
/* .line 243 */
(( android.app.NotificationManager ) v0 ).notify ( p3, p2 ); // invoke-virtual {v0, p3, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
/* .line 244 */
return;
} // .end method
