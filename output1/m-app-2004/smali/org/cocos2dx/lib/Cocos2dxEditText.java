public class org.cocos2dx.lib.Cocos2dxEditText extends android.widget.EditText {
	 /* .source "Cocos2dxEditText.java" */
	 /* # instance fields */
	 private org.cocos2dx.lib.Cocos2dxGLSurfaceView mView;
	 /* # direct methods */
	 public org.cocos2dx.lib.Cocos2dxEditText ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
		 /* .line 39 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxEditText ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 43 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxEditText ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .param p3, "defStyle" # I */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 1 */
		 /* .param p1, "keyCode" # I */
		 /* .param p2, "event" # Landroid/view/KeyEvent; */
		 /* .prologue */
		 /* .line 57 */
		 /* invoke-super {p0, p1, p2}, Landroid/widget/EditText;->onKeyDown(ILandroid/view/KeyEvent;)Z */
		 /* .line 59 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* if-ne p1, v0, :cond_0 */
		 /* .line 60 */
		 v0 = this.mView;
		 (( org.cocos2dx.lib.Cocos2dxGLSurfaceView ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView;->requestFocus()Z
		 /* .line 63 */
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public void setMainView ( org.cocos2dx.lib.Cocos2dxGLSurfaceView p0 ) {
	 /* .locals 0 */
	 /* .param p1, "glSurfaceView" # Lorg/cocos2dx/lib/Cocos2dxGLSurfaceView; */
	 /* .prologue */
	 /* .line 50 */
	 this.mView = p1;
	 /* .line 51 */
	 return;
} // .end method
