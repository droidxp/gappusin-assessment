public class com.ansca.corona.ActivityIndicatorDialog extends android.app.Dialog {
	 /* .source "ActivityIndicatorDialog.java" */
	 /* # instance fields */
	 private Boolean fIsCancelable;
	 /* # direct methods */
	 public com.ansca.corona.ActivityIndicatorDialog ( ) {
		 /* .locals 4 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 int v1 = 1; // const/4 v1, 0x1
		 int v3 = -2; // const/4 v3, -0x2
		 /* const/16 v2, 0xe */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V */
		 /* .line 12 */
		 /* iput-boolean v1, p0, Lcom/ansca/corona/ActivityIndicatorDialog;->fIsCancelable:Z */
		 /* .line 22 */
		 (( com.ansca.corona.ActivityIndicatorDialog ) p0 ).requestWindowFeature ( v1 ); // invoke-virtual {p0, v1}, Lcom/ansca/corona/ActivityIndicatorDialog;->requestWindowFeature(I)Z
		 /* .line 25 */
		 /* new-instance v0, Landroid/widget/ProgressBar; */
		 /* invoke-direct {v0, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V */
		 /* .line 26 */
		 /* .local v0, "progressBar":Landroid/widget/ProgressBar; */
		 /* new-instance v1, Landroid/view/ViewGroup$LayoutParams; */
		 /* invoke-direct {v1, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 (( com.ansca.corona.ActivityIndicatorDialog ) p0 ).addContentView ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/ansca/corona/ActivityIndicatorDialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 27 */
		 (( android.widget.ProgressBar ) v0 ).setPadding ( v2, v2, v2, v2 ); // invoke-virtual {v0, v2, v2, v2, v2}, Landroid/widget/ProgressBar;->setPadding(IIII)V
		 /* .line 28 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isCancelable ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 47 */
		 /* iget-boolean v0, p0, Lcom/ansca/corona/ActivityIndicatorDialog;->fIsCancelable:Z */
	 } // .end method
	 public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 1 */
		 /* .param p1, "keyCode" # I */
		 /* .param p2, "event" # Landroid/view/KeyEvent; */
		 /* .prologue */
		 /* .line 59 */
		 /* iget-boolean v0, p0, Lcom/ansca/corona/ActivityIndicatorDialog;->fIsCancelable:Z */
		 /* if-nez v0, :cond_0 */
		 /* const/16 v0, 0x54 */
		 /* if-ne p1, v0, :cond_0 */
		 /* .line 60 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 64 */
	 } // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z */
} // .end method
public void setCancelable ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "flag" # Z */
/* .prologue */
/* .line 37 */
/* iput-boolean p1, p0, Lcom/ansca/corona/ActivityIndicatorDialog;->fIsCancelable:Z */
/* .line 38 */
/* invoke-super {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V */
/* .line 39 */
return;
} // .end method
