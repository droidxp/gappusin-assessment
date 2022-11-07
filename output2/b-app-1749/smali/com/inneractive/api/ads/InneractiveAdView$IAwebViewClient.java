class com.inneractive.api.ads.InneractiveAdView$IAwebViewClient extends android.webkit.WebViewClient {
	 /* .source "InneractiveAdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/inneractive/api/ads/InneractiveAdView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "IAwebViewClient" */
} // .end annotation
/* # instance fields */
private Boolean didFinishLoad;
private android.os.Handler mHandler;
final com.inneractive.api.ads.InneractiveAdView this$0; //synthetic
/* # direct methods */
private com.inneractive.api.ads.InneractiveAdView$IAwebViewClient ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1187 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
return;
} // .end method
 com.inneractive.api.ads.InneractiveAdView$IAwebViewClient ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1187 */
/* invoke-direct {p0, p1}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
return;
} // .end method
/* # virtual methods */
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 1207 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;->didFinishLoad:Z */
/* .line 1208 */
final String v0 = "javascript:alert(GetIaCid()+\'test\'+GetIaSession()+\'error\' + GetIaError())"; // const-string v0, "javascript:alert(GetIaCid()+\'test\'+GetIaSession()+\'error\' + GetIaError())"
(( android.webkit.WebView ) p1 ).loadUrl ( v0 ); // invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 1209 */
v0 = this.mHandler;
v1 = this.mHandler;
int v2 = 2; // const/4 v2, 0x2
(( android.os.Handler ) v1 ).obtainMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
/* const-wide/16 v2, 0x0 */
(( android.os.Handler ) v0 ).sendMessageDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
/* .line 1211 */
return;
} // .end method
void setDidFinishLoad ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "didFinishLoad" # Z */
/* .prologue */
/* .line 1202 */
/* iput-boolean p1, p0, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;->didFinishLoad:Z */
/* .line 1203 */
return;
} // .end method
void setHandler ( android.os.Handler p0 ) {
/* .locals 0 */
/* .param p1, "mHandler" # Landroid/os/Handler; */
/* .prologue */
/* .line 1194 */
this.mHandler = p1;
/* .line 1195 */
return;
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 6 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* .line 1222 */
/* iget-boolean v3, p0, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;->didFinishLoad:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* .line 1223 */
	 final String v3 = "http://wv.inner-active.mobi/simpleM2M/inneractive-skip"; // const-string v3, "http://wv.inner-active.mobi/simpleM2M/inneractive-skip"
	 v3 = 	 (( java.lang.String ) p2 ).equals ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* .line 1224 */
		 (( android.webkit.WebView ) p1 ).goBack ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V
		 /* .line 1325 */
	 } // :cond_0
} // :goto_0
/* .line 1228 */
} // :cond_1
final String v3 = "ia://"; // const-string v3, "ia://"
v3 = (( java.lang.String ) p2 ).startsWith ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 1229 */
int v3 = 5; // const/4 v3, 0x5
(( java.lang.String ) p2 ).substring ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 1230 */
/* .local v2, "eventUrl":Ljava/lang/String; */
final String v3 = "load"; // const-string v3, "load"
v3 = (( java.lang.String ) v2 ).startsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
	 /* .line 1231 */
	 final String v3 = "inneractive"; // const-string v3, "inneractive"
	 final String v4 = "Load event"; // const-string v4, "Load event"
	 android.util.Log .i ( v3,v4 );
	 /* .line 1233 */
} // :cond_2
final String v3 = "expand"; // const-string v3, "expand"
v3 = (( java.lang.String ) v2 ).startsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
	 /* .line 1234 */
	 final String v3 = "inneractive"; // const-string v3, "inneractive"
	 final String v4 = "EXPAND event"; // const-string v4, "EXPAND event"
	 android.util.Log .i ( v3,v4 );
	 /* .line 1236 */
} // :cond_3
final String v3 = "collapse"; // const-string v3, "collapse"
v3 = (( java.lang.String ) v2 ).startsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_4
	 /* .line 1237 */
	 final String v3 = "inneractive"; // const-string v3, "inneractive"
	 final String v4 = "COLLAPSE event"; // const-string v4, "COLLAPSE event"
	 android.util.Log .i ( v3,v4 );
	 /* .line 1238 */
	 v3 = this.this$0;
	 (( com.inneractive.api.ads.InneractiveAdView ) v3 ).createAdRequest ( ); // invoke-virtual {v3}, Lcom/inneractive/api/ads/InneractiveAdView;->createAdRequest()V
	 /* .line 1239 */
	 v3 = this.this$0;
	 (( com.inneractive.api.ads.InneractiveAdView ) v3 ).requestAd ( ); // invoke-virtual {v3}, Lcom/inneractive/api/ads/InneractiveAdView;->requestAd()V
	 /* .line 1241 */
} // :cond_4
final String v3 = "back"; // const-string v3, "back"
v3 = (( java.lang.String ) v2 ).startsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_5
	 /* .line 1242 */
	 final String v3 = "inneractive"; // const-string v3, "inneractive"
	 final String v4 = "Back Event"; // const-string v4, "Back Event"
	 android.util.Log .i ( v3,v4 );
	 /* .line 1244 */
} // :cond_5
final String v3 = "click"; // const-string v3, "click"
v3 = (( java.lang.String ) v2 ).startsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* .line 1246 */
	 v3 = this.this$0;
	 v3 = 	 com.inneractive.api.ads.InneractiveAdView .access$9 ( v3 );
	 if ( v3 != null) { // if-eqz v3, :cond_6
		 /* .line 1247 */
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 v4 = com.inneractive.api.ads.InneractiveAdView.TEST_CLICK_REPORT_URL_PREFIX;
		 java.lang.String .valueOf ( v4 );
		 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v4 = "cn="; // const-string v4, "cn="
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v4 = this.this$0;
		 com.inneractive.api.ads.InneractiveAdView .access$10 ( v4 );
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v4 = "&ci="; // const-string v4, "&ci="
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 com.inneractive.api.ads.InneractiveAdView .access$8 ( );
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v4 = "&s="; // const-string v4, "&s="
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 com.inneractive.api.ads.InneractiveAdView .access$11 ( );
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v4 = "&ed=2|5|4|1"; // const-string v4, "&ed=2|5|4|1"
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 1253 */
		 /* .local v0, "clickReportURL":Ljava/lang/String; */
	 } // :goto_1
	 try { // :try_start_0
		 com.inneractive.api.ads.InneractiveAdView .httpGetRaw ( v0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .line 1259 */
	 } // :goto_2
	 v3 = this.this$0;
	 com.inneractive.api.ads.InneractiveAdView .access$12 ( v3,p2 );
	 /* .line 1261 */
	 v3 = this.this$0;
	 (( com.inneractive.api.ads.InneractiveAdView ) v3 ).refreshDrawableState ( ); // invoke-virtual {v3}, Lcom/inneractive/api/ads/InneractiveAdView;->refreshDrawableState()V
	 /* .line 1266 */
	 v3 = this.this$0;
	 com.inneractive.api.ads.InneractiveAdView .access$7 ( v3 );
	 if ( v3 != null) { // if-eqz v3, :cond_0
		 /* .line 1270 */
		 try { // :try_start_1
			 v3 = this.this$0;
			 com.inneractive.api.ads.InneractiveAdView .access$7 ( v3 );
			 v4 = this.this$0;
			 /* .line 1271 */
			 final String v3 = "inneractive"; // const-string v3, "inneractive"
			 final String v4 = "onClickAd"; // const-string v4, "onClickAd"
			 android.util.Log .i ( v3,v4 );
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* goto/16 :goto_0 */
			 /* .line 1273 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 /* .line 1275 */
			 /* .local v1, "e":Ljava/lang/Exception; */
			 final String v3 = "inneractive"; // const-string v3, "inneractive"
			 final String v4 = "onClickAd - catch"; // const-string v4, "onClickAd - catch"
			 android.util.Log .w ( v3,v4,v1 );
			 /* goto/16 :goto_0 */
			 /* .line 1250 */
		 } // .end local v0 # "clickReportURL":Ljava/lang/String;
	 } // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_6
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.inneractive.api.ads.InneractiveAdView.CLICK_REPORT_URL_PREFIX;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "cn="; // const-string v4, "cn="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$10 ( v4 );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&ci="; // const-string v4, "&ci="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.inneractive.api.ads.InneractiveAdView .access$8 ( );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&s="; // const-string v4, "&s="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.inneractive.api.ads.InneractiveAdView .access$11 ( );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&ed=2|5|4|1"; // const-string v4, "&ed=2|5|4|1"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .restart local v0 # "clickReportURL":Ljava/lang/String; */
/* .line 1254 */
/* :catch_1 */
/* move-exception v1 */
/* .line 1255 */
/* .restart local v1 # "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
/* .line 1287 */
} // .end local v0 # "clickReportURL":Ljava/lang/String;
} // .end local v1 # "e":Ljava/lang/Exception;
} // .end local v2 # "eventUrl":Ljava/lang/String;
} // :cond_7
v3 = this.this$0;
v3 = com.inneractive.api.ads.InneractiveAdView .access$9 ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_8
/* .line 1288 */
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.inneractive.api.ads.InneractiveAdView.TEST_CLICK_REPORT_URL_PREFIX;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "cn="; // const-string v4, "cn="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$10 ( v4 );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&ci="; // const-string v4, "&ci="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.inneractive.api.ads.InneractiveAdView .access$8 ( );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&s="; // const-string v4, "&s="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.inneractive.api.ads.InneractiveAdView .access$11 ( );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&ed=2|5|4|1"; // const-string v4, "&ed=2|5|4|1"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 1294 */
/* .restart local v0 # "clickReportURL":Ljava/lang/String; */
} // :goto_3
try { // :try_start_2
com.inneractive.api.ads.InneractiveAdView .httpGetRaw ( v0 );
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_3 */
/* .line 1300 */
} // :goto_4
v3 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$12 ( v3,p2 );
/* .line 1302 */
v3 = this.this$0;
(( com.inneractive.api.ads.InneractiveAdView ) v3 ).refreshDrawableState ( ); // invoke-virtual {v3}, Lcom/inneractive/api/ads/InneractiveAdView;->refreshDrawableState()V
/* .line 1307 */
v3 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 1311 */
try { // :try_start_3
v3 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$7 ( v3 );
v4 = this.this$0;
/* .line 1312 */
final String v3 = "inneractive"; // const-string v3, "inneractive"
final String v4 = "onClickAd"; // const-string v4, "onClickAd"
android.util.Log .i ( v3,v4 );
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
/* goto/16 :goto_0 */
/* .line 1314 */
/* :catch_2 */
/* move-exception v1 */
/* .line 1316 */
/* .restart local v1 # "e":Ljava/lang/Exception; */
final String v3 = "inneractive"; // const-string v3, "inneractive"
final String v4 = "onClickAd - catch"; // const-string v4, "onClickAd - catch"
android.util.Log .w ( v3,v4,v1 );
/* goto/16 :goto_0 */
/* .line 1291 */
} // .end local v0 # "clickReportURL":Ljava/lang/String;
} // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_8
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = com.inneractive.api.ads.InneractiveAdView.CLICK_REPORT_URL_PREFIX;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "cn="; // const-string v4, "cn="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.this$0;
com.inneractive.api.ads.InneractiveAdView .access$10 ( v4 );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&ci="; // const-string v4, "&ci="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.inneractive.api.ads.InneractiveAdView .access$8 ( );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&s="; // const-string v4, "&s="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.inneractive.api.ads.InneractiveAdView .access$11 ( );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&ed=2|5|4|1"; // const-string v4, "&ed=2|5|4|1"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .restart local v0 # "clickReportURL":Ljava/lang/String; */
/* .line 1295 */
/* :catch_3 */
/* move-exception v1 */
/* .line 1296 */
/* .restart local v1 # "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
