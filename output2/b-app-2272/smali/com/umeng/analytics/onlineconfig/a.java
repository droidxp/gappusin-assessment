public class com.umeng.analytics.onlineconfig.a {
	 /* .source "OnlineConfigAgent.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/analytics/onlineconfig/a$a;, */
	 /* Lcom/umeng/analytics/onlineconfig/a$b; */
	 /* } */
} // .end annotation
/* # instance fields */
private final java.lang.String a;
private final java.lang.String b;
private final java.lang.String c;
private java.lang.String d;
private java.lang.String e;
private com.umeng.analytics.onlineconfig.UmengOnlineConfigureListener f;
private com.umeng.analytics.onlineconfig.c g;
/* # direct methods */
public com.umeng.analytics.onlineconfig.a ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 38 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 26 */
	 final String v0 = "last_config_time"; // const-string v0, "last_config_time"
	 this.a = v0;
	 /* .line 27 */
	 final String v0 = "report_policy"; // const-string v0, "report_policy"
	 this.b = v0;
	 /* .line 29 */
	 final String v0 = "online_config"; // const-string v0, "online_config"
	 this.c = v0;
	 /* .line 31 */
	 this.d = v1;
	 /* .line 32 */
	 this.e = v1;
	 /* .line 35 */
	 this.f = v1;
	 /* .line 36 */
	 this.g = v1;
	 /* .line 38 */
	 return;
} // .end method
static com.umeng.analytics.onlineconfig.c a ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 36 */
	 v0 = this.g;
} // .end method
static org.json.JSONObject a ( Object p0, android.content.Context p1 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 103 */
	 /* invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->d(Landroid/content/Context;)Lorg/json/JSONObject; */
} // .end method
private void a ( android.content.Context p0, Object p1 ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 135 */
	 com.umeng.analytics.j .b ( p1 );
	 /* .line 136 */
	 /* .line 138 */
	 v1 = this.e;
	 v1 = 	 android.text.TextUtils .isEmpty ( v1 );
	 /* if-nez v1, :cond_0 */
	 /* .line 139 */
	 final String v1 = "umeng_last_config_time"; // const-string v1, "umeng_last_config_time"
	 v2 = this.e;
	 /* .line 142 */
} // :cond_0
/* iget v1, p2, Lcom/umeng/analytics/onlineconfig/b;->c:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_1 */
/* .line 144 */
final String v1 = "umeng_net_report_policy"; // const-string v1, "umeng_net_report_policy"
/* iget v2, p2, Lcom/umeng/analytics/onlineconfig/b;->c:I */
/* .line 145 */
final String v1 = "umeng_net_report_interval"; // const-string v1, "umeng_net_report_interval"
/* iget v2, p2, Lcom/umeng/analytics/onlineconfig/b;->d:I */
/* int-to-long v2, v2 */
/* .line 149 */
} // :cond_1
/* .line 150 */
return;
} // .end method
static void a ( Object p0, android.content.Context p1, Object p2 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 134 */
/* invoke-direct {p0, p1, p2}, Lcom/umeng/analytics/onlineconfig/a;->a(Landroid/content/Context;Lcom/umeng/analytics/onlineconfig/b;)V */
return;
} // .end method
static void a ( Object p0, org.json.JSONObject p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 82 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->a(Lorg/json/JSONObject;)V */
return;
} // .end method
private void a ( org.json.JSONObject p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 83 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.f;
/* .line 84 */
} // :cond_0
return;
} // .end method
private java.lang.String b ( android.content.Context p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 87 */
v0 = this.d;
/* .line 88 */
/* if-nez v0, :cond_0 */
/* .line 89 */
com.umeng.common.b .q ( p1 );
/* .line 92 */
} // :cond_0
/* if-nez v0, :cond_1 */
/* .line 93 */
/* new-instance v0, Ljava/lang/Exception; */
final String v1 = "none appkey exception"; // const-string v1, "none appkey exception"
/* invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 96 */
} // :cond_1
} // .end method
private void b ( android.content.Context p0, Object p1 ) {
/* .locals 5 */
/* .prologue */
/* .line 153 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v0 = (( org.json.JSONObject ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->length()I
/* if-nez v0, :cond_1 */
/* .line 178 */
} // :cond_0
} // :goto_0
return;
/* .line 157 */
} // :cond_1
com.umeng.analytics.j .b ( p1 );
/* .line 158 */
/* .line 161 */
try { // :try_start_0
v2 = this.a;
/* .line 164 */
(( org.json.JSONObject ) v2 ).keys ( ); // invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
/* .line 166 */
v0 = } // :goto_1
/* if-nez v0, :cond_2 */
/* .line 171 */
/* .line 173 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "get online setting params: "; // const-string v3, "get online setting params: "
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 175 */
/* :catch_0 */
/* move-exception v0 */
/* .line 176 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "save online config params"; // const-string v2, "save online config params"
com.umeng.common.Log .c ( v1,v2,v0 );
/* .line 167 */
} // :cond_2
try { // :try_start_1
/* check-cast v0, Ljava/lang/String; */
/* .line 168 */
(( org.json.JSONObject ) v2 ).getString ( v0 ); // invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
static void b ( Object p0, android.content.Context p1, Object p2 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 152 */
/* invoke-direct {p0, p1, p2}, Lcom/umeng/analytics/onlineconfig/a;->b(Landroid/content/Context;Lcom/umeng/analytics/onlineconfig/b;)V */
return;
} // .end method
private java.lang.String c ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
v0 = this.e;
/* if-nez v0, :cond_0 */
com.umeng.common.b .u ( p1 );
} // :goto_0
} // :cond_0
v0 = this.e;
} // .end method
private org.json.JSONObject d ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 105 */
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
/* .line 107 */
try { // :try_start_0
final String v1 = "type"; // const-string v1, "type"
final String v2 = "online_config"; // const-string v2, "online_config"
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 108 */
final String v1 = "appkey"; // const-string v1, "appkey"
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->b(Landroid/content/Context;)Ljava/lang/String; */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 109 */
final String v1 = "version_code"; // const-string v1, "version_code"
com.umeng.common.b .d ( p1 );
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 110 */
final String v1 = "package"; // const-string v1, "package"
com.umeng.common.b .v ( p1 );
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 111 */
final String v1 = "sdk_version"; // const-string v1, "sdk_version"
final String v2 = "4.6.3"; // const-string v2, "4.6.3"
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 113 */
final String v1 = "idmd5"; // const-string v1, "idmd5"
com.umeng.common.b .g ( p1 );
com.umeng.common.util.h .b ( v2 );
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 114 */
final String v1 = "channel"; // const-string v1, "channel"
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->c(Landroid/content/Context;)Ljava/lang/String; */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 116 */
com.umeng.analytics.j .i ( p1 );
/* .line 117 */
final String v2 = "report_policy"; // const-string v2, "report_policy"
int v3 = 0; // const/4 v3, 0x0
/* aget v1, v1, v3 */
(( org.json.JSONObject ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
/* .line 118 */
final String v1 = "last_config_time"; // const-string v1, "last_config_time"
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->e(Landroid/content/Context;)Ljava/lang/String; */
(( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 125 */
} // :goto_0
/* .line 120 */
/* :catch_0 */
/* move-exception v0 */
/* .line 121 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "exception in onlineConfigInternal"; // const-string v1, "exception in onlineConfigInternal"
com.umeng.common.Log .b ( v0,v1 );
/* .line 122 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
private java.lang.String e ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 130 */
com.umeng.analytics.j .b ( p1 );
/* .line 131 */
final String v1 = "umeng_last_config_time"; // const-string v1, "umeng_last_config_time"
final String v2 = ""; // const-string v2, ""
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 71 */
int v0 = 0; // const/4 v0, 0x0
this.f = v0;
/* .line 72 */
return;
} // .end method
public void a ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 46 */
/* if-nez p1, :cond_0 */
/* .line 47 */
try { // :try_start_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "unexpected null context in updateOnlineConfig"; // const-string v1, "unexpected null context in updateOnlineConfig"
com.umeng.common.Log .b ( v0,v1 );
/* .line 56 */
} // :goto_0
return;
/* .line 51 */
} // :cond_0
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/umeng/analytics/onlineconfig/a$b; */
/* invoke-direct {v1, p0, p1}, Lcom/umeng/analytics/onlineconfig/a$b;-><init>(Lcom/umeng/analytics/onlineconfig/a;Landroid/content/Context;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 53 */
/* :catch_0 */
/* move-exception v0 */
/* .line 54 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "exception in updateOnlineConfig"; // const-string v1, "exception in updateOnlineConfig"
com.umeng.common.Log .b ( v0,v1 );
} // .end method
public void a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 0 */
/* .prologue */
/* .line 60 */
this.d = p2;
/* .line 61 */
this.e = p3;
/* .line 63 */
(( com.umeng.analytics.onlineconfig.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/onlineconfig/a;->a(Landroid/content/Context;)V
/* .line 64 */
return;
} // .end method
public void a ( com.umeng.analytics.onlineconfig.UmengOnlineConfigureListener p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 67 */
this.f = p1;
/* .line 68 */
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 75 */
this.g = p1;
/* .line 76 */
return;
} // .end method
public void b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
int v0 = 0; // const/4 v0, 0x0
this.g = v0;
/* .line 80 */
return;
} // .end method
