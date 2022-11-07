class com.chartboost.sdk.ChartBoost$LoadDataConnection extends com.chartboost.sdk.CBAPIConnection {
	 /* .source "ChartBoost.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/chartboost/sdk/ChartBoost; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "LoadDataConnection" */
} // .end annotation
/* # instance fields */
public Boolean hadError;
public java.lang.String location;
public Boolean shouldCache;
final com.chartboost.sdk.ChartBoost this$0; //synthetic
public com.chartboost.sdk.CBWebView$CBViewType viewType;
/* # direct methods */
public com.chartboost.sdk.ChartBoost$LoadDataConnection ( ) {
/* .locals 1 */
/* .param p2, "context" # Landroid/content/Context; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 241 */
this.this$0 = p1;
/* .line 242 */
/* invoke-direct {p0, p2}, Lcom/chartboost/sdk/CBAPIConnection;-><init>(Landroid/content/Context;)V */
/* .line 236 */
/* iput-boolean v0, p0, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->shouldCache:Z */
/* .line 237 */
/* iput-boolean v0, p0, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->hadError:Z */
/* .line 238 */
final String v0 = "Default"; // const-string v0, "Default"
this.location = v0;
/* .line 239 */
v0 = com.chartboost.sdk.CBWebView$CBViewType.CBViewTypeInterstitial;
this.viewType = v0;
/* .line 243 */
return;
} // .end method
/* # virtual methods */
protected void onPostExecute ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .param p1, "json" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 248 */
try { // :try_start_0
	 (( com.chartboost.sdk.ChartBoost$LoadDataConnection ) p0 ).validateJson ( p1 ); // invoke-virtual {p0, p1}, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->validateJson(Lorg/json/JSONObject;)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 255 */
	 /* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
	 /* .line 258 */
} // :goto_0
/* iget-boolean v1, p0, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->hadError:Z */
/* if-nez v1, :cond_0 */
/* .line 260 */
v1 = this.this$0;
v2 = this.viewType;
v3 = this.location;
com.chartboost.sdk.ChartBoost .access$1 ( v1,v2,v3,p1 );
/* .line 261 */
/* iget-boolean v1, p0, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->shouldCache:Z */
/* if-nez v1, :cond_0 */
/* .line 263 */
v1 = this.this$0;
v2 = this.viewType;
v3 = this.location;
com.chartboost.sdk.ChartBoost .access$2 ( v1,v2,v3 );
/* .line 266 */
} // :cond_0
return;
/* .line 250 */
/* :catch_0 */
/* move-exception v0 */
/* .line 252 */
/* .local v0, "e":Ljava/lang/Exception; */
try { // :try_start_1
v1 = this.this$0;
v2 = this.viewType;
v3 = this.location;
com.chartboost.sdk.ChartBoost .access$0 ( v1,v2,v3 );
/* .line 253 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/chartboost/sdk/ChartBoost$LoadDataConnection;->hadError:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 255 */
/* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
/* .line 254 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v1 */
/* .line 255 */
/* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
/* .line 256 */
/* throw v1 */
} // .end method
