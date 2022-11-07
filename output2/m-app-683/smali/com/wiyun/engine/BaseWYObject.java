public abstract class com.wiyun.engine.BaseWYObject extends com.wiyun.engine.BaseObject {
	 /* .source "BaseWYObject.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.BaseWYObject ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.BaseWYObject ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 17 */
		 return;
	 } // .end method
	 private native void nativeAutoRelease ( ) {
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.BaseWYObject autoRelease ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;->nativeAutoRelease()V */
		 /* .line 43 */
	 } // .end method
	 public native void connectNativeTargetSelector ( ) {
	 } // .end method
	 public native java.lang.String getName ( ) {
	 } // .end method
	 public void onTargetSelectorInvoked ( Integer p0, Float p1 ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "delta" # F */
		 /* .prologue */
		 /* .line 109 */
		 return;
	 } // .end method
	 public native void setName ( java.lang.String p0 ) {
	 } // .end method
