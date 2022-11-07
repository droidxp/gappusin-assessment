class com.openfeint.internal.ui.WebViewCache$ManifestItem {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "ManifestItem" */
} // .end annotation
/* # instance fields */
public java.util.Set dependentObjects;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.lang.String hash;
public java.lang.String path;
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$ManifestItem ( ) {
/* .locals 2 */
/* .param p1, "item" # Lcom/openfeint/internal/ui/WebViewCache$ManifestItem; */
/* .prologue */
/* .line 203 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 204 */
v0 = this.path;
this.path = v0;
/* .line 205 */
/* new-instance v0, Ljava/util/HashSet; */
v1 = this.dependentObjects;
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
this.dependentObjects = v0;
/* .line 206 */
return;
} // .end method
 com.openfeint.internal.ui.WebViewCache$ManifestItem ( ) {
/* .locals 1 */
/* .param p1, "_path" # Ljava/lang/String; */
/* .param p2, "_hash" # Ljava/lang/String; */
/* .prologue */
/* .line 202 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.path = p1;
this.hash = p2;
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.dependentObjects = v0;
return;
} // .end method
