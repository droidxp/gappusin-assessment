class inal extends android.webkit.WebChromeClient {
	 /* .source "InneractiveAdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/inneractive/api/ads/InneractiveAdView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x10 */
/* name = "IAwebChromeClient" */
} // .end annotation
/* # instance fields */
final com.inneractive.api.ads.InneractiveAdView this$0; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 936 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onJsAlert ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3 ) {
/* .locals 8 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .param p4, "result" # Landroid/webkit/JsResult; */
/* .prologue */
/* .line 939 */
final String v6 = "LogTag"; // const-string v6, "LogTag"
android.util.Log .d ( v6,p3 );
/* .line 941 */
final String v6 = "test"; // const-string v6, "test"
v4 = (( java.lang.String ) p3 ).indexOf ( v6 ); // invoke-virtual {p3, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 942 */
/* .local v4, "indexOfTest":I */
final String v6 = "error"; // const-string v6, "error"
v3 = (( java.lang.String ) p3 ).indexOf ( v6 ); // invoke-virtual {p3, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 943 */
/* .local v3, "indexOfError":I */
/* if-ltz v4, :cond_1 */
/* .line 944 */
int v6 = 0; // const/4 v6, 0x0
(( java.lang.String ) p3 ).substring ( v6, v4 ); // invoke-virtual {p3, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 945 */
/* .local v0, "clientTmp":Ljava/lang/String; */
/* add-int/lit8 v6, v4, 0x4 */
(( java.lang.String ) p3 ).substring ( v6, v3 ); // invoke-virtual {p3, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 946 */
/* .local v5, "sessionTmp":Ljava/lang/String; */
/* add-int/lit8 v6, v3, 0x5 */
v7 = (( java.lang.String ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/lang/String;->length()I
(( java.lang.String ) p3 ).substring ( v6, v7 ); // invoke-virtual {p3, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 947 */
/* .local v2, "errorCodeTmp":Ljava/lang/String; */
com.inneractive.api.ads.InneractiveAdView .access$3 ( v0 );
/* .line 948 */
com.inneractive.api.ads.InneractiveAdView .access$4 ( v5 );
/* .line 949 */
com.inneractive.api.ads.InneractiveAdView .access$5 ( v2 );
/* .line 950 */
final String v6 = "inneractive"; // const-string v6, "inneractive"
com.inneractive.api.ads.InneractiveAdView .access$6 ( );
android.util.Log .i ( v6,v7 );
/* .line 952 */
v6 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v6 );
if ( v6 != null) { // if-eqz v6, :cond_0
	 /* .line 956 */
	 try { // :try_start_0
		 com.inneractive.api.ads.InneractiveAdView .access$6 ( );
		 final String v7 = "Internal Error"; // const-string v7, "Internal Error"
		 /* if-ne v6, v7, :cond_2 */
		 /* .line 957 */
		 v6 = this.this$0;
		 com.inneractive.api.ads.InneractiveAdView .access$7 ( v6 );
		 v7 = this.this$0;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 980 */
	 } // :cond_0
} // :goto_0
v6 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$8 ( );
(( com.inneractive.api.ads.InneractiveAdView ) v6 ).WriteClientIDToFile ( v7 ); // invoke-virtual {v6, v7}, Lcom/inneractive/api/ads/InneractiveAdView;->WriteClientIDToFile(Ljava/lang/String;)V
/* .line 981 */
(( android.webkit.JsResult ) p4 ).confirm ( ); // invoke-virtual {p4}, Landroid/webkit/JsResult;->confirm()V
/* .line 987 */
} // .end local v0 # "clientTmp":Ljava/lang/String;
} // .end local v2 # "errorCodeTmp":Ljava/lang/String;
} // .end local v5 # "sessionTmp":Ljava/lang/String;
} // :cond_1
int v6 = 1; // const/4 v6, 0x1
/* .line 959 */
/* .restart local v0 # "clientTmp":Ljava/lang/String; */
/* .restart local v2 # "errorCodeTmp":Ljava/lang/String; */
/* .restart local v5 # "sessionTmp":Ljava/lang/String; */
} // :cond_2
try { // :try_start_1
com.inneractive.api.ads.InneractiveAdView .access$6 ( );
final String v7 = "House Ad"; // const-string v7, "House Ad"
/* if-ne v6, v7, :cond_3 */
/* .line 960 */
v6 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v6 );
v7 = this.this$0;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 973 */
/* :catch_0 */
/* move-exception v1 */
/* .line 975 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v6 = "inneractive"; // const-string v6, "inneractive"
final String v7 = "listener - catch"; // const-string v7, "listener - catch"
android.util.Log .w ( v6,v7,v1 );
/* .line 962 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_3
try { // :try_start_2
com.inneractive.api.ads.InneractiveAdView .access$6 ( );
final String v7 = "Unknown App Id"; // const-string v7, "Unknown App Id"
/* if-ne v6, v7, :cond_4 */
/* .line 963 */
v6 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v6 );
v7 = this.this$0;
/* .line 965 */
} // :cond_4
com.inneractive.api.ads.InneractiveAdView .access$6 ( );
final String v7 = "Invalid Input"; // const-string v7, "Invalid Input"
/* if-ne v6, v7, :cond_5 */
/* .line 966 */
v6 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v6 );
v7 = this.this$0;
/* .line 968 */
} // :cond_5
com.inneractive.api.ads.InneractiveAdView .access$6 ( );
final String v7 = "OK"; // const-string v7, "OK"
/* if-ne v6, v7, :cond_0 */
/* .line 969 */
v6 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v6 );
v7 = this.this$0;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
} // .end method
