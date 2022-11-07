class inal implements java.io.FilenameFilter {
	 /* .source "CoronaText.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaText;->getFonts()[Ljava/lang/String; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 224 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean accept ( java.io.File p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "f" # Ljava/io/File; */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 226 */
final String v0 = ".ttf"; // const-string v0, ".ttf"
v0 = (( java.lang.String ) p2 ).endsWith ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
} // .end method
