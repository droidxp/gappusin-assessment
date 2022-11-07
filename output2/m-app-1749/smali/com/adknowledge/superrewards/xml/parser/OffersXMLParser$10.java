class com.adknowledge.superrewards.xml.parser.OffersXMLParser$10 implements android.sax.StartElementListener {
	 /* .source "OffersXMLParser.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;->parse(Ljava/lang/String;)Ljava/util/List; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.adknowledge.superrewards.xml.parser.OffersXMLParser this$0; //synthetic
/* # direct methods */
 com.adknowledge.superrewards.xml.parser.OffersXMLParser$10 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 157 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void start ( org.xml.sax.Attributes p0 ) {
/* .locals 3 */
/* .param p1, "arg0" # Lorg/xml/sax/Attributes; */
/* .prologue */
/* .line 160 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$000 ( v0 );
final String v1 = "id"; // const-string v1, "id"
(( java.lang.String ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;
(( com.adknowledge.superrewards.model.SROffer ) v0 ).setId ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SROffer;->setId(Ljava/lang/String;)V
/* .line 161 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set Offer with ID of "; // const-string v2, "Set Offer with ID of "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "id"; // const-string v2, "id"
(( java.lang.String ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 164 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$000 ( v0 );
v1 = com.adknowledge.superrewards.model.SROfferType.DIRECT;
(( com.adknowledge.superrewards.model.SROffer ) v0 ).setOfferType ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SROffer;->setOfferType(Lcom/adknowledge/superrewards/model/SROfferType;)V
/* .line 165 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set Offer Type: "; // const-string v2, "Set Offer Type: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = com.adknowledge.superrewards.model.SROfferType.DIRECT;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 166 */
return;
} // .end method
