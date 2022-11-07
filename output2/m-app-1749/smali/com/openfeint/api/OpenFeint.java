public class com.openfeint.api.OpenFeint {
	 /* .source "OpenFeint.java" */
	 /* # direct methods */
	 public com.openfeint.api.OpenFeint ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.openfeint.api.resource.CurrentUser getCurrentUser ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 (( com.openfeint.internal.OpenFeintInternal ) v0 ).getCurrentUser ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->getCurrentUser()Lcom/openfeint/api/resource/CurrentUser;
	 } // .end method
	 public static void initialize ( android.content.Context p0, com.openfeint.api.OpenFeintSettings p1, com.openfeint.api.OpenFeintDelegate p2 ) {
		 /* .locals 0 */
		 /* .param p0, "ctx" # Landroid/content/Context; */
		 /* .param p1, "settings" # Lcom/openfeint/api/OpenFeintSettings; */
		 /* .param p2, "delegate" # Lcom/openfeint/api/OpenFeintDelegate; */
		 /* .prologue */
		 /* .line 40 */
		 com.openfeint.internal.OpenFeintInternal .initialize ( p0,p1,p2 );
		 /* .line 41 */
		 return;
	 } // .end method
	 public static void initializeWithoutLoggingIn ( android.content.Context p0, com.openfeint.api.OpenFeintSettings p1, com.openfeint.api.OpenFeintDelegate p2 ) {
		 /* .locals 0 */
		 /* .param p0, "ctx" # Landroid/content/Context; */
		 /* .param p1, "settings" # Lcom/openfeint/api/OpenFeintSettings; */
		 /* .param p2, "delegate" # Lcom/openfeint/api/OpenFeintDelegate; */
		 /* .prologue */
		 /* .line 53 */
		 com.openfeint.internal.OpenFeintInternal .initializeWithoutLoggingIn ( p0,p1,p2 );
		 /* .line 54 */
		 return;
	 } // .end method
	 public static Boolean isNetworkConnected ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 85 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 v0 = 		 (( com.openfeint.internal.OpenFeintInternal ) v0 ).isFeintServerReachable ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->isFeintServerReachable()Z
	 } // .end method
	 public static Boolean isUserLoggedIn ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 v0 = 		 (( com.openfeint.internal.OpenFeintInternal ) v0 ).isUserLoggedIn ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->isUserLoggedIn()Z
	 } // .end method
	 public static void login ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 77 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 int v1 = 0; // const/4 v1, 0x0
		 (( com.openfeint.internal.OpenFeintInternal ) v0 ).login ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/OpenFeintInternal;->login(Z)V
		 /* .line 78 */
		 return;
	 } // .end method
	 public static void logoutUser ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 108 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 int v1 = 0; // const/4 v1, 0x0
		 (( com.openfeint.internal.OpenFeintInternal ) v0 ).logoutUser ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/OpenFeintInternal;->logoutUser(Lcom/openfeint/internal/request/IRawRequestDelegate;)V
		 /* .line 109 */
		 return;
	 } // .end method
	 public static void setDelegate ( com.openfeint.api.OpenFeintDelegate p0 ) {
		 /* .locals 1 */
		 /* .param p0, "delegate" # Lcom/openfeint/api/OpenFeintDelegate; */
		 /* .prologue */
		 /* .line 69 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 (( com.openfeint.internal.OpenFeintInternal ) v0 ).setDelegate ( p0 ); // invoke-virtual {v0, p0}, Lcom/openfeint/internal/OpenFeintInternal;->setDelegate(Lcom/openfeint/api/OpenFeintDelegate;)V
		 /* .line 70 */
		 return;
	 } // .end method
	 public static void trySubmitOfflineData ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 120 */
		 com.openfeint.internal.offline.OfflineSupport .trySubmitOfflineData ( );
		 /* .line 121 */
		 return;
	 } // .end method
	 public static void userApprovedFeint ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 93 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 (( com.openfeint.internal.OpenFeintInternal ) v0 ).userApprovedFeint ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->userApprovedFeint()V
		 /* .line 94 */
		 return;
	 } // .end method
	 public static void userDeclinedFeint ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 101 */
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 (( com.openfeint.internal.OpenFeintInternal ) v0 ).userDeclinedFeint ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->userDeclinedFeint()V
		 /* .line 102 */
		 return;
	 } // .end method
