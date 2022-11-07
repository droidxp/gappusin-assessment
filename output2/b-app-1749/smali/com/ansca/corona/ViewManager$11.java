class com.ansca.corona.ViewManager$11 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setTextViewText(ILjava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Integer val$id; //synthetic
final java.lang.String val$text; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$11 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 366 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$11;->val$id:I */
this.val$text = p3;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 368 */
v1 = this.this$0;
/* iget v2, p0, Lcom/ansca/corona/ViewManager$11;->val$id:I */
com.ansca.corona.ViewManager .access$300 ( v1,v2 );
/* .line 369 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 373 */
} // :goto_0
return;
/* .line 372 */
} // :cond_0
v1 = this.val$text;
(( com.ansca.corona.CoronaEditText ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaEditText;->setText(Ljava/lang/CharSequence;)V
} // .end method
