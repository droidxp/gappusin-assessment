class com.openfeint.internal.ui.WebViewCache$7 extends com.openfeint.internal.request.BaseRequest {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache;->singleRequest(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebViewCache this$0; //synthetic
final java.lang.String val$finalPath; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$7 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 971 */
this.this$0 = p1;
this.val$finalPath = p2;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/BaseRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 973 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void onResponse ( Integer p0, Object[] p1 ) {
/* .locals 6 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 976 */
/* const/16 v2, 0xc8 */
/* if-eq p1, v2, :cond_0 */
/* .line 977 */
v2 = this.this$0;
v2 = this.mHandler;
v3 = this.val$finalPath;
android.os.Message .obtain ( v2,v5,v4,v4,v3 );
/* .line 978 */
/* .local v1, "msg":Landroid/os/Message; */
(( android.os.Message ) v1 ).sendToTarget ( ); // invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
/* .line 992 */
} // :goto_0
return;
/* .line 982 */
} // .end local v1 # "msg":Landroid/os/Message;
} // :cond_0
try { // :try_start_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
com.openfeint.internal.ui.WebViewCache .access$1500 ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.val$finalPath;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.Util .saveFile ( p2,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 990 */
v2 = this.this$0;
v2 = this.mHandler;
v3 = this.val$finalPath;
android.os.Message .obtain ( v2,v5,v5,v4,v3 );
/* .line 991 */
/* .restart local v1 # "msg":Landroid/os/Message; */
(( android.os.Message ) v1 ).sendToTarget ( ); // invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
/* .line 983 */
} // .end local v1 # "msg":Landroid/os/Message;
/* :catch_0 */
/* move-exception v0 */
/* .line 985 */
/* .local v0, "e":Ljava/lang/Exception; */
v2 = this.this$0;
v2 = this.mHandler;
v3 = this.val$finalPath;
android.os.Message .obtain ( v2,v5,v4,v4,v3 );
/* .line 986 */
/* .restart local v1 # "msg":Landroid/os/Message; */
(( android.os.Message ) v1 ).sendToTarget ( ); // invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V
} // .end method
public java.lang.String path ( ) {
/* .locals 2 */
/* .prologue */
/* .line 974 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "/webui/"; // const-string v1, "/webui/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val$finalPath;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public Boolean signed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 972 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
