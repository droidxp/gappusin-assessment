public class com.doodlemobile.gamecenter.facebook.stream.f extends com.doodlemobile.gamecenter.facebook.stream.g {
	 /* # static fields */
	 private static java.lang.String b;
	 /* # direct methods */
	 static com.doodlemobile.gamecenter.facebook.stream.f ( ) {
		 /* .locals 3 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* new-array v0, v0, [Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v2 = "offline_access"; // const-string v2, "offline_access"
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = "read_stream"; // const-string v2, "read_stream"
		 /* aput-object v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 final String v2 = "publish_stream"; // const-string v2, "publish_stream"
		 /* aput-object v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 final String v2 = "user_photos"; // const-string v2, "user_photos"
		 /* aput-object v2, v0, v1 */
		 int v1 = 4; // const/4 v1, 0x4
		 final String v2 = "friends_education_history"; // const-string v2, "friends_education_history"
		 /* aput-object v2, v0, v1 */
		 int v1 = 5; // const/4 v1, 0x5
		 final String v2 = "friends_photos"; // const-string v2, "friends_photos"
		 /* aput-object v2, v0, v1 */
		 return;
	 } // .end method
	 public com.doodlemobile.gamecenter.facebook.stream.f ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/facebook/stream/g;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 3 */
		 v0 = this.a;
		 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->a()Landroid/webkit/WebView;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/facebook/stream/c; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/facebook/stream/c;-><init>(Lcom/doodlemobile/gamecenter/facebook/stream/f;)V */
		 final String v2 = "app"; // const-string v2, "app"
		 (( android.webkit.WebView ) v0 ).addJavascriptInterface ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
		 v0 = this.a;
		 final String v1 = "login.html"; // const-string v1, "login.html"
		 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->c(Ljava/lang/String;)V
		 return;
	 } // .end method
