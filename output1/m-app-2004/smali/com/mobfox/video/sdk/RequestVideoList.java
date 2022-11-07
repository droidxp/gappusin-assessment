public class com.mobfox.video.sdk.RequestVideoList {
	 /* .source "RequestVideoList.java" */
	 /* # direct methods */
	 public com.mobfox.video.sdk.RequestVideoList ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 28 */
		 return;
	 } // .end method
	 private java.util.HashMap parse ( java.io.InputStream p0 ) {
		 /* .locals 9 */
		 /* .param p1, "inputStream" # Ljava/io/InputStream; */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/io/InputStream;", */
		 /* ")", */
		 /* "Ljava/util/HashMap", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/Long;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/RequestException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 69 */
try { // :try_start_0
	 javax.xml.parsers.SAXParserFactory .newInstance ( );
	 /* .line 70 */
	 /* .local v3, "spf":Ljavax/xml/parsers/SAXParserFactory; */
	 (( javax.xml.parsers.SAXParserFactory ) v3 ).newSAXParser ( ); // invoke-virtual {v3}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
	 /* .line 71 */
	 /* .local v2, "sp":Ljavax/xml/parsers/SAXParser; */
	 (( javax.xml.parsers.SAXParser ) v2 ).getXMLReader ( ); // invoke-virtual {v2}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
	 /* .line 73 */
	 /* .local v5, "xr":Lorg/xml/sax/XMLReader; */
	 /* new-instance v1, Lcom/mobfox/video/sdk/ResponseHandler; */
	 /* invoke-direct {v1}, Lcom/mobfox/video/sdk/ResponseHandler;-><init>()V */
	 /* .line 74 */
	 /* .local v1, "myHandler":Lcom/mobfox/video/sdk/ResponseHandler; */
	 /* .line 75 */
	 /* new-instance v4, Lorg/xml/sax/InputSource; */
	 /* invoke-direct {v4, p1}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
	 /* .line 76 */
	 /* .local v4, "src":Lorg/xml/sax/InputSource; */
	 final String v6 = "ISO-8859-1"; // const-string v6, "ISO-8859-1"
	 (( org.xml.sax.InputSource ) v4 ).setEncoding ( v6 ); // invoke-virtual {v4, v6}, Lorg/xml/sax/InputSource;->setEncoding(Ljava/lang/String;)V
	 /* .line 77 */
	 /* .line 78 */
	 v6 = this.videoList;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 79 */
} // .end local v1 # "myHandler":Lcom/mobfox/video/sdk/ResponseHandler;
} // .end local v2 # "sp":Ljavax/xml/parsers/SAXParser;
} // .end local v3 # "spf":Ljavax/xml/parsers/SAXParserFactory;
} // .end local v4 # "src":Lorg/xml/sax/InputSource;
} // .end local v5 # "xr":Lorg/xml/sax/XMLReader;
/* :catch_0 */
/* move-exception v0 */
/* .line 80 */
/* .local v0, "e":Ljava/lang/Exception; */
/* new-instance v6, Lcom/mobfox/video/sdk/RequestException; */
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "Cannot parse Response:"; // const-string v8, "Cannot parse Response:"
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 81 */
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 80 */
/* invoke-direct {v6, v7, v0}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v6 */
} // .end method
/* # virtual methods */
public java.util.HashMap sendRequest ( com.mobfox.video.sdk.RequestData p0 ) {
/* .locals 11 */
/* .param p1, "request" # Lcom/mobfox/video/sdk/RequestData; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/mobfox/video/sdk/RequestData;", */
/* ")", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Long;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/mobfox/video/sdk/RequestException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v10, 0x3a98 */
/* .line 32 */
/* new-instance v7, Ljava/lang/StringBuilder; */
(( com.mobfox.video.sdk.RequestData ) p1 ).toString ( ); // invoke-virtual {p1}, Lcom/mobfox/video/sdk/RequestData;->toString()Ljava/lang/String;
java.lang.String .valueOf ( v8 );
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v8 = "&listads=1"; // const-string v8, "&listads=1"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 33 */
/* .local v6, "url":Ljava/lang/String; */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
int v8 = 3; // const/4 v8, 0x3
v7 = android.util.Log .isLoggable ( v7,v8 );
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 34 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Video List RequestPerform HTTP Get Url: "; // const-string v9, "Video List RequestPerform HTTP Get Url: "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v7,v8 );
/* .line 36 */
} // :cond_0
/* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 37 */
/* .local v0, "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v7,v10 );
/* .line 39 */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v7,v10 );
/* .line 41 */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
/* .line 42 */
(( com.mobfox.video.sdk.RequestData ) p1 ).getUserAgent ( ); // invoke-virtual {p1}, Lcom/mobfox/video/sdk/RequestData;->getUserAgent()Ljava/lang/String;
/* .line 41 */
org.apache.http.params.HttpProtocolParams .setUserAgent ( v7,v8 );
/* .line 43 */
/* new-instance v2, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v2, v6}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 46 */
/* .local v2, "get":Lorg/apache/http/client/methods/HttpGet; */
try { // :try_start_0
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).execute ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
/* .line 47 */
v4 = /* .local v3, "response":Lorg/apache/http/HttpResponse; */
/* .line 48 */
/* .local v4, "responseCode":I */
/* const/16 v7, 0xc8 */
/* if-ne v4, v7, :cond_1 */
/* .line 49 */
/* invoke-direct {p0, v7}, Lcom/mobfox/video/sdk/RequestVideoList;->parse(Ljava/io/InputStream;)Ljava/util/HashMap; */
/* .line 51 */
} // :cond_1
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Server Error.Response code:"; // const-string v9, "Server Error.Response code:"
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 52 */
(( java.lang.StringBuilder ) v8 ).append ( v4 ); // invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 51 */
/* invoke-direct {v7, v8}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;)V */
/* throw v7 */
/* :try_end_0 */
/* .catch Lcom/mobfox/video/sdk/RequestException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_3 */
/* .line 54 */
} // .end local v3 # "response":Lorg/apache/http/HttpResponse;
} // .end local v4 # "responseCode":I
/* :catch_0 */
/* move-exception v1 */
/* .line 55 */
/* .local v1, "e":Lcom/mobfox/video/sdk/RequestException; */
/* throw v1 */
/* .line 56 */
} // .end local v1 # "e":Lcom/mobfox/video/sdk/RequestException;
/* :catch_1 */
/* move-exception v1 */
/* .line 57 */
/* .local v1, "e":Lorg/apache/http/client/ClientProtocolException; */
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
final String v8 = "Error in HTTP request"; // const-string v8, "Error in HTTP request"
/* invoke-direct {v7, v8, v1}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v7 */
/* .line 58 */
} // .end local v1 # "e":Lorg/apache/http/client/ClientProtocolException;
/* :catch_2 */
/* move-exception v1 */
/* .line 59 */
/* .local v1, "e":Ljava/io/IOException; */
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
final String v8 = "Error in HTTP request"; // const-string v8, "Error in HTTP request"
/* invoke-direct {v7, v8, v1}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v7 */
/* .line 60 */
} // .end local v1 # "e":Ljava/io/IOException;
/* :catch_3 */
/* move-exception v5 */
/* .line 61 */
/* .local v5, "t":Ljava/lang/Throwable; */
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
final String v8 = "Error in HTTP request"; // const-string v8, "Error in HTTP request"
/* invoke-direct {v7, v8, v5}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v7 */
} // .end method
