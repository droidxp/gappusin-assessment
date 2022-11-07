class com.heyzap.sdk.HeyzapMarmalade$1 implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 final com.heyzap.sdk.HeyzapMarmalade this$0; //synthetic
	 /* # direct methods */
	 com.heyzap.sdk.HeyzapMarmalade$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 v0 = com.ideaworks3d.marmalade.LoaderActivity.m_Activity;
		 com.heyzap.sdk.HeyzapLib .checkin ( v0 );
		 return;
	 } // .end method
