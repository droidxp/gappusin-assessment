class com.ansca.corona.Controller$6 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->internalSetIdleTimer(Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$6 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 581 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 584 */
v1 = this.this$0;
com.ansca.corona.Controller .access$300 ( v1 );
(( com.ansca.corona.CoronaActivity ) v1 ).getWindow ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getWindow()Landroid/view/Window;
/* .line 585 */
/* .local v0, "window":Landroid/view/Window; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 587 */
	 /* const/16 v1, 0x80 */
	 (( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
	 /* .line 589 */
} // :cond_0
return;
} // .end method
