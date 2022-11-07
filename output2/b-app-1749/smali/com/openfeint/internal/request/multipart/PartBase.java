public abstract class com.openfeint.internal.request.multipart.PartBase extends com.openfeint.internal.request.multipart.Part {
	 /* .source "PartBase.java" */
	 /* # instance fields */
	 private java.lang.String charSet;
	 private java.lang.String contentType;
	 private java.lang.String name;
	 private java.lang.String transferEncoding;
	 /* # direct methods */
	 public com.openfeint.internal.request.multipart.PartBase ( ) {
		 /* .locals 2 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .param p2, "contentType" # Ljava/lang/String; */
		 /* .param p3, "charSet" # Ljava/lang/String; */
		 /* .param p4, "transferEncoding" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 60 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/multipart/Part;-><init>()V */
		 /* .line 62 */
		 /* if-nez p1, :cond_0 */
		 /* .line 63 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "Name must not be null"; // const-string v1, "Name must not be null"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* .line 65 */
	 } // :cond_0
	 this.name = p1;
	 /* .line 66 */
	 this.contentType = p2;
	 /* .line 67 */
	 this.charSet = p3;
	 /* .line 68 */
	 this.transferEncoding = p4;
	 /* .line 69 */
	 return;
} // .end method
/* # virtual methods */
public java.lang.String getCharSet ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 93 */
	 v0 = this.charSet;
} // .end method
public java.lang.String getContentType ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 85 */
	 v0 = this.contentType;
} // .end method
public java.lang.String getName ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 77 */
	 v0 = this.name;
} // .end method
public java.lang.String getTransferEncoding ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 101 */
	 v0 = this.transferEncoding;
} // .end method
public void setCharSet ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .param p1, "charSet" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 111 */
	 this.charSet = p1;
	 /* .line 112 */
	 return;
} // .end method
public void setContentType ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .param p1, "contentType" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 120 */
	 this.contentType = p1;
	 /* .line 121 */
	 return;
} // .end method
public void setName ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .param p1, "name" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 129 */
	 /* if-nez p1, :cond_0 */
	 /* .line 130 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "Name must not be null"; // const-string v1, "Name must not be null"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 132 */
} // :cond_0
this.name = p1;
/* .line 133 */
return;
} // .end method
public void setTransferEncoding ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "transferEncoding" # Ljava/lang/String; */
/* .prologue */
/* .line 142 */
this.transferEncoding = p1;
/* .line 143 */
return;
} // .end method
