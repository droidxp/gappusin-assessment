public class com.doodlemobile.basket.test.IEditText extends android.widget.EditText {
	 /* # instance fields */
	 private com.doodlemobile.basket.test.a a;
	 /* # direct methods */
	 public com.doodlemobile.basket.test.IEditText ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 return;
	 } // .end method
	 public com.doodlemobile.basket.test.IEditText ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onEndBatchEdit ( ) {
		 /* .locals 3 */
		 final String v0 = "tag"; // const-string v0, "tag"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "------------ "; // const-string v2, "------------ "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( com.doodlemobile.basket.test.IEditText ) p0 ).getText ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/test/IEditText;->getText()Landroid/text/Editable;
		 (( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .w ( v0,v1 );
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
			 (( com.doodlemobile.basket.test.IEditText ) p0 ).getText ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/test/IEditText;->getText()Landroid/text/Editable;
			 (( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
		 } // :cond_0
		 /* const/16 v0, 0x8 */
		 (( com.doodlemobile.basket.test.IEditText ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/test/IEditText;->setVisibility(I)V
		 return;
	 } // .end method
	 public void setVisibility ( Integer p0 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1}, Landroid/widget/EditText;->setVisibility(I)V */
		 /* if-nez p1, :cond_0 */
		 (( com.doodlemobile.basket.test.IEditText ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/test/IEditText;->getContext()Landroid/content/Context;
		 final String v1 = "input_method"; // const-string v1, "input_method"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p0, Landroid/view/inputmethod/InputMethodManager; */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.view.inputmethod.InputMethodManager ) p0 ).toggleSoftInput ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V
	 } // :cond_0
	 final String v0 = "tag"; // const-string v0, "tag"
	 final String v1 = "---------------setVisibility---"; // const-string v1, "---------------setVisibility---"
	 android.util.Log .w ( v0,v1 );
	 return;
} // .end method
