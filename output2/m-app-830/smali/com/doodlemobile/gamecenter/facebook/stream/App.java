public class com.doodlemobile.gamecenter.facebook.stream.App extends android.app.Activity {
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.facebook.stream.App ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
		 /* .locals 1 */
		 com.doodlemobile.gamecenter.facebook.stream.h .b ( );
		 (( com.a.a.g ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/a/a/g;->a(IILandroid/content/Intent;)V
		 return;
	 } // .end method
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 5 */
		 final String v4 = "stream"; // const-string v4, "stream"
		 final String v3 = "login"; // const-string v3, "login"
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/facebook/stream/m; */
		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/facebook/stream/m;-><init>(Landroid/app/Activity;)V */
		 final String v1 = "login"; // const-string v1, "login"
		 /* const-class v1, Lcom/doodlemobile/gamecenter/facebook/stream/f; */
		 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).a ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->a(Ljava/lang/String;Ljava/lang/Class;)V
		 final String v1 = "stream"; // const-string v1, "stream"
		 /* const-class v1, Lcom/doodlemobile/gamecenter/facebook/stream/e; */
		 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).a ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->a(Ljava/lang/String;Ljava/lang/Class;)V
		 final String v1 = "logout"; // const-string v1, "logout"
		 /* const-class v2, Lcom/doodlemobile/gamecenter/facebook/stream/k; */
		 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->a(Ljava/lang/String;Ljava/lang/Class;)V
		 com.doodlemobile.gamecenter.facebook.stream.h .a ( p0 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 final String v1 = "stream"; // const-string v1, "stream"
			 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->a(Ljava/lang/String;)V
		 } // :goto_0
		 return;
	 } // :cond_0
	 final String v1 = "login"; // const-string v1, "login"
	 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->a(Ljava/lang/String;)V
} // .end method
