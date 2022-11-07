public abstract class org.anddev.andengine.ui.dialog.GenericInputDialogBuilder {
	 /* # instance fields */
	 protected final android.content.Context mContext;
	 private final java.lang.String mDefaultText;
	 private final Integer mErrorResID;
	 protected final Integer mIconResID;
	 protected final Integer mMessageResID;
	 protected final android.content.DialogInterface$OnCancelListener mOnCancelListener;
	 protected final org.anddev.andengine.util.Callback mSuccessCallback;
	 protected final Integer mTitleResID;
	 /* # direct methods */
	 public org.anddev.andengine.ui.dialog.GenericInputDialogBuilder ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mContext = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mTitleResID:I */
		 /* iput p3, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mMessageResID:I */
		 /* iput p4, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mErrorResID:I */
		 /* iput p5, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mIconResID:I */
		 this.mDefaultText = p6;
		 this.mSuccessCallback = p7;
		 this.mOnCancelListener = p8;
		 return;
	 } // .end method
	 public org.anddev.andengine.ui.dialog.GenericInputDialogBuilder ( ) {
		 /* .locals 9 */
		 final String v6 = ""; // const-string v6, ""
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move-object v7, p6 */
		 /* move-object/from16 v8, p7 */
		 /* invoke-direct/range {v0 ..v8}, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;-><init>(Landroid/content/Context;IIIILjava/lang/String;Lorg/anddev/andengine/util/Callback;Landroid/content/DialogInterface$OnCancelListener;)V */
		 return;
	 } // .end method
	 static Integer access$0 ( org.anddev.andengine.ui.dialog.GenericInputDialogBuilder p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mErrorResID:I */
	 } // .end method
	 /* # virtual methods */
	 public android.app.Dialog create ( ) {
		 /* .locals 5 */
		 /* new-instance v0, Landroid/widget/EditText; */
		 v1 = this.mContext;
		 /* invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
		 v1 = this.mDefaultText;
		 (( android.widget.EditText ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
		 /* new-instance v1, Landroid/app/AlertDialog$Builder; */
		 v2 = this.mContext;
		 /* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 /* iget v2, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mTitleResID:I */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* iget v2, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mTitleResID:I */
			 (( android.app.AlertDialog$Builder ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
		 } // :cond_0
		 /* iget v2, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mMessageResID:I */
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* iget v2, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mMessageResID:I */
			 (( android.app.AlertDialog$Builder ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;
		 } // :cond_1
		 /* iget v2, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mIconResID:I */
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 /* iget v2, p0, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->mIconResID:I */
			 (( android.app.AlertDialog$Builder ) v1 ).setIcon ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
		 } // :cond_2
		 (( org.anddev.andengine.ui.dialog.GenericInputDialogBuilder ) p0 ).setView ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;->setView(Landroid/app/AlertDialog$Builder;Landroid/widget/EditText;)V
		 v2 = this.mOnCancelListener;
		 (( android.app.AlertDialog$Builder ) v1 ).setOnCancelListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
		 /* const v3, 0x104000a */
		 /* new-instance v4, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder$1; */
		 /* invoke-direct {v4, p0, v0}, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder$1;-><init>(Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;Landroid/widget/EditText;)V */
		 (( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 /* const/high16 v2, 0x1040000 */
		 /* new-instance v3, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder$2; */
		 /* invoke-direct {v3, p0}, Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder$2;-><init>(Lorg/anddev/andengine/ui/dialog/GenericInputDialogBuilder;)V */
		 (( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 (( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
	 } // .end method
	 protected abstract java.lang.Object generateResult ( java.lang.String p0 ) {
	 } // .end method
	 protected void setView ( android.app.AlertDialog$Builder p0, android.widget.EditText p1 ) {
		 /* .locals 0 */
		 (( android.app.AlertDialog$Builder ) p1 ).setView ( p2 ); // invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
		 return;
	 } // .end method
