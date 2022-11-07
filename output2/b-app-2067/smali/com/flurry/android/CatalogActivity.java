public class com.flurry.android.CatalogActivity extends android.app.Activity implements android.view.View$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 private android.webkit.WebView a;
	 private com.flurry.android.p b;
	 private java.util.List c;
	 private com.flurry.android.n d;
	 private com.flurry.android.y e;
	 /* # direct methods */
	 public com.flurry.android.CatalogActivity ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.c = v0;
		 return;
	 } // .end method
	 static com.flurry.android.y a ( com.flurry.android.CatalogActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.e;
	 } // .end method
	 private void a ( Object p0 ) {
		 /* .locals 3 */
		 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Loading url: "; // const-string v2, "Loading url: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = this.b;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.flurry.android.z .a ( v0,v1 );
		 try { // :try_start_0
			 v0 = this.a;
			 v1 = this.b;
			 (( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
			 v0 = this.b;
			 v1 = this.c;
			 (( com.flurry.android.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/p;->a(Ljava/util/List;)V
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
		 v2 = this.b;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.flurry.android.z .a ( v0,v1 );
	 } // .end method
	 static Long b ( com.flurry.android.CatalogActivity p0 ) { //synthethic
		 /* .locals 2 */
		 v0 = this.d;
		 (( com.flurry.android.n ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->i()J
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 static com.flurry.android.n c ( com.flurry.android.CatalogActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.d;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 8 */
		 /* instance-of v1, p1, Lcom/flurry/android/r; */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* new-instance v1, Lcom/flurry/android/q; */
			 /* invoke-direct {v1}, Lcom/flurry/android/q;-><init>()V */
			 v2 = this.e;
			 this.a = v2;
			 v2 = this.a;
			 (( android.webkit.WebView ) v2 ).getUrl ( ); // invoke-virtual {v2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;
			 this.b = v2;
			 /* new-instance v2, Ljava/util/ArrayList; */
			 v3 = this.b;
			 (( com.flurry.android.p ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/flurry/android/p;->b()Ljava/util/List;
			 /* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
			 this.c = v2;
			 v2 = this.c;
			 v1 = 			 v1 = this.c;
			 int v2 = 5; // const/4 v2, 0x5
			 /* if-le v1, v2, :cond_0 */
			 v1 = this.c;
			 int v2 = 0; // const/4 v2, 0x0
		 } // :cond_0
		 /* new-instance v2, Lcom/flurry/android/q; */
		 /* invoke-direct {v2}, Lcom/flurry/android/q;-><init>()V */
		 /* move-object v0, p1 */
		 /* check-cast v0, Lcom/flurry/android/r; */
		 /* move-object v1, v0 */
		 v3 = this.d;
		 (( com.flurry.android.n ) v3 ).h ( ); // invoke-virtual {v3}, Lcom/flurry/android/n;->h()Ljava/lang/String;
		 (( com.flurry.android.r ) v1 ).b ( v3 ); // invoke-virtual {v1, v3}, Lcom/flurry/android/r;->b(Ljava/lang/String;)Ljava/lang/String;
		 (( com.flurry.android.r ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/r;->a()Lcom/flurry/android/y;
		 this.e = v4;
		 (( com.flurry.android.r ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/r;->a()Lcom/flurry/android/y;
		 this.a = v1;
		 v1 = this.a;
		 /* new-instance v4, Lcom/flurry/android/i; */
		 int v5 = 4; // const/4 v5, 0x4
		 v6 = this.d;
		 (( com.flurry.android.n ) v6 ).i ( ); // invoke-virtual {v6}, Lcom/flurry/android/n;->i()J
		 /* move-result-wide v6 */
		 /* invoke-direct {v4, v5, v6, v7}, Lcom/flurry/android/i;-><init>(BJ)V */
		 (( com.flurry.android.y ) v1 ).a ( v4 ); // invoke-virtual {v1, v4}, Lcom/flurry/android/y;->a(Lcom/flurry/android/i;)V
		 this.b = v3;
		 v1 = this.b;
		 (( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
		 (( com.flurry.android.p ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lcom/flurry/android/p;->a(Landroid/content/Context;)Ljava/util/List;
		 this.c = v1;
		 /* invoke-direct {p0, v2}, Lcom/flurry/android/CatalogActivity;->a(Lcom/flurry/android/q;)V */
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
v1 = this.b;
(( com.flurry.android.p ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/p;->a()V
} // :cond_3
v1 = v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_4
(( com.flurry.android.CatalogActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/flurry/android/CatalogActivity;->finish()V
} // :cond_4
v1 = this.c;
v2 = v2 = this.c;
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* check-cast v1, Lcom/flurry/android/q; */
/* invoke-direct {p0, v1}, Lcom/flurry/android/CatalogActivity;->a(Lcom/flurry/android/q;)V */
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 9 */
int v8 = 3; // const/4 v8, 0x3
int v7 = 2; // const/4 v7, 0x2
int v4 = 1; // const/4 v4, 0x1
int v6 = -2; // const/4 v6, -0x2
int v5 = -1; // const/4 v5, -0x1
/* const v0, 0x103000f */
(( com.flurry.android.CatalogActivity ) p0 ).setTheme ( v0 ); // invoke-virtual {p0, v0}, Lcom/flurry/android/CatalogActivity;->setTheme(I)V
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
com.flurry.android.FlurryAgent .b ( );
this.d = v0;
(( com.flurry.android.CatalogActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/flurry/android/CatalogActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v1 = "o"; // const-string v1, "o"
(( android.os.Bundle ) v0 ).getLong ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
/* move-result-wide v0 */
java.lang.Long .valueOf ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.d;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v2 */
(( com.flurry.android.n ) v1 ).b ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/flurry/android/n;->b(J)Lcom/flurry/android/y;
this.e = v0;
} // :cond_0
/* new-instance v0, Lcom/flurry/android/v; */
/* invoke-direct {v0, p0, p0}, Lcom/flurry/android/v;-><init>(Lcom/flurry/android/CatalogActivity;Landroid/content/Context;)V */
(( com.flurry.android.v ) v0 ).setId ( v4 ); // invoke-virtual {v0, v4}, Lcom/flurry/android/v;->setId(I)V
/* const/high16 v1, -0x1000000 */
(( com.flurry.android.v ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/v;->setBackgroundColor(I)V
/* new-instance v1, Landroid/webkit/WebView; */
/* invoke-direct {v1, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
this.a = v1;
v1 = this.a;
(( android.webkit.WebView ) v1 ).setId ( v7 ); // invoke-virtual {v1, v7}, Landroid/webkit/WebView;->setId(I)V
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
(( android.webkit.WebView ) v1 ).setScrollBarStyle ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
v1 = this.a;
(( android.webkit.WebView ) v1 ).setBackgroundColor ( v5 ); // invoke-virtual {v1, v5}, Landroid/webkit/WebView;->setBackgroundColor(I)V
v1 = this.a;
/* new-instance v2, Lcom/flurry/android/g; */
/* invoke-direct {v2, p0}, Lcom/flurry/android/g;-><init>(Lcom/flurry/android/CatalogActivity;)V */
(( android.webkit.WebView ) v1 ).setWebViewClient ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
v1 = this.a;
(( android.webkit.WebView ) v1 ).getSettings ( ); // invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v1 ).setJavaScriptEnabled ( v4 ); // invoke-virtual {v1, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* new-instance v1, Lcom/flurry/android/p; */
/* invoke-direct {v1, p0, p0}, Lcom/flurry/android/p;-><init>(Lcom/flurry/android/CatalogActivity;Landroid/content/Context;)V */
this.b = v1;
v1 = this.b;
(( com.flurry.android.p ) v1 ).setId ( v8 ); // invoke-virtual {v1, v8}, Lcom/flurry/android/p;->setId(I)V
/* new-instance v1, Landroid/widget/RelativeLayout; */
/* invoke-direct {v1, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
/* new-instance v2, Landroid/view/ViewGroup$LayoutParams; */
/* invoke-direct {v2, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.widget.RelativeLayout ) v1 ).setLayoutParams ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v2, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* const/16 v3, 0xa */
v4 = (( com.flurry.android.v ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/flurry/android/v;->getId()I
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
(( android.widget.RelativeLayout ) v1 ).addView ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v2, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
v3 = (( com.flurry.android.v ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/flurry/android/v;->getId()I
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v8, v3 ); // invoke-virtual {v2, v8, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
v3 = this.b;
v3 = (( com.flurry.android.p ) v3 ).getId ( ); // invoke-virtual {v3}, Lcom/flurry/android/p;->getId()I
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v7, v3 ); // invoke-virtual {v2, v7, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
v3 = this.a;
(( android.widget.RelativeLayout ) v1 ).addView ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v2, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* const/16 v3, 0xc */
v0 = (( com.flurry.android.v ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/flurry/android/v;->getId()I
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
v0 = this.b;
(( android.widget.RelativeLayout ) v1 ).addView ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
(( com.flurry.android.CatalogActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/flurry/android/CatalogActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v2 = "u"; // const-string v2, "u"
(( android.os.Bundle ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
v2 = this.a;
(( android.webkit.WebView ) v2 ).loadUrl ( v0 ); // invoke-virtual {v2, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
(( com.flurry.android.CatalogActivity ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/flurry/android/CatalogActivity;->setContentView(Landroid/view/View;)V
return;
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
v0 = this.d;
(( com.flurry.android.n ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/flurry/android/n;->f()V
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
return;
} // .end method
