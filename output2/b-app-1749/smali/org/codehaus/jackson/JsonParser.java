public abstract class org.codehaus.jackson.JsonParser implements java.io.Closeable {
	 /* .source "JsonParser.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/JsonParser$Feature;, */
	 /* Lorg/codehaus/jackson/JsonParser$NumberType; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer MAX_BYTE_I;
private static final Integer MAX_SHORT_I;
private static final Integer MIN_BYTE_I;
private static final Integer MIN_SHORT_I;
/* # instance fields */
protected org.codehaus.jackson.JsonToken _currToken;
protected Integer _features;
protected org.codehaus.jackson.JsonToken _lastClearedToken;
/* # direct methods */
protected org.codehaus.jackson.JsonParser ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 253 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
protected org.codehaus.jackson.JsonParseException _constructError ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .param p1, "msg" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 946 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonParseException; */
	 (( org.codehaus.jackson.JsonParser ) p0 ).getCurrentLocation ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getCurrentLocation()Lorg/codehaus/jackson/JsonLocation;
	 /* invoke-direct {v0, p1, v1}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
} // .end method
public void clearCurrentToken ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 497 */
	 v0 = this._currToken;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 498 */
		 v0 = this._currToken;
		 this._lastClearedToken = v0;
		 /* .line 499 */
		 int v0 = 0; // const/4 v0, 0x0
		 this._currToken = v0;
		 /* .line 501 */
	 } // :cond_0
	 return;
} // .end method
public abstract void close ( ) {
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
} // .end method
public org.codehaus.jackson.JsonParser configure ( org.codehaus.jackson.JsonParser$Feature p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .param p2, "state" # Z */
/* .prologue */
/* .line 334 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 335 */
	 (( org.codehaus.jackson.JsonParser ) p0 ).enableFeature ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonParser;->enableFeature(Lorg/codehaus/jackson/JsonParser$Feature;)V
	 /* .line 339 */
} // :goto_0
/* .line 337 */
} // :cond_0
(( org.codehaus.jackson.JsonParser ) p0 ).disableFeature ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonParser;->disableFeature(Lorg/codehaus/jackson/JsonParser$Feature;)V
} // .end method
public org.codehaus.jackson.JsonParser disable ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 322 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonParser;->_features:I */
v1 = (( org.codehaus.jackson.JsonParser$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser$Feature;->getMask()I
/* xor-int/lit8 v1, v1, -0x1 */
/* and-int/2addr v0, v1 */
/* iput v0, p0, Lorg/codehaus/jackson/JsonParser;->_features:I */
/* .line 323 */
} // .end method
public void disableFeature ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 362 */
(( org.codehaus.jackson.JsonParser ) p0 ).disable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonParser;->disable(Lorg/codehaus/jackson/JsonParser$Feature;)Lorg/codehaus/jackson/JsonParser;
return;
} // .end method
public org.codehaus.jackson.JsonParser enable ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 310 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonParser;->_features:I */
v1 = (( org.codehaus.jackson.JsonParser$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser$Feature;->getMask()I
/* or-int/2addr v0, v1 */
/* iput v0, p0, Lorg/codehaus/jackson/JsonParser;->_features:I */
/* .line 311 */
} // .end method
public void enableFeature ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 358 */
(( org.codehaus.jackson.JsonParser ) p0 ).enable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonParser;->enable(Lorg/codehaus/jackson/JsonParser$Feature;)Lorg/codehaus/jackson/JsonParser;
return;
} // .end method
public abstract java.math.BigInteger getBigIntegerValue ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public getBinaryValue ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 845 */
org.codehaus.jackson.Base64Variants .getDefaultVariant ( );
(( org.codehaus.jackson.JsonParser ) p0 ).getBinaryValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/JsonParser;->getBinaryValue(Lorg/codehaus/jackson/Base64Variant;)[B
} // .end method
public abstract getBinaryValue ( org.codehaus.jackson.Base64Variant p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public Boolean getBooleanValue ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 785 */
v0 = this._currToken;
v1 = org.codehaus.jackson.JsonToken.VALUE_TRUE;
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 786 */
} // :goto_0
} // :cond_0
v0 = this._currToken;
v1 = org.codehaus.jackson.JsonToken.VALUE_FALSE;
/* if-ne v0, v1, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 787 */
} // :cond_1
/* new-instance v0, Lorg/codehaus/jackson/JsonParseException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Current token ("; // const-string v2, "Current token ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this._currToken;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = ") not of boolean type"; // const-string v2, ") not of boolean type"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.JsonParser ) p0 ).getCurrentLocation ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getCurrentLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v0, v1, v2}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;)V */
/* throw v0 */
} // .end method
public Object getByteValue ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 654 */
v0 = (( org.codehaus.jackson.JsonParser ) p0 ).getIntValue ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getIntValue()I
/* .line 656 */
/* .local v0, "value":I */
/* const/16 v1, -0x80 */
/* if-lt v0, v1, :cond_0 */
/* const/16 v1, 0x7f */
/* if-le v0, v1, :cond_1 */
/* .line 657 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Numeric value ("; // const-string v2, "Numeric value ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.codehaus.jackson.JsonParser ) p0 ).getText ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ") out of range of Java byte"; // const-string v2, ") out of range of Java byte"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.JsonParser ) p0 )._constructError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/JsonParser;->_constructError(Ljava/lang/String;)Lorg/codehaus/jackson/JsonParseException;
/* throw v1 */
/* .line 659 */
} // :cond_1
/* int-to-byte v1, v0 */
} // .end method
public abstract org.codehaus.jackson.ObjectCodec getCodec ( ) {
} // .end method
public abstract org.codehaus.jackson.JsonLocation getCurrentLocation ( ) {
} // .end method
public abstract java.lang.String getCurrentName ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public org.codehaus.jackson.JsonToken getCurrentToken ( ) {
/* .locals 1 */
/* .prologue */
/* .line 465 */
v0 = this._currToken;
} // .end method
public abstract java.math.BigDecimal getDecimalValue ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract Double getDoubleValue ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public java.lang.Object getEmbeddedObject ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 805 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract Float getFloatValue ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract Integer getIntValue ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public org.codehaus.jackson.JsonToken getLastClearedToken ( ) {
/* .locals 1 */
/* .prologue */
/* .line 546 */
v0 = this._lastClearedToken;
} // .end method
public abstract Long getLongValue ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract org.codehaus.jackson.JsonParser$NumberType getNumberType ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract java.lang.Number getNumberValue ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract org.codehaus.jackson.JsonStreamContext getParsingContext ( ) {
} // .end method
public Object getShortValue ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 678 */
v0 = (( org.codehaus.jackson.JsonParser ) p0 ).getIntValue ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getIntValue()I
/* .line 679 */
/* .local v0, "value":I */
/* const/16 v1, -0x8000 */
/* if-lt v0, v1, :cond_0 */
/* const/16 v1, 0x7fff */
/* if-le v0, v1, :cond_1 */
/* .line 680 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Numeric value ("; // const-string v2, "Numeric value ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.codehaus.jackson.JsonParser ) p0 ).getText ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getText()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ") out of range of Java short"; // const-string v2, ") out of range of Java short"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.JsonParser ) p0 )._constructError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/JsonParser;->_constructError(Ljava/lang/String;)Lorg/codehaus/jackson/JsonParseException;
/* throw v1 */
/* .line 682 */
} // :cond_1
/* int-to-short v1, v0 */
} // .end method
public abstract java.lang.String getText ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract getTextCharacters ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract Integer getTextLength ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract Integer getTextOffset ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public abstract org.codehaus.jackson.JsonLocation getTokenLocation ( ) {
} // .end method
public Boolean hasCurrentToken ( ) {
/* .locals 1 */
/* .prologue */
/* .line 480 */
v0 = this._currToken;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract Boolean isClosed ( ) {
} // .end method
public Boolean isEnabled ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 349 */
/* iget v0, p0, Lorg/codehaus/jackson/JsonParser;->_features:I */
v1 = (( org.codehaus.jackson.JsonParser$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser$Feature;->getMask()I
/* and-int/2addr v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean isFeatureEnabled ( org.codehaus.jackson.JsonParser$Feature p0 ) {
/* .locals 1 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .prologue */
/* .line 366 */
v0 = (( org.codehaus.jackson.JsonParser ) p0 ).isEnabled ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonParser;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
} // .end method
public abstract org.codehaus.jackson.JsonToken nextToken ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public org.codehaus.jackson.JsonToken nextValue ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 413 */
(( org.codehaus.jackson.JsonParser ) p0 ).nextToken ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 414 */
/* .local v0, "t":Lorg/codehaus/jackson/JsonToken; */
v1 = org.codehaus.jackson.JsonToken.FIELD_NAME;
/* if-ne v0, v1, :cond_0 */
/* .line 415 */
(( org.codehaus.jackson.JsonParser ) p0 ).nextToken ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 417 */
} // :cond_0
} // .end method
public java.lang.Object readValueAs ( java.lang.Class p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
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
/* .prologue */
/* .line 878 */
/* .local p1, "valueType":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;" */
(( org.codehaus.jackson.JsonParser ) p0 ).getCodec ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getCodec()Lorg/codehaus/jackson/ObjectCodec;
/* .line 879 */
/* .local v0, "codec":Lorg/codehaus/jackson/ObjectCodec; */
/* if-nez v0, :cond_0 */
/* .line 880 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "No ObjectCodec defined for the parser, can not deserialize JSON into Java objects"; // const-string v2, "No ObjectCodec defined for the parser, can not deserialize JSON into Java objects"
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 882 */
} // :cond_0
(( org.codehaus.jackson.ObjectCodec ) v0 ).readValue ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/codehaus/jackson/ObjectCodec;->readValue(Lorg/codehaus/jackson/JsonParser;Ljava/lang/Class;)Ljava/lang/Object;
} // .end method
public java.lang.Object readValueAs ( org.codehaus.jackson.type.TypeReference p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
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
/* .prologue */
/* .line 907 */
/* .local p1, "valueTypeRef":Lorg/codehaus/jackson/type/TypeReference;, "Lorg/codehaus/jackson/type/TypeReference<*>;" */
(( org.codehaus.jackson.JsonParser ) p0 ).getCodec ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getCodec()Lorg/codehaus/jackson/ObjectCodec;
/* .line 908 */
/* .local v0, "codec":Lorg/codehaus/jackson/ObjectCodec; */
/* if-nez v0, :cond_0 */
/* .line 909 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "No ObjectCodec defined for the parser, can not deserialize JSON into Java objects"; // const-string v2, "No ObjectCodec defined for the parser, can not deserialize JSON into Java objects"
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 914 */
} // :cond_0
(( org.codehaus.jackson.ObjectCodec ) v0 ).readValue ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/codehaus/jackson/ObjectCodec;->readValue(Lorg/codehaus/jackson/JsonParser;Lorg/codehaus/jackson/type/TypeReference;)Ljava/lang/Object;
} // .end method
public org.codehaus.jackson.JsonNode readValueAsTree ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 927 */
(( org.codehaus.jackson.JsonParser ) p0 ).getCodec ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonParser;->getCodec()Lorg/codehaus/jackson/ObjectCodec;
/* .line 928 */
/* .local v0, "codec":Lorg/codehaus/jackson/ObjectCodec; */
/* if-nez v0, :cond_0 */
/* .line 929 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree"; // const-string v2, "No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree"
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 931 */
} // :cond_0
(( org.codehaus.jackson.ObjectCodec ) v0 ).readTree ( p0 ); // invoke-virtual {v0, p0}, Lorg/codehaus/jackson/ObjectCodec;->readTree(Lorg/codehaus/jackson/JsonParser;)Lorg/codehaus/jackson/JsonNode;
} // .end method
public abstract void setCodec ( org.codehaus.jackson.ObjectCodec p0 ) {
} // .end method
public void setFeature ( org.codehaus.jackson.JsonParser$Feature p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonParser$Feature; */
/* .param p2, "state" # Z */
/* .prologue */
/* .line 354 */
(( org.codehaus.jackson.JsonParser ) p0 ).configure ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/codehaus/jackson/JsonParser;->configure(Lorg/codehaus/jackson/JsonParser$Feature;Z)Lorg/codehaus/jackson/JsonParser;
return;
} // .end method
public abstract org.codehaus.jackson.JsonParser skipChildren ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
