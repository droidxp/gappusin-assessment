public class zongfuscated.y {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # instance fields */
	 private Boolean b;
	 private org.apache.http.client.methods.HttpPost c;
	 private java.util.List d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lorg/apache/http/NameValuePair;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private org.apache.http.protocol.HttpContext e;
private com.zong.android.engine.xml.pojo.lookup.ZongPricePoint f;
/* # direct methods */
static zongfuscated.y ( ) {
/* .locals 1 */
/* const-class v0, Lzongfuscated/y; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
return;
} // .end method
public zongfuscated.y ( ) {
/* .locals 5 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
this.f = v0;
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "<requestMobilePaymentProcessEntrypoints xmlns=\"http://pay01.zong.com/zongpay\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://pay01.zong.com/zongpay/zongpay.xsd\">"; // const-string v1, "<requestMobilePaymentProcessEntrypoints xmlns=\"http://pay01.zong.com/zongpay\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://pay01.zong.com/zongpay/zongpay.xsd\">"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "<customerKey>"; // const-string v1, "<customerKey>"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "</customerKey>"; // const-string v2, "</customerKey>"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "<countryCode>"; // const-string v1, "<countryCode>"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "</countryCode>"; // const-string v2, "</countryCode>"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "<items currency=\""; // const-string v1, "<items currency=\""
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\" />"; // const-string v2, "\" />"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "</requestMobilePaymentProcessEntrypoints>"; // const-string v1, "</requestMobilePaymentProcessEntrypoints>"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = zongfuscated.y.a;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
zongfuscated.q .a ( v1,v2 );
/* new-instance v1, Lorg/apache/http/client/methods/HttpPost; */
/* invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
this.c = v1;
v1 = this.c;
final String v2 = "Accept"; // const-string v2, "Accept"
final String v3 = "text/html,application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5"; // const-string v3, "text/html,application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5"
(( org.apache.http.client.methods.HttpPost ) v1 ).setHeader ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
v1 = this.c;
final String v2 = "Content-Type"; // const-string v2, "Content-Type"
final String v3 = "application/x-www-form-urlencoded"; // const-string v3, "application/x-www-form-urlencoded"
(( org.apache.http.client.methods.HttpPost ) v1 ).setHeader ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
v1 = this.c;
final String v2 = "User-Agent"; // const-string v2, "User-Agent"
final String v3 = "Android"; // const-string v3, "Android"
(( org.apache.http.client.methods.HttpPost ) v1 ).addHeader ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
/* new-instance v1, Ljava/util/ArrayList; */
int v2 = 2; // const/4 v2, 0x2
/* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V */
this.d = v1;
v1 = this.d;
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "method"; // const-string v3, "method"
final String v4 = "lookup"; // const-string v4, "lookup"
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
v1 = this.d;
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "request"; // const-string v3, "request"
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v0, Lorg/apache/http/protocol/BasicHttpContext; */
/* invoke-direct {v0}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V */
this.e = v0;
return;
} // .end method
/* # virtual methods */
public final com.zong.android.engine.xml.pojo.lookup.ZongPricePoint a ( ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lzongfuscated/y;->b:Z */
try { // :try_start_0
	 v0 = this.c;
	 /* new-instance v1, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
	 v2 = this.d;
	 final String v3 = "UTF-8"; // const-string v3, "UTF-8"
	 /* invoke-direct {v1, v2, v3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
	 (( org.apache.http.client.methods.HttpPost ) v0 ).setEntity ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
	 zongfuscated.d .a ( );
	 v1 = this.c;
	 v2 = this.e;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 zongfuscated.w .a ( v0 );
		 this.f = v0;
		 /* :try_end_0 */
		 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
	 } // :cond_0
} // :goto_0
/* iget-boolean v0, p0, Lzongfuscated/y;->b:Z */
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
this.f = v0;
} // :cond_1
v0 = this.f;
/* :catch_0 */
/* move-exception v0 */
v1 = zongfuscated.y.a;
final String v2 = "UnsupportedEncodingException"; // const-string v2, "UnsupportedEncodingException"
zongfuscated.q .a ( v1,v2,v0 );
/* iput-boolean v4, p0, Lzongfuscated/y;->b:Z */
/* :catch_1 */
/* move-exception v0 */
v1 = zongfuscated.y.a;
final String v2 = "ClientProtocolException"; // const-string v2, "ClientProtocolException"
zongfuscated.q .a ( v1,v2,v0 );
/* iput-boolean v4, p0, Lzongfuscated/y;->b:Z */
/* :catch_2 */
/* move-exception v0 */
v1 = zongfuscated.y.a;
final String v2 = "IOException"; // const-string v2, "IOException"
zongfuscated.q .a ( v1,v2,v0 );
/* iput-boolean v4, p0, Lzongfuscated/y;->b:Z */
} // .end method
