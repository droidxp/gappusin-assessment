public class org.nwhy.Whackczkm.About extends android.app.Activity {
	 /* .source "About.java" */
	 /* # direct methods */
	 public org.nwhy.Whackczkm.About ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 1 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 14 */
		 org.nwhy.Whackczkm.ActivityUtil .noNotificationBar ( p0 );
		 /* .line 15 */
		 /* const v0, 0x7f030001 */
		 (( org.nwhy.Whackczkm.About ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/Whackczkm/About;->setContentView(I)V
		 /* .line 16 */
		 return;
	 } // .end method
