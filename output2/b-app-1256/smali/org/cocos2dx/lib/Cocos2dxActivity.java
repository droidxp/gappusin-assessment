public abstract class org.cocos2dx.lib.Cocos2dxActivity extends android.app.Activity implements org.cocos2dx.lib.Cocos2dxHelper$Cocos2dxHelperListener {
	 /* .source "Cocos2dxActivity.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private org.cocos2dx.lib.Cocos2dxGLSurfaceView mGLSurfaceView;
	 private org.cocos2dx.lib.Cocos2dxHandler mHandler;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 39 */
		 /* const-class v0, Lorg/cocos2dx/lib/Cocos2dxActivity; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 1 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 54 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 com.games.a .a ( p0 );
		 /* .line 56 */
		 /* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxHandler; */
		 /* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxHandler;-><init>(Lorg/cocos2dx/lib/Cocos2dxActivity;)V */
		 this.mHandler = v0;
		 /* .line 58 */
		 (( org.cocos2dx.lib.Cocos2dxActivity ) p0 ).onCreateView ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;->onCreateView()Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;
		 this.mGLSurfaceView = v0;
		 /* .line 60 */
		 org.cocos2dx.lib.Cocos2dxHelper .init ( p0,p0 );
		 /* .line 61 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxGLSurfaceView onCreateView ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 int v6 = -1; // const/4 v6, -0x1
		 /* .line 117 */
		 /* new-instance v3, Landroid/view/ViewGroup$LayoutParams; */
		 /* invoke-direct {v3, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 /* .line 119 */
		 /* .local v3, "framelayout_params":Landroid/view/ViewGroup$LayoutParams; */
		 /* new-instance v2, Landroid/widget/FrameLayout; */
		 /* invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
		 /* .line 120 */
		 /* .local v2, "framelayout":Landroid/widget/FrameLayout; */
		 (( android.widget.FrameLayout ) v2 ).setLayoutParams ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 124 */
		 /* new-instance v1, Landroid/view/ViewGroup$LayoutParams; */
		 /* .line 125 */
		 int v5 = -2; // const/4 v5, -0x2
		 /* .line 124 */
		 /* invoke-direct {v1, v6, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 /* .line 126 */
		 /* .local v1, "edittext_layout_params":Landroid/view/ViewGroup$LayoutParams; */
		 /* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxEditText; */
		 /* invoke-direct {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxEditText;-><init>(Landroid/content/Context;)V */
		 /* .line 127 */
		 /* .local v0, "edittext":Lorg/cocos2dx/lib/Cocos2dxEditText; */
		 (( org.cocos2dx.lib.Cocos2dxEditText ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Lorg/cocos2dx/lib/Cocos2dxEditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 130 */
		 (( android.widget.FrameLayout ) v2 ).addView ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
		 /* .line 133 */
		 /* new-instance v4, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView; */
		 /* invoke-direct {v4, p0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;-><init>(Landroid/content/Context;)V */
		 /* .line 136 */
		 /* .local v4, "gLSurfaceView":Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView; */
		 (( android.widget.FrameLayout ) v2 ).addView ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
		 /* .line 138 */
		 /* new-instance v5, Lorg/cocos2dx/lib/Cocos2dxRenderer; */
		 /* invoke-direct {v5}, Lorg/cocos2dx/lib/Cocos2dxRenderer;-><init>()V */
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v4 ).setCocos2dxRenderer ( v5 ); // invoke-virtual {v4, v5}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->setCocos2dxRenderer(Lorg/cocos2dx/lib/Cocos2dxRenderer;)V
		 /* .line 139 */
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v4 ).setCocos2dxEditText ( v0 ); // invoke-virtual {v4, v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->setCocos2dxEditText(Lorg/cocos2dx/lib/Cocos2dxEditText;)V
		 /* .line 142 */
		 (( org.cocos2dx.lib.Cocos2dxActivity ) p0 ).setContentView ( v2 ); // invoke-virtual {p0, v2}, Lorg/cocos2dx/lib/Cocos2dxActivity;->setContentView(Landroid/view/View;)V
		 /* .line 144 */
	 } // .end method
	 protected void onPause ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 81 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
		 /* .line 83 */
		 org.cocos2dx.lib.Cocos2dxHelper .onPause ( );
		 /* .line 84 */
		 v0 = this.mGLSurfaceView;
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).onPause ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->onPause()V
		 /* .line 85 */
		 return;
	 } // .end method
	 protected void onResume ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 73 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
		 /* .line 75 */
		 org.cocos2dx.lib.Cocos2dxHelper .onResume ( );
		 /* .line 76 */
		 v0 = this.mGLSurfaceView;
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).onResume ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->onResume()V
		 /* .line 77 */
		 return;
	 } // .end method
	 public void runOnGLThread ( java.lang.Runnable p0 ) {
		 /* .locals 1 */
		 /* .param p1, "pRunnable" # Ljava/lang/Runnable; */
		 /* .prologue */
		 /* .line 105 */
		 v0 = this.mGLSurfaceView;
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).queueEvent ( p1 ); // invoke-virtual {v0, p1}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V
		 /* .line 106 */
		 return;
	 } // .end method
	 public void showDialog ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .param p1, "pTitle" # Ljava/lang/String; */
		 /* .param p2, "pMessage" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 89 */
		 /* new-instance v0, Landroid/os/Message; */
		 /* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
		 /* .line 90 */
		 /* .local v0, "msg":Landroid/os/Message; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput v1, v0, Landroid/os/Message;->what:I */
		 /* .line 91 */
		 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxHandler$DialogMessage; */
		 /* invoke-direct {v1, p1, p2}, Lorg/cocos2dx/lib/Cocos2dxHandler$DialogMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 this.obj = v1;
		 /* .line 92 */
		 v1 = this.mHandler;
		 (( org.cocos2dx.lib.Cocos2dxHandler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Lorg/cocos2dx/lib/Cocos2dxHandler;->sendMessage(Landroid/os/Message;)Z
		 /* .line 93 */
		 return;
	 } // .end method
	 public void showEditTextDialog ( java.lang.String p0, java.lang.String p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
		 /* .locals 8 */
		 /* .param p1, "pTitle" # Ljava/lang/String; */
		 /* .param p2, "pContent" # Ljava/lang/String; */
		 /* .param p3, "pInputMode" # I */
		 /* .param p4, "pInputFlag" # I */
		 /* .param p5, "pReturnType" # I */
		 /* .param p6, "pMaxLength" # I */
		 /* .prologue */
		 /* .line 97 */
		 /* new-instance v7, Landroid/os/Message; */
		 /* invoke-direct {v7}, Landroid/os/Message;-><init>()V */
		 /* .line 98 */
		 /* .local v7, "msg":Landroid/os/Message; */
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, v7, Landroid/os/Message;->what:I */
		 /* .line 99 */
		 /* new-instance v0, Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage; */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move v6, p6 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/cocos2dx/lib/Cocos2dxHandler$EditBoxMessage;-><init>(Ljava/lang/String;Ljava/lang/String;IIII)V */
		 this.obj = v0;
		 /* .line 100 */
		 v0 = this.mHandler;
		 (( org.cocos2dx.lib.Cocos2dxHandler ) v0 ).sendMessage ( v7 ); // invoke-virtual {v0, v7}, Lorg/cocos2dx/lib/Cocos2dxHandler;->sendMessage(Landroid/os/Message;)Z
		 /* .line 101 */
		 return;
	 } // .end method
