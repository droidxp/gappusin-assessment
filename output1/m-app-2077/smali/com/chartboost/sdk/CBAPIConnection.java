public class com.chartboost.sdk.CBAPIConnection extends android.os.AsyncTask {
	 /* .source "CBAPIConnection.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Lcom/chartboost/sdk/CBAPIRequest;", */
/* "Ljava/lang/Void;", */
/* "Lorg/json/JSONObject;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final java.lang.String CB_DEFAULT_ENDPOINT;
public static final Integer DEFAULT_CONNECT_TIMEOUT;
public static final Integer DEFAULT_READ_TIMEOUT;
public static final Integer MIN_TIMEOUT;
/* # instance fields */
protected android.content.Context context;
public java.lang.Object data;
private java.lang.String endpoint;
private org.apache.http.client.HttpClient httpClient;
public java.lang.String loadingMessage;
private android.app.ProgressDialog progressDialog;
public Boolean shouldShowProgress;
/* # direct methods */
public com.chartboost.sdk.CBAPIConnection ( ) {
/* .locals 2 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 69 */
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
/* .line 59 */
this.context = v1;
/* .line 62 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->shouldShowProgress:Z */
/* .line 63 */
final String v0 = "Loading..."; // const-string v0, "Loading..."
this.loadingMessage = v0;
/* .line 65 */
this.progressDialog = v1;
/* .line 70 */
this.context = p1;
/* .line 71 */
final String v0 = "https://www.chartboost.com/"; // const-string v0, "https://www.chartboost.com/"
(( com.chartboost.sdk.CBAPIConnection ) p0 ).setEndpoint ( v0 ); // invoke-virtual {p0, v0}, Lcom/chartboost/sdk/CBAPIConnection;->setEndpoint(Ljava/lang/String;)V
/* .line 73 */
/* invoke-direct {p0}, Lcom/chartboost/sdk/CBAPIConnection;->createHttpClient()Lorg/apache/http/client/HttpClient; */
this.httpClient = v0;
/* .line 74 */
return;
} // .end method
private org.apache.http.client.HttpClient createHttpClient ( ) {
/* .locals 10 */
/* .prologue */
/* .line 212 */
try { // :try_start_0
	 java.security.KeyStore .getDefaultType ( );
	 java.security.KeyStore .getInstance ( v6 );
	 /* .line 213 */
	 /* .local v5, "trustStore":Ljava/security/KeyStore; */
	 int v6 = 0; // const/4 v6, 0x0
	 int v7 = 0; // const/4 v7, 0x0
	 (( java.security.KeyStore ) v5 ).load ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
	 /* .line 215 */
	 /* new-instance v4, Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory; */
	 /* invoke-direct {v4, p0, v5}, Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory;-><init>(Lcom/chartboost/sdk/CBAPIConnection;Ljava/security/KeyStore;)V */
	 /* .line 216 */
	 /* .local v4, "sf":Lorg/apache/http/conn/ssl/SSLSocketFactory; */
	 v6 = org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
	 (( org.apache.http.conn.ssl.SSLSocketFactory ) v4 ).setHostnameVerifier ( v6 ); // invoke-virtual {v4, v6}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
	 /* .line 218 */
	 /* new-instance v2, Lorg/apache/http/params/BasicHttpParams; */
	 /* invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
	 /* .line 219 */
	 /* .local v2, "params":Lorg/apache/http/params/HttpParams; */
	 v6 = org.apache.http.HttpVersion.HTTP_1_1;
	 org.apache.http.params.HttpProtocolParams .setVersion ( v2,v6 );
	 /* .line 220 */
	 final String v6 = "UTF-8"; // const-string v6, "UTF-8"
	 org.apache.http.params.HttpProtocolParams .setContentCharset ( v2,v6 );
	 /* .line 222 */
	 /* new-instance v3, Lorg/apache/http/conn/scheme/SchemeRegistry; */
	 /* invoke-direct {v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V */
	 /* .line 223 */
	 /* .local v3, "registry":Lorg/apache/http/conn/scheme/SchemeRegistry; */
	 /* new-instance v6, Lorg/apache/http/conn/scheme/Scheme; */
	 final String v7 = "http"; // const-string v7, "http"
	 org.apache.http.conn.scheme.PlainSocketFactory .getSocketFactory ( );
	 /* const/16 v9, 0x50 */
	 /* invoke-direct {v6, v7, v8, v9}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
	 (( org.apache.http.conn.scheme.SchemeRegistry ) v3 ).register ( v6 ); // invoke-virtual {v3, v6}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
	 /* .line 224 */
	 /* new-instance v6, Lorg/apache/http/conn/scheme/Scheme; */
	 final String v7 = "https"; // const-string v7, "https"
	 /* const/16 v8, 0x1bb */
	 /* invoke-direct {v6, v7, v4, v8}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
	 (( org.apache.http.conn.scheme.SchemeRegistry ) v3 ).register ( v6 ); // invoke-virtual {v3, v6}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
	 /* .line 226 */
	 /* new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager; */
	 /* invoke-direct {v0, v2, v3}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V */
	 /* .line 228 */
	 /* .local v0, "ccm":Lorg/apache/http/conn/ClientConnectionManager; */
	 v6 = this.context;
	 com.chartboost.sdk.ChartBoost .getSharedChartBoost ( v6 );
	 v6 = 	 (( com.chartboost.sdk.ChartBoost ) v6 ).getTimeoutConnect ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getTimeoutConnect()I
	 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v2,v6 );
	 /* .line 229 */
	 v6 = this.context;
	 com.chartboost.sdk.ChartBoost .getSharedChartBoost ( v6 );
	 v6 = 	 (( com.chartboost.sdk.ChartBoost ) v6 ).getTimeoutRead ( ); // invoke-virtual {v6}, Lcom/chartboost/sdk/ChartBoost;->getTimeoutRead()I
	 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v2,v6 );
	 /* .line 231 */
	 /* new-instance v6, Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* invoke-direct {v6, v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 234 */
} // .end local v0 # "ccm":Lorg/apache/http/conn/ClientConnectionManager;
} // .end local v2 # "params":Lorg/apache/http/params/HttpParams;
} // .end local v3 # "registry":Lorg/apache/http/conn/scheme/SchemeRegistry;
} // .end local v4 # "sf":Lorg/apache/http/conn/ssl/SSLSocketFactory;
} // .end local v5 # "trustStore":Ljava/security/KeyStore;
} // :goto_0
/* .line 233 */
/* :catch_0 */
/* move-exception v1 */
/* .line 234 */
/* .local v1, "e":Ljava/lang/Exception; */
/* new-instance v6, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v6}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
} // .end method
/* # virtual methods */
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Lcom/chartboost/sdk/CBAPIRequest; */
(( com.chartboost.sdk.CBAPIConnection ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->doInBackground([Lcom/chartboost/sdk/CBAPIRequest;)Lorg/json/JSONObject;
} // .end method
protected org.json.JSONObject doInBackground ( com.chartboost.sdk.CBAPIRequest...p0 ) {
/* .locals 25 */
/* .param p1, "requests" # [Lcom/chartboost/sdk/CBAPIRequest; */
/* .prologue */
/* .line 99 */
/* const/16 v22, 0x0 */
/* aget-object v16, p1, v22 */
/* .line 100 */
/* .local v16, "request":Lcom/chartboost/sdk/CBAPIRequest; */
/* new-instance v22, Ljava/lang/StringBuilder; */
/* invoke-virtual/range {p0 ..p0}, Lcom/chartboost/sdk/CBAPIConnection;->getEndpoint()Ljava/lang/String; */
/* invoke-static/range {v23 ..v23}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-direct/range {v22 ..v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* invoke-virtual/range {v16 ..v16}, Lcom/chartboost/sdk/CBAPIRequest;->getController()Ljava/lang/String; */
/* invoke-virtual/range {v22 ..v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v23 = "/"; // const-string v23, "/"
/* invoke-virtual/range {v22 ..v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v16 ..v16}, Lcom/chartboost/sdk/CBAPIRequest;->getAction()Ljava/lang/String; */
/* invoke-virtual/range {v22 ..v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v23 = ".json"; // const-string v23, ".json"
/* invoke-virtual/range {v22 ..v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v22 ..v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* .line 104 */
/* .local v20, "urlString":Ljava/lang/String; */
/* invoke-virtual/range {v16 ..v16}, Lcom/chartboost/sdk/CBAPIRequest;->getQuery()Ljava/util/Map; */
/* .line 105 */
/* .local v13, "query":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
if ( v13 != null) { // if-eqz v13, :cond_0
/* .line 106 */
final String v14 = ""; // const-string v14, ""
/* .line 107 */
/* .local v14, "queryString":Ljava/lang/String; */
/* invoke-interface/range {v22 ..v22}, Ljava/util/Set;->iterator()Ljava/util/Iterator; */
} // :goto_0
v23 = /* invoke-interface/range {v22 ..v22}, Ljava/util/Iterator;->hasNext()Z */
/* if-nez v23, :cond_2 */
/* .line 115 */
/* new-instance v22, Ljava/lang/StringBuilder; */
/* invoke-static/range {v20 ..v20}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-direct/range {v22 ..v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v23 = "?"; // const-string v23, "?"
/* invoke-virtual/range {v22 ..v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v22 */
(( java.lang.StringBuilder ) v0 ).append ( v14 ); // invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v22 ..v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* .line 118 */
} // .end local v14 # "queryString":Ljava/lang/String;
} // :cond_0
/* new-instance v8, Lorg/apache/http/client/methods/HttpPost; */
/* move-object/from16 v0, v20 */
/* invoke-direct {v8, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
/* .line 122 */
/* .local v8, "httpRequest":Lorg/apache/http/client/methods/HttpPost; */
/* invoke-virtual/range {v16 ..v16}, Lcom/chartboost/sdk/CBAPIRequest;->getBody()Ljava/util/Map; */
/* .line 123 */
/* .local v2, "body":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 124 */
/* new-instance v12, Ljava/util/ArrayList; */
/* invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V */
/* .line 125 */
/* .local v12, "postPairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;" */
/* invoke-interface/range {v22 ..v22}, Ljava/util/Set;->iterator()Ljava/util/Iterator; */
} // :goto_1
v22 = /* invoke-interface/range {v23 ..v23}, Ljava/util/Iterator;->hasNext()Z */
/* if-nez v22, :cond_3 */
/* .line 129 */
try { // :try_start_0
/* new-instance v22, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
/* move-object/from16 v0, v22 */
/* invoke-direct {v0, v12}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V */
/* move-object/from16 v0, v22 */
(( org.apache.http.client.methods.HttpPost ) v8 ).setEntity ( v0 ); // invoke-virtual {v8, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 136 */
} // .end local v12 # "postPairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
} // :cond_1
} // :goto_2
/* move-object/from16 v0, p0 */
v5 = this.httpClient;
/* .line 137 */
/* .local v5, "finalHttpClient":Lorg/apache/http/client/HttpClient; */
/* move-object v6, v8 */
/* .line 142 */
/* .local v6, "finalHttpRequest":Lorg/apache/http/client/methods/HttpPost; */
try { // :try_start_1
/* .line 144 */
/* .local v17, "response":Lorg/apache/http/HttpResponse; */
/* invoke-interface/range {v17 ..v17}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine; */
v18 = /* invoke-interface/range {v22 ..v22}, Lorg/apache/http/StatusLine;->getStatusCode()I */
/* .line 146 */
/* .local v18, "status":I */
/* const/16 v22, 0x12c */
/* move/from16 v0, v18 */
/* move/from16 v1, v22 */
/* if-ge v0, v1, :cond_5 */
/* const/16 v22, 0xc8 */
/* move/from16 v0, v18 */
/* move/from16 v1, v22 */
/* if-lt v0, v1, :cond_5 */
/* .line 148 */
/* new-instance v15, Ljava/io/BufferedReader; */
/* new-instance v22, Ljava/io/InputStreamReader; */
/* invoke-interface/range {v17 ..v17}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity; */
/* invoke-interface/range {v23 ..v23}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream; */
final String v24 = "UTF-8"; // const-string v24, "UTF-8"
/* invoke-direct/range {v22 ..v24}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V */
/* move-object/from16 v0, v22 */
/* invoke-direct {v15, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
/* .line 149 */
/* .local v15, "reader":Ljava/io/BufferedReader; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 150 */
/* .local v3, "builder":Ljava/lang/StringBuilder; */
int v11 = 0; // const/4 v11, 0x0
/* .local v11, "line":Ljava/lang/String; */
} // :goto_3
(( java.io.BufferedReader ) v15 ).readLine ( ); // invoke-virtual {v15}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* if-nez v11, :cond_4 */
/* .line 153 */
/* new-instance v19, Lorg/json/JSONTokener; */
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v22 */
/* invoke-direct {v0, v1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V */
/* .line 154 */
/* .local v19, "tokener":Lorg/json/JSONTokener; */
/* new-instance v9, Lorg/json/JSONObject; */
/* move-object/from16 v0, v19 */
/* invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Lorg/json/JSONTokener;)V */
/* .line 156 */
/* .local v9, "jsonObject":Lorg/json/JSONObject; */
final String v22 = "ChartBoost"; // const-string v22, "ChartBoost"
/* new-instance v23, Ljava/lang/StringBuilder; */
final String v24 = "Request response received: "; // const-string v24, "Request response received: "
/* invoke-direct/range {v23 ..v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v24 = "message"; // const-string v24, "message"
/* move-object/from16 v0, v24 */
(( org.json.JSONObject ) v9 ).optString ( v0 ); // invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v23 ..v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v22 ..v23}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 162 */
/* move-object v7, v9 */
/* .line 174 */
} // .end local v3 # "builder":Ljava/lang/StringBuilder;
} // .end local v9 # "jsonObject":Lorg/json/JSONObject;
} // .end local v11 # "line":Ljava/lang/String;
} // .end local v15 # "reader":Ljava/io/BufferedReader;
} // .end local v17 # "response":Lorg/apache/http/HttpResponse;
} // .end local v18 # "status":I
} // .end local v19 # "tokener":Lorg/json/JSONTokener;
} // :goto_4
/* .line 107 */
} // .end local v2 # "body":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // .end local v5 # "finalHttpClient":Lorg/apache/http/client/HttpClient;
} // .end local v6 # "finalHttpRequest":Lorg/apache/http/client/methods/HttpPost;
} // .end local v8 # "httpRequest":Lorg/apache/http/client/methods/HttpPost;
/* .restart local v14 # "queryString":Ljava/lang/String; */
} // :cond_2
/* invoke-interface/range {v22 ..v22}, Ljava/util/Iterator;->next()Ljava/lang/Object; */
/* check-cast v10, Ljava/lang/String; */
/* .line 108 */
/* .local v10, "key":Ljava/lang/String; */
/* check-cast v21, Ljava/lang/String; */
/* .line 110 */
/* .local v21, "value":Ljava/lang/String; */
try { // :try_start_2
/* new-instance v23, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v14 );
/* invoke-direct/range {v23 ..v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v24 = "UTF-8"; // const-string v24, "UTF-8"
/* move-object/from16 v0, v24 */
java.net.URLEncoder .encode ( v10,v0 );
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v24 = "="; // const-string v24, "="
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v24 = "UTF-8"; // const-string v24, "UTF-8"
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, v24 */
java.net.URLEncoder .encode ( v0,v1 );
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v24 = "&"; // const-string v24, "&"
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v23 ..v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* :try_end_2 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 ..:try_end_2} :catch_0 */
/* goto/16 :goto_0 */
/* .line 111 */
/* :catch_0 */
/* move-exception v4 */
/* .line 112 */
/* .local v4, "e":Ljava/io/UnsupportedEncodingException; */
(( java.io.UnsupportedEncodingException ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
/* goto/16 :goto_0 */
/* .line 125 */
} // .end local v4 # "e":Ljava/io/UnsupportedEncodingException;
} // .end local v10 # "key":Ljava/lang/String;
} // .end local v14 # "queryString":Ljava/lang/String;
} // .end local v21 # "value":Ljava/lang/String;
/* .restart local v2 # "body":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* .restart local v8 # "httpRequest":Lorg/apache/http/client/methods/HttpPost; */
/* .restart local v12 # "postPairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;" */
} // :cond_3
/* invoke-interface/range {v23 ..v23}, Ljava/util/Iterator;->next()Ljava/lang/Object; */
/* check-cast v10, Ljava/lang/String; */
/* .line 126 */
/* .restart local v10 # "key":Ljava/lang/String; */
/* new-instance v24, Lorg/apache/http/message/BasicNameValuePair; */
/* check-cast v22, Ljava/lang/String; */
/* move-object/from16 v0, v24 */
/* move-object/from16 v1, v22 */
/* invoke-direct {v0, v10, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* move-object/from16 v0, v24 */
/* goto/16 :goto_1 */
/* .line 130 */
} // .end local v10 # "key":Ljava/lang/String;
/* :catch_1 */
/* move-exception v4 */
/* .line 131 */
/* .restart local v4 # "e":Ljava/io/UnsupportedEncodingException; */
(( java.io.UnsupportedEncodingException ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
/* goto/16 :goto_2 */
/* .line 151 */
} // .end local v4 # "e":Ljava/io/UnsupportedEncodingException;
} // .end local v12 # "postPairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
/* .restart local v3 # "builder":Ljava/lang/StringBuilder; */
/* .restart local v5 # "finalHttpClient":Lorg/apache/http/client/HttpClient; */
/* .restart local v6 # "finalHttpRequest":Lorg/apache/http/client/methods/HttpPost; */
/* .restart local v11 # "line":Ljava/lang/String; */
/* .restart local v15 # "reader":Ljava/io/BufferedReader; */
/* .restart local v17 # "response":Lorg/apache/http/HttpResponse; */
/* .restart local v18 # "status":I */
} // :cond_4
try { // :try_start_3
(( java.lang.StringBuilder ) v3 ).append ( v11 ); // invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v23 = "\n"; // const-string v23, "\n"
/* invoke-virtual/range {v22 ..v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
/* goto/16 :goto_3 */
/* .line 172 */
} // .end local v3 # "builder":Ljava/lang/StringBuilder;
} // .end local v11 # "line":Ljava/lang/String;
} // .end local v15 # "reader":Ljava/io/BufferedReader;
} // .end local v17 # "response":Lorg/apache/http/HttpResponse;
} // .end local v18 # "status":I
/* :catch_2 */
/* move-exception v4 */
/* .line 173 */
/* .local v4, "e":Ljava/lang/Exception; */
final String v22 = "ChartBoost"; // const-string v22, "ChartBoost"
/* new-instance v23, Ljava/lang/StringBuilder; */
final String v24 = "Exception on http request: "; // const-string v24, "Exception on http request: "
/* invoke-direct/range {v23 ..v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v4 ).getLocalizedMessage ( ); // invoke-virtual {v4}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;
/* invoke-virtual/range {v23 ..v24}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v23 ..v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v22 ..v23}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 174 */
int v7 = 0; // const/4 v7, 0x0
/* goto/16 :goto_4 */
/* .line 167 */
} // .end local v4 # "e":Ljava/lang/Exception;
/* .restart local v17 # "response":Lorg/apache/http/HttpResponse; */
/* .restart local v18 # "status":I */
} // :cond_5
try { // :try_start_4
final String v22 = "ChartBoost"; // const-string v22, "ChartBoost"
/* new-instance v23, Ljava/lang/StringBuilder; */
final String v24 = "Request failed: "; // const-string v24, "Request failed: "
/* invoke-direct/range {v23 ..v24}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v23 */
/* move-object/from16 v1, v17 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v23 ..v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v22 ..v23}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I */
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_2 */
/* .line 169 */
int v7 = 0; // const/4 v7, 0x0
/* goto/16 :goto_4 */
} // .end method
public java.lang.String getEndpoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 262 */
v0 = this.endpoint;
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, Lorg/json/JSONObject; */
(( com.chartboost.sdk.CBAPIConnection ) p0 ).onPostExecute ( p1 ); // invoke-virtual {p0, p1}, Lcom/chartboost/sdk/CBAPIConnection;->onPostExecute(Lorg/json/JSONObject;)V
return;
} // .end method
protected void onPostExecute ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .param p1, "json" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 198 */
v1 = this.progressDialog;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 200 */
try { // :try_start_0
v1 = this.progressDialog;
(( android.app.ProgressDialog ) v1 ).dismiss ( ); // invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 207 */
} // :cond_0
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
this.progressDialog = v1;
/* .line 208 */
return;
/* .line 202 */
/* :catch_0 */
/* move-exception v0 */
/* .line 204 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
protected void onPreExecute ( ) {
/* .locals 6 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
/* .line 78 */
/* iget-boolean v0, p0, Lcom/chartboost/sdk/CBAPIConnection;->shouldShowProgress:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 81 */
v0 = this.context;
/* .line 82 */
int v1 = 0; // const/4 v1, 0x0
/* .line 83 */
v2 = this.loadingMessage;
/* .line 86 */
/* new-instance v5, Lcom/chartboost/sdk/CBAPIConnection$1; */
/* invoke-direct {v5, p0}, Lcom/chartboost/sdk/CBAPIConnection$1;-><init>(Lcom/chartboost/sdk/CBAPIConnection;)V */
/* move v4, v3 */
/* .line 80 */
/* invoke-static/range {v0 ..v5}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZLandroid/content/DialogInterface$OnCancelListener;)Landroid/app/ProgressDialog; */
this.progressDialog = v0;
/* .line 94 */
} // :cond_0
return;
} // .end method
public void sendRequest ( ) {
/* .locals 0 */
/* .prologue */
/* .line 241 */
return;
} // .end method
public void setEndpoint ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "endpoint" # Ljava/lang/String; */
/* .prologue */
/* .line 269 */
this.endpoint = p1;
/* .line 270 */
return;
} // .end method
protected void validateJson ( org.json.JSONObject p0 ) {
/* .locals 3 */
/* .param p1, "json" # Lorg/json/JSONObject; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 179 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 180 */
final String v1 = "status"; // const-string v1, "status"
v0 = (( org.json.JSONObject ) p1 ).getInt ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
/* .line 181 */
/* .local v0, "status":I */
/* const/16 v1, 0x12c */
/* if-ge v0, v1, :cond_0 */
/* const/16 v1, 0xc8 */
/* if-lt v0, v1, :cond_0 */
/* .line 183 */
final String v1 = "JSON"; // const-string v1, "JSON"
(( org.json.JSONObject ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 184 */
return;
/* .line 188 */
} // :cond_0
/* new-instance v1, Ljava/io/IOException; */
/* invoke-direct {v1}, Ljava/io/IOException;-><init>()V */
/* throw v1 */
/* .line 191 */
} // .end local v0 # "status":I
} // :cond_1
/* new-instance v1, Ljava/io/IOException; */
/* invoke-direct {v1}, Ljava/io/IOException;-><init>()V */
/* throw v1 */
} // .end method
