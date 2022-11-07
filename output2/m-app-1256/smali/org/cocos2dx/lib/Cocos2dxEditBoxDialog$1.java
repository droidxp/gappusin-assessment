class org.cocos2dx.lib.Cocos2dxEditBoxDialog$1 implements java.lang.Runnable {
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
 org.cocos2dx.lib.Cocos2dxEditBoxDialog$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 265 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 268 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxEditBoxDialog .access$0 ( v0 );
(( android.widget.EditText ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z
/* .line 269 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxEditBoxDialog .access$0 ( v0 );
v1 = this.this$0;
org.cocos2dx.lib.Cocos2dxEditBoxDialog .access$0 ( v1 );
v1 = (( android.widget.EditText ) v1 ).length ( ); // invoke-virtual {v1}, Landroid/widget/EditText;->length()I
(( android.widget.EditText ) v0 ).setSelection ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V
/* .line 270 */
v0 = this.this$0;
org.cocos2dx.lib.Cocos2dxEditBoxDialog .access$1 ( v0 );
/* .line 271 */
return;
} // .end method
