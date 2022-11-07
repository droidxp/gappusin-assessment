class com.a.f.v implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 java.lang.String a;
	 java.io.File b;
	 private final java.lang.String c; //synthetic
	 private final android.app.ProgressDialog d; //synthetic
	 /* # direct methods */
	 com.a.f.v ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.c = p1;
		 this.d = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = v0;
		 this.b = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 v0 = this.c;
			 v1 = this.d;
			 com.a.f.o .a ( v0,v1 );
			 this.a = v0;
			 v0 = this.a;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* if-nez v0, :cond_2 */
			 try { // :try_start_1
				 v0 = com.a.f.o.b;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 v0 = com.a.f.o.b;
					 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
					 int v0 = 0; // const/4 v0, 0x0
				 } // :cond_0
				 v0 = com.a.f.o.a;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 v0 = com.a.f.o.a;
					 (( java.io.RandomAccessFile ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
					 int v0 = 0; // const/4 v0, 0x0
					 /* :try_end_1 */
					 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_4 */
				 } // :cond_1
			 } // :goto_0
			 return;
		 } // :cond_2
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_2
			 com.a.f.o.e = (v0!= 0);
			 /* new-instance v0, Ljava/io/File; */
			 v1 = this.a;
			 /* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
			 this.b = v0;
			 /* const-wide/16 v0, 0xbb8 */
			 java.lang.Thread .sleep ( v0,v1 );
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 final String v1 = "chmod 777 "; // const-string v1, "chmod 777 "
			 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 v1 = this.b;
			 (( java.io.File ) v1 ).getAbsolutePath ( ); // invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 java.lang.Runtime .getRuntime ( );
			 (( java.lang.Runtime ) v1 ).exec ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
			 v0 = this.b;
			 com.a.f.o .a ( v0 );
			 v0 = this.d;
			 (( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
			 com.a.f.o .e ( );
			 (( com.calmei.jmsn.PlaneFightActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/calmei/jmsn/PlaneFightActivity;->finish()V
			 v0 = 			 android.os.Process .myPid ( );
			 android.os.Process .killProcess ( v0 );
			 /* :try_end_2 */
			 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 try { // :try_start_3
				 v0 = com.a.f.o.b;
				 if ( v0 != null) { // if-eqz v0, :cond_3
					 v0 = com.a.f.o.b;
					 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
					 int v0 = 0; // const/4 v0, 0x0
				 } // :cond_3
				 v0 = com.a.f.o.a;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 v0 = com.a.f.o.a;
					 (( java.io.RandomAccessFile ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
					 int v0 = 0; // const/4 v0, 0x0
					 /* :try_end_3 */
					 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
					 /* :catch_0 */
					 /* move-exception v0 */
					 /* :catch_1 */
					 /* move-exception v0 */
					 try { // :try_start_4
						 /* new-instance v1, Landroid/os/Message; */
						 /* invoke-direct {v1}, Landroid/os/Message;-><init>()V */
						 int v2 = 2; // const/4 v2, 0x2
						 /* iput v2, v1, Landroid/os/Message;->what:I */
						 v2 = this.d;
						 (( android.app.ProgressDialog ) v2 ).dismiss ( ); // invoke-virtual {v2}, Landroid/app/ProgressDialog;->dismiss()V
						 v2 = com.a.f.o.f;
						 (( android.os.Handler ) v2 ).sendMessage ( v1 ); // invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
						 /* sget-boolean v1, Lcom/calmei/jmsn/PlaneFightActivity;->i:Z */
						 if ( v1 != null) { // if-eqz v1, :cond_5
							 com.a.f.o .e ( );
							 (( com.calmei.jmsn.PlaneFightActivity ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/calmei/jmsn/PlaneFightActivity;->c()V
						 } // :goto_1
						 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
						 /* :try_end_4 */
						 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
						 try { // :try_start_5
							 v0 = com.a.f.o.b;
							 if ( v0 != null) { // if-eqz v0, :cond_4
								 v0 = com.a.f.o.b;
								 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
								 int v0 = 0; // const/4 v0, 0x0
							 } // :cond_4
							 v0 = com.a.f.o.a;
							 if ( v0 != null) { // if-eqz v0, :cond_1
								 v0 = com.a.f.o.a;
								 (( java.io.RandomAccessFile ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
								 int v0 = 0; // const/4 v0, 0x0
								 /* :try_end_5 */
								 /* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_2 */
								 /* goto/16 :goto_0 */
								 /* :catch_2 */
								 /* move-exception v0 */
								 /* goto/16 :goto_0 */
							 } // :cond_5
							 int v1 = 1; // const/4 v1, 0x1
							 try { // :try_start_6
								 com.calmei.jmsn.PlaneFightActivity.j = (v1!= 0);
								 /* :try_end_6 */
								 /* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
								 /* :catchall_0 */
								 /* move-exception v0 */
								 try { // :try_start_7
									 v1 = com.a.f.o.b;
									 if ( v1 != null) { // if-eqz v1, :cond_6
										 v1 = com.a.f.o.b;
										 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
										 int v1 = 0; // const/4 v1, 0x0
									 } // :cond_6
									 v1 = com.a.f.o.a;
									 if ( v1 != null) { // if-eqz v1, :cond_7
										 v1 = com.a.f.o.a;
										 (( java.io.RandomAccessFile ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
										 int v1 = 0; // const/4 v1, 0x0
										 /* :try_end_7 */
										 /* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_3 */
									 } // :cond_7
								 } // :goto_2
								 /* throw v0 */
								 /* :catch_3 */
								 /* move-exception v1 */
								 /* :catch_4 */
								 /* move-exception v0 */
								 /* goto/16 :goto_0 */
							 } // .end method
