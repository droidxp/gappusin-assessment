public class com.openfeint.internal.request.multipart.FilePartSource implements com.openfeint.internal.request.multipart.PartSource {
	 /* .source "FilePartSource.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private java.io.File file;
	 private java.lang.String fileName;
	 /* # direct methods */
	 public com.openfeint.internal.request.multipart.FilePartSource ( ) {
		 /* .locals 2 */
		 /* .param p1, "file" # Ljava/io/File; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/FileNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 65 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 52 */
	 this.file = v0;
	 /* .line 55 */
	 this.fileName = v0;
	 /* .line 66 */
	 this.file = p1;
	 /* .line 67 */
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 68 */
		 v0 = 		 (( java.io.File ) p1 ).isFile ( ); // invoke-virtual {p1}, Ljava/io/File;->isFile()Z
		 /* if-nez v0, :cond_0 */
		 /* .line 69 */
		 /* new-instance v0, Ljava/io/FileNotFoundException; */
		 final String v1 = "File is not a normal file."; // const-string v1, "File is not a normal file."
		 /* invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* .line 71 */
	 } // :cond_0
	 v0 = 	 (( java.io.File ) p1 ).canRead ( ); // invoke-virtual {p1}, Ljava/io/File;->canRead()Z
	 /* if-nez v0, :cond_1 */
	 /* .line 72 */
	 /* new-instance v0, Ljava/io/FileNotFoundException; */
	 final String v1 = "File is not readable."; // const-string v1, "File is not readable."
	 /* invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 74 */
} // :cond_1
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
this.fileName = v0;
/* .line 76 */
} // :cond_2
return;
} // .end method
public com.openfeint.internal.request.multipart.FilePartSource ( ) {
/* .locals 0 */
/* .param p1, "fileName" # Ljava/lang/String; */
/* .param p2, "file" # Ljava/io/File; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 89 */
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/multipart/FilePartSource;-><init>(Ljava/io/File;)V */
/* .line 90 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 91 */
this.fileName = p1;
/* .line 93 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public java.io.InputStream createInputStream ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 124 */
v0 = this.file;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 125 */
/* new-instance v0, Ljava/io/FileInputStream; */
v1 = this.file;
/* invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 127 */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/io/ByteArrayInputStream; */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [B */
/* invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
} // .end method
public java.lang.String getFileName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 114 */
v0 = this.fileName;
/* if-nez v0, :cond_0 */
final String v0 = "noname"; // const-string v0, "noname"
} // :goto_0
} // :cond_0
v0 = this.fileName;
} // .end method
public Long getLength ( ) {
/* .locals 2 */
/* .prologue */
/* .line 101 */
v0 = this.file;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 102 */
v0 = this.file;
(( java.io.File ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/io/File;->length()J
/* move-result-wide v0 */
/* .line 104 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
/* const-wide/16 v0, 0x0 */
} // .end method
