class com.wiyun.engine.nodes.TextBox$1$5 implements android.view.View$OnFocusChangeListener {
	 /* # interfaces */
	 /* # instance fields */
	 final com.wiyun.engine.nodes.TextBox$1 this$1; //synthetic
	 private final android.app.Dialog val$d; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.nodes.TextBox$1$5 ( ) {
		 /* .locals 0 */
		 this.this$1 = p1;
		 this.val$d = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onFocusChange ( android.view.View p0, Boolean p1 ) {
		 /* .locals 2 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 v0 = this.val$d;
			 (( android.app.Dialog ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
			 int v1 = 5; // const/4 v1, 0x5
			 (( android.view.Window ) v0 ).setSoftInputMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V
		 } // :cond_0
		 return;
	 } // .end method
