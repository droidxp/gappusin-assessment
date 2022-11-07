public class com.openfeint.internal.resource.BlobUploadParameters extends com.openfeint.internal.resource.Resource {
	 /* .source "BlobUploadParameters.java" */
	 /* # instance fields */
	 public java.lang.String AWSAccessKeyId;
	 public java.lang.String acl;
	 public java.lang.String action;
	 public java.lang.String key;
	 public java.lang.String policy;
	 public java.lang.String signature;
	 /* # direct methods */
	 public com.openfeint.internal.resource.BlobUploadParameters ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
		 return;
	 } // .end method
	 public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 17 */
		 /* new-instance v0, Lcom/openfeint/internal/resource/BlobUploadParameters$1; */
		 /* const-class v1, Lcom/openfeint/internal/resource/BlobUploadParameters; */
		 final String v2 = "blob_upload_parameters"; // const-string v2, "blob_upload_parameters"
		 /* invoke-direct {v0, v1, v2}, Lcom/openfeint/internal/resource/BlobUploadParameters$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
		 /* .line 19 */
		 /* .local v0, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
		 v1 = this.mProperties;
		 final String v2 = "action"; // const-string v2, "action"
		 /* new-instance v3, Lcom/openfeint/internal/resource/BlobUploadParameters$2; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/BlobUploadParameters$2;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 20 */
		 v1 = this.mProperties;
		 final String v2 = "key"; // const-string v2, "key"
		 /* new-instance v3, Lcom/openfeint/internal/resource/BlobUploadParameters$3; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/BlobUploadParameters$3;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 21 */
		 v1 = this.mProperties;
		 final String v2 = "AWSAccessKeyId"; // const-string v2, "AWSAccessKeyId"
		 /* new-instance v3, Lcom/openfeint/internal/resource/BlobUploadParameters$4; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/BlobUploadParameters$4;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 22 */
		 v1 = this.mProperties;
		 final String v2 = "acl"; // const-string v2, "acl"
		 /* new-instance v3, Lcom/openfeint/internal/resource/BlobUploadParameters$5; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/BlobUploadParameters$5;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 23 */
		 v1 = this.mProperties;
		 final String v2 = "policy"; // const-string v2, "policy"
		 /* new-instance v3, Lcom/openfeint/internal/resource/BlobUploadParameters$6; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/BlobUploadParameters$6;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 24 */
		 v1 = this.mProperties;
		 final String v2 = "signature"; // const-string v2, "signature"
		 /* new-instance v3, Lcom/openfeint/internal/resource/BlobUploadParameters$7; */
		 /* invoke-direct {v3}, Lcom/openfeint/internal/resource/BlobUploadParameters$7;-><init>()V */
		 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 26 */
	 } // .end method
