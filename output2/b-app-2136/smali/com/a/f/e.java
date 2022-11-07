public class com.a.f.e {
	 /* # instance fields */
	 java.lang.String a;
	 java.lang.String b;
	 java.lang.String c;
	 java.lang.String d;
	 java.lang.String e;
	 java.lang.String f;
	 java.lang.String g;
	 java.lang.String h;
	 /* # direct methods */
	 public com.a.f.e ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = v0;
		 this.b = v0;
		 this.c = v0;
		 this.d = v0;
		 this.e = v0;
		 this.f = v0;
		 this.g = v0;
		 this.h = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( org.json.JSONObject p0 ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 final String v0 = "type"; // const-string v0, "type"
			 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
			 this.a = v0;
			 v0 = this.a;
			 final String v1 = "serverback"; // const-string v1, "serverback"
			 v0 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* if-nez v0, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
	 } // :cond_0
	 final String v0 = "updatetype"; // const-string v0, "updatetype"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.a = v0;
	 v0 = this.a;
	 final String v1 = ""; // const-string v1, ""
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 com.a.f.g .c ( );
		 this.a = v0;
	 } // :cond_1
	 final String v0 = "customsn"; // const-string v0, "customsn"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.b = v0;
	 v0 = this.b;
	 final String v1 = ""; // const-string v1, ""
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 com.a.f.g .b ( );
		 this.b = v0;
	 } // :cond_2
	 final String v0 = "updateurl"; // const-string v0, "updateurl"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.c = v0;
	 v0 = this.c;
	 final String v1 = ""; // const-string v1, ""
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 com.a.f.g .e ( );
		 this.c = v0;
	 } // :cond_3
	 final String v0 = "backupdns"; // const-string v0, "backupdns"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.d = v0;
	 v0 = this.d;
	 final String v1 = ""; // const-string v1, ""
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 com.a.f.g .d ( );
		 this.d = v0;
	 } // :cond_4
	 final String v0 = "payappsn"; // const-string v0, "payappsn"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.e = v0;
	 v0 = this.e;
	 final String v1 = ""; // const-string v1, ""
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_5
		 com.a.f.g .k ( );
		 this.e = v0;
	 } // :cond_5
	 final String v0 = "appstandard"; // const-string v0, "appstandard"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.f = v0;
	 v0 = this.f;
	 final String v1 = ""; // const-string v1, ""
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_6
		 com.a.f.g .h ( );
		 this.f = v0;
	 } // :cond_6
	 final String v0 = "moregame"; // const-string v0, "moregame"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.g = v0;
	 v0 = this.g;
	 final String v1 = ""; // const-string v1, ""
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_7
		 com.a.f.g .i ( );
		 this.g = v0;
	 } // :cond_7
	 v0 = this.g;
	 final String v1 = "1"; // const-string v1, "1"
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_8
		 final String v0 = "moregame_url"; // const-string v0, "moregame_url"
		 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
		 this.h = v0;
		 v0 = this.h;
		 final String v1 = ""; // const-string v1, ""
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_8
			 com.a.f.g .j ( );
			 this.h = v0;
		 } // :cond_8
		 v0 = this.a;
		 com.a.f.g .c ( v0 );
		 v0 = this.b;
		 com.a.f.g .b ( v0 );
		 v0 = this.d;
		 com.a.f.g .d ( v0 );
		 v0 = this.c;
		 com.a.f.g .e ( v0 );
		 v0 = this.e;
		 com.a.f.g .j ( v0 );
		 v0 = this.f;
		 com.a.f.g .i ( v0 );
		 v0 = this.g;
		 com.a.f.g .k ( v0 );
		 v0 = this.h;
		 com.a.f.g .l ( v0 );
		 /* :try_end_0 */
		 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_1
	 int v0 = 1; // const/4 v0, 0x1
	 /* goto/16 :goto_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 v1 = java.lang.System.out;
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "ex=========="; // const-string v3, "ex=========="
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( java.io.PrintStream ) v1 ).println ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
} // .end method
