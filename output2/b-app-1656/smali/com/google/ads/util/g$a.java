public class com.google.ads.util.g$a extends android.webkit.WebChromeClient {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/util/g; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
private final com.google.ads.m a;
/* # direct methods */
public com.google.ads.util.g$a ( ) {
/* .locals 0 */
/* .prologue */
/* .line 163 */
/* invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V */
/* .line 164 */
this.a = p1;
/* .line 165 */
return;
} // .end method
private static void a ( android.app.AlertDialog$Builder p0, android.content.Context p1, java.lang.String p2, java.lang.String p3, android.webkit.JsPromptResult p4 ) {
/* .locals 4 */
/* .prologue */
/* .line 395 */
/* new-instance v0, Landroid/widget/LinearLayout; */
/* invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 396 */
int v1 = 1; // const/4 v1, 0x1
(( android.widget.LinearLayout ) v0 ).setOrientation ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V
/* .line 397 */
/* new-instance v1, Landroid/widget/TextView; */
/* invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
/* .line 398 */
(( android.widget.TextView ) v1 ).setText ( p2 ); // invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 399 */
/* new-instance v2, Landroid/widget/EditText; */
/* invoke-direct {v2, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
/* .line 400 */
(( android.widget.EditText ) v2 ).setText ( p3 ); // invoke-virtual {v2, p3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
/* .line 401 */
(( android.widget.LinearLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* .line 402 */
(( android.widget.LinearLayout ) v0 ).addView ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* .line 405 */
(( android.app.AlertDialog$Builder ) p0 ).setView ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
/* const v1, 0x104000a */
/* new-instance v3, Lcom/google/ads/util/g$a$6; */
/* invoke-direct {v3, p4, v2}, Lcom/google/ads/util/g$a$6;-><init>(Landroid/webkit/JsPromptResult;Landroid/widget/EditText;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* const/high16 v1, 0x1040000 */
/* new-instance v2, Lcom/google/ads/util/g$a$5; */
/* invoke-direct {v2, p4}, Lcom/google/ads/util/g$a$5;-><init>(Landroid/webkit/JsPromptResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* new-instance v1, Lcom/google/ads/util/g$a$4; */
/* invoke-direct {v1, p4}, Lcom/google/ads/util/g$a$4;-><init>(Landroid/webkit/JsPromptResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
/* .line 426 */
return;
} // .end method
private static void a ( android.app.AlertDialog$Builder p0, java.lang.String p1, android.webkit.JsResult p2 ) {
/* .locals 3 */
/* .prologue */
/* .line 365 */
(( android.app.AlertDialog$Builder ) p0 ).setMessage ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* const v1, 0x104000a */
/* new-instance v2, Lcom/google/ads/util/g$a$3; */
/* invoke-direct {v2, p2}, Lcom/google/ads/util/g$a$3;-><init>(Landroid/webkit/JsResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* const/high16 v1, 0x1040000 */
/* new-instance v2, Lcom/google/ads/util/g$a$2; */
/* invoke-direct {v2, p2}, Lcom/google/ads/util/g$a$2;-><init>(Landroid/webkit/JsResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* new-instance v1, Lcom/google/ads/util/g$a$1; */
/* invoke-direct {v1, p2}, Lcom/google/ads/util/g$a$1;-><init>(Landroid/webkit/JsResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
/* .line 386 */
return;
} // .end method
private static Boolean a ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.webkit.JsResult p4, android.webkit.JsPromptResult p5, Boolean p6 ) {
/* .locals 2 */
/* .prologue */
/* .line 340 */
/* instance-of v0, p0, Lcom/google/ads/internal/AdWebView; */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 341 */
	 /* check-cast p0, Lcom/google/ads/internal/AdWebView; */
	 /* .line 342 */
	 (( com.google.ads.internal.AdWebView ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/AdWebView;->d()Lcom/google/ads/AdActivity;
	 /* .line 343 */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 344 */
		 /* new-instance v1, Landroid/app/AlertDialog$Builder; */
		 /* invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 /* .line 345 */
		 (( android.app.AlertDialog$Builder ) v1 ).setTitle ( p1 ); // invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 /* .line 346 */
		 if ( p6 != null) { // if-eqz p6, :cond_0
			 /* .line 347 */
			 com.google.ads.util.g$a .a ( v1,v0,p2,p3,p5 );
			 /* .line 352 */
		 } // :goto_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 356 */
	 } // :goto_1
	 /* .line 349 */
} // :cond_0
com.google.ads.util.g$a .a ( v1,p2,p4 );
/* .line 356 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public void onCloseWindow ( android.webkit.WebView p0 ) {
/* .locals 1 */
/* .param p1, "webView" # Landroid/webkit/WebView; */
/* .prologue */
/* .line 169 */
/* instance-of v0, p1, Lcom/google/ads/internal/AdWebView; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 170 */
/* check-cast p1, Lcom/google/ads/internal/AdWebView; */
/* .line 171 */
} // .end local p1 # "webView":Landroid/webkit/WebView;
(( com.google.ads.internal.AdWebView ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/AdWebView;->a()V
/* .line 173 */
} // :cond_0
return;
} // .end method
public Boolean onConsoleMessage ( android.webkit.ConsoleMessage p0 ) {
/* .locals 3 */
/* .param p1, "consoleMessage" # Landroid/webkit/ConsoleMessage; */
/* .prologue */
/* .line 177 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "JS: "; // const-string v1, "JS: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.webkit.ConsoleMessage ) p1 ).message ( ); // invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " ("; // const-string v1, " ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.webkit.ConsoleMessage ) p1 ).sourceId ( ); // invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ":"; // const-string v1, ":"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( android.webkit.ConsoleMessage ) p1 ).lineNumber ( ); // invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->lineNumber()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 179 */
v1 = com.google.ads.util.g$1.a;
(( android.webkit.ConsoleMessage ) p1 ).messageLevel ( ); // invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;
v2 = (( android.webkit.ConsoleMessage$MessageLevel ) v2 ).ordinal ( ); // invoke-virtual {v2}, Landroid/webkit/ConsoleMessage$MessageLevel;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_0 */
/* .line 195 */
} // :goto_0
v0 = /* invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z */
/* .line 181 */
/* :pswitch_0 */
com.google.ads.util.b .b ( v0 );
/* .line 184 */
/* :pswitch_1 */
com.google.ads.util.b .e ( v0 );
/* .line 189 */
/* :pswitch_2 */
com.google.ads.util.b .c ( v0 );
/* .line 192 */
/* :pswitch_3 */
com.google.ads.util.b .a ( v0 );
/* .line 179 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public void onExceededDatabaseQuota ( java.lang.String p0, java.lang.String p1, Long p2, Long p3, Long p4, android.webkit.WebStorage$QuotaUpdater p5 ) {
/* .locals 6 */
/* .param p1, "url" # Ljava/lang/String; */
/* .param p2, "databaseIdentifier" # Ljava/lang/String; */
/* .param p3, "currentQuota" # J */
/* .param p5, "estimatedSize" # J */
/* .param p7, "totalUsedQuota" # J */
/* .param p9, "quotaUpdater" # Landroid/webkit/WebStorage$QuotaUpdater; */
/* .prologue */
/* const-wide/16 v2, 0x0 */
/* .line 216 */
v0 = this.a;
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l; */
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l$a; */
/* .line 219 */
v1 = this.i;
(( com.google.ads.util.i$c ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Long; */
(( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
/* sub-long/2addr v4, p7 */
/* .line 220 */
/* cmp-long v1, v4, v2 */
/* if-gtz v1, :cond_0 */
/* .line 222 */
/* .line 264 */
} // .end local p3 # "currentQuota":J
} // .end local p5 # "estimatedSize":J
} // :goto_0
return;
/* .line 228 */
/* .restart local p3 # "currentQuota":J */
/* .restart local p5 # "estimatedSize":J */
} // :cond_0
/* cmp-long v1, p3, v2 */
/* if-nez v1, :cond_2 */
/* .line 232 */
/* cmp-long v1, p5, v4 */
/* if-gtz v1, :cond_1 */
v0 = this.j;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* cmp-long v0, p5, v0 */
/* if-gtz v0, :cond_1 */
/* .line 263 */
} // .end local p3 # "currentQuota":J
} // .end local p5 # "estimatedSize":J
} // :goto_1
/* .restart local p3 # "currentQuota":J */
/* .restart local p5 # "estimatedSize":J */
} // :cond_1
/* move-wide p5, v2 */
/* .line 232 */
/* .line 244 */
} // :cond_2
/* cmp-long v1, p5, v2 */
/* if-nez v1, :cond_3 */
/* .line 246 */
v1 = this.k;
(( com.google.ads.util.i$c ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Long; */
(( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v1 */
java.lang.Math .min ( v1,v2,v4,v5 );
/* move-result-wide v1 */
/* .line 248 */
/* add-long/2addr v1, p3 */
v0 = this.j;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v3 */
java.lang.Math .min ( v1,v2,v3,v4 );
/* move-result-wide p5 */
/* .line 253 */
} // :cond_3
v0 = this.j;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* sub-long/2addr v0, p3 */
java.lang.Math .min ( v0,v1,v4,v5 );
/* move-result-wide v0 */
/* .line 256 */
/* cmp-long v0, p5, v0 */
/* if-gtz v0, :cond_4 */
/* add-long/2addr p3, p5 */
} // .end local p3 # "currentQuota":J
} // :cond_4
/* move-wide p5, p3 */
} // .end method
public Boolean onJsAlert ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3 ) {
/* .locals 7 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .param p4, "result" # Landroid/webkit/JsResult; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 268 */
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p1 */
/* move-object v1, p2 */
/* move-object v2, p3 */
/* move-object v4, p4 */
/* move-object v5, v3 */
v0 = /* invoke-static/range {v0 ..v6}, Lcom/google/ads/util/g$a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z */
} // .end method
public Boolean onJsBeforeUnload ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3 ) {
/* .locals 7 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .param p4, "result" # Landroid/webkit/JsResult; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 273 */
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p1 */
/* move-object v1, p2 */
/* move-object v2, p3 */
/* move-object v4, p4 */
/* move-object v5, v3 */
v0 = /* invoke-static/range {v0 ..v6}, Lcom/google/ads/util/g$a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z */
} // .end method
public Boolean onJsConfirm ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3 ) {
/* .locals 7 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .param p4, "result" # Landroid/webkit/JsResult; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 278 */
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p1 */
/* move-object v1, p2 */
/* move-object v2, p3 */
/* move-object v4, p4 */
/* move-object v5, v3 */
v0 = /* invoke-static/range {v0 ..v6}, Lcom/google/ads/util/g$a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z */
} // .end method
public Boolean onJsPrompt ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.webkit.JsPromptResult p4 ) {
/* .locals 7 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .param p4, "defaultValue" # Ljava/lang/String; */
/* .param p5, "result" # Landroid/webkit/JsPromptResult; */
/* .prologue */
/* .line 284 */
int v4 = 0; // const/4 v4, 0x0
int v6 = 1; // const/4 v6, 0x1
/* move-object v0, p1 */
/* move-object v1, p2 */
/* move-object v2, p3 */
/* move-object v3, p4 */
/* move-object v5, p5 */
v0 = /* invoke-static/range {v0 ..v6}, Lcom/google/ads/util/g$a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;Landroid/webkit/JsPromptResult;Z)Z */
} // .end method
public void onReachedMaxAppCacheSize ( Long p0, Long p1, android.webkit.WebStorage$QuotaUpdater p2 ) {
/* .locals 5 */
/* .param p1, "spaceNeeded" # J */
/* .param p3, "totalUsedQuota" # J */
/* .param p5, "quotaUpdater" # Landroid/webkit/WebStorage$QuotaUpdater; */
/* .prologue */
/* .line 302 */
v0 = this.a;
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l; */
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l$a; */
/* .line 306 */
v1 = this.h;
(( com.google.ads.util.i$c ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Long; */
(( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v1 */
/* sub-long/2addr v1, p3 */
/* .line 307 */
v0 = this.g;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v3 */
/* add-long/2addr v3, p1 */
/* .line 308 */
/* cmp-long v0, v1, v3 */
/* if-gez v0, :cond_0 */
/* .line 310 */
/* const-wide/16 v0, 0x0 */
/* .line 315 */
} // :goto_0
return;
/* .line 313 */
} // :cond_0
} // .end method
public void onShowCustomView ( android.view.View p0, android.webkit.WebChromeClient$CustomViewCallback p1 ) {
/* .locals 0 */
/* .param p1, "view" # Landroid/view/View; */
/* .param p2, "callback" # Landroid/webkit/WebChromeClient$CustomViewCallback; */
/* .prologue */
/* .line 323 */
/* .line 324 */
return;
} // .end method
