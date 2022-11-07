public class inal {
	 /* # direct methods */
	 public static java.lang.String a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 (( android.content.Context ) p0 ).getSharedPreferences ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
			 final String v1 = ""; // const-string v1, ""
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public static void a ( android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 try { // :try_start_0
			 (( android.content.Context ) p0 ).getSharedPreferences ( p3, v0 ); // invoke-virtual {p0, p3, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
