class com.ansca.corona.ViewManager$4 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setTextViewSingleLine(IZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Integer val$id; //synthetic
final Boolean val$isSingleLine; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 209 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$4;->val$id:I */
/* iput-boolean p3, p0, Lcom/ansca/corona/ViewManager$4;->val$isSingleLine:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 211 */
v1 = this.this$0;
/* iget v2, p0, Lcom/ansca/corona/ViewManager$4;->val$id:I */
com.ansca.corona.ViewManager .access$300 ( v1,v2 );
/* .line 212 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 213 */
	 /* iget-boolean v1, p0, Lcom/ansca/corona/ViewManager$4;->val$isSingleLine:Z */
	 (( com.ansca.corona.CoronaEditText ) v0 ).setSingleLine ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaEditText;->setSingleLine(Z)V
	 /* .line 215 */
} // :cond_0
return;
} // .end method
