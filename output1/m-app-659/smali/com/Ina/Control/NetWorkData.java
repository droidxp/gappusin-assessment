public class com.Ina.Control.NetWorkData {
	 /* .source "NetWorkData.java" */
	 /* # static fields */
	 public static final java.lang.String ADDRESS;
	 public static final java.lang.String APP_ID;
	 public static final java.lang.String CONTENT;
	 public static final java.lang.String ID;
	 public static final java.lang.String MUST;
	 public static final java.lang.String PACKAGE;
	 public static final java.lang.String TITLE;
	 public static final java.lang.String VERSION;
	 public static final Integer mAppID;
	 public static final Float mVersion;
	 /* # instance fields */
	 private java.lang.String mUrl;
	 /* # direct methods */
	 public com.Ina.Control.NetWorkData ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 34 */
		 final String v0 = "http://ejia.syj169.com"; // const-string v0, "http://ejia.syj169.com"
		 this.mUrl = v0;
		 /* .line 20 */
		 return;
	 } // .end method
	 private java.util.ArrayList getNetWorkData ( java.lang.String[] p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4 ) {
		 /* .locals 13 */
		 /* .param p1, "keys" # [Ljava/lang/String; */
		 /* .param p2, "values" # [Ljava/lang/String; */
		 /* .param p3, "gkeys" # [Ljava/lang/String; */
		 /* .param p4, "tablename" # Ljava/lang/String; */
		 /* .param p5, "url" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "([", */
		 /* "Ljava/lang/String;", */
		 /* "[", */
		 /* "Ljava/lang/String;", */
		 /* "[", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ")", */
		 /* "Ljava/util/ArrayList", */
		 /* "<", */
		 /* "Ljava/util/HashMap", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/Object;", */
		 /* ">;>;" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 61 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 63 */
	 /* .local v1, "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
	 /* move-object/from16 v0, p5 */
	 /* invoke-direct {p0, p1, p2, v0}, Lcom/Ina/Control/NetWorkData;->sendPostData([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; */
	 /* .line 67 */
	 /* .local v9, "jsonString":Ljava/lang/String; */
	 try { // :try_start_0
		 /* new-instance v2, Ljava/util/ArrayList; */
		 /* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 69 */
	 } // .end local v1 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
	 /* .local v2, "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
	 try { // :try_start_1
		 /* new-instance v11, Lorg/json/JSONObject; */
		 /* invoke-direct {v11, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
		 /* .line 70 */
		 /* move-object/from16 v0, p4 */
		 (( org.json.JSONObject ) v11 ).getJSONArray ( v0 ); // invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
		 /* .line 72 */
		 /* .local v7, "jsonArray":Lorg/json/JSONArray; */
		 v3 = 		 (( org.json.JSONArray ) v7 ).length ( ); // invoke-virtual {v7}, Lorg/json/JSONArray;->length()I
		 /* .line 73 */
		 /* .local v3, "c":I */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .local v5, "i":I */
	 } // :goto_0
	 /* if-lt v5, v3, :cond_0 */
	 /* move-object v1, v2 */
	 /* .line 89 */
} // .end local v2 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
} // .end local v3 # "c":I
} // .end local v5 # "i":I
} // .end local v7 # "jsonArray":Lorg/json/JSONArray;
/* .restart local v1 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
} // :goto_1
/* .line 74 */
} // .end local v1 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
/* .restart local v2 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* .restart local v3 # "c":I */
/* .restart local v5 # "i":I */
/* .restart local v7 # "jsonArray":Lorg/json/JSONArray; */
} // :cond_0
/* new-instance v10, Ljava/util/HashMap; */
/* invoke-direct {v10}, Ljava/util/HashMap;-><init>()V */
/* .line 75 */
/* .local v10, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
(( org.json.JSONArray ) v7 ).opt ( v5 ); // invoke-virtual {v7, v5}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
/* check-cast v8, Lorg/json/JSONObject; */
/* .line 77 */
/* .local v8, "jsonObject":Lorg/json/JSONObject; */
int v6 = 0; // const/4 v6, 0x0
/* .local v6, "j":I */
} // :goto_2
/* move-object/from16 v0, p3 */
/* array-length v11, v0 */
/* if-lt v6, v11, :cond_1 */
/* .line 80 */
(( java.util.ArrayList ) v2 ).add ( v10 ); // invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 73 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 78 */
} // :cond_1
/* aget-object v11, p3, v6 */
/* aget-object v12, p3, v6 */
(( org.json.JSONObject ) v8 ).getString ( v12 ); // invoke-virtual {v8, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( java.util.HashMap ) v10 ).put ( v11, v12 ); // invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 77 */
/* add-int/lit8 v6, v6, 0x1 */
/* .line 84 */
} // .end local v2 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
} // .end local v3 # "c":I
} // .end local v5 # "i":I
} // .end local v6 # "j":I
} // .end local v7 # "jsonArray":Lorg/json/JSONArray;
} // .end local v8 # "jsonObject":Lorg/json/JSONObject;
} // .end local v10 # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
/* .restart local v1 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* :catch_0 */
/* move-exception v4 */
/* .line 86 */
/* .local v4, "e":Ljava/lang/Exception; */
} // :goto_3
v11 = java.lang.System.out;
final String v12 = "error"; // const-string v12, "error"
(( java.io.PrintStream ) v11 ).println ( v12 ); // invoke-virtual {v11, v12}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 84 */
} // .end local v1 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
} // .end local v4 # "e":Ljava/lang/Exception;
/* .restart local v2 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* :catch_1 */
/* move-exception v4 */
/* move-object v1, v2 */
} // .end local v2 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
/* .restart local v1 # "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
} // .end method
private java.util.HashMap getSingleNetWorkData ( java.lang.String[] p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 7 */
/* .param p1, "keys" # [Ljava/lang/String; */
/* .param p2, "values" # [Ljava/lang/String; */
/* .param p3, "gkeys" # [Ljava/lang/String; */
/* .param p4, "tablename" # Ljava/lang/String; */
/* .param p5, "url" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 94 */
/* invoke-direct {p0, p1, p2, p5}, Lcom/Ina/Control/NetWorkData;->sendPostData([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; */
/* .line 95 */
/* .local v3, "jsonString":Ljava/lang/String; */
/* new-instance v4, Ljava/util/HashMap; */
/* invoke-direct {v4}, Ljava/util/HashMap;-><init>()V */
/* .line 98 */
/* .local v4, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
try { // :try_start_0
/* new-instance v5, Lorg/json/JSONObject; */
/* invoke-direct {v5, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
(( org.json.JSONObject ) v5 ).getJSONObject ( p4 ); // invoke-virtual {v5, p4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 100 */
/* .local v2, "jsonObject":Lorg/json/JSONObject; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "j":I */
} // :goto_0
/* array-length v5, p3 */
/* if-lt v1, v5, :cond_0 */
/* .line 107 */
} // .end local v1 # "j":I
} // .end local v2 # "jsonObject":Lorg/json/JSONObject;
} // :goto_1
/* .line 101 */
/* .restart local v1 # "j":I */
/* .restart local v2 # "jsonObject":Lorg/json/JSONObject; */
} // :cond_0
/* aget-object v5, p3, v1 */
/* aget-object v6, p3, v1 */
(( org.json.JSONObject ) v2 ).getString ( v6 ); // invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( java.util.HashMap ) v4 ).put ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 100 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 102 */
} // .end local v1 # "j":I
} // .end local v2 # "jsonObject":Lorg/json/JSONObject;
/* :catch_0 */
/* move-exception v0 */
/* .line 104 */
/* .local v0, "e":Ljava/lang/Exception; */
int v4 = 0; // const/4 v4, 0x0
} // .end method
private java.lang.String sendPostData ( java.lang.String[] p0, java.lang.String[] p1, java.lang.String p2 ) {
/* .locals 10 */
/* .param p1, "keys" # [Ljava/lang/String; */
/* .param p2, "values" # [Ljava/lang/String; */
/* .param p3, "postUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 111 */
int v6 = 0; // const/4 v6, 0x0
/* .line 113 */
/* .local v6, "reString":Ljava/lang/String; */
/* new-instance v2, Lorg/apache/http/client/methods/HttpPost; */
/* invoke-direct {v2, p3}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
/* .line 114 */
/* .local v2, "httpPost":Lorg/apache/http/client/methods/HttpPost; */
/* new-instance v5, Ljava/util/ArrayList; */
/* invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V */
/* .line 116 */
/* .local v5, "parms":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;" */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i":I */
} // :goto_0
/* array-length v7, p1 */
/* if-lt v4, v7, :cond_1 */
/* .line 121 */
try { // :try_start_0
/* new-instance v7, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
final String v8 = "UTF-8"; // const-string v8, "UTF-8"
/* invoke-direct {v7, v5, v8}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpPost ) v2 ).setEntity ( v7 ); // invoke-virtual {v2, v7}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* .line 123 */
/* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 125 */
/* .local v0, "client":Lorg/apache/http/client/HttpClient; */
final String v8 = "http.socket.timeout"; // const-string v8, "http.socket.timeout"
/* .line 126 */
/* const/16 v9, 0x2710 */
java.lang.Integer .valueOf ( v9 );
/* .line 125 */
/* .line 128 */
/* .line 130 */
v7 = /* .local v3, "httpResponse":Lorg/apache/http/HttpResponse; */
/* const/16 v8, 0xc8 */
/* if-ne v7, v8, :cond_0 */
/* .line 131 */
/* .line 132 */
final String v8 = "UTF-8"; // const-string v8, "UTF-8"
/* .line 131 */
org.apache.http.util.EntityUtils .toString ( v7,v8 );
/* .line 132 */
(( java.lang.String ) v7 ).trim ( ); // invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 135 */
} // :cond_0
v7 = java.lang.System.out;
final String v8 = "User sendPostData"; // const-string v8, "User sendPostData"
(( java.io.PrintStream ) v7 ).println ( v8 ); // invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 140 */
} // .end local v0 # "client":Lorg/apache/http/client/HttpClient;
} // .end local v3 # "httpResponse":Lorg/apache/http/HttpResponse;
} // :goto_1
/* .line 117 */
} // :cond_1
/* new-instance v7, Lorg/apache/http/message/BasicNameValuePair; */
/* aget-object v8, p1, v4 */
/* aget-object v9, p2, v4 */
/* invoke-direct {v7, v8, v9}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 116 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 136 */
/* :catch_0 */
/* move-exception v1 */
/* .line 137 */
/* .local v1, "e":Ljava/lang/Exception; */
v7 = java.lang.System.out;
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.io.PrintStream ) v7 ).println ( v8 ); // invoke-virtual {v7, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // .end method
/* # virtual methods */
public java.util.ArrayList getMoreAppList ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 46 */
int v6 = 0; // const/4 v6, 0x0
/* .line 48 */
/* .local v6, "arrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* new-array v1, v4, [Ljava/lang/String; */
/* .line 49 */
/* new-array v2, v4, [Ljava/lang/String; */
/* .line 50 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v3, v0, [Ljava/lang/String; */
final String v0 = "title"; // const-string v0, "title"
/* aput-object v0, v3, v4 */
int v0 = 1; // const/4 v0, 0x1
final String v4 = "content"; // const-string v4, "content"
/* aput-object v4, v3, v0 */
int v0 = 2; // const/4 v0, 0x2
final String v4 = "address"; // const-string v4, "address"
/* aput-object v4, v3, v0 */
int v0 = 3; // const/4 v0, 0x3
final String v4 = "package"; // const-string v4, "package"
/* aput-object v4, v3, v0 */
/* .line 51 */
final String v4 = "knowheart"; // const-string v4, "knowheart"
/* .line 52 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v5 = this.mUrl;
java.lang.String .valueOf ( v5 );
/* invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = "/update/getmoreapp.php"; // const-string v5, "/update/getmoreapp.php"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* move-object v0, p0 */
/* .line 48 */
/* invoke-direct/range {v0 ..v5}, Lcom/Ina/Control/NetWorkData;->getNetWorkData([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList; */
/* .line 55 */
} // .end method
public java.util.HashMap getUpdateData ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 39 */
/* new-array v1, v5, [Ljava/lang/String; */
final String v0 = "app_id"; // const-string v0, "app_id"
/* aput-object v0, v1, v4 */
/* new-array v2, v5, [Ljava/lang/String; */
/* const/16 v0, 0xa */
java.lang.Integer .toString ( v0 );
/* aput-object v0, v2, v4 */
/* .line 40 */
int v0 = 5; // const/4 v0, 0x5
/* new-array v3, v0, [Ljava/lang/String; */
final String v0 = "version"; // const-string v0, "version"
/* aput-object v0, v3, v4 */
final String v0 = "address"; // const-string v0, "address"
/* aput-object v0, v3, v5 */
int v0 = 2; // const/4 v0, 0x2
final String v4 = "must"; // const-string v4, "must"
/* aput-object v4, v3, v0 */
int v0 = 3; // const/4 v0, 0x3
final String v4 = "content"; // const-string v4, "content"
/* aput-object v4, v3, v0 */
int v0 = 4; // const/4 v0, 0x4
final String v4 = "id"; // const-string v4, "id"
/* aput-object v4, v3, v0 */
final String v4 = "knowheart"; // const-string v4, "knowheart"
/* .line 41 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v5 = this.mUrl;
java.lang.String .valueOf ( v5 );
/* invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = "/update/checkupdate.php"; // const-string v5, "/update/checkupdate.php"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* move-object v0, p0 */
/* .line 39 */
/* invoke-direct/range {v0 ..v5}, Lcom/Ina/Control/NetWorkData;->getSingleNetWorkData([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap; */
} // .end method
