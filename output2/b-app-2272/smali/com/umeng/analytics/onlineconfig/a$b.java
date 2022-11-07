public class com.umeng.analytics.onlineconfig.a$b extends com.umeng.common.net.s implements java.lang.Runnable {
	 /* .source "OnlineConfigAgent.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/analytics/onlineconfig/a; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "b" */
} // .end annotation
/* # instance fields */
android.content.Context a;
final com.umeng.analytics.onlineconfig.a b; //synthetic
/* # direct methods */
public com.umeng.analytics.onlineconfig.a$b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 182 */
this.b = p1;
/* invoke-direct {p0}, Lcom/umeng/common/net/s;-><init>()V */
/* .line 183 */
(( android.content.Context ) p2 ).getApplicationContext ( ); // invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.a = v0;
/* .line 184 */
return;
} // .end method
private void a ( ) {
/* .locals 6 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 202 */
v0 = this.b;
v1 = this.a;
com.umeng.analytics.onlineconfig.a .a ( v0,v1 );
/* .line 203 */
/* new-instance v3, Lcom/umeng/analytics/onlineconfig/a$a; */
v1 = this.b;
/* invoke-direct {v3, v1, v0}, Lcom/umeng/analytics/onlineconfig/a$a;-><init>(Lcom/umeng/analytics/onlineconfig/a;Lorg/json/JSONObject;)V */
/* .line 206 */
v4 = com.umeng.analytics.g.s;
/* .line 207 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
/* move-object v0, v2 */
} // :goto_0
/* array-length v5, v4 */
/* if-lt v1, v5, :cond_1 */
/* .line 215 */
} // :cond_0
/* if-nez v0, :cond_2 */
/* .line 216 */
v0 = this.b;
com.umeng.analytics.onlineconfig.a .a ( v0,v2 );
/* .line 237 */
} // :goto_1
return;
/* .line 208 */
} // :cond_1
/* aget-object v0, v4, v1 */
(( com.umeng.analytics.onlineconfig.a$a ) v3 ).a ( v0 ); // invoke-virtual {v3, v0}, Lcom/umeng/analytics/onlineconfig/a$a;->a(Ljava/lang/String;)V
/* .line 209 */
/* const-class v0, Lcom/umeng/analytics/onlineconfig/b; */
(( com.umeng.analytics.onlineconfig.a$b ) p0 ).execute ( v3, v0 ); // invoke-virtual {p0, v3, v0}, Lcom/umeng/analytics/onlineconfig/a$b;->execute(Lcom/umeng/common/net/t;Ljava/lang/Class;)Lcom/umeng/common/net/u;
/* check-cast v0, Lcom/umeng/analytics/onlineconfig/b; */
/* .line 210 */
/* if-nez v0, :cond_0 */
/* .line 207 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 221 */
} // :cond_2
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "response : "; // const-string v4, "response : "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget-boolean v4, v0, Lcom/umeng/analytics/onlineconfig/b;->b:Z */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v1,v3 );
/* .line 223 */
/* iget-boolean v1, v0, Lcom/umeng/analytics/onlineconfig/b;->b:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 225 */
v1 = this.b;
com.umeng.analytics.onlineconfig.a .a ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 226 */
v1 = this.b;
com.umeng.analytics.onlineconfig.a .a ( v1 );
/* iget v2, v0, Lcom/umeng/analytics/onlineconfig/b;->c:I */
/* iget v3, v0, Lcom/umeng/analytics/onlineconfig/b;->d:I */
/* int-to-long v3, v3 */
/* .line 229 */
} // :cond_3
v1 = this.b;
v2 = this.a;
com.umeng.analytics.onlineconfig.a .a ( v1,v2,v0 );
/* .line 231 */
v1 = this.b;
v2 = this.a;
com.umeng.analytics.onlineconfig.a .b ( v1,v2,v0 );
/* .line 232 */
v1 = this.b;
v0 = this.a;
com.umeng.analytics.onlineconfig.a .a ( v1,v0 );
/* .line 235 */
} // :cond_4
v0 = this.b;
com.umeng.analytics.onlineconfig.a .a ( v0,v2 );
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 189 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/umeng/analytics/onlineconfig/a$b;->a()V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 195 */
} // :goto_0
return;
/* .line 190 */
/* :catch_0 */
/* move-exception v0 */
/* .line 191 */
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
com.umeng.analytics.onlineconfig.a .a ( v1,v2 );
/* .line 193 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "reques update error"; // const-string v2, "reques update error"
com.umeng.common.Log .c ( v1,v2,v0 );
} // .end method
public Boolean shouldCompressData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 198 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
