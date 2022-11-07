class com.adknowledge.superrewards.xml.parser.OffersXMLParser$3 implements android.sax.StartElementListener {
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
 com.adknowledge.superrewards.xml.parser.OffersXMLParser$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 84 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void start ( org.xml.sax.Attributes p0 ) {
/* .locals 3 */
/* .param p1, "arg0" # Lorg/xml/sax/Attributes; */
/* .prologue */
/* .line 86 */
final String v0 = "name"; // const-string v0, "name"
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
/* .line 88 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set Name "; // const-string v2, "Set Name "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = com.adknowledge.superrewards.model.SRParams.name;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 89 */
return;
} // .end method
