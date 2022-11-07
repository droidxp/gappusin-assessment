public abstract class com.jumptap.adtag.actions.AdAction {
	 /* .source "AdAction.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/actions/AdAction$UrlPredicate; */
	 /* } */
} // .end annotation
/* # instance fields */
protected java.lang.String redirectedUrl;
protected java.lang.String url;
protected java.lang.String useragent;
/* # direct methods */
public com.jumptap.adtag.actions.AdAction ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 17 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 19 */
	 this.url = v0;
	 /* .line 20 */
	 this.redirectedUrl = v0;
	 /* .line 21 */
	 this.useragent = v0;
	 /* .line 23 */
	 return;
} // .end method
public static java.lang.String getRedirectedUrl ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 10 */
	 /* .param p0, "url" # Ljava/lang/String; */
	 /* .param p1, "useragent" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 37 */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 38 */
	 /* .local v6, "retVal":Ljava/lang/String; */
	 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
	 /* .line 39 */
	 /* .local v0, "client":Lorg/apache/http/client/HttpClient; */
	 /* .line 40 */
	 /* .local v4, "params":Lorg/apache/http/params/HttpParams; */
	 int v7 = 0; // const/4 v7, 0x0
	 org.apache.http.client.params.HttpClientParams .setRedirecting ( v4,v7 );
	 /* .line 43 */
	 try { // :try_start_0
		 /* new-instance v2, Lorg/apache/http/client/methods/HttpGet; */
		 /* invoke-direct {v2, p0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
		 /* .line 44 */
		 /* .local v2, "get":Lorg/apache/http/client/methods/HttpGet; */
		 final String v7 = "User-Agent"; // const-string v7, "User-Agent"
		 (( org.apache.http.client.methods.HttpGet ) v2 ).setHeader ( v7, p1 ); // invoke-virtual {v2, v7, p1}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 45 */
		 /* .line 47 */
		 /* .local v5, "resp":Lorg/apache/http/HttpResponse; */
		 if ( v5 != null) { // if-eqz v5, :cond_1
			 /* .line 48 */
			 final String v7 = "Location"; // const-string v7, "Location"
			 /* .line 49 */
			 /* .local v3, "header":Lorg/apache/http/Header; */
			 if ( v3 != null) { // if-eqz v3, :cond_0
				 /* .line 50 */
				 /* .line 63 */
			 } // .end local v2 # "get":Lorg/apache/http/client/methods/HttpGet;
		 } // .end local v3 # "header":Lorg/apache/http/Header;
	 } // .end local v5 # "resp":Lorg/apache/http/HttpResponse;
} // :goto_0
/* .line 53 */
/* .restart local v2 # "get":Lorg/apache/http/client/methods/HttpGet; */
/* .restart local v3 # "header":Lorg/apache/http/Header; */
/* .restart local v5 # "resp":Lorg/apache/http/HttpResponse; */
} // :cond_0
final String v7 = "JtAd"; // const-string v7, "JtAd"
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "AdAction: cannot find Location header in the respons of :"; // const-string v9, "AdAction: cannot find Location header in the respons of :"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( p0 ); // invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v7,v8 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 60 */
} // .end local v2 # "get":Lorg/apache/http/client/methods/HttpGet;
} // .end local v3 # "header":Lorg/apache/http/Header;
} // .end local v5 # "resp":Lorg/apache/http/HttpResponse;
/* :catch_0 */
/* move-exception v1 */
/* .line 61 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v7 = "JtAd"; // const-string v7, "JtAd"
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "getRedirectedUrl:"; // const-string v9, "getRedirectedUrl:"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v7,v8 );
/* .line 57 */
} // .end local v1 # "e":Ljava/lang/Exception;
/* .restart local v2 # "get":Lorg/apache/http/client/methods/HttpGet; */
/* .restart local v5 # "resp":Lorg/apache/http/HttpResponse; */
} // :cond_1
try { // :try_start_1
final String v7 = "JtAd"; // const-string v7, "JtAd"
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "AdAction: cannot execute:"; // const-string v9, "AdAction: cannot execute:"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( p0 ); // invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v7,v8 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
public static java.lang.String getRedirectedUrlWithPredicate ( java.lang.String p0, java.lang.String p1, com.jumptap.adtag.actions.AdAction$UrlPredicate p2 ) {
/* .locals 2 */
/* .param p0, "url" # Ljava/lang/String; */
/* .param p1, "useragent" # Ljava/lang/String; */
/* .param p2, "p" # Lcom/jumptap/adtag/actions/AdAction$UrlPredicate; */
/* .prologue */
/* .line 67 */
int v0 = 0; // const/4 v0, 0x0
/* .line 69 */
/* .local v0, "count":I */
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_0
int v1 = 4; // const/4 v1, 0x4
v1 = /* if-ge v0, v1, :cond_0 */
/* if-nez v1, :cond_0 */
/* .line 71 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 72 */
com.jumptap.adtag.actions.AdAction .getRedirectedUrl ( p0,p1 );
/* .line 74 */
} // :cond_0
final String v1 = ""; // const-string v1, ""
v1 = (( java.lang.String ) v1 ).equals ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int p0 = 0; // const/4 p0, 0x0
/* .line 75 */
} // :cond_1
} // .end method
/* # virtual methods */
public abstract void perform ( android.content.Context p0, com.jumptap.adtag.JtAdView p1 ) {
} // .end method
public void setRedirectedUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "redirectedUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 83 */
this.redirectedUrl = p1;
/* .line 84 */
return;
} // .end method
public void setUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 79 */
this.url = p1;
/* .line 80 */
return;
} // .end method
public void setUserAgent ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "useragent" # Ljava/lang/String; */
/* .prologue */
/* .line 87 */
this.useragent = p1;
/* .line 88 */
return;
} // .end method
