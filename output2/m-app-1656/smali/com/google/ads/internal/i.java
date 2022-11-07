public class com.google.ads.internal.i extends android.webkit.WebViewClient {
	 /* .source "SourceFile" */
	 /* # static fields */
	 private static final com.google.ads.internal.a c;
	 /* # instance fields */
	 protected com.google.ads.internal.d a;
	 protected Boolean b;
	 private java.util.Map d;
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
private Boolean e;
private Boolean f;
private Boolean g;
private Boolean h;
/* # direct methods */
static com.google.ads.internal.i ( ) {
/* .locals 1 */
/* .prologue */
/* .line 28 */
v0 = com.google.ads.internal.a.a;
/* check-cast v0, Lcom/google/ads/internal/a; */
return;
} // .end method
protected com.google.ads.internal.i ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/internal/d;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/google/ads/n;", */
/* ">;ZZ)V" */
/* } */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 76 */
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
/* .line 77 */
this.a = p1;
/* .line 78 */
this.d = p2;
/* .line 79 */
/* iput-boolean p3, p0, Lcom/google/ads/internal/i;->e:Z */
/* .line 80 */
/* iput-boolean p4, p0, Lcom/google/ads/internal/i;->f:Z */
/* .line 81 */
/* iput-boolean v0, p0, Lcom/google/ads/internal/i;->b:Z */
/* .line 82 */
/* iput-boolean v0, p0, Lcom/google/ads/internal/i;->g:Z */
/* .line 83 */
/* iput-boolean v0, p0, Lcom/google/ads/internal/i;->h:Z */
/* .line 84 */
return;
} // .end method
public static com.google.ads.internal.i a ( Object p0, java.util.Map p1, Boolean p2, Boolean p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/internal/d;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/google/ads/n;", */
/* ">;ZZ)", */
/* "Lcom/google/ads/internal/i;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 92 */
/* const/16 v1, 0xb */
/* if-lt v0, v1, :cond_0 */
/* .line 93 */
/* new-instance v0, Lcom/google/ads/util/g$b; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/ads/util/g$b;-><init>(Lcom/google/ads/internal/d;Ljava/util/Map;ZZ)V */
/* .line 96 */
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/google/ads/internal/i; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/ads/internal/i;-><init>(Lcom/google/ads/internal/d;Ljava/util/Map;ZZ)V */
} // .end method
/* # virtual methods */
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 186 */
/* iput-boolean p1, p0, Lcom/google/ads/internal/i;->b:Z */
/* .line 187 */
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 194 */
/* iput-boolean p1, p0, Lcom/google/ads/internal/i;->f:Z */
/* .line 195 */
return;
} // .end method
public void c ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 205 */
/* iput-boolean p1, p0, Lcom/google/ads/internal/i;->g:Z */
/* .line 206 */
return;
} // .end method
public void d ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 216 */
/* iput-boolean p1, p0, Lcom/google/ads/internal/i;->h:Z */
/* .line 217 */
return;
} // .end method
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 163 */
/* iget-boolean v0, p0, Lcom/google/ads/internal/i;->g:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 167 */
v0 = this.a;
(( com.google.ads.internal.d ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->i()Lcom/google/ads/internal/c;
/* .line 168 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 169 */
(( com.google.ads.internal.c ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/c;->c()V
/* .line 173 */
} // :goto_0
/* iput-boolean v1, p0, Lcom/google/ads/internal/i;->g:Z */
/* .line 176 */
} // :cond_0
/* iget-boolean v0, p0, Lcom/google/ads/internal/i;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 177 */
v0 = com.google.ads.internal.i.c;
(( com.google.ads.internal.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;)V
/* .line 178 */
/* iput-boolean v1, p0, Lcom/google/ads/internal/i;->h:Z */
/* .line 180 */
} // :cond_1
return;
/* .line 171 */
} // :cond_2
final String v0 = "adLoader was null while trying to setFinishedLoadingHtml()."; // const-string v0, "adLoader was null while trying to setFinishedLoadingHtml()."
com.google.ads.util.b .a ( v0 );
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 5 */
/* .param p1, "webView" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 108 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "shouldOverrideUrlLoading(\""; // const-string v2, "shouldOverrideUrlLoading(\""
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\")"; // const-string v2, "\")"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* .line 111 */
android.net.Uri .parse ( p2 );
/* .line 115 */
com.google.ads.util.AdUtil .b ( v2 );
/* .line 116 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 117 */
final String v3 = "ai"; // const-string v3, "ai"
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 118 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 119 */
v3 = this.a;
(( com.google.ads.internal.d ) v3 ).l ( ); // invoke-virtual {v3}, Lcom/google/ads/internal/d;->l()Lcom/google/ads/internal/g;
(( com.google.ads.internal.g ) v3 ).a ( v0 ); // invoke-virtual {v3, v0}, Lcom/google/ads/internal/g;->a(Ljava/lang/String;)V
/* .line 124 */
} // :cond_0
v0 = com.google.ads.internal.i.c;
v0 = (( com.google.ads.internal.a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/internal/a;->a(Landroid/net/Uri;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 125 */
v0 = com.google.ads.internal.i.c;
v3 = this.a;
v4 = this.d;
(( com.google.ads.internal.a ) v0 ).a ( v3, v4, v2, p1 ); // invoke-virtual {v0, v3, v4, v2, p1}, Lcom/google/ads/internal/a;->a(Lcom/google/ads/internal/d;Ljava/util/Map;Landroid/net/Uri;Landroid/webkit/WebView;)V
/* move v0, v1 */
/* .line 153 */
} // :goto_0
/* .line 127 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/google/ads/internal/i;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 129 */
v0 = com.google.ads.util.AdUtil .a ( v2 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 132 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z */
/* .line 135 */
} // :cond_2
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 136 */
final String v2 = "u"; // const-string v2, "u"
(( java.util.HashMap ) v0 ).put ( v2, p2 ); // invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 137 */
v2 = this.a;
/* new-instance v3, Lcom/google/ads/internal/e; */
final String v4 = "intent"; // const-string v4, "intent"
/* invoke-direct {v3, v4, v0}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V */
com.google.ads.AdActivity .launchAdActivity ( v2,v3 );
/* move v0, v1 */
/* .line 140 */
/* .line 142 */
} // :cond_3
/* iget-boolean v0, p0, Lcom/google/ads/internal/i;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 144 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 145 */
final String v3 = "u"; // const-string v3, "u"
(( android.net.Uri ) v2 ).toString ( ); // invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;
(( java.util.HashMap ) v0 ).put ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 146 */
v2 = this.a;
/* new-instance v3, Lcom/google/ads/internal/e; */
final String v4 = "intent"; // const-string v4, "intent"
/* invoke-direct {v3, v4, v0}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V */
com.google.ads.AdActivity .launchAdActivity ( v2,v3 );
/* move v0, v1 */
/* .line 148 */
/* .line 150 */
} // :cond_4
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "URL is not a GMSG and can\'t handle URL: "; // const-string v2, "URL is not a GMSG and can\'t handle URL: "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
/* move v0, v1 */
/* .line 153 */
} // .end method
