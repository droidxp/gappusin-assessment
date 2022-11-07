abstract class org.apache.commons.codec.language.ColognePhonetic$CologneBuffer {
	 /* .source "ColognePhonetic.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/commons/codec/language/ColognePhonetic; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x402 */
/* name = "CologneBuffer" */
} // .end annotation
/* # instance fields */
protected final data;
protected Integer length;
final org.apache.commons.codec.language.ColognePhonetic this$0; //synthetic
/* # direct methods */
public org.apache.commons.codec.language.ColognePhonetic$CologneBuffer ( ) {
/* .locals 2 */
/* .param p2, "buffSize" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 209 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 202 */
/* iput v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I */
/* .line 210 */
/* new-array v0, p2, [C */
this.data = v0;
/* .line 211 */
/* iput v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I */
/* .line 212 */
return;
} // .end method
public org.apache.commons.codec.language.ColognePhonetic$CologneBuffer ( ) {
/* .locals 1 */
/* .param p2, "data" # [C */
/* .prologue */
/* .line 204 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 202 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I */
/* .line 205 */
this.data = p2;
/* .line 206 */
/* array-length v0, p2 */
/* iput v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I */
/* .line 207 */
return;
} // .end method
/* # virtual methods */
protected abstract copyData ( Integer p0, Integer p1 ) {
} // .end method
public Integer length ( ) {
/* .locals 1 */
/* .prologue */
/* .line 217 */
/* iget v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .prologue */
/* .line 222 */
/* new-instance v0, Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->length:I */
(( org.apache.commons.codec.language.ColognePhonetic$CologneBuffer ) p0 ).copyData ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;->copyData(II)[C
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V */
} // .end method
