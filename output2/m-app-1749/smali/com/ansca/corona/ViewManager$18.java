class com.ansca.corona.ViewManager$18 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->destroyWebView(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final com.ansca.corona.CoronaWebView val$webView; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$18 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 575 */
this.this$0 = p1;
this.val$webView = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 577 */
v1 = this.val$webView;
(( com.ansca.corona.CoronaWebView ) v1 ).stopLoading ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaWebView;->stopLoading()V
/* .line 578 */
v1 = this.val$webView;
(( com.ansca.corona.CoronaWebView ) v1 ).getParent ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaWebView;->getParent()Landroid/view/ViewParent;
/* .line 579 */
/* .local v0, "parentView":Landroid/view/ViewParent; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* instance-of v1, v0, Landroid/view/ViewGroup; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 580 */
		 /* check-cast v0, Landroid/view/ViewGroup; */
	 } // .end local v0 # "parentView":Landroid/view/ViewParent;
	 v1 = this.val$webView;
	 (( android.view.ViewGroup ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
	 /* .line 582 */
} // :cond_0
return;
} // .end method
