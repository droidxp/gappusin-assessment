class org.apache.commons.codec.binary.BaseNCodec$Context {
	 /* .source "BaseNCodec.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/commons/codec/binary/BaseNCodec; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "Context" */
} // .end annotation
/* # instance fields */
 buffer;
Integer currentLinePos;
Boolean eof;
Integer ibitWorkArea;
Long lbitWorkArea;
Integer modulus;
Integer pos;
Integer readPos;
/* # direct methods */
 org.apache.commons.codec.binary.BaseNCodec$Context ( ) {
/* .locals 0 */
/* .prologue */
/* .line 92 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 93 */
return;
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 5 */
/* .prologue */
/* .line 103 */
final String v0 = "%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]"; // const-string v0, "%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]"
/* const/16 v1, 0x9 */
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v3 ).getSimpleName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
v3 = this.buffer;
java.util.Arrays .toString ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
/* iget v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->currentLinePos:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
/* iget-boolean v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->eof:Z */
java.lang.Boolean .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 4; // const/4 v2, 0x4
/* iget v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->ibitWorkArea:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 5; // const/4 v2, 0x5
/* iget-wide v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->lbitWorkArea:J */
java.lang.Long .valueOf ( v3,v4 );
/* aput-object v3, v1, v2 */
int v2 = 6; // const/4 v2, 0x6
/* iget v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->modulus:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 7; // const/4 v2, 0x7
/* iget v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->pos:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x8 */
/* iget v3, p0, Lorg/apache/commons/codec/binary/BaseNCodec$Context;->readPos:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
java.lang.String .format ( v0,v1 );
} // .end method
