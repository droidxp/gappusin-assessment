public abstract class com.openfeint.internal.resource.EnumResourceProperty extends com.openfeint.internal.resource.PrimitiveResourceProperty {
	 /* .source "EnumResourceProperty.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Enum", */
	 /* "<TT;>;>", */
	 /* "Lcom/openfeint/internal/resource/PrimitiveResourceProperty;" */
	 /* } */
} // .end annotation
/* # instance fields */
java.lang.Class mEnumClass;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class", */
/* "<TT;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.openfeint.internal.resource.EnumResourceProperty ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<TT;>;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 12 */
/* .local p0, "this":Lcom/openfeint/internal/resource/EnumResourceProperty;, "Lcom/openfeint/internal/resource/EnumResourceProperty<TT;>;" */
/* .local p1, "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;" */
/* invoke-direct {p0}, Lcom/openfeint/internal/resource/PrimitiveResourceProperty;-><init>()V */
/* .line 13 */
this.mEnumClass = p1;
/* .line 14 */
return;
} // .end method
/* # virtual methods */
public void copy ( com.openfeint.internal.resource.Resource p0, com.openfeint.internal.resource.Resource p1 ) {
/* .locals 1 */
/* .param p1, "lhs" # Lcom/openfeint/internal/resource/Resource; */
/* .param p2, "rhs" # Lcom/openfeint/internal/resource/Resource; */
/* .prologue */
/* .line 17 */
/* .local p0, "this":Lcom/openfeint/internal/resource/EnumResourceProperty;, "Lcom/openfeint/internal/resource/EnumResourceProperty<TT;>;" */
(( com.openfeint.internal.resource.EnumResourceProperty ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/resource/EnumResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/lang/Enum;
(( com.openfeint.internal.resource.EnumResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/EnumResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/lang/Enum;)V
/* .line 18 */
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
/* .line 29 */
/* .local p0, "this":Lcom/openfeint/internal/resource/EnumResourceProperty;, "Lcom/openfeint/internal/resource/EnumResourceProperty<TT;>;" */
(( com.openfeint.internal.resource.EnumResourceProperty ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/resource/EnumResourceProperty;->get(Lcom/openfeint/internal/resource/Resource;)Ljava/lang/Enum;
/* .line 30 */
/* .local v0, "val":Ljava/lang/Enum;, "TT;" */
(( org.codehaus.jackson.JsonGenerator ) p2 ).writeFieldName ( p3 ); // invoke-virtual {p2, p3}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 31 */
(( java.lang.Enum ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Enum;->toString()Ljava/lang/String;
(( org.codehaus.jackson.JsonGenerator ) p2 ).writeString ( v1 ); // invoke-virtual {p2, v1}, Lorg/codehaus/jackson/JsonGenerator;->writeString(Ljava/lang/String;)V
/* .line 32 */
return;
} // .end method
public abstract java.lang.Enum get ( com.openfeint.internal.resource.Resource p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ")TT;" */
/* } */
} // .end annotation
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
/* .line 25 */
/* .local p0, "this":Lcom/openfeint/internal/resource/EnumResourceProperty;, "Lcom/openfeint/internal/resource/EnumResourceProperty<TT;>;" */
v0 = this.mEnumClass;
(( org.codehaus.jackson.JsonParser ) p2 ).getText ( ); // invoke-virtual {p2}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
java.lang.Enum .valueOf ( v0,v1 );
(( com.openfeint.internal.resource.EnumResourceProperty ) p0 ).set ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/openfeint/internal/resource/EnumResourceProperty;->set(Lcom/openfeint/internal/resource/Resource;Ljava/lang/Enum;)V
/* .line 26 */
return;
} // .end method
public abstract void set ( com.openfeint.internal.resource.Resource p0, java.lang.Enum p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* "TT;)V" */
/* } */
} // .end annotation
} // .end method
