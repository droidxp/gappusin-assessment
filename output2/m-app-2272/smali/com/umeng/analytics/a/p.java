public class com.umeng.analytics.a.p implements com.umeng.analytics.a.g {
	 /* .source "UTraffic.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String c;
	 private static final java.lang.String d;
	 /* # instance fields */
	 public Long a;
	 public Long b;
	 /* # direct methods */
	 public com.umeng.analytics.a.p ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 26 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 20 */
		 /* iput-wide v0, p0, Lcom/umeng/analytics/a/p;->a:J */
		 /* .line 21 */
		 /* iput-wide v0, p0, Lcom/umeng/analytics/a/p;->b:J */
		 /* .line 26 */
		 return;
	 } // .end method
	 public static com.umeng.analytics.a.p a ( android.content.Context p0 ) {
		 /* .locals 13 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const-wide/16 v11, 0x0 */
		 /* .line 52 */
		 try { // :try_start_0
			 /* new-instance v0, Lcom/umeng/analytics/a/p; */
			 /* invoke-direct {v0}, Lcom/umeng/analytics/a/p;-><init>()V */
			 /* .line 54 */
			 com.umeng.analytics.a.p .b ( p0 );
			 /* .line 56 */
			 int v3 = 0; // const/4 v3, 0x0
			 /* aget-wide v3, v2, v3 */
			 /* cmp-long v3, v3, v11 */
			 /* if-lez v3, :cond_0 */
			 int v3 = 1; // const/4 v3, 0x1
			 /* aget-wide v3, v2, v3 */
			 /* cmp-long v3, v3, v11 */
			 /* if-gtz v3, :cond_1 */
		 } // :cond_0
		 /* move-object v0, v1 */
		 /* .line 80 */
	 } // :goto_0
	 /* .line 58 */
} // :cond_1
com.umeng.analytics.j .e ( p0 );
/* .line 60 */
final String v4 = "uptr"; // const-string v4, "uptr"
/* const-wide/16 v5, -0x1 */
/* move-result-wide v4 */
/* .line 61 */
final String v6 = "dntr"; // const-string v6, "dntr"
/* const-wide/16 v7, -0x1 */
/* move-result-wide v6 */
/* .line 62 */
final String v8 = "uptr"; // const-string v8, "uptr"
int v9 = 1; // const/4 v9, 0x1
/* aget-wide v9, v2, v9 */
/* .line 63 */
final String v8 = "dntr"; // const-string v8, "dntr"
int v9 = 0; // const/4 v9, 0x0
/* aget-wide v9, v2, v9 */
/* .line 64 */
/* .line 66 */
/* cmp-long v3, v4, v11 */
/* if-lez v3, :cond_2 */
/* cmp-long v3, v6, v11 */
/* if-gtz v3, :cond_3 */
} // :cond_2
/* move-object v0, v1 */
/* .line 68 */
} // :cond_3
int v3 = 0; // const/4 v3, 0x0
/* aget-wide v8, v2, v3 */
/* sub-long v6, v8, v6 */
/* aput-wide v6, v2, v3 */
/* .line 69 */
int v3 = 1; // const/4 v3, 0x1
/* aget-wide v6, v2, v3 */
/* sub-long v4, v6, v4 */
/* aput-wide v4, v2, v3 */
/* .line 71 */
int v3 = 0; // const/4 v3, 0x0
/* aget-wide v3, v2, v3 */
/* cmp-long v3, v3, v11 */
/* if-lez v3, :cond_4 */
int v3 = 1; // const/4 v3, 0x1
/* aget-wide v3, v2, v3 */
/* cmp-long v3, v3, v11 */
/* if-gtz v3, :cond_5 */
} // :cond_4
/* move-object v0, v1 */
/* .line 73 */
} // :cond_5
int v3 = 0; // const/4 v3, 0x0
/* aget-wide v3, v2, v3 */
/* iput-wide v3, v0, Lcom/umeng/analytics/a/p;->b:J */
/* .line 74 */
int v3 = 1; // const/4 v3, 0x1
/* aget-wide v2, v2, v3 */
/* iput-wide v2, v0, Lcom/umeng/analytics/a/p;->a:J */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 77 */
/* :catch_0 */
/* move-exception v0 */
/* .line 78 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v2 = "sdk less than 2.2 has get no traffic"; // const-string v2, "sdk less than 2.2 has get no traffic"
com.umeng.common.Log .e ( v0,v2 );
/* move-object v0, v1 */
/* .line 80 */
} // .end method
private static b ( android.content.Context p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 84 */
final String v0 = "android.net.TrafficStats"; // const-string v0, "android.net.TrafficStats"
java.lang.Class .forName ( v0 );
/* .line 85 */
final String v2 = "getUidRxBytes"; // const-string v2, "getUidRxBytes"
/* new-array v3, v9, [Ljava/lang/Class; */
v4 = java.lang.Integer.TYPE;
/* aput-object v4, v3, v8 */
(( java.lang.Class ) v0 ).getMethod ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 86 */
final String v2 = "getUidTxBytes"; // const-string v2, "getUidTxBytes"
/* new-array v4, v9, [Ljava/lang/Class; */
v5 = java.lang.Integer.TYPE;
/* aput-object v5, v4, v8 */
(( java.lang.Class ) v0 ).getMethod ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 88 */
(( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* iget v5, v0, Landroid/content/pm/ApplicationInfo;->uid:I */
/* .line 90 */
int v0 = -1; // const/4 v0, -0x1
/* if-ne v5, v0, :cond_0 */
/* move-object v0, v1 */
/* .line 96 */
} // :goto_0
/* .line 92 */
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
/* new-array v2, v0, [J */
/* .line 93 */
/* new-array v0, v9, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v5 );
/* aput-object v6, v0, v8 */
(( java.lang.reflect.Method ) v3 ).invoke ( v1, v0 ); // invoke-virtual {v3, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v6 */
/* aput-wide v6, v2, v8 */
/* .line 94 */
/* new-array v0, v9, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( v5 );
/* aput-object v3, v0, v8 */
(( java.lang.reflect.Method ) v4 ).invoke ( v1, v0 ); // invoke-virtual {v4, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* aput-wide v0, v2, v9 */
/* move-object v0, v2 */
/* .line 96 */
} // .end method
/* # virtual methods */
public void a ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 30 */
/* if-nez p1, :cond_1 */
/* .line 34 */
} // :cond_0
} // :goto_0
return;
/* .line 32 */
} // :cond_1
final String v0 = "uptr"; // const-string v0, "uptr"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "uptr"; // const-string v0, "uptr"
(( org.json.JSONObject ) p1 ).getLong ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/p;->a:J */
/* .line 33 */
} // :cond_2
final String v0 = "dntr"; // const-string v0, "dntr"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "dntr"; // const-string v0, "dntr"
(( org.json.JSONObject ) p1 ).getLong ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/p;->b:J */
} // .end method
public Boolean a ( ) {
/* .locals 4 */
/* .prologue */
/* const-wide/16 v2, 0x0 */
/* .line 44 */
/* iget-wide v0, p0, Lcom/umeng/analytics/a/p;->a:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_0 */
/* iget-wide v0, p0, Lcom/umeng/analytics/a/p;->b:J */
/* cmp-long v0, v0, v2 */
/* if-gtz v0, :cond_1 */
/* .line 45 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 47 */
} // :goto_0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* const-wide/16 v3, 0x0 */
/* .line 38 */
/* iget-wide v0, p0, Lcom/umeng/analytics/a/p;->a:J */
/* cmp-long v0, v0, v3 */
/* if-lez v0, :cond_0 */
final String v0 = "uptr"; // const-string v0, "uptr"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/p;->a:J */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
/* .line 39 */
} // :cond_0
/* iget-wide v0, p0, Lcom/umeng/analytics/a/p;->b:J */
/* cmp-long v0, v0, v3 */
/* if-lez v0, :cond_1 */
final String v0 = "dntr"; // const-string v0, "dntr"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/p;->b:J */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
/* .line 40 */
} // :cond_1
return;
} // .end method
