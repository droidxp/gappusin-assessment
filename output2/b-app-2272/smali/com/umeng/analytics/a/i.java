public class com.umeng.analytics.a.i implements com.umeng.analytics.a.g {
	 /* .source "LogBody.java" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.ArrayList a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Lcom/umeng/analytics/a/g;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.ArrayList b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/a/g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.ArrayList c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/a/g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.ArrayList d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/a/g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.ArrayList e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/a/g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final java.lang.String f;
private final java.lang.String g;
private final java.lang.String h;
private final java.lang.String i;
private final java.lang.String j;
/* # direct methods */
public com.umeng.analytics.a.i ( ) {
/* .locals 1 */
/* .prologue */
/* .line 34 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 20 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* .line 21 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* .line 23 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.c = v0;
/* .line 25 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d = v0;
/* .line 26 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.e = v0;
/* .line 28 */
final String v0 = "launch"; // const-string v0, "launch"
this.f = v0;
/* .line 29 */
final String v0 = "terminate"; // const-string v0, "terminate"
this.g = v0;
/* .line 30 */
final String v0 = "error"; // const-string v0, "error"
this.h = v0;
/* .line 31 */
final String v0 = "event"; // const-string v0, "event"
this.i = v0;
/* .line 32 */
final String v0 = "ekv"; // const-string v0, "ekv"
this.j = v0;
/* .line 34 */
return;
} // .end method
private org.json.JSONArray a ( java.util.ArrayList p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/a/g;", */
/* ">;)", */
/* "Lorg/json/JSONArray;" */
/* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 170 */
/* .line 172 */
v0 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_4 */
/* .line 173 */
/* new-instance v3, Lorg/json/JSONArray; */
/* invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V */
/* .line 176 */
(( java.util.ArrayList ) p1 ).iterator ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* move-object v1, v2 */
v0 = } // :goto_0
/* if-nez v0, :cond_1 */
/* move-object v0, v3 */
/* .line 193 */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( org.json.JSONArray ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
/* if-nez v1, :cond_3 */
/* .line 195 */
} // :cond_0
} // :goto_2
/* .line 176 */
} // :cond_1
/* check-cast v0, Lcom/umeng/analytics/a/g; */
/* .line 178 */
try { // :try_start_0
/* new-instance v4, Lcom/umeng/analytics/a/j; */
/* invoke-direct {v4, p0, v0}, Lcom/umeng/analytics/a/j;-><init>(Lcom/umeng/analytics/a/i;Lcom/umeng/analytics/a/g;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v0, v4 */
/* .line 187 */
} // :goto_3
/* if-nez v0, :cond_2 */
/* move-object v1, v0 */
/* .line 183 */
/* :catch_0 */
/* move-exception v0 */
/* .line 184 */
final String v4 = "MobclickAgent"; // const-string v4, "MobclickAgent"
final String v6 = "Fail to write json ..."; // const-string v6, "Fail to write json ..."
com.umeng.common.Log .a ( v4,v6,v0 );
/* move-object v0, v1 */
/* .line 189 */
} // :cond_2
(( org.json.JSONArray ) v3 ).put ( v0 ); // invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
/* move-object v1, v0 */
} // :cond_3
/* move-object v2, v0 */
/* .line 195 */
} // :cond_4
/* move-object v0, v2 */
} // .end method
private void b ( java.util.ArrayList p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/a/g;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 257 */
v0 = (( java.util.ArrayList ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 287 */
} // :cond_0
return;
/* .line 259 */
} // :cond_1
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
/* .line 262 */
(( java.util.ArrayList ) p1 ).iterator ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
/* if-nez v0, :cond_2 */
/* .line 272 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_1
/* if-nez v0, :cond_4 */
/* .line 282 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 284 */
(( java.util.HashMap ) v2 ).values ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Lcom/umeng/analytics/a/b; */
/* .line 285 */
v2 = this.e;
(( java.util.ArrayList ) v2 ).add ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 262 */
} // :cond_2
/* check-cast v0, Lcom/umeng/analytics/a/g; */
/* .line 264 */
/* check-cast v0, Lcom/umeng/analytics/a/b; */
/* .line 265 */
v1 = this.a;
v1 = (( java.util.HashMap ) v2 ).containsKey ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 266 */
v1 = this.a;
(( java.util.HashMap ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Lcom/umeng/analytics/a/b; */
(( com.umeng.analytics.a.b ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/umeng/analytics/a/b;->a(Lcom/umeng/analytics/a/b;)V
/* .line 268 */
} // :cond_3
v1 = this.a;
(( java.util.HashMap ) v2 ).put ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 272 */
} // :cond_4
/* check-cast v0, Lcom/umeng/analytics/a/g; */
/* .line 273 */
/* check-cast v0, Lcom/umeng/analytics/a/b; */
/* .line 274 */
v1 = this.a;
v1 = (( java.util.HashMap ) v2 ).containsKey ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 275 */
v1 = this.a;
(( java.util.HashMap ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Lcom/umeng/analytics/a/b; */
(( com.umeng.analytics.a.b ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/umeng/analytics/a/b;->a(Lcom/umeng/analytics/a/b;)V
/* .line 277 */
} // :cond_5
v1 = this.a;
(( java.util.HashMap ) v2 ).put ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
private void c ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 83 */
final String v0 = "launch"; // const-string v0, "launch"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 84 */
final String v0 = "launch"; // const-string v0, "launch"
(( org.json.JSONObject ) p1 ).getJSONArray ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 86 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = (( org.json.JSONArray ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
/* if-lt v0, v2, :cond_1 */
/* .line 94 */
} // :cond_0
return;
/* .line 87 */
} // :cond_1
/* new-instance v2, Lcom/umeng/analytics/a/h; */
/* invoke-direct {v2}, Lcom/umeng/analytics/a/h;-><init>()V */
/* .line 89 */
(( org.json.JSONArray ) v1 ).getJSONObject ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
(( com.umeng.analytics.a.h ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/umeng/analytics/a/h;->a(Lorg/json/JSONObject;)V
/* .line 91 */
(( com.umeng.analytics.a.i ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/h;)V
/* .line 86 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void d ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 97 */
final String v0 = "terminate"; // const-string v0, "terminate"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 98 */
final String v0 = "terminate"; // const-string v0, "terminate"
(( org.json.JSONObject ) p1 ).getJSONArray ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 100 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = (( org.json.JSONArray ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
/* if-lt v0, v2, :cond_1 */
/* .line 108 */
} // :cond_0
return;
/* .line 101 */
} // :cond_1
/* new-instance v2, Lcom/umeng/analytics/a/m; */
/* invoke-direct {v2}, Lcom/umeng/analytics/a/m;-><init>()V */
/* .line 103 */
(( org.json.JSONArray ) v1 ).getJSONObject ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
(( com.umeng.analytics.a.m ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/umeng/analytics/a/m;->a(Lorg/json/JSONObject;)V
/* .line 105 */
(( com.umeng.analytics.a.i ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/m;)V
/* .line 100 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void e ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 111 */
final String v0 = "event"; // const-string v0, "event"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 112 */
final String v0 = "event"; // const-string v0, "event"
(( org.json.JSONObject ) p1 ).getJSONArray ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 114 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = (( org.json.JSONArray ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
/* if-lt v0, v2, :cond_1 */
/* .line 122 */
} // :cond_0
return;
/* .line 115 */
} // :cond_1
/* new-instance v2, Lcom/umeng/analytics/a/e; */
/* invoke-direct {v2}, Lcom/umeng/analytics/a/e;-><init>()V */
/* .line 117 */
(( org.json.JSONArray ) v1 ).getJSONObject ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
(( com.umeng.analytics.a.e ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/umeng/analytics/a/e;->a(Lorg/json/JSONObject;)V
/* .line 119 */
(( com.umeng.analytics.a.i ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/e;)V
/* .line 114 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void f ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 125 */
final String v0 = "ekv"; // const-string v0, "ekv"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 126 */
final String v0 = "ekv"; // const-string v0, "ekv"
(( org.json.JSONObject ) p1 ).getJSONArray ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 128 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = (( org.json.JSONArray ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
/* if-lt v0, v2, :cond_1 */
/* .line 136 */
} // :cond_0
return;
/* .line 129 */
} // :cond_1
/* new-instance v2, Lcom/umeng/analytics/a/b; */
/* invoke-direct {v2}, Lcom/umeng/analytics/a/b;-><init>()V */
/* .line 131 */
(( org.json.JSONArray ) v1 ).getJSONObject ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
(( com.umeng.analytics.a.b ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/umeng/analytics/a/b;->a(Lorg/json/JSONObject;)V
/* .line 133 */
(( com.umeng.analytics.a.i ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/b;)V
/* .line 128 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void g ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 139 */
final String v0 = "error"; // const-string v0, "error"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 140 */
final String v0 = "error"; // const-string v0, "error"
(( org.json.JSONObject ) p1 ).getJSONArray ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 142 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = (( org.json.JSONArray ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
/* if-lt v0, v2, :cond_1 */
/* .line 150 */
} // :cond_0
return;
/* .line 143 */
} // :cond_1
/* new-instance v2, Lcom/umeng/analytics/a/d; */
/* invoke-direct {v2}, Lcom/umeng/analytics/a/d;-><init>()V */
/* .line 145 */
(( org.json.JSONArray ) v1 ).getJSONObject ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
(( com.umeng.analytics.a.d ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/umeng/analytics/a/d;->a(Lorg/json/JSONObject;)V
/* .line 147 */
(( com.umeng.analytics.a.i ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/umeng/analytics/a/i;->a(Lcom/umeng/analytics/a/d;)V
/* .line 142 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 77 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( com.umeng.analytics.a.b ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/umeng/analytics/a/b;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 78 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 80 */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 50 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( com.umeng.analytics.a.d ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/umeng/analytics/a/d;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 51 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 53 */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 56 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( com.umeng.analytics.a.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/umeng/analytics/a/e;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 57 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 59 */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 38 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( com.umeng.analytics.a.h ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/umeng/analytics/a/h;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 39 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 41 */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 243 */
v0 = this.a;
v1 = this.a;
(( java.util.ArrayList ) v0 ).addAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 244 */
v0 = this.b;
v1 = this.b;
(( java.util.ArrayList ) v0 ).addAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 246 */
v0 = this.d;
v1 = this.d;
(( java.util.ArrayList ) v0 ).addAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 247 */
v0 = this.c;
v1 = this.c;
(( java.util.ArrayList ) v0 ).addAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 249 */
v0 = this.e;
/* invoke-direct {p0, v0}, Lcom/umeng/analytics/a/i;->b(Ljava/util/ArrayList;)V */
/* .line 250 */
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 44 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( com.umeng.analytics.a.m ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/umeng/analytics/a/m;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 45 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 47 */
} // :cond_0
return;
} // .end method
public void a ( java.lang.String p0, Object p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 62 */
if ( p2 != null) { // if-eqz p2, :cond_1
v0 = (( com.umeng.analytics.a.a ) p2 ).a ( ); // invoke-virtual {p2}, Lcom/umeng/analytics/a/a;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 63 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :cond_0
/* if-nez v0, :cond_2 */
/* .line 72 */
v0 = this.e;
/* new-instance v1, Lcom/umeng/analytics/a/b; */
/* invoke-direct {v1, p1, p2}, Lcom/umeng/analytics/a/b;-><init>(Ljava/lang/String;Lcom/umeng/analytics/a/a;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 74 */
} // :cond_1
} // :goto_0
return;
/* .line 63 */
} // :cond_2
/* check-cast v0, Lcom/umeng/analytics/a/g; */
/* .line 64 */
/* check-cast v0, Lcom/umeng/analytics/a/b; */
/* .line 66 */
v2 = this.a;
v2 = (( java.lang.String ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 67 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).add ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // .end method
public void a ( org.json.JSONObject p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 154 */
/* if-nez p1, :cond_0 */
/* .line 167 */
} // :goto_0
return;
/* .line 158 */
} // :cond_0
try { // :try_start_0
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/i;->c(Lorg/json/JSONObject;)V */
/* .line 159 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/i;->d(Lorg/json/JSONObject;)V */
/* .line 160 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/i;->e(Lorg/json/JSONObject;)V */
/* .line 161 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/i;->f(Lorg/json/JSONObject;)V */
/* .line 162 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/i;->g(Lorg/json/JSONObject;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 164 */
/* :catch_0 */
/* move-exception v0 */
/* .line 165 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "merge log body eror"; // const-string v2, "merge log body eror"
com.umeng.common.Log .b ( v1,v2,v0 );
} // .end method
public Boolean a ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 219 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :cond_0
/* if-nez v0, :cond_5 */
/* .line 222 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :cond_1
/* if-nez v0, :cond_6 */
/* .line 225 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :cond_2
/* if-nez v0, :cond_7 */
/* .line 228 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :cond_3
/* if-nez v0, :cond_8 */
/* .line 232 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :cond_4
/* if-nez v0, :cond_9 */
/* .line 236 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_a */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_a */
v0 = this.d;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_a */
v0 = this.e;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_a */
v0 = this.c;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_a */
/* move v0, v1 */
/* .line 239 */
} // :goto_0
/* .line 219 */
} // :cond_5
/* check-cast v0, Lcom/umeng/analytics/a/g; */
v0 = /* .line 220 */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
/* .line 222 */
} // :cond_6
/* check-cast v0, Lcom/umeng/analytics/a/g; */
v0 = /* .line 223 */
/* if-nez v0, :cond_1 */
/* move v0, v1 */
/* .line 225 */
} // :cond_7
/* check-cast v0, Lcom/umeng/analytics/a/g; */
v0 = /* .line 226 */
/* if-nez v0, :cond_2 */
/* move v0, v1 */
/* .line 228 */
} // :cond_8
/* check-cast v0, Lcom/umeng/analytics/a/g; */
v0 = /* .line 229 */
/* if-nez v0, :cond_3 */
/* move v0, v1 */
/* .line 232 */
} // :cond_9
/* check-cast v0, Lcom/umeng/analytics/a/g; */
v0 = /* .line 233 */
/* if-nez v0, :cond_4 */
/* move v0, v1 */
/* .line 239 */
} // :cond_a
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Integer b ( ) {
/* .locals 3 */
/* .prologue */
/* .line 290 */
int v0 = 0; // const/4 v0, 0x0
/* .line 291 */
v1 = this.e;
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* move v1, v0 */
v0 = } // :goto_0
/* if-nez v0, :cond_0 */
/* .line 296 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/2addr v0, v1 */
/* .line 297 */
v1 = this.b;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* add-int/2addr v0, v1 */
/* .line 298 */
v1 = this.d;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* add-int/2addr v0, v1 */
/* .line 299 */
v1 = this.c;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* add-int/2addr v0, v1 */
/* .line 301 */
/* .line 291 */
} // :cond_0
/* check-cast v0, Lcom/umeng/analytics/a/g; */
/* .line 292 */
/* check-cast v0, Lcom/umeng/analytics/a/b; */
/* .line 293 */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/2addr v0, v1 */
/* move v1, v0 */
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 202 */
v0 = this.a;
/* invoke-direct {p0, v0}, Lcom/umeng/analytics/a/i;->a(Ljava/util/ArrayList;)Lorg/json/JSONArray; */
/* .line 203 */
v1 = this.b;
/* invoke-direct {p0, v1}, Lcom/umeng/analytics/a/i;->a(Ljava/util/ArrayList;)Lorg/json/JSONArray; */
/* .line 204 */
v2 = this.d;
/* invoke-direct {p0, v2}, Lcom/umeng/analytics/a/i;->a(Ljava/util/ArrayList;)Lorg/json/JSONArray; */
/* .line 205 */
v3 = this.c;
/* invoke-direct {p0, v3}, Lcom/umeng/analytics/a/i;->a(Ljava/util/ArrayList;)Lorg/json/JSONArray; */
/* .line 206 */
v4 = this.e;
/* invoke-direct {p0, v4}, Lcom/umeng/analytics/a/i;->a(Ljava/util/ArrayList;)Lorg/json/JSONArray; */
/* .line 208 */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v5 = "launch"; // const-string v5, "launch"
(( org.json.JSONObject ) p1 ).put ( v5, v0 ); // invoke-virtual {p1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 209 */
} // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
final String v0 = "terminate"; // const-string v0, "terminate"
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 210 */
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
final String v0 = "event"; // const-string v0, "event"
(( org.json.JSONObject ) p1 ).put ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 211 */
} // :cond_2
if ( v3 != null) { // if-eqz v3, :cond_3
final String v0 = "error"; // const-string v0, "error"
(( org.json.JSONObject ) p1 ).put ( v0, v3 ); // invoke-virtual {p1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 212 */
} // :cond_3
if ( v4 != null) { // if-eqz v4, :cond_4
final String v0 = "ekv"; // const-string v0, "ekv"
(( org.json.JSONObject ) p1 ).put ( v0, v4 ); // invoke-virtual {p1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 213 */
} // :cond_4
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 305 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 306 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 308 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 309 */
v0 = this.e;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 311 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 312 */
return;
} // .end method
