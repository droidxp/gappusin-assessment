class com.adknowledge.superrewards.xml.parser.OffersXMLParser$13 implements android.sax.EndTextElementListener {
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
 com.adknowledge.superrewards.xml.parser.OffersXMLParser$13 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 188 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void end ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "body" # Ljava/lang/String; */
/* .prologue */
/* .line 191 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$000 ( v0 );
(( com.adknowledge.superrewards.model.SROffer ) v0 ).setDescription ( p1 ); // invoke-virtual {v0, p1}, Lcom/adknowledge/superrewards/model/SROffer;->setDescription(Ljava/lang/String;)V
/* .line 192 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set Offer with Description of "; // const-string v2, "Set Offer with Description of "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 193 */
return;
} // .end method
