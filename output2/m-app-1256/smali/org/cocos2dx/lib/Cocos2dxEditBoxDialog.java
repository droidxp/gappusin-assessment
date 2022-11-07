public class org.cocos2dx.lib.Cocos2dxEditBoxDialog extends android.app.Dialog {
	 /* .source "Cocos2dxEditBoxDialog.java" */
	 /* # instance fields */
	 private final Integer kEditBoxInputFlagInitialCapsAllCharacters;
	 private final Integer kEditBoxInputFlagInitialCapsSentence;
	 private final Integer kEditBoxInputFlagInitialCapsWord;
	 private final Integer kEditBoxInputFlagPassword;
	 private final Integer kEditBoxInputFlagSensitive;
	 private final Integer kEditBoxInputModeAny;
	 private final Integer kEditBoxInputModeDecimal;
	 private final Integer kEditBoxInputModeEmailAddr;
	 private final Integer kEditBoxInputModeNumeric;
	 private final Integer kEditBoxInputModePhoneNumber;
	 private final Integer kEditBoxInputModeSingleLine;
	 private final Integer kEditBoxInputModeUrl;
	 private final Integer kKeyboardReturnTypeDefault;
	 private final Integer kKeyboardReturnTypeDone;
	 private final Integer kKeyboardReturnTypeGo;
	 private final Integer kKeyboardReturnTypeSearch;
	 private final Integer kKeyboardReturnTypeSend;
	 private android.widget.EditText mInputEditText;
	 private final Integer mInputFlag;
	 private Integer mInputFlagConstraints;
	 private final Integer mInputMode;
	 private Integer mInputModeContraints;
	 private Boolean mIsMultiline;
	 private final Integer mMaxLength;
	 private final java.lang.String mMessage;
	 private final Integer mReturnType;
	 private android.widget.TextView mTextViewTitle;
	 private final java.lang.String mTitle;
	 /* # direct methods */
	 public org.cocos2dx.lib.Cocos2dxEditBoxDialog ( ) {
		 /* .locals 6 */
		 /* .param p1, "pContext" # Landroid/content/Context; */
		 /* .param p2, "pTitle" # Ljava/lang/String; */
		 /* .param p3, "pMessage" # Ljava/lang/String; */
		 /* .param p4, "pInputMode" # I */
		 /* .param p5, "pInputFlag" # I */
		 /* .param p6, "pReturnType" # I */
		 /* .param p7, "pMaxLength" # I */
		 /* .prologue */
		 int v5 = 4; // const/4 v5, 0x4
		 int v4 = 3; // const/4 v4, 0x3
		 int v3 = 2; // const/4 v3, 0x2
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 139 */
		 /* const v0, 0x1030011 */
		 /* invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V */
		 /* .line 53 */
		 /* iput v1, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputModeAny:I */
		 /* .line 58 */
		 /* iput v2, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputModeEmailAddr:I */
		 /* .line 63 */
		 /* iput v3, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputModeNumeric:I */
		 /* .line 68 */
		 /* iput v4, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputModePhoneNumber:I */
		 /* .line 73 */
		 /* iput v5, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputModeUrl:I */
		 /* .line 78 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputModeDecimal:I */
		 /* .line 83 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputModeSingleLine:I */
		 /* .line 88 */
		 /* iput v1, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputFlagPassword:I */
		 /* .line 93 */
		 /* iput v2, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputFlagSensitive:I */
		 /* .line 98 */
		 /* iput v3, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputFlagInitialCapsWord:I */
		 /* .line 103 */
		 /* iput v4, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputFlagInitialCapsSentence:I */
		 /* .line 108 */
		 /* iput v5, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kEditBoxInputFlagInitialCapsAllCharacters:I */
		 /* .line 110 */
		 /* iput v1, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kKeyboardReturnTypeDefault:I */
		 /* .line 111 */
		 /* iput v2, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kKeyboardReturnTypeDone:I */
		 /* .line 112 */
		 /* iput v3, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kKeyboardReturnTypeSend:I */
		 /* .line 113 */
		 /* iput v4, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kKeyboardReturnTypeSearch:I */
		 /* .line 114 */
		 /* iput v5, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->kKeyboardReturnTypeGo:I */
		 /* .line 142 */
		 this.mTitle = p2;
		 /* .line 143 */
		 this.mMessage = p3;
		 /* .line 144 */
		 /* iput p4, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputMode:I */
		 /* .line 145 */
		 /* iput p5, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlag:I */
		 /* .line 146 */
		 /* iput p6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mReturnType:I */
		 /* .line 147 */
		 /* iput p7, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mMaxLength:I */
		 /* .line 148 */
		 return;
	 } // .end method
	 static android.widget.EditText access$0 ( org.cocos2dx.lib.Cocos2dxEditBoxDialog p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 120 */
		 v0 = this.mInputEditText;
	 } // .end method
	 static void access$1 ( org.cocos2dx.lib.Cocos2dxEditBoxDialog p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 307 */
		 /* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->openKeyboard()V */
		 return;
	 } // .end method
	 static void access$2 ( org.cocos2dx.lib.Cocos2dxEditBoxDialog p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 312 */
		 /* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->closeKeyboard()V */
		 return;
	 } // .end method
	 private void closeKeyboard ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 313 */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->getContext()Landroid/content/Context;
		 final String v2 = "input_method"; // const-string v2, "input_method"
		 (( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
		 /* .line 314 */
		 /* .local v0, "imm":Landroid/view/inputmethod/InputMethodManager; */
		 v1 = this.mInputEditText;
		 (( android.widget.EditText ) v1 ).getWindowToken ( ); // invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.view.inputmethod.InputMethodManager ) v0 ).hideSoftInputFromWindow ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
		 /* .line 315 */
		 return;
	 } // .end method
	 private Integer convertDipsToPixels ( Float p0 ) {
		 /* .locals 2 */
		 /* .param p1, "pDIPs" # F */
		 /* .prologue */
		 /* .line 303 */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v1, Landroid/util/DisplayMetrics;->density:F */
		 /* .line 304 */
		 /* .local v0, "scale":F */
		 /* mul-float v1, p1, v0 */
		 v1 = 		 java.lang.Math .round ( v1 );
	 } // .end method
	 private void openKeyboard ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 308 */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->getContext()Landroid/content/Context;
		 final String v2 = "input_method"; // const-string v2, "input_method"
		 (( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
		 /* .line 309 */
		 /* .local v0, "imm":Landroid/view/inputmethod/InputMethodManager; */
		 v1 = this.mInputEditText;
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.view.inputmethod.InputMethodManager ) v0 ).showSoftInput ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
		 /* .line 310 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 13 */
		 /* .param p1, "pSavedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* const/high16 v12, 0x41200000 # 10.0f */
		 int v11 = -1; // const/4 v11, -0x1
		 int v10 = -2; // const/4 v10, -0x2
		 int v9 = 1; // const/4 v9, 0x1
		 /* .line 152 */
		 /* invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 154 */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->getWindow()Landroid/view/Window;
		 /* new-instance v7, Landroid/graphics/drawable/ColorDrawable; */
		 /* const/high16 v8, -0x80000000 */
		 /* invoke-direct {v7, v8}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V */
		 (( android.view.Window ) v6 ).setBackgroundDrawable ( v7 ); // invoke-virtual {v6, v7}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 156 */
		 /* new-instance v2, Landroid/widget/LinearLayout; */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v2, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
		 /* .line 157 */
		 /* .local v2, "layout":Landroid/widget/LinearLayout; */
		 (( android.widget.LinearLayout ) v2 ).setOrientation ( v9 ); // invoke-virtual {v2, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V
		 /* .line 159 */
		 /* new-instance v3, Landroid/widget/LinearLayout$LayoutParams; */
		 /* invoke-direct {v3, v11, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 /* .line 161 */
		 /* .local v3, "layoutParams":Landroid/widget/LinearLayout$LayoutParams; */
		 /* new-instance v6, Landroid/widget/TextView; */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 this.mTextViewTitle = v6;
		 /* .line 162 */
		 /* new-instance v5, Landroid/widget/LinearLayout$LayoutParams; */
		 /* invoke-direct {v5, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 /* .line 163 */
		 /* .local v5, "textviewParams":Landroid/widget/LinearLayout$LayoutParams; */
		 v6 = 		 /* invoke-direct {p0, v12}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->convertDipsToPixels(F)I */
		 /* iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I */
		 /* iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I */
		 /* .line 164 */
		 v6 = this.mTextViewTitle;
		 /* const/high16 v7, 0x41a00000 # 20.0f */
		 (( android.widget.TextView ) v6 ).setTextSize ( v9, v7 ); // invoke-virtual {v6, v9, v7}, Landroid/widget/TextView;->setTextSize(IF)V
		 /* .line 165 */
		 v6 = this.mTextViewTitle;
		 (( android.widget.LinearLayout ) v2 ).addView ( v6, v5 ); // invoke-virtual {v2, v6, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 167 */
		 /* new-instance v6, Landroid/widget/EditText; */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v6, v7}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
		 this.mInputEditText = v6;
		 /* .line 168 */
		 /* new-instance v0, Landroid/widget/LinearLayout$LayoutParams; */
		 /* invoke-direct {v0, v11, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 /* .line 169 */
		 /* .local v0, "editTextParams":Landroid/widget/LinearLayout$LayoutParams; */
		 v6 = 		 /* invoke-direct {p0, v12}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->convertDipsToPixels(F)I */
		 /* iput v6, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I */
		 /* iput v6, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I */
		 /* .line 171 */
		 v6 = this.mInputEditText;
		 (( android.widget.LinearLayout ) v2 ).addView ( v6, v0 ); // invoke-virtual {v2, v6, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 173 */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).setContentView ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 175 */
		 (( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->getWindow()Landroid/view/Window;
		 /* const/16 v7, 0x400 */
		 (( android.view.Window ) v6 ).addFlags ( v7 ); // invoke-virtual {v6, v7}, Landroid/view/Window;->addFlags(I)V
		 /* .line 177 */
		 v6 = this.mTextViewTitle;
		 v7 = this.mTitle;
		 (( android.widget.TextView ) v6 ).setText ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 178 */
		 v6 = this.mInputEditText;
		 v7 = this.mMessage;
		 (( android.widget.EditText ) v6 ).setText ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
		 /* .line 180 */
		 v6 = this.mInputEditText;
		 v4 = 		 (( android.widget.EditText ) v6 ).getImeOptions ( ); // invoke-virtual {v6}, Landroid/widget/EditText;->getImeOptions()I
		 /* .line 181 */
		 /* .local v4, "oldImeOptions":I */
		 v6 = this.mInputEditText;
		 /* const/high16 v7, 0x10000000 */
		 /* or-int/2addr v7, v4 */
		 (( android.widget.EditText ) v6 ).setImeOptions ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setImeOptions(I)V
		 /* .line 182 */
		 v6 = this.mInputEditText;
		 v4 = 		 (( android.widget.EditText ) v6 ).getImeOptions ( ); // invoke-virtual {v6}, Landroid/widget/EditText;->getImeOptions()I
		 /* .line 184 */
		 /* iget v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputMode:I */
		 /* packed-switch v6, :pswitch_data_0 */
		 /* .line 211 */
	 } // :goto_0
	 /* iget-boolean v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mIsMultiline:Z */
	 if ( v6 != null) { // if-eqz v6, :cond_0
		 /* .line 212 */
		 /* iget v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
		 /* const/high16 v7, 0x20000 */
		 /* or-int/2addr v6, v7 */
		 /* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
		 /* .line 215 */
	 } // :cond_0
	 v6 = this.mInputEditText;
	 /* iget v7, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
	 /* iget v8, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlagConstraints:I */
	 /* or-int/2addr v7, v8 */
	 (( android.widget.EditText ) v6 ).setInputType ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setInputType(I)V
	 /* .line 217 */
	 /* iget v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlag:I */
	 /* packed-switch v6, :pswitch_data_1 */
	 /* .line 237 */
} // :goto_1
v6 = this.mInputEditText;
/* iget v7, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlagConstraints:I */
/* iget v8, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
/* or-int/2addr v7, v8 */
(( android.widget.EditText ) v6 ).setInputType ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setInputType(I)V
/* .line 239 */
/* iget v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mReturnType:I */
/* packed-switch v6, :pswitch_data_2 */
/* .line 256 */
v6 = this.mInputEditText;
/* or-int/lit8 v7, v4, 0x1 */
(( android.widget.EditText ) v6 ).setImeOptions ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setImeOptions(I)V
/* .line 260 */
} // :goto_2
/* iget v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mMaxLength:I */
/* if-lez v6, :cond_1 */
/* .line 261 */
v6 = this.mInputEditText;
/* new-array v7, v9, [Landroid/text/InputFilter; */
int v8 = 0; // const/4 v8, 0x0
/* new-instance v9, Landroid/text/InputFilter$LengthFilter; */
/* iget v10, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mMaxLength:I */
/* invoke-direct {v9, v10}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V */
/* aput-object v9, v7, v8 */
(( android.widget.EditText ) v6 ).setFilters ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V
/* .line 264 */
} // :cond_1
/* new-instance v1, Landroid/os/Handler; */
/* invoke-direct {v1}, Landroid/os/Handler;-><init>()V */
/* .line 265 */
/* .local v1, "initHandler":Landroid/os/Handler; */
/* new-instance v6, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog$1; */
/* invoke-direct {v6, p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog$1;-><init>(Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;)V */
/* .line 272 */
/* const-wide/16 v7, 0xc8 */
/* .line 265 */
(( android.os.Handler ) v1 ).postDelayed ( v6, v7, v8 ); // invoke-virtual {v1, v6, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 274 */
v6 = this.mInputEditText;
/* new-instance v7, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog$2; */
/* invoke-direct {v7, p0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog$2;-><init>(Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;)V */
(( android.widget.EditText ) v6 ).setOnEditorActionListener ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
/* .line 287 */
return;
/* .line 186 */
} // .end local v1 # "initHandler":Landroid/os/Handler;
/* :pswitch_0 */
/* const v6, 0x20001 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
/* .line 189 */
/* :pswitch_1 */
/* const/16 v6, 0x21 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
/* .line 192 */
/* :pswitch_2 */
/* const/16 v6, 0x1002 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
/* .line 195 */
/* :pswitch_3 */
int v6 = 3; // const/4 v6, 0x3
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
/* .line 198 */
/* :pswitch_4 */
/* const/16 v6, 0x11 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
/* .line 201 */
/* :pswitch_5 */
/* const/16 v6, 0x3002 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
/* .line 204 */
/* :pswitch_6 */
/* iput v9, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputModeContraints:I */
/* .line 219 */
/* :pswitch_7 */
/* const/16 v6, 0x81 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlagConstraints:I */
/* .line 222 */
/* :pswitch_8 */
/* const/high16 v6, 0x80000 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlagConstraints:I */
/* .line 225 */
/* :pswitch_9 */
/* const/16 v6, 0x2000 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlagConstraints:I */
/* .line 228 */
/* :pswitch_a */
/* const/16 v6, 0x4000 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlagConstraints:I */
/* .line 231 */
/* :pswitch_b */
/* const/16 v6, 0x1000 */
/* iput v6, p0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->mInputFlagConstraints:I */
/* .line 241 */
/* :pswitch_c */
v6 = this.mInputEditText;
/* or-int/lit8 v7, v4, 0x1 */
(( android.widget.EditText ) v6 ).setImeOptions ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setImeOptions(I)V
/* .line 244 */
/* :pswitch_d */
v6 = this.mInputEditText;
/* or-int/lit8 v7, v4, 0x6 */
(( android.widget.EditText ) v6 ).setImeOptions ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setImeOptions(I)V
/* .line 247 */
/* :pswitch_e */
v6 = this.mInputEditText;
/* or-int/lit8 v7, v4, 0x4 */
(( android.widget.EditText ) v6 ).setImeOptions ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setImeOptions(I)V
/* .line 250 */
/* :pswitch_f */
v6 = this.mInputEditText;
/* or-int/lit8 v7, v4, 0x3 */
(( android.widget.EditText ) v6 ).setImeOptions ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setImeOptions(I)V
/* goto/16 :goto_2 */
/* .line 253 */
/* :pswitch_10 */
v6 = this.mInputEditText;
/* or-int/lit8 v7, v4, 0x2 */
(( android.widget.EditText ) v6 ).setImeOptions ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/EditText;->setImeOptions(I)V
/* goto/16 :goto_2 */
/* .line 184 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
} // .end packed-switch
/* .line 217 */
/* :pswitch_data_1 */
/* .packed-switch 0x0 */
/* :pswitch_7 */
/* :pswitch_8 */
/* :pswitch_9 */
/* :pswitch_a */
/* :pswitch_b */
} // .end packed-switch
/* .line 239 */
/* :pswitch_data_2 */
/* .packed-switch 0x0 */
/* :pswitch_c */
/* :pswitch_d */
/* :pswitch_e */
/* :pswitch_f */
/* :pswitch_10 */
} // .end packed-switch
} // .end method
