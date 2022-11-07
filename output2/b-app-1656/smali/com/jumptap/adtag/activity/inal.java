class inal extends org.xml.sax.helpers.DefaultHandler {
	 /* .source "JTVideo.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/activity/JTVideo;->parseAdContent(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* # instance fields */
private Boolean isAdID;
private Boolean isClickThrough;
private Boolean isImpression;
private Boolean isMediaFile;
private Boolean isUrl;
/* # direct methods */
 inal ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 353 */
/* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
/* .line 356 */
/* iput-boolean v0, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isImpression:Z */
/* .line 357 */
/* iput-boolean v0, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isClickThrough:Z */
/* .line 358 */
/* iput-boolean v0, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isMediaFile:Z */
/* .line 359 */
/* iput-boolean v0, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isUrl:Z */
/* .line 360 */
/* iput-boolean v0, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isAdID:Z */
return;
} // .end method
/* # virtual methods */
public void characters ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "ch" # [C */
/* .param p2, "start" # I */
/* .param p3, "length" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 397 */
/* invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/DefaultHandler;->characters([CII)V */
/* .line 398 */
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V */
/* .line 399 */
/* .local v0, "text":Ljava/lang/String; */
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 400 */
/* iget-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isUrl:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
if ( v0 != null) { // if-eqz v0, :cond_3
	 final String v1 = ""; // const-string v1, ""
	 v1 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v1, :cond_3 */
	 /* .line 401 */
	 /* iget-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isImpression:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 402 */
		 com.jumptap.adtag.activity.JTVideo .access$300 ( );
		 /* .line 411 */
	 } // :cond_0
} // :goto_0
return;
/* .line 403 */
} // :cond_1
/* iget-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isClickThrough:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 404 */
com.jumptap.adtag.activity.JTVideo .access$402 ( v0 );
/* .line 405 */
} // :cond_2
/* iget-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isMediaFile:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 406 */
com.jumptap.adtag.activity.JTVideo .access$102 ( v0 );
/* .line 408 */
} // :cond_3
/* iget-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isAdID:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
	 final String v1 = ""; // const-string v1, ""
	 v1 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v1, :cond_0 */
	 /* .line 409 */
	 com.jumptap.adtag.activity.JTVideo .access$202 ( v0 );
} // .end method
public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
	 /* .locals 2 */
	 /* .param p1, "uri" # Ljava/lang/String; */
	 /* .param p2, "localName" # Ljava/lang/String; */
	 /* .param p3, "name" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/xml/sax/SAXException; */
	 /* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 382 */
/* invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/DefaultHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 383 */
final String v0 = "Impression"; // const-string v0, "Impression"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 384 */
	 /* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isImpression:Z */
	 /* .line 394 */
} // :cond_0
} // :goto_0
return;
/* .line 385 */
} // :cond_1
final String v0 = "ClickThrough"; // const-string v0, "ClickThrough"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 386 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isClickThrough:Z */
/* .line 387 */
} // :cond_2
final String v0 = "MediaFile"; // const-string v0, "MediaFile"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 388 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isMediaFile:Z */
/* .line 389 */
} // :cond_3
final String v0 = "URL"; // const-string v0, "URL"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 390 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isUrl:Z */
/* .line 391 */
} // :cond_4
final String v0 = "AdID"; // const-string v0, "AdID"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 392 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isAdID:Z */
} // .end method
public void startDocument ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 363 */
/* invoke-super {p0}, Lorg/xml/sax/helpers/DefaultHandler;->startDocument()V */
/* .line 364 */
return;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
/* .locals 2 */
/* .param p1, "uri" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "name" # Ljava/lang/String; */
/* .param p4, "atts" # Lorg/xml/sax/Attributes; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 367 */
/* invoke-super {p0, p1, p2, p3, p4}, Lorg/xml/sax/helpers/DefaultHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V */
/* .line 368 */
final String v0 = "Impression"; // const-string v0, "Impression"
v0 = (( java.lang.String ) p2 ).compareTo ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-nez v0, :cond_1 */
/* .line 369 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isImpression:Z */
/* .line 379 */
} // :cond_0
} // :goto_0
return;
/* .line 370 */
} // :cond_1
final String v0 = "ClickThrough"; // const-string v0, "ClickThrough"
v0 = (( java.lang.String ) p2 ).compareTo ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-nez v0, :cond_2 */
/* .line 371 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isClickThrough:Z */
/* .line 372 */
} // :cond_2
final String v0 = "MediaFile"; // const-string v0, "MediaFile"
v0 = (( java.lang.String ) p2 ).compareTo ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-nez v0, :cond_3 */
/* .line 373 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isMediaFile:Z */
/* .line 374 */
} // :cond_3
final String v0 = "URL"; // const-string v0, "URL"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 375 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isUrl:Z */
/* .line 376 */
} // :cond_4
final String v0 = "AdID"; // const-string v0, "AdID"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 377 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/activity/JTVideo$2;->isAdID:Z */
} // .end method
