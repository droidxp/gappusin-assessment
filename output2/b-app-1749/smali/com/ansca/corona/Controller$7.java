class com.ansca.corona.Controller$7 implements android.content.DialogInterface$OnClickListener {
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
 com.ansca.corona.Controller$7 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 616 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "arg0" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 618 */
/* move v0, p2 */
/* .line 619 */
/* .local v0, "buttonIndex":I */
/* if-gez p2, :cond_0 */
/* .line 620 */
/* packed-switch p2, :pswitch_data_0 */
/* .line 633 */
} // :cond_0
} // :goto_0
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v1 ).nativeAlertResult ( v0 ); // invoke-virtual {v1, v0}, Lcom/ansca/corona/events/EventManager;->nativeAlertResult(I)V
/* .line 634 */
/* monitor-enter p0 */
/* .line 635 */
try { // :try_start_0
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
com.ansca.corona.Controller .access$402 ( v1,v2 );
/* .line 636 */
/* monitor-exit p0 */
/* .line 637 */
return;
/* .line 622 */
/* :pswitch_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 623 */
/* .line 625 */
/* :pswitch_1 */
int v0 = 2; // const/4 v0, 0x2
/* .line 626 */
/* .line 628 */
/* :pswitch_2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 636 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
/* .line 620 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch -0x3 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
