public class org.anddev.andengine.util.Base64InputStream extends java.io.FilterInputStream {
	 /* # static fields */
	 private static final Integer BUFFER_SIZE;
	 private static EMPTY;
	 /* # instance fields */
	 private final org.anddev.andengine.util.Base64$Coder coder;
	 private Boolean eof;
	 private inputBuffer;
	 private Integer outputEnd;
	 private Integer outputStart;
	 /* # direct methods */
	 static org.anddev.andengine.util.Base64InputStream ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [B */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.Base64InputStream ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lorg/anddev/andengine/util/Base64InputStream;-><init>(Ljava/io/InputStream;IZ)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.Base64InputStream ( ) {
		 /* .locals 4 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/16 v3, 0x800 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/util/Base64InputStream;->eof:Z */
		 /* new-array v0, v3, [B */
		 this.inputBuffer = v0;
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* new-instance v0, Lorg/anddev/andengine/util/Base64$Encoder; */
			 /* invoke-direct {v0, p2, v1}, Lorg/anddev/andengine/util/Base64$Encoder;-><init>(I[B)V */
			 this.coder = v0;
		 } // :goto_0
		 v0 = this.coder;
		 v1 = this.coder;
		 v1 = 		 (( org.anddev.andengine.util.Base64$Coder ) v1 ).maxOutputSize ( v3 ); // invoke-virtual {v1, v3}, Lorg/anddev/andengine/util/Base64$Coder;->maxOutputSize(I)I
		 /* new-array v1, v1, [B */
		 this.output = v1;
		 /* iput v2, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
		 /* iput v2, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
		 return;
	 } // :cond_0
	 /* new-instance v0, Lorg/anddev/andengine/util/Base64$Decoder; */
	 /* invoke-direct {v0, p2, v1}, Lorg/anddev/andengine/util/Base64$Decoder;-><init>(I[B)V */
	 this.coder = v0;
} // .end method
private void refill ( ) {
	 /* .locals 4 */
	 int v2 = 1; // const/4 v2, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->eof:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :goto_0
	 return;
} // :cond_0
v0 = this.in;
v1 = this.inputBuffer;
v0 = (( java.io.InputStream ) v0 ).read ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_1 */
/* iput-boolean v2, p0, Lorg/anddev/andengine/util/Base64InputStream;->eof:Z */
v0 = this.coder;
v1 = org.anddev.andengine.util.Base64InputStream.EMPTY;
v0 = (( org.anddev.andengine.util.Base64$Coder ) v0 ).process ( v1, v3, v3, v2 ); // invoke-virtual {v0, v1, v3, v3, v2}, Lorg/anddev/andengine/util/Base64$Coder;->process([BIIZ)Z
} // :goto_1
/* if-nez v0, :cond_2 */
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "bad base-64"; // const-string v1, "bad base-64"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
v1 = this.coder;
v2 = this.inputBuffer;
v0 = (( org.anddev.andengine.util.Base64$Coder ) v1 ).process ( v2, v3, v0, v3 ); // invoke-virtual {v1, v2, v3, v0, v3}, Lorg/anddev/andengine/util/Base64$Coder;->process([BIIZ)Z
} // :cond_2
v0 = this.coder;
/* iget v0, v0, Lorg/anddev/andengine/util/Base64$Coder;->op:I */
/* iput v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* iput v3, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
} // .end method
/* # virtual methods */
public Integer available ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* sub-int/2addr v0, v1 */
} // .end method
public void close ( ) {
/* .locals 1 */
v0 = this.in;
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
int v0 = 0; // const/4 v0, 0x0
this.inputBuffer = v0;
return;
} // .end method
public void mark ( Integer p0 ) {
/* .locals 1 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw v0 */
} // .end method
public Boolean markSupported ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer read ( ) {
/* .locals 3 */
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* if-lt v0, v1, :cond_0 */
/* invoke-direct {p0}, Lorg/anddev/andengine/util/Base64InputStream;->refill()V */
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* if-lt v0, v1, :cond_1 */
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
} // :cond_1
v0 = this.coder;
v0 = this.output;
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* aget-byte v0, v0, v1 */
} // .end method
public Integer read ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* if-lt v0, v1, :cond_0 */
/* invoke-direct {p0}, Lorg/anddev/andengine/util/Base64InputStream;->refill()V */
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* if-lt v0, v1, :cond_1 */
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
} // :cond_1
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* sub-int/2addr v0, v1 */
v0 = java.lang.Math .min ( p3,v0 );
v1 = this.coder;
v1 = this.output;
/* iget v2, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
java.lang.System .arraycopy ( v1,v2,p1,p2,v0 );
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* add-int/2addr v1, v0 */
/* iput v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
} // .end method
public void reset ( ) {
/* .locals 1 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw v0 */
} // .end method
public Long skip ( Long p0 ) {
/* .locals 4 */
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* if-lt v0, v1, :cond_0 */
/* invoke-direct {p0}, Lorg/anddev/andengine/util/Base64InputStream;->refill()V */
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* if-lt v0, v1, :cond_1 */
/* const-wide/16 v0, 0x0 */
} // :goto_0
/* return-wide v0 */
} // :cond_1
/* iget v0, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputEnd:I */
/* iget v1, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* sub-int/2addr v0, v1 */
/* int-to-long v0, v0 */
java.lang.Math .min ( p1,p2,v0,v1 );
/* move-result-wide v0 */
/* iget v2, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
/* int-to-long v2, v2 */
/* add-long/2addr v2, v0 */
/* long-to-int v2, v2 */
/* iput v2, p0, Lorg/anddev/andengine/util/Base64InputStream;->outputStart:I */
} // .end method
