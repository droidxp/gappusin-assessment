public class com.chartboost.sdk.CBWebView extends android.webkit.WebView {
	 /* .source "CBWebView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/chartboost/sdk/CBWebView$CBViewState;, */
	 /* Lcom/chartboost/sdk/CBWebView$CBViewType; */
	 /* } */
} // .end annotation
/* # instance fields */
private org.json.JSONObject responseContext;
private com.chartboost.sdk.CBWebView$CBViewState state;
private com.chartboost.sdk.CBWebView$CBViewType type;
/* # direct methods */
public com.chartboost.sdk.CBWebView ( ) {
	 /* .locals 2 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "type" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
	 /* .prologue */
	 int v1 = -1; // const/4 v1, -0x1
	 /* .line 31 */
	 /* invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
	 /* .line 33 */
	 /* new-instance v0, Landroid/widget/RelativeLayout$LayoutParams; */
	 /* invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
	 (( com.chartboost.sdk.CBWebView ) p0 ).setLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Lcom/chartboost/sdk/CBWebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
	 /* .line 34 */
	 v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
	 /* if-ne p2, v0, :cond_1 */
	 /* .line 35 */
	 /* const v0, -0xcccccd */
	 (( com.chartboost.sdk.CBWebView ) p0 ).setBackgroundColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/chartboost/sdk/CBWebView;->setBackgroundColor(I)V
	 /* .line 40 */
} // :goto_0
(( com.chartboost.sdk.CBWebView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/chartboost/sdk/CBWebView;->getSettings()Landroid/webkit/WebSettings;
int v1 = 1; // const/4 v1, 0x1
(( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 42 */
this.type = p2;
/* .line 44 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
/* if-ne p2, v0, :cond_0 */
/* .line 46 */
/* new-instance v0, Lcom/chartboost/sdk/CBWebView$1; */
/* invoke-direct {v0, p0}, Lcom/chartboost/sdk/CBWebView$1;-><init>(Lcom/chartboost/sdk/CBWebView;)V */
(( com.chartboost.sdk.CBWebView ) p0 ).setOnTouchListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/chartboost/sdk/CBWebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 54 */
} // :cond_0
return;
/* .line 37 */
} // :cond_1
/* const/high16 v0, -0x67000000 */
(( com.chartboost.sdk.CBWebView ) p0 ).setBackgroundColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/chartboost/sdk/CBWebView;->setBackgroundColor(I)V
} // .end method
/* # virtual methods */
public org.json.JSONObject getResponseContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 60 */
v0 = this.responseContext;
} // .end method
public com.chartboost.sdk.CBWebView$CBViewState getState ( ) {
/* .locals 1 */
/* .prologue */
/* .line 75 */
v0 = this.state;
} // .end method
public com.chartboost.sdk.CBWebView$CBViewType getType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 104 */
v0 = this.type;
} // .end method
public void setResponseContext ( org.json.JSONObject p0 ) {
/* .locals 0 */
/* .param p1, "responseContext" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 68 */
this.responseContext = p1;
/* .line 69 */
return;
} // .end method
public void setState ( com.chartboost.sdk.CBWebView$CBViewState p0 ) {
/* .locals 0 */
/* .param p1, "state" # Lcom/chartboost/sdk/CBWebView$CBViewState; */
/* .prologue */
/* .line 83 */
this.state = p1;
/* .line 84 */
return;
} // .end method
public void setType ( com.chartboost.sdk.CBWebView$CBViewType p0 ) {
/* .locals 0 */
/* .param p1, "type" # Lcom/chartboost/sdk/CBWebView$CBViewType; */
/* .prologue */
/* .line 112 */
this.type = p1;
/* .line 113 */
return;
} // .end method
