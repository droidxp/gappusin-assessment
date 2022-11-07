class com.chartboost.sdk.CBAnalytics$TransactionConnection extends com.chartboost.sdk.CBAPIConnection {
	 /* .source "CBAnalytics.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/chartboost/sdk/CBAnalytics; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "TransactionConnection" */
} // .end annotation
/* # instance fields */
final com.chartboost.sdk.CBAnalytics this$0; //synthetic
/* # direct methods */
public com.chartboost.sdk.CBAnalytics$TransactionConnection ( ) {
/* .locals 0 */
/* .param p2, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 33 */
this.this$0 = p1;
/* .line 34 */
/* invoke-direct {p0, p2}, Lcom/chartboost/sdk/CBAPIConnection;-><init>(Landroid/content/Context;)V */
/* .line 35 */
return;
} // .end method
/* # virtual methods */
protected void onPostExecute ( org.json.JSONObject p0 ) {
/* .locals 1 */
/* .param p1, "json" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 40 */
try { // :try_start_0
	 (( com.chartboost.sdk.CBAnalytics$TransactionConnection ) p0 ).validateJson ( p1 ); // invoke-virtual {p0, p1}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;->validateJson(Lorg/json/JSONObject;)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 45 */
	 /* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
	 /* .line 47 */
} // :goto_0
return;
/* .line 42 */
/* :catch_0 */
/* move-exception v0 */
/* .line 45 */
/* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
/* .line 44 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 45 */
/* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
/* .line 46 */
/* throw v0 */
} // .end method
