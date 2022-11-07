class com.heyzap.sdk.HeyzapMarmalade$LoadRunnable implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 public Boolean m_AndroidToast;
	 final com.heyzap.sdk.HeyzapMarmalade this$0; //synthetic
	 /* # direct methods */
	 private com.heyzap.sdk.HeyzapMarmalade$LoadRunnable ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 com.heyzap.sdk.HeyzapMarmalade$LoadRunnable ( ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/heyzap/sdk/HeyzapMarmalade$LoadRunnable;-><init>(Lcom/heyzap/sdk/HeyzapMarmalade;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 v0 = com.ideaworks3d.marmalade.LoaderActivity.m_Activity;
		 /* iget-boolean v1, p0, Lcom/heyzap/sdk/HeyzapMarmalade$LoadRunnable;->m_AndroidToast:Z */
		 com.heyzap.sdk.HeyzapLib .load ( v0,v1 );
		 return;
	 } // .end method
