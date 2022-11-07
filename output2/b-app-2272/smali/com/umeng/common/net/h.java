class com.umeng.common.net.h extends android.content.BroadcastReceiver {
	 /* .source "DownloadingService.java" */
	 /* # instance fields */
	 final com.umeng.common.net.DownloadingService a; //synthetic
	 /* # direct methods */
	 com.umeng.common.net.h ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 1 */
		 this.a = p1;
		 /* .line 479 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 482 */
		 v0 = this.a;
		 com.umeng.common.net.DownloadingService .a ( v0 );
		 v1 = this.a;
		 com.umeng.common.net.DownloadingService .c ( );
		 com.umeng.common.net.DownloadingService .b ( );
		 (( com.umeng.common.net.d ) v0 ).a ( v1, v2, v3, p2 ); // invoke-virtual {v0, v1, v2, v3, p2}, Lcom/umeng/common/net/d;->a(Lcom/umeng/common/net/DownloadingService;Landroid/util/SparseArray;Ljava/util/Map;Landroid/content/Intent;)Z
		 /* .line 485 */
		 return;
	 } // .end method
