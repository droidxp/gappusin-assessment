class com.chartboost.sdk.ChartBoost$GenericConnection extends com.chartboost.sdk.CBAPIConnection {
	 /* .source "ChartBoost.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/chartboost/sdk/ChartBoost; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "GenericConnection" */
} // .end annotation
/* # instance fields */
final com.chartboost.sdk.ChartBoost this$0; //synthetic
/* # direct methods */
public com.chartboost.sdk.ChartBoost$GenericConnection ( ) {
/* .locals 0 */
/* .param p2, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 120 */
this.this$0 = p1;
/* .line 121 */
/* invoke-direct {p0, p2}, Lcom/chartboost/sdk/CBAPIConnection;-><init>(Landroid/content/Context;)V */
/* .line 122 */
return;
} // .end method
/* # virtual methods */
protected void onPostExecute ( org.json.JSONObject p0 ) {
/* .locals 1 */
/* .param p1, "json" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 127 */
try { // :try_start_0
	 (( com.chartboost.sdk.ChartBoost$GenericConnection ) p0 ).validateJson ( p1 ); // invoke-virtual {p0, p1}, Lcom/chartboost/sdk/ChartBoost$GenericConnection;->validateJson(Lorg/json/JSONObject;)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 131 */
	 /* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
	 /* .line 133 */
} // :goto_0
return;
/* .line 128 */
/* :catch_0 */
/* move-exception v0 */
/* .line 131 */
/* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
/* .line 130 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 131 */
/* invoke-super {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V */
/* .line 132 */
/* throw v0 */
} // .end method
