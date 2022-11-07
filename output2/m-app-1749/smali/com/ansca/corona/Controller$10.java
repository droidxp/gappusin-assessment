class com.ansca.corona.Controller$10 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->cancelNativeAlert(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final Integer val$buttonIndex; //synthetic
final android.app.AlertDialog val$theDialog; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$10 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 691 */
this.this$0 = p1;
this.val$theDialog = p2;
/* iput p3, p0, Lcom/ansca/corona/Controller$10;->val$buttonIndex:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 694 */
v0 = this.val$theDialog;
(( android.app.AlertDialog ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V
/* .line 696 */
com.ansca.corona.Controller .getEventManager ( );
/* iget v1, p0, Lcom/ansca/corona/Controller$10;->val$buttonIndex:I */
(( com.ansca.corona.events.EventManager ) v0 ).nativeAlertResult ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->nativeAlertResult(I)V
/* .line 697 */
return;
} // .end method
