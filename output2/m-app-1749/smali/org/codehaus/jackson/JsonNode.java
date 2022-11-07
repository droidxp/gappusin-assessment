public abstract class org.codehaus.jackson.JsonNode implements java.lang.Iterable {
	 /* .source "JsonNode.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Iterable", */
	 /* "<", */
	 /* "Lorg/codehaus/jackson/JsonNode;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
static final java.util.List NO_NODES;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/codehaus/jackson/JsonNode;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
static final java.util.List NO_STRINGS;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static org.codehaus.jackson.JsonNode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 31 */
java.util.Collections .emptyList ( );
/* .line 32 */
java.util.Collections .emptyList ( );
return;
} // .end method
protected org.codehaus.jackson.JsonNode ( ) {
/* .locals 0 */
/* .prologue */
/* .line 34 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public abstract org.codehaus.jackson.JsonToken asToken ( ) {
} // .end method
public abstract Boolean equals ( java.lang.Object p0 ) {
} // .end method
public org.codehaus.jackson.JsonNode get ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 243 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.codehaus.jackson.JsonNode get ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .prologue */
/* .line 255 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.math.BigInteger getBigIntegerValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 225 */
v0 = java.math.BigInteger.ZERO;
} // .end method
public getBinaryValue ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 206 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean getBooleanValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 209 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.math.BigDecimal getDecimalValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 224 */
v0 = java.math.BigDecimal.ZERO;
} // .end method
public Double getDoubleValue ( ) {
/* .locals 2 */
/* .prologue */
/* .line 223 */
/* const-wide/16 v0, 0x0 */
/* return-wide v0 */
} // .end method
public final org.codehaus.jackson.JsonNode getElementValue ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 271 */
(( org.codehaus.jackson.JsonNode ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonNode;->get(I)Lorg/codehaus/jackson/JsonNode;
} // .end method
public java.util.Iterator getElements ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Lorg/codehaus/jackson/JsonNode;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 313 */
v0 = org.codehaus.jackson.JsonNode.NO_NODES;
} // .end method
public java.util.Iterator getFieldNames ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 319 */
v0 = org.codehaus.jackson.JsonNode.NO_STRINGS;
} // .end method
public final org.codehaus.jackson.JsonNode getFieldValue ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 263 */
(( org.codehaus.jackson.JsonNode ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonNode;->get(Ljava/lang/String;)Lorg/codehaus/jackson/JsonNode;
} // .end method
public Integer getIntValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 221 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Long getLongValue ( ) {
/* .locals 2 */
/* .prologue */
/* .line 222 */
/* const-wide/16 v0, 0x0 */
/* return-wide v0 */
} // .end method
public abstract org.codehaus.jackson.JsonParser$NumberType getNumberType ( ) {
} // .end method
public java.lang.Number getNumberValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 219 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final org.codehaus.jackson.JsonNode getPath ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 362 */
(( org.codehaus.jackson.JsonNode ) p0 ).path ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonNode;->path(I)Lorg/codehaus/jackson/JsonNode;
} // .end method
public final org.codehaus.jackson.JsonNode getPath ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 344 */
(( org.codehaus.jackson.JsonNode ) p0 ).path ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonNode;->path(Ljava/lang/String;)Lorg/codehaus/jackson/JsonNode;
} // .end method
public java.lang.String getTextValue ( ) {
/* .locals 1 */
/* .prologue */
/* .line 192 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract java.lang.String getValueAsText ( ) {
} // .end method
public Boolean isArray ( ) {
/* .locals 1 */
/* .prologue */
/* .line 82 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isBigDecimal ( ) {
/* .locals 1 */
/* .prologue */
/* .line 131 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isBigInteger ( ) {
/* .locals 1 */
/* .prologue */
/* .line 132 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isBinary ( ) {
/* .locals 1 */
/* .prologue */
/* .line 156 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isBoolean ( ) {
/* .locals 1 */
/* .prologue */
/* .line 140 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isContainerNode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 63 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isDouble ( ) {
/* .locals 1 */
/* .prologue */
/* .line 130 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isFloatingPointNumber ( ) {
/* .locals 1 */
/* .prologue */
/* .line 115 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isInt ( ) {
/* .locals 1 */
/* .prologue */
/* .line 121 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isIntegralNumber ( ) {
/* .locals 1 */
/* .prologue */
/* .line 109 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isLong ( ) {
/* .locals 1 */
/* .prologue */
/* .line 128 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isMissingNode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 74 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isNull ( ) {
/* .locals 1 */
/* .prologue */
/* .line 146 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isNumber ( ) {
/* .locals 1 */
/* .prologue */
/* .line 103 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isObject ( ) {
/* .locals 1 */
/* .prologue */
/* .line 87 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isPojo ( ) {
/* .locals 1 */
/* .prologue */
/* .line 97 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isTextual ( ) {
/* .locals 1 */
/* .prologue */
/* .line 134 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isValueNode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 54 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final java.util.Iterator iterator ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Lorg/codehaus/jackson/JsonNode;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 305 */
(( org.codehaus.jackson.JsonNode ) p0 ).getElements ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonNode;->getElements()Ljava/util/Iterator;
} // .end method
public abstract org.codehaus.jackson.JsonNode path ( Integer p0 ) {
} // .end method
public abstract org.codehaus.jackson.JsonNode path ( java.lang.String p0 ) {
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .prologue */
/* .line 298 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract java.lang.String toString ( ) {
} // .end method
public abstract org.codehaus.jackson.JsonParser traverse ( ) {
} // .end method
public abstract void writeTo ( org.codehaus.jackson.JsonGenerator p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
