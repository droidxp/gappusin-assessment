public class inal extends android.app.Dialog {
	 /* # static fields */
	 private static a;
	 private static b;
	 private static android.widget.FrameLayout$LayoutParams c;
	 /* # instance fields */
	 private java.lang.String d;
	 private com.a.a.j e;
	 private android.app.ProgressDialog f;
	 private android.webkit.WebView g;
	 private android.widget.LinearLayout h;
	 private android.widget.TextView i;
	 private android.content.Context j;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 3 */
		 int v2 = 2; // const/4 v2, 0x2
		 int v1 = -1; // const/4 v1, -0x1
		 /* new-array v0, v2, [F */
		 /* fill-array-data v0, :array_0 */
		 /* new-array v0, v2, [F */
		 /* fill-array-data v0, :array_1 */
		 /* new-instance v0, Landroid/widget/FrameLayout$LayoutParams; */
		 /* invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
		 return;
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x41a00000 # 20.0f */
		 /* 0x42700000 # 60.0f */
	 } // .end array-data
	 /* :array_1 */
	 /* .array-data 4 */
	 /* 0x42200000 # 40.0f */
	 /* 0x42700000 # 60.0f */
} // .end array-data
} // .end method
public inal ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V */
this.d = p2;
this.e = p3;
this.j = p1;
return;
} // .end method
static com.a.a.j a ( Object p0 ) { //synthethic
/* .locals 1 */
v0 = this.e;
} // .end method
static android.app.ProgressDialog b ( Object p0 ) { //synthethic
/* .locals 1 */
v0 = this.f;
} // .end method
static android.webkit.WebView c ( Object p0 ) { //synthethic
/* .locals 1 */
v0 = this.g;
} // .end method
static android.widget.TextView d ( Object p0 ) { //synthethic
/* .locals 1 */
v0 = this.i;
} // .end method
/* # virtual methods */
protected final void onCreate ( android.os.Bundle p0 ) {
/* .locals 9 */
/* const/high16 v8, 0x3f000000 # 0.5f */
int v5 = 0; // const/4 v5, 0x0
int v4 = 4; // const/4 v4, 0x4
int v6 = 0; // const/4 v6, 0x0
int v7 = 1; // const/4 v7, 0x1
/* invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V */
/* new-instance v0, Landroid/app/ProgressDialog; */
(( com.a.a.a ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/a/a/a;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V */
this.f = v0;
v0 = this.f;
(( android.app.ProgressDialog ) v0 ).requestWindowFeature ( v7 ); // invoke-virtual {v0, v7}, Landroid/app/ProgressDialog;->requestWindowFeature(I)Z
v0 = this.f;
final String v1 = "Loading..."; // const-string v1, "Loading..."
(( android.app.ProgressDialog ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
/* new-instance v0, Landroid/widget/LinearLayout; */
(( com.a.a.a ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/a/a/a;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
this.h = v0;
v0 = this.h;
(( android.widget.LinearLayout ) v0 ).setOrientation ( v7 ); // invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V
(( com.a.a.a ) p0 ).requestWindowFeature ( v7 ); // invoke-virtual {p0, v7}, Lcom/a/a/a;->requestWindowFeature(I)Z
(( com.a.a.a ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/a/a/a;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v1 = this.j;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "drawable"; // const-string v2, "drawable"
final String v3 = "dm_facebook_icon"; // const-string v3, "dm_facebook_icon"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v2,v3 );
(( android.content.res.Resources ) v0 ).getDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* new-instance v1, Landroid/widget/TextView; */
(( com.a.a.a ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/a/a/a;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
this.i = v1;
v1 = this.i;
final String v2 = "Facebook"; // const-string v2, "Facebook"
(( android.widget.TextView ) v1 ).setText ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
v1 = this.i;
int v2 = -1; // const/4 v2, -0x1
(( android.widget.TextView ) v1 ).setTextColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V
v1 = this.i;
v2 = android.graphics.Typeface.DEFAULT_BOLD;
(( android.widget.TextView ) v1 ).setTypeface ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
v1 = this.i;
/* const v2, -0x927b4c */
(( android.widget.TextView ) v1 ).setBackgroundColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundColor(I)V
v1 = this.i;
int v2 = 6; // const/4 v2, 0x6
(( android.widget.TextView ) v1 ).setPadding ( v2, v4, v4, v4 ); // invoke-virtual {v1, v2, v4, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V
v1 = this.i;
int v2 = 6; // const/4 v2, 0x6
(( android.widget.TextView ) v1 ).setCompoundDrawablePadding ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V
v1 = this.i;
(( android.widget.TextView ) v1 ).setCompoundDrawablesWithIntrinsicBounds ( v0, v5, v5, v5 ); // invoke-virtual {v1, v0, v5, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
v0 = this.h;
v1 = this.i;
(( android.widget.LinearLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* new-instance v0, Landroid/webkit/WebView; */
(( com.a.a.a ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/a/a/a;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
this.g = v0;
v0 = this.g;
(( android.webkit.WebView ) v0 ).setVerticalScrollBarEnabled ( v6 ); // invoke-virtual {v0, v6}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
v0 = this.g;
(( android.webkit.WebView ) v0 ).setHorizontalScrollBarEnabled ( v6 ); // invoke-virtual {v0, v6}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
v0 = this.g;
/* new-instance v1, Lcom/a/a/l; */
/* invoke-direct {v1, p0}, Lcom/a/a/l;-><init>(Lcom/a/a/a;)V */
(( android.webkit.WebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
v0 = this.g;
(( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v7 ); // invoke-virtual {v0, v7}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
v0 = this.g;
v1 = this.d;
(( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
v0 = this.g;
v1 = com.a.a.a.c;
(( android.webkit.WebView ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
v0 = this.h;
v1 = this.g;
(( android.widget.LinearLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
(( com.a.a.a ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/a/a/a;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).getWindowManager ( ); // invoke-virtual {v0}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;
(( com.a.a.a ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/a/a/a;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v1, v1, Landroid/util/DisplayMetrics;->density:F */
(( com.a.a.a ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/a/a/a;->getContext()Landroid/content/Context;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getConfiguration ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v2, v2, Landroid/content/res/Configuration;->orientation:I */
int v3 = 2; // const/4 v3, 0x2
/* if-ne v2, v3, :cond_0 */
v2 = com.a.a.a.a;
} // :goto_0
v3 = this.h;
/* new-instance v4, Landroid/widget/LinearLayout$LayoutParams; */
v5 = (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
/* aget v6, v2, v6 */
/* mul-float/2addr v6, v1 */
/* add-float/2addr v6, v8 */
/* float-to-int v6, v6 */
/* sub-int/2addr v5, v6 */
v0 = (( android.view.Display ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
/* aget v2, v2, v7 */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v1, v8 */
/* float-to-int v1, v1 */
/* sub-int/2addr v0, v1 */
/* invoke-direct {v4, v5, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
(( com.a.a.a ) p0 ).addContentView ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lcom/a/a/a;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // :cond_0
v2 = com.a.a.a.b;
} // .end method
