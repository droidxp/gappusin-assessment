public class org.anddev.andengine.util.DialogUtils {
	 /* # direct methods */
	 public org.anddev.andengine.util.DialogUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void keepScreenOn ( android.app.Dialog p0 ) {
		 /* .locals 2 */
		 (( android.app.Dialog ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
		 /* const/16 v1, 0x80 */
		 (( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
		 return;
	 } // .end method
