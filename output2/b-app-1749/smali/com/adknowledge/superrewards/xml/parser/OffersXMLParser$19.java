class com.adknowledge.superrewards.xml.parser.OffersXMLParser$19 implements android.sax.StartElementListener {
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
 com.adknowledge.superrewards.xml.parser.OffersXMLParser$19 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 250 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void start ( org.xml.sax.Attributes p0 ) {
/* .locals 3 */
/* .param p1, "arg0" # Lorg/xml/sax/Attributes; */
/* .prologue */
/* .line 255 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$100 ( v0 );
final String v1 = "amount"; // const-string v1, "amount"
(( com.adknowledge.superrewards.model.SRPricePoint ) v0 ).setAmount ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SRPricePoint;->setAmount(Ljava/lang/String;)V
/* .line 258 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set Amount: "; // const-string v2, "Set Amount: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "amount"; // const-string v2, "amount"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 261 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$100 ( v0 );
final String v1 = "points"; // const-string v1, "points"
(( com.adknowledge.superrewards.model.SRPricePoint ) v0 ).setPoints ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SRPricePoint;->setPoints(Ljava/lang/String;)V
/* .line 264 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set Points: "; // const-string v2, "Set Points: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "points"; // const-string v2, "points"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 267 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$100 ( v0 );
final String v1 = "us_amount"; // const-string v1, "us_amount"
(( com.adknowledge.superrewards.model.SRPricePoint ) v0 ).setUsAmount ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SRPricePoint;->setUsAmount(Ljava/lang/String;)V
/* .line 270 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set US Amount: "; // const-string v2, "Set US Amount: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "us_amount"; // const-string v2, "us_amount"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 273 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$100 ( v0 );
final String v1 = "local_amount"; // const-string v1, "local_amount"
(( com.adknowledge.superrewards.model.SRPricePoint ) v0 ).setLocalAmount ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SRPricePoint;->setLocalAmount(Ljava/lang/String;)V
/* .line 276 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set LocalAmount: "; // const-string v2, "Set LocalAmount: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "local_amount"; // const-string v2, "local_amount"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 279 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$100 ( v0 );
final String v1 = "us_text"; // const-string v1, "us_text"
(( com.adknowledge.superrewards.model.SRPricePoint ) v0 ).setUsText ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SRPricePoint;->setUsText(Ljava/lang/String;)V
/* .line 282 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set US Text: "; // const-string v2, "Set US Text: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "us_text"; // const-string v2, "us_text"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 285 */
v0 = this.this$0;
com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$100 ( v0 );
final String v1 = "local_text"; // const-string v1, "local_text"
(( com.adknowledge.superrewards.model.SRPricePoint ) v0 ).setLocalText ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SRPricePoint;->setLocalText(Ljava/lang/String;)V
/* .line 288 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set local Text: "; // const-string v2, "Set local Text: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "local_text"; // const-string v2, "local_text"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 291 */
final String v0 = "entrypointUrl"; // const-string v0, "entrypointUrl"
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 292 */
	 v0 = this.this$0;
	 com.adknowledge.superrewards.xml.parser.OffersXMLParser .access$100 ( v0 );
	 final String v1 = "entrypointUrl"; // const-string v1, "entrypointUrl"
	 (( com.adknowledge.superrewards.model.SRPricePoint ) v0 ).setEntrypointurl ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/model/SRPricePoint;->setEntrypointurl(Ljava/lang/String;)V
	 /* .line 293 */
	 final String v0 = "SR"; // const-string v0, "SR"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Set Entrypointurl: "; // const-string v2, "Set Entrypointurl: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "entrypointUrl"; // const-string v2, "entrypointUrl"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .i ( v0,v1 );
	 /* .line 296 */
} // :cond_0
return;
} // .end method
