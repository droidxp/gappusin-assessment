public class com.mobfox.video.sdk.RequestAd {
	 /* .source "RequestAd.java" */
	 /* # instance fields */
	 private java.lang.String xml;
	 /* # direct methods */
	 public com.mobfox.video.sdk.RequestAd ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 30 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.xml = v0;
		 /* .line 31 */
		 return;
	 } // .end method
	 public com.mobfox.video.sdk.RequestAd ( ) {
		 /* .locals 0 */
		 /* .param p1, "xmlArg" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 34 */
		 this.xml = p1;
		 /* .line 35 */
		 return;
	 } // .end method
	 private java.lang.String convertStreamToString ( java.io.InputStream p0 ) {
		 /* .locals 3 */
		 /* .param p1, "is" # Ljava/io/InputStream; */
		 /* .prologue */
		 /* .line 126 */
		 try { // :try_start_0
			 /* new-instance v1, Ljava/util/Scanner; */
			 /* invoke-direct {v1, p1}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V */
			 final String v2 = "\\A"; // const-string v2, "\\A"
			 (( java.util.Scanner ) v1 ).useDelimiter ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;
			 (( java.util.Scanner ) v1 ).next ( ); // invoke-virtual {v1}, Ljava/util/Scanner;->next()Ljava/lang/String;
			 /* :try_end_0 */
			 /* .catch Ljava/util/NoSuchElementException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 128 */
		 } // :goto_0
		 /* .line 127 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 128 */
		 /* .local v0, "e":Ljava/util/NoSuchElementException; */
		 final String v1 = ""; // const-string v1, ""
	 } // .end method
	 private com.mobfox.video.sdk.RichMediaAdData parse ( java.io.InputStream p0 ) {
		 /* .locals 11 */
		 /* .param p1, "inputStream" # Ljava/io/InputStream; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/mobfox/video/sdk/RequestException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 98 */
	 try { // :try_start_0
		 javax.xml.parsers.SAXParserFactory .newInstance ( );
		 /* .line 99 */
		 /* .local v5, "spf":Ljavax/xml/parsers/SAXParserFactory; */
		 (( javax.xml.parsers.SAXParserFactory ) v5 ).newSAXParser ( ); // invoke-virtual {v5}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
		 /* .line 100 */
		 /* .local v4, "sp":Ljavax/xml/parsers/SAXParser; */
		 (( javax.xml.parsers.SAXParser ) v4 ).getXMLReader ( ); // invoke-virtual {v4}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
		 /* .line 101 */
		 /* .local v7, "xr":Lorg/xml/sax/XMLReader; */
		 /* new-instance v2, Lcom/mobfox/video/sdk/ResponseHandler; */
		 /* invoke-direct {v2}, Lcom/mobfox/video/sdk/ResponseHandler;-><init>()V */
		 /* .line 102 */
		 /* .local v2, "myHandler":Lcom/mobfox/video/sdk/ResponseHandler; */
		 /* .line 103 */
		 /* sget-boolean v8, Lcom/mobfox/video/sdk/MobFoxAdManager;->LOGGING_ENABLED:Z */
		 if ( v8 != null) { // if-eqz v8, :cond_0
			 /* .line 104 */
			 /* invoke-direct {p0, p1}, Lcom/mobfox/video/sdk/RequestAd;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String; */
			 /* .line 105 */
			 /* .local v3, "response":Ljava/lang/String; */
			 final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
			 /* new-instance v9, Ljava/lang/StringBuilder; */
			 final String v10 = "Ad RequestPerform HTTP Response: "; // const-string v10, "Ad RequestPerform HTTP Response: "
			 /* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v9 ).append ( v3 ); // invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .d ( v8,v9 );
			 /* .line 106 */
			 final String v8 = "ISO-8859-1"; // const-string v8, "ISO-8859-1"
			 (( java.lang.String ) v3 ).getBytes ( v8 ); // invoke-virtual {v3, v8}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
			 /* .line 107 */
			 /* .local v0, "bytes":[B */
			 /* new-instance v6, Lorg/xml/sax/InputSource; */
			 /* new-instance v8, Ljava/io/ByteArrayInputStream; */
			 /* invoke-direct {v8, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
			 /* invoke-direct {v6, v8}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
			 /* .line 108 */
			 /* .local v6, "src":Lorg/xml/sax/InputSource; */
			 final String v8 = "ISO-8859-1"; // const-string v8, "ISO-8859-1"
			 (( org.xml.sax.InputSource ) v6 ).setEncoding ( v8 ); // invoke-virtual {v6, v8}, Lorg/xml/sax/InputSource;->setEncoding(Ljava/lang/String;)V
			 /* .line 109 */
			 /* .line 110 */
			 v8 = this.richMediaAd;
			 /* .line 116 */
		 } // .end local v0 # "bytes":[B
	 } // .end local v3 # "response":Ljava/lang/String;
} // :goto_0
/* .line 113 */
} // .end local v6 # "src":Lorg/xml/sax/InputSource;
} // :cond_0
/* new-instance v6, Lorg/xml/sax/InputSource; */
/* invoke-direct {v6, p1}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
/* .line 114 */
/* .restart local v6 # "src":Lorg/xml/sax/InputSource; */
final String v8 = "ISO-8859-1"; // const-string v8, "ISO-8859-1"
(( org.xml.sax.InputSource ) v6 ).setEncoding ( v8 ); // invoke-virtual {v6, v8}, Lorg/xml/sax/InputSource;->setEncoding(Ljava/lang/String;)V
/* .line 115 */
/* .line 116 */
v8 = this.richMediaAd;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 118 */
} // .end local v2 # "myHandler":Lcom/mobfox/video/sdk/ResponseHandler;
} // .end local v4 # "sp":Ljavax/xml/parsers/SAXParser;
} // .end local v5 # "spf":Ljavax/xml/parsers/SAXParserFactory;
} // .end local v6 # "src":Lorg/xml/sax/InputSource;
} // .end local v7 # "xr":Lorg/xml/sax/XMLReader;
/* :catch_0 */
/* move-exception v1 */
/* .line 119 */
/* .local v1, "e":Ljava/lang/Exception; */
/* new-instance v8, Lcom/mobfox/video/sdk/RequestException; */
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "Cannot parse Response:"; // const-string v10, "Cannot parse Response:"
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 120 */
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 119 */
/* invoke-direct {v8, v9, v1}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v8 */
} // .end method
private com.mobfox.video.sdk.RichMediaAdData parseTestString ( ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/mobfox/video/sdk/RequestException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 78 */
try { // :try_start_0
javax.xml.parsers.SAXParserFactory .newInstance ( );
/* .line 79 */
/* .local v4, "spf":Ljavax/xml/parsers/SAXParserFactory; */
(( javax.xml.parsers.SAXParserFactory ) v4 ).newSAXParser ( ); // invoke-virtual {v4}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
/* .line 80 */
/* .local v3, "sp":Ljavax/xml/parsers/SAXParser; */
(( javax.xml.parsers.SAXParser ) v3 ).getXMLReader ( ); // invoke-virtual {v3}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
/* .line 82 */
/* .local v6, "xr":Lorg/xml/sax/XMLReader; */
/* new-instance v2, Lcom/mobfox/video/sdk/ResponseHandler; */
/* invoke-direct {v2}, Lcom/mobfox/video/sdk/ResponseHandler;-><init>()V */
/* .line 83 */
/* .local v2, "myHandler":Lcom/mobfox/video/sdk/ResponseHandler; */
/* .line 84 */
v7 = this.xml;
final String v8 = "ISO-8859-1"; // const-string v8, "ISO-8859-1"
(( java.lang.String ) v7 ).getBytes ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* .line 85 */
/* .local v0, "bytes":[B */
/* new-instance v5, Lorg/xml/sax/InputSource; */
/* new-instance v7, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v7, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* invoke-direct {v5, v7}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
/* .line 86 */
/* .local v5, "src":Lorg/xml/sax/InputSource; */
final String v7 = "ISO-8859-1"; // const-string v7, "ISO-8859-1"
(( org.xml.sax.InputSource ) v5 ).setEncoding ( v7 ); // invoke-virtual {v5, v7}, Lorg/xml/sax/InputSource;->setEncoding(Ljava/lang/String;)V
/* .line 87 */
/* .line 88 */
v7 = this.richMediaAd;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 89 */
} // .end local v0 # "bytes":[B
} // .end local v2 # "myHandler":Lcom/mobfox/video/sdk/ResponseHandler;
} // .end local v3 # "sp":Ljavax/xml/parsers/SAXParser;
} // .end local v4 # "spf":Ljavax/xml/parsers/SAXParserFactory;
} // .end local v5 # "src":Lorg/xml/sax/InputSource;
} // .end local v6 # "xr":Lorg/xml/sax/XMLReader;
/* :catch_0 */
/* move-exception v1 */
/* .line 90 */
/* .local v1, "e":Ljava/lang/Exception; */
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Cannot parse Response:"; // const-string v9, "Cannot parse Response:"
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 91 */
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 90 */
/* invoke-direct {v7, v8, v1}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v7 */
} // .end method
/* # virtual methods */
public com.mobfox.video.sdk.RichMediaAdData sendRequest ( com.mobfox.video.sdk.RequestData p0 ) {
/* .locals 11 */
/* .param p1, "request" # Lcom/mobfox/video/sdk/RequestData; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/mobfox/video/sdk/RequestException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v10, 0x3a98 */
/* .line 39 */
v7 = this.xml;
/* if-nez v7, :cond_2 */
/* .line 40 */
(( com.mobfox.video.sdk.RequestData ) p1 ).toString ( ); // invoke-virtual {p1}, Lcom/mobfox/video/sdk/RequestData;->toString()Ljava/lang/String;
/* .line 41 */
/* .local v6, "url":Ljava/lang/String; */
/* sget-boolean v7, Lcom/mobfox/video/sdk/MobFoxAdManager;->LOGGING_ENABLED:Z */
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 42 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Ad RequestPerform HTTP Get Url: "; // const-string v9, "Ad RequestPerform HTTP Get Url: "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v7,v8 );
/* .line 44 */
} // :cond_0
/* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 45 */
/* .local v0, "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v7,v10 );
/* .line 47 */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v7,v10 );
/* .line 49 */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
/* .line 50 */
(( com.mobfox.video.sdk.RequestData ) p1 ).getUserAgent ( ); // invoke-virtual {p1}, Lcom/mobfox/video/sdk/RequestData;->getUserAgent()Ljava/lang/String;
/* .line 49 */
org.apache.http.params.HttpProtocolParams .setUserAgent ( v7,v8 );
/* .line 51 */
/* new-instance v2, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v2, v6}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 54 */
/* .local v2, "get":Lorg/apache/http/client/methods/HttpGet; */
try { // :try_start_0
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).execute ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
/* .line 55 */
v4 = /* .local v3, "response":Lorg/apache/http/HttpResponse; */
/* .line 56 */
/* .local v4, "responseCode":I */
/* const/16 v7, 0xc8 */
/* if-ne v4, v7, :cond_1 */
/* .line 57 */
/* invoke-direct {p0, v7}, Lcom/mobfox/video/sdk/RequestAd;->parse(Ljava/io/InputStream;)Lcom/mobfox/video/sdk/RichMediaAdData; */
/* .line 72 */
} // .end local v0 # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
} // .end local v2 # "get":Lorg/apache/http/client/methods/HttpGet;
} // .end local v3 # "response":Lorg/apache/http/HttpResponse;
} // .end local v4 # "responseCode":I
} // .end local v6 # "url":Ljava/lang/String;
} // :goto_0
/* .line 59 */
/* .restart local v0 # "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
/* .restart local v2 # "get":Lorg/apache/http/client/methods/HttpGet; */
/* .restart local v3 # "response":Lorg/apache/http/HttpResponse; */
/* .restart local v4 # "responseCode":I */
/* .restart local v6 # "url":Ljava/lang/String; */
} // :cond_1
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Server Error.Response code:"; // const-string v9, "Server Error.Response code:"
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 60 */
(( java.lang.StringBuilder ) v8 ).append ( v4 ); // invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 59 */
/* invoke-direct {v7, v8}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;)V */
/* throw v7 */
/* :try_end_0 */
/* .catch Lcom/mobfox/video/sdk/RequestException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_3 */
/* .line 62 */
} // .end local v3 # "response":Lorg/apache/http/HttpResponse;
} // .end local v4 # "responseCode":I
/* :catch_0 */
/* move-exception v1 */
/* .line 63 */
/* .local v1, "e":Lcom/mobfox/video/sdk/RequestException; */
/* throw v1 */
/* .line 64 */
} // .end local v1 # "e":Lcom/mobfox/video/sdk/RequestException;
/* :catch_1 */
/* move-exception v1 */
/* .line 65 */
/* .local v1, "e":Lorg/apache/http/client/ClientProtocolException; */
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
final String v8 = "Error in HTTP request"; // const-string v8, "Error in HTTP request"
/* invoke-direct {v7, v8, v1}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v7 */
/* .line 66 */
} // .end local v1 # "e":Lorg/apache/http/client/ClientProtocolException;
/* :catch_2 */
/* move-exception v1 */
/* .line 67 */
/* .local v1, "e":Ljava/io/IOException; */
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
final String v8 = "Error in HTTP request"; // const-string v8, "Error in HTTP request"
/* invoke-direct {v7, v8, v1}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v7 */
/* .line 68 */
} // .end local v1 # "e":Ljava/io/IOException;
/* :catch_3 */
/* move-exception v5 */
/* .line 69 */
/* .local v5, "t":Ljava/lang/Throwable; */
/* new-instance v7, Lcom/mobfox/video/sdk/RequestException; */
final String v8 = "Error in HTTP request"; // const-string v8, "Error in HTTP request"
/* invoke-direct {v7, v8, v5}, Lcom/mobfox/video/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v7 */
/* .line 72 */
} // .end local v0 # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
} // .end local v2 # "get":Lorg/apache/http/client/methods/HttpGet;
} // .end local v5 # "t":Ljava/lang/Throwable;
} // .end local v6 # "url":Ljava/lang/String;
} // :cond_2
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/RequestAd;->parseTestString()Lcom/mobfox/video/sdk/RichMediaAdData; */
} // .end method
