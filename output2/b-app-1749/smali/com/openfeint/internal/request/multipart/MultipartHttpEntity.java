public class com.openfeint.internal.request.multipart.MultipartHttpEntity implements org.apache.http.HttpEntity {
	 /* .source "MultipartHttpEntity.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static MULTIPART_CHARS;
	 private static final java.lang.String MULTIPART_FORM_CONTENT_TYPE;
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private multipartBoundary;
	 protected com.openfeint.internal.request.multipart.Part parts;
	 /* # direct methods */
	 static com.openfeint.internal.request.multipart.MultipartHttpEntity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 90 */
		 final String v0 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; // const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
		 com.openfeint.internal.request.multipart.EncodingUtil .getAsciiBytes ( v0 );
		 return;
	 } // .end method
	 public com.openfeint.internal.request.multipart.MultipartHttpEntity ( ) {
		 /* .locals 2 */
		 /* .param p1, "parts" # [Lcom/openfeint/internal/request/multipart/Part; */
		 /* .prologue */
		 /* .line 115 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 116 */
		 /* if-nez p1, :cond_0 */
		 /* .line 117 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "parts cannot be null"; // const-string v1, "parts cannot be null"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* .line 119 */
	 } // :cond_0
	 this.parts = p1;
	 /* .line 120 */
	 return;
} // .end method
private static generateMultipartBoundary ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 98 */
	 /* new-instance v2, Ljava/util/Random; */
	 /* invoke-direct {v2}, Ljava/util/Random;-><init>()V */
	 /* .line 99 */
	 /* .local v2, "rand":Ljava/util/Random; */
	 /* const/16 v3, 0xb */
	 v3 = 	 (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/lit8 v3, v3, 0x1e */
	 /* new-array v0, v3, [B */
	 /* .line 100 */
	 /* .local v0, "bytes":[B */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .local v1, "i":I */
} // :goto_0
/* array-length v3, v0 */
/* if-ge v1, v3, :cond_0 */
/* .line 101 */
v3 = com.openfeint.internal.request.multipart.MultipartHttpEntity.MULTIPART_CHARS;
v4 = com.openfeint.internal.request.multipart.MultipartHttpEntity.MULTIPART_CHARS;
/* array-length v4, v4 */
v4 = (( java.util.Random ) v2 ).nextInt ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/Random;->nextInt(I)I
/* aget-byte v3, v3, v4 */
/* aput-byte v3, v0, v1 */
/* .line 100 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 103 */
} // :cond_0
} // .end method
/* # virtual methods */
public void consumeContent ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 182 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw v0 */
} // .end method
public java.io.InputStream getContent ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/lang/IllegalStateException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 186 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw v0 */
} // .end method
public org.apache.http.Header getContentEncoding ( ) {
/* .locals 3 */
/* .prologue */
/* .line 190 */
/* new-instance v0, Lorg/apache/http/message/BasicHeader; */
final String v1 = "Content-Encoding"; // const-string v1, "Content-Encoding"
final String v2 = "text/html; charset=UTF-8"; // const-string v2, "text/html; charset=UTF-8"
/* invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // .end method
public Long getContentLength ( ) {
/* .locals 3 */
/* .prologue */
/* .line 163 */
try { // :try_start_0
v1 = this.parts;
(( com.openfeint.internal.request.multipart.MultipartHttpEntity ) p0 ).getMultipartBoundary ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/MultipartHttpEntity;->getMultipartBoundary()[B
com.openfeint.internal.request.multipart.Part .getLengthOfParts ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-result-wide v1 */
/* .line 166 */
} // :goto_0
/* return-wide v1 */
/* .line 164 */
/* :catch_0 */
/* move-exception v0 */
/* .line 165 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "MultipartRequestEntity"; // const-string v1, "MultipartRequestEntity"
final String v2 = "An exception occurred while getting the length of the parts"; // const-string v2, "An exception occurred while getting the length of the parts"
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 166 */
/* const-wide/16 v1, 0x0 */
} // .end method
public org.apache.http.Header getContentType ( ) {
/* .locals 4 */
/* .prologue */
/* .line 174 */
/* new-instance v0, Ljava/lang/StringBuffer; */
final String v1 = "multipart/form-data"; // const-string v1, "multipart/form-data"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 175 */
/* .local v0, "buffer":Ljava/lang/StringBuffer; */
final String v1 = "; boundary="; // const-string v1, "; boundary="
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 176 */
(( com.openfeint.internal.request.multipart.MultipartHttpEntity ) p0 ).getMultipartBoundary ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/MultipartHttpEntity;->getMultipartBoundary()[B
com.openfeint.internal.request.multipart.EncodingUtil .getAsciiString ( v1 );
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 177 */
/* new-instance v1, Lorg/apache/http/message/BasicHeader; */
final String v2 = "Content-Type"; // const-string v2, "Content-Type"
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // .end method
protected getMultipartBoundary ( ) {
/* .locals 1 */
/* .prologue */
/* .line 132 */
v0 = this.multipartBoundary;
/* if-nez v0, :cond_0 */
/* .line 133 */
com.openfeint.internal.request.multipart.MultipartHttpEntity .generateMultipartBoundary ( );
this.multipartBoundary = v0;
/* .line 135 */
} // :cond_0
v0 = this.multipartBoundary;
} // .end method
public Boolean isChunked ( ) {
/* .locals 4 */
/* .prologue */
/* .line 194 */
(( com.openfeint.internal.request.multipart.MultipartHttpEntity ) p0 ).getContentLength ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/MultipartHttpEntity;->getContentLength()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
/* if-gez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isRepeatable ( ) {
/* .locals 2 */
/* .prologue */
/* .line 143 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
v1 = this.parts;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
/* .line 144 */
v1 = this.parts;
/* aget-object v1, v1, v0 */
v1 = (( com.openfeint.internal.request.multipart.Part ) v1 ).isRepeatable ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/multipart/Part;->isRepeatable()Z
/* if-nez v1, :cond_0 */
/* .line 145 */
int v1 = 0; // const/4 v1, 0x0
/* .line 148 */
} // :goto_1
/* .line 143 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 148 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // .end method
public Boolean isStreaming ( ) {
/* .locals 1 */
/* .prologue */
/* .line 198 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeTo ( java.io.OutputStream p0 ) {
/* .locals 2 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 155 */
v0 = this.parts;
(( com.openfeint.internal.request.multipart.MultipartHttpEntity ) p0 ).getMultipartBoundary ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/MultipartHttpEntity;->getMultipartBoundary()[B
com.openfeint.internal.request.multipart.Part .sendParts ( p1,v0,v1 );
/* .line 156 */
return;
} // .end method
