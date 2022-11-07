public abstract class org.codehaus.jackson.impl.JsonGeneratorBase extends org.codehaus.jackson.JsonGenerator {
	 /* .source "JsonGeneratorBase.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/impl/JsonGeneratorBase$1; */
	 /* } */
} // .end annotation
/* # instance fields */
protected Boolean _cfgNumbersAsStrings;
protected Boolean _closed;
protected Integer _features;
protected org.codehaus.jackson.ObjectCodec _objectCodec;
protected org.codehaus.jackson.impl.JsonWriteContext _writeContext;
/* # direct methods */
protected org.codehaus.jackson.impl.JsonGeneratorBase ( ) {
	 /* .locals 1 */
	 /* .param p1, "features" # I */
	 /* .param p2, "codec" # Lorg/codehaus/jackson/ObjectCodec; */
	 /* .prologue */
	 /* .line 75 */
	 /* invoke-direct {p0}, Lorg/codehaus/jackson/JsonGenerator;-><init>()V */
	 /* .line 76 */
	 /* iput p1, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_features:I */
	 /* .line 77 */
	 org.codehaus.jackson.impl.JsonWriteContext .createRootContext ( );
	 this._writeContext = v0;
	 /* .line 78 */
	 this._objectCodec = p2;
	 /* .line 79 */
	 v0 = org.codehaus.jackson.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS;
	 v0 = 	 (( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).isEnabled ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->isEnabled(Lorg/codehaus/jackson/JsonGenerator$Feature;)Z
	 /* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_cfgNumbersAsStrings:Z */
	 /* .line 80 */
	 return;
} // .end method
/* # virtual methods */
protected void _cantHappen ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 439 */
	 /* new-instance v0, Ljava/lang/RuntimeException; */
	 final String v1 = "Internal error: should never end up through this code path"; // const-string v1, "Internal error: should never end up through this code path"
	 /* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
protected abstract void _releaseBuffers ( ) {
} // .end method
protected void _reportError ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p1, "msg" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/JsonGenerationException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 434 */
/* new-instance v0, Lorg/codehaus/jackson/JsonGenerationException; */
/* invoke-direct {v0, p1}, Lorg/codehaus/jackson/JsonGenerationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
protected abstract void _verifyValueWrite ( java.lang.String p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
protected abstract void _writeEndArray ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
protected abstract void _writeEndObject ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
protected abstract void _writeFieldName ( java.lang.String p0, Boolean p1 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
protected void _writeSimpleObject ( java.lang.Object p0 ) {
/* .locals 4 */
/* .param p1, "value" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 456 */
/* if-nez p1, :cond_0 */
/* .line 457 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNull ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNull()V
/* .line 508 */
} // .end local p1 # "value":Ljava/lang/Object;
} // :goto_0
return;
/* .line 460 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_0
/* instance-of v1, p1, Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 461 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "value":Ljava/lang/Object;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeString ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeString(Ljava/lang/String;)V
/* .line 464 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_1
/* instance-of v1, p1, Ljava/lang/Number; */
if ( v1 != null) { // if-eqz v1, :cond_b
/* move-object v0, p1 */
/* .line 465 */
/* check-cast v0, Ljava/lang/Number; */
/* .line 466 */
/* .local v0, "n":Ljava/lang/Number; */
/* instance-of v1, v0, Ljava/lang/Integer; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 467 */
v1 = (( java.lang.Number ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Number;->intValue()I
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(I)V
/* .line 469 */
} // :cond_2
/* instance-of v1, v0, Ljava/lang/Long; */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 470 */
(( java.lang.Number ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Number;->longValue()J
/* move-result-wide v1 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(J)V
/* .line 472 */
} // :cond_3
/* instance-of v1, v0, Ljava/lang/Double; */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 473 */
(( java.lang.Number ) v0 ).doubleValue ( ); // invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
/* move-result-wide v1 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(D)V
/* .line 475 */
} // :cond_4
/* instance-of v1, v0, Ljava/lang/Float; */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 476 */
v1 = (( java.lang.Number ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(F)V
/* .line 478 */
} // :cond_5
/* instance-of v1, v0, Ljava/lang/Short; */
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 479 */
v1 = (( java.lang.Number ) v0 ).shortValue ( ); // invoke-virtual {v0}, Ljava/lang/Number;->shortValue()S
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(I)V
/* .line 481 */
} // :cond_6
/* instance-of v1, v0, Ljava/lang/Byte; */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 482 */
v1 = (( java.lang.Number ) v0 ).byteValue ( ); // invoke-virtual {v0}, Ljava/lang/Number;->byteValue()B
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(I)V
/* .line 484 */
} // :cond_7
/* instance-of v1, v0, Ljava/math/BigInteger; */
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 485 */
/* check-cast v0, Ljava/math/BigInteger; */
} // .end local v0 # "n":Ljava/lang/Number;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(Ljava/math/BigInteger;)V
/* .line 487 */
/* .restart local v0 # "n":Ljava/lang/Number; */
} // :cond_8
/* instance-of v1, v0, Ljava/math/BigDecimal; */
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 488 */
/* check-cast v0, Ljava/math/BigDecimal; */
} // .end local v0 # "n":Ljava/lang/Number;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(Ljava/math/BigDecimal;)V
/* .line 493 */
/* .restart local v0 # "n":Ljava/lang/Number; */
} // :cond_9
/* instance-of v1, v0, Ljava/util/concurrent/atomic/AtomicInteger; */
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 494 */
/* check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger; */
} // .end local v0 # "n":Ljava/lang/Number;
v1 = (( java.util.concurrent.atomic.AtomicInteger ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(I)V
/* .line 496 */
/* .restart local v0 # "n":Ljava/lang/Number; */
} // :cond_a
/* instance-of v1, v0, Ljava/util/concurrent/atomic/AtomicLong; */
if ( v1 != null) { // if-eqz v1, :cond_e
/* .line 497 */
/* check-cast v0, Ljava/util/concurrent/atomic/AtomicLong; */
} // .end local v0 # "n":Ljava/lang/Number;
(( java.util.concurrent.atomic.AtomicLong ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J
/* move-result-wide v1 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(J)V
/* goto/16 :goto_0 */
/* .line 500 */
} // :cond_b
/* instance-of v1, p1, [B */
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 501 */
/* check-cast p1, [B */
} // .end local p1 # "value":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeBinary ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeBinary([B)V
/* goto/16 :goto_0 */
/* .line 503 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_c
/* instance-of v1, p1, Ljava/lang/Boolean; */
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 504 */
/* check-cast p1, Ljava/lang/Boolean; */
} // .end local p1 # "value":Ljava/lang/Object;
v1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeBoolean ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeBoolean(Z)V
/* goto/16 :goto_0 */
/* .line 506 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_d
/* instance-of v1, p1, Ljava/util/concurrent/atomic/AtomicBoolean; */
if ( v1 != null) { // if-eqz v1, :cond_e
/* .line 507 */
/* check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean; */
} // .end local p1 # "value":Ljava/lang/Object;
v1 = (( java.util.concurrent.atomic.AtomicBoolean ) p1 ).get ( ); // invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeBoolean ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeBoolean(Z)V
/* goto/16 :goto_0 */
/* .line 510 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_e
/* new-instance v1, Ljava/lang/IllegalStateException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed "; // const-string v3, "No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ")"; // const-string v3, ")"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // .end method
protected abstract void _writeStartArray ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
protected abstract void _writeStartObject ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public void close ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 314 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_closed:Z */
/* .line 315 */
return;
} // .end method
public final void copyCurrentEvent ( org.codehaus.jackson.JsonParser p0 ) {
/* .locals 3 */
/* .param p1, "jp" # Lorg/codehaus/jackson/JsonParser; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 328 */
v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
(( org.codehaus.jackson.JsonParser ) p1 ).getCurrentToken ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getCurrentToken()Lorg/codehaus/jackson/JsonToken;
v1 = (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
/* .line 384 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._cantHappen ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_cantHappen()V
/* .line 386 */
} // :goto_0
return;
/* .line 330 */
/* :pswitch_0 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeStartObject ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeStartObject()V
/* .line 333 */
/* :pswitch_1 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeEndObject ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeEndObject()V
/* .line 336 */
/* :pswitch_2 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeStartArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeStartArray()V
/* .line 339 */
/* :pswitch_3 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeEndArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeEndArray()V
/* .line 342 */
/* :pswitch_4 */
(( org.codehaus.jackson.JsonParser ) p1 ).getCurrentName ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getCurrentName()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeFieldName ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeFieldName(Ljava/lang/String;)V
/* .line 345 */
/* :pswitch_5 */
(( org.codehaus.jackson.JsonParser ) p1 ).getTextCharacters ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getTextCharacters()[C
v1 = (( org.codehaus.jackson.JsonParser ) p1 ).getTextOffset ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getTextOffset()I
v2 = (( org.codehaus.jackson.JsonParser ) p1 ).getTextLength ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getTextLength()I
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeString ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeString([CII)V
/* .line 348 */
/* :pswitch_6 */
v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType;
(( org.codehaus.jackson.JsonParser ) p1 ).getNumberType ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getNumberType()Lorg/codehaus/jackson/JsonParser$NumberType;
v1 = (( org.codehaus.jackson.JsonParser$NumberType ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser$NumberType;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_1 */
/* .line 356 */
(( org.codehaus.jackson.JsonParser ) p1 ).getLongValue ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getLongValue()J
/* move-result-wide v0 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(J)V
/* .line 350 */
/* :pswitch_7 */
v0 = (( org.codehaus.jackson.JsonParser ) p1 ).getIntValue ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getIntValue()I
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(I)V
/* .line 353 */
/* :pswitch_8 */
(( org.codehaus.jackson.JsonParser ) p1 ).getBigIntegerValue ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getBigIntegerValue()Ljava/math/BigInteger;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(Ljava/math/BigInteger;)V
/* .line 360 */
/* :pswitch_9 */
v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType;
(( org.codehaus.jackson.JsonParser ) p1 ).getNumberType ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getNumberType()Lorg/codehaus/jackson/JsonParser$NumberType;
v1 = (( org.codehaus.jackson.JsonParser$NumberType ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser$NumberType;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_2 */
/* .line 368 */
(( org.codehaus.jackson.JsonParser ) p1 ).getDoubleValue ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getDoubleValue()D
/* move-result-wide v0 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(D)V
/* .line 362 */
/* :pswitch_a */
(( org.codehaus.jackson.JsonParser ) p1 ).getDecimalValue ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getDecimalValue()Ljava/math/BigDecimal;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(Ljava/math/BigDecimal;)V
/* .line 365 */
/* :pswitch_b */
v0 = (( org.codehaus.jackson.JsonParser ) p1 ).getFloatValue ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getFloatValue()F
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNumber ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNumber(F)V
/* .line 372 */
/* :pswitch_c */
int v0 = 1; // const/4 v0, 0x1
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeBoolean ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeBoolean(Z)V
/* .line 375 */
/* :pswitch_d */
int v0 = 0; // const/4 v0, 0x0
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeBoolean ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeBoolean(Z)V
/* .line 378 */
/* :pswitch_e */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNull ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNull()V
/* goto/16 :goto_0 */
/* .line 381 */
/* :pswitch_f */
(( org.codehaus.jackson.JsonParser ) p1 ).getEmbeddedObject ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getEmbeddedObject()Ljava/lang/Object;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeObject ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeObject(Ljava/lang/Object;)V
/* goto/16 :goto_0 */
/* .line 328 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_9 */
/* :pswitch_c */
/* :pswitch_d */
/* :pswitch_e */
/* :pswitch_f */
} // .end packed-switch
/* .line 348 */
/* :pswitch_data_1 */
/* .packed-switch 0x1 */
/* :pswitch_7 */
/* :pswitch_8 */
} // .end packed-switch
/* .line 360 */
/* :pswitch_data_2 */
/* .packed-switch 0x3 */
/* :pswitch_a */
/* :pswitch_b */
} // .end packed-switch
} // .end method
public final void copyCurrentStructure ( org.codehaus.jackson.JsonParser p0 ) {
/* .locals 3 */
/* .param p1, "jp" # Lorg/codehaus/jackson/JsonParser; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 391 */
(( org.codehaus.jackson.JsonParser ) p1 ).getCurrentToken ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getCurrentToken()Lorg/codehaus/jackson/JsonToken;
/* .line 394 */
/* .local v0, "t":Lorg/codehaus/jackson/JsonToken; */
v1 = org.codehaus.jackson.JsonToken.FIELD_NAME;
/* if-ne v0, v1, :cond_0 */
/* .line 395 */
(( org.codehaus.jackson.JsonParser ) p1 ).getCurrentName ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->getCurrentName()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeFieldName ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeFieldName(Ljava/lang/String;)V
/* .line 396 */
(( org.codehaus.jackson.JsonParser ) p1 ).nextToken ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 400 */
} // :cond_0
v1 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
v2 = (( org.codehaus.jackson.JsonToken ) v0 ).ordinal ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_0 */
/* .line 416 */
/* :pswitch_0 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).copyCurrentEvent ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->copyCurrentEvent(Lorg/codehaus/jackson/JsonParser;)V
/* .line 418 */
} // :goto_0
return;
/* .line 402 */
/* :pswitch_1 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeStartArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeStartArray()V
/* .line 403 */
} // :goto_1
(( org.codehaus.jackson.JsonParser ) p1 ).nextToken ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v2 = org.codehaus.jackson.JsonToken.END_ARRAY;
/* if-eq v1, v2, :cond_1 */
/* .line 404 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).copyCurrentStructure ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->copyCurrentStructure(Lorg/codehaus/jackson/JsonParser;)V
/* .line 406 */
} // :cond_1
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeEndArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeEndArray()V
/* .line 409 */
/* :pswitch_2 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeStartObject ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeStartObject()V
/* .line 410 */
} // :goto_2
(( org.codehaus.jackson.JsonParser ) p1 ).nextToken ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonParser;->nextToken()Lorg/codehaus/jackson/JsonToken;
v2 = org.codehaus.jackson.JsonToken.END_OBJECT;
/* if-eq v1, v2, :cond_2 */
/* .line 411 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).copyCurrentStructure ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->copyCurrentStructure(Lorg/codehaus/jackson/JsonParser;)V
/* .line 413 */
} // :cond_2
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeEndObject ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeEndObject()V
/* .line 400 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public org.codehaus.jackson.JsonGenerator disable ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 99 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_features:I */
v1 = (( org.codehaus.jackson.JsonGenerator$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator$Feature;->getMask()I
/* xor-int/lit8 v1, v1, -0x1 */
/* and-int/2addr v0, v1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_features:I */
/* .line 100 */
v0 = org.codehaus.jackson.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS;
/* if-ne p1, v0, :cond_0 */
/* .line 101 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_cfgNumbersAsStrings:Z */
/* .line 103 */
} // :cond_0
} // .end method
public org.codehaus.jackson.JsonGenerator enable ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 90 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_features:I */
v1 = (( org.codehaus.jackson.JsonGenerator$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator$Feature;->getMask()I
/* or-int/2addr v0, v1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_features:I */
/* .line 91 */
v0 = org.codehaus.jackson.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS;
/* if-ne p1, v0, :cond_0 */
/* .line 92 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_cfgNumbersAsStrings:Z */
/* .line 94 */
} // :cond_0
} // .end method
public abstract void flush ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
public final org.codehaus.jackson.ObjectCodec getCodec ( ) {
/* .locals 1 */
/* .prologue */
/* .line 123 */
v0 = this._objectCodec;
} // .end method
public org.codehaus.jackson.JsonStreamContext getOutputContext ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 23 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).getOutputContext ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->getOutputContext()Lorg/codehaus/jackson/impl/JsonWriteContext;
} // .end method
public final org.codehaus.jackson.impl.JsonWriteContext getOutputContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 134 */
v0 = this._writeContext;
} // .end method
public Boolean isClosed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 317 */
/* iget-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_closed:Z */
} // .end method
public final Boolean isEnabled ( org.codehaus.jackson.JsonGenerator$Feature p0 ) {
/* .locals 2 */
/* .param p1, "f" # Lorg/codehaus/jackson/JsonGenerator$Feature; */
/* .prologue */
/* .line 110 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_features:I */
v1 = (( org.codehaus.jackson.JsonGenerator$Feature ) p1 ).getMask ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonGenerator$Feature;->getMask()I
/* and-int/2addr v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final org.codehaus.jackson.JsonGenerator setCodec ( org.codehaus.jackson.ObjectCodec p0 ) {
/* .locals 0 */
/* .param p1, "oc" # Lorg/codehaus/jackson/ObjectCodec; */
/* .prologue */
/* .line 119 */
this._objectCodec = p1;
/* .line 120 */
} // .end method
public final org.codehaus.jackson.JsonGenerator useDefaultPrettyPrinter ( ) {
/* .locals 1 */
/* .prologue */
/* .line 115 */
/* new-instance v0, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter; */
/* invoke-direct {v0}, Lorg/codehaus/jackson/impl/DefaultPrettyPrinter;-><init>()V */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).setPrettyPrinter ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->setPrettyPrinter(Lorg/codehaus/jackson/PrettyPrinter;)Lorg/codehaus/jackson/JsonGenerator;
} // .end method
public abstract void writeBoolean ( Boolean p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public final void writeEndArray ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 161 */
v0 = this._writeContext;
v0 = (( org.codehaus.jackson.impl.JsonWriteContext ) v0 ).inArray ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonWriteContext;->inArray()Z
/* if-nez v0, :cond_0 */
/* .line 162 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Current context not an ARRAY but "; // const-string v1, "Current context not an ARRAY but "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this._writeContext;
(( org.codehaus.jackson.impl.JsonWriteContext ) v1 ).getTypeDesc ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/impl/JsonWriteContext;->getTypeDesc()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_reportError(Ljava/lang/String;)V
/* .line 164 */
} // :cond_0
v0 = this._cfgPrettyPrinter;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 165 */
v0 = this._cfgPrettyPrinter;
v1 = this._writeContext;
v1 = (( org.codehaus.jackson.impl.JsonWriteContext ) v1 ).getEntryCount ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/impl/JsonWriteContext;->getEntryCount()I
/* .line 169 */
} // :goto_0
v0 = this._writeContext;
(( org.codehaus.jackson.impl.JsonWriteContext ) v0 ).getParent ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonWriteContext;->getParent()Lorg/codehaus/jackson/impl/JsonWriteContext;
this._writeContext = v0;
/* .line 170 */
return;
/* .line 167 */
} // :cond_1
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._writeEndArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_writeEndArray()V
} // .end method
public final void writeEndObject ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 193 */
v0 = this._writeContext;
v0 = (( org.codehaus.jackson.impl.JsonWriteContext ) v0 ).inObject ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonWriteContext;->inObject()Z
/* if-nez v0, :cond_0 */
/* .line 194 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Current context not an object but "; // const-string v1, "Current context not an object but "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this._writeContext;
(( org.codehaus.jackson.impl.JsonWriteContext ) v1 ).getTypeDesc ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/impl/JsonWriteContext;->getTypeDesc()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_reportError(Ljava/lang/String;)V
/* .line 196 */
} // :cond_0
v0 = this._writeContext;
(( org.codehaus.jackson.impl.JsonWriteContext ) v0 ).getParent ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonWriteContext;->getParent()Lorg/codehaus/jackson/impl/JsonWriteContext;
this._writeContext = v0;
/* .line 197 */
v0 = this._cfgPrettyPrinter;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 198 */
v0 = this._cfgPrettyPrinter;
v1 = this._writeContext;
v1 = (( org.codehaus.jackson.impl.JsonWriteContext ) v1 ).getEntryCount ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/impl/JsonWriteContext;->getEntryCount()I
/* .line 202 */
} // :goto_0
return;
/* .line 200 */
} // :cond_1
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._writeEndObject ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_writeEndObject()V
} // .end method
public final void writeFieldName ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "name" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 211 */
v2 = this._writeContext;
v0 = (( org.codehaus.jackson.impl.JsonWriteContext ) v2 ).writeFieldName ( p1 ); // invoke-virtual {v2, p1}, Lorg/codehaus/jackson/impl/JsonWriteContext;->writeFieldName(Ljava/lang/String;)I
/* .line 212 */
/* .local v0, "status":I */
int v2 = 4; // const/4 v2, 0x4
/* if-ne v0, v2, :cond_0 */
/* .line 213 */
final String v2 = "Can not write a field name, expecting a value"; // const-string v2, "Can not write a field name, expecting a value"
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._reportError ( v2 ); // invoke-virtual {p0, v2}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_reportError(Ljava/lang/String;)V
/* .line 215 */
} // :cond_0
/* if-ne v0, v1, :cond_1 */
} // :goto_0
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._writeFieldName ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_writeFieldName(Ljava/lang/String;Z)V
/* .line 216 */
return;
/* .line 215 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
public abstract void writeNull ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
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
public abstract void writeNumber ( java.math.BigDecimal p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
} // .end method
public void writeObject ( java.lang.Object p0 ) {
/* .locals 1 */
/* .param p1, "value" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 273 */
/* if-nez p1, :cond_0 */
/* .line 275 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNull ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNull()V
/* .line 288 */
} // :goto_0
return;
/* .line 282 */
} // :cond_0
v0 = this._objectCodec;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 283 */
v0 = this._objectCodec;
(( org.codehaus.jackson.ObjectCodec ) v0 ).writeValue ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/codehaus/jackson/ObjectCodec;->writeValue(Lorg/codehaus/jackson/JsonGenerator;Ljava/lang/Object;)V
/* .line 286 */
} // :cond_1
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._writeSimpleObject ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_writeSimpleObject(Ljava/lang/Object;)V
} // .end method
public final void writeStartArray ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 146 */
final String v0 = "start an array"; // const-string v0, "start an array"
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._verifyValueWrite ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_verifyValueWrite(Ljava/lang/String;)V
/* .line 147 */
v0 = this._writeContext;
(( org.codehaus.jackson.impl.JsonWriteContext ) v0 ).createChildArrayContext ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonWriteContext;->createChildArrayContext()Lorg/codehaus/jackson/impl/JsonWriteContext;
this._writeContext = v0;
/* .line 148 */
v0 = this._cfgPrettyPrinter;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 149 */
v0 = this._cfgPrettyPrinter;
/* .line 153 */
} // :goto_0
return;
/* .line 151 */
} // :cond_0
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._writeStartArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_writeStartArray()V
} // .end method
public final void writeStartObject ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonGenerationException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 178 */
final String v0 = "start an object"; // const-string v0, "start an object"
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._verifyValueWrite ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_verifyValueWrite(Ljava/lang/String;)V
/* .line 179 */
v0 = this._writeContext;
(( org.codehaus.jackson.impl.JsonWriteContext ) v0 ).createChildObjectContext ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonWriteContext;->createChildObjectContext()Lorg/codehaus/jackson/impl/JsonWriteContext;
this._writeContext = v0;
/* .line 180 */
v0 = this._cfgPrettyPrinter;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 181 */
v0 = this._cfgPrettyPrinter;
/* .line 185 */
} // :goto_0
return;
/* .line 183 */
} // :cond_0
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 )._writeStartObject ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->_writeStartObject()V
} // .end method
public void writeTree ( org.codehaus.jackson.JsonNode p0 ) {
/* .locals 2 */
/* .param p1, "rootNode" # Lorg/codehaus/jackson/JsonNode; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonProcessingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 294 */
/* if-nez p1, :cond_0 */
/* .line 295 */
(( org.codehaus.jackson.impl.JsonGeneratorBase ) p0 ).writeNull ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonGeneratorBase;->writeNull()V
/* .line 302 */
} // :goto_0
return;
/* .line 297 */
} // :cond_0
v0 = this._objectCodec;
/* if-nez v0, :cond_1 */
/* .line 298 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "No ObjectCodec defined for the generator, can not serialize JsonNode-based trees"; // const-string v1, "No ObjectCodec defined for the generator, can not serialize JsonNode-based trees"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 300 */
} // :cond_1
v0 = this._objectCodec;
(( org.codehaus.jackson.ObjectCodec ) v0 ).writeTree ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/codehaus/jackson/ObjectCodec;->writeTree(Lorg/codehaus/jackson/JsonGenerator;Lorg/codehaus/jackson/JsonNode;)V
} // .end method
