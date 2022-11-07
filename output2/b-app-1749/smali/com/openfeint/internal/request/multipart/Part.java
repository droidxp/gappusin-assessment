public abstract class com.openfeint.internal.request.multipart.Part {
	 /* .source "Part.java" */
	 /* # static fields */
	 protected static final java.lang.String BOUNDARY;
	 protected static final BOUNDARY_BYTES;
	 protected static final java.lang.String CHARSET;
	 protected static final CHARSET_BYTES;
	 protected static final java.lang.String CONTENT_DISPOSITION;
	 protected static final CONTENT_DISPOSITION_BYTES;
	 protected static final java.lang.String CONTENT_TRANSFER_ENCODING;
	 protected static final CONTENT_TRANSFER_ENCODING_BYTES;
	 protected static final java.lang.String CONTENT_TYPE;
	 protected static final CONTENT_TYPE_BYTES;
	 protected static final java.lang.String CRLF;
	 protected static final CRLF_BYTES;
	 private static final DEFAULT_BOUNDARY_BYTES;
	 protected static final java.lang.String EXTRA;
	 protected static final EXTRA_BYTES;
	 protected static final java.lang.String QUOTE;
	 protected static final QUOTE_BYTES;
	 /* # instance fields */
	 private boundaryBytes;
	 /* # direct methods */
	 static com.openfeint.internal.request.multipart.Part ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 62 */
		 final String v0 = "----------------ULTRASONIC_CUPCAKES___-__-"; // const-string v0, "----------------ULTRASONIC_CUPCAKES___-__-"
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 /* .line 68 */
		 v0 = com.openfeint.internal.request.multipart.Part.BOUNDARY_BYTES;
		 /* .line 74 */
		 final String v0 = "\r\n"; // const-string v0, "\r\n"
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 /* .line 80 */
		 final String v0 = "\""; // const-string v0, "\""
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 /* .line 87 */
		 final String v0 = "--"; // const-string v0, "--"
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 /* .line 94 */
		 final String v0 = "Content-Disposition: form-data; name="; // const-string v0, "Content-Disposition: form-data; name="
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 /* .line 101 */
		 final String v0 = "Content-Type: "; // const-string v0, "Content-Type: "
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 /* .line 108 */
		 final String v0 = "; charset="; // const-string v0, "; charset="
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 /* .line 115 */
		 final String v0 = "Content-Transfer-Encoding: "; // const-string v0, "Content-Transfer-Encoding: "
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 return;
	 } // .end method
	 public com.openfeint.internal.request.multipart.Part ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String getBoundary ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 124 */
		 final String v0 = "----------------ULTRASONIC_CUPCAKES___-__-"; // const-string v0, "----------------ULTRASONIC_CUPCAKES___-__-"
	 } // .end method
	 public static Long getLengthOfParts ( com.openfeint.internal.request.multipart.Part[] p0 ) {
		 /* .locals 2 */
		 /* .param p0, "parts" # [Lcom/openfeint/internal/request/multipart/Part; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 390 */
	 v0 = com.openfeint.internal.request.multipart.Part.DEFAULT_BOUNDARY_BYTES;
	 com.openfeint.internal.request.multipart.Part .getLengthOfParts ( p0,v0 );
	 /* move-result-wide v0 */
	 /* return-wide v0 */
} // .end method
public static Long getLengthOfParts ( com.openfeint.internal.request.multipart.Part[] p0, Object[] p1 ) {
	 /* .locals 7 */
	 /* .param p0, "parts" # [Lcom/openfeint/internal/request/multipart/Part; */
	 /* .param p1, "partBoundary" # [B */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 405 */
/* if-nez p0, :cond_0 */
/* .line 406 */
/* new-instance v5, Ljava/lang/IllegalArgumentException; */
final String v6 = "Parts may not be null"; // const-string v6, "Parts may not be null"
/* invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
/* .line 408 */
} // :cond_0
/* const-wide/16 v3, 0x0 */
/* .line 409 */
/* .local v3, "total":J */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v5, p0 */
/* if-ge v0, v5, :cond_2 */
/* .line 411 */
/* aget-object v5, p0, v0 */
(( com.openfeint.internal.request.multipart.Part ) v5 ).setPartBoundary ( p1 ); // invoke-virtual {v5, p1}, Lcom/openfeint/internal/request/multipart/Part;->setPartBoundary([B)V
/* .line 412 */
/* aget-object v5, p0, v0 */
(( com.openfeint.internal.request.multipart.Part ) v5 ).length ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/request/multipart/Part;->length()J
/* move-result-wide v1 */
/* .line 413 */
/* .local v1, "l":J */
/* const-wide/16 v5, 0x0 */
/* cmp-long v5, v1, v5 */
/* if-gez v5, :cond_1 */
/* .line 414 */
/* const-wide/16 v5, -0x1 */
/* .line 422 */
} // .end local v1 # "l":J
} // :goto_1
/* return-wide v5 */
/* .line 416 */
/* .restart local v1 # "l":J */
} // :cond_1
/* add-long/2addr v3, v1 */
/* .line 409 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 418 */
} // .end local v1 # "l":J
} // :cond_2
v5 = com.openfeint.internal.request.multipart.Part.EXTRA_BYTES;
/* array-length v5, v5 */
/* int-to-long v5, v5 */
/* add-long/2addr v3, v5 */
/* .line 419 */
/* array-length v5, p1 */
/* int-to-long v5, v5 */
/* add-long/2addr v3, v5 */
/* .line 420 */
v5 = com.openfeint.internal.request.multipart.Part.EXTRA_BYTES;
/* array-length v5, v5 */
/* int-to-long v5, v5 */
/* add-long/2addr v3, v5 */
/* .line 421 */
v5 = com.openfeint.internal.request.multipart.Part.CRLF_BYTES;
/* array-length v5, v5 */
/* int-to-long v5, v5 */
/* add-long/2addr v3, v5 */
/* move-wide v5, v3 */
/* .line 422 */
} // .end method
public static void sendParts ( java.io.OutputStream p0, com.openfeint.internal.request.multipart.Part[] p1 ) {
/* .locals 1 */
/* .param p0, "out" # Ljava/io/OutputStream; */
/* .param p1, "parts" # [Lcom/openfeint/internal/request/multipart/Part; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 346 */
v0 = com.openfeint.internal.request.multipart.Part.DEFAULT_BOUNDARY_BYTES;
com.openfeint.internal.request.multipart.Part .sendParts ( p0,p1,v0 );
/* .line 347 */
return;
} // .end method
public static void sendParts ( java.io.OutputStream p0, com.openfeint.internal.request.multipart.Part[] p1, Object[] p2 ) {
/* .locals 3 */
/* .param p0, "out" # Ljava/io/OutputStream; */
/* .param p1, "parts" # [Lcom/openfeint/internal/request/multipart/Part; */
/* .param p2, "partBoundary" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 363 */
/* if-nez p1, :cond_0 */
/* .line 364 */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
final String v2 = "Parts may not be null"; // const-string v2, "Parts may not be null"
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 366 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* array-length v1, p2 */
/* if-nez v1, :cond_2 */
/* .line 367 */
} // :cond_1
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
final String v2 = "partBoundary may not be empty"; // const-string v2, "partBoundary may not be empty"
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 369 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_3 */
/* .line 371 */
/* aget-object v1, p1, v0 */
(( com.openfeint.internal.request.multipart.Part ) v1 ).setPartBoundary ( p2 ); // invoke-virtual {v1, p2}, Lcom/openfeint/internal/request/multipart/Part;->setPartBoundary([B)V
/* .line 372 */
/* aget-object v1, p1, v0 */
(( com.openfeint.internal.request.multipart.Part ) v1 ).send ( p0 ); // invoke-virtual {v1, p0}, Lcom/openfeint/internal/request/multipart/Part;->send(Ljava/io/OutputStream;)V
/* .line 369 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 374 */
} // :cond_3
v1 = com.openfeint.internal.request.multipart.Part.EXTRA_BYTES;
(( java.io.OutputStream ) p0 ).write ( v1 ); // invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 375 */
(( java.io.OutputStream ) p0 ).write ( p2 ); // invoke-virtual {p0, p2}, Ljava/io/OutputStream;->write([B)V
/* .line 376 */
v1 = com.openfeint.internal.request.multipart.Part.EXTRA_BYTES;
(( java.io.OutputStream ) p0 ).write ( v1 ); // invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 377 */
v1 = com.openfeint.internal.request.multipart.Part.CRLF_BYTES;
(( java.io.OutputStream ) p0 ).write ( v1 ); // invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 378 */
return;
} // .end method
/* # virtual methods */
public abstract java.lang.String getCharSet ( ) {
} // .end method
public abstract java.lang.String getContentType ( ) {
} // .end method
public abstract java.lang.String getName ( ) {
} // .end method
protected getPartBoundary ( ) {
/* .locals 1 */
/* .prologue */
/* .line 164 */
v0 = this.boundaryBytes;
/* if-nez v0, :cond_0 */
/* .line 166 */
v0 = com.openfeint.internal.request.multipart.Part.DEFAULT_BOUNDARY_BYTES;
/* .line 168 */
} // :goto_0
} // :cond_0
v0 = this.boundaryBytes;
} // .end method
public abstract java.lang.String getTransferEncoding ( ) {
} // .end method
public Boolean isRepeatable ( ) {
/* .locals 1 */
/* .prologue */
/* .line 190 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Long length ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 314 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).lengthOfData ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/Part;->lengthOfData()J
/* move-result-wide v1 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v1, v1, v3 */
/* if-gez v1, :cond_0 */
/* .line 315 */
/* const-wide/16 v1, -0x1 */
/* .line 324 */
} // :goto_0
/* return-wide v1 */
/* .line 317 */
} // :cond_0
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 318 */
/* .local v0, "overhead":Ljava/io/ByteArrayOutputStream; */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendStart ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/multipart/Part;->sendStart(Ljava/io/OutputStream;)V
/* .line 319 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendDispositionHeader ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/multipart/Part;->sendDispositionHeader(Ljava/io/OutputStream;)V
/* .line 320 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendContentTypeHeader ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/multipart/Part;->sendContentTypeHeader(Ljava/io/OutputStream;)V
/* .line 321 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendTransferEncodingHeader ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/multipart/Part;->sendTransferEncodingHeader(Ljava/io/OutputStream;)V
/* .line 322 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendEndOfHeader ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/multipart/Part;->sendEndOfHeader(Ljava/io/OutputStream;)V
/* .line 323 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendEnd ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/multipart/Part;->sendEnd(Ljava/io/OutputStream;)V
/* .line 324 */
v1 = (( java.io.ByteArrayOutputStream ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I
/* int-to-long v1, v1 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).lengthOfData ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/Part;->lengthOfData()J
/* move-result-wide v3 */
/* add-long/2addr v1, v3 */
} // .end method
protected abstract Long lengthOfData ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
public void send ( java.io.OutputStream p0 ) {
/* .locals 0 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 295 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendStart ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/request/multipart/Part;->sendStart(Ljava/io/OutputStream;)V
/* .line 296 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendDispositionHeader ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/request/multipart/Part;->sendDispositionHeader(Ljava/io/OutputStream;)V
/* .line 297 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendContentTypeHeader ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/request/multipart/Part;->sendContentTypeHeader(Ljava/io/OutputStream;)V
/* .line 298 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendTransferEncodingHeader ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/request/multipart/Part;->sendTransferEncodingHeader(Ljava/io/OutputStream;)V
/* .line 299 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendEndOfHeader ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/request/multipart/Part;->sendEndOfHeader(Ljava/io/OutputStream;)V
/* .line 300 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendData ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/request/multipart/Part;->sendData(Ljava/io/OutputStream;)V
/* .line 301 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).sendEnd ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/request/multipart/Part;->sendEnd(Ljava/io/OutputStream;)V
/* .line 302 */
return;
} // .end method
protected void sendContentTypeHeader ( java.io.OutputStream p0 ) {
/* .locals 3 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 223 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).getContentType ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/Part;->getContentType()Ljava/lang/String;
/* .line 224 */
/* .local v1, "contentType":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 225 */
v2 = com.openfeint.internal.request.multipart.Part.CRLF_BYTES;
(( java.io.OutputStream ) p1 ).write ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V
/* .line 226 */
v2 = com.openfeint.internal.request.multipart.Part.CONTENT_TYPE_BYTES;
(( java.io.OutputStream ) p1 ).write ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V
/* .line 227 */
com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v1 );
(( java.io.OutputStream ) p1 ).write ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V
/* .line 228 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).getCharSet ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/Part;->getCharSet()Ljava/lang/String;
/* .line 229 */
/* .local v0, "charSet":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 230 */
v2 = com.openfeint.internal.request.multipart.Part.CHARSET_BYTES;
(( java.io.OutputStream ) p1 ).write ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V
/* .line 231 */
com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
(( java.io.OutputStream ) p1 ).write ( v2 ); // invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V
/* .line 234 */
} // .end local v0 # "charSet":Ljava/lang/String;
} // :cond_0
return;
} // .end method
protected abstract void sendData ( java.io.OutputStream p0 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
protected void sendDispositionHeader ( java.io.OutputStream p0 ) {
/* .locals 1 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 211 */
v0 = com.openfeint.internal.request.multipart.Part.CONTENT_DISPOSITION_BYTES;
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 212 */
v0 = com.openfeint.internal.request.multipart.Part.QUOTE_BYTES;
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 213 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).getName ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/Part;->getName()Ljava/lang/String;
com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 214 */
v0 = com.openfeint.internal.request.multipart.Part.QUOTE_BYTES;
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 215 */
return;
} // .end method
protected void sendEnd ( java.io.OutputStream p0 ) {
/* .locals 1 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 283 */
v0 = com.openfeint.internal.request.multipart.Part.CRLF_BYTES;
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 284 */
return;
} // .end method
protected void sendEndOfHeader ( java.io.OutputStream p0 ) {
/* .locals 1 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 258 */
v0 = com.openfeint.internal.request.multipart.Part.CRLF_BYTES;
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 259 */
v0 = com.openfeint.internal.request.multipart.Part.CRLF_BYTES;
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 260 */
return;
} // .end method
protected void sendStart ( java.io.OutputStream p0 ) {
/* .locals 1 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 199 */
v0 = com.openfeint.internal.request.multipart.Part.EXTRA_BYTES;
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 200 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).getPartBoundary ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/Part;->getPartBoundary()[B
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 201 */
v0 = com.openfeint.internal.request.multipart.Part.CRLF_BYTES;
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 202 */
return;
} // .end method
protected void sendTransferEncodingHeader ( java.io.OutputStream p0 ) {
/* .locals 2 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 244 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).getTransferEncoding ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/Part;->getTransferEncoding()Ljava/lang/String;
/* .line 245 */
/* .local v0, "transferEncoding":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 246 */
v1 = com.openfeint.internal.request.multipart.Part.CRLF_BYTES;
(( java.io.OutputStream ) p1 ).write ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 247 */
v1 = com.openfeint.internal.request.multipart.Part.CONTENT_TRANSFER_ENCODING_BYTES;
(( java.io.OutputStream ) p1 ).write ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 248 */
com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
(( java.io.OutputStream ) p1 ).write ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V
/* .line 250 */
} // :cond_0
return;
} // .end method
void setPartBoundary ( Object[] p0 ) {
/* .locals 0 */
/* .param p1, "boundaryBytes" # [B */
/* .prologue */
/* .line 180 */
this.boundaryBytes = p1;
/* .line 181 */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .prologue */
/* .line 333 */
(( com.openfeint.internal.request.multipart.Part ) p0 ).getName ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/Part;->getName()Ljava/lang/String;
} // .end method
