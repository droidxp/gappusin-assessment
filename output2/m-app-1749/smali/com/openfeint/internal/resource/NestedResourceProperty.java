public abstract class com.openfeint.internal.resource.NestedResourceProperty extends com.openfeint.internal.resource.ResourceProperty {
	 /* .source "NestedResourceProperty.java" */
	 /* # instance fields */
	 private java.lang.Class mType;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class", */
	 /* "<+", */
	 /* "Lcom/openfeint/internal/resource/Resource;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.openfeint.internal.resource.NestedResourceProperty ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<+", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 5 */
/* .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/openfeint/internal/resource/Resource;>;" */
/* invoke-direct {p0}, Lcom/openfeint/internal/resource/ResourceProperty;-><init>()V */
/* .line 6 */
this.mType = p1;
/* .line 7 */
return;
} // .end method
/* # virtual methods */
public abstract com.openfeint.internal.resource.Resource get ( com.openfeint.internal.resource.Resource p0 ) {
} // .end method
public java.lang.Class getType ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<+", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 9 */
v0 = this.mType;
} // .end method
public abstract void set ( com.openfeint.internal.resource.Resource p0, com.openfeint.internal.resource.Resource p1 ) {
} // .end method
