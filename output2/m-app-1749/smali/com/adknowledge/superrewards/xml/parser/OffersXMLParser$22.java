class com.adknowledge.superrewards.xml.parser.OffersXMLParser$22 implements android.sax.EndElementListener {
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
final java.util.List val$messages; //synthetic
/* # direct methods */
 com.adknowledge.superrewards.xml.parser.OffersXMLParser$22 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 324 */
this.this$0 = p1;
this.val$messages = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void end ( ) {
/* .locals 5 */
/* .prologue */
/* .line 326 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$000 ( v0 );
(( com.adknowledge.superrewards.model.SROffer ) v0 ).setFreeImage ( ); // invoke-virtual {v0}, Lcom/adknowledge/superrewards/model/SROffer;->setFreeImage()V
/* .line 327 */
v0 = this.val$messages;
v1 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$000 ( v1 );
/* .line 328 */
v0 = this.this$0;
/* new-instance v1, Lcom/adknowledge/superrewards/model/SROffer; */
v2 = com.adknowledge.superrewards.model.SRParams.currency;
final String v3 = "0"; // const-string v3, "0"
v4 = com.adknowledge.superrewards.model.SRParams.help;
/* invoke-direct {v1, v2, v3, v4}, Lcom/adknowledge/superrewards/model/SROffer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$002 ( v0,v1 );
/* .line 331 */
return;
} // .end method
