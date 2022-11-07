class org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer extends org.apache.commons.codec.language.ColognePhonetic$CologneBuffer {
	 /* .source "ColognePhonetic.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/commons/codec/language/ColognePhonetic; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "CologneInputBuffer" */
} // .end annotation
/* # instance fields */
final org.apache.commons.codec.language.ColognePhonetic this$0; //synthetic
/* # direct methods */
public org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ( ) {
/* .locals 0 */
/* .param p2, "data" # [C */
/* .prologue */
/* .line 247 */
this.this$0 = p1;
/* .line 248 */
/* invoke-direct {p0, p1, p2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer;-><init>(Lorg/apache/commons/codec/language/ColognePhonetic;[C)V */
/* .line 249 */
return;
} // .end method
/* # virtual methods */
public void addLeft ( Object p0 ) {
/* .locals 2 */
/* .param p1, "ch" # C */
/* .prologue */
/* .line 252 */
/* iget v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->length:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->length:I */
/* .line 253 */
v0 = this.data;
v1 = (( org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ) p0 ).getNextPos ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->getNextPos()I
/* aput-char p1, v0, v1 */
/* .line 254 */
return;
} // .end method
protected copyData ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "start" # I */
/* .param p2, "length" # I */
/* .prologue */
/* .line 258 */
/* new-array v0, p2, [C */
/* .line 259 */
/* .local v0, "newData":[C */
v1 = this.data;
v2 = this.data;
/* array-length v2, v2 */
/* iget v3, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->length:I */
/* sub-int/2addr v2, v3 */
/* add-int/2addr v2, p1 */
int v3 = 0; // const/4 v3, 0x0
java.lang.System .arraycopy ( v1,v2,v0,v3,p2 );
/* .line 260 */
} // .end method
public Object getNextChar ( ) {
/* .locals 2 */
/* .prologue */
/* .line 264 */
v0 = this.data;
v1 = (( org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ) p0 ).getNextPos ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->getNextPos()I
/* aget-char v0, v0, v1 */
} // .end method
protected Integer getNextPos ( ) {
/* .locals 2 */
/* .prologue */
/* .line 268 */
v0 = this.data;
/* array-length v0, v0 */
/* iget v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->length:I */
/* sub-int/2addr v0, v1 */
} // .end method
public Object removeNext ( ) {
/* .locals 2 */
/* .prologue */
/* .line 272 */
v0 = (( org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ) p0 ).getNextChar ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->getNextChar()C
/* .line 273 */
/* .local v0, "ch":C */
/* iget v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->length:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, p0, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->length:I */
/* .line 274 */
} // .end method
