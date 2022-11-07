public class inal extends com.doodlemobile.gamecenter.c.l {
	 /* # instance fields */
	 private android.content.Context a;
	 private a.a.a.b e;
	 private java.lang.String f;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/c/l;-><init>()V */
		 this.e = v0;
		 this.f = v0;
		 this.a = p1;
		 this.f = p2;
		 final String v0 = "AddFriend"; // const-string v0, "AddFriend"
		 (( com.doodlemobile.gamecenter.c.k ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/c/k;->a(Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final org.apache.http.client.methods.HttpPost a ( ) {
		 /* .locals 5 */
		 /* new-instance v0, La/a/a/c; */
		 /* invoke-direct {v0}, La/a/a/c;-><init>()V */
		 try { // :try_start_0
			 final String v1 = "app-id"; // const-string v1, "app-id"
			 v2 = this.a;
			 com.doodlemobile.gamecenter.cn .a ( v2 );
			 (( a.a.a.c ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, La/a/a/c;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 final String v1 = "mac-address"; // const-string v1, "mac-address"
			 v2 = this.a;
			 com.doodlemobile.gamecenter.cm .a ( v2 );
			 (( com.doodlemobile.gamecenter.cm ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/gamecenter/cm;->b()Ljava/lang/String;
			 (( a.a.a.c ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, La/a/a/c;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 final String v1 = "device"; // const-string v1, "device"
			 v2 = this.a;
			 com.doodlemobile.gamecenter.cm .a ( v2 );
			 com.doodlemobile.gamecenter.cm .c ( );
			 (( a.a.a.c ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, La/a/a/c;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 final String v1 = "version"; // const-string v1, "version"
			 v2 = this.a;
			 com.doodlemobile.gamecenter.cm .a ( v2 );
			 com.doodlemobile.gamecenter.cm .d ( );
			 (( a.a.a.c ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, La/a/a/c;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 com.doodlemobile.gamecenter.b.b .k ( );
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 final String v1 = "facebook-id"; // const-string v1, "facebook-id"
				 com.doodlemobile.gamecenter.b.b .k ( );
				 (( a.a.a.c ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, La/a/a/c;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 } // :cond_0
			 final String v1 = "query-user-id"; // const-string v1, "query-user-id"
			 v2 = this.f;
			 (( a.a.a.c ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, La/a/a/c;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 final String v1 = "user-id"; // const-string v1, "user-id"
			 com.doodlemobile.gamecenter.b.b .f ( );
			 (( a.a.a.c ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, La/a/a/c;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* new-instance v1, Ljava/util/ArrayList; */
		 int v2 = 4; // const/4 v2, 0x4
		 /* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V */
		 /* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
		 final String v3 = "api"; // const-string v3, "api"
		 final String v4 = "addfriend"; // const-string v4, "addfriend"
		 com.doodlemobile.gamecenter.c.m .a ( v4 );
		 /* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 /* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
		 final String v3 = "param"; // const-string v3, "param"
		 (( a.a.a.c ) v0 ).toString ( ); // invoke-virtual {v0}, La/a/a/c;->toString()Ljava/lang/String;
		 com.doodlemobile.gamecenter.c.m .a ( v4 );
		 /* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 /* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
		 final String v3 = "cipher"; // const-string v3, "cipher"
		 final String v4 = "ciphered"; // const-string v4, "ciphered"
		 /* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "AddFriend param: "; // const-string v3, "AddFriend param: "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( a.a.a.c ) v0 ).toString ( ); // invoke-virtual {v0}, La/a/a/c;->toString()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.doodlemobile.gamecenter.e.b .a ( v0 );
		 try { // :try_start_1
			 v0 = this.d;
			 /* new-instance v2, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
			 final String v3 = "utf-8"; // const-string v3, "utf-8"
			 /* invoke-direct {v2, v1, v3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
			 (( org.apache.http.client.methods.HttpPost ) v0 ).setEntity ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
			 /* :try_end_1 */
			 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 ..:try_end_1} :catch_1 */
		 } // :goto_1
		 v0 = this.d;
		 /* :catch_0 */
		 /* move-exception v1 */
		 (( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
		 /* :catch_1 */
		 /* move-exception v0 */
		 (( java.io.UnsupportedEncodingException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
	 } // .end method
	 public final Boolean a ( Object p0 ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 final String v0 = "user-headicon-timestamp"; // const-string v0, "user-headicon-timestamp"
		 final String v0 = "feature-filename"; // const-string v0, "feature-filename"
		 final String v0 = "facebook-id"; // const-string v0, "facebook-id"
		 try { // :try_start_0
			 (( com.doodlemobile.gamecenter.c.n ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/gamecenter/c/n;->b()J
			 /* move-result-wide v0 */
			 /* int-to-long v2, v2 */
			 /* cmp-long v0, v0, v2 */
			 /* if-nez v0, :cond_5 */
			 (( com.doodlemobile.gamecenter.c.n ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/gamecenter/c/n;->c()La/a/a/c;
			 (( a.a.a.c ) v0 ).a ( ); // invoke-virtual {v0}, La/a/a/c;->a()Ljava/lang/String;
			 this.c = v1;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
			 try { // :try_start_1
				 final String v1 = "user-id"; // const-string v1, "user-id"
				 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
				 /* check-cast p0, Ljava/lang/String; */
				 if ( p0 != null) { // if-eqz p0, :cond_0
					 com.doodlemobile.gamecenter.b.b .a ( p0 );
					 com.doodlemobile.gamecenter.b.b .a ( );
				 } // :cond_0
				 final String v1 = "user-nickname"; // const-string v1, "user-nickname"
				 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
				 /* check-cast p0, Ljava/lang/String; */
				 if ( p0 != null) { // if-eqz p0, :cond_1
					 com.doodlemobile.gamecenter.b.b .c ( p0 );
				 } // :cond_1
				 final String v1 = "user-headicon-timestamp"; // const-string v1, "user-headicon-timestamp"
				 v1 = 				 (( a.a.a.c ) v0 ).containsKey ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->containsKey(Ljava/lang/Object;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_2
					 final String v1 = "user-headicon-timestamp"; // const-string v1, "user-headicon-timestamp"
					 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
					 /* check-cast p0, Ljava/lang/Long; */
					 (( java.lang.Long ) p0 ).longValue ( ); // invoke-virtual {p0}, Ljava/lang/Long;->longValue()J
					 /* move-result-wide v1 */
					 com.doodlemobile.gamecenter.b.c .c ( v1,v2 );
				 } // :cond_2
				 final String v1 = "facebook-id"; // const-string v1, "facebook-id"
				 v1 = 				 (( a.a.a.c ) v0 ).containsKey ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->containsKey(Ljava/lang/Object;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_3
					 final String v1 = "facebook-id"; // const-string v1, "facebook-id"
					 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
					 /* check-cast p0, Ljava/lang/String; */
					 com.doodlemobile.gamecenter.b.b .d ( p0 );
				 } // :cond_3
				 final String v1 = "feature-timestamp"; // const-string v1, "feature-timestamp"
				 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
				 /* check-cast p0, Ljava/lang/Long; */
				 (( java.lang.Long ) p0 ).longValue ( ); // invoke-virtual {p0}, Ljava/lang/Long;->longValue()J
				 /* move-result-wide v1 */
				 com.doodlemobile.gamecenter.b.c .b ( v1,v2 );
				 final String v1 = "feature-filename"; // const-string v1, "feature-filename"
				 v1 = 				 (( a.a.a.c ) v0 ).containsKey ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->containsKey(Ljava/lang/Object;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_4
					 final String v1 = "feature-filename"; // const-string v1, "feature-filename"
					 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
					 /* check-cast p0, Ljava/lang/String; */
					 if ( p0 != null) { // if-eqz p0, :cond_4
						 com.doodlemobile.gamecenter.b.b .b ( p0 );
					 } // :cond_4
					 final String v1 = "all-timestamp"; // const-string v1, "all-timestamp"
					 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
					 /* check-cast p0, Ljava/lang/Long; */
					 (( java.lang.Long ) p0 ).longValue ( ); // invoke-virtual {p0}, Ljava/lang/Long;->longValue()J
					 /* move-result-wide v0 */
					 com.doodlemobile.gamecenter.b.c .a ( v0,v1 );
					 /* :try_end_1 */
					 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
					 int v0 = 1; // const/4 v0, 0x1
				 } // :goto_0
				 /* :catch_0 */
				 /* move-exception v0 */
				 try { // :try_start_2
					 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
					 /* move v0, v4 */
				 } // :cond_5
				 /* iput v0, p0, Lcom/doodlemobile/gamecenter/c/k;->b:I */
				 /* :try_end_2 */
				 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
				 /* move v0, v4 */
				 /* :catch_1 */
				 /* move-exception v0 */
				 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
				 /* move v0, v4 */
			 } // .end method
			 public final Integer b ( ) {
				 /* .locals 1 */
				 /* const v0, 0xea60 */
			 } // .end method
			 public final Integer c ( ) {
				 /* .locals 1 */
				 /* const v0, 0xea60 */
			 } // .end method
