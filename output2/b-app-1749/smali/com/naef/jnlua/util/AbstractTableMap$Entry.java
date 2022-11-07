class com.naef.jnlua.util.AbstractTableMap$Entry implements java.util.Map$Entry {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/naef/jnlua/util/AbstractTableMap; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "Entry" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Map$Entry", */
/* "<TK;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
private java.lang.Object key;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TK;" */
/* } */
} // .end annotation
} // .end field
final com.naef.jnlua.util.AbstractTableMap this$0; //synthetic
/* # direct methods */
public com.naef.jnlua.util.AbstractTableMap$Entry ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)V" */
/* } */
} // .end annotation
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.key = p2;
return;
} // .end method
static com.naef.jnlua.LuaState access$200 ( com.naef.jnlua.util.AbstractTableMap$Entry p0 ) { //synthethic
/* .locals 1 */
/* invoke-direct {p0}, Lcom/naef/jnlua/util/AbstractTableMap$Entry;->getLuaState()Lcom/naef/jnlua/LuaState; */
} // .end method
static java.lang.Object access$300 ( com.naef.jnlua.util.AbstractTableMap$Entry p0 ) { //synthethic
/* .locals 1 */
v0 = this.key;
} // .end method
private com.naef.jnlua.LuaState getLuaState ( ) {
/* .locals 1 */
v0 = this.this$0;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).getLuaState ( ); // invoke-virtual {v0}, Lcom/naef/jnlua/util/AbstractTableMap;->getLuaState()Lcom/naef/jnlua/LuaState;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* instance-of v1, p1, Lcom/naef/jnlua/util/AbstractTableMap$Entry; */
/* if-nez v1, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
/* check-cast p1, Lcom/naef/jnlua/util/AbstractTableMap$Entry; */
/* invoke-direct {p0}, Lcom/naef/jnlua/util/AbstractTableMap$Entry;->getLuaState()Lcom/naef/jnlua/LuaState; */
/* invoke-direct {p1}, Lcom/naef/jnlua/util/AbstractTableMap$Entry;->getLuaState()Lcom/naef/jnlua/LuaState; */
/* if-ne v1, v2, :cond_0 */
v1 = this.key;
v2 = this.key;
v1 = (( java.lang.Object ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public java.lang.Object getKey ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TK;" */
/* } */
} // .end annotation
v0 = this.key;
} // .end method
public java.lang.Object getValue ( ) {
/* .locals 2 */
v0 = this.this$0;
v1 = this.key;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lcom/naef/jnlua/util/AbstractTableMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Lcom/naef/jnlua/util/AbstractTableMap$Entry;->getLuaState()Lcom/naef/jnlua/LuaState; */
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
/* const v1, 0x1003f */
/* mul-int/2addr v0, v1 */
v1 = this.key;
v1 = (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.Object setValue ( java.lang.Object p0 ) {
/* .locals 2 */
v0 = this.this$0;
v1 = this.key;
(( com.naef.jnlua.util.AbstractTableMap ) v0 ).put ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lcom/naef/jnlua/util/AbstractTableMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
v0 = this.key;
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
