class com.heyzap.sdk.HeyzapMarmalade {
	 /* # instance fields */
	 private final java.lang.Runnable m_CheckinHeyzap;
	 private final com.heyzap.sdk.HeyzapMarmalade$CheckinWithMessageRunnable m_CheckinHeyzapWithMessage;
	 private final com.heyzap.sdk.HeyzapMarmalade$LoadRunnable m_LoadHeyzap;
	 /* # direct methods */
	 com.heyzap.sdk.HeyzapMarmalade ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/heyzap/sdk/HeyzapMarmalade$1; */
		 /* invoke-direct {v0, p0}, Lcom/heyzap/sdk/HeyzapMarmalade$1;-><init>(Lcom/heyzap/sdk/HeyzapMarmalade;)V */
		 this.m_CheckinHeyzap = v0;
		 /* new-instance v0, Lcom/heyzap/sdk/HeyzapMarmalade$CheckinWithMessageRunnable; */
		 /* invoke-direct {v0, p0, v1}, Lcom/heyzap/sdk/HeyzapMarmalade$CheckinWithMessageRunnable;-><init>(Lcom/heyzap/sdk/HeyzapMarmalade;Lcom/heyzap/sdk/HeyzapMarmalade$1;)V */
		 this.m_CheckinHeyzapWithMessage = v0;
		 /* new-instance v0, Lcom/heyzap/sdk/HeyzapMarmalade$LoadRunnable; */
		 /* invoke-direct {v0, p0, v1}, Lcom/heyzap/sdk/HeyzapMarmalade$LoadRunnable;-><init>(Lcom/heyzap/sdk/HeyzapMarmalade;Lcom/heyzap/sdk/HeyzapMarmalade$1;)V */
		 this.m_LoadHeyzap = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void checkinHeyzap ( ) {
		 /* .locals 2 */
		 v0 = com.ideaworks3d.marmalade.LoaderActivity.m_Activity;
		 v1 = this.m_CheckinHeyzap;
		 (( com.ideaworks3d.marmalade.LoaderActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->runOnUiThread(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
	 public void checkinHeyzapWithMessage ( java.lang.String p0 ) {
		 /* .locals 2 */
		 v0 = this.m_CheckinHeyzapWithMessage;
		 this.m_Message = p1;
		 v0 = com.ideaworks3d.marmalade.LoaderActivity.m_Activity;
		 v1 = this.m_CheckinHeyzapWithMessage;
		 (( com.ideaworks3d.marmalade.LoaderActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->runOnUiThread(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
	 public void loadHeyzap ( java.lang.String p0, java.lang.String p1, Boolean p2 ) {
		 /* .locals 2 */
		 v0 = this.m_LoadHeyzap;
		 /* iput-boolean p3, v0, Lcom/heyzap/sdk/HeyzapMarmalade$LoadRunnable;->m_AndroidToast:Z */
		 v0 = com.ideaworks3d.marmalade.LoaderActivity.m_Activity;
		 v1 = this.m_LoadHeyzap;
		 (( com.ideaworks3d.marmalade.LoaderActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->runOnUiThread(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
