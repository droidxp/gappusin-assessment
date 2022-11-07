public class com.jumptap.adtag.utils.JtAdFetcher implements java.lang.Runnable {
	 /* .source "JtAdFetcher.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String ADVIEW_HTML_FILE_NAME;
	 private static final java.lang.String ADVIEW_JS_FILE_NAME;
	 private static final java.lang.String AD_CONTENT_HERE_STR;
	 private static final Integer BUFFER_SIZE;
	 private static final java.lang.String JS_CONTENT_HERE_STR;
	 private static final java.lang.String XJT_RESPONSE_ID;
	 /* # instance fields */
	 private java.lang.String adRequestId;
	 private com.jumptap.adtag.listeners.JtAdViewInnerListener contentListener;
	 private android.content.Context context;
	 private Boolean shouldDebugNetworkTraffic;
	 private java.lang.String url;
	 private java.lang.String wrapperContent;
	 /* # direct methods */
	 public com.jumptap.adtag.utils.JtAdFetcher ( ) {
		 /* .locals 2 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "contentListener" # Lcom/jumptap/adtag/listeners/JtAdViewInnerListener; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/jumptap/adtag/utils/JtException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 37 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 28 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/jumptap/adtag/utils/JtAdFetcher;->shouldDebugNetworkTraffic:Z */
	 /* .line 33 */
	 this.contentListener = v1;
	 /* .line 34 */
	 this.wrapperContent = v1;
	 /* .line 39 */
	 this.contentListener = p2;
	 /* .line 40 */
	 this.context = p1;
	 /* .line 42 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/utils/JtAdFetcher;->makeContentWrapper()V */
	 /* .line 43 */
	 return;
} // .end method
private void makeContentWrapper ( ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/utils/JtException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 156 */
v2 = this.wrapperContent;
/* if-nez v2, :cond_0 */
/* .line 158 */
v2 = this.context;
final String v3 = "adview.html"; // const-string v3, "adview.html"
com.jumptap.adtag.utils.FileReaderUtil .getFileContent ( v2,v3 );
/* .line 160 */
/* .local v0, "htmlFileContent":Ljava/lang/StringBuilder; */
v2 = this.context;
final String v3 = "adview.js"; // const-string v3, "adview.js"
com.jumptap.adtag.utils.FileReaderUtil .getFileContent ( v2,v3 );
/* .line 162 */
/* .local v1, "jsFileContent":Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "%JS_CONTENT_HERE%"; // const-string v3, "%JS_CONTENT_HERE%"
(( java.lang.String ) v2 ).replace ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
this.wrapperContent = v2;
/* .line 164 */
} // .end local v0 # "htmlFileContent":Ljava/lang/StringBuilder;
} // .end local v1 # "jsFileContent":Ljava/lang/StringBuilder;
} // :cond_0
return;
} // .end method
private java.lang.String modifyHtml ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "sourceHtml" # Ljava/lang/String; */
/* .prologue */
/* .line 135 */
int v0 = 0; // const/4 v0, 0x0
/* .line 137 */
/* .local v0, "retHtml":Ljava/lang/String; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 138 */
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_1 */
/* .line 139 */
v1 = this.wrapperContent;
final String v2 = "%AD_CONTENT_HERE%"; // const-string v2, "%AD_CONTENT_HERE%"
(( java.lang.String ) v1 ).replace ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 147 */
} // :cond_0
} // :goto_0
/* .line 143 */
} // :cond_1
final String v0 = ""; // const-string v0, ""
} // .end method
/* # virtual methods */
public java.lang.String getAdContent ( ) {
/* .locals 18 */
/* .prologue */
/* .line 79 */
int v1 = 0; // const/4 v1, 0x0
/* .line 81 */
/* .local v1, "adContent":Ljava/lang/String; */
/* new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 82 */
/* .local v3, "client":Lorg/apache/http/client/HttpClient; */
/* new-instance v7, Lorg/apache/http/client/methods/HttpGet; */
/* move-object/from16 v0, p0 */
v15 = this.url;
/* invoke-direct {v7, v15}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 83 */
/* .local v7, "get":Lorg/apache/http/client/methods/HttpGet; */
/* move-object/from16 v0, p0 */
/* iget-boolean v15, v0, Lcom/jumptap/adtag/utils/JtAdFetcher;->shouldDebugNetworkTraffic:Z */
if ( v15 != null) { // if-eqz v15, :cond_0
/* .line 84 */
final String v15 = "JtAd"; // const-string v15, "JtAd"
/* new-instance v16, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v16 ..v16}, Ljava/lang/StringBuilder;-><init>()V */
final String v17 = "Created html client for: "; // const-string v17, "Created html client for: "
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, p0 */
v0 = this.url;
/* move-object/from16 v17, v0 */
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v16 ..v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 89 */
} // :cond_0
try { // :try_start_0
/* .line 91 */
/* .local v11, "resp":Lorg/apache/http/HttpResponse; */
final String v15 = "Xjt-Responseid"; // const-string v15, "Xjt-Responseid"
/* .line 92 */
/* .local v6, "firstHeader":Lorg/apache/http/Header; */
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 93 */
/* move-object/from16 v0, p0 */
this.adRequestId = v15;
/* .line 96 */
} // :cond_1
/* .line 98 */
v12 = /* .local v13, "statusLine":Lorg/apache/http/StatusLine; */
/* .line 99 */
/* .local v12, "statusCode":I */
/* const/16 v15, 0xc8 */
/* if-ne v12, v15, :cond_3 */
/* .line 100 */
/* .line 101 */
/* .local v5, "ent":Lorg/apache/http/HttpEntity; */
/* move-result-wide v15 */
/* long-to-int v9, v15 */
/* .line 102 */
/* .local v9, "len":I */
/* .line 104 */
/* .local v8, "is":Ljava/io/InputStream; */
/* const/16 v15, 0x400 */
/* new-array v2, v15, [B */
/* .line 105 */
/* .local v2, "bar":[B */
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 106 */
/* .local v10, "reqContent":Ljava/lang/StringBuilder; */
} // :goto_0
v9 = (( java.io.InputStream ) v8 ).read ( v2 ); // invoke-virtual {v8, v2}, Ljava/io/InputStream;->read([B)I
/* if-lez v9, :cond_2 */
/* .line 108 */
/* new-instance v14, Ljava/lang/StringBuffer; */
/* new-instance v15, Ljava/lang/String; */
/* const/16 v16, 0x0 */
/* move/from16 v0, v16 */
/* invoke-direct {v15, v2, v0, v9}, Ljava/lang/String;-><init>([BII)V */
/* invoke-direct {v14, v15}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 109 */
/* .local v14, "tmpBuf":Ljava/lang/StringBuffer; */
(( java.lang.StringBuilder ) v10 ).append ( v14 ); // invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuilder;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 119 */
} // .end local v2 # "bar":[B
} // .end local v5 # "ent":Lorg/apache/http/HttpEntity;
} // .end local v6 # "firstHeader":Lorg/apache/http/Header;
} // .end local v8 # "is":Ljava/io/InputStream;
} // .end local v9 # "len":I
} // .end local v10 # "reqContent":Ljava/lang/StringBuilder;
} // .end local v11 # "resp":Lorg/apache/http/HttpResponse;
} // .end local v12 # "statusCode":I
} // .end local v13 # "statusLine":Lorg/apache/http/StatusLine;
} // .end local v14 # "tmpBuf":Ljava/lang/StringBuffer;
/* :catch_0 */
/* move-exception v4 */
/* .line 120 */
/* .local v4, "e":Ljava/io/IOException; */
final String v15 = "JtAd"; // const-string v15, "JtAd"
/* new-instance v16, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v16 ..v16}, Ljava/lang/StringBuilder;-><init>()V */
final String v17 = "JtAdFetcher.getAdContent:"; // const-string v17, "JtAdFetcher.getAdContent:"
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
(( java.io.IOException ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/io/IOException;->toString()Ljava/lang/String;
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v16 ..v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 121 */
int v1 = 0; // const/4 v1, 0x0
/* .line 124 */
} // .end local v4 # "e":Ljava/io/IOException;
} // :goto_1
/* .line 112 */
/* .restart local v2 # "bar":[B */
/* .restart local v5 # "ent":Lorg/apache/http/HttpEntity; */
/* .restart local v6 # "firstHeader":Lorg/apache/http/Header; */
/* .restart local v8 # "is":Ljava/io/InputStream; */
/* .restart local v9 # "len":I */
/* .restart local v10 # "reqContent":Ljava/lang/StringBuilder; */
/* .restart local v11 # "resp":Lorg/apache/http/HttpResponse; */
/* .restart local v12 # "statusCode":I */
/* .restart local v13 # "statusLine":Lorg/apache/http/StatusLine; */
} // :cond_2
try { // :try_start_1
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 113 */
/* .line 115 */
} // .end local v2 # "bar":[B
} // .end local v5 # "ent":Lorg/apache/http/HttpEntity;
} // .end local v8 # "is":Ljava/io/InputStream;
} // .end local v9 # "len":I
} // .end local v10 # "reqContent":Ljava/lang/StringBuilder;
} // :cond_3
final String v15 = "JtAd"; // const-string v15, "JtAd"
/* new-instance v16, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v16 ..v16}, Ljava/lang/StringBuilder;-><init>()V */
final String v17 = "JtAdFetcher.getAdContent: Recieve error Code=["; // const-string v17, "JtAdFetcher.getAdContent: Recieve error Code=["
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v16 */
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v17 = "] when sending url=["; // const-string v17, "] when sending url=["
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, p0 */
v0 = this.url;
/* move-object/from16 v17, v0 */
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v17 = "]"; // const-string v17, "]"
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v16 ..v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 116 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public java.lang.String getAdRequestId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 74 */
v0 = this.adRequestId;
} // .end method
public void kickOffUrlFetch ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 67 */
final String v1 = "JtAd"; // const-string v1, "JtAd"
final String v2 = "Kicked off fetcher"; // const-string v2, "Kicked off fetcher"
android.util.Log .d ( v1,v2 );
/* .line 68 */
this.url = p1;
/* .line 69 */
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 70 */
/* .local v0, "thr":Ljava/lang/Thread; */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 71 */
return;
} // .end method
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 54 */
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v3 = "Started Url Thread"; // const-string v3, "Started Url Thread"
android.util.Log .d ( v2,v3 );
/* .line 56 */
(( com.jumptap.adtag.utils.JtAdFetcher ) p0 ).getAdContent ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/utils/JtAdFetcher;->getAdContent()Ljava/lang/String;
/* .line 59 */
/* .local v0, "adContent":Ljava/lang/String; */
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/utils/JtAdFetcher;->modifyHtml(Ljava/lang/String;)Ljava/lang/String; */
/* .line 61 */
/* .local v1, "adWrappedContent":Ljava/lang/String; */
v2 = this.contentListener;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 62 */
v2 = this.contentListener;
v3 = this.adRequestId;
/* .line 64 */
} // :cond_0
return;
} // .end method
public void setShouldDebugNetworkTraffic ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "debug" # Z */
/* .prologue */
/* .line 50 */
/* iput-boolean p1, p0, Lcom/jumptap/adtag/utils/JtAdFetcher;->shouldDebugNetworkTraffic:Z */
/* .line 51 */
return;
} // .end method
public void setUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 46 */
this.url = p1;
/* .line 47 */
return;
} // .end method
