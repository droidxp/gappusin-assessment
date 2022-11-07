public abstract class com.openfeint.internal.resource.LongResourceProperty extends com.openfeint.internal.resource.PrimitiveResourceProperty {
	 /* .source "LongResourceProperty.java" */
	 /* # direct methods */
	 public com.openfeint.internal.resource.LongResourceProperty ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/PrimitiveResourceProperty;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void copy ( com.openfeint.internal.resource.Resource p0, com.openfeint.internal.resource.Resource p1 ) {
		 /* .locals 2 */
		 /* .param p1, "lhs" # Lcom/openfeint/internal/resource/Resource; */
		 /* .param p2, "rhs" # Lcom/openfeint/internal/resource/Resource; */
		 /* .prologue */
		 /* .line 15 */
		 (( com.openfeint.internal.resource.LongResourceProperty ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/resource/LongResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)J
		 /* move-result-wide v0 */
		 (( com.openfeint.internal.resource.LongResourceProperty ) p0 ).set ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/openfeint/internal/resource/LongResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;J)V
		 /* .line 16 */
		 return;
	 } // .end method
	 public void generate ( com.openfeint.internal.resource.Resource p0, org.codehaus.jackson.JsonGenerator p1, java.lang.String p2 ) {
		 /* .locals 2 */
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
	 (( com.openfeint.internal.resource.LongResourceProperty ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/resource/LongResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)J
	 /* move-result-wide v0 */
	 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeNumber ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(J)V
	 /* .line 30 */
	 return;
} // .end method
public abstract Long get ( com.openfeint.internal.resource.Resource p0 ) {
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
/* .line 20 */
(( org.codehaus.jackson.JsonParser ) p2 ).getLongValue ( ); // invoke-virtual {p2}, Lorg/codehaus/jackson/JsonParser;->getLongValue()J
/* move-result-wide v0 */
(( com.openfeint.internal.resource.LongResourceProperty ) p0 ).set ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/openfeint/internal/resource/LongResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;J)V
/* .line 21 */
return;
} // .end method
public abstract void set ( com.openfeint.internal.resource.Resource p0, Long p1 ) {
} // .end method
public void set ( com.openfeint.internal.resource.Resource p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "obj" # Lcom/openfeint/internal/resource/Resource; */
/* .param p2, "val" # Ljava/lang/String; */
/* .prologue */
/* .line 24 */
java.lang.Long .valueOf ( p2 );
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
(( com.openfeint.internal.resource.LongResourceProperty ) p0 ).set ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/openfeint/internal/resource/LongResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;J)V
/* .line 25 */
return;
} // .end method
