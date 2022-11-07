public class com.umeng.analytics.c {
	 /* .source "MessageBuffer.java" */
	 /* # instance fields */
	 private com.umeng.analytics.a.i a;
	 private java.util.HashMap b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Lcom/umeng/analytics/k;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.util.HashMap c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
private Integer d;
/* # direct methods */
public com.umeng.analytics.c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 27 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 29 */
/* new-instance v0, Lcom/umeng/analytics/a/i; */
/* invoke-direct {v0}, Lcom/umeng/analytics/a/i;-><init>()V */
this.a = v0;
/* .line 32 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
/* .line 33 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.c = v0;
/* .line 35 */
/* const/16 v0, 0xa */
/* iput v0, p0, Lcom/umeng/analytics/c;->d:I */
/* .line 27 */
return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.a;
v0 = (( com.umeng.analytics.a.i ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/i;->b()I
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 38 */
/* iput p1, p0, Lcom/umeng/analytics/c;->d:I */
/* .line 39 */
return;
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 106 */
v0 = (( com.umeng.analytics.c ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/umeng/analytics/c;->a()I
/* if-gtz v0, :cond_0 */
/* .line 123 */
} // :goto_0
return;
/* .line 110 */
} // :cond_0
com.umeng.common.b .d ( p1 );
/* .line 111 */
com.umeng.analytics.j .a ( p1,v0 );
/* .line 113 */
/* new-instance v2, Lcom/umeng/analytics/a/i; */
/* invoke-direct {v2}, Lcom/umeng/analytics/a/i;-><init>()V */
/* .line 115 */
if ( v1 != null) { // if-eqz v1, :cond_1
(( com.umeng.analytics.a.i ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lcom/umeng/analytics/a/i;->a(Lorg/json/JSONObject;)V
/* .line 117 */
} // :cond_1
/* monitor-enter p0 */
/* .line 118 */
try { // :try_start_0
v1 = this.a;
(( com.umeng.analytics.a.i ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/i;)V
/* .line 119 */
v1 = this.a;
(( com.umeng.analytics.a.i ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/umeng/analytics/a/i;->c()V
/* .line 117 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 122 */
com.umeng.analytics.j .a ( p1,v2,v0 );
/* .line 117 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
public synchronized void a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 86 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.a;
(( com.umeng.analytics.a.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/d;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 87 */
/* monitor-exit p0 */
return;
/* .line 86 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 90 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.a;
(( com.umeng.analytics.a.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/h;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 91 */
/* monitor-exit p0 */
return;
/* .line 90 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 94 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.a;
	 (( com.umeng.analytics.a.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/m;)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 95 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 94 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public void a ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 49 */
	 v0 = this.b;
	 v0 = 	 (( java.util.HashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 50 */
		 v0 = this.b;
		 (( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Lcom/umeng/analytics/k; */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v1 */
		 java.lang.Long .valueOf ( v1,v2 );
		 (( com.umeng.analytics.k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/analytics/k;->a(Ljava/lang/Long;)V
		 /* .line 56 */
	 } // :goto_0
	 return;
	 /* .line 52 */
} // :cond_0
/* new-instance v0, Lcom/umeng/analytics/k; */
/* invoke-direct {v0, p1}, Lcom/umeng/analytics/k;-><init>(Ljava/lang/String;)V */
/* .line 53 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
(( com.umeng.analytics.k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/analytics/k;->a(Ljava/lang/Long;)V
/* .line 54 */
v1 = this.b;
(( java.util.HashMap ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public synchronized void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2, Long p3, Integer p4 ) {
/* .locals 8 */
/* .prologue */
/* .line 78 */
/* monitor-enter p0 */
try { // :try_start_0
	 v7 = this.a;
	 /* new-instance v0, Lcom/umeng/analytics/a/e; */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move-object v3, p3 */
	 /* move v4, p6 */
	 /* move-wide v5, p4 */
	 /* invoke-direct/range {v0 ..v6}, Lcom/umeng/analytics/a/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V */
	 (( com.umeng.analytics.a.i ) v7 ).a ( v0 ); // invoke-virtual {v7, v0}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/e;)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 79 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 78 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized void a ( java.lang.String p0, java.lang.String p1, java.util.HashMap p2, Long p3 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;J)V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 82 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.a;
	 /* new-instance v1, Lcom/umeng/analytics/a/a; */
	 /* invoke-direct {v1, p2, p3, p4, p5}, Lcom/umeng/analytics/a/a;-><init>(Ljava/lang/String;Ljava/util/HashMap;J)V */
	 (( com.umeng.analytics.a.i ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/umeng/analytics/a/i;->a(Ljava/lang/String;Lcom/umeng/analytics/a/a;)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 83 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 82 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public void a ( java.lang.String p0, java.util.HashMap p1 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;)V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 66 */
v0 = this.c;
v0 = (( java.util.HashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
v0 = this.c;
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 67 */
} // :cond_0
return;
} // .end method
public Long b ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 59 */
v0 = this.b;
v0 = (( java.util.HashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 60 */
v0 = this.b;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/analytics/k; */
(( com.umeng.analytics.k ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/k;->a()Ljava/lang/Long;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* .line 62 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
/* const-wide/16 v0, -0x1 */
} // .end method
public void b ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 130 */
com.umeng.common.b .d ( p1 );
com.umeng.analytics.j .a ( p1,v0 );
/* .line 132 */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( org.json.JSONObject ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->length()I
/* if-nez v1, :cond_1 */
/* .line 142 */
} // :cond_0
} // :goto_0
return;
/* .line 136 */
} // :cond_1
/* new-instance v1, Lcom/umeng/analytics/a/i; */
/* invoke-direct {v1}, Lcom/umeng/analytics/a/i;-><init>()V */
/* .line 137 */
(( com.umeng.analytics.a.i ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/umeng/analytics/a/i;->a(Lorg/json/JSONObject;)V
/* .line 139 */
/* monitor-enter p0 */
/* .line 140 */
try { // :try_start_0
v0 = this.a;
(( com.umeng.analytics.a.i ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/i;)V
/* .line 139 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .prologue */
/* .line 46 */
v0 = this.a;
v0 = (( com.umeng.analytics.a.i ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/i;->b()I
/* iget v1, p0, Lcom/umeng/analytics/c;->d:I */
/* if-le v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.util.HashMap c ( java.lang.String p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 70 */
v0 = this.b;
v0 = (( java.util.HashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/analytics/k; */
v0 = (( com.umeng.analytics.k ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/k;->b()I
/* if-lez v0, :cond_0 */
/* .line 71 */
v0 = this.c;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 73 */
} // :goto_0
} // :cond_0
v0 = this.c;
(( java.util.HashMap ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/HashMap; */
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 98 */
v0 = this.a;
v0 = (( com.umeng.analytics.a.i ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/i;->a()Z
} // .end method
public synchronized org.json.JSONObject d ( ) {
/* .locals 3 */
/* .prologue */
/* .line 145 */
/* monitor-enter p0 */
/* .line 147 */
try { // :try_start_0
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
/* .line 148 */
v1 = this.a;
(( com.umeng.analytics.a.i ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lcom/umeng/analytics/a/i;->b(Lorg/json/JSONObject;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 153 */
} // :goto_0
/* monitor-exit p0 */
/* .line 151 */
/* :catch_0 */
/* move-exception v0 */
/* .line 152 */
try { // :try_start_1
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = ""; // const-string v2, ""
android.util.Log .d ( v1,v2,v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 153 */
int v0 = 0; // const/4 v0, 0x0
/* .line 145 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void e ( ) {
/* .locals 1 */
/* .prologue */
/* .line 158 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.a;
(( com.umeng.analytics.a.i ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/i;->c()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 159 */
/* monitor-exit p0 */
return;
/* .line 158 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
