public class com.loopj.android.http.AsyncHttpResponseHandler extends android.os.Handler {
	 /* # static fields */
	 private static final Integer ERROR_MESSAGE;
	 private static final Integer FINISH_MESSAGE;
	 private static final Integer RESPONSE_MESSAGE;
	 private static final Integer START_MESSAGE;
	 /* # direct methods */
	 public com.loopj.android.http.AsyncHttpResponseHandler ( ) {
		 /* .locals 1 */
		 android.os.Looper .getMainLooper ( );
		 /* invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected java.lang.String getResponseBody ( org.apache.http.HttpResponse p0 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 int v0 = 0; // const/4 v0, 0x0
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* new-instance v0, Lorg/apache/http/entity/BufferedHttpEntity; */
		 /* invoke-direct {v0, v1}, Lorg/apache/http/entity/BufferedHttpEntity;-><init>(Lorg/apache/http/HttpEntity;)V */
	 } // :cond_0
	 org.apache.http.util.EntityUtils .toString ( v0 );
} // .end method
protected void handleErrorMessage ( java.lang.Throwable p0 ) {
	 /* .locals 0 */
	 (( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).onFailure ( p1 ); // invoke-virtual {p0, p1}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->onFailure(Ljava/lang/Throwable;)V
	 return;
} // .end method
public void handleMessage ( android.os.Message p0 ) {
	 /* .locals 1 */
	 /* iget v0, p1, Landroid/os/Message;->what:I */
	 /* packed-switch v0, :pswitch_data_0 */
} // :goto_0
return;
/* :pswitch_0 */
v0 = this.obj;
/* check-cast v0, Lorg/apache/http/HttpResponse; */
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).handleResponseMessage ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->handleResponseMessage(Lorg/apache/http/HttpResponse;)V
/* :pswitch_1 */
v0 = this.obj;
/* check-cast v0, Ljava/lang/Throwable; */
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).handleErrorMessage ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->handleErrorMessage(Ljava/lang/Throwable;)V
/* :pswitch_2 */
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).onStart ( ); // invoke-virtual {p0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->onStart()V
/* :pswitch_3 */
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).onFinish ( ); // invoke-virtual {p0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->onFinish()V
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
protected void handleResponseMessage ( org.apache.http.HttpResponse p0 ) {
v1 = /* .locals 3 */
/* const/16 v2, 0x12c */
/* if-lt v1, v2, :cond_0 */
v2 = /* new-instance v1, Lorg/apache/http/client/HttpResponseException; */
/* invoke-direct {v1, v2, v0}, Lorg/apache/http/client/HttpResponseException;-><init>(ILjava/lang/String;)V */
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).onFailure ( v1 ); // invoke-virtual {p0, v1}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->onFailure(Ljava/lang/Throwable;)V
} // :goto_0
return;
} // :cond_0
try { // :try_start_0
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).getResponseBody ( p1 ); // invoke-virtual {p0, p1}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->getResponseBody(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).onSuccess ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->onSuccess(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).onFailure ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->onFailure(Ljava/lang/Throwable;)V
} // .end method
public void onFailure ( java.lang.Throwable p0 ) {
/* .locals 0 */
return;
} // .end method
public void onFinish ( ) {
/* .locals 0 */
return;
} // .end method
public void onStart ( ) {
/* .locals 0 */
return;
} // .end method
public void onSuccess ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public void sendErrorMessage ( java.lang.Throwable p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).obtainMessage ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).sendMessage ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)Z
return;
} // .end method
public void sendFinishMessage ( ) {
/* .locals 1 */
int v0 = 3; // const/4 v0, 0x3
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).obtainMessage ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->obtainMessage(I)Landroid/os/Message;
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).sendMessage ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)Z
return;
} // .end method
public void sendResponseMessage ( org.apache.http.HttpResponse p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).obtainMessage ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).sendMessage ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)Z
return;
} // .end method
public void sendStartMessage ( ) {
/* .locals 1 */
int v0 = 2; // const/4 v0, 0x2
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).obtainMessage ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->obtainMessage(I)Landroid/os/Message;
(( com.loopj.android.http.AsyncHttpResponseHandler ) p0 ).sendMessage ( v0 ); // invoke-virtual {p0, v0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendMessage(Landroid/os/Message;)Z
return;
} // .end method
