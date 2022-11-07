public class com.doodlemobile.gamecenter.facebook.stream.e extends com.doodlemobile.gamecenter.facebook.stream.g {
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.facebook.stream.e ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/facebook/stream/g;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 3 */
		 v0 = this.a;
		 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->a()Landroid/webkit/WebView;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/facebook/stream/j; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/facebook/stream/j;-><init>(Lcom/doodlemobile/gamecenter/facebook/stream/e;)V */
		 final String v2 = "app"; // const-string v2, "app"
		 (( android.webkit.WebView ) v0 ).addJavascriptInterface ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
		 try { // :try_start_0
			 (( com.doodlemobile.gamecenter.facebook.stream.e ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/facebook/stream/e;->b()Landroid/app/Activity;
			 final String v1 = "cache.txt"; // const-string v1, "cache.txt"
			 (( android.app.Activity ) v0 ).openFileInput ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
			 /* new-instance v1, Ljava/io/BufferedReader; */
			 /* new-instance v2, Ljava/io/InputStreamReader; */
			 /* invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
			 /* invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 } // :goto_0
		 v2 = 		 (( java.io.BufferedReader ) v1 ).ready ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->ready()Z
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 (( java.io.BufferedReader ) v1 ).readLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
		 } // :cond_0
	 } // :goto_1
	 (( com.doodlemobile.gamecenter.facebook.stream.e ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/facebook/stream/e;->b()Landroid/app/Activity;
	 com.doodlemobile.gamecenter.facebook.stream.h .a ( v0 );
	 (( com.doodlemobile.gamecenter.facebook.stream.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/facebook/stream/h;->a()Lcom/a/a/g;
	 /* new-instance v1, Lcom/a/a/k; */
	 /* invoke-direct {v1, v0}, Lcom/a/a/k;-><init>(Lcom/a/a/g;)V */
	 final String v0 = "me/home"; // const-string v0, "me/home"
	 /* new-instance v2, Lcom/doodlemobile/gamecenter/facebook/stream/i; */
	 /* invoke-direct {v2, p0}, Lcom/doodlemobile/gamecenter/facebook/stream/i;-><init>(Lcom/doodlemobile/gamecenter/facebook/stream/e;)V */
	 (( com.a.a.k ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/a/a/k;->a(Ljava/lang/String;Lcom/a/a/h;)V
	 return;
} // :cond_1
try { // :try_start_1
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* new-instance v1, Lorg/json/JSONObject; */
		 /* invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
		 v0 = this.a;
		 com.doodlemobile.gamecenter.facebook.stream.d .a ( v1 );
		 (( com.doodlemobile.gamecenter.facebook.stream.m ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/facebook/stream/m;->b(Ljava/lang/String;)V
		 /* :try_end_1 */
		 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 (( org.json.JSONException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
	 } // .end method
