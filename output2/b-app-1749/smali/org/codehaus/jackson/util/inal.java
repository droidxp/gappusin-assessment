public class inal {
	 /* .source "BufferRecycler.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType;, */
	 /* Lorg/codehaus/jackson/util/BufferRecycler$ByteBufferType; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer DEFAULT_WRITE_CONCAT_BUFFER_LEN;
/* # instance fields */
protected final B mByteBuffers;
protected final C mCharBuffers;
/* # direct methods */
public inal ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 50 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 47 */
	 org.codehaus.jackson.util.BufferRecycler$ByteBufferType .values ( );
	 /* array-length v0, v0 */
	 /* new-array v0, v0, [[B */
	 this.mByteBuffers = v0;
	 /* .line 48 */
	 org.codehaus.jackson.util.BufferRecycler$CharBufferType .values ( );
	 /* array-length v0, v0 */
	 /* new-array v0, v0, [[C */
	 this.mCharBuffers = v0;
	 /* .line 50 */
	 return;
} // .end method
private balloc ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "size" # I */
	 /* .prologue */
	 /* .line 102 */
	 /* new-array v0, p1, [B */
} // .end method
private calloc ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "size" # I */
	 /* .prologue */
	 /* .line 107 */
	 /* new-array v0, p1, [C */
} // .end method
/* # virtual methods */
public allocByteBuffer ( org.codehaus.jackson.util.BufferRecycler$ByteBufferType p0 ) {
	 /* .locals 4 */
	 /* .param p1, "type" # Lorg/codehaus/jackson/util/BufferRecycler$ByteBufferType; */
	 /* .prologue */
	 /* .line 54 */
	 v1 = 	 (( org.codehaus.jackson.util.BufferRecycler$ByteBufferType ) p1 ).ordinal ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/util/BufferRecycler$ByteBufferType;->ordinal()I
	 /* .line 55 */
	 /* .local v1, "ix":I */
	 v2 = this.mByteBuffers;
	 /* aget-object v0, v2, v1 */
	 /* .line 56 */
	 /* .local v0, "buffer":[B */
	 /* if-nez v0, :cond_0 */
	 /* .line 57 */
	 v2 = 	 org.codehaus.jackson.util.BufferRecycler$ByteBufferType .access$000 ( p1 );
	 /* invoke-direct {p0, v2}, Lorg/codehaus/jackson/util/BufferRecycler;->balloc(I)[B */
	 /* .line 61 */
} // :goto_0
/* .line 59 */
} // :cond_0
v2 = this.mByteBuffers;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v3, v2, v1 */
} // .end method
public allocCharBuffer ( org.codehaus.jackson.util.BufferRecycler$CharBufferType p0 ) {
/* .locals 1 */
/* .param p1, "type" # Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType; */
/* .prologue */
/* .line 71 */
int v0 = 0; // const/4 v0, 0x0
(( org.codehaus.jackson.util.BufferRecycler ) p0 ).allocCharBuffer ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/codehaus/jackson/util/BufferRecycler;->allocCharBuffer(Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType;I)[C
} // .end method
public allocCharBuffer ( org.codehaus.jackson.util.BufferRecycler$CharBufferType p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "type" # Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType; */
/* .param p2, "minSize" # I */
/* .prologue */
/* .line 76 */
v2 = org.codehaus.jackson.util.BufferRecycler$CharBufferType .access$100 ( p1 );
/* if-le v2, p2, :cond_0 */
/* .line 77 */
p2 = org.codehaus.jackson.util.BufferRecycler$CharBufferType .access$100 ( p1 );
/* .line 79 */
} // :cond_0
v1 = (( org.codehaus.jackson.util.BufferRecycler$CharBufferType ) p1 ).ordinal ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType;->ordinal()I
/* .line 80 */
/* .local v1, "ix":I */
v2 = this.mCharBuffers;
/* aget-object v0, v2, v1 */
/* .line 81 */
/* .local v0, "buffer":[C */
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v2, v0 */
/* if-ge v2, p2, :cond_2 */
/* .line 82 */
} // :cond_1
/* invoke-direct {p0, p2}, Lorg/codehaus/jackson/util/BufferRecycler;->calloc(I)[C */
/* .line 86 */
} // :goto_0
/* .line 84 */
} // :cond_2
v2 = this.mCharBuffers;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v3, v2, v1 */
} // .end method
public void releaseByteBuffer ( org.codehaus.jackson.util.BufferRecycler$ByteBufferType p0, Object[] p1 ) {
/* .locals 2 */
/* .param p1, "type" # Lorg/codehaus/jackson/util/BufferRecycler$ByteBufferType; */
/* .param p2, "buffer" # [B */
/* .prologue */
/* .line 66 */
v0 = this.mByteBuffers;
v1 = (( org.codehaus.jackson.util.BufferRecycler$ByteBufferType ) p1 ).ordinal ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/util/BufferRecycler$ByteBufferType;->ordinal()I
/* aput-object p2, v0, v1 */
/* .line 67 */
return;
} // .end method
public void releaseCharBuffer ( org.codehaus.jackson.util.BufferRecycler$CharBufferType p0, Object[] p1 ) {
/* .locals 2 */
/* .param p1, "type" # Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType; */
/* .param p2, "buffer" # [C */
/* .prologue */
/* .line 91 */
v0 = this.mCharBuffers;
v1 = (( org.codehaus.jackson.util.BufferRecycler$CharBufferType ) p1 ).ordinal ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/util/BufferRecycler$CharBufferType;->ordinal()I
/* aput-object p2, v0, v1 */
/* .line 92 */
return;
} // .end method
