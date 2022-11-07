class com.umeng.common.net.i implements java.lang.Runnable {
	 /* .source "DownloadingService.java" */
	 /* # interfaces */
	 /* # instance fields */
	 final com.umeng.common.net.DownloadingService a; //synthetic
	 private final java.lang.String b; //synthetic
	 /* # direct methods */
	 com.umeng.common.net.i ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 /* .line 894 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 897 */
		 v0 = this.a;
		 com.umeng.common.net.DownloadingService .b ( v0 );
		 v1 = this.b;
		 int v2 = 0; // const/4 v2, 0x0
		 android.widget.Toast .makeText ( v0,v1,v2 );
		 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
		 /* .line 898 */
		 return;
	 } // .end method
