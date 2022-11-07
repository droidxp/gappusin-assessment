public class inal {
	 /* # static fields */
	 private static Integer p;
	 private static Long q;
	 private static Long r;
	 private static Long s;
	 private static Long t;
	 private static Long u;
	 /* # instance fields */
	 private Boolean a;
	 private Boolean b;
	 private com.doodlemobile.basket.b.e c;
	 private com.doodlemobile.basket.b.e d;
	 private com.doodlemobile.basket.b.e e;
	 private Integer f;
	 private Integer g;
	 private Integer h;
	 private com.doodlemobile.basket.a i;
	 private com.doodlemobile.basket.a j;
	 private com.doodlemobile.basket.a k;
	 private com.doodlemobile.basket.a l;
	 private com.doodlemobile.basket.a m;
	 private com.doodlemobile.basket.a n;
	 private com.doodlemobile.basket.a o;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 3 */
		 /* const/16 v2, 0x2000 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/p;->a:Z */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/p;->b:Z */
		 /* new-array v0, v2, [Lcom/doodlemobile/basket/b/e; */
		 this.c = v0;
		 /* new-array v0, v2, [Lcom/doodlemobile/basket/b/e; */
		 this.d = v0;
		 /* new-array v0, v2, [Lcom/doodlemobile/basket/b/e; */
		 this.e = v0;
		 /* iput v1, p0, Lcom/doodlemobile/basket/p;->f:I */
		 /* iput v1, p0, Lcom/doodlemobile/basket/p;->g:I */
		 /* iput v1, p0, Lcom/doodlemobile/basket/p;->h:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* move v0, v3 */
	 } // :goto_0
	 /* iget v1, p0, Lcom/doodlemobile/basket/p;->f:I */
	 /* if-ge v0, v1, :cond_0 */
	 v1 = this.c;
	 /* aget-object v1, v1, v0 */
	 v1 = this.c;
	 /* aput-object v2, v1, v0 */
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* iput v3, p0, Lcom/doodlemobile/basket/p;->f:I */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.n;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.n;
		 v1 = this.o;
		 this.e = v1;
		 v0 = this.m;
		 this.o = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 this.m = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 this.n = v0;
	 } // :cond_1
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public final void a ( Object p0 ) {
	 /* .locals 2 */
	 v0 = this.c;
	 /* iget v1, p0, Lcom/doodlemobile/basket/p;->f:I */
	 /* aput-object p1, v0, v1 */
	 /* iget v0, p0, Lcom/doodlemobile/basket/p;->f:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/p;->f:I */
	 return;
} // .end method
public final void a ( Object p0, Integer p1, Integer p2, java.lang.Object p3 ) {
	 /* .locals 2 */
	 v0 = this.o;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.o;
		 v1 = this.e;
		 this.o = v1;
		 int v1 = 0; // const/4 v1, 0x0
		 this.e = v1;
	 } // :goto_0
	 this.a = p1;
	 /* iput p2, v0, Lcom/doodlemobile/basket/a;->b:I */
	 /* iput p3, v0, Lcom/doodlemobile/basket/a;->c:I */
	 this.d = p4;
	 v1 = this.j;
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 v1 = this.j;
		 this.e = v0;
	 } // :goto_1
	 this.j = v0;
	 return;
} // :cond_0
/* new-instance v0, Lcom/doodlemobile/basket/a; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/basket/a;-><init>(Lcom/doodlemobile/basket/p;)V */
} // :cond_1
this.i = v0;
} // .end method
public final void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 9 */
int v8 = 0; // const/4 v8, 0x0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* monitor-enter p0 */
} // :goto_0
try { // :try_start_0
/* iget-boolean v2, p0, Lcom/doodlemobile/basket/p;->a:Z */
/* if-nez v2, :cond_2 */
/* iget-boolean v2, p0, Lcom/doodlemobile/basket/p;->b:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
} // :goto_1
return;
} // :cond_1
try { // :try_start_1
(( java.lang.Object ) p0 ).wait ( ); // invoke-virtual {p0}, Ljava/lang/Object;->wait()V
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v2 */
} // :cond_2
try { // :try_start_2
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* sget-wide v4, Lcom/doodlemobile/basket/p;->q:J */
/* sub-long v0, v2, v0 */
/* add-long/2addr v0, v4 */
/* sput-wide v0, Lcom/doodlemobile/basket/p;->q:J */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/p;->a:Z */
v0 = this.d;
v1 = this.e;
this.d = v1;
this.e = v0;
/* iget v0, p0, Lcom/doodlemobile/basket/p;->g:I */
/* iget v1, p0, Lcom/doodlemobile/basket/p;->h:I */
/* iput v1, p0, Lcom/doodlemobile/basket/p;->g:I */
/* iput v0, p0, Lcom/doodlemobile/basket/p;->h:I */
v0 = this.k;
v1 = this.l;
int v4 = 0; // const/4 v4, 0x0
this.k = v4;
int v4 = 0; // const/4 v4, 0x0
this.l = v4;
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* sget-wide v6, Lcom/doodlemobile/basket/p;->r:J */
/* sub-long v2, v4, v2 */
/* add-long/2addr v2, v6 */
/* sput-wide v2, Lcom/doodlemobile/basket/p;->r:J */
if ( v0 != null) { // if-eqz v0, :cond_3
/* move-object v2, v0 */
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_3
(( com.doodlemobile.basket.a ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/a;->a()V
v2 = this.e;
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
/* monitor-exit p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* throw v0 */
} // :cond_3
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* sget-wide v6, Lcom/doodlemobile/basket/p;->s:J */
/* sub-long v4, v2, v4 */
/* add-long/2addr v4, v6 */
/* sput-wide v4, Lcom/doodlemobile/basket/p;->s:J */
/* monitor-enter p0 */
try { // :try_start_4
v4 = this.n;
/* if-nez v4, :cond_5 */
this.m = v0;
this.n = v1;
} // :cond_4
} // :goto_3
/* monitor-exit p0 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sget-wide v4, Lcom/doodlemobile/basket/p;->t:J */
/* sub-long v2, v0, v2 */
/* add-long/2addr v2, v4 */
/* sput-wide v2, Lcom/doodlemobile/basket/p;->t:J */
/* move v2, v8 */
} // :goto_4
/* iget v3, p0, Lcom/doodlemobile/basket/p;->h:I */
/* if-ge v2, v3, :cond_6 */
v3 = this.e;
/* aget-object v3, v3, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_5
try { // :try_start_5
v4 = this.n;
this.e = v0;
if ( v1 != null) { // if-eqz v1, :cond_4
this.n = v1;
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* throw v0 */
} // :cond_6
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* sget-wide v4, Lcom/doodlemobile/basket/p;->u:J */
/* sub-long v0, v2, v0 */
/* add-long/2addr v0, v4 */
/* sput-wide v0, Lcom/doodlemobile/basket/p;->u:J */
/* add-int/lit8 v0, v0, 0x1 */
/* const/16 v1, 0x3e8 */
/* if-le v0, v1, :cond_0 */
/* const-wide/16 v0, 0x0 */
/* sput-wide v0, Lcom/doodlemobile/basket/p;->u:J */
/* sput-wide v0, Lcom/doodlemobile/basket/p;->t:J */
/* sput-wide v0, Lcom/doodlemobile/basket/p;->s:J */
/* sput-wide v0, Lcom/doodlemobile/basket/p;->r:J */
/* sput-wide v0, Lcom/doodlemobile/basket/p;->q:J */
/* goto/16 :goto_1 */
} // .end method
public final void b ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.d;
v1 = this.c;
this.d = v1;
this.c = v0;
/* iget v0, p0, Lcom/doodlemobile/basket/p;->g:I */
/* iget v1, p0, Lcom/doodlemobile/basket/p;->f:I */
/* iput v1, p0, Lcom/doodlemobile/basket/p;->g:I */
/* iput v0, p0, Lcom/doodlemobile/basket/p;->f:I */
v0 = this.l;
/* if-nez v0, :cond_1 */
v0 = this.i;
this.k = v0;
v0 = this.j;
this.l = v0;
} // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/p;->a:Z */
(( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
this.i = v2;
this.j = v2;
return;
} // :cond_1
try { // :try_start_1
v0 = this.l;
v1 = this.i;
this.e = v1;
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.j;
this.l = v0;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
public final void c ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/p;->b:Z */
/* monitor-enter p0 */
try { // :try_start_0
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public final void d ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/p;->b:Z */
/* monitor-enter p0 */
try { // :try_start_0
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public final void e ( ) {
/* .locals 3 */
/* monitor-enter p0 */
} // :goto_0
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/p;->a:Z */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/p;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_1
return;
} // :cond_0
try { // :try_start_1
(( java.lang.Object ) p0 ).wait ( ); // invoke-virtual {p0}, Ljava/lang/Object;->wait()V
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_2
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/p;->a:Z */
v0 = this.d;
v1 = this.e;
this.d = v1;
this.e = v0;
/* iget v0, p0, Lcom/doodlemobile/basket/p;->g:I */
/* iget v1, p0, Lcom/doodlemobile/basket/p;->h:I */
/* iput v1, p0, Lcom/doodlemobile/basket/p;->g:I */
/* iput v0, p0, Lcom/doodlemobile/basket/p;->h:I */
v0 = this.k;
v1 = this.l;
int v2 = 0; // const/4 v2, 0x0
this.k = v2;
int v2 = 0; // const/4 v2, 0x0
this.l = v2;
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* move-object v2, v0 */
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_2
(( com.doodlemobile.basket.a ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/a;->a()V
v2 = this.e;
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
	 /* monitor-exit p0 */
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 /* throw v0 */
} // :cond_2
/* monitor-enter p0 */
try { // :try_start_4
	 v2 = this.n;
	 /* if-nez v2, :cond_4 */
	 this.m = v0;
	 this.n = v1;
} // :cond_3
} // :goto_3
/* monitor-exit p0 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* throw v0 */
} // :cond_4
try { // :try_start_5
v2 = this.n;
this.e = v0;
if ( v1 != null) { // if-eqz v1, :cond_3
this.n = v1;
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
} // .end method
