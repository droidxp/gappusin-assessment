class com.ansca.corona.ViewManager$10 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setTextViewFocus(IZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Boolean val$focus; //synthetic
final Integer val$id; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$10 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 334 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$10;->val$id:I */
/* iput-boolean p3, p0, Lcom/ansca/corona/ViewManager$10;->val$focus:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 336 */
int v2 = 0; // const/4 v2, 0x0
/* .line 337 */
/* .local v2, "view":Lcom/ansca/corona/CoronaEditText; */
/* iget v3, p0, Lcom/ansca/corona/ViewManager$10;->val$id:I */
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* .line 338 */
	 v3 = this.this$0;
	 /* iget v4, p0, Lcom/ansca/corona/ViewManager$10;->val$id:I */
	 com.ansca.corona.ViewManager .access$300 ( v3,v4 );
	 /* .line 340 */
} // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* iget-boolean v3, p0, Lcom/ansca/corona/ViewManager$10;->val$focus:Z */
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* .line 342 */
		 (( com.ansca.corona.CoronaEditText ) v2 ).requestFocus ( ); // invoke-virtual {v2}, Lcom/ansca/corona/CoronaEditText;->requestFocus()Z
		 /* .line 345 */
		 v3 = this.this$0;
		 com.ansca.corona.ViewManager .access$100 ( v3 );
		 final String v4 = "input_method"; // const-string v4, "input_method"
		 (( com.ansca.corona.CoronaActivity ) v3 ).getSystemService ( v4 ); // invoke-virtual {v3, v4}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v1, Landroid/view/inputmethod/InputMethodManager; */
		 /* .line 350 */
		 /* .local v1, "inputManager":Landroid/view/inputmethod/InputMethodManager; */
		 int v3 = 2; // const/4 v3, 0x2
		 (( android.view.inputmethod.InputMethodManager ) v1 ).showSoftInput ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
		 /* .line 360 */
	 } // .end local v1 # "inputManager":Landroid/view/inputmethod/InputMethodManager;
} // :goto_0
return;
/* .line 354 */
} // :cond_1
v3 = this.this$0;
com.ansca.corona.ViewManager .access$400 ( v3 );
(( android.view.ViewGroup ) v3 ).requestFocus ( ); // invoke-virtual {v3}, Landroid/view/ViewGroup;->requestFocus()Z
/* .line 357 */
v3 = this.this$0;
com.ansca.corona.ViewManager .access$100 ( v3 );
final String v4 = "input_method"; // const-string v4, "input_method"
(( com.ansca.corona.CoronaActivity ) v3 ).getSystemService ( v4 ); // invoke-virtual {v3, v4}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
/* .line 358 */
/* .local v0, "imm":Landroid/view/inputmethod/InputMethodManager; */
v3 = this.this$0;
com.ansca.corona.ViewManager .access$400 ( v3 );
(( android.view.ViewGroup ) v3 ).getApplicationWindowToken ( ); // invoke-virtual {v3}, Landroid/view/ViewGroup;->getApplicationWindowToken()Landroid/os/IBinder;
int v4 = 0; // const/4 v4, 0x0
(( android.view.inputmethod.InputMethodManager ) v0 ).hideSoftInputFromWindow ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
} // .end method
