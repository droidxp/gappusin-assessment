class org.cocos2dx.lib.TextInputWraper implements android.text.TextWatcher implements android.widget.TextView$OnEditorActionListener {
	 /* .source "Cocos2dxGLSurfaceView.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.Boolean debug;
	 /* # instance fields */
	 private org.cocos2dx.lib.Cocos2dxGLSurfaceView mMainView;
	 private java.lang.String mOriginText;
	 private java.lang.String mText;
	 /* # direct methods */
	 static org.cocos2dx.lib.TextInputWraper ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 42 */
		 int v0 = 0; // const/4 v0, 0x0
		 java.lang.Boolean .valueOf ( v0 );
		 /* .line 40 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.TextInputWraper ( ) {
		 /* .locals 0 */
		 /* .param p1, "view" # Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView; */
		 /* .prologue */
		 /* .line 56 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 57 */
		 this.mMainView = p1;
		 /* .line 58 */
		 return;
	 } // .end method
	 private void LogD ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 44 */
		 v0 = org.cocos2dx.lib.TextInputWraper.debug;
		 v0 = 		 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "TextInputFilter"; // const-string v0, "TextInputFilter"
			 android.util.Log .d ( v0,p1 );
			 /* .line 45 */
		 } // :cond_0
		 return;
	 } // .end method
	 private java.lang.Boolean isFullScreenEdit ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 52 */
		 v1 = this.mMainView;
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v1 ).getTextField ( ); // invoke-virtual {v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->getTextField()Landroid/widget/TextView;
		 (( android.widget.TextView ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;
		 final String v2 = "input_method"; // const-string v2, "input_method"
		 (( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
		 /* .line 53 */
		 /* .local v0, "imm":Landroid/view/inputmethod/InputMethodManager; */
		 v1 = 		 (( android.view.inputmethod.InputMethodManager ) v0 ).isFullscreenMode ( ); // invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isFullscreenMode()Z
		 java.lang.Boolean .valueOf ( v1 );
	 } // .end method
	 /* # virtual methods */
	 public void afterTextChanged ( android.text.Editable p0 ) {
		 /* .locals 4 */
		 /* .param p1, "s" # Landroid/text/Editable; */
		 /* .prologue */
		 /* .line 66 */
		 /* invoke-direct {p0}, Lorg/cocos2dx/lib/TextInputWraper;->isFullScreenEdit()Ljava/lang/Boolean; */
		 v2 = 		 (( java.lang.Boolean ) v2 ).booleanValue ( ); // invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 84 */
		 } // :goto_0
		 return;
		 /* .line 70 */
	 } // :cond_0
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "afterTextChanged: "; // const-string v3, "afterTextChanged: "
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {p0, v2}, Lorg/cocos2dx/lib/TextInputWraper;->LogD(Ljava/lang/String;)V */
	 v2 = 	 /* .line 71 */
	 v3 = this.mText;
	 v3 = 	 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
	 /* sub-int v1, v2, v3 */
	 /* .line 72 */
	 /* .local v1, "nModified":I */
	 /* if-lez v1, :cond_2 */
	 /* .line 73 */
	 v2 = this.mText;
	 v3 = 	 v2 = 	 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
	 /* .line 74 */
	 /* .local v0, "insertText":Ljava/lang/String; */
	 v2 = this.mMainView;
	 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v2 ).insertText ( v0 ); // invoke-virtual {v2, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->insertText(Ljava/lang/String;)V
	 /* .line 75 */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "insertText("; // const-string v3, "insertText("
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = ")"; // const-string v3, ")"
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {p0, v2}, Lorg/cocos2dx/lib/TextInputWraper;->LogD(Ljava/lang/String;)V */
	 /* .line 83 */
} // .end local v0 # "insertText":Ljava/lang/String;
} // :goto_1
this.mText = v2;
/* .line 79 */
} // :cond_1
v2 = this.mMainView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v2 ).deleteBackward ( ); // invoke-virtual {v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->deleteBackward()V
/* .line 80 */
final String v2 = "deleteBackward"; // const-string v2, "deleteBackward"
/* invoke-direct {p0, v2}, Lorg/cocos2dx/lib/TextInputWraper;->LogD(Ljava/lang/String;)V */
/* .line 78 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
/* if-ltz v1, :cond_1 */
} // .end method
public void beforeTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .param p1, "s" # Ljava/lang/CharSequence; */
/* .param p2, "start" # I */
/* .param p3, "count" # I */
/* .param p4, "after" # I */
/* .prologue */
/* .line 89 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "beforeTextChanged("; // const-string v1, "beforeTextChanged("
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ")start: "; // const-string v1, ")start: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",count: "; // const-string v1, ",count: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",after: "; // const-string v1, ",after: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p4 ); // invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lorg/cocos2dx/lib/TextInputWraper;->LogD(Ljava/lang/String;)V */
/* .line 90 */
this.mText = v0;
/* .line 91 */
return;
} // .end method
public Boolean onEditorAction ( android.widget.TextView p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 6 */
/* .param p1, "v" # Landroid/widget/TextView; */
/* .param p2, "actionId" # I */
/* .param p3, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* const/16 v5, 0xa */
/* .line 99 */
v3 = this.mMainView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v3 ).getTextField ( ); // invoke-virtual {v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->getTextField()Landroid/widget/TextView;
/* if-ne v3, p1, :cond_2 */
/* invoke-direct {p0}, Lorg/cocos2dx/lib/TextInputWraper;->isFullScreenEdit()Ljava/lang/Boolean; */
v3 = (( java.lang.Boolean ) v3 ).booleanValue ( ); // invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 101 */
v3 = this.mOriginText;
v0 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* .local v0, "i":I */
} // :goto_0
/* if-gtz v0, :cond_3 */
/* .line 105 */
(( android.widget.TextView ) p1 ).getText ( ); // invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
/* .line 110 */
/* .local v2, "text":Ljava/lang/String; */
final String v3 = ""; // const-string v3, ""
v3 = (( java.lang.String ) v2 ).compareTo ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-nez v3, :cond_0 */
/* .line 111 */
final String v2 = "\n"; // const-string v2, "\n"
/* .line 114 */
} // :cond_0
v3 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, -0x1 */
v3 = (( java.lang.String ) v2 ).charAt ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C
/* if-eq v5, v3, :cond_1 */
/* .line 115 */
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 118 */
} // :cond_1
/* move-object v1, v2 */
/* .line 119 */
/* .local v1, "insertText":Ljava/lang/String; */
v3 = this.mMainView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v3 ).insertText ( v1 ); // invoke-virtual {v3, v1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->insertText(Ljava/lang/String;)V
/* .line 120 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "insertText("; // const-string v4, "insertText("
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ")"; // const-string v4, ")"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v3}, Lorg/cocos2dx/lib/TextInputWraper;->LogD(Ljava/lang/String;)V */
/* .line 122 */
} // .end local v0 # "i":I
} // .end local v1 # "insertText":Ljava/lang/String;
} // .end local v2 # "text":Ljava/lang/String;
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
/* .line 102 */
/* .restart local v0 # "i":I */
} // :cond_3
v3 = this.mMainView;
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v3 ).deleteBackward ( ); // invoke-virtual {v3}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->deleteBackward()V
/* .line 103 */
final String v3 = "deleteBackward"; // const-string v3, "deleteBackward"
/* invoke-direct {p0, v3}, Lorg/cocos2dx/lib/TextInputWraper;->LogD(Ljava/lang/String;)V */
/* .line 101 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .param p1, "s" # Ljava/lang/CharSequence; */
/* .param p2, "start" # I */
/* .param p3, "before" # I */
/* .param p4, "count" # I */
/* .prologue */
/* .line 95 */
return;
} // .end method
public void setOriginText ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 61 */
this.mOriginText = p1;
/* .line 62 */
return;
} // .end method
