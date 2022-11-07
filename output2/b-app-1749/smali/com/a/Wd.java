class com.a.Wd implements java.lang.Runnable {
	 /* # interfaces */
	 /* # direct methods */
	 com.a.Wd ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
	 } // :goto_0
	 int v0 = 1; // const/4 v0, 0x1
	 try { // :try_start_0
		 com.a.Gb .a ( v0 );
		 com.a.Gb .c ( );
		 /* sget-wide v0, Lcom/a/Gb;->h:J */
		 java.lang.Thread .sleep ( v0,v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
