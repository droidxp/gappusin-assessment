class com.ansca.corona.ViewManager$5 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setTextViewEditable(IZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Integer val$id; //synthetic
final Boolean val$isEditable; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 228 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$5;->val$id:I */
/* iput-boolean p3, p0, Lcom/ansca/corona/ViewManager$5;->val$isEditable:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 230 */
v1 = this.this$0;
/* iget v2, p0, Lcom/ansca/corona/ViewManager$5;->val$id:I */
com.ansca.corona.ViewManager .access$300 ( v1,v2 );
/* .line 231 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 232 */
	 /* iget-boolean v1, p0, Lcom/ansca/corona/ViewManager$5;->val$isEditable:Z */
	 /* if-nez v1, :cond_1 */
	 int v1 = 1; // const/4 v1, 0x1
} // :goto_0
(( com.ansca.corona.CoronaEditText ) v0 ).setReadOnly ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaEditText;->setReadOnly(Z)V
/* .line 233 */
/* iget-boolean v1, p0, Lcom/ansca/corona/ViewManager$5;->val$isEditable:Z */
(( com.ansca.corona.CoronaEditText ) v0 ).setFocusable ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaEditText;->setFocusable(Z)V
/* .line 234 */
/* iget-boolean v1, p0, Lcom/ansca/corona/ViewManager$5;->val$isEditable:Z */
(( com.ansca.corona.CoronaEditText ) v0 ).setFocusableInTouchMode ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaEditText;->setFocusableInTouchMode(Z)V
/* .line 236 */
} // :cond_0
return;
/* .line 232 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
