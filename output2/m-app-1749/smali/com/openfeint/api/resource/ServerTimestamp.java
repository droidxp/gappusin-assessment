public class com.openfeint.api.resource.ServerTimestamp extends com.openfeint.internal.resource.Resource {
	 /* .source "ServerTimestamp.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/resource/ServerTimestamp$GetCB; */
	 /* } */
} // .end annotation
/* # instance fields */
public Long secondsSinceEpoch;
public java.util.Date timestamp;
/* # direct methods */
public com.openfeint.api.resource.ServerTimestamp ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 73 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
	 return;
} // .end method
public static void get ( com.openfeint.api.resource.ServerTimestamp$GetCB p0 ) {
	 /* .locals 1 */
	 /* .param p0, "cb" # Lcom/openfeint/api/resource/ServerTimestamp$GetCB; */
	 /* .prologue */
	 /* .line 50 */
	 /* new-instance v0, Lcom/openfeint/api/resource/ServerTimestamp$1; */
	 /* invoke-direct {v0, p0}, Lcom/openfeint/api/resource/ServerTimestamp$1;-><init>(Lcom/openfeint/api/resource/ServerTimestamp$GetCB;)V */
	 /* .line 67 */
	 /* .local v0, "req":Lcom/openfeint/internal/request/JSONRequest; */
	 (( com.openfeint.internal.request.JSONRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
	 /* .line 68 */
	 return;
} // .end method
public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 79 */
	 /* new-instance v0, Lcom/openfeint/api/resource/ServerTimestamp$2; */
	 /* const-class v1, Lcom/openfeint/api/resource/ServerTimestamp; */
	 final String v2 = "server_timestamp"; // const-string v2, "server_timestamp"
	 /* invoke-direct {v0, v1, v2}, Lcom/openfeint/api/resource/ServerTimestamp$2;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
	 /* .line 81 */
	 /* .local v0, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
	 v1 = this.mProperties;
	 final String v2 = "timestamp"; // const-string v2, "timestamp"
	 /* new-instance v3, Lcom/openfeint/api/resource/ServerTimestamp$3; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/ServerTimestamp$3;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 82 */
	 v1 = this.mProperties;
	 final String v2 = "seconds_since_epoch"; // const-string v2, "seconds_since_epoch"
	 /* new-instance v3, Lcom/openfeint/api/resource/ServerTimestamp$4; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/ServerTimestamp$4;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 84 */
} // .end method
