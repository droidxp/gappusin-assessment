class com.ansca.corona.Controller$16 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->showSendSmsWindow(Ljava/util/HashMap;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final com.ansca.corona.SmsSettings val$smsSettings; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$16 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 882 */
this.this$0 = p1;
this.val$smsSettings = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 884 */
/* monitor-enter p0 */
/* .line 885 */
try { // :try_start_0
	 v0 = 	 com.ansca.corona.Controller .isValid ( );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 886 */
		 com.ansca.corona.Controller .getActivity ( );
		 v1 = this.val$smsSettings;
		 (( com.ansca.corona.CoronaActivity ) v0 ).showSendSmsWindowUsing ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->showSendSmsWindowUsing(Lcom/ansca/corona/SmsSettings;)V
		 /* .line 888 */
	 } // :cond_0
	 /* monitor-exit p0 */
	 /* .line 889 */
	 return;
	 /* .line 888 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
