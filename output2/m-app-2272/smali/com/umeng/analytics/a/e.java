public class com.umeng.analytics.a.e extends com.umeng.analytics.a.l implements com.umeng.analytics.a.g {
	 /* .source "Event.java" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.String a;
	 public java.lang.String b;
	 public Integer c;
	 public Long d;
	 private final java.lang.String k;
	 private final java.lang.String l;
	 private final java.lang.String m;
	 private final java.lang.String n;
	 /* # direct methods */
	 public com.umeng.analytics.a.e ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Lcom/umeng/analytics/a/l;-><init>()V */
		 /* .line 20 */
		 final String v0 = "tag"; // const-string v0, "tag"
		 this.k = v0;
		 /* .line 21 */
		 final String v0 = "label"; // const-string v0, "label"
		 this.l = v0;
		 /* .line 22 */
		 final String v0 = "acc"; // const-string v0, "acc"
		 this.m = v0;
		 /* .line 23 */
		 final String v0 = "du"; // const-string v0, "du"
		 this.n = v0;
		 /* .line 25 */
		 return;
	 } // .end method
	 public com.umeng.analytics.a.e ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0}, Lcom/umeng/analytics/a/l;-><init>()V */
		 /* .line 20 */
		 final String v0 = "tag"; // const-string v0, "tag"
		 this.k = v0;
		 /* .line 21 */
		 final String v0 = "label"; // const-string v0, "label"
		 this.l = v0;
		 /* .line 22 */
		 final String v0 = "acc"; // const-string v0, "acc"
		 this.m = v0;
		 /* .line 23 */
		 final String v0 = "du"; // const-string v0, "du"
		 this.n = v0;
		 /* .line 33 */
		 this.e = p1;
		 /* .line 35 */
		 this.a = p2;
		 /* .line 36 */
		 this.b = p3;
		 /* .line 38 */
		 /* iput p4, p0, Lcom/umeng/analytics/a/e;->c:I */
		 /* .line 39 */
		 /* iput-wide p5, p0, Lcom/umeng/analytics/a/e;->d:J */
		 /* .line 40 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( org.json.JSONObject p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 57 */
		 /* if-nez p1, :cond_1 */
		 /* .line 76 */
	 } // :cond_0
} // :goto_0
return;
/* .line 60 */
} // :cond_1
try { // :try_start_0
/* invoke-super {p0, p1}, Lcom/umeng/analytics/a/l;->a(Lorg/json/JSONObject;)V */
/* .line 62 */
final String v0 = "tag"; // const-string v0, "tag"
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.a = v0;
/* .line 64 */
final String v0 = "label"; // const-string v0, "label"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 65 */
	 final String v0 = "label"; // const-string v0, "label"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.b = v0;
	 /* .line 68 */
} // :cond_2
final String v0 = "acc"; // const-string v0, "acc"
v0 = (( org.json.JSONObject ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
/* iput v0, p0, Lcom/umeng/analytics/a/e;->c:I */
/* .line 70 */
final String v0 = "du"; // const-string v0, "du"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 71 */
	 final String v0 = "du"; // const-string v0, "du"
	 (( org.json.JSONObject ) p1 ).getLong ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
	 /* move-result-wide v0 */
	 /* iput-wide v0, p0, Lcom/umeng/analytics/a/e;->d:J */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 73 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 74 */
	 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public Boolean a ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 43 */
	 v1 = this.a;
	 /* if-nez v1, :cond_0 */
	 /* .line 44 */
	 final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
	 final String v2 = "mTag is not initilized"; // const-string v2, "mTag is not initilized"
	 com.umeng.common.Log .b ( v1,v2 );
	 /* .line 52 */
} // :goto_0
/* .line 48 */
} // :cond_0
/* iget v1, p0, Lcom/umeng/analytics/a/e;->c:I */
/* if-lez v1, :cond_1 */
/* iget v1, p0, Lcom/umeng/analytics/a/e;->c:I */
/* const/16 v2, 0x2710 */
/* if-le v1, v2, :cond_2 */
/* .line 49 */
} // :cond_1
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "mAcc is invalid : "; // const-string v3, "mAcc is invalid : "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v3, p0, Lcom/umeng/analytics/a/e;->c:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .b ( v1,v2 );
/* .line 52 */
} // :cond_2
v0 = /* invoke-super {p0}, Lcom/umeng/analytics/a/l;->a()Z */
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 81 */
final String v0 = "tag"; // const-string v0, "tag"
v1 = this.a;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 82 */
final String v0 = "acc"; // const-string v0, "acc"
/* iget v1, p0, Lcom/umeng/analytics/a/e;->c:I */
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
/* .line 84 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 85 */
final String v0 = "label"; // const-string v0, "label"
v1 = this.b;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 87 */
} // :cond_0
/* iget-wide v0, p0, Lcom/umeng/analytics/a/e;->d:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_1 */
/* .line 88 */
final String v0 = "du"; // const-string v0, "du"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/e;->d:J */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
/* .line 91 */
} // :cond_1
/* invoke-super {p0, p1}, Lcom/umeng/analytics/a/l;->b(Lorg/json/JSONObject;)V */
/* .line 92 */
return;
} // .end method
