public class com.ansca.corona.MailSettings {
	 /* .source "MailSettings.java" */
	 /* # instance fields */
	 private java.util.LinkedHashSet fBccList;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/LinkedHashSet", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.lang.String fBody;
private java.util.LinkedHashSet fCcList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.LinkedHashSet fFileAttachments;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Landroid/net/Uri;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean fIsHtml;
private java.lang.String fSubject;
private java.util.LinkedHashSet fToList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.ansca.corona.MailSettings ( ) {
/* .locals 1 */
/* .prologue */
/* .line 29 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 30 */
/* new-instance v0, Ljava/util/LinkedHashSet; */
/* invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V */
this.fToList = v0;
/* .line 31 */
/* new-instance v0, Ljava/util/LinkedHashSet; */
/* invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V */
this.fCcList = v0;
/* .line 32 */
/* new-instance v0, Ljava/util/LinkedHashSet; */
/* invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V */
this.fBccList = v0;
/* .line 33 */
/* new-instance v0, Ljava/util/LinkedHashSet; */
/* invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V */
this.fFileAttachments = v0;
/* .line 34 */
final String v0 = ""; // const-string v0, ""
this.fSubject = v0;
/* .line 35 */
final String v0 = ""; // const-string v0, ""
this.fBody = v0;
/* .line 36 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/MailSettings;->fIsHtml:Z */
/* .line 37 */
return;
} // .end method
private static void addFileAttachmentObjectToCollection ( android.content.Context p0, java.util.LinkedHashSet p1, java.lang.Object p2 ) {
/* .locals 7 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p2, "value" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Landroid/net/Uri;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 320 */
/* .local p1, "collection":Ljava/util/LinkedHashSet;, "Ljava/util/LinkedHashSet<Landroid/net/Uri;>;" */
if ( p1 != null) { // if-eqz p1, :cond_0
/* if-nez p2, :cond_1 */
/* .line 358 */
} // .end local p2 # "value":Ljava/lang/Object;
} // :cond_0
} // :goto_0
return;
/* .line 325 */
/* .restart local p2 # "value":Ljava/lang/Object; */
} // :cond_1
/* instance-of v6, p2, Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 326 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 327 */
/* check-cast p2, Ljava/lang/String; */
} // .end local p2 # "value":Ljava/lang/Object;
com.ansca.corona.FileContentProvider .getContentUriFromFilePath ( p0,p2 );
(( java.util.LinkedHashSet ) p1 ).add ( v6 ); // invoke-virtual {p1, v6}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 330 */
/* .restart local p2 # "value":Ljava/lang/Object; */
} // :cond_2
/* instance-of v6, p2, [Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 331 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 332 */
/* check-cast p2, [Ljava/lang/String; */
} // .end local p2 # "value":Ljava/lang/Object;
/* move-object v0, p2 */
/* check-cast v0, [Ljava/lang/String; */
/* .local v0, "arr$":[Ljava/lang/String; */
/* array-length v4, v0 */
/* .local v4, "len$":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i$":I */
} // :goto_1
/* if-ge v3, v4, :cond_0 */
/* aget-object v2, v0, v3 */
/* .line 333 */
/* .local v2, "filePath":Ljava/lang/String; */
com.ansca.corona.FileContentProvider .getContentUriFromFilePath ( p0,v2 );
(( java.util.LinkedHashSet ) p1 ).add ( v6 ); // invoke-virtual {p1, v6}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 332 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 337 */
} // .end local v0 # "arr$":[Ljava/lang/String;
} // .end local v2 # "filePath":Ljava/lang/String;
} // .end local v3 # "i$":I
} // .end local v4 # "len$":I
/* .restart local p2 # "value":Ljava/lang/Object; */
} // :cond_3
/* instance-of v6, p2, Ljava/io/File; */
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 338 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 339 */
/* check-cast p2, Ljava/io/File; */
} // .end local p2 # "value":Ljava/lang/Object;
(( java.io.File ) p2 ).getPath ( ); // invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;
/* .line 340 */
/* .restart local v2 # "filePath":Ljava/lang/String; */
com.ansca.corona.FileContentProvider .getContentUriFromFilePath ( p0,v2 );
(( java.util.LinkedHashSet ) p1 ).add ( v6 ); // invoke-virtual {p1, v6}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 343 */
} // .end local v2 # "filePath":Ljava/lang/String;
/* .restart local p2 # "value":Ljava/lang/Object; */
} // :cond_4
/* instance-of v6, p2, [Ljava/io/File; */
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 344 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 345 */
/* check-cast p2, [Ljava/io/File; */
} // .end local p2 # "value":Ljava/lang/Object;
/* move-object v0, p2 */
/* check-cast v0, [Ljava/io/File; */
/* .local v0, "arr$":[Ljava/io/File; */
/* array-length v4, v0 */
/* .restart local v4 # "len$":I */
int v3 = 0; // const/4 v3, 0x0
/* .restart local v3 # "i$":I */
} // :goto_2
/* if-ge v3, v4, :cond_0 */
/* aget-object v1, v0, v3 */
/* .line 346 */
/* .local v1, "file":Ljava/io/File; */
(( java.io.File ) v1 ).getPath ( ); // invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
com.ansca.corona.FileContentProvider .getContentUriFromFilePath ( p0,v6 );
(( java.util.LinkedHashSet ) p1 ).add ( v6 ); // invoke-virtual {p1, v6}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 345 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 350 */
} // .end local v0 # "arr$":[Ljava/io/File;
} // .end local v1 # "file":Ljava/io/File;
} // .end local v3 # "i$":I
} // .end local v4 # "len$":I
/* .restart local p2 # "value":Ljava/lang/Object; */
} // :cond_5
/* instance-of v6, p2, Landroid/net/Uri; */
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 351 */
/* check-cast p2, Landroid/net/Uri; */
} // .end local p2 # "value":Ljava/lang/Object;
(( java.util.LinkedHashSet ) p1 ).add ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 353 */
/* .restart local p2 # "value":Ljava/lang/Object; */
} // :cond_6
/* instance-of v6, p2, [Landroid/net/Uri; */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 354 */
/* check-cast p2, [Landroid/net/Uri; */
} // .end local p2 # "value":Ljava/lang/Object;
/* move-object v0, p2 */
/* check-cast v0, [Landroid/net/Uri; */
/* .local v0, "arr$":[Landroid/net/Uri; */
/* array-length v4, v0 */
/* .restart local v4 # "len$":I */
int v3 = 0; // const/4 v3, 0x0
/* .restart local v3 # "i$":I */
} // :goto_3
/* if-ge v3, v4, :cond_0 */
/* aget-object v5, v0, v3 */
/* .line 355 */
/* .local v5, "uri":Landroid/net/Uri; */
(( java.util.LinkedHashSet ) p1 ).add ( v5 ); // invoke-virtual {p1, v5}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 354 */
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
private static void addStringObjectToCollection ( java.util.LinkedHashSet p0, java.lang.Object p1 ) {
/* .locals 7 */
/* .param p1, "value" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/Object;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 280 */
/* .local p0, "collection":Ljava/util/LinkedHashSet;, "Ljava/util/LinkedHashSet<Ljava/lang/String;>;" */
if ( p0 != null) { // if-eqz p0, :cond_0
/* if-nez p1, :cond_1 */
/* .line 306 */
} // .end local p1 # "value":Ljava/lang/Object;
} // :cond_0
} // :goto_0
return;
/* .line 286 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_1
try { // :try_start_0
/* instance-of v6, p1, Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 287 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "value":Ljava/lang/Object;
(( java.util.LinkedHashSet ) p0 ).add ( p1 ); // invoke-virtual {p0, p1}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 305 */
/* :catch_0 */
/* move-exception v6 */
/* .line 289 */
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_2
/* instance-of v6, p1, [Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 290 */
/* check-cast p1, [Ljava/lang/String; */
} // .end local p1 # "value":Ljava/lang/Object;
/* move-object v0, p1 */
/* check-cast v0, [Ljava/lang/String; */
/* move-object v1, v0 */
/* .local v1, "arr$":[Ljava/lang/String; */
/* array-length v3, v1 */
/* .local v3, "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i$":I */
} // :goto_1
/* if-ge v2, v3, :cond_0 */
/* aget-object v5, v1, v2 */
/* .line 291 */
/* .local v5, "text":Ljava/lang/String; */
(( java.util.LinkedHashSet ) p0 ).add ( v5 ); // invoke-virtual {p0, v5}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 290 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 294 */
} // .end local v1 # "arr$":[Ljava/lang/String;
} // .end local v2 # "i$":I
} // .end local v3 # "len$":I
} // .end local v5 # "text":Ljava/lang/String;
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_3
/* instance-of v6, p1, Ljava/util/HashMap; */
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 295 */
/* check-cast p1, Ljava/util/HashMap; */
} // .end local p1 # "value":Ljava/lang/Object;
(( java.util.HashMap ) p1 ).values ( ); // invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;
/* .local v2, "i$":Ljava/util/Iterator; */
} // :cond_4
v6 = } // :goto_2
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 296 */
/* .local v4, "nextObject":Ljava/lang/Object; */
/* instance-of v6, v4, Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 297 */
/* check-cast v4, Ljava/lang/String; */
} // .end local v4 # "nextObject":Ljava/lang/Object;
(( java.util.LinkedHashSet ) p0 ).add ( v4 ); // invoke-virtual {p0, v4}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 301 */
} // .end local v2 # "i$":Ljava/util/Iterator;
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_5
/* instance-of v6, p1, Ljava/util/Collection; */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 302 */
/* check-cast p1, Ljava/util/Collection; */
} // .end local p1 # "value":Ljava/lang/Object;
(( java.util.LinkedHashSet ) p0 ).addAll ( p1 ); // invoke-virtual {p0, p1}, Ljava/util/LinkedHashSet;->addAll(Ljava/util/Collection;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // .end method
public static com.ansca.corona.MailSettings from ( android.content.Context p0, java.util.HashMap p1 ) {
/* .locals 8 */
/* .param p0, "context" # Landroid/content/Context; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Lcom/ansca/corona/MailSettings;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 213 */
/* .local p1, "collection":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
/* new-instance v5, Lcom/ansca/corona/MailSettings; */
/* invoke-direct {v5}, Lcom/ansca/corona/MailSettings;-><init>()V */
/* .line 216 */
/* .local v5, "settings":Lcom/ansca/corona/MailSettings; */
/* if-nez p1, :cond_1 */
/* .line 268 */
} // :cond_0
/* .line 221 */
} // :cond_1
(( java.util.HashMap ) p1 ).entrySet ( ); // invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
} // :cond_2
v7 = } // :goto_0
if ( v7 != null) { // if-eqz v7, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 223 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;" */
/* check-cast v3, Ljava/lang/String; */
/* .line 224 */
/* .local v3, "keyName":Ljava/lang/String; */
/* .line 225 */
/* .local v6, "value":Ljava/lang/Object; */
if ( v3 != null) { // if-eqz v3, :cond_2
v7 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* if-lez v7, :cond_2 */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 230 */
(( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v7 ).trim ( ); // invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 231 */
final String v7 = "to"; // const-string v7, "to"
v7 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 232 */
(( com.ansca.corona.MailSettings ) v5 ).getToList ( ); // invoke-virtual {v5}, Lcom/ansca/corona/MailSettings;->getToList()Ljava/util/LinkedHashSet;
com.ansca.corona.MailSettings .addStringObjectToCollection ( v7,v6 );
/* .line 234 */
} // :cond_3
final String v7 = "cc"; // const-string v7, "cc"
v7 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 235 */
(( com.ansca.corona.MailSettings ) v5 ).getCcList ( ); // invoke-virtual {v5}, Lcom/ansca/corona/MailSettings;->getCcList()Ljava/util/LinkedHashSet;
com.ansca.corona.MailSettings .addStringObjectToCollection ( v7,v6 );
/* .line 237 */
} // :cond_4
final String v7 = "bcc"; // const-string v7, "bcc"
v7 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 238 */
(( com.ansca.corona.MailSettings ) v5 ).getBccList ( ); // invoke-virtual {v5}, Lcom/ansca/corona/MailSettings;->getBccList()Ljava/util/LinkedHashSet;
com.ansca.corona.MailSettings .addStringObjectToCollection ( v7,v6 );
/* .line 240 */
} // :cond_5
final String v7 = "subject"; // const-string v7, "subject"
v7 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_6
/* .line 241 */
/* instance-of v7, v6, Ljava/lang/String; */
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 242 */
/* check-cast v6, Ljava/lang/String; */
} // .end local v6 # "value":Ljava/lang/Object;
(( com.ansca.corona.MailSettings ) v5 ).setSubject ( v6 ); // invoke-virtual {v5, v6}, Lcom/ansca/corona/MailSettings;->setSubject(Ljava/lang/String;)V
/* .line 245 */
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_6
final String v7 = "body"; // const-string v7, "body"
v7 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_7
/* .line 246 */
/* instance-of v7, v6, Ljava/lang/String; */
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 247 */
/* check-cast v6, Ljava/lang/String; */
} // .end local v6 # "value":Ljava/lang/Object;
(( com.ansca.corona.MailSettings ) v5 ).setBody ( v6 ); // invoke-virtual {v5, v6}, Lcom/ansca/corona/MailSettings;->setBody(Ljava/lang/String;)V
/* .line 250 */
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_7
final String v7 = "isbodyhtml"; // const-string v7, "isbodyhtml"
v7 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_8
/* .line 251 */
/* instance-of v7, v6, Ljava/lang/Boolean; */
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 252 */
/* check-cast v6, Ljava/lang/Boolean; */
} // .end local v6 # "value":Ljava/lang/Object;
v7 = (( java.lang.Boolean ) v6 ).booleanValue ( ); // invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z
(( com.ansca.corona.MailSettings ) v5 ).setHtmlFlag ( v7 ); // invoke-virtual {v5, v7}, Lcom/ansca/corona/MailSettings;->setHtmlFlag(Z)V
/* goto/16 :goto_0 */
/* .line 255 */
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_8
final String v7 = "attachment"; // const-string v7, "attachment"
v7 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 256 */
/* instance-of v7, v6, Ljava/util/HashMap; */
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 257 */
/* check-cast v6, Ljava/util/HashMap; */
} // .end local v6 # "value":Ljava/lang/Object;
(( java.util.HashMap ) v6 ).values ( ); // invoke-virtual {v6}, Ljava/util/HashMap;->values()Ljava/util/Collection;
/* .local v2, "i$":Ljava/util/Iterator; */
v7 = } // :goto_1
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 258 */
/* .local v4, "nextObject":Ljava/lang/Object; */
(( com.ansca.corona.MailSettings ) v5 ).getFileAttachments ( ); // invoke-virtual {v5}, Lcom/ansca/corona/MailSettings;->getFileAttachments()Ljava/util/LinkedHashSet;
com.ansca.corona.MailSettings .addFileAttachmentObjectToCollection ( p0,v7,v4 );
/* .line 262 */
} // .end local v2 # "i$":Ljava/util/Iterator;
} // .end local v4 # "nextObject":Ljava/lang/Object;
/* .restart local v6 # "value":Ljava/lang/Object; */
} // :cond_9
(( com.ansca.corona.MailSettings ) v5 ).getFileAttachments ( ); // invoke-virtual {v5}, Lcom/ansca/corona/MailSettings;->getFileAttachments()Ljava/util/LinkedHashSet;
com.ansca.corona.MailSettings .addFileAttachmentObjectToCollection ( p0,v7,v6 );
/* goto/16 :goto_0 */
} // .end method
public static com.ansca.corona.MailSettings fromUrl ( java.lang.String p0 ) {
/* .locals 10 */
/* .param p0, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 164 */
/* new-instance v7, Lcom/ansca/corona/MailSettings; */
/* invoke-direct {v7}, Lcom/ansca/corona/MailSettings;-><init>()V */
/* .line 167 */
/* .local v7, "settings":Lcom/ansca/corona/MailSettings; */
if ( p0 != null) { // if-eqz p0, :cond_0
v8 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-gtz v8, :cond_1 */
/* .line 202 */
} // :cond_0
} // :goto_0
/* .line 173 */
} // :cond_1
try { // :try_start_0
android.net.MailTo .parse ( p0 );
/* .line 174 */
/* .local v6, "mailToConverter":Landroid/net/MailTo; */
(( android.net.MailTo ) v6 ).getTo ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getTo()Ljava/lang/String;
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 175 */
(( android.net.MailTo ) v6 ).getTo ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getTo()Ljava/lang/String;
final String v9 = ","; // const-string v9, ","
(( java.lang.String ) v8 ).split ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .local v1, "arr$":[Ljava/lang/String; */
/* array-length v5, v1 */
/* .local v5, "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i$":I */
} // :goto_1
/* if-ge v2, v5, :cond_2 */
/* aget-object v0, v1, v2 */
/* .line 176 */
/* .local v0, "addressName":Ljava/lang/String; */
(( com.ansca.corona.MailSettings ) v7 ).getToList ( ); // invoke-virtual {v7}, Lcom/ansca/corona/MailSettings;->getToList()Ljava/util/LinkedHashSet;
(( java.util.LinkedHashSet ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 175 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 179 */
} // .end local v0 # "addressName":Ljava/lang/String;
} // .end local v1 # "arr$":[Ljava/lang/String;
} // .end local v2 # "i$":I
} // .end local v5 # "len$":I
} // :cond_2
(( android.net.MailTo ) v6 ).getCc ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getCc()Ljava/lang/String;
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 180 */
(( android.net.MailTo ) v6 ).getCc ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getCc()Ljava/lang/String;
final String v9 = ","; // const-string v9, ","
(( java.lang.String ) v8 ).split ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .restart local v1 # "arr$":[Ljava/lang/String; */
/* array-length v5, v1 */
/* .restart local v5 # "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .restart local v2 # "i$":I */
} // :goto_2
/* if-ge v2, v5, :cond_3 */
/* aget-object v0, v1, v2 */
/* .line 181 */
/* .restart local v0 # "addressName":Ljava/lang/String; */
(( com.ansca.corona.MailSettings ) v7 ).getCcList ( ); // invoke-virtual {v7}, Lcom/ansca/corona/MailSettings;->getCcList()Ljava/util/LinkedHashSet;
(( java.util.LinkedHashSet ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* .line 180 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 184 */
} // .end local v0 # "addressName":Ljava/lang/String;
} // .end local v1 # "arr$":[Ljava/lang/String;
} // .end local v2 # "i$":I
} // .end local v5 # "len$":I
} // :cond_3
(( android.net.MailTo ) v6 ).getSubject ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getSubject()Ljava/lang/String;
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 185 */
(( android.net.MailTo ) v6 ).getSubject ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getSubject()Ljava/lang/String;
(( com.ansca.corona.MailSettings ) v7 ).setSubject ( v8 ); // invoke-virtual {v7, v8}, Lcom/ansca/corona/MailSettings;->setSubject(Ljava/lang/String;)V
/* .line 187 */
} // :cond_4
(( android.net.MailTo ) v6 ).getBody ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getBody()Ljava/lang/String;
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 188 */
(( android.net.MailTo ) v6 ).getBody ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getBody()Ljava/lang/String;
(( com.ansca.corona.MailSettings ) v7 ).setBody ( v8 ); // invoke-virtual {v7, v8}, Lcom/ansca/corona/MailSettings;->setBody(Ljava/lang/String;)V
/* .line 190 */
} // :cond_5
(( android.net.MailTo ) v6 ).getHeaders ( ); // invoke-virtual {v6}, Landroid/net/MailTo;->getHeaders()Ljava/util/Map;
v8 = } // :cond_6
if ( v8 != null) { // if-eqz v8, :cond_0
/* check-cast v4, Ljava/util/Map$Entry; */
/* .line 191 */
/* .local v4, "item":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;" */
/* check-cast v8, Ljava/lang/String; */
(( java.lang.String ) v8 ).toLowerCase ( ); // invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v9 = "bcc"; // const-string v9, "bcc"
v8 = (( java.lang.String ) v8 ).equals ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 192 */
/* check-cast v8, Ljava/lang/String; */
final String v9 = ","; // const-string v9, ","
(( java.lang.String ) v8 ).split ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .restart local v1 # "arr$":[Ljava/lang/String; */
/* array-length v5, v1 */
/* .restart local v5 # "len$":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i$":I */
} // :goto_3
/* if-ge v3, v5, :cond_6 */
/* aget-object v0, v1, v3 */
/* .line 193 */
/* .restart local v0 # "addressName":Ljava/lang/String; */
(( com.ansca.corona.MailSettings ) v7 ).getBccList ( ); // invoke-virtual {v7}, Lcom/ansca/corona/MailSettings;->getBccList()Ljava/util/LinkedHashSet;
(( java.util.LinkedHashSet ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 192 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 199 */
} // .end local v0 # "addressName":Ljava/lang/String;
} // .end local v1 # "arr$":[Ljava/lang/String;
} // .end local v3 # "i$":I
} // .end local v4 # "item":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
} // .end local v5 # "len$":I
} // .end local v6 # "mailToConverter":Landroid/net/MailTo;
/* :catch_0 */
/* move-exception v8 */
/* goto/16 :goto_0 */
} // .end method
/* # virtual methods */
public java.util.LinkedHashSet getBccList ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 60 */
v0 = this.fBccList;
} // .end method
public java.lang.String getBody ( ) {
/* .locals 1 */
/* .prologue */
/* .line 92 */
v0 = this.fBody;
} // .end method
public java.util.LinkedHashSet getCcList ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 52 */
v0 = this.fCcList;
} // .end method
public java.util.LinkedHashSet getFileAttachments ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Landroid/net/Uri;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 68 */
v0 = this.fFileAttachments;
} // .end method
public java.lang.String getSubject ( ) {
/* .locals 1 */
/* .prologue */
/* .line 76 */
v0 = this.fSubject;
} // .end method
public java.util.LinkedHashSet getToList ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/LinkedHashSet", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 44 */
v0 = this.fToList;
} // .end method
public Boolean isHtml ( ) {
/* .locals 1 */
/* .prologue */
/* .line 109 */
/* iget-boolean v0, p0, Lcom/ansca/corona/MailSettings;->fIsHtml:Z */
} // .end method
public void setBody ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 100 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // .end local p1 # "text":Ljava/lang/String;
} // :goto_0
this.fBody = p1;
/* .line 101 */
return;
/* .line 100 */
/* .restart local p1 # "text":Ljava/lang/String; */
} // :cond_0
final String p1 = ""; // const-string p1, ""
} // .end method
public void setHtmlFlag ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "isHtml" # Z */
/* .prologue */
/* .line 117 */
/* iput-boolean p1, p0, Lcom/ansca/corona/MailSettings;->fIsHtml:Z */
/* .line 118 */
return;
} // .end method
public void setSubject ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 84 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // .end local p1 # "text":Ljava/lang/String;
} // :goto_0
this.fSubject = p1;
/* .line 85 */
return;
/* .line 84 */
/* .restart local p1 # "text":Ljava/lang/String; */
} // :cond_0
final String p1 = ""; // const-string p1, ""
} // .end method
public android.content.Intent toIntent ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
/* .line 128 */
v3 = this.fFileAttachments;
v3 = (( java.util.LinkedHashSet ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedHashSet;->size()I
/* if-le v3, v7, :cond_6 */
final String v0 = "android.intent.action.SEND_MULTIPLE"; // const-string v0, "android.intent.action.SEND_MULTIPLE"
/* .line 129 */
/* .local v0, "actionStringKey":Ljava/lang/String; */
} // :goto_0
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 130 */
/* .local v1, "intent":Landroid/content/Intent; */
/* iget-boolean v3, p0, Lcom/ansca/corona/MailSettings;->fIsHtml:Z */
if ( v3 != null) { // if-eqz v3, :cond_7
final String v3 = "text/html"; // const-string v3, "text/html"
} // :goto_1
(( android.content.Intent ) v1 ).setType ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
/* .line 131 */
v3 = this.fToList;
v3 = (( java.util.LinkedHashSet ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedHashSet;->size()I
/* if-lez v3, :cond_0 */
/* .line 132 */
final String v4 = "android.intent.extra.EMAIL"; // const-string v4, "android.intent.extra.EMAIL"
v3 = this.fToList;
/* new-array v5, v6, [Ljava/lang/String; */
(( java.util.LinkedHashSet ) v3 ).toArray ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/LinkedHashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v3, [Ljava/lang/String; */
(( android.content.Intent ) v1 ).putExtra ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
/* .line 134 */
} // :cond_0
v3 = this.fCcList;
v3 = (( java.util.LinkedHashSet ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedHashSet;->size()I
/* if-lez v3, :cond_1 */
/* .line 135 */
final String v4 = "android.intent.extra.CC"; // const-string v4, "android.intent.extra.CC"
v3 = this.fCcList;
/* new-array v5, v6, [Ljava/lang/String; */
(( java.util.LinkedHashSet ) v3 ).toArray ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/LinkedHashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v3, [Ljava/lang/String; */
(( android.content.Intent ) v1 ).putExtra ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
/* .line 137 */
} // :cond_1
v3 = this.fBccList;
v3 = (( java.util.LinkedHashSet ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedHashSet;->size()I
/* if-lez v3, :cond_2 */
/* .line 138 */
final String v4 = "android.intent.extra.BCC"; // const-string v4, "android.intent.extra.BCC"
v3 = this.fBccList;
/* new-array v5, v6, [Ljava/lang/String; */
(( java.util.LinkedHashSet ) v3 ).toArray ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/LinkedHashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v3, [Ljava/lang/String; */
(( android.content.Intent ) v1 ).putExtra ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;
/* .line 140 */
} // :cond_2
v3 = this.fSubject;
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* if-lez v3, :cond_3 */
/* .line 141 */
final String v3 = "android.intent.extra.SUBJECT"; // const-string v3, "android.intent.extra.SUBJECT"
v4 = this.fSubject;
(( android.content.Intent ) v1 ).putExtra ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 143 */
} // :cond_3
v3 = this.fBody;
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* if-lez v3, :cond_4 */
/* .line 144 */
final String v4 = "android.intent.extra.TEXT"; // const-string v4, "android.intent.extra.TEXT"
/* iget-boolean v3, p0, Lcom/ansca/corona/MailSettings;->fIsHtml:Z */
if ( v3 != null) { // if-eqz v3, :cond_8
v3 = this.fBody;
android.text.Html .fromHtml ( v3 );
} // :goto_2
(( android.content.Intent ) v1 ).putExtra ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;
/* .line 146 */
} // :cond_4
v3 = this.fFileAttachments;
v3 = (( java.util.LinkedHashSet ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedHashSet;->size()I
/* if-le v3, v7, :cond_9 */
/* .line 147 */
/* new-instance v2, Ljava/util/ArrayList; */
v3 = this.fFileAttachments;
v3 = (( java.util.LinkedHashSet ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedHashSet;->size()I
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 148 */
/* .local v2, "uriList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/net/Uri;>;" */
v3 = this.fFileAttachments;
(( java.util.ArrayList ) v2 ).addAll ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 149 */
final String v3 = "android.intent.extra.STREAM"; // const-string v3, "android.intent.extra.STREAM"
(( android.content.Intent ) v1 ).putParcelableArrayListExtra ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
/* .line 154 */
} // .end local v2 # "uriList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/net/Uri;>;"
} // :cond_5
} // :goto_3
/* .line 128 */
} // .end local v0 # "actionStringKey":Ljava/lang/String;
} // .end local v1 # "intent":Landroid/content/Intent;
} // :cond_6
final String v0 = "android.intent.action.SEND"; // const-string v0, "android.intent.action.SEND"
/* goto/16 :goto_0 */
/* .line 130 */
/* .restart local v0 # "actionStringKey":Ljava/lang/String; */
/* .restart local v1 # "intent":Landroid/content/Intent; */
} // :cond_7
final String v3 = "plain/text"; // const-string v3, "plain/text"
/* goto/16 :goto_1 */
/* .line 144 */
} // :cond_8
v3 = this.fBody;
/* .line 151 */
} // :cond_9
v3 = this.fFileAttachments;
v3 = (( java.util.LinkedHashSet ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/LinkedHashSet;->size()I
/* if-ne v3, v7, :cond_5 */
/* .line 152 */
final String v4 = "android.intent.extra.STREAM"; // const-string v4, "android.intent.extra.STREAM"
v3 = this.fFileAttachments;
(( java.util.LinkedHashSet ) v3 ).iterator ( ); // invoke-virtual {v3}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;
/* check-cast v3, Landroid/os/Parcelable; */
(( android.content.Intent ) v1 ).putExtra ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
} // .end method
