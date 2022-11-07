public abstract class com.openfeint.internal.resource.ResourceClass {
	 /* .source "ResourceClass.java" */
	 /* # instance fields */
	 public java.lang.Class mObjectClass;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class", */
	 /* "<+", */
	 /* "Lcom/openfeint/internal/resource/Resource;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.HashMap mProperties;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/openfeint/internal/resource/ResourceProperty;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.lang.String mResourceName;
/* # direct methods */
public com.openfeint.internal.resource.ResourceClass ( ) {
/* .locals 1 */
/* .param p2, "resourceName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<+", */
/* "Lcom/openfeint/internal/resource/Resource;", */
/* ">;", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 24 */
/* .local p1, "objectClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/openfeint/internal/resource/Resource;>;" */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 25 */
this.mObjectClass = p1;
/* .line 26 */
this.mResourceName = p2;
/* .line 27 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mProperties = v0;
/* .line 30 */
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/resource/ResourceClass;->mixinParentProperties(Ljava/lang/Class;)V */
/* .line 31 */
return;
} // .end method
private void mixinParentProperties ( java.lang.Class p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 12 */
/* .local p1, "objectClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
/* const-class v4, Lcom/openfeint/internal/resource/Resource; */
/* if-eq p1, v4, :cond_0 */
/* .line 13 */
(( java.lang.Class ) p1 ).getSuperclass ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
/* .line 15 */
/* .local v3, "superClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
/* invoke-direct {p0, v3}, Lcom/openfeint/internal/resource/ResourceClass;->mixinParentProperties(Ljava/lang/Class;)V */
/* .line 17 */
com.openfeint.internal.resource.Resource .getKlass ( v3 );
/* .line 18 */
/* .local v1, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
v4 = this.mProperties;
(( java.util.HashMap ) v4 ).keySet ( ); // invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
/* .local v0, "i$":Ljava/util/Iterator; */
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
/* check-cast v2, Ljava/lang/String; */
/* .line 19 */
/* .local v2, "propName":Ljava/lang/String; */
v4 = this.mProperties;
v5 = this.mProperties;
(( java.util.HashMap ) v5 ).get ( v2 ); // invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.util.HashMap ) v4 ).put ( v2, v5 ); // invoke-virtual {v4, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 22 */
} // .end local v0 # "i$":Ljava/util/Iterator;
} // .end local v1 # "klass":Lcom/openfeint/internal/resource/ResourceClass;
} // .end local v2 # "propName":Ljava/lang/String;
} // .end local v3 # "superClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
} // :cond_0
return;
} // .end method
/* # virtual methods */
public abstract com.openfeint.internal.resource.Resource factory ( ) {
} // .end method
