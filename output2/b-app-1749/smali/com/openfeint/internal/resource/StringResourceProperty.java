public abstract class com.openfeint.internal.resource.StringResourceProperty extends com.openfeint.internal.resource.PrimitiveResourceProperty {
	 /* .source "StringResourceProperty.java" */
	 /* # direct methods */
	 public com.openfeint.internal.resource.StringResourceProperty ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/PrimitiveResourceProperty;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void copy ( com.openfeint.internal.resource.Resource p0, com.openfeint.internal.resource.Resource p1 ) {
		 /* .locals 1 */
		 /* .param p1, "lhs" # Lcom/openfeint/internal/resource/Resource; */
		 /* .param p2, "rhs" # Lcom/openfeint/internal/resource/Resource; */
		 /* .prologue */
		 /* .line 16 */
		 (( com.openfeint.internal.resource.StringResourceProperty ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/resource/StringResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/lang/String;
		 (( com.openfeint.internal.resource.StringResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/StringResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/lang/String;)V
		 /* .line 17 */
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
	 /* .line 29 */
	 (( com.openfeint.internal.resource.StringResourceProperty ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/resource/StringResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/lang/String;
	 /* .line 30 */
	 /* .local v0, "o":Ljava/lang/String; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 31 */
		 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeFieldName ( p3 ); // invoke-virtual {p2, p3}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
		 /* .line 32 */
		 (( org.codehaus.jackson.JsonGenerator ) p2 ).writeString ( v0 ); // invoke-virtual {p2, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeString(Ljava/lang/String;)V
		 /* .line 34 */
	 } // :cond_0
	 return;
} // .end method
public abstract java.lang.String get ( com.openfeint.internal.resource.Resource p0 ) {
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
(( org.codehaus.jackson.JsonParser ) p2 ).getCurrentToken ( ); // invoke-virtual {p2}, Lorg/codehaus/jackson/JsonParser;->getCurrentToken()Lorg/codehaus/jackson/JsonToken;
v1 = org.codehaus.jackson.JsonToken.VALUE_NULL;
/* if-ne v0, v1, :cond_0 */
/* .line 21 */
int v0 = 0; // const/4 v0, 0x0
(( com.openfeint.internal.resource.StringResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/StringResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/lang/String;)V
/* .line 25 */
} // :goto_0
return;
/* .line 23 */
} // :cond_0
(( org.codehaus.jackson.JsonParser ) p2 ).getText ( ); // invoke-virtual {p2}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
(( com.openfeint.internal.resource.StringResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/StringResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/lang/String;)V
} // .end method
public abstract void set ( com.openfeint.internal.resource.Resource p0, java.lang.String p1 ) {
} // .end method
