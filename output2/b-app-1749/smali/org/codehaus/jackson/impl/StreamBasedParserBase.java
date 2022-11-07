public abstract class org.codehaus.jackson.impl.StreamBasedParserBase extends org.codehaus.jackson.impl.JsonNumericParserBase {
	 /* .source "StreamBasedParserBase.java" */
	 /* # instance fields */
	 protected Boolean _bufferRecyclable;
	 protected _inputBuffer;
	 protected java.io.InputStream _inputStream;
	 /* # direct methods */
	 protected org.codehaus.jackson.impl.StreamBasedParserBase ( ) {
		 /* .locals 0 */
		 /* .param p1, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
		 /* .param p2, "features" # I */
		 /* .param p3, "in" # Ljava/io/InputStream; */
		 /* .param p4, "inputBuffer" # [B */
		 /* .param p5, "start" # I */
		 /* .param p6, "end" # I */
		 /* .param p7, "bufferRecyclable" # Z */
		 /* .prologue */
		 /* .line 64 */
		 /* invoke-direct {p0, p1, p2}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;-><init>(Lorg/codehaus/jackson/io/IOContext;I)V */
		 /* .line 65 */
		 this._inputStream = p3;
		 /* .line 66 */
		 this._inputBuffer = p4;
		 /* .line 67 */
		 /* iput p5, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_inputPtr:I */
		 /* .line 68 */
		 /* iput p6, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_inputEnd:I */
		 /* .line 69 */
		 /* iput-boolean p7, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_bufferRecyclable:Z */
		 /* .line 70 */
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
	 /* .line 109 */
	 v0 = this._inputStream;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 110 */
		 v0 = this._ioContext;
		 v0 = 		 (( org.codehaus.jackson.io.IOContext ) v0 ).isResourceManaged ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/io/IOContext;->isResourceManaged()Z
		 /* if-nez v0, :cond_0 */
		 v0 = org.codehaus.jackson.JsonParser$Feature.AUTO_CLOSE_SOURCE;
		 v0 = 		 (( org.codehaus.jackson.impl.StreamBasedParserBase ) p0 ).isEnabled ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 111 */
		 } // :cond_0
		 v0 = this._inputStream;
		 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
		 /* .line 113 */
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
	 this._inputStream = v0;
	 /* .line 115 */
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
/* .line 126 */
/* invoke-super {p0}, Lorg/codehaus/jackson/impl/JsonNumericParserBase;->_releaseBuffers()V */
/* .line 127 */
/* iget-boolean v1, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_bufferRecyclable:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 128 */
v0 = this._inputBuffer;
/* .line 129 */
/* .local v0, "buf":[B */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 130 */
	 int v1 = 0; // const/4 v1, 0x0
	 this._inputBuffer = v1;
	 /* .line 131 */
	 v1 = this._ioContext;
	 (( org.codehaus.jackson.io.IOContext ) v1 ).releaseReadIOBuffer ( v0 ); // invoke-virtual {v1, v0}, Lorg/codehaus/jackson/io/IOContext;->releaseReadIOBuffer([B)V
	 /* .line 134 */
} // .end local v0 # "buf":[B
} // :cond_0
return;
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
/* .line 82 */
/* iget-wide v2, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_currInputProcessed:J */
/* iget v4, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_inputEnd:I */
/* int-to-long v4, v4 */
/* add-long/2addr v2, v4 */
/* iput-wide v2, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_currInputProcessed:J */
/* .line 83 */
/* iget v2, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_currInputRowStart:I */
/* iget v3, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_inputEnd:I */
/* sub-int/2addr v2, v3 */
/* iput v2, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_currInputRowStart:I */
/* .line 85 */
v2 = this._inputStream;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 86 */
v2 = this._inputStream;
v3 = this._inputBuffer;
v4 = this._inputBuffer;
/* array-length v4, v4 */
v0 = (( java.io.InputStream ) v2 ).read ( v3, v1, v4 ); // invoke-virtual {v2, v3, v1, v4}, Ljava/io/InputStream;->read([BII)I
/* .line 87 */
/* .local v0, "count":I */
/* if-lez v0, :cond_1 */
/* .line 88 */
/* iput v1, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_inputPtr:I */
/* .line 89 */
/* iput v0, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_inputEnd:I */
/* .line 90 */
int v1 = 1; // const/4 v1, 0x1
/* .line 99 */
} // .end local v0 # "count":I
} // :cond_0
/* .line 93 */
/* .restart local v0 # "count":I */
} // :cond_1
(( org.codehaus.jackson.impl.StreamBasedParserBase ) p0 )._closeInput ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_closeInput()V
/* .line 95 */
/* if-nez v0, :cond_0 */
/* .line 96 */
/* new-instance v1, Ljava/io/IOException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Reader returned 0 characters when trying to read "; // const-string v3, "Reader returned 0 characters when trying to read "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v3, p0, Lorg/codehaus/jackson/impl/StreamBasedParserBase;->_inputEnd:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // .end method
