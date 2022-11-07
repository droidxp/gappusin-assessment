public class com.openfeint.internal.request.multipart.StringPart extends com.openfeint.internal.request.multipart.PartBase {
	 /* .source "StringPart.java" */
	 /* # static fields */
	 public static final java.lang.String DEFAULT_CHARSET;
	 public static final java.lang.String DEFAULT_CONTENT_TYPE;
	 public static final java.lang.String DEFAULT_TRANSFER_ENCODING;
	 /* # instance fields */
	 private content;
	 private java.lang.String value;
	 /* # direct methods */
	 public com.openfeint.internal.request.multipart.StringPart ( ) {
		 /* .locals 1 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .param p2, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 98 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/openfeint/internal/request/multipart/StringPart;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
		 /* .line 99 */
		 return;
	 } // .end method
	 public com.openfeint.internal.request.multipart.StringPart ( ) {
		 /* .locals 2 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .param p2, "value" # Ljava/lang/String; */
		 /* .param p3, "charset" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 75 */
		 final String v0 = "text/html"; // const-string v0, "text/html"
		 /* if-nez p3, :cond_0 */
		 final String p3 = "UTF-8"; // const-string p3, "UTF-8"
	 } // .end local p3 # "charset":Ljava/lang/String;
} // :cond_0
final String v1 = "8bit"; // const-string v1, "8bit"
/* invoke-direct {p0, p1, v0, p3, v1}, Lcom/openfeint/internal/request/multipart/PartBase;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 81 */
/* if-nez p2, :cond_1 */
/* .line 82 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Value may not be null"; // const-string v1, "Value may not be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 84 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
v0 = (( java.lang.String ) p2 ).indexOf ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_2 */
/* .line 86 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "NULs may not be present in string parts"; // const-string v1, "NULs may not be present in string parts"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 88 */
} // :cond_2
this.value = p2;
/* .line 89 */
return;
} // .end method
private getContent ( ) {
/* .locals 2 */
/* .prologue */
/* .line 108 */
v0 = this.content;
/* if-nez v0, :cond_0 */
/* .line 109 */
v0 = this.value;
(( com.openfeint.internal.request.multipart.StringPart ) p0 ).getCharSet ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/multipart/StringPart;->getCharSet()Ljava/lang/String;
com.openfeint.internal.request.multipart.EncodingUtil .getBytes ( v0,v1 );
this.content = v0;
/* .line 111 */
} // :cond_0
v0 = this.content;
} // .end method
/* # virtual methods */
protected Long lengthOfData ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 130 */
/* invoke-direct {p0}, Lcom/openfeint/internal/request/multipart/StringPart;->getContent()[B */
/* array-length v0, v0 */
/* int-to-long v0, v0 */
/* return-wide v0 */
} // .end method
protected void sendData ( java.io.OutputStream p0 ) {
/* .locals 1 */
/* .param p1, "out" # Ljava/io/OutputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 120 */
/* invoke-direct {p0}, Lcom/openfeint/internal/request/multipart/StringPart;->getContent()[B */
(( java.io.OutputStream ) p1 ).write ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
/* .line 121 */
return;
} // .end method
public void setCharSet ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "charSet" # Ljava/lang/String; */
/* .prologue */
/* .line 137 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/multipart/PartBase;->setCharSet(Ljava/lang/String;)V */
/* .line 138 */
int v0 = 0; // const/4 v0, 0x0
this.content = v0;
/* .line 139 */
return;
} // .end method
