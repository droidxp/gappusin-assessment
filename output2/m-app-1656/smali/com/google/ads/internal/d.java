public class com.google.ads.internal.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 private static final java.lang.Object a;
	 /* # instance fields */
	 private final com.google.ads.m b;
	 private com.google.ads.internal.c c;
	 private com.google.ads.AdRequest d;
	 private com.google.ads.internal.g e;
	 private com.google.ads.internal.AdWebView f;
	 private com.google.ads.internal.i g;
	 private android.os.Handler h;
	 private Long i;
	 private Boolean j;
	 private Boolean k;
	 private Boolean l;
	 private Boolean m;
	 private android.content.SharedPreferences n;
	 private Long o;
	 private com.google.ads.ab p;
	 private Boolean q;
	 private java.util.LinkedList r;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/LinkedList", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.util.LinkedList s;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Integer t;
private java.lang.Boolean u;
private com.google.ads.d v;
private com.google.ads.e w;
private com.google.ads.f x;
private java.lang.String y;
/* # direct methods */
static com.google.ads.internal.d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 80 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public com.google.ads.internal.d ( ) {
/* .locals 8 */
/* .prologue */
/* const-wide/16 v6, 0x0 */
int v1 = 0; // const/4 v1, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 188 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 144 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/google/ads/internal/d;->t:I */
/* .line 305 */
this.y = v5;
/* .line 189 */
this.b = p1;
/* .line 190 */
/* iput-boolean p2, p0, Lcom/google/ads/internal/d;->q:Z */
/* .line 193 */
/* new-instance v0, Lcom/google/ads/internal/g; */
/* invoke-direct {v0}, Lcom/google/ads/internal/g;-><init>()V */
this.e = v0;
/* .line 197 */
this.c = v5;
/* .line 200 */
this.d = v5;
/* .line 204 */
/* iput-boolean v1, p0, Lcom/google/ads/internal/d;->k:Z */
/* .line 207 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.h = v0;
/* .line 210 */
/* iput-wide v6, p0, Lcom/google/ads/internal/d;->o:J */
/* .line 211 */
/* iput-boolean v1, p0, Lcom/google/ads/internal/d;->l:Z */
/* .line 212 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/internal/d;->m:Z */
/* .line 214 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* if-nez v0, :cond_1 */
/* .line 258 */
} // :cond_0
} // :goto_0
return;
/* .line 221 */
} // :cond_1
v1 = com.google.ads.internal.d.a;
/* monitor-enter v1 */
/* .line 222 */
try { // :try_start_0
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
final String v2 = "GoogleAdMobAdsPrefs"; // const-string v2, "GoogleAdMobAdsPrefs"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) v0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
this.n = v0;
/* .line 224 */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 225 */
v0 = this.n;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Timeout"; // const-string v3, "Timeout"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.b;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const-wide/16 v3, -0x1 */
/* move-result-wide v2 */
/* .line 227 */
/* cmp-long v0, v2, v6 */
/* if-gez v0, :cond_2 */
/* .line 229 */
/* const-wide/16 v2, 0x1388 */
/* iput-wide v2, p0, Lcom/google/ads/internal/d;->i:J */
/* .line 237 */
} // :goto_1
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 240 */
/* new-instance v0, Lcom/google/ads/ab; */
/* invoke-direct {v0, p0}, Lcom/google/ads/ab;-><init>(Lcom/google/ads/internal/d;)V */
this.p = v0;
/* .line 243 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.r = v0;
/* .line 246 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.s = v0;
/* .line 249 */
(( com.google.ads.internal.d ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->a()V
/* .line 252 */
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
com.google.ads.util.AdUtil .h ( v0 );
/* .line 254 */
/* new-instance v0, Lcom/google/ads/d; */
/* invoke-direct {v0}, Lcom/google/ads/d;-><init>()V */
this.v = v0;
/* .line 255 */
/* new-instance v0, Lcom/google/ads/e; */
/* invoke-direct {v0, p0}, Lcom/google/ads/e;-><init>(Lcom/google/ads/internal/d;)V */
this.w = v0;
/* .line 256 */
this.u = v5;
/* .line 257 */
this.x = v5;
/* .line 232 */
} // :cond_2
try { // :try_start_1
/* iput-wide v2, p0, Lcom/google/ads/internal/d;->i:J */
/* .line 237 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
/* .line 235 */
} // :cond_3
/* const-wide/32 v2, 0xea60 */
try { // :try_start_2
/* iput-wide v2, p0, Lcom/google/ads/internal/d;->i:J */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
private void a ( Object p0, java.lang.Boolean p1 ) {
/* .locals 6 */
/* .prologue */
/* .line 784 */
(( com.google.ads.f ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/google/ads/f;->d()Ljava/util/List;
/* .line 785 */
/* if-nez v1, :cond_0 */
/* .line 786 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 787 */
final String v0 = "http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@"; // const-string v0, "http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@"
/* .line 791 */
} // :cond_0
(( com.google.ads.f ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/google/ads/f;->b()Ljava/lang/String;
/* .line 792 */
(( com.google.ads.f ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/google/ads/f;->a()Ljava/lang/String;
/* .line 793 */
(( com.google.ads.f ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/google/ads/f;->c()Ljava/lang/String;
/* move-object v0, p0 */
/* move-object v5, p2 */
/* .line 794 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/ads/internal/d;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 795 */
return;
} // .end method
private void a ( java.util.List p0, java.lang.String p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 829 */
/* if-nez p1, :cond_0 */
/* .line 830 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 831 */
final String v0 = "http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@"; // const-string v0, "http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@"
} // :goto_0
/* move-object v0, p0 */
/* move-object v3, v2 */
/* move-object v4, p2 */
/* move-object v5, v2 */
/* .line 834 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/ads/internal/d;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 840 */
return;
} // :cond_0
/* move-object v1, p1 */
} // .end method
private void a ( java.util.List p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.Boolean p4 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Boolean;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 850 */
v0 = this.b;
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
com.google.ads.util.AdUtil .a ( v0 );
/* .line 853 */
com.google.ads.b .a ( );
/* .line 854 */
(( com.google.ads.b ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/b;->b()Ljava/math/BigInteger;
(( java.math.BigInteger ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;
/* .line 855 */
(( com.google.ads.b ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/b;->c()Ljava/math/BigInteger;
(( java.math.BigInteger ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;
/* .line 856 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/lang/String; */
/* .line 857 */
v1 = this.b;
v1 = this.b;
(( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
/* move-object v2, p5 */
/* move-object v4, p2 */
/* move-object v5, p3 */
/* move-object v6, p4 */
/* invoke-static/range {v0 ..v8}, Lcom/google/ads/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; */
/* .line 866 */
/* new-instance v2, Ljava/lang/Thread; */
/* new-instance v4, Lcom/google/ads/aa; */
v0 = this.b;
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
/* invoke-direct {v4, v1, v0}, Lcom/google/ads/aa;-><init>(Ljava/lang/String;Landroid/content/Context;)V */
/* invoke-direct {v2, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 868 */
(( java.lang.Thread ) v2 ).start ( ); // invoke-virtual {v2}, Ljava/lang/Thread;->start()V
/* .line 870 */
} // :cond_0
return;
} // .end method
private void b ( Object p0, java.lang.Boolean p1 ) {
/* .locals 6 */
/* .prologue */
/* .line 808 */
(( com.google.ads.f ) p1 ).e ( ); // invoke-virtual {p1}, Lcom/google/ads/f;->e()Ljava/util/List;
/* .line 809 */
/* if-nez v1, :cond_0 */
/* .line 810 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 811 */
final String v0 = "http://e.admob.com/clk?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@"; // const-string v0, "http://e.admob.com/clk?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@"
/* .line 815 */
} // :cond_0
(( com.google.ads.f ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/google/ads/f;->b()Ljava/lang/String;
/* .line 816 */
(( com.google.ads.f ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/google/ads/f;->a()Ljava/lang/String;
/* .line 817 */
(( com.google.ads.f ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/google/ads/f;->c()Ljava/lang/String;
/* move-object v0, p0 */
/* move-object v5, p2 */
/* .line 818 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/ads/internal/d;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V */
/* .line 819 */
return;
} // .end method
/* # virtual methods */
protected synchronized void A ( ) {
/* .locals 6 */
/* .prologue */
/* .line 1067 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.b;
v0 = this.c;
(( com.google.ads.util.i$d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$d;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
/* .line 1068 */
/* if-nez v0, :cond_1 */
/* .line 1069 */
final String v0 = "activity was null while trying to ping click tracking URLs."; // const-string v0, "activity was null while trying to ping click tracking URLs."
com.google.ads.util.b .e ( v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1079 */
} // :cond_0
/* monitor-exit p0 */
return;
/* .line 1074 */
} // :cond_1
try { // :try_start_1
v1 = this.s;
(( java.util.LinkedList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/lang/String; */
/* .line 1075 */
/* new-instance v3, Ljava/lang/Thread; */
/* new-instance v4, Lcom/google/ads/aa; */
(( android.app.Activity ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
/* invoke-direct {v4, v1, v5}, Lcom/google/ads/aa;-><init>(Ljava/lang/String;Landroid/content/Context;)V */
/* invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 1077 */
(( java.lang.Thread ) v3 ).start ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->start()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 1067 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
protected synchronized void B ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1089 */
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
this.c = v0;
/* .line 1092 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/internal/d;->k:Z */
/* .line 1095 */
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
(( com.google.ads.internal.AdWebView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/AdWebView;->setVisibility(I)V
/* .line 1099 */
v0 = this.b;
v0 = (( com.google.ads.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1100 */
v0 = this.f;
(( com.google.ads.internal.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/internal/d;->a(Landroid/view/View;)V
/* .line 1104 */
} // :cond_0
v0 = this.e;
(( com.google.ads.internal.g ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->c()V
/* .line 1107 */
v0 = this.b;
v0 = (( com.google.ads.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1108 */
(( com.google.ads.internal.d ) p0 ).w ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->w()V
/* .line 1111 */
} // :cond_1
final String v0 = "onReceiveAd()"; // const-string v0, "onReceiveAd()"
com.google.ads.util.b .c ( v0 );
/* .line 1114 */
v0 = this.b;
v0 = this.j;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/AdListener; */
/* .line 1115 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 1116 */
v1 = this.b;
v1 = this.f;
(( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v1, Lcom/google/ads/Ad; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1118 */
} // :cond_2
/* monitor-exit p0 */
return;
/* .line 1089 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public java.lang.Boolean C ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1150 */
v0 = this.u;
} // .end method
public synchronized void a ( ) {
/* .locals 3 */
/* .prologue */
/* .line 268 */
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v1, Lcom/google/ads/internal/AdWebView; */
v2 = this.b;
v0 = this.b;
v0 = this.i;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/internal/h; */
(( com.google.ads.internal.h ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->b()Lcom/google/ads/AdSize;
/* invoke-direct {v1, v2, v0}, Lcom/google/ads/internal/AdWebView;-><init>(Lcom/google/ads/m;Lcom/google/ads/AdSize;)V */
this.f = v1;
/* .line 270 */
v0 = this.f;
/* const/16 v1, 0x8 */
(( com.google.ads.internal.AdWebView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/AdWebView;->setVisibility(I)V
/* .line 273 */
v0 = com.google.ads.internal.a.c;
int v1 = 1; // const/4 v1, 0x1
v2 = this.b;
v2 = (( com.google.ads.m ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/google/ads/m;->b()Z
com.google.ads.internal.i .a ( p0,v0,v1,v2 );
this.g = v0;
/* .line 275 */
v0 = this.f;
v1 = this.g;
(( com.google.ads.internal.AdWebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/AdWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 278 */
v0 = this.b;
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l; */
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l$a; */
/* .line 279 */
v0 = this.a;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* if-ge v1, v0, :cond_0 */
v0 = this.b;
v0 = this.i;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/internal/h; */
v0 = (( com.google.ads.internal.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->a()Z
/* if-nez v0, :cond_0 */
/* .line 281 */
final String v0 = "Disabling hardware acceleration for a banner."; // const-string v0, "Disabling hardware acceleration for a banner."
com.google.ads.util.b .a ( v0 );
/* .line 282 */
v0 = this.f;
(( com.google.ads.internal.AdWebView ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->b()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 284 */
} // :cond_0
/* monitor-exit p0 */
return;
/* .line 268 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( Float p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 976 */
/* monitor-enter p0 */
/* const/high16 v0, 0x447a0000 # 1000.0f */
/* mul-float/2addr v0, p1 */
/* float-to-long v0, v0 */
try { // :try_start_0
/* iput-wide v0, p0, Lcom/google/ads/internal/d;->o:J */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 977 */
/* monitor-exit p0 */
return;
/* .line 976 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( Integer p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 453 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput p1, p0, Lcom/google/ads/internal/d;->t:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 454 */
/* monitor-exit p0 */
return;
/* .line 453 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void a ( Long p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 942 */
v1 = com.google.ads.internal.d.a;
/* monitor-enter v1 */
/* .line 943 */
try { // :try_start_0
v0 = this.n;
/* .line 944 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Timeout"; // const-string v3, "Timeout"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.b;
v3 = this.b;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 945 */
/* .line 947 */
/* iget-boolean v0, p0, Lcom/google/ads/internal/d;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 948 */
/* iput-wide p1, p0, Lcom/google/ads/internal/d;->i:J */
/* .line 950 */
} // :cond_0
/* monitor-exit v1 */
/* .line 951 */
return;
/* .line 950 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 966 */
v0 = this.b;
v0 = this.e;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/view/ViewGroup; */
(( android.view.ViewGroup ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
/* .line 967 */
v0 = this.b;
v0 = this.e;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/view/ViewGroup; */
(( android.view.ViewGroup ) v0 ).addView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 968 */
return;
} // .end method
public synchronized void a ( android.view.View p0, Object p1, Object p2, Boolean p3 ) {
/* .locals 2 */
/* .prologue */
/* .line 643 */
/* monitor-enter p0 */
try { // :try_start_0
final String v0 = "AdManager.onReceiveGWhirlAd() called."; // const-string v0, "AdManager.onReceiveGWhirlAd() called."
com.google.ads.util.b .a ( v0 );
/* .line 646 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/internal/d;->k:Z */
/* .line 647 */
this.x = p3;
/* .line 651 */
v0 = this.b;
v0 = (( com.google.ads.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 652 */
(( com.google.ads.internal.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/ads/internal/d;->a(Landroid/view/View;)V
/* .line 653 */
java.lang.Boolean .valueOf ( p4 );
/* invoke-direct {p0, p3, v0}, Lcom/google/ads/internal/d;->a(Lcom/google/ads/f;Ljava/lang/Boolean;)V */
/* .line 657 */
} // :cond_0
v0 = this.w;
(( com.google.ads.e ) v0 ).d ( p2 ); // invoke-virtual {v0, p2}, Lcom/google/ads/e;->d(Lcom/google/ads/h;)V
/* .line 660 */
v0 = this.b;
v0 = this.j;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/AdListener; */
/* .line 661 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 662 */
v1 = this.b;
v1 = this.f;
(( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v1, Lcom/google/ads/Ad; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 664 */
} // :cond_1
/* monitor-exit p0 */
return;
/* .line 643 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( com.google.ads.AdRequest$ErrorCode p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 578 */
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
this.c = v0;
/* .line 581 */
v0 = this.b;
v0 = (( com.google.ads.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 582 */
v0 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
/* if-ne p1, v0, :cond_2 */
/* .line 583 */
(( com.google.ads.internal.d ) p0 ).l ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->l()Lcom/google/ads/internal/g;
/* .line 584 */
(( com.google.ads.internal.g ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->n()V
/* .line 591 */
} // :cond_0
} // :goto_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "onFailedToReceiveAd("; // const-string v1, "onFailedToReceiveAd("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .c ( v0 );
/* .line 594 */
v0 = this.b;
v0 = this.j;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/AdListener; */
/* .line 595 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 596 */
v1 = this.b;
v1 = this.f;
(( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v1, Lcom/google/ads/Ad; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 598 */
} // :cond_1
/* monitor-exit p0 */
return;
/* .line 585 */
} // :cond_2
try { // :try_start_1
v0 = com.google.ads.AdRequest$ErrorCode.NETWORK_ERROR;
/* if-ne p1, v0, :cond_0 */
/* .line 586 */
(( com.google.ads.internal.d ) p0 ).l ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->l()Lcom/google/ads/internal/g;
/* .line 587 */
(( com.google.ads.internal.g ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->l()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 578 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( com.google.ads.AdRequest p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 518 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = (( com.google.ads.internal.d ) p0 ).o ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->o()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 519 */
final String v0 = "loadAd called while the ad is already loading, so aborting."; // const-string v0, "loadAd called while the ad is already loading, so aborting."
com.google.ads.util.b .e ( v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 566 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 525 */
} // :cond_1
try { // :try_start_1
v0 = com.google.ads.AdActivity .isShowing ( );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 526 */
final String v0 = "loadAd called while an interstitial or landing page is displayed, so aborting"; // const-string v0, "loadAd called while an interstitial or landing page is displayed, so aborting"
com.google.ads.util.b .e ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 518 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 533 */
} // :cond_2
try { // :try_start_2
v0 = this.b;
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
v0 = com.google.ads.util.AdUtil .c ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 536 */
v0 = this.b;
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
v0 = com.google.ads.util.AdUtil .b ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 541 */
v0 = this.n;
final String v1 = "GoogleAdMobDoritosLife"; // const-string v1, "GoogleAdMobDoritosLife"
/* const-wide/32 v2, 0xea60 */
/* move-result-wide v1 */
/* .line 543 */
v0 = this.b;
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
v0 = com.google.ads.ae .a ( v0,v1,v2 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 544 */
v0 = this.b;
v0 = this.c;
(( com.google.ads.util.i$d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$d;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
com.google.ads.ae .a ( v0 );
/* .line 549 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/ads/internal/d;->k:Z */
/* .line 550 */
v0 = this.r;
(( java.util.LinkedList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V
/* .line 553 */
this.d = p1;
/* .line 557 */
v0 = this.v;
v0 = (( com.google.ads.d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/d;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 558 */
v0 = this.w;
v1 = this.v;
(( com.google.ads.d ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/google/ads/d;->b()Lcom/google/ads/c;
(( com.google.ads.e ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lcom/google/ads/e;->a(Lcom/google/ads/c;Lcom/google/ads/AdRequest;)V
/* .line 564 */
} // :cond_4
/* new-instance v0, Lcom/google/ads/internal/c; */
/* invoke-direct {v0, p0}, Lcom/google/ads/internal/c;-><init>(Lcom/google/ads/internal/d;)V */
this.c = v0;
/* .line 565 */
v0 = this.c;
(( com.google.ads.internal.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest;)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* goto/16 :goto_0 */
} // .end method
public synchronized void a ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 611 */
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
this.c = v0;
/* .line 613 */
v0 = (( com.google.ads.c ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 614 */
v0 = (( com.google.ads.c ) p1 ).e ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->e()I
/* int-to-float v0, v0 */
(( com.google.ads.internal.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/internal/d;->a(F)V
/* .line 615 */
v0 = (( com.google.ads.internal.d ) p0 ).r ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->r()Z
/* if-nez v0, :cond_0 */
/* .line 616 */
(( com.google.ads.internal.d ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->f()V
/* .line 624 */
} // :cond_0
} // :goto_0
v0 = this.w;
v1 = this.d;
(( com.google.ads.e ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/google/ads/e;->a(Lcom/google/ads/c;Lcom/google/ads/AdRequest;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 625 */
/* monitor-exit p0 */
return;
/* .line 619 */
} // :cond_1
try { // :try_start_1
v0 = (( com.google.ads.internal.d ) p0 ).r ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->r()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 620 */
(( com.google.ads.internal.d ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->e()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 611 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( Object p0, Boolean p1 ) {
/* .locals 5 */
/* .prologue */
/* .line 678 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = java.util.Locale.US;
final String v1 = "AdManager.onGWhirlAdClicked(%b) called."; // const-string v1, "AdManager.onGWhirlAdClicked(%b) called."
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
java.lang.Boolean .valueOf ( p2 );
/* aput-object v4, v2, v3 */
java.lang.String .format ( v0,v1,v2 );
com.google.ads.util.b .a ( v0 );
/* .line 682 */
java.lang.Boolean .valueOf ( p2 );
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/internal/d;->b(Lcom/google/ads/f;Ljava/lang/Boolean;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 683 */
/* monitor-exit p0 */
return;
/* .line 678 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void a ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 901 */
v0 = this.h;
(( android.os.Handler ) v0 ).post ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 902 */
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 6 */
/* .prologue */
/* .line 311 */
/* new-instance v0, Landroid/net/Uri$Builder; */
/* invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V */
(( android.net.Uri$Builder ) v0 ).encodedQuery ( p1 ); // invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedQuery(Ljava/lang/String;)Landroid/net/Uri$Builder;
(( android.net.Uri$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
/* .line 313 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 314 */
com.google.ads.util.AdUtil .b ( v0 );
/* .line 315 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/lang/String; */
/* .line 316 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = " = "; // const-string v5, " = "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v0, Ljava/lang/String; */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\n"; // const-string v4, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 323 */
} // :cond_0
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
this.y = v0;
/* .line 324 */
v0 = this.y;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 325 */
int v0 = 0; // const/4 v0, 0x0
this.y = v0;
/* .line 327 */
} // :cond_1
return;
} // .end method
protected synchronized void a ( java.util.LinkedList p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 1141 */
/* monitor-enter p0 */
try { // :try_start_0
(( java.util.LinkedList ) p1 ).iterator ( ); // invoke-virtual {p1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/lang/String; */
/* .line 1142 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Adding a click tracking URL: "; // const-string v3, "Adding a click tracking URL: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1141 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* .line 1144 */
} // :cond_0
try { // :try_start_1
this.s = p1;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 1145 */
/* monitor-exit p0 */
return;
} // .end method
public synchronized void a ( Boolean p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 959 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput-boolean p1, p0, Lcom/google/ads/internal/d;->j:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 960 */
/* monitor-exit p0 */
return;
/* .line 959 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void b ( ) {
/* .locals 2 */
/* .prologue */
/* .line 294 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.w;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 295 */
		 v0 = this.w;
		 (( com.google.ads.e ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/e;->b()V
		 /* .line 297 */
	 } // :cond_0
	 v0 = this.b;
	 v0 = this.j;
	 int v1 = 0; // const/4 v1, 0x0
	 (( com.google.ads.util.i$c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/util/i$c;->a(Ljava/lang/Object;)V
	 /* .line 298 */
	 (( com.google.ads.internal.d ) p0 ).z ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->z()V
	 /* .line 299 */
	 v0 = this.f;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 300 */
		 v0 = this.f;
		 (( com.google.ads.internal.AdWebView ) v0 ).destroy ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->destroy()V
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 302 */
	 } // :cond_1
	 /* monitor-exit p0 */
	 return;
	 /* .line 294 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized void b ( Long p0 ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 987 */
	 /* monitor-enter p0 */
	 /* const-wide/16 v0, 0x0 */
	 /* cmp-long v0, p1, v0 */
	 /* if-lez v0, :cond_0 */
	 /* .line 988 */
	 try { // :try_start_0
		 v0 = this.n;
		 final String v1 = "GoogleAdMobDoritosLife"; // const-string v1, "GoogleAdMobDoritosLife"
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 990 */
	 } // :cond_0
	 /* monitor-exit p0 */
	 return;
	 /* .line 987 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized void b ( Object p0 ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 694 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 final String v0 = "AdManager.onGWhirlNoFill() called."; // const-string v0, "AdManager.onGWhirlNoFill() called."
		 com.google.ads.util.b .a ( v0 );
		 /* .line 697 */
		 (( com.google.ads.c ) p1 ).i ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->i()Ljava/util/List;
		 (( com.google.ads.c ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/google/ads/c;->c()Ljava/lang/String;
		 /* invoke-direct {p0, v0, v1}, Lcom/google/ads/internal/d;->a(Ljava/util/List;Ljava/lang/String;)V */
		 /* .line 700 */
		 v0 = this.b;
		 v0 = this.j;
		 (( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
		 /* check-cast v0, Lcom/google/ads/AdListener; */
		 /* .line 701 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 702 */
			 v1 = this.b;
			 v1 = this.f;
			 (( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
			 /* check-cast v1, Lcom/google/ads/Ad; */
			 v2 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 704 */
		 } // :cond_0
		 /* monitor-exit p0 */
		 return;
		 /* .line 694 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
	 protected synchronized void b ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 1128 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "Adding a tracking URL: "; // const-string v1, "Adding a tracking URL: "
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.google.ads.util.b .a ( v0 );
			 /* .line 1129 */
			 v0 = this.r;
			 (( java.util.LinkedList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 1130 */
			 /* monitor-exit p0 */
			 return;
			 /* .line 1128 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public void b ( Boolean p0 ) {
			 /* .locals 1 */
			 /* .prologue */
			 /* .line 1162 */
			 java.lang.Boolean .valueOf ( p1 );
			 this.u = v0;
			 /* .line 1163 */
			 return;
		 } // .end method
		 public java.lang.String c ( ) {
			 /* .locals 1 */
			 /* .prologue */
			 /* .line 334 */
			 v0 = this.y;
		 } // .end method
		 public synchronized void d ( ) {
			 /* .locals 1 */
			 /* .prologue */
			 /* .line 343 */
			 /* monitor-enter p0 */
			 int v0 = 0; // const/4 v0, 0x0
			 try { // :try_start_0
				 /* iput-boolean v0, p0, Lcom/google/ads/internal/d;->m:Z */
				 /* .line 344 */
				 final String v0 = "Refreshing is no longer allowed on this AdView."; // const-string v0, "Refreshing is no longer allowed on this AdView."
				 com.google.ads.util.b .a ( v0 );
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 345 */
				 /* monitor-exit p0 */
				 return;
				 /* .line 343 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 public synchronized void e ( ) {
				 /* .locals 2 */
				 /* .prologue */
				 /* .line 354 */
				 /* monitor-enter p0 */
				 try { // :try_start_0
					 /* iget-boolean v0, p0, Lcom/google/ads/internal/d;->l:Z */
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 /* .line 356 */
						 final String v0 = "Disabling refreshing."; // const-string v0, "Disabling refreshing."
						 com.google.ads.util.b .a ( v0 );
						 /* .line 357 */
						 v0 = this.h;
						 v1 = this.p;
						 (( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
						 /* .line 358 */
						 int v0 = 0; // const/4 v0, 0x0
						 /* iput-boolean v0, p0, Lcom/google/ads/internal/d;->l:Z */
						 /* :try_end_0 */
						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
						 /* .line 362 */
					 } // :goto_0
					 /* monitor-exit p0 */
					 return;
					 /* .line 360 */
				 } // :cond_0
				 try { // :try_start_1
					 final String v0 = "Refreshing is already disabled."; // const-string v0, "Refreshing is already disabled."
					 com.google.ads.util.b .a ( v0 );
					 /* :try_end_1 */
					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
					 /* .line 354 */
					 /* :catchall_0 */
					 /* move-exception v0 */
					 /* monitor-exit p0 */
					 /* throw v0 */
				 } // .end method
				 public synchronized void f ( ) {
					 /* .locals 4 */
					 /* .prologue */
					 /* .line 371 */
					 /* monitor-enter p0 */
					 try { // :try_start_0
						 v0 = this.b;
						 v0 = 						 (( com.google.ads.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->a()Z
						 if ( v0 != null) { // if-eqz v0, :cond_2
							 /* .line 372 */
							 /* iget-boolean v0, p0, Lcom/google/ads/internal/d;->m:Z */
							 if ( v0 != null) { // if-eqz v0, :cond_1
								 /* .line 373 */
								 /* iget-boolean v0, p0, Lcom/google/ads/internal/d;->l:Z */
								 /* if-nez v0, :cond_0 */
								 /* .line 375 */
								 /* new-instance v0, Ljava/lang/StringBuilder; */
								 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
								 final String v1 = "Enabling refreshing every "; // const-string v1, "Enabling refreshing every "
								 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
								 /* iget-wide v1, p0, Lcom/google/ads/internal/d;->o:J */
								 (( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
								 final String v1 = " milliseconds."; // const-string v1, " milliseconds."
								 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
								 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
								 com.google.ads.util.b .a ( v0 );
								 /* .line 376 */
								 v0 = this.h;
								 v1 = this.p;
								 /* iget-wide v2, p0, Lcom/google/ads/internal/d;->o:J */
								 (( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
								 /* .line 377 */
								 int v0 = 1; // const/4 v0, 0x1
								 /* iput-boolean v0, p0, Lcom/google/ads/internal/d;->l:Z */
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* .line 388 */
							 } // :goto_0
							 /* monitor-exit p0 */
							 return;
							 /* .line 380 */
						 } // :cond_0
						 try { // :try_start_1
							 final String v0 = "Refreshing is already enabled."; // const-string v0, "Refreshing is already enabled."
							 com.google.ads.util.b .a ( v0 );
							 /* :try_end_1 */
							 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
							 /* .line 371 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* monitor-exit p0 */
							 /* throw v0 */
							 /* .line 383 */
						 } // :cond_1
						 try { // :try_start_2
							 final String v0 = "Refreshing disabled on this AdView"; // const-string v0, "Refreshing disabled on this AdView"
							 com.google.ads.util.b .a ( v0 );
							 /* .line 386 */
						 } // :cond_2
						 final String v0 = "Tried to enable refreshing on something other than an AdView."; // const-string v0, "Tried to enable refreshing on something other than an AdView."
						 com.google.ads.util.b .a ( v0 );
						 /* :try_end_2 */
						 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
					 } // .end method
					 public com.google.ads.m g ( ) {
						 /* .locals 1 */
						 /* .prologue */
						 /* .line 396 */
						 v0 = this.b;
					 } // .end method
					 public synchronized com.google.ads.d h ( ) {
						 /* .locals 1 */
						 /* .prologue */
						 /* .line 405 */
						 /* monitor-enter p0 */
						 try { // :try_start_0
							 v0 = this.v;
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* monitor-exit p0 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* monitor-exit p0 */
							 /* throw v0 */
						 } // .end method
						 public synchronized com.google.ads.internal.c i ( ) {
							 /* .locals 1 */
							 /* .prologue */
							 /* .line 415 */
							 /* monitor-enter p0 */
							 try { // :try_start_0
								 v0 = this.c;
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* monitor-exit p0 */
								 /* :catchall_0 */
								 /* move-exception v0 */
								 /* monitor-exit p0 */
								 /* throw v0 */
							 } // .end method
							 public synchronized com.google.ads.internal.AdWebView j ( ) {
								 /* .locals 1 */
								 /* .prologue */
								 /* .line 424 */
								 /* monitor-enter p0 */
								 try { // :try_start_0
									 v0 = this.f;
									 /* :try_end_0 */
									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
									 /* monitor-exit p0 */
									 /* :catchall_0 */
									 /* move-exception v0 */
									 /* monitor-exit p0 */
									 /* throw v0 */
								 } // .end method
								 public synchronized com.google.ads.internal.i k ( ) {
									 /* .locals 1 */
									 /* .prologue */
									 /* .line 433 */
									 /* monitor-enter p0 */
									 try { // :try_start_0
										 v0 = this.g;
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* monitor-exit p0 */
										 /* :catchall_0 */
										 /* move-exception v0 */
										 /* monitor-exit p0 */
										 /* throw v0 */
									 } // .end method
									 public com.google.ads.internal.g l ( ) {
										 /* .locals 1 */
										 /* .prologue */
										 /* .line 442 */
										 v0 = this.e;
									 } // .end method
									 public synchronized Integer m ( ) {
										 /* .locals 1 */
										 /* .prologue */
										 /* .line 462 */
										 /* monitor-enter p0 */
										 try { // :try_start_0
											 /* iget v0, p0, Lcom/google/ads/internal/d;->t:I */
											 /* :try_end_0 */
											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 /* monitor-exit p0 */
											 /* :catchall_0 */
											 /* move-exception v0 */
											 /* monitor-exit p0 */
											 /* throw v0 */
										 } // .end method
										 public Long n ( ) {
											 /* .locals 2 */
											 /* .prologue */
											 /* .line 471 */
											 /* iget-wide v0, p0, Lcom/google/ads/internal/d;->i:J */
											 /* return-wide v0 */
										 } // .end method
										 public synchronized Boolean o ( ) {
											 /* .locals 1 */
											 /* .prologue */
											 /* .line 482 */
											 /* monitor-enter p0 */
											 try { // :try_start_0
												 v0 = this.c;
												 /* :try_end_0 */
												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
												 if ( v0 != null) { // if-eqz v0, :cond_0
													 int v0 = 1; // const/4 v0, 0x1
												 } // :goto_0
												 /* monitor-exit p0 */
											 } // :cond_0
											 int v0 = 0; // const/4 v0, 0x0
											 /* :catchall_0 */
											 /* move-exception v0 */
											 /* monitor-exit p0 */
											 /* throw v0 */
										 } // .end method
										 public synchronized Boolean p ( ) {
											 /* .locals 1 */
											 /* .prologue */
											 /* .line 489 */
											 /* monitor-enter p0 */
											 try { // :try_start_0
												 /* iget-boolean v0, p0, Lcom/google/ads/internal/d;->j:Z */
												 /* :try_end_0 */
												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
												 /* monitor-exit p0 */
												 /* :catchall_0 */
												 /* move-exception v0 */
												 /* monitor-exit p0 */
												 /* throw v0 */
											 } // .end method
											 public synchronized Boolean q ( ) {
												 /* .locals 1 */
												 /* .prologue */
												 /* .line 497 */
												 /* monitor-enter p0 */
												 try { // :try_start_0
													 /* iget-boolean v0, p0, Lcom/google/ads/internal/d;->k:Z */
													 /* :try_end_0 */
													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
													 /* monitor-exit p0 */
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit p0 */
													 /* throw v0 */
												 } // .end method
												 public synchronized Boolean r ( ) {
													 /* .locals 1 */
													 /* .prologue */
													 /* .line 506 */
													 /* monitor-enter p0 */
													 try { // :try_start_0
														 /* iget-boolean v0, p0, Lcom/google/ads/internal/d;->l:Z */
														 /* :try_end_0 */
														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 /* monitor-exit p0 */
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit p0 */
														 /* throw v0 */
													 } // .end method
													 public synchronized void s ( ) {
														 /* .locals 2 */
														 /* .prologue */
														 /* .line 716 */
														 /* monitor-enter p0 */
														 try { // :try_start_0
															 v0 = this.e;
															 (( com.google.ads.internal.g ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->o()V
															 /* .line 718 */
															 final String v0 = "onDismissScreen()"; // const-string v0, "onDismissScreen()"
															 com.google.ads.util.b .c ( v0 );
															 /* .line 721 */
															 v0 = this.b;
															 v0 = this.j;
															 (( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
															 /* check-cast v0, Lcom/google/ads/AdListener; */
															 /* .line 722 */
															 if ( v0 != null) { // if-eqz v0, :cond_0
																 /* .line 723 */
																 v1 = this.b;
																 v1 = this.f;
																 (( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
																 /* check-cast v1, Lcom/google/ads/Ad; */
																 /* :try_end_0 */
																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																 /* .line 725 */
															 } // :cond_0
															 /* monitor-exit p0 */
															 return;
															 /* .line 716 */
															 /* :catchall_0 */
															 /* move-exception v0 */
															 /* monitor-exit p0 */
															 /* throw v0 */
														 } // .end method
														 public synchronized void t ( ) {
															 /* .locals 2 */
															 /* .prologue */
															 /* .line 735 */
															 /* monitor-enter p0 */
															 try { // :try_start_0
																 final String v0 = "onPresentScreen()"; // const-string v0, "onPresentScreen()"
																 com.google.ads.util.b .c ( v0 );
																 /* .line 738 */
																 v0 = this.b;
																 v0 = this.j;
																 (( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
																 /* check-cast v0, Lcom/google/ads/AdListener; */
																 /* .line 739 */
																 if ( v0 != null) { // if-eqz v0, :cond_0
																	 /* .line 740 */
																	 v1 = this.b;
																	 v1 = this.f;
																	 (( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
																	 /* check-cast v1, Lcom/google/ads/Ad; */
																	 /* :try_end_0 */
																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																	 /* .line 742 */
																 } // :cond_0
																 /* monitor-exit p0 */
																 return;
																 /* .line 735 */
																 /* :catchall_0 */
																 /* move-exception v0 */
																 /* monitor-exit p0 */
																 /* throw v0 */
															 } // .end method
															 public synchronized void u ( ) {
																 /* .locals 2 */
																 /* .prologue */
																 /* .line 752 */
																 /* monitor-enter p0 */
																 try { // :try_start_0
																	 final String v0 = "onLeaveApplication()"; // const-string v0, "onLeaveApplication()"
																	 com.google.ads.util.b .c ( v0 );
																	 /* .line 755 */
																	 v0 = this.b;
																	 v0 = this.j;
																	 (( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
																	 /* check-cast v0, Lcom/google/ads/AdListener; */
																	 /* .line 756 */
																	 if ( v0 != null) { // if-eqz v0, :cond_0
																		 /* .line 757 */
																		 v1 = this.b;
																		 v1 = this.f;
																		 (( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
																		 /* check-cast v1, Lcom/google/ads/Ad; */
																		 /* :try_end_0 */
																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																		 /* .line 759 */
																	 } // :cond_0
																	 /* monitor-exit p0 */
																	 return;
																	 /* .line 752 */
																	 /* :catchall_0 */
																	 /* move-exception v0 */
																	 /* monitor-exit p0 */
																	 /* throw v0 */
																 } // .end method
																 public void v ( ) {
																	 /* .locals 1 */
																	 /* .prologue */
																	 /* .line 767 */
																	 v0 = this.e;
																	 (( com.google.ads.internal.g ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->b()V
																	 /* .line 768 */
																	 (( com.google.ads.internal.d ) p0 ).A ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->A()V
																	 /* .line 769 */
																	 return;
																 } // .end method
																 public synchronized void w ( ) {
																	 /* .locals 6 */
																	 /* .prologue */
																	 /* .line 879 */
																	 /* monitor-enter p0 */
																	 try { // :try_start_0
																		 v0 = this.b;
																		 v0 = this.c;
																		 (( com.google.ads.util.i$d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$d;->a()Ljava/lang/Object;
																		 /* check-cast v0, Landroid/app/Activity; */
																		 /* .line 880 */
																		 /* if-nez v0, :cond_1 */
																		 /* .line 881 */
																		 final String v0 = "activity was null while trying to ping tracking URLs."; // const-string v0, "activity was null while trying to ping tracking URLs."
																		 com.google.ads.util.b .e ( v0 );
																		 /* :try_end_0 */
																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																		 /* .line 891 */
																	 } // :cond_0
																	 /* monitor-exit p0 */
																	 return;
																	 /* .line 886 */
																 } // :cond_1
																 try { // :try_start_1
																	 v1 = this.r;
																	 (( java.util.LinkedList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;
																 v1 = 																 } // :goto_0
																 if ( v1 != null) { // if-eqz v1, :cond_0
																	 /* check-cast v1, Ljava/lang/String; */
																	 /* .line 887 */
																	 /* new-instance v3, Ljava/lang/Thread; */
																	 /* new-instance v4, Lcom/google/ads/aa; */
																	 (( android.app.Activity ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
																	 /* invoke-direct {v4, v1, v5}, Lcom/google/ads/aa;-><init>(Ljava/lang/String;Landroid/content/Context;)V */
																	 /* invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
																	 /* .line 889 */
																	 (( java.lang.Thread ) v3 ).start ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->start()V
																	 /* :try_end_1 */
																	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																	 /* .line 879 */
																	 /* :catchall_0 */
																	 /* move-exception v0 */
																	 /* monitor-exit p0 */
																	 /* throw v0 */
																 } // .end method
																 public synchronized void x ( ) {
																	 /* .locals 4 */
																	 /* .prologue */
																	 /* .line 911 */
																	 /* monitor-enter p0 */
																	 try { // :try_start_0
																		 v0 = this.d;
																		 if ( v0 != null) { // if-eqz v0, :cond_2
																			 /* .line 912 */
																			 v0 = this.b;
																			 v0 = 																			 (( com.google.ads.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->a()Z
																			 if ( v0 != null) { // if-eqz v0, :cond_1
																				 /* .line 914 */
																				 v0 = this.b;
																				 v0 = this.g;
																				 (( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
																				 /* check-cast v0, Lcom/google/ads/AdView; */
																				 v0 = 																				 (( com.google.ads.AdView ) v0 ).isShown ( ); // invoke-virtual {v0}, Lcom/google/ads/AdView;->isShown()Z
																				 if ( v0 != null) { // if-eqz v0, :cond_0
																					 v0 = 																					 com.google.ads.util.AdUtil .d ( );
																					 if ( v0 != null) { // if-eqz v0, :cond_0
																						 /* .line 915 */
																						 final String v0 = "Refreshing ad."; // const-string v0, "Refreshing ad."
																						 com.google.ads.util.b .c ( v0 );
																						 /* .line 916 */
																						 v0 = this.d;
																						 (( com.google.ads.internal.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/internal/d;->a(Lcom/google/ads/AdRequest;)V
																						 /* .line 924 */
																					 } // :goto_0
																					 v0 = this.h;
																					 v1 = this.p;
																					 /* iget-wide v2, p0, Lcom/google/ads/internal/d;->o:J */
																					 (( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
																					 /* :try_end_0 */
																					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																					 /* .line 931 */
																				 } // :goto_1
																				 /* monitor-exit p0 */
																				 return;
																				 /* .line 920 */
																			 } // :cond_0
																			 try { // :try_start_1
																				 final String v0 = "Not refreshing because the ad is not visible."; // const-string v0, "Not refreshing because the ad is not visible."
																				 com.google.ads.util.b .a ( v0 );
																				 /* :try_end_1 */
																				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																				 /* .line 911 */
																				 /* :catchall_0 */
																				 /* move-exception v0 */
																				 /* monitor-exit p0 */
																				 /* throw v0 */
																				 /* .line 926 */
																			 } // :cond_1
																			 try { // :try_start_2
																				 final String v0 = "Tried to refresh an ad that wasn\'t an AdView."; // const-string v0, "Tried to refresh an ad that wasn\'t an AdView."
																				 com.google.ads.util.b .a ( v0 );
																				 /* .line 929 */
																			 } // :cond_2
																			 final String v0 = "Tried to refresh before calling loadAd()."; // const-string v0, "Tried to refresh before calling loadAd()."
																			 com.google.ads.util.b .a ( v0 );
																			 /* :try_end_2 */
																			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
																		 } // .end method
																		 public synchronized void y ( ) {
																			 /* .locals 2 */
																			 /* .prologue */
																			 /* .line 999 */
																			 /* monitor-enter p0 */
																			 try { // :try_start_0
																				 v0 = this.b;
																				 v0 = 																				 (( com.google.ads.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->b()Z
																				 com.google.ads.util.a .a ( v0 );
																				 /* .line 1000 */
																				 v0 = 																				 (( com.google.ads.internal.d ) p0 ).q ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->q()Z
																				 if ( v0 != null) { // if-eqz v0, :cond_3
																					 /* .line 1002 */
																					 int v0 = 0; // const/4 v0, 0x0
																					 /* iput-boolean v0, p0, Lcom/google/ads/internal/d;->k:Z */
																					 /* .line 1006 */
																					 (( com.google.ads.internal.d ) p0 ).C ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->C()Ljava/lang/Boolean;
																					 /* if-nez v0, :cond_1 */
																					 /* .line 1007 */
																					 final String v0 = "isMediationFlag is null in show() with isReady() true.we should have an ad and know whether this is a mediation request or not."; // const-string v0, "isMediationFlag is null in show() with isReady() true.we should have an ad and know whether this is a mediation request or not."
																					 com.google.ads.util.b .b ( v0 );
																					 /* :try_end_0 */
																					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																					 /* .line 1028 */
																				 } // :cond_0
																			 } // :goto_0
																			 /* monitor-exit p0 */
																			 return;
																			 /* .line 1012 */
																		 } // :cond_1
																		 try { // :try_start_1
																			 (( com.google.ads.internal.d ) p0 ).C ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->C()Ljava/lang/Boolean;
																			 v0 = 																			 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
																			 if ( v0 != null) { // if-eqz v0, :cond_2
																				 /* .line 1014 */
																				 v0 = this.w;
																				 v0 = 																				 (( com.google.ads.e ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/e;->c()Z
																				 if ( v0 != null) { // if-eqz v0, :cond_0
																					 /* .line 1015 */
																					 v0 = this.x;
																					 int v1 = 0; // const/4 v1, 0x0
																					 java.lang.Boolean .valueOf ( v1 );
																					 /* invoke-direct {p0, v0, v1}, Lcom/google/ads/internal/d;->a(Lcom/google/ads/f;Ljava/lang/Boolean;)V */
																					 /* :try_end_1 */
																					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																					 /* .line 999 */
																					 /* :catchall_0 */
																					 /* move-exception v0 */
																					 /* monitor-exit p0 */
																					 /* throw v0 */
																					 /* .line 1019 */
																				 } // :cond_2
																				 try { // :try_start_2
																					 /* new-instance v0, Lcom/google/ads/internal/e; */
																					 final String v1 = "interstitial"; // const-string v1, "interstitial"
																					 /* invoke-direct {v0, v1}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;)V */
																					 com.google.ads.AdActivity .launchAdActivity ( p0,v0 );
																					 /* .line 1023 */
																					 (( com.google.ads.internal.d ) p0 ).w ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/d;->w()V
																					 /* .line 1026 */
																				 } // :cond_3
																				 final String v0 = "Cannot show interstitial because it is not loaded and ready."; // const-string v0, "Cannot show interstitial because it is not loaded and ready."
																				 com.google.ads.util.b .c ( v0 );
																				 /* :try_end_2 */
																				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
																			 } // .end method
																			 public synchronized void z ( ) {
																				 /* .locals 1 */
																				 /* .prologue */
																				 /* .line 1037 */
																				 /* monitor-enter p0 */
																				 try { // :try_start_0
																					 v0 = this.c;
																					 if ( v0 != null) { // if-eqz v0, :cond_0
																						 /* .line 1038 */
																						 v0 = this.c;
																						 (( com.google.ads.internal.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/c;->a()V
																						 /* .line 1039 */
																						 int v0 = 0; // const/4 v0, 0x0
																						 this.c = v0;
																						 /* .line 1043 */
																					 } // :cond_0
																					 v0 = this.f;
																					 if ( v0 != null) { // if-eqz v0, :cond_1
																						 /* .line 1044 */
																						 v0 = this.f;
																						 (( com.google.ads.internal.AdWebView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->stopLoading()V
																						 /* :try_end_0 */
																						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																						 /* .line 1046 */
																					 } // :cond_1
																					 /* monitor-exit p0 */
																					 return;
																					 /* .line 1037 */
																					 /* :catchall_0 */
																					 /* move-exception v0 */
																					 /* monitor-exit p0 */
																					 /* throw v0 */
																				 } // .end method
