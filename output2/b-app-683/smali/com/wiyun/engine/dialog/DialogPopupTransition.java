public class com.wiyun.engine.dialog.DialogPopupTransition extends com.wiyun.engine.dialog.DialogTransition {
	 /* .source "DialogPopupTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.dialog.DialogPopupTransition ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/dialog/DialogTransition;-><init>()V */
		 /* .line 20 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/dialog/DialogPopupTransition;->nativeInit()V */
		 /* .line 21 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.dialog.DialogPopupTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/DialogTransition;-><init>(I)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.dialog.DialogPopupTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* new-instance v0, Lcom/wiyun/engine/dialog/DialogPopupTransition; */
		 /* invoke-direct {v0, p0}, Lcom/wiyun/engine/dialog/DialogPopupTransition;-><init>(I)V */
	 } // .end method
	 public static com.wiyun.engine.dialog.DialogTransition from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.dialog.DialogPopupTransition .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.dialog.DialogPopupTransition make ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 12 */
		 /* new-instance v0, Lcom/wiyun/engine/dialog/DialogPopupTransition; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/dialog/DialogPopupTransition;-><init>()V */
	 } // .end method
	 private native void nativeInit ( ) {
	 } // .end method
