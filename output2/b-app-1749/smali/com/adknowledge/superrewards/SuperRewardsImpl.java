public class com.adknowledge.superrewards.SuperRewardsImpl implements com.adknowledge.superrewards.SuperRewards {
	 /* .source "SuperRewardsImpl.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static java.util.List list;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lcom/adknowledge/superrewards/model/SROffer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private java.lang.String xmlresponse;
/* # direct methods */
static com.adknowledge.superrewards.SuperRewardsImpl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 33 */
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
public com.adknowledge.superrewards.SuperRewardsImpl ( ) {
/* .locals 0 */
/* .prologue */
/* .line 38 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public com.adknowledge.superrewards.SuperRewardsImpl ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<+", */
/* "Ljava/lang/Object;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 43 */
/* .local p1, "generatedResourceClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Object;>;" */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 44 */
/* const-class v0, Lcom/adknowledge/superrewards/SRResources; */
com.adknowledge.superrewards.ResourceDelegator .delegateValues ( p1,v0 );
/* .line 45 */
return;
} // .end method
/* # virtual methods */
public java.util.List getOffers ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 1 */
/* .param p1, "h" # Ljava/lang/String; */
/* .param p2, "context" # Landroid/content/Context; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Landroid/content/Context;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 114 */
com.adknowledge.superrewards.Utils .getDeviceUID ( p2 );
(( com.adknowledge.superrewards.SuperRewardsImpl ) p0 ).getOffers ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/adknowledge/superrewards/SuperRewardsImpl;->getOffers(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
} // .end method
public java.util.List getOffers ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 9 */
/* .param p1, "h" # Ljava/lang/String; */
/* .param p2, "uid" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 105 */
com.adknowledge.superrewards.Utils .getCountryCode ( );
final String v4 = "1"; // const-string v4, "1"
final String v5 = "2"; // const-string v5, "2"
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v7, v6 */
/* move-object v8, v6 */
/* invoke-virtual/range {v0 ..v8}, Lcom/adknowledge/superrewards/SuperRewardsImpl;->getOffers(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/util/List; */
} // .end method
public java.util.List getOffers ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, android.content.Context p7 ) {
/* .locals 5 */
/* .param p1, "h" # Ljava/lang/String; */
/* .param p2, "uid" # Ljava/lang/String; */
/* .param p3, "cc" # Ljava/lang/String; */
/* .param p4, "xml" # Ljava/lang/String; */
/* .param p5, "v" # Ljava/lang/String; */
/* .param p6, "nOffers" # Ljava/lang/String; */
/* .param p7, "mode" # Ljava/lang/String; */
/* .param p8, "ctx" # Landroid/content/Context; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Landroid/content/Context;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SROffer;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 54 */
v3 = com.adknowledge.superrewards.SuperRewardsImpl.list;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 55 */
v3 = com.adknowledge.superrewards.SuperRewardsImpl.list;
/* .line 96 */
} // :goto_0
/* .line 59 */
} // :cond_0
/* .line 61 */
v3 = com.adknowledge.superrewards.Utils .checkCacheTimestamp ( p8 );
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_1 */
/* .line 62 */
com.adknowledge.superrewards.Utils .getXMLFromPrefs ( p8 );
this.xmlresponse = v3;
/* .line 63 */
final String v3 = "SR"; // const-string v3, "SR"
final String v4 = "XML retrieved FROM CACHE, passing to parse()"; // const-string v4, "XML retrieved FROM CACHE, passing to parse()"
android.util.Log .i ( v3,v4 );
/* .line 94 */
} // :goto_1
/* new-instance v1, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser; */
/* invoke-direct {v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;-><init>()V */
/* .line 95 */
/* .local v1, "offersXMLParser":Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser; */
v3 = this.xmlresponse;
(( com.adknowledge.superrewards.xml.parser.OffersXMLParser ) v1 ).parse ( v3 ); // invoke-virtual {v1, v3}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;->parse(Ljava/lang/String;)Ljava/util/List;
/* .line 96 */
v3 = com.adknowledge.superrewards.SuperRewardsImpl.list;
/* .line 66 */
} // .end local v1 # "offersXMLParser":Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;
} // :cond_1
com.adknowledge.superrewards.web.SRClient .getInstance ( );
(( com.adknowledge.superrewards.web.SRClient ) v3 ).createRequest ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/web/SRClient;->createRequest()Lcom/adknowledge/superrewards/web/SRRequest;
/* .line 67 */
/* .local v2, "request":Lcom/adknowledge/superrewards/web/SRRequest; */
v3 = com.adknowledge.superrewards.web.SRRequest$Command.METHOD;
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).setCommand ( v3 ); // invoke-virtual {v2, v3}, Lcom/adknowledge/superrewards/web/SRRequest;->setCommand(Lcom/adknowledge/superrewards/web/SRRequest$Command;)V
/* .line 68 */
v3 = com.adknowledge.superrewards.web.SRRequest$Call.GET_OFFERS;
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).setCall ( v3 ); // invoke-virtual {v2, v3}, Lcom/adknowledge/superrewards/web/SRRequest;->setCall(Lcom/adknowledge/superrewards/web/SRRequest$Call;)V
/* .line 69 */
final String v3 = "h"; // const-string v3, "h"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v3, p1 ); // invoke-virtual {v2, v3, p1}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 70 */
final String v3 = "uid"; // const-string v3, "uid"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v3, p2 ); // invoke-virtual {v2, v3, p2}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 71 */
final String v3 = "cc"; // const-string v3, "cc"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v3, p3 ); // invoke-virtual {v2, v3, p3}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 72 */
final String v3 = "xml"; // const-string v3, "xml"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v3, p4 ); // invoke-virtual {v2, v3, p4}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 73 */
final String v3 = "mobile"; // const-string v3, "mobile"
final String v4 = "true"; // const-string v4, "true"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 74 */
final String v3 = "v"; // const-string v3, "v"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v3, p5 ); // invoke-virtual {v2, v3, p5}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 75 */
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).setUid ( p2 ); // invoke-virtual {v2, p2}, Lcom/adknowledge/superrewards/web/SRRequest;->setUid(Ljava/lang/String;)V
/* .line 76 */
v3 = android.text.TextUtils .isEmpty ( p6 );
/* if-nez v3, :cond_2 */
/* .line 77 */
final String v3 = "nOffers"; // const-string v3, "nOffers"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v3, p6 ); // invoke-virtual {v2, v3, p6}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 79 */
} // :cond_2
v3 = android.text.TextUtils .isEmpty ( p7 );
/* if-nez v3, :cond_3 */
/* .line 80 */
final String v3 = "mode"; // const-string v3, "mode"
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).addInnerParam ( v3, p7 ); // invoke-virtual {v2, v3, p7}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
/* .line 83 */
} // :cond_3
v3 = (( com.adknowledge.superrewards.web.SRRequest ) v2 ).execute ( p8, p1 ); // invoke-virtual {v2, p8, p1}, Lcom/adknowledge/superrewards/web/SRRequest;->execute(Landroid/content/Context;Ljava/lang/String;)Z
/* if-nez v3, :cond_4 */
/* .line 84 */
int v3 = 0; // const/4 v3, 0x0
/* .line 86 */
} // :cond_4
final String v3 = "SR"; // const-string v3, "SR"
final String v4 = "XML retrieved FROM SR, passing to parse()"; // const-string v4, "XML retrieved FROM SR, passing to parse()"
android.util.Log .i ( v3,v4 );
/* .line 87 */
(( com.adknowledge.superrewards.web.SRRequest ) v2 ).getResult ( ); // invoke-virtual {v2}, Lcom/adknowledge/superrewards/web/SRRequest;->getResult()Ljava/lang/String;
this.xmlresponse = v3;
/* .line 89 */
try { // :try_start_0
v3 = this.xmlresponse;
com.adknowledge.superrewards.Utils .setXMLIntoPrefs ( p8,v3 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 90 */
/* :catch_0 */
/* move-exception v0 */
/* .line 91 */
/* .local v0, "e":Ljava/io/IOException; */
final String v3 = "There was a communication problem.Please try again later."; // const-string v3, "There was a communication problem.Please try again later."
/* const/16 v4, 0x7d0 */
android.widget.Toast .makeText ( p8,v3,v4 );
(( android.widget.Toast ) v3 ).show ( ); // invoke-virtual {v3}, Landroid/widget/Toast;->show()V
/* goto/16 :goto_1 */
} // .end method
public void showOffers ( android.app.Activity p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "parentActivity" # Landroid/app/Activity; */
/* .param p2, "h" # Ljava/lang/String; */
/* .prologue */
/* .line 149 */
(( android.app.Activity ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
com.adknowledge.superrewards.Utils .getDeviceUID ( v0 );
(( com.adknowledge.superrewards.SuperRewardsImpl ) p0 ).showOffers ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/adknowledge/superrewards/SuperRewardsImpl;->showOffers(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
/* .line 150 */
return;
} // .end method
public void showOffers ( android.app.Activity p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
/* .param p1, "parentActivity" # Landroid/app/Activity; */
/* .param p2, "h" # Ljava/lang/String; */
/* .param p3, "uid" # Ljava/lang/String; */
/* .prologue */
/* .line 139 */
com.adknowledge.superrewards.Utils .getCountryCode ( );
(( com.adknowledge.superrewards.SuperRewardsImpl ) p0 ).showOffers ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lcom/adknowledge/superrewards/SuperRewardsImpl;->showOffers(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/* .line 141 */
return;
} // .end method
public void showOffers ( android.app.Activity p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 2 */
/* .param p1, "parentActivity" # Landroid/app/Activity; */
/* .param p2, "h" # Ljava/lang/String; */
/* .param p3, "uid" # Ljava/lang/String; */
/* .param p4, "cc" # Ljava/lang/String; */
/* .prologue */
/* .line 124 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 125 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v1 = "h"; // const-string v1, "h"
(( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 126 */
final String v1 = "uid"; // const-string v1, "uid"
(( android.content.Intent ) v0 ).putExtra ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 127 */
final String v1 = "cc"; // const-string v1, "cc"
(( android.content.Intent ) v0 ).putExtra ( v1, p4 ); // invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 128 */
/* const-class v1, Lcom/adknowledge/superrewards/ui/activities/SRPaymentMethodsActivity; */
(( android.content.Intent ) v0 ).setClass ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 129 */
(( android.app.Activity ) p1 ).startActivity ( v0 ); // invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 130 */
return;
} // .end method
