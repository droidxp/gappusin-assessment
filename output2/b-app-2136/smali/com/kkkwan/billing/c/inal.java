public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 10 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 /* new-instance v1, Lcom/kkkwan/billing/h/g; */
			 /* invoke-direct {v1}, Lcom/kkkwan/billing/h/g;-><init>()V */
			 /* new-instance v2, Lcom/kkkwan/billing/h/h; */
			 /* invoke-direct {v2}, Lcom/kkkwan/billing/h/h;-><init>()V */
			 com.kkkwan.billing.h.g .a ( p0 );
			 com.kkkwan.billing.h.g .b ( p0 );
			 (( com.kkkwan.billing.h.g ) v1 ).c ( p0 ); // invoke-virtual {v1, p0}, Lcom/kkkwan/billing/h/g;->c(Landroid/content/Context;)Ljava/lang/String;
			 java.lang.System .currentTimeMillis ( );
			 /* move-result-wide v5 */
			 java.lang.String .valueOf ( v5,v6 );
			 (( com.kkkwan.billing.h.h ) v2 ).a ( p0 ); // invoke-virtual {v2, p0}, Lcom/kkkwan/billing/h/h;->a(Landroid/content/Context;)Ljava/lang/String;
			 (( com.kkkwan.billing.h.h ) v2 ).b ( p0 ); // invoke-virtual {v2, p0}, Lcom/kkkwan/billing/h/h;->b(Landroid/content/Context;)Ljava/lang/String;
			 /* new-instance v7, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v7 ).append ( v1 ); // invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v8 = "|"; // const-string v8, "|"
			 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v8 = "|"; // const-string v8, "|"
			 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v7 ).append ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.kkkwan.billing.h.a.c .a ( v7 );
			 /* new-instance v8, Ljava/util/HashMap; */
			 /* invoke-direct {v8}, Ljava/util/HashMap;-><init>()V */
			 final String v9 = "oper"; // const-string v9, "oper"
			 final String v3 = "phone"; // const-string v3, "phone"
			 final String v3 = "uname"; // const-string v3, "uname"
			 final String v1 = "time"; // const-string v1, "time"
			 final String v1 = "from_id"; // const-string v1, "from_id"
			 final String v1 = "game_id"; // const-string v1, "game_id"
			 final String v1 = "key"; // const-string v1, "key"
			 /* new-instance v1, Lcom/kkkwan/billing/h/d; */
			 /* invoke-direct {v1}, Lcom/kkkwan/billing/h/d;-><init>()V */
			 final String v2 = "http://121.11.69.16:6080/?ct=info&ac=index"; // const-string v2, "http://121.11.69.16:6080/?ct=info&ac=index"
			 int v3 = 0; // const/4 v3, 0x0
			 (( com.kkkwan.billing.h.d ) v1 ).a ( p0, v2, v8, v3 ); // invoke-virtual {v1, p0, v2, v8, v3}, Lcom/kkkwan/billing/h/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Landroid/os/Handler;)Ljava/lang/String;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 final String v2 = ""; // const-string v2, ""
				 v2 = 				 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 /* if-nez v2, :cond_0 */
				 /* new-instance v2, Lorg/json/JSONObject; */
				 /* invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
				 final String v3 = "code"; // const-string v3, "code"
				 com.kkkwan.billing.h.e .a ( v2,v3 );
				 final String v3 = "0"; // const-string v3, "0"
				 v2 = 				 (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 if ( v2 != null) { // if-eqz v2, :cond_0
					 /* new-instance v2, Lcom/kkkwan/billing/h/c; */
					 /* invoke-direct {v2}, Lcom/kkkwan/billing/h/c;-><init>()V */
					 /* new-instance v3, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
					 v4 = com.kkkwan.billing.b.a.a;
					 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
					 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 v4 = java.io.File.separator;
					 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 v4 = com.kkkwan.billing.b.a.b;
					 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 (( com.kkkwan.billing.h.c ) v2 ).a ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Lcom/kkkwan/billing/h/c;->a(Ljava/lang/String;Ljava/lang/String;)Z
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
					 int v0 = 1; // const/4 v0, 0x1
				 } // :cond_0
			 } // :goto_0
			 /* :catch_0 */
			 /* move-exception v1 */
			 (( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
		 } // .end method
		 public static com.kkkwan.billing.b.b b ( android.content.Context p0 ) {
			 /* .locals 19 */
			 try { // :try_start_0
				 /* new-instance v2, Lcom/kkkwan/billing/h/c; */
				 /* invoke-direct {v2}, Lcom/kkkwan/billing/h/c;-><init>()V */
				 /* new-instance v3, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
				 v4 = com.kkkwan.billing.b.a.a;
				 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
				 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 v4 = java.io.File.separator;
				 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 v4 = com.kkkwan.billing.b.a.b;
				 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 (( com.kkkwan.billing.h.c ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/kkkwan/billing/h/c;->a(Ljava/lang/String;)Ljava/lang/String;
				 final String v3 = "PipeMgr"; // const-string v3, "PipeMgr"
				 /* new-instance v4, Ljava/lang/StringBuilder; */
				 final String v5 = "\u672c\u5730\u6570\u636eresult="; // const-string v5, "\u672c\u5730\u6570\u636eresult="
				 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v3,v4 );
				 if ( v2 != null) { // if-eqz v2, :cond_1
					 final String v3 = ""; // const-string v3, ""
					 v3 = 					 (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 /* if-nez v3, :cond_1 */
					 /* new-instance v3, Lorg/json/JSONObject; */
					 /* invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
					 final String v2 = "code"; // const-string v2, "code"
					 com.kkkwan.billing.h.e .a ( v3,v2 );
					 final String v4 = "0"; // const-string v4, "0"
					 v2 = 					 (( java.lang.String ) v4 ).equals ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 if ( v2 != null) { // if-eqz v2, :cond_1
						 final String v2 = "data"; // const-string v2, "data"
						 com.kkkwan.billing.h.e .a ( v3,v2 );
						 /* new-instance v3, Lorg/json/JSONObject; */
						 /* invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
						 final String v2 = "upline"; // const-string v2, "upline"
						 com.kkkwan.billing.h.e .a ( v3,v2 );
						 final String v2 = "pipelineList"; // const-string v2, "pipelineList"
						 com.kkkwan.billing.h.e .a ( v3,v2 );
						 /* new-instance v3, Ljava/util/ArrayList; */
						 /* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
						 /* new-instance v5, Lorg/json/JSONArray; */
						 /* invoke-direct {v5, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V */
						 int v2 = 0; // const/4 v2, 0x0
					 } // :goto_0
					 v6 = 					 (( org.json.JSONArray ) v5 ).length ( ); // invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
					 /* if-ge v2, v6, :cond_0 */
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v7 = "id"; // const-string v7, "id"
					 com.kkkwan.billing.h.e .a ( v6,v7 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v8 = "name"; // const-string v8, "name"
					 com.kkkwan.billing.h.e .a ( v7,v8 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v9 = "pipe"; // const-string v9, "pipe"
					 com.kkkwan.billing.h.e .a ( v8,v9 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v10 = "shield"; // const-string v10, "shield"
					 com.kkkwan.billing.h.e .a ( v9,v10 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v11 = "usable"; // const-string v11, "usable"
					 com.kkkwan.billing.h.e .a ( v10,v11 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v12 = "month_usable"; // const-string v12, "month_usable"
					 com.kkkwan.billing.h.e .a ( v11,v12 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v13 = "fee"; // const-string v13, "fee"
					 com.kkkwan.billing.h.e .a ( v12,v13 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v14 = "orderid"; // const-string v14, "orderid"
					 com.kkkwan.billing.h.e .a ( v13,v14 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v15 = "type"; // const-string v15, "type"
					 com.kkkwan.billing.h.e .a ( v14,v15 );
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v16 = "user_day_usable"; // const-string v16, "user_day_usable"
					 /* invoke-static/range {v15 ..v16}, Lcom/kkkwan/billing/h/e;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String; */
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v17 = "user_month_usable"; // const-string v17, "user_month_usable"
					 /* invoke-static/range {v16 ..v17}, Lcom/kkkwan/billing/h/e;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String; */
					 (( org.json.JSONArray ) v5 ).getJSONObject ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
					 final String v18 = "download_url"; // const-string v18, "download_url"
					 /* invoke-static/range {v17 ..v18}, Lcom/kkkwan/billing/h/e;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String; */
					 /* new-instance v18, Lcom/kkkwan/billing/b/c; */
					 /* invoke-direct/range {v18 ..v18}, Lcom/kkkwan/billing/b/c;-><init>()V */
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/kkkwan/billing/b/c;->a(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).b ( v7 ); // invoke-virtual {v0, v7}, Lcom/kkkwan/billing/b/c;->b(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).c ( v8 ); // invoke-virtual {v0, v8}, Lcom/kkkwan/billing/b/c;->c(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).d ( v9 ); // invoke-virtual {v0, v9}, Lcom/kkkwan/billing/b/c;->d(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).e ( v10 ); // invoke-virtual {v0, v10}, Lcom/kkkwan/billing/b/c;->e(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).f ( v11 ); // invoke-virtual {v0, v11}, Lcom/kkkwan/billing/b/c;->f(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).g ( v12 ); // invoke-virtual {v0, v12}, Lcom/kkkwan/billing/b/c;->g(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).h ( v13 ); // invoke-virtual {v0, v13}, Lcom/kkkwan/billing/b/c;->h(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).i ( v14 ); // invoke-virtual {v0, v14}, Lcom/kkkwan/billing/b/c;->i(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 (( com.kkkwan.billing.b.c ) v0 ).j ( v15 ); // invoke-virtual {v0, v15}, Lcom/kkkwan/billing/b/c;->j(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 /* move-object/from16 v1, v16 */
					 (( com.kkkwan.billing.b.c ) v0 ).k ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/b/c;->k(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 /* move-object/from16 v1, v17 */
					 (( com.kkkwan.billing.b.c ) v0 ).l ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/b/c;->l(Ljava/lang/String;)V
					 /* move-object/from16 v0, v18 */
					 /* add-int/lit8 v2, v2, 0x1 */
					 /* goto/16 :goto_0 */
				 } // :cond_0
				 /* new-instance v2, Lcom/kkkwan/billing/b/b; */
				 /* invoke-direct {v2}, Lcom/kkkwan/billing/b/b;-><init>()V */
				 (( com.kkkwan.billing.b.b ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lcom/kkkwan/billing/b/b;->a(Ljava/lang/String;)V
				 (( com.kkkwan.billing.b.b ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/kkkwan/billing/b/b;->a(Ljava/util/List;)V
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :goto_1
			 /* :catch_0 */
			 /* move-exception v2 */
			 (( java.lang.Exception ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
		 } // :cond_1
		 int v2 = 0; // const/4 v2, 0x0
	 } // .end method
	 /* # virtual methods */
	 public final java.util.List a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 16 */
		 try { // :try_start_0
			 /* invoke-static/range {p1 ..p1}, Lcom/kkkwan/billing/c/f;->b(Landroid/content/Context;)Lcom/kkkwan/billing/b/b; */
			 (( com.kkkwan.billing.b.b ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/kkkwan/billing/b/b;->b()Ljava/util/List;
			 /* new-instance v8, Lcom/kkkwan/billing/a; */
			 /* move-object/from16 v0, p1 */
			 /* invoke-direct {v8, v0}, Lcom/kkkwan/billing/a;-><init>(Landroid/content/Context;)V */
			 /* invoke-static/range {p1 ..p1}, Lcom/kkkwan/billing/c/i;->a(Landroid/content/Context;)Ljava/util/List; */
			 /* new-instance v10, Ljava/util/ArrayList; */
			 /* invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V */
			 final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 final String v3 = "\u6392\u9664\u524dpipelines.toString()="; // const-string v3, "\u6392\u9664\u524dpipelines.toString()="
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.Object ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.kkkwan.billing.h.f .a ( v1,v2 );
			 final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 final String v3 = "pipelines.size()="; // const-string v3, "pipelines.size()="
			 v3 = 			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.kkkwan.billing.h.f .a ( v1,v2 );
			 int v1 = 0; // const/4 v1, 0x0
			 /* move v6, v1 */
		 v1 = 		 } // :goto_0
		 /* if-ge v6, v1, :cond_6 */
		 final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "i="; // const-string v3, "i="
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v1,v2 );
		 /* check-cast v1, Lcom/kkkwan/billing/b/c; */
		 (( com.kkkwan.billing.b.c ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/kkkwan/billing/b/c;->a()Ljava/lang/String;
		 (( com.kkkwan.billing.b.c ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/kkkwan/billing/b/c;->g()Ljava/lang/String;
		 (( com.kkkwan.billing.b.c ) v1 ).h ( ); // invoke-virtual {v1}, Lcom/kkkwan/billing/b/c;->h()Ljava/lang/String;
		 (( com.kkkwan.billing.b.c ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/kkkwan/billing/b/c;->c()Ljava/lang/String;
		 (( com.kkkwan.billing.b.c ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/kkkwan/billing/b/c;->d()Ljava/lang/String;
		 /* move-object/from16 v0, p1 */
		 (( com.kkkwan.billing.a ) v8 ).a ( v11, v0 ); // invoke-virtual {v8, v11, v0}, Lcom/kkkwan/billing/a;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/kkkwan/billing/e/a/b;
		 (( com.kkkwan.billing.e.a.b ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/kkkwan/billing/e/a/b;->b()Ljava/lang/String;
		 (( com.kkkwan.billing.e.a.b ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/kkkwan/billing/e/a/b;->c()Ljava/lang/String;
		 final String v5 = "PipeMgr"; // const-string v5, "PipeMgr"
		 /* new-instance v14, Ljava/lang/StringBuilder; */
		 final String v15 = "id="; // const-string v15, "id="
		 /* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v14 ).append ( v11 ); // invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v5,v14 );
		 final String v5 = "PipeMgr"; // const-string v5, "PipeMgr"
		 /* new-instance v14, Ljava/lang/StringBuilder; */
		 final String v15 = "Integer.valueOf(dayCount)="; // const-string v15, "Integer.valueOf(dayCount)="
		 /* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 java.lang.Integer .valueOf ( v4 );
		 (( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v5,v14 );
		 final String v5 = "PipeMgr"; // const-string v5, "PipeMgr"
		 /* new-instance v14, Ljava/lang/StringBuilder; */
		 final String v15 = "Integer.valueOf(user_day_usable)="; // const-string v15, "Integer.valueOf(user_day_usable)="
		 /* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 java.lang.Integer .valueOf ( v2 );
		 (( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v5,v14 );
		 final String v5 = "PipeMgr"; // const-string v5, "PipeMgr"
		 /* new-instance v14, Ljava/lang/StringBuilder; */
		 final String v15 = "Integer.valueOf(monthCount)="; // const-string v15, "Integer.valueOf(monthCount)="
		 /* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 java.lang.Integer .valueOf ( v1 );
		 (( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v5,v14 );
		 final String v5 = "PipeMgr"; // const-string v5, "PipeMgr"
		 /* new-instance v14, Ljava/lang/StringBuilder; */
		 final String v15 = "Integer.valueOf(user_month_usable)="; // const-string v15, "Integer.valueOf(user_month_usable)="
		 /* invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 java.lang.Integer .valueOf ( v3 );
		 (( java.lang.StringBuilder ) v14 ).append ( v15 ); // invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v5,v14 );
		 java.lang.Integer .valueOf ( v4 );
		 v4 = 		 (( java.lang.Integer ) v4 ).intValue ( ); // invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
		 java.lang.Integer .valueOf ( v2 );
		 v2 = 		 (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
		 /* if-lt v4, v2, :cond_1 */
		 final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "\u6bcf\u4e2a\u7528\u6237\u6bcf\u65e5\u53ea\u80fd\u4f7f\u7528\u591a\u5c11\u6b21\u6b64\u901a\u9053(\u4e0e\u672c\u5730\u6bd4\u8f83)\u65f6\uff0c\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="; // const-string v3, "\u6bcf\u4e2a\u7528\u6237\u6bcf\u65e5\u53ea\u80fd\u4f7f\u7528\u591a\u5c11\u6b21\u6b64\u901a\u9053(\u4e0e\u672c\u5730\u6bd4\u8f83)\u65f6\uff0c\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v1,v2 );
	 } // :cond_0
} // :goto_1
/* add-int/lit8 v1, v6, 0x1 */
/* move v6, v1 */
/* goto/16 :goto_0 */
} // :cond_1
java.lang.Integer .valueOf ( v1 );
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
java.lang.Integer .valueOf ( v3 );
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* if-lt v1, v2, :cond_2 */
final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "\u6bcf\u4e2a\u7528\u6237\u6bcf\u6708\u53ea\u80fd\u4f7f\u7528\u591a\u5c11\u6b21\u6b64\u901a\u9053(\u4e0e\u672c\u5730\u6bd4\u8f83)\u65f6\uff0c\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="; // const-string v3, "\u6bcf\u4e2a\u7528\u6237\u6bcf\u6708\u53ea\u80fd\u4f7f\u7528\u591a\u5c11\u6b21\u6b64\u901a\u9053(\u4e0e\u672c\u5730\u6bd4\u8f83)\u65f6\uff0c\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
} // :goto_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_3
} // :cond_2
if ( v9 != null) { // if-eqz v9, :cond_5
v1 = try { // :try_start_1
/* if-lez v1, :cond_5 */
int v4 = 0; // const/4 v4, 0x0
int v1 = 0; // const/4 v1, 0x0
/* move v5, v1 */
v1 = } // :goto_4
/* if-ge v5, v1, :cond_8 */
/* check-cast v1, Ljava/util/Map; */
final String v2 = "id"; // const-string v2, "id"
/* check-cast v2, Ljava/lang/String; */
final String v3 = "used"; // const-string v3, "used"
/* check-cast v3, Ljava/lang/String; */
final String v14 = "used_month"; // const-string v14, "used_month"
/* check-cast v1, Ljava/lang/String; */
v2 = (( java.lang.String ) v11 ).equals ( v2 ); // invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
java.lang.Integer .valueOf ( v12 );
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
if ( v2 != null) { // if-eqz v2, :cond_3
java.lang.Integer .valueOf ( v12 );
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
java.lang.Integer .valueOf ( v3 );
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* sub-int/2addr v2, v3 */
/* const/16 v3, 0xa */
/* if-ge v2, v3, :cond_3 */
final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "\u901a\u9053\u6bcf\u65e5\u53ef\u7528\u6b21\u6570(\u4e0e\u670d\u52a1\u5668\u6bd4\u8f83)\uff0c\u6ce8\uff1a\u5982\u679c\u4e3a\u201c0\u201d\u8868\u793a\u65e0\u9650\u5927\u65f6\uff0c\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="; // const-string v3, "\u901a\u9053\u6bcf\u65e5\u53ef\u7528\u6b21\u6570(\u4e0e\u670d\u52a1\u5668\u6bd4\u8f83)\uff0c\u6ce8\uff1a\u5982\u679c\u4e3a\u201c0\u201d\u8868\u793a\u65e0\u9650\u5927\u65f6\uff0c\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v2 );
int v1 = 1; // const/4 v1, 0x1
} // :goto_5
/* if-nez v1, :cond_0 */
final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "\u52a0\u5165\u6709\u6548\u901a\u9053id="; // const-string v3, "\u52a0\u5165\u6709\u6548\u901a\u9053id="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v2 );
/* goto/16 :goto_1 */
} // :cond_3
java.lang.Integer .valueOf ( v13 );
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
if ( v2 != null) { // if-eqz v2, :cond_4
java.lang.Integer .valueOf ( v13 );
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
java.lang.Integer .valueOf ( v1 );
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* sub-int v1, v2, v1 */
/* const/16 v2, 0xa */
/* if-ge v1, v2, :cond_4 */
final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "\u901a\u9053\u6bcf\u6708\u53ef\u7528\u6b21\u6570(\u4e0e\u670d\u52a1\u5668\u6bd4\u8f83) \u6ce8\uff1a\u5982\u679c\u4e3a\u201c0\u201d\u8868\u793a\u65e0\u9650\u5927\u65f6\uff0c\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="; // const-string v3, "\u901a\u9053\u6bcf\u6708\u53ef\u7528\u6b21\u6570(\u4e0e\u670d\u52a1\u5668\u6bd4\u8f83) \u6ce8\uff1a\u5982\u679c\u4e3a\u201c0\u201d\u8868\u793a\u65e0\u9650\u5927\u65f6\uff0c\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v2 );
int v1 = 1; // const/4 v1, 0x1
} // :cond_4
/* add-int/lit8 v1, v5, 0x1 */
/* move v5, v1 */
/* goto/16 :goto_4 */
} // :cond_5
final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "\u83b7\u53d6\u5230\u670d\u52a1\u5668\u901a\u9053\u6b21\u6570\u5931\u8d25!\u6545\uff1a\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="; // const-string v3, "\u83b7\u53d6\u5230\u670d\u52a1\u5668\u901a\u9053\u6b21\u6570\u5931\u8d25!\u6545\uff1a\u4e0d\u7b26\u5408\uff0c\u5220\u9664\u901a\u9053id="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v2 );
/* goto/16 :goto_1 */
} // :cond_6
v1 = (( com.kkkwan.billing.a ) v8 ).a ( ); // invoke-virtual {v8}, Lcom/kkkwan/billing/a;->a()V
/* if-lez v1, :cond_7 */
/* new-instance v1, Lcom/kkkwan/billing/c/a; */
/* invoke-direct {v1}, Lcom/kkkwan/billing/c/a;-><init>()V */
/* invoke-static/range {p2 ..p2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double; */
(( java.lang.Double ) v2 ).doubleValue ( ); // invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D
/* move-result-wide v2 */
/* const-wide/high16 v4, 0x4059000000000000L # 100.0 */
/* mul-double/2addr v2, v4 */
final String v4 = "PipeMgr"; // const-string v4, "PipeMgr"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "\u6392\u9664\u540epipelines.toString()="; // const-string v6, "\u6392\u9664\u540epipelines.toString()="
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Object ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v4,v5 );
/* double-to-int v2, v2 */
/* move-object/from16 v0, p1 */
(( com.kkkwan.billing.c.a ) v1 ).a ( v10, v2, v0 ); // invoke-virtual {v1, v10, v2, v0}, Lcom/kkkwan/billing/c/a;->a(Ljava/util/List;ILandroid/content/Context;)Ljava/util/List;
/* goto/16 :goto_3 */
} // :cond_7
final String v1 = "PipeMgr"; // const-string v1, "PipeMgr"
final String v2 = "\u7ecf\u8fc7\u6bd4\u8f83\uff0c\u6ca1\u6709\u7b26\u5408\u7684\u901a\u9053\uff0c\u7ec4\u5408\u4e4b\u524d"; // const-string v2, "\u7ecf\u8fc7\u6bd4\u8f83\uff0c\u6ca1\u6709\u7b26\u5408\u7684\u901a\u9053\uff0c\u7ec4\u5408\u4e4b\u524d"
com.kkkwan.billing.h.f .a ( v1,v2 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_2 */
} // :cond_8
/* move v1, v4 */
/* goto/16 :goto_5 */
} // .end method
