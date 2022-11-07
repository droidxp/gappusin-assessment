class org.anddev.andengine.ui.dialog.GenericInputDialogBuilder$1 implements android.content.DialogInterface$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 final org.anddev.andengine.ui.dialog.GenericInputDialogBuilder this$0; //synthetic
	 private final android.widget.EditText val$etInput; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.ui.dialog.GenericInputDialogBuilder$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 this.val$etInput = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 v0 = this.this$0;
			 v1 = this.val$etInput;
			 (( android.widget.EditText ) v1 ).getText ( ); // invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
			 (( org.anddev.andengine.ui.dialog.GenericInputDialogBuilder ) v0 ).generateResult ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->generateResult(Ljava/lang/String;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
			 v1 = this.this$0;
			 v1 = this.mSuccessCallback;
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v1 = "Error in GenericInputDialogBuilder.generateResult()"; // const-string v1, "Error in GenericInputDialogBuilder.generateResult()"
		 org.anddev.andengine.util.Debug .e ( v1,v0 );
		 v0 = this.this$0;
		 v0 = this.mContext;
		 v1 = this.this$0;
		 v1 = 		 org.anddev.andengine.ui.dialog.GenericInputDialogBuilder .access$0 ( v1 );
		 int v2 = 0; // const/4 v2, 0x0
		 android.widget.Toast .makeText ( v0,v1,v2 );
		 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
	 } // .end method
