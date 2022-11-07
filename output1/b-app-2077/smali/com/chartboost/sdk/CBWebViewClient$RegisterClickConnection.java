class com.chartboost.sdk.CBWebViewClient$RegisterClickConnection extends com.chartboost.sdk.CBAPIConnection {
	 /* .source "CBWebViewClient.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/chartboost/sdk/CBWebViewClient; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "RegisterClickConnection" */
} // .end annotation
/* # instance fields */
final com.chartboost.sdk.CBWebViewClient this$0; //synthetic
/* # direct methods */
public com.chartboost.sdk.CBWebViewClient$RegisterClickConnection ( ) {
/* .locals 0 */
/* .param p2, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 258 */
this.this$0 = p1;
/* .line 259 */
/* invoke-direct {p0, p2}, Lcom/chartboost/sdk/CBAPIConnection;-><init>(Landroid/content/Context;)V */
/* .line 260 */
return;
} // .end method
/* # virtual methods */
protected void onPostExecute ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .param p1, "json" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 265 */
try { // :try_start_0
	 (( com.chartboost.sdk.CBWebViewClient$RegisterClickConnection ) p0 ).validateJson ( p1 ); // invoke-virtual {p0, p1}, Lcom/chartboost/sdk/CBWebViewClient$RegisterClickConnection;->validateJson(Lorg/json/JSONObject;)V
	 /* .line 266 */
	 v0 = this.data;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.data;
		 /* instance-of v0, v0, Ljava/lang/String; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v1 = this.this$0;
			 v0 = this.data;
			 /* check-cast v0, Ljava/lang/String; */
			 com.chartboost.sdk.CBWebViewClient .access$0 ( v1,v0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 270 */
		 } // :cond_0
		 /* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
		 /* .line 273 */
	 } // :goto_0
	 v0 = this.this$0;
	 com.chartboost.sdk.CBWebViewClient .access$1 ( v0 );
	 v0 = this.webView;
	 (( com.chartboost.sdk.CBWebView ) v0 ).getState ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/CBWebView;->getState()Lcom/chartboost/sdk/CBWebView$CBViewState;
	 v1 = com.chartboost.sdk.CBWebView$CBViewState.CBViewStateDisplayedByDefaultController;
	 /* if-ne v0, v1, :cond_1 */
	 /* .line 275 */
	 final String v0 = "cb"; // const-string v0, "cb"
	 final String v1 = "closing interstitial ad"; // const-string v1, "closing interstitial ad"
	 android.util.Log .w ( v0,v1 );
	 /* .line 276 */
	 v0 = this.this$0;
	 com.chartboost.sdk.CBWebViewClient .access$2 ( v0 );
	 /* .line 278 */
} // :cond_1
return;
/* .line 267 */
/* :catch_0 */
/* move-exception v0 */
/* .line 270 */
/* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
/* .line 269 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 270 */
/* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
/* .line 271 */
/* throw v0 */
} // .end method
