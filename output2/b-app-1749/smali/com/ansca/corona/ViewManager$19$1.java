class com.ansca.corona.ViewManager$19$1 implements android.view.View$OnTouchListener {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager$19;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager$19 this$1; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$19$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 612 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 1 */
/* .param p1, "v" # Landroid/view/View; */
/* .param p2, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 615 */
v0 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* packed-switch v0, :pswitch_data_0 */
/* .line 623 */
} // :cond_0
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 618 */
/* :pswitch_0 */
v0 = (( android.view.View ) p1 ).hasFocus ( ); // invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z
/* if-nez v0, :cond_0 */
/* .line 619 */
(( android.view.View ) p1 ).requestFocus ( ); // invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z
/* .line 615 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
