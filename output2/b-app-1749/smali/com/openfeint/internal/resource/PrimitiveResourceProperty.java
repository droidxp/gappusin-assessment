public abstract class com.openfeint.internal.resource.PrimitiveResourceProperty extends com.openfeint.internal.resource.ResourceProperty {
	 /* .source "PrimitiveResourceProperty.java" */
	 /* # direct methods */
	 public com.openfeint.internal.resource.PrimitiveResourceProperty ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/ResourceProperty;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void copy ( com.openfeint.internal.resource.Resource p0, com.openfeint.internal.resource.Resource p1 ) {
	 } // .end method
	 public abstract void generate ( com.openfeint.internal.resource.Resource p0, org.codehaus.jackson.JsonGenerator p1, java.lang.String p2 ) {
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/codehaus/jackson/JsonGenerationException;, */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
} // .end method
public abstract void parse ( com.openfeint.internal.resource.Resource p0, org.codehaus.jackson.JsonParser p1 ) {
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/JsonParseException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
} // .end method
