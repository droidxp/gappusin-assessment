public class net.chobin.android.psdxylz.app.AppBroadcastReceiver extends android.content.BroadcastReceiver {
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.AppBroadcastReceiver ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 5 */
		 final String v0 = "referrer"; // const-string v0, "referrer"
		 (( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 java.net.URLDecoder .decode ( v0 );
		 final String v1 = "chobin"; // const-string v1, "chobin"
		 final String v2 = "INSTALL_REFERRER: %s"; // const-string v2, "INSTALL_REFERRER: %s"
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v3, v3, [Ljava/lang/Object; */
		 int v4 = 0; // const/4 v4, 0x0
		 /* aput-object v0, v3, v4 */
		 java.lang.String .format ( v2,v3 );
		 android.util.Log .d ( v1,v0 );
		 return;
	 } // .end method
