class com.umeng.analytics.b extends com.umeng.analytics.d {
	 /* .source "InternalAgent.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/analytics/b$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public java.util.concurrent.ExecutorService a;
java.lang.String b;
java.lang.String c;
private java.lang.String m;
private java.lang.String n;
private final Integer o;
private final Integer p;
private final java.lang.String q;
private final java.lang.String r;
private final java.lang.String s;
private final Long t;
private final Integer u;
private final Integer v;
private final java.util.Stack w;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Stack", */
/* "<", */
/* "Lcom/umeng/analytics/f;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final java.util.ArrayList x;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/f;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
 com.umeng.analytics.b ( ) {
/* .locals 2 */
/* .prologue */
/* .line 54 */
/* invoke-direct {p0}, Lcom/umeng/analytics/d;-><init>()V */
/* .line 30 */
java.util.concurrent.Executors .newSingleThreadExecutor ( );
this.a = v0;
/* .line 35 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/umeng/analytics/b;->o:I */
/* .line 36 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/umeng/analytics/b;->p:I */
/* .line 38 */
final String v0 = ""; // const-string v0, ""
this.b = v0;
/* .line 39 */
final String v0 = ""; // const-string v0, ""
this.c = v0;
/* .line 41 */
final String v0 = "start_millis"; // const-string v0, "start_millis"
this.q = v0;
/* .line 42 */
final String v0 = "end_millis"; // const-string v0, "end_millis"
this.r = v0;
/* .line 44 */
final String v0 = "last_fetch_location_time"; // const-string v0, "last_fetch_location_time"
this.s = v0;
/* .line 45 */
/* const-wide/16 v0, 0x2710 */
/* iput-wide v0, p0, Lcom/umeng/analytics/b;->t:J */
/* .line 47 */
/* const/16 v0, 0x80 */
/* iput v0, p0, Lcom/umeng/analytics/b;->u:I */
/* .line 48 */
/* const/16 v0, 0x100 */
/* iput v0, p0, Lcom/umeng/analytics/b;->v:I */
/* .line 50 */
/* new-instance v0, Ljava/util/Stack; */
/* invoke-direct {v0}, Ljava/util/Stack;-><init>()V */
this.w = v0;
/* .line 51 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.x = v0;
/* .line 55 */
return;
} // .end method
private java.lang.String a ( android.content.Context p0, Long p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 353 */
v0 = this.l;
/* if-nez v0, :cond_0 */
com.umeng.common.b .q ( p1 );
/* .line 354 */
} // :goto_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 355 */
(( java.lang.StringBuilder ) v1 ).append ( p2, p3 ); // invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* .line 356 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 357 */
com.umeng.common.b .g ( p1 );
com.umeng.common.util.h .b ( v2 );
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 358 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.util.h .a ( v0 );
/* .line 353 */
} // :cond_0
v0 = this.l;
} // .end method
private void a ( android.content.Context p0, android.content.SharedPreferences p1 ) {
/* .locals 6 */
/* .prologue */
/* .line 301 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* .line 303 */
/* sget-boolean v2, Lcom/umeng/analytics/g;->i:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
final String v2 = "last_fetch_location_time"; // const-string v2, "last_fetch_location_time"
/* const-wide/16 v3, 0x0 */
/* move-result-wide v2 */
/* sub-long v2, v0, v2 */
/* const-wide/16 v4, 0x2710 */
/* cmp-long v2, v2, v4 */
/* if-gez v2, :cond_1 */
/* .line 314 */
} // :cond_0
} // :goto_0
return;
/* .line 307 */
} // :cond_1
com.umeng.analytics.a.o .a ( p1,p2 );
/* .line 309 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 311 */
final String v3 = "last_fetch_location_time"; // const-string v3, "last_fetch_location_time"
/* .line 312 */
} // .end method
static void a ( Object p0, android.content.Context p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 264 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/b;->j(Landroid/content/Context;)V */
return;
} // .end method
private Boolean a ( android.content.SharedPreferences p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 317 */
final String v0 = "end_millis"; // const-string v0, "end_millis"
/* const-wide/16 v1, -0x1 */
/* move-result-wide v0 */
/* .line 318 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* .line 319 */
/* sub-long v0, v2, v0 */
/* sget-wide v2, Lcom/umeng/analytics/g;->d:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_0 */
/* .line 320 */
int v0 = 1; // const/4 v0, 0x1
/* .line 322 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private java.lang.String b ( android.content.Context p0, android.content.SharedPreferences p1 ) {
/* .locals 6 */
/* .prologue */
/* .line 328 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* .line 330 */
/* invoke-direct {p0, p1, v0, v1}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;J)Ljava/lang/String; */
/* .line 332 */
/* new-instance v3, Lcom/umeng/analytics/a/h; */
/* invoke-direct {v3, p1, v2}, Lcom/umeng/analytics/a/h;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
/* .line 333 */
com.umeng.analytics.a.m .a ( p1 );
/* .line 335 */
v5 = this.d;
(( com.umeng.analytics.c ) v5 ).a ( v3 ); // invoke-virtual {v5, v3}, Lcom/umeng/analytics/c;->a(Lcom/umeng/analytics/a/h;)V
/* .line 336 */
v3 = this.d;
(( com.umeng.analytics.c ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lcom/umeng/analytics/c;->a(Lcom/umeng/analytics/a/m;)V
/* .line 338 */
/* .line 340 */
final String v4 = "session_id"; // const-string v4, "session_id"
/* .line 341 */
final String v4 = "start_millis"; // const-string v4, "start_millis"
/* .line 342 */
final String v0 = "end_millis"; // const-string v0, "end_millis"
/* const-wide/16 v4, -0x1 */
/* .line 344 */
/* .line 346 */
int v0 = 4; // const/4 v0, 0x4
(( com.umeng.analytics.b ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;I)V
/* .line 348 */
} // .end method
static void b ( Object p0, android.content.Context p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 248 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/b;->i(Landroid/content/Context;)V */
return;
} // .end method
private java.lang.String c ( android.content.Context p0, android.content.SharedPreferences p1 ) {
/* .locals 5 */
/* .prologue */
/* .line 363 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
java.lang.Long .valueOf ( v0,v1 );
/* .line 365 */
/* .line 366 */
final String v2 = "start_millis"; // const-string v2, "start_millis"
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v3 */
/* .line 367 */
final String v0 = "end_millis"; // const-string v0, "end_millis"
/* const-wide/16 v2, -0x1 */
/* .line 368 */
/* .line 370 */
final String v0 = "session_id"; // const-string v0, "session_id"
int v1 = 0; // const/4 v1, 0x0
} // .end method
private void d ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 377 */
try { // :try_start_0
/* sget-boolean v0, Lcom/umeng/analytics/g;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 378 */
v0 = this.d;
(( com.umeng.analytics.c ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lcom/umeng/analytics/c;->a(Ljava/lang/String;)V
/* .line 387 */
} // :goto_0
return;
/* .line 380 */
} // :cond_0
com.umeng.analytics.k .a ( p1,p2 );
/* .line 381 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
(( com.umeng.analytics.k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/analytics/k;->a(Ljava/lang/Long;)V
/* .line 382 */
(( com.umeng.analytics.k ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/k;->a(Landroid/content/Context;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 384 */
/* :catch_0 */
/* move-exception v0 */
/* .line 385 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "exception in save event begin info"; // const-string v1, "exception in save event begin info"
com.umeng.common.Log .a ( v0,v1 );
} // .end method
private Integer e ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 5 */
/* .prologue */
/* .line 390 */
int v0 = -1; // const/4 v0, -0x1
/* .line 394 */
try { // :try_start_0
/* sget-boolean v1, Lcom/umeng/analytics/g;->m:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 395 */
v1 = this.d;
(( com.umeng.analytics.c ) v1 ).b ( p2 ); // invoke-virtual {v1, p2}, Lcom/umeng/analytics/c;->b(Ljava/lang/String;)J
/* move-result-wide v1 */
/* .line 401 */
} // :goto_0
/* const-wide/16 v3, 0x0 */
/* cmp-long v3, v1, v3 */
/* if-lez v3, :cond_0 */
/* .line 402 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* sub-long v0, v3, v1 */
/* long-to-int v0, v0 */
/* .line 408 */
} // :cond_0
} // :goto_1
/* .line 397 */
} // :cond_1
com.umeng.analytics.k .a ( p1,p2 );
/* .line 398 */
(( com.umeng.analytics.k ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/umeng/analytics/k;->a()Ljava/lang/Long;
(( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-result-wide v1 */
/* .line 404 */
/* :catch_0 */
/* move-exception v1 */
/* .line 405 */
final String v2 = "MobclickAgent"; // const-string v2, "MobclickAgent"
final String v3 = "exception in get event duration"; // const-string v3, "exception in get event duration"
com.umeng.common.Log .a ( v2,v3,v1 );
} // .end method
private void h ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 163 */
/* if-nez p1, :cond_0 */
/* .line 164 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "unexpected null context in onResume"; // const-string v1, "unexpected null context in onResume"
com.umeng.common.Log .b ( v0,v1 );
/* .line 174 */
} // :goto_0
return;
/* .line 173 */
} // :cond_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
this.m = v0;
} // .end method
private synchronized void i ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 250 */
/* monitor-enter p0 */
try { // :try_start_0
com.umeng.analytics.j .e ( p1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 251 */
/* if-nez v0, :cond_0 */
/* .line 262 */
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 255 */
} // :cond_0
try { // :try_start_1
v1 = /* invoke-direct {p0, v0}, Lcom/umeng/analytics/b;->a(Landroid/content/SharedPreferences;)Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 256 */
/* invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/b;->b(Landroid/content/Context;Landroid/content/SharedPreferences;)Ljava/lang/String; */
this.n = v0;
/* .line 257 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Start new session: "; // const-string v2, "Start new session: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.n;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v0,v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 250 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 259 */
} // :cond_1
try { // :try_start_2
/* invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/b;->c(Landroid/content/Context;Landroid/content/SharedPreferences;)Ljava/lang/String; */
this.n = v0;
/* .line 260 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Extend current session: "; // const-string v2, "Extend current session: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.n;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v0,v1 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
private synchronized void j ( android.content.Context p0 ) {
/* .locals 8 */
/* .prologue */
/* const-wide/16 v4, -0x1 */
/* .line 265 */
/* monitor-enter p0 */
try { // :try_start_0
com.umeng.analytics.j .e ( p1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 266 */
/* if-nez v0, :cond_0 */
/* .line 296 */
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 270 */
} // :cond_0
try { // :try_start_1
final String v1 = "start_millis"; // const-string v1, "start_millis"
/* const-wide/16 v2, -0x1 */
/* move-result-wide v2 */
/* .line 272 */
/* cmp-long v1, v2, v4 */
/* if-nez v1, :cond_1 */
/* .line 273 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
/* .line 274 */
final String v2 = "onEndSession called before onStartSession"; // const-string v2, "onEndSession called before onStartSession"
/* .line 273 */
com.umeng.common.Log .b ( v1,v2 );
/* .line 293 */
} // :goto_1
/* invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Landroid/content/SharedPreferences;)V */
/* .line 295 */
int v0 = 5; // const/4 v0, 0x5
(( com.umeng.analytics.b ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;I)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 265 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 276 */
} // :cond_1
try { // :try_start_2
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* .line 280 */
/* sget-boolean v1, Lcom/umeng/analytics/g;->j:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 281 */
v1 = this.m;
/* invoke-static/range {v0 ..v5}, Lcom/umeng/analytics/a/m;->a(Landroid/content/SharedPreferences;Ljava/lang/String;JJ)Landroid/content/SharedPreferences$Editor; */
/* .line 287 */
} // :goto_2
final String v2 = "start_millis"; // const-string v2, "start_millis"
/* const-wide/16 v6, -0x1 */
/* .line 288 */
final String v2 = "end_millis"; // const-string v2, "end_millis"
/* .line 290 */
/* .line 283 */
} // :cond_2
v1 = this.x;
/* invoke-static/range {v0 ..v5}, Lcom/umeng/analytics/a/m;->a(Landroid/content/SharedPreferences;Ljava/util/ArrayList;JJ)Landroid/content/SharedPreferences$Editor; */
/* .line 284 */
v2 = this.x;
(( java.util.ArrayList ) v2 ).clear ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
/* # virtual methods */
void a ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 89 */
/* if-nez p1, :cond_0 */
/* .line 90 */
try { // :try_start_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "unexpected null context in onPause"; // const-string v1, "unexpected null context in onPause"
com.umeng.common.Log .b ( v0,v1 );
/* .line 103 */
} // :goto_0
return;
/* .line 94 */
} // :cond_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
v1 = this.m;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 95 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "onPause() called without context from corresponding onResume()"; // const-string v1, "onPause() called without context from corresponding onResume()"
com.umeng.common.Log .b ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 100 */
/* :catch_0 */
/* move-exception v0 */
/* .line 101 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "Exception occurred in Mobclick.onRause()."; // const-string v2, "Exception occurred in Mobclick.onRause()."
com.umeng.common.Log .b ( v1,v2,v0 );
/* .line 99 */
} // :cond_1
try { // :try_start_1
v0 = this.a;
/* new-instance v1, Lcom/umeng/analytics/b$a; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, p0, p1, v2}, Lcom/umeng/analytics/b$a;-><init>(Lcom/umeng/analytics/b;Landroid/content/Context;I)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
void a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 106 */
v0 = android.text.TextUtils .isEmpty ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 119 */
} // :goto_0
return;
/* .line 110 */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 112 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "unexpected null context in reportError"; // const-string v1, "unexpected null context in reportError"
com.umeng.common.Log .b ( v0,v1 );
/* .line 116 */
} // :cond_1
v0 = this.d;
/* new-instance v1, Lcom/umeng/analytics/a/d; */
/* invoke-direct {v1, p2}, Lcom/umeng/analytics/a/d;-><init>(Ljava/lang/String;)V */
(( com.umeng.analytics.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/analytics/c;->a(Lcom/umeng/analytics/a/d;)V
/* .line 118 */
(( com.umeng.analytics.b ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/b;->e(Landroid/content/Context;)V
} // .end method
void a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .prologue */
/* .line 435 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* const/16 v0, 0x80 */
v0 = (( com.umeng.analytics.b ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v0, 0x100 */
v0 = (( com.umeng.analytics.b ) p0 ).a ( p3, v0 ); // invoke-virtual {p0, p3, v0}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;I)Z
/* if-nez v0, :cond_1 */
/* .line 436 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "invalid params in onEventBegin"; // const-string v1, "invalid params in onEventBegin"
com.umeng.common.Log .b ( v0,v1 );
/* .line 440 */
} // :goto_0
return;
/* .line 439 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "_tl"; // const-string v1, "_tl"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/b;->d(Landroid/content/Context;Ljava/lang/String;)V */
} // .end method
void a ( android.content.Context p0, java.lang.String p1, java.lang.String p2, Long p3, Integer p4 ) {
/* .locals 7 */
/* .prologue */
/* .line 199 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* const/16 v0, 0x80 */
try { // :try_start_0
v0 = (( com.umeng.analytics.b ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-gtz p6, :cond_1 */
/* .line 200 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "invalid params in onEvent"; // const-string v1, "invalid params in onEvent"
com.umeng.common.Log .b ( v0,v1 );
/* .line 220 */
} // :goto_0
return;
/* .line 204 */
} // :cond_1
v0 = this.n;
/* if-nez v0, :cond_2 */
/* .line 205 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "can\'t call onEvent before session is initialized"; // const-string v1, "can\'t call onEvent before session is initialized"
com.umeng.common.Log .e ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 217 */
/* :catch_0 */
/* move-exception v0 */
/* .line 218 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "Exception occurred in Mobclick.onEvent()."; // const-string v2, "Exception occurred in Mobclick.onEvent()."
com.umeng.common.Log .b ( v1,v2,v0 );
/* .line 209 */
} // :cond_2
if ( p3 != null) { // if-eqz p3, :cond_3
/* const/16 v0, 0x100 */
try { // :try_start_1
v0 = (( com.umeng.analytics.b ) p0 ).a ( p3, v0 ); // invoke-virtual {p0, p3, v0}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;I)Z
/* if-nez v0, :cond_3 */
/* .line 210 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "invalid label in onEvent"; // const-string v1, "invalid label in onEvent"
com.umeng.common.Log .b ( v0,v1 );
/* .line 213 */
} // :cond_3
v0 = this.d;
v1 = this.n;
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-wide v4, p4 */
/* move v6, p6 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V */
/* .line 215 */
(( com.umeng.analytics.b ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/b;->e(Landroid/content/Context;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
void a ( android.content.Context p0, java.lang.String p1, java.util.HashMap p2, Long p3 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;J)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 224 */
if ( p1 != null) { // if-eqz p1, :cond_0
try { // :try_start_0
v0 = android.text.TextUtils .isEmpty ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 225 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "invalid params in onKVEventEnd"; // const-string v1, "invalid params in onKVEventEnd"
com.umeng.common.Log .b ( v0,v1 );
/* .line 246 */
} // :cond_1
} // :goto_0
return;
/* .line 229 */
} // :cond_2
v0 = (( com.umeng.analytics.b ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Lcom/umeng/analytics/b;->a(Ljava/util/Map;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 233 */
v0 = this.n;
/* if-nez v0, :cond_3 */
/* .line 234 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "can\'t call onEvent before session is initialized"; // const-string v1, "can\'t call onEvent before session is initialized"
com.umeng.common.Log .e ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 242 */
/* :catch_0 */
/* move-exception v0 */
/* .line 243 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
/* .line 244 */
final String v2 = "Exception occurred in Mobclick.onEvent()."; // const-string v2, "Exception occurred in Mobclick.onEvent()."
/* .line 243 */
com.umeng.common.Log .b ( v1,v2,v0 );
/* .line 238 */
} // :cond_3
try { // :try_start_1
v0 = this.d;
v1 = this.n;
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-wide v4, p4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/umeng/analytics/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;J)V */
/* .line 240 */
(( com.umeng.analytics.b ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/b;->e(Landroid/content/Context;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
void a ( android.content.Context p0, java.lang.String p1, java.util.HashMap p2, java.lang.String p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 462 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez v0, :cond_0 */
v0 = android.text.TextUtils .isEmpty ( p4 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 463 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "invalid params in onKVEventBegin"; // const-string v1, "invalid params in onKVEventBegin"
com.umeng.common.Log .b ( v0,v1 );
/* .line 481 */
} // :cond_1
} // :goto_0
return;
/* .line 467 */
} // :cond_2
v0 = (( com.umeng.analytics.b ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Lcom/umeng/analytics/b;->a(Ljava/util/Map;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 473 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p2 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p4 ); // invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 475 */
v1 = this.d;
(( com.umeng.analytics.c ) v1 ).a ( v0, p3 ); // invoke-virtual {v1, v0, p3}, Lcom/umeng/analytics/c;->a(Ljava/lang/String;Ljava/util/HashMap;)V
/* .line 476 */
v1 = this.d;
(( com.umeng.analytics.c ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/umeng/analytics/c;->a(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 478 */
/* :catch_0 */
/* move-exception v0 */
/* .line 479 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "exception in save k-v event begin inof"; // const-string v2, "exception in save k-v event begin inof"
com.umeng.common.Log .e ( v1,v2,v0 );
} // .end method
void a ( android.content.Context p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 122 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* if-nez p2, :cond_1 */
/* .line 129 */
} // :cond_0
} // :goto_0
return;
/* .line 126 */
} // :cond_1
v0 = this.d;
/* new-instance v1, Lcom/umeng/analytics/a/d; */
/* invoke-direct {v1, p2}, Lcom/umeng/analytics/a/d;-><init>(Ljava/lang/Throwable;)V */
(( com.umeng.analytics.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/analytics/c;->a(Lcom/umeng/analytics/a/d;)V
/* .line 128 */
(( com.umeng.analytics.b ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/b;->e(Landroid/content/Context;)V
} // .end method
void a ( java.lang.String p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 59 */
try { // :try_start_0
v0 = this.w;
/* new-instance v1, Lcom/umeng/analytics/f; */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* invoke-direct {v1, p1, v2, v3}, Lcom/umeng/analytics/f;-><init>(Ljava/lang/String;J)V */
(( java.util.Stack ) v0 ).push ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 63 */
} // :goto_0
return;
/* .line 60 */
/* :catch_0 */
/* move-exception v0 */
/* .line 61 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
void a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 83 */
v0 = this.e;
this.E = p1;
/* .line 84 */
v0 = this.e;
this.F = p2;
/* .line 85 */
return;
} // .end method
Boolean a ( java.lang.String p0, Integer p1 ) {
/* .locals 2 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 509 */
/* if-nez p1, :cond_1 */
/* .line 519 */
} // :cond_0
} // :goto_0
/* .line 513 */
} // :cond_1
(( java.lang.String ) p1 ).getBytes ( ); // invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
/* array-length v1, v1 */
/* .line 515 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-gt v1, p2, :cond_0 */
/* .line 519 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
Boolean a ( java.util.Map p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 523 */
v0 = if ( p1 != null) { // if-eqz p1, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 524 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "map is null or empty in onEvent"; // const-string v1, "map is null or empty in onEvent"
com.umeng.common.Log .b ( v0,v1 );
/* move v0, v2 */
/* .line 535 */
} // :goto_0
/* .line 528 */
} // :cond_1
v0 = } // :cond_2
/* if-nez v0, :cond_3 */
/* move v0, v3 */
/* .line 535 */
/* .line 528 */
} // :cond_3
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 529 */
/* check-cast v1, Ljava/lang/String; */
/* const/16 v5, 0x80 */
v1 = (( com.umeng.analytics.b ) p0 ).a ( v1, v5 ); // invoke-virtual {p0, v1, v5}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;I)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* check-cast v1, Ljava/lang/String; */
/* const/16 v5, 0x100 */
v1 = (( com.umeng.analytics.b ) p0 ).a ( v1, v5 ); // invoke-virtual {p0, v1, v5}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;I)Z
/* if-nez v1, :cond_2 */
/* .line 530 */
} // :cond_4
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v4 = "invalid key-<%s> or value-<%s> "; // const-string v4, "invalid key-<%s> or value-<%s> "
int v5 = 2; // const/4 v5, 0x2
/* new-array v5, v5, [Ljava/lang/Object; */
/* aput-object v6, v5, v2 */
/* aput-object v0, v5, v3 */
java.lang.String .format ( v4,v5 );
com.umeng.common.Log .b ( v1,v0 );
/* move v0, v2 */
/* .line 531 */
} // .end method
void b ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 179 */
try { // :try_start_0
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/b;->h(Landroid/content/Context;)V */
/* .line 181 */
v0 = this.a;
/* new-instance v1, Lcom/umeng/analytics/b$a; */
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v1, p0, p1, v2}, Lcom/umeng/analytics/b$a;-><init>(Lcom/umeng/analytics/b;Landroid/content/Context;I)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 187 */
} // :goto_0
return;
/* .line 183 */
/* :catch_0 */
/* move-exception v0 */
/* .line 184 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
/* .line 185 */
final String v2 = "Exception occurred in Mobclick.onResume()."; // const-string v2, "Exception occurred in Mobclick.onResume()."
/* .line 184 */
com.umeng.common.Log .b ( v1,v2,v0 );
} // .end method
void b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 412 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* const/16 v0, 0x80 */
v0 = (( com.umeng.analytics.b ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;I)Z
/* if-nez v0, :cond_1 */
/* .line 413 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "invalid params in onEventBegin"; // const-string v1, "invalid params in onEventBegin"
com.umeng.common.Log .b ( v0,v1 );
/* .line 418 */
} // :goto_0
return;
/* .line 417 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "_t"; // const-string v1, "_t"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/b;->d(Landroid/content/Context;Ljava/lang/String;)V */
} // .end method
void b ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 7 */
/* .prologue */
/* .line 443 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = android.text.TextUtils .isEmpty ( p3 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 444 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "invalid params in onEventEnd"; // const-string v1, "invalid params in onEventEnd"
com.umeng.common.Log .b ( v0,v1 );
/* .line 453 */
} // :goto_0
return;
/* .line 447 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "_tl"; // const-string v1, "_tl"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/b;->e(Landroid/content/Context;Ljava/lang/String;)I */
/* .line 448 */
/* if-gez v0, :cond_2 */
/* .line 449 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "event duration less than 0 in onEvnetEnd"; // const-string v1, "event duration less than 0 in onEvnetEnd"
com.umeng.common.Log .b ( v0,v1 );
/* .line 452 */
} // :cond_2
/* int-to-long v4, v0 */
int v6 = 1; // const/4 v6, 0x1
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JI)V */
} // .end method
public void b ( android.content.Context p0, java.lang.Throwable p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 551 */
try { // :try_start_0
v0 = this.d;
/* new-instance v1, Lcom/umeng/analytics/a/d; */
/* invoke-direct {v1, p2}, Lcom/umeng/analytics/a/d;-><init>(Ljava/lang/Throwable;)V */
(( com.umeng.analytics.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/analytics/c;->a(Lcom/umeng/analytics/a/d;)V
/* .line 552 */
v0 = this.w;
v0 = (( java.util.Stack ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z
/* if-nez v0, :cond_0 */
/* .line 553 */
v0 = this.w;
(( java.util.Stack ) v0 ).peek ( ); // invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/analytics/f; */
v0 = this.a;
(( com.umeng.analytics.b ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/umeng/analytics/b;->b(Ljava/lang/String;)V
/* .line 555 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/b;->j(Landroid/content/Context;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 559 */
} // :goto_0
return;
/* .line 556 */
/* :catch_0 */
/* move-exception v0 */
/* .line 557 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "Exception in onAppCrash"; // const-string v2, "Exception in onAppCrash"
com.umeng.common.Log .a ( v1,v2,v0 );
} // .end method
void b ( java.lang.String p0 ) {
/* .locals 5 */
/* .prologue */
/* .line 67 */
try { // :try_start_0
v0 = this.w;
v0 = (( java.util.Stack ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z
/* if-nez v0, :cond_0 */
v0 = this.w;
(( java.util.Stack ) v0 ).peek ( ); // invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/analytics/f; */
v0 = this.a;
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 68 */
v0 = this.w;
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/analytics/f; */
/* .line 69 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* iget-wide v3, v0, Lcom/umeng/analytics/f;->b:J */
/* sub-long/2addr v1, v3 */
/* .line 72 */
/* iput-wide v1, v0, Lcom/umeng/analytics/f;->b:J */
/* .line 73 */
v1 = this.x;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 80 */
} // :goto_0
return;
/* .line 75 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "onPageEnd called without \'PageName\' from corresponding onPageStart"; // const-string v1, "onPageEnd called without \'PageName\' from corresponding onPageStart"
com.umeng.common.Log .e ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 77 */
/* :catch_0 */
/* move-exception v0 */
/* .line 78 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
void c ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 191 */
int v0 = 2; // const/4 v0, 0x2
try { // :try_start_0
(( com.umeng.analytics.b ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;I)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 195 */
} // :goto_0
return;
/* .line 192 */
/* :catch_0 */
/* move-exception v0 */
/* .line 193 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "Exception occurred in Mobclick.flush()."; // const-string v2, "Exception occurred in Mobclick.flush()."
com.umeng.common.Log .b ( v1,v2,v0 );
} // .end method
void c ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 7 */
/* .prologue */
/* .line 421 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = android.text.TextUtils .isEmpty ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 422 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "input Context is null or event_id is empty"; // const-string v1, "input Context is null or event_id is empty"
com.umeng.common.Log .a ( v0,v1 );
/* .line 432 */
} // :goto_0
return;
/* .line 425 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "_t"; // const-string v1, "_t"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/b;->e(Landroid/content/Context;Ljava/lang/String;)I */
/* .line 427 */
/* if-gez v0, :cond_2 */
/* .line 428 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "event duration less than 0 in onEventEnd"; // const-string v1, "event duration less than 0 in onEventEnd"
com.umeng.common.Log .b ( v0,v1 );
/* .line 431 */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
/* int-to-long v4, v0 */
int v6 = 1; // const/4 v6, 0x1
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JI)V */
} // .end method
void c ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 6 */
/* .prologue */
/* .line 484 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = android.text.TextUtils .isEmpty ( p2 );
/* if-nez v0, :cond_0 */
v0 = android.text.TextUtils .isEmpty ( p3 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 485 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "invalid params in onKVEventEnd"; // const-string v1, "invalid params in onKVEventEnd"
com.umeng.common.Log .b ( v0,v1 );
/* .line 499 */
} // :goto_0
return;
/* .line 490 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p2 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 492 */
v1 = /* invoke-direct {p0, p1, v0}, Lcom/umeng/analytics/b;->e(Landroid/content/Context;Ljava/lang/String;)I */
/* .line 493 */
/* if-gez v1, :cond_2 */
/* .line 494 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "event duration less than 0 in onEvnetEnd"; // const-string v1, "event duration less than 0 in onEvnetEnd"
com.umeng.common.Log .b ( v0,v1 );
/* .line 498 */
} // :cond_2
v2 = this.d;
(( com.umeng.analytics.c ) v2 ).c ( v0 ); // invoke-virtual {v2, v0}, Lcom/umeng/analytics/c;->c(Ljava/lang/String;)Ljava/util/HashMap;
/* int-to-long v4, v1 */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* invoke-virtual/range {v0 ..v5}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;J)V */
} // .end method
void d ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 540 */
try { // :try_start_0
v0 = this.w;
v0 = (( java.util.Stack ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z
/* if-nez v0, :cond_0 */
/* .line 541 */
v0 = this.w;
(( java.util.Stack ) v0 ).peek ( ); // invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/analytics/f; */
v0 = this.a;
(( com.umeng.analytics.b ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/umeng/analytics/b;->b(Ljava/lang/String;)V
/* .line 543 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/b;->j(Landroid/content/Context;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 547 */
} // :goto_0
return;
/* .line 544 */
/* :catch_0 */
/* move-exception v0 */
/* .line 545 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
