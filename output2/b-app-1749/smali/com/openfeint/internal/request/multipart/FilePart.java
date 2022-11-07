public class com.openfeint.internal.request.multipart.FilePart extends com.openfeint.internal.request.multipart.PartBase {
	 /* .source "FilePart.java" */
	 /* # static fields */
	 public static final java.lang.String DEFAULT_CHARSET;
	 public static final java.lang.String DEFAULT_CONTENT_TYPE;
	 public static final java.lang.String DEFAULT_TRANSFER_ENCODING;
	 protected static final java.lang.String FILE_NAME;
	 private static final FILE_NAME_BYTES;
	 /* # instance fields */
	 private com.openfeint.internal.request.multipart.PartSource source;
	 /* # direct methods */
	 static com.openfeint.internal.request.multipart.FilePart ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 71 */
		 final String v0 = "; filename="; // const-string v0, "; filename="
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 return;
	 } // .end method
	 public com.openfeint.internal.request.multipart.FilePart ( ) {
		 /* .locals 1 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .param p2, "partSource" # Lcom/openfeint/internal/request/multipart/PartSource; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 109 */
		 /* invoke-direct {p0, p1, p2, v0, v0}, Lcom/openfeint/internal/request/multipart/FilePart;-><init>(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Ljava/lang/String;)V */
		 /* .line 110 */
		 return;
	 } // .end method
	 public com.openfeint.internal.request.multipart.FilePart ( ) {
		 /* .locals 2 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .param p2, "partSource" # Lcom/openfeint/internal/request/multipart/PartSource; */
		 /* .param p3, "contentType" # Ljava/lang/String; */
		 /* .param p4, "charset" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 89 */
		 /* if-nez p3, :cond_0 */
		 final String p3 = "application/octet-stream"; // const-string p3, "application/octet-stream"
	 } // .end local p3 # "contentType":Ljava/lang/String;
} // :cond_0
/* if-nez p4, :cond_1 */
final String p4 = "ISO-8859-1"; // const-string p4, "ISO-8859-1"
} // .end local p4 # "charset":Ljava/lang/String;
} // :cond_1
final String v0 = "binary"; // const-string v0, "binary"
/* invoke-direct {p0, p1, p3, p4, v0}, Lcom/openfeint/internal/request/multipart/PartBase;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 96 */
/* if-nez p2, :cond_2 */
/* .line 97 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Source may not be null"; // const-string v1, "Source may not be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 99 */
} // :cond_2
this.source = p2;
/* .line 100 */
return;
} // .end method
public com.openfeint.internal.request.multipart.FilePart ( ) {
/* .locals 2 */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "file" # Ljava/io/File; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 123 */
/* new-instance v0, Lcom/openfeint/internal/request/multipart/FilePartSource; */
/* invoke-direct {v0, p2}, Lcom/openfeint/internal/request/multipart/FilePartSource;-><init>(Ljava/io/File;)V */
/* invoke-direct {p0, p1, v0, v1, v1}, Lcom/openfeint/internal/request/multipart/FilePart;-><init>(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 124 */
return;
} // .end method
public com.openfeint.internal.request.multipart.FilePart ( ) {
/* .locals 1 */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "file" # Ljava/io/File; */
/* .param p3, "contentType" # Ljava/lang/String; */
/* .param p4, "charset" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 141 */
/* new-instance v0, Lcom/openfeint/internal/request/multipart/FilePartSource; */
/* invoke-direct {v0, p2}, Lcom/openfeint/internal/request/multipart/FilePartSource;-><init>(Ljava/io/File;)V */
/* invoke-direct {p0, p1, v0, p3, p4}, Lcom/openfeint/internal/request/multipart/FilePart;-><init>(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 142 */
return;
} // .end method
public com.openfeint.internal.request.multipart.FilePart ( ) {
/* .locals 2 */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "fileName" # Ljava/lang/String; */
/* .param p3, "file" # Ljava/io/File; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 156 */
/* new-instance v0, Lcom/openfeint/internal/request/multipart/FilePartSource; */
/* invoke-direct {v0, p2, p3}, Lcom/openfeint/internal/request/multipart/FilePartSource;-><init>(Ljava/lang/String;Ljava/io/File;)V */
/* invoke-direct {p0, p1, v0, v1, v1}, Lcom/openfeint/internal/request/multipart/FilePart;-><init>(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 157 */
return;
} // .end method
public com.openfeint.internal.request.multipart.FilePart ( ) {
/* .locals 1 */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "fileName" # Ljava/lang/String; */
/* .param p3, "file" # Ljava/io/File; */
/* .param p4, "contentType" # Ljava/lang/String; */
/* .param p5, "charset" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 175 */
/* new-instance v0, Lcom/openfeint/internal/request/multipart/FilePartSource; */
/* invoke-direct {v0, p2, p3}, Lcom/openfeint/internal/request/multipart/FilePartSource;-><init>(Ljava/lang/String;Ljava/io/File;)V */
/* invoke-direct {p0, p1, v0, p4, p5}, Lcom/openfeint/internal/request/multipart/FilePart;-><init>(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 176 */
return;
} // .end method
/* # virtual methods */
protected com.openfeint.internal.request.multipart.PartSource getSource ( ) {
/* .locals 1 */
/* .prologue */
/* .line 230 */
v0 = this.source;
} // .end method
protected Long lengthOfData ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 240 */
v0 = this.source;
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
protected void sendData ( java.io.OutputStream p0 ) {
/* .locals 7 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 203 */
(( com.openfeint.internal.request.multipart.FilePart ) p0 ).lengthOfData ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/FilePart;->lengthOfData()J
/* move-result-wide v3 */
/* const-wide/16 v5, 0x0 */
/* cmp-long v3, v3, v5 */
/* if-nez v3, :cond_0 */
/* .line 222 */
} // :goto_0
return;
/* .line 211 */
} // :cond_0
/* const/16 v3, 0x1000 */
/* new-array v2, v3, [B */
/* .line 212 */
/* .local v2, "tmp":[B */
v3 = this.source;
/* .line 215 */
/* .local v0, "instream":Ljava/io/InputStream; */
} // :goto_1
try { // :try_start_0
v1 = (( java.io.InputStream ) v0 ).read ( v2 ); // invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I
/* .local v1, "len":I */
/* if-ltz v1, :cond_1 */
/* .line 216 */
int v3 = 0; // const/4 v3, 0x0
(( java.io.OutputStream ) p1 ).write ( v2, v3, v1 ); // invoke-virtual {p1, v2, v3, v1}, Ljava/io/OutputStream;->write([BII)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 220 */
} // .end local v1 # "len":I
/* :catchall_0 */
/* move-exception v3 */
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
/* throw v3 */
/* .restart local v1 # "len":I */
} // :cond_1
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
} // .end method
protected void sendDispositionHeader ( java.io.OutputStream p0 ) {
/* .locals 2 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 186 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/multipart/PartBase;->sendDispositionHeader(Ljava/io/OutputStream;)V */
/* .line 187 */
v1 = this.source;
/* .line 188 */
/* .local v0, "filename":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 189 */
v1 = com.openfeint.internal.request.multipart.FilePart.FILE_NAME_BYTES;
(( java.io.OutputStream ) p1 ).write ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 190 */
v1 = com.openfeint.internal.request.multipart.FilePart.QUOTE_BYTES;
(( java.io.OutputStream ) p1 ).write ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 191 */
com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
(( java.io.OutputStream ) p1 ).write ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 192 */
v1 = com.openfeint.internal.request.multipart.FilePart.QUOTE_BYTES;
(( java.io.OutputStream ) p1 ).write ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 194 */
} // :cond_0
return;
} // .end method
