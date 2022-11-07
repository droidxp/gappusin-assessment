public abstract class org.codehaus.jackson.JsonGenerator implements java.io.Closeable {
	 /* .source "JsonGenerator.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/JsonGenerator$Feature; */
	 /* } */
} // .end annotation
/* # instance fields */
protected org.codehaus.jackson.PrettyPrinter _cfgPrettyPrinter;
/* # direct methods */
protected org.codehaus.jackson.JsonGenerator ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 145 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 146 */
	 return;
} // .end method
/* # virtual methods */
public abstract void close ( ) {
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
} // .end method
public org.codehaus.jackson.JsonGenerator configure ( org.codehaus.jackson.JsonGenerator$Feature p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .param p2, "state" # Z */
/* .prologue */
/* .line 184 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 185 */
	 (( org.codehaus.jackson.JsonGenerator ) p0 ).enable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->enable(Lorg/codehaus/jackson/JsonGenerator$Feature;)Lorg/codehaus/jackson/JsonGenerator;
	 /* .line 189 */
} // :goto_0
/* .line 187 */
} // :cond_0
(( org.codehaus.jackson.JsonGenerator ) p0 ).disable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->disable(Lorg/codehaus/jackson/JsonGenerator$Feature;)Lorg/codehaus/jackson/JsonGenerator;
} // .end method
public abstract void copyCurrentEvent ( org.codehaus.jackson.JsonParser p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
public abstract void copyCurrentStructure ( org.codehaus.jackson.JsonParser p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
public abstract org.codehaus.jackson.JsonGenerator disable ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
} // .end method
public void disableFeature ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 224 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).disable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->disable(Lorg/codehaus/jackson/JsonGenerator$Feature;)Lorg/codehaus/jackson/JsonGenerator;
return;
} // .end method
public abstract org.codehaus.jackson.JsonGenerator enable ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
} // .end method
public void enableFeature ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 220 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).enable ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->enable(Lorg/codehaus/jackson/JsonGenerator$Feature;)Lorg/codehaus/jackson/JsonGenerator;
return;
} // .end method
public abstract void flush ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
public abstract org.codehaus.jackson.ObjectCodec getCodec ( ) {
} // .end method
public abstract org.codehaus.jackson.JsonStreamContext getOutputContext ( ) {
} // .end method
public abstract Boolean isClosed ( ) {
} // .end method
public abstract Boolean isEnabled ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
} // .end method
public Boolean isFeatureEnabled ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 1 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 232 */
v0 = (( org.codehaus.jackson.JsonGenerator ) p0 ).isEnabled ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->isEnabled(Lorg/codehaus/jackson/JsonGenerator$Feature;)Z
} // .end method
public abstract org.codehaus.jackson.JsonGenerator setCodec ( org.codehaus.jackson.ObjectCodec p0 ) {
} // .end method
public void setFeature ( org.codehaus.jackson.JsonGenerator$Feature p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .param p2, "state" # Z */
/* .prologue */
/* .line 228 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).configure ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/codehaus/jackson/JsonGenerator;->configure(Lorg/codehaus/jackson/JsonGenerator$Feature;Z)Lorg/codehaus/jackson/JsonGenerator;
return;
} // .end method
public org.codehaus.jackson.JsonGenerator setPrettyPrinter ( org.codehaus.jackson.PrettyPrinter p0 ) {
/* .locals 0 */
/* .param p1, "pp" # Lorg/codehaus/jackson/PrettyPrinter; */
/* .prologue */
/* .line 253 */
this._cfgPrettyPrinter = p1;
/* .line 254 */
} // .end method
public abstract org.codehaus.jackson.JsonGenerator useDefaultPrettyPrinter ( ) {
} // .end method
public final void writeArrayFieldStart ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 733 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 734 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeStartArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonGenerator;->writeStartArray()V
/* .line 735 */
return;
} // .end method
public abstract void writeBinary ( org.codehaus.jackson.Base64Variant p0, Object[] p1, Integer p2, Integer p3 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public void writeBinary ( Object[] p0 ) {
/* .locals 3 */
/* .param p1, "data" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 433 */
org.codehaus.jackson.Base64Variants .getDefaultVariant ( );
int v1 = 0; // const/4 v1, 0x0
/* array-length v2, p1 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeBinary ( v0, p1, v1, v2 ); // invoke-virtual {p0, v0, p1, v1, v2}, Lorg/codehaus/jackson/JsonGenerator;->writeBinary(Lorg/codehaus/jackson/Base64Variant;[BII)V
/* .line 434 */
return;
} // .end method
public void writeBinary ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "data" # [B */
/* .param p2, "offset" # I */
/* .param p3, "len" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 421 */
org.codehaus.jackson.Base64Variants .getDefaultVariant ( );
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeBinary ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Lorg/codehaus/jackson/JsonGenerator;->writeBinary(Lorg/codehaus/jackson/Base64Variant;[BII)V
/* .line 422 */
return;
} // .end method
public final void writeBinaryField ( java.lang.String p0, Object[] p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "data" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 713 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 714 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeBinary ( p2 ); // invoke-virtual {p0, p2}, Lorg/codehaus/jackson/JsonGenerator;->writeBinary([B)V
/* .line 715 */
return;
} // .end method
public abstract void writeBoolean ( Boolean p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public final void writeBooleanField ( java.lang.String p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "value" # Z */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 606 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 607 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeBoolean ( p2 ); // invoke-virtual {p0, p2}, Lorg/codehaus/jackson/JsonGenerator;->writeBoolean(Z)V
/* .line 608 */
return;
} // .end method
public abstract void writeEndArray ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeEndObject ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeFieldName ( java.lang.String p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeNull ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public final void writeNullField ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 621 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 622 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeNull ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonGenerator;->writeNull()V
/* .line 623 */
return;
} // .end method
public abstract void writeNumber ( Double p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeNumber ( Float p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeNumber ( Integer p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeNumber ( Long p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeNumber ( java.lang.String p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException;, */
/* Ljava/lang/UnsupportedOperationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeNumber ( java.math.BigDecimal p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeNumber ( java.math.BigInteger p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public final void writeNumberField ( java.lang.String p0, Double p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "value" # D */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 666 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 667 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeNumber ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(D)V
/* .line 668 */
return;
} // .end method
public final void writeNumberField ( java.lang.String p0, Float p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "value" # F */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 681 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 682 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeNumber ( p2 ); // invoke-virtual {p0, p2}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(F)V
/* .line 683 */
return;
} // .end method
public final void writeNumberField ( java.lang.String p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "value" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 636 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 637 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeNumber ( p2 ); // invoke-virtual {p0, p2}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(I)V
/* .line 638 */
return;
} // .end method
public final void writeNumberField ( java.lang.String p0, Long p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "value" # J */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 651 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 652 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeNumber ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(J)V
/* .line 653 */
return;
} // .end method
public final void writeNumberField ( java.lang.String p0, java.math.BigDecimal p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/math/BigDecimal; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 697 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 698 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeNumber ( p2 ); // invoke-virtual {p0, p2}, Lorg/codehaus/jackson/JsonGenerator;->writeNumber(Ljava/math/BigDecimal;)V
/* .line 699 */
return;
} // .end method
public abstract void writeObject ( java.lang.Object p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
public final void writeObjectField ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "pojo" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 769 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 770 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeObject ( p2 ); // invoke-virtual {p0, p2}, Lorg/codehaus/jackson/JsonGenerator;->writeObject(Ljava/lang/Object;)V
/* .line 771 */
return;
} // .end method
public final void writeObjectFieldStart ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 753 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 754 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeStartObject ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonGenerator;->writeStartObject()V
/* .line 755 */
return;
} // .end method
public abstract void writeRaw ( Object p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeRaw ( java.lang.String p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeRaw ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeRaw ( Object[] p0, Integer p1, Integer p2 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeRawValue ( java.lang.String p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeRawValue ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeRawValue ( Object[] p0, Integer p1, Integer p2 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeStartArray ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeStartObject ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeString ( java.lang.String p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public abstract void writeString ( Object[] p0, Integer p1, Integer p2 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public final void writeStringField ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 0 */
/* .param p1, "fieldName" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 591 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/JsonGenerator;->writeFieldName(Ljava/lang/String;)V
/* .line 592 */
(( org.codehaus.jackson.JsonGenerator ) p0 ).writeString ( p2 ); // invoke-virtual {p0, p2}, Lorg/codehaus/jackson/JsonGenerator;->writeString(Ljava/lang/String;)V
/* .line 593 */
return;
} // .end method
public abstract void writeTree ( org.codehaus.jackson.JsonNode p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
} // .end method
