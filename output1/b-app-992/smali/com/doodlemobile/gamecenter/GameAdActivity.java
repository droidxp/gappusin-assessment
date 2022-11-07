public class com.doodlemobile.gamecenter.GameAdActivity extends android.app.Activity {
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.GameAdActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* new-instance v0, Landroid/webkit/WebView; */
		 /* invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
		 final String v1 = "http://107.20.206.35:8080/aquarium_v1/help.html"; // const-string v1, "http://107.20.206.35:8080/aquarium_v1/help.html"
		 (( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
		 (( com.doodlemobile.gamecenter.GameAdActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameAdActivity;->setContentView(Landroid/view/View;)V
		 return;
	 } // .end method
