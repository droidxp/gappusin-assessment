public class inal {
	 /* # static fields */
	 private static com.doodlemobile.basket.k a;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static com.doodlemobile.basket.k a ( ) {
		 /* .locals 2 */
		 v0 = com.doodlemobile.basket.e.a;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lcom/doodlemobile/basket/k; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/k;-><init>()V */
	 } // :goto_0
} // :cond_0
v0 = com.doodlemobile.basket.e.a;
v1 = this.c;
int v1 = 0; // const/4 v1, 0x0
this.c = v1;
} // .end method
static void a ( Object p0 ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
v0 = com.doodlemobile.basket.e.a;
this.c = v0;
return;
} // .end method
public static void a ( Object p0, Object p1 ) {
/* .locals 2 */
com.doodlemobile.basket.e .a ( );
this.a = p1;
int v1 = 1; // const/4 v1, 0x1
/* iput v1, v0, Lcom/doodlemobile/basket/k;->b:I */
(( com.doodlemobile.basket.p ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
return;
} // .end method
public static void b ( Object p0, Object p1 ) {
/* .locals 2 */
com.doodlemobile.basket.e .a ( );
this.a = p1;
int v1 = 2; // const/4 v1, 0x2
/* iput v1, v0, Lcom/doodlemobile/basket/k;->b:I */
(( com.doodlemobile.basket.p ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
return;
} // .end method
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ->b:J */
/* cmp-long v0, v3, v5 */
/* if-gtz v0, :cond_7 */
/* const-wide/16 v3, 0x10 */
try { // :try_start_6
	 java.lang.Thread .sleep ( v3,v4 );
	 /* :try_end_6 */
	 /* .catch Ljava/lang/InterruptedException; {:try_start_6 ..:try_end_6} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
} // :cond_6
/* if-lt v4, v1, :cond_8 */
} // :cond_7
com.doodlemobile.basket.n .f ( );
/* monitor-enter v1 */
try { // :try_start_7
v0 = com.doodlemobile.basket.n.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* new-array v0, v0, [Lcom/doodlemobile/basket/b/d; */
v2 = com.doodlemobile.basket.n.a;
(( java.util.ArrayList ) v2 ).toArray ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v0, [Lcom/doodlemobile/basket/b/d; */
v2 = com.doodlemobile.basket.n.a;
(( java.util.ArrayList ) v2 ).clear ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
/* monitor-exit v1 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_2 */
/* array-length v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_c
} // :cond_8
com.doodlemobile.basket.n .f ( );
/* monitor-enter v2 */
/* move-object v3, v10 */
/* move v4, v9 */
} // :goto_5
/* if-ge v4, v1, :cond_a */
try { // :try_start_8
v5 = /* aget-object v3, v0, v4 */
v5 = /* if-nez v5, :cond_9 */
if ( v5 != null) { // if-eqz v5, :cond_a
	 com.doodlemobile.basket.n .g ( );
	 (( java.util.concurrent.ConcurrentLinkedQueue ) v5 ).add ( v3 ); // invoke-virtual {v5, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z
} // :cond_9
/* sub-int/2addr v5, v8 */
/* iget-boolean v5, p0, Lcom/doodlemobile/basket/j;->a:Z */
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_3 */
/* if-nez v5, :cond_a */
/* add-int/lit8 v4, v4, 0x1 */
/* :catchall_2 */
/* move-exception v0 */
try { // :try_start_9
	 /* monitor-exit v1 */
	 /* :try_end_9 */
	 /* .catchall {:try_start_9 ..:try_end_9} :catchall_2 */
	 /* throw v0 */
} // :cond_a
try { // :try_start_a
	 /* monitor-exit v2 */
	 /* :try_end_a */
	 /* .catchall {:try_start_a ..:try_end_a} :catchall_3 */
	 /* if-ge v4, v1, :cond_6 */
	 com.doodlemobile.basket.n .g ( );
	 (( java.util.concurrent.ConcurrentLinkedQueue ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z
	 /* sub-int/2addr v2, v8 */
} // :cond_b
com.doodlemobile.basket.n .g ( );
v2 = (( java.util.concurrent.ConcurrentLinkedQueue ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I
/* if-lez v2, :cond_6 */
/* const-wide/16 v2, 0x10 */
try { // :try_start_b
	 java.lang.Thread .sleep ( v2,v3 );
	 /* :try_end_b */
	 /* .catch Ljava/lang/InterruptedException; {:try_start_b ..:try_end_b} :catch_2 */
} // :goto_6
/* iget-boolean v2, p0, Lcom/doodlemobile/basket/j;->a:Z */
if ( v2 != null) { // if-eqz v2, :cond_b
	 com.doodlemobile.basket.n .g ( );
	 (( java.util.concurrent.ConcurrentLinkedQueue ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V
	 java.lang.System .gc ( );
	 com.doodlemobile.basket.n .h ( );
	 /* goto/16 :goto_3 */
	 /* :catchall_3 */
	 /* move-exception v0 */
	 try { // :try_start_c
		 /* monitor-exit v2 */
		 /* :try_end_c */
		 /* .catchall {:try_start_c ..:try_end_c} :catchall_3 */
		 /* throw v0 */
	 } // :cond_c
	 com.doodlemobile.basket.n .h ( );
	 final String v0 = "Basket"; // const-string v0, "Basket"
	 final String v1 = "#--Loading complete.--#"; // const-string v1, "#--Loading complete.--#"
	 com.doodlemobile.basket.util.b .a ( v0,v1 );
	 /* goto/16 :goto_3 */
	 /* :catch_1 */
	 /* move-exception v4 */
	 /* goto/16 :goto_2 */
	 /* :catch_2 */
	 /* move-exception v2 */
} // .end method
