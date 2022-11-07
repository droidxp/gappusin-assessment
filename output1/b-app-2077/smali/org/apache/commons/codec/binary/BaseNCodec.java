public abstract class org.apache.commons.codec.binary.BaseNCodec implements org.apache.commons.codec.BinaryEncoder implements org.apache.commons.codec.BinaryDecoder {
	 /* .source "BaseNCodec.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer DEFAULT_BUFFER_RESIZE_FACTOR;
private static final Integer DEFAULT_BUFFER_SIZE;
static final Integer EOF;
protected static final Integer MASK_8BITS;
public static final Integer MIME_CHUNK_SIZE;
protected static final Object PAD_DEFAULT;
public static final Integer PEM_CHUNK_SIZE;
/* # instance fields */
protected final Object PAD;
private final Integer chunkSeparatorLength;
private final Integer encodedBlockSize;
protected final Integer lineLength;
private final Integer unencodedBlockSize;
/* # direct methods */
protected org.apache.commons.codec.binary.BaseNCodec ( ) {
	 /* .locals 3 */
	 /* .param p1, "unencodedBlockSize" # I */
	 /* .param p2, "encodedBlockSize" # I */
	 /* .param p3, "lineLength" # I */
	 /* .param p4, "chunkSeparatorLength" # I */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 185 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 156 */
	 /* const/16 v2, 0x3d */
	 /* iput-byte v2, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->PAD:B */
	 /* .line 186 */
	 /* iput p1, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->unencodedBlockSize:I */
	 /* .line 187 */
	 /* iput p2, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->encodedBlockSize:I */
	 /* .line 188 */
	 /* if-lez p3, :cond_1 */
	 /* if-lez p4, :cond_1 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 189 */
	 /* .local v0, "useChunking":Z */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* div-int v1, p3, p2 */
	 /* mul-int/2addr v1, p2 */
} // :cond_0
/* iput v1, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->lineLength:I */
/* .line 190 */
/* iput p4, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->chunkSeparatorLength:I */
/* .line 191 */
return;
} // .end local v0 # "useChunking":Z
} // :cond_1
/* move v0, v1 */
/* .line 188 */
} // .end method
protected static Boolean isWhiteSpace ( Object p0 ) {
/* .locals 1 */
/* .param p0, "byteToCheck" # B */
/* .prologue */
/* .line 289 */
/* sparse-switch p0, :sswitch_data_0 */
/* .line 296 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 294 */
/* :sswitch_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 289 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x9 -> :sswitch_0 */
/* 0xa -> :sswitch_0 */
/* 0xd -> :sswitch_0 */
/* 0x20 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
private resizeBuffer ( org.apache.commons.codec.binary.BaseNCodec$Context p0 ) {
/* .locals 4 */
/* .param p1, "context" # Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 227 */
v1 = this.buffer;
/* if-nez v1, :cond_0 */
/* .line 228 */
v1 = (( org.apache.commons.codec.binary.BaseNCodec ) p0 ).getDefaultBufferSize ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/binary/BaseNCodec;->getDefaultBufferSize()I
/* new-array v1, v1, [B */
this.buffer = v1;
/* .line 229 */
/* iput v3, p1, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* .line 230 */
/* iput v3, p1, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->readPos:I */
/* .line 236 */
} // :goto_0
v1 = this.buffer;
/* .line 232 */
} // :cond_0
v1 = this.buffer;
/* array-length v1, v1 */
/* mul-int/lit8 v1, v1, 0x2 */
/* new-array v0, v1, [B */
/* .line 233 */
/* .local v0, "b":[B */
v1 = this.buffer;
v2 = this.buffer;
/* array-length v2, v2 */
java.lang.System .arraycopy ( v1,v3,v0,v3,v2 );
/* .line 234 */
this.buffer = v0;
} // .end method
/* # virtual methods */
Integer available ( org.apache.commons.codec.binary.BaseNCodec$Context p0 ) {
/* .locals 2 */
/* .param p1, "context" # Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* .prologue */
/* .line 210 */
v0 = this.buffer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p1, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* iget v1, p1, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->readPos:I */
/* sub-int/2addr v0, v1 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected Boolean containsAlphabetOrPad ( Object[] p0 ) {
/* .locals 6 */
/* .param p1, "arrayOctet" # [B */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 473 */
/* if-nez p1, :cond_1 */
/* .line 481 */
} // :cond_0
} // :goto_0
/* .line 476 */
} // :cond_1
/* move-object v0, p1 */
/* .local v0, "arr$":[B */
/* array-length v3, v0 */
/* .local v3, "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i$":I */
} // :goto_1
/* if-ge v2, v3, :cond_0 */
/* aget-byte v1, v0, v2 */
/* .line 477 */
/* .local v1, "element":B */
/* const/16 v5, 0x3d */
/* if-eq v5, v1, :cond_2 */
v5 = (( org.apache.commons.codec.binary.BaseNCodec ) p0 ).isInAlphabet ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;->isInAlphabet(B)Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 478 */
} // :cond_2
int v4 = 1; // const/4 v4, 0x1
/* .line 476 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public java.lang.Object decode ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "obj" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/DecoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 354 */
/* instance-of v0, p1, [B */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 355 */
/* check-cast p1, [B */
} // .end local p1 # "obj":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/BaseNCodec;->decode([B)[B
/* .line 357 */
} // :goto_0
/* .line 356 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_0
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 357 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).decode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/BaseNCodec;->decode(Ljava/lang/String;)[B
/* .line 359 */
/* .restart local p1 # "obj":Ljava/lang/Object; */
} // :cond_1
/* new-instance v0, Lorg/apache/commons/codec/DecoderException; */
final String v1 = "Parameter supplied to Base-N decode is not a byte[] or a String"; // const-string v1, "Parameter supplied to Base-N decode is not a byte[] or a String"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/DecoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
abstract void decode ( Object[] p0, Integer p1, Integer p2, org.apache.commons.codec.binary.BaseNCodec$Context p3 ) {
} // .end method
public decode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "pArray" # Ljava/lang/String; */
/* .prologue */
/* .line 371 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p1 );
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).decode ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/commons/codec/binary/BaseNCodec;->decode([B)[B
} // .end method
public decode ( Object[] p0 ) {
/* .locals 4 */
/* .param p1, "pArray" # [B */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 383 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v2, p1 */
/* if-nez v2, :cond_1 */
} // :cond_0
/* move-object v1, p1 */
/* .line 391 */
} // :goto_0
/* .line 386 */
} // :cond_1
/* new-instance v0, Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* invoke-direct {v0}, Lorg/apache/commons/codec/binary/BaseNCodec$Context;-><init>()V */
/* .line 387 */
/* .local v0, "context":Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* array-length v2, p1 */
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).decode ( p1, v3, v2, v0 ); // invoke-virtual {p0, p1, v3, v2, v0}, Lorg/apache/commons/codec/binary/BaseNCodec;->decode([BIILorg/apache/commons/codec/binary/BaseNCodec$Context;)V
/* .line 388 */
int v2 = -1; // const/4 v2, -0x1
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).decode ( p1, v3, v2, v0 ); // invoke-virtual {p0, p1, v3, v2, v0}, Lorg/apache/commons/codec/binary/BaseNCodec;->decode([BIILorg/apache/commons/codec/binary/BaseNCodec$Context;)V
/* .line 389 */
/* iget v2, v0, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* new-array v1, v2, [B */
/* .line 390 */
/* .local v1, "result":[B */
/* array-length v2, v1 */
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).readResults ( v1, v3, v2, v0 ); // invoke-virtual {p0, v1, v3, v2, v0}, Lorg/apache/commons/codec/binary/BaseNCodec;->readResults([BIILorg/apache/commons/codec/binary/BaseNCodec$Context;)I
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "obj" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 312 */
/* instance-of v0, p1, [B */
/* if-nez v0, :cond_0 */
/* .line 313 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "Parameter supplied to Base-N encode is not a byte[]"; // const-string v1, "Parameter supplied to Base-N encode is not a byte[]"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 315 */
} // :cond_0
/* check-cast p1, [B */
} // .end local p1 # "obj":Ljava/lang/Object;
/* check-cast p1, [B */
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/BaseNCodec;->encode([B)[B
} // .end method
abstract void encode ( Object[] p0, Integer p1, Integer p2, org.apache.commons.codec.binary.BaseNCodec$Context p3 ) {
} // .end method
public encode ( Object[] p0 ) {
/* .locals 5 */
/* .param p1, "pArray" # [B */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 403 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v2, p1 */
/* if-nez v2, :cond_1 */
} // :cond_0
/* move-object v0, p1 */
/* .line 411 */
} // :goto_0
/* .line 406 */
} // :cond_1
/* new-instance v1, Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* invoke-direct {v1}, Lorg/apache/commons/codec/binary/BaseNCodec$Context;-><init>()V */
/* .line 407 */
/* .local v1, "context":Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* array-length v2, p1 */
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).encode ( p1, v4, v2, v1 ); // invoke-virtual {p0, p1, v4, v2, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;->encode([BIILorg/apache/commons/codec/binary/BaseNCodec$Context;)V
/* .line 408 */
int v2 = -1; // const/4 v2, -0x1
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).encode ( p1, v4, v2, v1 ); // invoke-virtual {p0, p1, v4, v2, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;->encode([BIILorg/apache/commons/codec/binary/BaseNCodec$Context;)V
/* .line 409 */
/* iget v2, v1, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* iget v3, v1, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->readPos:I */
/* sub-int/2addr v2, v3 */
/* new-array v0, v2, [B */
/* .line 410 */
/* .local v0, "buf":[B */
/* array-length v2, v0 */
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).readResults ( v0, v4, v2, v1 ); // invoke-virtual {p0, v0, v4, v2, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;->readResults([BIILorg/apache/commons/codec/binary/BaseNCodec$Context;)I
} // .end method
public java.lang.String encodeAsString ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "pArray" # [B */
/* .prologue */
/* .line 338 */
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/BaseNCodec;->encode([B)[B
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( v0 );
} // .end method
public java.lang.String encodeToString ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "pArray" # [B */
/* .prologue */
/* .line 327 */
(( org.apache.commons.codec.binary.BaseNCodec ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/binary/BaseNCodec;->encode([B)[B
org.apache.commons.codec.binary.StringUtils .newStringUtf8 ( v0 );
} // .end method
protected ensureBufferSize ( Integer p0, org.apache.commons.codec.binary.BaseNCodec$Context p1 ) {
/* .locals 2 */
/* .param p1, "size" # I */
/* .param p2, "context" # Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* .prologue */
/* .line 246 */
v0 = this.buffer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.buffer;
/* array-length v0, v0 */
/* iget v1, p2, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* add-int/2addr v1, p1 */
/* if-ge v0, v1, :cond_1 */
/* .line 247 */
} // :cond_0
/* invoke-direct {p0, p2}, Lorg/apache/commons/codec/binary/BaseNCodec;->resizeBuffer(Lorg/apache/commons/codec/binary/BaseNCodec$Context;)[B */
/* .line 249 */
} // :goto_0
} // :cond_1
v0 = this.buffer;
} // .end method
protected Integer getDefaultBufferSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 219 */
/* const/16 v0, 0x2000 */
} // .end method
public Long getEncodedLength ( Object[] p0 ) {
/* .locals 6 */
/* .param p1, "pArray" # [B */
/* .prologue */
/* .line 495 */
/* array-length v2, p1 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->unencodedBlockSize:I */
/* add-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x1 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->unencodedBlockSize:I */
/* div-int/2addr v2, v3 */
/* int-to-long v2, v2 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->encodedBlockSize:I */
/* int-to-long v4, v4 */
/* mul-long v0, v2, v4 */
/* .line 496 */
/* .local v0, "len":J */
/* iget v2, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->lineLength:I */
/* if-lez v2, :cond_0 */
/* .line 498 */
/* iget v2, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->lineLength:I */
/* int-to-long v2, v2 */
/* add-long/2addr v2, v0 */
/* const-wide/16 v4, 0x1 */
/* sub-long/2addr v2, v4 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->lineLength:I */
/* int-to-long v4, v4 */
/* div-long/2addr v2, v4 */
/* iget v4, p0, Lorg/apache/commons/codec/binary/BaseNCodec;->chunkSeparatorLength:I */
/* int-to-long v4, v4 */
/* mul-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* .line 500 */
} // :cond_0
/* return-wide v0 */
} // .end method
Boolean hasData ( org.apache.commons.codec.binary.BaseNCodec$Context p0 ) {
/* .locals 1 */
/* .param p1, "context" # Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* .prologue */
/* .line 200 */
v0 = this.buffer;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected abstract Boolean isInAlphabet ( Object p0 ) {
} // .end method
public Boolean isInAlphabet ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "basen" # Ljava/lang/String; */
/* .prologue */
/* .line 460 */
org.apache.commons.codec.binary.StringUtils .getBytesUtf8 ( p1 );
int v1 = 1; // const/4 v1, 0x1
v0 = (( org.apache.commons.codec.binary.BaseNCodec ) p0 ).isInAlphabet ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;->isInAlphabet([BZ)Z
} // .end method
public Boolean isInAlphabet ( Object[] p0, Boolean p1 ) {
/* .locals 3 */
/* .param p1, "arrayOctet" # [B */
/* .param p2, "allowWSPad" # Z */
/* .prologue */
/* .line 441 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_2 */
/* .line 442 */
/* aget-byte v1, p1, v0 */
v1 = (( org.apache.commons.codec.binary.BaseNCodec ) p0 ).isInAlphabet ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/commons/codec/binary/BaseNCodec;->isInAlphabet(B)Z
/* if-nez v1, :cond_1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* aget-byte v1, p1, v0 */
/* const/16 v2, 0x3d */
/* if-eq v1, v2, :cond_1 */
/* aget-byte v1, p1, v0 */
v1 = org.apache.commons.codec.binary.BaseNCodec .isWhiteSpace ( v1 );
/* if-nez v1, :cond_1 */
/* .line 444 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 447 */
} // :goto_1
/* .line 441 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
/* .line 447 */
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
} // .end method
Integer readResults ( Object[] p0, Integer p1, Integer p2, org.apache.commons.codec.binary.BaseNCodec$Context p3 ) {
/* .locals 3 */
/* .param p1, "b" # [B */
/* .param p2, "bPos" # I */
/* .param p3, "bAvail" # I */
/* .param p4, "context" # Lorg/apache/commons/codec/binary/BaseNCodec$Context; */
/* .prologue */
/* .line 269 */
v1 = this.buffer;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 270 */
v1 = (( org.apache.commons.codec.binary.BaseNCodec ) p0 ).available ( p4 ); // invoke-virtual {p0, p4}, Lorg/apache/commons/codec/binary/BaseNCodec;->available(Lorg/apache/commons/codec/binary/BaseNCodec$Context;)I
v0 = java.lang.Math .min ( v1,p3 );
/* .line 271 */
/* .local v0, "len":I */
v1 = this.buffer;
/* iget v2, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->readPos:I */
java.lang.System .arraycopy ( v1,v2,p1,p2,v0 );
/* .line 272 */
/* iget v1, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->readPos:I */
/* add-int/2addr v1, v0 */
/* iput v1, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->readPos:I */
/* .line 273 */
/* iget v1, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->readPos:I */
/* iget v2, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
/* if-lt v1, v2, :cond_0 */
/* .line 274 */
int v1 = 0; // const/4 v1, 0x0
this.buffer = v1;
/* .line 278 */
} // .end local v0 # "len":I
} // :cond_0
} // :goto_0
} // :cond_1
/* iget-boolean v1, p4, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->eof:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
int v1 = -1; // const/4 v1, -0x1
} // :goto_1
/* move v0, v1 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // .end method
