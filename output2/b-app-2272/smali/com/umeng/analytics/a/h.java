public class com.umeng.analytics.a.h extends com.umeng.analytics.a.l implements com.umeng.analytics.a.g {
	 /* .source "Launch.java" */
	 /* # interfaces */
	 /* # instance fields */
	 com.umeng.analytics.a.o a;
	 /* # direct methods */
	 public com.umeng.analytics.a.h ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Lcom/umeng/analytics/a/l;-><init>()V */
		 return;
	 } // .end method
	 public com.umeng.analytics.a.h ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/umeng/analytics/a/l;-><init>()V */
		 /* .line 20 */
		 this.e = p2;
		 /* .line 21 */
		 com.umeng.analytics.a.o .a ( p1 );
		 this.a = v0;
		 /* .line 22 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 25 */
		 this.a = p1;
		 /* .line 26 */
		 return;
	 } // .end method
	 public void a ( org.json.JSONObject p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 49 */
		 /* if-nez p1, :cond_0 */
		 /* .line 59 */
	 } // :goto_0
	 return;
	 /* .line 52 */
} // :cond_0
try { // :try_start_0
	 /* invoke-super {p0, p1}, Lcom/umeng/analytics/a/l;->a(Lorg/json/JSONObject;)V */
	 /* .line 54 */
	 (( com.umeng.analytics.a.h ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/a/h;->d(Lorg/json/JSONObject;)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 55 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 56 */
	 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public Boolean a ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 41 */
	 v0 = this.a;
	 /* if-nez v0, :cond_0 */
	 /* sget-boolean v0, Lcom/umeng/analytics/g;->i:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 42 */
		 final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
		 final String v1 = "missing location info in Launch"; // const-string v1, "missing location info in Launch"
		 com.umeng.common.Log .c ( v0,v1 );
		 /* .line 45 */
	 } // :cond_0
	 v0 = 	 /* invoke-super {p0}, Lcom/umeng/analytics/a/l;->a()Z */
} // .end method
public org.json.JSONObject b ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 68 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 70 */
	 try { // :try_start_0
		 /* new-instance v0, Lorg/json/JSONObject; */
		 /* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 71 */
		 try { // :try_start_1
			 (( com.umeng.analytics.a.h ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/umeng/analytics/a/h;->b(Lorg/json/JSONObject;)V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* .line 76 */
		 } // :goto_0
		 /* .line 72 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* move-object v2, v0 */
		 /* move-object v0, v1 */
		 /* move-object v1, v2 */
		 /* .line 73 */
	 } // :goto_1
	 (( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
	 /* .line 72 */
	 /* :catch_1 */
	 /* move-exception v1 */
} // .end method
public void b ( org.json.JSONObject p0 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 63 */
(( com.umeng.analytics.a.h ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/analytics/a/h;->c(Lorg/json/JSONObject;)V
/* .line 64 */
/* invoke-super {p0, p1}, Lcom/umeng/analytics/a/l;->b(Lorg/json/JSONObject;)V */
/* .line 65 */
return;
} // .end method
public void c ( org.json.JSONObject p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 29 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( com.umeng.analytics.a.o ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/o;->b(Lorg/json/JSONObject;)V
/* .line 30 */
} // :cond_0
return;
} // .end method
public void d ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 33 */
/* new-instance v0, Lcom/umeng/analytics/a/o; */
/* invoke-direct {v0}, Lcom/umeng/analytics/a/o;-><init>()V */
/* .line 34 */
(( com.umeng.analytics.a.o ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/o;->a(Lorg/json/JSONObject;)V
/* .line 36 */
v1 = (( com.umeng.analytics.a.o ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/o;->a()Z
if ( v1 != null) { // if-eqz v1, :cond_0
this.a = v0;
/* .line 37 */
} // :cond_0
return;
} // .end method
