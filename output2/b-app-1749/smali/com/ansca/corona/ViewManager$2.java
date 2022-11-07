class com.ansca.corona.ViewManager$2 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->destroyTextView(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final com.ansca.corona.CoronaEditText val$textView; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 172 */
this.this$0 = p1;
this.val$textView = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 174 */
v1 = this.val$textView;
/* instance-of v1, v1, Lcom/ansca/corona/CoronaEditText; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 175 */
	 v1 = this.val$textView;
	 (( com.ansca.corona.CoronaEditText ) v1 ).destroying ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaEditText;->destroying()V
	 /* .line 177 */
} // :cond_0
v1 = this.val$textView;
(( com.ansca.corona.CoronaEditText ) v1 ).getParent ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaEditText;->getParent()Landroid/view/ViewParent;
/* .line 178 */
/* .local v0, "parentView":Landroid/view/ViewParent; */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* instance-of v1, v0, Landroid/view/ViewGroup; */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 179 */
		 /* check-cast v0, Landroid/view/ViewGroup; */
	 } // .end local v0 # "parentView":Landroid/view/ViewParent;
	 v1 = this.val$textView;
	 (( android.view.ViewGroup ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
	 /* .line 181 */
} // :cond_1
return;
} // .end method
