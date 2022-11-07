class com.ansca.corona.Controller$8 implements android.content.DialogInterface$OnCancelListener {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->showNativeAlert(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$8 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 639 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCancel ( android.content.DialogInterface p0 ) {
/* .locals 2 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .prologue */
/* .line 641 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 642 */
	 com.ansca.corona.Controller .getEventManager ( );
	 int v1 = -1; // const/4 v1, -0x1
	 (( com.ansca.corona.events.EventManager ) v0 ).nativeAlertResult ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->nativeAlertResult(I)V
	 /* .line 643 */
	 /* monitor-enter p0 */
	 /* .line 644 */
	 try { // :try_start_0
		 v0 = this.this$0;
		 int v1 = 0; // const/4 v1, 0x0
		 com.ansca.corona.Controller .access$402 ( v0,v1 );
		 /* .line 645 */
		 /* monitor-exit p0 */
		 /* .line 647 */
	 } // :cond_0
	 return;
	 /* .line 645 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
