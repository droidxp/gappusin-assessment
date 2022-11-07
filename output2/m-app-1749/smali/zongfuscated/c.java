public class zongfuscated.c extends android.webkit.WebViewClient {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # instance fields */
	 private java.lang.String b;
	 private com.zong.android.engine.web.ZongWebView c;
	 private android.app.ProgressDialog d;
	 /* # direct methods */
	 static zongfuscated.c ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lzongfuscated/c; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public zongfuscated.c ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
		 final String v0 = "Zong Mobile Payments"; // const-string v0, "Zong Mobile Payments"
		 this.b = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 this.d = v0;
		 this.c = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( java.lang.String p0 ) {
		 /* .locals 0 */
		 this.b = p1;
		 return;
	 } // .end method
	 public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 /* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
		 v0 = zongfuscated.c.a;
		 final String v1 = "On Page Finished"; // const-string v1, "On Page Finished"
		 int v2 = 1; // const/4 v2, 0x1
		 /* new-array v2, v2, [Ljava/lang/String; */
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object p2, v2, v3 */
		 zongfuscated.q .a ( v0,v1,v2 );
		 v0 = this.d;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.d;
			 (( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 this.d = v0;
		 return;
	 } // .end method
	 public void onPageStarted ( android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2 ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 /* invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V */
		 v0 = zongfuscated.c.a;
		 final String v1 = "On Page Started"; // const-string v1, "On Page Started"
		 /* new-array v2, v4, [Ljava/lang/String; */
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object p2, v2, v3 */
		 zongfuscated.q .a ( v0,v1,v2 );
		 v0 = this.d;
		 /* if-nez v0, :cond_0 */
		 v0 = this.c;
		 v0 = 		 (( com.zong.android.engine.web.ZongWebView ) v0 ).isFinishing ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/web/ZongWebView;->isFinishing()Z
		 /* if-nez v0, :cond_0 */
		 v0 = this.c;
		 final String v1 = ""; // const-string v1, ""
		 v2 = this.b;
		 android.app.ProgressDialog .show ( v0,v1,v2,v4 );
		 this.d = v0;
	 } // :cond_0
	 return;
} // .end method
