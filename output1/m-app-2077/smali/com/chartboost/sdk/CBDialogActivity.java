public class com.chartboost.sdk.CBDialogActivity extends android.app.Activity {
	 /* .source "CBDialogActivity.java" */
	 /* # static fields */
	 public static final java.lang.String BUNDLE_KEY_CONFIGOBJECT;
	 public static final java.lang.String BUNDLE_KEY_TYPE;
	 public static final Integer OVERLAY_OPACITY;
	 public static final java.lang.String TAG;
	 /* # instance fields */
	 protected org.json.JSONObject cbConfiguration;
	 protected android.widget.RelativeLayout cbContainer;
	 protected com.chartboost.sdk.ChartBoost cbObject;
	 protected Integer cbViewType;
	 protected android.content.Context ctx;
	 public com.chartboost.sdk.CBWebView webView;
	 private com.chartboost.sdk.CBWebViewClient webViewClient;
	 /* # direct methods */
	 public com.chartboost.sdk.CBDialogActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 43 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.webViewClient = v0;
		 /* .line 28 */
		 return;
	 } // .end method
	 static void access$0 ( com.chartboost.sdk.CBDialogActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 115 */
		 /* invoke-direct {p0}, Lcom/chartboost/sdk/CBDialogActivity;->display()V */
		 return;
	 } // .end method
	 private void display ( ) {
		 /* .locals 8 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 120 */
		 this.webView = v0;
		 /* .line 122 */
		 /* iget v0, p0, Lcom/chartboost/sdk/CBDialogActivity;->cbViewType:I */
		 v1 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
		 v1 = 		 (( com.chartboost.sdk.CBWebView$CBViewType ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/CBWebView$CBViewType;->ordinal()I
		 /* if-ne v0, v1, :cond_4 */
		 /* .line 123 */
		 /* new-instance v0, Lcom/chartboost/sdk/CBWebView; */
		 v1 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
		 /* invoke-direct {v0, p0, v1}, Lcom/chartboost/sdk/CBWebView;-><init>(Landroid/content/Context;Lcom/chartboost/sdk/CBWebView$CBViewType;)V */
		 this.webView = v0;
		 /* .line 128 */
	 } // :cond_0
} // :goto_0
com.chartboost.sdk.ChartBoost .getSharedChartBoost ( p0 );
this.cbObject = v0;
/* .line 131 */
v0 = this.webView;
if ( v0 != null) { // if-eqz v0, :cond_1
	 v0 = this.cbObject;
	 /* if-nez v0, :cond_2 */
	 /* .line 134 */
} // :cond_1
(( com.chartboost.sdk.CBDialogActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->finish()V
/* .line 136 */
} // :cond_2
/* new-instance v0, Lcom/chartboost/sdk/CBWebViewClient; */
/* invoke-direct {v0, p0}, Lcom/chartboost/sdk/CBWebViewClient;-><init>(Lcom/chartboost/sdk/CBDialogActivity;)V */
this.webViewClient = v0;
/* .line 137 */
v0 = this.webView;
v1 = com.chartboost.sdk.CBWebView$CBViewState.CBViewStateWaitingForDisplay;
(( com.chartboost.sdk.CBWebView ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/CBWebView;->setState(Lcom/chartboost/sdk/CBWebView$CBViewState;)V
/* .line 138 */
v0 = this.webView;
v1 = this.cbConfiguration;
(( com.chartboost.sdk.CBWebView ) v0 ).setResponseContext ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/CBWebView;->setResponseContext(Lorg/json/JSONObject;)V
/* .line 139 */
v0 = this.webView;
v1 = this.webViewClient;
(( com.chartboost.sdk.CBWebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/CBWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 142 */
try { // :try_start_0
v0 = this.cbConfiguration;
final String v1 = "html"; // const-string v1, "html"
(( org.json.JSONObject ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 144 */
/* .local v6, "cbHtmlContent":Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_3
	 v0 = 	 (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
	 /* if-nez v0, :cond_5 */
	 /* .line 145 */
} // :cond_3
/* new-instance v0, Ljava/lang/Exception; */
final String v1 = "html content is blank!"; // const-string v1, "html content is blank!"
/* invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 150 */
} // .end local v6 # "cbHtmlContent":Ljava/lang/String;
/* :catch_0 */
/* move-exception v7 */
/* .line 154 */
/* .local v7, "e":Ljava/lang/Exception; */
(( com.chartboost.sdk.CBDialogActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->finish()V
/* .line 157 */
} // .end local v7 # "e":Ljava/lang/Exception;
} // :goto_1
return;
/* .line 124 */
} // :cond_4
/* iget v0, p0, Lcom/chartboost/sdk/CBDialogActivity;->cbViewType:I */
v1 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
v1 = (( com.chartboost.sdk.CBWebView$CBViewType ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/CBWebView$CBViewType;->ordinal()I
/* if-ne v0, v1, :cond_0 */
/* .line 125 */
/* new-instance v0, Lcom/chartboost/sdk/CBWebView; */
v1 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
/* invoke-direct {v0, p0, v1}, Lcom/chartboost/sdk/CBWebView;-><init>(Landroid/content/Context;Lcom/chartboost/sdk/CBWebView$CBViewType;)V */
this.webView = v0;
/* .line 148 */
/* .restart local v6 # "cbHtmlContent":Ljava/lang/String; */
} // :cond_5
try { // :try_start_1
v0 = this.webView;
final String v1 = "file:///android_asset/"; // const-string v1, "file:///android_asset/"
v2 = this.cbConfiguration;
final String v3 = "html"; // const-string v3, "html"
(( org.json.JSONObject ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v3 = "text/html"; // const-string v3, "text/html"
final String v4 = "utf-8"; // const-string v4, "utf-8"
int v5 = 0; // const/4 v5, 0x0
/* invoke-virtual/range {v0 ..v5}, Lcom/chartboost/sdk/CBWebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 0 */
/* .prologue */
/* .line 100 */
(( com.chartboost.sdk.CBDialogActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->finish()V
/* .line 101 */
return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 5 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* const/16 v4, 0x400 */
int v3 = -1; // const/4 v3, -0x1
/* .line 49 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 51 */
int v1 = 1; // const/4 v1, 0x1
(( com.chartboost.sdk.CBDialogActivity ) p0 ).requestWindowFeature ( v1 ); // invoke-virtual {p0, v1}, Lcom/chartboost/sdk/CBDialogActivity;->requestWindowFeature(I)Z
/* .line 52 */
/* const/16 v2, 0x8 */
/* if-le v1, v2, :cond_0 */
/* .line 54 */
(( com.chartboost.sdk.CBDialogActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v1 ).setFlags ( v4, v4 ); // invoke-virtual {v1, v4, v4}, Landroid/view/Window;->setFlags(II)V
/* .line 56 */
} // :cond_0
/* new-instance v1, Landroid/widget/RelativeLayout; */
/* invoke-direct {v1, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
this.cbContainer = v1;
/* .line 57 */
v1 = this.cbContainer;
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
(( android.widget.RelativeLayout ) v1 ).setLayoutParams ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 58 */
v1 = this.cbContainer;
/* const/high16 v2, -0x1000000 */
(( android.widget.RelativeLayout ) v1 ).setBackgroundColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
/* .line 59 */
v1 = this.cbContainer;
(( android.widget.RelativeLayout ) v1 ).getBackground ( ); // invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getBackground()Landroid/graphics/drawable/Drawable;
/* const/16 v2, 0x4b */
(( android.graphics.drawable.Drawable ) v1 ).setAlpha ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
/* .line 60 */
v1 = this.cbContainer;
/* const/16 v2, 0x31 */
(( android.widget.RelativeLayout ) v1 ).setGravity ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setGravity(I)V
/* .line 63 */
(( com.chartboost.sdk.CBDialogActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->getIntent()Landroid/content/Intent;
final String v2 = "bk_type"; // const-string v2, "bk_type"
v1 = (( android.content.Intent ) v1 ).hasExtra ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
/* if-nez v1, :cond_1 */
/* .line 64 */
(( com.chartboost.sdk.CBDialogActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->finish()V
/* .line 67 */
} // :cond_1
(( com.chartboost.sdk.CBDialogActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v1 ).getExtras ( ); // invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v2 = "bk_type"; // const-string v2, "bk_type"
v1 = (( android.os.Bundle ) v1 ).getInt ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
/* iput v1, p0, Lcom/chartboost/sdk/CBDialogActivity;->cbViewType:I */
/* .line 71 */
try { // :try_start_0
/* new-instance v1, Lorg/json/JSONObject; */
(( com.chartboost.sdk.CBDialogActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v2 ).getExtras ( ); // invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v3 = "bk_cfgo"; // const-string v3, "bk_cfgo"
(( android.os.Bundle ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
this.cbConfiguration = v1;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 79 */
} // :goto_0
this.ctx = p0;
/* .line 85 */
v1 = this.cbContainer;
/* new-instance v2, Lcom/chartboost/sdk/CBDialogActivity$1; */
/* invoke-direct {v2, p0}, Lcom/chartboost/sdk/CBDialogActivity$1;-><init>(Lcom/chartboost/sdk/CBDialogActivity;)V */
(( android.widget.RelativeLayout ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z
/* .line 92 */
v1 = this.cbContainer;
(( com.chartboost.sdk.CBDialogActivity ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/chartboost/sdk/CBDialogActivity;->setContentView(Landroid/view/View;)V
/* .line 93 */
return;
/* .line 72 */
/* :catch_0 */
/* move-exception v0 */
/* .line 76 */
/* .local v0, "e":Lorg/json/JSONException; */
(( com.chartboost.sdk.CBDialogActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBDialogActivity;->finish()V
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 106 */
v0 = this.cbContainer;
(( android.widget.RelativeLayout ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
/* .line 107 */
int v0 = 0; // const/4 v0, 0x0
this.cbContainer = v0;
/* .line 109 */
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 110 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 162 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
/* .line 163 */
v0 = this.webViewClient;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 165 */
v0 = this.webViewClient;
final String v1 = "chartboost://close"; // const-string v1, "chartboost://close"
(( com.chartboost.sdk.CBWebViewClient ) v0 ).handleChartBoostRequest ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/CBWebViewClient;->handleChartBoostRequest(Ljava/lang/String;)V
/* .line 168 */
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
