public class org.cocos2dx.lib.Cocos2dxHandler extends android.os.Handler {
	 /* .source "Cocos2dxHandler.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/cocos2dx/lib/Cocos2dxHandler$DialogMessage;, */
	 /* Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer HANDLER_SHOW_DIALOG;
public static final Integer HANDLER_SHOW_EDITBOX_DIALOG;
/* # instance fields */
private java.lang.ref.WeakReference mActivity;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference", */
/* "<", */
/* "Lorg/cocos2dx/lib/Cocos2dxActivity;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public org.cocos2dx.lib.Cocos2dxHandler ( ) {
/* .locals 1 */
/* .param p1, "activity" # Lorg/cocos2dx/lib/Cocos2dxActivity; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
/* .line 50 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.mActivity = v0;
/* .line 51 */
return;
} // .end method
private void showDialog ( android.os.Message p0 ) {
/* .locals 5 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 77 */
v2 = this.mActivity;
(( java.lang.ref.WeakReference ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v1, Lorg/cocos2dx/lib/Cocos2dxActivity; */
/* .line 78 */
/* .local v1, "theActivity":Lorg/cocos2dx/lib/Cocos2dxActivity; */
v0 = this.obj;
/* check-cast v0, Lorg/cocos2dx/lib/Cocos2dxHandler$DialogMessage; */
/* .line 79 */
/* .local v0, "dialogMessage":Lorg/cocos2dx/lib/Cocos2dxHandler$DialogMessage; */
/* new-instance v2, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v2, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 80 */
v3 = this.titile;
(( android.app.AlertDialog$Builder ) v2 ).setTitle ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 81 */
v3 = this.message;
(( android.app.AlertDialog$Builder ) v2 ).setMessage ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 82 */
final String v3 = "Ok"; // const-string v3, "Ok"
/* .line 83 */
/* new-instance v4, Lorg/cocos2dx/lib/Cocos2dxHandler$1; */
/* invoke-direct {v4, p0}, Lorg/cocos2dx/lib/Cocos2dxHandler$1;-><init>(Lorg/cocos2dx/lib/Cocos2dxHandler;)V */
/* .line 82 */
(( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 90 */
(( android.app.AlertDialog$Builder ) v2 ).create ( ); // invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v2 ).show ( ); // invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V
/* .line 91 */
return;
} // .end method
private void showEditBoxDialog ( android.os.Message p0 ) {
/* .locals 9 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 94 */
v8 = this.obj;
/* check-cast v8, Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage; */
/* .line 95 */
/* .local v8, "editBoxMessage":Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage; */
/* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog; */
v1 = this.mActivity;
(( java.lang.ref.WeakReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v1, Landroid/content/Context; */
/* .line 96 */
v2 = this.title;
/* .line 97 */
v3 = this.content;
/* .line 98 */
/* iget v4, v8, Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage;->inputMode:I */
/* .line 99 */
/* iget v5, v8, Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage;->inputFlag:I */
/* .line 100 */
/* iget v6, v8, Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage;->returnType:I */
/* .line 101 */
/* iget v7, v8, Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage;->maxLength:I */
/* .line 95 */
/* invoke-direct/range {v0 ..v7}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IIII)V */
/* .line 101 */
(( org.cocos2dx.lib.Cocos2dxEditBoxDialog ) v0 ).show ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxEditBoxDialog;->show()V
/* .line 102 */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 1 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 66 */
/* iget v0, p1, Landroid/os/Message;->what:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 74 */
} // :goto_0
return;
/* .line 68 */
/* :pswitch_0 */
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxHandler;->showDialog(Landroid/os/Message;)V */
/* .line 71 */
/* :pswitch_1 */
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxHandler;->showEditBoxDialog(Landroid/os/Message;)V */
/* .line 66 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
