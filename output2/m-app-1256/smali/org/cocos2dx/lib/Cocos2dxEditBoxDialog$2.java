class org.cocos2dx.lib.Cocos2dxEditBoxDialog$2 implements android.widget.TextView$OnEditorActionListener {
	 /* .source "Cocos2dxEditBoxDialog.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.cocos2dx.lib.Cocos2dxEditBoxDialog this$0; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxEditBoxDialog$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 274 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onEditorAction ( android.widget.TextView p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 1 */
/* .param p1, "v" # Landroid/widget/TextView; */
/* .param p2, "actionId" # I */
/* .param p3, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 278 */
/* if-nez p2, :cond_0 */
/* if-nez p2, :cond_1 */
if ( p3 != null) { // if-eqz p3, :cond_1
	 v0 = 	 (( android.view.KeyEvent ) p3 ).getAction ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
	 /* if-nez v0, :cond_1 */
	 /* .line 279 */
} // :cond_0
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxEditBoxDialog .access$0 ( v0 );
(( android.widget.EditText ) v0 ).getText ( ); // invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
org.cocos2dx.lib.Cocos2dxHelper .setEditTextDialogResult ( v0 );
/* .line 280 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxEditBoxDialog .access$2 ( v0 );
/* .line 281 */
v0 = this.this$0;
(( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->dismiss()V
/* .line 282 */
int v0 = 1; // const/4 v0, 0x1
/* .line 284 */
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
