class com.ansca.corona.ViewManager$14 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->displayObjectUpdateScreenBounds(IIIII)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Integer val$height; //synthetic
final Integer val$id; //synthetic
final Integer val$left; //synthetic
final Integer val$top; //synthetic
final Integer val$width; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$14 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 434 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$14;->val$id:I */
/* iput p3, p0, Lcom/ansca/corona/ViewManager$14;->val$width:I */
/* iput p4, p0, Lcom/ansca/corona/ViewManager$14;->val$height:I */
/* iput p5, p0, Lcom/ansca/corona/ViewManager$14;->val$left:I */
/* iput p6, p0, Lcom/ansca/corona/ViewManager$14;->val$top:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
/* .line 436 */
v2 = this.this$0;
com.ansca.corona.ViewManager .access$200 ( v2 );
/* new-instance v3, Ljava/lang/Integer; */
/* iget v4, p0, Lcom/ansca/corona/ViewManager$14;->val$id:I */
/* invoke-direct {v3, v4}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
/* .line 437 */
/* .local v1, "view":Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 438 */
	 /* new-instance v0, Landroid/widget/AbsoluteLayout$LayoutParams; */
	 /* iget v2, p0, Lcom/ansca/corona/ViewManager$14;->val$width:I */
	 /* iget v3, p0, Lcom/ansca/corona/ViewManager$14;->val$height:I */
	 /* iget v4, p0, Lcom/ansca/corona/ViewManager$14;->val$left:I */
	 /* iget v5, p0, Lcom/ansca/corona/ViewManager$14;->val$top:I */
	 /* invoke-direct {v0, v2, v3, v4, v5}, Landroid/widget/AbsoluteLayout$LayoutParams;-><init>(IIII)V */
	 /* .line 439 */
	 /* .local v0, "params":Landroid/view/ViewGroup$LayoutParams; */
	 (( android.view.View ) v1 ).setLayoutParams ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 441 */
} // .end local v0 # "params":Landroid/view/ViewGroup$LayoutParams;
} // :cond_0
return;
} // .end method
