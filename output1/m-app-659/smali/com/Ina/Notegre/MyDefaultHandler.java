public class com.Ina.Notegre.MyDefaultHandler extends org.xml.sax.helpers.DefaultHandler {
	 /* .source "MyDefaultHandler.java" */
	 /* # instance fields */
	 public Boolean bReaded;
	 private java.lang.String currentElementName;
	 private java.lang.String lastName;
	 public java.util.List mConList;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.List mFolList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
private java.util.Map map;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.Ina.Notegre.MyDefaultHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 12 */
/* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
/* .line 14 */
final String v0 = ""; // const-string v0, ""
this.currentElementName = v0;
/* .line 15 */
final String v0 = ""; // const-string v0, ""
this.lastName = v0;
/* .line 16 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/Ina/Notegre/MyDefaultHandler;->bReaded:Z */
/* .line 18 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mConList = v0;
/* .line 19 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mFolList = v0;
/* .line 12 */
return;
} // .end method
/* # virtual methods */
public void characters ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .param p1, "ch" # [C */
/* .param p2, "start" # I */
/* .param p3, "length" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 25 */
/* invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/DefaultHandler;->characters([CII)V */
/* .line 26 */
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V */
/* .line 28 */
/* .local v0, "conString":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
final String v1 = ""; // const-string v1, ""
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* .line 30 */
v1 = this.currentElementName;
final String v2 = "id"; // const-string v2, "id"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 32 */
v1 = this.map;
final String v2 = "id"; // const-string v2, "id"
/* .line 49 */
} // :cond_0
} // :goto_0
v1 = this.currentElementName;
this.lastName = v1;
/* .line 51 */
} // :cond_1
return;
/* .line 34 */
} // :cond_2
v1 = this.currentElementName;
final String v2 = "title"; // const-string v2, "title"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = this.map;
final String v2 = "title"; // const-string v2, "title"
/* .line 35 */
} // :cond_3
v1 = this.currentElementName;
final String v2 = "time"; // const-string v2, "time"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.map;
final String v2 = "time"; // const-string v2, "time"
/* .line 36 */
} // :cond_4
v1 = this.currentElementName;
final String v2 = "folder_index"; // const-string v2, "folder_index"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
v1 = this.map;
final String v2 = "folder_index"; // const-string v2, "folder_index"
/* .line 37 */
} // :cond_5
v1 = this.currentElementName;
final String v2 = "content"; // const-string v2, "content"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 38 */
v1 = this.currentElementName;
v2 = this.lastName;
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 40 */
v1 = this.map;
final String v2 = "content"; // const-string v2, "content"
/* new-instance v3, Ljava/lang/StringBuilder; */
v4 = this.map;
final String v5 = "content"; // const-string v5, "content"
(( java.lang.Object ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
java.lang.String .valueOf ( v4 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 44 */
} // :cond_6
v1 = this.map;
final String v2 = "content"; // const-string v2, "content"
/* .line 47 */
} // :cond_7
v1 = this.currentElementName;
final String v2 = "name"; // const-string v2, "name"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.map;
final String v2 = "name"; // const-string v2, "name"
/* goto/16 :goto_0 */
} // .end method
public void endDocument ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 56 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/Ina/Notegre/MyDefaultHandler;->bReaded:Z */
/* .line 58 */
/* invoke-super {p0}, Lorg/xml/sax/helpers/DefaultHandler;->endDocument()V */
/* .line 59 */
return;
} // .end method
public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .param p1, "uri" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 65 */
/* invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/DefaultHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 66 */
final String v0 = "item"; // const-string v0, "item"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 68 */
v0 = this.mConList;
v1 = this.map;
/* .line 74 */
} // :cond_0
} // :goto_0
return;
/* .line 70 */
} // :cond_1
final String v0 = "folder"; // const-string v0, "folder"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 72 */
v0 = this.mFolList;
v1 = this.map;
} // .end method
public void startDocument ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 80 */
/* invoke-super {p0}, Lorg/xml/sax/helpers/DefaultHandler;->startDocument()V */
/* .line 81 */
return;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
/* .locals 2 */
/* .param p1, "uri" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .param p4, "attributes" # Lorg/xml/sax/Attributes; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 87 */
/* invoke-super {p0, p1, p2, p3, p4}, Lorg/xml/sax/helpers/DefaultHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V */
/* .line 89 */
this.currentElementName = p2;
/* .line 90 */
v0 = this.currentElementName;
final String v1 = "item"; // const-string v1, "item"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
v0 = this.currentElementName;
final String v1 = "folder"; // const-string v1, "folder"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 92 */
} // :cond_0
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.map = v0;
/* .line 94 */
} // :cond_1
return;
} // .end method
