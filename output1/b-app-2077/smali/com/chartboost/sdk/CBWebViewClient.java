public class com.chartboost.sdk.CBWebViewClient extends android.webkit.WebViewClient {
	 /* .source "CBWebViewClient.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String TAG;
/* # instance fields */
private com.chartboost.sdk.ChartBoost cb;
private android.widget.RelativeLayout cbContainer;
private android.content.Context context;
private com.chartboost.sdk.CBDialogActivity dialogActivity;
/* # direct methods */
public com.chartboost.sdk.CBWebViewClient ( ) {
	 /* .locals 1 */
	 /* .param p1, "dialogActivity" # Lcom/chartboost/sdk/CBDialogActivity; */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 29 */
	 /* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
	 /* .line 23 */
	 this.context = v0;
	 /* .line 24 */
	 this.dialogActivity = v0;
	 /* .line 26 */
	 this.cb = v0;
	 /* .line 31 */
	 this.dialogActivity = p1;
	 /* .line 32 */
	 this.context = p1;
	 /* .line 33 */
	 v0 = this.cbContainer;
	 this.cbContainer = v0;
	 /* .line 34 */
	 com.chartboost.sdk.ChartBoost .getSharedChartBoost ( p1 );
	 this.cb = v0;
	 /* .line 35 */
	 return;
} // .end method
static void access$0 ( com.chartboost.sdk.CBWebViewClient p0, java.lang.String p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 281 */
	 /* invoke-direct {p0, p1}, Lcom/chartboost/sdk/CBWebViewClient;->openUrl(Ljava/lang/String;)V */
	 return;
} // .end method
static com.chartboost.sdk.CBDialogActivity access$1 ( com.chartboost.sdk.CBWebViewClient p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 24 */
	 v0 = this.dialogActivity;
} // .end method
static void access$2 ( com.chartboost.sdk.CBWebViewClient p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 291 */
	 /* invoke-direct {p0}, Lcom/chartboost/sdk/CBWebViewClient;->closeView()V */
	 return;
} // .end method
private void closeView ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 293 */
	 v1 = this.cbContainer;
	 /* if-nez v1, :cond_0 */
	 /* .line 302 */
} // :goto_0
return;
/* .line 296 */
} // :cond_0
v1 = this.cbContainer;
(( android.widget.RelativeLayout ) v1 ).getParent ( ); // invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;
/* check-cast v0, Landroid/view/ViewManager; */
/* .line 297 */
/* .local v0, "view":Landroid/view/ViewManager; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 298 */
v1 = this.cbContainer;
/* .line 300 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
this.cbContainer = v1;
/* .line 301 */
v1 = this.dialogActivity;
(( com.chartboost.sdk.CBDialogActivity ) v1 ).close ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/CBDialogActivity;->close()V
} // .end method
private void handleChartBoostRequestForInterstitial ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 208 */
final String v5 = "cb"; // const-string v5, "cb"
final String v6 = "handleChartBoostRequestForInterstitial"; // const-string v6, "handleChartBoostRequestForInterstitial"
android.util.Log .w ( v5,v6 );
/* .line 210 */
final String v5 = "/"; // const-string v5, "/"
(( java.lang.String ) p1 ).split ( v5 ); // invoke-virtual {p1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 211 */
/* .local v2, "items":[Ljava/lang/String; */
int v5 = 2; // const/4 v5, 0x2
/* aget-object v1, v2, v5 */
/* .line 213 */
/* .local v1, "function":Ljava/lang/String; */
final String v5 = "cb"; // const-string v5, "cb"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "function: "; // const-string v7, "function: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v5,v6 );
/* .line 215 */
final String v5 = "close"; // const-string v5, "close"
v5 = (( java.lang.String ) v1 ).equals ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 217 */
v5 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v5 ).getDelegate ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
if ( v5 != null) { // if-eqz v5, :cond_0
	 /* .line 218 */
	 v5 = this.cb;
	 (( com.chartboost.sdk.ChartBoost ) v5 ).getDelegate ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
	 v6 = this.dialogActivity;
	 v6 = this.webView;
	 (( com.chartboost.sdk.ChartBoostDelegate ) v5 ).didCloseInterstitial ( v6 ); // invoke-virtual {v5, v6}, Lcom/chartboost/sdk/ChartBoostDelegate;->didCloseInterstitial(Landroid/view/View;)V
	 /* .line 223 */
} // :cond_0
/* invoke-direct {p0}, Lcom/chartboost/sdk/CBWebViewClient;->closeView()V */
/* .line 255 */
} // :cond_1
} // :goto_0
return;
/* .line 225 */
} // :cond_2
final String v5 = "link"; // const-string v5, "link"
v5 = (( java.lang.String ) v1 ).equals ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 227 */
v5 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v5 ).getDelegate ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 228 */
v5 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v5 ).getDelegate ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
v6 = this.dialogActivity;
v6 = this.webView;
(( com.chartboost.sdk.ChartBoostDelegate ) v5 ).didClickInterstitial ( v6 ); // invoke-virtual {v5, v6}, Lcom/chartboost/sdk/ChartBoostDelegate;->didClickInterstitial(Landroid/view/View;)V
/* .line 234 */
} // :cond_3
try { // :try_start_0
/* new-instance v4, Lcom/chartboost/sdk/CBAPIRequest; */
v5 = this.context;
final String v6 = "api"; // const-string v6, "api"
final String v7 = "click"; // const-string v7, "click"
/* invoke-direct {v4, v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 235 */
/* .local v4, "request":Lcom/chartboost/sdk/CBAPIRequest; */
(( com.chartboost.sdk.CBAPIRequest ) v4 ).appendDeviceInfoParams ( ); // invoke-virtual {v4}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V
/* .line 237 */
final String v5 = "to"; // const-string v5, "to"
v6 = this.dialogActivity;
v6 = this.webView;
(( com.chartboost.sdk.CBWebView ) v6 ).getResponseContext ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/CBWebView;->getResponseContext()Lorg/json/JSONObject;
final String v7 = "to"; // const-string v7, "to"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v4 ).appendBodyArgument ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 238 */
final String v5 = "cgn"; // const-string v5, "cgn"
v6 = this.dialogActivity;
v6 = this.webView;
(( com.chartboost.sdk.CBWebView ) v6 ).getResponseContext ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/CBWebView;->getResponseContext()Lorg/json/JSONObject;
final String v7 = "cgn"; // const-string v7, "cgn"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v4 ).appendBodyArgument ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 239 */
final String v5 = "creative"; // const-string v5, "creative"
v6 = this.dialogActivity;
v6 = this.webView;
(( com.chartboost.sdk.CBWebView ) v6 ).getResponseContext ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/CBWebView;->getResponseContext()Lorg/json/JSONObject;
final String v7 = "creative"; // const-string v7, "creative"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v4 ).appendBodyArgument ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 241 */
v5 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v5 ).getAppId ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;
v6 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v6 ).getAppSignature ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v4 ).sign ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V
/* .line 243 */
final String v5 = "cb"; // const-string v5, "cb"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "decoding: "; // const-string v7, "decoding: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
int v7 = 3; // const/4 v7, 0x3
/* aget-object v7, v2, v7 */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v5,v6 );
/* .line 244 */
/* new-instance v3, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection; */
v5 = this.context;
/* invoke-direct {v3, p0, v5}, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;-><init>(Lcom/chartboost/sdk/CBWebViewClient;Landroid/content/Context;)V */
/* .line 245 */
/* .local v3, "rcc":Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection; */
int v5 = 1; // const/4 v5, 0x1
/* iput-boolean v5, v3, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;->shouldShowProgress:Z */
/* .line 246 */
int v5 = 3; // const/4 v5, 0x3
/* aget-object v5, v2, v5 */
final String v6 = "UTF-8"; // const-string v6, "UTF-8"
java.net.URLDecoder .decode ( v5,v6 );
this.data = v5;
/* .line 247 */
int v5 = 1; // const/4 v5, 0x1
/* new-array v5, v5, [Lcom/chartboost/sdk/CBAPIRequest; */
int v6 = 0; // const/4 v6, 0x0
/* aput-object v4, v5, v6 */
(( com.chartboost.sdk.CBWebViewClient$RegisterClickConnection ) v3 ).execute ( v5 ); // invoke-virtual {v3, v5}, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 249 */
final String v5 = "cb"; // const-string v5, "cb"
final String v6 = "sending request click request"; // const-string v6, "sending request click request"
android.util.Log .w ( v5,v6 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_0 */
/* .line 251 */
} // .end local v3 # "rcc":Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;
} // .end local v4 # "request":Lcom/chartboost/sdk/CBAPIRequest;
/* :catch_0 */
/* move-exception v0 */
/* .line 252 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* goto/16 :goto_0 */
} // .end method
private void handleChartBoostRequestForMoreApps ( java.lang.String p0 ) {
/* .locals 9 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 151 */
final String v6 = "/"; // const-string v6, "/"
(( java.lang.String ) p1 ).split ( v6 ); // invoke-virtual {p1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 152 */
/* .local v3, "items":[Ljava/lang/String; */
int v6 = 2; // const/4 v6, 0x2
/* aget-object v2, v3, v6 */
/* .line 155 */
/* .local v2, "function":Ljava/lang/String; */
final String v6 = "close"; // const-string v6, "close"
v6 = (( java.lang.String ) v2 ).equals ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 157 */
v6 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v6 ).getDelegate ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 158 */
v6 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v6 ).getDelegate ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
v7 = this.dialogActivity;
v7 = this.webView;
(( com.chartboost.sdk.ChartBoostDelegate ) v6 ).didCloseMoreApps ( v7 ); // invoke-virtual {v6, v7}, Lcom/chartboost/sdk/ChartBoostDelegate;->didCloseMoreApps(Landroid/view/View;)V
/* .line 163 */
} // :cond_0
/* invoke-direct {p0}, Lcom/chartboost/sdk/CBWebViewClient;->closeView()V */
/* .line 204 */
} // :cond_1
} // :goto_0
return;
/* .line 165 */
} // :cond_2
final String v6 = "link"; // const-string v6, "link"
v6 = (( java.lang.String ) v2 ).equals ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 167 */
v6 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v6 ).getDelegate ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 168 */
v6 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v6 ).getDelegate ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
v7 = this.dialogActivity;
v7 = this.webView;
(( com.chartboost.sdk.ChartBoostDelegate ) v6 ).didClickMoreApps ( v7 ); // invoke-virtual {v6, v7}, Lcom/chartboost/sdk/ChartBoostDelegate;->didClickMoreApps(Landroid/view/View;)V
/* .line 172 */
} // :cond_3
try { // :try_start_0
/* new-instance v5, Lcom/chartboost/sdk/CBAPIRequest; */
v6 = this.context;
final String v7 = "api"; // const-string v7, "api"
final String v8 = "click"; // const-string v8, "click"
/* invoke-direct {v5, v6, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 173 */
/* .local v5, "request":Lcom/chartboost/sdk/CBAPIRequest; */
(( com.chartboost.sdk.CBAPIRequest ) v5 ).appendDeviceInfoParams ( ); // invoke-virtual {v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V
/* .line 175 */
/* new-instance v1, Lorg/json/JSONObject; */
/* new-instance v6, Lorg/json/JSONTokener; */
int v7 = 4; // const/4 v7, 0x4
/* aget-object v7, v3, v7 */
final String v8 = "UTF-8"; // const-string v8, "UTF-8"
java.net.URLDecoder .decode ( v7,v8 );
/* invoke-direct {v6, v7}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v1, v6}, Lorg/json/JSONObject;-><init>(Lorg/json/JSONTokener;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 178 */
/* .local v1, "embeddedData":Lorg/json/JSONObject; */
try { // :try_start_1
final String v6 = "to"; // const-string v6, "to"
final String v7 = "to"; // const-string v7, "to"
(( org.json.JSONObject ) v1 ).getString ( v7 ); // invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v5 ).appendBodyArgument ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_5 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 181 */
} // :goto_1
try { // :try_start_2
final String v6 = "cgn"; // const-string v6, "cgn"
final String v7 = "cgn"; // const-string v7, "cgn"
(( org.json.JSONObject ) v1 ).getString ( v7 ); // invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v5 ).appendBodyArgument ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_2 */
/* .catch Lorg/json/JSONException; {:try_start_2 ..:try_end_2} :catch_4 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 184 */
} // :goto_2
try { // :try_start_3
final String v6 = "creative"; // const-string v6, "creative"
final String v7 = "creative"; // const-string v7, "creative"
(( org.json.JSONObject ) v1 ).getString ( v7 ); // invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v5 ).appendBodyArgument ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_3 */
/* .catch Lorg/json/JSONException; {:try_start_3 ..:try_end_3} :catch_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* .line 187 */
} // :goto_3
try { // :try_start_4
final String v6 = "type"; // const-string v6, "type"
final String v7 = "type"; // const-string v7, "type"
(( org.json.JSONObject ) v1 ).getString ( v7 ); // invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v5 ).appendBodyArgument ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_4 */
/* .catch Lorg/json/JSONException; {:try_start_4 ..:try_end_4} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .line 190 */
} // :goto_4
try { // :try_start_5
final String v6 = "more_type"; // const-string v6, "more_type"
final String v7 = "more_type"; // const-string v7, "more_type"
(( org.json.JSONObject ) v1 ).getString ( v7 ); // invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v5 ).appendBodyArgument ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_5 */
/* .catch Lorg/json/JSONException; {:try_start_5 ..:try_end_5} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_0 */
/* .line 193 */
} // :goto_5
try { // :try_start_6
v6 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v6 ).getAppId ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;
v7 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v7 ).getAppSignature ( ); // invoke-virtual {v7}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v5 ).sign ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V
/* .line 194 */
/* new-instance v4, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection; */
v6 = this.context;
/* invoke-direct {v4, p0, v6}, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;-><init>(Lcom/chartboost/sdk/CBWebViewClient;Landroid/content/Context;)V */
/* .line 195 */
/* .local v4, "rcc":Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection; */
int v6 = 1; // const/4 v6, 0x1
/* iput-boolean v6, v4, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;->shouldShowProgress:Z */
/* .line 196 */
int v6 = 3; // const/4 v6, 0x3
/* aget-object v6, v3, v6 */
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
java.net.URLDecoder .decode ( v6,v7 );
this.data = v6;
/* .line 197 */
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Lcom/chartboost/sdk/CBAPIRequest; */
int v7 = 0; // const/4 v7, 0x0
/* aput-object v5, v6, v7 */
(( com.chartboost.sdk.CBWebViewClient$RegisterClickConnection ) v4 ).execute ( v6 ); // invoke-virtual {v4, v6}, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_0 */
/* goto/16 :goto_0 */
/* .line 199 */
} // .end local v1 # "embeddedData":Lorg/json/JSONObject;
} // .end local v4 # "rcc":Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;
} // .end local v5 # "request":Lcom/chartboost/sdk/CBAPIRequest;
/* :catch_0 */
/* move-exception v0 */
/* .line 200 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* goto/16 :goto_0 */
/* .line 191 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* .restart local v1 # "embeddedData":Lorg/json/JSONObject; */
/* .restart local v5 # "request":Lcom/chartboost/sdk/CBAPIRequest; */
/* :catch_1 */
/* move-exception v6 */
/* .line 188 */
/* :catch_2 */
/* move-exception v6 */
/* .line 185 */
/* :catch_3 */
/* move-exception v6 */
/* .line 182 */
/* :catch_4 */
/* move-exception v6 */
/* .line 179 */
/* :catch_5 */
/* move-exception v6 */
} // .end method
private void openUrl ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 283 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 284 */
/* .local v0, "intent":Landroid/content/Intent; */
android.net.Uri .parse ( p1 );
(( android.content.Intent ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 286 */
final String v1 = "ChartBoost AdView"; // const-string v1, "ChartBoost AdView"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Sideloading URL: "; // const-string v3, "Sideloading URL: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 288 */
v1 = this.context;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 289 */
return;
} // .end method
/* # virtual methods */
protected void handleChartBoostRequest ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 140 */
final String v0 = "ChartBoost AdView"; // const-string v0, "ChartBoost AdView"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Handling chartboost:// request: "; // const-string v2, "Handling chartboost:// request: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 142 */
v0 = this.dialogActivity;
v0 = this.webView;
(( com.chartboost.sdk.CBWebView ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/CBWebView;->getType()Lcom/chartboost/sdk/CBWebView$CBViewType;
v1 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
/* if-ne v0, v1, :cond_1 */
/* .line 143 */
/* invoke-direct {p0, p1}, Lcom/chartboost/sdk/CBWebViewClient;->handleChartBoostRequestForInterstitial(Ljava/lang/String;)V */
/* .line 147 */
} // :cond_0
} // :goto_0
return;
/* .line 144 */
} // :cond_1
v0 = this.dialogActivity;
v0 = this.webView;
(( com.chartboost.sdk.CBWebView ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/CBWebView;->getType()Lcom/chartboost/sdk/CBWebView$CBViewType;
v1 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
/* if-ne v0, v1, :cond_0 */
/* .line 145 */
/* invoke-direct {p0, p1}, Lcom/chartboost/sdk/CBWebViewClient;->handleChartBoostRequestForMoreApps(Ljava/lang/String;)V */
} // .end method
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 55 */
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
/* move-object v0, p1 */
/* .line 57 */
/* check-cast v0, Lcom/chartboost/sdk/CBWebView; */
/* .line 58 */
/* .local v0, "chartBoostView":Lcom/chartboost/sdk/CBWebView; */
(( com.chartboost.sdk.CBWebView ) v0 ).getState ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/CBWebView;->getState()Lcom/chartboost/sdk/CBWebView$CBViewState;
v2 = com.chartboost.sdk.CBWebView$CBViewState.CBViewStateWaitingForDisplay;
/* if-ne v1, v2, :cond_0 */
/* .line 60 */
v1 = com.chartboost.sdk.CBWebView$CBViewState.CBViewStateOther;
(( com.chartboost.sdk.CBWebView ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/CBWebView;->setState(Lcom/chartboost/sdk/CBWebView$CBViewState;)V
/* .line 62 */
(( com.chartboost.sdk.CBWebView ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/CBWebView;->getType()Lcom/chartboost/sdk/CBWebView$CBViewType;
v2 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
/* if-ne v1, v2, :cond_3 */
/* .line 66 */
v1 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v1 ).getDelegate ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 67 */
v1 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v1 ).getDelegate ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
v1 = (( com.chartboost.sdk.ChartBoostDelegate ) v1 ).shouldDisplayInterstitial ( v0 ); // invoke-virtual {v1, v0}, Lcom/chartboost/sdk/ChartBoostDelegate;->shouldDisplayInterstitial(Landroid/view/View;)Z
/* if-nez v1, :cond_1 */
/* .line 69 */
/* invoke-direct {p0}, Lcom/chartboost/sdk/CBWebViewClient;->closeView()V */
/* .line 112 */
} // :cond_0
} // :goto_0
return;
/* .line 74 */
} // :cond_1
v1 = this.cbContainer;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 76 */
final String v1 = "ChartBoost AdView"; // const-string v1, "ChartBoost AdView"
final String v2 = "Got an interstitial, adding to view!"; // const-string v2, "Got an interstitial, adding to view!"
android.util.Log .i ( v1,v2 );
/* .line 79 */
v1 = this.cbContainer;
(( android.widget.RelativeLayout ) v1 ).removeAllViews ( ); // invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V
/* .line 80 */
v1 = this.cbContainer;
(( android.widget.RelativeLayout ) v1 ).addView ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
/* .line 82 */
v1 = this.cbContainer;
(( android.widget.RelativeLayout ) v1 ).invalidate ( ); // invoke-virtual {v1}, Landroid/widget/RelativeLayout;->invalidate()V
/* .line 109 */
} // :cond_2
} // :goto_1
v1 = com.chartboost.sdk.CBWebView$CBViewState.CBViewStateDisplayedByDefaultController;
(( com.chartboost.sdk.CBWebView ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lcom/chartboost/sdk/CBWebView;->setState(Lcom/chartboost/sdk/CBWebView$CBViewState;)V
/* .line 86 */
} // :cond_3
(( com.chartboost.sdk.CBWebView ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/CBWebView;->getType()Lcom/chartboost/sdk/CBWebView$CBViewType;
v2 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeMoreApps;
/* if-ne v1, v2, :cond_2 */
/* .line 89 */
v1 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v1 ).getDelegate ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 90 */
v1 = this.cb;
(( com.chartboost.sdk.ChartBoost ) v1 ).getDelegate ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
v1 = (( com.chartboost.sdk.ChartBoostDelegate ) v1 ).shouldDisplayMoreApps ( v0 ); // invoke-virtual {v1, v0}, Lcom/chartboost/sdk/ChartBoostDelegate;->shouldDisplayMoreApps(Landroid/view/View;)Z
/* if-nez v1, :cond_4 */
/* .line 92 */
/* invoke-direct {p0}, Lcom/chartboost/sdk/CBWebViewClient;->closeView()V */
/* .line 97 */
} // :cond_4
v1 = this.cbContainer;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 98 */
final String v1 = "ChartBoost AdView"; // const-string v1, "ChartBoost AdView"
final String v2 = "Got More Apps, adding to view!"; // const-string v2, "Got More Apps, adding to view!"
android.util.Log .i ( v1,v2 );
/* .line 101 */
v1 = this.cbContainer;
(( android.widget.RelativeLayout ) v1 ).removeAllViews ( ); // invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V
/* .line 102 */
v1 = this.cbContainer;
(( android.widget.RelativeLayout ) v1 ).addView ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
/* .line 104 */
v1 = this.cbContainer;
(( android.widget.RelativeLayout ) v1 ).invalidate ( ); // invoke-virtual {v1}, Landroid/widget/RelativeLayout;->invalidate()V
} // .end method
public void onReceivedError ( android.webkit.WebView p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 0 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "errorCode" # I */
/* .param p3, "description" # Ljava/lang/String; */
/* .param p4, "failingUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 50 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V */
/* .line 51 */
return;
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 5 */
/* .param p1, "webView" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 121 */
try { // :try_start_0
/* new-instance v1, Ljava/net/URI; */
/* invoke-direct {v1, p2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
/* .line 123 */
/* .local v1, "uri":Ljava/net/URI; */
(( java.net.URI ) v1 ).getScheme ( ); // invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;
final String v4 = "file"; // const-string v4, "file"
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 134 */
} // .end local v1 # "uri":Ljava/net/URI;
} // :cond_0
} // :goto_0
/* .line 126 */
/* .restart local v1 # "uri":Ljava/net/URI; */
} // :cond_1
(( java.net.URI ) v1 ).getScheme ( ); // invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;
final String v4 = "chartboost"; // const-string v4, "chartboost"
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 127 */
(( com.chartboost.sdk.CBWebViewClient ) p0 ).handleChartBoostRequest ( p2 ); // invoke-virtual {p0, p2}, Lcom/chartboost/sdk/CBWebViewClient;->handleChartBoostRequest(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 128 */
int v2 = 1; // const/4 v2, 0x1
/* .line 133 */
} // .end local v1 # "uri":Ljava/net/URI;
/* :catch_0 */
/* move-exception v0 */
/* .line 134 */
/* .local v0, "e":Ljava/lang/Exception; */
} // .end method
