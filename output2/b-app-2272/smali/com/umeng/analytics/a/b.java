public class com.umeng.analytics.a.b implements com.umeng.analytics.a.g {
	 /* .source "EKVHub.java" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.String a;
	 public java.util.ArrayList b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Lcom/umeng/analytics/a/a;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.umeng.analytics.a.b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 16 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 14 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* .line 16 */
return;
} // .end method
public com.umeng.analytics.a.b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 18 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 14 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* .line 19 */
this.a = p1;
/* .line 20 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).add ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 21 */
return;
} // .end method
private void c ( org.json.JSONObject p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 24 */
v0 = (( org.json.JSONObject ) p1 ).length ( ); // invoke-virtual {p1}, Lorg/json/JSONObject;->length()I
/* if-nez v0, :cond_0 */
/* .line 27 */
} // :goto_0
return;
/* .line 26 */
} // :cond_0
(( org.json.JSONObject ) p1 ).keys ( ); // invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
/* check-cast v0, Ljava/lang/String; */
this.a = v0;
} // .end method
private void d ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 30 */
v0 = this.a;
/* if-nez v0, :cond_1 */
/* .line 39 */
} // :cond_0
return;
/* .line 32 */
} // :cond_1
v0 = this.a;
(( org.json.JSONObject ) p1 ).getJSONArray ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 34 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = (( org.json.JSONArray ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
/* if-ge v0, v2, :cond_0 */
/* .line 35 */
/* new-instance v2, Lcom/umeng/analytics/a/a; */
/* invoke-direct {v2}, Lcom/umeng/analytics/a/a;-><init>()V */
/* .line 36 */
(( org.json.JSONArray ) v1 ).getJSONObject ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
(( com.umeng.analytics.a.a ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/umeng/analytics/a/a;->a(Lorg/json/JSONObject;)V
/* .line 37 */
v3 = this.b;
(( java.util.ArrayList ) v3 ).add ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 34 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 81 */
v0 = this.b;
v1 = this.b;
(( java.util.ArrayList ) v0 ).addAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 82 */
return;
} // .end method
public void a ( org.json.JSONObject p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 42 */
/* if-nez p1, :cond_0 */
/* .line 46 */
} // :goto_0
return;
/* .line 44 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/b;->c(Lorg/json/JSONObject;)V */
/* .line 45 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/b;->d(Lorg/json/JSONObject;)V */
} // .end method
public Boolean a ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 67 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_1 */
} // :cond_0
/* move v0, v1 */
/* .line 74 */
} // :goto_0
/* .line 71 */
} // :cond_1
v0 = this.b;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :cond_2
/* if-nez v0, :cond_3 */
/* .line 74 */
int v0 = 1; // const/4 v0, 0x1
/* .line 71 */
} // :cond_3
/* check-cast v0, Lcom/umeng/analytics/a/a; */
/* .line 72 */
v0 = (( com.umeng.analytics.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/a;->a()Z
/* if-nez v0, :cond_2 */
/* move v0, v1 */
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 51 */
/* new-instance v1, Lorg/json/JSONArray; */
/* invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V */
/* .line 52 */
v0 = this.b;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
/* if-nez v0, :cond_0 */
/* .line 60 */
v0 = this.a;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 62 */
return;
/* .line 52 */
} // :cond_0
/* check-cast v0, Lcom/umeng/analytics/a/a; */
/* .line 53 */
/* new-instance v3, Lcom/umeng/analytics/a/c; */
/* invoke-direct {v3, p0, v0}, Lcom/umeng/analytics/a/c;-><init>(Lcom/umeng/analytics/a/b;Lcom/umeng/analytics/a/a;)V */
(( org.json.JSONArray ) v1 ).put ( v3 ); // invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
} // .end method
