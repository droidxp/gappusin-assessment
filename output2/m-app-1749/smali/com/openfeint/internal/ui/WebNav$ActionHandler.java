public class com.openfeint.internal.ui.WebNav$ActionHandler {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/WebNav; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4 */
/* name = "ActionHandler" */
} // .end annotation
/* # static fields */
private static final java.lang.String WEBUI_PREFS;
private static final java.lang.String WEBUI_SETTING_PREFIX;
/* # instance fields */
java.util.List mActionList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
com.openfeint.internal.ui.WebNav mWebNav;
final com.openfeint.internal.ui.WebNav this$0; //synthetic
/* # direct methods */
public com.openfeint.internal.ui.WebNav$ActionHandler ( ) {
/* .locals 1 */
/* .param p2, "webNav" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 571 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 572 */
this.mWebNav = p2;
/* .line 574 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mActionList = v0;
/* .line 575 */
v0 = this.mActionList;
(( com.openfeint.internal.ui.WebNav$ActionHandler ) p0 ).populateActionList ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->populateActionList(Ljava/util/List;)V
/* .line 576 */
return;
} // .end method
private java.util.Map parseQueryString ( android.net.Uri p0 ) {
/* .locals 1 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* ")", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 667 */
(( android.net.Uri ) p1 ).getEncodedQuery ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->parseQueryString(Ljava/lang/String;)Ljava/util/Map; */
} // .end method
private java.util.Map parseQueryString ( java.lang.String p0 ) {
/* .locals 10 */
/* .param p1, "queryString" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
int v9 = 0; // const/4 v9, 0x0
/* .line 680 */
/* new-instance v3, Ljava/util/HashMap; */
/* invoke-direct {v3}, Ljava/util/HashMap;-><init>()V */
/* .line 682 */
/* .local v3, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 683 */
final String v7 = "&"; // const-string v7, "&"
(( java.lang.String ) p1 ).split ( v7 ); // invoke-virtual {p1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 685 */
/* .local v5, "pairs":[Ljava/lang/String; */
/* move-object v0, v5 */
/* .local v0, "arr$":[Ljava/lang/String; */
/* array-length v2, v0 */
/* .local v2, "len$":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i$":I */
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* aget-object v6, v0, v1 */
/* .line 686 */
/* .local v6, "stringPair":Ljava/lang/String; */
final String v7 = "="; // const-string v7, "="
(( java.lang.String ) v6 ).split ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 687 */
/* .local v4, "pair":[Ljava/lang/String; */
/* array-length v7, v4 */
int v8 = 2; // const/4 v8, 0x2
/* if-ne v7, v8, :cond_0 */
/* .line 688 */
/* aget-object v7, v4, v9 */
int v8 = 1; // const/4 v8, 0x1
/* aget-object v8, v4, v8 */
android.net.Uri .decode ( v8 );
/* .line 685 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 690 */
} // :cond_0
/* aget-object v7, v4, v9 */
int v8 = 0; // const/4 v8, 0x0
/* .line 695 */
} // .end local v0 # "arr$":[Ljava/lang/String;
} // .end local v1 # "i$":I
} // .end local v2 # "len$":I
} // .end local v4 # "pair":[Ljava/lang/String;
} // .end local v5 # "pairs":[Ljava/lang/String;
} // .end local v6 # "stringPair":Ljava/lang/String;
} // :cond_1
} // .end method
/* # virtual methods */
public void alert ( java.util.Map p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 789 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.mWebNav;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 790 */
/* .local v0, "builder":Landroid/app/AlertDialog$Builder; */
final String v1 = "title"; // const-string v1, "title"
/* check-cast v1, Ljava/lang/CharSequence; */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 791 */
final String v1 = "message"; // const-string v1, "message"
/* check-cast v1, Ljava/lang/CharSequence; */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 792 */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
int v2 = 0; // const/4 v2, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 793 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 794 */
return;
} // .end method
public void apiRequest ( java.util.Map p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 707 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v3 = "request_id"; // const-string v3, "request_id"
/* check-cast v2, Ljava/lang/String; */
/* .line 708 */
/* .local v2, "requestID":Ljava/lang/String; */
final String v3 = "params"; // const-string v3, "params"
/* check-cast v3, Ljava/lang/String; */
/* invoke-direct {p0, v3}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->parseQueryString(Ljava/lang/String;)Ljava/util/Map; */
/* .line 709 */
/* .local v1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v3 = "httpParams"; // const-string v3, "httpParams"
/* check-cast v3, Ljava/lang/String; */
/* invoke-direct {p0, v3}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->parseQueryString(Ljava/lang/String;)Ljava/util/Map; */
/* .line 711 */
/* .local v0, "httpParams":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v3 = "path"; // const-string v3, "path"
/* check-cast v3, Ljava/lang/String; */
final String v4 = "method"; // const-string v4, "method"
/* check-cast v4, Ljava/lang/String; */
/* new-instance v5, Lcom/openfeint/internal/ui/WebNav$ActionHandler$1; */
/* invoke-direct {v5, p0, v2}, Lcom/openfeint/internal/ui/WebNav$ActionHandler$1;-><init>(Lcom/openfeint/internal/ui/WebNav$ActionHandler;Ljava/lang/String;)V */
com.openfeint.internal.OpenFeintInternal .genericRequest ( v3,v4,v1,v0,v5 );
/* .line 725 */
return;
} // .end method
public void back ( java.util.Map p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
int v3 = 1; // const/4 v3, 0x1
/* .line 763 */
v1 = this.mWebNav;
int v2 = 0; // const/4 v2, 0x0
(( com.openfeint.internal.ui.WebNav ) v1 ).fade ( v2 ); // invoke-virtual {v1, v2}, Lcom/openfeint/internal/ui/WebNav;->fade(Z)V
/* .line 764 */
final String v1 = "root"; // const-string v1, "root"
/* check-cast v0, Ljava/lang/String; */
/* .line 765 */
/* .local v0, "root":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = "false"; // const-string v1, "false"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 766 */
v1 = this.mWebNav;
/* iput v3, v1, Lcom/openfeint/internal/ui/WebNav;->pageStackCount:I */
/* .line 769 */
} // :cond_0
v1 = this.mWebNav;
/* iget v1, v1, Lcom/openfeint/internal/ui/WebNav;->pageStackCount:I */
/* if-le v1, v3, :cond_1 */
/* .line 770 */
v1 = this.mWebNav;
/* iget v2, v1, Lcom/openfeint/internal/ui/WebNav;->pageStackCount:I */
/* add-int/lit8 v2, v2, -0x1 */
/* iput v2, v1, Lcom/openfeint/internal/ui/WebNav;->pageStackCount:I */
/* .line 772 */
} // :cond_1
return;
} // .end method
public void contentLoaded ( java.util.Map p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 728 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v0 = "keepLoader"; // const-string v0, "keepLoader"
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "keepLoader"; // const-string v0, "keepLoader"
/* check-cast v0, Ljava/lang/String; */
final String v1 = "true"; // const-string v1, "true"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 729 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
(( com.openfeint.internal.ui.WebNav$ActionHandler ) p0 ).hideLoader ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->hideLoader(Ljava/util/Map;)V
/* .line 730 */
v1 = this.this$0;
final String v0 = "title"; // const-string v0, "title"
/* check-cast v0, Ljava/lang/CharSequence; */
(( com.openfeint.internal.ui.WebNav ) v1 ).setTitle ( v0 ); // invoke-virtual {v1, v0}, Lcom/openfeint/internal/ui/WebNav;->setTitle(Ljava/lang/CharSequence;)V
/* .line 733 */
} // :cond_1
v0 = this.mWebNav;
int v1 = 1; // const/4 v1, 0x1
(( com.openfeint.internal.ui.WebNav ) v0 ).fade ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->fade(Z)V
/* .line 734 */
v0 = this.this$0;
com.openfeint.internal.ui.WebNav .access$200 ( v0 );
/* .line 735 */
return;
} // .end method
public void dashboard ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 896 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
com.openfeint.api.ui.Dashboard .openFromSpotlight ( );
/* .line 897 */
return;
} // .end method
public void dismiss ( java.util.Map p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 797 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
v0 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebNav;->finish()V
/* .line 798 */
return;
} // .end method
public void dispatch ( android.net.Uri p0 ) {
/* .locals 9 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .prologue */
/* .line 622 */
(( android.net.Uri ) p1 ).getHost ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;
final String v6 = "action"; // const-string v6, "action"
v5 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 625 */
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->parseQueryString(Landroid/net/Uri;)Ljava/util/Map; */
/* .line 626 */
/* .local v3, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
(( android.net.Uri ) p1 ).getPath ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
final String v6 = "/"; // const-string v6, "/"
final String v7 = ""; // const-string v7, ""
(( java.lang.String ) v5 ).replaceFirst ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 629 */
/* .local v0, "actionName":Ljava/lang/String; */
final String v5 = "log"; // const-string v5, "log"
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v5, :cond_1 */
/* .line 630 */
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V */
/* .line 631 */
/* .local v2, "escapedOptions":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v5 = "params"; // const-string v5, "params"
/* check-cast v4, Ljava/lang/String; */
/* .line 632 */
/* .local v4, "params":Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_0
final String v5 = "password"; // const-string v5, "password"
v5 = (( java.lang.String ) v4 ).contains ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 633 */
final String v5 = "params"; // const-string v5, "params"
final String v6 = "---FILTERED---"; // const-string v6, "---FILTERED---"
/* .line 636 */
} // :cond_0
final String v5 = "WebUI"; // const-string v5, "WebUI"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "ACTION: "; // const-string v7, "ACTION: "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = " "; // const-string v7, " "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 640 */
} // .end local v2 # "escapedOptions":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v4 # "params":Ljava/lang/String;
} // :cond_1
v5 = v5 = this.mActionList;
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 642 */
try { // :try_start_0
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Class; */
int v7 = 0; // const/4 v7, 0x0
/* const-class v8, Ljava/util/Map; */
/* aput-object v8, v6, v7 */
(( java.lang.Class ) v5 ).getMethod ( v0, v6 ); // invoke-virtual {v5, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Object; */
int v7 = 0; // const/4 v7, 0x0
/* aput-object v3, v6, v7 */
(( java.lang.reflect.Method ) v5 ).invoke ( p0, v6 ); // invoke-virtual {v5, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 655 */
} // .end local v0 # "actionName":Ljava/lang/String;
} // .end local v3 # "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
} // :goto_0
return;
/* .line 643 */
/* .restart local v0 # "actionName":Ljava/lang/String; */
/* .restart local v3 # "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
/* :catch_0 */
/* move-exception v1 */
/* .line 644 */
/* .local v1, "e":Ljava/lang/NoSuchMethodException; */
final String v5 = "WebUI"; // const-string v5, "WebUI"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "mActionList contains this method, but it is not implemented: "; // const-string v7, "mActionList contains this method, but it is not implemented: "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 645 */
} // .end local v1 # "e":Ljava/lang/NoSuchMethodException;
/* :catch_1 */
/* move-exception v1 */
/* .line 646 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v5 = "WebUI"; // const-string v5, "WebUI"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Unhandled Exception: "; // const-string v7, "Unhandled Exception: "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = " "; // const-string v7, " "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v1 ).getCause ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getCause()Ljava/lang/Throwable;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 649 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_2
final String v5 = "WebUI"; // const-string v5, "WebUI"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "UNHANDLED ACTION: "; // const-string v7, "UNHANDLED ACTION: "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 653 */
} // .end local v0 # "actionName":Ljava/lang/String;
} // .end local v3 # "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
} // :cond_3
final String v5 = "WebUI"; // const-string v5, "WebUI"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "UNHANDLED MESSAGE TYPE: "; // const-string v7, "UNHANDLED MESSAGE TYPE: "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.net.Uri ) p1 ).getHost ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
} // .end method
public void downloadBlob ( java.util.Map p0 ) {
/* .locals 15 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 861 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v10 = "score"; // const-string v10, "score"
/* move-object/from16 v0, p1 */
/* check-cast v8, Ljava/lang/String; */
/* .line 862 */
/* .local v8, "scoreJSON":Ljava/lang/String; */
final String v10 = "onError"; // const-string v10, "onError"
/* move-object/from16 v0, p1 */
/* check-cast v5, Ljava/lang/String; */
/* .line 863 */
/* .local v5, "onError":Ljava/lang/String; */
final String v10 = "onSuccess"; // const-string v10, "onSuccess"
/* move-object/from16 v0, p1 */
/* check-cast v6, Ljava/lang/String; */
/* .line 866 */
/* .local v6, "onSuccess":Ljava/lang/String; */
try { // :try_start_0
/* new-instance v4, Lorg/codehaus/jackson/JsonFactory; */
/* invoke-direct {v4}, Lorg/codehaus/jackson/JsonFactory;-><init>()V */
/* .line 867 */
/* .local v4, "jsonFactory":Lorg/codehaus/jackson/JsonFactory; */
/* new-instance v10, Ljava/io/StringReader; */
/* invoke-direct {v10, v8}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V */
(( org.codehaus.jackson.JsonFactory ) v4 ).createJsonParser ( v10 ); // invoke-virtual {v4, v10}, Lorg/codehaus/jackson/JsonFactory;->createJsonParser(Ljava/io/Reader;)Lorg/codehaus/jackson/JsonParser;
/* .line 868 */
/* .local v2, "jp":Lorg/codehaus/jackson/JsonParser; */
/* new-instance v3, Lcom/openfeint/internal/JsonResourceParser; */
/* invoke-direct {v3, v2}, Lcom/openfeint/internal/JsonResourceParser;-><init>(Lorg/codehaus/jackson/JsonParser;)V */
/* .line 869 */
/* .local v3, "jrp":Lcom/openfeint/internal/JsonResourceParser; */
(( com.openfeint.internal.JsonResourceParser ) v3 ).parse ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/JsonResourceParser;->parse()Ljava/lang/Object;
/* .line 871 */
/* .local v9, "scoreObject":Ljava/lang/Object; */
if ( v9 != null) { // if-eqz v9, :cond_0
/* instance-of v10, v9, Lcom/openfeint/api/resource/Score; */
if ( v10 != null) { // if-eqz v10, :cond_0
/* .line 872 */
/* move-object v0, v9 */
/* check-cast v0, Lcom/openfeint/api/resource/Score; */
/* move-object v7, v0 */
/* .line 873 */
/* .local v7, "score":Lcom/openfeint/api/resource/Score; */
/* new-instance v10, Lcom/openfeint/internal/ui/WebNav$ActionHandler$3; */
/* invoke-direct {v10, p0, v6, v7, v5}, Lcom/openfeint/internal/ui/WebNav$ActionHandler$3;-><init>(Lcom/openfeint/internal/ui/WebNav$ActionHandler;Ljava/lang/String;Lcom/openfeint/api/resource/Score;Ljava/lang/String;)V */
(( com.openfeint.api.resource.Score ) v7 ).downloadBlob ( v10 ); // invoke-virtual {v7, v10}, Lcom/openfeint/api/resource/Score;->downloadBlob(Lcom/openfeint/api/resource/Score$DownloadBlobCB;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 893 */
} // .end local v2 # "jp":Lorg/codehaus/jackson/JsonParser;
} // .end local v3 # "jrp":Lcom/openfeint/internal/JsonResourceParser;
} // .end local v4 # "jsonFactory":Lorg/codehaus/jackson/JsonFactory;
} // .end local v7 # "score":Lcom/openfeint/api/resource/Score;
} // .end local v9 # "scoreObject":Ljava/lang/Object;
} // :cond_0
} // :goto_0
return;
/* .line 887 */
/* :catch_0 */
/* move-exception v1 */
/* .line 888 */
/* .local v1, "e":Ljava/lang/Exception; */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 889 */
v10 = this.this$0;
final String v11 = "%s(%s)"; // const-string v11, "%s(%s)"
int v12 = 2; // const/4 v12, 0x2
/* new-array v12, v12, [Ljava/lang/Object; */
int v13 = 0; // const/4 v13, 0x0
/* aput-object v5, v12, v13 */
int v13 = 1; // const/4 v13, 0x1
(( java.lang.Exception ) v1 ).getLocalizedMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;
/* aput-object v14, v12, v13 */
java.lang.String .format ( v11,v12 );
(( com.openfeint.internal.ui.WebNav ) v10 ).executeJavascript ( v11 ); // invoke-virtual {v10, v11}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
} // .end method
protected java.util.List getActionList ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 562 */
v0 = this.mActionList;
} // .end method
public void hideLoader ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 780 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
return;
} // .end method
public void isApplicationInstalled ( java.util.Map p0 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
int v10 = 0; // const/4 v10, 0x0
/* .line 811 */
int v2 = 0; // const/4 v2, 0x0
/* .line 813 */
/* .local v2, "installed":Z */
v6 = this.mWebNav;
(( com.openfeint.internal.ui.WebNav ) v6 ).getPackageManager ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/ui/WebNav;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 814 */
/* .local v4, "manager":Landroid/content/pm/PackageManager; */
(( android.content.pm.PackageManager ) v4 ).getInstalledApplications ( v10 ); // invoke-virtual {v4, v10}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;
/* .line 816 */
/* .local v3, "installedApps":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ApplicationInfo;>;" */
final String v6 = "package_name"; // const-string v6, "package_name"
/* check-cast v5, Ljava/lang/String; */
/* .line 818 */
/* .local v5, "searchString":Ljava/lang/String; */
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_1
/* check-cast v1, Landroid/content/pm/ApplicationInfo; */
/* .line 819 */
/* .local v1, "info":Landroid/content/pm/ApplicationInfo; */
v6 = this.packageName;
v6 = (( java.lang.String ) v6 ).equals ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 820 */
int v2 = 1; // const/4 v2, 0x1
/* .line 824 */
} // .end local v1 # "info":Landroid/content/pm/ApplicationInfo;
} // :cond_1
v7 = this.this$0;
final String v8 = "%s(%s)"; // const-string v8, "%s(%s)"
int v6 = 2; // const/4 v6, 0x2
/* new-array v9, v6, [Ljava/lang/Object; */
final String v6 = "callback"; // const-string v6, "callback"
/* aput-object v6, v9, v10 */
int v10 = 1; // const/4 v10, 0x1
if ( v2 != null) { // if-eqz v2, :cond_2
final String v6 = "true"; // const-string v6, "true"
} // :goto_1
/* aput-object v6, v9, v10 */
java.lang.String .format ( v8,v9 );
(( com.openfeint.internal.ui.WebNav ) v7 ).executeJavascript ( v6 ); // invoke-virtual {v7, v6}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 827 */
return;
/* .line 824 */
} // :cond_2
final String v6 = "false"; // const-string v6, "false"
} // .end method
public void log ( java.util.Map p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 783 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v1 = "message"; // const-string v1, "message"
/* check-cast v0, Ljava/lang/String; */
/* .line 784 */
/* .local v0, "message":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 785 */
final String v2 = "WebUI"; // const-string v2, "WebUI"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "WEBLOG: "; // const-string v3, "WEBLOG: "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "message"; // const-string v1, "message"
/* check-cast v1, Ljava/lang/String; */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v2,v1 );
/* .line 786 */
} // :cond_0
return;
} // .end method
public void openBrowser ( java.util.Map p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 846 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* new-instance v2, Landroid/content/Intent; */
v6 = this.mWebNav;
/* const-class v7, Lcom/openfeint/internal/ui/NativeBrowser; */
/* invoke-direct {v2, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 847 */
/* .local v2, "browserIntent":Landroid/content/Intent; */
v6 = this.this$0;
/* new-instance v7, Ljava/util/HashMap; */
/* invoke-direct {v7}, Ljava/util/HashMap;-><init>()V */
com.openfeint.internal.ui.WebNav .access$402 ( v6,v7 );
/* .line 848 */
int v6 = 5; // const/4 v6, 0x5
/* new-array v1, v6, [Ljava/lang/String; */
int v6 = 0; // const/4 v6, 0x0
final String v7 = "src"; // const-string v7, "src"
/* aput-object v7, v1, v6 */
int v6 = 1; // const/4 v6, 0x1
final String v7 = "callback"; // const-string v7, "callback"
/* aput-object v7, v1, v6 */
int v6 = 2; // const/4 v6, 0x2
final String v7 = "on_cancel"; // const-string v7, "on_cancel"
/* aput-object v7, v1, v6 */
int v6 = 3; // const/4 v6, 0x3
final String v7 = "on_failure"; // const-string v7, "on_failure"
/* aput-object v7, v1, v6 */
int v6 = 4; // const/4 v6, 0x4
final String v7 = "timeout"; // const-string v7, "timeout"
/* aput-object v7, v1, v6 */
/* .local v1, "arr$":[Ljava/lang/String; */
/* array-length v4, v1 */
/* .local v4, "len$":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i$":I */
} // :goto_0
/* if-ge v3, v4, :cond_1 */
/* aget-object v0, v1, v3 */
/* .line 849 */
/* .local v0, "arg":Ljava/lang/String; */
/* check-cast v5, Ljava/lang/String; */
/* .line 850 */
/* .local v5, "val":Ljava/lang/String; */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 852 */
v6 = this.this$0;
com.openfeint.internal.ui.WebNav .access$400 ( v6 );
/* .line 854 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "com.openfeint.internal.ui.NativeBrowser.argument."; // const-string v7, "com.openfeint.internal.ui.NativeBrowser.argument."
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.content.Intent ) v2 ).putExtra ( v6, v5 ); // invoke-virtual {v2, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 848 */
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
/* .line 857 */
} // .end local v0 # "arg":Ljava/lang/String;
} // .end local v5 # "val":Ljava/lang/String;
} // :cond_1
v6 = this.this$0;
/* const/16 v7, 0x63dd */
(( com.openfeint.internal.ui.WebNav ) v6 ).startActivityForResult ( v2, v7 ); // invoke-virtual {v6, v2, v7}, Lcom/openfeint/internal/ui/WebNav;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 858 */
return;
} // .end method
public void openMarket ( java.util.Map p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 801 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v2 = "package_name"; // const-string v2, "package_name"
/* check-cast v1, Ljava/lang/String; */
/* .line 802 */
/* .local v1, "packageName":Ljava/lang/String; */
/* new-instance v0, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "market://details?id="; // const-string v4, "market://details?id="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v3 );
/* invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 807 */
/* .local v0, "intent":Landroid/content/Intent; */
v2 = this.mWebNav;
(( com.openfeint.internal.ui.WebNav ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Lcom/openfeint/internal/ui/WebNav;->startActivity(Landroid/content/Intent;)V
/* .line 808 */
return;
} // .end method
public void openYoutubePlayer ( java.util.Map p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 830 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v3 = "video_id"; // const-string v3, "video_id"
/* check-cast v2, Ljava/lang/String; */
/* .line 831 */
/* .local v2, "videoID":Ljava/lang/String; */
/* new-instance v0, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "vnd.youtube:"; // const-string v5, "vnd.youtube:"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v4 );
/* invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 833 */
/* .local v0, "intent":Landroid/content/Intent; */
v3 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v3 ).getPackageManager ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/ui/WebNav;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/high16 v4, 0x10000 */
(( android.content.pm.PackageManager ) v3 ).queryIntentActivities ( v0, v4 ); // invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
/* .line 834 */
v3 = /* .local v1, "list":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;" */
/* if-nez v3, :cond_0 */
/* .line 835 */
v3 = this.mWebNav;
com.openfeint.internal.OpenFeintInternal .getRString ( v4 );
int v5 = 0; // const/4 v5, 0x0
android.widget.Toast .makeText ( v3,v4,v5 );
(( android.widget.Toast ) v3 ).show ( ); // invoke-virtual {v3}, Landroid/widget/Toast;->show()V
/* .line 839 */
} // :goto_0
return;
/* .line 837 */
} // :cond_0
v3 = this.mWebNav;
(( com.openfeint.internal.ui.WebNav ) v3 ).startActivity ( v0 ); // invoke-virtual {v3, v0}, Lcom/openfeint/internal/ui/WebNav;->startActivity(Landroid/content/Intent;)V
} // .end method
protected void populateActionList ( java.util.List p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 589 */
/* .local p1, "actionList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
final String v0 = "log"; // const-string v0, "log"
/* .line 590 */
final String v0 = "apiRequest"; // const-string v0, "apiRequest"
/* .line 591 */
final String v0 = "contentLoaded"; // const-string v0, "contentLoaded"
/* .line 592 */
final String v0 = "startLoading"; // const-string v0, "startLoading"
/* .line 593 */
final String v0 = "back"; // const-string v0, "back"
/* .line 594 */
final String v0 = "showLoader"; // const-string v0, "showLoader"
/* .line 595 */
final String v0 = "hideLoader"; // const-string v0, "hideLoader"
/* .line 596 */
final String v0 = "alert"; // const-string v0, "alert"
/* .line 597 */
final String v0 = "dismiss"; // const-string v0, "dismiss"
/* .line 598 */
final String v0 = "openMarket"; // const-string v0, "openMarket"
/* .line 599 */
final String v0 = "isApplicationInstalled"; // const-string v0, "isApplicationInstalled"
/* .line 600 */
final String v0 = "openYoutubePlayer"; // const-string v0, "openYoutubePlayer"
/* .line 601 */
final String v0 = "profilePicture"; // const-string v0, "profilePicture"
/* .line 604 */
final String v0 = "openBrowser"; // const-string v0, "openBrowser"
/* .line 605 */
final String v0 = "downloadBlob"; // const-string v0, "downloadBlob"
/* .line 608 */
final String v0 = "dashboard"; // const-string v0, "dashboard"
/* .line 611 */
final String v0 = "readSetting"; // const-string v0, "readSetting"
/* .line 612 */
final String v0 = "writeSetting"; // const-string v0, "writeSetting"
/* .line 613 */
return;
} // .end method
public final void profilePicture ( java.util.Map p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 842 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
v0 = this.this$0;
com.openfeint.internal.ImagePicker .show ( v0 );
/* .line 843 */
return;
} // .end method
public void readSetting ( java.util.Map p0 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
int v5 = 0; // const/4 v5, 0x0
int v10 = 2; // const/4 v10, 0x2
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 903 */
final String v6 = "key"; // const-string v6, "key"
/* check-cast v1, Ljava/lang/String; */
/* .line 904 */
/* .local v1, "k":Ljava/lang/String; */
final String v6 = "callback"; // const-string v6, "callback"
/* check-cast v0, Ljava/lang/String; */
/* .line 905 */
/* .local v0, "cb":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 906 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "OFWebUISetting_"; // const-string v7, "OFWebUISetting_"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 907 */
/* .local v2, "key":Ljava/lang/String; */
} // :goto_0
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v6 ).getContext ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
final String v7 = "OFWebUI"; // const-string v7, "OFWebUI"
(( android.content.Context ) v6 ).getSharedPreferences ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 909 */
/* .local v3, "prefs":Landroid/content/SharedPreferences; */
/* .line 910 */
/* .local v4, "val":Ljava/lang/String; */
final String v5 = "WebUI"; // const-string v5, "WebUI"
final String v6 = "readSetting(%s) => %s"; // const-string v6, "readSetting(%s) => %s"
/* new-array v7, v10, [Ljava/lang/Object; */
/* aput-object v1, v7, v8 */
/* aput-object v4, v7, v9 */
java.lang.String .format ( v6,v7 );
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 911 */
v5 = this.this$0;
final String v6 = "%s(%s)"; // const-string v6, "%s(%s)"
/* new-array v7, v10, [Ljava/lang/Object; */
/* aput-object v0, v7, v8 */
if ( v4 != null) { // if-eqz v4, :cond_2
} // .end local v4 # "val":Ljava/lang/String;
} // :goto_1
/* aput-object v4, v7, v9 */
java.lang.String .format ( v6,v7 );
(( com.openfeint.internal.ui.WebNav ) v5 ).executeJavascript ( v6 ); // invoke-virtual {v5, v6}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 913 */
} // .end local v2 # "key":Ljava/lang/String;
} // .end local v3 # "prefs":Landroid/content/SharedPreferences;
} // :cond_0
return;
} // :cond_1
/* move-object v2, v5 */
/* .line 906 */
/* .line 911 */
/* .restart local v2 # "key":Ljava/lang/String; */
/* .restart local v3 # "prefs":Landroid/content/SharedPreferences; */
/* .restart local v4 # "val":Ljava/lang/String; */
} // :cond_2
final String v4 = "null"; // const-string v4, "null"
} // .end method
public void showLoader ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 776 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
return;
} // .end method
public void startLoading ( java.util.Map p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 738 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
v0 = this.mWebNav;
int v1 = 0; // const/4 v1, 0x0
(( com.openfeint.internal.ui.WebNav ) v0 ).fade ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->fade(Z)V
/* .line 739 */
int v0 = 0; // const/4 v0, 0x0
(( com.openfeint.internal.ui.WebNav$ActionHandler ) p0 ).showLoader ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->showLoader(Ljava/util/Map;)V
/* .line 741 */
final String v0 = "path"; // const-string v0, "path"
/* check-cast v0, Ljava/lang/String; */
/* new-instance v1, Lcom/openfeint/internal/ui/WebNav$ActionHandler$2; */
/* invoke-direct {v1, p0}, Lcom/openfeint/internal/ui/WebNav$ActionHandler$2;-><init>(Lcom/openfeint/internal/ui/WebNav$ActionHandler;)V */
com.openfeint.internal.ui.WebViewCache .trackPath ( v0,v1 );
/* .line 759 */
v0 = this.mWebNav;
/* iget v1, v0, Lcom/openfeint/internal/ui/WebNav;->pageStackCount:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/openfeint/internal/ui/WebNav;->pageStackCount:I */
/* .line 760 */
return;
} // .end method
public void writeSetting ( java.util.Map p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 916 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v4 = "key"; // const-string v4, "key"
/* check-cast v1, Ljava/lang/String; */
/* .line 917 */
/* .local v1, "k":Ljava/lang/String; */
final String v4 = "value"; // const-string v4, "value"
/* check-cast v3, Ljava/lang/String; */
/* .line 918 */
/* .local v3, "v":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 919 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "OFWebUISetting_"; // const-string v5, "OFWebUISetting_"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 920 */
/* .local v2, "key":Ljava/lang/String; */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v4 ).getContext ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
final String v5 = "OFWebUI"; // const-string v5, "OFWebUI"
int v6 = 0; // const/4 v6, 0x0
(( android.content.Context ) v4 ).getSharedPreferences ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 921 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 922 */
/* .line 924 */
} // .end local v0 # "editor":Landroid/content/SharedPreferences$Editor;
} // .end local v2 # "key":Ljava/lang/String;
} // :cond_0
return;
} // .end method
