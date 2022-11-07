public class inal {
	 /* .source "_A.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/wiyun/engine/nodes/d; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "b" */
} // .end annotation
/* # instance fields */
java.lang.String a;
java.lang.String b;
java.lang.String c;
java.lang.String d;
java.lang.String e;
Integer f;
Integer g;
Boolean h;
Boolean i;
android.graphics.Bitmap j;
java.lang.String k;
java.lang.String l;
java.lang.String m;
java.lang.String n;
org.json.JSONObject o;
java.lang.String p;
java.lang.String q;
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 3192 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.wiyun.engine.nodes.d$b a ( org.json.JSONObject p0 ) {
/* .locals 6 */
/* .param p0, "json" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 3215 */
final String v4 = "id"; // const-string v4, "id"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 3216 */
/* .local v2, "nid":Ljava/lang/String; */
final String v4 = "title"; // const-string v4, "title"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 3217 */
/* .local v3, "title":Ljava/lang/String; */
final String v4 = "intent_action"; // const-string v4, "intent_action"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 3218 */
/* .local v0, "action":Ljava/lang/String; */
v4 = android.text.TextUtils .isEmpty ( v2 );
/* if-nez v4, :cond_0 */
v4 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v4, :cond_0 */
v4 = android.text.TextUtils .isEmpty ( v3 );
if ( v4 != null) { // if-eqz v4, :cond_1
	 /* .line 3219 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3238 */
} // :goto_0
/* .line 3221 */
} // :cond_1
/* new-instance v1, Lcom/wiyun/engine/nodes/d$b; */
/* invoke-direct {v1}, Lcom/wiyun/engine/nodes/d$b;-><init>()V */
/* .line 3222 */
/* .local v1, "n":Lcom/wiyun/engine/nodes/d$b; */
this.a = v2;
/* .line 3223 */
this.d = v3;
/* .line 3224 */
final String v4 = "description"; // const-string v4, "description"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
this.e = v4;
/* .line 3225 */
final String v4 = "icon_url"; // const-string v4, "icon_url"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
this.c = v4;
/* .line 3226 */
final String v4 = "notify_icon"; // const-string v4, "notify_icon"
final String v5 = "stat_notify_chat"; // const-string v5, "stat_notify_chat"
(( org.json.JSONObject ) p0 ).optString ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
this.b = v4;
/* .line 3227 */
final String v4 = "banner"; // const-string v4, "banner"
v4 = (( org.json.JSONObject ) p0 ).optBoolean ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
/* iput-boolean v4, v1, Lcom/wiyun/engine/nodes/d$b;->h:Z */
/* .line 3228 */
final String v4 = "delay"; // const-string v4, "delay"
/* const/16 v5, 0x7530 */
v4 = (( org.json.JSONObject ) p0 ).optInt ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
/* iput v4, v1, Lcom/wiyun/engine/nodes/d$b;->f:I */
/* .line 3229 */
final String v4 = "timeout"; // const-string v4, "timeout"
/* const v5, 0x927c0 */
v4 = (( org.json.JSONObject ) p0 ).optInt ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
/* iput v4, v1, Lcom/wiyun/engine/nodes/d$b;->g:I */
/* .line 3230 */
final String v4 = "cancelable"; // const-string v4, "cancelable"
v4 = (( org.json.JSONObject ) p0 ).optBoolean ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
/* iput-boolean v4, v1, Lcom/wiyun/engine/nodes/d$b;->i:Z */
/* .line 3231 */
this.k = v0;
/* .line 3232 */
final String v4 = "intent_category"; // const-string v4, "intent_category"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
this.l = v4;
/* .line 3233 */
final String v4 = "intent_package"; // const-string v4, "intent_package"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
this.m = v4;
/* .line 3234 */
final String v4 = "intent_class"; // const-string v4, "intent_class"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
this.n = v4;
/* .line 3235 */
final String v4 = "intent_extra"; // const-string v4, "intent_extra"
(( org.json.JSONObject ) p0 ).optJSONObject ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
this.o = v4;
/* .line 3236 */
final String v4 = "data_uri"; // const-string v4, "data_uri"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
this.p = v4;
/* .line 3237 */
final String v4 = "data_type"; // const-string v4, "data_type"
(( org.json.JSONObject ) p0 ).optString ( v4 ); // invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
this.q = v4;
} // .end method
