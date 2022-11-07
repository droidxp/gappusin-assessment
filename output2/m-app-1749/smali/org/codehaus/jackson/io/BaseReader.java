abstract class org.codehaus.jackson.io.BaseReader extends java.io.Reader {
	 /* .source "BaseReader.java" */
	 /* # static fields */
	 protected static final Integer LAST_VALID_UNICODE_CHAR;
	 protected static final Object NULL_BYTE;
	 protected static final Object NULL_CHAR;
	 /* # instance fields */
	 protected mBuffer;
	 protected final org.codehaus.jackson.io.IOContext mContext;
	 protected java.io.InputStream mIn;
	 protected Integer mLength;
	 protected Integer mPtr;
	 mTmpBuf;
	 /* # direct methods */
	 protected org.codehaus.jackson.io.BaseReader ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Lorg/codehaus/jackson/io/IOContext; */
		 /* .param p2, "in" # Ljava/io/InputStream; */
		 /* .param p3, "buf" # [B */
		 /* .param p4, "ptr" # I */
		 /* .param p5, "len" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0}, Ljava/io/Reader;-><init>()V */
		 /* .line 69 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mTmpBuf = v0;
		 /* .line 44 */
		 this.mContext = p1;
		 /* .line 45 */
		 this.mIn = p2;
		 /* .line 46 */
		 this.mBuffer = p3;
		 /* .line 47 */
		 /* iput p4, p0, Lorg/codehaus/jackson/io/BaseReader;->mPtr:I */
		 /* .line 48 */
		 /* iput p5, p0, Lorg/codehaus/jackson/io/BaseReader;->mLength:I */
		 /* .line 49 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void close ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 60 */
	 v0 = this.mIn;
	 /* .line 62 */
	 /* .local v0, "in":Ljava/io/InputStream; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 63 */
		 int v1 = 0; // const/4 v1, 0x0
		 this.mIn = v1;
		 /* .line 64 */
		 (( org.codehaus.jackson.io.BaseReader ) p0 ).freeBuffers ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/io/BaseReader;->freeBuffers()V
		 /* .line 65 */
		 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
		 /* .line 67 */
	 } // :cond_0
	 return;
} // .end method
public final void freeBuffers ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 101 */
	 v0 = this.mBuffer;
	 /* .line 102 */
	 /* .local v0, "buf":[B */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 103 */
		 int v1 = 0; // const/4 v1, 0x0
		 this.mBuffer = v1;
		 /* .line 104 */
		 v1 = this.mContext;
		 (( org.codehaus.jackson.io.IOContext ) v1 ).releaseReadIOBuffer ( v0 ); // invoke-virtual {v1, v0}, Lorg/codehaus/jackson/io/IOContext;->releaseReadIOBuffer([B)V
		 /* .line 106 */
	 } // :cond_0
	 return;
} // .end method
public Integer read ( ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 1; // const/4 v1, 0x1
/* .line 79 */
v0 = this.mTmpBuf;
/* if-nez v0, :cond_0 */
/* .line 80 */
/* new-array v0, v1, [C */
this.mTmpBuf = v0;
/* .line 82 */
} // :cond_0
v0 = this.mTmpBuf;
v0 = (( org.codehaus.jackson.io.BaseReader ) p0 ).read ( v0, v2, v1 ); // invoke-virtual {p0, v0, v2, v1}, Lorg/codehaus/jackson/io/BaseReader;->read([CII)I
/* if-ge v0, v1, :cond_1 */
/* .line 83 */
int v0 = -1; // const/4 v0, -0x1
/* .line 85 */
} // :goto_0
} // :cond_1
v0 = this.mTmpBuf;
/* aget-char v0, v0, v2 */
} // .end method
protected void reportBounds ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "cbuf" # [C */
/* .param p2, "start" # I */
/* .param p3, "len" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 111 */
/* new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "read(buf,"; // const-string v2, "read(buf,"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ","; // const-string v2, ","
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "), cbuf["; // const-string v2, "), cbuf["
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* array-length v2, p1 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "]"; // const-string v2, "]"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
protected void reportStrangeStream ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 117 */
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Strange I/O stream, returned 0 bytes on read"; // const-string v1, "Strange I/O stream, returned 0 bytes on read"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
