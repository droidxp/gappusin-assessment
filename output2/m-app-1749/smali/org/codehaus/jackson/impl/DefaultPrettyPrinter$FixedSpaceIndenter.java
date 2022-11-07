public class org.codehaus.jackson.impl.DefaultPrettyPrinter$FixedSpaceIndenter implements org.codehaus.jackson.impl.Indenter {
	 /* .source "DefaultPrettyPrinter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/codehaus/jackson/impl/DefaultPrettyPrinter; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "FixedSpaceIndenter" */
} // .end annotation
/* # direct methods */
public org.codehaus.jackson.impl.DefaultPrettyPrinter$FixedSpaceIndenter ( ) {
/* .locals 0 */
/* .prologue */
/* .line 217 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean isInline ( ) {
/* .locals 1 */
/* .prologue */
/* .line 225 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void writeIndentation ( org.codehaus.jackson.JsonGenerator p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .param p2, "level" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 222 */
/* const/16 v0, 0x20 */
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(C)V
/* .line 223 */
return;
} // .end method
