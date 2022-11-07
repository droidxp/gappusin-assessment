class inal extends java.lang.Thread {
	 /* # instance fields */
	 private Boolean a;
	 private Boolean b;
	 private Boolean c;
	 private Boolean d;
	 private Boolean e;
	 private Boolean f;
	 private Boolean g;
	 private Boolean h;
	 private Integer i;
	 private Integer j;
	 private Integer k;
	 private Boolean l;
	 private Boolean m;
	 private java.util.ArrayList n;
	 private com.doodlemobile.basket.opengl.h o;
	 private com.doodlemobile.basket.opengl.a p;
	 private com.doodlemobile.basket.opengl.l q; //synthetic
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 this.q = p1;
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.n = v0;
		 /* iput v1, p0, Lcom/doodlemobile/basket/opengl/d;->i:I */
		 /* iput v1, p0, Lcom/doodlemobile/basket/opengl/d;->j:I */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/opengl/d;->l:Z */
		 /* iput v2, p0, Lcom/doodlemobile/basket/opengl/d;->k:I */
		 this.o = p2;
		 return;
	 } // .end method
	 static Boolean a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/opengl/d;->b:Z */
	 } // .end method
	 private void d ( ) {
		 /* .locals 6 */
		 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/opengl/d;->h:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/opengl/d;->h:Z */
			 v0 = this.p;
			 v1 = this.c;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 v1 = this.c;
				 v2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
				 /* if-eq v1, v2, :cond_0 */
				 v1 = this.a;
				 v2 = this.b;
				 v3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
				 v4 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
				 v5 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
				 v1 = this.d;
				 com.doodlemobile.basket.opengl.l .e ( v1 );
				 v2 = this.a;
				 v3 = this.b;
				 v4 = this.c;
				 int v1 = 0; // const/4 v1, 0x0
				 this.c = v1;
			 } // :cond_0
			 return;
		 } // .end method
		 private void e ( ) {
			 /* .locals 1 */
			 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/opengl/d;->g:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = this.p;
				 (( com.doodlemobile.basket.opengl.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/opengl/a;->b()V
				 int v0 = 0; // const/4 v0, 0x0
				 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/opengl/d;->g:Z */
				 com.doodlemobile.basket.opengl.l .b ( );
				 (( com.doodlemobile.basket.opengl.f ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lcom/doodlemobile/basket/opengl/f;->c(Lcom/doodlemobile/basket/opengl/d;)V
			 } // :cond_0
			 return;
		 } // .end method
		 private void f ( ) {
			 /* .locals 21 */
			 /* new-instance v2, Lcom/doodlemobile/basket/opengl/a; */
			 /* move-object/from16 v0, p0 */
			 v0 = this.q;
			 /* move-object v3, v0 */
			 /* invoke-direct {v2, v3}, Lcom/doodlemobile/basket/opengl/a;-><init>(Lcom/doodlemobile/basket/opengl/l;)V */
			 /* move-object v0, v2 */
			 /* move-object/from16 v1, p0 */
			 this.p = v0;
			 int v2 = 0; // const/4 v2, 0x0
			 /* move v0, v2 */
			 /* move-object/from16 v1, p0 */
			 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->g:Z */
			 int v2 = 0; // const/4 v2, 0x0
			 /* move v0, v2 */
			 /* move-object/from16 v1, p0 */
			 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->h:Z */
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 0; // const/4 v3, 0x0
			 int v4 = 0; // const/4 v4, 0x0
			 int v5 = 0; // const/4 v5, 0x0
			 int v6 = 0; // const/4 v6, 0x0
			 int v7 = 0; // const/4 v7, 0x0
			 int v8 = 0; // const/4 v8, 0x0
			 int v9 = 0; // const/4 v9, 0x0
			 int v10 = 0; // const/4 v10, 0x0
			 int v11 = 0; // const/4 v11, 0x0
			 /* move-object/from16 v16, v11 */
			 /* move-object v11, v2 */
			 /* move-object/from16 v2, v16 */
			 /* move/from16 v17, v9 */
			 /* move v9, v4 */
			 /* move/from16 v4, v17 */
			 /* move/from16 v18, v7 */
			 /* move v7, v6 */
			 /* move/from16 v6, v18 */
			 /* move/from16 v19, v5 */
			 /* move v5, v8 */
			 /* move/from16 v8, v19 */
			 /* move/from16 v20, v3 */
			 /* move v3, v10 */
			 /* move/from16 v10, v20 */
		 } // :cond_0
	 } // :goto_0
	 try { // :try_start_0
		 com.doodlemobile.basket.opengl.l .b ( );
		 /* monitor-enter v12 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
	 } // :goto_1
	 try { // :try_start_1
		 /* move-object/from16 v0, p0 */
		 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->a:Z */
		 /* move v13, v0 */
		 if ( v13 != null) { // if-eqz v13, :cond_1
			 /* monitor-exit v12 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
			 com.doodlemobile.basket.opengl.l .b ( );
			 /* monitor-enter v2 */
			 try { // :try_start_2
				 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->d()V */
				 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->e()V */
				 /* monitor-exit v2 */
			 } // :goto_2
			 return;
			 /* :catchall_0 */
			 /* move-exception v3 */
			 /* monitor-exit v2 */
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* throw v3 */
		 } // :cond_1
		 try { // :try_start_3
			 /* move-object/from16 v0, p0 */
			 v0 = this.n;
			 /* move-object v13, v0 */
			 v13 = 			 (( java.util.ArrayList ) v13 ).isEmpty ( ); // invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z
			 /* if-nez v13, :cond_2 */
			 /* move-object/from16 v0, p0 */
			 v0 = this.n;
			 /* move-object v2, v0 */
			 int v13 = 0; // const/4 v13, 0x0
			 (( java.util.ArrayList ) v2 ).remove ( v13 ); // invoke-virtual {v2, v13}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
			 /* check-cast v2, Ljava/lang/Runnable; */
		 } // :goto_3
		 /* monitor-exit v12 */
		 /* :try_end_3 */
		 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
		 if ( v2 != null) { // if-eqz v2, :cond_f
			 try { // :try_start_4
				 /* :try_end_4 */
				 /* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
				 int v2 = 0; // const/4 v2, 0x0
			 } // :cond_2
			 try { // :try_start_5
				 /* move-object/from16 v0, p0 */
				 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->d:Z */
				 /* move v13, v0 */
				 /* move-object/from16 v0, p0 */
				 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->c:Z */
				 /* move v14, v0 */
				 /* if-eq v13, v14, :cond_3 */
				 /* move-object/from16 v0, p0 */
				 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->c:Z */
				 /* move v13, v0 */
				 /* move v0, v13 */
				 /* move-object/from16 v1, p0 */
				 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->d:Z */
				 com.doodlemobile.basket.opengl.l .b ( );
				 (( java.lang.Object ) v13 ).notifyAll ( ); // invoke-virtual {v13}, Ljava/lang/Object;->notifyAll()V
			 } // :cond_3
			 if ( v8 != null) { // if-eqz v8, :cond_4
				 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->d()V */
				 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->e()V */
				 int v8 = 0; // const/4 v8, 0x0
			 } // :cond_4
			 /* move-object/from16 v0, p0 */
			 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->h:Z */
			 /* move v13, v0 */
			 if ( v13 != null) { // if-eqz v13, :cond_5
				 /* move-object/from16 v0, p0 */
				 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->d:Z */
				 /* move v13, v0 */
				 if ( v13 != null) { // if-eqz v13, :cond_5
					 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->d()V */
					 com.doodlemobile.basket.opengl.l .b ( );
					 (( com.doodlemobile.basket.opengl.f ) v13 ).a ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/opengl/f;->a()Z
					 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->e()V */
					 com.doodlemobile.basket.opengl.l .b ( );
					 v13 = 					 (( com.doodlemobile.basket.opengl.f ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/opengl/f;->b()Z
					 if ( v13 != null) { // if-eqz v13, :cond_5
						 /* move-object/from16 v0, p0 */
						 v0 = this.p;
						 /* move-object v13, v0 */
						 (( com.doodlemobile.basket.opengl.a ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/opengl/a;->b()V
					 } // :cond_5
					 /* move-object/from16 v0, p0 */
					 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->e:Z */
					 /* move v13, v0 */
					 /* if-nez v13, :cond_7 */
					 /* move-object/from16 v0, p0 */
					 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->f:Z */
					 /* move v13, v0 */
					 /* if-nez v13, :cond_7 */
					 /* move-object/from16 v0, p0 */
					 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->h:Z */
					 /* move v13, v0 */
					 if ( v13 != null) { // if-eqz v13, :cond_6
						 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->d()V */
					 } // :cond_6
					 int v13 = 1; // const/4 v13, 0x1
					 /* move v0, v13 */
					 /* move-object/from16 v1, p0 */
					 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->f:Z */
					 com.doodlemobile.basket.opengl.l .b ( );
					 (( java.lang.Object ) v13 ).notifyAll ( ); // invoke-virtual {v13}, Ljava/lang/Object;->notifyAll()V
				 } // :cond_7
				 /* move-object/from16 v0, p0 */
				 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->e:Z */
				 /* move v13, v0 */
				 if ( v13 != null) { // if-eqz v13, :cond_8
					 /* move-object/from16 v0, p0 */
					 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->f:Z */
					 /* move v13, v0 */
					 if ( v13 != null) { // if-eqz v13, :cond_8
						 int v13 = 0; // const/4 v13, 0x0
						 /* move v0, v13 */
						 /* move-object/from16 v1, p0 */
						 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->f:Z */
						 com.doodlemobile.basket.opengl.l .b ( );
						 (( java.lang.Object ) v13 ).notifyAll ( ); // invoke-virtual {v13}, Ljava/lang/Object;->notifyAll()V
					 } // :cond_8
					 if ( v5 != null) { // if-eqz v5, :cond_9
						 int v5 = 0; // const/4 v5, 0x0
						 int v6 = 0; // const/4 v6, 0x0
						 int v13 = 1; // const/4 v13, 0x1
						 /* move v0, v13 */
						 /* move-object/from16 v1, p0 */
						 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->m:Z */
						 com.doodlemobile.basket.opengl.l .b ( );
						 (( java.lang.Object ) v13 ).notifyAll ( ); // invoke-virtual {v13}, Ljava/lang/Object;->notifyAll()V
						 /* move/from16 v16, v6 */
						 /* move v6, v5 */
						 /* move/from16 v5, v16 */
					 } // :cond_9
					 /* move-object/from16 v0, p0 */
					 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->d:Z */
					 /* move v13, v0 */
					 /* if-nez v13, :cond_e */
					 /* move-object/from16 v0, p0 */
					 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->e:Z */
					 /* move v13, v0 */
					 if ( v13 != null) { // if-eqz v13, :cond_e
						 /* move-object/from16 v0, p0 */
						 /* iget v0, v0, Lcom/doodlemobile/basket/opengl/d;->i:I */
						 /* move v13, v0 */
						 /* if-lez v13, :cond_e */
						 /* move-object/from16 v0, p0 */
						 /* iget v0, v0, Lcom/doodlemobile/basket/opengl/d;->j:I */
						 /* move v13, v0 */
						 /* if-lez v13, :cond_e */
						 /* move-object/from16 v0, p0 */
						 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->l:Z */
						 /* move v13, v0 */
						 /* if-nez v13, :cond_a */
						 /* move-object/from16 v0, p0 */
						 /* iget v0, v0, Lcom/doodlemobile/basket/opengl/d;->k:I */
						 /* move v13, v0 */
						 int v14 = 1; // const/4 v14, 0x1
						 /* if-ne v13, v14, :cond_e */
					 } // :cond_a
					 /* move-object/from16 v0, p0 */
					 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->g:Z */
					 /* move v13, v0 */
					 /* if-nez v13, :cond_b */
					 com.doodlemobile.basket.opengl.l .b ( );
					 /* move-object v0, v13 */
					 /* move-object/from16 v1, p0 */
					 (( com.doodlemobile.basket.opengl.f ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/opengl/f;->b(Lcom/doodlemobile/basket/opengl/d;)Z
					 /* :try_end_5 */
					 v13 = 					 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
					 if ( v13 != null) { // if-eqz v13, :cond_b
						 try { // :try_start_6
							 /* move-object/from16 v0, p0 */
							 v0 = this.p;
							 /* move-object v10, v0 */
							 (( com.doodlemobile.basket.opengl.a ) v10 ).a ( ); // invoke-virtual {v10}, Lcom/doodlemobile/basket/opengl/a;->a()V
							 /* :try_end_6 */
							 /* .catch Ljava/lang/RuntimeException; {:try_start_6 ..:try_end_6} :catch_0 */
							 /* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
							 int v10 = 1; // const/4 v10, 0x1
							 try { // :try_start_7
								 /* move v0, v10 */
								 /* move-object/from16 v1, p0 */
								 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->g:Z */
								 int v10 = 1; // const/4 v10, 0x1
								 com.doodlemobile.basket.opengl.l .b ( );
								 (( java.lang.Object ) v13 ).notifyAll ( ); // invoke-virtual {v13}, Ljava/lang/Object;->notifyAll()V
							 } // :cond_b
							 /* move-object/from16 v0, p0 */
							 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->g:Z */
							 /* move v13, v0 */
							 if ( v13 != null) { // if-eqz v13, :cond_c
								 /* move-object/from16 v0, p0 */
								 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->h:Z */
								 /* move v13, v0 */
								 /* if-nez v13, :cond_c */
								 int v7 = 1; // const/4 v7, 0x1
								 /* move v0, v7 */
								 /* move-object/from16 v1, p0 */
								 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->h:Z */
								 int v7 = 1; // const/4 v7, 0x1
								 int v9 = 1; // const/4 v9, 0x1
								 /* move/from16 v16, v9 */
								 /* move v9, v7 */
								 /* move/from16 v7, v16 */
							 } // :cond_c
							 /* move-object/from16 v0, p0 */
							 /* iget-boolean v0, v0, Lcom/doodlemobile/basket/opengl/d;->h:Z */
							 /* move v13, v0 */
							 if ( v13 != null) { // if-eqz v13, :cond_e
								 /* move-object/from16 v0, p0 */
								 v0 = this.q;
								 /* move-object v13, v0 */
								 v13 = 								 com.doodlemobile.basket.opengl.l .g ( v13 );
								 if ( v13 != null) { // if-eqz v13, :cond_d
									 int v3 = 1; // const/4 v3, 0x1
									 /* move-object/from16 v0, p0 */
									 /* iget v0, v0, Lcom/doodlemobile/basket/opengl/d;->i:I */
									 /* move v4, v0 */
									 /* move-object/from16 v0, p0 */
									 /* iget v0, v0, Lcom/doodlemobile/basket/opengl/d;->j:I */
									 /* move v6, v0 */
									 int v7 = 1; // const/4 v7, 0x1
									 /* move-object/from16 v0, p0 */
									 v0 = this.q;
									 /* move-object v13, v0 */
									 int v14 = 0; // const/4 v14, 0x0
									 com.doodlemobile.basket.opengl.l .a ( v13,v14 );
									 /* move/from16 v16, v6 */
									 /* move v6, v7 */
									 /* move v7, v3 */
									 /* move/from16 v3, v16 */
								 } // :goto_4
								 com.doodlemobile.basket.opengl.l .b ( );
								 (( java.lang.Object ) v13 ).notifyAll ( ); // invoke-virtual {v13}, Ljava/lang/Object;->notifyAll()V
								 /* goto/16 :goto_3 */
								 /* :catchall_1 */
								 /* move-exception v2 */
								 /* monitor-exit v12 */
								 /* :try_end_7 */
								 /* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
								 try { // :try_start_8
									 /* throw v2 */
									 /* :try_end_8 */
									 /* .catchall {:try_start_8 ..:try_end_8} :catchall_2 */
									 /* :catchall_2 */
									 /* move-exception v2 */
									 com.doodlemobile.basket.opengl.l .b ( );
									 /* monitor-enter v3 */
									 try { // :try_start_9
										 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->d()V */
										 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->e()V */
										 /* monitor-exit v3 */
										 /* :try_end_9 */
										 /* .catchall {:try_start_9 ..:try_end_9} :catchall_4 */
										 /* throw v2 */
										 /* :catch_0 */
										 /* move-exception v2 */
										 try { // :try_start_a
											 com.doodlemobile.basket.opengl.l .b ( );
											 /* move-object v0, v3 */
											 /* move-object/from16 v1, p0 */
											 (( com.doodlemobile.basket.opengl.f ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/opengl/f;->c(Lcom/doodlemobile/basket/opengl/d;)V
											 /* throw v2 */
										 } // :cond_d
										 int v13 = 0; // const/4 v13, 0x0
										 /* move v0, v13 */
										 /* move-object/from16 v1, p0 */
										 /* iput-boolean v0, v1, Lcom/doodlemobile/basket/opengl/d;->l:Z */
									 } // :cond_e
									 com.doodlemobile.basket.opengl.l .b ( );
									 (( java.lang.Object ) v13 ).wait ( ); // invoke-virtual {v13}, Ljava/lang/Object;->wait()V
									 /* :try_end_a */
									 /* .catchall {:try_start_a ..:try_end_a} :catchall_1 */
									 /* goto/16 :goto_1 */
								 } // :cond_f
								 if ( v9 != null) { // if-eqz v9, :cond_10
									 try { // :try_start_b
										 /* move-object/from16 v0, p0 */
										 v0 = this.p;
										 /* move-object v9, v0 */
										 /* move-object/from16 v0, p0 */
										 v0 = this.q;
										 /* move-object v11, v0 */
										 (( com.doodlemobile.basket.opengl.l ) v11 ).getHolder ( ); // invoke-virtual {v11}, Lcom/doodlemobile/basket/opengl/l;->getHolder()Landroid/view/SurfaceHolder;
										 (( com.doodlemobile.basket.opengl.a ) v9 ).a ( v11 ); // invoke-virtual {v9, v11}, Lcom/doodlemobile/basket/opengl/a;->a(Landroid/view/SurfaceHolder;)Lcom/doodlemobile/basket/opengl/m;
										 if ( v9 != null) { // if-eqz v9, :cond_15
											 com.doodlemobile.basket.opengl.l .b ( );
											 (( com.doodlemobile.basket.opengl.f ) v11 ).c ( ); // invoke-virtual {v11}, Lcom/doodlemobile/basket/opengl/f;->c()V
											 int v11 = 0; // const/4 v11, 0x0
											 /* move/from16 v16, v11 */
											 /* move-object v11, v9 */
											 /* move/from16 v9, v16 */
										 } // :cond_10
										 if ( v10 != null) { // if-eqz v10, :cond_11
											 /* move-object/from16 v0, p0 */
											 v0 = this.o;
											 /* move-object v10, v0 */
											 int v10 = 0; // const/4 v10, 0x0
										 } // :cond_11
										 if ( v7 != null) { // if-eqz v7, :cond_12
											 /* move-object/from16 v0, p0 */
											 v0 = this.o;
											 /* move-object v7, v0 */
											 int v7 = 0; // const/4 v7, 0x0
										 } // :cond_12
										 /* move-object/from16 v0, p0 */
										 v0 = this.o;
										 /* move-object v12, v0 */
										 /* move-object/from16 v0, p0 */
										 v0 = this.p;
										 /* move-object v12, v0 */
										 v13 = this.a;
										 v14 = this.b;
										 v15 = this.c;
										 v12 = this.a;
										 /* :try_end_b */
										 v12 = 										 /* .catchall {:try_start_b ..:try_end_b} :catchall_2 */
										 /* const/16 v13, 0x300e */
										 /* if-eq v12, v13, :cond_14 */
										 int v12 = 1; // const/4 v12, 0x1
									 } // :goto_5
									 /* if-nez v12, :cond_13 */
									 int v8 = 1; // const/4 v8, 0x1
								 } // :cond_13
								 if ( v6 != null) { // if-eqz v6, :cond_0
									 int v5 = 1; // const/4 v5, 0x1
									 /* goto/16 :goto_0 */
								 } // :cond_14
								 int v12 = 0; // const/4 v12, 0x0
							 } // :cond_15
							 com.doodlemobile.basket.opengl.l .b ( );
							 /* monitor-enter v2 */
							 try { // :try_start_c
								 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->d()V */
								 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/opengl/d;->e()V */
								 /* monitor-exit v2 */
								 /* goto/16 :goto_2 */
								 /* :catchall_3 */
								 /* move-exception v3 */
								 /* monitor-exit v2 */
								 /* :try_end_c */
								 /* .catchall {:try_start_c ..:try_end_c} :catchall_3 */
								 /* throw v3 */
								 /* :catchall_4 */
								 /* move-exception v2 */
								 try { // :try_start_d
									 /* monitor-exit v3 */
									 /* :try_end_d */
									 /* .catchall {:try_start_d ..:try_end_d} :catchall_4 */
									 /* throw v2 */
								 } // .end method
								 /* # virtual methods */
								 public final void a ( ) {
									 /* .locals 2 */
									 com.doodlemobile.basket.opengl.l .b ( );
									 /* monitor-enter v0 */
									 int v1 = 1; // const/4 v1, 0x1
									 try { // :try_start_0
										 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->e:Z */
										 com.doodlemobile.basket.opengl.l .b ( );
										 (( java.lang.Object ) v1 ).notifyAll ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
									 } // :goto_0
									 /* iget-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->f:Z */
									 if ( v1 != null) { // if-eqz v1, :cond_0
										 /* iget-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->b:Z */
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* if-nez v1, :cond_0 */
										 try { // :try_start_1
											 com.doodlemobile.basket.opengl.l .b ( );
											 (( java.lang.Object ) v1 ).wait ( ); // invoke-virtual {v1}, Ljava/lang/Object;->wait()V
											 /* :try_end_1 */
											 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
											 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
											 /* :catch_0 */
											 /* move-exception v1 */
											 try { // :try_start_2
												 java.lang.Thread .currentThread ( );
												 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
												 /* :catchall_0 */
												 /* move-exception v1 */
												 /* monitor-exit v0 */
												 /* :try_end_2 */
												 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
												 /* throw v1 */
											 } // :cond_0
											 try { // :try_start_3
												 /* monitor-exit v0 */
												 /* :try_end_3 */
												 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
												 return;
											 } // .end method
											 public final void a ( Integer p0, Integer p1 ) {
												 /* .locals 3 */
												 com.doodlemobile.basket.opengl.l .b ( );
												 /* monitor-enter v0 */
												 try { // :try_start_0
													 /* iput p1, p0, Lcom/doodlemobile/basket/opengl/d;->i:I */
													 /* iput p2, p0, Lcom/doodlemobile/basket/opengl/d;->j:I */
													 v1 = this.q;
													 int v2 = 1; // const/4 v2, 0x1
													 com.doodlemobile.basket.opengl.l .a ( v1,v2 );
													 int v1 = 1; // const/4 v1, 0x1
													 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->l:Z */
													 int v1 = 0; // const/4 v1, 0x0
													 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->m:Z */
													 com.doodlemobile.basket.opengl.l .b ( );
													 (( java.lang.Object ) v1 ).notifyAll ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
												 } // :goto_0
												 /* iget-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->b:Z */
												 /* if-nez v1, :cond_0 */
												 /* iget-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->d:Z */
												 /* if-nez v1, :cond_0 */
												 /* iget-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->m:Z */
												 /* :try_end_0 */
												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
												 /* if-nez v1, :cond_0 */
												 try { // :try_start_1
													 com.doodlemobile.basket.opengl.l .b ( );
													 (( java.lang.Object ) v1 ).wait ( ); // invoke-virtual {v1}, Ljava/lang/Object;->wait()V
													 /* :try_end_1 */
													 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
													 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
													 /* :catch_0 */
													 /* move-exception v1 */
													 try { // :try_start_2
														 java.lang.Thread .currentThread ( );
														 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
														 /* :catchall_0 */
														 /* move-exception v1 */
														 /* monitor-exit v0 */
														 /* :try_end_2 */
														 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
														 /* throw v1 */
													 } // :cond_0
													 try { // :try_start_3
														 /* monitor-exit v0 */
														 /* :try_end_3 */
														 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
														 return;
													 } // .end method
													 public final void b ( ) {
														 /* .locals 2 */
														 com.doodlemobile.basket.opengl.l .b ( );
														 /* monitor-enter v0 */
														 int v1 = 0; // const/4 v1, 0x0
														 try { // :try_start_0
															 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->e:Z */
															 com.doodlemobile.basket.opengl.l .b ( );
															 (( java.lang.Object ) v1 ).notifyAll ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
														 } // :goto_0
														 /* iget-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->f:Z */
														 /* if-nez v1, :cond_0 */
														 /* iget-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->b:Z */
														 /* :try_end_0 */
														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 /* if-nez v1, :cond_0 */
														 try { // :try_start_1
															 com.doodlemobile.basket.opengl.l .b ( );
															 (( java.lang.Object ) v1 ).wait ( ); // invoke-virtual {v1}, Ljava/lang/Object;->wait()V
															 /* :try_end_1 */
															 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
															 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
															 /* :catch_0 */
															 /* move-exception v1 */
															 try { // :try_start_2
																 java.lang.Thread .currentThread ( );
																 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
																 /* :catchall_0 */
																 /* move-exception v1 */
																 /* monitor-exit v0 */
																 /* :try_end_2 */
																 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
																 /* throw v1 */
															 } // :cond_0
															 try { // :try_start_3
																 /* monitor-exit v0 */
																 /* :try_end_3 */
																 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
																 return;
															 } // .end method
															 public final void c ( ) {
																 /* .locals 2 */
																 com.doodlemobile.basket.opengl.l .b ( );
																 /* monitor-enter v0 */
																 int v1 = 1; // const/4 v1, 0x1
																 try { // :try_start_0
																	 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->a:Z */
																	 com.doodlemobile.basket.opengl.l .b ( );
																	 (( java.lang.Object ) v1 ).notifyAll ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
																 } // :goto_0
																 /* iget-boolean v1, p0, Lcom/doodlemobile/basket/opengl/d;->b:Z */
																 /* :try_end_0 */
																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																 /* if-nez v1, :cond_0 */
																 try { // :try_start_1
																	 com.doodlemobile.basket.opengl.l .b ( );
																	 (( java.lang.Object ) v1 ).wait ( ); // invoke-virtual {v1}, Ljava/lang/Object;->wait()V
																	 /* :try_end_1 */
																	 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
																	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
																	 /* :catch_0 */
																	 /* move-exception v1 */
																	 try { // :try_start_2
																		 java.lang.Thread .currentThread ( );
																		 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
																		 /* :catchall_0 */
																		 /* move-exception v1 */
																		 /* monitor-exit v0 */
																		 /* :try_end_2 */
																		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
																		 /* throw v1 */
																	 } // :cond_0
																	 try { // :try_start_3
																		 /* monitor-exit v0 */
																		 /* :try_end_3 */
																		 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
																		 return;
																	 } // .end method
																	 public final void run ( ) {
																		 /* .locals 3 */
																		 /* new-instance v0, Ljava/lang/StringBuilder; */
																		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
																		 final String v1 = "GLThread "; // const-string v1, "GLThread "
																		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																		 (( com.doodlemobile.basket.opengl.d ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/opengl/d;->getId()J
																		 /* move-result-wide v1 */
																		 (( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
																		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
																		 (( com.doodlemobile.basket.opengl.d ) p0 ).setName ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/opengl/d;->setName(Ljava/lang/String;)V
																		 try { // :try_start_0
																			 /* invoke-direct {p0}, Lcom/doodlemobile/basket/opengl/d;->f()V */
																			 /* :try_end_0 */
																			 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
																			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																			 com.doodlemobile.basket.opengl.l .b ( );
																			 (( com.doodlemobile.basket.opengl.f ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/doodlemobile/basket/opengl/f;->a(Lcom/doodlemobile/basket/opengl/d;)V
																		 } // :goto_0
																		 return;
																		 /* :catch_0 */
																		 /* move-exception v0 */
																		 com.doodlemobile.basket.opengl.l .b ( );
																		 (( com.doodlemobile.basket.opengl.f ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/doodlemobile/basket/opengl/f;->a(Lcom/doodlemobile/basket/opengl/d;)V
																		 /* :catchall_0 */
																		 /* move-exception v0 */
																		 com.doodlemobile.basket.opengl.l .b ( );
																		 (( com.doodlemobile.basket.opengl.f ) v1 ).a ( p0 ); // invoke-virtual {v1, p0}, Lcom/doodlemobile/basket/opengl/f;->a(Lcom/doodlemobile/basket/opengl/d;)V
																		 /* throw v0 */
																	 } // .end method
