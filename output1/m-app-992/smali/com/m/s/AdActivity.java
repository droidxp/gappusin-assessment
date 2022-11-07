public class com.m.s.AdActivity extends android.app.Activity {
	 /* # direct methods */
	 public com.m.s.AdActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x400 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 int v0 = 1; // const/4 v0, 0x1
		 (( com.m.s.AdActivity ) p0 ).requestWindowFeature ( v0 ); // invoke-virtual {p0, v0}, Lcom/m/s/AdActivity;->requestWindowFeature(I)Z
		 (( com.m.s.AdActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/m/s/AdActivity;->getWindow()Landroid/view/Window;
		 (( android.view.Window ) v0 ).setFlags ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V
		 com.m.s.a .a ( p0 );
		 return;
	 } // .end method
