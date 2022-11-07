public class inal {
	 /* # instance fields */
	 private android.webkit.WebView a;
	 private android.app.Activity b;
	 private android.widget.LinearLayout c;
	 private Boolean d;
	 private java.util.HashMap e;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = -1; // const/4 v3, -0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.b = p1;
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.e = v0;
		 /* new-instance v0, Landroid/widget/LinearLayout; */
		 /* invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
		 this.c = v0;
		 v0 = this.c;
		 /* new-instance v1, Landroid/widget/LinearLayout$LayoutParams; */
		 /* invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 (( android.app.Activity ) p1 ).addContentView ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/doodlemobile/gamecenter/facebook/stream/m;->d:Z */
		 /* iget-boolean v0, p0, Lcom/doodlemobile/gamecenter/facebook/stream/m;->d:Z */
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Landroid/webkit/WebView; */
		 v1 = this.b;
		 /* invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
		 this.a = v0;
		 v0 = this.a;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/facebook/stream/b; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/facebook/stream/b;-><init>(Lcom/doodlemobile/gamecenter/facebook/stream/m;)V */
		 (( android.webkit.WebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
		 v0 = this.a;
		 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
		 (( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v4 ); // invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
		 v0 = this.c;
		 v1 = this.a;
		 /* new-instance v2, Landroid/widget/LinearLayout$LayoutParams; */
		 /* invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 (( android.widget.LinearLayout ) v0 ).addView ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* iput-boolean v4, p0, Lcom/doodlemobile/gamecenter/facebook/stream/m;->d:Z */
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public final android.webkit.WebView a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
} // .end method
public final void a ( java.lang.String p0 ) {
	 /* .locals 1 */
	 v0 = this.e;
	 (( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/Class; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 try { // :try_start_0
			 (( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
			 /* check-cast v0, Lcom/doodlemobile/gamecenter/facebook/stream/g; */
			 (( com.doodlemobile.gamecenter.facebook.stream.g ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/doodlemobile/gamecenter/facebook/stream/g;->a(Lcom/doodlemobile/gamecenter/facebook/stream/m;)V
			 (( com.doodlemobile.gamecenter.facebook.stream.g ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/facebook/stream/g;->a()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 (( java.lang.IllegalAccessException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V
	 /* :catch_1 */
	 /* move-exception v0 */
	 (( java.lang.InstantiationException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/InstantiationException;->printStackTrace()V
} // .end method
public final void a ( java.lang.String p0, java.lang.Class p1 ) {
	 /* .locals 1 */
	 v0 = this.e;
	 (( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 return;
} // .end method
public final android.app.Activity b ( ) {
	 /* .locals 1 */
	 v0 = this.b;
} // .end method
public final void b ( java.lang.String p0 ) {
	 /* .locals 6 */
	 v0 = this.a;
	 final String v1 = "http://nada"; // const-string v1, "http://nada"
	 final String v3 = "text/html"; // const-string v3, "text/html"
	 final String v4 = "utf8"; // const-string v4, "utf8"
	 final String v5 = ""; // const-string v5, ""
	 /* move-object v2, p1 */
	 /* invoke-virtual/range {v0 ..v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
public final void c ( java.lang.String p0 ) {
	 /* .locals 3 */
	 v0 = this.a;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "file:///android_asset/"; // const-string v2, "file:///android_asset/"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
	 return;
} // .end method
