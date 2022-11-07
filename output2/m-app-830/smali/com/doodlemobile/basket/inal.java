class inal extends java.lang.Thread {
	 /* # instance fields */
	 Boolean a;
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/j;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void run ( ) {
		 /* .locals 11 */
		 int v10 = 0; // const/4 v10, 0x0
		 int v9 = 0; // const/4 v9, 0x0
		 int v8 = 1; // const/4 v8, 0x1
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v1 */
	 } // :goto_0
	 com.doodlemobile.basket.n .f ( );
	 /* monitor-enter v3 */
	 try { // :try_start_0
		 v0 = com.doodlemobile.basket.n.a;
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/b/d; */
		 v4 = com.doodlemobile.basket.n.a;
		 (( java.util.ArrayList ) v4 ).toArray ( v0 ); // invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
		 /* check-cast v0, [Lcom/doodlemobile/basket/b/d; */
		 v4 = com.doodlemobile.basket.n.a;
		 (( java.util.ArrayList ) v4 ).clear ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V
		 /* monitor-exit v3 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* array-length v3, v0 */
		 if ( v3 != null) { // if-eqz v3, :cond_5
		 } // :cond_0
		 com.doodlemobile.basket.n .f ( );
		 /* monitor-enter v4 */
		 /* move-object v5, v10 */
		 /* move v6, v9 */
	 } // :goto_1
	 /* if-ge v6, v3, :cond_2 */
	 try { // :try_start_1
		 v7 = 		 /* aget-object v5, v0, v6 */
		 v7 = 		 /* if-nez v7, :cond_1 */
		 if ( v7 != null) { // if-eqz v7, :cond_2
			 com.doodlemobile.basket.n .g ( );
			 (( java.util.concurrent.ConcurrentLinkedQueue ) v7 ).add ( v5 ); // invoke-virtual {v7, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z
		 } // :cond_1
		 /* sub-int/2addr v7, v8 */
		 /* iget-boolean v7, p0, Lcom/doodlemobile/basket/j;->a:Z */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
		 /* if-nez v7, :cond_2 */
		 /* add-int/lit8 v6, v6, 0x1 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 try { // :try_start_2
			 /* monitor-exit v3 */
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* throw v0 */
		 } // :cond_2
		 try { // :try_start_3
			 /* monitor-exit v4 */
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
			 /* if-ge v6, v3, :cond_4 */
			 com.doodlemobile.basket.n .g ( );
			 (( java.util.concurrent.ConcurrentLinkedQueue ) v4 ).add ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z
			 /* sub-int/2addr v4, v8 */
		 } // :cond_3
		 com.doodlemobile.basket.n .g ( );
		 v4 = 		 (( java.util.concurrent.ConcurrentLinkedQueue ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I
		 /* if-lez v4, :cond_4 */
		 /* const-wide/16 v4, 0x10 */
		 try { // :try_start_4
			 java.lang.Thread .sleep ( v4,v5 );
			 /* :try_end_4 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_4 ..:try_end_4} :catch_1 */
		 } // :goto_2
		 /* iget-boolean v4, p0, Lcom/doodlemobile/basket/j;->a:Z */
		 if ( v4 != null) { // if-eqz v4, :cond_3
			 com.doodlemobile.basket.n .g ( );
			 (( java.util.concurrent.ConcurrentLinkedQueue ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V
			 java.lang.System .gc ( );
			 com.doodlemobile.basket.n .h ( );
		 } // :goto_3
		 return;
		 /* :catchall_1 */
		 /* move-exception v0 */
		 try { // :try_start_5
			 /* monitor-exit v4 */
			 /* :try_end_5 */
			 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
			 /* throw v0 */
		 } // :cond_4
		 /* if-lt v6, v3, :cond_0 */
		 /* goto/16 :goto_0 */
	 } // :cond_5
} // :goto_4
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* sub-long/2addr v3, v1 */
/* sget-wide v5, Lcom/doodlemobile/basket/n;->b:J */
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
