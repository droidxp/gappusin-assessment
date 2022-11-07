class org.apache.commons.codec.language.ColognePhonetic$CologneOutputBuffer extends org.apache.commons.codec.language.ColognePhonetic$CologneBuffer {
	 /* .source "ColognePhonetic.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/commons/codec/language/ColognePhonetic; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "CologneOutputBuffer" */
} // .end annotation
/* # instance fields */
final org.apache.commons.codec.language.ColognePhonetic this$0; //synthetic
/* # direct methods */
public org.apache.commons.codec.language.ColognePhonetic$CologneOutputBuffer ( ) {
/* .locals 0 */
/* .param p2, "buffSize" # I */
/* .prologue */
/* .line 228 */
this.this$0 = p1;
/* .line 229 */
/* invoke-direct {p0, p1, p2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;-><init>(Lorg/apache/commons/codec/language/ColognePhonetic;I)V */
/* .line 230 */
return;
} // .end method
/* # virtual methods */
public void addRight ( Object p0 ) {
/* .locals 2 */
/* .param p1, "chr" # C */
/* .prologue */
/* .line 233 */
v0 = this.data;
/* iget v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->length:I */
/* aput-char p1, v0, v1 */
/* .line 234 */
/* iget v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->length:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->length:I */
/* .line 235 */
return;
} // .end method
protected copyData ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "start" # I */
/* .param p2, "length" # I */
/* .prologue */
/* .line 239 */
/* new-array v0, p2, [C */
/* .line 240 */
/* .local v0, "newData":[C */
v1 = this.data;
int v2 = 0; // const/4 v2, 0x0
java.lang.System .arraycopy ( v1,p1,v0,v2,p2 );
/* .line 241 */
} // .end method
