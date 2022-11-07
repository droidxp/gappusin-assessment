public class com.heyzap.sdk.UnityHelper {
	 /* # direct methods */
	 public com.heyzap.sdk.UnityHelper ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void checkin ( java.lang.String p0 ) {
		 /* .locals 2 */
		 v0 = com.unity3d.player.UnityPlayer.currentActivity;
		 /* new-instance v1, Lcom/heyzap/sdk/UnityHelper$2; */
		 /* invoke-direct {v1, p0}, Lcom/heyzap/sdk/UnityHelper$2;-><init>(Ljava/lang/String;)V */
		 (( android.app.Activity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
	 public static Boolean isSupported ( ) {
		 /* .locals 1 */
		 v0 = com.unity3d.player.UnityPlayer.currentActivity;
		 v0 = 		 com.heyzap.sdk.HeyzapLib .isSupported ( v0 );
	 } // .end method
	 public static void load ( Boolean p0 ) {
		 /* .locals 2 */
		 v0 = com.unity3d.player.UnityPlayer.currentActivity;
		 /* new-instance v1, Lcom/heyzap/sdk/UnityHelper$1; */
		 /* invoke-direct {v1, p0}, Lcom/heyzap/sdk/UnityHelper$1;-><init>(Z)V */
		 (( android.app.Activity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
