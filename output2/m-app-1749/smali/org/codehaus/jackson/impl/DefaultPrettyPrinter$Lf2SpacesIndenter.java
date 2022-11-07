public class org.codehaus.jackson.impl.DefaultPrettyPrinter$Lf2SpacesIndenter implements org.codehaus.jackson.impl.Indenter {
	 /* .source "DefaultPrettyPrinter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/codehaus/jackson/impl/DefaultPrettyPrinter; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "Lf2SpacesIndenter" */
} // .end annotation
/* # static fields */
static final SPACES;
static final Integer SPACE_COUNT;
static final java.lang.String SYSTEM_LINE_SEPARATOR;
/* # direct methods */
static org.codehaus.jackson.impl.DefaultPrettyPrinter$Lf2SpacesIndenter ( ) {
/* .locals 3 */
/* .prologue */
/* .line 237 */
int v0 = 0; // const/4 v0, 0x0
/* .line 239 */
/* .local v0, "lf":Ljava/lang/String; */
try { // :try_start_0
	 final String v1 = "line.separator"; // const-string v1, "line.separator"
	 java.lang.System .getProperty ( v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 241 */
} // :goto_0
/* if-nez v0, :cond_0 */
final String v0 = "\n"; // const-string v0, "\n"
} // .end local v0 # "lf":Ljava/lang/String;
} // :cond_0
/* .line 245 */
/* const/16 v1, 0x40 */
/* new-array v1, v1, [C */
/* .line 247 */
v1 = org.codehaus.jackson.impl.DefaultPrettyPrinter$Lf2SpacesIndenter.SPACES;
/* const/16 v2, 0x20 */
java.util.Arrays .fill ( v1,v2 );
/* .line 248 */
return;
/* .line 240 */
/* .restart local v0 # "lf":Ljava/lang/String; */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public org.codehaus.jackson.impl.DefaultPrettyPrinter$Lf2SpacesIndenter ( ) {
/* .locals 0 */
/* .prologue */
/* .line 250 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean isInline ( ) {
/* .locals 1 */
/* .prologue */
/* .line 252 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeIndentation ( org.codehaus.jackson.JsonGenerator p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "jg" # Lorg/codehaus/jackson/JsonGenerator; */
/* .param p2, "level" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v2, 0x40 */
int v1 = 0; // const/4 v1, 0x0
/* .line 257 */
v0 = org.codehaus.jackson.impl.DefaultPrettyPrinter$Lf2SpacesIndenter.SYSTEM_LINE_SEPARATOR;
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0 ); // invoke-virtual {p1, v0}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw(Ljava/lang/String;)V
/* .line 258 */
/* add-int/2addr p2, p2 */
/* .line 259 */
} // :goto_0
/* if-le p2, v2, :cond_0 */
/* .line 260 */
v0 = org.codehaus.jackson.impl.DefaultPrettyPrinter$Lf2SpacesIndenter.SPACES;
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw([CII)V
/* .line 261 */
v0 = org.codehaus.jackson.impl.DefaultPrettyPrinter$Lf2SpacesIndenter.SPACES;
/* array-length v0, v0 */
/* sub-int/2addr p2, v0 */
/* .line 263 */
} // :cond_0
v0 = org.codehaus.jackson.impl.DefaultPrettyPrinter$Lf2SpacesIndenter.SPACES;
(( org.codehaus.jackson.JsonGenerator ) p1 ).writeRaw ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Lorg/codehaus/jackson/JsonGenerator;->writeRaw([CII)V
/* .line 264 */
return;
} // .end method
