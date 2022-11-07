class com.umeng.common.net.k implements java.lang.Runnable {
	 /* .source "DownloadingService.java" */
	 /* # interfaces */
	 /* # instance fields */
	 final com.umeng.common.net.DownloadingService$b a; //synthetic
	 /* # direct methods */
	 com.umeng.common.net.k ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 1 */
		 this.a = p1;
		 /* .line 711 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 714 */
		 v0 = this.a;
		 com.umeng.common.net.DownloadingService$b .b ( v0 );
		 /* .line 715 */
		 v1 = this.a;
		 com.umeng.common.net.DownloadingService$b .a ( v1 );
		 v1 = 		 com.umeng.common.a.c .h ( v1 );
		 /* .line 716 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 714 */
		 android.widget.Toast .makeText ( v0,v1,v2 );
		 /* .line 716 */
		 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
		 /* .line 717 */
		 return;
	 } // .end method
