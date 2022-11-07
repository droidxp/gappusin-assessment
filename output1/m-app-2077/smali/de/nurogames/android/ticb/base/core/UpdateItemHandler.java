public class de.nurogames.android.ticb.base.core.UpdateItemHandler extends org.xml.sax.helpers.DefaultHandler {
	 /* .source "UpdateItemHandler.java" */
	 /* # instance fields */
	 private Boolean tag_description;
	 private Boolean tag_version;
	 private de.nurogames.android.ticb.base.core.UpdateDataSet update_DataSet;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.UpdateItemHandler ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 11 */
		 /* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
		 /* .line 17 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;->tag_version:Z */
		 /* .line 18 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;->tag_description:Z */
		 /* .line 20 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/core/UpdateDataSet; */
		 /* invoke-direct {v0}, Lde/nurogames/android/ticb/base/core/UpdateDataSet;-><init>()V */
		 this.update_DataSet = v0;
		 /* .line 11 */
		 return;
	 } // .end method
	 public static java.lang.String base64Encode ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p0, "s" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 102 */
		 /* new-instance v0, Ljava/io/ByteArrayOutputStream; */
		 /* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
		 /* .line 103 */
		 /* .local v0, "bOut":Ljava/io/ByteArrayOutputStream; */
		 /* new-instance v1, Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
		 /* invoke-direct {v1, v0}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;-><init>(Ljava/io/OutputStream;)V */
		 /* .line 105 */
		 /* .local v1, "out":Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
		 try { // :try_start_0
			 (( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
			 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->write([B)V
			 /* .line 106 */
			 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->flush()V
			 /* .line 107 */
			 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->close()V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 109 */
		 } // :goto_0
		 (( java.io.ByteArrayOutputStream ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
		 /* .line 108 */
		 /* :catch_0 */
		 /* move-exception v2 */
	 } // .end method
	 /* # virtual methods */
	 public void characters ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 /* .param p1, "ch" # [C */
		 /* .param p2, "start" # I */
		 /* .param p3, "length" # I */
		 /* .prologue */
		 /* .line 85 */
		 /* iget-boolean v1, p0, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;->tag_version:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 86 */
			 v1 = this.update_DataSet;
			 /* new-instance v2, Ljava/lang/String; */
			 /* invoke-direct {v2, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V */
			 (( de.nurogames.android.ticb.base.core.UpdateDataSet ) v1 ).setVersion ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/UpdateDataSet;->setVersion(Ljava/lang/String;)V
			 /* .line 88 */
		 } // :cond_0
		 /* iget-boolean v1, p0, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;->tag_description:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 89 */
			 v1 = this.update_DataSet;
			 /* new-instance v2, Ljava/lang/String; */
			 /* invoke-direct {v2, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V */
			 (( de.nurogames.android.ticb.base.core.UpdateDataSet ) v1 ).setDesc ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/UpdateDataSet;->setDesc(Ljava/lang/String;)V
			 /* .line 91 */
			 /* new-instance v0, Lde/nurogames/android/ticb/base/core/UpdateElement; */
			 /* .line 92 */
			 v1 = this.update_DataSet;
			 (( de.nurogames.android.ticb.base.core.UpdateDataSet ) v1 ).getVersion ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/UpdateDataSet;->getVersion()Ljava/lang/String;
			 /* .line 93 */
			 v2 = this.update_DataSet;
			 (( de.nurogames.android.ticb.base.core.UpdateDataSet ) v2 ).getDesc ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/UpdateDataSet;->getDesc()Ljava/lang/String;
			 /* .line 91 */
			 /* invoke-direct {v0, v1, v2}, Lde/nurogames/android/ticb/base/core/UpdateElement;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
			 /* .line 96 */
			 /* .local v0, "update_item":Lde/nurogames/android/ticb/base/core/UpdateElement; */
			 v1 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
			 (( java.util.Vector ) v1 ).addElement ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
			 /* .line 99 */
		 } // .end local v0 # "update_item":Lde/nurogames/android/ticb/base/core/UpdateElement;
	 } // :cond_1
	 return;
} // .end method
public void endDocument ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/xml/sax/SAXException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 46 */
return;
} // .end method
public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .param p1, "namespaceURI" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 73 */
final String v0 = "version"; // const-string v0, "version"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;->tag_version:Z */
/* .line 74 */
} // :cond_0
final String v0 = "description"; // const-string v0, "description"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;->tag_description:Z */
/* .line 76 */
} // :cond_1
return;
} // .end method
public de.nurogames.android.ticb.base.core.UpdateDataSet getParsedData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 29 */
v0 = this.update_DataSet;
} // .end method
public void startDocument ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 40 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/UpdateDataSet; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/core/UpdateDataSet;-><init>()V */
this.update_DataSet = v0;
/* .line 41 */
return;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
/* .locals 2 */
/* .param p1, "namespaceURI" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .param p4, "atts" # Lorg/xml/sax/Attributes; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 61 */
final String v0 = "version"; // const-string v0, "version"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;->tag_version:Z */
/* .line 62 */
} // :cond_0
final String v0 = "description"; // const-string v0, "description"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;->tag_description:Z */
/* .line 64 */
} // :cond_1
return;
} // .end method
