public class inal extends org.codehaus.jackson.io.BaseReader {
	 /* .source "UTF32Reader.java" */
	 /* # instance fields */
	 final Boolean mBigEndian;
	 Integer mByteCount;
	 Integer mCharCount;
	 Object mSurrogate;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .param p1, "ctxt" # Lorg/codehaus/jackson/io/IOContext; */
		 /* .param p2, "in" # Ljava/io/InputStream; */
		 /* .param p3, "buf" # [B */
		 /* .param p4, "ptr" # I */
		 /* .param p5, "len" # I */
		 /* .param p6, "isBigEndian" # Z */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 44 */
		 /* invoke-direct/range {p0 ..p5}, Lorg/codehaus/jackson/io/BaseReader;-><init>(Lorg/codehaus/jackson/io/IOContext;Ljava/io/InputStream;[BII)V */
		 /* .line 22 */
		 /* iput-char v0, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mSurrogate:C */
		 /* .line 27 */
		 /* iput v0, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mCharCount:I */
		 /* .line 32 */
		 /* iput v0, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mByteCount:I */
		 /* .line 45 */
		 /* iput-boolean p6, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mBigEndian:Z */
		 /* .line 46 */
		 return;
	 } // .end method
	 private Boolean loadMore ( Integer p0 ) {
		 /* .locals 9 */
		 /* .param p1, "available" # I */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 int v8 = 4; // const/4 v8, 0x4
	 int v3 = 1; // const/4 v3, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 169 */
	 /* iget v4, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mByteCount:I */
	 /* iget v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
	 /* sub-int/2addr v5, p1 */
	 /* add-int/2addr v4, v5 */
	 /* iput v4, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mByteCount:I */
	 /* .line 172 */
	 /* if-lez p1, :cond_4 */
	 /* .line 173 */
	 /* iget v4, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
	 /* if-lez v4, :cond_1 */
	 /* .line 174 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .local v1, "i":I */
} // :goto_0
/* if-ge v1, p1, :cond_0 */
/* .line 175 */
v4 = this.mBuffer;
v5 = this.mBuffer;
/* iget v6, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* add-int/2addr v6, v1 */
/* aget-byte v5, v5, v6 */
/* aput-byte v5, v4, v1 */
/* .line 174 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 177 */
} // :cond_0
/* iput v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* .line 179 */
} // .end local v1 # "i":I
} // :cond_1
/* iput p1, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* .line 201 */
} // :goto_1
/* iget v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* if-ge v2, v8, :cond_7 */
/* .line 202 */
v2 = this.mIn;
v4 = this.mBuffer;
/* iget v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
v6 = this.mBuffer;
/* array-length v6, v6 */
/* iget v7, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* sub-int/2addr v6, v7 */
v0 = (( java.io.InputStream ) v2 ).read ( v4, v5, v6 ); // invoke-virtual {v2, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I
/* .line 203 */
/* .local v0, "count":I */
/* if-ge v0, v3, :cond_3 */
/* .line 204 */
/* if-gez v0, :cond_2 */
/* .line 205 */
(( org.codehaus.jackson.io.UTF32Reader ) p0 ).freeBuffers ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/io/UTF32Reader;->freeBuffers()V
/* .line 206 */
/* iget v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* invoke-direct {p0, v2, v8}, Lorg/codehaus/jackson/io/UTF32Reader;->reportUnexpectedEOF(II)V */
/* .line 209 */
} // :cond_2
(( org.codehaus.jackson.io.UTF32Reader ) p0 ).reportStrangeStream ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/io/UTF32Reader;->reportStrangeStream()V
/* .line 211 */
} // :cond_3
/* iget v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* add-int/2addr v2, v0 */
/* iput v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* .line 184 */
} // .end local v0 # "count":I
} // :cond_4
/* iput v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* .line 185 */
v4 = this.mIn;
v5 = this.mBuffer;
v0 = (( java.io.InputStream ) v4 ).read ( v5 ); // invoke-virtual {v4, v5}, Ljava/io/InputStream;->read([B)I
/* .line 186 */
/* .restart local v0 # "count":I */
/* if-ge v0, v3, :cond_6 */
/* .line 187 */
/* iput v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* .line 188 */
/* if-gez v0, :cond_5 */
/* .line 189 */
(( org.codehaus.jackson.io.UTF32Reader ) p0 ).freeBuffers ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/io/UTF32Reader;->freeBuffers()V
/* .line 213 */
} // .end local v0 # "count":I
} // :goto_2
/* .line 193 */
/* .restart local v0 # "count":I */
} // :cond_5
(( org.codehaus.jackson.io.UTF32Reader ) p0 ).reportStrangeStream ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/io/UTF32Reader;->reportStrangeStream()V
/* .line 195 */
} // :cond_6
/* iput v0, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
} // .end local v0 # "count":I
} // :cond_7
/* move v2, v3 */
/* .line 213 */
} // .end method
private void reportInvalid ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 5 */
/* .param p1, "value" # I */
/* .param p2, "offset" # I */
/* .param p3, "msg" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 152 */
/* iget v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mByteCount:I */
/* iget v3, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* add-int/2addr v2, v3 */
/* add-int/lit8 v0, v2, -0x1 */
/* .line 153 */
/* .local v0, "bytePos":I */
/* iget v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mCharCount:I */
/* add-int v1, v2, p2 */
/* .line 155 */
/* .local v1, "charPos":I */
/* new-instance v2, Ljava/io/CharConversionException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Invalid UTF-32 character 0x"; // const-string v4, "Invalid UTF-32 character 0x"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toHexString ( p1 );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p3 ); // invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " at char #"; // const-string v4, " at char #"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ", byte #"; // const-string v4, ", byte #"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ")"; // const-string v4, ")"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
} // .end method
private void reportUnexpectedEOF ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "gotBytes" # I */
/* .param p2, "needed" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 141 */
/* iget v2, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mByteCount:I */
/* add-int v0, v2, p1 */
/* .line 142 */
/* .local v0, "bytePos":I */
/* iget v1, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mCharCount:I */
/* .line 144 */
/* .local v1, "charPos":I */
/* new-instance v2, Ljava/io/CharConversionException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unexpected EOF in the middle of a 4-byte UTF-32 char: got "; // const-string v4, "Unexpected EOF in the middle of a 4-byte UTF-32 char: got "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ", needed "; // const-string v4, ", needed "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ", at char #"; // const-string v4, ", at char #"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ", byte #"; // const-string v4, ", byte #"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ")"; // const-string v4, ")"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
} // .end method
/* # virtual methods */
public void close ( ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 12 */
/* invoke-super {p0}, Lorg/codehaus/jackson/io/BaseReader;->close()V */
return;
} // .end method
public Integer read ( ) { //bridge//synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 12 */
v0 = /* invoke-super {p0}, Lorg/codehaus/jackson/io/BaseReader;->read()I */
} // .end method
public Integer read ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 9 */
/* .param p1, "cbuf" # [C */
/* .param p2, "start" # I */
/* .param p3, "len" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* const v8, 0x10ffff */
int v5 = -1; // const/4 v5, -0x1
/* .line 59 */
v6 = this.mBuffer;
/* if-nez v6, :cond_1 */
/* .line 129 */
} // :cond_0
} // :goto_0
/* .line 62 */
} // :cond_1
int v6 = 1; // const/4 v6, 0x1
/* if-ge p3, v6, :cond_2 */
/* move v5, p3 */
/* .line 63 */
/* .line 66 */
} // :cond_2
/* if-ltz p2, :cond_3 */
/* add-int v6, p2, p3 */
/* array-length v7, p1 */
/* if-le v6, v7, :cond_4 */
/* .line 67 */
} // :cond_3
(( org.codehaus.jackson.io.UTF32Reader ) p0 ).reportBounds ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lorg/codehaus/jackson/io/UTF32Reader;->reportBounds([CII)V
/* .line 70 */
} // :cond_4
/* add-int/2addr p3, p2 */
/* .line 71 */
/* move v2, p2 */
/* .line 74 */
/* .local v2, "outPtr":I */
/* iget-char v6, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mSurrogate:C */
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 75 */
/* add-int/lit8 v3, v2, 0x1 */
} // .end local v2 # "outPtr":I
/* .local v3, "outPtr":I */
/* iget-char v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mSurrogate:C */
/* aput-char v5, p1, v2 */
/* .line 76 */
int v5 = 0; // const/4 v5, 0x0
/* iput-char v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mSurrogate:C */
/* .line 91 */
} // :cond_5
} // :goto_1
/* if-ge v3, p3, :cond_c */
/* .line 92 */
/* iget v4, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* .line 95 */
/* .local v4, "ptr":I */
/* iget-boolean v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mBigEndian:Z */
if ( v5 != null) { // if-eqz v5, :cond_9
/* .line 96 */
v5 = this.mBuffer;
/* aget-byte v5, v5, v4 */
/* shl-int/lit8 v5, v5, 0x18 */
v6 = this.mBuffer;
/* add-int/lit8 v7, v4, 0x1 */
/* aget-byte v6, v6, v7 */
/* and-int/lit16 v6, v6, 0xff */
/* shl-int/lit8 v6, v6, 0x10 */
/* or-int/2addr v5, v6 */
v6 = this.mBuffer;
/* add-int/lit8 v7, v4, 0x2 */
/* aget-byte v6, v6, v7 */
/* and-int/lit16 v6, v6, 0xff */
/* shl-int/lit8 v6, v6, 0x8 */
/* or-int/2addr v5, v6 */
v6 = this.mBuffer;
/* add-int/lit8 v7, v4, 0x3 */
/* aget-byte v6, v6, v7 */
/* and-int/lit16 v6, v6, 0xff */
/* or-int v0, v5, v6 */
/* .line 102 */
/* .local v0, "ch":I */
} // :goto_2
/* iget v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* add-int/lit8 v5, v5, 0x4 */
/* iput v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* .line 106 */
/* const v5, 0xffff */
/* if-le v0, v5, :cond_a */
/* .line 107 */
/* if-le v0, v8, :cond_6 */
/* .line 108 */
/* sub-int v5, v3, p2 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "(above "; // const-string v7, "(above "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toHexString ( v8 );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = ") "; // const-string v7, ") "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0, v5, v6}, Lorg/codehaus/jackson/io/UTF32Reader;->reportInvalid(IILjava/lang/String;)V */
/* .line 111 */
} // :cond_6
/* const/high16 v5, 0x10000 */
/* sub-int/2addr v0, v5 */
/* .line 112 */
/* add-int/lit8 v2, v3, 0x1 */
} // .end local v3 # "outPtr":I
/* .restart local v2 # "outPtr":I */
/* const v5, 0xd800 */
/* shr-int/lit8 v6, v0, 0xa */
/* add-int/2addr v5, v6 */
/* int-to-char v5, v5 */
/* aput-char v5, p1, v3 */
/* .line 114 */
/* const v5, 0xdc00 */
/* and-int/lit16 v6, v0, 0x3ff */
/* or-int v0, v5, v6 */
/* .line 116 */
/* if-lt v2, p3, :cond_b */
/* .line 117 */
/* int-to-char v5, v0 */
/* iput-char v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mSurrogate:C */
/* .line 127 */
} // .end local v0 # "ch":I
} // .end local v4 # "ptr":I
} // :goto_3
/* sub-int p3, v2, p2 */
/* .line 128 */
/* iget v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mCharCount:I */
/* add-int/2addr v5, p3 */
/* iput v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mCharCount:I */
/* move v5, p3 */
/* .line 129 */
/* goto/16 :goto_0 */
/* .line 82 */
} // :cond_7
/* iget v6, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* iget v7, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* sub-int v1, v6, v7 */
/* .line 83 */
/* .local v1, "left":I */
int v6 = 4; // const/4 v6, 0x4
/* if-ge v1, v6, :cond_8 */
/* .line 84 */
v6 = /* invoke-direct {p0, v1}, Lorg/codehaus/jackson/io/UTF32Reader;->loadMore(I)Z */
if ( v6 != null) { // if-eqz v6, :cond_0
} // :cond_8
/* move v3, v2 */
} // .end local v2 # "outPtr":I
/* .restart local v3 # "outPtr":I */
/* goto/16 :goto_1 */
/* .line 99 */
} // .end local v1 # "left":I
/* .restart local v4 # "ptr":I */
} // :cond_9
v5 = this.mBuffer;
/* aget-byte v5, v5, v4 */
/* and-int/lit16 v5, v5, 0xff */
v6 = this.mBuffer;
/* add-int/lit8 v7, v4, 0x1 */
/* aget-byte v6, v6, v7 */
/* and-int/lit16 v6, v6, 0xff */
/* shl-int/lit8 v6, v6, 0x8 */
/* or-int/2addr v5, v6 */
v6 = this.mBuffer;
/* add-int/lit8 v7, v4, 0x2 */
/* aget-byte v6, v6, v7 */
/* and-int/lit16 v6, v6, 0xff */
/* shl-int/lit8 v6, v6, 0x10 */
/* or-int/2addr v5, v6 */
v6 = this.mBuffer;
/* add-int/lit8 v7, v4, 0x3 */
/* aget-byte v6, v6, v7 */
/* shl-int/lit8 v6, v6, 0x18 */
/* or-int v0, v5, v6 */
/* .restart local v0 # "ch":I */
/* goto/16 :goto_2 */
} // :cond_a
/* move v2, v3 */
/* .line 121 */
} // .end local v3 # "outPtr":I
/* .restart local v2 # "outPtr":I */
} // :cond_b
/* add-int/lit8 v3, v2, 0x1 */
} // .end local v2 # "outPtr":I
/* .restart local v3 # "outPtr":I */
/* int-to-char v5, v0 */
/* aput-char v5, p1, v2 */
/* .line 122 */
/* iget v5, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mPtr:I */
/* iget v6, p0, Lorg/codehaus/jackson/io/UTF32Reader;->mLength:I */
/* if-lt v5, v6, :cond_5 */
/* move v2, v3 */
/* .line 123 */
} // .end local v3 # "outPtr":I
/* .restart local v2 # "outPtr":I */
} // .end local v0 # "ch":I
} // .end local v2 # "outPtr":I
} // .end local v4 # "ptr":I
/* .restart local v3 # "outPtr":I */
} // :cond_c
/* move v2, v3 */
} // .end local v3 # "outPtr":I
/* .restart local v2 # "outPtr":I */
} // .end method
