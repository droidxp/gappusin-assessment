class com.ansca.corona.ViewManager$8 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setTextViewColor(II)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Integer val$color; //synthetic
final Integer val$id; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$8 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 294 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$8;->val$id:I */
/* iput p3, p0, Lcom/ansca/corona/ViewManager$8;->val$color:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 296 */
v1 = this.this$0;
/* iget v2, p0, Lcom/ansca/corona/ViewManager$8;->val$id:I */
com.ansca.corona.ViewManager .access$300 ( v1,v2 );
/* .line 297 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 300 */
} // :goto_0
return;
/* .line 299 */
} // :cond_0
/* iget v1, p0, Lcom/ansca/corona/ViewManager$8;->val$color:I */
(( com.ansca.corona.CoronaEditText ) v0 ).setTextViewColor ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaEditText;->setTextViewColor(I)V
} // .end method
