public abstract class org.codehaus.jackson.impl.ReaderBasedParserBase extends org.codehaus.jackson.impl.JsonNumericParserBase {
	 /* .source "ReaderBasedParserBase.java" */
	 /* # instance fields */
	 protected _inputBuffer;
	 protected java.io.Reader _reader;
	 /* # direct methods */
	 protected org.codehaus.jackson.impl.ReaderBasedParserBase ( ) {
		 /* .locals 1 */
		 /* .param p1, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
		 /* .param p2, "features" # I */
		 /* .param p3, "r" # Ljava/io/Reader; */
		 /* .prologue */
		 /* .line 54 */
		 /* invoke-direct {p0, p1, p2}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;-><init>(Lorg/codehaus/jackson/io/IOContext;I)V */
		 /* .line 55 */
		 this._reader = p3;
		 /* .line 56 */
		 (( org.codehaus.jackson.io.IOContext ) p1 ).allocTokenBuffer ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/io/IOContext;->allocTokenBuffer()[C
		 this._inputBuffer = v0;
		 /* .line 57 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void _closeInput ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 110 */
	 v0 = this._reader;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 111 */
		 v0 = this._ioContext;
		 v0 = 		 (( org.codehaus.jackson.io.IOContext ) v0 ).isResourceManaged ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/io/IOContext;->isResourceManaged()Z
		 /* if-nez v0, :cond_0 */
		 v0 = org.codehaus.jackson.JsonParser$Feature.AUTO_CLOSE_SOURCE;
		 v0 = 		 (( org.codehaus.jackson.impl.ReaderBasedParserBase ) p0 ).isEnabled ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 112 */
		 } // :cond_0
		 v0 = this._reader;
		 (( java.io.Reader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/Reader;->close()V
		 /* .line 114 */
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
	 this._reader = v0;
	 /* .line 116 */
} // :cond_2
return;
} // .end method
protected void _releaseBuffers ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 128 */
/* invoke-super {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_releaseBuffers()V */
/* .line 129 */
v0 = this._inputBuffer;
/* .line 130 */
/* .local v0, "buf":[C */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 131 */
int v1 = 0; // const/4 v1, 0x0
this._inputBuffer = v1;
/* .line 132 */
v1 = this._ioContext;
(( org.codehaus.jackson.io.IOContext ) v1 ).releaseTokenBuffer ( v0 ); // invoke-virtual {v1, v0}, Lorg/codehaus/jackson/io/IOContext;->releaseTokenBuffer([C)V
/* .line 134 */
} // :cond_0
return;
} // .end method
protected Object getNextChar ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "eofMsg" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 92 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputPtr:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputEnd:I */
/* if-lt v0, v1, :cond_0 */
/* .line 93 */
v0 = (( org.codehaus.jackson.impl.ReaderBasedParserBase ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->loadMore()Z
/* if-nez v0, :cond_0 */
/* .line 94 */
(( org.codehaus.jackson.impl.ReaderBasedParserBase ) p0 )._reportInvalidEOF ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 97 */
} // :cond_0
v0 = this._inputBuffer;
/* iget v1, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputPtr:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputPtr:I */
/* aget-char v0, v0, v1 */
} // .end method
protected final Boolean loadMore ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 69 */
/* iget-wide v2, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_currInputProcessed:J */
/* iget v4, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputEnd:I */
/* int-to-long v4, v4 */
/* add-long/2addr v2, v4 */
/* iput-wide v2, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_currInputProcessed:J */
/* .line 70 */
/* iget v2, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_currInputRowStart:I */
/* iget v3, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputEnd:I */
/* sub-int/2addr v2, v3 */
/* iput v2, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_currInputRowStart:I */
/* .line 72 */
v2 = this._reader;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 73 */
v2 = this._reader;
v3 = this._inputBuffer;
v4 = this._inputBuffer;
/* array-length v4, v4 */
v0 = (( java.io.Reader ) v2 ).read ( v3, v1, v4 ); // invoke-virtual {v2, v3, v1, v4}, Ljava/io/Reader;->read([CII)I
/* .line 74 */
/* .local v0, "count":I */
/* if-lez v0, :cond_1 */
/* .line 75 */
/* iput v1, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputPtr:I */
/* .line 76 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputEnd:I */
/* .line 77 */
int v1 = 1; // const/4 v1, 0x1
/* .line 86 */
} // .end local v0 # "count":I
} // :cond_0
/* .line 80 */
/* .restart local v0 # "count":I */
} // :cond_1
(( org.codehaus.jackson.impl.ReaderBasedParserBase ) p0 )._closeInput ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_closeInput()V
/* .line 82 */
/* if-nez v0, :cond_0 */
/* .line 83 */
/* new-instance v1, Ljava/io/IOException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Reader returned 0 characters when trying to read "; // const-string v3, "Reader returned 0 characters when trying to read "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v3, p0, Lorg/codehaus/jackson/impl/ReaderBasedParserBase;->_inputEnd:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // .end method
