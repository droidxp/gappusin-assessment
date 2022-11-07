public class inal implements com.a.a.h {
	 /* # interfaces */
	 /* # instance fields */
	 final com.doodlemobile.gamecenter.facebook.stream.e a; //synthetic
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object p0 ) {
		 /* .locals 3 */
		 final String v0 = "stream"; // const-string v0, "stream"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Facebook Error:"; // const-string v2, "Facebook Error:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( com.a.a.d ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lcom/a/a/d;->getMessage()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
		 return;
	 } // .end method
	 public final void a ( java.io.FileNotFoundException p0 ) {
		 /* .locals 3 */
		 final String v0 = "stream"; // const-string v0, "stream"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Resource not found:"; // const-string v2, "Resource not found:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.io.FileNotFoundException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
		 return;
	 } // .end method
	 public final void a ( java.io.IOException p0 ) {
		 /* .locals 3 */
		 final String v0 = "stream"; // const-string v0, "stream"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Network Error:"; // const-string v2, "Network Error:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.io.IOException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
		 return;
	 } // .end method
	 public final void a ( java.lang.String p0 ) {
		 /* .locals 5 */
		 final String v0 = "error"; // const-string v0, "error"
		 final String v0 = ""; // const-string v0, ""
		 final String v0 = "error_msg"; // const-string v0, "error_msg"
		 final String v0 = "error_code"; // const-string v0, "error_code"
		 try { // :try_start_0
			 final String v0 = "false"; // const-string v0, "false"
			 v0 = 			 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* new-instance v0, Lcom/a/a/d; */
				 final String v1 = "request failed"; // const-string v1, "request failed"
				 /* invoke-direct {v0, v1}, Lcom/a/a/d;-><init>(Ljava/lang/String;)V */
				 /* throw v0 */
				 /* :try_end_0 */
				 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .catch Lcom/a/a/d; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 final String v1 = "stream"; // const-string v1, "stream"
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v3 = "JSON Error:"; // const-string v3, "JSON Error:"
				 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( org.json.JSONException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .e ( v1,v0 );
			 } // :goto_0
			 return;
		 } // :cond_0
		 try { // :try_start_1
			 final String v0 = "true"; // const-string v0, "true"
			 v0 = 			 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_6
				 final String v0 = "{value : true}"; // const-string v0, "{value : true}"
			 } // :goto_1
			 /* new-instance v1, Lorg/json/JSONObject; */
			 /* invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
			 final String v0 = "error"; // const-string v0, "error"
			 v0 = 			 (( org.json.JSONObject ) v1 ).has ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 final String v0 = "error"; // const-string v0, "error"
				 (( org.json.JSONObject ) v1 ).getJSONObject ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
				 /* new-instance v1, Lcom/a/a/d; */
				 final String v2 = "message"; // const-string v2, "message"
				 (( org.json.JSONObject ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
				 final String v3 = "type"; // const-string v3, "type"
				 (( org.json.JSONObject ) v0 ).getString ( v3 ); // invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
				 int v3 = 0; // const/4 v3, 0x0
				 /* invoke-direct {v1, v2, v0, v3}, Lcom/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V */
				 /* throw v1 */
				 /* :try_end_1 */
				 /* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catch Lcom/a/a/d; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* :catch_1 */
				 /* move-exception v0 */
				 final String v1 = "stream"; // const-string v1, "stream"
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v3 = "Facebook Error:"; // const-string v3, "Facebook Error:"
				 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( com.a.a.d ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lcom/a/a/d;->getMessage()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .e ( v1,v0 );
			 } // :cond_1
			 try { // :try_start_2
				 final String v0 = "error_code"; // const-string v0, "error_code"
				 v0 = 				 (( org.json.JSONObject ) v1 ).has ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
				 if ( v0 != null) { // if-eqz v0, :cond_2
					 final String v0 = "error_msg"; // const-string v0, "error_msg"
					 v0 = 					 (( org.json.JSONObject ) v1 ).has ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
					 if ( v0 != null) { // if-eqz v0, :cond_2
						 /* new-instance v0, Lcom/a/a/d; */
						 final String v2 = "error_msg"; // const-string v2, "error_msg"
						 (( org.json.JSONObject ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
						 final String v3 = ""; // const-string v3, ""
						 final String v4 = "error_code"; // const-string v4, "error_code"
						 (( org.json.JSONObject ) v1 ).getString ( v4 ); // invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
						 v1 = 						 java.lang.Integer .parseInt ( v1 );
						 /* invoke-direct {v0, v2, v3, v1}, Lcom/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V */
						 /* throw v0 */
					 } // :cond_2
					 final String v0 = "error_code"; // const-string v0, "error_code"
					 v0 = 					 (( org.json.JSONObject ) v1 ).has ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
					 if ( v0 != null) { // if-eqz v0, :cond_3
						 /* new-instance v0, Lcom/a/a/d; */
						 final String v2 = "request failed"; // const-string v2, "request failed"
						 final String v3 = ""; // const-string v3, ""
						 final String v4 = "error_code"; // const-string v4, "error_code"
						 (( org.json.JSONObject ) v1 ).getString ( v4 ); // invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
						 v1 = 						 java.lang.Integer .parseInt ( v1 );
						 /* invoke-direct {v0, v2, v3, v1}, Lcom/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V */
						 /* throw v0 */
					 } // :cond_3
					 final String v0 = "error_msg"; // const-string v0, "error_msg"
					 v0 = 					 (( org.json.JSONObject ) v1 ).has ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
					 if ( v0 != null) { // if-eqz v0, :cond_4
						 /* new-instance v0, Lcom/a/a/d; */
						 final String v2 = "error_msg"; // const-string v2, "error_msg"
						 (( org.json.JSONObject ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
						 /* invoke-direct {v0, v1}, Lcom/a/a/d;-><init>(Ljava/lang/String;)V */
						 /* throw v0 */
					 } // :cond_4
					 final String v0 = "error_reason"; // const-string v0, "error_reason"
					 v0 = 					 (( org.json.JSONObject ) v1 ).has ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
					 if ( v0 != null) { // if-eqz v0, :cond_5
						 /* new-instance v0, Lcom/a/a/d; */
						 final String v2 = "error_reason"; // const-string v2, "error_reason"
						 (( org.json.JSONObject ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
						 /* invoke-direct {v0, v1}, Lcom/a/a/d;-><init>(Ljava/lang/String;)V */
						 /* throw v0 */
						 /* :try_end_2 */
						 /* .catch Lorg/json/JSONException; {:try_start_2 ..:try_end_2} :catch_0 */
						 /* .catch Lcom/a/a/d; {:try_start_2 ..:try_end_2} :catch_1 */
					 } // :cond_5
					 try { // :try_start_3
						 v0 = this.a;
						 (( com.doodlemobile.gamecenter.facebook.stream.e ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/facebook/stream/e;->b()Landroid/app/Activity;
						 final String v2 = "cache.txt"; // const-string v2, "cache.txt"
						 int v3 = 0; // const/4 v3, 0x0
						 (( android.app.Activity ) v0 ).openFileOutput ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/app/Activity;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
						 /* new-instance v2, Ljava/io/BufferedWriter; */
						 /* new-instance v3, Ljava/io/FileWriter; */
						 (( java.io.FileOutputStream ) v0 ).getFD ( ); // invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;
						 /* invoke-direct {v3, v0}, Ljava/io/FileWriter;-><init>(Ljava/io/FileDescriptor;)V */
						 /* invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V */
						 (( java.io.BufferedWriter ) v2 ).write ( p1 ); // invoke-virtual {v2, p1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
						 (( java.io.BufferedWriter ) v2 ).flush ( ); // invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V
						 (( java.io.BufferedWriter ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V
						 /* :try_end_3 */
						 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
						 /* .catch Lorg/json/JSONException; {:try_start_3 ..:try_end_3} :catch_0 */
						 /* .catch Lcom/a/a/d; {:try_start_3 ..:try_end_3} :catch_1 */
					 } // :goto_2
					 try { // :try_start_4
						 com.doodlemobile.gamecenter.facebook.stream.d .a ( v1 );
						 v1 = this.a;
						 (( com.doodlemobile.gamecenter.facebook.stream.e ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/doodlemobile/gamecenter/facebook/stream/e;->b()Landroid/app/Activity;
						 /* new-instance v2, Lcom/doodlemobile/gamecenter/facebook/stream/l; */
						 /* invoke-direct {v2, p0, v0}, Lcom/doodlemobile/gamecenter/facebook/stream/l;-><init>(Lcom/doodlemobile/gamecenter/facebook/stream/i;Ljava/lang/String;)V */
						 (( android.app.Activity ) v1 ).runOnUiThread ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
						 /* goto/16 :goto_0 */
						 /* :catch_2 */
						 /* move-exception v0 */
						 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
						 /* :try_end_4 */
						 /* .catch Lorg/json/JSONException; {:try_start_4 ..:try_end_4} :catch_0 */
						 /* .catch Lcom/a/a/d; {:try_start_4 ..:try_end_4} :catch_1 */
					 } // :cond_6
					 /* move-object v0, p1 */
					 /* goto/16 :goto_1 */
				 } // .end method
				 public final void a ( java.net.MalformedURLException p0 ) {
					 /* .locals 3 */
					 final String v0 = "stream"; // const-string v0, "stream"
					 /* new-instance v1, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v2 = "Invalid URL:"; // const-string v2, "Invalid URL:"
					 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.net.MalformedURLException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
					 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 android.util.Log .e ( v0,v1 );
					 return;
				 } // .end method
