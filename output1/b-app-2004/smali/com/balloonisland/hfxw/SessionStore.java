public class com.balloonisland.hfxw.SessionStore {
	 /* .source "SessionStore.java" */
	 /* # static fields */
	 private static final java.lang.String EXPIRES;
	 private static final java.lang.String KEY;
	 private static final java.lang.String TOKEN;
	 /* # direct methods */
	 public com.balloonisland.hfxw.SessionStore ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void clear ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 53 */
		 final String v1 = "facebook-session"; // const-string v1, "facebook-session"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) p0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* .line 54 */
		 /* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
		 /* .line 55 */
		 /* .line 56 */
		 return;
	 } // .end method
	 public static Boolean restore ( com.facebook.android.Facebook p0, android.content.Context p1 ) {
		 /* .locals 4 */
		 /* .param p0, "session" # Lcom/facebook/android/Facebook; */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 46 */
		 final String v1 = "facebook-session"; // const-string v1, "facebook-session"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) p1 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* .line 47 */
		 /* .local v0, "savedSession":Landroid/content/SharedPreferences; */
		 final String v1 = "access_token"; // const-string v1, "access_token"
		 int v2 = 0; // const/4 v2, 0x0
		 (( com.facebook.android.Facebook ) p0 ).setAccessToken ( v1 ); // invoke-virtual {p0, v1}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
		 /* .line 48 */
		 final String v1 = "expires_in"; // const-string v1, "expires_in"
		 /* const-wide/16 v2, 0x0 */
		 /* move-result-wide v1 */
		 (( com.facebook.android.Facebook ) p0 ).setAccessExpires ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
		 /* .line 49 */
		 v1 = 		 (( com.facebook.android.Facebook ) p0 ).isSessionValid ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
	 } // .end method
	 public static Boolean save ( com.facebook.android.Facebook p0, android.content.Context p1 ) {
		 /* .locals 4 */
		 /* .param p0, "session" # Lcom/facebook/android/Facebook; */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 36 */
		 final String v1 = "facebook-session"; // const-string v1, "facebook-session"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) p1 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* .line 37 */
		 /* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
		 final String v1 = "access_token"; // const-string v1, "access_token"
		 (( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
		 /* .line 38 */
		 final String v1 = "expires_in"; // const-string v1, "expires_in"
		 (( com.facebook.android.Facebook ) p0 ).getAccessExpires ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J
		 /* move-result-wide v2 */
		 v1 = 		 /* .line 39 */
	 } // .end method
