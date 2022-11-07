public class com.google.ads.c {
	 /* .source "SourceFile" */
	 /* # static fields */
	 private static final java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Lcom/google/ads/AdSize;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private final java.lang.String b;
private final java.lang.String c;
private final java.util.List d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/ads/a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final java.lang.Integer e;
private final java.lang.Integer f;
private final java.util.List g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final java.util.List h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final java.util.List i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.google.ads.c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 54 */
/* new-instance v0, Lcom/google/ads/c$1; */
/* invoke-direct {v0}, Lcom/google/ads/c$1;-><init>()V */
java.util.Collections .unmodifiableMap ( v0 );
return;
} // .end method
private com.google.ads.c ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/ads/a;", */
/* ">;", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 253 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 254 */
com.google.ads.util.a .a ( p1 );
/* .line 255 */
this.b = p1;
/* .line 256 */
this.c = p2;
/* .line 257 */
this.d = p3;
/* .line 258 */
this.e = p4;
/* .line 259 */
this.f = p5;
/* .line 260 */
this.g = p6;
/* .line 261 */
this.h = p7;
/* .line 262 */
this.i = p8;
/* .line 263 */
return;
} // .end method
private static com.google.ads.a a ( org.json.JSONObject p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 180 */
final String v0 = "id"; // const-string v0, "id"
(( org.json.JSONObject ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 181 */
final String v0 = "allocation_id"; // const-string v0, "allocation_id"
int v3 = 0; // const/4 v3, 0x0
(( org.json.JSONObject ) p0 ).optString ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 184 */
final String v0 = "adapters"; // const-string v0, "adapters"
(( org.json.JSONObject ) p0 ).getJSONArray ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 185 */
/* new-instance v5, Ljava/util/ArrayList; */
v0 = (( org.json.JSONArray ) v4 ).length ( ); // invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
/* invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V */
/* move v0, v1 */
/* .line 186 */
} // :goto_0
v6 = (( org.json.JSONArray ) v4 ).length ( ); // invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
/* if-ge v0, v6, :cond_0 */
/* .line 187 */
(( org.json.JSONArray ) v4 ).getString ( v0 ); // invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
(( java.util.ArrayList ) v5 ).add ( v6 ); // invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 186 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 191 */
} // :cond_0
final String v0 = "data"; // const-string v0, "data"
(( org.json.JSONObject ) p0 ).optJSONObject ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 193 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V */
/* .line 194 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 195 */
/* new-instance v1, Ljava/util/HashMap; */
v0 = (( org.json.JSONObject ) v4 ).length ( ); // invoke-virtual {v4}, Lorg/json/JSONObject;->length()I
/* invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V */
/* .line 196 */
(( org.json.JSONObject ) v4 ).keys ( ); // invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
/* .line 197 */
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 198 */
/* check-cast v0, Ljava/lang/String; */
/* .line 199 */
(( org.json.JSONObject ) v4 ).getString ( v0 ); // invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( java.util.HashMap ) v1 ).put ( v0, v7 ); // invoke-virtual {v1, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
/* move-object v0, v1 */
/* .line 202 */
} // :cond_2
/* new-instance v1, Lcom/google/ads/a; */
/* invoke-direct {v1, v3, v2, v5, v0}, Lcom/google/ads/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/HashMap;)V */
} // .end method
public static com.google.ads.c a ( java.lang.String p0 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 97 */
/* new-instance v5, Lorg/json/JSONObject; */
/* invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 98 */
final String v1 = "qdata"; // const-string v1, "qdata"
(( org.json.JSONObject ) v5 ).getString ( v1 ); // invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 99 */
final String v2 = "ad_type"; // const-string v2, "ad_type"
v2 = (( org.json.JSONObject ) v5 ).has ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
final String v2 = "ad_type"; // const-string v2, "ad_type"
(( org.json.JSONObject ) v5 ).getString ( v2 ); // invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 102 */
} // :goto_0
final String v3 = "ad_networks"; // const-string v3, "ad_networks"
(( org.json.JSONObject ) v5 ).getJSONArray ( v3 ); // invoke-virtual {v5, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 103 */
/* new-instance v3, Ljava/util/ArrayList; */
v4 = (( org.json.JSONArray ) v6 ).length ( ); // invoke-virtual {v6}, Lorg/json/JSONArray;->length()I
/* invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 105 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
v7 = (( org.json.JSONArray ) v6 ).length ( ); // invoke-virtual {v6}, Lorg/json/JSONArray;->length()I
/* if-ge v4, v7, :cond_1 */
/* .line 106 */
(( org.json.JSONArray ) v6 ).getJSONObject ( v4 ); // invoke-virtual {v6, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
com.google.ads.c .a ( v7 );
/* .line 105 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_0
/* move-object v2, v0 */
/* .line 99 */
/* .line 108 */
} // :cond_1
final String v4 = "settings"; // const-string v4, "settings"
(( org.json.JSONObject ) v5 ).optJSONObject ( v4 ); // invoke-virtual {v5, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 114 */
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 115 */
final String v4 = "refresh"; // const-string v4, "refresh"
v4 = (( org.json.JSONObject ) v5 ).has ( v4 ); // invoke-virtual {v5, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 116 */
final String v4 = "refresh"; // const-string v4, "refresh"
v4 = (( org.json.JSONObject ) v5 ).getInt ( v4 ); // invoke-virtual {v5, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v4 );
/* .line 118 */
} // :goto_2
final String v6 = "ad_network_timeout_millis"; // const-string v6, "ad_network_timeout_millis"
v6 = (( org.json.JSONObject ) v5 ).has ( v6 ); // invoke-virtual {v5, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 119 */
final String v0 = "ad_network_timeout_millis"; // const-string v0, "ad_network_timeout_millis"
v0 = (( org.json.JSONObject ) v5 ).getInt ( v0 ); // invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v0 );
/* .line 123 */
} // :cond_2
final String v6 = "imp_urls"; // const-string v6, "imp_urls"
com.google.ads.c .a ( v5,v6 );
/* .line 124 */
final String v7 = "click_urls"; // const-string v7, "click_urls"
com.google.ads.c .a ( v5,v7 );
/* .line 125 */
final String v8 = "nofill_urls"; // const-string v8, "nofill_urls"
com.google.ads.c .a ( v5,v8 );
/* move-object v5, v0 */
/* .line 127 */
} // :goto_3
/* new-instance v0, Lcom/google/ads/c; */
/* invoke-direct/range {v0 ..v8}, Lcom/google/ads/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V */
} // :cond_3
/* move-object v4, v0 */
} // :cond_4
/* move-object v8, v0 */
/* move-object v6, v0 */
/* move-object v7, v0 */
/* move-object v5, v0 */
/* move-object v4, v0 */
} // .end method
private static java.util.List a ( org.json.JSONObject p0, java.lang.String p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lorg/json/JSONObject;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 234 */
(( org.json.JSONObject ) p0 ).optJSONArray ( p1 ); // invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 235 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 236 */
/* new-instance v1, Ljava/util/ArrayList; */
v0 = (( org.json.JSONArray ) v2 ).length ( ); // invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
/* invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 237 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v3 = (( org.json.JSONArray ) v2 ).length ( ); // invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
/* if-ge v0, v3, :cond_0 */
/* .line 238 */
(( org.json.JSONArray ) v2 ).getString ( v0 ); // invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
/* .line 237 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* move-object v0, v1 */
/* .line 243 */
} // :goto_1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public Boolean a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 132 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 136 */
v0 = this.f;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 140 */
v0 = this.b;
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 149 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .prologue */
/* .line 153 */
v0 = this.e;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
} // .end method
public java.util.List f ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/ads/a;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 157 */
v0 = this.d;
} // .end method
public java.util.List g ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 162 */
v0 = this.g;
} // .end method
public java.util.List h ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 167 */
v0 = this.h;
} // .end method
public java.util.List i ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 172 */
v0 = this.i;
} // .end method
public com.google.ads.internal.h j ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 211 */
v0 = this.c;
/* if-nez v0, :cond_0 */
/* move-object v0, v1 */
/* .line 226 */
} // :goto_0
/* .line 215 */
} // :cond_0
final String v0 = "interstitial"; // const-string v0, "interstitial"
v2 = this.c;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 216 */
v0 = com.google.ads.internal.h.a;
/* .line 221 */
} // :cond_1
v0 = com.google.ads.c.a;
v2 = this.c;
/* check-cast v0, Lcom/google/ads/AdSize; */
/* .line 222 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 223 */
com.google.ads.internal.h .a ( v0 );
} // :cond_2
/* move-object v0, v1 */
/* .line 226 */
} // .end method
