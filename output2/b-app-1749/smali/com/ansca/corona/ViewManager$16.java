class com.ansca.corona.ViewManager$16 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->destroyVideoView()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$16 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 507 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 509 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$500 ( v1 );
/* if-nez v1, :cond_0 */
/* .line 522 */
} // :goto_0
return;
/* .line 513 */
} // :cond_0
v1 = this.this$0;
com.ansca.corona.ViewManager .access$500 ( v1 );
(( com.ansca.corona.CoronaVideoView ) v1 ).getParent ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaVideoView;->getParent()Landroid/view/ViewParent;
/* .line 514 */
/* .local v0, "parentView":Landroid/view/ViewParent; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* instance-of v1, v0, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 515 */
/* check-cast v0, Landroid/view/ViewGroup; */
} // .end local v0 # "parentView":Landroid/view/ViewParent;
v1 = this.this$0;
com.ansca.corona.ViewManager .access$500 ( v1 );
(( android.view.ViewGroup ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 517 */
} // :cond_1
v1 = this.this$0;
com.ansca.corona.ViewManager .access$100 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 518 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$100 ( v1 );
(( com.ansca.corona.CoronaActivity ) v1 ).getGLView ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getGLView()Landroid/view/View;
int v2 = 0; // const/4 v2, 0x0
(( android.view.View ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
/* .line 519 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$100 ( v1 );
(( com.ansca.corona.CoronaActivity ) v1 ).getGLView ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getGLView()Landroid/view/View;
(( android.view.View ) v1 ).requestFocus ( ); // invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z
/* .line 521 */
} // :cond_2
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
com.ansca.corona.ViewManager .access$502 ( v1,v2 );
} // .end method
