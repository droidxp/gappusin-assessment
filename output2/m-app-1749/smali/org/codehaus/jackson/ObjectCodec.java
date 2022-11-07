public abstract class org.codehaus.jackson.ObjectCodec {
	 /* .source "ObjectCodec.java" */
	 /* # direct methods */
	 protected org.codehaus.jackson.ObjectCodec ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract org.codehaus.jackson.JsonNode createArrayNode ( ) {
	 } // .end method
	 public abstract org.codehaus.jackson.JsonNode createObjectNode ( ) {
	 } // .end method
	 public abstract org.codehaus.jackson.JsonNode readTree ( org.codehaus.jackson.JsonParser p0 ) {
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException;, */
		 /* Lorg/codehaus/jackson/JsonProcessingException; */
		 /* } */
	 } // .end annotation
} // .end method
public abstract java.lang.Object readValue ( org.codehaus.jackson.JsonParser p0, java.lang.Class p1 ) {
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(", */
	 /* "Lorg/codehaus/jackson/JsonParser;", */
	 /* "Ljava/lang/Class", */
	 /* "<TT;>;)TT;" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
public abstract java.lang.Object readValue ( org.codehaus.jackson.JsonParser p0, org.codehaus.jackson.type.JavaType p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Lorg/codehaus/jackson/JsonParser;", */
/* "Lorg/codehaus/jackson/type/JavaType;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
public abstract java.lang.Object readValue ( org.codehaus.jackson.JsonParser p0, org.codehaus.jackson.type.TypeReference p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Lorg/codehaus/jackson/JsonParser;", */
/* "Lorg/codehaus/jackson/type/TypeReference", */
/* "<*>;)TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
public abstract org.codehaus.jackson.JsonParser treeAsTokens ( org.codehaus.jackson.JsonNode p0 ) {
} // .end method
public abstract java.lang.Object treeToValue ( org.codehaus.jackson.JsonNode p0, java.lang.Class p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Lorg/codehaus/jackson/JsonNode;", */
/* "Ljava/lang/Class", */
/* "<TT;>;)TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeTree ( org.codehaus.jackson.JsonGenerator p0, org.codehaus.jackson.JsonNode p1 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeValue ( org.codehaus.jackson.JsonGenerator p0, java.lang.Object p1 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
