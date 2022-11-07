public class com.openfeint.internal.resource.ServerException extends com.openfeint.internal.resource.Resource {
	 /* .source "ServerException.java" */
	 /* # instance fields */
	 public java.lang.String exceptionClass;
	 public java.lang.String message;
	 public Boolean needsDeveloperAttention;
	 /* # direct methods */
	 public com.openfeint.internal.resource.ServerException ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
		 return;
	 } // .end method
	 public com.openfeint.internal.resource.ServerException ( ) {
		 /* .locals 0 */
		 /* .param p1, "klass" # Ljava/lang/String; */
		 /* .param p2, "message" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
		 /* .line 11 */
		 this.exceptionClass = p1;
		 /* .line 12 */
		 this.message = p2;
		 /* .line 13 */
		 return;
	 } // .end method
	 public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 19 */
		 /* new-instance v0, Lcom/openfeint/internal/resource/ServerException$1; */
		 /* const-class v1, Lcom/openfeint/internal/resource/ServerException; */
		 final String v2 = "exception"; // const-string v2, "exception"
		 /* invoke-direct {v0, v1, v2}, Lcom/openfeint/internal/resource/ServerException$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
		 /* .line 21 */
		 /* .local v0, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
		 v1 = this.mProperties;
		 final String v2 = "class"; // const-string v2, "class"
		 /* new-instance v3, Lcom/openfeint/internal/resource/ServerException$2; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/ServerException$2;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 22 */
		 v1 = this.mProperties;
		 final String v2 = "message"; // const-string v2, "message"
		 /* new-instance v3, Lcom/openfeint/internal/resource/ServerException$3; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/ServerException$3;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 23 */
		 v1 = this.mProperties;
		 final String v2 = "needs_developer_attention"; // const-string v2, "needs_developer_attention"
		 /* new-instance v3, Lcom/openfeint/internal/resource/ServerException$4; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/ServerException$4;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 25 */
	 } // .end method
