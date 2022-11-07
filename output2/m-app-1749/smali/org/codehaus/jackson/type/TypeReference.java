public abstract class org.codehaus.jackson.type.TypeReference implements java.lang.Comparable {
	 /* .source "TypeReference.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Comparable", */
	 /* "<", */
	 /* "Lorg/codehaus/jackson/type/TypeReference", */
	 /* "<TT;>;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
final java.lang.reflect.Type _type;
/* # direct methods */
protected org.codehaus.jackson.type.TypeReference ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 32 */
	 /* .local p0, "this":Lorg/codehaus/jackson/type/TypeReference;, "Lorg/codehaus/jackson/type/TypeReference<TT;>;" */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 33 */
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) v1 ).getGenericSuperclass ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
	 /* .line 34 */
	 /* .local v0, "superClass":Ljava/lang/reflect/Type; */
	 /* instance-of v1, v0, Ljava/lang/Class; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 35 */
		 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
		 final String v2 = "Internal error: TypeReference constructed without actual type information"; // const-string v2, "Internal error: TypeReference constructed without actual type information"
		 /* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
		 /* .line 44 */
	 } // :cond_0
	 /* check-cast v0, Ljava/lang/reflect/ParameterizedType; */
} // .end local v0 # "superClass":Ljava/lang/reflect/Type;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
this._type = v1;
/* .line 45 */
return;
} // .end method
/* # virtual methods */
public Integer compareTo ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 1 */
/* .param p1, "x0" # Ljava/lang/Object; */
/* .prologue */
/* .line 26 */
/* .local p0, "this":Lorg/codehaus/jackson/type/TypeReference;, "Lorg/codehaus/jackson/type/TypeReference<TT;>;" */
/* check-cast p1, Lorg/codehaus/jackson/type/TypeReference; */
} // .end local p1 # "x0":Ljava/lang/Object;
v0 = (( org.codehaus.jackson.type.TypeReference ) p0 ).compareTo ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/type/TypeReference;->compareTo(Lorg/codehaus/jackson/type/TypeReference;)I
} // .end method
public Integer compareTo ( org.codehaus.jackson.type.TypeReference p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lorg/codehaus/jackson/type/TypeReference", */
/* "<TT;>;)I" */
/* } */
} // .end annotation
/* .prologue */
/* .line 56 */
/* .local p0, "this":Lorg/codehaus/jackson/type/TypeReference;, "Lorg/codehaus/jackson/type/TypeReference<TT;>;" */
/* .local p1, "o":Lorg/codehaus/jackson/type/TypeReference;, "Lorg/codehaus/jackson/type/TypeReference<TT;>;" */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.reflect.Type getType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 47 */
/* .local p0, "this":Lorg/codehaus/jackson/type/TypeReference;, "Lorg/codehaus/jackson/type/TypeReference<TT;>;" */
v0 = this._type;
} // .end method
