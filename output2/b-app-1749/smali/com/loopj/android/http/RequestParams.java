public class com.loopj.android.http.RequestParams {
	 /* # static fields */
	 private static java.lang.String ENCODING;
	 /* # instance fields */
	 private java.util.concurrent.ConcurrentHashMap urlParams;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/ConcurrentHashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.loopj.android.http.RequestParams ( ) {
/* .locals 1 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
return;
} // .end method
public com.loopj.android.http.RequestParams ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* invoke-direct {p0}, Lcom/loopj/android/http/RequestParams;->init()V */
return;
} // .end method
public com.loopj.android.http.RequestParams ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* invoke-direct {p0}, Lcom/loopj/android/http/RequestParams;->init()V */
(( com.loopj.android.http.RequestParams ) p0 ).put ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/loopj/android/http/RequestParams;->put(Ljava/lang/String;Ljava/lang/String;)V
return;
} // .end method
private java.util.List getParamsList ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/http/message/BasicNameValuePair;", */
/* ">;" */
/* } */
} // .end annotation
/* new-instance v2, Ljava/util/LinkedList; */
/* invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V */
v0 = this.urlParams;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).entrySet ( ); // invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* new-instance v4, Lorg/apache/http/message/BasicNameValuePair; */
/* check-cast v1, Ljava/lang/String; */
/* check-cast v0, Ljava/lang/String; */
/* invoke-direct {v4, v1, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :cond_0
} // .end method
private void init ( ) {
/* .locals 1 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.urlParams = v0;
return;
} // .end method
/* # virtual methods */
public org.apache.http.HttpEntity getEntity ( ) {
/* .locals 4 */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
/* new-instance v0, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
/* invoke-direct {p0}, Lcom/loopj/android/http/RequestParams;->getParamsList()Ljava/util/List; */
v3 = com.loopj.android.http.RequestParams.ENCODING;
/* invoke-direct {v0, v2, v3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
(( java.io.UnsupportedEncodingException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
/* move-object v0, v1 */
} // .end method
public java.lang.String getParamString ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Lcom/loopj/android/http/RequestParams;->getParamsList()Ljava/util/List; */
v1 = com.loopj.android.http.RequestParams.ENCODING;
org.apache.http.client.utils.URLEncodedUtils .format ( v0,v1 );
} // .end method
public void put ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
v0 = this.urlParams;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public void remove ( java.lang.String p0 ) {
/* .locals 1 */
v0 = this.urlParams;
(( java.util.concurrent.ConcurrentHashMap ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
