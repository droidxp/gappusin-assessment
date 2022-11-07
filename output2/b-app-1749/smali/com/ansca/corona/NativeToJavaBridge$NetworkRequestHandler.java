class com.ansca.corona.NativeToJavaBridge$NetworkRequestHandler extends com.loopj.android.http.AsyncHttpResponseHandler {
	 /* .source "NativeToJavaBridge.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/NativeToJavaBridge; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "NetworkRequestHandler" */
} // .end annotation
/* # instance fields */
private java.lang.String fFilePath;
private Boolean fHasErrorOccurred;
private Integer fListenerId;
private java.lang.String fResponseMessage;
private Integer fStatusCode;
private java.lang.String fUrl;
final com.ansca.corona.NativeToJavaBridge this$0; //synthetic
/* # direct methods */
public com.ansca.corona.NativeToJavaBridge$NetworkRequestHandler ( ) {
/* .locals 1 */
/* .param p2, "listenerId" # I */
/* .param p3, "filePath" # Ljava/lang/String; */
/* .param p4, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 866 */
this.this$0 = p1;
/* .line 867 */
/* invoke-direct {p0}, Lcom/loopj/android/http/AsyncHttpResponseHandler;-><init>()V */
/* .line 868 */
/* iput p2, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fListenerId:I */
/* .line 869 */
if ( p3 != null) { // if-eqz p3, :cond_0
	 final String v0 = ""; // const-string v0, ""
	 v0 = 	 (( java.lang.String ) p3 ).equals ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Ljava/lang/String; */
	 /* invoke-direct {v0, p3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
this.fFilePath = v0;
/* .line 870 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fStatusCode:I */
/* .line 871 */
this.fUrl = p4;
/* .line 872 */
return;
/* .line 869 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
protected void handleResponseMessage ( org.apache.http.HttpResponse p0 ) {
/* .locals 1 */
/* .param p1, "response" # Lorg/apache/http/HttpResponse; */
/* .prologue */
/* .line 930 */
/* iget-boolean v0, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fHasErrorOccurred:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 931 */
v0 = this.fResponseMessage;
(( com.ansca.corona.NativeToJavaBridge$NetworkRequestHandler ) p0 ).onFailure ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->onFailure(Ljava/lang/String;)V
/* .line 938 */
} // :goto_0
return;
/* .line 935 */
v0 = } // :cond_0
/* iput v0, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fStatusCode:I */
/* .line 936 */
v0 = this.fResponseMessage;
(( com.ansca.corona.NativeToJavaBridge$NetworkRequestHandler ) p0 ).onSuccess ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->onSuccess(Ljava/lang/String;)V
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "errorMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 969 */
/* iget v0, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fListenerId:I */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 970 */
/* if-nez p1, :cond_0 */
/* .line 971 */
final String p1 = ""; // const-string p1, ""
/* .line 973 */
} // :cond_0
com.ansca.corona.Controller .getEventManager ( );
/* iget v1, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fListenerId:I */
v2 = this.fUrl;
(( com.ansca.corona.events.EventManager ) v0 ).networkRequestEvent ( v1, p1, v2 ); // invoke-virtual {v0, v1, p1, v2}, Lcom/ansca/corona/events/EventManager;->networkRequestEvent(ILjava/lang/String;Ljava/lang/String;)V
/* .line 975 */
} // :cond_1
return;
} // .end method
public void onFailure ( java.lang.Throwable p0 ) {
/* .locals 1 */
/* .param p1, "error" # Ljava/lang/Throwable; */
/* .prologue */
/* .line 959 */
if ( p1 != null) { // if-eqz p1, :cond_0
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
/* .line 960 */
/* .local v0, "errorMessage":Ljava/lang/String; */
} // :goto_0
(( com.ansca.corona.NativeToJavaBridge$NetworkRequestHandler ) p0 ).onFailure ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->onFailure(Ljava/lang/String;)V
/* .line 961 */
return;
/* .line 959 */
} // .end local v0 # "errorMessage":Ljava/lang/String;
} // :cond_0
final String v0 = ""; // const-string v0, ""
} // .end method
public void onStart ( ) {
/* .locals 1 */
/* .prologue */
/* .line 877 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fHasErrorOccurred:Z */
/* .line 878 */
final String v0 = ""; // const-string v0, ""
this.fResponseMessage = v0;
/* .line 879 */
return;
} // .end method
public void onSuccess ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "response" # Ljava/lang/String; */
/* .prologue */
/* .line 947 */
/* iget v0, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fListenerId:I */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 948 */
com.ansca.corona.Controller .getEventManager ( );
/* iget v1, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fListenerId:I */
v2 = this.fUrl;
/* iget v3, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fStatusCode:I */
(( com.ansca.corona.events.EventManager ) v0 ).networkRequestEvent ( v1, p1, v2, v3 ); // invoke-virtual {v0, v1, p1, v2, v3}, Lcom/ansca/corona/events/EventManager;->networkRequestEvent(ILjava/lang/String;Ljava/lang/String;I)V
/* .line 950 */
} // :cond_0
return;
} // .end method
public void sendResponseMessage ( org.apache.http.HttpResponse p0 ) {
/* .locals 6 */
/* .param p1, "response" # Lorg/apache/http/HttpResponse; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* .line 889 */
/* .line 890 */
v3 = /* .local v1, "status":Lorg/apache/http/StatusLine; */
/* const/16 v4, 0x12c */
/* if-ge v3, v4, :cond_1 */
/* .line 892 */
try { // :try_start_0
v3 = this.fFilePath;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 894 */
/* new-instance v2, Ljava/io/FileOutputStream; */
/* new-instance v3, Ljava/io/File; */
v4 = this.fFilePath;
/* invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 895 */
/* .local v2, "stream":Ljava/io/FileOutputStream; */
/* .line 896 */
(( java.io.FileOutputStream ) v2 ).flush ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
/* .line 897 */
(( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
/* .line 898 */
v3 = this.fFilePath;
this.fResponseMessage = v3;
/* .line 904 */
} // .end local v2 # "stream":Ljava/io/FileOutputStream;
} // :goto_0
int v3 = 0; // const/4 v3, 0x0
/* iput-boolean v3, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fHasErrorOccurred:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 918 */
} // :goto_1
/* invoke-super {p0, p1}, Lcom/loopj/android/http/AsyncHttpResponseHandler;->sendResponseMessage(Lorg/apache/http/HttpResponse;)V */
/* .line 919 */
return;
/* .line 902 */
} // :cond_0
try { // :try_start_1
(( com.ansca.corona.NativeToJavaBridge$NetworkRequestHandler ) p0 ).getResponseBody ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->getResponseBody(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
this.fResponseMessage = v3;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 906 */
/* :catch_0 */
/* move-exception v0 */
/* .line 907 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
this.fResponseMessage = v3;
/* .line 908 */
/* iput-boolean v5, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fHasErrorOccurred:Z */
/* .line 913 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_1
this.fResponseMessage = v3;
/* .line 914 */
/* iput-boolean v5, p0, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;->fHasErrorOccurred:Z */
} // .end method
