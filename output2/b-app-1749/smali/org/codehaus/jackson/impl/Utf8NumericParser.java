public abstract class org.codehaus.jackson.impl.Utf8NumericParser extends org.codehaus.jackson.impl.StreamBasedParserBase {
	 /* .source "Utf8NumericParser.java" */
	 /* # direct methods */
	 public org.codehaus.jackson.impl.Utf8NumericParser ( ) {
		 /* .locals 0 */
		 /* .param p1, "pc" # Lorg/codehaus/jackson/io/IOContext; */
		 /* .param p2, "features" # I */
		 /* .param p3, "in" # Ljava/io/InputStream; */
		 /* .param p4, "inputBuffer" # [B */
		 /* .param p5, "start" # I */
		 /* .param p6, "end" # I */
		 /* .param p7, "bufferRecyclable" # Z */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct/range {p0 ..p7}, Lorg/codehaus/jackson/impl/StreamBasedParserBase;-><init>(Lorg/codehaus/jackson/io/IOContext;ILjava/io/InputStream;[BIIZ)V */
		 /* .line 33 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final org.codehaus.jackson.JsonToken parseNumberText ( Integer p0 ) {
		 /* .locals 14 */
		 /* .param p1, "c" # I */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException;, */
		 /* Lorg/codehaus/jackson/JsonParseException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* const/16 v13, 0x39 */
	 /* const/16 v12, 0x2d */
	 /* const/16 v11, 0x30 */
	 /* .line 60 */
	 v8 = this._textBuffer;
	 (( org.codehaus.jackson.util.TextBuffer ) v8 ).emptyAndGetCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->emptyAndGetCurrentSegment()[C
	 /* .line 61 */
	 /* .local v5, "outBuf":[C */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 62 */
	 /* .local v6, "outPtr":I */
	 /* if-ne p1, v12, :cond_e */
	 int v4 = 1; // const/4 v4, 0x1
	 /* .line 65 */
	 /* .local v4, "negative":Z */
} // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_1
	 /* .line 66 */
	 /* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .local v7, "outPtr":I */
/* aput-char v12, v5, v6 */
/* .line 68 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_0 */
/* .line 69 */
(( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->loadMoreGuaranteed()V
/* .line 71 */
} // :cond_0
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* aget-byte v8, v8, v9 */
/* and-int/lit16 p1, v8, 0xff */
/* move v6, v7 */
/* .line 74 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 75 */
/* .local v3, "intLen":I */
int v0 = 0; // const/4 v0, 0x0
/* .line 80 */
/* .local v0, "eof":Z */
} // :goto_1
/* if-lt p1, v11, :cond_19 */
/* if-le p1, v13, :cond_f */
/* move v7, v6 */
/* .line 104 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
} // :goto_2
/* if-nez v3, :cond_2 */
/* .line 105 */
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "Missing integer part (next char "; // const-string v9, "Missing integer part (next char "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
org.codehaus.jackson.impl.Utf8NumericParser ._getCharDesc ( p1 );
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v9 = ")"; // const-string v9, ")"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).reportInvalidNumber ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->reportInvalidNumber(Ljava/lang/String;)V
/* .line 108 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 110 */
/* .local v2, "fractLen":I */
/* const/16 v8, 0x2e */
/* if-ne p1, v8, :cond_18 */
/* .line 111 */
/* add-int/lit8 v6, v7, 0x1 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* int-to-char v8, p1 */
/* aput-char v8, v5, v7 */
/* .line 115 */
} // :goto_3
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_13 */
v8 = (( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->loadMore()Z
/* if-nez v8, :cond_13 */
/* .line 116 */
int v0 = 1; // const/4 v0, 0x1
/* .line 131 */
} // :cond_3
/* if-nez v2, :cond_4 */
/* .line 132 */
final String v8 = "Decimal point not followed by a digit"; // const-string v8, "Decimal point not followed by a digit"
(( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).reportUnexpectedNumberChar ( p1, v8 ); // invoke-virtual {p0, p1, v8}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->reportUnexpectedNumberChar(ILjava/lang/String;)V
/* .line 136 */
} // :cond_4
} // :goto_4
int v1 = 0; // const/4 v1, 0x0
/* .line 137 */
/* .local v1, "expLen":I */
/* const/16 v8, 0x65 */
/* if-eq p1, v8, :cond_5 */
/* const/16 v8, 0x45 */
/* if-ne p1, v8, :cond_c */
/* .line 138 */
} // :cond_5
/* array-length v8, v5 */
/* if-lt v6, v8, :cond_6 */
/* .line 139 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 140 */
int v6 = 0; // const/4 v6, 0x0
/* .line 142 */
} // :cond_6
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* int-to-char v8, p1 */
/* aput-char v8, v5, v6 */
/* .line 144 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_7 */
/* .line 145 */
(( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->loadMoreGuaranteed()V
/* .line 147 */
} // :cond_7
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* aget-byte v8, v8, v9 */
/* and-int/lit16 p1, v8, 0xff */
/* .line 149 */
/* if-eq p1, v12, :cond_8 */
/* const/16 v8, 0x2b */
/* if-ne p1, v8, :cond_17 */
/* .line 150 */
} // :cond_8
/* array-length v8, v5 */
/* if-lt v7, v8, :cond_16 */
/* .line 151 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 152 */
int v6 = 0; // const/4 v6, 0x0
/* .line 154 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :goto_5
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* int-to-char v8, p1 */
/* aput-char v8, v5, v6 */
/* .line 156 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_9 */
/* .line 157 */
(( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).loadMoreGuaranteed ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->loadMoreGuaranteed()V
/* .line 159 */
} // :cond_9
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* aget-byte v8, v8, v9 */
/* and-int/lit16 p1, v8, 0xff */
/* move v6, v7 */
/* .line 163 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :goto_6
/* if-gt p1, v13, :cond_b */
/* if-lt p1, v11, :cond_b */
/* .line 164 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 165 */
/* array-length v8, v5 */
/* if-lt v6, v8, :cond_a */
/* .line 166 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 167 */
int v6 = 0; // const/4 v6, 0x0
/* .line 169 */
} // :cond_a
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* int-to-char v8, p1 */
/* aput-char v8, v5, v6 */
/* .line 170 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_15 */
v8 = (( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->loadMore()Z
/* if-nez v8, :cond_15 */
/* .line 171 */
int v0 = 1; // const/4 v0, 0x1
/* move v6, v7 */
/* .line 177 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
} // :cond_b
/* if-nez v1, :cond_c */
/* .line 178 */
final String v8 = "Exponent indicator not followed by a digit"; // const-string v8, "Exponent indicator not followed by a digit"
(( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).reportUnexpectedNumberChar ( p1, v8 ); // invoke-virtual {p0, p1, v8}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->reportUnexpectedNumberChar(ILjava/lang/String;)V
/* .line 183 */
} // :cond_c
/* if-nez v0, :cond_d */
/* .line 184 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* add-int/lit8 v8, v8, -0x1 */
/* iput v8, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* .line 186 */
} // :cond_d
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).setCurrentLength ( v6 ); // invoke-virtual {v8, v6}, Lorg/codehaus/jackson/util/TextBuffer;->setCurrentLength(I)V
/* .line 189 */
(( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).reset ( v4, v3, v2, v1 ); // invoke-virtual {p0, v4, v3, v2, v1}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->reset(ZIII)Lorg/codehaus/jackson/JsonToken;
/* .line 62 */
} // .end local v0 # "eof":Z
} // .end local v1 # "expLen":I
} // .end local v2 # "fractLen":I
} // .end local v3 # "intLen":I
} // .end local v4 # "negative":Z
} // :cond_e
int v4 = 0; // const/4 v4, 0x0
/* goto/16 :goto_0 */
/* .line 83 */
/* .restart local v0 # "eof":Z */
/* .restart local v3 # "intLen":I */
/* .restart local v4 # "negative":Z */
} // :cond_f
/* add-int/lit8 v3, v3, 0x1 */
/* .line 85 */
int v8 = 2; // const/4 v8, 0x2
/* if-ne v3, v8, :cond_10 */
/* .line 86 */
/* add-int/lit8 v8, v6, -0x1 */
/* aget-char v8, v5, v8 */
/* if-ne v8, v11, :cond_10 */
/* .line 87 */
final String v8 = "Leading zeroes not allowed"; // const-string v8, "Leading zeroes not allowed"
(( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).reportInvalidNumber ( v8 ); // invoke-virtual {p0, v8}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->reportInvalidNumber(Ljava/lang/String;)V
/* .line 90 */
} // :cond_10
/* array-length v8, v5 */
/* if-lt v6, v8, :cond_11 */
/* .line 91 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 92 */
int v6 = 0; // const/4 v6, 0x0
/* .line 94 */
} // :cond_11
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* int-to-char v8, p1 */
/* aput-char v8, v5, v6 */
/* .line 95 */
/* iget v8, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputEnd:I */
/* if-lt v8, v9, :cond_12 */
v8 = (( org.codehaus.jackson.impl.Utf8NumericParser ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/Utf8NumericParser;->loadMore()Z
/* if-nez v8, :cond_12 */
/* .line 97 */
int p1 = 0; // const/4 p1, 0x0
/* .line 98 */
int v0 = 1; // const/4 v0, 0x1
/* .line 99 */
/* goto/16 :goto_2 */
/* .line 101 */
} // :cond_12
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* aget-byte v8, v8, v9 */
/* and-int/lit16 p1, v8, 0xff */
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_1 */
/* .line 119 */
/* .restart local v2 # "fractLen":I */
} // :cond_13
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* aget-byte v8, v8, v9 */
/* and-int/lit16 p1, v8, 0xff */
/* .line 120 */
/* if-lt p1, v11, :cond_3 */
/* if-gt p1, v13, :cond_3 */
/* .line 123 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 124 */
/* array-length v8, v5 */
/* if-lt v6, v8, :cond_14 */
/* .line 125 */
v8 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v8 ).finishCurrentSegment ( ); // invoke-virtual {v8}, Lorg/codehaus/jackson/util/TextBuffer;->finishCurrentSegment()[C
/* .line 126 */
int v6 = 0; // const/4 v6, 0x0
/* .line 128 */
} // :cond_14
/* add-int/lit8 v7, v6, 0x1 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* int-to-char v8, p1 */
/* aput-char v8, v5, v6 */
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_3 */
/* .line 174 */
} // .end local v6 # "outPtr":I
/* .restart local v1 # "expLen":I */
/* .restart local v7 # "outPtr":I */
} // :cond_15
v8 = this._inputBuffer;
/* iget v9, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* add-int/lit8 v10, v9, 0x1 */
/* iput v10, p0, Lorg/codehaus/jackson/impl/Utf8NumericParser;->_inputPtr:I */
/* aget-byte v8, v8, v9 */
/* and-int/lit16 p1, v8, 0xff */
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_6 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
} // :cond_16
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_5 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
} // :cond_17
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_6 */
} // .end local v1 # "expLen":I
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
} // :cond_18
/* move v6, v7 */
} // .end local v7 # "outPtr":I
/* .restart local v6 # "outPtr":I */
/* goto/16 :goto_4 */
} // .end local v2 # "fractLen":I
} // :cond_19
/* move v7, v6 */
} // .end local v6 # "outPtr":I
/* .restart local v7 # "outPtr":I */
/* goto/16 :goto_2 */
} // .end method
