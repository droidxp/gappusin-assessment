public class com.adknowledge.superrewards.web.SRRequest {
	 /* .source "SRRequest.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/adknowledge/superrewards/web/SRRequest$Call;, */
	 /* Lcom/adknowledge/superrewards/web/SRRequest$Command; */
	 /* } */
} // .end annotation
/* # static fields */
public static org.apache.http.client.methods.HttpPost finalRequest;
/* # instance fields */
private java.lang.String call;
private java.lang.String command;
protected org.apache.http.client.methods.HttpGet getRequest;
protected org.apache.http.impl.client.DefaultHttpClient httpClient;
public java.util.HashMap innerparams;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
protected java.lang.String method;
protected java.util.List params;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/http/NameValuePair;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
protected org.apache.http.client.methods.HttpPost postRequest;
protected org.apache.http.HttpResponse response;
protected java.lang.String result;
protected java.io.InputStream streamresult;
protected java.lang.String type;
private java.lang.String uid;
protected java.lang.String url;
/* # direct methods */
public com.adknowledge.superrewards.web.SRRequest ( ) {
/* .locals 2 */
/* .param p1, "client" # Lorg/apache/http/impl/client/DefaultHttpClient; */
/* .prologue */
/* .line 56 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 36 */
final String v0 = "http://super.kitnmedia.com/mobile/rpc"; // const-string v0, "http://super.kitnmedia.com/mobile/rpc"
this.url = v0;
/* .line 39 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.innerparams = v0;
/* .line 45 */
final String v0 = "none"; // const-string v0, "none"
this.type = v0;
/* .line 49 */
final String v0 = ""; // const-string v0, ""
this.uid = v0;
/* .line 57 */
this.httpClient = p1;
/* .line 58 */
/* new-instance v0, Ljava/util/ArrayList; */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
this.params = v0;
/* .line 59 */
return;
} // .end method
/* # virtual methods */
public void addInnerParam ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 96 */
v0 = this.innerparams;
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 97 */
return;
} // .end method
public void addParam ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 88 */
v0 = this.params;
/* new-instance v1, Lorg/apache/http/message/BasicNameValuePair; */
/* invoke-direct {v1, p1, p2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 89 */
return;
} // .end method
public Boolean execute ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 10 */
/* .param p1, "ctx" # Landroid/content/Context; */
/* .param p2, "h" # Ljava/lang/String; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 186 */
try { // :try_start_0
final String v7 = "json"; // const-string v7, "json"
(( com.adknowledge.superrewards.web.SRRequest ) p0 ).toJSON ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/adknowledge/superrewards/web/SRRequest;->toJSON(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
(( com.adknowledge.superrewards.web.SRRequest ) p0 ).addParam ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/adknowledge/superrewards/web/SRRequest;->addParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 187 */
/* new-instance v7, Lorg/apache/http/client/methods/HttpPost; */
(( com.adknowledge.superrewards.web.SRRequest ) p0 ).getUrl ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/web/SRRequest;->getUrl()Ljava/lang/String;
/* invoke-direct {v7, v8}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
this.postRequest = v7;
/* .line 188 */
v7 = this.postRequest;
/* new-instance v8, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
v9 = this.params;
/* invoke-direct {v8, v9}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V */
(( org.apache.http.client.methods.HttpPost ) v7 ).setEntity ( v8 ); // invoke-virtual {v7, v8}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* .line 189 */
v7 = this.httpClient;
v8 = this.postRequest;
(( org.apache.http.impl.client.DefaultHttpClient ) v7 ).execute ( v8 ); // invoke-virtual {v7, v8}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
this.response = v7;
/* .line 190 */
v7 = this.response;
/* .line 191 */
/* .local v2, "entity":Lorg/apache/http/HttpEntity; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 192 */
/* new-instance v0, Lorg/apache/http/entity/BufferedHttpEntity; */
/* invoke-direct {v0, v2}, Lorg/apache/http/entity/BufferedHttpEntity;-><init>(Lorg/apache/http/HttpEntity;)V */
/* .line 193 */
/* .local v0, "buf":Lorg/apache/http/entity/BufferedHttpEntity; */
(( org.apache.http.entity.BufferedHttpEntity ) v0 ).getContent ( ); // invoke-virtual {v0}, Lorg/apache/http/entity/BufferedHttpEntity;->getContent()Ljava/io/InputStream;
/* .line 195 */
/* .local v3, "inputstream":Ljava/io/InputStream; */
com.adknowledge.superrewards.Utils .inputStreamToString ( v3 );
/* .line 196 */
/* .local v5, "temp":Ljava/lang/String; */
/* new-instance v4, Lorg/json/JSONObject; */
/* invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 197 */
/* .local v4, "json":Lorg/json/JSONObject; */
final String v7 = "response"; // const-string v7, "response"
(( org.json.JSONObject ) v4 ).getString ( v7 ); // invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.result = v7;
/* :try_end_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_3 */
/* .line 211 */
} // .end local v0 # "buf":Lorg/apache/http/entity/BufferedHttpEntity;
} // .end local v3 # "inputstream":Ljava/io/InputStream;
} // .end local v4 # "json":Lorg/json/JSONObject;
} // .end local v5 # "temp":Ljava/lang/String;
} // :cond_0
int v6 = 1; // const/4 v6, 0x1
} // .end local v2 # "entity":Lorg/apache/http/HttpEntity;
} // :goto_0
/* .line 199 */
/* :catch_0 */
/* move-exception v1 */
/* .line 200 */
/* .local v1, "e":Lorg/apache/http/client/ClientProtocolException; */
/* .line 202 */
} // .end local v1 # "e":Lorg/apache/http/client/ClientProtocolException;
/* :catch_1 */
/* move-exception v1 */
/* .line 203 */
/* .local v1, "e":Ljava/io/IOException; */
/* .line 205 */
} // .end local v1 # "e":Ljava/io/IOException;
/* :catch_2 */
/* move-exception v1 */
/* .line 206 */
/* .local v1, "e":Lorg/json/JSONException; */
/* .line 208 */
} // .end local v1 # "e":Lorg/json/JSONException;
/* :catch_3 */
/* move-exception v1 */
/* .line 209 */
/* .local v1, "e":Ljava/lang/Exception; */
} // .end method
public java.lang.Void executeToStream ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 10 */
/* .param p1, "ctx" # Landroid/content/Context; */
/* .param p2, "h" # Ljava/lang/String; */
/* .prologue */
/* const/16 v9, 0x7d0 */
/* .line 216 */
try { // :try_start_0
(( com.adknowledge.superrewards.web.SRRequest ) p0 ).toJSON ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/adknowledge/superrewards/web/SRRequest;->toJSON(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
/* .line 217 */
/* .local v4, "json":Ljava/lang/String; */
/* new-instance v5, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v5}, Lorg/apache/http/client/methods/HttpGet;-><init>()V */
this.getRequest = v5;
/* .line 218 */
v5 = this.getRequest;
/* new-instance v6, Ljava/net/URI; */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
v8 = this.url;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = "?json="; // const-string v8, "?json="
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v6, v7}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpGet ) v5 ).setURI ( v6 ); // invoke-virtual {v5, v6}, Lorg/apache/http/client/methods/HttpGet;->setURI(Ljava/net/URI;)V
/* .line 220 */
v5 = this.response;
/* .line 221 */
/* .local v2, "entity":Lorg/apache/http/HttpEntity; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 222 */
/* new-instance v0, Lorg/apache/http/entity/BufferedHttpEntity; */
/* invoke-direct {v0, v2}, Lorg/apache/http/entity/BufferedHttpEntity;-><init>(Lorg/apache/http/HttpEntity;)V */
/* .line 223 */
/* .local v0, "buf":Lorg/apache/http/entity/BufferedHttpEntity; */
(( org.apache.http.entity.BufferedHttpEntity ) v0 ).getContent ( ); // invoke-virtual {v0}, Lorg/apache/http/entity/BufferedHttpEntity;->getContent()Ljava/io/InputStream;
/* .line 224 */
/* .local v3, "inputstream":Ljava/io/InputStream; */
this.streamresult = v3;
/* :try_end_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/net/URISyntaxException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 233 */
} // .end local v0 # "buf":Lorg/apache/http/entity/BufferedHttpEntity;
} // .end local v2 # "entity":Lorg/apache/http/HttpEntity;
} // .end local v3 # "inputstream":Ljava/io/InputStream;
} // .end local v4 # "json":Ljava/lang/String;
} // :cond_0
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
/* .line 226 */
/* :catch_0 */
/* move-exception v1 */
/* .line 227 */
/* .local v1, "e":Lorg/apache/http/client/ClientProtocolException; */
final String v5 = "There was a communication problem.Please try again later."; // const-string v5, "There was a communication problem.Please try again later."
android.widget.Toast .makeText ( p1,v5,v9 );
(( android.widget.Toast ) v5 ).show ( ); // invoke-virtual {v5}, Landroid/widget/Toast;->show()V
/* .line 228 */
} // .end local v1 # "e":Lorg/apache/http/client/ClientProtocolException;
/* :catch_1 */
/* move-exception v1 */
/* .line 229 */
/* .local v1, "e":Ljava/io/IOException; */
final String v5 = "There was a communication problem.Please try again later."; // const-string v5, "There was a communication problem.Please try again later."
android.widget.Toast .makeText ( p1,v5,v9 );
(( android.widget.Toast ) v5 ).show ( ); // invoke-virtual {v5}, Landroid/widget/Toast;->show()V
/* .line 230 */
} // .end local v1 # "e":Ljava/io/IOException;
/* :catch_2 */
/* move-exception v1 */
/* .line 231 */
/* .local v1, "e":Ljava/net/URISyntaxException; */
final String v5 = "There was a communication problem.Please try again later."; // const-string v5, "There was a communication problem.Please try again later."
android.widget.Toast .makeText ( p1,v5,v9 );
(( android.widget.Toast ) v5 ).show ( ); // invoke-virtual {v5}, Landroid/widget/Toast;->show()V
} // .end method
public java.lang.String getMethod ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
v0 = this.method;
} // .end method
public java.lang.String getResult ( ) {
/* .locals 1 */
/* .prologue */
/* .line 116 */
v0 = this.result;
} // .end method
public java.io.InputStream getStream ( ) {
/* .locals 1 */
/* .prologue */
/* .line 120 */
v0 = this.streamresult;
} // .end method
public java.lang.String getType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 108 */
v0 = this.type;
} // .end method
public java.lang.String getUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 64 */
v0 = this.url;
} // .end method
public java.lang.String getUrlWithJson ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p1, "ctx" # Landroid/content/Context; */
/* .param p2, "h" # Ljava/lang/String; */
/* .prologue */
/* .line 237 */
(( com.adknowledge.superrewards.web.SRRequest ) p0 ).toJSON ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/adknowledge/superrewards/web/SRRequest;->toJSON(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
/* .line 238 */
/* .local v0, "json":Ljava/lang/String; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
v3 = this.url;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "?json="; // const-string v3, "?json="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.net.URLEncoder .encode ( v0 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 239 */
/* .local v1, "uri":Ljava/lang/String; */
} // .end method
public void setCall ( com.adknowledge.superrewards.web.SRRequest$Call p0 ) {
/* .locals 1 */
/* .param p1, "call" # Lcom/adknowledge/superrewards/web/SRRequest$Call; */
/* .prologue */
/* .line 75 */
(( com.adknowledge.superrewards.web.SRRequest$Call ) p1 ).toString ( ); // invoke-virtual {p1}, Lcom/adknowledge/superrewards/web/SRRequest$Call;->toString()Ljava/lang/String;
(( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
this.call = v0;
/* .line 76 */
return;
} // .end method
public void setCommand ( com.adknowledge.superrewards.web.SRRequest$Command p0 ) {
/* .locals 1 */
/* .param p1, "command" # Lcom/adknowledge/superrewards/web/SRRequest$Command; */
/* .prologue */
/* .line 71 */
(( com.adknowledge.superrewards.web.SRRequest$Command ) p1 ).toString ( ); // invoke-virtual {p1}, Lcom/adknowledge/superrewards/web/SRRequest$Command;->toString()Ljava/lang/String;
(( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
this.command = v0;
/* .line 72 */
return;
} // .end method
public void setMap ( java.util.HashMap p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 104 */
/* .local p1, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;" */
this.innerparams = p1;
/* .line 105 */
return;
} // .end method
public void setMethod ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "method" # Ljava/lang/String; */
/* .prologue */
/* .line 67 */
this.method = p1;
/* .line 68 */
return;
} // .end method
public void setType ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "type" # Ljava/lang/String; */
/* .prologue */
/* .line 100 */
this.type = p1;
/* .line 101 */
return;
} // .end method
public void setUid ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "uid" # Ljava/lang/String; */
/* .prologue */
/* .line 92 */
this.uid = p1;
/* .line 93 */
return;
} // .end method
public void setUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 61 */
this.url = p1;
/* .line 62 */
return;
} // .end method
public java.lang.String toJSON ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 16 */
/* .param p1, "ctx" # Landroid/content/Context; */
/* .param p2, "h" # Ljava/lang/String; */
/* .prologue */
/* .line 130 */
/* new-instance v7, Lorg/json/JSONObject; */
/* invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V */
/* .line 131 */
/* .local v7, "outer":Lorg/json/JSONObject; */
/* new-instance v4, Lorg/json/JSONObject; */
/* invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V */
/* .line 132 */
/* .local v4, "inner":Lorg/json/JSONObject; */
/* new-instance v3, Lorg/json/JSONObject; */
/* invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V */
/* .line 133 */
/* .local v3, "geo":Lorg/json/JSONObject; */
/* new-instance v10, Lorg/json/JSONObject; */
/* invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V */
/* .line 134 */
/* .local v10, "parameters":Lorg/json/JSONObject; */
/* new-instance v1, Lorg/json/JSONObject; */
/* invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V */
/* .line 138 */
/* .local v1, "device":Lorg/json/JSONObject; */
try { // :try_start_0
v13 = com.adknowledge.superrewards.web.SRRequest$Command.PARAMS;
(( com.adknowledge.superrewards.web.SRRequest$Command ) v13 ).toString ( ); // invoke-virtual {v13}, Lcom/adknowledge/superrewards/web/SRRequest$Command;->toString()Ljava/lang/String;
(( java.lang.String ) v13 ).toLowerCase ( ); // invoke-virtual {v13}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( org.json.JSONObject ) v7 ).put ( v13, v4 ); // invoke-virtual {v7, v13, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 139 */
v13 = com.adknowledge.superrewards.web.SRRequest$Command.GEO;
(( com.adknowledge.superrewards.web.SRRequest$Command ) v13 ).toString ( ); // invoke-virtual {v13}, Lcom/adknowledge/superrewards/web/SRRequest$Command;->toString()Ljava/lang/String;
(( java.lang.String ) v13 ).toLowerCase ( ); // invoke-virtual {v13}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( org.json.JSONObject ) v4 ).put ( v13, v3 ); // invoke-virtual {v4, v13, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 140 */
v13 = com.adknowledge.superrewards.web.SRRequest$Command.DEVICE;
(( com.adknowledge.superrewards.web.SRRequest$Command ) v13 ).toString ( ); // invoke-virtual {v13}, Lcom/adknowledge/superrewards/web/SRRequest$Command;->toString()Ljava/lang/String;
(( java.lang.String ) v13 ).toLowerCase ( ); // invoke-virtual {v13}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( org.json.JSONObject ) v4 ).put ( v13, v1 ); // invoke-virtual {v4, v13, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 141 */
/* move-object/from16 v0, p0 */
v13 = this.call;
(( org.json.JSONObject ) v4 ).put ( v13, v10 ); // invoke-virtual {v4, v13, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 142 */
final String v13 = "h"; // const-string v13, "h"
/* move-object/from16 v0, p2 */
(( org.json.JSONObject ) v4 ).put ( v13, v0 ); // invoke-virtual {v4, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 143 */
final String v13 = "SR"; // const-string v13, "SR"
/* new-instance v14, Ljava/lang/StringBuilder; */
/* invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V */
final String v15 = "Inserted h param "; // const-string v15, "Inserted h param "
(( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p2 */
(( java.lang.StringBuilder ) v14 ).append ( v0 ); // invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v13,v14 );
/* .line 146 */
v13 = com.adknowledge.superrewards.web.SRClient.uid;
if ( v13 != null) { // if-eqz v13, :cond_4
/* .line 147 */
final String v13 = "uid"; // const-string v13, "uid"
v14 = com.adknowledge.superrewards.web.SRClient.uid;
(( org.json.JSONObject ) v4 ).put ( v13, v14 ); // invoke-virtual {v4, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 152 */
} // :cond_0
} // :goto_0
/* invoke-static/range {p1 ..p2}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
/* .line 154 */
/* .local v12, "tracker":Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
v11 = com.adknowledge.superrewards.tracking.SRAppInstallTracker.map;
/* .line 156 */
v13 = /* .local v11, "params":Ljava/util/Map;, "Ljava/util/Map<**>;" */
/* if-lez v13, :cond_5 */
/* .line 157 */
/* .line 158 */
/* .local v5, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
} // :cond_1
v13 = } // :goto_1
if ( v13 != null) { // if-eqz v13, :cond_5
/* .line 159 */
/* check-cast v8, Ljava/util/Map$Entry; */
/* .line 160 */
/* .local v8, "pairs":Ljava/util/Map$Entry; */
(( java.lang.Object ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;
final String v14 = "ip"; // const-string v14, "ip"
v13 = (( java.lang.String ) v13 ).equals ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v13 != null) { // if-eqz v13, :cond_2
final String v13 = "ip"; // const-string v13, "ip"
(( java.lang.Object ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( org.json.JSONObject ) v3 ).put ( v13, v14 ); // invoke-virtual {v3, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 161 */
} // :cond_2
(( java.lang.Object ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;
final String v14 = "cc"; // const-string v14, "cc"
v13 = (( java.lang.String ) v13 ).equals ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v13 != null) { // if-eqz v13, :cond_3
final String v13 = "cc"; // const-string v13, "cc"
(( java.lang.Object ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( org.json.JSONObject ) v3 ).put ( v13, v14 ); // invoke-virtual {v3, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 162 */
} // :cond_3
/* check-cast v13, Ljava/lang/String; */
/* check-cast v14, Ljava/lang/String; */
(( org.json.JSONObject ) v1 ).put ( v13, v14 ); // invoke-virtual {v1, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 163 */
/* move-object/from16 v0, p0 */
v13 = this.call;
v14 = com.adknowledge.superrewards.web.SRRequest$Call.INSTALL;
(( com.adknowledge.superrewards.web.SRRequest$Call ) v14 ).toString ( ); // invoke-virtual {v14}, Lcom/adknowledge/superrewards/web/SRRequest$Call;->toString()Ljava/lang/String;
v13 = (( java.lang.String ) v13 ).equalsIgnoreCase ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v13 != null) { // if-eqz v13, :cond_1
/* .line 164 */
/* check-cast v13, Ljava/lang/String; */
/* check-cast v14, Ljava/lang/String; */
(( org.json.JSONObject ) v10 ).put ( v13, v14 ); // invoke-virtual {v10, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 178 */
} // .end local v5 # "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
} // .end local v8 # "pairs":Ljava/util/Map$Entry;
} // .end local v11 # "params":Ljava/util/Map;, "Ljava/util/Map<**>;"
} // .end local v12 # "tracker":Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;
/* :catch_0 */
/* move-exception v2 */
/* .line 179 */
/* .local v2, "e":Lorg/json/JSONException; */
final String v13 = "There was a communication problem.Please try again later."; // const-string v13, "There was a communication problem.Please try again later."
/* const/16 v14, 0x7d0 */
/* move-object/from16 v0, p1 */
android.widget.Toast .makeText ( v0,v13,v14 );
(( android.widget.Toast ) v13 ).show ( ); // invoke-virtual {v13}, Landroid/widget/Toast;->show()V
/* .line 181 */
} // .end local v2 # "e":Lorg/json/JSONException;
} // :goto_2
(( org.json.JSONObject ) v7 ).toString ( ); // invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
/* .line 148 */
} // :cond_4
try { // :try_start_1
/* move-object/from16 v0, p0 */
v13 = this.uid;
final String v14 = ""; // const-string v14, ""
v13 = (( java.lang.String ) v13 ).equals ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v13, :cond_0 */
/* .line 149 */
final String v13 = "uid"; // const-string v13, "uid"
/* move-object/from16 v0, p0 */
v14 = this.uid;
(( org.json.JSONObject ) v4 ).put ( v13, v14 ); // invoke-virtual {v4, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* goto/16 :goto_0 */
/* .line 168 */
/* .restart local v11 # "params":Ljava/util/Map;, "Ljava/util/Map<**>;" */
/* .restart local v12 # "tracker":Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
} // :cond_5
(( org.json.JSONObject ) v10 ).names ( ); // invoke-virtual {v10}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;
/* if-nez v13, :cond_6 */
/* .line 169 */
/* move-object/from16 v0, p0 */
v13 = this.innerparams;
(( java.util.HashMap ) v13 ).entrySet ( ); // invoke-virtual {v13}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .line 170 */
/* .local v6, "iterator2":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
v13 = } // :goto_3
if ( v13 != null) { // if-eqz v13, :cond_6
/* .line 171 */
/* check-cast v9, Ljava/util/Map$Entry; */
/* .line 172 */
/* .local v9, "pairs2":Ljava/util/Map$Entry; */
/* check-cast v13, Ljava/lang/String; */
/* check-cast v14, Ljava/lang/String; */
(( org.json.JSONObject ) v10 ).put ( v13, v14 ); // invoke-virtual {v10, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 176 */
} // .end local v6 # "iterator2":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
} // .end local v9 # "pairs2":Ljava/util/Map$Entry;
} // :cond_6
/* move-object/from16 v0, p0 */
v13 = this.command;
/* move-object/from16 v0, p0 */
v14 = this.call;
(( org.json.JSONObject ) v7 ).put ( v13, v14 ); // invoke-virtual {v7, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
