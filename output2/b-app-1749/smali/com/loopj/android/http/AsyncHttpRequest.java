public class com.loopj.android.http.AsyncHttpRequest implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 private org.apache.http.client.HttpClient client;
	 private org.apache.http.protocol.HttpContext context;
	 private org.apache.http.client.methods.HttpUriRequest request;
	 private com.loopj.android.http.AsyncHttpResponseHandler responseHandler;
	 /* # direct methods */
	 public com.loopj.android.http.AsyncHttpRequest ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.client = p1;
		 this.context = p2;
		 this.request = p3;
		 this.responseHandler = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 v0 = this.responseHandler;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = this.responseHandler;
				 (( com.loopj.android.http.AsyncHttpResponseHandler ) v0 ).sendStartMessage ( ); // invoke-virtual {v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendStartMessage()V
			 } // :cond_0
			 v0 = this.client;
			 v1 = this.request;
			 v2 = this.context;
			 v1 = this.responseHandler;
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 v1 = this.responseHandler;
				 (( com.loopj.android.http.AsyncHttpResponseHandler ) v1 ).sendFinishMessage ( ); // invoke-virtual {v1}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendFinishMessage()V
				 v1 = this.responseHandler;
				 (( com.loopj.android.http.AsyncHttpResponseHandler ) v1 ).sendResponseMessage ( v0 ); // invoke-virtual {v1, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendResponseMessage(Lorg/apache/http/HttpResponse;)V
				 /* :try_end_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_1
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 v1 = this.responseHandler;
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 v1 = this.responseHandler;
			 (( com.loopj.android.http.AsyncHttpResponseHandler ) v1 ).sendFinishMessage ( ); // invoke-virtual {v1}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendFinishMessage()V
			 v1 = this.responseHandler;
			 (( com.loopj.android.http.AsyncHttpResponseHandler ) v1 ).sendErrorMessage ( v0 ); // invoke-virtual {v1, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendErrorMessage(Ljava/lang/Throwable;)V
		 } // .end method
