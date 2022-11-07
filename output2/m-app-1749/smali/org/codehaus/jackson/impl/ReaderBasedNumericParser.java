public abstract class org.codehaus.jackson.impl.ReaderBasedNumericParser extends org.codehaus.jackson.impl.ReaderBasedParserBase {
	 /* .source "ReaderBasedNumericParser.java" */
	 /* # direct methods */
	 public org.codehaus.jackson.impl.ReaderBasedNumericParser ( ) {
		 /* .locals 0 */
		 /* .param p1, "pc" # Lorg/codehaus/jackson/io/IOContext; */
		 /* .param p2, "features" # I */
		 /* .param p3, "r" # Ljava/io/Reader; */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;-><init>(Lorg/codehaus/jackson/io/IOContext;ILjava/io/Reader;)V */
		 /* .line 29 */
		 return;
	 } // .end method
	 private final org.codehaus.jackson.JsonToken parseNumberText2 ( Boolean p0 ) {
		 /* .locals 14 */
		 /* .param p1, "negative" # Z */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException;, */
		 /* Lorg/codehaus/jackson/JsonParseException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* const/16 v13, 0x2d */
	 /* const/16 v12, 0x39 */
	 /* const/16 v11, 0x30 */
	 /* .line 179 */
	 v8 = this._textBuffer;
	 (( org.codehaus.jackson.util.TextBuffer ) v8 ).emptyAndGetCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->emptyAndGetCurrentSegment()[C
	 /* .line 180 */
	 /* .local v5, "outBuf":[C */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 183 */
	 /* .local v6, "outPtr":I */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 184 */
		 /* add-int/lit8 v7, v6, 0x1 */
	 } // .end local v6 # "outPtr":I
	 /* .local v7, "outPtr":I */
	 /* aput-char v13, v5, v6 */
	 /* move v6, v7 */
	 /* .line 188 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 189 */
/* .local v4, "intLen":I */
int v1 = 0; // const/4 v1, 0x0
/* .line 194 */
/* .local v1, "eof":Z */
} // :goto_0
/* iget v8, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_c */
v8 = (( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->loadMore()Z
/* if-nez v8, :cond_c */
/* .line 196 */
int v0 = 0; // const/4 v0, 0x0
/* .line 197 */
/* .local v0, "c":C */
int v1 = 1; // const/4 v1, 0x1
/* .line 218 */
} // :cond_1
/* if-nez v4, :cond_2 */
/* .line 219 */
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "Missing integer part (next char "; // const-string v9, "Missing integer part (next char "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
org.codehaus.jackson.impl.ReaderBasedNumericParser ._getCharDesc ( v0 );
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v9 = ")"; // const-string v9, ")"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reportInvalidNumber ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reportInvalidNumber(Ljava/lang/String;)V
/* .line 222 */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
/* .line 224 */
/* .local v3, "fractLen":I */
/* const/16 v8, 0x2e */
/* if-ne v0, v8, :cond_4 */
/* .line 225 */
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* aput-char v0, v5, v6 */
/* move v6, v7 */
/* .line 229 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :goto_1
/* iget v8, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_f */
v8 = (( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->loadMore()Z
/* if-nez v8, :cond_f */
/* .line 230 */
int v1 = 1; // const/4 v1, 0x1
/* .line 245 */
} // :cond_3
/* if-nez v3, :cond_4 */
/* .line 246 */
final String v8 = "Decimal point not followed by a digit"; // const-string v8, "Decimal point not followed by a digit"
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reportUnexpectedNumberChar ( v0, v8 ); // invoke-virtual {p0, v0, v8}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reportUnexpectedNumberChar(ILjava/lang/String;)V
/* .line 250 */
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
/* .line 251 */
/* .local v2, "expLen":I */
/* const/16 v8, 0x65 */
/* if-eq v0, v8, :cond_5 */
/* const/16 v8, 0x45 */
/* if-ne v0, v8, :cond_a */
/* .line 252 */
} // :cond_5
/* array-length v8, v5 */
/* if-lt v6, v8, :cond_6 */
/* .line 253 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 254 */
int v6 = 0; // const/4 v6, 0x0
/* .line 256 */
} // :cond_6
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* aput-char v0, v5, v6 */
/* .line 258 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputEnd:I */
/* if-ge v8, v9, :cond_11 */
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* aget-char v0, v8, v9 */
/* .line 261 */
} // :goto_2
/* if-eq v0, v13, :cond_7 */
/* const/16 v8, 0x2b */
/* if-ne v0, v8, :cond_15 */
/* .line 262 */
} // :cond_7
/* array-length v8, v5 */
/* if-lt v7, v8, :cond_14 */
/* .line 263 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 264 */
int v6 = 0; // const/4 v6, 0x0
/* .line 266 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :goto_3
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* aput-char v0, v5, v6 */
/* .line 268 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputEnd:I */
/* if-ge v8, v9, :cond_12 */
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* aget-char v0, v8, v9 */
} // :goto_4
/* move v6, v7 */
/* .line 273 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :goto_5
/* if-gt v0, v12, :cond_9 */
/* if-lt v0, v11, :cond_9 */
/* .line 274 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 275 */
/* array-length v8, v5 */
/* if-lt v6, v8, :cond_8 */
/* .line 276 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 277 */
int v6 = 0; // const/4 v6, 0x0
/* .line 279 */
} // :cond_8
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* aput-char v0, v5, v6 */
/* .line 280 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_13 */
v8 = (( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->loadMore()Z
/* if-nez v8, :cond_13 */
/* .line 281 */
int v1 = 1; // const/4 v1, 0x1
/* move v6, v7 */
/* .line 287 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :cond_9
/* if-nez v2, :cond_a */
/* .line 288 */
final String v8 = "Exponent indicator not followed by a digit"; // const-string v8, "Exponent indicator not followed by a digit"
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reportUnexpectedNumberChar ( v0, v8 ); // invoke-virtual {p0, v0, v8}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reportUnexpectedNumberChar(ILjava/lang/String;)V
/* .line 293 */
} // :cond_a
/* if-nez v1, :cond_b */
/* .line 294 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* add-int/lit8 v8, v8, -0x1 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* .line 296 */
} // :cond_b
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).setCurrentLength ( v6 ); // invoke-virtual {v8, v6}, Lorg/codehaus/jackson/util/TextBuffer;->setCurrentLength(I)V
/* .line 299 */
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reset ( p1, v4, v3, v2 ); // invoke-virtual {p0, p1, v4, v3, v2}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reset(ZIII)Lorg/codehaus/jackson/JsonToken;
/* .line 200 */
} // .end local v0 # "c":C
} // .end local v2 # "expLen":I
} // .end local v3 # "fractLen":I
} // :cond_c
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* aget-char v0, v8, v9 */
/* .line 201 */
/* .restart local v0 # "c":C */
/* if-lt v0, v11, :cond_1 */
/* if-gt v0, v12, :cond_1 */
/* .line 204 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 206 */
int v8 = 2; // const/4 v8, 0x2
/* if-ne v4, v8, :cond_d */
/* .line 207 */
/* add-int/lit8 v8, v6, -0x1 */
/* aget-char v8, v5, v8 */
/* if-ne v8, v11, :cond_d */
/* .line 208 */
final String v8 = "Leading zeroes not allowed"; // const-string v8, "Leading zeroes not allowed"
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reportInvalidNumber ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reportInvalidNumber(Ljava/lang/String;)V
/* .line 211 */
} // :cond_d
/* array-length v8, v5 */
/* if-lt v6, v8, :cond_e */
/* .line 212 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 213 */
int v6 = 0; // const/4 v6, 0x0
/* .line 215 */
} // :cond_e
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* aput-char v0, v5, v6 */
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_0 */
/* .line 233 */
/* .restart local v3 # "fractLen":I */
} // :cond_f
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* aget-char v0, v8, v9 */
/* .line 234 */
/* if-lt v0, v11, :cond_3 */
/* if-gt v0, v12, :cond_3 */
/* .line 237 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 238 */
/* array-length v8, v5 */
/* if-lt v6, v8, :cond_10 */
/* .line 239 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 240 */
int v6 = 0; // const/4 v6, 0x0
/* .line 242 */
} // :cond_10
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* aput-char v0, v5, v6 */
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_1 */
/* .line 258 */
} // .end local v6 # "outPtr":I
/* .restart local v2 # "expLen":I */
/* .restart local v7 # "outPtr":I */
} // :cond_11
final String v8 = "expected a digit for number exponent"; // const-string v8, "expected a digit for number exponent"
v0 = (( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).getNextChar ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->getNextChar(Ljava/lang/String;)C
/* goto/16 :goto_2 */
/* .line 268 */
} // :cond_12
final String v8 = "expected a digit for number exponent"; // const-string v8, "expected a digit for number exponent"
v0 = (( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).getNextChar ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->getNextChar(Ljava/lang/String;)C
/* goto/16 :goto_4 */
/* .line 284 */
} // :cond_13
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* aget-char v0, v8, v9 */
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_5 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
} // :cond_14
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_3 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
} // :cond_15
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_5 */
} // .end method
/* # virtual methods */
protected final org.codehaus.jackson.JsonToken parseNumberText ( Integer p0 ) {
/* .locals 14 */
/* .param p1, "ch" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v13, 0x2d */
/* const/16 v12, 0x39 */
/* const/16 v11, 0x30 */
/* .line 61 */
/* if-ne p1, v13, :cond_2 */
int v5 = 1; // const/4 v5, 0x1
/* .line 62 */
/* .local v5, "negative":Z */
} // :goto_0
/* iget v6, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* .line 63 */
/* .local v6, "ptr":I */
/* add-int/lit8 v8, v6, -0x1 */
/* .line 64 */
/* .local v8, "startPtr":I */
/* iget v2, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputEnd:I */
/* .line 68 */
/* .local v2, "inputLen":I */
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 69 */
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputEnd:I */
/* if-lt v6, v9, :cond_3 */
/* .line 165 */
} // :cond_0
} // :goto_1
if ( v5 != null) { // if-eqz v5, :cond_1
/* add-int/lit8 v8, v8, 0x1 */
} // .end local v8 # "startPtr":I
} // :cond_1
/* iput v8, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* .line 166 */
/* invoke-direct {p0, v5}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->parseNumberText2(Z)Lorg/codehaus/jackson/JsonToken; */
} // :goto_2
/* .line 61 */
} // .end local v2 # "inputLen":I
} // .end local v5 # "negative":Z
} // .end local v6 # "ptr":I
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
/* .line 72 */
/* .restart local v2 # "inputLen":I */
/* .restart local v5 # "negative":Z */
/* .restart local v6 # "ptr":I */
/* .restart local v8 # "startPtr":I */
} // :cond_3
v9 = this._inputBuffer;
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "ptr":I
/* .local v7, "ptr":I */
/* aget-char p1, v9, v6 */
/* .line 74 */
/* if-gt p1, v12, :cond_4 */
/* if-ge p1, v11, :cond_5 */
/* .line 75 */
} // :cond_4
final String v9 = "expected digit (0-9) to follow minus sign, for valid numeric value"; // const-string v9, "expected digit (0-9) to follow minus sign, for valid numeric value"
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reportUnexpectedNumberChar ( p1, v9 ); // invoke-virtual {p0, p1, v9}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reportUnexpectedNumberChar(ILjava/lang/String;)V
} // :cond_5
/* move v6, v7 */
/* .line 89 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
} // :cond_6
int v3 = 1; // const/4 v3, 0x1
/* .line 95 */
/* .local v3, "intLen":I */
} // :goto_3
/* iget v9, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputEnd:I */
/* if-ge v6, v9, :cond_0 */
/* .line 98 */
v9 = this._inputBuffer;
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "ptr":I
/* .restart local v7 # "ptr":I */
/* aget-char p1, v9, v6 */
/* .line 99 */
/* if-lt p1, v11, :cond_7 */
/* if-le p1, v12, :cond_8 */
/* .line 110 */
} // :cond_7
int v1 = 0; // const/4 v1, 0x0
/* .line 113 */
/* .local v1, "fractLen":I */
/* const/16 v9, 0x2e */
/* if-ne p1, v9, :cond_c */
/* .line 116 */
} // :goto_4
/* if-lt v7, v2, :cond_9 */
/* move v6, v7 */
/* .line 117 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* .line 103 */
} // .end local v1 # "fractLen":I
} // .end local v6 # "ptr":I
/* .restart local v7 # "ptr":I */
} // :cond_8
/* add-int/lit8 v3, v3, 0x1 */
int v9 = 2; // const/4 v9, 0x2
/* if-ne v3, v9, :cond_15 */
/* .line 104 */
v9 = this._inputBuffer;
/* add-int/lit8 v10, v7, -0x2 */
/* aget-char v9, v9, v10 */
/* if-ne v9, v11, :cond_15 */
/* .line 105 */
final String v9 = "Leading zeroes not allowed"; // const-string v9, "Leading zeroes not allowed"
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reportInvalidNumber ( v9 ); // invoke-virtual {p0, v9}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reportInvalidNumber(Ljava/lang/String;)V
/* move v6, v7 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* .line 119 */
} // .end local v6 # "ptr":I
/* .restart local v1 # "fractLen":I */
/* .restart local v7 # "ptr":I */
} // :cond_9
v9 = this._inputBuffer;
/* add-int/lit8 v6, v7, 0x1 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* aget-char p1, v9, v7 */
/* .line 120 */
/* if-lt p1, v11, :cond_a */
/* if-le p1, v12, :cond_e */
/* .line 126 */
} // :cond_a
/* if-nez v1, :cond_b */
/* .line 127 */
final String v9 = "Decimal point not followed by a digit"; // const-string v9, "Decimal point not followed by a digit"
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reportUnexpectedNumberChar ( p1, v9 ); // invoke-virtual {p0, p1, v9}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reportUnexpectedNumberChar(ILjava/lang/String;)V
} // :cond_b
/* move v7, v6 */
/* .line 131 */
} // .end local v6 # "ptr":I
/* .restart local v7 # "ptr":I */
} // :cond_c
int v0 = 0; // const/4 v0, 0x0
/* .line 132 */
/* .local v0, "expLen":I */
/* const/16 v9, 0x65 */
/* if-eq p1, v9, :cond_d */
/* const/16 v9, 0x45 */
/* if-ne p1, v9, :cond_13 */
/* .line 133 */
} // :cond_d
/* if-lt v7, v2, :cond_f */
/* move v6, v7 */
/* .line 134 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* .line 123 */
} // .end local v0 # "expLen":I
} // :cond_e
/* add-int/lit8 v1, v1, 0x1 */
/* move v7, v6 */
} // .end local v6 # "ptr":I
/* .restart local v7 # "ptr":I */
/* .line 137 */
/* .restart local v0 # "expLen":I */
} // :cond_f
v9 = this._inputBuffer;
/* add-int/lit8 v6, v7, 0x1 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* aget-char p1, v9, v7 */
/* .line 138 */
/* if-eq p1, v13, :cond_10 */
/* const/16 v9, 0x2b */
/* if-ne p1, v9, :cond_14 */
/* .line 139 */
} // :cond_10
/* if-ge v6, v2, :cond_0 */
/* .line 142 */
v9 = this._inputBuffer;
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "ptr":I
/* .restart local v7 # "ptr":I */
/* aget-char p1, v9, v6 */
/* .line 144 */
} // :goto_5
/* if-gt p1, v12, :cond_12 */
/* if-lt p1, v11, :cond_12 */
/* .line 145 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 146 */
/* if-lt v7, v2, :cond_11 */
/* move v6, v7 */
/* .line 147 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* goto/16 :goto_1 */
/* .line 149 */
} // .end local v6 # "ptr":I
/* .restart local v7 # "ptr":I */
} // :cond_11
v9 = this._inputBuffer;
/* add-int/lit8 v6, v7, 0x1 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* aget-char p1, v9, v7 */
/* move v7, v6 */
} // .end local v6 # "ptr":I
/* .restart local v7 # "ptr":I */
/* .line 152 */
} // :cond_12
/* if-nez v0, :cond_13 */
/* .line 153 */
final String v9 = "Exponent indicator not followed by a digit"; // const-string v9, "Exponent indicator not followed by a digit"
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reportUnexpectedNumberChar ( p1, v9 ); // invoke-virtual {p0, p1, v9}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reportUnexpectedNumberChar(ILjava/lang/String;)V
} // :cond_13
/* move v6, v7 */
/* .line 158 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* add-int/lit8 v6, v6, -0x1 */
/* .line 159 */
/* iput v6, p0, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->_inputPtr:I */
/* .line 160 */
/* sub-int v4, v6, v8 */
/* .line 161 */
/* .local v4, "len":I */
v9 = this._textBuffer;
v10 = this._inputBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v9 ).resetWithShared ( v10, v8, v4 ); // invoke-virtual {v9, v10, v8, v4}, Lorg/codehaus/jackson/util/TextBuffer;->resetWithShared([CII)V
/* .line 162 */
(( org.codehaus.jackson.impl.ReaderBasedNumericParser ) p0 ).reset ( v5, v3, v1, v0 ); // invoke-virtual {p0, v5, v3, v1, v0}, Lorg/codehaus/jackson/impl/ReaderBasedNumericParser;->reset(ZIII)Lorg/codehaus/jackson/JsonToken;
/* goto/16 :goto_2 */
} // .end local v4 # "len":I
} // :cond_14
/* move v7, v6 */
} // .end local v6 # "ptr":I
/* .restart local v7 # "ptr":I */
} // .end local v0 # "expLen":I
} // .end local v1 # "fractLen":I
} // :cond_15
/* move v6, v7 */
} // .end local v7 # "ptr":I
/* .restart local v6 # "ptr":I */
/* goto/16 :goto_3 */
} // .end method
