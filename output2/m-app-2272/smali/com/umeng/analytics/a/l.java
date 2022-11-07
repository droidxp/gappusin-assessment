public class com.umeng.analytics.a.l extends com.umeng.analytics.a.n {
	 /* .source "Session.java" */
	 /* # static fields */
	 public static final java.lang.String f;
	 /* # instance fields */
	 public java.lang.String e;
	 /* # direct methods */
	 public com.umeng.analytics.a.l ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/umeng/analytics/a/n;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 this.e = p1;
		 /* .line 19 */
		 return;
	 } // .end method
	 public void a ( org.json.JSONObject p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Exception; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 38 */
	 /* invoke-super {p0, p1}, Lcom/umeng/analytics/a/n;->a(Lorg/json/JSONObject;)V */
	 /* .line 40 */
	 final String v0 = "session_id"; // const-string v0, "session_id"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.e = v0;
	 /* .line 41 */
	 return;
} // .end method
public Boolean a ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 23 */
	 v0 = this.e;
	 /* if-nez v0, :cond_0 */
	 /* .line 24 */
	 final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
	 final String v1 = "Session id is not initialized"; // const-string v1, "Session id is not initialized"
	 com.umeng.common.Log .b ( v0,v1 );
	 /* .line 25 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 27 */
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
/* .line 31 */
/* invoke-super {p0, p1}, Lcom/umeng/analytics/a/n;->b(Lorg/json/JSONObject;)V */
/* .line 33 */
final String v0 = "session_id"; // const-string v0, "session_id"
v1 = this.e;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 35 */
return;
} // .end method
