public class com.flurry.android.CatalogActivity extends android.app.Activity implements android.view.View$OnClickListener {
	 /* # interfaces */
	 /* # static fields */
	 private static volatile java.lang.String a;
	 /* # instance fields */
	 private android.webkit.WebView b;
	 private com.flurry.android.w c;
	 private java.util.List d;
	 private com.flurry.android.u e;
	 private com.flurry.android.p f;
	 /* # direct methods */
	 static com.flurry.android.CatalogActivity ( ) {
		 /* .locals 1 */
		 final String v0 = "<html><body><table height=\'100%\' width=\'100%\' border=\'0\'><tr><td style=\'vertical-align:middle;text-align:center\'>No recommendations available<p><button type=\'input\' onClick=\'activity.finish()\'>Back</button></td></tr></table></body></html>"; // const-string v0, "<html><body><table height=\'100%\' width=\'100%\' border=\'0\'><tr><td style=\'vertical-align:middle;text-align:center\'>No recommendations available<p><button type=\'input\' onClick=\'activity.finish()\'>Back</button></td></tr></table></body></html>"
		 return;
	 } // .end method
	 public com.flurry.android.CatalogActivity ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.d = v0;
		 return;
	 } // .end method
	 static com.flurry.android.p a ( com.flurry.android.CatalogActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.f;
	 } // .end method
	 private void a ( Object p0 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 v0 = this.b;
			 v1 = this.a;
			 (( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
			 v0 = this.c;
			 v1 = this.b;
			 (( com.flurry.android.w ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/w;->a(Ljava/util/List;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Error loading url: "; // const-string v2, "Error loading url: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = this.a;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.flurry.android.ah .a ( v0,v1 );
	 } // .end method
	 static Long b ( com.flurry.android.CatalogActivity p0 ) { //synthethic
		 /* .locals 2 */
		 v0 = this.e;
		 (( com.flurry.android.u ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->i()J
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 static com.flurry.android.u c ( com.flurry.android.CatalogActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.e;
	 } // .end method
	 /* # virtual methods */
	 public void finish ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Landroid/app/Activity;->finish()V */
		 return;
	 } // .end method
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 5 */
		 /* instance-of v1, p1, Lcom/flurry/android/y; */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* new-instance v1, Lcom/flurry/android/x; */
			 /* invoke-direct {v1}, Lcom/flurry/android/x;-><init>()V */
			 v2 = this.b;
			 (( android.webkit.WebView ) v2 ).getUrl ( ); // invoke-virtual {v2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;
			 this.a = v2;
			 /* new-instance v2, Ljava/util/ArrayList; */
			 v3 = this.c;
			 (( com.flurry.android.w ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/flurry/android/w;->b()Ljava/util/List;
			 /* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
			 this.b = v2;
			 v2 = this.d;
			 v1 = 			 v1 = this.d;
			 int v2 = 5; // const/4 v2, 0x5
			 /* if-le v1, v2, :cond_0 */
			 v1 = this.d;
			 int v2 = 0; // const/4 v2, 0x0
		 } // :cond_0
		 /* new-instance v2, Lcom/flurry/android/x; */
		 /* invoke-direct {v2}, Lcom/flurry/android/x;-><init>()V */
		 /* move-object v0, p1 */
		 /* check-cast v0, Lcom/flurry/android/y; */
		 /* move-object v1, v0 */
		 v3 = this.e;
		 (( com.flurry.android.y ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/y;->a()Lcom/flurry/android/p;
		 (( com.flurry.android.u ) v3 ).b ( v4 ); // invoke-virtual {v3, v4}, Lcom/flurry/android/u;->b(Lcom/flurry/android/p;)Lcom/flurry/android/p;
		 this.f = v3;
		 v3 = this.f;
		 (( com.flurry.android.y ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lcom/flurry/android/y;->a(Lcom/flurry/android/p;)V
		 v3 = this.e;
		 (( com.flurry.android.y ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/y;->a()Lcom/flurry/android/p;
		 (( com.flurry.android.u ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Lcom/flurry/android/u;->a(Lcom/flurry/android/p;)Ljava/lang/String;
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 v4 = this.e;
		 (( com.flurry.android.u ) v4 ).h ( ); // invoke-virtual {v4}, Lcom/flurry/android/u;->h()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.a = v1;
		 v1 = this.c;
		 (( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
		 (( com.flurry.android.w ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lcom/flurry/android/w;->a(Landroid/content/Context;)Ljava/util/List;
		 this.b = v1;
		 /* invoke-direct {p0, v2}, Lcom/flurry/android/CatalogActivity;->a(Lcom/flurry/android/x;)V */
	 } // :goto_0
	 return;
} // :cond_1
v1 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* const/16 v2, 0x2710 */
/* if-ne v1, v2, :cond_2 */
(( com.flurry.android.CatalogActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/flurry/android/CatalogActivity;->finish()V
} // :cond_2
v1 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* const/16 v2, 0x2712 */
/* if-ne v1, v2, :cond_3 */
v1 = this.c;
(( com.flurry.android.w ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/w;->a()V
} // :cond_3
v1 = v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_4
(( com.flurry.android.CatalogActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/flurry/android/CatalogActivity;->finish()V
} // :cond_4
v1 = this.d;
v2 = v2 = this.d;
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* check-cast v1, Lcom/flurry/android/x; */
/* invoke-direct {p0, v1}, Lcom/flurry/android/CatalogActivity;->a(Lcom/flurry/android/x;)V */
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 9 */
int v8 = 2; // const/4 v8, 0x2
int v6 = 1; // const/4 v6, 0x1
int v1 = 0; // const/4 v1, 0x0
int v7 = -2; // const/4 v7, -0x2
int v5 = -1; // const/4 v5, -0x1
/* const v0, 0x103000f */
(( com.flurry.android.CatalogActivity ) p0 ).setTheme ( v0 ); // invoke-virtual {p0, v0}, Lcom/flurry/android/CatalogActivity;->setTheme(I)V
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
com.flurry.android.FlurryAgent .b ( );
this.e = v0;
(( com.flurry.android.CatalogActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/flurry/android/CatalogActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
if ( v2 != null) { // if-eqz v2, :cond_0
(( android.content.Intent ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v2 = "o"; // const-string v2, "o"
(( android.os.Bundle ) v0 ).getLong ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
/* move-result-wide v2 */
java.lang.Long .valueOf ( v2,v3 );
if ( v0 != null) { // if-eqz v0, :cond_0
v2 = this.e;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v3 */
(( com.flurry.android.u ) v2 ).b ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/flurry/android/u;->b(J)Lcom/flurry/android/p;
this.f = v0;
} // :cond_0
/* new-instance v0, Lcom/flurry/android/ab; */
/* invoke-direct {v0, p0, p0}, Lcom/flurry/android/ab;-><init>(Lcom/flurry/android/CatalogActivity;Landroid/content/Context;)V */
(( com.flurry.android.ab ) v0 ).setId ( v6 ); // invoke-virtual {v0, v6}, Lcom/flurry/android/ab;->setId(I)V
/* const/high16 v2, -0x1000000 */
(( com.flurry.android.ab ) v0 ).setBackgroundColor ( v2 ); // invoke-virtual {v0, v2}, Lcom/flurry/android/ab;->setBackgroundColor(I)V
/* new-instance v2, Landroid/webkit/WebView; */
/* invoke-direct {v2, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
this.b = v2;
v2 = this.b;
(( android.webkit.WebView ) v2 ).setId ( v8 ); // invoke-virtual {v2, v8}, Landroid/webkit/WebView;->setId(I)V
v2 = this.b;
int v3 = 0; // const/4 v3, 0x0
(( android.webkit.WebView ) v2 ).setScrollBarStyle ( v3 ); // invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
v2 = this.b;
(( android.webkit.WebView ) v2 ).setBackgroundColor ( v5 ); // invoke-virtual {v2, v5}, Landroid/webkit/WebView;->setBackgroundColor(I)V
v2 = this.f;
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.b;
/* new-instance v3, Lcom/flurry/android/q; */
/* invoke-direct {v3, p0}, Lcom/flurry/android/q;-><init>(Lcom/flurry/android/CatalogActivity;)V */
(( android.webkit.WebView ) v2 ).setWebViewClient ( v3 ); // invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
} // :cond_1
v2 = this.b;
(( android.webkit.WebView ) v2 ).getSettings ( ); // invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v2 ).setJavaScriptEnabled ( v6 ); // invoke-virtual {v2, v6}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
v2 = this.b;
final String v3 = "activity"; // const-string v3, "activity"
(( android.webkit.WebView ) v2 ).addJavascriptInterface ( p0, v3 ); // invoke-virtual {v2, p0, v3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
/* new-instance v2, Lcom/flurry/android/w; */
/* invoke-direct {v2, p0, p0}, Lcom/flurry/android/w;-><init>(Lcom/flurry/android/CatalogActivity;Landroid/content/Context;)V */
this.c = v2;
v2 = this.c;
int v3 = 3; // const/4 v3, 0x3
(( com.flurry.android.w ) v2 ).setId ( v3 ); // invoke-virtual {v2, v3}, Lcom/flurry/android/w;->setId(I)V
/* new-instance v6, Landroid/widget/RelativeLayout; */
/* invoke-direct {v6, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
/* new-instance v2, Landroid/view/ViewGroup$LayoutParams; */
/* invoke-direct {v2, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.widget.RelativeLayout ) v6 ).setLayoutParams ( v2 ); // invoke-virtual {v6, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v2, v5, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* const/16 v3, 0xa */
v4 = (( com.flurry.android.ab ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/flurry/android/ab;->getId()I
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
(( android.widget.RelativeLayout ) v6 ).addView ( v0, v2 ); // invoke-virtual {v6, v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v2, v5, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
int v3 = 3; // const/4 v3, 0x3
v4 = (( com.flurry.android.ab ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/flurry/android/ab;->getId()I
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
v3 = this.c;
v3 = (( com.flurry.android.w ) v3 ).getId ( ); // invoke-virtual {v3}, Lcom/flurry/android/w;->getId()I
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v8, v3 ); // invoke-virtual {v2, v8, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
v3 = this.b;
(( android.widget.RelativeLayout ) v6 ).addView ( v3, v2 ); // invoke-virtual {v6, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v2, v5, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* const/16 v3, 0xc */
v0 = (( com.flurry.android.ab ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/flurry/android/ab;->getId()I
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
v0 = this.c;
(( android.widget.RelativeLayout ) v6 ).addView ( v0, v2 ); // invoke-virtual {v6, v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
(( com.flurry.android.CatalogActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/flurry/android/CatalogActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* if-nez v0, :cond_2 */
/* move-object v0, v1 */
} // :goto_0
/* if-nez v0, :cond_3 */
v0 = this.b;
v2 = com.flurry.android.CatalogActivity.a;
final String v3 = "text/html"; // const-string v3, "text/html"
final String v4 = "utf-8"; // const-string v4, "utf-8"
/* move-object v5, v1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
} // :goto_1
(( com.flurry.android.CatalogActivity ) p0 ).setContentView ( v6 ); // invoke-virtual {p0, v6}, Lcom/flurry/android/CatalogActivity;->setContentView(Landroid/view/View;)V
return;
} // :cond_2
final String v2 = "u"; // const-string v2, "u"
(( android.os.Bundle ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
} // :cond_3
v1 = this.b;
(( android.webkit.WebView ) v1 ).loadUrl ( v0 ); // invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
v0 = this.e;
(( com.flurry.android.u ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->g()V
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
return;
} // .end method
