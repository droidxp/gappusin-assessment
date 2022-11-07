public class inal {
	 /* .source "TextBuffer.java" */
	 /* # static fields */
	 static final Integer MAX_SEGMENT_LEN;
	 static final NO_CHARS;
	 /* # instance fields */
	 private final org.codehaus.jackson.util.BufferRecycler _allocator;
	 private _currentSegment;
	 private Integer _currentSize;
	 private Boolean _hasSegments;
	 private _inputBuffer;
	 private Integer _inputLen;
	 private Integer _inputStart;
	 private _resultArray;
	 private java.lang.String _resultString;
	 private Integer _segmentSize;
	 private java.util.ArrayList _segments;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<[C>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static inal ( ) {
/* .locals 1 */
/* .prologue */
/* .line 26 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [C */
return;
} // .end method
public inal ( ) {
/* .locals 1 */
/* .param p1, "allocator" # Lorg/codehaus/jackson/util/BufferRecycler; */
/* .prologue */
/* .line 114 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 77 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_hasSegments:Z */
/* .line 115 */
this._allocator = p1;
/* .line 116 */
return;
} // .end method
private final _charArray ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "len" # I */
/* .prologue */
/* .line 632 */
/* new-array v0, p1, [C */
} // .end method
private buildResultArray ( ) {
/* .locals 11 */
/* .prologue */
int v8 = 1; // const/4 v8, 0x1
int v10 = 0; // const/4 v10, 0x0
/* .line 598 */
v7 = this._resultString;
if ( v7 != null) { // if-eqz v7, :cond_0
	 /* .line 599 */
	 v7 = this._resultString;
	 (( java.lang.String ) v7 ).toCharArray ( ); // invoke-virtual {v7}, Ljava/lang/String;->toCharArray()[C
	 /* .line 628 */
} // :goto_0
/* .line 604 */
} // :cond_0
/* iget v7, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v7, :cond_2 */
/* .line 605 */
/* iget v7, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* if-ge v7, v8, :cond_1 */
/* .line 606 */
v5 = org.codehaus.jackson.util.TextBuffer.NO_CHARS;
/* .line 608 */
} // :cond_1
/* iget v7, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* invoke-direct {p0, v7}, Lorg/codehaus/jackson/util/TextBuffer;->_charArray(I)[C */
/* .line 609 */
/* .local v5, "result":[C */
v7 = this._inputBuffer;
/* iget v8, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* iget v9, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
java.lang.System .arraycopy ( v7,v8,v5,v10,v9 );
/* .line 612 */
} // .end local v5 # "result":[C
} // :cond_2
v6 = (( org.codehaus.jackson.util.TextBuffer ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/util/TextBuffer;->size()I
/* .line 613 */
/* .local v6, "size":I */
/* if-ge v6, v8, :cond_3 */
/* .line 614 */
v5 = org.codehaus.jackson.util.TextBuffer.NO_CHARS;
/* .line 616 */
} // :cond_3
int v4 = 0; // const/4 v4, 0x0
/* .line 617 */
/* .local v4, "offset":I */
/* invoke-direct {p0, v6}, Lorg/codehaus/jackson/util/TextBuffer;->_charArray(I)[C */
/* .line 618 */
/* .restart local v5 # "result":[C */
v7 = this._segments;
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 619 */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
v7 = this._segments;
v3 = (( java.util.ArrayList ) v7 ).size ( ); // invoke-virtual {v7}, Ljava/util/ArrayList;->size()I
/* .local v3, "len":I */
} // :goto_1
/* if-ge v2, v3, :cond_4 */
/* .line 620 */
v7 = this._segments;
(( java.util.ArrayList ) v7 ).get ( v2 ); // invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v7, [C */
/* move-object v0, v7 */
/* check-cast v0, [C */
/* .line 621 */
/* .local v0, "curr":[C */
/* array-length v1, v0 */
/* .line 622 */
/* .local v1, "currLen":I */
java.lang.System .arraycopy ( v0,v10,v5,v4,v1 );
/* .line 623 */
/* add-int/2addr v4, v1 */
/* .line 619 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 626 */
} // .end local v0 # "curr":[C
} // .end local v1 # "currLen":I
} // .end local v2 # "i":I
} // .end local v3 # "len":I
} // :cond_4
v7 = this._currentSegment;
/* iget v8, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
java.lang.System .arraycopy ( v7,v10,v5,v4,v8 );
} // .end method
private final void clearSegments ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 212 */
/* iput-boolean v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_hasSegments:Z */
/* .line 220 */
v0 = this._segments;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 221 */
/* iput v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* iput v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 222 */
return;
} // .end method
private void expand ( Integer p0 ) {
/* .locals 5 */
/* .param p1, "minNewSegmentSize" # I */
/* .prologue */
/* .line 578 */
v3 = this._segments;
/* if-nez v3, :cond_0 */
/* .line 579 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
this._segments = v3;
/* .line 581 */
} // :cond_0
v0 = this._currentSegment;
/* .line 582 */
/* .local v0, "curr":[C */
int v3 = 1; // const/4 v3, 0x1
/* iput-boolean v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_hasSegments:Z */
/* .line 583 */
v3 = this._segments;
(( java.util.ArrayList ) v3 ).add ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 584 */
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* array-length v4, v0 */
/* add-int/2addr v3, v4 */
/* iput v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* .line 585 */
/* array-length v1, v0 */
/* .line 587 */
/* .local v1, "oldLen":I */
/* shr-int/lit8 v2, v1, 0x1 */
/* .line 588 */
/* .local v2, "sizeAddition":I */
/* if-ge v2, p1, :cond_1 */
/* .line 589 */
/* move v2, p1 */
/* .line 591 */
} // :cond_1
/* const/high16 v3, 0x40000 */
/* add-int v4, v1, v2 */
v3 = java.lang.Math .min ( v3,v4 );
/* invoke-direct {p0, v3}, Lorg/codehaus/jackson/util/TextBuffer;->_charArray(I)[C */
/* .line 592 */
int v3 = 0; // const/4 v3, 0x0
/* iput v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 593 */
this._currentSegment = v0;
/* .line 594 */
return;
} // .end method
private final findBuffer ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "needed" # I */
/* .prologue */
/* .line 207 */
v0 = this._allocator;
v1 = org.codehaus.jackson.util.BufferRecycler$CharBufferType.TEXT_BUFFER;
(( org.codehaus.jackson.util.BufferRecycler ) v0 ).allocCharBuffer ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lorg/codehaus/jackson/util/BufferRecycler;->allocCharBuffer(Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType;I)[C
} // .end method
private void unshare ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "needExtra" # I */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 552 */
/* iget v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* .line 553 */
/* .local v2, "sharedLen":I */
/* iput v5, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* .line 554 */
v0 = this._inputBuffer;
/* .line 555 */
/* .local v0, "inputBuf":[C */
int v4 = 0; // const/4 v4, 0x0
this._inputBuffer = v4;
/* .line 556 */
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* .line 557 */
/* .local v3, "start":I */
int v4 = -1; // const/4 v4, -0x1
/* iput v4, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* .line 560 */
/* add-int v1, v2, p1 */
/* .line 561 */
/* .local v1, "needed":I */
v4 = this._currentSegment;
if ( v4 != null) { // if-eqz v4, :cond_0
v4 = this._currentSegment;
/* array-length v4, v4 */
/* if-le v1, v4, :cond_1 */
/* .line 562 */
} // :cond_0
/* invoke-direct {p0, v1}, Lorg/codehaus/jackson/util/TextBuffer;->findBuffer(I)[C */
this._currentSegment = v4;
/* .line 564 */
} // :cond_1
/* if-lez v2, :cond_2 */
/* .line 565 */
v4 = this._currentSegment;
java.lang.System .arraycopy ( v0,v3,v4,v5,v2 );
/* .line 567 */
} // :cond_2
/* iput v5, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* .line 568 */
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 569 */
return;
} // .end method
/* # virtual methods */
public void append ( Object p0 ) {
/* .locals 3 */
/* .param p1, "c" # C */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 369 */
/* iget v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v1, :cond_0 */
/* .line 370 */
/* const/16 v1, 0x10 */
/* invoke-direct {p0, v1}, Lorg/codehaus/jackson/util/TextBuffer;->unshare(I)V */
/* .line 372 */
} // :cond_0
this._resultString = v2;
/* .line 373 */
this._resultArray = v2;
/* .line 375 */
v0 = this._currentSegment;
/* .line 376 */
/* .local v0, "curr":[C */
/* iget v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_1 */
/* .line 377 */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v1}, Lorg/codehaus/jackson/util/TextBuffer;->expand(I)V */
/* .line 378 */
v0 = this._currentSegment;
/* .line 380 */
} // :cond_1
/* iget v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* aput-char p1, v0, v1 */
/* .line 381 */
return;
} // .end method
public void append ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 5 */
/* .param p1, "str" # Ljava/lang/String; */
/* .param p2, "offset" # I */
/* .param p3, "len" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 417 */
/* iget v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v2, :cond_0 */
/* .line 418 */
/* invoke-direct {p0, p3}, Lorg/codehaus/jackson/util/TextBuffer;->unshare(I)V */
/* .line 420 */
} // :cond_0
this._resultString = v3;
/* .line 421 */
this._resultArray = v3;
/* .line 424 */
v0 = this._currentSegment;
/* .line 425 */
/* .local v0, "curr":[C */
/* array-length v2, v0 */
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* sub-int v1, v2, v3 */
/* .line 426 */
/* .local v1, "max":I */
/* if-lt v1, p3, :cond_1 */
/* .line 427 */
/* add-int v2, p2, p3 */
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
(( java.lang.String ) p1 ).getChars ( p2, v2, v0, v3 ); // invoke-virtual {p1, p2, v2, v0, v3}, Ljava/lang/String;->getChars(II[CI)V
/* .line 428 */
/* iget v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* add-int/2addr v2, p3 */
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 443 */
} // :goto_0
return;
/* .line 431 */
} // :cond_1
/* if-lez v1, :cond_2 */
/* .line 432 */
/* add-int v2, p2, v1 */
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
(( java.lang.String ) p1 ).getChars ( p2, v2, v0, v3 ); // invoke-virtual {p1, p2, v2, v0, v3}, Ljava/lang/String;->getChars(II[CI)V
/* .line 433 */
/* sub-int/2addr p3, v1 */
/* .line 434 */
/* add-int/2addr p2, v1 */
/* .line 439 */
} // :cond_2
/* invoke-direct {p0, p3}, Lorg/codehaus/jackson/util/TextBuffer;->expand(I)V */
/* .line 440 */
/* add-int v2, p2, p3 */
v3 = this._currentSegment;
int v4 = 0; // const/4 v4, 0x0
(( java.lang.String ) p1 ).getChars ( p2, v2, v3, v4 ); // invoke-virtual {p1, p2, v2, v3, v4}, Ljava/lang/String;->getChars(II[CI)V
/* .line 441 */
/* iput p3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
} // .end method
public void append ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 4 */
/* .param p1, "c" # [C */
/* .param p2, "start" # I */
/* .param p3, "len" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 386 */
/* iget v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v2, :cond_0 */
/* .line 387 */
/* invoke-direct {p0, p3}, Lorg/codehaus/jackson/util/TextBuffer;->unshare(I)V */
/* .line 389 */
} // :cond_0
this._resultString = v3;
/* .line 390 */
this._resultArray = v3;
/* .line 393 */
v0 = this._currentSegment;
/* .line 394 */
/* .local v0, "curr":[C */
/* array-length v2, v0 */
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* sub-int v1, v2, v3 */
/* .line 396 */
/* .local v1, "max":I */
/* if-lt v1, p3, :cond_1 */
/* .line 397 */
/* iget v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
java.lang.System .arraycopy ( p1,p2,v0,v2,p3 );
/* .line 398 */
/* iget v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* add-int/2addr v2, p3 */
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 412 */
} // :goto_0
return;
/* .line 401 */
} // :cond_1
/* if-lez v1, :cond_2 */
/* .line 402 */
/* iget v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
java.lang.System .arraycopy ( p1,p2,v0,v2,v1 );
/* .line 403 */
/* add-int/2addr p2, v1 */
/* .line 404 */
/* sub-int/2addr p3, v1 */
/* .line 408 */
} // :cond_2
/* invoke-direct {p0, p3}, Lorg/codehaus/jackson/util/TextBuffer;->expand(I)V */
/* .line 409 */
v2 = this._currentSegment;
int v3 = 0; // const/4 v3, 0x0
java.lang.System .arraycopy ( p1,p2,v2,v3,p3 );
/* .line 410 */
/* iput p3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
} // .end method
public contentsAsArray ( ) {
/* .locals 1 */
/* .prologue */
/* .line 311 */
v0 = this._resultArray;
/* .line 312 */
/* .local v0, "result":[C */
/* if-nez v0, :cond_0 */
/* .line 313 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/util/TextBuffer;->buildResultArray()[C */
this._resultArray = v0;
/* .line 315 */
} // :cond_0
} // .end method
public java.math.BigDecimal contentsAsDecimal ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NumberFormatException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 326 */
v0 = this._resultArray;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 327 */
/* new-instance v0, Ljava/math/BigDecimal; */
v1 = this._resultArray;
/* invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>([C)V */
/* .line 338 */
} // :goto_0
/* .line 330 */
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v0, :cond_1 */
/* .line 331 */
/* new-instance v0, Ljava/math/BigDecimal; */
v1 = this._inputBuffer;
/* iget v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* invoke-direct {v0, v1, v2, v3}, Ljava/math/BigDecimal;-><init>([CII)V */
/* .line 334 */
} // :cond_1
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* if-nez v0, :cond_2 */
/* .line 335 */
/* new-instance v0, Ljava/math/BigDecimal; */
v1 = this._currentSegment;
int v2 = 0; // const/4 v2, 0x0
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* invoke-direct {v0, v1, v2, v3}, Ljava/math/BigDecimal;-><init>([CII)V */
/* .line 338 */
} // :cond_2
/* new-instance v0, Ljava/math/BigDecimal; */
(( org.codehaus.jackson.util.TextBuffer ) p0 ).contentsAsArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsArray()[C
/* invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>([C)V */
} // .end method
public Double contentsAsDouble ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NumberFormatException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 348 */
(( org.codehaus.jackson.util.TextBuffer ) p0 ).contentsAsString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsString()Ljava/lang/String;
java.lang.Double .parseDouble ( v0 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public java.lang.String contentsAsString ( ) {
/* .locals 10 */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
/* .line 272 */
v6 = this._resultString;
/* if-nez v6, :cond_0 */
/* .line 274 */
v6 = this._resultArray;
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 275 */
/* new-instance v6, Ljava/lang/String; */
v7 = this._resultArray;
/* invoke-direct {v6, v7}, Ljava/lang/String;-><init>([C)V */
this._resultString = v6;
/* .line 306 */
} // :cond_0
} // :goto_0
v6 = this._resultString;
} // :goto_1
/* .line 278 */
} // :cond_1
/* iget v6, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v6, :cond_3 */
/* .line 279 */
/* iget v6, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
int v7 = 1; // const/4 v7, 0x1
/* if-ge v6, v7, :cond_2 */
/* .line 280 */
final String v6 = ""; // const-string v6, ""
this._resultString = v6;
/* .line 282 */
} // :cond_2
/* new-instance v6, Ljava/lang/String; */
v7 = this._inputBuffer;
/* iget v8, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* iget v9, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* invoke-direct {v6, v7, v8, v9}, Ljava/lang/String;-><init>([CII)V */
this._resultString = v6;
/* .line 285 */
} // :cond_3
/* iget v5, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* .line 286 */
/* .local v5, "segLen":I */
/* iget v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 288 */
/* .local v1, "currLen":I */
/* if-nez v5, :cond_5 */
/* .line 289 */
/* if-nez v1, :cond_4 */
final String v6 = ""; // const-string v6, ""
} // :goto_2
this._resultString = v6;
} // :cond_4
/* new-instance v6, Ljava/lang/String; */
v7 = this._currentSegment;
/* invoke-direct {v6, v7, v8, v1}, Ljava/lang/String;-><init>([CII)V */
/* .line 291 */
} // :cond_5
/* new-instance v4, Ljava/lang/StringBuilder; */
/* add-int v6, v5, v1 */
/* invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 293 */
/* .local v4, "sb":Ljava/lang/StringBuilder; */
v6 = this._segments;
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 294 */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
v6 = this._segments;
v3 = (( java.util.ArrayList ) v6 ).size ( ); // invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
/* .local v3, "len":I */
} // :goto_3
/* if-ge v2, v3, :cond_6 */
/* .line 295 */
v6 = this._segments;
(( java.util.ArrayList ) v6 ).get ( v2 ); // invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, [C */
/* .line 296 */
/* .local v0, "curr":[C */
/* array-length v6, v0 */
(( java.lang.StringBuilder ) v4 ).append ( v0, v8, v6 ); // invoke-virtual {v4, v0, v8, v6}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 294 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 300 */
} // .end local v0 # "curr":[C
} // .end local v2 # "i":I
} // .end local v3 # "len":I
} // :cond_6
v6 = this._currentSegment;
/* iget v7, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
(( java.lang.StringBuilder ) v4 ).append ( v6, v8, v7 ); // invoke-virtual {v4, v6, v8, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 301 */
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this._resultString = v6;
} // .end method
public emptyAndGetCurrentSegment ( ) {
/* .locals 2 */
/* .prologue */
/* .line 473 */
(( org.codehaus.jackson.util.TextBuffer ) p0 ).resetWithEmpty ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/util/TextBuffer;->resetWithEmpty()V
/* .line 474 */
v0 = this._currentSegment;
/* .line 475 */
/* .local v0, "curr":[C */
/* if-nez v0, :cond_0 */
/* .line 476 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0, v1}, Lorg/codehaus/jackson/util/TextBuffer;->findBuffer(I)[C */
this._currentSegment = v0;
/* .line 478 */
} // :cond_0
} // .end method
public void ensureNotShared ( ) {
/* .locals 1 */
/* .prologue */
/* .line 362 */
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v0, :cond_0 */
/* .line 363 */
/* const/16 v0, 0x10 */
/* invoke-direct {p0, v0}, Lorg/codehaus/jackson/util/TextBuffer;->unshare(I)V */
/* .line 365 */
} // :cond_0
return;
} // .end method
public expandCurrentSegment ( ) {
/* .locals 6 */
/* .prologue */
/* const/high16 v5, 0x40000 */
int v4 = 0; // const/4 v4, 0x0
/* .line 513 */
v0 = this._currentSegment;
/* .line 515 */
/* .local v0, "curr":[C */
/* array-length v1, v0 */
/* .line 517 */
/* .local v1, "len":I */
/* if-ne v1, v5, :cond_0 */
/* const v2, 0x40001 */
/* .line 519 */
/* .local v2, "newLen":I */
} // :goto_0
/* invoke-direct {p0, v2}, Lorg/codehaus/jackson/util/TextBuffer;->_charArray(I)[C */
this._currentSegment = v3;
/* .line 520 */
v3 = this._currentSegment;
java.lang.System .arraycopy ( v0,v4,v3,v4,v1 );
/* .line 521 */
v3 = this._currentSegment;
/* .line 517 */
} // .end local v2 # "newLen":I
} // :cond_0
/* shr-int/lit8 v3, v1, 0x1 */
/* add-int/2addr v3, v1 */
v2 = java.lang.Math .min ( v5,v3 );
} // .end method
public finishCurrentSegment ( ) {
/* .locals 5 */
/* .prologue */
/* .line 491 */
v3 = this._segments;
/* if-nez v3, :cond_0 */
/* .line 492 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
this._segments = v3;
/* .line 494 */
} // :cond_0
int v3 = 1; // const/4 v3, 0x1
/* iput-boolean v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_hasSegments:Z */
/* .line 495 */
v3 = this._segments;
v4 = this._currentSegment;
(( java.util.ArrayList ) v3 ).add ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 496 */
v3 = this._currentSegment;
/* array-length v2, v3 */
/* .line 497 */
/* .local v2, "oldLen":I */
/* iget v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* add-int/2addr v3, v2 */
/* iput v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* .line 499 */
/* shr-int/lit8 v3, v2, 0x1 */
/* add-int/2addr v3, v2 */
/* const/high16 v4, 0x40000 */
v1 = java.lang.Math .min ( v3,v4 );
/* .line 500 */
/* .local v1, "newLen":I */
/* invoke-direct {p0, v1}, Lorg/codehaus/jackson/util/TextBuffer;->_charArray(I)[C */
/* .line 501 */
/* .local v0, "curr":[C */
int v3 = 0; // const/4 v3, 0x0
/* iput v3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 502 */
this._currentSegment = v0;
/* .line 503 */
} // .end method
public getCurrentSegment ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
/* .line 457 */
/* iget v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v1, :cond_1 */
/* .line 458 */
/* invoke-direct {p0, v3}, Lorg/codehaus/jackson/util/TextBuffer;->unshare(I)V */
/* .line 468 */
} // :cond_0
} // :goto_0
v1 = this._currentSegment;
/* .line 460 */
} // :cond_1
v0 = this._currentSegment;
/* .line 461 */
/* .local v0, "curr":[C */
/* if-nez v0, :cond_2 */
/* .line 462 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0, v1}, Lorg/codehaus/jackson/util/TextBuffer;->findBuffer(I)[C */
this._currentSegment = v1;
/* .line 463 */
} // :cond_2
/* iget v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 465 */
/* invoke-direct {p0, v3}, Lorg/codehaus/jackson/util/TextBuffer;->expand(I)V */
} // .end method
public Integer getCurrentSegmentSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 482 */
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
} // .end method
public getTextBuffer ( ) {
/* .locals 1 */
/* .prologue */
/* .line 253 */
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v0, :cond_0 */
/* .line 254 */
v0 = this._inputBuffer;
/* .line 261 */
} // :goto_0
/* .line 257 */
} // :cond_0
/* iget-boolean v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_hasSegments:Z */
/* if-nez v0, :cond_1 */
/* .line 258 */
v0 = this._currentSegment;
/* .line 261 */
} // :cond_1
(( org.codehaus.jackson.util.TextBuffer ) p0 ).contentsAsArray ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsArray()[C
} // .end method
public Integer getTextOffset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 247 */
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v0, :cond_0 */
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void releaseBuffers ( ) {
/* .locals 3 */
/* .prologue */
/* .line 129 */
v1 = this._allocator;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this._currentSegment;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 131 */
(( org.codehaus.jackson.util.TextBuffer ) p0 ).resetWithEmpty ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/util/TextBuffer;->resetWithEmpty()V
/* .line 133 */
v0 = this._currentSegment;
/* .line 134 */
/* .local v0, "buf":[C */
int v1 = 0; // const/4 v1, 0x0
this._currentSegment = v1;
/* .line 135 */
v1 = this._allocator;
v2 = org.codehaus.jackson.util.BufferRecycler$CharBufferType.TEXT_BUFFER;
(( org.codehaus.jackson.util.BufferRecycler ) v1 ).releaseCharBuffer ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lorg/codehaus/jackson/util/BufferRecycler;->releaseCharBuffer(Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType;[C)V
/* .line 137 */
} // .end local v0 # "buf":[C
} // :cond_0
return;
} // .end method
public void resetWithCopy ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "buf" # [C */
/* .param p2, "start" # I */
/* .param p3, "len" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 184 */
this._inputBuffer = v1;
/* .line 185 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* .line 186 */
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* .line 188 */
this._resultString = v1;
/* .line 189 */
this._resultArray = v1;
/* .line 192 */
/* iget-boolean v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_hasSegments:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 193 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/util/TextBuffer;->clearSegments()V */
/* .line 197 */
} // :cond_0
} // :goto_0
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 198 */
(( org.codehaus.jackson.util.TextBuffer ) p0 ).append ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lorg/codehaus/jackson/util/TextBuffer;->append([CII)V
/* .line 199 */
return;
/* .line 194 */
} // :cond_1
v0 = this._currentSegment;
/* if-nez v0, :cond_0 */
/* .line 195 */
/* invoke-direct {p0, p3}, Lorg/codehaus/jackson/util/TextBuffer;->findBuffer(I)[C */
this._currentSegment = v0;
} // .end method
public void resetWithEmpty ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 145 */
this._inputBuffer = v1;
/* .line 146 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* .line 147 */
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* .line 149 */
this._resultString = v1;
/* .line 150 */
this._resultArray = v1;
/* .line 153 */
/* iget-boolean v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_hasSegments:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 154 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/util/TextBuffer;->clearSegments()V */
/* .line 156 */
} // :cond_0
/* iput v2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 157 */
return;
} // .end method
public void resetWithShared ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "buf" # [C */
/* .param p2, "start" # I */
/* .param p3, "len" # I */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 168 */
this._resultString = v0;
/* .line 169 */
this._resultArray = v0;
/* .line 172 */
this._inputBuffer = p1;
/* .line 173 */
/* iput p2, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* .line 174 */
/* iput p3, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* .line 177 */
/* iget-boolean v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_hasSegments:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 178 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/util/TextBuffer;->clearSegments()V */
/* .line 180 */
} // :cond_0
return;
} // .end method
public void setCurrentLength ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "len" # I */
/* .prologue */
/* .line 486 */
/* iput p1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* .line 487 */
return;
} // .end method
public Integer size ( ) {
/* .locals 2 */
/* .prologue */
/* .line 234 */
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputStart:I */
/* if-ltz v0, :cond_0 */
/* .line 235 */
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_inputLen:I */
/* .line 238 */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lorg/codehaus/jackson/util/TextBuffer;->_segmentSize:I */
/* iget v1, p0, Lorg/codehaus/jackson/util/TextBuffer;->_currentSize:I */
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .prologue */
/* .line 537 */
(( org.codehaus.jackson.util.TextBuffer ) p0 ).contentsAsString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/util/TextBuffer;->contentsAsString()Ljava/lang/String;
} // .end method
