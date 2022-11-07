public class com.umeng.analytics.a.d extends com.umeng.analytics.a.n implements com.umeng.analytics.a.g {
	 /* .source "Error.java" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.String a;
	 private final java.lang.String b;
	 /* # direct methods */
	 public com.umeng.analytics.a.d ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/umeng/analytics/a/n;-><init>()V */
		 /* .line 21 */
		 final String v0 = "context"; // const-string v0, "context"
		 this.b = v0;
		 /* .line 23 */
		 return;
	 } // .end method
	 public com.umeng.analytics.a.d ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Lcom/umeng/analytics/a/n;-><init>()V */
		 /* .line 21 */
		 final String v0 = "context"; // const-string v0, "context"
		 this.b = v0;
		 /* .line 26 */
		 this.a = p1;
		 /* .line 27 */
		 return;
	 } // .end method
	 public com.umeng.analytics.a.d ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0}, Lcom/umeng/analytics/a/n;-><init>()V */
		 /* .line 21 */
		 final String v0 = "context"; // const-string v0, "context"
		 this.b = v0;
		 /* .line 30 */
		 /* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/d;->a(Ljava/lang/Throwable;)Ljava/lang/String; */
		 this.a = v0;
		 /* .line 31 */
		 return;
	 } // .end method
	 private java.lang.String a ( java.lang.Throwable p0 ) {
		 /* .locals 4 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 34 */
		 /* if-nez p1, :cond_0 */
		 /* .line 55 */
	 } // :goto_0
	 /* .line 41 */
} // :cond_0
try { // :try_start_0
	 /* new-instance v2, Ljava/io/StringWriter; */
	 /* invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V */
	 /* .line 42 */
	 /* new-instance v3, Ljava/io/PrintWriter; */
	 /* invoke-direct {v3, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V */
	 /* .line 43 */
	 (( java.lang.Throwable ) p1 ).printStackTrace ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
	 /* .line 44 */
	 (( java.lang.Throwable ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
	 /* .line 45 */
} // :goto_1
/* if-nez v1, :cond_1 */
/* .line 49 */
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 50 */
(( java.io.PrintWriter ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/PrintWriter;->close()V
/* .line 51 */
(( java.io.Writer ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/Writer;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 52 */
/* :catch_0 */
/* move-exception v1 */
/* .line 53 */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
/* .line 46 */
} // :cond_1
try { // :try_start_1
(( java.lang.Throwable ) v1 ).printStackTrace ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
/* .line 47 */
(( java.lang.Throwable ) v1 ).getCause ( ); // invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
/* # virtual methods */
public void a ( org.json.JSONObject p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
/* if-nez p1, :cond_0 */
/* .line 81 */
} // :goto_0
return;
/* .line 73 */
} // :cond_0
try { // :try_start_0
final String v0 = "date"; // const-string v0, "date"
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.g = v0;
/* .line 74 */
final String v0 = "time"; // const-string v0, "time"
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.h = v0;
/* .line 76 */
final String v0 = "context"; // const-string v0, "context"
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
this.a = v0;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 78 */
/* :catch_0 */
/* move-exception v0 */
/* .line 79 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public Boolean a ( ) {
/* .locals 2 */
/* .prologue */
/* .line 59 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 60 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "mContent is not initialized"; // const-string v1, "mContent is not initialized"
com.umeng.common.Log .b ( v0,v1 );
/* .line 61 */
int v0 = 0; // const/4 v0, 0x0
/* .line 64 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0}, Lcom/umeng/analytics/a/n;->a()Z */
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 86 */
final String v0 = "date"; // const-string v0, "date"
v1 = this.g;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 87 */
final String v0 = "time"; // const-string v0, "time"
v1 = this.h;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 88 */
final String v0 = "context"; // const-string v0, "context"
v1 = this.a;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 89 */
return;
} // .end method
