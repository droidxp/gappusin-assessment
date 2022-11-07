public class com.facebook.android.FbDialog extends android.app.Dialog {
	 /* .source "FbDialog.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/facebook/android/FbDialog$FbWebViewClient; */
	 /* } */
} // .end annotation
/* # static fields */
static final DIMENSIONS_DIFF_LANDSCAPE;
static final DIMENSIONS_DIFF_PORTRAIT;
static final java.lang.String DISPLAY_STRING;
static final Integer FB_BLUE;
static final java.lang.String FB_ICON;
static final android.widget.FrameLayout$LayoutParams FILL;
static final Integer MARGIN;
static final Integer PADDING;
/* # instance fields */
private android.widget.FrameLayout mContent;
private android.widget.ImageView mCrossImage;
private com.facebook.android.Facebook$DialogListener mListener;
private android.app.ProgressDialog mSpinner;
private java.lang.String mUrl;
private android.webkit.WebView mWebView;
/* # direct methods */
static com.facebook.android.FbDialog ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 int v2 = 2; // const/4 v2, 0x2
	 int v1 = -1; // const/4 v1, -0x1
	 /* .line 44 */
	 /* new-array v0, v2, [F */
	 /* fill-array-data v0, :array_0 */
	 /* .line 45 */
	 /* new-array v0, v2, [F */
	 /* fill-array-data v0, :array_1 */
	 /* .line 47 */
	 /* new-instance v0, Landroid/widget/FrameLayout$LayoutParams; */
	 /* invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
	 /* .line 46 */
	 /* .line 41 */
	 return;
	 /* .line 44 */
	 /* :array_0 */
	 /* .array-data 4 */
	 /* 0x41a00000 # 20.0f */
	 /* 0x42700000 # 60.0f */
} // .end array-data
/* .line 45 */
/* :array_1 */
/* .array-data 4 */
/* 0x42200000 # 40.0f */
/* 0x42700000 # 60.0f */
} // .end array-data
} // .end method
public com.facebook.android.FbDialog ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 62 */
/* const v0, 0x1030010 */
/* invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V */
/* .line 63 */
this.mUrl = p2;
/* .line 64 */
this.mListener = p3;
/* .line 65 */
return;
} // .end method
static com.facebook.android.Facebook$DialogListener access$0 ( com.facebook.android.FbDialog p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 55 */
v0 = this.mListener;
} // .end method
static android.app.ProgressDialog access$1 ( com.facebook.android.FbDialog p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 56 */
v0 = this.mSpinner;
} // .end method
static android.widget.FrameLayout access$2 ( com.facebook.android.FbDialog p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 59 */
v0 = this.mContent;
} // .end method
static android.webkit.WebView access$3 ( com.facebook.android.FbDialog p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 58 */
v0 = this.mWebView;
} // .end method
static android.widget.ImageView access$4 ( com.facebook.android.FbDialog p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 57 */
v0 = this.mCrossImage;
} // .end method
private void createCrossImage ( ) {
/* .locals 3 */
/* .prologue */
/* .line 97 */
/* new-instance v1, Landroid/widget/ImageView; */
(( com.facebook.android.FbDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
this.mCrossImage = v1;
/* .line 99 */
v1 = this.mCrossImage;
/* new-instance v2, Lcom/facebook/android/FbDialog$1; */
/* invoke-direct {v2, p0}, Lcom/facebook/android/FbDialog$1;-><init>(Lcom/facebook/android/FbDialog;)V */
(( android.widget.ImageView ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 106 */
(( com.facebook.android.FbDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* .line 107 */
/* .local v0, "crossDrawable":Landroid/graphics/drawable/Drawable; */
v1 = this.mCrossImage;
(( android.widget.ImageView ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 111 */
v1 = this.mCrossImage;
int v2 = 4; // const/4 v2, 0x4
(( android.widget.ImageView ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 112 */
return;
} // .end method
private void setUpWebView ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "margin" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 115 */
/* new-instance v0, Landroid/widget/LinearLayout; */
(( com.facebook.android.FbDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 116 */
/* .local v0, "webViewContainer":Landroid/widget/LinearLayout; */
/* new-instance v1, Landroid/webkit/WebView; */
(( com.facebook.android.FbDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
this.mWebView = v1;
/* .line 117 */
v1 = this.mWebView;
(( android.webkit.WebView ) v1 ).setVerticalScrollBarEnabled ( v3 ); // invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
/* .line 118 */
v1 = this.mWebView;
(( android.webkit.WebView ) v1 ).setHorizontalScrollBarEnabled ( v3 ); // invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
/* .line 119 */
v1 = this.mWebView;
/* new-instance v2, Lcom/facebook/android/FbDialog$FbWebViewClient; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, p0, v3}, Lcom/facebook/android/FbDialog$FbWebViewClient;-><init>(Lcom/facebook/android/FbDialog;Lcom/facebook/android/FbDialog$FbWebViewClient;)V */
(( android.webkit.WebView ) v1 ).setWebViewClient ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 120 */
v1 = this.mWebView;
(( android.webkit.WebView ) v1 ).getSettings ( ); // invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
int v2 = 1; // const/4 v2, 0x1
(( android.webkit.WebSettings ) v1 ).setJavaScriptEnabled ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 121 */
v1 = this.mWebView;
v2 = this.mUrl;
(( android.webkit.WebView ) v1 ).loadUrl ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 122 */
v1 = this.mWebView;
v2 = com.facebook.android.FbDialog.FILL;
(( android.webkit.WebView ) v1 ).setLayoutParams ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 123 */
v1 = this.mWebView;
int v2 = 4; // const/4 v2, 0x4
(( android.webkit.WebView ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setVisibility(I)V
/* .line 125 */
(( android.widget.LinearLayout ) v0 ).setPadding ( p1, p1, p1, p1 ); // invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V
/* .line 126 */
v1 = this.mWebView;
(( android.widget.LinearLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* .line 127 */
v1 = this.mContent;
(( android.widget.FrameLayout ) v1 ).addView ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 128 */
return;
} // .end method
/* # virtual methods */
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 6 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v5 = -1; // const/4 v5, -0x1
int v4 = -2; // const/4 v4, -0x2
/* .line 69 */
/* invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V */
/* .line 70 */
/* new-instance v1, Landroid/app/ProgressDialog; */
(( com.facebook.android.FbDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v2}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V */
this.mSpinner = v1;
/* .line 71 */
v1 = this.mSpinner;
(( android.app.ProgressDialog ) v1 ).requestWindowFeature ( v3 ); // invoke-virtual {v1, v3}, Landroid/app/ProgressDialog;->requestWindowFeature(I)Z
/* .line 72 */
v1 = this.mSpinner;
final String v2 = "Loading..."; // const-string v2, "Loading..."
(( android.app.ProgressDialog ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
/* .line 74 */
(( com.facebook.android.FbDialog ) p0 ).requestWindowFeature ( v3 ); // invoke-virtual {p0, v3}, Lcom/facebook/android/FbDialog;->requestWindowFeature(I)Z
/* .line 75 */
/* new-instance v1, Landroid/widget/FrameLayout; */
(( com.facebook.android.FbDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
this.mContent = v1;
/* .line 81 */
/* invoke-direct {p0}, Lcom/facebook/android/FbDialog;->createCrossImage()V */
/* .line 86 */
v1 = this.mCrossImage;
(( android.widget.ImageView ) v1 ).getDrawable ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
v0 = (( android.graphics.drawable.Drawable ) v1 ).getIntrinsicWidth ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 87 */
/* .local v0, "crossWidth":I */
/* div-int/lit8 v1, v0, 0x2 */
/* invoke-direct {p0, v1}, Lcom/facebook/android/FbDialog;->setUpWebView(I)V */
/* .line 92 */
v1 = this.mContent;
v2 = this.mCrossImage;
/* new-instance v3, Landroid/view/ViewGroup$LayoutParams; */
/* invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.widget.FrameLayout ) v1 ).addView ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 93 */
v1 = this.mContent;
/* new-instance v2, Landroid/view/ViewGroup$LayoutParams; */
/* invoke-direct {v2, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( com.facebook.android.FbDialog ) p0 ).addContentView ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/facebook/android/FbDialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 94 */
return;
} // .end method
