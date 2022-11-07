class com.openfeint.internal.ui.WebViewCache$SaxHandler extends org.xml.sax.helpers.DefaultHandler {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "SaxHandler" */
} // .end annotation
/* # instance fields */
java.lang.String key;
java.lang.String loadingString;
java.util.Map outputMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
final com.openfeint.internal.ui.WebViewCache this$0; //synthetic
/* # direct methods */
private com.openfeint.internal.ui.WebViewCache$SaxHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 677 */
this.this$0 = p1;
/* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
/* .line 680 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.outputMap = v0;
return;
} // .end method
 com.openfeint.internal.ui.WebViewCache$SaxHandler ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/openfeint/internal/ui/WebViewCache; */
/* .param p2, "x1" # Lcom/openfeint/internal/ui/WebViewCache$1; */
/* .prologue */
/* .line 677 */
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/ui/WebViewCache$SaxHandler;-><init>(Lcom/openfeint/internal/ui/WebViewCache;)V */
return;
} // .end method
/* # virtual methods */
public void characters ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "ch" # [C */
/* .param p2, "start" # I */
/* .param p3, "length" # I */
/* .prologue */
/* .line 697 */
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1}, Ljava/lang/String;-><init>([C)V */
/* add-int v1, p2, p3 */
(( java.lang.String ) v0 ).substring ( p2, v1 ); // invoke-virtual {v0, p2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
this.loadingString = v0;
/* .line 698 */
return;
} // .end method
public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 4 */
/* .param p1, "uri" # Ljava/lang/String; */
/* .param p2, "name" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .prologue */
/* .line 688 */
(( java.lang.String ) p2 ).trim ( ); // invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 689 */
/* .local v0, "clipped":Ljava/lang/String; */
final String v1 = "key"; // const-string v1, "key"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.loadingString;
this.key = v1;
/* .line 694 */
} // :cond_0
} // :goto_0
return;
/* .line 690 */
} // :cond_1
final String v1 = "string"; // const-string v1, "string"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 691 */
v1 = this.outputMap;
v2 = this.key;
v3 = this.loadingString;
/* .line 692 */
v1 = this.key;
v2 = this.loadingString;
com.openfeint.internal.db.DB .setClientManifest ( v1,v2 );
} // .end method
public java.util.Map getOutputMap ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 681 */
v0 = this.outputMap;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
/* .locals 1 */
/* .param p1, "uri" # Ljava/lang/String; */
/* .param p2, "name" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .param p4, "attr" # Lorg/xml/sax/Attributes; */
/* .prologue */
/* .line 684 */
final String v0 = ""; // const-string v0, ""
this.loadingString = v0;
/* .line 685 */
return;
} // .end method
