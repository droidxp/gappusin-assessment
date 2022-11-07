public class inal {
	 /* # direct methods */
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v0 = "phone"; // const-string v0, "phone"
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/telephony/TelephonyManager; */
		 v0 = 		 (( android.telephony.TelephonyManager ) v0 ).getSimState ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimState()I
		 /* if-ne v1, v0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* move v0, v1 */
} // .end method
