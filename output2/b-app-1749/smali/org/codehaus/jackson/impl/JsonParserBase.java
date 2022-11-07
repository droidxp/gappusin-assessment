public abstract class org.codehaus.jackson.impl.JsonParserBase extends org.codehaus.jackson.JsonParser {
	 /* .source "JsonParserBase.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/impl/JsonParserBase$1; */
	 /* } */
} // .end annotation
/* # static fields */
static final Integer INT_APOSTROPHE;
static final Integer INT_ASTERISK;
static final Integer INT_BACKSLASH;
static final Integer INT_COLON;
static final Integer INT_COMMA;
static final Integer INT_CR;
static final Integer INT_LBRACKET;
static final Integer INT_LCURLY;
static final Integer INT_LF;
static final Integer INT_QUOTE;
static final Integer INT_RBRACKET;
static final Integer INT_RCURLY;
static final Integer INT_SLASH;
static final Integer INT_SPACE;
static final Integer INT_TAB;
static final Integer INT_b;
static final Integer INT_f;
static final Integer INT_n;
static final Integer INT_r;
static final Integer INT_t;
static final Integer INT_u;
/* # instance fields */
protected _binaryValue;
org.codehaus.jackson.util.ByteArrayBuilder _byteArrayBuilder;
protected Boolean _closed;
protected Long _currInputProcessed;
protected Integer _currInputRow;
protected Integer _currInputRowStart;
protected Integer _inputEnd;
protected Integer _inputPtr;
protected final org.codehaus.jackson.io.IOContext _ioContext;
protected Boolean _nameCopied;
protected _nameCopyBuffer;
protected org.codehaus.jackson.JsonToken _nextToken;
protected org.codehaus.jackson.impl.JsonReadContext _parsingContext;
protected final org.codehaus.jackson.util.TextBuffer _textBuffer;
protected Boolean _tokenIncomplete;
protected Integer _tokenInputCol;
protected Integer _tokenInputRow;
protected Long _tokenInputTotal;
/* # direct methods */
protected org.codehaus.jackson.impl.JsonParserBase ( ) {
	 /* .locals 5 */
	 /* .param p1, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
	 /* .param p2, "features" # I */
	 /* .prologue */
	 /* const-wide/16 v3, 0x0 */
	 int v2 = 0; // const/4 v2, 0x0
	 int v1 = 1; // const/4 v1, 0x1
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 215 */
	 /* invoke-direct {p0}, Lorg/codehaus/jackson/JsonParser;-><init>()V */
	 /* .line 81 */
	 /* iput v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_inputPtr:I */
	 /* .line 86 */
	 /* iput v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_inputEnd:I */
	 /* .line 98 */
	 /* iput-wide v3, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_currInputProcessed:J */
	 /* .line 104 */
	 /* iput v1, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_currInputRow:I */
	 /* .line 112 */
	 /* iput v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_currInputRowStart:I */
	 /* .line 128 */
	 /* iput-wide v3, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenInputTotal:J */
	 /* .line 133 */
	 /* iput v1, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenInputRow:I */
	 /* .line 139 */
	 /* iput v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenInputCol:I */
	 /* .line 165 */
	 /* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
	 /* .line 185 */
	 this._nameCopyBuffer = v2;
	 /* .line 192 */
	 /* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_nameCopied:Z */
	 /* .line 198 */
	 this._byteArrayBuilder = v2;
	 /* .line 216 */
	 this._ioContext = p1;
	 /* .line 217 */
	 /* iput p2, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_features:I */
	 /* .line 218 */
	 (( org.codehaus.jackson.io.IOContext ) p1 ).constructTextBuffer ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/io/IOContext;->constructTextBuffer()Lorg/codehaus/jackson/util/TextBuffer;
	 this._textBuffer = v0;
	 /* .line 219 */
	 /* iget v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenInputRow:I */
	 /* iget v1, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenInputCol:I */
	 org.codehaus.jackson.impl.JsonReadContext .createRootContext ( v0,v1 );
	 this._parsingContext = v0;
	 /* .line 220 */
	 return;
} // .end method
protected static final java.lang.String _getCharDesc ( Integer p0 ) {
	 /* .locals 3 */
	 /* .param p0, "ch" # I */
	 /* .prologue */
	 /* .line 627 */
	 /* int-to-char v0, p0 */
	 /* .line 628 */
	 /* .local v0, "c":C */
	 v1 = 	 java.lang.Character .isISOControl ( v0 );
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 629 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "(CTRL-CHAR, code "; // const-string v2, "(CTRL-CHAR, code "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = ")"; // const-string v2, ")"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 634 */
	 } // :goto_0
	 /* .line 631 */
} // :cond_0
/* const/16 v1, 0xff */
/* if-le p0, v1, :cond_1 */
/* .line 632 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "\'"; // const-string v2, "\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v2 = "\' (code "; // const-string v2, "\' (code "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " / 0x"; // const-string v2, " / 0x"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toHexString ( p0 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 634 */
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "\'"; // const-string v2, "\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v2 = "\' (code "; // const-string v2, "\' (code "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
protected abstract void _closeInput ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
protected final org.codehaus.jackson.JsonParseException _constructError ( java.lang.String p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .param p1, "msg" # Ljava/lang/String; */
/* .param p2, "t" # Ljava/lang/Throwable; */
/* .prologue */
/* .line 656 */
/* new-instance v0, Lorg/codehaus/jackson/JsonParseException; */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 ).getCurrentLocation ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->getCurrentLocation()Lorg/codehaus/jackson/JsonLocation;
/* invoke-direct {v0, p1, v1, p2}, Lorg/codehaus/jackson/JsonParseException;-><init>(Ljava/lang/String;Lorg/codehaus/jackson/JsonLocation;Ljava/lang/Throwable;)V */
} // .end method
protected abstract _decodeBase64 ( org.codehaus.jackson.Base64Variant p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
protected abstract void _finishString ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public org.codehaus.jackson.util.ByteArrayBuilder _getByteArrayBuilder ( ) {
/* .locals 1 */
/* .prologue */
/* .line 667 */
v0 = this._byteArrayBuilder;
/* if-nez v0, :cond_0 */
/* .line 668 */
/* new-instance v0, Lorg/codehaus/jackson/util/ByteArrayBuilder; */
/* invoke-direct {v0}, Lorg/codehaus/jackson/util/ByteArrayBuilder;-><init>()V */
this._byteArrayBuilder = v0;
/* .line 672 */
} // :goto_0
v0 = this._byteArrayBuilder;
/* .line 670 */
} // :cond_0
v0 = this._byteArrayBuilder;
(( org.codehaus.jackson.util.ByteArrayBuilder ) v0 ).reset ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/util/ByteArrayBuilder;->reset()V
} // .end method
protected void _handleEOF ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 555 */
v0 = this._parsingContext;
v0 = (( org.codehaus.jackson.impl.JsonReadContext ) v0 ).inRoot ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonReadContext;->inRoot()Z
/* if-nez v0, :cond_0 */
/* .line 556 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = ": expected close marker for "; // const-string v1, ": expected close marker for "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v1 ).getTypeDesc ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/impl/JsonReadContext;->getTypeDesc()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " (from "; // const-string v1, " (from "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this._parsingContext;
v2 = this._ioContext;
(( org.codehaus.jackson.io.IOContext ) v2 ).getSourceReference ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/io/IOContext;->getSourceReference()Ljava/lang/Object;
(( org.codehaus.jackson.impl.JsonReadContext ) v1 ).getStartLocation ( v2 ); // invoke-virtual {v1, v2}, Lorg/codehaus/jackson/impl/JsonReadContext;->getStartLocation(Ljava/lang/Object;)Lorg/codehaus/jackson/JsonLocation;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportInvalidEOF ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 558 */
} // :cond_0
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
/* .line 539 */
v1 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v1 ).releaseBuffers ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/util/TextBuffer;->releaseBuffers()V
/* .line 540 */
v0 = this._nameCopyBuffer;
/* .line 541 */
/* .local v0, "buf":[C */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 542 */
int v1 = 0; // const/4 v1, 0x0
this._nameCopyBuffer = v1;
/* .line 543 */
v1 = this._ioContext;
(( org.codehaus.jackson.io.IOContext ) v1 ).releaseNameCopyBuffer ( v0 ); // invoke-virtual {v1, v0}, Lorg/codehaus/jackson/io/IOContext;->releaseNameCopyBuffer([C)V
/* .line 545 */
} // :cond_0
return;
} // .end method
protected final void _reportError ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "msg" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 640 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._constructError ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/JsonParserBase;->_constructError(Ljava/lang/String;)Lorg/codehaus/jackson/JsonParseException;
/* throw v0 */
} // .end method
protected void _reportInvalidEOF ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 579 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = " in "; // const-string v1, " in "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this._currToken;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportInvalidEOF ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportInvalidEOF(Ljava/lang/String;)V
/* .line 580 */
return;
} // .end method
protected void _reportInvalidEOF ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "msg" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 585 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Unexpected end-of-input"; // const-string v1, "Unexpected end-of-input"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportError(Ljava/lang/String;)V
/* .line 586 */
return;
} // .end method
protected void _reportMismatchedEndMarker ( Integer p0, Object p1 ) {
/* .locals 4 */
/* .param p1, "actCh" # I */
/* .param p2, "expCh" # C */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 615 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this._parsingContext;
v3 = this._ioContext;
(( org.codehaus.jackson.io.IOContext ) v3 ).getSourceReference ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/io/IOContext;->getSourceReference()Ljava/lang/Object;
(( org.codehaus.jackson.impl.JsonReadContext ) v2 ).getStartLocation ( v3 ); // invoke-virtual {v2, v3}, Lorg/codehaus/jackson/impl/JsonReadContext;->getStartLocation(Ljava/lang/Object;)Lorg/codehaus/jackson/JsonLocation;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 616 */
/* .local v0, "startDesc":Ljava/lang/String; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected close marker \'"; // const-string v2, "Unexpected close marker \'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* int-to-char v2, p1 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v2 = "\': expected \'"; // const-string v2, "\': expected \'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v2 = "\' (for "; // const-string v2, "\' (for "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v2 ).getTypeDesc ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/impl/JsonReadContext;->getTypeDesc()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " starting at "; // const-string v2, " starting at "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportError(Ljava/lang/String;)V
/* .line 617 */
return;
} // .end method
protected void _reportUnexpectedChar ( Integer p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "ch" # I */
/* .param p2, "comment" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 569 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected character ("; // const-string v2, "Unexpected character ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
org.codehaus.jackson.impl.JsonParserBase ._getCharDesc ( p1 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 570 */
/* .local v0, "msg":Ljava/lang/String; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 571 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ": "; // const-string v2, ": "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 573 */
} // :cond_0
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportError ( v0 ); // invoke-virtual {p0, v0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportError(Ljava/lang/String;)V
/* .line 574 */
return;
} // .end method
protected final void _throwInternal ( ) {
/* .locals 2 */
/* .prologue */
/* .line 651 */
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "Internal error: this code path should never get executed"; // const-string v1, "Internal error: this code path should never get executed"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
protected void _throwInvalidSpace ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "i" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 591 */
/* int-to-char v0, p1 */
/* .line 592 */
/* .local v0, "c":C */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Illegal character ("; // const-string v3, "Illegal character ("
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
org.codehaus.jackson.impl.JsonParserBase ._getCharDesc ( v0 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "): only regular white space (\\r, \\n, \\t) is allowed between tokens"; // const-string v3, "): only regular white space (\\r, \\n, \\t) is allowed between tokens"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 593 */
/* .local v1, "msg":Ljava/lang/String; */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportError(Ljava/lang/String;)V
/* .line 594 */
return;
} // .end method
protected void _throwUnquotedSpace ( Integer p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p1, "i" # I */
/* .param p2, "ctxtDesc" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 605 */
v2 = org.codehaus.jackson.JsonParser$Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
v2 = (( org.codehaus.jackson.impl.JsonParserBase ) p0 ).isEnabled ( v2 ); // invoke-virtual {p0, v2}, Lorg/codehaus/jackson/impl/JsonParserBase;->isEnabled(Lorg/codehaus/jackson/JsonParser$Feature;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* const/16 v2, 0x20 */
/* if-lt p1, v2, :cond_1 */
/* .line 606 */
} // :cond_0
/* int-to-char v0, p1 */
/* .line 607 */
/* .local v0, "c":C */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Illegal unquoted character ("; // const-string v3, "Illegal unquoted character ("
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
org.codehaus.jackson.impl.JsonParserBase ._getCharDesc ( v0 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "): has to be escaped using backslash to be included in "; // const-string v3, "): has to be escaped using backslash to be included in "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 608 */
/* .local v1, "msg":Ljava/lang/String; */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportError(Ljava/lang/String;)V
/* .line 610 */
} // .end local v0 # "c":C
} // .end local v1 # "msg":Ljava/lang/String;
} // :cond_1
return;
} // .end method
protected final void _wrapError ( java.lang.String p0, java.lang.Throwable p1 ) {
/* .locals 1 */
/* .param p1, "msg" # Ljava/lang/String; */
/* .param p2, "t" # Ljava/lang/Throwable; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 646 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._constructError ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/codehaus/jackson/impl/JsonParserBase;->_constructError(Ljava/lang/String;Ljava/lang/Throwable;)Lorg/codehaus/jackson/JsonParseException;
/* throw v0 */
} // .end method
public void close ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 307 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_closed:Z */
/* .line 309 */
try { // :try_start_0
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._closeInput ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_closeInput()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 313 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._releaseBuffers ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_releaseBuffers()V
/* .line 315 */
return;
/* .line 313 */
/* :catchall_0 */
/* move-exception v0 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._releaseBuffers ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_releaseBuffers()V
/* throw v0 */
} // .end method
public final getBinaryValue ( org.codehaus.jackson.Base64Variant p0 ) {
/* .locals 3 */
/* .param p1, "b64variant" # Lorg/codehaus/jackson/Base64Variant; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 479 */
v1 = this._currToken;
v2 = org.codehaus.jackson.JsonToken.VALUE_STRING;
/* if-eq v1, v2, :cond_0 */
/* .line 480 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Current token ("; // const-string v2, "Current token ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this._currToken;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = ") not VALUE_STRING, can not access as binary"; // const-string v2, ") not VALUE_STRING, can not access as binary"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportError(Ljava/lang/String;)V
/* .line 485 */
} // :cond_0
/* iget-boolean v1, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 487 */
try { // :try_start_0
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._decodeBase64 ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/impl/JsonParserBase;->_decodeBase64(Lorg/codehaus/jackson/Base64Variant;)[B
this._binaryValue = v1;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 494 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
/* .line 496 */
} // :cond_1
v1 = this._binaryValue;
/* .line 488 */
/* :catch_0 */
/* move-exception v0 */
/* .line 489 */
/* .local v0, "iae":Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to decode VALUE_STRING as base64 ("; // const-string v2, "Failed to decode VALUE_STRING as base64 ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "): "; // const-string v2, "): "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.IllegalArgumentException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._constructError ( v1 ); // invoke-virtual {p0, v1}, Lorg/codehaus/jackson/impl/JsonParserBase;->_constructError(Ljava/lang/String;)Lorg/codehaus/jackson/JsonParseException;
/* throw v1 */
} // .end method
public org.codehaus.jackson.JsonLocation getCurrentLocation ( ) {
/* .locals 8 */
/* .prologue */
/* .line 343 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_inputPtr:I */
/* iget v1, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_currInputRowStart:I */
/* sub-int/2addr v0, v1 */
/* add-int/lit8 v5, v0, 0x1 */
/* .line 344 */
/* .local v5, "col":I */
/* new-instance v0, Lorg/codehaus/jackson/JsonLocation; */
v1 = this._ioContext;
(( org.codehaus.jackson.io.IOContext ) v1 ).getSourceReference ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/io/IOContext;->getSourceReference()Ljava/lang/Object;
/* iget-wide v2, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_currInputProcessed:J */
/* iget v4, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_inputPtr:I */
/* int-to-long v6, v4 */
/* add-long/2addr v2, v6 */
/* const-wide/16 v6, 0x1 */
/* sub-long/2addr v2, v6 */
/* iget v4, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_currInputRow:I */
/* invoke-direct/range {v0 ..v5}, Lorg/codehaus/jackson/JsonLocation;-><init>(Ljava/lang/Object;JII)V */
} // .end method
public java.lang.String getCurrentName ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 302 */
v0 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v0 ).getCurrentName ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonReadContext;->getCurrentName()Ljava/lang/String;
} // .end method
public org.codehaus.jackson.JsonStreamContext getParsingContext ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 21 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 ).getParsingContext ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->getParsingContext()Lorg/codehaus/jackson/impl/JsonReadContext;
} // .end method
public org.codehaus.jackson.impl.JsonReadContext getParsingContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 321 */
v0 = this._parsingContext;
} // .end method
public java.lang.String getText ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 364 */
v0 = this._currToken;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 365 */
v0 = org.codehaus.jackson.impl.JsonParserBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
v1 = this._currToken;
v1 = (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
/* .line 380 */
v0 = this._currToken;
(( org.codehaus.jackson.JsonToken ) v0 ).asString ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/JsonToken;->asString()Ljava/lang/String;
/* .line 383 */
} // :goto_0
/* .line 367 */
/* :pswitch_0 */
v0 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v0 ).getCurrentName ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonReadContext;->getCurrentName()Ljava/lang/String;
/* .line 370 */
/* :pswitch_1 */
/* iget-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 371 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
/* .line 372 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._finishString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_finishString()V
/* .line 377 */
} // :cond_0
/* :pswitch_2 */
v0 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v0 ).contentsAsString ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsString()Ljava/lang/String;
/* .line 383 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 365 */
/* :pswitch_data_0 */
/* .packed-switch 0x5 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public getTextCharacters ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 389 */
v2 = this._currToken;
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 390 */
v2 = org.codehaus.jackson.impl.JsonParserBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
v3 = this._currToken;
v3 = (( org.codehaus.jackson.JsonToken ) v3 ).ordinal ( ); // invoke-virtual {v3}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
/* aget v2, v2, v3 */
/* packed-switch v2, :pswitch_data_0 */
/* .line 417 */
v2 = this._currToken;
(( org.codehaus.jackson.JsonToken ) v2 ).asCharArray ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/JsonToken;->asCharArray()[C
/* .line 420 */
} // :goto_0
/* .line 393 */
/* :pswitch_0 */
/* iget-boolean v2, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_nameCopied:Z */
/* if-nez v2, :cond_1 */
/* .line 394 */
v2 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v2 ).getCurrentName ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/impl/JsonReadContext;->getCurrentName()Ljava/lang/String;
/* .line 395 */
/* .local v0, "name":Ljava/lang/String; */
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* .line 396 */
/* .local v1, "nameLen":I */
v2 = this._nameCopyBuffer;
/* if-nez v2, :cond_2 */
/* .line 397 */
v2 = this._ioContext;
(( org.codehaus.jackson.io.IOContext ) v2 ).allocNameCopyBuffer ( v1 ); // invoke-virtual {v2, v1}, Lorg/codehaus/jackson/io/IOContext;->allocNameCopyBuffer(I)[C
this._nameCopyBuffer = v2;
/* .line 401 */
} // :cond_0
} // :goto_1
v2 = this._nameCopyBuffer;
(( java.lang.String ) v0 ).getChars ( v4, v1, v2, v4 ); // invoke-virtual {v0, v4, v1, v2, v4}, Ljava/lang/String;->getChars(II[CI)V
/* .line 402 */
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_nameCopied:Z */
/* .line 404 */
} // .end local v0 # "name":Ljava/lang/String;
} // .end local v1 # "nameLen":I
} // :cond_1
v2 = this._nameCopyBuffer;
/* .line 398 */
/* .restart local v0 # "name":Ljava/lang/String; */
/* .restart local v1 # "nameLen":I */
} // :cond_2
v2 = this._nameCopyBuffer;
/* array-length v2, v2 */
/* if-ge v2, v1, :cond_0 */
/* .line 399 */
/* new-array v2, v1, [C */
this._nameCopyBuffer = v2;
/* .line 407 */
} // .end local v0 # "name":Ljava/lang/String;
} // .end local v1 # "nameLen":I
/* :pswitch_1 */
/* iget-boolean v2, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 408 */
/* iput-boolean v4, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
/* .line 409 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._finishString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_finishString()V
/* .line 414 */
} // :cond_3
/* :pswitch_2 */
v2 = this._textBuffer;
(( org.codehaus.jackson.util.TextBuffer ) v2 ).getTextBuffer ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/util/TextBuffer;->getTextBuffer()[C
/* .line 420 */
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
/* .line 390 */
/* :pswitch_data_0 */
/* .packed-switch 0x5 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public Integer getTextLength ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 426 */
v1 = this._currToken;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 427 */
v1 = org.codehaus.jackson.impl.JsonParserBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
v2 = this._currToken;
v2 = (( org.codehaus.jackson.JsonToken ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_0 */
/* .line 442 */
v0 = this._currToken;
(( org.codehaus.jackson.JsonToken ) v0 ).asCharArray ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/JsonToken;->asCharArray()[C
/* array-length v0, v0 */
/* .line 445 */
} // :cond_0
} // :goto_0
/* .line 430 */
/* :pswitch_0 */
v0 = this._parsingContext;
(( org.codehaus.jackson.impl.JsonReadContext ) v0 ).getCurrentName ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/impl/JsonReadContext;->getCurrentName()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* .line 432 */
/* :pswitch_1 */
/* iget-boolean v1, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 433 */
/* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
/* .line 434 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._finishString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_finishString()V
/* .line 439 */
} // :cond_1
/* :pswitch_2 */
v0 = this._textBuffer;
v0 = (( org.codehaus.jackson.util.TextBuffer ) v0 ).size ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/util/TextBuffer;->size()I
/* .line 427 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x5 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public Integer getTextOffset ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 452 */
v1 = this._currToken;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 453 */
v1 = org.codehaus.jackson.impl.JsonParserBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
v2 = this._currToken;
v2 = (( org.codehaus.jackson.JsonToken ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_0 */
/* .line 467 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
/* .line 457 */
/* :pswitch_1 */
/* iget-boolean v1, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 458 */
/* iput-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenIncomplete:Z */
/* .line 459 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._finishString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_finishString()V
/* .line 464 */
} // :cond_1
/* :pswitch_2 */
v0 = this._textBuffer;
v0 = (( org.codehaus.jackson.util.TextBuffer ) v0 ).getTextOffset ( ); // invoke-virtual {v0}, Lorg/codehaus/jackson/util/TextBuffer;->getTextOffset()I
/* .line 453 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x5 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public final Long getTokenCharacterOffset ( ) {
/* .locals 2 */
/* .prologue */
/* .line 508 */
/* iget-wide v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenInputTotal:J */
/* return-wide v0 */
} // .end method
public final Integer getTokenColumnNr ( ) {
/* .locals 1 */
/* .prologue */
/* .line 510 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenInputCol:I */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public final Integer getTokenLineNr ( ) {
/* .locals 1 */
/* .prologue */
/* .line 509 */
/* iget v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_tokenInputRow:I */
} // .end method
public org.codehaus.jackson.JsonLocation getTokenLocation ( ) {
/* .locals 6 */
/* .prologue */
/* .line 331 */
/* new-instance v0, Lorg/codehaus/jackson/JsonLocation; */
v1 = this._ioContext;
(( org.codehaus.jackson.io.IOContext ) v1 ).getSourceReference ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/io/IOContext;->getSourceReference()Ljava/lang/Object;
(( org.codehaus.jackson.impl.JsonParserBase ) p0 ).getTokenCharacterOffset ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->getTokenCharacterOffset()J
/* move-result-wide v2 */
v4 = (( org.codehaus.jackson.impl.JsonParserBase ) p0 ).getTokenLineNr ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->getTokenLineNr()I
v5 = (( org.codehaus.jackson.impl.JsonParserBase ) p0 ).getTokenColumnNr ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->getTokenColumnNr()I
/* invoke-direct/range {v0 ..v5}, Lorg/codehaus/jackson/JsonLocation;-><init>(Ljava/lang/Object;JII)V */
} // .end method
public Boolean isClosed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 317 */
/* iget-boolean v0, p0, Lorg/codehaus/jackson/impl/JsonParserBase;->_closed:Z */
} // .end method
protected abstract Boolean loadMore ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
protected final void loadMoreGuaranteed ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 523 */
v0 = (( org.codehaus.jackson.impl.JsonParserBase ) p0 ).loadMore ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->loadMore()Z
/* if-nez v0, :cond_0 */
/* .line 524 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._reportInvalidEOF ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_reportInvalidEOF()V
/* .line 526 */
} // :cond_0
return;
} // .end method
public abstract org.codehaus.jackson.JsonToken nextToken ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
} // .end method
public org.codehaus.jackson.JsonParser skipChildren ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/codehaus/jackson/JsonParseException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 257 */
v2 = this._currToken;
v3 = org.codehaus.jackson.JsonToken.START_OBJECT;
/* if-eq v2, v3, :cond_0 */
v2 = this._currToken;
v3 = org.codehaus.jackson.JsonToken.START_ARRAY;
/* if-eq v2, v3, :cond_0 */
/* .line 284 */
} // :goto_0
/* .line 261 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 267 */
/* .local v0, "open":I */
} // :cond_1
} // :goto_1
(( org.codehaus.jackson.impl.JsonParserBase ) p0 ).nextToken ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->nextToken()Lorg/codehaus/jackson/JsonToken;
/* .line 268 */
/* .local v1, "t":Lorg/codehaus/jackson/JsonToken; */
/* if-nez v1, :cond_2 */
/* .line 269 */
(( org.codehaus.jackson.impl.JsonParserBase ) p0 )._handleEOF ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/impl/JsonParserBase;->_handleEOF()V
/* .line 276 */
} // :cond_2
v2 = org.codehaus.jackson.impl.JsonParserBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
v3 = (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
/* aget v2, v2, v3 */
/* packed-switch v2, :pswitch_data_0 */
/* .line 279 */
/* :pswitch_0 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 280 */
/* .line 283 */
/* :pswitch_1 */
/* add-int/lit8 v0, v0, -0x1 */
/* if-nez v0, :cond_1 */
/* .line 276 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
