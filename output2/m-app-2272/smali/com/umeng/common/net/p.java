public class com.umeng.common.net.p extends com.umeng.common.net.u {
	 /* .source "ReportResponse.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/common/net/p$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public com.umeng.common.net.p$a a;
/* # direct methods */
public com.umeng.common.net.p ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 21 */
	 /* invoke-direct {p0, p1}, Lcom/umeng/common/net/u;-><init>(Lorg/json/JSONObject;)V */
	 /* .line 22 */
	 final String v0 = "ok"; // const-string v0, "ok"
	 final String v1 = "status"; // const-string v1, "status"
	 (( org.json.JSONObject ) p1 ).optString ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
	 v0 = 	 (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 /* if-nez v0, :cond_0 */
	 /* .line 23 */
	 final String v0 = "ok"; // const-string v0, "ok"
	 final String v1 = "success"; // const-string v1, "success"
	 (( org.json.JSONObject ) p1 ).optString ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
	 v0 = 	 (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 24 */
	 } // :cond_0
	 v0 = com.umeng.common.net.p$a.a;
	 this.a = v0;
	 /* .line 28 */
} // :goto_0
return;
/* .line 26 */
} // :cond_1
v0 = com.umeng.common.net.p$a.b;
this.a = v0;
} // .end method
