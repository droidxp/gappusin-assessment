class com.adknowledge.superrewards.xml.parser.OffersXMLParser$1 implements android.sax.StartElementListener {
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
 com.adknowledge.superrewards.xml.parser.OffersXMLParser$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 56 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void start ( org.xml.sax.Attributes p0 ) {
/* .locals 5 */
/* .param p1, "arg0" # Lorg/xml/sax/Attributes; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 60 */
final String v0 = "srv"; // const-string v0, "srv"
v0 = java.lang.Integer .parseInt ( v0 );
/* .line 61 */
final String v0 = "da"; // const-string v0, "da"
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
final String v3 = "1"; // const-string v3, "1"
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* move v0, v1 */
} // :goto_0
com.adknowledge.superrewards.model.SRParams.directpay_available = (v0!= 0);
/* .line 64 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Set directpay_available "; // const-string v4, "Set directpay_available "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* sget-boolean v4, Lcom/adknowledge/superrewards/model/SRParams;->directpay_available:Z */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v3 );
/* .line 65 */
final String v0 = "oa"; // const-string v0, "oa"
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
final String v3 = "1"; // const-string v3, "1"
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :goto_1
com.adknowledge.superrewards.model.SRParams.offers_available = (v1!= 0);
/* .line 68 */
final String v0 = "SR"; // const-string v0, "SR"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Set srv "; // const-string v2, "Set srv "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 69 */
return;
} // :cond_0
/* move v0, v2 */
/* .line 61 */
} // :cond_1
/* move v1, v2 */
/* .line 65 */
} // .end method
