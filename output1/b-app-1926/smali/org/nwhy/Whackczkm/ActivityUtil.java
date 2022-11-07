public class org.nwhy.Whackczkm.ActivityUtil {
	 /* .source "ActivityUtil.java" */
	 /* # direct methods */
	 public org.nwhy.Whackczkm.ActivityUtil ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void noNotificationBar ( android.app.Activity p0 ) {
		 /* .locals 2 */
		 /* .param p0, "activity" # Landroid/app/Activity; */
		 /* .prologue */
		 /* const/16 v1, 0x400 */
		 /* .line 13 */
		 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
		 /* .line 14 */
		 /* .local v0, "win":Landroid/view/Window; */
		 (( android.view.Window ) v0 ).setFlags ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V
		 /* .line 16 */
		 return;
	 } // .end method
	 public static void noTitleBar ( android.app.Activity p0 ) {
		 /* .locals 1 */
		 /* .param p0, "activity" # Landroid/app/Activity; */
		 /* .prologue */
		 /* .line 9 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( android.app.Activity ) p0 ).requestWindowFeature ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->requestWindowFeature(I)Z
		 /* .line 10 */
		 return;
	 } // .end method
