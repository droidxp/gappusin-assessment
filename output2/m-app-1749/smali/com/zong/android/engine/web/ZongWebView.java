public class com.zong.android.engine.web.ZongWebView extends com.zong.android.engine.process.ZongActivityProcess {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/zong/android/engine/web/ZongWebView$ZgJavaScriptInterface; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String c;
private static Boolean g; //synthetic
/* # instance fields */
private java.text.NumberFormat d;
private android.webkit.WebView e;
private zongfuscated.c f;
/* # direct methods */
static com.zong.android.engine.web.ZongWebView ( ) {
	 /* .locals 1 */
	 /* const-class v0, Lcom/zong/android/engine/web/ZongWebView; */
	 v0 = 	 (( java.lang.Class ) v0 ).desiredAssertionStatus ( ); // invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
com.zong.android.engine.web.ZongWebView.g = (v0!= 0);
/* const-class v0, Lcom/zong/android/engine/web/ZongWebView; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public com.zong.android.engine.web.ZongWebView ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Lcom/zong/android/engine/process/ZongActivityProcess;-><init>()V */
return;
} // .end method
static android.webkit.WebView a ( com.zong.android.engine.web.ZongWebView p0 ) { //synthethic
/* .locals 1 */
v0 = this.e;
} // .end method
static com.zong.android.engine.activities.ZongPricePointsElement a ( com.zong.android.engine.web.ZongWebView p0, com.zong.android.engine.activities.ZongPaymentRequest p1 ) { //synthethic
/* .locals 1 */
(( com.zong.android.engine.web.ZongWebView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/zong/android/engine/web/ZongWebView;->a(Lcom/zong/android/engine/activities/ZongPaymentRequest;)Lcom/zong/android/engine/activities/ZongPricePointsElement;
} // .end method
static java.text.NumberFormat b ( com.zong.android.engine.web.ZongWebView p0 ) { //synthethic
/* .locals 1 */
v0 = this.d;
} // .end method
static void c ( com.zong.android.engine.web.ZongWebView p0 ) { //synthethic
/* .locals 0 */
(( com.zong.android.engine.web.ZongWebView ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->a()V
return;
} // .end method
private void c ( java.lang.String p0 ) {
/* .locals 6 */
v0 = com.zong.android.engine.web.ZongWebView.c;
final String v1 = "Loading HTML page in viewer"; // const-string v1, "Loading HTML page in viewer"
zongfuscated.q .a ( v0,v1 );
v0 = this.e;
(( com.zong.android.engine.web.ZongWebView ) p0 ).g ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->g()Lzongfuscated/F;
(( zongfuscated.F ) v1 ).g ( ); // invoke-virtual {v1}, Lzongfuscated/F;->g()Lzongfuscated/e;
final String v2 = "/zongpay"; // const-string v2, "/zongpay"
(( zongfuscated.e ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lzongfuscated/e;->a(Ljava/lang/String;)Ljava/lang/String;
final String v3 = "text/html"; // const-string v3, "text/html"
final String v4 = "utf-8"; // const-string v4, "utf-8"
int v5 = 0; // const/4 v5, 0x0
/* move-object v2, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
return;
} // .end method
static void d ( com.zong.android.engine.web.ZongWebView p0 ) { //synthethic
/* .locals 0 */
(( com.zong.android.engine.web.ZongWebView ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->c()V
return;
} // .end method
static java.lang.String i ( ) { //synthethic
/* .locals 1 */
v0 = com.zong.android.engine.web.ZongWebView.c;
} // .end method
/* # virtual methods */
public final void a ( Float p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(Lzongfuscated/F;)V */
v0 = this.f;
final String v1 = "android.zong.gui.wait"; // const-string v1, "android.zong.gui.wait"
(( com.zong.android.engine.web.ZongWebView ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lcom/zong/android/engine/web/ZongWebView;->a(Ljava/lang/String;)Ljava/lang/String;
(( zongfuscated.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lzongfuscated/c;->a(Ljava/lang/String;)V
(( zongfuscated.F ) p1 ).e ( ); // invoke-virtual {p1}, Lzongfuscated/F;->e()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/web/ZongWebView;->c(Ljava/lang/String;)V */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 3 */
/* invoke-super {p0, p1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(Lzongfuscated/b;)V */
v0 = (( com.zong.android.engine.web.ZongWebView ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.zong.android.engine.web.ZongWebView.c;
final String v1 = "Payment Status OK"; // const-string v1, "Payment Status OK"
zongfuscated.q .a ( v0,v1 );
(( zongfuscated.b ) p1 ).c ( ); // invoke-virtual {p1}, Lzongfuscated/b;->c()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/web/ZongWebView;->c(Ljava/lang/String;)V */
} // :goto_0
return;
} // :cond_0
v0 = (( com.zong.android.engine.web.ZongWebView ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->f()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
v0 = com.zong.android.engine.web.ZongWebView.c;
final String v1 = "Payment Status ERROR"; // const-string v1, "Payment Status ERROR"
zongfuscated.q .a ( v0,v1 );
(( zongfuscated.b ) p1 ).c ( ); // invoke-virtual {p1}, Lzongfuscated/b;->c()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/web/ZongWebView;->c(Ljava/lang/String;)V */
} // :cond_1
v0 = com.zong.android.engine.web.ZongWebView.c;
final String v1 = "Payment Status STOP"; // const-string v1, "Payment Status STOP"
zongfuscated.q .a ( v0,v1 );
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "android.zong.gui.error"; // const-string v1, "android.zong.gui.error"
(( com.zong.android.engine.web.ZongWebView ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lcom/zong/android/engine/web/ZongWebView;->a(Ljava/lang/String;)Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "OK"; // const-string v1, "OK"
int v2 = 0; // const/4 v2, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
(( com.zong.android.engine.web.ZongWebView ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->a()V
} // .end method
public final void a ( Object p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1}, Lcom/zong/android/engine/process/ZongActivityProcess;->a(Lzongfuscated/p;)V */
(( zongfuscated.p ) p1 ).a ( ); // invoke-virtual {p1}, Lzongfuscated/p;->a()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.e;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "javascript:setStatusBar(\'"; // const-string v3, "javascript:setStatusBar(\'"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\')"; // const-string v2, "\')"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.webkit.WebView ) v1 ).loadUrl ( v0 ); // invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
protected final void b ( ) {
/* .locals 4 */
(( com.zong.android.engine.web.ZongWebView ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.web.ZongWebView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/zong/android/engine/web/ZongWebView;->a(Lcom/zong/android/engine/activities/ZongPaymentRequest;)Lcom/zong/android/engine/activities/ZongPricePointsElement;
v0 = (( com.zong.android.engine.activities.ZongPricePointsElement ) v0 ).getAmount ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPricePointsElement;->getAmount()F
java.lang.Float .valueOf ( v0 );
v1 = this.d;
(( java.text.NumberFormat ) v1 ).format ( v0 ); // invoke-virtual {v1, v0}, Ljava/text/NumberFormat;->format(Ljava/lang/Object;)Ljava/lang/String;
v1 = this.e;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "javascript:setProgressDescription(\'"; // const-string v3, "javascript:setProgressDescription(\'"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\')"; // const-string v2, "\')"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.webkit.WebView ) v1 ).loadUrl ( v0 ); // invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* invoke-super {p0}, Lcom/zong/android/engine/process/ZongActivityProcess;->b()V */
return;
} // .end method
public final void d ( ) {
/* .locals 2 */
/* invoke-super {p0}, Lcom/zong/android/engine/process/ZongActivityProcess;->d()V */
v0 = com.zong.android.engine.web.ZongWebView.c;
final String v1 = "Starting Application Listenner"; // const-string v1, "Starting Application Listenner"
zongfuscated.q .a ( v0,v1 );
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 5 */
int v4 = -1; // const/4 v4, -0x1
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* invoke-super {p0, p1}, Lcom/zong/android/engine/process/ZongActivityProcess;->onCreate(Landroid/os/Bundle;)V */
v0 = com.zong.android.engine.web.ZongWebView.c;
final String v1 = "LifeCycle Event: onCreate"; // const-string v1, "LifeCycle Event: onCreate"
zongfuscated.q .a ( v0,v1 );
/* iput v3, p0, Lcom/zong/android/engine/process/ZongActivityProcess;->a:I */
/* new-instance v0, Landroid/webkit/WebView; */
/* invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
this.e = v0;
v0 = this.e;
/* const v1, 0x189c9 */
(( android.webkit.WebView ) v0 ).setId ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setId(I)V
v0 = this.e;
/* new-instance v1, Landroid/view/ViewGroup$LayoutParams; */
/* invoke-direct {v1, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.webkit.WebView ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
v0 = this.e;
(( android.webkit.WebView ) v0 ).setVerticalScrollBarEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
v0 = this.e;
(( android.webkit.WebView ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setVisibility(I)V
v0 = this.e;
(( com.zong.android.engine.web.ZongWebView ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/zong/android/engine/web/ZongWebView;->setContentView(Landroid/view/View;)V
v0 = this.e;
(( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v0 ).setSavePassword ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
(( android.webkit.WebSettings ) v0 ).setSaveFormData ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
(( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v3 ); // invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
(( android.webkit.WebSettings ) v0 ).setSupportZoom ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
v1 = android.webkit.WebSettings$RenderPriority.HIGH;
(( android.webkit.WebSettings ) v0 ).setRenderPriority ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V
(( android.webkit.WebSettings ) v0 ).setCacheMode ( v3 ); // invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V
/* new-instance v0, Lzongfuscated/c; */
/* invoke-direct {v0, p0}, Lzongfuscated/c;-><init>(Lcom/zong/android/engine/web/ZongWebView;)V */
this.f = v0;
v0 = this.e;
v1 = this.f;
(( android.webkit.WebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
v0 = this.e;
/* new-instance v1, Lcom/zong/android/engine/web/ZongWebView$ZgJavaScriptInterface; */
/* invoke-direct {v1, p0}, Lcom/zong/android/engine/web/ZongWebView$ZgJavaScriptInterface;-><init>(Lcom/zong/android/engine/web/ZongWebView;)V */
final String v2 = "zong"; // const-string v2, "zong"
(( android.webkit.WebView ) v0 ).addJavascriptInterface ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
(( com.zong.android.engine.web.ZongWebView ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
if ( v0 != null) { // if-eqz v0, :cond_1
final String v1 = "com.zong.intent.Request"; // const-string v1, "com.zong.intent.Request"
(( android.os.Bundle ) v0 ).getParcelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPaymentRequest; */
(( com.zong.android.engine.web.ZongWebView ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/zong/android/engine/web/ZongWebView;->b(Lcom/zong/android/engine/activities/ZongPaymentRequest;)V
/* sget-boolean v0, Lcom/zong/android/engine/web/ZongWebView;->g:Z */
/* if-nez v0, :cond_0 */
(( com.zong.android.engine.web.ZongWebView ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
/* if-nez v0, :cond_0 */
/* new-instance v0, Ljava/lang/AssertionError; */
/* invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V */
/* throw v0 */
} // :cond_0
(( com.zong.android.engine.web.ZongWebView ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getDebugMode ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getDebugMode()Ljava/lang/Boolean;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
zongfuscated.q .a ( v0 );
(( com.zong.android.engine.web.ZongWebView ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->h()Lcom/zong/android/engine/activities/ZongPaymentRequest;
(( com.zong.android.engine.activities.ZongPaymentRequest ) v0 ).getCurrencyFormatter ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCurrencyFormatter()Ljava/text/NumberFormat;
this.d = v0;
} // :cond_1
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
v0 = com.zong.android.engine.web.ZongWebView.c;
final String v1 = "LifeCycle Event: onKeyDown"; // const-string v1, "LifeCycle Event: onKeyDown"
zongfuscated.q .a ( v0,v1 );
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
v0 = (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
/* if-nez v0, :cond_0 */
v0 = com.zong.android.engine.web.ZongWebView.c;
final String v1 = "Exiting App with onKeyDown Event"; // const-string v1, "Exiting App with onKeyDown Event"
zongfuscated.q .a ( v0,v1 );
(( com.zong.android.engine.web.ZongWebView ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/web/ZongWebView;->c()V
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Lcom/zong/android/engine/process/ZongActivityProcess;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
