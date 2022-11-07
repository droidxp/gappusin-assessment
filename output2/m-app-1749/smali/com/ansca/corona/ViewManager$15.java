class com.ansca.corona.ViewManager$15 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setDisplayObjectBackground(IZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Boolean val$bg; //synthetic
final Integer val$id; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$15 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 459 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$15;->val$id:I */
/* iput-boolean p3, p0, Lcom/ansca/corona/ViewManager$15;->val$bg:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 461 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$200 ( v1 );
/* new-instance v2, Ljava/lang/Integer; */
/* iget v3, p0, Lcom/ansca/corona/ViewManager$15;->val$id:I */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 462 */
/* .local v0, "view":Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 464 */
	 /* iget-boolean v1, p0, Lcom/ansca/corona/ViewManager$15;->val$bg:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 465 */
		 int v1 = -1; // const/4 v1, -0x1
		 (( android.view.View ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V
		 /* .line 469 */
	 } // :cond_0
} // :goto_0
return;
/* .line 467 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
(( android.view.View ) v0 ).setBackgroundDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
} // .end method
