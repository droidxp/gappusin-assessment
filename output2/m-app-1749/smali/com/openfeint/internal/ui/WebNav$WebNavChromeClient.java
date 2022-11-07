class com.openfeint.internal.ui.WebNav$WebNavChromeClient extends android.webkit.WebChromeClient {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/WebNav; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "WebNavChromeClient" */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav this$0; //synthetic
/* # direct methods */
private com.openfeint.internal.ui.WebNav$WebNavChromeClient ( ) {
/* .locals 0 */
/* .prologue */
/* .line 500 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V */
return;
} // .end method
 com.openfeint.internal.ui.WebNav$WebNavChromeClient ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/openfeint/internal/ui/WebNav; */
/* .param p2, "x1" # Lcom/openfeint/internal/ui/WebNav$1; */
/* .prologue */
/* .line 500 */
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;-><init>(Lcom/openfeint/internal/ui/WebNav;)V */
return;
} // .end method
/* # virtual methods */
public void onConsoleMessage ( java.lang.String p0, Integer p1, java.lang.String p2 ) {
/* .locals 5 */
/* .param p1, "message" # Ljava/lang/String; */
/* .param p2, "lineNumber" # I */
/* .param p3, "sourceID" # Ljava/lang/String; */
/* .prologue */
/* .line 543 */
v1 = this.this$0;
/* iget-boolean v1, v1, Lcom/openfeint/internal/ui/WebNav;->mIsFrameworkLoaded:Z */
/* if-nez v1, :cond_0 */
/* .line 544 */
final String v1 = "%s at %s:%d)"; // const-string v1, "%s at %s:%d)"
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* aput-object p3, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
java.lang.Integer .valueOf ( p2 );
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
/* .line 545 */
/* .local v0, "line":Ljava/lang/String; */
v1 = this.this$0;
v1 = this.mPreloadConsoleOutput;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 547 */
} // .end local v0 # "line":Ljava/lang/String;
} // :cond_0
return;
} // .end method
public Boolean onJsAlert ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .param p4, "result" # Landroid/webkit/JsResult; */
/* .prologue */
/* .line 503 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
(( android.webkit.WebView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( p3 ); // invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
/* new-instance v2, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$2; */
/* invoke-direct {v2, p0, p4}, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$2;-><init>(Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;Landroid/webkit/JsResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* new-instance v1, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$1; */
/* invoke-direct {v1, p0, p4}, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$1;-><init>(Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;Landroid/webkit/JsResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 516 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean onJsConfirm ( android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "message" # Ljava/lang/String; */
/* .param p4, "result" # Landroid/webkit/JsResult; */
/* .prologue */
/* .line 521 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
(( android.webkit.WebView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( p3 ); // invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
/* new-instance v2, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$5; */
/* invoke-direct {v2, p0, p4}, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$5;-><init>(Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;Landroid/webkit/JsResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
/* new-instance v2, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$4; */
/* invoke-direct {v2, p0, p4}, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$4;-><init>(Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;Landroid/webkit/JsResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* new-instance v1, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$3; */
/* invoke-direct {v1, p0, p4}, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient$3;-><init>(Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;Landroid/webkit/JsResult;)V */
(( android.app.AlertDialog$Builder ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 538 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
