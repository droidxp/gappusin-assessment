public class com.umeng.analytics.a.a implements com.umeng.analytics.a.g {
	 /* .source "EKV.java" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.HashMap a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.lang.String b;
public Long c;
public Long d;
private final java.lang.String e;
private final java.lang.String f;
private final java.lang.String g;
/* # direct methods */
public com.umeng.analytics.a.a ( ) {
/* .locals 2 */
/* .prologue */
/* const-wide/16 v0, 0x0 */
/* .line 27 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 20 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/a;->c:J */
/* .line 21 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/a;->d:J */
/* .line 23 */
final String v0 = "id"; // const-string v0, "id"
this.e = v0;
/* .line 24 */
final String v0 = "ts"; // const-string v0, "ts"
this.f = v0;
/* .line 25 */
final String v0 = "du"; // const-string v0, "du"
this.g = v0;
/* .line 28 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
/* .line 29 */
return;
} // .end method
public com.umeng.analytics.a.a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;J)V" */
/* } */
} // .end annotation
/* .prologue */
/* const-wide/16 v0, 0x0 */
/* .line 31 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 20 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/a;->c:J */
/* .line 21 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/a;->d:J */
/* .line 23 */
final String v0 = "id"; // const-string v0, "id"
this.e = v0;
/* .line 24 */
final String v0 = "ts"; // const-string v0, "ts"
this.f = v0;
/* .line 25 */
final String v0 = "du"; // const-string v0, "du"
this.g = v0;
/* .line 32 */
this.b = p1;
/* .line 33 */
/* invoke-direct {p0, p2}, Lcom/umeng/analytics/a/a;->a(Ljava/util/HashMap;)Ljava/util/HashMap; */
this.a = v0;
/* .line 34 */
/* iput-wide p3, p0, Lcom/umeng/analytics/a/a;->d:J */
/* .line 36 */
/* invoke-direct {p0}, Lcom/umeng/analytics/a/a;->b()J */
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/a;->c:J */
/* .line 37 */
return;
} // .end method
private java.util.HashMap a ( java.util.HashMap p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 40 */
v0 = (( java.util.HashMap ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/HashMap;->size()I
/* const/16 v1, 0xa */
/* if-le v0, v1, :cond_1 */
/* .line 43 */
v0 = (( java.util.HashMap ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/HashMap;->size()I
/* add-int/lit8 v3, v0, -0xa */
/* .line 45 */
/* new-array v4, v3, [Ljava/lang/String; */
/* .line 47 */
(( java.util.HashMap ) p1 ).keySet ( ); // invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
/* move v1, v2 */
v0 = } // :goto_0
/* if-nez v0, :cond_2 */
/* .line 56 */
} // :cond_0
/* array-length v0, v4 */
} // :goto_1
/* if-lt v2, v0, :cond_3 */
/* .line 61 */
} // :cond_1
/* .line 47 */
} // :cond_2
/* check-cast v0, Ljava/lang/String; */
/* .line 49 */
/* if-ge v1, v3, :cond_0 */
/* .line 51 */
/* aput-object v0, v4, v1 */
/* .line 53 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* .line 56 */
} // :cond_3
/* aget-object v1, v4, v2 */
/* .line 57 */
(( java.util.HashMap ) p1 ).remove ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 56 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
private Long b ( ) {
/* .locals 4 */
/* .prologue */
/* .line 65 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x3e8 */
/* div-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
private void c ( org.json.JSONObject p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 69 */
v0 = this.a;
(( java.util.HashMap ) v0 ).entrySet ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
v0 = } // :goto_0
/* if-nez v0, :cond_0 */
/* .line 72 */
return;
/* .line 69 */
} // :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 70 */
/* check-cast v1, Ljava/lang/String; */
(( org.json.JSONObject ) p1 ).put ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
} // .end method
private void d ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 76 */
final String v0 = "id"; // const-string v0, "id"
(( org.json.JSONObject ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
/* .line 77 */
final String v0 = "ts"; // const-string v0, "ts"
(( org.json.JSONObject ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
/* .line 78 */
final String v0 = "du"; // const-string v0, "du"
(( org.json.JSONObject ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
/* .line 81 */
(( org.json.JSONObject ) p1 ).keys ( ); // invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
/* .line 83 */
v0 = } // :goto_0
/* if-nez v0, :cond_0 */
/* .line 89 */
return;
/* .line 85 */
} // :cond_0
/* check-cast v0, Ljava/lang/String; */
/* .line 87 */
v2 = this.a;
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( java.util.HashMap ) v2 ).put ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
/* # virtual methods */
public void a ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 92 */
/* if-nez p1, :cond_0 */
/* .line 106 */
} // :goto_0
return;
/* .line 95 */
} // :cond_0
try { // :try_start_0
final String v0 = "id"; // const-string v0, "id"
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.b = v0;
/* .line 96 */
final String v0 = "ts"; // const-string v0, "ts"
(( org.json.JSONObject ) p1 ).getLong ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/a;->c:J */
/* .line 98 */
final String v0 = "du"; // const-string v0, "du"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 99 */
final String v0 = "du"; // const-string v0, "du"
(( org.json.JSONObject ) p1 ).getLong ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/a;->d:J */
/* .line 102 */
} // :cond_1
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/a;->d(Lorg/json/JSONObject;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 103 */
/* :catch_0 */
/* move-exception v0 */
/* .line 104 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public Boolean a ( ) {
/* .locals 5 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 128 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget-wide v1, p0, Lcom/umeng/analytics/a/a;->c:J */
/* const-wide/16 v3, 0x0 */
/* cmp-long v1, v1, v3 */
/* if-gtz v1, :cond_1 */
/* .line 129 */
} // :cond_0
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "mId or mTs is not initialized"; // const-string v2, "mId or mTs is not initialized"
com.umeng.common.Log .b ( v1,v2 );
/* .line 138 */
} // :goto_0
/* .line 133 */
} // :cond_1
v1 = this.a;
v1 = (( java.util.HashMap ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 134 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "mCustomKV is not initialized"; // const-string v2, "mCustomKV is not initialized"
com.umeng.common.Log .b ( v1,v2 );
/* .line 138 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 113 */
try { // :try_start_0
final String v0 = "id"; // const-string v0, "id"
v1 = this.b;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 114 */
final String v0 = "ts"; // const-string v0, "ts"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/a;->c:J */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
/* .line 116 */
/* iget-wide v0, p0, Lcom/umeng/analytics/a/a;->d:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_0 */
final String v0 = "du"; // const-string v0, "du"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/a;->d:J */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
/* .line 118 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/a;->c(Lorg/json/JSONObject;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 123 */
} // :goto_0
return;
/* .line 120 */
/* :catch_0 */
/* move-exception v0 */
/* .line 121 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
