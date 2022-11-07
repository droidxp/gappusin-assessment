class com.naef.jnlua.DefaultJavaReflector$LuaCallSignature {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/DefaultJavaReflector; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "LuaCallSignature" */
} // .end annotation
/* # instance fields */
private java.lang.Class clazz;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
} // .end field
private Integer hashCode;
private java.lang.String invocableName;
private java.lang.Object types;
/* # direct methods */
public com.naef.jnlua.DefaultJavaReflector$LuaCallSignature ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/Object;", */
/* ")V" */
/* } */
} // .end annotation
/* const v3, 0x1003f */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.clazz = p1;
this.invocableName = p2;
this.types = p3;
v0 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
/* iput v0, p0, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;->hashCode:I */
/* iget v0, p0, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;->hashCode:I */
/* mul-int/2addr v0, v3 */
v1 = (( java.lang.String ) p2 ).hashCode ( ); // invoke-virtual {p2}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;->hashCode:I */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v1, p3 */
/* if-ge v0, v1, :cond_0 */
/* iget v1, p0, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;->hashCode:I */
/* mul-int/2addr v1, v3 */
/* aget-object v2, p3, v0 */
v2 = (( java.lang.Object ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I
/* add-int/2addr v1, v2 */
/* iput v1, p0, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;->hashCode:I */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 5 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* if-ne p1, p0, :cond_1 */
/* move v1, v2 */
} // :cond_0
} // :goto_0
} // :cond_1
/* instance-of v0, p1, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature; */
v0 = this.clazz;
v3 = this.clazz;
/* if-ne v0, v3, :cond_0 */
v0 = this.invocableName;
v3 = this.invocableName;
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.types;
/* array-length v0, v0 */
v3 = this.types;
/* array-length v3, v3 */
/* if-ne v0, v3, :cond_0 */
/* move v0, v1 */
} // :goto_1
v3 = this.types;
/* array-length v3, v3 */
/* if-ge v0, v3, :cond_2 */
v3 = this.types;
/* aget-object v3, v3, v0 */
v4 = this.types;
/* aget-object v4, v4, v0 */
/* if-ne v3, v4, :cond_0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* move v1, v2 */
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/naef/jnlua/DefaultJavaReflector$LuaCallSignature;->hashCode:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.clazz;
(( java.lang.Class ) v1 ).getCanonicalName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ": "; // const-string v1, ": "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.invocableName;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "("; // const-string v1, "("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.types;
java.util.Arrays .asList ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
