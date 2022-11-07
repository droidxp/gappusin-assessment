public class com.doodlemobile.basket.GameActivity extends android.app.Activity implements com.doodlemobile.basket.o implements com.doodlemobile.basket.opengl.h {
	 /* # interfaces */
	 /* # static fields */
	 protected static h;
	 protected static com.doodlemobile.basket.GameActivity m;
	 public static final com.doodlemobile.basket.b.b n;
	 /* # instance fields */
	 private com.doodlemobile.basket.opengl.l a;
	 private com.doodlemobile.basket.b.a b;
	 private com.doodlemobile.basket.ui.e c;
	 protected com.doodlemobile.basket.ui.e d;
	 protected com.doodlemobile.basket.p e;
	 protected com.doodlemobile.basket.util.d f;
	 protected com.doodlemobile.basket.ui.a.p g;
	 protected Boolean i;
	 Boolean j;
	 protected Integer k;
	 protected Integer l;
	 protected com.doodlemobile.basket.m o;
	 private com.doodlemobile.basket.s p;
	 private com.doodlemobile.basket.util.d q;
	 private Boolean r;
	 private com.doodlemobile.basket.math.MatrixStack s;
	 private Boolean t;
	 private Boolean u;
	 private Long v;
	 private Long w;
	 private java.lang.Thread x;
	 private Boolean y;
	 private Boolean z;
	 /* # direct methods */
	 static com.doodlemobile.basket.GameActivity ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [B */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-instance v0, Lcom/doodlemobile/basket/f; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/f;-><init>()V */
		 return;
	 } // .end method
	 public com.doodlemobile.basket.GameActivity ( ) {
		 /* .locals 5 */
		 int v4 = -1; // const/4 v4, -0x1
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 this.a = v3;
		 this.d = v3;
		 this.p = v3;
		 /* new-instance v0, Lcom/doodlemobile/basket/p; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/p;-><init>()V */
		 this.e = v0;
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->r:Z */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/GameActivity;->t:Z */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->u:Z */
		 android.os.SystemClock .uptimeMillis ( );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/GameActivity;->v:J */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->i:Z */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->j:Z */
		 this.x = v3;
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->y:Z */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->z:Z */
		 /* iput v4, p0, Lcom/doodlemobile/basket/GameActivity;->k:I */
		 /* iput v4, p0, Lcom/doodlemobile/basket/GameActivity;->l:I */
		 /* new-instance v0, Lcom/doodlemobile/basket/m; */
		 v1 = com.doodlemobile.basket.GameActivity.n;
		 /* invoke-direct {v0, v1}, Lcom/doodlemobile/basket/m;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 this.o = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void a ( Long p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 0 */
		 this.b = p1;
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 2 */
		 com.doodlemobile.basket.n .a ( );
		 int v0 = 1; // const/4 v0, 0x1
		 /* const/16 v1, 0x303 */
		 /* const/16 v0, 0xbe2 */
		 com.doodlemobile.basket.r .a ( p1 );
		 final String v0 = "Basket"; // const-string v0, "Basket"
		 final String v1 = "--*-- surface created! --*-- "; // const-string v1, "--*-- surface created! --*-- "
		 com.doodlemobile.basket.util.b .a ( v0,v1 );
		 v0 = this.s;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lcom/doodlemobile/basket/math/MatrixStack; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;-><init>(B)V */
		 this.s = v0;
	 } // :cond_0
	 v0 = this.q;
	 /* if-nez v0, :cond_1 */
	 /* new-instance v0, Lcom/doodlemobile/basket/i; */
	 /* invoke-direct {v0, p0}, Lcom/doodlemobile/basket/i;-><init>(Lcom/doodlemobile/basket/GameActivity;)V */
	 this.q = v0;
} // :cond_1
v0 = this.f;
/* if-nez v0, :cond_2 */
/* new-instance v0, Lcom/doodlemobile/basket/g; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/basket/g;-><init>(Lcom/doodlemobile/basket/GameActivity;)V */
this.f = v0;
} // :cond_2
return;
} // .end method
public void a ( Object p0, Integer p1, Integer p2 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
com.doodlemobile.basket.r .a ( p1 );
final String v0 = "Basket"; // const-string v0, "Basket"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "--*-- surface changed! w="; // const-string v2, "--*-- surface changed! w="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " h="; // const-string v2, " h="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " --*-- "; // const-string v2, " --*-- "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.basket.util.b .a ( v0,v1 );
/* iput p2, p0, Lcom/doodlemobile/basket/GameActivity;->k:I */
/* iput p3, p0, Lcom/doodlemobile/basket/GameActivity;->l:I */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/GameActivity;->y:Z */
/* if-nez v0, :cond_0 */
v0 = this.x;
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/GameActivity;->y:Z */
/* if-nez v0, :cond_0 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/doodlemobile/basket/h; */
/* invoke-direct {v1, p0}, Lcom/doodlemobile/basket/h;-><init>(Lcom/doodlemobile/basket/GameActivity;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.x = v0;
v0 = this.x;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // :cond_0
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
(( com.doodlemobile.basket.ui.e ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lcom/doodlemobile/basket/ui/e;->a(II)V
} // :cond_1
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_2
(( com.doodlemobile.basket.s ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lcom/doodlemobile/basket/s;->a(II)V
} // :cond_2
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_3
com.doodlemobile.basket.n .d ( );
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/GameActivity;->v:J */
return;
} // .end method
protected void a ( Object p0 ) {
/* .locals 0 */
return;
} // .end method
public final void a ( Object p0, Object p1 ) {
/* .locals 2 */
this.d = p1;
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/GameActivity;->k:I */
/* iget v1, p0, Lcom/doodlemobile/basket/GameActivity;->l:I */
(( com.doodlemobile.basket.ui.e ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/ui/e;->a(II)V
} // :cond_0
v0 = this.o;
(( com.doodlemobile.basket.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/m;->a(Lcom/doodlemobile/basket/ui/e;)V
this.p = p2;
if ( p2 != null) { // if-eqz p2, :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/GameActivity;->k:I */
/* iget v1, p0, Lcom/doodlemobile/basket/GameActivity;->l:I */
(( com.doodlemobile.basket.s ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/s;->a(II)V
} // :cond_1
v0 = this.o;
(( com.doodlemobile.basket.m ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lcom/doodlemobile/basket/m;->a(Lcom/doodlemobile/basket/s;)V
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.b;
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
(( com.doodlemobile.basket.ui.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/ui/e;->c()V
} // :cond_3
if ( p2 != null) { // if-eqz p2, :cond_4
(( com.doodlemobile.basket.s ) p2 ).m ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/s;->m()V
} // :cond_4
com.doodlemobile.basket.n .d ( );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/GameActivity;->r:Z */
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 9 */
/* const-wide/16 v7, 0x10 */
int v6 = 0; // const/4 v6, 0x0
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/doodlemobile/basket/GameActivity;->v:J */
/* sub-long v2, v0, v2 */
/* const-wide/16 v4, 0xc */
/* cmp-long v4, v2, v4 */
/* if-lez v4, :cond_5 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/GameActivity;->v:J */
/* iget-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->y:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* iget-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->z:Z */
/* if-nez v2, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->z:Z */
(( com.doodlemobile.basket.GameActivity ) p0 ).g ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/GameActivity;->g()V
} // :cond_0
(( com.doodlemobile.basket.GameActivity ) p0 ).t ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/GameActivity;->t()V
(( com.doodlemobile.basket.GameActivity ) p0 ).u ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/GameActivity;->u()V
v2 = this.f;
(( com.doodlemobile.basket.util.d ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/util/d;->c()J
v2 = this.e;
(( com.doodlemobile.basket.p ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/p;->b()V
} // :cond_1
/* iget-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->u:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.e;
(( com.doodlemobile.basket.p ) v2 ).e ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/p;->e()V
int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->u:Z */
} // :cond_2
/* iget-boolean v2, p0, Lcom/doodlemobile/basket/GameActivity;->t:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
/* const/16 v2, 0x4100 */
} // :cond_3
com.doodlemobile.basket.n .a ( p1 );
v2 = this.s;
(( com.doodlemobile.basket.math.MatrixStack ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/math/MatrixStack;->a()V
v3 = this.e;
(( com.doodlemobile.basket.p ) v3 ).a ( p1, v2 ); // invoke-virtual {v3, p1, v2}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V
v2 = this.q;
(( com.doodlemobile.basket.util.d ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/util/d;->b()J
v2 = this.q;
(( com.doodlemobile.basket.util.d ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/util/d;->c()J
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v2 */
/* sub-long v0, v2, v0 */
} // :goto_0
/* cmp-long v2, v0, v7 */
/* if-gez v2, :cond_4 */
/* sub-long v0, v7, v0 */
try { // :try_start_0
java.lang.Thread .sleep ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
} // :goto_1
return;
} // :cond_4
/* const-wide/16 v0, 0x1 */
try { // :try_start_1
java.lang.Thread .sleep ( v0,v1 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
} // :cond_5
/* move-wide v0, v2 */
} // .end method
protected void g ( ) {
/* .locals 0 */
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
int v0 = 3; // const/4 v0, 0x3
(( com.doodlemobile.basket.GameActivity ) p0 ).setVolumeControlStream ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/GameActivity;->setVolumeControlStream(I)V
(( com.doodlemobile.basket.GameActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/GameActivity;->getWindow()Landroid/view/Window;
/* const/16 v1, 0x80 */
(( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
com.doodlemobile.basket.font.d .a ( );
v0 = this.o;
(( com.doodlemobile.basket.m ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/doodlemobile/basket/m;->a(Lcom/doodlemobile/basket/o;)V
return;
} // .end method
public void onDestroy ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "destoryed"; // const-string v1, "destoryed"
com.doodlemobile.basket.util.b .a ( v0,v1 );
v0 = com.doodlemobile.basket.GameActivity.h;
/* monitor-enter v0 */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
/* iput-boolean v1, p0, Lcom/doodlemobile/basket/GameActivity;->i:Z */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/doodlemobile/basket/GameActivity;->j:Z */
v1 = com.doodlemobile.basket.GameActivity.h;
(( java.lang.Object ) v1 ).notify ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notify()V
/* new-instance v1, Landroid/view/View; */
/* invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
(( com.doodlemobile.basket.GameActivity ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/doodlemobile/basket/GameActivity;->setContentView(Landroid/view/View;)V
com.doodlemobile.basket.n .a ( );
com.doodlemobile.basket.n .b ( );
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
this.p = v2;
this.d = v2;
v0 = com.doodlemobile.basket.GameActivity.n;
return;
/* :catchall_0 */
/* move-exception v1 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v1 */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
v0 = com.doodlemobile.gamecenter.a.f .a ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
v0 = this.o;
(( com.doodlemobile.basket.m ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Lcom/doodlemobile/basket/m;->b(Landroid/view/KeyEvent;)V
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
v0 = this.o;
(( com.doodlemobile.basket.m ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Lcom/doodlemobile/basket/m;->b(Landroid/view/KeyEvent;)V
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onPause ( ) {
/* .locals 2 */
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "++++++paused"; // const-string v1, "++++++paused"
com.doodlemobile.basket.util.b .a ( v0,v1 );
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.q;
(( com.doodlemobile.basket.util.d ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/util/d;->d()V
} // :cond_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.f;
(( com.doodlemobile.basket.util.d ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/util/d;->d()V
} // :cond_1
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.e;
(( com.doodlemobile.basket.p ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/p;->c()V
} // :cond_2
v0 = this.o;
v0 = this.a;
(( java.util.concurrent.ConcurrentLinkedQueue ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
v0 = com.doodlemobile.basket.GameActivity.h;
/* monitor-enter v0 */
int v1 = 1; // const/4 v1, 0x1
try { // :try_start_0
/* iput-boolean v1, p0, Lcom/doodlemobile/basket/GameActivity;->i:Z */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
public void onResume ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/GameActivity;->u:Z */
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "++resumed"; // const-string v1, "++resumed"
com.doodlemobile.basket.util.b .a ( v0,v1 );
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.q;
(( com.doodlemobile.basket.util.d ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/util/d;->e()V
} // :cond_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.f;
(( com.doodlemobile.basket.util.d ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/util/d;->e()V
} // :cond_1
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.e;
(( com.doodlemobile.basket.p ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/p;->d()V
} // :cond_2
v0 = this.o;
v0 = this.a;
(( java.util.concurrent.ConcurrentLinkedQueue ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V
v0 = com.doodlemobile.basket.GameActivity.h;
/* monitor-enter v0 */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
/* iput-boolean v1, p0, Lcom/doodlemobile/basket/GameActivity;->i:Z */
v1 = com.doodlemobile.basket.GameActivity.h;
(( java.lang.Object ) v1 ).notify ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notify()V
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
protected final void s ( ) {
/* .locals 2 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/doodlemobile/basket/opengl/l; */
v1 = this.o;
/* invoke-direct {v0, p0, v1}, Lcom/doodlemobile/basket/opengl/l;-><init>(Landroid/content/Context;Lcom/doodlemobile/basket/m;)V */
this.a = v0;
v0 = this.a;
(( com.doodlemobile.basket.opengl.l ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/opengl/l;->a()V
v0 = this.a;
(( com.doodlemobile.basket.opengl.l ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/doodlemobile/basket/opengl/l;->a(Lcom/doodlemobile/basket/opengl/h;)V
v0 = this.a;
(( com.doodlemobile.basket.GameActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/GameActivity;->setContentView(Landroid/view/View;)V
} // :cond_0
return;
} // .end method
protected final void t ( ) {
/* .locals 10 */
/* const-wide/16 v8, 0xa0 */
/* move-object v1, p0 */
} // :goto_0
v0 = this.f;
(( com.doodlemobile.basket.util.d ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/util/d;->b()J
/* move-result-wide v2 */
/* iput-wide v2, v1, Lcom/doodlemobile/basket/GameActivity;->w:J */
v0 = this.e;
(( com.doodlemobile.basket.p ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/p;->a()V
v0 = com.doodlemobile.basket.n .e ( );
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.o;
} // :cond_0
v2 = this.a;
(( java.util.concurrent.ConcurrentLinkedQueue ) v2 ).poll ( ); // invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;
/* if-nez v2, :cond_0 */
} // :cond_1
v2 = this.b;
(( java.util.concurrent.ConcurrentLinkedQueue ) v2 ).poll ( ); // invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;
/* if-nez v2, :cond_1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-wide v2, v1, Lcom/doodlemobile/basket/GameActivity;->w:J */
v1 = this.e;
} // :cond_2
} // :goto_1
return;
} // :cond_3
/* iget-wide v2, v1, Lcom/doodlemobile/basket/GameActivity;->w:J */
(( com.doodlemobile.basket.GameActivity ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/doodlemobile/basket/GameActivity;->a(J)V
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_4
/* iget-wide v2, v1, Lcom/doodlemobile/basket/GameActivity;->w:J */
(( com.doodlemobile.basket.ui.a.p ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/doodlemobile/basket/ui/a/p;->a(J)V
v2 = (( com.doodlemobile.basket.ui.a.p ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/a/p;->a()I
int v3 = 2; // const/4 v3, 0x2
/* if-ne v2, v3, :cond_4 */
(( com.doodlemobile.basket.ui.a.p ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/a/p;->c()V
int v2 = 0; // const/4 v2, 0x0
this.g = v2;
(( com.doodlemobile.basket.GameActivity ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/GameActivity;->a(Lcom/doodlemobile/basket/ui/a/p;)V
} // :cond_4
v2 = this.o;
v0 = this.a;
(( java.util.concurrent.ConcurrentLinkedQueue ) v0 ).poll ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;
/* check-cast p0, Lcom/doodlemobile/basket/util/e; */
v0 = this.b;
(( java.util.concurrent.ConcurrentLinkedQueue ) v0 ).poll ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;
/* check-cast v0, Landroid/view/KeyEvent; */
/* move-object v3, p0 */
} // :goto_2
/* if-nez v3, :cond_5 */
if ( v0 != null) { // if-eqz v0, :cond_8
} // :cond_5
if ( v3 != null) { // if-eqz v3, :cond_7
if ( v0 != null) { // if-eqz v0, :cond_6
(( com.doodlemobile.basket.util.e ) v3 ).c ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/util/e;->c()J
/* move-result-wide v4 */
(( android.view.KeyEvent ) v0 ).getEventTime ( ); // invoke-virtual {v0}, Landroid/view/KeyEvent;->getEventTime()J
/* move-result-wide v6 */
/* cmp-long v4, v4, v6 */
/* if-gez v4, :cond_7 */
} // :cond_6
(( com.doodlemobile.basket.m ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/m;->a(Lcom/doodlemobile/basket/util/e;)V
v3 = this.a;
(( java.util.concurrent.ConcurrentLinkedQueue ) v3 ).poll ( ); // invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;
/* check-cast p0, Lcom/doodlemobile/basket/util/e; */
/* move-object v3, p0 */
} // :cond_7
(( com.doodlemobile.basket.m ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodlemobile/basket/m;->a(Landroid/view/KeyEvent;)V
v0 = this.b;
(( java.util.concurrent.ConcurrentLinkedQueue ) v0 ).poll ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;
/* check-cast p0, Landroid/view/KeyEvent; */
/* move-object v0, p0 */
} // :cond_8
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_a
/* iget-wide v2, v1, Lcom/doodlemobile/basket/GameActivity;->w:J */
/* cmp-long v2, v2, v8 */
/* if-lez v2, :cond_9 */
/* iput-wide v8, v1, Lcom/doodlemobile/basket/GameActivity;->w:J */
} // :cond_9
/* iget-wide v2, v1, Lcom/doodlemobile/basket/GameActivity;->w:J */
(( com.doodlemobile.basket.s ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/doodlemobile/basket/s;->a(J)V
} // :cond_a
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_b
/* iget-wide v3, v1, Lcom/doodlemobile/basket/GameActivity;->w:J */
(( com.doodlemobile.basket.ui.e ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/doodlemobile/basket/ui/e;->a(J)V
} // :cond_b
/* iget-boolean v3, v1, Lcom/doodlemobile/basket/GameActivity;->r:Z */
if ( v3 != null) { // if-eqz v3, :cond_c
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, v1, Lcom/doodlemobile/basket/GameActivity;->r:Z */
/* goto/16 :goto_0 */
} // :cond_c
if ( v0 != null) { // if-eqz v0, :cond_d
v3 = this.e;
(( com.doodlemobile.basket.s ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/s;->a(Lcom/doodlemobile/basket/p;)V
} // :cond_d
if ( v2 != null) { // if-eqz v2, :cond_2
v0 = this.e;
(( com.doodlemobile.basket.ui.e ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V
/* goto/16 :goto_1 */
} // .end method
protected final void u ( ) {
/* .locals 3 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-wide v1, p0, Lcom/doodlemobile/basket/GameActivity;->w:J */
(( com.doodlemobile.basket.ui.e ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/ui/e;->a(J)V
v1 = this.e;
(( com.doodlemobile.basket.ui.e ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V
} // :cond_0
return;
} // .end method
