class com.ansca.corona.ViewManager$13 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setDisplayObjectVisible(IZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Integer val$id; //synthetic
final Boolean val$visible; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$13 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 424 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$13;->val$id:I */
/* iput-boolean p3, p0, Lcom/ansca/corona/ViewManager$13;->val$visible:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 426 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$200 ( v1 );
/* new-instance v2, Ljava/lang/Integer; */
/* iget v3, p0, Lcom/ansca/corona/ViewManager$13;->val$id:I */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 427 */
/* .local v0, "view":Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 428 */
	 /* iget-boolean v1, p0, Lcom/ansca/corona/ViewManager$13;->val$visible:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 (( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
	 /* .line 429 */
} // :cond_0
return;
/* .line 428 */
} // :cond_1
int v1 = 4; // const/4 v1, 0x4
} // .end method
