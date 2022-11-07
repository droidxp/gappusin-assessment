public class com.a.f.d {
	 /* # instance fields */
	 java.lang.String a;
	 java.lang.String b;
	 /* # direct methods */
	 public com.a.f.d ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = v0;
		 this.b = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( org.json.JSONObject p0 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 final String v0 = "type"; // const-string v0, "type"
			 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
			 this.a = v0;
			 v0 = this.a;
			 final String v1 = "data_received_success"; // const-string v1, "data_received_success"
			 v0 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* if-nez v0, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
	 } // :cond_0
	 final String v0 = "customsn"; // const-string v0, "customsn"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.b = v0;
	 v0 = this.b;
	 com.a.f.g .b ( v0 );
	 /* :try_end_0 */
	 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
int v0 = 1; // const/4 v0, 0x1
/* :catch_0 */
/* move-exception v0 */
} // .end method
