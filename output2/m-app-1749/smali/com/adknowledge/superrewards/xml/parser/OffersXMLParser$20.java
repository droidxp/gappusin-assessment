class com.adknowledge.superrewards.xml.parser.OffersXMLParser$20 implements android.sax.EndElementListener {
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
 com.adknowledge.superrewards.xml.parser.OffersXMLParser$20 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 298 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void end ( ) {
/* .locals 2 */
/* .prologue */
/* .line 300 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$000 ( v0 );
(( com.adknowledge.superrewards.model.SROffer ) v0 ).getPricePoints ( ); // invoke-virtual {v0}, Lcom/adknowledge/superrewards/model/SROffer;->getPricePoints()Ljava/util/List;
/* if-nez v0, :cond_0 */
/* .line 301 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$000 ( v0 );
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
(( com.adknowledge.superrewards.model.SROffer ) v0 ).setPricePoints ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SROffer;->setPricePoints(Ljava/util/List;)V
/* .line 304 */
} // :cond_0
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$000 ( v0 );
(( com.adknowledge.superrewards.model.SROffer ) v0 ).getPricePoints ( ); // invoke-virtual {v0}, Lcom/adknowledge/superrewards/model/SROffer;->getPricePoints()Ljava/util/List;
v1 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$100 ( v1 );
/* .line 305 */
v0 = this.this$0;
/* new-instance v1, Lcom/adknowledge/superrewards/model/SRPricePoint; */
/* invoke-direct {v1}, Lcom/adknowledge/superrewards/model/SRPricePoint;-><init>()V */
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$102 ( v0,v1 );
/* .line 306 */
return;
} // .end method
