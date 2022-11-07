class com.mobfox.video.sdk.MobFoxWebFrame$LoadUrlTask extends android.os.AsyncTask {
	 /* .source "MobFoxWebFrame.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxWebFrame; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "LoadUrlTask" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Void;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxWebFrame this$0; //synthetic
/* # direct methods */
private com.mobfox.video.sdk.MobFoxWebFrame$LoadUrlTask ( ) {
/* .locals 0 */
/* .prologue */
/* .line 125 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
return;
} // .end method
 com.mobfox.video.sdk.MobFoxWebFrame$LoadUrlTask ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 125 */
/* invoke-direct {p0, p1}, Lcom/mobfox/video/sdk/MobFoxWebFrame$LoadUrlTask;-><init>(Lcom/mobfox/video/sdk/MobFoxWebFrame;)V */
return;
} // .end method
/* # virtual methods */
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/String; */
(( com.mobfox.video.sdk.MobFoxWebFrame$LoadUrlTask ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lcom/mobfox/video/sdk/MobFoxWebFrame$LoadUrlTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;
} // .end method
protected java.lang.String doInBackground ( java.lang.String...p0 ) {
/* .locals 12 */
/* .param p1, "urls" # [Ljava/lang/String; */
/* .prologue */
int v10 = 3; // const/4 v10, 0x3
int v9 = 0; // const/4 v9, 0x0
/* .line 128 */
/* aget-object v3, p1, v9 */
/* .line 129 */
/* .local v3, "loadingUrl":Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
/* .line 131 */
/* .local v7, "url":Ljava/net/URL; */
try { // :try_start_0
/* new-instance v8, Ljava/net/URL; */
/* invoke-direct {v8, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 135 */
} // .end local v7 # "url":Ljava/net/URL;
/* .local v8, "url":Ljava/net/URL; */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
v9 = android.util.Log .isLoggable ( v9,v10 );
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 136 */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
/* new-instance v10, Ljava/lang/StringBuilder; */
final String v11 = "Checking URL redirect:"; // const-string v11, "Checking URL redirect:"
/* invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v10 ).append ( v3 ); // invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v9,v10 );
/* .line 139 */
} // :cond_0
int v6 = -1; // const/4 v6, -0x1
/* .line 140 */
/* .local v6, "statusCode":I */
int v1 = 0; // const/4 v1, 0x0
/* .line 141 */
/* .local v1, "connection":Ljava/net/HttpURLConnection; */
(( java.net.URL ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/net/URL;->toString()Ljava/lang/String;
/* .line 143 */
/* .local v4, "nextLocation":Ljava/lang/String; */
/* new-instance v5, Ljava/util/HashSet; */
/* invoke-direct {v5}, Ljava/util/HashSet;-><init>()V */
/* .line 144 */
/* .local v5, "redirectLocations":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* .line 148 */
} // :goto_0
try { // :try_start_1
(( java.net.URL ) v8 ).openConnection ( ); // invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* move-object v0, v9 */
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* move-object v1, v0 */
/* .line 149 */
final String v9 = "User-Agent"; // const-string v9, "User-Agent"
/* .line 150 */
v10 = this.this$0;
com.mobfox.video.sdk.MobFoxWebFrame .access$0 ( v10 );
/* .line 149 */
(( java.net.HttpURLConnection ) v1 ).setRequestProperty ( v9, v10 ); // invoke-virtual {v1, v9, v10}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 151 */
int v9 = 0; // const/4 v9, 0x0
(( java.net.HttpURLConnection ) v1 ).setInstanceFollowRedirects ( v9 ); // invoke-virtual {v1, v9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
/* .line 153 */
v6 = (( java.net.HttpURLConnection ) v1 ).getResponseCode ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
/* .line 154 */
/* const/16 v9, 0xc8 */
/* if-ne v6, v9, :cond_4 */
/* .line 155 */
(( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* move-object v7, v8 */
/* .line 176 */
} // .end local v8 # "url":Ljava/net/URL;
/* .restart local v7 # "url":Ljava/net/URL; */
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 177 */
(( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 180 */
} // .end local v1 # "connection":Ljava/net/HttpURLConnection;
} // .end local v3 # "loadingUrl":Ljava/lang/String;
} // .end local v4 # "nextLocation":Ljava/lang/String;
} // .end local v5 # "redirectLocations":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
} // .end local v6 # "statusCode":I
} // :cond_2
} // :goto_1
/* .line 132 */
/* .restart local v3 # "loadingUrl":Ljava/lang/String; */
/* :catch_0 */
/* move-exception v2 */
/* .line 133 */
/* .local v2, "e":Ljava/net/MalformedURLException; */
if ( v3 != null) { // if-eqz v3, :cond_3
} // .end local v3 # "loadingUrl":Ljava/lang/String;
} // :goto_2
/* move-object v4, v3 */
/* .restart local v3 # "loadingUrl":Ljava/lang/String; */
} // :cond_3
final String v3 = ""; // const-string v3, ""
/* .line 158 */
} // .end local v2 # "e":Ljava/net/MalformedURLException;
} // .end local v7 # "url":Ljava/net/URL;
/* .restart local v1 # "connection":Ljava/net/HttpURLConnection; */
/* .restart local v4 # "nextLocation":Ljava/lang/String; */
/* .restart local v5 # "redirectLocations":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* .restart local v6 # "statusCode":I */
/* .restart local v8 # "url":Ljava/net/URL; */
} // :cond_4
try { // :try_start_2
final String v9 = "location"; // const-string v9, "location"
(( java.net.HttpURLConnection ) v1 ).getHeaderField ( v9 ); // invoke-virtual {v1, v9}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 159 */
(( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
v9 = /* .line 160 */
/* if-nez v9, :cond_7 */
/* .line 161 */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
int v10 = 3; // const/4 v10, 0x3
v9 = android.util.Log .isLoggable ( v9,v10 );
if ( v9 != null) { // if-eqz v9, :cond_5
/* .line 162 */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
final String v10 = "URL redirect cycle detected"; // const-string v10, "URL redirect cycle detected"
android.util.Log .d ( v9,v10 );
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 176 */
} // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 177 */
(( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 164 */
} // :cond_6
final String v4 = ""; // const-string v4, ""
} // .end local v4 # "nextLocation":Ljava/lang/String;
/* move-object v7, v8 */
} // .end local v8 # "url":Ljava/net/URL;
/* .restart local v7 # "url":Ljava/net/URL; */
/* .line 167 */
} // .end local v7 # "url":Ljava/net/URL;
/* .restart local v4 # "nextLocation":Ljava/lang/String; */
/* .restart local v8 # "url":Ljava/net/URL; */
} // :cond_7
try { // :try_start_3
/* new-instance v7, Ljava/net/URL; */
/* invoke-direct {v7, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 169 */
} // .end local v8 # "url":Ljava/net/URL;
/* .restart local v7 # "url":Ljava/net/URL; */
/* const/16 v9, 0x12e */
/* if-eq v6, v9, :cond_8 */
/* .line 170 */
/* const/16 v9, 0x12d */
/* if-eq v6, v9, :cond_8 */
/* .line 171 */
/* const/16 v9, 0x133 */
/* if-eq v6, v9, :cond_8 */
/* .line 172 */
/* const/16 v9, 0x12f */
/* if-ne v6, v9, :cond_1 */
} // :cond_8
/* move-object v8, v7 */
} // .end local v7 # "url":Ljava/net/URL;
/* .restart local v8 # "url":Ljava/net/URL; */
/* .line 173 */
/* :catch_1 */
/* move-exception v2 */
/* .line 174 */
/* .local v2, "e":Ljava/io/IOException; */
if ( v4 != null) { // if-eqz v4, :cond_a
/* .line 176 */
} // .end local v4 # "nextLocation":Ljava/lang/String;
} // :goto_3
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 177 */
(( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
} // :cond_9
/* move-object v7, v8 */
/* .line 174 */
} // .end local v8 # "url":Ljava/net/URL;
/* .restart local v7 # "url":Ljava/net/URL; */
} // .end local v7 # "url":Ljava/net/URL;
/* .restart local v4 # "nextLocation":Ljava/lang/String; */
/* .restart local v8 # "url":Ljava/net/URL; */
} // :cond_a
try { // :try_start_4
final String v4 = ""; // const-string v4, ""
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 175 */
} // .end local v2 # "e":Ljava/io/IOException;
/* :catchall_0 */
/* move-exception v9 */
/* .line 176 */
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 177 */
(( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 178 */
} // :cond_b
/* throw v9 */
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, Ljava/lang/String; */
(( com.mobfox.video.sdk.MobFoxWebFrame$LoadUrlTask ) p0 ).onPostExecute ( p1 ); // invoke-virtual {p0, p1}, Lcom/mobfox/video/sdk/MobFoxWebFrame$LoadUrlTask;->onPostExecute(Ljava/lang/String;)V
return;
} // .end method
protected void onPostExecute ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 185 */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = ""; // const-string v0, ""
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 186 */
} // :cond_0
final String p1 = "about:blank"; // const-string p1, "about:blank"
/* .line 188 */
} // :cond_1
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 189 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Show URL: "; // const-string v2, "Show URL: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 191 */
} // :cond_2
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxWebFrame .access$1 ( v0 );
(( com.mobfox.video.sdk.MobFoxWebViewClient ) v0 ).setAllowedUrl ( p1 ); // invoke-virtual {v0, p1}, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->setAllowedUrl(Ljava/lang/String;)V
/* .line 192 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxWebFrame .access$2 ( v0 );
(( android.webkit.WebView ) v0 ).loadUrl ( p1 ); // invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 193 */
v0 = this.this$0;
(( com.mobfox.video.sdk.MobFoxWebFrame ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->requestLayout()V
/* .line 195 */
return;
} // .end method
