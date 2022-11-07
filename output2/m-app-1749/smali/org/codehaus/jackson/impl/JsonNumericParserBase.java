public abstract class org.codehaus.jackson.impl.JsonNumericParserBase extends org.codehaus.jackson.impl.JsonParserBase {
	 /* .source "JsonNumericParserBase.java" */
	 /* # static fields */
	 static final java.math.BigDecimal BD_MAX_INT;
	 static final java.math.BigDecimal BD_MAX_LONG;
	 static final java.math.BigDecimal BD_MIN_INT;
	 static final java.math.BigDecimal BD_MIN_LONG;
	 protected static final Object CHAR_NULL;
	 protected static final Integer INT_0;
	 protected static final Integer INT_1;
	 protected static final Integer INT_2;
	 protected static final Integer INT_3;
	 protected static final Integer INT_4;
	 protected static final Integer INT_5;
	 protected static final Integer INT_6;
	 protected static final Integer INT_7;
	 protected static final Integer INT_8;
	 protected static final Integer INT_9;
	 protected static final Integer INT_DECIMAL_POINT;
	 protected static final Integer INT_E;
	 protected static final Integer INT_MINUS;
	 protected static final Integer INT_PLUS;
	 protected static final Integer INT_e;
	 static final Double MAX_INT_D;
	 static final Long MAX_INT_L;
	 static final Double MAX_LONG_D;
	 static final Double MIN_INT_D;
	 static final Long MIN_INT_L;
	 static final Double MIN_LONG_D;
	 protected static final Integer NR_BIGDECIMAL;
	 protected static final Integer NR_BIGINT;
	 protected static final Integer NR_DOUBLE;
	 protected static final Integer NR_INT;
	 protected static final Integer NR_LONG;
	 protected static final Integer NR_UNKNOWN;
	 /* # instance fields */
	 protected Integer _numTypesValid;
	 protected java.math.BigDecimal _numberBigDecimal;
	 protected java.math.BigInteger _numberBigInt;
	 protected Double _numberDouble;
	 protected Integer _numberInt;
	 protected Long _numberLong;
	 protected Boolean _numberNegative;
	 protected Integer mExpLength;
	 protected Integer mFractLength;
	 protected Integer mIntLength;
	 /* # direct methods */
	 static org.codehaus.jackson.impl.JsonNumericParserBase ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* const-wide v3, 0x7fffffffffffffffL */
		 /* const-wide/high16 v1, -0x8000000000000000L */
		 /* .line 43 */
		 /* new-instance v0, Ljava/math/BigDecimal; */
		 /* invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(J)V */
		 /* .line 44 */
		 /* new-instance v0, Ljava/math/BigDecimal; */
		 /* invoke-direct {v0, v3, v4}, Ljava/math/BigDecimal;-><init>(J)V */
		 /* .line 46 */
		 /* new-instance v0, Ljava/math/BigDecimal; */
		 /* invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(J)V */
		 /* .line 47 */
		 /* new-instance v0, Ljava/math/BigDecimal; */
		 /* invoke-direct {v0, v3, v4}, Ljava/math/BigDecimal;-><init>(J)V */
		 return;
	 } // .end method
	 protected org.codehaus.jackson.impl.JsonNumericParserBase ( ) {
		 /* .locals 1 */
		 /* .param p1, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
		 /* .param p2, "features" # I */
		 /* .prologue */
		 /* .line 145 */
		 /* invoke-direct {p0, p1, p2}, Lorg/codehaus/jackson/impl/JsonParserBase;-><init>(Lorg/codehaus/jackson/io/IOContext;I)V */
		 /* .line 93 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
		 /* .line 146 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void convertNumberToBigDecimal ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException;, */
		 /* Lorg/codehaus/jackson/JsonParseException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 538 */
	 /* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
	 /* and-int/lit8 v0, v0, 0x8 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 543 */
		 /* new-instance v0, Ljava/math/BigDecimal; */
		 (( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).getText ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->getText()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V */
		 this._numberBigDecimal = v0;
		 /* .line 553 */
	 } // :goto_0
	 /* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
	 /* or-int/lit8 v0, v0, 0x10 */
	 /* iput v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
	 /* .line 554 */
	 return;
	 /* .line 544 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x4 */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 545 */
	 /* new-instance v0, Ljava/math/BigDecimal; */
	 v1 = this._numberBigInt;
	 /* invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V */
	 this._numberBigDecimal = v0;
	 /* .line 546 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x2 */
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 547 */
	 /* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
	 java.math.BigDecimal .valueOf ( v0,v1 );
	 this._numberBigDecimal = v0;
	 /* .line 548 */
} // :cond_2
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 549 */
	 /* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
	 /* int-to-long v0, v0 */
	 java.math.BigDecimal .valueOf ( v0,v1 );
	 this._numberBigDecimal = v0;
	 /* .line 551 */
} // :cond_3
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._throwInternal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_throwInternal()V
} // .end method
protected void convertNumberToBigInteger ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 490 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 492 */
v0 = this._numberBigDecimal;
(( java.math.BigDecimal ) v0 ).toBigInteger ( ); // invoke-virtual {v0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;
this._numberBigInt = v0;
/* .line 502 */
} // :goto_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* or-int/lit8 v0, v0, 0x4 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 503 */
return;
/* .line 493 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x2 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 494 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
java.math.BigInteger .valueOf ( v0,v1 );
this._numberBigInt = v0;
/* .line 495 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 496 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* int-to-long v0, v0 */
java.math.BigInteger .valueOf ( v0,v1 );
this._numberBigInt = v0;
/* .line 497 */
} // :cond_2
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x8 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 498 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
java.math.BigDecimal .valueOf ( v0,v1 );
(( java.math.BigDecimal ) v0 ).toBigInteger ( ); // invoke-virtual {v0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;
this._numberBigInt = v0;
/* .line 500 */
} // :cond_3
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._throwInternal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_throwInternal()V
} // .end method
protected void convertNumberToDouble ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 514 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 515 */
v0 = this._numberBigDecimal;
(( java.math.BigDecimal ) v0 ).doubleValue ( ); // invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D
/* move-result-wide v0 */
/* iput-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* .line 526 */
} // :goto_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* or-int/lit8 v0, v0, 0x8 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 527 */
return;
/* .line 516 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x4 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 517 */
v0 = this._numberBigInt;
(( java.math.BigInteger ) v0 ).doubleValue ( ); // invoke-virtual {v0}, Ljava/math/BigInteger;->doubleValue()D
/* move-result-wide v0 */
/* iput-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* .line 518 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x2 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 519 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* long-to-double v0, v0 */
/* iput-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* .line 520 */
} // :cond_2
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 521 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* int-to-double v0, v0 */
/* iput-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* .line 523 */
} // :cond_3
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._throwInternal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_throwInternal()V
} // .end method
protected void convertNumberToInt ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 431 */
/* iget v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v1, v1, 0x2 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 433 */
/* iget-wide v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* long-to-int v0, v1 */
/* .line 434 */
/* .local v0, "result":I */
/* int-to-long v1, v0 */
/* iget-wide v3, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* cmp-long v1, v1, v3 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 435 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Numeric value ("; // const-string v2, "Numeric value ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).getText ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->getText()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ") out of range of int"; // const-string v2, ") out of range of int"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._reportError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_reportError(Ljava/lang/String;)V
/* .line 437 */
} // :cond_0
/* iput v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* .line 457 */
} // .end local v0 # "result":I
} // :goto_0
/* iget v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* or-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 458 */
return;
/* .line 438 */
} // :cond_1
/* iget v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v1, v1, 0x4 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 440 */
v1 = this._numberBigInt;
v1 = (( java.math.BigInteger ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/math/BigInteger;->intValue()I
/* iput v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* .line 441 */
} // :cond_2
/* iget v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v1, v1, 0x8 */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 443 */
/* iget-wide v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* const-wide/high16 v3, -0x3e20000000000000L # -2.147483648E9 */
/* cmpg-double v1, v1, v3 */
/* if-ltz v1, :cond_3 */
/* iget-wide v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* const-wide v3, 0x41dfffffffc00000L # 2.147483647E9 */
/* cmpl-double v1, v1, v3 */
/* if-lez v1, :cond_4 */
/* .line 444 */
} // :cond_3
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).reportOverflowInt ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->reportOverflowInt()V
/* .line 446 */
} // :cond_4
/* iget-wide v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* double-to-int v1, v1 */
/* iput v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* .line 447 */
} // :cond_5
/* iget v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v1, v1, 0x10 */
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 448 */
v1 = org.codehaus.jackson.impl.JsonNumericParserBase.BD_MIN_INT;
v2 = this._numberBigDecimal;
v1 = (( java.math.BigDecimal ) v1 ).compareTo ( v2 ); // invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I
/* if-gtz v1, :cond_6 */
v1 = org.codehaus.jackson.impl.JsonNumericParserBase.BD_MAX_INT;
v2 = this._numberBigDecimal;
v1 = (( java.math.BigDecimal ) v1 ).compareTo ( v2 ); // invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I
/* if-gez v1, :cond_7 */
/* .line 450 */
} // :cond_6
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).reportOverflowInt ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->reportOverflowInt()V
/* .line 452 */
} // :cond_7
v1 = this._numberBigDecimal;
v1 = (( java.math.BigDecimal ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/math/BigDecimal;->intValue()I
/* iput v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* .line 454 */
} // :cond_8
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._throwInternal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_throwInternal()V
} // .end method
protected void convertNumberToLong ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 463 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 464 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* int-to-long v0, v0 */
/* iput-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* .line 484 */
} // :goto_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* or-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 485 */
return;
/* .line 465 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x4 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 467 */
v0 = this._numberBigInt;
(( java.math.BigInteger ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* .line 468 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x8 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 470 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* const-wide/high16 v2, -0x3c20000000000000L # -9.223372036854776E18 */
/* cmpg-double v0, v0, v2 */
/* if-ltz v0, :cond_2 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* const-wide/high16 v2, 0x43e0000000000000L # 9.223372036854776E18 */
/* cmpl-double v0, v0, v2 */
/* if-lez v0, :cond_3 */
/* .line 471 */
} // :cond_2
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).reportOverflowLong ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->reportOverflowLong()V
/* .line 473 */
} // :cond_3
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* double-to-long v0, v0 */
/* iput-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* .line 474 */
} // :cond_4
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 475 */
v0 = org.codehaus.jackson.impl.JsonNumericParserBase.BD_MIN_LONG;
v1 = this._numberBigDecimal;
v0 = (( java.math.BigDecimal ) v0 ).compareTo ( v1 ); // invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I
/* if-gtz v0, :cond_5 */
v0 = org.codehaus.jackson.impl.JsonNumericParserBase.BD_MAX_LONG;
v1 = this._numberBigDecimal;
v0 = (( java.math.BigDecimal ) v0 ).compareTo ( v1 ); // invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I
/* if-gez v0, :cond_6 */
/* .line 477 */
} // :cond_5
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).reportOverflowLong ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->reportOverflowLong()V
/* .line 479 */
} // :cond_6
v0 = this._numberBigDecimal;
(( java.math.BigDecimal ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* .line 481 */
} // :cond_7
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._throwInternal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_throwInternal()V
} // .end method
public java.math.BigInteger getBigIntegerValue ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 269 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x4 */
/* if-nez v0, :cond_1 */
/* .line 270 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* if-nez v0, :cond_0 */
/* .line 271 */
int v0 = 4; // const/4 v0, 0x4
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).parseNumericValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->parseNumericValue(I)V
/* .line 273 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x4 */
/* if-nez v0, :cond_1 */
/* .line 274 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).convertNumberToBigInteger ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->convertNumberToBigInteger()V
/* .line 277 */
} // :cond_1
v0 = this._numberBigInt;
} // .end method
public java.math.BigDecimal getDecimalValue ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 312 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x10 */
/* if-nez v0, :cond_1 */
/* .line 313 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* if-nez v0, :cond_0 */
/* .line 314 */
/* const/16 v0, 0x10 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).parseNumericValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->parseNumericValue(I)V
/* .line 316 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x10 */
/* if-nez v0, :cond_1 */
/* .line 317 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).convertNumberToBigDecimal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->convertNumberToBigDecimal()V
/* .line 320 */
} // :cond_1
v0 = this._numberBigDecimal;
} // .end method
public Double getDoubleValue ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 298 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x8 */
/* if-nez v0, :cond_1 */
/* .line 299 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* if-nez v0, :cond_0 */
/* .line 300 */
/* const/16 v0, 0x8 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).parseNumericValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->parseNumericValue(I)V
/* .line 302 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x8 */
/* if-nez v0, :cond_1 */
/* .line 303 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).convertNumberToDouble ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->convertNumberToDouble()V
/* .line 306 */
} // :cond_1
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* return-wide v0 */
} // .end method
public Float getFloatValue ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 283 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).getDoubleValue ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->getDoubleValue()D
/* move-result-wide v0 */
/* .line 292 */
/* .local v0, "value":D */
/* double-to-float v2, v0 */
} // .end method
public Integer getIntValue ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 241 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x1 */
/* if-nez v0, :cond_1 */
/* .line 242 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* if-nez v0, :cond_0 */
/* .line 243 */
int v0 = 1; // const/4 v0, 0x1
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).parseNumericValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->parseNumericValue(I)V
/* .line 245 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x1 */
/* if-nez v0, :cond_1 */
/* .line 246 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).convertNumberToInt ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->convertNumberToInt()V
/* .line 249 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
} // .end method
public Long getLongValue ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 255 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x2 */
/* if-nez v0, :cond_1 */
/* .line 256 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* if-nez v0, :cond_0 */
/* .line 257 */
int v0 = 2; // const/4 v0, 0x2
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).parseNumericValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->parseNumericValue(I)V
/* .line 259 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x2 */
/* if-nez v0, :cond_1 */
/* .line 260 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).convertNumberToLong ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->convertNumberToLong()V
/* .line 263 */
} // :cond_1
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* return-wide v0 */
} // .end method
public org.codehaus.jackson.JsonParser$NumberType getNumberType ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 213 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* if-nez v0, :cond_0 */
/* .line 214 */
int v0 = 0; // const/4 v0, 0x0
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).parseNumericValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->parseNumericValue(I)V
/* .line 216 */
} // :cond_0
v0 = this._currToken;
v1 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_INT;
/* if-ne v0, v1, :cond_3 */
/* .line 217 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 218 */
v0 = org.codehaus.jackson.JsonParser$NumberType.INT;
/* .line 235 */
} // :goto_0
/* .line 220 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x2 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 221 */
v0 = org.codehaus.jackson.JsonParser$NumberType.LONG;
/* .line 223 */
} // :cond_2
v0 = org.codehaus.jackson.JsonParser$NumberType.BIG_INTEGER;
/* .line 232 */
} // :cond_3
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 233 */
v0 = org.codehaus.jackson.JsonParser$NumberType.BIG_DECIMAL;
/* .line 235 */
} // :cond_4
v0 = org.codehaus.jackson.JsonParser$NumberType.DOUBLE;
} // .end method
public java.lang.Number getNumberValue ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 180 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* if-nez v0, :cond_0 */
/* .line 181 */
int v0 = 0; // const/4 v0, 0x0
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).parseNumericValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->parseNumericValue(I)V
/* .line 184 */
} // :cond_0
v0 = this._currToken;
v1 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_INT;
/* if-ne v0, v1, :cond_4 */
/* .line 185 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 186 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
java.lang.Integer .valueOf ( v0 );
/* .line 207 */
} // :goto_0
/* .line 188 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x2 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 189 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
java.lang.Long .valueOf ( v0,v1 );
/* .line 191 */
} // :cond_2
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x4 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 192 */
v0 = this._numberBigInt;
/* .line 195 */
} // :cond_3
v0 = this._numberBigDecimal;
/* .line 201 */
} // :cond_4
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 202 */
v0 = this._numberBigDecimal;
/* .line 204 */
} // :cond_5
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* and-int/lit8 v0, v0, 0x8 */
/* if-nez v0, :cond_6 */
/* .line 205 */
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._throwInternal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_throwInternal()V
/* .line 207 */
} // :cond_6
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
java.lang.Double .valueOf ( v0,v1 );
} // .end method
protected abstract org.codehaus.jackson.JsonToken parseNumberText ( Integer p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
protected final void parseNumericValue ( Integer p0 ) {
/* .locals 11 */
/* .param p1, "expType" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v10, 0x10 */
/* .line 343 */
v8 = this._currToken;
if ( v8 != null) { // if-eqz v8, :cond_0
v8 = this._currToken;
v8 = (( org.codehaus.jackson.JsonToken ) v8 ).isNumeric ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/JsonToken;->isNumeric()Z
/* if-nez v8, :cond_1 */
/* .line 344 */
} // :cond_0
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "Current token ("; // const-string v9, "Current token ("
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v9 = this._currToken;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v9 = ") not numeric, can not use numeric value accessors"; // const-string v9, ") not numeric, can not use numeric value accessors"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._reportError ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_reportError(Ljava/lang/String;)V
/* .line 348 */
} // :cond_1
try { // :try_start_0
v8 = this._currToken;
v9 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_INT;
/* if-ne v8, v9, :cond_a */
/* .line 349 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).getTextBuffer ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->getTextBuffer()[C
/* .line 350 */
/* .local v0, "buf":[C */
v8 = this._textBuffer;
v7 = (( org.codehaus.jackson.util.TextBuffer ) v8 ).getTextOffset ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->getTextOffset()I
/* .line 351 */
/* .local v7, "offset":I */
/* iget v4, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->mIntLength:I */
/* .line 352 */
/* .local v4, "len":I */
/* iget-boolean v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberNegative:Z */
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 353 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 355 */
} // :cond_2
/* const/16 v8, 0x9 */
/* if-gt v4, v8, :cond_4 */
/* .line 356 */
v1 = org.codehaus.jackson.io.NumberInput .parseInt ( v0,v7,v4 );
/* .line 357 */
/* .local v1, "i":I */
/* iget-boolean v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberNegative:Z */
if ( v8 != null) { // if-eqz v8, :cond_3
/* neg-int v1, v1 */
} // .end local v1 # "i":I
} // :cond_3
/* iput v1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* .line 358 */
int v8 = 1; // const/4 v8, 0x1
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 419 */
} // .end local v0 # "buf":[C
} // .end local v4 # "len":I
} // .end local v7 # "offset":I
} // :goto_0
return;
/* .line 361 */
/* .restart local v0 # "buf":[C */
/* .restart local v4 # "len":I */
/* .restart local v7 # "offset":I */
} // :cond_4
/* const/16 v8, 0x12 */
/* if-gt v4, v8, :cond_8 */
/* .line 362 */
org.codehaus.jackson.io.NumberInput .parseLong ( v0,v7,v4 );
/* move-result-wide v2 */
/* .line 363 */
/* .local v2, "l":J */
/* iget-boolean v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberNegative:Z */
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 364 */
/* neg-long v2, v2 */
/* .line 367 */
} // :cond_5
/* const/16 v8, 0xa */
/* if-ne v4, v8, :cond_7 */
/* .line 368 */
/* iget-boolean v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberNegative:Z */
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 369 */
/* const-wide/32 v8, -0x80000000 */
/* cmp-long v8, v2, v8 */
/* if-ltz v8, :cond_7 */
/* .line 370 */
/* long-to-int v8, v2 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* .line 371 */
int v8 = 1; // const/4 v8, 0x1
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 415 */
} // .end local v0 # "buf":[C
} // .end local v2 # "l":J
} // .end local v4 # "len":I
} // .end local v7 # "offset":I
/* :catch_0 */
/* move-exception v5 */
/* .line 417 */
/* .local v5, "nex":Ljava/lang/NumberFormatException; */
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "Malformed numeric value \'"; // const-string v9, "Malformed numeric value \'"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v9 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v9 ).contentsAsString ( ); // invoke-virtual {v9}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsString()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v9 = "\'"; // const-string v9, "\'"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._wrapError ( v8, v5 ); // invoke-virtual {p0, v8, v5}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_wrapError(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 375 */
} // .end local v5 # "nex":Ljava/lang/NumberFormatException;
/* .restart local v0 # "buf":[C */
/* .restart local v2 # "l":J */
/* .restart local v4 # "len":I */
/* .restart local v7 # "offset":I */
} // :cond_6
/* const-wide/32 v8, 0x7fffffff */
/* cmp-long v8, v2, v8 */
/* if-gtz v8, :cond_7 */
/* .line 376 */
/* long-to-int v8, v2 */
try { // :try_start_1
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberInt:I */
/* .line 377 */
int v8 = 1; // const/4 v8, 0x1
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 382 */
} // :cond_7
/* iput-wide v2, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* .line 383 */
int v8 = 2; // const/4 v8, 0x2
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 386 */
} // .end local v2 # "l":J
} // :cond_8
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).contentsAsString ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsString()Ljava/lang/String;
/* .line 388 */
/* .local v6, "numStr":Ljava/lang/String; */
/* iget-boolean v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberNegative:Z */
v8 = org.codehaus.jackson.io.NumberInput .inLongRange ( v0,v7,v4,v8 );
if ( v8 != null) { // if-eqz v8, :cond_9
/* .line 390 */
java.lang.Long .parseLong ( v6 );
/* move-result-wide v8 */
/* iput-wide v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberLong:J */
/* .line 391 */
int v8 = 2; // const/4 v8, 0x2
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 395 */
} // :cond_9
/* new-instance v8, Ljava/math/BigInteger; */
/* invoke-direct {v8, v6}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V */
this._numberBigInt = v8;
/* .line 396 */
int v8 = 4; // const/4 v8, 0x4
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 407 */
} // .end local v0 # "buf":[C
} // .end local v4 # "len":I
} // .end local v6 # "numStr":Ljava/lang/String;
} // .end local v7 # "offset":I
} // :cond_a
/* if-ne p1, v10, :cond_b */
/* .line 408 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).contentsAsDecimal ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsDecimal()Ljava/math/BigDecimal;
this._numberBigDecimal = v8;
/* .line 409 */
/* const/16 v8, 0x10 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* goto/16 :goto_0 */
/* .line 412 */
} // :cond_b
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).contentsAsDouble ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsDouble()D
/* move-result-wide v8 */
/* iput-wide v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberDouble:D */
/* .line 413 */
/* const/16 v8, 0x8 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* :try_end_1 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_0 */
} // .end method
protected void reportInvalidNumber ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "msg" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 575 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Invalid numeric value: "; // const-string v1, "Invalid numeric value: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_reportError(Ljava/lang/String;)V
/* .line 576 */
return;
} // .end method
protected void reportOverflowInt ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 582 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Numeric value ("; // const-string v1, "Numeric value ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).getText ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->getText()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ") out of range of int ("; // const-string v1, ") out of range of int ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/high16 v1, -0x80000000 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " - "; // const-string v1, " - "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const v1, 0x7fffffff */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_reportError(Ljava/lang/String;)V
/* .line 583 */
return;
} // .end method
protected void reportOverflowLong ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 588 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Numeric value ("; // const-string v1, "Numeric value ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 ).getText ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->getText()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ") out of range of long ("; // const-string v1, ") out of range of long ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const-wide/high16 v1, -0x8000000000000000L */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = " - "; // const-string v1, " - "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const-wide v1, 0x7fffffffffffffffL */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_reportError(Ljava/lang/String;)V
/* .line 589 */
return;
} // .end method
protected void reportUnexpectedNumberChar ( Integer p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "ch" # I */
/* .param p2, "comment" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 565 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected character ("; // const-string v2, "Unexpected character ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
org.codehaus.jackson.impl.JsonNumericParserBase ._getCharDesc ( p1 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ") in numeric value"; // const-string v2, ") in numeric value"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 566 */
/* .local v0, "msg":Ljava/lang/String; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 567 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ": "; // const-string v2, ": "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 569 */
} // :cond_0
(( org.codehaus.jackson.impl.JsonNumericParserBase ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_reportError(Ljava/lang/String;)V
/* .line 570 */
return;
} // .end method
protected final org.codehaus.jackson.JsonToken reset ( Boolean p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .param p1, "negative" # Z */
/* .param p2, "intLen" # I */
/* .param p3, "fractLen" # I */
/* .param p4, "expLen" # I */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 150 */
/* iput-boolean p1, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numberNegative:Z */
/* .line 151 */
/* iput p2, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->mIntLength:I */
/* .line 152 */
/* iput p3, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->mFractLength:I */
/* .line 153 */
/* iput p4, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->mExpLength:I */
/* .line 154 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_numTypesValid:I */
/* .line 155 */
/* if-ge p3, v1, :cond_0 */
/* if-ge p4, v1, :cond_0 */
/* .line 156 */
v0 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_INT;
/* .line 159 */
} // :goto_0
} // :cond_0
v0 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_FLOAT;
} // .end method
