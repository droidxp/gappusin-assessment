public class com.umeng.analytics.onlineconfig.b extends com.umeng.common.net.u {
	 /* .source "OnlineConfigResponse.java" */
	 /* # instance fields */
	 public org.json.JSONObject a;
	 Boolean b;
	 Integer c;
	 Integer d;
	 java.lang.String e;
	 private final java.lang.String f;
	 private final java.lang.String g;
	 private final java.lang.String h;
	 private final java.lang.String i;
	 private final java.lang.String j;
	 /* # direct methods */
	 public com.umeng.analytics.onlineconfig.b ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 33 */
		 /* invoke-direct {p0, p1}, Lcom/umeng/common/net/u;-><init>(Lorg/json/JSONObject;)V */
		 /* .line 17 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 /* .line 19 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/umeng/analytics/onlineconfig/b;->b:Z */
		 /* .line 21 */
		 /* iput v1, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I */
		 /* .line 22 */
		 /* iput v1, p0, Lcom/umeng/analytics/onlineconfig/b;->d:I */
		 /* .line 26 */
		 final String v0 = "config_update"; // const-string v0, "config_update"
		 this.f = v0;
		 /* .line 27 */
		 final String v0 = "report_policy"; // const-string v0, "report_policy"
		 this.g = v0;
		 /* .line 28 */
		 final String v0 = "online_params"; // const-string v0, "online_params"
		 this.h = v0;
		 /* .line 29 */
		 final String v0 = "last_config_time"; // const-string v0, "last_config_time"
		 this.i = v0;
		 /* .line 30 */
		 final String v0 = "report_interval"; // const-string v0, "report_interval"
		 this.j = v0;
		 /* .line 35 */
		 /* if-nez p1, :cond_0 */
		 /* .line 42 */
	 } // :goto_0
	 return;
	 /* .line 39 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/b;->a(Lorg/json/JSONObject;)V */
/* .line 41 */
/* invoke-direct {p0}, Lcom/umeng/analytics/onlineconfig/b;->a()V */
} // .end method
private void a ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 6; // const/4 v1, 0x6
/* .line 67 */
/* iget v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I */
/* if-ltz v0, :cond_0 */
/* iget v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I */
/* if-le v0, v1, :cond_1 */
/* .line 68 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I */
/* .line 71 */
} // :cond_1
/* iget v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I */
/* if-ne v0, v1, :cond_2 */
/* iget v0, p0, Lcom/umeng/analytics/onlineconfig/b;->d:I */
/* if-gtz v0, :cond_2 */
/* .line 72 */
/* iput v0, p0, Lcom/umeng/analytics/onlineconfig/b;->d:I */
/* .line 74 */
} // :cond_2
return;
} // .end method
private void a ( org.json.JSONObject p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 46 */
try { // :try_start_0
final String v0 = "config_update"; // const-string v0, "config_update"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "config_update"; // const-string v0, "config_update"
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v1 = "no"; // const-string v1, "no"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 64 */
} // :cond_0
} // :goto_0
return;
/* .line 50 */
} // :cond_1
final String v0 = "report_policy"; // const-string v0, "report_policy"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 51 */
final String v0 = "report_policy"; // const-string v0, "report_policy"
v0 = (( org.json.JSONObject ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
/* iput v0, p0, Lcom/umeng/analytics/onlineconfig/b;->c:I */
/* .line 52 */
final String v0 = "report_interval"; // const-string v0, "report_interval"
v0 = (( org.json.JSONObject ) p1 ).optInt ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
/* mul-int/lit16 v0, v0, 0x3e8 */
/* iput v0, p0, Lcom/umeng/analytics/onlineconfig/b;->d:I */
/* .line 53 */
final String v0 = "last_config_time"; // const-string v0, "last_config_time"
(( org.json.JSONObject ) p1 ).optString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
this.e = v0;
/* .line 58 */
} // :goto_1
final String v0 = "online_params"; // const-string v0, "online_params"
(( org.json.JSONObject ) p1 ).optJSONObject ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
this.a = v0;
/* .line 60 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/umeng/analytics/onlineconfig/b;->b:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 61 */
/* :catch_0 */
/* move-exception v0 */
/* .line 62 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "fail to parce online config response"; // const-string v2, "fail to parce online config response"
com.umeng.common.Log .e ( v1,v2,v0 );
/* .line 55 */
} // :cond_2
try { // :try_start_1
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = " online config fetch no report policy"; // const-string v1, " online config fetch no report policy"
com.umeng.common.Log .e ( v0,v1 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
