public class org.cocos2dx.lib.Cocos2dxTextInputWraper implements android.text.TextWatcher implements android.widget.TextView$OnEditorActionListener {
	 /* .source "Cocos2dxTextInputWraper.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private final org.cocos2dx.lib.Cocos2dxGLSurfaceView mCocos2dxGLSurfaceView;
	 private java.lang.String mOriginText;
	 private java.lang.String mText;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxTextInputWraper ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 40 */
		 /* const-class v0, Lorg/cocos2dx/lib/Cocos2dxTextInputWraper; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxTextInputWraper ( ) {
		 /* .locals 0 */
		 /* .param p1, "pCocos2dxGLSurfaceView" # Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView; */
		 /* .prologue */
		 /* .line 54 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 55 */
		 this.mCocos2dxGLSurfaceView = p1;
		 /* .line 56 */
		 return;
	 } // .end method
	 private Boolean isFullScreenEdit ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 63 */
		 v2 = this.mCocos2dxGLSurfaceView;
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v2 ).getCocos2dxEditText ( ); // invoke-virtual {v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->getCocos2dxEditText()Lorg/cocos2dx/lib/Cocos2dxEditText;
		 /* .line 64 */
		 /* .local v1, "textField":Landroid/widget/TextView; */
		 (( android.widget.TextView ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
		 final String v3 = "input_method"; // const-string v3, "input_method"
		 (( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
		 /* .line 65 */
		 /* .local v0, "imm":Landroid/view/inputmethod/InputMethodManager; */
		 v2 = 		 (( android.view.inputmethod.InputMethodManager ) v0 ).isFullscreenMode ( ); // invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isFullscreenMode()Z
	 } // .end method
	 /* # virtual methods */
	 public void afterTextChanged ( android.text.Editable p0 ) {
		 /* .locals 4 */
		 /* .param p1, "s" # Landroid/text/Editable; */
		 /* .prologue */
		 /* .line 78 */
		 v2 = 		 /* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxTextInputWraper;->isFullScreenEdit()Z */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 105 */
		 } // :goto_0
		 return;
		 /* .line 85 */
	 v2 = 	 } // :cond_0
	 v3 = this.mText;
	 v3 = 	 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
	 /* sub-int v1, v2, v3 */
	 /* .line 86 */
	 /* .local v1, "nModified":I */
	 /* if-lez v1, :cond_2 */
	 /* .line 87 */
	 v2 = this.mText;
	 v3 = 	 v2 = 	 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
	 /* .line 88 */
	 /* .local v0, "insertText":Ljava/lang/String; */
	 v2 = this.mCocos2dxGLSurfaceView;
	 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v2 ).insertText ( v0 ); // invoke-virtual {v2, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->insertText(Ljava/lang/String;)V
	 /* .line 104 */
} // .end local v0 # "insertText":Ljava/lang/String;
} // :goto_1
this.mText = v2;
/* .line 96 */
} // :cond_1
v2 = this.mCocos2dxGLSurfaceView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v2 ).deleteBackward ( ); // invoke-virtual {v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->deleteBackward()V
/* .line 95 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
/* if-ltz v1, :cond_1 */
} // .end method
public void beforeTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "pCharSequence" # Ljava/lang/CharSequence; */
/* .param p2, "start" # I */
/* .param p3, "count" # I */
/* .param p4, "after" # I */
/* .prologue */
/* .line 114 */
this.mText = v0;
/* .line 115 */
return;
} // .end method
public Boolean onEditorAction ( android.widget.TextView p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 6 */
/* .param p1, "pTextView" # Landroid/widget/TextView; */
/* .param p2, "pActionID" # I */
/* .param p3, "pKeyEvent" # Landroid/view/KeyEvent; */
/* .prologue */
/* const/16 v5, 0xa */
/* .line 124 */
v3 = this.mCocos2dxGLSurfaceView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v3 ).getCocos2dxEditText ( ); // invoke-virtual {v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->getCocos2dxEditText()Lorg/cocos2dx/lib/Cocos2dxEditText;
/* if-ne v3, p1, :cond_2 */
v3 = /* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxTextInputWraper;->isFullScreenEdit()Z */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 126 */
v3 = this.mOriginText;
v0 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* .local v0, "i":I */
} // :goto_0
/* if-gtz v0, :cond_3 */
/* .line 134 */
(( android.widget.TextView ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
/* .line 137 */
/* .local v2, "text":Ljava/lang/String; */
final String v3 = ""; // const-string v3, ""
v3 = (( java.lang.String ) v2 ).compareTo ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-nez v3, :cond_0 */
/* .line 138 */
final String v2 = "\n"; // const-string v2, "\n"
/* .line 141 */
} // :cond_0
v3 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, -0x1 */
v3 = (( java.lang.String ) v2 ).charAt ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
/* if-eq v5, v3, :cond_1 */
/* .line 142 */
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 145 */
} // :cond_1
/* move-object v1, v2 */
/* .line 146 */
/* .local v1, "insertText":Ljava/lang/String; */
v3 = this.mCocos2dxGLSurfaceView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v3 ).insertText ( v1 ); // invoke-virtual {v3, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->insertText(Ljava/lang/String;)V
/* .line 153 */
} // .end local v0 # "i":I
} // .end local v1 # "insertText":Ljava/lang/String;
} // .end local v2 # "text":Ljava/lang/String;
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
/* .line 127 */
/* .restart local v0 # "i":I */
} // :cond_3
v3 = this.mCocos2dxGLSurfaceView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v3 ).deleteBackward ( ); // invoke-virtual {v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->deleteBackward()V
/* .line 126 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .param p1, "pCharSequence" # Ljava/lang/CharSequence; */
/* .param p2, "start" # I */
/* .param p3, "before" # I */
/* .param p4, "count" # I */
/* .prologue */
/* .line 120 */
return;
} // .end method
public void setOriginText ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "pOriginText" # Ljava/lang/String; */
/* .prologue */
/* .line 69 */
this.mOriginText = p1;
/* .line 70 */
return;
} // .end method
