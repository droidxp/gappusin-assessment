public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 final String v0 = "facebook-session"; // const-string v0, "facebook-session"
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 return;
	 } // .end method
	 public static Boolean a ( Object p0, android.content.Context p1 ) {
		 /* .locals 4 */
		 final String v0 = "facebook-session"; // const-string v0, "facebook-session"
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.content.Context ) p1 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v1 = "access_token"; // const-string v1, "access_token"
		 (( com.a.a.g ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/a/a/g;->b()Ljava/lang/String;
		 final String v1 = "expires_in"; // const-string v1, "expires_in"
		 (( com.a.a.g ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/a/a/g;->c()J
		 v0 = 		 /* move-result-wide v2 */
	 } // .end method
	 public static Boolean b ( Object p0, android.content.Context p1 ) {
		 /* .locals 4 */
		 final String v0 = "facebook-session"; // const-string v0, "facebook-session"
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.content.Context ) p1 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v1 = "access_token"; // const-string v1, "access_token"
		 int v2 = 0; // const/4 v2, 0x0
		 (( com.a.a.g ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lcom/a/a/g;->a(Ljava/lang/String;)V
		 final String v1 = "expires_in"; // const-string v1, "expires_in"
		 /* const-wide/16 v2, 0x0 */
		 /* move-result-wide v0 */
		 (( com.a.a.g ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/a/g;->a(J)V
		 v0 = 		 (( com.a.a.g ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/a/a/g;->a()Z
	 } // .end method
