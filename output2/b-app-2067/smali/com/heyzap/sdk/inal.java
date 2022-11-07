class inal implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 final java.lang.String val$s; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.val$s = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void run ( ) {
		 /* .locals 2 */
		 v0 = com.unity3d.player.UnityPlayer.currentActivity;
		 v1 = this.val$s;
		 com.heyzap.sdk.HeyzapLib .checkin ( v0,v1 );
		 return;
	 } // .end method
