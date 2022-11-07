public abstract class org.codehaus.jackson.type.JavaType {
	 /* .source "JavaType.java" */
	 /* # instance fields */
	 protected final java.lang.Class _class;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class", */
	 /* "<*>;" */
	 /* } */
} // .end annotation
} // .end field
protected Integer _hashCode;
protected java.lang.Object _typeHandler;
protected java.lang.Object _valueHandler;
/* # direct methods */
protected org.codehaus.jackson.type.JavaType ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 55 */
/* .local p1, "clz":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 56 */
this._class = p1;
/* .line 57 */
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
/* .line 58 */
/* .local v0, "name":Ljava/lang/String; */
v1 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
/* iput v1, p0, Lorg/codehaus/jackson/type/JavaType;->_hashCode:I */
/* .line 59 */
return;
} // .end method
/* # virtual methods */
protected void _assertSubclass ( java.lang.Class p0, java.lang.Class p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;", */
/* "Ljava/lang/Class", */
/* "<*>;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 316 */
/* .local p1, "subclass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
/* .local p2, "superClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
v0 = this._class;
v0 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v0, :cond_0 */
/* .line 317 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Class "; // const-string v2, "Class "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " is not assignable to "; // const-string v2, " is not assignable to "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this._class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 319 */
} // :cond_0
return;
} // .end method
protected abstract org.codehaus.jackson.type.JavaType _narrow ( java.lang.Class p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Lorg/codehaus/jackson/type/JavaType;" */
/* } */
} // .end annotation
} // .end method
protected org.codehaus.jackson.type.JavaType _widen ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Lorg/codehaus/jackson/type/JavaType;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 137 */
/* .local p1, "superclass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
(( org.codehaus.jackson.type.JavaType ) p0 )._narrow ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/type/JavaType;->_narrow(Ljava/lang/Class;)Lorg/codehaus/jackson/type/JavaType;
} // .end method
public org.codehaus.jackson.type.JavaType containedType ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 263 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer containedTypeCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 250 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String containedTypeName ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 278 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public abstract Boolean equals ( java.lang.Object p0 ) {
} // .end method
public final org.codehaus.jackson.type.JavaType forcedNarrowBy ( java.lang.Class p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Lorg/codehaus/jackson/type/JavaType;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 96 */
/* .local p1, "subclass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
v1 = this._class;
/* if-ne p1, v1, :cond_0 */
/* .line 106 */
} // .end local p0 # "this":Lorg/codehaus/jackson/type/JavaType;
} // :goto_0
/* .line 99 */
/* .restart local p0 # "this":Lorg/codehaus/jackson/type/JavaType; */
} // :cond_0
(( org.codehaus.jackson.type.JavaType ) p0 )._narrow ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/type/JavaType;->_narrow(Ljava/lang/Class;)Lorg/codehaus/jackson/type/JavaType;
/* .line 100 */
/* .local v0, "result":Lorg/codehaus/jackson/type/JavaType; */
v1 = this._valueHandler;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 101 */
v1 = this._valueHandler;
(( org.codehaus.jackson.type.JavaType ) v0 ).setValueHandler ( v1 ); // invoke-virtual {v0, v1}, Lorg/codehaus/jackson/type/JavaType;->setValueHandler(Ljava/lang/Object;)V
/* .line 103 */
} // :cond_1
v1 = this._typeHandler;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 104 */
v1 = this._typeHandler;
(( org.codehaus.jackson.type.JavaType ) v0 ).setTypeHandler ( v1 ); // invoke-virtual {v0, v1}, Lorg/codehaus/jackson/type/JavaType;->setTypeHandler(Ljava/lang/Object;)V
} // :cond_2
/* move-object p0, v0 */
/* .line 106 */
} // .end method
public org.codehaus.jackson.type.JavaType getContentType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 241 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.codehaus.jackson.type.JavaType getKeyType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 234 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final java.lang.Class getRawClass ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class", */
/* "<*>;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 178 */
v0 = this._class;
} // .end method
public java.lang.Object getTypeHandler ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">()TT;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 294 */
v0 = this._typeHandler;
} // .end method
public java.lang.Object getValueHandler ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">()TT;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 286 */
v0 = this._valueHandler;
} // .end method
public final Boolean hasRawClass ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)Z" */
/* } */
} // .end annotation
/* .prologue */
/* .line 186 */
/* .local p1, "clz":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
v0 = this._class;
/* if-ne v0, p1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Integer hashCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 332 */
/* iget v0, p0, Lorg/codehaus/jackson/type/JavaType;->_hashCode:I */
} // .end method
public Boolean isAbstract ( ) {
/* .locals 1 */
/* .prologue */
/* .line 196 */
v0 = this._class;
v0 = (( java.lang.Class ) v0 ).getModifiers ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I
v0 = java.lang.reflect.Modifier .isAbstract ( v0 );
} // .end method
public Boolean isArrayType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 220 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isConcrete ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 203 */
v2 = this._class;
v0 = (( java.lang.Class ) v2 ).getModifiers ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I
/* .line 204 */
/* .local v0, "mod":I */
/* and-int/lit16 v2, v0, 0x600 */
/* if-nez v2, :cond_1 */
/* .line 213 */
} // :cond_0
} // :goto_0
/* .line 210 */
} // :cond_1
v2 = this._class;
v2 = (( java.lang.Class ) v2 ).isPrimitive ( ); // invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z
/* if-nez v2, :cond_0 */
/* .line 213 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public abstract Boolean isContainerType ( ) {
} // .end method
public final Boolean isEnumType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 222 */
v0 = this._class;
v0 = (( java.lang.Class ) v0 ).isEnum ( ); // invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z
} // .end method
public final Boolean isFinal ( ) {
/* .locals 1 */
/* .prologue */
/* .line 228 */
v0 = this._class;
v0 = (( java.lang.Class ) v0 ).getModifiers ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I
v0 = java.lang.reflect.Modifier .isFinal ( v0 );
} // .end method
public final Boolean isInterface ( ) {
/* .locals 1 */
/* .prologue */
/* .line 224 */
v0 = this._class;
v0 = (( java.lang.Class ) v0 ).isInterface ( ); // invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z
} // .end method
public final Boolean isPrimitive ( ) {
/* .locals 1 */
/* .prologue */
/* .line 226 */
v0 = this._class;
v0 = (( java.lang.Class ) v0 ).isPrimitive ( ); // invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z
} // .end method
public Boolean isThrowable ( ) {
/* .locals 2 */
/* .prologue */
/* .line 217 */
/* const-class v0, Ljava/lang/Throwable; */
v1 = this._class;
v0 = (( java.lang.Class ) v0 ).isAssignableFrom ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
} // .end method
public final org.codehaus.jackson.type.JavaType narrowBy ( java.lang.Class p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Lorg/codehaus/jackson/type/JavaType;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 72 */
/* .local p1, "subclass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
v1 = this._class;
/* if-ne p1, v1, :cond_0 */
/* .line 84 */
} // .end local p0 # "this":Lorg/codehaus/jackson/type/JavaType;
} // :goto_0
/* .line 76 */
/* .restart local p0 # "this":Lorg/codehaus/jackson/type/JavaType; */
} // :cond_0
v1 = this._class;
(( org.codehaus.jackson.type.JavaType ) p0 )._assertSubclass ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/codehaus/jackson/type/JavaType;->_assertSubclass(Ljava/lang/Class;Ljava/lang/Class;)V
/* .line 77 */
(( org.codehaus.jackson.type.JavaType ) p0 )._narrow ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/type/JavaType;->_narrow(Ljava/lang/Class;)Lorg/codehaus/jackson/type/JavaType;
/* .line 78 */
/* .local v0, "result":Lorg/codehaus/jackson/type/JavaType; */
v1 = this._valueHandler;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 79 */
v1 = this._valueHandler;
(( org.codehaus.jackson.type.JavaType ) v0 ).setValueHandler ( v1 ); // invoke-virtual {v0, v1}, Lorg/codehaus/jackson/type/JavaType;->setValueHandler(Ljava/lang/Object;)V
/* .line 81 */
} // :cond_1
v1 = this._typeHandler;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 82 */
v1 = this._typeHandler;
(( org.codehaus.jackson.type.JavaType ) v0 ).setTypeHandler ( v1 ); // invoke-virtual {v0, v1}, Lorg/codehaus/jackson/type/JavaType;->setTypeHandler(Ljava/lang/Object;)V
} // :cond_2
/* move-object p0, v0 */
/* .line 84 */
} // .end method
public abstract org.codehaus.jackson.type.JavaType narrowContentsBy ( java.lang.Class p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Lorg/codehaus/jackson/type/JavaType;" */
/* } */
} // .end annotation
} // .end method
public void setTypeHandler ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "h" # Ljava/lang/Object; */
/* .prologue */
/* .line 165 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this._typeHandler;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 166 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Trying to reset type handler for type ["; // const-string v2, "Trying to reset type handler for type ["
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.codehaus.jackson.type.JavaType ) p0 ).toString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/type/JavaType;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "]; old handler of type "; // const-string v2, "]; old handler of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this._typeHandler;
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", new handler of type "; // const-string v2, ", new handler of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 169 */
} // :cond_0
this._typeHandler = p1;
/* .line 170 */
return;
} // .end method
public void setValueHandler ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "h" # Ljava/lang/Object; */
/* .prologue */
/* .line 150 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this._valueHandler;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 151 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Trying to reset value handler for type ["; // const-string v2, "Trying to reset value handler for type ["
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.codehaus.jackson.type.JavaType ) p0 ).toString ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/type/JavaType;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "]; old handler of type "; // const-string v2, "]; old handler of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this._valueHandler;
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", new handler of type "; // const-string v2, ", new handler of type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 154 */
} // :cond_0
this._valueHandler = p1;
/* .line 155 */
return;
} // .end method
public abstract java.lang.String toCanonical ( ) {
} // .end method
public abstract java.lang.String toString ( ) {
} // .end method
public final org.codehaus.jackson.type.JavaType widenBy ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class", */
/* "<*>;)", */
/* "Lorg/codehaus/jackson/type/JavaType;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 121 */
/* .local p1, "superclass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
v0 = this._class;
/* if-ne p1, v0, :cond_0 */
/* .line 126 */
} // .end local p0 # "this":Lorg/codehaus/jackson/type/JavaType;
} // :goto_0
/* .line 125 */
/* .restart local p0 # "this":Lorg/codehaus/jackson/type/JavaType; */
} // :cond_0
v0 = this._class;
(( org.codehaus.jackson.type.JavaType ) p0 )._assertSubclass ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/codehaus/jackson/type/JavaType;->_assertSubclass(Ljava/lang/Class;Ljava/lang/Class;)V
/* .line 126 */
(( org.codehaus.jackson.type.JavaType ) p0 )._widen ( p1 ); // invoke-virtual {p0, p1}, Lorg/codehaus/jackson/type/JavaType;->_widen(Ljava/lang/Class;)Lorg/codehaus/jackson/type/JavaType;
} // .end method
