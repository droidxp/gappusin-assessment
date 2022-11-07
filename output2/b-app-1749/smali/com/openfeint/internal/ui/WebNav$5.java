class com.openfeint.internal.ui.WebNav$5 extends com.openfeint.internal.ui.WebViewCacheCallback {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav;->loadInitialContent()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 270 */
this.this$0 = p1;
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCacheCallback;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void failLoaded ( ) {
/* .locals 1 */
/* .prologue */
/* .line 278 */
v0 = this.this$0;
com.openfeint.internal.ui.WebNav .access$100 ( v0 );
/* .line 279 */
return;
} // .end method
public void pathLoaded ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "itemPath" # Ljava/lang/String; */
/* .prologue */
/* .line 273 */
v0 = this.this$0;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "OF.navigateToUrl(\'"; // const-string v2, "OF.navigateToUrl(\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v2 ).initialContentPath ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/ui/WebNav;->initialContentPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\')"; // const-string v2, "\')"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.ui.WebNav ) v0 ).executeJavascript ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 274 */
return;
} // .end method
