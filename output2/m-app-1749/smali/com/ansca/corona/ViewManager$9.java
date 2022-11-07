class com.ansca.corona.ViewManager$9 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setTextViewSize(IF)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Integer val$id; //synthetic
final Float val$size; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$9 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 314 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$9;->val$id:I */
/* iput p3, p0, Lcom/ansca/corona/ViewManager$9;->val$size:F */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 316 */
v1 = this.this$0;
/* iget v2, p0, Lcom/ansca/corona/ViewManager$9;->val$id:I */
com.ansca.corona.ViewManager .access$300 ( v1,v2 );
/* .line 317 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 320 */
} // :goto_0
return;
/* .line 319 */
} // :cond_0
/* iget v1, p0, Lcom/ansca/corona/ViewManager$9;->val$size:F */
(( com.ansca.corona.CoronaEditText ) v0 ).setTextViewSize ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaEditText;->setTextViewSize(F)V
} // .end method
