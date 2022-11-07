public class inal extends org.codehaus.jackson.impl.Utf8NumericParser {
	 /* .source "Utf8StreamParser.java" */
	 /* # static fields */
	 static final Object BYTE_LF;
	 /* # instance fields */
	 protected org.codehaus.jackson.ObjectCodec _objectCodec;
	 protected _quadBuffer;
	 protected final org.codehaus.jackson.sym.BytesToNameCanonicalizer _symbols;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 8 */
		 /* .param p1, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
		 /* .param p2, "features" # I */
		 /* .param p3, "in" # Ljava/io/InputStream; */
		 /* .param p4, "codec" # Lorg/codehaus/jackson/ObjectCodec; */
		 /* .param p5, "sym" # Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer; */
		 /* .param p6, "inputBuffer" # [B */
		 /* .param p7, "start" # I */
		 /* .param p8, "end" # I */
		 /* .param p9, "bufferRecyclable" # Z */
		 /* .prologue */
		 /* .line 59 */
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p6 */
		 /* move v5, p7 */
		 /* move/from16 v6, p8 */
		 /* move/from16 v7, p9 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/codehaus/jackson/impl/Utf8NumericParser;-><init>(Lorg/codehaus/jackson/io/IOContext;ILjava/io/InputStream;[BIIZ)V */
		 /* .line 45 */
		 /* const/16 v0, 0x20 */
		 /* new-array v0, v0, [I */
		 this._quadBuffer = v0;
		 /* .line 60 */
		 this._objectCodec = p4;
		 /* .line 61 */
		 this._symbols = p5;
		 /* .line 63 */
		 v0 = org.codehaus.jackson.JsonParser$Feature.CANONICALIZE_FIELD_NAMES;
		 v0 = 		 (( org.codehaus.jackson.JsonParser$Feature ) v0 ).enabledIn ( p2 ); // invoke-virtual {v0, p2}, Lorg/codehaus/jackson/JsonParser$Feature;->enabledIn(I)Z
		 /* if-nez v0, :cond_0 */
		 /* .line 65 */
		 (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwInternal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwInternal()V
		 /* .line 67 */
	 } // :cond_0
	 return;
} // .end method
private final Integer _decodeUtf8_2 ( Integer p0 ) {
	 /* .locals 4 */
	 /* .param p1, "c" # I */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException;, */
	 /* Lorg/codehaus/jackson/JsonParseException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 1471 */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_0 */
/* .line 1472 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1474 */
} // :cond_0
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v1, v2 */
/* .line 1475 */
/* .local v0, "d":I */
/* and-int/lit16 v1, v0, 0xc0 */
/* const/16 v2, 0x80 */
/* if-eq v1, v2, :cond_1 */
/* .line 1476 */
/* and-int/lit16 v1, v0, 0xff */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1478 */
} // :cond_1
/* and-int/lit8 v1, p1, 0x1f */
/* shl-int/lit8 v1, v1, 0x6 */
/* and-int/lit8 v2, v0, 0x3f */
/* or-int/2addr v1, v2 */
} // .end method
private final Integer _decodeUtf8_3 ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "c1" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v5, 0x80 */
/* .line 1484 */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v2, v3, :cond_0 */
/* .line 1485 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1487 */
} // :cond_0
/* and-int/lit8 p1, p1, 0xf */
/* .line 1488 */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v2, v3 */
/* .line 1489 */
/* .local v1, "d":I */
/* and-int/lit16 v2, v1, 0xc0 */
/* if-eq v2, v5, :cond_1 */
/* .line 1490 */
/* and-int/lit16 v2, v1, 0xff */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1492 */
} // :cond_1
/* shl-int/lit8 v2, p1, 0x6 */
/* and-int/lit8 v3, v1, 0x3f */
/* or-int v0, v2, v3 */
/* .line 1493 */
/* .local v0, "c":I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v2, v3, :cond_2 */
/* .line 1494 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1496 */
} // :cond_2
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v2, v3 */
/* .line 1497 */
/* and-int/lit16 v2, v1, 0xc0 */
/* if-eq v2, v5, :cond_3 */
/* .line 1498 */
/* and-int/lit16 v2, v1, 0xff */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1500 */
} // :cond_3
/* shl-int/lit8 v2, v0, 0x6 */
/* and-int/lit8 v3, v1, 0x3f */
/* or-int v0, v2, v3 */
/* .line 1501 */
} // .end method
private final Integer _decodeUtf8_3fast ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "c1" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v5, 0x80 */
/* .line 1507 */
/* and-int/lit8 p1, p1, 0xf */
/* .line 1508 */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v2, v3 */
/* .line 1509 */
/* .local v1, "d":I */
/* and-int/lit16 v2, v1, 0xc0 */
/* if-eq v2, v5, :cond_0 */
/* .line 1510 */
/* and-int/lit16 v2, v1, 0xff */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1512 */
} // :cond_0
/* shl-int/lit8 v2, p1, 0x6 */
/* and-int/lit8 v3, v1, 0x3f */
/* or-int v0, v2, v3 */
/* .line 1513 */
/* .local v0, "c":I */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v2, v3 */
/* .line 1514 */
/* and-int/lit16 v2, v1, 0xc0 */
/* if-eq v2, v5, :cond_1 */
/* .line 1515 */
/* and-int/lit16 v2, v1, 0xff */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1517 */
} // :cond_1
/* shl-int/lit8 v2, v0, 0x6 */
/* and-int/lit8 v3, v1, 0x3f */
/* or-int v0, v2, v3 */
/* .line 1518 */
} // .end method
private final Integer _decodeUtf8_4 ( Integer p0 ) {
/* .locals 5 */
/* .param p1, "c" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x80 */
/* .line 1528 */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_0 */
/* .line 1529 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1531 */
} // :cond_0
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v1, v2 */
/* .line 1532 */
/* .local v0, "d":I */
/* and-int/lit16 v1, v0, 0xc0 */
/* if-eq v1, v4, :cond_1 */
/* .line 1533 */
/* and-int/lit16 v1, v0, 0xff */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1535 */
} // :cond_1
/* and-int/lit8 v1, p1, 0x7 */
/* shl-int/lit8 v1, v1, 0x6 */
/* and-int/lit8 v2, v0, 0x3f */
/* or-int p1, v1, v2 */
/* .line 1537 */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_2 */
/* .line 1538 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1540 */
} // :cond_2
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v1, v2 */
/* .line 1541 */
/* and-int/lit16 v1, v0, 0xc0 */
/* if-eq v1, v4, :cond_3 */
/* .line 1542 */
/* and-int/lit16 v1, v0, 0xff */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1544 */
} // :cond_3
/* shl-int/lit8 v1, p1, 0x6 */
/* and-int/lit8 v2, v0, 0x3f */
/* or-int p1, v1, v2 */
/* .line 1545 */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_4 */
/* .line 1546 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1548 */
} // :cond_4
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v1, v2 */
/* .line 1549 */
/* and-int/lit16 v1, v0, 0xc0 */
/* if-eq v1, v4, :cond_5 */
/* .line 1550 */
/* and-int/lit16 v1, v0, 0xff */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1556 */
} // :cond_5
/* shl-int/lit8 v1, p1, 0x6 */
/* and-int/lit8 v2, v0, 0x3f */
/* or-int/2addr v1, v2 */
/* const/high16 v2, 0x10000 */
/* sub-int/2addr v1, v2 */
} // .end method
private final org.codehaus.jackson.JsonToken _nextAfterName ( ) {
/* .locals 4 */
/* .prologue */
/* .line 232 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_nameCopied:Z */
/* .line 233 */
v0 = this._nextToken;
/* .line 234 */
/* .local v0, "t":Lorg/codehaus/jackson/JsonToken; */
int v1 = 0; // const/4 v1, 0x0
this._nextToken = v1;
/* .line 236 */
v1 = org.codehaus.jackson.JsonToken.START_ARRAY;
/* if-ne v0, v1, :cond_1 */
/* .line 237 */
v1 = this._parsingContext;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputRow:I */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputCol:I */
(( org.codehaus.jackson.impl.JsonReadContext ) v1 ).createChildArrayContext ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/codehaus/jackson/impl/JsonReadContext;->createChildArrayContext(II)Lorg/codehaus/jackson/impl/JsonReadContext;
this._parsingContext = v1;
/* .line 241 */
} // :cond_0
} // :goto_0
this._currToken = v0;
/* .line 238 */
} // :cond_1
v1 = org.codehaus.jackson.JsonToken.START_OBJECT;
/* if-ne v0, v1, :cond_0 */
/* .line 239 */
v1 = this._parsingContext;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputRow:I */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputCol:I */
(( org.codehaus.jackson.impl.JsonReadContext ) v1 ).createChildObjectContext ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/codehaus/jackson/impl/JsonReadContext;->createChildObjectContext(II)Lorg/codehaus/jackson/impl/JsonReadContext;
this._parsingContext = v1;
} // .end method
private void _reportInvalidToken ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "matchedPart" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1207 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 1213 */
/* .local v2, "sb":Ljava/lang/StringBuilder; */
} // :goto_0
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v3, v4, :cond_1 */
v3 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v3, :cond_1 */
/* .line 1225 */
} // :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unrecognized token \'"; // const-string v4, "Unrecognized token \'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\': was expecting \'null\', \'true\' or \'false\'"; // const-string v4, "\': was expecting \'null\', \'true\' or \'false\'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportError ( v3 ); // invoke-virtual {p0, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportError(Ljava/lang/String;)V
/* .line 1226 */
return;
/* .line 1216 */
} // :cond_1
v3 = this._inputBuffer;
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v3, v4 */
/* .line 1217 */
/* .local v1, "i":I */
v3 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._decodeCharForError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeCharForError(I)I
/* int-to-char v0, v3 */
/* .line 1218 */
/* .local v0, "c":C */
v3 = java.lang.Character .isJavaIdentifierPart ( v0 );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 1221 */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v3, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1222 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // .end method
private final void _skipCComment ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1306 */
org.codehaus.jackson.util.CharTypes .getInputCodeComment ( );
/* .line 1309 */
/* .local v1, "codes":[I */
} // :cond_0
} // :goto_0
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v3, v4, :cond_1 */
v3 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 1310 */
} // :cond_1
v3 = this._inputBuffer;
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v3, v3, v4 */
/* and-int/lit16 v2, v3, 0xff */
/* .line 1311 */
/* .local v2, "i":I */
/* aget v0, v1, v2 */
/* .line 1312 */
/* .local v0, "code":I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1313 */
/* sparse-switch v0, :sswitch_data_0 */
/* .line 1328 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidChar ( v2 ); // invoke-virtual {p0, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidChar(I)V
/* .line 1315 */
/* :sswitch_0 */
v3 = this._inputBuffer;
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v3, v3, v4 */
/* const/16 v4, 0x2f */
/* if-ne v3, v4, :cond_0 */
/* .line 1316 */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v3, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1333 */
} // .end local v0 # "code":I
} // .end local v2 # "i":I
} // :goto_1
return;
/* .line 1321 */
/* .restart local v0 # "code":I */
/* .restart local v2 # "i":I */
/* :sswitch_1 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipLF ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipLF()V
/* .line 1324 */
/* :sswitch_2 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipCR ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipCR()V
/* .line 1332 */
} // .end local v0 # "code":I
} // .end local v2 # "i":I
} // :cond_2
final String v3 = " in a comment"; // const-string v3, " in a comment"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v3 ); // invoke-virtual {p0, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 1313 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0xa -> :sswitch_1 */
/* 0xd -> :sswitch_2 */
/* 0x2a -> :sswitch_0 */
} // .end sparse-switch
} // .end method
private final void _skipComment ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x2f */
/* .line 1285 */
v1 = org.codehaus.jackson.JsonParser$Feature.ALLOW_COMMENTS;
v1 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).isEnabled ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
/* if-nez v1, :cond_0 */
/* .line 1286 */
final String v1 = "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)"; // const-string v1, "maybe a (non-standard) comment? (not recognized as one since Feature \'ALLOW_COMMENTS\' not enabled for parser)"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( v4, v1 ); // invoke-virtual {p0, v4, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
/* .line 1289 */
} // :cond_0
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_1 */
v1 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v1, :cond_1 */
/* .line 1290 */
final String v1 = " in a comment"; // const-string v1, " in a comment"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 1292 */
} // :cond_1
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v1, v2 */
/* and-int/lit16 v0, v1, 0xff */
/* .line 1293 */
/* .local v0, "c":I */
/* if-ne v0, v4, :cond_2 */
/* .line 1294 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipCppComment()V */
/* .line 1300 */
} // :goto_0
return;
/* .line 1295 */
} // :cond_2
/* const/16 v1, 0x2a */
/* if-ne v0, v1, :cond_3 */
/* .line 1296 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipCComment()V */
/* .line 1298 */
} // :cond_3
final String v1 = "was expecting either \'*\' or \'/\' for a comment"; // const-string v1, "was expecting either \'*\' or \'/\' for a comment"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
} // .end method
private final void _skipCppComment ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1339 */
org.codehaus.jackson.util.CharTypes .getInputCodeComment ( );
/* .line 1340 */
/* .local v1, "codes":[I */
} // :cond_0
} // :goto_0
/* :sswitch_0 */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v3, v4, :cond_1 */
v3 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 1341 */
} // :cond_1
v3 = this._inputBuffer;
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v3, v3, v4 */
/* and-int/lit16 v2, v3, 0xff */
/* .line 1342 */
/* .local v2, "i":I */
/* aget v0, v1, v2 */
/* .line 1343 */
/* .local v0, "code":I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1344 */
/* sparse-switch v0, :sswitch_data_0 */
/* .line 1355 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidChar ( v2 ); // invoke-virtual {p0, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidChar(I)V
/* .line 1346 */
/* :sswitch_1 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipLF ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipLF()V
/* .line 1359 */
} // .end local v0 # "code":I
} // .end local v2 # "i":I
} // :cond_2
} // :goto_1
return;
/* .line 1349 */
/* .restart local v0 # "code":I */
/* .restart local v2 # "i":I */
/* :sswitch_2 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipCR ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipCR()V
/* .line 1344 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0xa -> :sswitch_1 */
/* 0xd -> :sswitch_2 */
/* 0x2a -> :sswitch_0 */
} // .end sparse-switch
} // .end method
private final void _skipUtf8_2 ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "c" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1562 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v0, v1, :cond_0 */
/* .line 1563 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1565 */
} // :cond_0
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte p1, v0, v1 */
/* .line 1566 */
/* and-int/lit16 v0, p1, 0xc0 */
/* const/16 v1, 0x80 */
/* if-eq v0, v1, :cond_1 */
/* .line 1567 */
/* and-int/lit16 v0, p1, 0xff */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1569 */
} // :cond_1
return;
} // .end method
private final void _skipUtf8_3 ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "c" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v3, 0x80 */
/* .line 1577 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v0, v1, :cond_0 */
/* .line 1578 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1581 */
} // :cond_0
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte p1, v0, v1 */
/* .line 1582 */
/* and-int/lit16 v0, p1, 0xc0 */
/* if-eq v0, v3, :cond_1 */
/* .line 1583 */
/* and-int/lit16 v0, p1, 0xff */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1585 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v0, v1, :cond_2 */
/* .line 1586 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1588 */
} // :cond_2
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte p1, v0, v1 */
/* .line 1589 */
/* and-int/lit16 v0, p1, 0xc0 */
/* if-eq v0, v3, :cond_3 */
/* .line 1590 */
/* and-int/lit16 v0, p1, 0xff */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1592 */
} // :cond_3
return;
} // .end method
private final void _skipUtf8_4 ( Integer p0 ) {
/* .locals 5 */
/* .param p1, "c" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x80 */
/* .line 1597 */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_0 */
/* .line 1598 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1600 */
} // :cond_0
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v1, v2 */
/* .line 1601 */
/* .local v0, "d":I */
/* and-int/lit16 v1, v0, 0xc0 */
/* if-eq v1, v4, :cond_1 */
/* .line 1602 */
/* and-int/lit16 v1, v0, 0xff */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1604 */
} // :cond_1
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_2 */
/* .line 1605 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1607 */
} // :cond_2
/* and-int/lit16 v1, v0, 0xc0 */
/* if-eq v1, v4, :cond_3 */
/* .line 1608 */
/* and-int/lit16 v1, v0, 0xff */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1610 */
} // :cond_3
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_4 */
/* .line 1611 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1613 */
} // :cond_4
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v1, v2 */
/* .line 1614 */
/* and-int/lit16 v1, v0, 0xc0 */
/* if-eq v1, v4, :cond_5 */
/* .line 1615 */
/* and-int/lit16 v1, v0, 0xff */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(II)V
/* .line 1617 */
} // :cond_5
return;
} // .end method
private final Integer _skipWS ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x20 */
/* .line 1237 */
} // :cond_0
} // :goto_0
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_1 */
v1 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 1238 */
} // :cond_1
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v1, v2 */
/* and-int/lit16 v0, v1, 0xff */
/* .line 1239 */
/* .local v0, "i":I */
/* if-le v0, v4, :cond_3 */
/* .line 1240 */
/* const/16 v1, 0x2f */
/* if-eq v0, v1, :cond_2 */
/* .line 1241 */
/* .line 1243 */
} // :cond_2
/* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipComment()V */
/* .line 1244 */
} // :cond_3
/* if-eq v0, v4, :cond_0 */
/* .line 1245 */
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_4 */
/* .line 1246 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipLF ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipLF()V
/* .line 1247 */
} // :cond_4
/* const/16 v1, 0xd */
/* if-ne v0, v1, :cond_5 */
/* .line 1248 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipCR ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipCR()V
/* .line 1249 */
} // :cond_5
/* const/16 v1, 0x9 */
/* if-eq v0, v1, :cond_0 */
/* .line 1250 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwInvalidSpace ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwInvalidSpace(I)V
/* .line 1254 */
} // .end local v0 # "i":I
} // :cond_6
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected end-of-input within/between "; // const-string v2, "Unexpected end-of-input within/between "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v2 ).getTypeDesc ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/impl/JsonReadContext;->getTypeDesc()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " entries"; // const-string v2, " entries"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._constructError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_constructError(Ljava/lang/String;)Lorg/codehaus/jackson/JsonParseException;
/* throw v1 */
} // .end method
private final Integer _skipWSOrEnd ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x20 */
/* .line 1260 */
} // :cond_0
} // :goto_0
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v1, v2, :cond_1 */
v1 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 1261 */
} // :cond_1
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v1, v2 */
/* and-int/lit16 v0, v1, 0xff */
/* .line 1262 */
/* .local v0, "i":I */
/* if-le v0, v4, :cond_3 */
/* .line 1263 */
/* const/16 v1, 0x2f */
/* if-eq v0, v1, :cond_2 */
/* .line 1279 */
} // .end local v0 # "i":I
} // :goto_1
/* .line 1266 */
/* .restart local v0 # "i":I */
} // :cond_2
/* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipComment()V */
/* .line 1267 */
} // :cond_3
/* if-eq v0, v4, :cond_0 */
/* .line 1268 */
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_4 */
/* .line 1269 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipLF ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipLF()V
/* .line 1270 */
} // :cond_4
/* const/16 v1, 0xd */
/* if-ne v0, v1, :cond_5 */
/* .line 1271 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipCR ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipCR()V
/* .line 1272 */
} // :cond_5
/* const/16 v1, 0x9 */
/* if-eq v0, v1, :cond_0 */
/* .line 1273 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwInvalidSpace ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwInvalidSpace(I)V
/* .line 1278 */
} // .end local v0 # "i":I
} // :cond_6
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._handleEOF ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_handleEOF()V
/* .line 1279 */
int v0 = -1; // const/4 v0, -0x1
} // .end method
private final org.codehaus.jackson.sym.Name addName ( Integer[] p0, Integer p1, Integer p2 ) {
/* .locals 14 */
/* .param p1, "quads" # [I */
/* .param p2, "qlen" # I */
/* .param p3, "lastQuadBytes" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 804 */
/* shl-int/lit8 v12, p2, 0x2 */
/* add-int/lit8 v12, v12, -0x4 */
/* add-int v3, v12, p3 */
/* .line 813 */
/* .local v3, "byteLen":I */
int v12 = 4; // const/4 v12, 0x4
/* move/from16 v0, p3 */
/* if-ge v0, v12, :cond_7 */
/* .line 814 */
/* add-int/lit8 v12, p2, -0x1 */
/* aget v10, p1, v12 */
/* .line 816 */
/* .local v10, "lastQuad":I */
/* add-int/lit8 v12, p2, -0x1 */
/* rsub-int/lit8 v13, p3, 0x4 */
/* shl-int/lit8 v13, v13, 0x3 */
/* shl-int v13, v10, v13 */
/* aput v13, p1, v12 */
/* .line 822 */
} // :goto_0
v12 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v12 ).emptyAndGetCurrentSegment ( ); // invoke-virtual {v12}, Lorg/codehaus/jackson/util/TextBuffer;->emptyAndGetCurrentSegment()[C
/* .line 823 */
/* .local v4, "cbuf":[C */
int v7 = 0; // const/4 v7, 0x0
/* .line 825 */
/* .local v7, "cix":I */
int v9 = 0; // const/4 v9, 0x0
/* .local v9, "ix":I */
/* move v8, v7 */
} // .end local v7 # "cix":I
/* .local v8, "cix":I */
} // :goto_1
/* if-ge v9, v3, :cond_b */
/* .line 826 */
/* shr-int/lit8 v12, v9, 0x2 */
/* aget v5, p1, v12 */
/* .line 827 */
/* .local v5, "ch":I */
/* and-int/lit8 v2, v9, 0x3 */
/* .line 828 */
/* .local v2, "byteIx":I */
/* rsub-int/lit8 v12, v2, 0x3 */
/* shl-int/lit8 v12, v12, 0x3 */
/* shr-int v12, v5, v12 */
/* and-int/lit16 v5, v12, 0xff */
/* .line 829 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 831 */
/* const/16 v12, 0x7f */
/* if-le v5, v12, :cond_d */
/* .line 833 */
/* and-int/lit16 v12, v5, 0xe0 */
/* const/16 v13, 0xc0 */
/* if-ne v12, v13, :cond_8 */
/* .line 834 */
/* and-int/lit8 v5, v5, 0x1f */
/* .line 835 */
int v11 = 1; // const/4 v11, 0x1
/* .line 846 */
/* .local v11, "needed":I */
} // :goto_2
/* add-int v12, v9, v11 */
/* if-le v12, v3, :cond_0 */
/* .line 847 */
final String v12 = " in field name"; // const-string v12, " in field name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v12 ); // invoke-virtual {p0, v12}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 851 */
} // :cond_0
/* shr-int/lit8 v12, v9, 0x2 */
/* aget v6, p1, v12 */
/* .line 852 */
/* .local v6, "ch2":I */
/* and-int/lit8 v2, v9, 0x3 */
/* .line 853 */
/* rsub-int/lit8 v12, v2, 0x3 */
/* shl-int/lit8 v12, v12, 0x3 */
/* shr-int/2addr v6, v12 */
/* .line 854 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 856 */
/* and-int/lit16 v12, v6, 0xc0 */
/* const/16 v13, 0x80 */
/* if-eq v12, v13, :cond_1 */
/* .line 857 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v6 ); // invoke-virtual {p0, v6}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(I)V
/* .line 859 */
} // :cond_1
/* shl-int/lit8 v12, v5, 0x6 */
/* and-int/lit8 v13, v6, 0x3f */
/* or-int v5, v12, v13 */
/* .line 860 */
int v12 = 1; // const/4 v12, 0x1
/* if-le v11, v12, :cond_4 */
/* .line 861 */
/* shr-int/lit8 v12, v9, 0x2 */
/* aget v6, p1, v12 */
/* .line 862 */
/* and-int/lit8 v2, v9, 0x3 */
/* .line 863 */
/* rsub-int/lit8 v12, v2, 0x3 */
/* shl-int/lit8 v12, v12, 0x3 */
/* shr-int/2addr v6, v12 */
/* .line 864 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 866 */
/* and-int/lit16 v12, v6, 0xc0 */
/* const/16 v13, 0x80 */
/* if-eq v12, v13, :cond_2 */
/* .line 867 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v6 ); // invoke-virtual {p0, v6}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(I)V
/* .line 869 */
} // :cond_2
/* shl-int/lit8 v12, v5, 0x6 */
/* and-int/lit8 v13, v6, 0x3f */
/* or-int v5, v12, v13 */
/* .line 870 */
int v12 = 2; // const/4 v12, 0x2
/* if-le v11, v12, :cond_4 */
/* .line 871 */
/* shr-int/lit8 v12, v9, 0x2 */
/* aget v6, p1, v12 */
/* .line 872 */
/* and-int/lit8 v2, v9, 0x3 */
/* .line 873 */
/* rsub-int/lit8 v12, v2, 0x3 */
/* shl-int/lit8 v12, v12, 0x3 */
/* shr-int/2addr v6, v12 */
/* .line 874 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 875 */
/* and-int/lit16 v12, v6, 0xc0 */
/* const/16 v13, 0x80 */
/* if-eq v12, v13, :cond_3 */
/* .line 876 */
/* and-int/lit16 v12, v6, 0xff */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v12 ); // invoke-virtual {p0, v12}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(I)V
/* .line 878 */
} // :cond_3
/* shl-int/lit8 v12, v5, 0x6 */
/* and-int/lit8 v13, v6, 0x3f */
/* or-int v5, v12, v13 */
/* .line 881 */
} // :cond_4
int v12 = 2; // const/4 v12, 0x2
/* if-le v11, v12, :cond_d */
/* .line 882 */
/* const/high16 v12, 0x10000 */
/* sub-int/2addr v5, v12 */
/* .line 883 */
/* array-length v12, v4 */
/* if-lt v8, v12, :cond_5 */
/* .line 884 */
v12 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v12 ).expandCurrentSegment ( ); // invoke-virtual {v12}, Lorg/codehaus/jackson/util/TextBuffer;->expandCurrentSegment()[C
/* .line 886 */
} // :cond_5
/* add-int/lit8 v7, v8, 0x1 */
} // .end local v8 # "cix":I
/* .restart local v7 # "cix":I */
/* const v12, 0xd800 */
/* shr-int/lit8 v13, v5, 0xa */
/* add-int/2addr v12, v13 */
/* int-to-char v12, v12 */
/* aput-char v12, v4, v8 */
/* .line 887 */
/* const v12, 0xdc00 */
/* and-int/lit16 v13, v5, 0x3ff */
/* or-int v5, v12, v13 */
/* .line 890 */
} // .end local v6 # "ch2":I
} // .end local v11 # "needed":I
} // :goto_3
/* array-length v12, v4 */
/* if-lt v7, v12, :cond_6 */
/* .line 891 */
v12 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v12 ).expandCurrentSegment ( ); // invoke-virtual {v12}, Lorg/codehaus/jackson/util/TextBuffer;->expandCurrentSegment()[C
/* .line 893 */
} // :cond_6
/* add-int/lit8 v8, v7, 0x1 */
} // .end local v7 # "cix":I
/* .restart local v8 # "cix":I */
/* int-to-char v12, v5 */
/* aput-char v12, v4, v7 */
/* goto/16 :goto_1 */
/* .line 818 */
} // .end local v2 # "byteIx":I
} // .end local v4 # "cbuf":[C
} // .end local v5 # "ch":I
} // .end local v8 # "cix":I
} // .end local v9 # "ix":I
} // .end local v10 # "lastQuad":I
} // :cond_7
int v10 = 0; // const/4 v10, 0x0
/* .restart local v10 # "lastQuad":I */
/* goto/16 :goto_0 */
/* .line 836 */
/* .restart local v2 # "byteIx":I */
/* .restart local v4 # "cbuf":[C */
/* .restart local v5 # "ch":I */
/* .restart local v8 # "cix":I */
/* .restart local v9 # "ix":I */
} // :cond_8
/* and-int/lit16 v12, v5, 0xf0 */
/* const/16 v13, 0xe0 */
/* if-ne v12, v13, :cond_9 */
/* .line 837 */
/* and-int/lit8 v5, v5, 0xf */
/* .line 838 */
int v11 = 2; // const/4 v11, 0x2
/* .restart local v11 # "needed":I */
/* goto/16 :goto_2 */
/* .line 839 */
} // .end local v11 # "needed":I
} // :cond_9
/* and-int/lit16 v12, v5, 0xf8 */
/* const/16 v13, 0xf0 */
/* if-ne v12, v13, :cond_a */
/* .line 840 */
/* and-int/lit8 v5, v5, 0x7 */
/* .line 841 */
int v11 = 3; // const/4 v11, 0x3
/* .restart local v11 # "needed":I */
/* goto/16 :goto_2 */
/* .line 843 */
} // .end local v11 # "needed":I
} // :cond_a
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidInitial ( v5 ); // invoke-virtual {p0, v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidInitial(I)V
/* .line 844 */
int v5 = 1; // const/4 v5, 0x1
/* move v11, v5 */
/* .restart local v11 # "needed":I */
/* goto/16 :goto_2 */
/* .line 900 */
} // .end local v2 # "byteIx":I
} // .end local v5 # "ch":I
} // .end local v11 # "needed":I
} // :cond_b
/* new-instance v1, Ljava/lang/String; */
int v12 = 0; // const/4 v12, 0x0
/* invoke-direct {v1, v4, v12, v8}, Ljava/lang/String;-><init>([CII)V */
/* .line 902 */
/* .local v1, "baseName":Ljava/lang/String; */
int v12 = 4; // const/4 v12, 0x4
/* move/from16 v0, p3 */
/* if-ge v0, v12, :cond_c */
/* .line 903 */
/* add-int/lit8 v12, p2, -0x1 */
/* aput v10, p1, v12 */
/* .line 905 */
} // :cond_c
v12 = this._symbols;
/* move/from16 v0, p2 */
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) v12 ).addName ( v1, p1, v0 ); // invoke-virtual {v12, v1, p1, v0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->addName(Ljava/lang/String;[II)Lorg/codehaus/jackson/sym/Name;
} // .end local v1 # "baseName":Ljava/lang/String;
/* .restart local v2 # "byteIx":I */
/* .restart local v5 # "ch":I */
} // :cond_d
/* move v7, v8 */
} // .end local v8 # "cix":I
/* .restart local v7 # "cix":I */
} // .end method
private final org.codehaus.jackson.sym.Name findName ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "q1" # I */
/* .param p2, "lastQuadBytes" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 753 */
v1 = this._symbols;
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) v1 ).findName ( p1 ); // invoke-virtual {v1, p1}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->findName(I)Lorg/codehaus/jackson/sym/Name;
/* .line 754 */
/* .local v0, "name":Lorg/codehaus/jackson/sym/Name; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 759 */
} // .end local v0 # "name":Lorg/codehaus/jackson/sym/Name;
} // :goto_0
/* .line 758 */
/* .restart local v0 # "name":Lorg/codehaus/jackson/sym/Name; */
} // :cond_0
v1 = this._quadBuffer;
int v2 = 0; // const/4 v2, 0x0
/* aput p1, v1, v2 */
/* .line 759 */
v1 = this._quadBuffer;
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {p0, v1, v2, p2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->addName([III)Lorg/codehaus/jackson/sym/Name; */
} // .end method
private final org.codehaus.jackson.sym.Name findName ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "q1" # I */
/* .param p2, "q2" # I */
/* .param p3, "lastQuadBytes" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 766 */
v1 = this._symbols;
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) v1 ).findName ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->findName(II)Lorg/codehaus/jackson/sym/Name;
/* .line 767 */
/* .local v0, "name":Lorg/codehaus/jackson/sym/Name; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 773 */
} // .end local v0 # "name":Lorg/codehaus/jackson/sym/Name;
} // :goto_0
/* .line 771 */
/* .restart local v0 # "name":Lorg/codehaus/jackson/sym/Name; */
} // :cond_0
v1 = this._quadBuffer;
int v2 = 0; // const/4 v2, 0x0
/* aput p1, v1, v2 */
/* .line 772 */
v1 = this._quadBuffer;
int v2 = 1; // const/4 v2, 0x1
/* aput p2, v1, v2 */
/* .line 773 */
v1 = this._quadBuffer;
int v2 = 2; // const/4 v2, 0x2
/* invoke-direct {p0, v1, v2, p3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->addName([III)Lorg/codehaus/jackson/sym/Name; */
} // .end method
private final org.codehaus.jackson.sym.Name findName ( Integer[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .param p1, "quads" # [I */
/* .param p2, "qlen" # I */
/* .param p3, "lastQuad" # I */
/* .param p4, "lastQuadBytes" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 779 */
/* array-length v2, p1 */
/* if-lt p2, v2, :cond_0 */
/* .line 780 */
/* array-length v2, p1 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( p1,v2 );
this._quadBuffer = p1;
/* .line 782 */
} // :cond_0
/* add-int/lit8 v1, p2, 0x1 */
} // .end local p2 # "qlen":I
/* .local v1, "qlen":I */
/* aput p3, p1, p2 */
/* .line 783 */
v2 = this._symbols;
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) v2 ).findName ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->findName([II)Lorg/codehaus/jackson/sym/Name;
/* .line 784 */
/* .local v0, "name":Lorg/codehaus/jackson/sym/Name; */
/* if-nez v0, :cond_1 */
/* .line 785 */
/* invoke-direct {p0, p1, v1, p4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->addName([III)Lorg/codehaus/jackson/sym/Name; */
/* .line 787 */
} // .end local v0 # "name":Lorg/codehaus/jackson/sym/Name;
} // :cond_1
} // .end method
public static growArrayBy ( Integer[] p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "arr" # [I */
/* .param p1, "more" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1692 */
/* if-nez p0, :cond_0 */
/* .line 1693 */
/* new-array p0, p1, [I */
/* .line 1699 */
} // .end local p0 # "arr":[I
} // :goto_0
/* .line 1695 */
/* .restart local p0 # "arr":[I */
} // :cond_0
/* move-object v1, p0 */
/* .line 1696 */
/* .local v1, "old":[I */
/* array-length v0, p0 */
/* .line 1697 */
/* .local v0, "len":I */
/* add-int v2, v0, p1 */
/* new-array p0, v2, [I */
/* .line 1698 */
java.lang.System .arraycopy ( v1,v3,p0,v3,v0 );
} // .end method
private Integer nextByte ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1649 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v0, v1, :cond_0 */
/* .line 1650 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1652 */
} // :cond_0
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v0, v1 */
/* and-int/lit16 v0, v0, 0xff */
} // .end method
private final org.codehaus.jackson.sym.Name parseFieldName ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .param p1, "q1" # I */
/* .param p2, "ch" # I */
/* .param p3, "lastQuadBytes" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 446 */
v1 = this._quadBuffer;
int v2 = 0; // const/4 v2, 0x0
/* move-object v0, p0 */
/* move v3, p1 */
/* move v4, p2 */
/* move v5, p3 */
/* invoke-virtual/range {v0 ..v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseEscapedFieldName([IIIII)Lorg/codehaus/jackson/sym/Name; */
} // .end method
private final org.codehaus.jackson.sym.Name parseFieldName ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 6 */
/* .param p1, "q1" # I */
/* .param p2, "q2" # I */
/* .param p3, "ch" # I */
/* .param p4, "lastQuadBytes" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 452 */
v0 = this._quadBuffer;
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
/* .line 453 */
v1 = this._quadBuffer;
int v2 = 1; // const/4 v2, 0x1
/* move-object v0, p0 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-virtual/range {v0 ..v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseEscapedFieldName([IIIII)Lorg/codehaus/jackson/sym/Name; */
} // .end method
/* # virtual methods */
protected _decodeBase64 ( org.codehaus.jackson.Base64Variant p0 ) {
/* .locals 9 */
/* .param p1, "b64variant" # Lorg/codehaus/jackson/Base64Variant; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v8 = 3; // const/4 v8, 0x3
int v7 = -2; // const/4 v7, -0x2
/* .line 1712 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._getByteArrayBuilder ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_getByteArrayBuilder()Lorg/codehaus/jackson/util/ByteArrayBuilder;
/* .line 1725 */
/* .local v1, "builder":Lorg/codehaus/jackson/util/ByteArrayBuilder; */
} // :cond_0
} // :goto_0
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v4, v5, :cond_1 */
/* .line 1726 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1728 */
} // :cond_1
v4 = this._inputBuffer;
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v4, v4, v5 */
/* and-int/lit16 v2, v4, 0xff */
/* .line 1729 */
/* .local v2, "ch":I */
/* const/16 v4, 0x20 */
/* if-le v2, v4, :cond_0 */
/* .line 1730 */
v0 = (( org.codehaus.jackson.Base64Variant ) p1 ).decodeBase64Char ( v2 ); // invoke-virtual {p1, v2}, Lorg/codehaus/jackson/Base64Variant;->decodeBase64Char(I)I
/* .line 1731 */
/* .local v0, "bits":I */
/* if-gez v0, :cond_3 */
/* .line 1732 */
/* const/16 v4, 0x22 */
/* if-ne v2, v4, :cond_2 */
/* .line 1733 */
(( org.codehaus.jackson.util.ByteArrayBuilder ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/util/ByteArrayBuilder;->toByteArray()[B
/* .line 1735 */
} // :cond_2
int v4 = 0; // const/4 v4, 0x0
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).reportInvalidChar ( p1, v2, v4 ); // invoke-virtual {p0, p1, v2, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->reportInvalidChar(Lorg/codehaus/jackson/Base64Variant;II)Ljava/lang/IllegalArgumentException;
/* throw v4 */
/* .line 1737 */
} // :cond_3
/* move v3, v0 */
/* .line 1741 */
/* .local v3, "decodedData":I */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v4, v5, :cond_4 */
/* .line 1742 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1744 */
} // :cond_4
v4 = this._inputBuffer;
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v4, v4, v5 */
/* and-int/lit16 v2, v4, 0xff */
/* .line 1745 */
v0 = (( org.codehaus.jackson.Base64Variant ) p1 ).decodeBase64Char ( v2 ); // invoke-virtual {p1, v2}, Lorg/codehaus/jackson/Base64Variant;->decodeBase64Char(I)I
/* .line 1746 */
/* if-gez v0, :cond_5 */
/* .line 1747 */
int v4 = 1; // const/4 v4, 0x1
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).reportInvalidChar ( p1, v2, v4 ); // invoke-virtual {p0, p1, v2, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->reportInvalidChar(Lorg/codehaus/jackson/Base64Variant;II)Ljava/lang/IllegalArgumentException;
/* throw v4 */
/* .line 1749 */
} // :cond_5
/* shl-int/lit8 v4, v3, 0x6 */
/* or-int v3, v4, v0 */
/* .line 1752 */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v4, v5, :cond_6 */
/* .line 1753 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1755 */
} // :cond_6
v4 = this._inputBuffer;
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v4, v4, v5 */
/* and-int/lit16 v2, v4, 0xff */
/* .line 1756 */
v0 = (( org.codehaus.jackson.Base64Variant ) p1 ).decodeBase64Char ( v2 ); // invoke-virtual {p1, v2}, Lorg/codehaus/jackson/Base64Variant;->decodeBase64Char(I)I
/* .line 1759 */
/* if-gez v0, :cond_a */
/* .line 1760 */
/* if-eq v0, v7, :cond_7 */
/* .line 1761 */
int v4 = 2; // const/4 v4, 0x2
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).reportInvalidChar ( p1, v2, v4 ); // invoke-virtual {p0, p1, v2, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->reportInvalidChar(Lorg/codehaus/jackson/Base64Variant;II)Ljava/lang/IllegalArgumentException;
/* throw v4 */
/* .line 1764 */
} // :cond_7
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v4, v5, :cond_8 */
/* .line 1765 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1767 */
} // :cond_8
v4 = this._inputBuffer;
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v4, v4, v5 */
/* and-int/lit16 v2, v4, 0xff */
/* .line 1768 */
v4 = (( org.codehaus.jackson.Base64Variant ) p1 ).usesPaddingChar ( v2 ); // invoke-virtual {p1, v2}, Lorg/codehaus/jackson/Base64Variant;->usesPaddingChar(I)Z
/* if-nez v4, :cond_9 */
/* .line 1769 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "expected padding character \'"; // const-string v5, "expected padding character \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = (( org.codehaus.jackson.Base64Variant ) p1 ).getPaddingChar ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/Base64Variant;->getPaddingChar()C
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v5 = "\'"; // const-string v5, "\'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).reportInvalidChar ( p1, v2, v8, v4 ); // invoke-virtual {p0, p1, v2, v8, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->reportInvalidChar(Lorg/codehaus/jackson/Base64Variant;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;
/* throw v4 */
/* .line 1772 */
} // :cond_9
/* shr-int/lit8 v3, v3, 0x4 */
/* .line 1773 */
(( org.codehaus.jackson.util.ByteArrayBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Lorg/codehaus/jackson/util/ByteArrayBuilder;->append(I)V
/* goto/16 :goto_0 */
/* .line 1777 */
} // :cond_a
/* shl-int/lit8 v4, v3, 0x6 */
/* or-int v3, v4, v0 */
/* .line 1779 */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v4, v5, :cond_b */
/* .line 1780 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1782 */
} // :cond_b
v4 = this._inputBuffer;
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v6, v5, 0x1 */
/* iput v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v4, v4, v5 */
/* and-int/lit16 v2, v4, 0xff */
/* .line 1783 */
v0 = (( org.codehaus.jackson.Base64Variant ) p1 ).decodeBase64Char ( v2 ); // invoke-virtual {p1, v2}, Lorg/codehaus/jackson/Base64Variant;->decodeBase64Char(I)I
/* .line 1784 */
/* if-gez v0, :cond_d */
/* .line 1785 */
/* if-eq v0, v7, :cond_c */
/* .line 1786 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).reportInvalidChar ( p1, v2, v8 ); // invoke-virtual {p0, p1, v2, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->reportInvalidChar(Lorg/codehaus/jackson/Base64Variant;II)Ljava/lang/IllegalArgumentException;
/* throw v4 */
/* .line 1794 */
} // :cond_c
/* shr-int/lit8 v3, v3, 0x2 */
/* .line 1795 */
(( org.codehaus.jackson.util.ByteArrayBuilder ) v1 ).appendTwoBytes ( v3 ); // invoke-virtual {v1, v3}, Lorg/codehaus/jackson/util/ByteArrayBuilder;->appendTwoBytes(I)V
/* goto/16 :goto_0 */
/* .line 1798 */
} // :cond_d
/* shl-int/lit8 v4, v3, 0x6 */
/* or-int v3, v4, v0 */
/* .line 1799 */
(( org.codehaus.jackson.util.ByteArrayBuilder ) v1 ).appendThreeBytes ( v3 ); // invoke-virtual {v1, v3}, Lorg/codehaus/jackson/util/ByteArrayBuilder;->appendThreeBytes(I)V
/* goto/16 :goto_0 */
} // .end method
protected Integer _decodeCharForError ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "firstByte" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v5, 0x80 */
/* .line 1418 */
/* move v0, p1 */
/* .line 1419 */
/* .local v0, "c":I */
/* if-gez v0, :cond_3 */
/* .line 1423 */
/* and-int/lit16 v3, v0, 0xe0 */
/* const/16 v4, 0xc0 */
/* if-ne v3, v4, :cond_4 */
/* .line 1424 */
/* and-int/lit8 v0, v0, 0x1f */
/* .line 1425 */
int v2 = 1; // const/4 v2, 0x1
/* .line 1438 */
/* .local v2, "needed":I */
} // :goto_0
v1 = /* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->nextByte()I */
/* .line 1439 */
/* .local v1, "d":I */
/* and-int/lit16 v3, v1, 0xc0 */
/* if-eq v3, v5, :cond_0 */
/* .line 1440 */
/* and-int/lit16 v3, v1, 0xff */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v3 ); // invoke-virtual {p0, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(I)V
/* .line 1442 */
} // :cond_0
/* shl-int/lit8 v3, v0, 0x6 */
/* and-int/lit8 v4, v1, 0x3f */
/* or-int v0, v3, v4 */
/* .line 1444 */
int v3 = 1; // const/4 v3, 0x1
/* if-le v2, v3, :cond_3 */
/* .line 1445 */
v1 = /* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->nextByte()I */
/* .line 1446 */
/* and-int/lit16 v3, v1, 0xc0 */
/* if-eq v3, v5, :cond_1 */
/* .line 1447 */
/* and-int/lit16 v3, v1, 0xff */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v3 ); // invoke-virtual {p0, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(I)V
/* .line 1449 */
} // :cond_1
/* shl-int/lit8 v3, v0, 0x6 */
/* and-int/lit8 v4, v1, 0x3f */
/* or-int v0, v3, v4 */
/* .line 1450 */
int v3 = 2; // const/4 v3, 0x2
/* if-le v2, v3, :cond_3 */
/* .line 1451 */
v1 = /* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->nextByte()I */
/* .line 1452 */
/* and-int/lit16 v3, v1, 0xc0 */
/* if-eq v3, v5, :cond_2 */
/* .line 1453 */
/* and-int/lit16 v3, v1, 0xff */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( v3 ); // invoke-virtual {p0, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(I)V
/* .line 1455 */
} // :cond_2
/* shl-int/lit8 v3, v0, 0x6 */
/* and-int/lit8 v4, v1, 0x3f */
/* or-int v0, v3, v4 */
/* .line 1459 */
} // .end local v1 # "d":I
} // .end local v2 # "needed":I
} // :cond_3
/* .line 1426 */
} // :cond_4
/* and-int/lit16 v3, v0, 0xf0 */
/* const/16 v4, 0xe0 */
/* if-ne v3, v4, :cond_5 */
/* .line 1427 */
/* and-int/lit8 v0, v0, 0xf */
/* .line 1428 */
int v2 = 2; // const/4 v2, 0x2
/* .restart local v2 # "needed":I */
/* .line 1429 */
} // .end local v2 # "needed":I
} // :cond_5
/* and-int/lit16 v3, v0, 0xf8 */
/* const/16 v4, 0xf0 */
/* if-ne v3, v4, :cond_6 */
/* .line 1431 */
/* and-int/lit8 v0, v0, 0x7 */
/* .line 1432 */
int v2 = 3; // const/4 v2, 0x3
/* .restart local v2 # "needed":I */
/* .line 1434 */
} // .end local v2 # "needed":I
} // :cond_6
/* and-int/lit16 v3, v0, 0xff */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidInitial ( v3 ); // invoke-virtual {p0, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidInitial(I)V
/* .line 1435 */
int v2 = 1; // const/4 v2, 0x1
/* .restart local v2 # "needed":I */
} // .end method
protected final Object _decodeEscaped ( ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1364 */
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v5, v6, :cond_0 */
/* .line 1365 */
v5 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v5, :cond_0 */
/* .line 1366 */
final String v5 = " in character escape sequence"; // const-string v5, " in character escape sequence"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v5 ); // invoke-virtual {p0, v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 1369 */
} // :cond_0
v5 = this._inputBuffer;
/* iget v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v7, v6, 0x1 */
/* iput v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v5, v6 */
/* .line 1371 */
/* .local v0, "c":I */
/* sparse-switch v0, :sswitch_data_0 */
/* .line 1394 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Unrecognized character escape (\\ followed by "; // const-string v6, "Unrecognized character escape (\\ followed by "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._decodeCharForError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeCharForError(I)I
org.codehaus.jackson.impl.Utf8StreamParser ._getCharDesc ( v6 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = ")"; // const-string v6, ")"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportError ( v5 ); // invoke-virtual {p0, v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportError(Ljava/lang/String;)V
/* .line 1398 */
/* :sswitch_0 */
int v4 = 0; // const/4 v4, 0x0
/* .line 1399 */
/* .local v4, "value":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
int v5 = 4; // const/4 v5, 0x4
/* if-ge v3, v5, :cond_3 */
/* .line 1400 */
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v5, v6, :cond_1 */
/* .line 1401 */
v5 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v5, :cond_1 */
/* .line 1402 */
final String v5 = " in character escape sequence"; // const-string v5, " in character escape sequence"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v5 ); // invoke-virtual {p0, v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 1405 */
} // :cond_1
v5 = this._inputBuffer;
/* iget v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v7, v6, 0x1 */
/* iput v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v1, v5, v6 */
/* .line 1406 */
/* .local v1, "ch":I */
v2 = org.codehaus.jackson.util.CharTypes .charToHex ( v1 );
/* .line 1407 */
/* .local v2, "digit":I */
/* if-gez v2, :cond_2 */
/* .line 1408 */
final String v5 = "expected a hex-digit for character escape sequence"; // const-string v5, "expected a hex-digit for character escape sequence"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( v1, v5 ); // invoke-virtual {p0, v1, v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
/* .line 1410 */
} // :cond_2
/* shl-int/lit8 v5, v4, 0x4 */
/* or-int v4, v5, v2 */
/* .line 1399 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 1374 */
} // .end local v1 # "ch":I
} // .end local v2 # "digit":I
} // .end local v3 # "i":I
} // .end local v4 # "value":I
/* :sswitch_1 */
/* const/16 v5, 0x8 */
/* .line 1412 */
} // :goto_1
/* .line 1376 */
/* :sswitch_2 */
/* const/16 v5, 0x9 */
/* .line 1378 */
/* :sswitch_3 */
/* const/16 v5, 0xa */
/* .line 1380 */
/* :sswitch_4 */
/* const/16 v5, 0xc */
/* .line 1382 */
/* :sswitch_5 */
/* const/16 v5, 0xd */
/* .line 1388 */
/* :sswitch_6 */
/* int-to-char v5, v0 */
/* .line 1412 */
/* .restart local v3 # "i":I */
/* .restart local v4 # "value":I */
} // :cond_3
/* int-to-char v5, v4 */
/* .line 1371 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x22 -> :sswitch_6 */
/* 0x2f -> :sswitch_6 */
/* 0x5c -> :sswitch_6 */
/* 0x62 -> :sswitch_1 */
/* 0x66 -> :sswitch_4 */
/* 0x6e -> :sswitch_3 */
/* 0x72 -> :sswitch_5 */
/* 0x74 -> :sswitch_2 */
/* 0x75 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
protected void _finishString ( ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 918 */
int v6 = 0; // const/4 v6, 0x0
/* .line 920 */
/* .local v6, "outPtr":I */
v10 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v10 ).emptyAndGetCurrentSegment ( ); // invoke-virtual {v10}, Lorg/codehaus/jackson/util/TextBuffer;->emptyAndGetCurrentSegment()[C
/* .line 923 */
/* .local v5, "outBuf":[C */
org.codehaus.jackson.util.CharTypes .getInputCodeUtf8 ( );
/* .line 924 */
/* .local v1, "codes":[I */
v2 = this._inputBuffer;
/* .line 931 */
/* .local v2, "inputBuffer":[B */
} // :goto_0
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 932 */
/* .local v8, "ptr":I */
/* iget v10, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v8, v10, :cond_0 */
/* .line 933 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 934 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 936 */
} // :cond_0
/* array-length v10, v5 */
/* if-lt v6, v10, :cond_1 */
/* .line 937 */
v10 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v10 ).finishCurrentSegment ( ); // invoke-virtual {v10}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 938 */
int v6 = 0; // const/4 v6, 0x0
/* .line 940 */
} // :cond_1
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* .line 942 */
/* .local v3, "max":I */
/* array-length v10, v5 */
/* sub-int/2addr v10, v6 */
/* add-int v4, v8, v10 */
/* .line 943 */
/* .local v4, "max2":I */
/* if-ge v4, v3, :cond_9 */
/* .line 944 */
/* move v3, v4 */
/* move v9, v8 */
} // .end local v8 # "ptr":I
/* .local v9, "ptr":I */
/* move v7, v6 */
/* .line 947 */
} // .end local v6 # "outPtr":I
/* .local v7, "outPtr":I */
} // :goto_1
/* if-ge v9, v3, :cond_3 */
/* .line 948 */
/* add-int/lit8 v8, v9, 0x1 */
} // .end local v9 # "ptr":I
/* .restart local v8 # "ptr":I */
/* aget-byte v10, v2, v9 */
/* and-int/lit16 v0, v10, 0xff */
/* .line 949 */
/* .local v0, "c":I */
/* aget v10, v1, v0 */
if ( v10 != null) { // if-eqz v10, :cond_2
/* .line 950 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 958 */
/* const/16 v10, 0x22 */
/* if-ne v0, v10, :cond_4 */
/* .line 1004 */
v10 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v10 ).setCurrentLength ( v7 ); // invoke-virtual {v10, v7}, Lorg/codehaus/jackson/util/TextBuffer;->setCurrentLength(I)V
/* .line 1005 */
return;
/* .line 953 */
} // :cond_2
/* add-int/lit8 v6, v7, 0x1 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* int-to-char v10, v0 */
/* aput-char v10, v5, v7 */
/* move v9, v8 */
} // .end local v8 # "ptr":I
/* .restart local v9 # "ptr":I */
/* move v7, v6 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* .line 955 */
} // .end local v0 # "c":I
} // :cond_3
/* iput v9, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* move v6, v7 */
/* .line 956 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* .line 962 */
} // .end local v6 # "outPtr":I
} // .end local v9 # "ptr":I
/* .restart local v0 # "c":I */
/* .restart local v7 # "outPtr":I */
/* .restart local v8 # "ptr":I */
} // :cond_4
/* aget v10, v1, v0 */
/* packed-switch v10, :pswitch_data_0 */
/* .line 988 */
/* const/16 v10, 0x20 */
/* if-ge v0, v10, :cond_8 */
/* .line 990 */
final String v10 = "string value"; // const-string v10, "string value"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwUnquotedSpace ( v0, v10 ); // invoke-virtual {p0, v0, v10}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwUnquotedSpace(ILjava/lang/String;)V
/* move v6, v7 */
/* .line 997 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :goto_2
/* array-length v10, v5 */
/* if-lt v6, v10, :cond_5 */
/* .line 998 */
v10 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v10 ).finishCurrentSegment ( ); // invoke-virtual {v10}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 999 */
int v6 = 0; // const/4 v6, 0x0
/* .line 1002 */
} // :cond_5
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* int-to-char v10, v0 */
/* aput-char v10, v5, v6 */
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* .line 964 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* :pswitch_0 */
v0 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._decodeEscaped ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeEscaped()C
/* move v6, v7 */
/* .line 965 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* .line 967 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* :pswitch_1 */
v0 = /* invoke-direct {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeUtf8_2(I)I */
/* move v6, v7 */
/* .line 968 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* .line 970 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* :pswitch_2 */
/* iget v10, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* iget v11, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* sub-int/2addr v10, v11 */
int v11 = 2; // const/4 v11, 0x2
/* if-lt v10, v11, :cond_6 */
/* .line 971 */
v0 = /* invoke-direct {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeUtf8_3fast(I)I */
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* .line 973 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
} // :cond_6
v0 = /* invoke-direct {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeUtf8_3(I)I */
/* move v6, v7 */
/* .line 975 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* .line 977 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* :pswitch_3 */
v0 = /* invoke-direct {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeUtf8_4(I)I */
/* .line 979 */
/* add-int/lit8 v6, v7, 0x1 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* const v10, 0xd800 */
/* shr-int/lit8 v11, v0, 0xa */
/* or-int/2addr v10, v11 */
/* int-to-char v10, v10 */
/* aput-char v10, v5, v7 */
/* .line 980 */
/* array-length v10, v5 */
/* if-lt v6, v10, :cond_7 */
/* .line 981 */
v10 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v10 ).finishCurrentSegment ( ); // invoke-virtual {v10}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 982 */
int v6 = 0; // const/4 v6, 0x0
/* .line 984 */
} // :cond_7
/* const v10, 0xdc00 */
/* and-int/lit16 v11, v0, 0x3ff */
/* or-int v0, v10, v11 */
/* .line 986 */
/* .line 993 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
} // :cond_8
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidChar ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidChar(I)V
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // .end local v0 # "c":I
} // :cond_9
/* move v9, v8 */
} // .end local v8 # "ptr":I
/* .restart local v9 # "ptr":I */
/* move v7, v6 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* goto/16 :goto_1 */
/* .line 962 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
protected final org.codehaus.jackson.JsonToken _handleUnexpectedValue ( Integer p0 ) {
/* .locals 10 */
/* .param p1, "c" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v9, 0x27 */
/* .line 1083 */
/* if-ne p1, v9, :cond_0 */
v7 = org.codehaus.jackson.JsonParser$Feature.ALLOW_SINGLE_QUOTES;
v7 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).isEnabled ( v7 ); // invoke-virtual {p0, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
/* if-nez v7, :cond_1 */
/* .line 1084 */
} // :cond_0
final String v7 = "expected a valid value (number, String, array, object, \'true\', \'false\' or \'null\')"; // const-string v7, "expected a valid value (number, String, array, object, \'true\', \'false\' or \'null\')"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( p1, v7 ); // invoke-virtual {p0, p1, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
/* .line 1088 */
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
/* .line 1089 */
/* .local v5, "outPtr":I */
v7 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v7 ).emptyAndGetCurrentSegment ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/util/TextBuffer;->emptyAndGetCurrentSegment()[C
/* .line 1092 */
/* .local v4, "outBuf":[C */
org.codehaus.jackson.util.CharTypes .getInputCodeUtf8 ( );
/* .line 1093 */
/* .local v0, "codes":[I */
v1 = this._inputBuffer;
/* .line 1100 */
/* .local v1, "inputBuffer":[B */
} // :cond_2
} // :goto_0
/* iget v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v7, v8, :cond_3 */
/* .line 1101 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1103 */
} // :cond_3
/* array-length v7, v4 */
/* if-lt v5, v7, :cond_4 */
/* .line 1104 */
v7 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v7 ).finishCurrentSegment ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 1105 */
int v5 = 0; // const/4 v5, 0x0
/* .line 1107 */
} // :cond_4
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* .line 1109 */
/* .local v2, "max":I */
/* iget v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* array-length v8, v4 */
/* sub-int/2addr v8, v5 */
/* add-int v3, v7, v8 */
/* .line 1110 */
/* .local v3, "max2":I */
/* if-ge v3, v2, :cond_5 */
/* .line 1111 */
/* move v2, v3 */
/* .line 1114 */
} // :cond_5
} // :goto_1
/* iget v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* if-ge v7, v2, :cond_2 */
/* .line 1115 */
/* iget v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v8, v7, 0x1 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v7, v1, v7 */
/* and-int/lit16 p1, v7, 0xff */
/* .line 1116 */
/* if-eq p1, v9, :cond_6 */
/* aget v7, v0, p1 */
if ( v7 != null) { // if-eqz v7, :cond_7
/* .line 1124 */
} // :cond_6
/* if-ne p1, v9, :cond_8 */
/* .line 1170 */
v7 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v7 ).setCurrentLength ( v5 ); // invoke-virtual {v7, v5}, Lorg/codehaus/jackson/util/TextBuffer;->setCurrentLength(I)V
/* .line 1172 */
v7 = org.codehaus.jackson.JsonToken.VALUE_STRING;
/* .line 1119 */
} // :cond_7
/* add-int/lit8 v6, v5, 0x1 */
} // .end local v5 # "outPtr":I
/* .local v6, "outPtr":I */
/* int-to-char v7, p1 */
/* aput-char v7, v4, v5 */
/* move v5, v6 */
} // .end local v6 # "outPtr":I
/* .restart local v5 # "outPtr":I */
/* .line 1128 */
} // :cond_8
/* aget v7, v0, p1 */
/* packed-switch v7, :pswitch_data_0 */
/* .line 1156 */
/* const/16 v7, 0x20 */
/* if-ge p1, v7, :cond_9 */
/* .line 1157 */
final String v7 = "string value"; // const-string v7, "string value"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwUnquotedSpace ( p1, v7 ); // invoke-virtual {p0, p1, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwUnquotedSpace(ILjava/lang/String;)V
/* .line 1160 */
} // :cond_9
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidChar ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidChar(I)V
/* .line 1163 */
} // :cond_a
} // :goto_2
/* array-length v7, v4 */
/* if-lt v5, v7, :cond_b */
/* .line 1164 */
v7 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v7 ).finishCurrentSegment ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 1165 */
int v5 = 0; // const/4 v5, 0x0
/* .line 1168 */
} // :cond_b
/* add-int/lit8 v6, v5, 0x1 */
} // .end local v5 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* int-to-char v7, p1 */
/* aput-char v7, v4, v5 */
/* move v5, v6 */
} // .end local v6 # "outPtr":I
/* .restart local v5 # "outPtr":I */
/* .line 1130 */
/* :pswitch_0 */
/* const/16 v7, 0x22 */
/* if-eq p1, v7, :cond_a */
/* .line 1131 */
p1 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._decodeEscaped ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeEscaped()C
/* .line 1135 */
/* :pswitch_1 */
p1 = /* invoke-direct {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeUtf8_2(I)I */
/* .line 1136 */
/* .line 1138 */
/* :pswitch_2 */
/* iget v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* sub-int/2addr v7, v8 */
int v8 = 2; // const/4 v8, 0x2
/* if-lt v7, v8, :cond_c */
/* .line 1139 */
p1 = /* invoke-direct {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeUtf8_3fast(I)I */
/* .line 1141 */
} // :cond_c
p1 = /* invoke-direct {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeUtf8_3(I)I */
/* .line 1143 */
/* .line 1145 */
/* :pswitch_3 */
p1 = /* invoke-direct {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeUtf8_4(I)I */
/* .line 1147 */
/* add-int/lit8 v6, v5, 0x1 */
} // .end local v5 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* const v7, 0xd800 */
/* shr-int/lit8 v8, p1, 0xa */
/* or-int/2addr v7, v8 */
/* int-to-char v7, v7 */
/* aput-char v7, v4, v5 */
/* .line 1148 */
/* array-length v7, v4 */
/* if-lt v6, v7, :cond_d */
/* .line 1149 */
v7 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v7 ).finishCurrentSegment ( ); // invoke-virtual {v7}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 1150 */
int v5 = 0; // const/4 v5, 0x0
/* .line 1152 */
} // .end local v6 # "outPtr":I
/* .restart local v5 # "outPtr":I */
} // :goto_3
/* const v7, 0xdc00 */
/* and-int/lit16 v8, p1, 0x3ff */
/* or-int p1, v7, v8 */
/* .line 1154 */
} // .end local v5 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :cond_d
/* move v5, v6 */
} // .end local v6 # "outPtr":I
/* .restart local v5 # "outPtr":I */
/* .line 1128 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
protected final org.codehaus.jackson.sym.Name _handleUnusualFieldName ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "ch" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 568 */
/* const/16 v7, 0x27 */
/* if-ne p1, v7, :cond_1 */
v7 = org.codehaus.jackson.JsonParser$Feature.ALLOW_SINGLE_QUOTES;
v7 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).isEnabled ( v7 ); // invoke-virtual {p0, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 569 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._parseApostropheFieldName ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_parseApostropheFieldName()Lorg/codehaus/jackson/sym/Name;
/* .line 629 */
} // :cond_0
} // :goto_0
/* .line 572 */
} // :cond_1
v7 = org.codehaus.jackson.JsonParser$Feature.ALLOW_UNQUOTED_FIELD_NAMES;
v7 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).isEnabled ( v7 ); // invoke-virtual {p0, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
/* if-nez v7, :cond_2 */
/* .line 573 */
final String v7 = "was expecting double-quote to start field name"; // const-string v7, "was expecting double-quote to start field name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( p1, v7 ); // invoke-virtual {p0, p1, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
/* .line 579 */
} // :cond_2
org.codehaus.jackson.util.CharTypes .getInputCodeUtf8JsNames ( );
/* .line 581 */
/* .local v0, "codes":[I */
/* aget v7, v0, p1 */
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 582 */
final String v7 = "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"; // const-string v7, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( p1, v7 ); // invoke-virtual {p0, p1, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
/* .line 589 */
} // :cond_3
v6 = this._quadBuffer;
/* .line 590 */
/* .local v6, "quads":[I */
int v4 = 0; // const/4 v4, 0x0
/* .line 591 */
/* .local v4, "qlen":I */
int v1 = 0; // const/4 v1, 0x0
/* .line 592 */
/* .local v1, "currQuad":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "currQuadBytes":I */
/* move v5, v4 */
/* .line 596 */
} // .end local v4 # "qlen":I
/* .local v5, "qlen":I */
} // :goto_1
int v7 = 4; // const/4 v7, 0x4
/* if-ge v2, v7, :cond_7 */
/* .line 597 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 598 */
/* shl-int/lit8 v7, v1, 0x8 */
/* or-int v1, v7, p1 */
/* move v4, v5 */
/* .line 607 */
} // .end local v5 # "qlen":I
/* .restart local v4 # "qlen":I */
} // :goto_2
/* iget v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v7, v8, :cond_4 */
/* .line 608 */
v7 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v7, :cond_4 */
/* .line 609 */
final String v7 = " in field name"; // const-string v7, " in field name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v7 ); // invoke-virtual {p0, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 612 */
} // :cond_4
v7 = this._inputBuffer;
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v7, v7, v8 */
/* and-int/lit16 p1, v7, 0xff */
/* .line 613 */
/* aget v7, v0, p1 */
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 619 */
/* if-lez v2, :cond_6 */
/* .line 620 */
/* array-length v7, v6 */
/* if-lt v4, v7, :cond_5 */
/* .line 621 */
/* array-length v7, v6 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( v6,v7 );
this._quadBuffer = v6;
/* .line 623 */
} // :cond_5
/* add-int/lit8 v5, v4, 0x1 */
} // .end local v4 # "qlen":I
/* .restart local v5 # "qlen":I */
/* aput v1, v6, v4 */
/* move v4, v5 */
/* .line 625 */
} // .end local v5 # "qlen":I
/* .restart local v4 # "qlen":I */
} // :cond_6
v7 = this._symbols;
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) v7 ).findName ( v6, v4 ); // invoke-virtual {v7, v6, v4}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->findName([II)Lorg/codehaus/jackson/sym/Name;
/* .line 626 */
/* .local v3, "name":Lorg/codehaus/jackson/sym/Name; */
/* if-nez v3, :cond_0 */
/* .line 627 */
/* invoke-direct {p0, v6, v4, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->addName([III)Lorg/codehaus/jackson/sym/Name; */
/* .line 600 */
} // .end local v3 # "name":Lorg/codehaus/jackson/sym/Name;
} // .end local v4 # "qlen":I
/* .restart local v5 # "qlen":I */
} // :cond_7
/* array-length v7, v6 */
/* if-lt v5, v7, :cond_8 */
/* .line 601 */
/* array-length v7, v6 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( v6,v7 );
this._quadBuffer = v6;
/* .line 603 */
} // :cond_8
/* add-int/lit8 v4, v5, 0x1 */
} // .end local v5 # "qlen":I
/* .restart local v4 # "qlen":I */
/* aput v1, v6, v5 */
/* .line 604 */
/* move v1, p1 */
/* .line 605 */
int v2 = 1; // const/4 v2, 0x1
/* .line 616 */
} // :cond_9
/* iget v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v7, v7, 0x1 */
/* iput v7, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* move v5, v4 */
} // .end local v4 # "qlen":I
/* .restart local v5 # "qlen":I */
} // .end method
protected void _matchToken ( org.codehaus.jackson.JsonToken p0 ) {
/* .locals 6 */
/* .param p1, "token" # Lorg/codehaus/jackson/JsonToken; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1185 */
(( org.codehaus.jackson.JsonToken ) p1 ).asByteArray ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonToken;->asByteArray()[B
/* .line 1186 */
/* .local v2, "matchBytes":[B */
int v0 = 1; // const/4 v0, 0x1
/* .line 1188 */
/* .local v0, "i":I */
/* array-length v1, v2 */
/* .local v1, "len":I */
} // :goto_0
/* if-ge v0, v1, :cond_2 */
/* .line 1189 */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v3, v4, :cond_0 */
/* .line 1190 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1192 */
} // :cond_0
/* aget-byte v3, v2, v0 */
v4 = this._inputBuffer;
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v4, v4, v5 */
/* if-eq v3, v4, :cond_1 */
/* .line 1193 */
(( org.codehaus.jackson.JsonToken ) p1 ).asString ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/JsonToken;->asString()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
(( java.lang.String ) v3 ).substring ( v4, v0 ); // invoke-virtual {v3, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* invoke-direct {p0, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidToken(Ljava/lang/String;)V */
/* .line 1195 */
} // :cond_1
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v3, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1188 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 1201 */
} // :cond_2
return;
} // .end method
protected final org.codehaus.jackson.sym.Name _parseApostropheFieldName ( ) {
/* .locals 13 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v12, 0x27 */
int v11 = 4; // const/4 v11, 0x4
/* .line 640 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_0 */
/* .line 641 */
v8 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v8, :cond_0 */
/* .line 642 */
final String v8 = ": was expecting closing \'\'\' for name"; // const-string v8, ": was expecting closing \'\'\' for name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 645 */
} // :cond_0
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v8, v8, v9 */
/* and-int/lit16 v0, v8, 0xff */
/* .line 646 */
/* .local v0, "ch":I */
/* if-ne v0, v12, :cond_2 */
/* .line 647 */
org.codehaus.jackson.sym.BytesToNameCanonicalizer .getEmptyName ( );
/* .line 740 */
} // :cond_1
} // :goto_0
/* .line 649 */
} // :cond_2
v7 = this._quadBuffer;
/* .line 650 */
/* .local v7, "quads":[I */
int v5 = 0; // const/4 v5, 0x0
/* .line 651 */
/* .local v5, "qlen":I */
int v2 = 0; // const/4 v2, 0x0
/* .line 652 */
/* .local v2, "currQuad":I */
int v3 = 0; // const/4 v3, 0x0
/* .line 656 */
/* .local v3, "currQuadBytes":I */
org.codehaus.jackson.util.CharTypes .getInputCodeLatin1 ( );
/* .local v1, "codes":[I */
/* move v6, v5 */
/* .line 659 */
} // .end local v5 # "qlen":I
/* .local v6, "qlen":I */
} // :goto_1
/* if-ne v0, v12, :cond_4 */
/* .line 730 */
/* if-lez v3, :cond_e */
/* .line 731 */
/* array-length v8, v7 */
/* if-lt v6, v8, :cond_3 */
/* .line 732 */
/* array-length v8, v7 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( v7,v8 );
this._quadBuffer = v7;
/* .line 734 */
} // :cond_3
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "qlen":I
/* .restart local v5 # "qlen":I */
/* aput v2, v7, v6 */
/* .line 736 */
} // :goto_2
v8 = this._symbols;
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) v8 ).findName ( v7, v5 ); // invoke-virtual {v8, v7, v5}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->findName([II)Lorg/codehaus/jackson/sym/Name;
/* .line 737 */
/* .local v4, "name":Lorg/codehaus/jackson/sym/Name; */
/* if-nez v4, :cond_1 */
/* .line 738 */
/* invoke-direct {p0, v7, v5, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->addName([III)Lorg/codehaus/jackson/sym/Name; */
/* .line 663 */
} // .end local v4 # "name":Lorg/codehaus/jackson/sym/Name;
} // .end local v5 # "qlen":I
/* .restart local v6 # "qlen":I */
} // :cond_4
/* const/16 v8, 0x22 */
/* if-eq v0, v8, :cond_7 */
/* aget v8, v1, v0 */
if ( v8 != null) { // if-eqz v8, :cond_7
/* .line 664 */
/* const/16 v8, 0x5c */
/* if-eq v0, v8, :cond_9 */
/* .line 667 */
final String v8 = "name"; // const-string v8, "name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwUnquotedSpace ( v0, v8 ); // invoke-virtual {p0, v0, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwUnquotedSpace(ILjava/lang/String;)V
/* .line 677 */
} // :goto_3
/* const/16 v8, 0x7f */
/* if-le v0, v8, :cond_7 */
/* .line 679 */
/* if-lt v3, v11, :cond_6 */
/* .line 680 */
/* array-length v8, v7 */
/* if-lt v6, v8, :cond_5 */
/* .line 681 */
/* array-length v8, v7 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( v7,v8 );
this._quadBuffer = v7;
/* .line 683 */
} // :cond_5
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "qlen":I
/* .restart local v5 # "qlen":I */
/* aput v2, v7, v6 */
/* .line 684 */
int v2 = 0; // const/4 v2, 0x0
/* .line 685 */
int v3 = 0; // const/4 v3, 0x0
/* move v6, v5 */
/* .line 687 */
} // .end local v5 # "qlen":I
/* .restart local v6 # "qlen":I */
} // :cond_6
/* const/16 v8, 0x800 */
/* if-ge v0, v8, :cond_a */
/* .line 688 */
/* shl-int/lit8 v8, v2, 0x8 */
/* shr-int/lit8 v9, v0, 0x6 */
/* or-int/lit16 v9, v9, 0xc0 */
/* or-int v2, v8, v9 */
/* .line 689 */
/* add-int/lit8 v3, v3, 0x1 */
/* move v5, v6 */
/* .line 707 */
} // .end local v6 # "qlen":I
/* .restart local v5 # "qlen":I */
} // :goto_4
/* and-int/lit8 v8, v0, 0x3f */
/* or-int/lit16 v0, v8, 0x80 */
/* move v6, v5 */
/* .line 711 */
} // .end local v5 # "qlen":I
/* .restart local v6 # "qlen":I */
} // :cond_7
/* if-ge v3, v11, :cond_c */
/* .line 712 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 713 */
/* shl-int/lit8 v8, v2, 0x8 */
/* or-int v2, v8, v0 */
/* move v5, v6 */
/* .line 722 */
} // .end local v6 # "qlen":I
/* .restart local v5 # "qlen":I */
} // :goto_5
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_8 */
/* .line 723 */
v8 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v8, :cond_8 */
/* .line 724 */
final String v8 = " in field name"; // const-string v8, " in field name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 727 */
} // :cond_8
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v8, v8, v9 */
/* and-int/lit16 v0, v8, 0xff */
/* move v6, v5 */
} // .end local v5 # "qlen":I
/* .restart local v6 # "qlen":I */
/* goto/16 :goto_1 */
/* .line 670 */
} // :cond_9
v0 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._decodeEscaped ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeEscaped()C
/* .line 692 */
} // :cond_a
/* shl-int/lit8 v8, v2, 0x8 */
/* shr-int/lit8 v9, v0, 0xc */
/* or-int/lit16 v9, v9, 0xe0 */
/* or-int v2, v8, v9 */
/* .line 693 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 695 */
/* if-lt v3, v11, :cond_f */
/* .line 696 */
/* array-length v8, v7 */
/* if-lt v6, v8, :cond_b */
/* .line 697 */
/* array-length v8, v7 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( v7,v8 );
this._quadBuffer = v7;
/* .line 699 */
} // :cond_b
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "qlen":I
/* .restart local v5 # "qlen":I */
/* aput v2, v7, v6 */
/* .line 700 */
int v2 = 0; // const/4 v2, 0x0
/* .line 701 */
int v3 = 0; // const/4 v3, 0x0
/* .line 703 */
} // :goto_6
/* shl-int/lit8 v8, v2, 0x8 */
/* shr-int/lit8 v9, v0, 0x6 */
/* and-int/lit8 v9, v9, 0x3f */
/* or-int/lit16 v9, v9, 0x80 */
/* or-int v2, v8, v9 */
/* .line 704 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 715 */
} // .end local v5 # "qlen":I
/* .restart local v6 # "qlen":I */
} // :cond_c
/* array-length v8, v7 */
/* if-lt v6, v8, :cond_d */
/* .line 716 */
/* array-length v8, v7 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( v7,v8 );
this._quadBuffer = v7;
/* .line 718 */
} // :cond_d
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "qlen":I
/* .restart local v5 # "qlen":I */
/* aput v2, v7, v6 */
/* .line 719 */
/* move v2, v0 */
/* .line 720 */
int v3 = 1; // const/4 v3, 0x1
} // .end local v5 # "qlen":I
/* .restart local v6 # "qlen":I */
} // :cond_e
/* move v5, v6 */
} // .end local v6 # "qlen":I
/* .restart local v5 # "qlen":I */
/* goto/16 :goto_2 */
} // .end local v5 # "qlen":I
/* .restart local v6 # "qlen":I */
} // :cond_f
/* move v5, v6 */
} // .end local v6 # "qlen":I
/* .restart local v5 # "qlen":I */
} // .end method
protected final org.codehaus.jackson.sym.Name _parseFieldName ( Integer p0 ) {
/* .locals 10 */
/* .param p1, "i" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v9 = 3; // const/4 v9, 0x3
int v8 = 2; // const/4 v8, 0x2
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
/* const/16 v5, 0x22 */
/* .line 261 */
/* if-eq p1, v5, :cond_0 */
/* .line 262 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._handleUnusualFieldName ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_handleUnusualFieldName(I)Lorg/codehaus/jackson/sym/Name;
/* .line 316 */
} // :goto_0
/* .line 265 */
} // :cond_0
/* iget v2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* sub-int/2addr v2, v3 */
/* const/16 v3, 0x9 */
/* if-ge v2, v3, :cond_1 */
/* .line 266 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).slowParseFieldName ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->slowParseFieldName()Lorg/codehaus/jackson/sym/Name;
/* .line 275 */
} // :cond_1
org.codehaus.jackson.util.CharTypes .getInputCodeLatin1 ( );
/* .line 277 */
/* .local v0, "codes":[I */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 v1, v2, 0xff */
/* .line 278 */
/* .local v1, "q":I */
/* aget v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 279 */
/* if-ne v1, v5, :cond_2 */
/* .line 280 */
org.codehaus.jackson.sym.BytesToNameCanonicalizer .getEmptyName ( );
/* .line 282 */
} // :cond_2
/* invoke-direct {p0, v6, v1, v6}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(III)Lorg/codehaus/jackson/sym/Name; */
/* .line 285 */
} // :cond_3
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 p1, v2, 0xff */
/* .line 286 */
/* aget v2, v0, p1 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 287 */
/* if-ne p1, v5, :cond_4 */
/* .line 288 */
/* invoke-direct {p0, v1, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName(II)Lorg/codehaus/jackson/sym/Name; */
/* .line 290 */
} // :cond_4
/* invoke-direct {p0, v1, p1, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(III)Lorg/codehaus/jackson/sym/Name; */
/* .line 292 */
} // :cond_5
/* shl-int/lit8 v2, v1, 0x8 */
/* or-int v1, v2, p1 */
/* .line 293 */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 p1, v2, 0xff */
/* .line 294 */
/* aget v2, v0, p1 */
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 295 */
/* if-ne p1, v5, :cond_6 */
/* .line 296 */
/* invoke-direct {p0, v1, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName(II)Lorg/codehaus/jackson/sym/Name; */
/* .line 298 */
} // :cond_6
/* invoke-direct {p0, v1, p1, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(III)Lorg/codehaus/jackson/sym/Name; */
/* .line 300 */
} // :cond_7
/* shl-int/lit8 v2, v1, 0x8 */
/* or-int v1, v2, p1 */
/* .line 301 */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 p1, v2, 0xff */
/* .line 302 */
/* aget v2, v0, p1 */
if ( v2 != null) { // if-eqz v2, :cond_9
/* .line 303 */
/* if-ne p1, v5, :cond_8 */
/* .line 304 */
/* invoke-direct {p0, v1, v9}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName(II)Lorg/codehaus/jackson/sym/Name; */
/* goto/16 :goto_0 */
/* .line 306 */
} // :cond_8
/* invoke-direct {p0, v1, p1, v9}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(III)Lorg/codehaus/jackson/sym/Name; */
/* goto/16 :goto_0 */
/* .line 308 */
} // :cond_9
/* shl-int/lit8 v2, v1, 0x8 */
/* or-int v1, v2, p1 */
/* .line 309 */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 p1, v2, 0xff */
/* .line 310 */
/* aget v2, v0, p1 */
if ( v2 != null) { // if-eqz v2, :cond_b
/* .line 311 */
/* if-ne p1, v5, :cond_a */
/* .line 312 */
int v2 = 4; // const/4 v2, 0x4
/* invoke-direct {p0, v1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName(II)Lorg/codehaus/jackson/sym/Name; */
/* goto/16 :goto_0 */
/* .line 314 */
} // :cond_a
int v2 = 4; // const/4 v2, 0x4
/* invoke-direct {p0, v1, p1, v2}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(III)Lorg/codehaus/jackson/sym/Name; */
/* goto/16 :goto_0 */
/* .line 316 */
} // :cond_b
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).parseMediumFieldName ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseMediumFieldName(II)Lorg/codehaus/jackson/sym/Name;
/* goto/16 :goto_0 */
} // .end method
protected void _reportInvalidChar ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "c" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1665 */
/* const/16 v0, 0x20 */
/* if-ge p1, v0, :cond_0 */
/* .line 1666 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwInvalidSpace ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwInvalidSpace(I)V
/* .line 1668 */
} // :cond_0
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidInitial ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidInitial(I)V
/* .line 1669 */
return;
} // .end method
protected void _reportInvalidInitial ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "mask" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1674 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Invalid UTF-8 start byte 0x"; // const-string v1, "Invalid UTF-8 start byte 0x"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toHexString ( p1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportError(Ljava/lang/String;)V
/* .line 1675 */
return;
} // .end method
protected void _reportInvalidOther ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "mask" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1680 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Invalid UTF-8 middle byte 0x"; // const-string v1, "Invalid UTF-8 middle byte 0x"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toHexString ( p1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportError(Ljava/lang/String;)V
/* .line 1681 */
return;
} // .end method
protected void _reportInvalidOther ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "mask" # I */
/* .param p2, "ptr" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1686 */
/* iput p2, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1687 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidOther ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidOther(I)V
/* .line 1688 */
return;
} // .end method
protected final void _skipCR ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1631 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v0, v1, :cond_0 */
v0 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1632 */
} // :cond_0
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v0, v1 */
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_1 */
/* .line 1633 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1636 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputRow:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputRow:I */
/* .line 1637 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iput v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputRowStart:I */
/* .line 1638 */
return;
} // .end method
protected final void _skipLF ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1642 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputRow:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputRow:I */
/* .line 1643 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iput v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputRowStart:I */
/* .line 1644 */
return;
} // .end method
protected void _skipString ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1015 */
int v6 = 0; // const/4 v6, 0x0
/* iput-boolean v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenIncomplete:Z */
/* .line 1018 */
org.codehaus.jackson.util.CharTypes .getInputCodeUtf8 ( );
/* .line 1019 */
/* .local v1, "codes":[I */
v2 = this._inputBuffer;
/* .line 1027 */
/* .local v2, "inputBuffer":[B */
} // :goto_0
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1028 */
/* .local v4, "ptr":I */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* .line 1029 */
/* .local v3, "max":I */
/* if-lt v4, v3, :cond_3 */
/* .line 1030 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMoreGuaranteed()V
/* .line 1031 */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1032 */
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* move v5, v4 */
/* .line 1034 */
} // .end local v4 # "ptr":I
/* .local v5, "ptr":I */
} // :goto_1
/* if-ge v5, v3, :cond_0 */
/* .line 1035 */
/* add-int/lit8 v4, v5, 0x1 */
} // .end local v5 # "ptr":I
/* .restart local v4 # "ptr":I */
/* aget-byte v6, v2, v5 */
/* and-int/lit16 v0, v6, 0xff */
/* .line 1036 */
/* .local v0, "c":I */
/* aget v6, v1, v0 */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 1037 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1044 */
/* const/16 v6, 0x22 */
/* if-ne v0, v6, :cond_1 */
/* .line 1071 */
return;
/* .line 1041 */
} // .end local v0 # "c":I
} // .end local v4 # "ptr":I
/* .restart local v5 # "ptr":I */
} // :cond_0
/* iput v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* .line 1048 */
} // .end local v5 # "ptr":I
/* .restart local v0 # "c":I */
/* .restart local v4 # "ptr":I */
} // :cond_1
/* aget v6, v1, v0 */
/* packed-switch v6, :pswitch_data_0 */
/* .line 1062 */
/* const/16 v6, 0x20 */
/* if-ge v0, v6, :cond_2 */
/* .line 1064 */
final String v6 = "string value"; // const-string v6, "string value"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwUnquotedSpace ( v0, v6 ); // invoke-virtual {p0, v0, v6}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwUnquotedSpace(ILjava/lang/String;)V
/* .line 1050 */
/* :pswitch_0 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._decodeEscaped ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeEscaped()C
/* .line 1053 */
/* :pswitch_1 */
/* invoke-direct {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipUtf8_2(I)V */
/* .line 1056 */
/* :pswitch_2 */
/* invoke-direct {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipUtf8_3(I)V */
/* .line 1059 */
/* :pswitch_3 */
/* invoke-direct {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipUtf8_4(I)V */
/* .line 1067 */
} // :cond_2
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidChar ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidChar(I)V
} // .end local v0 # "c":I
} // :cond_3
/* move v5, v4 */
} // .end local v4 # "ptr":I
/* .restart local v5 # "ptr":I */
/* .line 1048 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public void close ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 247 */
/* invoke-super {p0}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->close()V */
/* .line 249 */
v0 = this._symbols;
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) v0 ).release ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->release()V
/* .line 250 */
return;
} // .end method
public org.codehaus.jackson.ObjectCodec getCodec ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
v0 = this._objectCodec;
} // .end method
public org.codehaus.jackson.JsonToken nextToken ( ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* const/16 v9, 0x7d */
/* const/16 v8, 0x5d */
/* .line 95 */
v4 = this._currToken;
v5 = org.codehaus.jackson.JsonToken.FIELD_NAME;
/* if-ne v4, v5, :cond_0 */
/* .line 96 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_nextAfterName()Lorg/codehaus/jackson/JsonToken; */
/* .line 227 */
} // :goto_0
/* .line 98 */
} // :cond_0
/* iget-boolean v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenIncomplete:Z */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 99 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._skipString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipString()V
/* .line 102 */
} // :cond_1
v0 = /* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipWSOrEnd()I */
/* .line 103 */
/* .local v0, "i":I */
/* if-gez v0, :cond_2 */
/* .line 107 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).close ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->close()V
/* .line 108 */
this._currToken = v3;
/* .line 114 */
} // :cond_2
/* iget-wide v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputProcessed:J */
/* iget v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* int-to-long v6, v6 */
/* add-long/2addr v4, v6 */
/* const-wide/16 v6, 0x1 */
/* sub-long/2addr v4, v6 */
/* iput-wide v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputTotal:J */
/* .line 115 */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputRow:I */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputRow:I */
/* .line 116 */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_currInputRowStart:I */
/* sub-int/2addr v4, v5 */
/* add-int/lit8 v4, v4, -0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputCol:I */
/* .line 119 */
this._binaryValue = v3;
/* .line 122 */
/* if-ne v0, v8, :cond_4 */
/* .line 123 */
v4 = this._parsingContext;
v4 = (( org.codehaus.jackson.impl.JsonReadContext ) v4 ).inArray ( ); // invoke-virtual {v4}, Lorg/codehaus/jackson/impl/JsonReadContext;->inArray()Z
/* if-nez v4, :cond_3 */
/* .line 124 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportMismatchedEndMarker ( v0, v9 ); // invoke-virtual {p0, v0, v9}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportMismatchedEndMarker(IC)V
/* .line 126 */
} // :cond_3
v4 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v4 ).getParent ( ); // invoke-virtual {v4}, Lorg/codehaus/jackson/impl/JsonReadContext;->getParent()Lorg/codehaus/jackson/impl/JsonReadContext;
this._parsingContext = v4;
/* .line 127 */
v3 = org.codehaus.jackson.JsonToken.END_ARRAY;
this._currToken = v3;
/* .line 129 */
} // :cond_4
/* if-ne v0, v9, :cond_6 */
/* .line 130 */
v4 = this._parsingContext;
v4 = (( org.codehaus.jackson.impl.JsonReadContext ) v4 ).inObject ( ); // invoke-virtual {v4}, Lorg/codehaus/jackson/impl/JsonReadContext;->inObject()Z
/* if-nez v4, :cond_5 */
/* .line 131 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportMismatchedEndMarker ( v0, v8 ); // invoke-virtual {p0, v0, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportMismatchedEndMarker(IC)V
/* .line 133 */
} // :cond_5
v4 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v4 ).getParent ( ); // invoke-virtual {v4}, Lorg/codehaus/jackson/impl/JsonReadContext;->getParent()Lorg/codehaus/jackson/impl/JsonReadContext;
this._parsingContext = v4;
/* .line 134 */
v3 = org.codehaus.jackson.JsonToken.END_OBJECT;
this._currToken = v3;
/* .line 138 */
} // :cond_6
v4 = this._parsingContext;
v4 = (( org.codehaus.jackson.impl.JsonReadContext ) v4 ).expectComma ( ); // invoke-virtual {v4}, Lorg/codehaus/jackson/impl/JsonReadContext;->expectComma()Z
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 139 */
/* const/16 v4, 0x2c */
/* if-eq v0, v4, :cond_7 */
/* .line 140 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "was expecting comma to separate "; // const-string v5, "was expecting comma to separate "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v5 ).getTypeDesc ( ); // invoke-virtual {v5}, Lorg/codehaus/jackson/impl/JsonReadContext;->getTypeDesc()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = " entries"; // const-string v5, " entries"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
/* .line 142 */
} // :cond_7
v0 = /* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipWS()I */
/* .line 149 */
} // :cond_8
v4 = this._parsingContext;
v1 = (( org.codehaus.jackson.impl.JsonReadContext ) v4 ).inObject ( ); // invoke-virtual {v4}, Lorg/codehaus/jackson/impl/JsonReadContext;->inObject()Z
/* .line 150 */
/* .local v1, "inObject":Z */
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 152 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._parseFieldName ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_parseFieldName(I)Lorg/codehaus/jackson/sym/Name;
/* .line 153 */
/* .local v2, "n":Lorg/codehaus/jackson/sym/Name; */
v4 = this._parsingContext;
(( org.codehaus.jackson.sym.Name ) v2 ).getName ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/sym/Name;->getName()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonReadContext ) v4 ).setCurrentName ( v5 ); // invoke-virtual {v4, v5}, Lorg/codehaus/jackson/impl/JsonReadContext;->setCurrentName(Ljava/lang/String;)V
/* .line 154 */
v4 = org.codehaus.jackson.JsonToken.FIELD_NAME;
this._currToken = v4;
/* .line 155 */
v0 = /* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipWS()I */
/* .line 156 */
/* const/16 v4, 0x3a */
/* if-eq v0, v4, :cond_9 */
/* .line 157 */
final String v4 = "was expecting a colon to separate field name and value"; // const-string v4, "was expecting a colon to separate field name and value"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
/* .line 159 */
} // :cond_9
v0 = /* invoke-direct {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_skipWS()I */
/* .line 166 */
} // .end local v2 # "n":Lorg/codehaus/jackson/sym/Name;
} // :cond_a
/* sparse-switch v0, :sswitch_data_0 */
/* .line 219 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._handleUnexpectedValue ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_handleUnexpectedValue(I)Lorg/codehaus/jackson/JsonToken;
/* .line 222 */
/* .local v3, "t":Lorg/codehaus/jackson/JsonToken; */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 223 */
this._nextToken = v3;
/* .line 224 */
v3 = this._currToken;
/* goto/16 :goto_0 */
/* .line 168 */
} // .end local v3 # "t":Lorg/codehaus/jackson/JsonToken;
/* :sswitch_0 */
int v4 = 1; // const/4 v4, 0x1
/* iput-boolean v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenIncomplete:Z */
/* .line 169 */
v3 = org.codehaus.jackson.JsonToken.VALUE_STRING;
/* .line 170 */
/* .restart local v3 # "t":Lorg/codehaus/jackson/JsonToken; */
/* .line 172 */
} // .end local v3 # "t":Lorg/codehaus/jackson/JsonToken;
/* :sswitch_1 */
/* if-nez v1, :cond_b */
/* .line 173 */
v4 = this._parsingContext;
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputRow:I */
/* iget v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputCol:I */
(( org.codehaus.jackson.impl.JsonReadContext ) v4 ).createChildArrayContext ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lorg/codehaus/jackson/impl/JsonReadContext;->createChildArrayContext(II)Lorg/codehaus/jackson/impl/JsonReadContext;
this._parsingContext = v4;
/* .line 175 */
} // :cond_b
v3 = org.codehaus.jackson.JsonToken.START_ARRAY;
/* .line 176 */
/* .restart local v3 # "t":Lorg/codehaus/jackson/JsonToken; */
/* .line 178 */
} // .end local v3 # "t":Lorg/codehaus/jackson/JsonToken;
/* :sswitch_2 */
/* if-nez v1, :cond_c */
/* .line 179 */
v4 = this._parsingContext;
/* iget v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputRow:I */
/* iget v6, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_tokenInputCol:I */
(( org.codehaus.jackson.impl.JsonReadContext ) v4 ).createChildObjectContext ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lorg/codehaus/jackson/impl/JsonReadContext;->createChildObjectContext(II)Lorg/codehaus/jackson/impl/JsonReadContext;
this._parsingContext = v4;
/* .line 181 */
} // :cond_c
v3 = org.codehaus.jackson.JsonToken.START_OBJECT;
/* .line 182 */
/* .restart local v3 # "t":Lorg/codehaus/jackson/JsonToken; */
/* .line 187 */
} // .end local v3 # "t":Lorg/codehaus/jackson/JsonToken;
/* :sswitch_3 */
final String v4 = "expected a value"; // const-string v4, "expected a value"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportUnexpectedChar ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportUnexpectedChar(ILjava/lang/String;)V
/* .line 189 */
/* :sswitch_4 */
v4 = org.codehaus.jackson.JsonToken.VALUE_TRUE;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._matchToken ( v4 ); // invoke-virtual {p0, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_matchToken(Lorg/codehaus/jackson/JsonToken;)V
/* .line 190 */
v3 = org.codehaus.jackson.JsonToken.VALUE_TRUE;
/* .line 191 */
/* .restart local v3 # "t":Lorg/codehaus/jackson/JsonToken; */
/* .line 193 */
} // .end local v3 # "t":Lorg/codehaus/jackson/JsonToken;
/* :sswitch_5 */
v4 = org.codehaus.jackson.JsonToken.VALUE_FALSE;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._matchToken ( v4 ); // invoke-virtual {p0, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_matchToken(Lorg/codehaus/jackson/JsonToken;)V
/* .line 194 */
v3 = org.codehaus.jackson.JsonToken.VALUE_FALSE;
/* .line 195 */
/* .restart local v3 # "t":Lorg/codehaus/jackson/JsonToken; */
/* .line 197 */
} // .end local v3 # "t":Lorg/codehaus/jackson/JsonToken;
/* :sswitch_6 */
v4 = org.codehaus.jackson.JsonToken.VALUE_NULL;
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._matchToken ( v4 ); // invoke-virtual {p0, v4}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_matchToken(Lorg/codehaus/jackson/JsonToken;)V
/* .line 198 */
v3 = org.codehaus.jackson.JsonToken.VALUE_NULL;
/* .line 199 */
/* .restart local v3 # "t":Lorg/codehaus/jackson/JsonToken; */
/* .line 216 */
} // .end local v3 # "t":Lorg/codehaus/jackson/JsonToken;
/* :sswitch_7 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).parseNumberText ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseNumberText(I)Lorg/codehaus/jackson/JsonToken;
/* .line 217 */
/* .restart local v3 # "t":Lorg/codehaus/jackson/JsonToken; */
/* .line 226 */
} // :cond_d
this._currToken = v3;
/* goto/16 :goto_0 */
/* .line 166 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x22 -> :sswitch_0 */
/* 0x2d -> :sswitch_7 */
/* 0x30 -> :sswitch_7 */
/* 0x31 -> :sswitch_7 */
/* 0x32 -> :sswitch_7 */
/* 0x33 -> :sswitch_7 */
/* 0x34 -> :sswitch_7 */
/* 0x35 -> :sswitch_7 */
/* 0x36 -> :sswitch_7 */
/* 0x37 -> :sswitch_7 */
/* 0x38 -> :sswitch_7 */
/* 0x39 -> :sswitch_7 */
/* 0x5b -> :sswitch_1 */
/* 0x5d -> :sswitch_3 */
/* 0x66 -> :sswitch_5 */
/* 0x6e -> :sswitch_6 */
/* 0x74 -> :sswitch_4 */
/* 0x7b -> :sswitch_2 */
/* 0x7d -> :sswitch_3 */
} // .end sparse-switch
} // .end method
protected org.codehaus.jackson.sym.Name parseEscapedFieldName ( Integer[] p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 7 */
/* .param p1, "quads" # [I */
/* .param p2, "qlen" # I */
/* .param p3, "currQuad" # I */
/* .param p4, "ch" # I */
/* .param p5, "currQuadBytes" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v6 = 4; // const/4 v6, 0x4
/* .line 472 */
org.codehaus.jackson.util.CharTypes .getInputCodeLatin1 ( );
/* .line 475 */
/* .local v0, "codes":[I */
} // :goto_0
/* aget v3, v0, p4 */
if ( v3 != null) { // if-eqz v3, :cond_d
/* .line 476 */
/* const/16 v3, 0x22 */
/* if-ne p4, v3, :cond_3 */
/* .line 545 */
/* if-lez p5, :cond_1 */
/* .line 546 */
/* array-length v3, p1 */
/* if-lt p2, v3, :cond_0 */
/* .line 547 */
/* array-length v3, p1 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( p1,v3 );
this._quadBuffer = p1;
/* .line 549 */
} // :cond_0
/* add-int/lit8 v2, p2, 0x1 */
} // .end local p2 # "qlen":I
/* .local v2, "qlen":I */
/* aput p3, p1, p2 */
/* move p2, v2 */
/* .line 551 */
} // .end local v2 # "qlen":I
/* .restart local p2 # "qlen":I */
} // :cond_1
v3 = this._symbols;
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) v3 ).findName ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->findName([II)Lorg/codehaus/jackson/sym/Name;
/* .line 552 */
/* .local v1, "name":Lorg/codehaus/jackson/sym/Name; */
/* if-nez v1, :cond_2 */
/* .line 553 */
/* invoke-direct {p0, p1, p2, p5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->addName([III)Lorg/codehaus/jackson/sym/Name; */
/* .line 555 */
} // :cond_2
/* .line 480 */
} // .end local v1 # "name":Lorg/codehaus/jackson/sym/Name;
} // :cond_3
/* const/16 v3, 0x5c */
/* if-eq p4, v3, :cond_6 */
/* .line 482 */
final String v3 = "name"; // const-string v3, "name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._throwUnquotedSpace ( p4, v3 ); // invoke-virtual {p0, p4, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_throwUnquotedSpace(ILjava/lang/String;)V
/* .line 492 */
} // :goto_1
/* const/16 v3, 0x7f */
/* if-le p4, v3, :cond_d */
/* .line 494 */
/* if-lt p5, v6, :cond_c */
/* .line 495 */
/* array-length v3, p1 */
/* if-lt p2, v3, :cond_4 */
/* .line 496 */
/* array-length v3, p1 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( p1,v3 );
this._quadBuffer = p1;
/* .line 498 */
} // :cond_4
/* add-int/lit8 v2, p2, 0x1 */
} // .end local p2 # "qlen":I
/* .restart local v2 # "qlen":I */
/* aput p3, p1, p2 */
/* .line 499 */
int p3 = 0; // const/4 p3, 0x0
/* .line 500 */
int p5 = 0; // const/4 p5, 0x0
/* .line 502 */
} // :goto_2
/* const/16 v3, 0x800 */
/* if-ge p4, v3, :cond_7 */
/* .line 503 */
/* shl-int/lit8 v3, p3, 0x8 */
/* shr-int/lit8 v4, p4, 0x6 */
/* or-int/lit16 v4, v4, 0xc0 */
/* or-int p3, v3, v4 */
/* .line 504 */
/* add-int/lit8 p5, p5, 0x1 */
/* move p2, v2 */
/* .line 522 */
} // .end local v2 # "qlen":I
/* .restart local p2 # "qlen":I */
} // :goto_3
/* and-int/lit8 v3, p4, 0x3f */
/* or-int/lit16 p4, v3, 0x80 */
/* move v2, p2 */
/* .line 526 */
} // .end local p2 # "qlen":I
/* .restart local v2 # "qlen":I */
} // :goto_4
/* if-ge p5, v6, :cond_9 */
/* .line 527 */
/* add-int/lit8 p5, p5, 0x1 */
/* .line 528 */
/* shl-int/lit8 v3, p3, 0x8 */
/* or-int p3, v3, p4 */
/* move p2, v2 */
/* .line 537 */
} // .end local v2 # "qlen":I
/* .restart local p2 # "qlen":I */
} // :goto_5
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v3, v4, :cond_5 */
/* .line 538 */
v3 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v3, :cond_5 */
/* .line 539 */
final String v3 = " in field name"; // const-string v3, " in field name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v3 ); // invoke-virtual {p0, v3}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 542 */
} // :cond_5
v3 = this._inputBuffer;
/* iget v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v5, v4, 0x1 */
/* iput v5, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v3, v3, v4 */
/* and-int/lit16 p4, v3, 0xff */
/* .line 485 */
} // :cond_6
p4 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._decodeEscaped ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_decodeEscaped()C
/* .line 507 */
} // .end local p2 # "qlen":I
/* .restart local v2 # "qlen":I */
} // :cond_7
/* shl-int/lit8 v3, p3, 0x8 */
/* shr-int/lit8 v4, p4, 0xc */
/* or-int/lit16 v4, v4, 0xe0 */
/* or-int p3, v3, v4 */
/* .line 508 */
/* add-int/lit8 p5, p5, 0x1 */
/* .line 510 */
/* if-lt p5, v6, :cond_b */
/* .line 511 */
/* array-length v3, p1 */
/* if-lt v2, v3, :cond_8 */
/* .line 512 */
/* array-length v3, p1 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( p1,v3 );
this._quadBuffer = p1;
/* .line 514 */
} // :cond_8
/* add-int/lit8 p2, v2, 0x1 */
} // .end local v2 # "qlen":I
/* .restart local p2 # "qlen":I */
/* aput p3, p1, v2 */
/* .line 515 */
int p3 = 0; // const/4 p3, 0x0
/* .line 516 */
int p5 = 0; // const/4 p5, 0x0
/* .line 518 */
} // :goto_6
/* shl-int/lit8 v3, p3, 0x8 */
/* shr-int/lit8 v4, p4, 0x6 */
/* and-int/lit8 v4, v4, 0x3f */
/* or-int/lit16 v4, v4, 0x80 */
/* or-int p3, v3, v4 */
/* .line 519 */
/* add-int/lit8 p5, p5, 0x1 */
/* .line 530 */
} // .end local p2 # "qlen":I
/* .restart local v2 # "qlen":I */
} // :cond_9
/* array-length v3, p1 */
/* if-lt v2, v3, :cond_a */
/* .line 531 */
/* array-length v3, p1 */
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( p1,v3 );
this._quadBuffer = p1;
/* .line 533 */
} // :cond_a
/* add-int/lit8 p2, v2, 0x1 */
} // .end local v2 # "qlen":I
/* .restart local p2 # "qlen":I */
/* aput p3, p1, v2 */
/* .line 534 */
/* move p3, p4 */
/* .line 535 */
int p5 = 1; // const/4 p5, 0x1
} // .end local p2 # "qlen":I
/* .restart local v2 # "qlen":I */
} // :cond_b
/* move p2, v2 */
} // .end local v2 # "qlen":I
/* .restart local p2 # "qlen":I */
} // :cond_c
/* move v2, p2 */
} // .end local p2 # "qlen":I
/* .restart local v2 # "qlen":I */
} // .end local v2 # "qlen":I
/* .restart local p2 # "qlen":I */
} // :cond_d
/* move v2, p2 */
} // .end local p2 # "qlen":I
/* .restart local v2 # "qlen":I */
} // .end method
protected org.codehaus.jackson.sym.Name parseLongFieldName ( Integer p0 ) {
/* .locals 12 */
/* .param p1, "q" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v11 = 2; // const/4 v11, 0x2
int v5 = 1; // const/4 v5, 0x1
int v3 = 0; // const/4 v3, 0x0
int v10 = 4; // const/4 v10, 0x4
/* const/16 v9, 0x22 */
/* .line 366 */
org.codehaus.jackson.util.CharTypes .getInputCodeLatin1 ( );
/* .line 367 */
/* .local v6, "codes":[I */
int v2 = 2; // const/4 v2, 0x2
/* .line 374 */
/* .local v2, "qlen":I */
} // :goto_0
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* sub-int/2addr v0, v1 */
/* if-ge v0, v10, :cond_0 */
/* .line 375 */
v1 = this._quadBuffer;
/* move-object v0, p0 */
/* move v4, p1 */
/* move v5, v3 */
/* invoke-virtual/range {v0 ..v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseEscapedFieldName([IIIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 411 */
} // :goto_1
/* .line 379 */
} // :cond_0
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v8, v1, 0x1 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v0, v1 */
/* and-int/lit16 v4, v0, 0xff */
/* .line 380 */
/* .local v4, "i":I */
/* aget v0, v6, v4 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 381 */
/* if-ne v4, v9, :cond_1 */
/* .line 382 */
v0 = this._quadBuffer;
/* invoke-direct {p0, v0, v2, p1, v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName([IIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 384 */
} // :cond_1
v1 = this._quadBuffer;
/* move-object v0, p0 */
/* move v3, p1 */
/* invoke-virtual/range {v0 ..v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseEscapedFieldName([IIIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 387 */
} // :cond_2
/* shl-int/lit8 v0, p1, 0x8 */
/* or-int p1, v0, v4 */
/* .line 388 */
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v8, v1, 0x1 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v0, v1 */
/* and-int/lit16 v4, v0, 0xff */
/* .line 389 */
/* aget v0, v6, v4 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 390 */
/* if-ne v4, v9, :cond_3 */
/* .line 391 */
v0 = this._quadBuffer;
/* invoke-direct {p0, v0, v2, p1, v11}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName([IIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 393 */
} // :cond_3
v1 = this._quadBuffer;
/* move-object v0, p0 */
/* move v3, p1 */
/* move v5, v11 */
/* invoke-virtual/range {v0 ..v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseEscapedFieldName([IIIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 396 */
} // :cond_4
/* shl-int/lit8 v0, p1, 0x8 */
/* or-int p1, v0, v4 */
/* .line 397 */
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v8, v1, 0x1 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v0, v1 */
/* and-int/lit16 v4, v0, 0xff */
/* .line 398 */
/* aget v0, v6, v4 */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 399 */
/* if-ne v4, v9, :cond_5 */
/* .line 400 */
v0 = this._quadBuffer;
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {p0, v0, v2, p1, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName([IIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 402 */
} // :cond_5
v1 = this._quadBuffer;
int v5 = 3; // const/4 v5, 0x3
/* move-object v0, p0 */
/* move v3, p1 */
/* invoke-virtual/range {v0 ..v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseEscapedFieldName([IIIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 405 */
} // :cond_6
/* shl-int/lit8 v0, p1, 0x8 */
/* or-int p1, v0, v4 */
/* .line 406 */
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v8, v1, 0x1 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v0, v1 */
/* and-int/lit16 v4, v0, 0xff */
/* .line 407 */
/* aget v0, v6, v4 */
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 408 */
/* if-ne v4, v9, :cond_7 */
/* .line 409 */
v0 = this._quadBuffer;
/* invoke-direct {p0, v0, v2, p1, v10}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName([IIII)Lorg/codehaus/jackson/sym/Name; */
/* goto/16 :goto_1 */
/* .line 411 */
} // :cond_7
v1 = this._quadBuffer;
/* move-object v0, p0 */
/* move v3, p1 */
/* move v5, v10 */
/* invoke-virtual/range {v0 ..v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseEscapedFieldName([IIIII)Lorg/codehaus/jackson/sym/Name; */
/* goto/16 :goto_1 */
/* .line 415 */
} // :cond_8
v0 = this._quadBuffer;
/* array-length v0, v0 */
/* if-lt v2, v0, :cond_9 */
/* .line 416 */
v0 = this._quadBuffer;
org.codehaus.jackson.impl.Utf8StreamParser .growArrayBy ( v0,v2 );
this._quadBuffer = v0;
/* .line 418 */
} // :cond_9
v0 = this._quadBuffer;
/* add-int/lit8 v7, v2, 0x1 */
} // .end local v2 # "qlen":I
/* .local v7, "qlen":I */
/* aput p1, v0, v2 */
/* .line 419 */
/* move p1, v4 */
/* move v2, v7 */
/* .line 420 */
} // .end local v7 # "qlen":I
/* .restart local v2 # "qlen":I */
/* goto/16 :goto_0 */
} // .end method
protected org.codehaus.jackson.sym.Name parseMediumFieldName ( Integer p0, Integer p1 ) {
/* .locals 10 */
/* .param p1, "q1" # I */
/* .param p2, "q2" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v9 = 4; // const/4 v9, 0x4
int v8 = 3; // const/4 v8, 0x3
int v7 = 2; // const/4 v7, 0x2
int v6 = 1; // const/4 v6, 0x1
/* const/16 v5, 0x22 */
/* .line 323 */
org.codehaus.jackson.util.CharTypes .getInputCodeLatin1 ( );
/* .line 326 */
/* .local v0, "codes":[I */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 v1, v2, 0xff */
/* .line 327 */
/* .local v1, "i":I */
/* aget v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 328 */
/* if-ne v1, v5, :cond_0 */
/* .line 329 */
/* invoke-direct {p0, p1, p2, v6}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName(III)Lorg/codehaus/jackson/sym/Name; */
/* .line 359 */
} // :goto_0
/* .line 331 */
} // :cond_0
/* invoke-direct {p0, p1, p2, v1, v6}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(IIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 333 */
} // :cond_1
/* shl-int/lit8 v2, p2, 0x8 */
/* or-int p2, v2, v1 */
/* .line 334 */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 v1, v2, 0xff */
/* .line 335 */
/* aget v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 336 */
/* if-ne v1, v5, :cond_2 */
/* .line 337 */
/* invoke-direct {p0, p1, p2, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName(III)Lorg/codehaus/jackson/sym/Name; */
/* .line 339 */
} // :cond_2
/* invoke-direct {p0, p1, p2, v1, v7}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(IIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 341 */
} // :cond_3
/* shl-int/lit8 v2, p2, 0x8 */
/* or-int p2, v2, v1 */
/* .line 342 */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 v1, v2, 0xff */
/* .line 343 */
/* aget v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 344 */
/* if-ne v1, v5, :cond_4 */
/* .line 345 */
/* invoke-direct {p0, p1, p2, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName(III)Lorg/codehaus/jackson/sym/Name; */
/* .line 347 */
} // :cond_4
/* invoke-direct {p0, p1, p2, v1, v8}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(IIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 349 */
} // :cond_5
/* shl-int/lit8 v2, p2, 0x8 */
/* or-int p2, v2, v1 */
/* .line 350 */
v2 = this._inputBuffer;
/* iget v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v2, v2, v3 */
/* and-int/lit16 v1, v2, 0xff */
/* .line 351 */
/* aget v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 352 */
/* if-ne v1, v5, :cond_6 */
/* .line 353 */
/* invoke-direct {p0, p1, p2, v9}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->findName(III)Lorg/codehaus/jackson/sym/Name; */
/* .line 355 */
} // :cond_6
/* invoke-direct {p0, p1, p2, v1, v9}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseFieldName(IIII)Lorg/codehaus/jackson/sym/Name; */
/* .line 357 */
} // :cond_7
v2 = this._quadBuffer;
int v3 = 0; // const/4 v3, 0x0
/* aput p1, v2, v3 */
/* .line 358 */
v2 = this._quadBuffer;
/* aput p2, v2, v6 */
/* .line 359 */
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).parseLongFieldName ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseLongFieldName(I)Lorg/codehaus/jackson/sym/Name;
} // .end method
protected java.lang.IllegalArgumentException reportInvalidChar ( org.codehaus.jackson.Base64Variant p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "b64variant" # Lorg/codehaus/jackson/Base64Variant; */
/* .param p2, "ch" # I */
/* .param p3, "bindex" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1807 */
int v0 = 0; // const/4 v0, 0x0
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).reportInvalidChar ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->reportInvalidChar(Lorg/codehaus/jackson/Base64Variant;IILjava/lang/String;)Ljava/lang/IllegalArgumentException;
} // .end method
protected java.lang.IllegalArgumentException reportInvalidChar ( org.codehaus.jackson.Base64Variant p0, Integer p1, Integer p2, java.lang.String p3 ) {
/* .locals 3 */
/* .param p1, "b64variant" # Lorg/codehaus/jackson/Base64Variant; */
/* .param p2, "ch" # I */
/* .param p3, "bindex" # I */
/* .param p4, "msg" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1818 */
/* const/16 v1, 0x20 */
/* if-gt p2, v1, :cond_1 */
/* .line 1819 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Illegal white space character (code 0x"; // const-string v2, "Illegal white space character (code 0x"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toHexString ( p2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ") as character #"; // const-string v2, ") as character #"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v2, p3, 0x1 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " of 4-char base64 unit: can only used between units"; // const-string v2, " of 4-char base64 unit: can only used between units"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 1828 */
/* .local v0, "base":Ljava/lang/String; */
} // :goto_0
if ( p4 != null) { // if-eqz p4, :cond_0
/* .line 1829 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ": "; // const-string v2, ": "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 1831 */
} // :cond_0
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* .line 1820 */
} // .end local v0 # "base":Ljava/lang/String;
} // :cond_1
v1 = (( org.codehaus.jackson.Base64Variant ) p1 ).usesPaddingChar ( p2 ); // invoke-virtual {p1, p2}, Lorg/codehaus/jackson/Base64Variant;->usesPaddingChar(I)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 1821 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected padding character (\'"; // const-string v2, "Unexpected padding character (\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( org.codehaus.jackson.Base64Variant ) p1 ).getPaddingChar ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/Base64Variant;->getPaddingChar()C
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v2 = "\') as character #"; // const-string v2, "\') as character #"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v2, p3, 0x1 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " of 4-char base64 unit: padding only legal as 3rd or 4th character"; // const-string v2, " of 4-char base64 unit: padding only legal as 3rd or 4th character"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .restart local v0 # "base":Ljava/lang/String; */
/* .line 1822 */
} // .end local v0 # "base":Ljava/lang/String;
} // :cond_2
v1 = java.lang.Character .isDefined ( p2 );
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = java.lang.Character .isISOControl ( p2 );
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 1824 */
} // :cond_3
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Illegal character (code 0x"; // const-string v2, "Illegal character (code 0x"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toHexString ( p2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ") in base64 content"; // const-string v2, ") in base64 content"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .restart local v0 # "base":Ljava/lang/String; */
/* .line 1826 */
} // .end local v0 # "base":Ljava/lang/String;
} // :cond_4
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Illegal character \'"; // const-string v2, "Illegal character \'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* int-to-char v2, p2 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v2 = "\' (code 0x"; // const-string v2, "\' (code 0x"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toHexString ( p2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ") in base64 content"; // const-string v2, ") in base64 content"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .restart local v0 # "base":Ljava/lang/String; */
/* goto/16 :goto_0 */
} // .end method
public void setCodec ( org.codehaus.jackson.ObjectCodec p0 ) {
/* .locals 0 */
/* .param p1, "c" # Lorg/codehaus/jackson/ObjectCodec; */
/* .prologue */
/* .line 74 */
this._objectCodec = p1;
/* .line 75 */
return;
} // .end method
protected org.codehaus.jackson.sym.Name slowParseFieldName ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 431 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputEnd:I */
/* if-lt v0, v1, :cond_0 */
/* .line 432 */
v0 = (( org.codehaus.jackson.impl.Utf8StreamParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->loadMore()Z
/* if-nez v0, :cond_0 */
/* .line 433 */
final String v0 = ": was expecting closing \'\"\' for name"; // const-string v0, ": was expecting closing \'\"\' for name"
(( org.codehaus.jackson.impl.Utf8StreamParser ) p0 )._reportInvalidEOF ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 436 */
} // :cond_0
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* add-int/lit8 v3, v1, 0x1 */
/* iput v3, p0, Lorg/codehaus/jackson/impl/Utf8StreamParser;->_inputPtr:I */
/* aget-byte v0, v0, v1 */
/* and-int/lit16 v4, v0, 0xff */
/* .line 437 */
/* .local v4, "i":I */
/* const/16 v0, 0x22 */
/* if-ne v4, v0, :cond_1 */
/* .line 438 */
org.codehaus.jackson.sym.BytesToNameCanonicalizer .getEmptyName ( );
/* .line 440 */
} // :goto_0
} // :cond_1
v1 = this._quadBuffer;
/* move-object v0, p0 */
/* move v3, v2 */
/* move v5, v2 */
/* invoke-virtual/range {v0 ..v5}, Lorg/codehaus/jackson/impl/Utf8StreamParser;->parseEscapedFieldName([IIIII)Lorg/codehaus/jackson/sym/Name; */
} // .end method
