public class com.loopj.android.http.JsonHttpResponseHandler extends com.loopj.android.http.AsyncHttpResponseHandler {
	 /* # direct methods */
	 public com.loopj.android.http.JsonHttpResponseHandler ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void handleResponseMessage ( org.apache.http.HttpResponse p0 ) {
		 v1 = 		 /* .locals 3 */
		 /* const/16 v2, 0x12c */
		 /* if-lt v1, v2, :cond_0 */
		 v2 = 		 /* new-instance v1, Lorg/apache/http/client/HttpResponseException; */
		 /* invoke-direct {v1, v2, v0}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V */
		 (( com.loopj.android.http.JsonHttpResponseHandler ) p0 ).onFailure ( v1 ); // invoke-virtual {p0, v1}, Lcom/loopj/android/http/JsonHttpResponseHandler;->onFailure(Ljava/lang/Throwable;)V
	 } // :goto_0
	 return;
} // :cond_0
try { // :try_start_0
	 (( com.loopj.android.http.JsonHttpResponseHandler ) p0 ).getResponseBody ( p1 ); // invoke-virtual {p0, p1}, Lcom/loopj/android/http/JsonHttpResponseHandler;->getResponseBody(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
	 (( com.loopj.android.http.JsonHttpResponseHandler ) p0 ).onSuccess ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/JsonHttpResponseHandler;->onSuccess(Ljava/lang/String;)V
	 /* new-instance v1, Lorg/json/JSONTokener; */
	 /* invoke-direct {v1, v0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V */
	 (( org.json.JSONTokener ) v1 ).nextValue ( ); // invoke-virtual {v1}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;
	 (( com.loopj.android.http.JsonHttpResponseHandler ) p0 ).onSuccess ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/JsonHttpResponseHandler;->onSuccess(Ljava/lang/Object;)V
	 /* :try_end_0 */
	 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 (( com.loopj.android.http.JsonHttpResponseHandler ) p0 ).onFailure ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/JsonHttpResponseHandler;->onFailure(Ljava/lang/Throwable;)V
	 /* :catch_1 */
	 /* move-exception v0 */
	 (( com.loopj.android.http.JsonHttpResponseHandler ) p0 ).onFailure ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/JsonHttpResponseHandler;->onFailure(Ljava/lang/Throwable;)V
} // .end method
public void onSuccess ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
