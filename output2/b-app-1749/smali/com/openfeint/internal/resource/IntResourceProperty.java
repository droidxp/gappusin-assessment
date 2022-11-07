public abstract class com.openfeint.internal.resource.IntResourceProperty extends com.openfeint.internal.resource.PrimitiveResourceProperty {
	 /* .source "IntResourceProperty.java" */
	 /* # direct methods */
	 public com.openfeint.internal.resource.IntResourceProperty ( ) {
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
		 v0 = 		 (( com.openfeint.internal.resource.IntResourceProperty ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/resource/IntResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)I
		 (( com.openfeint.internal.resource.IntResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/IntResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;I)V
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
	 /* .line 30 */
	 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeFieldName ( p3 ); // invoke-virtual {p2, p3}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
	 /* .line 31 */
	 v0 = 	 (( com.openfeint.internal.resource.IntResourceProperty ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/resource/IntResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)I
	 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeNumber ( v0 ); // invoke-virtual {p2, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(I)V
	 /* .line 32 */
	 return;
} // .end method
public abstract Integer get ( com.openfeint.internal.resource.Resource p0 ) {
} // .end method
public void parse ( com.openfeint.internal.resource.Resource p0, org.codehaus.jackson.JsonParser p1 ) {
	 /* .locals 2 */
	 /* .param p1, "obj" # Lcom/openfeint/internal/resource/Resource; */
	 /* .param p2, "jp" # Lorg/codehaus/jackson/JsonParser; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/JsonParseException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 22 */
try { // :try_start_0
	 (( org.codehaus.jackson.JsonParser ) p2 ).getIntValue ( ); // invoke-virtual {p2}, Lorg/codehaus/jackson/JsonParser;->getIntValue()I
	 /* :try_end_0 */
	 v1 = 	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 26 */
	 /* .local v1, "value":I */
} // :goto_0
(( com.openfeint.internal.resource.IntResourceProperty ) p0 ).set ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lcom/openfeint/internal/resource/IntResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;I)V
/* .line 27 */
return;
/* .line 23 */
} // .end local v1 # "value":I
/* :catch_0 */
/* move-exception v0 */
/* .line 24 */
/* .local v0, "e":Ljava/lang/Exception; */
int v1 = 0; // const/4 v1, 0x0
/* .restart local v1 # "value":I */
} // .end method
public abstract void set ( com.openfeint.internal.resource.Resource p0, Integer p1 ) {
} // .end method
