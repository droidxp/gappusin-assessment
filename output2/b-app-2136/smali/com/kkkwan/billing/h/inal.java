public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static java.lang.String a ( java.lang.String p0, java.util.Map p1 ) {
		 /* .locals 7 */
		 /* const/16 v4, 0x1388 */
		 final String v0 = "++++++++++++ send request ++++++++++++++"; // const-string v0, "++++++++++++ send request ++++++++++++++"
		 com.kkkwan.billing.h.f .a ( v0 );
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "url:"; // const-string v1, "url:"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v0 );
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "param:"; // const-string v1, "param:"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v0 );
		 final String v0 = "++++++++++++++++++++++++++++++++++++++"; // const-string v0, "++++++++++++++++++++++++++++++++++++++"
		 com.kkkwan.billing.h.f .a ( v0 );
		 /* new-instance v2, Lorg/apache/http/client/methods/HttpPost; */
		 /* invoke-direct {v2, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
		 (( org.apache.http.client.methods.HttpPost ) v2 ).getParams ( ); // invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;
		 final String v1 = "http.connection.timeout"; // const-string v1, "http.connection.timeout"
		 java.lang.Integer .valueOf ( v4 );
		 (( org.apache.http.client.methods.HttpPost ) v2 ).getParams ( ); // invoke-virtual {v2}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;
		 final String v1 = "http.socket.timeout"; // const-string v1, "http.socket.timeout"
		 java.lang.Integer .valueOf ( v4 );
		 /* new-instance v3, Ljava/util/ArrayList; */
		 /* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
			 v0 = 		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* if-lez v0, :cond_0 */
		 v0 = 		 } // :goto_0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* check-cast v0, Ljava/util/Map$Entry; */
			 /* new-instance v5, Lorg/apache/http/message/BasicNameValuePair; */
			 /* check-cast v1, Ljava/lang/String; */
			 /* new-instance v6, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v5, v1, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 } // :cond_0
		 /* new-instance v0, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
		 final String v1 = "UTF-8"; // const-string v1, "UTF-8"
		 /* invoke-direct {v0, v3, v1}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
		 (( org.apache.http.client.methods.HttpPost ) v2 ).setEntity ( v0 ); // invoke-virtual {v2, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
		 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
		 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
		 v1 = 		 (( org.apache.http.impl.client.DefaultHttpClient ) v0 ).execute ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "code"; // const-string v3, "code"
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v1 );
		 final String v1 = "UTF-8"; // const-string v1, "UTF-8"
		 org.apache.http.util.EntityUtils .toString ( v0,v1 );
		 final String v1 = "--------------http respnose------------------"; // const-string v1, "--------------http respnose------------------"
		 com.kkkwan.billing.h.f .a ( v1 );
		 com.kkkwan.billing.h.f .a ( v0 );
		 final String v1 = "---------------------------------------------"; // const-string v1, "---------------------------------------------"
		 com.kkkwan.billing.h.f .a ( v1 );
	 } // .end method
	 private static org.json.JSONObject a ( java.util.List p0, java.lang.String p1 ) {
		 /* .locals 6 */
		 /* const/16 v5, 0x2710 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* move v1, v0 */
	 v0 = 	 } // :goto_0
	 /* if-ge v1, v0, :cond_0 */
	 final String v2 = "NetTool"; // const-string v2, "NetTool"
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 final String v0 = "sentData: "; // const-string v0, "sentData: "
	 /* invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* check-cast v0, Lorg/apache/http/NameValuePair; */
	 (( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.kkkwan.billing.h.f .a ( v2,v0 );
	 /* add-int/lit8 v0, v1, 0x1 */
	 /* move v1, v0 */
} // :cond_0
final String v0 = "NetTool"; // const-string v0, "NetTool"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "url = "; // const-string v2, "url = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v0,v1 );
/* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* new-instance v1, Lorg/apache/http/client/methods/HttpPost; */
/* invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
final String v3 = "http.connection.timeout"; // const-string v3, "http.connection.timeout"
java.lang.Integer .valueOf ( v5 );
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
final String v3 = "http.socket.timeout"; // const-string v3, "http.socket.timeout"
java.lang.Integer .valueOf ( v5 );
/* new-instance v2, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
/* invoke-direct {v2, p0, v3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpPost ) v1 ).setEntity ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
v2 = (( org.apache.http.impl.client.DefaultHttpClient ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
final String v0 = "NetTool"; // const-string v0, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "httpStatusCode = "; // const-string v4, "httpStatusCode = "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v0,v3 );
int v0 = 0; // const/4 v0, 0x0
/* packed-switch v2, :pswitch_data_0 */
} // :goto_1
/* :pswitch_0 */
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
org.apache.http.util.EntityUtils .toString ( v0,v1 );
final String v0 = "NetTool"; // const-string v0, "NetTool"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "result ="; // const-string v3, "result ="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v0,v2 );
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* :pswitch_data_0 */
/* .packed-switch 0xc8 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
private static Boolean a ( android.content.Context p0 ) {
/* .locals 5 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v3 = "\u6253\u5f00\u79fb\u7f51"; // const-string v3, "\u6253\u5f00\u79fb\u7f51"
com.kkkwan.billing.h.f .a ( v0,v3 );
final String v0 = "1"; // const-string v0, "1"
com.kkkwan.billing.c.e .a ( p0 );
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "1"; // const-string v0, "1"
com.kkkwan.billing.c.e .a ( p0 );
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/kkkwan/billing/c/d; */
/* invoke-direct {v0}, Lcom/kkkwan/billing/c/d;-><init>()V */
(( com.kkkwan.billing.c.d ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/kkkwan/billing/c/d;->a(Landroid/content/Context;)V
} // :cond_0
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v3 = "\u6253\u5f00wifi"; // const-string v3, "\u6253\u5f00wifi"
com.kkkwan.billing.h.f .a ( v0,v3 );
final String v0 = "wifi"; // const-string v0, "wifi"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/wifi/WifiManager; */
final String v3 = "0"; // const-string v3, "0"
com.kkkwan.billing.c.e .a ( p0 );
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
(( android.net.wifi.WifiManager ) v0 ).setWifiEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/net/wifi/WifiManager;->setWifiEnabled(Z)Z
} // :cond_1
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v3 = "\u8f6e\u5faa\u7b49\u5f85"; // const-string v3, "\u8f6e\u5faa\u7b49\u5f85"
com.kkkwan.billing.h.f .a ( v0,v3 );
/* move v0, v1 */
} // :goto_0
final String v3 = "0"; // const-string v3, "0"
com.kkkwan.billing.c.e .a ( p0 );
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* add-int/lit8 v0, v0, 0x1 */
/* const/16 v3, 0x14 */
/* if-eq v0, v3, :cond_2 */
/* const-wide/16 v3, 0x3e8 */
try { // :try_start_0
java.lang.Thread .sleep ( v3,v4 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v3 */
(( java.lang.InterruptedException ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v3 );
} // :cond_2
final String v0 = "0"; // const-string v0, "0"
com.kkkwan.billing.c.e .a ( p0 );
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v2 = "\u7f51\u7edc\u6253\u4e0d\u5f00!"; // const-string v2, "\u7f51\u7edc\u6253\u4e0d\u5f00!"
com.kkkwan.billing.h.f .a ( v0,v2 );
} // :goto_1
} // :cond_3
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v1 = "\u7f51\u7edc\u5df2\u6253\u5f00!"; // const-string v1, "\u7f51\u7edc\u5df2\u6253\u5f00!"
com.kkkwan.billing.h.f .a ( v0,v1 );
/* move v1, v2 */
} // .end method
private static Boolean b ( android.content.Context p0 ) {
/* .locals 5 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v3 = "\u6253\u5f00wifi"; // const-string v3, "\u6253\u5f00wifi"
com.kkkwan.billing.h.f .a ( v0,v3 );
final String v0 = "wifi"; // const-string v0, "wifi"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/wifi/WifiManager; */
final String v3 = "0"; // const-string v3, "0"
com.kkkwan.billing.c.e .a ( p0 );
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
(( android.net.wifi.WifiManager ) v0 ).setWifiEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/net/wifi/WifiManager;->setWifiEnabled(Z)Z
} // :cond_0
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v3 = "\u8f6e\u5faa\u7b49\u5f85\u6253\u5f00wif"; // const-string v3, "\u8f6e\u5faa\u7b49\u5f85\u6253\u5f00wif"
com.kkkwan.billing.h.f .a ( v0,v3 );
/* move v0, v1 */
} // :goto_0
final String v3 = "0"; // const-string v3, "0"
com.kkkwan.billing.c.e .a ( p0 );
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* add-int/lit8 v0, v0, 0x1 */
/* const/16 v3, 0x14 */
/* if-eq v0, v3, :cond_1 */
/* const-wide/16 v3, 0x3e8 */
try { // :try_start_0
java.lang.Thread .sleep ( v3,v4 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v3 */
(( java.lang.InterruptedException ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v3 );
} // :cond_1
final String v0 = "0"; // const-string v0, "0"
com.kkkwan.billing.c.e .a ( p0 );
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v2 = "wifi\u7f51\u7edc\u6253\u4e0d\u5f00!"; // const-string v2, "wifi\u7f51\u7edc\u6253\u4e0d\u5f00!"
com.kkkwan.billing.h.f .a ( v0,v2 );
} // :goto_1
} // :cond_2
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v1 = "wifi\u7f51\u7edc\u5df2\u6253\u5f00!"; // const-string v1, "wifi\u7f51\u7edc\u5df2\u6253\u5f00!"
com.kkkwan.billing.h.f .a ( v0,v1 );
/* move v1, v2 */
} // .end method
private static Boolean c ( android.content.Context p0 ) {
/* .locals 5 */
int v2 = 0; // const/4 v2, 0x0
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v1 = "\u5173\u95edwifi"; // const-string v1, "\u5173\u95edwifi"
com.kkkwan.billing.h.f .a ( v0,v1 );
final String v0 = "wifi"; // const-string v0, "wifi"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/wifi/WifiManager; */
v1 = (( android.net.wifi.WifiManager ) v0 ).isWifiEnabled ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = java.lang.System.out;
final String v3 = "into wifi enable"; // const-string v3, "into wifi enable"
(( java.io.PrintStream ) v1 ).println ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
(( android.net.wifi.WifiManager ) v0 ).setWifiEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/net/wifi/WifiManager;->setWifiEnabled(Z)Z
} // :cond_0
/* move v1, v2 */
} // :goto_0
v3 = (( android.net.wifi.WifiManager ) v0 ).isWifiEnabled ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* add-int/lit8 v1, v1, 0x1 */
int v3 = 5; // const/4 v3, 0x5
/* if-eq v1, v3, :cond_1 */
/* const-wide/16 v3, 0x3e8 */
try { // :try_start_0
java.lang.Thread .sleep ( v3,v4 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v3 */
(( java.lang.InterruptedException ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v3 );
} // :cond_1
final String v0 = "1"; // const-string v0, "1"
com.kkkwan.billing.c.e .a ( p0 );
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
final String v0 = "2"; // const-string v0, "2"
com.kkkwan.billing.c.e .a ( p0 );
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v1 = "\u5f00\u542f\u79fb\u52a8\u7f51\u7edc"; // const-string v1, "\u5f00\u542f\u79fb\u52a8\u7f51\u7edc"
com.kkkwan.billing.h.f .a ( v0,v1 );
/* new-instance v0, Lcom/kkkwan/billing/c/d; */
/* invoke-direct {v0}, Lcom/kkkwan/billing/c/d;-><init>()V */
(( com.kkkwan.billing.c.d ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/kkkwan/billing/c/d;->a(Landroid/content/Context;)V
/* move v0, v2 */
} // :goto_1
final String v1 = "0"; // const-string v1, "0"
com.kkkwan.billing.c.e .a ( p0 );
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* add-int/lit8 v0, v0, 0x1 */
/* const/16 v1, 0x14 */
/* if-eq v0, v1, :cond_2 */
/* const-wide/16 v3, 0x3e8 */
try { // :try_start_1
java.lang.Thread .sleep ( v3,v4 );
/* :try_end_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v1 */
(( java.lang.InterruptedException ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1 );
} // :cond_2
final String v0 = "1"; // const-string v0, "1"
com.kkkwan.billing.c.e .a ( p0 );
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_3 */
final String v0 = "2"; // const-string v0, "2"
com.kkkwan.billing.c.e .a ( p0 );
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_3 */
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v1 = "\u4e0d\u80fd\u6253\u5f002G\uff0c3G"; // const-string v1, "\u4e0d\u80fd\u6253\u5f002G\uff0c3G"
com.kkkwan.billing.h.f .a ( v0,v1 );
} // :goto_2
} // :cond_3
final String v0 = "NetTool"; // const-string v0, "NetTool"
final String v1 = "\u5df2\u5173\u95edWIFI,\u6253\u5f002G\uff0c3G"; // const-string v1, "\u5df2\u5173\u95edWIFI,\u6253\u5f002G\uff0c3G"
com.kkkwan.billing.h.f .a ( v0,v1 );
int v2 = 1; // const/4 v2, 0x1
} // .end method
/* # virtual methods */
public final java.lang.String a ( android.content.Context p0, java.lang.String p1, java.util.Map p2, android.os.Handler p3 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
final String v1 = "NetTool"; // const-string v1, "NetTool"
final String v2 = "\u7b2c\u4e00\u6b21\uff0c\u76f4\u63a5\u53bb\u8bbf\u95ee"; // const-string v2, "\u7b2c\u4e00\u6b21\uff0c\u76f4\u63a5\u53bb\u8bbf\u95ee"
com.kkkwan.billing.h.f .a ( v1,v2 );
com.kkkwan.billing.h.d .a ( p2,p3 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v1 */
try { // :try_start_1
final String v1 = "NetTool"; // const-string v1, "NetTool"
final String v2 = "\u7b2c\u4e8c\u6b21\u3002\u7f51\u7edc\u4e0d\u901a\uff0c\u6253\u5f00wifi"; // const-string v2, "\u7b2c\u4e8c\u6b21\u3002\u7f51\u7edc\u4e0d\u901a\uff0c\u6253\u5f00wifi"
com.kkkwan.billing.h.f .a ( v1,v2 );
com.kkkwan.billing.h.d .b ( p1 );
com.kkkwan.billing.h.d .a ( p2,p3 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v1 */
try { // :try_start_2
final String v1 = "NetTool"; // const-string v1, "NetTool"
final String v2 = "\u7b2c\u4e09\u6b21\u3002wifi\u4e0d\u53ef\u4ee5\u7528\uff0c\u5173wifi\uff0c\u6253\u5f002g\uff0c3g"; // const-string v2, "\u7b2c\u4e09\u6b21\u3002wifi\u4e0d\u53ef\u4ee5\u7528\uff0c\u5173wifi\uff0c\u6253\u5f002g\uff0c3g"
com.kkkwan.billing.h.f .a ( v1,v2 );
com.kkkwan.billing.h.d .c ( p1 );
com.kkkwan.billing.h.d .a ( p2,p3 );
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
/* move-exception v1 */
/* instance-of v2, v1, Ljava/lang/IllegalStateException; */
if ( v2 != null) { // if-eqz v2, :cond_0
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_0
final String v1 = "\u6ca1\u6709\u627e\u5230\u53ef\u4ee5\u7684\u7f51\u7edc"; // const-string v1, "\u6ca1\u6709\u627e\u5230\u53ef\u4ee5\u7684\u7f51\u7edc"
com.kkkwan.billing.h.f .a ( v1 );
} // .end method
public final org.json.JSONObject a ( java.util.List p0, java.lang.String p1, android.content.Context p2, Boolean p3, Boolean p4 ) {
/* .locals 5 */
int v1 = 0; // const/4 v1, 0x0
int v0 = 0; // const/4 v0, 0x0
/* move v2, v0 */
/* move-object v0, v1 */
} // :goto_0
int v1 = 7; // const/4 v1, 0x7
/* if-ge v2, v1, :cond_1 */
/* if-nez v2, :cond_4 */
if ( p4 != null) { // if-eqz p4, :cond_2
try { // :try_start_0
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
} // :cond_0
} // :goto_1
final String v1 = "code"; // const-string v1, "code"
com.kkkwan.billing.h.e .a ( v0,v1 );
final String v3 = "0"; // const-string v3, "0"
v1 = (( java.lang.String ) v3 ).equals ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_16
final String v1 = "NetTool"; // const-string v1, "NetTool"
final String v3 = "\u8bbf\u95ee\u6210\u529f!"; // const-string v3, "\u8bbf\u95ee\u6210\u529f!"
com.kkkwan.billing.h.f .a ( v1,v3 );
} // :cond_1
} // :cond_2
v1 = com.kkkwan.billing.h.d .a ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_3
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
} // :cond_3
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="; // const-string v4, "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
/* :try_end_0 */
/* .catch Ljava/net/UnknownHostException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_3 */
/* :catch_0 */
/* move-exception v1 */
final String v1 = "NetTool"; // const-string v1, "NetTool"
final String v3 = "wifi\u4e0d\u901a,\u6253\u5f002G\u548c3G"; // const-string v3, "wifi\u4e0d\u901a,\u6253\u5f002G\u548c3G"
com.kkkwan.billing.h.f .a ( v1,v3 );
v1 = com.kkkwan.billing.h.d .c ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_17
try { // :try_start_1
final String v1 = "NetTool"; // const-string v1, "NetTool"
final String v3 = "wifi\u5173\u95ed\u4e86,2G\u6253\u5f00\u4e86"; // const-string v3, "wifi\u5173\u95ed\u4e86,2G\u6253\u5f00\u4e86"
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* :try_end_1 */
/* .catch Ljava/net/UnknownHostException; {:try_start_1 ..:try_end_1} :catch_4 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_5 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_6 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_7 */
} // :goto_2
/* add-int/lit8 v1, v2, 0x1 */
/* move v2, v1 */
/* goto/16 :goto_0 */
} // :cond_4
int v1 = 1; // const/4 v1, 0x1
/* if-ne v2, v1, :cond_7 */
/* const-wide/32 v3, 0x1d4c0 */
try { // :try_start_2
java.lang.Thread .sleep ( v3,v4 );
if ( p4 != null) { // if-eqz p4, :cond_5
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_5
v1 = com.kkkwan.billing.h.d .a ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_6
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_6
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="; // const-string v4, "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
/* :try_end_2 */
/* .catch Ljava/net/UnknownHostException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Lorg/json/JSONException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_3 */
/* goto/16 :goto_1 */
/* :catch_1 */
/* move-exception v1 */
final String v3 = "NetTool"; // const-string v3, "NetTool"
final String v4 = "IO\u5f02\u5e382\uff01"; // const-string v4, "IO\u5f02\u5e382\uff01"
com.kkkwan.billing.h.f .a ( v3,v4 );
(( java.io.IOException ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1 );
} // :cond_7
int v1 = 2; // const/4 v1, 0x2
/* if-ne v2, v1, :cond_a */
/* const-wide/32 v3, 0x927c0 */
try { // :try_start_3
java.lang.Thread .sleep ( v3,v4 );
if ( p4 != null) { // if-eqz p4, :cond_8
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_8
v1 = com.kkkwan.billing.h.d .a ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_9
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_9
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="; // const-string v4, "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
/* :try_end_3 */
/* .catch Ljava/net/UnknownHostException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catch Lorg/json/JSONException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_3 */
/* goto/16 :goto_1 */
/* :catch_2 */
/* move-exception v1 */
final String v3 = "NetTool"; // const-string v3, "NetTool"
final String v4 = "json\u89e3\u6790\u51fa\u95192\uff01"; // const-string v4, "json\u89e3\u6790\u51fa\u95192\uff01"
com.kkkwan.billing.h.f .a ( v3,v4 );
(( org.json.JSONException ) v1 ).toString ( ); // invoke-virtual {v1}, Lorg/json/JSONException;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1 );
/* goto/16 :goto_2 */
} // :cond_a
int v1 = 3; // const/4 v1, 0x3
/* if-ne v2, v1, :cond_d */
/* const-wide/32 v3, 0x36ee80 */
try { // :try_start_4
java.lang.Thread .sleep ( v3,v4 );
if ( p4 != null) { // if-eqz p4, :cond_b
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_b
v1 = com.kkkwan.billing.h.d .a ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_c
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_c
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="; // const-string v4, "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
/* :try_end_4 */
/* .catch Ljava/net/UnknownHostException; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catch Lorg/json/JSONException; {:try_start_4 ..:try_end_4} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_3 */
/* goto/16 :goto_1 */
/* :catch_3 */
/* move-exception v1 */
final String v3 = "NetTool"; // const-string v3, "NetTool"
final String v4 = "\u5176\u4ed6\u5f02\u5e382\uff01"; // const-string v4, "\u5176\u4ed6\u5f02\u5e382\uff01"
com.kkkwan.billing.h.f .a ( v3,v4 );
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1 );
/* goto/16 :goto_2 */
} // :cond_d
int v1 = 4; // const/4 v1, 0x4
/* if-ne v2, v1, :cond_10 */
/* const-wide/32 v3, 0x6ddd00 */
try { // :try_start_5
java.lang.Thread .sleep ( v3,v4 );
if ( p4 != null) { // if-eqz p4, :cond_e
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_e
v1 = com.kkkwan.billing.h.d .a ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_f
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_f
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="; // const-string v4, "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
/* goto/16 :goto_1 */
} // :cond_10
int v1 = 5; // const/4 v1, 0x5
/* if-ne v2, v1, :cond_13 */
/* const-wide/32 v3, 0x1499700 */
java.lang.Thread .sleep ( v3,v4 );
if ( p4 != null) { // if-eqz p4, :cond_11
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_11
v1 = com.kkkwan.billing.h.d .a ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_12
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_12
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="; // const-string v4, "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
/* goto/16 :goto_1 */
} // :cond_13
int v1 = 6; // const/4 v1, 0x6
/* if-ne v2, v1, :cond_0 */
/* const-wide/32 v3, 0x337f980 */
java.lang.Thread .sleep ( v3,v4 );
if ( p4 != null) { // if-eqz p4, :cond_14
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_14
v1 = com.kkkwan.billing.h.d .a ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_15
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u8f6e\u8be2\u6b21\u6570i="; // const-string v4, "\u8f6e\u8be2\u6b21\u6570i="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
com.kkkwan.billing.h.d .a ( p1,p2 );
/* goto/16 :goto_1 */
} // :cond_15
final String v1 = "NetTool"; // const-string v1, "NetTool"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="; // const-string v4, "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edci="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
/* goto/16 :goto_1 */
} // :cond_16
final String v1 = "NetTool"; // const-string v1, "NetTool"
final String v3 = "\u8bbf\u95ee\u5931\u8d25!"; // const-string v3, "\u8bbf\u95ee\u5931\u8d25!"
com.kkkwan.billing.h.f .a ( v1,v3 );
/* :try_end_5 */
/* .catch Ljava/net/UnknownHostException; {:try_start_5 ..:try_end_5} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_1 */
/* .catch Lorg/json/JSONException; {:try_start_5 ..:try_end_5} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_3 */
/* goto/16 :goto_2 */
/* :catch_4 */
/* move-exception v1 */
final String v3 = "NetTool"; // const-string v3, "NetTool"
final String v4 = "\u7f51\u7edc\u4e0d\u901a1\uff01"; // const-string v4, "\u7f51\u7edc\u4e0d\u901a1\uff01"
com.kkkwan.billing.h.f .a ( v3,v4 );
(( java.net.UnknownHostException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/net/UnknownHostException;->printStackTrace()V
/* goto/16 :goto_2 */
/* :catch_5 */
/* move-exception v1 */
final String v3 = "NetTool"; // const-string v3, "NetTool"
final String v4 = "IO\u5f02\u5e381\uff01"; // const-string v4, "IO\u5f02\u5e381\uff01"
com.kkkwan.billing.h.f .a ( v3,v4 );
(( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
/* goto/16 :goto_2 */
/* :catch_6 */
/* move-exception v1 */
final String v3 = "NetTool"; // const-string v3, "NetTool"
final String v4 = "json\u89e3\u6790\u51fa\u95191\uff01"; // const-string v4, "json\u89e3\u6790\u51fa\u95191\uff01"
com.kkkwan.billing.h.f .a ( v3,v4 );
(( org.json.JSONException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
/* goto/16 :goto_2 */
/* :catch_7 */
/* move-exception v1 */
final String v3 = "NetTool"; // const-string v3, "NetTool"
final String v4 = "\u5176\u4ed6\u5f02\u5e381\uff01"; // const-string v4, "\u5176\u4ed6\u5f02\u5e381\uff01"
com.kkkwan.billing.h.f .a ( v3,v4 );
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
/* goto/16 :goto_2 */
} // :cond_17
final String v1 = "NetTool"; // const-string v1, "NetTool"
final String v3 = "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edc1\uff01"; // const-string v3, "\u4e0d\u80fd\u6253\u5f00\u7f51\u7edc1\uff01"
com.kkkwan.billing.h.f .a ( v1,v3 );
/* goto/16 :goto_2 */
} // .end method
