public abstract class com.openfeint.internal.resource.FloatResourceProperty extends com.openfeint.internal.resource.PrimitiveResourceProperty {
	 /* .source "FloatResourceProperty.java" */
	 /* # direct methods */
	 public com.openfeint.internal.resource.FloatResourceProperty ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/PrimitiveResourceProperty;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void copy ( com.openfeint.internal.resource.Resource p0, com.openfeint.internal.resource.Resource p1 ) {
		 /* .locals 1 */
		 /* .param p1, "lhs" # Lcom/openfeint/internal/resource/Resource; */
		 /* .param p2, "rhs" # Lcom/openfeint/internal/resource/Resource; */
		 /* .prologue */
		 /* .line 15 */
		 v0 = 		 (( com.openfeint.internal.resource.FloatResourceProperty ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/resource/FloatResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)F
		 (( com.openfeint.internal.resource.FloatResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/FloatResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;F)V
		 /* .line 16 */
		 return;
	 } // .end method
	 public void generate ( com.openfeint.internal.resource.Resource p0, org.codehaus.jackson.JsonGenerator p1, java.lang.String p2 ) {
		 /* .locals 1 */
		 /* .param p1, "obj" # Lcom/openfeint/internal/resource/Resource; */
		 /* .param p2, "generator" # Lorg/codehaus/jackson/JsonGenerator; */
		 /* .param p3, "key" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/codehaus/jackson/JsonGenerationException;, */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 28 */
	 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeFieldName ( p3 ); // invoke-virtual {p2, p3}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
	 /* .line 29 */
	 v0 = 	 (( com.openfeint.internal.resource.FloatResourceProperty ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/resource/FloatResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)F
	 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeNumber ( v0 ); // invoke-virtual {p2, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(F)V
	 /* .line 30 */
	 return;
} // .end method
public abstract Float get ( com.openfeint.internal.resource.Resource p0 ) {
} // .end method
public void parse ( com.openfeint.internal.resource.Resource p0, org.codehaus.jackson.JsonParser p1 ) {
	 /* .locals 1 */
	 /* .param p1, "obj" # Lcom/openfeint/internal/resource/Resource; */
	 /* .param p2, "jp" # Lorg/codehaus/jackson/JsonParser; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/JsonParseException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 21 */
try { // :try_start_0
	 v0 = 	 (( org.codehaus.jackson.JsonParser ) p2 ).getFloatValue ( ); // invoke-virtual {p2}, Lorg/codehaus/jackson/JsonParser;->getFloatValue()F
	 (( com.openfeint.internal.resource.FloatResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/FloatResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;F)V
	 /* :try_end_0 */
	 /* .catch Lorg/codehaus/jackson/JsonParseException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 25 */
} // :goto_0
return;
/* .line 22 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public abstract void set ( com.openfeint.internal.resource.Resource p0, Float p1 ) {
} // .end method
