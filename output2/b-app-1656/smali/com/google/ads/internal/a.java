public class com.google.ads.internal.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final com.google.ads.util.f a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lcom/google/ads/util/f", */
	 /* "<", */
	 /* "Lcom/google/ads/internal/a;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/google/ads/n;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/google/ads/n;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final com.google.ads.internal.a d;
/* # direct methods */
static com.google.ads.internal.a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 65 */
/* new-instance v0, Lcom/google/ads/internal/a; */
/* invoke-direct {v0}, Lcom/google/ads/internal/a;-><init>()V */
/* .line 67 */
/* new-instance v0, Lcom/google/ads/internal/a$2; */
/* invoke-direct {v0}, Lcom/google/ads/internal/a$2;-><init>()V */
/* .line 82 */
/* new-instance v0, Lcom/google/ads/internal/a$3; */
/* invoke-direct {v0}, Lcom/google/ads/internal/a$3;-><init>()V */
java.util.Collections .unmodifiableMap ( v0 );
/* .line 92 */
/* new-instance v0, Lcom/google/ads/internal/a$1; */
/* invoke-direct {v0}, Lcom/google/ads/internal/a$1;-><init>()V */
java.util.Collections .unmodifiableMap ( v0 );
return;
} // .end method
public com.google.ads.internal.a ( ) {
/* .locals 0 */
/* .prologue */
/* .line 40 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.google.ads.internal.a a ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 40 */
v0 = com.google.ads.internal.a.d;
} // .end method
/* # virtual methods */
public java.lang.String a ( android.net.Uri p0, java.util.HashMap p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 136 */
v1 = (( com.google.ads.internal.a ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/ads/internal/a;->c(Landroid/net/Uri;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 138 */
(( android.net.Uri ) p1 ).getHost ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;
/* .line 139 */
/* if-nez v1, :cond_0 */
/* .line 140 */
final String v1 = "An error occurred while parsing the AMSG parameters."; // const-string v1, "An error occurred while parsing the AMSG parameters."
com.google.ads.util.b .e ( v1 );
/* .line 162 */
} // :goto_0
/* .line 145 */
} // :cond_0
final String v2 = "launch"; // const-string v2, "launch"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 146 */
final String v0 = "a"; // const-string v0, "a"
final String v1 = "intent"; // const-string v1, "intent"
(( java.util.HashMap ) p2 ).put ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 147 */
final String v0 = "u"; // const-string v0, "u"
final String v1 = "url"; // const-string v1, "url"
(( java.util.HashMap ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.util.HashMap ) p2 ).put ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 148 */
final String v0 = "url"; // const-string v0, "url"
(( java.util.HashMap ) p2 ).remove ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 149 */
final String v0 = "/open"; // const-string v0, "/open"
/* .line 150 */
} // :cond_1
final String v2 = "closecanvas"; // const-string v2, "closecanvas"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 151 */
final String v0 = "/close"; // const-string v0, "/close"
/* .line 152 */
} // :cond_2
final String v2 = "log"; // const-string v2, "log"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 153 */
final String v0 = "/log"; // const-string v0, "/log"
/* .line 155 */
} // :cond_3
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "An error occurred while parsing the AMSG: "; // const-string v2, "An error occurred while parsing the AMSG: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.net.Uri ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v1 );
/* .line 158 */
} // :cond_4
v1 = (( com.google.ads.internal.a ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/ads/internal/a;->b(Landroid/net/Uri;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 159 */
(( android.net.Uri ) p1 ).getPath ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
/* .line 161 */
} // :cond_5
final String v1 = "Message was neither a GMSG nor an AMSG."; // const-string v1, "Message was neither a GMSG nor an AMSG."
com.google.ads.util.b .e ( v1 );
} // .end method
public void a ( android.webkit.WebView p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 304 */
final String v0 = "onshow"; // const-string v0, "onshow"
final String v1 = "{\'version\': \'afma-sdk-a-v6.0.1\'}"; // const-string v1, "{\'version\': \'afma-sdk-a-v6.0.1\'}"
(( com.google.ads.internal.a ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 307 */
return;
} // .end method
public void a ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 282 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Sending JS to a WebView: "; // const-string v1, "Sending JS to a WebView: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* .line 283 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "javascript:"; // const-string v1, "javascript:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.webkit.WebView ) p1 ).loadUrl ( v0 ); // invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 284 */
return;
} // .end method
public void a ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .prologue */
/* .line 267 */
final String v0 = "AFMA_ReceiveMessage"; // const-string v0, "AFMA_ReceiveMessage"
/* .line 268 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 269 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "(\'"; // const-string v1, "(\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\', "; // const-string v1, "\', "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ");"; // const-string v1, ");"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.google.ads.internal.a ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;)V
/* .line 273 */
} // :goto_0
return;
/* .line 271 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "(\'"; // const-string v1, "(\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\');"; // const-string v1, "\');"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.google.ads.internal.a ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;)V
} // .end method
public void a ( android.webkit.WebView p0, java.util.Map p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/webkit/WebView;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Boolean;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 294 */
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V */
(( org.json.JSONObject ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
/* .line 295 */
final String v1 = "openableURLs"; // const-string v1, "openableURLs"
(( com.google.ads.internal.a ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 296 */
return;
} // .end method
public void a ( Object p0, java.util.Map p1, android.net.Uri p2, android.webkit.WebView p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/internal/d;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/google/ads/n;", */
/* ">;", */
/* "Landroid/net/Uri;", */
/* "Landroid/webkit/WebView;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 179 */
com.google.ads.util.AdUtil .b ( p3 );
/* .line 180 */
/* if-nez v1, :cond_0 */
/* .line 181 */
final String v0 = "An error occurred while parsing the message parameters."; // const-string v0, "An error occurred while parsing the message parameters."
com.google.ads.util.b .e ( v0 );
/* .line 201 */
} // :goto_0
return;
/* .line 186 */
} // :cond_0
(( com.google.ads.internal.a ) p0 ).a ( p3, v1 ); // invoke-virtual {p0, p3, v1}, Lcom/google/ads/internal/a;->a(Landroid/net/Uri;Ljava/util/HashMap;)Ljava/lang/String;
/* .line 187 */
/* if-nez v2, :cond_1 */
/* .line 188 */
final String v0 = "An error occurred while parsing the message."; // const-string v0, "An error occurred while parsing the message."
com.google.ads.util.b .e ( v0 );
/* .line 193 */
} // :cond_1
/* check-cast v0, Lcom/google/ads/n; */
/* .line 194 */
/* if-nez v0, :cond_2 */
/* .line 195 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "No AdResponse found, <message: "; // const-string v1, "No AdResponse found, <message: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ">"; // const-string v1, ">"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
/* .line 200 */
} // :cond_2
} // .end method
public Boolean a ( android.net.Uri p0 ) {
/* .locals 2 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 212 */
if ( p1 != null) { // if-eqz p1, :cond_0
v1 = (( android.net.Uri ) p1 ).isHierarchical ( ); // invoke-virtual {p1}, Landroid/net/Uri;->isHierarchical()Z
/* if-nez v1, :cond_1 */
/* .line 216 */
} // :cond_0
} // :goto_0
} // :cond_1
v1 = (( com.google.ads.internal.a ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/ads/internal/a;->b(Landroid/net/Uri;)Z
/* if-nez v1, :cond_2 */
v1 = (( com.google.ads.internal.a ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/ads/internal/a;->c(Landroid/net/Uri;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void b ( android.webkit.WebView p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 315 */
final String v0 = "onhide"; // const-string v0, "onhide"
int v1 = 0; // const/4 v1, 0x0
(( com.google.ads.internal.a ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 316 */
return;
} // .end method
public Boolean b ( android.net.Uri p0 ) {
/* .locals 3 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 228 */
(( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* .line 229 */
if ( v1 != null) { // if-eqz v1, :cond_0
final String v2 = "gmsg"; // const-string v2, "gmsg"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* .line 239 */
} // :cond_0
} // :goto_0
/* .line 234 */
} // :cond_1
(( android.net.Uri ) p1 ).getAuthority ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;
/* .line 235 */
if ( v1 != null) { // if-eqz v1, :cond_0
final String v2 = "mobileads.google.com"; // const-string v2, "mobileads.google.com"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 239 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean c ( android.net.Uri p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 251 */
(( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* .line 252 */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = "admob"; // const-string v1, "admob"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 253 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 256 */
} // :goto_0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
