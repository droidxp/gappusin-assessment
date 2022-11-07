class com.acv.a.Wd extends java.lang.Thread {
	 /* # instance fields */
	 public java.lang.String a;
	 final com.acv.a.Mk b; //synthetic
	 private java.lang.String c;
	 private Integer d;
	 private com.acv.a.Gg e;
	 /* # direct methods */
	 public com.acv.a.Wd ( ) {
		 /* .locals 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 /* const-class v0, Lcom/acv/a/Wd; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 this.a = v0;
		 this.c = p2;
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/acv/a/Wd;->d:I */
		 /* new-instance v0, Lcom/acv/a/Gg; */
		 /* invoke-direct {v0}, Lcom/acv/a/Gg;-><init>()V */
		 this.e = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/acv/a/Wd;->d:I */
	 } // .end method
	 public void run ( ) {
		 /* .locals 3 */
		 /* invoke-super {p0}, Ljava/lang/Thread;->run()V */
		 try { // :try_start_0
			 v0 = this.e;
			 v1 = this.c;
			 (( com.acv.a.Gg ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/acv/a/Gg;->a(Ljava/lang/String;)[B
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* const/16 v0, 0xc8 */
				 /* iput v0, p0, Lcom/acv/a/Wd;->d:I */
				 /* :try_end_0 */
				 /* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 } // :cond_0
			 v0 = this.e;
			 (( com.acv.a.Gg ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/acv/a/Gg;->a()V
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 try { // :try_start_1
			 v1 = this.a;
			 final String v2 = "ClientProtocolException!"; // const-string v2, "ClientProtocolException!"
			 com.acv.a.Aa .a ( v1,v2,v0 );
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 v0 = this.e;
			 (( com.acv.a.Gg ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/acv/a/Gg;->a()V
			 /* :catch_1 */
			 /* move-exception v0 */
			 try { // :try_start_2
				 v1 = this.a;
				 final String v2 = "IOException!"; // const-string v2, "IOException!"
				 com.acv.a.Aa .a ( v1,v2,v0 );
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
				 v0 = this.e;
				 (( com.acv.a.Gg ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/acv/a/Gg;->a()V
				 /* :catchall_0 */
				 /* move-exception v0 */
				 v1 = this.e;
				 (( com.acv.a.Gg ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/acv/a/Gg;->a()V
				 /* throw v0 */
			 } // .end method
