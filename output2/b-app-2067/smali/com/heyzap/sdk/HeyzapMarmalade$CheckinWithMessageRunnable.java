class com.heyzap.sdk.HeyzapMarmalade$CheckinWithMessageRunnable implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.String m_Message;
	 final com.heyzap.sdk.HeyzapMarmalade this$0; //synthetic
	 /* # direct methods */
	 private com.heyzap.sdk.HeyzapMarmalade$CheckinWithMessageRunnable ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 com.heyzap.sdk.HeyzapMarmalade$CheckinWithMessageRunnable ( ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/heyzap/sdk/HeyzapMarmalade$CheckinWithMessageRunnable;-><init>(Lcom/heyzap/sdk/HeyzapMarmalade;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 v0 = com.ideaworks3d.marmalade.LoaderActivity.m_Activity;
		 v1 = this.m_Message;
		 com.heyzap.sdk.HeyzapLib .checkin ( v0,v1 );
		 return;
	 } // .end method
