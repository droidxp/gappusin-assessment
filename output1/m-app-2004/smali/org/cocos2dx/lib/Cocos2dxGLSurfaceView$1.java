class org.cocos2dx.lib.Cocos2dxGLSurfaceView$1 extends android.os.Handler {
	 /* .source "Cocos2dxGLSurfaceView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->initView()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.cocos2dx.lib.Cocos2dxGLSurfaceView this$0; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxGLSurfaceView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 155 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 5 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 157 */
/* iget v2, p1, Landroid/os/Message;->what:I */
/* packed-switch v2, :pswitch_data_0 */
/* .line 181 */
} // :cond_0
} // :goto_0
return;
/* .line 159 */
/* :pswitch_0 */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
v2 = (( org.cocos2dx.lib.Cocos2dxEditText ) v2 ).requestFocus ( ); // invoke-virtual {v2}, Lorg/cocos2dx/lib/Cocos2dxEditText;->requestFocus()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 160 */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$1 ( );
(( org.cocos2dx.lib.Cocos2dxEditText ) v2 ).removeTextChangedListener ( v3 ); // invoke-virtual {v2, v3}, Lorg/cocos2dx/lib/Cocos2dxEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V
/* .line 161 */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
final String v3 = ""; // const-string v3, ""
(( org.cocos2dx.lib.Cocos2dxEditText ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Lorg/cocos2dx/lib/Cocos2dxEditText;->setText(Ljava/lang/CharSequence;)V
/* .line 162 */
v1 = this.obj;
/* check-cast v1, Ljava/lang/String; */
/* .line 163 */
/* .local v1, "text":Ljava/lang/String; */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
(( org.cocos2dx.lib.Cocos2dxEditText ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Lorg/cocos2dx/lib/Cocos2dxEditText;->append(Ljava/lang/CharSequence;)V
/* .line 164 */
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$1 ( );
(( org.cocos2dx.lib.TextInputWraper ) v2 ).setOriginText ( v1 ); // invoke-virtual {v2, v1}, Lorg/cocos2dx/lib/TextInputWraper;->setOriginText(Ljava/lang/String;)V
/* .line 165 */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$1 ( );
(( org.cocos2dx.lib.Cocos2dxEditText ) v2 ).addTextChangedListener ( v3 ); // invoke-virtual {v2, v3}, Lorg/cocos2dx/lib/Cocos2dxEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V
/* .line 166 */
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$2 ( );
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v2 ).getContext ( ); // invoke-virtual {v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->getContext()Landroid/content/Context;
final String v3 = "input_method"; // const-string v3, "input_method"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
/* .line 167 */
/* .local v0, "imm":Landroid/view/inputmethod/InputMethodManager; */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
(( android.view.inputmethod.InputMethodManager ) v0 ).showSoftInput ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z
/* .line 168 */
final String v2 = "GLSurfaceView"; // const-string v2, "GLSurfaceView"
final String v3 = "showSoftInput"; // const-string v3, "showSoftInput"
android.util.Log .d ( v2,v3 );
/* .line 173 */
} // .end local v0 # "imm":Landroid/view/inputmethod/InputMethodManager;
} // .end local v1 # "text":Ljava/lang/String;
/* :pswitch_1 */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 174 */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$1 ( );
(( org.cocos2dx.lib.Cocos2dxEditText ) v2 ).removeTextChangedListener ( v3 ); // invoke-virtual {v2, v3}, Lorg/cocos2dx/lib/Cocos2dxEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V
/* .line 175 */
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$2 ( );
(( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v2 ).getContext ( ); // invoke-virtual {v2}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->getContext()Landroid/content/Context;
final String v3 = "input_method"; // const-string v3, "input_method"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
/* .line 176 */
/* .restart local v0 # "imm":Landroid/view/inputmethod/InputMethodManager; */
v2 = this.this$0;
org.cocos2dx.lib.Cocos2dxGLSurfaceView .access$0 ( v2 );
(( org.cocos2dx.lib.Cocos2dxEditText ) v2 ).getWindowToken ( ); // invoke-virtual {v2}, Lorg/cocos2dx/lib/Cocos2dxEditText;->getWindowToken()Landroid/os/IBinder;
(( android.view.inputmethod.InputMethodManager ) v0 ).hideSoftInputFromWindow ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
/* .line 177 */
final String v2 = "GLSurfaceView"; // const-string v2, "GLSurfaceView"
final String v3 = "HideSoftInput"; // const-string v3, "HideSoftInput"
android.util.Log .d ( v2,v3 );
/* goto/16 :goto_0 */
/* .line 157 */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
